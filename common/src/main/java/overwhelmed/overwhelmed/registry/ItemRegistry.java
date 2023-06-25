package overwhelmed.overwhelmed.registry;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import overwhelmed.overwhelmed.Overwhelmed;
import overwhelmed.overwhelmed.world.item.SnailSpawnEggItem;


import static overwhelmed.overwhelmed.registry.CreativeTabRegistry.overwhelmedTab;

public class ItemRegistry {
    public static RegistrySupplier<Item> snailShellItem;
    public static RegistrySupplier<SnailSpawnEggItem> snailSpawnEggItem;
    public static RegistrySupplier<Item> gooBallItem;

    /*
        public static RegistrySupplier<Item> goldBeadItem;
        public static RegistrySupplier<Item> iceCrystalShardItem;
        public static RegistrySupplier<Item> iceCubeItem;
        public static RegistrySupplier<Item> pebbleItem;
     */

    public static void registerItems() {
        snailShellItem = registerItem("snail_shell", 64, Rarity.COMMON);
        gooBallItem = registerItem("goo_ball", 64, Rarity.COMMON);

        snailSpawnEggItem = Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID, "snail_spawn_egg"), () ->
                new SnailSpawnEggItem(new Item.Properties()
                        .arch$tab(overwhelmedTab)));
        /*
        goldBeadItem = registerItem("gold_bead", 64, Rarity.UNCOMMON);
        iceCrystalShardItem = registerItem("ice_crystal_shard", 64, Rarity.UNCOMMON);
        iceCubeItem = registerItem("ice_cube", 64, Rarity.COMMON);
        pebbleItem = registerItem("pebble", 64, Rarity.COMMON);
         */


        Overwhelmed.ITEMS.register();
    }
    private static RegistrySupplier<Item> registerItem(String name, int stackSize, Rarity rarity) {
        return Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new Item(new Item.Properties()
                        .stacksTo(stackSize)
                        .rarity(rarity)
                        .arch$tab(overwhelmedTab)));
    }
}
