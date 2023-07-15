package endurteam.overwhelmed.fabric;

import endurteam.overwhelmed.client.OverwhelmedClient;
import net.fabricmc.api.ClientModInitializer;

public class OverwhelmedFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        OverwhelmedClient.initClient();
    }
}
