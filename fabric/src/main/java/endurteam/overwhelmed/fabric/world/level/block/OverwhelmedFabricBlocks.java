package endurteam.overwhelmed.fabric.world.level.block;

import com.mojang.serialization.MapCodec;
import endurteam.overwhelmed.Overwhelmed;
import endurteam.overwhelmed.world.level.block.*;
import endurteam.overwhelmed.world.level.block.state.properties.OverwhelmedBlockSetTypes;
import endurteam.overwhelmed.world.level.block.state.properties.OverwhelmedWoodType;
import it.unimi.dsi.fastutil.doubles.Double2ObjectAVLTreeMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.awt.*;

public class OverwhelmedFabricBlocks {

    public static void registerBlocks() {
        //Must register Blocks first
        OverwhelmedBlocks.SEREIBA_LOG = registerGenericRotatedPillarBlock("sereiba_log", BlockBehaviour.Properties.of()
                .mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)
                .sound(SoundType.WOOD)
                .strength(2.0f, 2.0f));
        OverwhelmedBlocks.SEREIBA_WOOD= registerGenericRotatedPillarBlock("sereiba_wood",
                BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.SEREIBA_LOG));
        OverwhelmedBlocks.STRIPPED_SEREIBA_LOG= registerGenericRotatedPillarBlock("stripped_sereiba_log",
                BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.SEREIBA_LOG));
        OverwhelmedBlocks.STRIPPED_SEREIBA_WOOD= registerGenericRotatedPillarBlock("stripped_sereiba_wood",
                BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.SEREIBA_LOG));
        OverwhelmedBlocks.SEREIBA_PLANKS = registerGenericBlock("sereiba_planks", BlockBehaviour.Properties.of()
                .mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)
                .strength(2.0f, 3.0f));
        OverwhelmedBlocks.SEREIBA_PARQUET = registerGenericBlock("sereiba_parquet",
                BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.SEREIBA_PLANKS));
        OverwhelmedBlocks.SEREIBA_STAIRS = registerGenericStairBlock(OverwhelmedBlocks.SEREIBA_PLANKS.defaultBlockState(),
                "sereiba_stairs", BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.SEREIBA_PLANKS));
        OverwhelmedBlocks.SEREIBA_PARQUET_STAIRS = registerGenericStairBlock(OverwhelmedBlocks.SEREIBA_PLANKS.defaultBlockState(),
                "sereiba_parquet_stairs", BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.SEREIBA_PLANKS));
        OverwhelmedBlocks.SEREIBA_SLAB = registerGenericSlabBlock("sereiba_slab",
                BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.SEREIBA_PLANKS));
        OverwhelmedBlocks.SEREIBA_PARQUET_SLAB = registerGenericSlabBlock("sereiba_parquet_slab",
                BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.SEREIBA_PLANKS));
        OverwhelmedBlocks.SEREIBA_FENCE = registerGenericFenceBlock("sereiba_fence",
                BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.SEREIBA_PLANKS));
        OverwhelmedBlocks.SEREIBA_FENCE_GATE = registerGenericFenceGateBlock("sereiba_fence_gate", WoodType.OAK,
                BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.SEREIBA_PLANKS));
        OverwhelmedBlocks.SEREIBA_DOOR = registerGenericDoorBlock("sereiba_door",
                BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.SEREIBA_PLANKS));
        OverwhelmedBlocks.STRING_SEREIBA_DOOR = registerGenericDoorBlock("string_sereiba_door",
                BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.SEREIBA_PLANKS));
        OverwhelmedBlocks.SEREIBA_TRAPDOOR = registerGenericTrapDoorBlock("sereiba_trapdoor",
                BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.SEREIBA_PLANKS));
        OverwhelmedBlocks.STRING_SEREIBA_TRAPDOOR = registerGenericTrapDoorBlock("string_sereiba_trapdoor",
                BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.SEREIBA_PLANKS));
        OverwhelmedBlocks.SEREIBA_PRESSURE_PLATE = registerGenericPressurePlateBlock("sereiba_pressure_plate",
                BlockSetType.OAK, BlockBehaviour.Properties.of()
                        .mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)
                        .strength(0.5f, 0.5f));
        OverwhelmedBlocks.SEREIBA_BUTTON = registerGenericButtonBlock("sereiba_button",
                BlockSetType.OAK, 60, BlockBehaviour.Properties.of()
                        .strength(0.5f, 0.5f));
        OverwhelmedBlocks.SNAIL_SHELL_BRICKS = registerGenericBlock("snail_shell_bricks", BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(3.0f, 12.0f)
                .requiresCorrectToolForDrops());
        OverwhelmedBlocks.SNAIL_SHELL_BRICK_STAIRS = registerGenericStairBlock(OverwhelmedBlocks.SNAIL_SHELL_BRICKS.defaultBlockState(),
                "snail_shell_brick_stairs", BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.SNAIL_SHELL_BRICKS));
        OverwhelmedBlocks.SNAIL_SHELL_BRICK_SLAB = registerGenericSlabBlock("snail_shell_brick_slab",
                BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.SNAIL_SHELL_BRICKS));
        OverwhelmedBlocks.SNAIL_SHELL_BRICK_WALL = registerGenericWallBlock("snail_shell_brick_wall",
                BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.SNAIL_SHELL_BRICKS));
        OverwhelmedBlocks.CHISELED_SNAIL_SHELL_BRICKS = registerGenericBlock("chiseled_snail_shell_bricks",
                BlockBehaviour.Properties.of()
                        .mapColor(MapColor.COLOR_BROWN)
                        .strength(3.0f, 12.0f)
                        .requiresCorrectToolForDrops());
        OverwhelmedBlocks.BLACK_GRANITE = registerGenericBlock("black_granite",
                BlockBehaviour.Properties.of()
                        .mapColor(MapColor.COLOR_BLACK)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresCorrectToolForDrops()
                        .strength(1.5f, 6.0f));
        OverwhelmedBlocks.BLACK_GRANITE_STAIRS = registerGenericStairBlock
                (OverwhelmedBlocks.BLACK_GRANITE.defaultBlockState(),
                        "black_granite_stairs", BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.BLACK_GRANITE));
        OverwhelmedBlocks.BLACK_GRANITE_SLAB = registerGenericSlabBlock("black_granite_slab",
                BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.BLACK_GRANITE));
        OverwhelmedBlocks.BLACK_GRANITE_WALL = registerGenericWallBlock("black_granite_wall",
                BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.BLACK_GRANITE));
        OverwhelmedBlocks.POLISHED_BLACK_GRANITE = registerGenericBlock("polished_black_granite",
                BlockBehaviour.Properties.of()
                        .mapColor(MapColor.COLOR_BLACK)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresCorrectToolForDrops().strength(1.5f, 6.0f));
        OverwhelmedBlocks.POLISHED_BLACK_GRANITE_STAIRS = registerGenericStairBlock
                (OverwhelmedBlocks.POLISHED_BLACK_GRANITE.defaultBlockState(),
                        "polished_black_granite_stairs",
                        BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.POLISHED_BLACK_GRANITE));
        OverwhelmedBlocks.POLISHED_BLACK_GRANITE_SLAB = registerGenericSlabBlock("polished_black_granite_slab",
                BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.POLISHED_BLACK_GRANITE));
        OverwhelmedBlocks.FIZZYROCK = registerGenericBlock("fizzyrock",
                BlockBehaviour.Properties.of()
                        .mapColor(MapColor.STONE)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresCorrectToolForDrops()
                        .strength(1.5f, 6.0f)
                        .sound(SoundType.DEEPSLATE));
        OverwhelmedBlocks.FIZZYROCK_STAIRS = registerGenericStairBlock
                (OverwhelmedBlocks.FIZZYROCK.defaultBlockState(),
                        "fizzyrock_stairs", BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.FIZZYROCK));
        OverwhelmedBlocks.FIZZYROCK_SLAB = registerGenericSlabBlock("fizzyrock_slab",
                BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.FIZZYROCK));
        OverwhelmedBlocks.FIZZYROCK_WALL = registerGenericWallBlock("fizzyrock_wall",
                BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.FIZZYROCK));
        OverwhelmedBlocks.CHISELED_FIZZYROCK = registerGenericBlock("chiseled_fizzyrock",
                BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.FIZZYROCK));
        OverwhelmedBlocks.POLISHED_FIZZYROCK = registerGenericBlock("polished_fizzyrock",
                BlockBehaviour.Properties.of()
                        .mapColor(MapColor.STONE)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresCorrectToolForDrops().strength(1.5f, 6.0f)
                        .sound(SoundType.POLISHED_DEEPSLATE));
        OverwhelmedBlocks.POLISHED_FIZZYROCK_STAIRS = registerGenericStairBlock
                (OverwhelmedBlocks.POLISHED_FIZZYROCK.defaultBlockState(),
                        "polished_fizzyrock_stairs", BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.POLISHED_FIZZYROCK));
        OverwhelmedBlocks.POLISHED_FIZZYROCK_SLAB = registerGenericSlabBlock("polished_fizzyrock_slab",
                BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.POLISHED_FIZZYROCK));
        OverwhelmedBlocks.FIZZYROCK_BRICKS = registerGenericBlock("fizzyrock_bricks",
                BlockBehaviour.Properties.of()
                        .mapColor(MapColor.STONE)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresCorrectToolForDrops()
                        .strength(1.5f, 6.0f)
                        .sound(SoundType.DEEPSLATE_BRICKS));
        OverwhelmedBlocks.FIZZYROCK_BRICK_STAIRS = registerGenericStairBlock
                (OverwhelmedBlocks.FIZZYROCK_BRICKS.defaultBlockState(),
                        "fizzyrock_brick_stairs", BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.FIZZYROCK_BRICKS));
        OverwhelmedBlocks.FIZZYROCK_BRICK_SLAB = registerGenericSlabBlock("fizzyrock_brick_slab",
                BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.FIZZYROCK_BRICKS));
        OverwhelmedBlocks.FIZZYROCK_BRICK_WALL = registerGenericWallBlock("fizzyrock_brick_wall",
                BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.FIZZYROCK_BRICKS));
        OverwhelmedBlocks.CHISELED_FIZZYROCK_BRICKS = registerGenericBlock("chiseled_fizzyrock_bricks",
                BlockBehaviour.Properties.ofFullCopy(OverwhelmedBlocks.FIZZYROCK_BRICKS));
        OverwhelmedBlocks.FIZZYROCK_GEYSER = Registry.register(BuiltInRegistries.BLOCK,
                new ResourceLocation(Overwhelmed.MOD_ID, "fizzyrock_geyser"),
                new FizzyrockGeyserBlock(BlockBehaviour.Properties.of()
                        .mapColor(MapColor.STONE)
                        .requiresCorrectToolForDrops()
                        .strength(1.3f, 5.0f)
                        .sound(SoundType.DEEPSLATE)));
        OverwhelmedBlocks.SOIL = registerGenericBlock("soil", BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(0.5f, 0.5f)
                .sound(SoundType.ROOTED_DIRT));
        OverwhelmedBlocks.CHARCOAL_ORE = registerGenericBlock("charcoal_ore", BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(0.7f, 0.7f)
                .sound(SoundType.ROOTED_DIRT));
        OverwhelmedBlocks.GOLD_BEAD = registerGenericClotBlock("gold_bead", BlockBehaviour.Properties.of()
                .mapColor(MapColor.GOLD)
                .strength(0f, 6f)
                .noCollission()
                .sound(SoundType.STONE)
                .noOcclusion());
        OverwhelmedBlocks.ICE_CUBE = registerGenericClotBlock("ice_cube", BlockBehaviour.Properties.of()
                .mapColor(MapColor.ICE)
                .strength(0f, 6f)
                .noCollission()
                .sound(SoundType.STONE)
                .noOcclusion());
        OverwhelmedBlocks.PEBBLE = Registry.register(BuiltInRegistries.BLOCK,
                new ResourceLocation(Overwhelmed.MOD_ID, "pebble"),
                new PebbleBlock(BlockBehaviour.Properties.of()
                        .mapColor(MapColor.STONE)
                        .strength(0f, 6f)
                        .noCollission()
                        .sound(SoundType.STONE)
                        .noOcclusion()));
        OverwhelmedBlocks.FLOFF = registerGenericFlowerBlock(MobEffects.REGENERATION, 4, "floff",
                BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .pushReaction(PushReaction.DESTROY));
        OverwhelmedBlocks.PAINE = registerGenericFlowerBlock(MobEffects.POISON, 8, "paine",
                BlockBehaviour.Properties.of()
                        .mapColor(MapColor.PLANT)
                        .noCollission()
                        .instabreak()
                        .sound(SoundType.GRASS)
                        .offsetType(BlockBehaviour.OffsetType.XZ)
                        .pushReaction(PushReaction.DESTROY));
        OverwhelmedBlocks.PINK_LAVATERA = registerGenericFlowerBlock(MobEffects.POISON, 6, "pink_lavatera",
                BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .pushReaction(PushReaction.DESTROY));
        OverwhelmedBlocks.WHITE_LAVATERA = registerGenericFlowerBlock(MobEffects.WEAKNESS, 5, "white_lavatera",
                BlockBehaviour.Properties.of()
                        .mapColor(MapColor.PLANT)
                        .noCollission()
                        .instabreak()
                        .sound(SoundType.GRASS)
                        .offsetType(BlockBehaviour.OffsetType.XZ)
                        .pushReaction(PushReaction.DESTROY));
        OverwhelmedBlocks.SQUIRL = registerGenericFlowerBlock(MobEffects.JUMP, 10, "squirl",
                BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .pushReaction(PushReaction.DESTROY));
        OverwhelmedBlocks.RINGOT = registerGenericFlowerBlock(MobEffects.BLINDNESS, 5, "ringot",
                BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .pushReaction(PushReaction.DESTROY));
        OverwhelmedBlocks.SNOWDROP = registerGenericFlowerBlock(MobEffects.WEAKNESS, 7, "snowdrop",
                BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .pushReaction(PushReaction.DESTROY));
        OverwhelmedBlocks.BELL_SUNFLOWER = registerGenericFlowerBlock(MobEffects.FIRE_RESISTANCE, 10, "bell_sunflower",
                BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .pushReaction(PushReaction.DESTROY));
        OverwhelmedBlocks.WIDOW = registerGenericTallFlowerBlock("widow", BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .ignitedByLava()
                .pushReaction(PushReaction.DESTROY));
        OverwhelmedBlocks.WHITE_ALLIUM = registerGenericTallFlowerBlock("white_allium", BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .ignitedByLava()
                .pushReaction(PushReaction.DESTROY));
        OverwhelmedBlocks.POTTED_FLOFF = registerGenericFlowerPotBlock(OverwhelmedBlocks.FLOFF, "potted_floff",
                BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWER_POT));
        OverwhelmedBlocks.POTTED_PAINE = registerGenericFlowerPotBlock(OverwhelmedBlocks.PAINE, "potted_paine",
                BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWER_POT));
        OverwhelmedBlocks.POTTED_PINK_LAVATERA = registerGenericFlowerPotBlock(OverwhelmedBlocks.PINK_LAVATERA,
                "potted_pink_lavatera",
                BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWER_POT));
        OverwhelmedBlocks.POTTED_WHITE_LAVATERA = registerGenericFlowerPotBlock(OverwhelmedBlocks.WHITE_LAVATERA,
                "potted_white_lavatera",
                BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWER_POT));
        OverwhelmedBlocks.POTTED_SQUIRL = registerGenericFlowerPotBlock(OverwhelmedBlocks.SQUIRL, "potted_squirl",
                BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWER_POT));
        OverwhelmedBlocks.POTTED_RINGOT = registerGenericFlowerPotBlock(OverwhelmedBlocks.RINGOT, "potted_ringot",
                BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWER_POT));
        OverwhelmedBlocks.POTTED_SNOWDROP = registerGenericFlowerPotBlock(OverwhelmedBlocks.SNOWDROP, "potted_snowdrop",
                BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWER_POT));
        OverwhelmedBlocks.POTTED_BELL_SUNFLOWER = registerGenericFlowerPotBlock(OverwhelmedBlocks.BELL_SUNFLOWER,
                "potted_bell_sunflower",
                BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWER_POT));
        OverwhelmedBlocks.MINT = registerGenericCropBlock("mint", BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT));
        OverwhelmedBlocks.GOO_BLOCK = Registry.register(BuiltInRegistries.BLOCK,
                new ResourceLocation(Overwhelmed.MOD_ID, "goo_block"),
                new GooBlock(BlockBehaviour.Properties.of()
                        .mapColor(MapColor.COLOR_YELLOW)
                        .friction(0.6f)
                        .friction(0.8f)
                        .sound(SoundType.HONEY_BLOCK)
                        .noOcclusion()
                        .jumpFactor(0.5f)
                        .speedFactor(0.4f)));
        OverwhelmedBlocks.MINT_CAKE = Registry.register(BuiltInRegistries.BLOCK,
                new ResourceLocation(Overwhelmed.MOD_ID, "mint_cake"),
                new MintCakeBlock(BlockBehaviour.Properties.of()
                        .forceSolidOn()
                        .strength(0.5f)
                        .sound(SoundType.WOOL)
                        .pushReaction(PushReaction.DESTROY)));
        OverwhelmedBlocks.VANILLA_CAKE = Registry.register(BuiltInRegistries.BLOCK,
                new ResourceLocation(Overwhelmed.MOD_ID, "vanilla_cake"),
                new VanillaCakeBlock(BlockBehaviour.Properties.of()
                        .forceSolidOn()
                        .strength(0.5f)
                        .sound(SoundType.WOOL)
                        .pushReaction(PushReaction.DESTROY)));

    }
    private static Block registerGenericBlock(String name,
                                              Block.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new Block(properties));
    }

    @SuppressWarnings("SameParameterValue")
    private static RotatedPillarBlock registerGenericRotatedPillarBlock(String name,
                                              Block.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new RotatedPillarBlock(properties));
    }

    @SuppressWarnings("SameParameterValue")
    private static WallBlock registerGenericWallBlock(String name,
                                                      Block.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new WallBlock(properties));
    }

    @SuppressWarnings("SameParameterValue")
    private static StairBlock registerGenericStairBlock(BlockState blockState,
                                                        String name,
                                                        Block.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new StairBlock(blockState, properties));
    }

    @SuppressWarnings("SameParameterValue")
    private static SlabBlock registerGenericSlabBlock(String name,
                                                      Block.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new SlabBlock(properties));
    }

    @SuppressWarnings("SameParameterValue")
    private static FenceBlock registerGenericFenceBlock(String name,
                                                                Block.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new FenceBlock(properties));
    }

    @SuppressWarnings("SameParameterValue")
    private static FenceGateBlock registerGenericFenceGateBlock(String name,
                                                        WoodType woodType,
                                                        Block.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new FenceGateBlock(woodType, properties));
    }

    @SuppressWarnings("SameParameterValue")
    private static DoorBlock registerGenericDoorBlock(String name,
                                                                     BlockSetType blockSetType,
                                                                     Block.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new DoorBlock(blockSetType, properties));
    }

    @SuppressWarnings("SameParameterValue")
    private static TrapDoorBlock registerGenericTrapDoorBlock(String name,
                                                      BlockSetType blockSetType,
                                                      Block.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new TrapDoorBlock(blockSetType, properties));
    }

    @SuppressWarnings("SameParameterValue")
    private static PressurePlateBlock registerGenericPressurePlateBlock(String name,
                                                              BlockSetType blockSetType,
                                                              Block.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new PressurePlateBlock(blockSetType, properties));
    }

    @SuppressWarnings("SameParameterValue")
    private static ButtonBlock registerGenericButtonBlock(String name,
                                                            BlockSetType blockSetType,
                                                            int i,
                                                            Block.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new ButtonBlock(blockSetType, i, properties));
    }

    @SuppressWarnings("SameParameterValue")
    private static FlowerBlock registerGenericFlowerBlock(MobEffect mobEffect,
                                                          int i,
                                                          String name,
                                                          BlockBehaviour.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new FlowerBlock(mobEffect, i, properties));
    }

    @SuppressWarnings("SameParameterValue")
    private static FlowerPotBlock registerGenericFlowerPotBlock(Block block,
                                                          String name,
                                                          BlockBehaviour.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new FlowerPotBlock(block, properties));
    }

    @SuppressWarnings("SameParameterValue")
    private static TallFlowerBlock registerGenericTallFlowerBlock(String name,
                                                                  Block.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new TallFlowerBlock(properties));
    }

    @SuppressWarnings("SameParameterValue")
    private static CropBlock registerGenericCropBlock(String name,
                                                                  Block.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new CropBlock(properties));
    }

    private static ClotBlock registerGenericClotBlock(String name,
                                                      Block.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new ClotBlock(properties));
    }

    @SuppressWarnings("SameParameterValue")
    private static SignBlock registerGenericSignBlock(String name,
                                                      WoodType woodType,
                                                      BlockBehaviour.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new SignBlock(woodType, properties) {
                    @Override
                    protected MapCodec<? extends SignBlock> codec() {
                        return null;
                    }

                    @Override
                    public float getYRotationDegrees(BlockState blockState) {
                        return 0;
                    }
                });
    }

}
