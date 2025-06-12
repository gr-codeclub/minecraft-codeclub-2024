
package net.mcreator.scottmod.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.scottmod.procedures.PetRockSadDisplayConditionProcedure;
import net.mcreator.scottmod.entity.PetRockEntity;
import net.mcreator.scottmod.client.model.ModelPetRock;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PetRockRenderer extends MobRenderer<PetRockEntity, ModelPetRock<PetRockEntity>> {
	public PetRockRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPetRock(context.bakeLayer(ModelPetRock.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<PetRockEntity, ModelPetRock<PetRockEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("scottmod:textures/entities/pet_rock_texture.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PetRockEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				EntityModel model = new ModelPetRock(Minecraft.getInstance().getEntityModels().bakeLayer(ModelPetRock.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
		this.addLayer(new RenderLayer<PetRockEntity, ModelPetRock<PetRockEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("scottmod:textures/entities/pet_rock_sad_texture.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PetRockEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PetRockSadDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new ModelPetRock(Minecraft.getInstance().getEntityModels().bakeLayer(ModelPetRock.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PetRockEntity entity) {
		return ResourceLocation.parse("scottmod:textures/entities/pet_rock_texture.png");
	}
}
