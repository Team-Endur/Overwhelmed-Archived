package overwhelmed.overwhelmed.world.item;

import net.minecraft.world.item.Rariry;
import net.minecraft.world.item.Item;

public class SnailShellItem extends Item {
    public SnailShellItem() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
    }
}
