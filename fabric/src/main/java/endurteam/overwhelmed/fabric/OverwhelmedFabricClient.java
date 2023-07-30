package endurteam.overwhelmed.fabric;

import endurteam.overwhelmed.client.OverwhelmedClient;
import endurteam.overwhelmed.world.level.block.OverwhelmedBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

@Environment(EnvType.CLIENT)
public class OverwhelmedFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        OverwhelmedClient.initClient();
        BlockRenderLayerMap.INSTANCE.putBlock(OverwhelmedBlocks.widow.get(), RenderType.cutout());
    }
}
