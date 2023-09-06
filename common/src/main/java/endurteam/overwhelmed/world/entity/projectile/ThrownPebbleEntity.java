package endurteam.overwhelmed.world.entity.projectile;

import endurteam.overwhelmed.world.entity.OverwhelmedEntityTypes;
import endurteam.overwhelmed.world.item.OverwhelmedItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.NotNull;

public class ThrownPebbleEntity
        extends ThrowableItemProjectile {
    protected static final EntityDataAccessor<BlockPos> DATA_START_POS =
            SynchedEntityData.defineId(ThrownPebbleEntity.class, EntityDataSerializers.BLOCK_POS);

    public ThrownPebbleEntity(EntityType<? extends ThrownPebbleEntity> entityType, Level level) {
        super(entityType, level);
    }

    public ThrownPebbleEntity(Level level, LivingEntity livingEntity) {
        super(OverwhelmedEntityTypes.thrownPebbleEntityType.get(), livingEntity, level);
    }

    public ThrownPebbleEntity(Level level, double d, double e, double f) {
        super(OverwhelmedEntityTypes.thrownPebbleEntityType.get(), d, e, f, level);
    }

    @Override
    protected @NotNull Item getDefaultItem() {
        return OverwhelmedItems.pebbleBlockItem.get();
    }

    private ParticleOptions getParticle() {
        return new ItemParticleOption(ParticleTypes.ITEM, this.getItemRaw());
    }

    @Override
    public void handleEntityEvent(byte b) {
        if (b == 3) {
            ParticleOptions particleOptions = this.getParticle();
            for (int i = 0; i < 8; ++i) {
                this.level().addParticle(particleOptions, this.getX(), this.getY(), this.getZ(),
                        0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        entity.hurt(this.damageSources().thrown(this, this.getOwner()), 1);
    }

    @Override
    protected void onHit(HitResult hitResult) {
        super.onHit(hitResult);
        if (!this.level().isClientSide) {
            this.level().broadcastEntityEvent(this, (byte) 3);
            this.discard();
        }
    }

    @Override
    public void shoot(double d, double e, double f, float g, float h) {
        super.shoot(d, e, f, g, h);
        this.setStartPos(this.getOnPos());
    }

    public void setStartPos(BlockPos blockPos) {
        this.entityData.set(DATA_START_POS, blockPos);
    }

    public BlockPos getStartPos() {
        return this.entityData.get(DATA_START_POS);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_START_POS, BlockPos.ZERO);
    }

}
