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
