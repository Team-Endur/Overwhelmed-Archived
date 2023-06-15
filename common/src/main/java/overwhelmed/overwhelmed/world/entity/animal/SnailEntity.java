package overwhelmed.overwhelmed.world.entity.animal;

import com.mojang.serialization.Codec;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.ByIdMap;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animatable.GeoEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.function.IntFunction;

public class SnailEntity extends Animal implements GeoEntity {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    private Variant variant;

    public SnailEntity(EntityType<? extends SnailEntity> entityType, Level level, Variant variant) {
        super(entityType, level);
        this.variant = variant;
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

    public SnailEntity.Variant getVariant() {
        return this.variant;
    }

    public void setVariant(SnailEntity.Variant variant) {
        this.variant = variant;
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        return null;
    }

    @Override
    protected float getStandingEyeHeight(Pose pose, EntityDimensions entityDimensions) {
        return this.getVariant().getStandingEyeHeight();
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    public enum Variant implements StringRepresentable {
        GARDEN("garden", 0.25f),
        GARY("gary", 0.45f),
        LIMESTONE("limestone", 0.2f),
        ROMAN("roman", 0.3f);

        private final String name;
        private final float standingEyeHeight;

        private Variant(String name, float standingEyeHeight) {
            this.name = name;
            this.standingEyeHeight = standingEyeHeight;
        }

        public String getSerializedName() {
            return this.name;
        }

        public float getStandingEyeHeight() {
            return standingEyeHeight;
        }
    }
}
