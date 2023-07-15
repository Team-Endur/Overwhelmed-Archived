package endurteam.overwhelmed.mixin;

import endurteam.overwhelmed.registry.BlockRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {
    @Shadow private Optional<BlockPos> lastClimbablePos;

    public LivingEntityMixin(EntityType<?> entityType, Level level) {
        super(entityType, level);
    }

    @Inject(method = "onClimbable", at = @At("TAIL"), cancellable = true)
    public void onClimableMixin(CallbackInfoReturnable<Boolean> cir) {
        Direction result = Direction.fromYRot(this.getYRot());
        BlockPos blockPos = this.blockPosition().relative(result);
        BlockState state = this.level().getBlockState(blockPos);
        if (state.is(BlockRegistry.gooBlock.get()))
        {
            this.lastClimbablePos = Optional.of(blockPos);
            cir.setReturnValue(true);
        }
    }
}
