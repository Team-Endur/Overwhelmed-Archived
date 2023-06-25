package overwhelmed.overwhelmed.registry;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import overwhelmed.overwhelmed.Overwhelmed;

public class BlockRegistry {
    /*
    public static RegistrySupplier<Block> testBlock;
     */
    public static void registerBlocks() {
        /*
        testBlock = registerBlock("test_block", BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(1.5f, 6.0f)
                    .requiresCorrectToolForDrops());
         */

        Overwhelmed.BLOCKS.register();
        /*
        registerBlockItem("test_block", testBlock);
         */


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