package endurteam.overwhelmed.world.entity.projectile;

import endurteam.overwhelmed.world.entity.OverwhelmedEntityTypes;
import endurteam.overwhelmed.world.item.ClotBlockItem;
import endurteam.overwhelmed.world.item.OverwhelmedItems;
import endurteam.overwhelmed.world.level.block.OverwhelmedBlocks;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.NotNull;

public class ClotEntity
        extends ThrowableItemProjectile {
    public ClotEntity(EntityType<? extends ClotEntity> entityType, Level level) {
        super(entityType, level);
    }

    public ClotEntity(EntityType<? extends ClotEntity> entityType, Level level, LivingEntity livingEntity) {
        super(entityType, livingEntity, level);
    }

    public ClotEntity(EntityType<? extends ClotEntity> entityType, Level level, double d, double e, double f) {
        super(entityType, d, e, f, level);
    }

    @Override
    protected @NotNull Item getDefaultItem() {
        return ClotEntity.getItemFromType(this.getType());
    }

    public static @NotNull ClotBlockItem getItemFromType(EntityType<?> type) {
        if (OverwhelmedEntityTypes.pebbleEntityType.get().equals(type)) {
            return OverwhelmedItems.pebbleBlockItem.get();
        } else if (OverwhelmedEntityTypes.iceCubeEntityType.get().equals(type)) {
            return OverwhelmedItems.iceCubeBlockItem.get();
        } else if (OverwhelmedEntityTypes.goldBeadEntityType.get().equals(type)) {
            return OverwhelmedItems.goldBeadBlockItem.get();
        }
        throw new IncompatibleClassChangeError();
    }

    private ParticleOptions getParticle() {
        ItemStack itemStack = this.getItemRaw();
        return itemStack.isEmpty() ? ParticleTypes.ITEM_SNOWBALL :
                new ItemParticleOption(ParticleTypes.ITEM, itemStack);
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
            this.level().broadcastEntityEvent(this, (byte)3);
            this.discard();
        }
    }

}
