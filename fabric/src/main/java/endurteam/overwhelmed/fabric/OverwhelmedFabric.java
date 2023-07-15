package endurteam.overwhelmed.fabric;

import endurteam.overwhelmed.Overwhelmed;
import net.fabricmc.api.ModInitializer;

public class OverwhelmedFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Overwhelmed.init();
        BiomeModifiers.snailSpawning();
        BiomeModifiers.butterflySpawning();
    }
}