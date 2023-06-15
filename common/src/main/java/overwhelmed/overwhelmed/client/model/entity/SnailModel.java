package overwhelmed.overwhelmed.client.model.entity;

import net.minecraft.resources.ResourceLocation;
import overwhelmed.overwhelmed.Overwhelmed;
import overwhelmed.overwhelmed.world.entity.animal.SnailEntity;
import software.bernie.geckolib.model.GeoModel;

public class SnailModel extends GeoModel<SnailEntity> {
    private static final ResourceLocation GARDEN_TEXTURE = new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/snail_garden.png");
    private static final ResourceLocation GARY_TEXTURE = new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/snail_gary.png");
    private static final ResourceLocation LIMESTONE_TEXTURE = new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/snail_limestone.png");
    private static final ResourceLocation ROMAN_TEXTURE = new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/snail_roman.png");
    private static final ResourceLocation GARDEN_MODEL = new ResourceLocation(Overwhelmed.MOD_ID, "geo/entity/snail_garden.geo.json");
    private static final ResourceLocation GARY_MODEL = new ResourceLocation(Overwhelmed.MOD_ID, "geo/entity/snail_gary.geo.json");
    private static final ResourceLocation LIMESTONE_MODEL = new ResourceLocation(Overwhelmed.MOD_ID, "geo/entity/snail_limestone.geo.json");
    private static final ResourceLocation ROMAN_MODEL = new ResourceLocation(Overwhelmed.MOD_ID, "geo/entity/snail_roman.geo.json");
    private static final ResourceLocation ANIMATION = new ResourceLocation(Overwhelmed.MOD_ID, "animations/entity/snail.animation.json");

    public static ResourceLocation getVariantTexture(SnailEntity.Variant variant) {
        return switch (variant) {
            default -> throw new IncompatibleClassChangeError();
            case GARDEN -> GARDEN_TEXTURE;
            case GARY -> GARY_TEXTURE;
            case LIMESTONE -> LIMESTONE_TEXTURE;
            case ROMAN -> ROMAN_TEXTURE;
        };
    }

    public static ResourceLocation getVariantModel(SnailEntity.Variant variant) {
        return switch (variant) {
            default -> throw new IncompatibleClassChangeError();
            case GARDEN -> GARDEN_MODEL;
            case GARY -> GARY_MODEL;
            case LIMESTONE -> LIMESTONE_MODEL;
            case ROMAN -> ROMAN_MODEL;
        };
    }

    @Override
    public ResourceLocation getModelResource(SnailEntity animatable) {
        return getVariantModel(animatable.getVariant());
    }

    @Override
    public ResourceLocation getTextureResource(SnailEntity animatable) {
        return getVariantTexture(animatable.getVariant());
    }

    @Override
    public ResourceLocation getAnimationResource(SnailEntity animatable) {
        return ANIMATION;
    }
}
