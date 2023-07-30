package endurteam.overwhelmed.quilt;

import endurteam.overwhelmed.fabriclike.OverwhelmedFabricLike;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class OverwhelmedQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer container) {
        OverwhelmedFabricLike.init();
        BiomeModifiers.snailSpawning();
        BiomeModifiers.butterflySpawning();
    }
}
