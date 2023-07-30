package endurteam.overwhelmed.world.item;

import dev.architectury.registry.registries.RegistrySupplier;
import endurteam.overwhelmed.world.entity.OverwhelmedEntityTypes;
import endurteam.overwhelmed.world.food.OverwhelmedFoods;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import endurteam.overwhelmed.Overwhelmed;

import static endurteam.overwhelmed.world.item.OverwhelmedCreativeTabs.overwhelmedTab;

public class OverwhelmedItems {
    public static RegistrySupplier<Item> snailShellItem;
    public static RegistrySupplier<MultiSpawnEggItem> snailSpawnEggItem;
    public static RegistrySupplier<MultiSpawnEggItem> butterflySpawnEggItem;
    public static RegistrySupplier<Item> gooBallItem;
    public static RegistrySupplier<Item> gooSoupItem;

    /*
        public static RegistrySupplier<Item> goldBeadItem;
        public static RegistrySupplier<Item> iceCrystalShardItem;
        public static RegistrySupplier<Item> iceCubeItem;
        public static RegistrySupplier<Item> pebbleItem;
     */

    public static void registerItems() {
        snailShellItem = registerGenericItem("snail_shell", 64, Rarity.COMMON);
        gooBallItem = registerGenericItem("goo_ball", 64, Rarity.COMMON);
        gooSoupItem = Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID, "goo_soup"), () ->
                new BowlFoodItem(new Item.Properties()
                        .stacksTo(1)
                        .rarity(Rarity.COMMON)
                        .food(OverwhelmedFoods.GOO_SOUP)
                        .arch$tab(overwhelmedTab)));;

        snailSpawnEggItem = Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID,
                "snail_spawn_egg"), () -> new MultiSpawnEggItem(new Item.Properties()
                        .arch$tab(overwhelmedTab), (random) -> {
                            switch (random.nextIntBetweenInclusive(1, 3)) {
                                case 1 -> {
                                    return OverwhelmedEntityTypes.gardenSnailEntityType.get();
                                }
                                case 2 -> {
                                    return OverwhelmedEntityTypes.limestoneSnailEntityType.get();
                                }
                                case 3 -> {
                                    return OverwhelmedEntityTypes.romanSnailEntityType.get();
                                }
                            }
                            throw new IncompatibleClassChangeError();
                        }
                )
        );
        butterflySpawnEggItem = Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID,
                        "butterfly_spawn_egg"), () -> new MultiSpawnEggItem(new Item.Properties()
                        .arch$tab(overwhelmedTab), (random) -> {
                    switch (random.nextIntBetweenInclusive(1, 4)) {
                        case 1 -> {
                            return OverwhelmedEntityTypes.sleepyButterflyEntityType.get();
                        }
                        case 2 -> {
                            return OverwhelmedEntityTypes.cabbageButterflyEntityType.get();
                        }
                        case 3 -> {
                            return OverwhelmedEntityTypes.morphoButterflyEntityType.get();
                        }
                        case 4 -> {
                            return OverwhelmedEntityTypes.cherryButterflyEntityType.get();
                        }
                    }
                    throw new IncompatibleClassChangeError();
                }
                )
        );
        /*
        goldBeadItem = registerItem("gold_bead", 64, Rarity.UNCOMMON);
        iceCrystalShardItem = registerItem("ice_crystal_shard", 64, Rarity.UNCOMMON);
        iceCubeItem = registerItem("ice_cube", 64, Rarity.COMMON);
        pebbleItem = registerItem("pebble", 64, Rarity.COMMON);
         */


        Overwhelmed.ITEMS.register();
    }
    private static RegistrySupplier<Item> registerGenericItem(String name, int stackSize, Rarity rarity) {
        return Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new Item(new Item.Properties()
                        .stacksTo(stackSize)
                        .rarity(rarity)
                        .arch$tab(overwhelmedTab)));
    }
}
