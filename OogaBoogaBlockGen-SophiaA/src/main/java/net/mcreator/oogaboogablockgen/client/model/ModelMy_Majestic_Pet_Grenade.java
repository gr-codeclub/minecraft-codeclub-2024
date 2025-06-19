package net.mcreator.oogaboogablockgen.client.model;

import org.objectweb.asm.Handle;

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

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelMy_Majestic_Pet_Grenade<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("oogaboogablockgen", "model_my_majestic_pet_grenade"), "main");
	public final ModelPart GrenadePet;
	public final ModelPart Greenpart;
	public final ModelPart Feets;
	public final ModelPart Handle;

	public ModelMy_Majestic_Pet_Grenade(ModelPart root) {
		this.GrenadePet = root.getChild("GrenadePet");
		this.Greenpart = this.GrenadePet.getChild("Greenpart");
		this.Feets = this.Greenpart.getChild("Feets");
		this.Handle = this.Feets.getChild("Handle");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition GrenadePet = partdefinition.addOrReplaceChild("GrenadePet", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Greenpart = GrenadePet.addOrReplaceChild("Greenpart",
				CubeListBuilder.create().texOffs(42, 39).addBox(-2.5F, -8.7F, -2.0F, 5.0F, 8.5F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 37).addBox(-2.2F, -8.7F, -2.5F, 4.4F, 8.5F, 5.0F, new CubeDeformation(0.0F)).texOffs(18, 58)
						.addBox(-1.7F, -9.1F, -2.1F, 3.4F, 8.3F, 4.2F, new CubeDeformation(0.0F)).texOffs(54, 58).addBox(-2.0F, -9.1F, -1.6F, 4.0F, 8.3F, 3.2F, new CubeDeformation(0.0F)).texOffs(0, 59)
						.addBox(-1.2F, -9.3F, -1.4F, 2.4F, 8.7F, 2.8F, new CubeDeformation(0.0F)).texOffs(60, 41).addBox(-1.5F, -9.3F, -0.9F, 3.0F, 8.7F, 1.8F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-2.6F, -8.2F, -3.0F, 5.2F, 1.5F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 0).addBox(-2.4F, -8.0F, -3.3F, 4.8F, 1.1F, 6.6F, new CubeDeformation(0.0F)).texOffs(57, 34)
						.addBox(-2.9F, -8.2F, -2.5F, 5.8F, 1.5F, 5.0F, new CubeDeformation(0.0F)).texOffs(56, 24).addBox(-3.1F, -8.0F, -2.3F, 6.2F, 1.1F, 4.6F, new CubeDeformation(0.0F)).texOffs(39, 23)
						.addBox(-2.4F, -8.0F, -3.3F, 4.8F, 1.1F, 6.6F, new CubeDeformation(0.0F)).texOffs(32, 58).addBox(-3.1F, -7.9F, -2.3F, 6.2F, 0.9F, 4.6F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-2.4F, -6.1F, -3.7F, 5.3F, 1.1F, 7.0F, new CubeDeformation(0.0F)).texOffs(44, 52).addBox(-3.1F, -6.1F, -2.7F, 6.7F, 1.1F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-2.6F, -2.7F, -3.9F, 5.4F, 1.1F, 7.3F, new CubeDeformation(0.0F)).texOffs(40, 12).addBox(-3.3F, -2.7F, -2.9F, 6.8F, 1.1F, 5.3F, new CubeDeformation(0.0F)).texOffs(22, 51)
						.addBox(-2.3F, -1.0F, -3.5F, 5.1F, 0.5F, 6.3F, new CubeDeformation(0.0F)).texOffs(43, 18).addBox(-3.0F, -1.0F, -2.5F, 6.5F, 0.5F, 4.3F, new CubeDeformation(0.0F)).texOffs(18, 30)
						.addBox(-3.4F, -4.5F, -3.1F, 7.0F, 1.1F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 10).addBox(-2.7F, -4.5F, -4.1F, 5.6F, 1.1F, 8.0F, new CubeDeformation(0.0F)).texOffs(38, 31)
						.addBox(-3.1F, -6.4F, -3.0F, 6.5F, 1.5F, 5.8F, new CubeDeformation(0.0F)).texOffs(21, 12).addBox(-3.2F, -6.4F, -3.5F, 6.3F, 1.5F, 6.8F, new CubeDeformation(0.0F)).texOffs(21, 3)
						.addBox(-3.3F, -4.7F, -3.4F, 6.6F, 1.5F, 6.8F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.0F, -4.7F, -3.9F, 6.0F, 1.5F, 7.8F, new CubeDeformation(0.0F)).texOffs(20, 22)
						.addBox(-3.3F, -2.9F, -3.2F, 6.6F, 1.5F, 6.4F, new CubeDeformation(0.0F)).texOffs(0, 19).addBox(-3.0F, -2.9F, -3.7F, 6.0F, 1.5F, 7.4F, new CubeDeformation(0.0F)).texOffs(56, 18)
						.addBox(-3.0F, -1.1F, -2.6F, 6.0F, 0.7F, 5.2F, new CubeDeformation(0.0F)).texOffs(0, 44).addBox(-2.7F, -1.1F, -3.1F, 5.4F, 0.7F, 6.2F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Feets = Greenpart.addOrReplaceChild("Feets", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Feets.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 4).addBox(-0.025F, -1.6F, -5.1F, 1.8F, 1.25F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.48F, 0.0F));
		PartDefinition cube_r2 = Feets.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 4).addBox(-1.525F, -1.6F, -4.8F, 1.8F, 1.25F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.48F, 0.0F));
		PartDefinition cube_r3 = Feets.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(0.6F, -6.15F, -4.5F, 2.0F, 2.2F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r4 = Feets.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-2.2F, -6.1F, -4.5F, 2.0F, 2.2F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition Handle = Feets.addOrReplaceChild("Handle",
				CubeListBuilder.create().texOffs(20, 1).addBox(-0.7F, -10.1F, -1.0F, 1.7F, 1.1F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 10).addBox(-1.1F, -9.9F, -1.0F, 1.7F, 1.1F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-0.5F, -10.5F, -1.0F, 1.5F, 1.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 19).addBox(-0.2F, -10.7F, -1.0F, 1.2F, 1.7F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 12)
						.addBox(0.1F, -10.8F, -0.95F, 1.1F, 1.2F, 1.9F, new CubeDeformation(0.0F)).texOffs(20, 4).addBox(0.1F, -10.8F, -0.95F, 1.8F, 0.9F, 1.9F, new CubeDeformation(0.0F)).texOffs(19, 21)
						.addBox(0.3F, -11.0F, -0.55F, 1.4F, 0.9F, 1.1F, new CubeDeformation(0.0F)).texOffs(20, 15).addBox(1.5F, -10.6F, -0.9F, 0.6F, 0.8F, 1.8F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.9F, -10.3F, -0.7F, 0.4F, 0.7F, 1.4F, new CubeDeformation(0.0F)).texOffs(22, 22).addBox(1.9F, -10.3F, -0.55F, 0.8F, 0.8F, 1.1F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(2.45F, -10.1F, -0.425F, 0.75F, 0.775F, 0.85F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r5 = Handle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(20, 0).addBox(-7.45F, -5.0F, -0.225F, 6.7F, 0.6F, 0.45F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r6 = Handle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 7).addBox(-6.55F, -8.2F, -0.225F, 2.95F, 0.575F, 0.45F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0036F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		GrenadePet.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
