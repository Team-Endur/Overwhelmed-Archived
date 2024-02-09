package endurteam.overwhelmed.world.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public interface FizzyrockGeyserBlockTick {
    void tick(BlockState state, Level level, BlockPos pos, RandomSource random);
}
