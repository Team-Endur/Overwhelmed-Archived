/**
 *  Overwhelmed, a Minecraft overhauling and adding new features to the Overworld's surface!<br>
 *  Copyright (C) 2023  Endurteam<br>
 *  <br>
 *  This program is free software: you can redistribute it and/or modify<br>
 *  it under the terms of the GNU General Public License as published by<br>
 *  the Free Software Foundation, either version 3 of the License, or<br>
 *  any later version.<br>
 *  <br>
 *  This program is distributed in the hope that it will be useful,<br>
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of<br>
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the<br>
 *  GNU General Public License for more details.<br>
 *  <br>
 *  You should have received a copy of the GNU General Public License with<br>
 *  the Minecraft Linking Exception<br>
 *  along with this program.  If not, see <https://www.gnu.org/licenses/> and<br>
 *  <https://gist.github.com/triphora/588f353802a3b0ea649e4fc85f75e583/>
 */

package endurteam.overwhelmed.world.level.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CandleBlock;
import net.minecraft.world.level.block.CandleCakeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MintCakeBlock extends Block {
    public static final MapCodec<MintCakeBlock> CODEC = simpleCodec(MintCakeBlock::new);
    public static final int MAX_BITES = 6;
    public static final IntegerProperty BITES;
    public static final int FULL_CAKE_SIGNAL;
    protected static final float AABB_OFFSET = 1.0F;
    protected static final float AABB_SIZE_PER_BITE = 2.0F;
    protected static final VoxelShape[] SHAPE_BY_BITE;

    public MapCodec<MintCakeBlock> codec() {
        return CODEC;
    }

    public MintCakeBlock(Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(BITES, 0));
    }

    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return SHAPE_BY_BITE[(Integer)blockState.getValue(BITES)];
    }

    public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        Item item = itemStack.getItem();
        if (itemStack.is(ItemTags.CANDLES) && (Integer)blockState.getValue(BITES) == 0) {
            Block block = Block.byItem(item);
            if (block instanceof CandleBlock) {
                if (!player.isCreative()) {
                    itemStack.shrink(1);
                }

                level.playSound((Player)null, blockPos, SoundEvents.CAKE_ADD_CANDLE, SoundSource.BLOCKS, 1.0F, 1.0F);
                level.setBlockAndUpdate(blockPos, CandleCakeBlock.byCandle(block));
                level.gameEvent(player, GameEvent.BLOCK_CHANGE, blockPos);
                player.awardStat(Stats.ITEM_USED.get(item));
                return InteractionResult.SUCCESS;
            }
        }

        if (level.isClientSide) {
            if (eat(level, blockPos, blockState, player).consumesAction()) {
                return InteractionResult.SUCCESS;
            }

            if (itemStack.isEmpty()) {
                return InteractionResult.CONSUME;
            }
        }

        return eat(level, blockPos, blockState, player);
    }

    protected static InteractionResult eat(LevelAccessor levelAccessor, BlockPos blockPos, BlockState blockState, Player player) {
        if (!player.canEat(false)) {
            return InteractionResult.PASS;
        } else {
            player.awardStat(Stats.EAT_CAKE_SLICE);
            player.getFoodData().eat(2, 0.1F);
            int i = (Integer)blockState.getValue(BITES);
            levelAccessor.gameEvent(player, GameEvent.EAT, blockPos);
            if (i < 5) {
                levelAccessor.setBlock(blockPos, (BlockState)blockState.setValue(BITES, i + 1), 3);
            } else {
                levelAccessor.removeBlock(blockPos, false);
                levelAccessor.gameEvent(player, GameEvent.BLOCK_DESTROY, blockPos);
            }

            return InteractionResult.SUCCESS;
        }
    }

    public BlockState updateShape(BlockState blockState, Direction direction, BlockState blockState2, LevelAccessor levelAccessor, BlockPos blockPos, BlockPos blockPos2) {
        return direction == Direction.DOWN && !blockState.canSurvive(levelAccessor, blockPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(blockState, direction, blockState2, levelAccessor, blockPos, blockPos2);
    }

    public boolean canSurvive(BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
        return levelReader.getBlockState(blockPos.below()).isSolid();
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{BITES});
    }

    public int getAnalogOutputSignal(BlockState blockState, Level level, BlockPos blockPos) {
        return getOutputSignal((Integer)blockState.getValue(BITES));
    }

    public static int getOutputSignal(int i) {
        return (7 - i) * 2;
    }

    public boolean hasAnalogOutputSignal(BlockState blockState) {
        return true;
    }

    public boolean isPathfindable(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, PathComputationType pathComputationType) {
        return false;
    }

    static {
        BITES = BlockStateProperties.BITES;
        FULL_CAKE_SIGNAL = getOutputSignal(0);
        SHAPE_BY_BITE = new VoxelShape[]{
                Block.box(3.0, 0.0, 1.0, 15.0, 5.0, 15.0),
                Block.box(5.0, 0.0, 1.0, 15.0, 5.0, 15.0),
                Block.box(7.0, 0.0, 1.0, 15.0, 5.0, 15.0),
                Block.box(9.0, 0.0, 1.0, 15.0, 5.0, 15.0),
                Block.box(11.0, 0.0, 1.0, 15.0, 5.0, 15.0),
                Block.box(13.0, 0.0, 1.0, 15.0, 5.0, 15.0),
                Block.box(15.0, 0.0, 1.0, 15.0, 5.0, 15.0)
        };

    }
}