package endurteam.overwhelmed.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import endurteam.overwhelmed.world.entity.projectile.ThrownPebbleEntity;
import endurteam.overwhelmed.world.level.block.OverwhelmedBlocks;
import endurteam.overwhelmed.world.level.block.PebbleBlock;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.inventory.InventoryMenu;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

@Environment(value=EnvType.CLIENT)
public class ThrownPebbleRenderer
        extends EntityRenderer<ThrownPebbleEntity> {
    private final BlockRenderDispatcher dispatcher;

    public ThrownPebbleRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.shadowRadius = 0.5f;
        this.dispatcher = context.getBlockRenderDispatcher();
    }

    @Override
    public void render(ThrownPebbleEntity thrownPebbleEntity, float f, float g, PoseStack poseStack,
                       MultiBufferSource multiBufferSource, int i) {
        BlockState blockState = OverwhelmedBlocks.pebble.get().defaultBlockState();
        if (blockState.getRenderShape() != RenderShape.MODEL) {
            return;
        }
        Level level = thrownPebbleEntity.level();
        if (blockState == level.getBlockState(thrownPebbleEntity.blockPosition())
                || blockState.getRenderShape() == RenderShape.INVISIBLE) {
            return;
        }
        poseStack.pushPose();
        BlockPos blockPos = BlockPos.containing(thrownPebbleEntity.getX(), thrownPebbleEntity.getBoundingBox().maxY,
                thrownPebbleEntity.getZ());
        poseStack.translate(-0.5, 0.0, -0.5);
        this.dispatcher.getModelRenderer().tesselateBlock(level, this.dispatcher.getBlockModel(blockState), blockState,
                blockPos, poseStack,
                multiBufferSource.getBuffer(ItemBlockRenderTypes.getMovingBlockRenderType(blockState)), false,
                RandomSource.create(), blockState.getSeed(thrownPebbleEntity.getStartPos()), OverlayTexture.NO_OVERLAY);
        poseStack.popPose();
        super.render(thrownPebbleEntity, f, g, poseStack, multiBufferSource, i);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(ThrownPebbleEntity fallingBlockEntity) {
        return InventoryMenu.BLOCK_ATLAS;
    }
}

