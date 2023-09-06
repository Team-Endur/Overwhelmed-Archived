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
    public static RegistrySupplier<TallFlowerBlock> widow;
    public static RegistrySupplier<Block> soil;
    public static RegistrySupplier<Block> snailShellBricks;
    public static RegistrySupplier<WallBlock> snailShellBrickWall;
    public static RegistrySupplier<SlabBlock> snailShellBrickSlab;
    public static RegistrySupplier<StairBlock> snailShellBrickStairs;
    public static RegistrySupplier<Block> chiseledSnailShellBricks;
    public static RegistrySupplier<GooBlock> gooBlock;
    public static RegistrySupplier<PebbleBlock> pebble;
    public static RegistrySupplier<ClotBlock> iceCube;
    public static RegistrySupplier<ClotBlock> goldBead;

    public static void registerBlocks() {

        //Must register Blocks first
        soil = registerGenericBlock("soil", () -> BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(0.5f, 0.5f)
                .sound(SoundType.ROOTED_DIRT));
        snailShellBricks = registerGenericBlock("snail_shell_bricks", () -> BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(3.0f, 12.0f)
                .requiresCorrectToolForDrops());
        chiseledSnailShellBricks = registerGenericBlock("chiseled_snail_shell_bricks",
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
        widow = registerGenericTallFlowerBlock("widow", () -> BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .ignitedByLava()
                .pushReaction(PushReaction.DESTROY));
        pebble = Overwhelmed.BLOCKS.register(new ResourceLocation(Overwhelmed.MOD_ID, "pebble"), () ->
                new PebbleBlock(BlockBehaviour.Properties.of()
                        .mapColor(MapColor.STONE)
                        .strength(0f, 6f)
                        .noCollission()
                        .sound(SoundType.STONE)
                        .noOcclusion()));
        iceCube = registerGenericClotBlock("ice_cube", () -> BlockBehaviour.Properties.of()
                .mapColor(MapColor.ICE)
                .strength(0f, 6f)
                .noCollission()
                .sound(SoundType.STONE)
                .noOcclusion());
        goldBead = registerGenericClotBlock("gold_bead", () -> BlockBehaviour.Properties.of()
                .mapColor(MapColor.GOLD)
                .strength(0f, 6f)
                .noCollission()
                .sound(SoundType.STONE)
                .noOcclusion());
        //These are sub blocks, these must stay down here, or it breaks.
        snailShellBrickWall = registerGenericWallBlock("snail_shell_brick_wall",
                () -> BlockBehaviour.Properties.copy(snailShellBricks.get()));
        snailShellBrickSlab = registerGenericSlabBlock("snail_shell_brick_slab",
                () -> BlockBehaviour.Properties.copy(snailShellBricks.get()));
        snailShellBrickStairs = registerGenericStairBlock(() -> snailShellBricks.get().defaultBlockState(),
                "snail_shell_brick_stairs", () -> BlockBehaviour.Properties.copy(snailShellBricks.get()));

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
