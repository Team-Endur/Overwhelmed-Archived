package endurteam.overwhelmed.client.color.items;

import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.ItemStack;

public class ButterflySpawnEggItemColor implements ItemColor {
    public final int BACKGROUND_COLOR = 0x3c2018;
    public final int HIGHLIGHT_COLOR = 0xb5481d;
    @Override
    public int getColor(ItemStack itemStack, int i) {
        return i == 0 ? this.BACKGROUND_COLOR : this.HIGHLIGHT_COLOR;
    }
}
