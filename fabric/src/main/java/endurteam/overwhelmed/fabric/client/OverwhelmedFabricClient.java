/**
 *  Overwhelmed, a Minecraft overhauling and adding new features to the Overworld's surface!<br>
 *  Copyright (C) 2023  Endurteam<br>
 *  <br>
 *  This program is free software: you can redistribute it and/or modify<br>
 *  it under the terms of the GNU General Public License as published by<br>
 *  the Free Software Foundation, either version 3 of the License, or<br>
 *  any later version.<br>
 *  <br>
 *  This program is distributed in the hope that it will be useful,<br>
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of<br>
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the<br>
 *  GNU General Public License for more details.<br>
 *  <br>
 *  You should have received a copy of the GNU General Public License with<br>
 *  the Minecraft Linking Exception<br>
 *  along with this program.  If not, see <https://www.gnu.org/licenses/> and<br>
 *  <https://gist.github.com/triphora/588f353802a3b0ea649e4fc85f75e583/>
 */

package endurteam.overwhelmed.fabric.client;

import endurteam.overwhelmed.client.OverwhelmedClient;
import endurteam.overwhelmed.client.color.items.ButterflySpawnEggItemColor;
import endurteam.overwhelmed.client.color.items.SnailSpawnEggItemColor;
import endurteam.overwhelmed.client.particle.LiverwortSporeParticle;
import endurteam.overwhelmed.client.renderer.entity.*;
import endurteam.overwhelmed.core.particles.OverwhelmedParticleTypes;
import endurteam.overwhelmed.fabric.client.model.geom.OverwhelmedFabricModelLayers;
import endurteam.overwhelmed.world.entity.OverwhelmedEntityTypes;
import endurteam.overwhelmed.world.item.OverwhelmedItems;
import endurteam.overwhelmed.world.level.block.OverwhelmedBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.renderer.RenderType;

import static endurteam.overwhelmed.client.OverwhelmedClient.*;

@Environment(EnvType.CLIENT)
public class OverwhelmedFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(OverwhelmedEntityTypes.sleepyButterflyEntityType, ButterflyRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.cabbageButterflyEntityType, ButterflyRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.morphoButterflyEntityType, ButterflyRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.cherryButterflyEntityType, ButterflyRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.monarchButterflyEntityType, ButterflyRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.liverwortButterflyEntityType, ButterflyRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.pebbleEntityType, PebbleRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.paperBulletEntityType, PaperBulletRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.gardenSnailEntityType, GardenSnailRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.garySnailEntityType, GarySnailRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.glassSnailEntityType, GlassSnailRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.limestoneSnailEntityType, LimestoneSnailRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.liverwortSnailEntityType, LiverwortSnailRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.romanSnailEntityType, RomanSnailRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.flatSnailEntityType, FlatSnailRenderer::new);
        OverwhelmedFabricModelLayers.registerModelLayers();
        ColorProviderRegistry.ITEM.register(snailSpawnEggItemColor = new SnailSpawnEggItemColor(),
                OverwhelmedItems.snailSpawnEggItem);
        ColorProviderRegistry.ITEM.register(butterflySpawnEggItemColor = new ButterflySpawnEggItemColor(),
                OverwhelmedItems.butterflySpawnEggItem);
        BlockRenderLayerMap.INSTANCE.putBlock(OverwhelmedBlocks.floffBlock, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OverwhelmedBlocks.paineBlock, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OverwhelmedBlocks.strowBlock, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OverwhelmedBlocks.squirlBlock, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OverwhelmedBlocks.ringotBlock, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OverwhelmedBlocks.wilttBlock, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OverwhelmedBlocks.dumbbellBlock, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OverwhelmedBlocks.ralpBlock, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OverwhelmedBlocks.widowBlock, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OverwhelmedBlocks.gooBlock, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(OverwhelmedBlocks.pebbleBlock, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OverwhelmedBlocks.iceCubeBlock, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OverwhelmedBlocks.goldBeadBlock, RenderType.cutout());
        ParticleFactoryRegistry.getInstance().register(
                OverwhelmedParticleTypes.liverwortSpore,
                LiverwortSporeParticle.Provider::new);
    }
}
