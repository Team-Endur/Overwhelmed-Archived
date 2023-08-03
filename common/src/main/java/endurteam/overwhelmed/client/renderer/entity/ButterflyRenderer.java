package endurteam.overwhelmed.client.renderer.entity;

import endurteam.overwhelmed.client.model.entity.ButterflyModel;
import endurteam.overwhelmed.world.entity.animal.ButterflyEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

@Environment(EnvType.CLIENT)
public class ButterflyRenderer
extends GeoEntityRenderer<ButterflyEntity> {
    public ButterflyRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ButterflyModel());
    }

    @Override
    public ResourceLocation getTextureLocation(ButterflyEntity var1) {
        return this.model.getTextureResource(var1);
    }
}
