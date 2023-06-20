package overwhelmed.overwhelmed.client;

import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import overwhelmed.overwhelmed.Overwhelmed;
import overwhelmed.overwhelmed.client.color.items.SnailSpawnEggItemColor;
import overwhelmed.overwhelmed.client.renderer.entity.SnailRenderer;

public class OverwhelmedClient {
    public static SnailSpawnEggItemColor snailSpawnEggItemColor;

    public static void initClient() {
        EntityRendererRegistry.register(Overwhelmed.gardenSnailEntityType, SnailRenderer::new);
        EntityRendererRegistry.register(Overwhelmed.garySnailEntityType, SnailRenderer::new);
        EntityRendererRegistry.register(Overwhelmed.limestoneSnailEntityType, SnailRenderer::new);
        EntityRendererRegistry.register(Overwhelmed.romanSnailEntityType, SnailRenderer::new);
        ColorHandlerRegistry.registerItemColors(snailSpawnEggItemColor = new SnailSpawnEggItemColor(),
                Overwhelmed.snailSpawnEggItem);
    }
}
