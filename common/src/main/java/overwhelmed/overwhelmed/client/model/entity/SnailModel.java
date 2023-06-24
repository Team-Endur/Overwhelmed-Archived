package overwhelmed.overwhelmed.client.model.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import overwhelmed.overwhelmed.Overwhelmed;
import overwhelmed.overwhelmed.registry.EntityRegistry;
import overwhelmed.overwhelmed.world.entity.animal.SnailEntity;
import software.bernie.geckolib.model.GeoModel;

public class SnailModel extends GeoModel<SnailEntity> {
    private static final ResourceLocation GARDEN_TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/snail_garden.png");
    private static final ResourceLocation GARY_TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/snail_gary.png");
    private static final ResourceLocation LIMESTONE_TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/snail_limestone.png");
    private static final ResourceLocation ROMAN_TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/snail_roman.png");
    private static final ResourceLocation GARDEN_MODEL =
            new ResourceLocation(Overwhelmed.MOD_ID, "geo/entity/snail_garden.geo.json");
    private static final ResourceLocation GARY_MODEL =
            new ResourceLocation(Overwhelmed.MOD_ID, "geo/entity/snail_gary.geo.json");
    private static final ResourceLocation LIMESTONE_MODEL =
            new ResourceLocation(Overwhelmed.MOD_ID, "geo/entity/snail_limestone.geo.json");
    private static final ResourceLocation ROMAN_MODEL =
            new ResourceLocation(Overwhelmed.MOD_ID, "geo/entity/snail_roman.geo.json");
    private static final ResourceLocation GARDEN_ANIMATION =
            new ResourceLocation(Overwhelmed.MOD_ID, "animations/entity/snail_garden.animation.json");
    private static final ResourceLocation GARY_ANIMATION =
            new ResourceLocation(Overwhelmed.MOD_ID, "animations/entity/snail_gary.animation.json");
    private static final ResourceLocation LIMESTONE_ANIMATION =
            new ResourceLocation(Overwhelmed.MOD_ID, "animations/entity/snail_limestone.animation.json");
    private static final ResourceLocation ROMAN_ANIMATION =
            new ResourceLocation(Overwhelmed.MOD_ID, "animations/entity/snail_roman.animation.json");

    public static ResourceLocation getVariantTexture(SnailEntity animatable) {
        EntityType<?> type = animatable.getType();
        if (EntityRegistry.gardenSnailEntityType.get().equals(type)) {
            return GARDEN_TEXTURE;
        } else if (EntityRegistry.garySnailEntityType.get().equals(type)) {
            return GARY_TEXTURE;
        } else if (EntityRegistry.limestoneSnailEntityType.get().equals(type)) {
            return LIMESTONE_TEXTURE;
        } else if (EntityRegistry.romanSnailEntityType.get().equals(type)) {
            return ROMAN_TEXTURE;
        }
        throw new IncompatibleClassChangeError();
    }

    public static ResourceLocation getVariantModel(SnailEntity animatable) {
        EntityType<?> type = animatable.getType();
        if (EntityRegistry.gardenSnailEntityType.get().equals(type)) {
            return GARDEN_MODEL;
        } else if (EntityRegistry.garySnailEntityType.get().equals(type)) {
            return GARY_MODEL;
        } else if (EntityRegistry.limestoneSnailEntityType.get().equals(type)) {
            return LIMESTONE_MODEL;
        } else if (EntityRegistry.romanSnailEntityType.get().equals(type)) {
            return ROMAN_MODEL;
        }
        throw new IncompatibleClassChangeError();
    }

    public static ResourceLocation getVariantAnimation(SnailEntity animatable) {
        EntityType<?> type = animatable.getType();
        if (EntityRegistry.gardenSnailEntityType.get().equals(type)) {
            return GARDEN_ANIMATION;
        } else if (EntityRegistry.garySnailEntityType.get().equals(type)) {
            return GARY_ANIMATION;
        } else if (EntityRegistry.limestoneSnailEntityType.get().equals(type)) {
            return LIMESTONE_ANIMATION;
        } else if (EntityRegistry.romanSnailEntityType.get().equals(type)) {
            return ROMAN_ANIMATION;
        }
        throw new IncompatibleClassChangeError();
    }

    @Override
    public ResourceLocation getModelResource(SnailEntity animatable) {
        return getVariantModel(animatable);
    }

    @Override
    public ResourceLocation getTextureResource(SnailEntity animatable) {
        return getVariantTexture(animatable);
    }

    @Override
    public ResourceLocation getAnimationResource(SnailEntity animatable) {
        return getVariantAnimation(animatable);
    }
}
