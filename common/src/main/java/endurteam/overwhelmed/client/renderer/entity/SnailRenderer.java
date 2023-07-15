package endurteam.overwhelmed.client.renderer.entity;

import endurteam.overwhelmed.client.model.entity.SnailModel;
import endurteam.overwhelmed.world.entity.animal.SnailEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

@Environment(EnvType.CLIENT)
public class SnailRenderer
extends GeoEntityRenderer<SnailEntity> {
    public SnailRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SnailModel());
    }
}
