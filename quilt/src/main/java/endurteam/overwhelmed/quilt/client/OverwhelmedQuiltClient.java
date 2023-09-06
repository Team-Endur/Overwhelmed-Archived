package endurteam.overwhelmed.quilt.client;

import endurteam.overwhelmed.client.OverwhelmedClient;
import endurteam.overwhelmed.client.particle.FurParticle;
import endurteam.overwhelmed.core.particles.OverwhelmedParticleTypes;
import endurteam.overwhelmed.world.level.block.OverwhelmedBlocks;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

public class OverwhelmedQuiltClient implements ClientModInitializer {
    @Override
    public void onInitializeClient(ModContainer mod) {
        OverwhelmedClient.initClient();
        BlockRenderLayerMap.put(RenderType.cutout(), OverwhelmedBlocks.widow.get());
        BlockRenderLayerMap.put(RenderType.translucent(), OverwhelmedBlocks.gooBlock.get());
        BlockRenderLayerMap.put(RenderType.cutout(), OverwhelmedBlocks.pebble.get());
        BlockRenderLayerMap.put(RenderType.cutout(), OverwhelmedBlocks.iceCube.get());
        BlockRenderLayerMap.put(RenderType.cutout(), OverwhelmedBlocks.goldBead.get());
        ParticleFactoryRegistry.getInstance().register((ParticleType<SimpleParticleType>) OverwhelmedParticleTypes
                .fur.get(), FurParticle.Provider::new);
    }
}
