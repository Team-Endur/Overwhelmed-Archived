package endurteam.overwhelmed.fabric.world.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

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
                            output.accept(SNAIL);
                            output.accept(COOKED_SNAIL);
                            output.accept(SNAIL_STEW);
                            output.accept(GOO_BALL);
                            output.accept(SNAIL_SHELL);
                            output.accept(BUTTERFLY_SPAWN_EGG);
                            output.accept(SNAIL_SPAWN_EGG);
                        }).build());
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(output -> {
            output.accept(SNAIL_SHELL_BRICKS);
            output.accept(SNAIL_SHELL_BRICK_STAIRS);
            output.accept(SNAIL_SHELL_BRICK_SLAB);
            output.accept(SNAIL_SHELL_BRICK_WALL);
            output.accept(CHISELED_SNAIL_SHELL_BRICKS);
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(output -> {
            output.addAfter(Items.DEAD_BUSH, GOLD_BEAD);
            output.addAfter(GOLD_BEAD, ICE_CUBE);
            output.addAfter(ICE_CUBE, PEBBLE);
            output.addAfter(Items.KELP, FLOFF);
            output.addAfter(FLOFF, PAINE);
            output.addAfter(PAINE, PINK_LAVATERA);
            output.addAfter(PINK_LAVATERA, WHITE_LAVATERA);
            output.addAfter(WHITE_LAVATERA, SQUIRL);
            output.addAfter(SQUIRL, RINGOT);
            output.addAfter(RINGOT, SNOWDROP);
            output.addAfter(SNOWDROP, BELL_SUNFLOWER);
            output.addAfter(BELL_SUNFLOWER, WIDOW);
            output.accept(SOIL);
            output.accept(GOO_BLOCK);

        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(output -> {
            output.addAfter(Items.CROSSBOW, BLOWGUN);
            output.addAfter(Items.EGG, PEBBLE);
            output.accept(PAPER_BULLET);
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(output -> {
            output.addAfter(Items.RABBIT_STEW, SNAIL_STEW);
            output.addAfter(Items.PUFFERFISH, SNAIL);
            output.addAfter(SNAIL, COOKED_SNAIL);
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.addAfter(Items.SLIME_BALL, GOO_BALL);
            output.addAfter(Items.NAUTILUS_SHELL, SNAIL_SHELL);
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(output -> {
            output.addAfter(Items.SLIME_SPAWN_EGG, SNAIL_SPAWN_EGG);
            output.addAfter(Items.BLAZE_SPAWN_EGG, BUTTERFLY_SPAWN_EGG);
        });

    }
}
