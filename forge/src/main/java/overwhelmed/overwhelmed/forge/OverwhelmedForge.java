package overwhelmed.overwhelmed.forge;

import dev.architectury.platform.forge.EventBuses;
import overwhelmed.overwhelmed.Overwhelmed;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Overwhelmed.MOD_ID)
public class OverwhelmedForge {
    public OverwhelmedForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Overwhelmed.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Overwhelmed.init();
    }
}