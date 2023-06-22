package overwhelmed.overwhelmed.registry;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;
import overwhelmed.overwhelmed.Overwhelmed;

import static overwhelmed.overwhelmed.registry.CreativeTabRegistry.MY_TAB;

public class BlockRegistry {
    public static RegistrySupplier<Block> testBlock;
    public static RegistrySupplier<Item> testBlockItem;

    public static void registerBlocks() {
        testBlock = Overwhelmed.blocks.register(new ResourceLocation(Overwhelmed.MOD_ID, "test_block"), () ->
                new Block(Block.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).requiresCorrectToolForDrops()));

        testBlockItem = Overwhelmed.items.register(new ResourceLocation(Overwhelmed.MOD_ID, "test_block"),
                () -> new BlockItem(testBlock.get(), new Item.Properties().arch$tab(MY_TAB)));
    }
}