package endurteam.overwhelmed.forge;

import dev.architectury.platform.forge.EventBuses;
import endurteam.overwhelmed.client.OverwhelmedClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import endurteam.overwhelmed.Overwhelmed;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Overwhelmed.MOD_ID)
public class OverwhelmedForge {
    public OverwhelmedForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Overwhelmed.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Overwhelmed.init();
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> OverwhelmedClient::initClient);
    }

}