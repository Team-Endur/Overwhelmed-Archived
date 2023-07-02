package overwhelmed.overwhelmed.world.entity.animal;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import overwhelmed.overwhelmed.registry.EntityRegistry;
import overwhelmed.overwhelmed.registry.ItemRegistry;
import software.bernie.geckolib.animatable.GeoEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.constant.DefaultAnimations;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

public class SnailEntity extends Animal implements GeoEntity {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    private final Level level;

    public SnailEntity(EntityType<? extends SnailEntity> entityType, Level level) {
        super(entityType, level);
        this.level = level;
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new WaterAvoidingRandomStrollGoal(this, 1.0));
        this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, 6.0F, 0.02F, true));
        this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MOVEMENT_SPEED, 0.1)
                .add(Attributes.MAX_HEALTH, 4)
                .add(Attributes.ARMOR, 0.2)
                .add(Attributes.KNOCKBACK_RESISTANCE, 0.4)
                .add(Attributes.FOLLOW_RANGE, 16.0D);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        return null;
    }

    @Override
    public int getExperienceReward() {
        return 1;
    }

    @Override
    public @NotNull InteractionResult mobInteract(Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);

        // Check if the player is holding a slime ball
        if (itemStack.getItem() == Items.SLIME_BALL) {
            // Decrease the stack size of the slime ball
            if (!player.isCreative()) {
                itemStack.shrink(1);
            }

            // Drop a goo ball
            if (!level.isClientSide) {
                level.addFreshEntity(new ItemEntity(level, getX(), getY(), getZ(), new ItemStack(ItemRegistry.gooBallItem.get())));
            }

            return InteractionResult.SUCCESS;
        }

        return super.mobInteract(player, hand);
    }

    public void setCustomName(@Nullable Component arg) {
        super.setCustomName(arg);
        if (!this.getType().equals(EntityRegistry.garySnailEntityType.get()) && arg != null
                && arg.getString().equals("Gary")) {
            CompoundTag tag = new CompoundTag();
            SnailEntity newEntity = new SnailEntity(EntityRegistry.garySnailEntityType.get(), this.level());
            this.save(tag);
            newEntity.load(tag);
            this.remove(RemovalReason.DISCARDED);
            this.level().addFreshEntity(newEntity);
        }
    }

    @Override
    protected float getStandingEyeHeight(Pose pose, EntityDimensions entityDimensions) {
        EntityType<?> type = this.getType();
        if (EntityRegistry.gardenSnailEntityType.get().equals(type)) {
            return 0.2f;
        } else if (EntityRegistry.garySnailEntityType.get().equals(type)) {
            return 0.32f;
        } else if (EntityRegistry.limestoneSnailEntityType.get().equals(type)) {
            return 0.15f;
        } else if (EntityRegistry.romanSnailEntityType.get().equals(type)) {
            return 0.2f;
        }
        throw new IncompatibleClassChangeError();
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(DefaultAnimations.genericWalkIdleController(this));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}
