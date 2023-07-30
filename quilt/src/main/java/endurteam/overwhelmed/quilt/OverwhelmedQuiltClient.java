package endurteam.overwhelmed.quilt;

import endurteam.overwhelmed.client.OverwhelmedClient;
import endurteam.overwhelmed.world.level.block.OverwhelmedBlocks;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

public class OverwhelmedQuiltClient implements ClientModInitializer {
    @Override
    public void onInitializeClient(ModContainer mod) {
        OverwhelmedClient.initClient();
        BlockRenderLayerMap.put(RenderType.cutout(), OverwhelmedBlocks.widow.get());
    }
}
