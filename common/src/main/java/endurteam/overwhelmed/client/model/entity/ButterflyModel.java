package endurteam.overwhelmed.client.model.entity;

import endurteam.overwhelmed.Overwhelmed;
import endurteam.overwhelmed.registry.EntityTypeRegistry;
import endurteam.overwhelmed.world.entity.animal.ButterflyEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import software.bernie.geckolib.model.GeoModel;

public class ButterflyModel extends GeoModel<ButterflyEntity> {
    private static final ResourceLocation SLEEPY_TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/butterfly/butterfly_sleepy.png");
    private static final ResourceLocation CABBAGE_TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/butterfly/butterfly_cabbage.png");
    private static final ResourceLocation MORPHO_TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/butterfly/butterfly_morpho.png");
    private static final ResourceLocation CHERRY_TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/butterfly/butterfly_cherry.png");
    private static final ResourceLocation MONARCH_TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/butterfly/butterfly_monarch.png");
    private static final ResourceLocation FUR_TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/butterfly/butterfly_fur.png");
    private static final ResourceLocation MODEL =
            new ResourceLocation(Overwhelmed.MOD_ID, "geo/entity/butterfly.geo.json");
    private static final ResourceLocation ANIMATION =
            new ResourceLocation(Overwhelmed.MOD_ID, "animations/entity/butterfly.animation.json");

    public static ResourceLocation getVariantTexture(ButterflyEntity animatable) {
        EntityType<?> type = animatable.getType();
        if (EntityTypeRegistry.sleepyButterflyEntityType.get().equals(type)) {
            return SLEEPY_TEXTURE;
        } else if (EntityTypeRegistry.cabbageButterflyEntityType.get().equals(type)) {
            return CABBAGE_TEXTURE;
        } else if (EntityTypeRegistry.morphoButterflyEntityType.get().equals(type)) {
            return MORPHO_TEXTURE;
        } else if (EntityTypeRegistry.cherryButterflyEntityType.get().equals(type)) {
            return CHERRY_TEXTURE;
        } else if (EntityTypeRegistry.monarchButterflyEntityType.get().equals(type)) {
            return MONARCH_TEXTURE;
        } else if (EntityTypeRegistry.furButterflyEntityType.get().equals(type)) {
            return FUR_TEXTURE;
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
