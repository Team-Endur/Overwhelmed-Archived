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
import endurteam.overwhelmed.world.entity.animal.Butterfly;
import endurteam.overwhelmed.world.entity.animal.Hornet;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.NotNull;


public class HornetModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart root;
	private final ModelPart head;
	private final ModelPart antenna;
	private final ModelPart legs1;
	private final ModelPart body;

	public HornetModel(ModelPart root) {
		this.root = root;
		this.head = root.getChild("head");
		this.antenna = root.getChild("antenna");
		this.legs1 = root.getChild("legs1");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create()
						.texOffs(0, 24).addBox(-4.0F, -4.0F, -9.0F, 8.0F, 8.0F, 9.0F,
								new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition antenna = partdefinition.addOrReplaceChild("antenna", CubeListBuilder.create()
						.texOffs(26, 33).addBox(0.0F, -3.0F, -8.0F, 8.0F, 4.0F, 8.0F,
								new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, -9.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition legs1 = partdefinition.addOrReplaceChild("legs1", CubeListBuilder.create()
						.texOffs(0, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 0.0F,
								new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, -5.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create()
						.texOffs(0, 0).addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 14.0F,
								new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.0F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition legs2 = body.addOrReplaceChild("legs2", CubeListBuilder.create().texOffs(0, 3)
				.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, 1.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition legs3 = body.addOrReplaceChild("legs3", CubeListBuilder.create().texOffs(0, 3)
				.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, 4.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition stinger = body.addOrReplaceChild("stinger", CubeListBuilder.create().texOffs(1, 40)
				.addBox(0.0F, 0.0F, -2.0F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.0F, 14.0F));

		PartDefinition left_wing = body.addOrReplaceChild("left_wing", CubeListBuilder.create()
						.texOffs(28, 0).addBox(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 8.0F,
								new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -5.0F, 0.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition right_wing = body.addOrReplaceChild("right_wing", CubeListBuilder.create()
						.texOffs(28, 0).mirror().addBox(-14.0F, 0.0F, 0.0F, 14.0F, 0.0F, 8.0F,
								new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, -5.0F, 0.0F, 0.6545F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
						  float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.animate(((Hornet) entity).flyAnimationState, HornetAnimation.HORNET_FLY, ageInTicks);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
							   float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		antenna.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legs1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public @NotNull ModelPart root() {
		return this.root;
	}
}