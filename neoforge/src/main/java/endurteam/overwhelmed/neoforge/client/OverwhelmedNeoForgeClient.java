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

package endurteam.overwhelmed.neoforge.client;

import endurteam.overwhelmed.client.color.items.ButterflySpawnEggItemColor;
import endurteam.overwhelmed.client.color.items.SnailSpawnEggItemColor;
import endurteam.overwhelmed.client.particle.LiverwortSporeParticle;
import endurteam.overwhelmed.client.renderer.entity.*;
import endurteam.overwhelmed.core.particles.OverwhelmedParticleTypes;
import endurteam.overwhelmed.neoforge.client.model.geom.OverwhelmedNeoForgeModelLayers;
import endurteam.overwhelmed.world.entity.OverwhelmedEntityTypes;
import endurteam.overwhelmed.world.item.OverwhelmedItems;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;

import static endurteam.overwhelmed.client.OverwhelmedClient.butterflySpawnEggItemColor;
import static endurteam.overwhelmed.client.OverwhelmedClient.snailSpawnEggItemColor;

@OnlyIn(Dist.CLIENT)
public class OverwhelmedNeoForgeClient {
    public static void initClient(IEventBus modEventBus) {
        modEventBus.register(OverwhelmedNeoForgeClient.class);
    }

    @SubscribeEvent
    public static void registerParticleEvent(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(OverwhelmedParticleTypes.LIVERWORT_SPORE, LiverwortSporeParticle.Provider::new);
    }

    @SubscribeEvent
    public static void registerEntityRenderersEvent(EntityRenderersEvent.RegisterRenderers event)
    {
        event.registerEntityRenderer(OverwhelmedEntityTypes.SLEEPY_BUTTERFLY, ButterflyRenderer::new);
        event.registerEntityRenderer(OverwhelmedEntityTypes.CABBAGE_BUTTERFLY, ButterflyRenderer::new);
        event.registerEntityRenderer(OverwhelmedEntityTypes.MORPHO_BUTTERFLY, ButterflyRenderer::new);
        event.registerEntityRenderer(OverwhelmedEntityTypes.CHERRY_BUTTERFLY, ButterflyRenderer::new);
        event.registerEntityRenderer(OverwhelmedEntityTypes.MONARCH_BUTTERFLY, ButterflyRenderer::new);
        event.registerEntityRenderer(OverwhelmedEntityTypes.LIVERWORT_BUTTERFLY, ButterflyRenderer::new);
        event.registerEntityRenderer(OverwhelmedEntityTypes.PEBBLE, PebbleRenderer::new);
        event.registerEntityRenderer(OverwhelmedEntityTypes.PAPER_BULLET, PaperBulletRenderer::new);
        event.registerEntityRenderer(OverwhelmedEntityTypes.FLAT_SNAIL, FlatSnailRenderer::new);
        event.registerEntityRenderer(OverwhelmedEntityTypes.GARDEN_SNAIL, GardenSnailRenderer::new);
        event.registerEntityRenderer(OverwhelmedEntityTypes.GARY_SNAIL, GarySnailRenderer::new);
        event.registerEntityRenderer(OverwhelmedEntityTypes.GLASS_SNAIL, GlassSnailRenderer::new);
        event.registerEntityRenderer(OverwhelmedEntityTypes.LIMESTONE_SNAIL, LimestoneSnailRenderer::new);
        event.registerEntityRenderer(OverwhelmedEntityTypes.LIVERWORT_SNAIL, LiverwortSnailRenderer::new);
        event.registerEntityRenderer(OverwhelmedEntityTypes.ROMAN_SNAIL, RomanSnailRenderer::new);
    }

    @SubscribeEvent
    public static void registerColorHandlersEvent(RegisterColorHandlersEvent.Item event)
    {
        event.register(snailSpawnEggItemColor = new SnailSpawnEggItemColor(),
                OverwhelmedItems.SNAIL_SPAWN_EGG);
        event.register(butterflySpawnEggItemColor = new ButterflySpawnEggItemColor(),
                OverwhelmedItems.BUTTERFLY_SPAWN_EGG);
    }

    @SubscribeEvent
    public static void registerParticleProvidersEvent(RegisterParticleProvidersEvent event)
    {
        event.registerSpriteSet(OverwhelmedParticleTypes.LIVERWORT_SPORE,
                LiverwortSporeParticle.Provider::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event)
    {
        OverwhelmedNeoForgeModelLayers.registerModelLayers(event);
    }
}
