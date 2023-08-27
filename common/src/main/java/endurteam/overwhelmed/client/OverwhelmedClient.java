package endurteam.overwhelmed.client;

import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import endurteam.overwhelmed.client.color.items.ButterflySpawnEggItemColor;
import endurteam.overwhelmed.client.color.items.SnailSpawnEggItemColor;
import endurteam.overwhelmed.client.renderer.entity.ButterflyRenderer;
import endurteam.overwhelmed.client.renderer.entity.SnailRenderer;
import endurteam.overwhelmed.registry.EntityTypeRegistry;
import endurteam.overwhelmed.registry.ItemRegistry;

public class OverwhelmedClient {
    public static SnailSpawnEggItemColor snailSpawnEggItemColor;
    public static ButterflySpawnEggItemColor butterflySpawnEggItemColor;

    public static void initClient() {
        EntityRendererRegistry.register(EntityTypeRegistry.gardenSnailEntityType, SnailRenderer::new);
        EntityRendererRegistry.register(EntityTypeRegistry.garySnailEntityType, SnailRenderer::new);
        EntityRendererRegistry.register(EntityTypeRegistry.limestoneSnailEntityType, SnailRenderer::new);
        EntityRendererRegistry.register(EntityTypeRegistry.romanSnailEntityType, SnailRenderer::new);
        EntityRendererRegistry.register(EntityTypeRegistry.glassSnailEntityType, SnailRenderer::new);
        EntityRendererRegistry.register(EntityTypeRegistry.sleepyButterflyEntityType, ButterflyRenderer::new);
        EntityRendererRegistry.register(EntityTypeRegistry.cabbageButterflyEntityType, ButterflyRenderer::new);
        EntityRendererRegistry.register(EntityTypeRegistry.morphoButterflyEntityType, ButterflyRenderer::new);
        EntityRendererRegistry.register(EntityTypeRegistry.cherryButterflyEntityType, ButterflyRenderer::new);
        EntityRendererRegistry.register(EntityTypeRegistry.monarchButterflyEntityType, ButterflyRenderer::new);
        EntityRendererRegistry.register(EntityTypeRegistry.furButterflyEntityType, ButterflyRenderer::new);
        ColorHandlerRegistry.registerItemColors(snailSpawnEggItemColor = new SnailSpawnEggItemColor(),
                ItemRegistry.snailSpawnEggItem);
        ColorHandlerRegistry.registerItemColors(butterflySpawnEggItemColor = new ButterflySpawnEggItemColor(),
                ItemRegistry.butterflySpawnEggItem);
    }
}
