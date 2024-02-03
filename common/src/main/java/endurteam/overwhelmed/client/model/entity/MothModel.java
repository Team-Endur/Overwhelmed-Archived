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

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
package endurteam.overwhelmed.client.model.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import endurteam.overwhelmed.client.animation.definitions.HornetAnimation;
import endurteam.overwhelmed.client.animation.definitions.MothAnimation;
import endurteam.overwhelmed.world.entity.animal.Hornet;
import endurteam.overwhelmed.world.entity.animal.Moth;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.NotNull;

public class MothModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart root;
	private final ModelPart body;
	private final ModelPart right_wing;
	private final ModelPart left_wing;
	private final ModelPart right_leg1;
	private final ModelPart right_leg2;
	private final ModelPart right_leg3;
	private final ModelPart left_leg1;
	private final ModelPart left_leg2;
	private final ModelPart left_leg3;

	public MothModel(ModelPart root) {
		this.root = root;
		this.body = root.getChild("body");
		this.right_wing = root.getChild("right_wing");
		this.left_wing = root.getChild("left_wing");
		this.right_leg1 = root.getChild("right_leg1");
		this.right_leg2 = root.getChild("right_leg2");
		this.right_leg3 = root.getChild("right_leg3");
		this.left_leg1 = root.getChild("left_leg1");
		this.left_leg2 = root.getChild("left_leg2");
		this.left_leg3 = root.getChild("left_leg3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create()
				.texOffs(18, 17).addBox(-1.5F, -1.5F, -4.5F, 3.0F, 3.0F, 9.0F,
						new CubeDeformation(0.0F))
				.texOffs(0, 2).addBox(1.5F, -1.5F, -9.5F, 0.0F, 2.0F, 5.0F,
						new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.5F, -1.5F, -9.5F, 0.0F, 2.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, 0.0F, -0.589F, 0.0F, 0.0F));

		PartDefinition right_wing = partdefinition.addOrReplaceChild("right_wing", CubeListBuilder.create()
				.texOffs(0, 13).addBox(-7.0F, 0.0F, -6.5F, 7.0F, 0.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 15.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition left_wing = partdefinition.addOrReplaceChild("left_wing", CubeListBuilder.create()
				.texOffs(0, 0).addBox(0.0F, 0.0F, -6.5F, 7.0F, 0.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 15.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition right_leg1 = partdefinition.addOrReplaceChild("right_leg1", CubeListBuilder.create()
				.texOffs(4, 2).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 16.0F, -2.5F));

		PartDefinition right_leg2 = partdefinition.addOrReplaceChild("right_leg2", CubeListBuilder.create()
				.texOffs(2, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 17.0F, -1.0F));

		PartDefinition right_leg3 = partdefinition.addOrReplaceChild("right_leg3", CubeListBuilder.create()
				.texOffs(0, 2).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 18.0F, 0.5F));

		PartDefinition left_leg1 = partdefinition.addOrReplaceChild("left_leg1", CubeListBuilder.create()
				.texOffs(4, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 16.0F, -2.5F));

		PartDefinition left_leg2 = partdefinition.addOrReplaceChild("left_leg2", CubeListBuilder.create()
				.texOffs(2, 2).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 17.0F, -1.0F));

		PartDefinition left_leg3 = partdefinition.addOrReplaceChild("left_leg3", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 18.0F, 0.5F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
						  float headPitch)
	{
		this.animate(((Moth) entity).flyAnimationState, MothAnimation.MOTH_FLY, ageInTicks);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
							   float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public @NotNull ModelPart root() {
		return this.root;
	}
}