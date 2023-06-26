package overwhelmed.overwhelmed.registry;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import overwhelmed.overwhelmed.Overwhelmed;

public class BlockRegistry {
    /*
    public static RegistrySupplier<Block> testBlock;
     */

    public static RegistrySupplier<Block> sedimentBlock;
    public static RegistrySupplier<Block> sedimentSlabBlock;
    public static RegistrySupplier<Block> sedimentStairBlock;
    public static RegistrySupplier<Block> snailShellBricks;
    public static RegistrySupplier<Block> snailShellBrickWall;
    public static RegistrySupplier<Block> snailShellBrickSlab;
    public static RegistrySupplier<Block> snailShellBrickStairs;

    public static void registerBlocks() {

        //Must register Blocks first
        sedimentBlock = registerBlock("sediment_block", BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(0.5f, 0.5f)
                .requiresCorrectToolForDrops());
        snailShellBricks = registerBlock("snail_shell_bricks", BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(1.0f, 1.0f)
                .requiresCorrectToolForDrops());


        //DO NOT MOVE THIS LINE
        Overwhelmed.BLOCKS.register();

        //These are sub blocks, these must stay down here, or it breaks.
        registerBlockItem("sediment_block", sedimentBlock);
        snailShellBrickWall = registerWallBlock("snail_shell_brick_wall",
                BlockBehaviour.Properties.copy(snailShellBricks.get()));
        snailShellBrickSlab = registerSlabBlock("snail_shell_brick_slab",
                BlockBehaviour.Properties.copy(snailShellBricks.get()));
        snailShellBrickStairs = registerStairBlock(snailShellBricks.get().defaultBlockState(), "snail_shell_brick_stairs",
                BlockBehaviour.Properties.copy(snailShellBricks.get()));
        registerBlockItem("snail_shell_bricks", snailShellBricks);
        registerBlockItem("snail_shell_brick_stairs", snailShellBrickStairs);
        registerBlockItem("snail_shell_brick_slab", snailShellBrickSlab);
        registerBlockItem("snail_shell_brick_wall", snailShellBrickWall);


    }
    private static RegistrySupplier<Block> registerWallBlock(String name, Block.Properties properties) {
        return Overwhelmed.BLOCKS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new WallBlock(properties));
    }

    private static RegistrySupplier<Block> registerStairBlock(BlockState blockState, String name, Block.Properties properties) {
        return Overwhelmed.BLOCKS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new StairBlock(blockState, properties));
    }

    private static RegistrySupplier<Block> registerSlabBlock(String name, Block.Properties properties) {
        return Overwhelmed.BLOCKS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new SlabBlock(properties));
    }
    private static RegistrySupplier<Block> registerBlock(String name, Block.Properties properties) {
        return Overwhelmed.BLOCKS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new Block(properties));
    }

    private static void registerBlockItem(String name, RegistrySupplier<Block> blockSupplier) {
        Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new BlockItem(blockSupplier.get(), new Item.Properties().arch$tab(CreativeTabRegistry.overwhelmedTab)));
    }
}