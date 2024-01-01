package endurteam.overwhelmed.neoforge.world.item;

import endurteam.overwhelmed.Overwhelmed;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.RegisterEvent;

import static endurteam.overwhelmed.world.item.OverwhelmedCreativeTabs.OVERWHELMED;
import static endurteam.overwhelmed.world.item.OverwhelmedItems.*;

public class OverwhelmedNeoForgeCreativeTabs {
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
                            output.accept(VANILLA_COOKIE);
                            output.accept(VANILLA_CAKE);
                            output.accept(VANILLA_ICE_CREAM);
                            output.accept(GOO_BALL);
                            output.accept(SNAIL_SHELL);
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
        }
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS)
        {
            event.accept(FLOFF);
            event.accept(PAINE);
            event.accept(PINK_LAVATERA);
            event.accept(WHITE_LAVATERA);
            event.accept(SQUIRL);
            event.accept(RINGOT);
            event.accept(SNOWDROP);
            event.accept(BELL_SUNFLOWER);
            event.accept(WIDOW);
            event.accept(SOIL);
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
            event.accept(VANILLA_CAKE);
            event.accept(VANILLA_ICE_CREAM);
        }
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS)
        {
            event.accept(GOLD_BEAD);
            event.accept(ICE_CUBE);
            event.accept(PEBBLE);
            event.accept(GOO_BALL);
            event.accept(SNAIL_SHELL);
        };
        if (event.getTabKey() == CreativeModeTabs.SPAWN_EGGS)
        {
            event.accept(SNAIL_SPAWN_EGG);
            event.accept(BUTTERFLY_SPAWN_EGG);
        };
    }
}
