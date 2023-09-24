package endurteam.overwhelmed.world.item;

import endurteam.overwhelmed.world.entity.projectile.PaperBulletEntity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.function.Predicate;

public class BlowgunItem extends ProjectileWeaponItem {
    public BlowgunItem(Item.Properties properties) {
        super(properties);
    }

    /*@Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level level, Player player,
                                                           InteractionHand interactionHand) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        boolean bl = player.getAbilities().instabuild ||
                EnchantmentHelper.getItemEnchantmentLevel(Enchantments.INFINITY_ARROWS, itemStack) > 0;
        ItemStack itemStack2 = player.getProjectile(itemStack);
        if (itemStack2.isEmpty() && !bl) {
            return InteractionResultHolder.fail(itemStack);
        }
        level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.SNOWBALL_THROW,
                SoundSource.NEUTRAL, 0.5f, 0.4f / (level.getRandom().nextFloat() * 0.4f + 0.8f));
        player.getCooldowns().addCooldown(this, 5);
        if (itemStack2.isEmpty() || itemStack2.is(Items.ARROW)) {
            itemStack2 = new ItemStack(OverwhelmedItems.paperBulletItem.get());
        }
        if (!level.isClientSide) {
            PaperBulletEntity pebbleEntity = new PaperBulletEntity(level, player);
            pebbleEntity.setItem(itemStack);
            pebbleEntity.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0f, 1.5f, 1.0f);
            level.addFreshEntity(pebbleEntity);
        }
        if (!player.getAbilities().instabuild) {
            itemStack2.shrink(1);
            if (itemStack2.isEmpty()) {
                player.getInventory().removeItem(itemStack2);
            }
        }
        player.awardStat(Stats.ITEM_USED.get(this));
        return InteractionResultHolder.sidedSuccess(itemStack, level.isClientSide());
    }*/

    @Override
    public void releaseUsing(ItemStack itemStack, Level level, LivingEntity livingEntity, int i) {
        float f;
        if (!(livingEntity instanceof Player player)) {
            return;
        }
        boolean bl = player.getAbilities().instabuild || EnchantmentHelper.getItemEnchantmentLevel(Enchantments.INFINITY_ARROWS, itemStack) > 0;
        ItemStack itemStack2 = player.getProjectile(itemStack);
        if (itemStack2.isEmpty() && !bl) {
            return;
        }
        if (itemStack2.isEmpty() || itemStack2.is(Items.ARROW)) {
            itemStack2 = new ItemStack(OverwhelmedItems.paperBulletItem.get());
        }
        if ((f = BlowgunItem.getPowerForTime(this.getUseDuration(itemStack) - i)) < 0.1f) {
            return;
        }
        boolean bl2 = bl && itemStack2.is(Items.ARROW);
        if (!level.isClientSide) {
            PaperBulletEntity pebbleEntity = new PaperBulletEntity(level, player);
            pebbleEntity.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0f, f * 3.0f, 1.0f);
            itemStack.hurtAndBreak(1, player, player2 -> player2.broadcastBreakEvent(player.getUsedItemHand()));
            level.addFreshEntity(pebbleEntity);
        }
        level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.SNOWBALL_THROW,
                SoundSource.NEUTRAL, 0.5f, 0.4f / (level.getRandom().nextFloat() * 0.4f + 0.8f));
        if (!bl2 && !player.getAbilities().instabuild) {
            itemStack2.shrink(1);
            if (itemStack2.isEmpty()) {
                player.getInventory().removeItem(itemStack2);
            }
        }
        player.awardStat(Stats.ITEM_USED.get(this));
    }

    public static float getPowerForTime(int i) {
        float f = (float)i / 20.0f;
        if ((f = (f * f + f * 2.0f) / 3.0f) > 1.0f) {
            f = 1.0f;
        }
        return f;
    }

    @Override
    public int getUseDuration(ItemStack itemStack) {
        return 72000;
    }

    @Override
    public @NotNull UseAnim getUseAnimation(ItemStack itemStack) {
        return UseAnim.BOW;
    }

    @Override
    public @NotNull Predicate<ItemStack> getAllSupportedProjectiles() {
        return (itemStack) -> itemStack.is(OverwhelmedItems.paperBulletItem.get());
    }

    @Override
    public int getDefaultProjectileRange() {
        return 10;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        boolean bl;
        ItemStack itemStack = player.getItemInHand(interactionHand);
        boolean bl2 = bl = !player.getProjectile(itemStack).isEmpty();
        if (player.getAbilities().instabuild || bl) {
            player.startUsingItem(interactionHand);
            return InteractionResultHolder.consume(itemStack);
        }
        return InteractionResultHolder.fail(itemStack);
    }


}
