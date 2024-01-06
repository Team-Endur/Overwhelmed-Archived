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
        SOIL = registerGenericBlockItem("soil", OverwhelmedBlocks.SOIL);
        SNAIL_SHELL_BRICKS = registerGenericBlockItem("snail_shell_bricks",
                OverwhelmedBlocks.SNAIL_SHELL_BRICKS);
        SNAIL_SHELL_BRICK_STAIRS = registerGenericBlockItem(
                "snail_shell_brick_stairs",
                OverwhelmedBlocks.SNAIL_SHELL_BRICK_STAIRS);
        SNAIL_SHELL_BRICK_SLAB = registerGenericBlockItem(
                "snail_shell_brick_slab",
                OverwhelmedBlocks.SNAIL_SHELL_BRICK_SLAB);
        SNAIL_SHELL_BRICK_WALL = registerGenericBlockItem(
                "snail_shell_brick_wall",
                OverwhelmedBlocks.SNAIL_SHELL_BRICK_WALL);
        CHISELED_SNAIL_SHELL_BRICKS = registerGenericBlockItem(
                "chiseled_snail_shell_bricks",
                OverwhelmedBlocks.CHISELED_SNAIL_SHELL_BRICKS);
        FLOFF = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Overwhelmed.MOD_ID, "floff"),
                new BlockItem(OverwhelmedBlocks.FLOFF,
                        new Item.Properties()));
        PAINE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Overwhelmed.MOD_ID, "paine"),
                new BlockItem(OverwhelmedBlocks.PAINE,
                        new Item.Properties()));
        PINK_LAVATERA = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Overwhelmed.MOD_ID, "pink_lavatera"),
                new BlockItem(OverwhelmedBlocks.PINK_LAVATERA,
                        new Item.Properties()));
        WHITE_LAVATERA = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Overwhelmed.MOD_ID, "white_lavatera"),
                new BlockItem(OverwhelmedBlocks.WHITE_LAVATERA,
                        new Item.Properties()));
        SQUIRL = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Overwhelmed.MOD_ID, "squirl"),
                new BlockItem(OverwhelmedBlocks.SQUIRL,
                        new Item.Properties()));
        RINGOT = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Overwhelmed.MOD_ID, "ringot"),
                new BlockItem(OverwhelmedBlocks.RINGOT,
                        new Item.Properties()));
        SNOWDROP = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Overwhelmed.MOD_ID, "snowdrop"),
                new BlockItem(OverwhelmedBlocks.SNOWDROP,
                        new Item.Properties()));
        BELL_SUNFLOWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Overwhelmed.MOD_ID, "bell_sunflower"),
                new BlockItem(OverwhelmedBlocks.BELL_SUNFLOWER,
                        new Item.Properties()));
        WIDOW = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Overwhelmed.MOD_ID, "widow"),
                new DoubleHighBlockItem(OverwhelmedBlocks.WIDOW,
                        new Item.Properties()));
        GOLD_BEAD = registerGenericBlockItem("gold_bead", OverwhelmedBlocks.GOLD_BEAD);
        ICE_CUBE  = registerGenericBlockItem("ice_cube", OverwhelmedBlocks.ICE_CUBE);
        PEBBLE = Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(Overwhelmed.MOD_ID, "pebble"),
                new PebbleBlockItem(OverwhelmedBlocks.PEBBLE,
                        new Item.Properties()));
        GOO_BLOCK = registerGenericBlockItem("goo_block", OverwhelmedBlocks.GOO_BLOCK);
        BLOWGUN = Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(Overwhelmed.MOD_ID, "blowgun"),
                new BlowgunItem(new Item.Properties()
                        .stacksTo(1)
                        .rarity(Rarity.COMMON)
                        .durability(20)));
        PAPER_BULLET = registerGenericItem("paper_bullet", 64, Rarity.COMMON);
        SNAIL = Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(Overwhelmed.MOD_ID, "snail"),
                new Item(new Item.Properties()
                        .stacksTo(64)
                        .rarity(Rarity.COMMON)
                        .food(OverwhelmedFoods.SNAIL)));
        COOKED_SNAIL = Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(Overwhelmed.MOD_ID, "cooked_snail"),
                new Item(new Item.Properties()
                        .stacksTo(64)
                        .rarity(Rarity.COMMON)
                        .food(OverwhelmedFoods.COOKED_SNAIL)));
        SNAIL_STEW = Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(Overwhelmed.MOD_ID, "snail_stew"),
                new BowlFoodItem(new Item.Properties()
                        .stacksTo(1)
                        .rarity(Rarity.COMMON)
                        .food(OverwhelmedFoods.SNAIL_STEW)));
        VANILLA_COOKIE = Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(Overwhelmed.MOD_ID, "vanilla_cookie"),
                new Item(new Item.Properties()
                        .stacksTo(64)
                        .rarity(Rarity.COMMON)
                        .food(OverwhelmedFoods.VANILLA_COOKIE)));
        MINT_CAKE = registerGenericBlockItem("mint_cake", OverwhelmedBlocks.MINT_CAKE);
        VANILLA_CAKE = registerGenericBlockItem("vanilla_cake", OverwhelmedBlocks.VANILLA_CAKE);
        VANILLA_ICE_CREAM = Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(Overwhelmed.MOD_ID, "vanilla_ice_cream"),
                new BowlFoodItem(new Item.Properties()
                        .stacksTo(1)
                        .rarity(Rarity.COMMON)
                        .food(OverwhelmedFoods.VANILLA_ICE_CREAM)));
        GOO_BALL = registerGenericItem("goo_ball", 64, Rarity.COMMON);
        SNAIL_SHELL = registerGenericItem("snail_shell", 64, Rarity.COMMON);
        VANILLA_BEANS = registerGenericItem("vanilla_beans", 64, Rarity.COMMON);
        BUTTERFLY_SPAWN_EGG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Overwhelmed.MOD_ID,
                        "butterfly_spawn_egg"), new MultiSpawnEggItem(new Item.Properties(), (random) -> {
                    switch (random.nextIntBetweenInclusive(1, 6)) {
                        case 1 -> {
                            return OverwhelmedEntityTypes.CABBAGE_BUTTERFLY;
                        }
                        case 2 -> {
                            return OverwhelmedEntityTypes.CHERRY_BUTTERFLY;
                        }
                        case 3 -> {
                            return OverwhelmedEntityTypes.LIVERWORT_BUTTERFLY;
                        }
                        case 4 -> {
                            return OverwhelmedEntityTypes.MONARCH_BUTTERFLY;
                        }
                        case 5 -> {
                            return OverwhelmedEntityTypes.MORPHO_BUTTERFLY;
                        }
                        case 6 -> {
                            return OverwhelmedEntityTypes.SLEEPY_BUTTERFLY;
                        }
                    }
                    throw new IncompatibleClassChangeError();
                }
                )
        );
        SNAIL_SPAWN_EGG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Overwhelmed.MOD_ID,
                        "snail_spawn_egg"), new MultiSpawnEggItem(new Item.Properties(), (random) -> {
                    switch (random.nextIntBetweenInclusive(1, 6)) {
                        case 1 -> {
                            return OverwhelmedEntityTypes.FLAT_SNAIL;
                        }
                        case 2 -> {
                            return OverwhelmedEntityTypes.GARDEN_SNAIL;
                        }
                        case 3 -> {
                            return OverwhelmedEntityTypes.GLASS_SNAIL;
                        }
                        case 4 -> {
                            return OverwhelmedEntityTypes.LIMESTONE_SNAIL;
                        }
                        case 5 -> {
                            return OverwhelmedEntityTypes.LIVERWORT_SNAIL;
                        }
                        case 6 -> {
                            return OverwhelmedEntityTypes.ROMAN_SNAIL;
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
