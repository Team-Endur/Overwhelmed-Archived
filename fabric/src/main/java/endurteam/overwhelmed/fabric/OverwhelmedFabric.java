package endurteam.overwhelmed.fabric;

import endurteam.overwhelmed.Overwhelmed;
import endurteam.overwhelmed.fabriclike.OverwhelmedFabricLike;
import net.fabricmc.api.ModInitializer;

public class OverwhelmedFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        OverwhelmedFabricLike.init();
        BiomeModifiers.snailSpawning();
        BiomeModifiers.butterflySpawning();
    }
}