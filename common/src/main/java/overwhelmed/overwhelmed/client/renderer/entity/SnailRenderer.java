package overwhelmed.overwhelmed.client.renderer.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import overwhelmed.overwhelmed.client.model.entity.SnailModel;
import overwhelmed.overwhelmed.world.entity.animal.SnailEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

@Environment(EnvType.CLIENT)
public class SnailRenderer
extends GeoEntityRenderer<SnailEntity> {
    public SnailRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SnailModel());
    }
}
