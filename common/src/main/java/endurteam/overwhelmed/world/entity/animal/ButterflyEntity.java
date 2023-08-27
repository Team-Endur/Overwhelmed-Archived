package endurteam.overwhelmed.world.entity.animal;

import endurteam.overwhelmed.core.particles.OverwhelmedParticleTypes;
import endurteam.overwhelmed.sounds.OverwhelmedSoundEvents;
import endurteam.overwhelmed.world.entity.OverwhelmedEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.constant.DefaultAnimations;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.util.ClientUtils;
import software.bernie.geckolib.util.GeckoLibUtil;

public class ButterflyEntity extends PathfinderMob implements GeoEntity {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    @Nullable
    private BlockPos targetPosition;

    public ButterflyEntity(EntityType<? extends PathfinderMob> type, Level worldIn) {
        super(type, worldIn);
    }

    @Override
    public boolean isPushable() {
        return false;
    }

    @Override
    public SoundEvent getHurtSound(DamageSource damageSource) {
        return OverwhelmedSoundEvents.butterflyHurt.get();
    }

    @Override
    public SoundEvent getDeathSound() {
        return OverwhelmedSoundEvents.butterflyDeath.get();
    }

    @Override
    protected void doPush(Entity entity) {
    }

    @Override
    protected void pushEntities() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 3);
    }

    @Override
    public void tick() {
        super.tick();
        this.setDeltaMovement(this.getDeltaMovement().multiply(1.0, 0.6, 1.0));
        if (OverwhelmedEntityTypes.sleepyButterflyEntityType.get().equals(this.getType())
                && this.random.nextInt(2) < 1) // Only spawn half the time
        {
            this.level().addParticle((ParticleOptions) OverwhelmedParticleTypes.sleepySparkle.get(),
                    this.getRandomX(1.0),
                    this.getRandomY(),
                    this.getRandomZ(1.0),
                    this.random.nextGaussian() * 0.02, this.random.nextGaussian() * 0.02,
                    this.random.nextGaussian() * 0.02);
        }
    }

    @Override
    protected void customServerAiStep() {
        super.customServerAiStep();
        if (!(this.targetPosition == null || this.level().isEmptyBlock(this.targetPosition)
                && this.targetPosition.getY() > this.level().getMinBuildHeight())) {
            this.targetPosition = null;
        }
        if (this.targetPosition == null || this.random.nextInt(30) == 0
                || this.targetPosition.closerToCenterThan(this.position(), 2.0)) {
            this.targetPosition =
                    BlockPos.containing(
                            this.getX() + (double)this.random.nextInt(7)
                                    - (double)this.random.nextInt(7),
                            this.getY() + (double)this.random.nextInt(6) - 2.0,
                            this.getZ() + (double)this.random.nextInt(7)
                                    - (double)this.random.nextInt(7));
        }
        double d = (double)this.targetPosition.getX() + 0.5 - this.getX();
        double e = (double)this.targetPosition.getY() + 0.1 - this.getY();
        double f = (double)this.targetPosition.getZ() + 0.5 - this.getZ();
        Vec3 vec3 = this.getDeltaMovement();
        Vec3 vec32 = vec3.add(
                (Math.signum(d) * 0.5 - vec3.x) * (double)0.1f,
                (Math.signum(e) * (double)0.7f - vec3.y) * (double)0.1f,
                (Math.signum(f) * 0.5 - vec3.z) * (double)0.1f);
        this.setDeltaMovement(vec32);
        float g = (float)(Mth.atan2(vec32.z, vec32.x) * 57.2957763671875) - 90.0f;
        float h = Mth.wrapDegrees(g - this.getYRot());
        this.zza = 0.5f;
        this.setYRot(this.getYRot() + h);
    }

    @Override
    protected void checkFallDamage(double d, boolean bl, BlockState blockState, BlockPos blockPos) {
    }

    @Override
    public boolean isIgnoringBlockTriggers() {
        return true;
    }

    @Override
    protected float getStandingEyeHeight(Pose pose, EntityDimensions entityDimensions) {
        return 0.1f;
    }

    @Override
    public int getExperienceReward() {
        return 1;
    }

    @Override
    public @NotNull MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, 10,
                state -> state.setAndContinue(DefaultAnimations.FLY))
            .setCustomInstructionKeyframeHandler(state -> {
                Player player = ClientUtils.getClientPlayer();

                if (player != null)
                    player.displayClientMessage(Component.literal("KeyFraming"), true);
            }));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}