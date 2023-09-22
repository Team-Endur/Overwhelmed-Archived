package endurteam.overwhelmed.fabric.client;

import endurteam.overwhelmed.client.OverwhelmedClient;
import endurteam.overwhelmed.client.particle.FurParticle;
import endurteam.overwhelmed.core.particles.OverwhelmedParticleTypes;
import endurteam.overwhelmed.world.level.block.OverwhelmedBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;

@Environment(EnvType.CLIENT)
public class OverwhelmedFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        OverwhelmedClient.initClient();
        BlockRenderLayerMap.INSTANCE.putBlock(OverwhelmedBlocks.widowBlock.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OverwhelmedBlocks.gooBlock.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(OverwhelmedBlocks.pebbleBlock.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OverwhelmedBlocks.iceCubeBlock.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OverwhelmedBlocks.goldBeadBlock.get(), RenderType.cutout());
        ParticleFactoryRegistry.getInstance().register((ParticleType<SimpleParticleType>) OverwhelmedParticleTypes
                .fur.get(), FurParticle.Provider::new);
    }
}
