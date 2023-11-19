package endurteam.overwhelmed.fabric.world.level.block;

import endurteam.overwhelmed.Overwhelmed;
import endurteam.overwhelmed.world.level.block.ClotBlock;
import endurteam.overwhelmed.world.level.block.GooBlock;
import endurteam.overwhelmed.world.level.block.OverwhelmedBlocks;
import endurteam.overwhelmed.world.level.block.PebbleBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import static endurteam.overwhelmed.world.level.block.OverwhelmedBlocks.*;

public class OverwhelmedFabricBlocks {
    public static void registerBlocks() {
        //Must register Blocks first
        soilBlock = registerGenericBlock("soil", BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(0.5f, 0.5f)
                .sound(SoundType.ROOTED_DIRT));
        snailShellBrickBlock = registerGenericBlock("snail_shell_bricks", BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(3.0f, 12.0f)
                .requiresCorrectToolForDrops());
        snailShellBrickStairBlock = registerGenericStairBlock(snailShellBrickBlock.defaultBlockState(),
                "snail_shell_brick_stairs", BlockBehaviour.Properties.copy(snailShellBrickBlock));
        snailShellBrickSlabBlock = registerGenericSlabBlock("snail_shell_brick_slab",
                BlockBehaviour.Properties.copy(snailShellBrickBlock));
        OverwhelmedBlocks.snailShellBrickWallBlock = registerGenericWallBlock("snail_shell_brick_wall",
                BlockBehaviour.Properties.copy(snailShellBrickBlock));
        OverwhelmedBlocks.chiseledSnailShellBrickBlock = registerGenericBlock("chiseled_snail_shell_bricks",
                BlockBehaviour.Properties.of()
                        .mapColor(MapColor.COLOR_BROWN)
                        .strength(3.0f, 12.0f)
                        .requiresCorrectToolForDrops());
        goldBeadBlock = registerGenericClotBlock("gold_bead", BlockBehaviour.Properties.of()
                .mapColor(MapColor.GOLD)
                .strength(0f, 6f)
                .noCollission()
                .sound(SoundType.STONE)
                .noOcclusion());
        iceCubeBlock = registerGenericClotBlock("ice_cube", BlockBehaviour.Properties.of()
                .mapColor(MapColor.ICE)
                .strength(0f, 6f)
                .noCollission()
                .sound(SoundType.STONE)
                .noOcclusion());
        pebbleBlock = Registry.register(BuiltInRegistries.BLOCK,
                new ResourceLocation(Overwhelmed.MOD_ID, "pebble"),
                new PebbleBlock(BlockBehaviour.Properties.of()
                        .mapColor(MapColor.STONE)
                        .strength(0f, 6f)
                        .noCollission()
                        .sound(SoundType.STONE)
                        .noOcclusion()));
        widowBlock = registerGenericTallFlowerBlock("widow", BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .ignitedByLava()
                .pushReaction(PushReaction.DESTROY));
        gooBlock = Registry.register(BuiltInRegistries.BLOCK,
                new ResourceLocation(Overwhelmed.MOD_ID, "goo_block"),
                new GooBlock(BlockBehaviour.Properties.of()
                        .mapColor(MapColor.COLOR_YELLOW)
                        .friction(0.6f)
                        .friction(0.8f)
                        .sound(SoundType.HONEY_BLOCK)
                        .noOcclusion()
                        .jumpFactor(0.5f)
                        .speedFactor(0.4f)));
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
