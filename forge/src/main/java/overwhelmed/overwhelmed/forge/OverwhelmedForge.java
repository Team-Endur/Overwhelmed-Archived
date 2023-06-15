package overwhelmed.overwhelmed.forge;

import com.mojang.serialization.Codec;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import overwhelmed.overwhelmed.Overwhelmed;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import overwhelmed.overwhelmed.world.item.SnailSpawnEggItem;

@Mod(Overwhelmed.MOD_ID)
public class OverwhelmedForge {
    public OverwhelmedForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Overwhelmed.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Overwhelmed.init();
    }

    @Mod.EventBusSubscriber(value = Dist.CLIENT, modid = Overwhelmed.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    private static class ColorRegisterHandler
    {
        @SubscribeEvent(priority = EventPriority.HIGHEST)
        public static void registerSpawnEggColors(RegisterColorHandlersEvent.Item event)
        {
            event.getItemColors().register((stack, layer) ->
                    Overwhelmed.snailSpawnEggItem.get().getColor(layer), Overwhelmed.snailSpawnEggItem.get());
        }
    }
}