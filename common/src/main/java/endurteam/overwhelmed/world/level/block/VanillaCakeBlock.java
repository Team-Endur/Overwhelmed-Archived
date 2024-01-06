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
import endurteam.overwhelmed.world.level.block.state.properties.OverwhelmedBlockStateProperties;
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
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class VanillaCakeBlock extends Block {
    public static final MapCodec<VanillaCakeBlock> CODEC = simpleCodec(VanillaCakeBlock::new);
    public static final IntegerProperty BITES = OverwhelmedBlockStateProperties.VANILLA_CAKE_BITES;
    public static final int MAX_BITES = 5;
    protected static final VoxelShape[] SHAPE_BY_BITE = new VoxelShape[]{
            Block.box(2.0, 0.0, 2.0, 14.0, 12.0, 14.0),
            Block.box(4.4, 0.0, 2.0, 14.0, 12.0, 14.0),
            Block.box(6.8, 0.0, 2.0, 14.0, 12.0, 14.0),
            Block.box(9.2, 0.0, 2.0, 14.0, 12.0, 14.0),
            Block.box(11.6, 0.0, 2.0, 14.0, 12.0, 14.0)
    };

    public MapCodec<VanillaCakeBlock> codec() {
        return CODEC;
    }

    public VanillaCakeBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(BITES, 0));
    }

    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos,
                               CollisionContext collisionContext) {
        return SHAPE_BY_BITE[blockState.getValue(BITES)];
    }

    public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player,
                                 InteractionHand interactionHand, BlockHitResult blockHitResult) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        Item item = itemStack.getItem();
        if (itemStack.is(ItemTags.CANDLES) && blockState.getValue(BITES) == 0) {
            Block block = Block.byItem(item);
            if (block instanceof CandleBlock) {
                if (!player.isCreative()) {
                    itemStack.shrink(1);
                }

                level.playSound(null, blockPos, SoundEvents.CAKE_ADD_CANDLE, SoundSource.BLOCKS,
                        1.0F, 1.0F);
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

    protected static InteractionResult eat(LevelAccessor levelAccessor, BlockPos blockPos, BlockState blockState,
                                           Player player) {
        if (!player.canEat(false)) {
            return InteractionResult.PASS;
        } else {
            player.awardStat(Stats.EAT_CAKE_SLICE);
            player.getFoodData().eat(3, 0.1F);
            int i = blockState.getValue(BITES);
            levelAccessor.gameEvent(player, GameEvent.EAT, blockPos);
            if (i < MAX_BITES - 1) {
                levelAccessor.setBlock(blockPos, blockState.setValue(BITES, i + 1), 3);
            } else {
                levelAccessor.removeBlock(blockPos, false);
                levelAccessor.gameEvent(player, GameEvent.BLOCK_DESTROY, blockPos);
            }

            return InteractionResult.SUCCESS;
        }
    }

    public BlockState updateShape(BlockState blockState, Direction direction, BlockState blockState2,
                                  LevelAccessor levelAccessor, BlockPos blockPos, BlockPos blockPos2) {
        return direction == Direction.DOWN && !blockState.canSurvive(levelAccessor, blockPos)
                ? Blocks.AIR.defaultBlockState()
                : super.updateShape(blockState, direction, blockState2, levelAccessor, blockPos, blockPos2);
    }

    public boolean canSurvive(BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
        return levelReader.getBlockState(blockPos.below()).isSolid();
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(BITES);
    }

    public int getAnalogOutputSignal(BlockState blockState, Level level, BlockPos blockPos) {
        return getOutputSignal(blockState.getValue(BITES));
    }

    public static int getOutputSignal(int i) {
        return (MAX_BITES - i) * 2;
    }

    public boolean hasAnalogOutputSignal(BlockState blockState) {
        return true;
    }

    public boolean isPathfindable(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos,
                                  PathComputationType pathComputationType) {
        return false;
    }
}