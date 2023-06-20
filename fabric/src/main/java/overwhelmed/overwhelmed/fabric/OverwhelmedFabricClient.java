package overwhelmed.overwhelmed.fabric;

import net.fabricmc.api.ClientModInitializer;
import overwhelmed.overwhelmed.client.OverwhelmedClient;

public class OverwhelmedFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        OverwhelmedClient.initClient();
    }
}
