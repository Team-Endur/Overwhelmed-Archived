package endurteam.overwhelmed.client.model.entity;

import endurteam.overwhelmed.Overwhelmed;
import endurteam.overwhelmed.world.entity.projectile.PaperBulletEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PaperBulletModel extends GeoModel<PaperBulletEntity> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/paper_bullet.png");
    private static final ResourceLocation MODEL =
            new ResourceLocation(Overwhelmed.MOD_ID, "geo/entity/paper_bullet.geo.json");
    private static final ResourceLocation ANIMATION =
            new ResourceLocation(Overwhelmed.MOD_ID, "animations/entity/paper_bullet.animation.json");

    @Override
    public ResourceLocation getModelResource(PaperBulletEntity animatable) {
        return MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(PaperBulletEntity animatable) {
        return TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(PaperBulletEntity animatable) {
        return ANIMATION;
    }
}
