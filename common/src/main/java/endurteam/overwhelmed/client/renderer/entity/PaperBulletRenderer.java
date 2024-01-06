/**
 *  Overwhelmed, a Minecraft overhauling and adding new features to the Overworld's surface!<br>
 *  Copyright (C) 2023-2024 Endurteam<br>
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

package endurteam.overwhelmed.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import endurteam.overwhelmed.Overwhelmed;
import endurteam.overwhelmed.client.model.entity.PaperBulletModel;
import endurteam.overwhelmed.client.model.geom.OverwhelmedModelLayers;
import endurteam.overwhelmed.world.entity.projectile.PaperBulletEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;

@Environment(value= EnvType.CLIENT)
public class PaperBulletRenderer
        extends EntityRenderer<PaperBulletEntity> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/paper_bullet.png");
    private final PaperBulletModel<PaperBulletEntity> model;
    private final float SCALE = 1.0f;

    public PaperBulletRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.model = new PaperBulletModel<>(context.bakeLayer(OverwhelmedModelLayers.PAPER_BULLET_MODEL_LAYER));
    }

    @Override
    public void render(PaperBulletEntity entity, float f, float g, PoseStack poseStack,
                       MultiBufferSource multiBufferSource, int i) {
        poseStack.pushPose();
        poseStack.mulPose(Axis.XP.rotationDegrees(Mth.lerp(g * 4.0f, 0.0f, 360.0f)));
        poseStack.translate(0.0f, -1.45f, 0.0f);
        VertexConsumer vertexConsumer = multiBufferSource.getBuffer(this.model.renderType(TEXTURE));
        this.model.renderToBuffer(poseStack, vertexConsumer, i, OverlayTexture.NO_OVERLAY, 1.0f, 1.0f, 1.0f,
                1.0f);
        poseStack.popPose();
        super.render(entity, f, g, poseStack, multiBufferSource, i);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(PaperBulletEntity var1) {
        return TEXTURE;
    }
}
