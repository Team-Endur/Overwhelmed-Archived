package endurteam.overwhelmed.client;

import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import endurteam.overwhelmed.client.color.items.ButterflySpawnEggItemColor;
import endurteam.overwhelmed.client.color.items.SnailSpawnEggItemColor;
import endurteam.overwhelmed.client.renderer.entity.ButterflyRenderer;
import endurteam.overwhelmed.client.renderer.entity.SnailRenderer;
import endurteam.overwhelmed.world.entity.OverwhelmedEntityTypes;
import endurteam.overwhelmed.world.item.OverwhelmedItems;

public class OverwhelmedClient {
    public static SnailSpawnEggItemColor snailSpawnEggItemColor;
    public static ButterflySpawnEggItemColor butterflySpawnEggItemColor;

    public static void initClient() {
        EntityRendererRegistry.register(OverwhelmedEntityTypes.gardenSnailEntityType, SnailRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.garySnailEntityType, SnailRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.limestoneSnailEntityType, SnailRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.romanSnailEntityType, SnailRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.sleepyButterflyEntityType, ButterflyRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.cabbageButterflyEntityType, ButterflyRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.morphoButterflyEntityType, ButterflyRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.cherryButterflyEntityType, ButterflyRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.monarchButterflyEntityType, ButterflyRenderer::new);
        EntityRendererRegistry.register(OverwhelmedEntityTypes.iceButterflyEntityType, ButterflyRenderer::new);
        ColorHandlerRegistry.registerItemColors(snailSpawnEggItemColor = new SnailSpawnEggItemColor(),
                OverwhelmedItems.snailSpawnEggItem);
        ColorHandlerRegistry.registerItemColors(butterflySpawnEggItemColor = new ButterflySpawnEggItemColor(),
                OverwhelmedItems.butterflySpawnEggItem);
    }
}
