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
        OVERWHELMED = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
                "overwhelmed_tab", FabricItemGroup.builder()
                        .icon(() ->
                                new ItemStack(SNAIL_SHELL))
                        .title(Component.translatable("category.overwhelmed"))
                        .displayItems((itemDisplayParameters, output) -> {
                            output.accept(SOIL);
                            output.accept(SNAIL_SHELL_BRICKS);
                            output.accept(SNAIL_SHELL_BRICK_STAIRS);
                            output.accept(SNAIL_SHELL_BRICK_SLAB);
                            output.accept(SNAIL_SHELL_BRICK_WALL);
                            output.accept(CHISELED_SNAIL_SHELL_BRICKS);
                            output.accept(FLOFF);
                            output.accept(PAINE);
                            output.accept(PINK_LAVATERA);
                            output.accept(WHITE_LAVATERA);
                            output.accept(SQUIRL);
                            output.accept(RINGOT);
                            output.accept(SNOWDROP);
                            output.accept(BELL_SUNFLOWER);
                            output.accept(WIDOW);
                            output.accept(GOLD_BEAD);
                            output.accept(ICE_CUBE);
                            output.accept(PEBBLE);
                            output.accept(GOO_BLOCK);
                            output.accept(BLOWGUN);
                            output.accept(PAPER_BULLET);
                            output.accept(SNAIL_STEW);
                            output.accept(SNAIL);
                            output.accept(COOKED_SNAIL);
                            output.accept(VANILLA_COOKIE);
                            output.accept(VANILLA_ICE_CREAM);
                            output.accept(GOO_BALL);
                            output.accept(SNAIL_SHELL);
                            output.accept(BUTTERFLY_SPAWN_EGG);
                            output.accept(SNAIL_SPAWN_EGG);
                        }).build());
    }
}
