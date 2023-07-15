package endurteam.overwhelmed.registry;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import endurteam.overwhelmed.Overwhelmed;
import endurteam.overwhelmed.common.block.GooBlock;

import java.util.function.Supplier;

public class BlockRegistry {
    public static RegistrySupplier<Block> sedimentBlock;
    public static RegistrySupplier<Block> snailShellBricks;
    public static RegistrySupplier<Block> snailShellBrickWall;
    public static RegistrySupplier<Block> snailShellBrickSlab;
    public static RegistrySupplier<Block> snailShellBrickStairs;
    public static RegistrySupplier<Block> chiseledSnailShellBricks;
    public static RegistrySupplier<Block> gooBlock;

    public static void registerBlocks() {

        //Must register Blocks first
        sedimentBlock = registerGenericBlock("sediment_block", BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(0.5f, 0.5f)
                .requiresCorrectToolForDrops());
        snailShellBricks = registerGenericBlock("snail_shell_bricks", BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(3.0f, 12.0f)
                .requiresCorrectToolForDrops());
        chiseledSnailShellBricks = registerGenericBlock("chiseled_snail_shell_bricks", BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(3.0f, 12.0f)
                .requiresCorrectToolForDrops());
        gooBlock = Overwhelmed.BLOCKS.register(new ResourceLocation(Overwhelmed.MOD_ID, "goo_block"), () ->
                new GooBlock(BlockBehaviour.Properties.of().mapColor(MapColor.GRASS).friction(0.8f)
                        .sound(SoundType.SLIME_BLOCK)));

        //These are sub blocks, these must stay down here, or it breaks.
        registerBlockItem("sediment_block", sedimentBlock);
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
                new BlockItem(blockSupplier.get(), new Item.Properties().arch$tab(CreativeTabRegistry.overwhelmedTab)));
    }
}