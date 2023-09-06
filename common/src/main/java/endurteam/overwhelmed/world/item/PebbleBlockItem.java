package endurteam.overwhelmed.world.item;

import endurteam.overwhelmed.world.entity.projectile.ThrownPebbleEntity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class PebbleBlockItem extends BlockItem {
    public PebbleBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level level, Player player,
                                                           InteractionHand interactionHand) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.SNOWBALL_THROW,
                SoundSource.NEUTRAL, 0.5f, 0.4f / (level.getRandom().nextFloat() * 0.4f + 0.8f));
        player.getCooldowns().addCooldown(this, 20);
        if (!level.isClientSide) {
            ThrownPebbleEntity pebbleEntity = new ThrownPebbleEntity(level, player);
            pebbleEntity.setItem(itemStack);
            pebbleEntity.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0f, 1.5f, 1.0f);
            level.addFreshEntity(pebbleEntity);
        }
        player.awardStat(Stats.ITEM_USED.get(this));
        if (!player.getAbilities().instabuild) {
            itemStack.shrink(1);
        }
        return InteractionResultHolder.sidedSuccess(itemStack, level.isClientSide());
    }
}
