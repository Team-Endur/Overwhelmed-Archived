package endurteam.overwhelmed.world.level.block;

import dev.architectury.registry.registries.RegistrySupplier;
import endurteam.overwhelmed.world.item.OverwhelmedCreativeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import endurteam.overwhelmed.Overwhelmed;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Supplier;

public class OverwhelmedBlocks {
    public static RegistrySupplier<Block> widow;
    public static RegistrySupplier<Block> soil;
    public static RegistrySupplier<Block> snailShellBricks;
    public static RegistrySupplier<Block> snailShellBrickWall;
    public static RegistrySupplier<Block> snailShellBrickSlab;
    public static RegistrySupplier<Block> snailShellBrickStairs;
    public static RegistrySupplier<Block> chiseledSnailShellBricks;
    public static RegistrySupplier<Block> gooBlock;
    public static RegistrySupplier<Block> pebble;
    public static RegistrySupplier<Block> ice_cube;
    public static RegistrySupplier<Block> gold_bead;

    public static void registerBlocks() {

        //Must register Blocks first
        soil = registerGenericBlock("soil", BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(0.5f, 0.5f)
                .sound(SoundType.ROOTED_DIRT));
        snailShellBricks = registerGenericBlock("snail_shell_bricks", BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(3.0f, 12.0f)
                .requiresCorrectToolForDrops());
        chiseledSnailShellBricks = registerGenericBlock("chiseled_snail_shell_bricks",
                BlockBehaviour.Properties.of()
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
        widow = registerTallFlowerBlock("widow", () -> BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .ignitedByLava()
                .pushReaction(PushReaction.DESTROY));
        //These are sub blocks, these must stay down here, or it breaks.
        registerBlockItem("soil", soil);
        snailShellBrickWall = registerWallBlock("snail_shell_brick_wall",
                () -> BlockBehaviour.Properties.copy(snailShellBricks.get()));
        snailShellBrickSlab = registerSlabBlock("snail_shell_brick_slab",
                () -> BlockBehaviour.Properties.copy(snailShellBricks.get()));
        snailShellBrickStairs = registerStairBlock(() -> snailShellBricks.get().defaultBlockState(),
                "snail_shell_brick_stairs", () -> BlockBehaviour.Properties.copy(snailShellBricks.get()));
        registerBlockItem("snail_shell_bricks", snailShellBricks);
        registerBlockItem("snail_shell_brick_stairs", snailShellBrickStairs);
        registerBlockItem("snail_shell_brick_slab", snailShellBrickSlab);
        registerBlockItem("snail_shell_brick_wall", snailShellBrickWall);
        registerBlockItem("chiseled_snail_shell_bricks", chiseledSnailShellBricks);
        registerBlockItem("goo_block", gooBlock);
        registerCustomBlockItem("widow", () -> new DoubleHighBlockItem(widow.get(), new Item.Properties()
                .arch$tab(OverwhelmedCreativeTabs.overwhelmedTab)));

        Overwhelmed.BLOCKS.register();
    }
    private static RegistrySupplier<Block> registerWallBlock(String name,
                                                             Supplier<Block.Properties> propertiesSupplier) {
        return Overwhelmed.BLOCKS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new WallBlock(propertiesSupplier.get()));
    }

    private static RegistrySupplier<Block> registerStairBlock(Supplier<BlockState> blockStateSupplier, String name,
                                                              Supplier<Block.Properties> propertiesSupplier) {
        return Overwhelmed.BLOCKS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new StairBlock(blockStateSupplier.get(), propertiesSupplier.get()));
    }

    private static RegistrySupplier<Block> registerSlabBlock(String name,
                                                             Supplier<Block.Properties> propertiesSupplier) {
        return Overwhelmed.BLOCKS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new SlabBlock(propertiesSupplier.get()));
    }
    private static RegistrySupplier<Block> registerGenericBlock(String name, Block.Properties properties) {
        return Overwhelmed.BLOCKS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new Block(properties));
    }

    private static void registerBlockItem(String name, RegistrySupplier<Block> blockSupplier) {
        Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new BlockItem(blockSupplier.get(), new Item.Properties().arch$tab(OverwhelmedCreativeTabs.overwhelmedTab)));
    }

    private static void registerCustomBlockItem(String name, Supplier<BlockItem> blockItemSupplier) {
        Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), blockItemSupplier);
    }

    private static RegistrySupplier<Block> registerTallFlowerBlock(String name,
                                                             Supplier<Block.Properties> propertiesSupplier) {
        return Overwhelmed.BLOCKS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new TallFlowerBlock(propertiesSupplier.get()));
    }
}
