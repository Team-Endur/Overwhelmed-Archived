package overwhelmed.overwhelmed.client;

import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import overwhelmed.overwhelmed.Overwhelmed;
import overwhelmed.overwhelmed.client.color.items.SnailSpawnEggItemColor;
import overwhelmed.overwhelmed.client.renderer.entity.SnailRenderer;
import overwhelmed.overwhelmed.registry.EntityRegistry;
import overwhelmed.overwhelmed.registry.ItemRegistry;

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
