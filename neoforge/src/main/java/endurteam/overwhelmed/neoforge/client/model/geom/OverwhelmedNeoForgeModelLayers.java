package endurteam.overwhelmed.neoforge.client.model.geom;

import endurteam.overwhelmed.client.model.entity.*;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

import static endurteam.overwhelmed.client.model.geom.OverwhelmedModelLayers.*;

public class OverwhelmedNeoForgeModelLayers {

    public static void registerModelLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(BUTTERFLY_MODEL_LAYER, ButterflyModel::createBodyLayer);
        event.registerLayerDefinition(SNAIL_FLAT_MODEL_LAYER, SnailFlatModel::createBodyLayer);
        event.registerLayerDefinition(SNAIL_GARDEN_MODEL_LAYER, SnailGardenModel::createBodyLayer);
        event.registerLayerDefinition(SNAIL_GARY_MODEL_LAYER, SnailGaryModel::createBodyLayer);
        event.registerLayerDefinition(SNAIL_GLASS_MODEL_LAYER, SnailGlassModel::createBodyLayer);
        event.registerLayerDefinition(SNAIL_LIMESTONE_MODEL_LAYER, SnailLimestoneModel::createBodyLayer);
        event.registerLayerDefinition(SNAIL_LIVERWORT_MODEL_LAYER, SnailLiverwortModel::createBodyLayer);
        event.registerLayerDefinition(SNAIL_ROMAN_MODEL_LAYER, SnailRomanModel::createBodyLayer);
        event.registerLayerDefinition(PAPER_BULLET_MODEL_LAYER, PaperBulletModel::createBodyLayer);
    }
}
