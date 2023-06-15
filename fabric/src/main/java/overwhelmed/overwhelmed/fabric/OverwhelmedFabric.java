package overwhelmed.overwhelmed.fabric;

import overwhelmed.overwhelmed.Overwhelmed;
import net.fabricmc.api.ModInitializer;

public class OverwhelmedFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Overwhelmed.init();
    }
}