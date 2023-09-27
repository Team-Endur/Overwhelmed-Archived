package endurteam.overwhelmed.client.model.entity;

import endurteam.overwhelmed.Overwhelmed;
import endurteam.overwhelmed.world.entity.projectile.PaperBulletEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;
import software.bernie.geckolib.model.GeoModel;

public class PaperBulletModel extends DefaultedEntityGeoModel<PaperBulletEntity> {
    public PaperBulletModel() {
        super(new ResourceLocation(Overwhelmed.MOD_ID, "paper_bullet"));
    }
}
