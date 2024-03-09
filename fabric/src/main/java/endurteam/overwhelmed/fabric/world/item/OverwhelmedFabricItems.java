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
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;

import static endurteam.overwhelmed.world.item.OverwhelmedItems.*;

public class OverwhelmedFabricItems {
    public static void registerItems() {
        SEREIBA_LOG = registerGenericBlockItem("sereiba_log", OverwhelmedBlocks.SEREIBA_LOG);
        SEREIBA_WOOD = registerGenericBlockItem("sereiba_wood", OverwhelmedBlocks.SEREIBA_WOOD);
        STRIPPED_SEREIBA_LOG = registerGenericBlockItem("stripped_sereiba_log", OverwhelmedBlocks.STRIPPED_SEREIBA_LOG);
        STRIPPED_SEREIBA_WOOD = registerGenericBlockItem("stripped_sereiba_wood", OverwhelmedBlocks.STRIPPED_SEREIBA_WOOD);
        SEREIBA_PLANKS = registerGenericBlockItem("sereiba_planks", OverwhelmedBlocks.SEREIBA_PLANKS);
        SEREIBA_PARQUET = registerGenericBlockItem("sereiba_parquet", OverwhelmedBlocks.SEREIBA_PARQUET);
        SEREIBA_STAIRS = registerGenericBlockItem("sereiba_stairs", OverwhelmedBlocks.SEREIBA_STAIRS);
        SEREIBA_PARQUET_STAIRS = registerGenericBlockItem("sereiba_parquet_stairs", OverwhelmedBlocks.SEREIBA_PARQUET_STAIRS);
        SEREIBA_SLAB = registerGenericBlockItem("sereiba_slab", OverwhelmedBlocks.SEREIBA_SLAB);
        SEREIBA_PARQUET_SLAB = registerGenericBlockItem("sereiba_parquet_slab", OverwhelmedBlocks.SEREIBA_PARQUET_SLAB);
        SEREIBA_FENCE = registerGenericBlockItem("sereiba_fence", OverwhelmedBlocks.SEREIBA_FENCE);
        SEREIBA_FENCE_GATE = registerGenericBlockItem("sereiba_fence_gate", OverwhelmedBlocks.SEREIBA_FENCE_GATE);
        SEREIBA_DOOR = registerGenericBlockItem("sereiba_door", OverwhelmedBlocks.SEREIBA_DOOR);
        SEREIBA_TRAPDOOR = registerGenericBlockItem("sereiba_trapdoor", OverwhelmedBlocks.SEREIBA_TRAPDOOR);
        WOODED_SEREIBA_TRAPDOOR = registerGenericBlockItem("wooded_sereiba_trapdoor", OverwhelmedBlocks.WOODED_SEREIBA_TRAPDOOR);
        SEREIBA_PRESSURE_PLATE = registerGenericBlockItem("sereiba_pressure_plate", OverwhelmedBlocks.SEREIBA_PRESSURE_PLATE);
        SEREIBA_BUTTON = registerGenericBlockItem("sereiba_button", OverwhelmedBlocks.SEREIBA_BUTTON);
        SNAIL_SHELL_BRICKS = registerGenericBlockItem("snail_shell_bricks", OverwhelmedBlocks.SNAIL_SHELL_BRICKS);
        SNAIL_SHELL_BRICK_STAIRS = registerGenericBlockItem("snail_shell_brick_stairs", OverwhelmedBlocks.SNAIL_SHELL_BRICK_STAIRS);
        SNAIL_SHELL_BRICK_SLAB = registerGenericBlockItem("snail_shell_brick_slab", OverwhelmedBlocks.SNAIL_SHELL_BRICK_SLAB);
        SNAIL_SHELL_BRICK_WALL = registerGenericBlockItem("snail_shell_brick_wall", OverwhelmedBlocks.SNAIL_SHELL_BRICK_WALL);
        CHISELED_SNAIL_SHELL_BRICKS = registerGenericBlockItem("chiseled_snail_shell_bricks",
                OverwhelmedBlocks.CHISELED_SNAIL_SHELL_BRICKS);
        BLACK_GRANITE = registerGenericBlockItem("black_granite", OverwhelmedBlocks.BLACK_GRANITE);
        BLACK_GRANITE_STAIRS = registerGenericBlockItem("black_granite_stairs", OverwhelmedBlocks.BLACK_GRANITE_STAIRS);
        BLACK_GRANITE_SLAB = registerGenericBlockItem("black_granite_slab", OverwhelmedBlocks.BLACK_GRANITE_SLAB);
        BLACK_GRANITE_WALL = registerGenericBlockItem("black_granite_wall", OverwhelmedBlocks.BLACK_GRANITE_WALL);
        POLISHED_BLACK_GRANITE = registerGenericBlockItem("polished_black_granite", OverwhelmedBlocks.POLISHED_BLACK_GRANITE);
        POLISHED_BLACK_GRANITE_STAIRS = registerGenericBlockItem("polished_black_granite_stairs",
                OverwhelmedBlocks.POLISHED_BLACK_GRANITE_STAIRS);
        POLISHED_BLACK_GRANITE_SLAB = registerGenericBlockItem("polished_black_granite_slab",
                OverwhelmedBlocks.POLISHED_BLACK_GRANITE_SLAB);
        FIZZYROCK = registerGenericBlockItem("fizzyrock", OverwhelmedBlocks.FIZZYROCK);
        FIZZYROCK_STAIRS = registerGenericBlockItem("fizzyrock_stairs", OverwhelmedBlocks.FIZZYROCK_STAIRS);
        FIZZYROCK_SLAB = registerGenericBlockItem("fizzyrock_slab", OverwhelmedBlocks.FIZZYROCK_SLAB);
        FIZZYROCK_WALL = registerGenericBlockItem("fizzyrock_wall", OverwhelmedBlocks.FIZZYROCK_WALL);
        CHISELED_FIZZYROCK = registerGenericBlockItem("chiseled_fizzyrock", OverwhelmedBlocks.CHISELED_FIZZYROCK);
        POLISHED_FIZZYROCK = registerGenericBlockItem("polished_fizzyrock", OverwhelmedBlocks.POLISHED_FIZZYROCK);
        POLISHED_FIZZYROCK_STAIRS = registerGenericBlockItem("polished_fizzyrock_stairs",
                OverwhelmedBlocks.POLISHED_FIZZYROCK_STAIRS);
        POLISHED_FIZZYROCK_SLAB = registerGenericBlockItem("polished_fizzyrock_slab", OverwhelmedBlocks.POLISHED_FIZZYROCK_SLAB);
        FIZZYROCK_BRICKS = registerGenericBlockItem("fizzyrock_bricks", OverwhelmedBlocks.FIZZYROCK_BRICKS);
        FIZZYROCK_BRICK_STAIRS = registerGenericBlockItem("fizzyrock_brick_stairs", OverwhelmedBlocks.FIZZYROCK_BRICK_STAIRS);
        FIZZYROCK_BRICK_SLAB = registerGenericBlockItem("fizzyrock_brick_slab", OverwhelmedBlocks.FIZZYROCK_BRICK_SLAB);
        FIZZYROCK_BRICK_WALL = registerGenericBlockItem("fizzyrock_brick_wall", OverwhelmedBlocks.FIZZYROCK_BRICK_WALL);
        CHISELED_FIZZYROCK_BRICKS = registerGenericBlockItem("chiseled_fizzyrock_bricks", OverwhelmedBlocks.CHISELED_FIZZYROCK_BRICKS);
        FIZZYROCK_GEYSER = registerGenericBlockItem("fizzyrock_geyser", OverwhelmedBlocks.FIZZYROCK_GEYSER);
        SOIL = registerGenericBlockItem("soil", OverwhelmedBlocks.SOIL);
        CHARCOAL_ORE = registerGenericBlockItem("charcoal_ore", OverwhelmedBlocks.CHARCOAL_ORE);
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
        WHITE_ALLIUM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Overwhelmed.MOD_ID, "white_allium"),
                new DoubleHighBlockItem(OverwhelmedBlocks.WHITE_ALLIUM,
                        new Item.Properties()));
        GOLD_BEAD = registerGenericBlockItem("gold_bead", OverwhelmedBlocks.GOLD_BEAD);
        ICE_CUBE  = registerGenericBlockItem("ice_cube", OverwhelmedBlocks.ICE_CUBE);
        PEBBLE = Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(Overwhelmed.MOD_ID, "pebble"),
                new PebbleBlockItem(OverwhelmedBlocks.PEBBLE,
                        new Item.Properties()));
        MINT_SEEDS = registerGenericItemNameBlockItem("mint_seeds", OverwhelmedBlocks.MINT);
        VANILLA_BEANS = registerGenericItem("vanilla_beans", 64, Rarity.COMMON);
        GOO_BLOCK = registerGenericBlockItem("goo_block", OverwhelmedBlocks.GOO_BLOCK);
        SEREIBA_SIGN = registerGenericSignBlockItem("sereiba_sign", OverwhelmedBlocks.SEREIBA_SIGN,
                OverwhelmedBlocks.SEREIBA_WALL_SIGN);
        SEREIBA_HANGING_SIGN = registerGenericHangingSignBlockItem("sereiba_hanging_sign",
                OverwhelmedBlocks.SEREIBA_HANGING_SIGN, OverwhelmedBlocks.SEREIBA_WALL_HANGING_SIGN);
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
        MINT_ICE_CREAM = Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(Overwhelmed.MOD_ID, "mint_ice_cream"),
                new BowlFoodItem(new Item.Properties()
                        .stacksTo(1)
                        .rarity(Rarity.COMMON)
                        .food(OverwhelmedFoods.MINT_ICE_CREAM)));
        VANILLA_ICE_CREAM = Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(Overwhelmed.MOD_ID, "vanilla_ice_cream"),
                new BowlFoodItem(new Item.Properties()
                        .stacksTo(1)
                        .rarity(Rarity.COMMON)
                        .food(OverwhelmedFoods.VANILLA_ICE_CREAM)));
        PEPPERMINT = Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(Overwhelmed.MOD_ID, "peppermint"),
                new Item(new Item.Properties()
                        .stacksTo(64)
                        .rarity(Rarity.COMMON)
                        .food(OverwhelmedFoods.PEPPERMINT)));
        GOO_BALL = registerGenericItem("goo_ball", 64, Rarity.COMMON);
        SNAIL_SHELL = registerGenericItem("snail_shell", 64, Rarity.COMMON);
        MINT_LEAF = registerGenericItem("mint_leaf", 64, Rarity.COMMON);
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
        MOTH_SPAWN_EGG = registerGenericSpawnEggItem("moth_spawn_egg", OverwhelmedEntityTypes.MOTH,
                0x84504e, 0xddd5c3);
        HORNET_SPAWN_EGG = registerGenericSpawnEggItem("hornet_spawn_egg", OverwhelmedEntityTypes.HORNET,
                0xf79553, 0x3d221b);
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

    private static SignItem registerGenericSignBlockItem(String name, Block block, Block block2) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new SignItem(new Item.Properties(), block, block2));
    }

    private static HangingSignItem registerGenericHangingSignBlockItem(String name, Block block, Block block2) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new HangingSignItem(block, block2, new Item.Properties()));
    }

    private static ItemNameBlockItem registerGenericItemNameBlockItem(String name, Block block) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new ItemNameBlockItem(block, new Item.Properties()));
    }

    private static SpawnEggItem registerGenericSpawnEggItem(String name, EntityType<? extends Mob> entityType, int i, int j) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new SpawnEggItem(entityType, i, j, new Item.Properties()));
    }

}
