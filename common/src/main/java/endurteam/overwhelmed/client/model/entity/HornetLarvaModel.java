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
import endurteam.overwhelmed.client.animation.definitions.HornetLarvaAnimation;
import endurteam.overwhelmed.client.animation.definitions.SnailAnimation;
import endurteam.overwhelmed.world.entity.animal.Hornet;
import endurteam.overwhelmed.world.entity.animal.Snail;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.NotNull;


public class HornetLarvaModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart root;
	private final ModelPart left_wing;
	private final ModelPart right_wing;
	private final ModelPart stinger;
	private final ModelPart body;
	private final ModelPart head;

	public HornetLarvaModel(ModelPart root) {
		this.root = root;
		this.left_wing = root.getChild("left_wing");
		this.right_wing = root.getChild("right_wing");
		this.stinger = root.getChild("stinger");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition left_wing = partdefinition.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(-2, 0).mirror()
				.addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 20.0F, -2.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition right_wing = partdefinition.addOrReplaceChild("right_wing", CubeListBuilder.create().texOffs(-2, 0)
				.addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				, PartPose.offsetAndRotation(-1.0F, 20.0F, -2.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition stinger = partdefinition.addOrReplaceChild("stinger", CubeListBuilder.create().texOffs(0, 3)
				.addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.5F, 3.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(18, 0)
				.addBox(-2.0F, -1.5F, -2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 22.5F, -3.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
						  float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		if (entity.walkDist > 0) {
			this.animateWalk(HornetLarvaAnimation.HORNET_LARVA_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		} else if (entity.isAlive()) {
			this.animate(((Snail) entity).idleAnimationState, HornetLarvaAnimation.HORNET_LARVA_IDLE, ageInTicks, 1f);
		}
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
							   float red, float green, float blue, float alpha) {
		left_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		stinger.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public @NotNull ModelPart root() {
		return this.root;
	}
}