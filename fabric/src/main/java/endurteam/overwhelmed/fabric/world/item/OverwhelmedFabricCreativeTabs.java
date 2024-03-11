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
                            output.accept(SEREIBA_LOG);
                            output.accept(SEREIBA_WOOD);
                            output.accept(STRIPPED_SEREIBA_LOG);
                            output.accept(STRIPPED_SEREIBA_WOOD);
                            output.accept(SEREIBA_PLANKS);
                            output.accept(SEREIBA_PARQUET);
                            output.accept(SEREIBA_STAIRS);
                            output.accept(SEREIBA_PARQUET_STAIRS);
                            output.accept(SEREIBA_SLAB);
                            output.accept(SEREIBA_PARQUET_SLAB);
                            output.accept(SEREIBA_FENCE);
                            output.accept(SEREIBA_FENCE_GATE);
                            output.accept(SEREIBA_DOOR);
                            output.accept(SEREIBA_TRAPDOOR);
                            output.accept(WOODED_SEREIBA_TRAPDOOR);
                            output.accept(SEREIBA_PRESSURE_PLATE);
                            output.accept(SEREIBA_BUTTON);
                            output.accept(SNAIL_SHELL_BRICKS);
                            output.accept(SNAIL_SHELL_BRICK_STAIRS);
                            output.accept(SNAIL_SHELL_BRICK_SLAB);
                            output.accept(SNAIL_SHELL_BRICK_WALL);
                            output.accept(CHISELED_SNAIL_SHELL_BRICKS);
                            output.accept(BLACK_GRANITE);
                            output.accept(BLACK_GRANITE_STAIRS);
                            output.accept(BLACK_GRANITE_SLAB);
                            output.accept(BLACK_GRANITE_WALL);
                            output.accept(POLISHED_BLACK_GRANITE);
                            output.accept(POLISHED_BLACK_GRANITE_STAIRS);
                            output.accept(POLISHED_BLACK_GRANITE_SLAB);
                            output.accept(FIZZYROCK);
                            output.accept(FIZZYROCK_STAIRS);
                            output.accept(FIZZYROCK_SLAB);
                            output.accept(FIZZYROCK_WALL);
                            output.accept(CHISELED_FIZZYROCK);
                            output.accept(POLISHED_FIZZYROCK);
                            output.accept(POLISHED_FIZZYROCK_STAIRS);
                            output.accept(POLISHED_FIZZYROCK_SLAB);
                            output.accept(FIZZYROCK_BRICKS);
                            output.accept(FIZZYROCK_BRICK_STAIRS);
                            output.accept(FIZZYROCK_BRICK_SLAB);
                            output.accept(FIZZYROCK_BRICK_WALL);
                            output.accept(CHISELED_FIZZYROCK_BRICKS);
                            output.accept(FIZZYROCK_GEYSER);
                            output.accept(SOIL);
                            output.accept(CHARCOAL_ORE);
                            output.accept(SEREIBA_LEAVES);
                            output.accept(FLOFF);
                            output.accept(PAINE);
                            output.accept(PINK_LAVATERA);
                            output.accept(WHITE_LAVATERA);
                            output.accept(SQUIRL);
                            output.accept(RINGOT);
                            output.accept(SNOWDROP);
                            output.accept(BELL_SUNFLOWER);
                            output.accept(SEREIBA_VINES);
                            output.accept(WIDOW);
                            output.accept(WHITE_ALLIUM);
                            output.accept(GOLD_BEAD);
                            output.accept(ICE_CUBE);
                            output.accept(PEBBLE);
                            output.accept(MINT_SEEDS);
                            output.accept(VANILLA_BEANS);
                            output.accept(GOO_BLOCK);
                            output.accept(BLOWGUN);
                            output.accept(PAPER_BULLET);
                            output.accept(SNAIL);
                            output.accept(COOKED_SNAIL);
                            output.accept(SNAIL_STEW);
                            output.accept(VANILLA_COOKIE);
                            output.accept(MINT_CAKE);
                            output.accept(VANILLA_CAKE);
                            output.accept(MINT_ICE_CREAM);
                            output.accept(VANILLA_ICE_CREAM);
                            output.accept(PEPPERMINT);
                            output.accept(GOO_BALL);
                            output.accept(SNAIL_SHELL);
                            output.accept(MINT_LEAF);
                            output.accept(BUTTERFLY_SPAWN_EGG);
                            output.accept(HORNET_SPAWN_EGG);
                            output.accept(MOTH_SPAWN_EGG);
                            output.accept(SNAIL_SPAWN_EGG);
                        }).build());
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(output -> {
            output.accept(SNAIL_SHELL_BRICKS);
            output.accept(SNAIL_SHELL_BRICK_STAIRS);
            output.accept(SNAIL_SHELL_BRICK_SLAB);
            output.accept(SNAIL_SHELL_BRICK_WALL);
            output.accept(CHISELED_SNAIL_SHELL_BRICKS);
            output.addAfter(Items.GRANITE, BLACK_GRANITE);
            output.addAfter(BLACK_GRANITE, BLACK_GRANITE_STAIRS);
            output.addAfter(BLACK_GRANITE_STAIRS, BLACK_GRANITE_SLAB);
            output.addAfter(BLACK_GRANITE_SLAB, BLACK_GRANITE_WALL);
            output.addAfter(BLACK_GRANITE_WALL, POLISHED_BLACK_GRANITE);
            output.addAfter(POLISHED_BLACK_GRANITE, POLISHED_BLACK_GRANITE_STAIRS);
            output.addAfter(POLISHED_BLACK_GRANITE_STAIRS, POLISHED_BLACK_GRANITE_SLAB);
            output.accept(FIZZYROCK);
            output.accept(FIZZYROCK_STAIRS);
            output.accept(FIZZYROCK_SLAB);
            output.accept(FIZZYROCK_WALL);
            output.accept(CHISELED_FIZZYROCK);
            output.accept(POLISHED_FIZZYROCK);
            output.accept(POLISHED_FIZZYROCK_STAIRS);
            output.accept(POLISHED_FIZZYROCK_SLAB);
            output.accept(FIZZYROCK_BRICKS);
            output.accept(FIZZYROCK_BRICK_STAIRS);
            output.accept(FIZZYROCK_BRICK_SLAB);
            output.accept(FIZZYROCK_BRICK_WALL);
            output.accept(CHISELED_FIZZYROCK_BRICKS);
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(output -> {
            output.addAfter(Items.ROOTED_DIRT, SOIL);
            output.addAfter(Items.DEEPSLATE_DIAMOND_ORE, CHARCOAL_ORE);
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
            output.addAfter(WIDOW, WHITE_ALLIUM);
            output.addAfter(Items.BEETROOT_SEEDS, MINT_SEEDS);
            output.addAfter(MINT_SEEDS, VANILLA_BEANS);
            output.accept(GOO_BLOCK);
            output.accept(FIZZYROCK_GEYSER);

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
            output.addAfter(Items.COOKIE, VANILLA_COOKIE);
            output.addAfter(VANILLA_COOKIE, MINT_CAKE);
            output.addAfter(MINT_CAKE, VANILLA_CAKE);
            output.addAfter(VANILLA_CAKE, MINT_ICE_CREAM);
            output.addAfter(MINT_ICE_CREAM, VANILLA_ICE_CREAM);
            output.addAfter(Items.CAKE, PEPPERMINT);
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.addAfter(Items.SLIME_BALL, GOO_BALL);
            output.addAfter(Items.NAUTILUS_SHELL, SNAIL_SHELL);
            output.addAfter(Items.GOLDEN_CARROT, MINT_LEAF);
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(output -> {
            output.addAfter(Items.SLIME_SPAWN_EGG, SNAIL_SPAWN_EGG);
            output.addAfter(Items.BLAZE_SPAWN_EGG, BUTTERFLY_SPAWN_EGG);
            output.addAfter(Items.HORSE_SPAWN_EGG, HORNET_SPAWN_EGG);
            output.addAfter(Items.MAGMA_CUBE_SPAWN_EGG, MOTH_SPAWN_EGG);
        });

    }
}
