package endurteam.overwhelmed.world.entity.animal;

import endurteam.overwhelmed.sounds.OverwhelmedSoundEvents;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class HornetLarva extends Mob {
    public HornetLarva(EntityType<? extends Mob> entityType, Level level) {
        super(entityType, level);
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSource) {
        return OverwhelmedSoundEvents.HORNET_LARVA_HURT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return OverwhelmedSoundEvents.HORNET_LARVA_DEATH;
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 6);
    }
}
