package net.mcreator.yousefmod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelyoyochair<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("yousefmod", "modelyoyochair"), "main");
	public final ModelPart yoyochair;

	public Modelyoyochair(ModelPart root) {
		this.yoyochair = root.getChild("yoyochair");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition yoyochair = partdefinition.addOrReplaceChild("yoyochair",
				CubeListBuilder.create().texOffs(24, 27).addBox(-8.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 27).addBox(4.0F, -9.0F, -9.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 27)
						.addBox(-8.0F, -9.0F, -9.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-8.0F, -11.0F, -9.0F, 14.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(3, 15)
						.addBox(-3.0F, -18.0F, -0.5F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 27).addBox(4.0F, -10.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		yoyochair.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
