package endurteam.overwhelmed.client;

import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import endurteam.overwhelmed.client.color.items.SnailSpawnEggItemColor;
import endurteam.overwhelmed.client.renderer.entity.SnailRenderer;
import endurteam.overwhelmed.registry.EntityRegistry;
import endurteam.overwhelmed.registry.ItemRegistry;

public class OverwhelmedClient {
    public static SnailSpawnEggItemColor snailSpawnEggItemColor;

    public static void initClient() {
        EntityRendererRegistry.register(EntityRegistry.gardenSnailEntityType, SnailRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.garySnailEntityType, SnailRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.limestoneSnailEntityType, SnailRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.romanSnailEntityType, SnailRenderer::new);
        ColorHandlerRegistry.registerItemColors(snailSpawnEggItemColor = new SnailSpawnEggItemColor(),
                ItemRegistry.snailSpawnEggItem);
    }
}
