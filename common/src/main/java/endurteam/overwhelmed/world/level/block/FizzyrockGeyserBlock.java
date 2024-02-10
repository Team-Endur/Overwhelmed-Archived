package endurteam.overwhelmed.world.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class FizzyrockGeyserBlock extends Block {

    public FizzyrockGeyserBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    public void tick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        super.animateTick(state, level, pos, random);

        if (level.isEmptyBlock(pos.above())) {
            double posX = pos.getX() + 0.5;
            double posY = pos.getY() + 1.0;
            double posZ = pos.getZ() + 0.5;

            double offsetX = random.nextGaussian() * 0.02;
            double offsetY = random.nextGaussian() * 0.02;
            double offsetZ = random.nextGaussian() * 0.02;

            level.addParticle(ParticleTypes.BUBBLE_COLUMN_UP, posX + offsetX, posY + offsetY, posZ + offsetZ, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public @NotNull VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return box(4.0f, 0.0f, 4.0f, 4.0f, 0.0f, 4.0f);
    }

}
