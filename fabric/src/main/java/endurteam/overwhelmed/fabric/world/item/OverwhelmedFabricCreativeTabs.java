package endurteam.overwhelmed.fabric.world.item;

import endurteam.overwhelmed.world.item.OverwhelmedItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;

import static endurteam.overwhelmed.world.item.OverwhelmedItems.*;
import static endurteam.overwhelmed.world.item.OverwhelmedCreativeTabs.*;

public class OverwhelmedFabricCreativeTabs {
    public static void registerCreativeTab() {
        overwhelmedTab = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
                "overwhelmed_tab", FabricItemGroup.builder()
                        .icon(() ->
                                new ItemStack(OverwhelmedItems.snailShellItem))
                        .title(Component.translatable("category.overwhelmed"))
                        .displayItems((itemDisplayParameters, output) -> {
                            output.accept(soilBlockItem);
                            output.accept(snailShellBrickBlockItem);
                            output.accept(snailShellBrickStairsBlockItem);
                            output.accept(snailShellBrickSlabBlockItem);
                            output.accept(snailShellBrickWallBlockItem);
                            output.accept(chiseledSnailShellBricksBlockItem);
                            output.accept(floffBlockItem);
                            output.accept(paineBlockItem);
                            output.accept(strowBlockItem);
                            output.accept(squirlBlockItem);
                            output.accept(ringotBlockItem);
                            output.accept(wilttBlockItem);
                            output.accept(dumbbellBlockItem);
                            output.accept(ralpBlockItem);
                            output.accept(widowBlockItem);
                            output.accept(goldBeadBlockItem);
                            output.accept(iceCubeBlockItem);
                            output.accept(pebbleBlockItem);
                            output.accept(gooBlockBlockItem);
                            output.accept(blowgunItem);
                            output.accept(paperBulletItem);
                            output.accept(snailStewItem);
                            output.accept(snailItem);
                            output.accept(cookedSnailItem);
                            output.accept(gooBallItem);
                            output.accept(snailShellItem);
                            output.accept(butterflySpawnEggItem);
                            output.accept(snailSpawnEggItem);
                        }).build());
    }
}
