package endurteam.overwhelmed.minecraftforge.world.item;

import endurteam.overwhelmed.Overwhelmed;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.registries.RegisterEvent;

import static endurteam.overwhelmed.world.item.OverwhelmedCreativeTabs.OVERWHELMED;
import static endurteam.overwhelmed.world.item.OverwhelmedItems.*;

public class OverwhelmedMinecraftForgeCreativeTabs {
    public static void registerModCreativeTab(RegisterEvent.RegisterHelper<CreativeModeTab> helper) {
        helper.register(new ResourceLocation(Overwhelmed.MOD_ID, "overwhelmed_tab"), OVERWHELMED =
                CreativeModeTab.builder()
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
                            output.accept(BLACK_GRANITE);
                            output.accept(BLACK_GRANITE_STAIRS);
                            output.accept(BLACK_GRANITE_SLAB);
                            output.accept(BLACK_GRANITE_WALL);
                            output.accept(POLISHED_BLACK_GRANITE);
                            output.accept(POLISHED_BLACK_GRANITE_STAIRS);
                            output.accept(POLISHED_BLACK_GRANITE_SLAB);
                            output.accept(FLOFF);
                            output.accept(PAINE);
                            output.accept(PINK_LAVATERA);
                            output.accept(WHITE_LAVATERA);
                            output.accept(SQUIRL);
                            output.accept(RINGOT);
                            output.accept(SNOWDROP);
                            output.accept(BELL_SUNFLOWER);
                            output.accept(WIDOW);
                            output.accept(WHITE_ALLIUM);
                            output.accept(GOLD_BEAD);
                            output.accept(ICE_CUBE);
                            output.accept(PEBBLE);
                            output.accept(MINT_SEEDS);
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
                            output.accept(VANILLA_BEANS);
                            output.accept(BUTTERFLY_SPAWN_EGG);
                            output.accept(SNAIL_SPAWN_EGG);
                        }).build());
    }
    public static void registerCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
        {
            event.accept(SNAIL_SHELL_BRICKS);
            event.accept(SNAIL_SHELL_BRICK_STAIRS);
            event.accept(SNAIL_SHELL_BRICK_SLAB);
            event.accept(SNAIL_SHELL_BRICK_WALL);
            event.accept(CHISELED_SNAIL_SHELL_BRICKS);
            event.accept(BLACK_GRANITE);
            event.accept(BLACK_GRANITE_STAIRS);
            event.accept(BLACK_GRANITE_SLAB);
            event.accept(BLACK_GRANITE_WALL);
            event.accept(POLISHED_BLACK_GRANITE);
            event.accept(POLISHED_BLACK_GRANITE_STAIRS);
            event.accept(POLISHED_BLACK_GRANITE_SLAB);
        }
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS)
        {
            event.accept(GOLD_BEAD);
            event.accept(ICE_CUBE);
            event.accept(PEBBLE);
            event.accept(FLOFF);
            event.accept(PAINE);
            event.accept(PINK_LAVATERA);
            event.accept(WHITE_LAVATERA);
            event.accept(SQUIRL);
            event.accept(RINGOT);
            event.accept(SNOWDROP);
            event.accept(BELL_SUNFLOWER);
            event.accept(WIDOW);
            event.accept(WHITE_ALLIUM);
            event.accept(SOIL);
            event.accept(MINT_SEEDS);
            event.accept(GOO_BLOCK);
        }
        if (event.getTabKey() == CreativeModeTabs.COMBAT)
        {
            event.accept(BLOWGUN);
            event.accept(PEBBLE);
            event.accept(PAPER_BULLET);
        }
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS)
        {
            event.accept(SNAIL_STEW);
            event.accept(SNAIL);
            event.accept(COOKED_SNAIL);
            event.accept(VANILLA_COOKIE);
            event.accept(MINT_CAKE);
            event.accept(VANILLA_CAKE);
            event.accept(MINT_ICE_CREAM);
            event.accept(VANILLA_ICE_CREAM);
            event.accept(PEPPERMINT);
        }
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS)
        {
            event.accept(GOO_BALL);
            event.accept(SNAIL_SHELL);
            event.accept(MINT_LEAF);
            event.accept(VANILLA_BEANS);
        };
        if (event.getTabKey() == CreativeModeTabs.SPAWN_EGGS)
        {
            event.accept(SNAIL_SPAWN_EGG);
            event.accept(BUTTERFLY_SPAWN_EGG);
        };
    }
}
