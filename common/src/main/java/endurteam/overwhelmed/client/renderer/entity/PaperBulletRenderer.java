package endurteam.overwhelmed.client.renderer.entity;

import endurteam.overwhelmed.client.model.entity.PaperBulletModel;
import endurteam.overwhelmed.world.entity.projectile.PaperBulletEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

@Environment(value= EnvType.CLIENT)
public class PaperBulletRenderer
        extends GeoEntityRenderer<PaperBulletEntity> {
    public PaperBulletRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new PaperBulletModel());
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(PaperBulletEntity var1) {
        return this.model.getTextureResource(var1);
    }
}
