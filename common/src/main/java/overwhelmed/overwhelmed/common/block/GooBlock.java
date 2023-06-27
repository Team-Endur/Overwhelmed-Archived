package overwhelmed.overwhelmed.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class GooBlock extends Block {
    private final Float slowFactor;

    public GooBlock(Properties properties, float slowFactor) {
        super(properties);
        this.slowFactor = slowFactor;
    }


    @Override
    public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
        double d = Math.abs(entity.getDeltaMovement().y);
        if (d < 0.1 && !entity.isSteppingCarefully()) {
            double e = 0.4 + d * 0.2;
            entity.setDeltaMovement(entity.getDeltaMovement().multiply(e, 1.0, e));
        }
        super.stepOn(level, blockPos, blockState, entity);
    }
}
