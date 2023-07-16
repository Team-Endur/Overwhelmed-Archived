package endurteam.overwhelmed.client.color.items;

import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.ItemStack;

public class ButterflySpawnEggItemColor implements ItemColor {
    public final int BACKGROUND_COLOR = 0x1c202c;
    public final int HIGHLIGHT_COLOR = 0x2b56d2;
    @Override
    public int getColor(ItemStack itemStack, int i) {
        return i == 0 ? this.BACKGROUND_COLOR : this.HIGHLIGHT_COLOR;
    }
}
