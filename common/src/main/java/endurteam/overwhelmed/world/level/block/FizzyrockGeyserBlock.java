package endurteam.overwhelmed.world.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class FizzyrockGeyserBlock extends Block {

    public FizzyrockGeyserBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    public void animateTick(BlockState blockState, Level level, BlockPos blockPos, RandomSource randomSource) {
        VoxelShape voxelShape = this.getShape(blockState, level, blockPos, CollisionContext.empty());
        Vec3 vec3 = voxelShape.bounds().getCenter();
        double d = (double)blockPos.getX() + vec3.x;
        double e = (double)blockPos.getZ() + vec3.z;

        for(int i = 0; i < 2; ++i) {
            if (randomSource.nextBoolean()) {
                double yOffset = 18.0 / 18.0;
                level.addParticle(ParticleTypes.BUBBLE_POP, d + randomSource.nextDouble() / 5.0, (double)blockPos.getY() + yOffset + (0.5 - randomSource.nextDouble()), e + randomSource.nextDouble() / 5.0, 0.0, 0.0, 0.0);
            }
        }
    }


    @Override
    public @NotNull VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return box(4.0f, 0.0f, 4.0f, 12.0f, 16.0f, 12.0f);
    }

}
