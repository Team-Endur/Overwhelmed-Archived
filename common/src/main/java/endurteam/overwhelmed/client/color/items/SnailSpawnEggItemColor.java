package endurteam.overwhelmed.client.color.items;

import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.ItemStack;

public class SnailSpawnEggItemColor implements ItemColor {
    public final int BACKGROUND_COLOR = 0xdab284;
    public final int HIGHLIGHT_COLOR = 0x745c44;
    @Override
    public int getColor(ItemStack itemStack, int i) {
        return i == 0 ? this.BACKGROUND_COLOR : this.HIGHLIGHT_COLOR;
    }
}
