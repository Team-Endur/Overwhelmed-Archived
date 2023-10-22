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

package endurteam.overwhelmed.client;

import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import endurteam.overwhelmed.client.color.items.ButterflySpawnEggItemColor;
import endurteam.overwhelmed.client.color.items.SnailSpawnEggItemColor;
import endurteam.overwhelmed.client.model.geom.OverwhelmedModelLayers;
import endurteam.overwhelmed.client.renderer.entity.*;
import endurteam.overwhelmed.world.entity.OverwhelmedEntityTypes;
import endurteam.overwhelmed.world.item.OverwhelmedItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class OverwhelmedClient {
    public static SnailSpawnEggItemColor snailSpawnEggItemColor;
    public static ButterflySpawnEggItemColor butterflySpawnEggItemColor;

    public static void initClient() {
        EntityRendererRegistry.register(OverwhelmedEntityTypes.sleepyButterflyEntityType, ButterflyRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.cabbageButterflyEntityType, ButterflyRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.morphoButterflyEntityType, ButterflyRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.cherryButterflyEntityType, ButterflyRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.monarchButterflyEntityType, ButterflyRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.furButterflyEntityType, ButterflyRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.paperBulletEntityType, PaperBulletRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.gardenSnailEntityType, GardenSnailRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.garySnailEntityType, GarySnailRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.glassSnailEntityType, GlassSnailRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.limestoneSnailEntityType, LimestoneSnailRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.liverwortSnailEntityType, LiverwortSnailRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.romanSnailEntityType, RomanSnailRenderer::new);
        OverwhelmedModelLayers.registerModelLayers();
        ColorHandlerRegistry.registerItemColors(snailSpawnEggItemColor = new SnailSpawnEggItemColor(),
                OverwhelmedItems.snailSpawnEggItem);
        ColorHandlerRegistry.registerItemColors(butterflySpawnEggItemColor = new ButterflySpawnEggItemColor(),
                OverwhelmedItems.butterflySpawnEggItem);
    }
}
