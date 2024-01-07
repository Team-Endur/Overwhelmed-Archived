package endurteam.overwhelmed.world.entity.animal;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.level.Level;

public class Moth extends PathfinderMob {
    public Moth(EntityType<? extends PathfinderMob> entityType, Level level) {
        super(entityType, level);
    }
}
