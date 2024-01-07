package endurteam.overwhelmed.client.renderer.entity;

import endurteam.overwhelmed.Overwhelmed;
import endurteam.overwhelmed.client.model.entity.MothModel;
import endurteam.overwhelmed.client.model.geom.OverwhelmedModelLayers;
import endurteam.overwhelmed.world.entity.animal.Moth;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

@Environment(EnvType.CLIENT)
public class MothRenderer extends MobRenderer<Moth, MothModel<Moth>> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/moth.png");

    public MothRenderer(EntityRendererProvider.Context context) {
        super(context, new MothModel<>(context.bakeLayer(OverwhelmedModelLayers.MOTH_MODEL_LAYER)), 0.2f);
    }

    @Override
    public ResourceLocation getTextureLocation(Moth entity) {
        return TEXTURE;
    }
}
