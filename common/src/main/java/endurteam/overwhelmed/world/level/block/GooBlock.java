package endurteam.overwhelmed.world.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.HalfTransparentBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class GooBlock extends HalfTransparentBlock {
    public GooBlock() {
        super(BlockBehaviour.Properties.of()
                .sound(SoundType.HONEY_BLOCK)
                .jumpFactor(0.5f);
                properties.speedFactor(0.4f);
                properties.noOcclusion())
    }
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return box(0, 0, 0, 16, 14, 16);
    }
}