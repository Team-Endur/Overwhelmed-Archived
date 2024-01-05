package endurteam.overwhelmed.fabric.world.level.block;

import endurteam.overwhelmed.Overwhelmed;
import endurteam.overwhelmed.world.level.block.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public class OverwhelmedFabricBlocks {

    public static void registerBlocks() {
        //Must register Blocks first
        OverwhelmedBlocks.SOIL = registerGenericBlock("soil", BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(0.5f, 0.5f)
                .sound(SoundType.ROOTED_DIRT));
        OverwhelmedBlocks.SNAIL_SHELL_BRICKS = registerGenericBlock("snail_shell_bricks",
                BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(3.0f, 12.0f)
                .requiresCorrectToolForDrops());
        OverwhelmedBlocks.SNAIL_SHELL_BRICK_STAIRS = registerGenericStairBlock
                (OverwhelmedBlocks.SNAIL_SHELL_BRICKS.defaultBlockState(),
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
    private static ClotBlock registerGenericClotBlock(String name,
                                                      Block.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new ClotBlock(properties));
    }

}
