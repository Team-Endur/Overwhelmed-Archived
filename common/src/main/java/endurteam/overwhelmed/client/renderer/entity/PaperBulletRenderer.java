package endurteam.overwhelmed.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import endurteam.overwhelmed.Overwhelmed;
import endurteam.overwhelmed.world.entity.projectile.PaperBulletEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.DragonFireballRenderer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.projectile.DragonFireball;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3f;
import org.joml.Matrix4f;

@Environment(value= EnvType.CLIENT)
public class PaperBulletRenderer
        extends EntityRenderer<PaperBulletEntity> {
    private static final ResourceLocation TEXTURE_LOCATION = new ResourceLocation(
            Overwhelmed.MOD_ID, "textures/item/paper_bullet.png");
    private static final RenderType RENDER_TYPE = RenderType.entityCutoutNoCull(TEXTURE_LOCATION);

    public PaperBulletRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    protected int getBlockLightLevel(PaperBulletEntity paperBullet, BlockPos blockPos) {
        return 15;
    }

    @Override
    public void render(PaperBulletEntity paperBullet, float f, float g, PoseStack poseStack,
                       MultiBufferSource multiBufferSource, int i) {
        poseStack.pushPose();
        poseStack.scale(1.0f, 1.0f, 1.0f);
        poseStack.mulPose(this.entityRenderDispatcher.cameraOrientation());
        poseStack.mulPose(Axis.YP.rotationDegrees(180.0f));
        PoseStack.Pose pose = poseStack.last();
        Matrix4f matrix4f = pose.pose();
        Matrix3f matrix3f = pose.normal();
        VertexConsumer vertexConsumer = multiBufferSource.getBuffer(RENDER_TYPE);
        PaperBulletRenderer.vertex(vertexConsumer, matrix4f, matrix3f, i, 0.0f, 0, 0, 1);
        PaperBulletRenderer.vertex(vertexConsumer, matrix4f, matrix3f, i, 1.0f, 0, 1, 1);
        PaperBulletRenderer.vertex(vertexConsumer, matrix4f, matrix3f, i, 1.0f, 1, 1, 0);
        PaperBulletRenderer.vertex(vertexConsumer, matrix4f, matrix3f, i, 0.0f, 1, 0, 0);
        poseStack.popPose();
        super.render(paperBullet, f, g, poseStack, multiBufferSource, i);
    }

    private static void vertex(VertexConsumer vertexConsumer, Matrix4f matrix4f, Matrix3f matrix3f,
                               int i, float f, int j, int k, int l) {
        vertexConsumer.vertex(matrix4f, f - 0.5f, (float)j - 0.25f, 0.0f).color(255, 255, 255, 255)
                .uv(k, l).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(i).normal(matrix3f, 0.0f, 1.0f, 0.0f)
                .endVertex();
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(PaperBulletEntity paperBullet) {
        return TEXTURE_LOCATION;
    }
}
