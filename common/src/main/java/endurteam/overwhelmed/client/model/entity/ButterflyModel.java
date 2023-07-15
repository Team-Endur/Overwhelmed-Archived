package endurteam.overwhelmed.client.model.entity;

import endurteam.overwhelmed.Overwhelmed;
import endurteam.overwhelmed.registry.EntityRegistry;
import endurteam.overwhelmed.world.entity.animal.ButterflyEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import software.bernie.geckolib.model.GeoModel;

public class ButterflyModel extends GeoModel<ButterflyEntity> {
    private static final ResourceLocation SLEEPY_TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/butterfly_sleepy.png");
    private static final ResourceLocation CABBAGE_TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/butterfly_cabbage.png");
    private static final ResourceLocation MORPHO_TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/butterfly_morpho.png");
    private static final ResourceLocation CHERRY_TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/butterfly_cherry.png");
    private static final ResourceLocation MODEL =
            new ResourceLocation(Overwhelmed.MOD_ID, "geo/entity/butterfly.geo.json");
    private static final ResourceLocation ANIMATION =
            new ResourceLocation(Overwhelmed.MOD_ID, "animations/entity/butterfly.animation.json");

    public static ResourceLocation getVariantTexture(ButterflyEntity animatable) {
        EntityType<?> type = animatable.getType();
        if (EntityRegistry.sleepyButterflyEntityType.get().equals(type)) {
            return SLEEPY_TEXTURE;
        } else if (EntityRegistry.cabbageButterflyEntityType.get().equals(type)) {
            return CABBAGE_TEXTURE;
        } else if (EntityRegistry.morphoButterflyEntityType.get().equals(type)) {
            return MORPHO_TEXTURE;
        } else if (EntityRegistry.cherryButterflyEntityType.get().equals(type)) {
            return CHERRY_TEXTURE;
        }
        throw new IncompatibleClassChangeError();
    }

    @Override
    public ResourceLocation getModelResource(ButterflyEntity animatable) {
        return MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(ButterflyEntity animatable) {
        return getVariantTexture(animatable);
    }

    @Override
    public ResourceLocation getAnimationResource(ButterflyEntity animatable) {
        return ANIMATION;
    }
}
