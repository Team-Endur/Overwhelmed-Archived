package endurteam.overwhelmed.fabric.world.item;

import endurteam.overwhelmed.Overwhelmed;
import endurteam.overwhelmed.world.entity.OverwhelmedEntityTypes;
import endurteam.overwhelmed.world.food.OverwhelmedFoods;
import endurteam.overwhelmed.world.item.BlowgunItem;
import endurteam.overwhelmed.world.item.MultiSpawnEggItem;
import endurteam.overwhelmed.world.item.PebbleBlockItem;
import endurteam.overwhelmed.world.level.block.OverwhelmedBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;

import static endurteam.overwhelmed.world.item.OverwhelmedItems.*;

public class OverwhelmedFabricItems {
    public static void registerItems() {
        soilBlockItem = registerGenericBlockItem("soil", OverwhelmedBlocks.soilBlock);
        snailShellBrickBlockItem = registerGenericBlockItem("snail_shell_bricks",
                OverwhelmedBlocks.snailShellBrickBlock);
        snailShellBrickStairsBlockItem = registerGenericBlockItem(
                "snail_shell_brick_stairs",
                OverwhelmedBlocks.snailShellBrickStairBlock);
        snailShellBrickSlabBlockItem = registerGenericBlockItem(
                "snail_shell_brick_slab",
                OverwhelmedBlocks.snailShellBrickSlabBlock);
        snailShellBrickWallBlockItem = registerGenericBlockItem(
                "snail_shell_brick_wall",
                OverwhelmedBlocks.snailShellBrickWallBlock);
        chiseledSnailShellBricksBlockItem = registerGenericBlockItem(
                "chiseled_snail_shell_bricks",
                OverwhelmedBlocks.chiseledSnailShellBrickBlock);
        widowBlockItem = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Overwhelmed.MOD_ID, "widow"),
                new DoubleHighBlockItem(OverwhelmedBlocks.widowBlock,
                        new Item.Properties()));
        goldBeadBlockItem = registerGenericBlockItem("gold_bead",
                OverwhelmedBlocks.goldBeadBlock);
        iceCubeBlockItem  = registerGenericBlockItem("ice_cube",
                OverwhelmedBlocks.iceCubeBlock);
        pebbleBlockItem = Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(Overwhelmed.MOD_ID, "pebble"),
                new PebbleBlockItem(OverwhelmedBlocks.pebbleBlock,
                        new Item.Properties()));
        gooBlockBlockItem = registerGenericBlockItem("goo_block",
                OverwhelmedBlocks.gooBlock);
        blowgunItem = Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(Overwhelmed.MOD_ID, "blowgun"),
                new BlowgunItem(new Item.Properties()
                        .stacksTo(1)
                        .rarity(Rarity.COMMON)
                        .durability(20)));
        paperBulletItem = registerGenericItem("paper_bullet", 64, Rarity.COMMON);
        snailStewItem = Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(Overwhelmed.MOD_ID, "snail_stew"),
                new BowlFoodItem(new Item.Properties()
                        .stacksTo(1)
                        .rarity(Rarity.COMMON)
                        .food(OverwhelmedFoods.SNAIL_STEW)));
        snailItem = Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(Overwhelmed.MOD_ID, "snail"),
                new Item(new Item.Properties()
                        .stacksTo(64)
                        .rarity(Rarity.COMMON)
                        .food(OverwhelmedFoods.SNAIL)));
        cookedSnailItem = Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(Overwhelmed.MOD_ID, "cooked_snail"),
                new Item(new Item.Properties()
                        .stacksTo(64)
                        .rarity(Rarity.COMMON)
                        .food(OverwhelmedFoods.COOKED_SNAIL)));
        gooBallItem = registerGenericItem("goo_ball", 64, Rarity.COMMON);
        snailShellItem = registerGenericItem("snail_shell", 64, Rarity.COMMON);
        butterflySpawnEggItem = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Overwhelmed.MOD_ID,
                        "butterfly_spawn_egg"), new MultiSpawnEggItem(new Item.Properties(), (random) -> {
                    switch (random.nextIntBetweenInclusive(1, 6)) {
                        case 1 -> {
                            return OverwhelmedEntityTypes.sleepyButterflyEntityType;
                        }
                        case 2 -> {
                            return OverwhelmedEntityTypes.cabbageButterflyEntityType;
                        }
                        case 3 -> {
                            return OverwhelmedEntityTypes.morphoButterflyEntityType;
                        }
                        case 4 -> {
                            return OverwhelmedEntityTypes.cherryButterflyEntityType;
                        }
                        case 5 -> {
                            return OverwhelmedEntityTypes.monarchButterflyEntityType;
                        }
                        case 6 -> {
                            return OverwhelmedEntityTypes.liverwortButterflyEntityType;
                        }
                    }
                    throw new IncompatibleClassChangeError();
                }
                )
        );
        snailSpawnEggItem = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Overwhelmed.MOD_ID,
                        "snail_spawn_egg"), new MultiSpawnEggItem(new Item.Properties(), (random) -> {
                    switch (random.nextIntBetweenInclusive(1, 6)) {
                        case 1 -> {
                            return OverwhelmedEntityTypes.gardenSnailEntityType;
                        }
                        case 2 -> {
                            return OverwhelmedEntityTypes.limestoneSnailEntityType;
                        }
                        case 3 -> {
                            return OverwhelmedEntityTypes.romanSnailEntityType;
                        }
                        case 4 -> {
                            return OverwhelmedEntityTypes.glassSnailEntityType;
                        }
                        case 5 -> {
                            return OverwhelmedEntityTypes.liverwortSnailEntityType;
                        }
                        case 6 -> {
                            return OverwhelmedEntityTypes.flatSnailEntityType;
                        }
                    }
                    throw new IncompatibleClassChangeError();
                }
                )
        );
    }

    @SuppressWarnings("SameParameterValue")
    private static Item registerGenericItem(String name, int stackSize, Rarity rarity) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new Item(new Item.Properties()
                        .stacksTo(stackSize)
                        .rarity(rarity)));
    }

    private static BlockItem registerGenericBlockItem(String name, Block block) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new BlockItem(block, new Item.Properties()));
    }
}
