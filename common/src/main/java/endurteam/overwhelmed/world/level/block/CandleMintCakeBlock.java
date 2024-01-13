package endurteam.overwhelmed.world.level.block;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import endurteam.overwhelmed.tags.OverwhelmedBlockTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class CandleMintCakeBlock extends AbstractCandleBlock {
    public static final MapCodec<CandleMintCakeBlock> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(
                            BuiltInRegistries.BLOCK.byNameCodec().fieldOf("candle")
                                    .forGetter(candleMintCakeBlock -> candleMintCakeBlock.candleBlock),
                            propertiesCodec()
                    )
                    .apply(instance, CandleMintCakeBlock::new)
    );
    protected static final VoxelShape CAKE_SHAPE = Block.box(1.0, 0.0, 1.0, 15.0, 5.0, 15.0);
    private static final Map<Block, CandleMintCakeBlock> BY_CANDLE = Maps.newHashMap();
    private static final Iterable<Vec3> PARTICLE_OFFSETS = ImmutableList.of(new Vec3(0.5, 1.0, 0.5));
    private final Block candleBlock;

    protected CandleMintCakeBlock(Block block, Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(LIT, Boolean.FALSE));
        BY_CANDLE.put(block, this);
        this.candleBlock = block;
    }

    @Override
    protected @NotNull MapCodec<CandleMintCakeBlock> codec() {
        return CODEC;
    }

    @Override
    protected @NotNull Iterable<Vec3> getParticleOffsets(BlockState blockState) {
        return PARTICLE_OFFSETS;
    }

    @Override
    public @NotNull VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos,
                                        CollisionContext collisionContext) {
        return CAKE_SHAPE;
    }

    @Override
    public @NotNull InteractionResult use(
            BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand,
            BlockHitResult blockHitResult
    ) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        if (itemStack.is(Items.FLINT_AND_STEEL) || itemStack.is(Items.FIRE_CHARGE)) {
            return InteractionResult.PASS;
        } else if (candleHit(blockHitResult) &&
                player.getItemInHand(interactionHand).isEmpty() && blockState.getValue(LIT)) {
            extinguish(player, blockState, level, blockPos);
            return InteractionResult.sidedSuccess(level.isClientSide);
        } else {
            InteractionResult interactionResult =
                    MintCakeBlock.eat(level, blockPos, OverwhelmedBlocks.MINT_CAKE.defaultBlockState(), player);
            if (interactionResult.consumesAction()) {
                dropResources(blockState, level, blockPos);
            }

            return interactionResult;
        }
    }

    private static boolean candleHit(BlockHitResult blockHitResult) {
        return blockHitResult.getLocation().y - (double)blockHitResult.getBlockPos().getY() > 0.5;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }

    @Override
    public @NotNull ItemStack getCloneItemStack(LevelReader levelReader, BlockPos blockPos, BlockState blockState) {
        return new ItemStack(OverwhelmedBlocks.MINT_CAKE);
    }

    @Override
    public @NotNull BlockState updateShape(
            BlockState blockState, Direction direction, BlockState blockState2, LevelAccessor levelAccessor,
            BlockPos blockPos, BlockPos blockPos2
    ) {
        return direction == Direction.DOWN && !blockState.canSurvive(levelAccessor, blockPos)
                ? Blocks.AIR.defaultBlockState()
                : super.updateShape(blockState, direction, blockState2, levelAccessor, blockPos, blockPos2);
    }

    @Override
    public boolean canSurvive(BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
        return levelReader.getBlockState(blockPos.below()).isSolid();
    }

    @Override
    public int getAnalogOutputSignal(BlockState blockState, Level level, BlockPos blockPos) {
        return VanillaCakeBlock.getOutputSignal(0);
    }

    @Override
    public boolean hasAnalogOutputSignal(BlockState blockState) {
        return true;
    }

    @Override
    public boolean isPathfindable(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos,
                                  PathComputationType pathComputationType) {
        return false;
    }

    public static BlockState byCandle(Block block) {
        return BY_CANDLE.get(block).defaultBlockState();
    }

    public static boolean canLight(BlockState blockState) {
        return blockState.is(OverwhelmedBlockTags.CANDLE_MINT_CAKES,
                blockStateBase -> blockStateBase.hasProperty(LIT) && !blockState.getValue(LIT));
    }
}
