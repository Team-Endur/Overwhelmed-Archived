package endurteam.overwhelmed.fabric.client.model.geom;

import endurteam.overwhelmed.client.model.entity.*;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;

import static endurteam.overwhelmed.client.model.geom.OverwhelmedModelLayers.*;

public class OverwhelmedFabricModelLayers {

    public static void registerModelLayers() {
        EntityModelLayerRegistry.registerModelLayer(BUTTERFLY_MODEL_LAYER, ButterflyModel::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(SNAIL_FLAT_MODEL_LAYER, SnailFlatModel::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(SNAIL_GARDEN_MODEL_LAYER, SnailGardenModel::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(SNAIL_GARY_MODEL_LAYER, SnailGaryModel::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(SNAIL_GLASS_MODEL_LAYER, SnailGlassModel::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(SNAIL_LIMESTONE_MODEL_LAYER, SnailLimestoneModel::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(SNAIL_LIVERWORT_MODEL_LAYER, SnailLiverwortModel::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(SNAIL_ROMAN_MODEL_LAYER, SnailRomanModel::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(MOTH_MODEL_LAYER, MothModel::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(HORNET_MODEL_LAYER, HornetModel::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(HORNET_LARVA_MODEL_LAYER, HornetModel::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(PAPER_BULLET_MODEL_LAYER, PaperBulletModel::createBodyLayer);
    }
}
