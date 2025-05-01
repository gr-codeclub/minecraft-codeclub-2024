package net.mcreator.dextermod.client.model;

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

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeldexchair<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("dextermod", "modeldexchair"), "main");
	public final ModelPart chair;

	public Modeldexchair(ModelPart root) {
		this.chair = root.getChild("chair");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition chair = partdefinition.addOrReplaceChild("chair",
				CubeListBuilder.create().texOffs(0, 13).addBox(-13.0F, -9.0F, 5.0F, 14.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-12.0F, 1.0F, 4.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 23)
						.addBox(-2.0F, 1.0F, 4.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 23).addBox(-12.0F, 1.0F, -6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 23)
						.addBox(-2.0F, 1.0F, -6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-13.0F, 0.0F, -6.0F, 14.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 15.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		chair.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
