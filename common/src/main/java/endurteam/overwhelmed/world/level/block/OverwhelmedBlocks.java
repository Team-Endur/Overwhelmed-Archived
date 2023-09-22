package endurteam.overwhelmed.world.level.block;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import endurteam.overwhelmed.Overwhelmed;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Supplier;

public class OverwhelmedBlocks {
    public static RegistrySupplier<Block> soilBlock;
    public static RegistrySupplier<Block> snailShellBrickBlock;
    public static RegistrySupplier<StairBlock> snailShellBrickStairBlock;
    public static RegistrySupplier<SlabBlock> snailShellBrickSlabBlock;
    public static RegistrySupplier<WallBlock> snailShellBrickWallBlock;
    public static RegistrySupplier<Block> chiseledSnailShellBrickBlock;
    public static RegistrySupplier<GooBlock> gooBlock;
    public static RegistrySupplier<TallFlowerBlock> widowBlock;
    public static RegistrySupplier<PebbleBlock> pebbleBlock;
    public static RegistrySupplier<ClotBlock> iceCubeBlock;
    public static RegistrySupplier<ClotBlock> goldBeadBlock;

    public static void registerBlocks() {

        //Must register Blocks first
        soilBlock = registerGenericBlock("soil", () -> BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(0.5f, 0.5f)
                .sound(SoundType.ROOTED_DIRT));
        snailShellBrickBlock = registerGenericBlock("snail_shell_bricks", () -> BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(3.0f, 12.0f)
                .requiresCorrectToolForDrops());
        snailShellBrickStairBlock = registerGenericStairBlock(() -> snailShellBrickBlock.get().defaultBlockState(),
                "snail_shell_brick_stairs", () -> BlockBehaviour.Properties.copy(snailShellBrickBlock.get()));
        snailShellBrickSlabBlock = registerGenericSlabBlock("snail_shell_brick_slab",
                () -> BlockBehaviour.Properties.copy(snailShellBrickBlock.get()));
        snailShellBrickWallBlock = registerGenericWallBlock("snail_shell_brick_wall",
                () -> BlockBehaviour.Properties.copy(snailShellBrickBlock.get()));
        chiseledSnailShellBrickBlock = registerGenericBlock("chiseled_snail_shell_bricks",
                () -> BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(3.0f, 12.0f)
                .requiresCorrectToolForDrops());
        gooBlock = Overwhelmed.BLOCKS.register(new ResourceLocation(Overwhelmed.MOD_ID, "goo_block"), () ->
                new GooBlock(BlockBehaviour.Properties.of()
                        .mapColor(MapColor.COLOR_YELLOW)
                        .friction(0.6f)
                        .friction(0.8f)
                        .sound(SoundType.HONEY_BLOCK)
                        .noOcclusion()
                        .jumpFactor(0.5f)
                        .speedFactor(0.4f)));
        widowBlock = registerGenericTallFlowerBlock("widow", () -> BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .ignitedByLava()
                .pushReaction(PushReaction.DESTROY));
        pebbleBlock = Overwhelmed.BLOCKS.register(new ResourceLocation(Overwhelmed.MOD_ID, "pebble"), () ->
                new PebbleBlock(BlockBehaviour.Properties.of()
                        .mapColor(MapColor.STONE)
                        .strength(0f, 6f)
                        .noCollission()
                        .sound(SoundType.STONE)
                        .noOcclusion()));
        iceCubeBlock = registerGenericClotBlock("ice_cube", () -> BlockBehaviour.Properties.of()
                .mapColor(MapColor.ICE)
                .strength(0f, 6f)
                .noCollission()
                .sound(SoundType.STONE)
                .noOcclusion());
        goldBeadBlock = registerGenericClotBlock("gold_bead", () -> BlockBehaviour.Properties.of()
                .mapColor(MapColor.GOLD)
                .strength(0f, 6f)
                .noCollission()
                .sound(SoundType.STONE)
                .noOcclusion());
        Overwhelmed.BLOCKS.register();
    }
    private static RegistrySupplier<Block> registerGenericBlock(String name,
                                                                Supplier<Block.Properties> propertiesSupplier) {
        return Overwhelmed.BLOCKS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new Block(propertiesSupplier.get()));
    }

    private static RegistrySupplier<WallBlock> registerGenericWallBlock(String name,
                                                                        Supplier<Block.Properties> propertiesSupplier) {
        return Overwhelmed.BLOCKS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new WallBlock(propertiesSupplier.get()));
    }

    private static RegistrySupplier<StairBlock> registerGenericStairBlock(Supplier<BlockState> blockStateSupplier,
                                                                          String name,
                                                                          Supplier<Block.Properties>
                                                                                  propertiesSupplier) {
        return Overwhelmed.BLOCKS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new StairBlock(blockStateSupplier.get(), propertiesSupplier.get()));
    }

    private static RegistrySupplier<SlabBlock> registerGenericSlabBlock(String name,
                                                                        Supplier<Block.Properties> propertiesSupplier) {
        return Overwhelmed.BLOCKS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new SlabBlock(propertiesSupplier.get()));
    }


    private static RegistrySupplier<TallFlowerBlock> registerGenericTallFlowerBlock(String name,
                                                                                    Supplier<Block.Properties>
                                                                                            propertiesSupplier) {
        return Overwhelmed.BLOCKS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new TallFlowerBlock(propertiesSupplier.get()));
    }
    private static RegistrySupplier<ClotBlock> registerGenericClotBlock(String name,
                                                                        Supplier<Block.Properties> propertiesSupplier) {
        return Overwhelmed.BLOCKS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new ClotBlock(propertiesSupplier.get()));
    }
}
