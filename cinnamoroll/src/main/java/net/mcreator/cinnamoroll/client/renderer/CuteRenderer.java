
package net.mcreator.cinnamoroll.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cinnamoroll.entity.CuteEntity;
import net.mcreator.cinnamoroll.client.model.Modelcute;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CuteRenderer extends MobRenderer<CuteEntity, Modelcute<CuteEntity>> {
	public CuteRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcute(context.bakeLayer(Modelcute.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<CuteEntity, Modelcute<CuteEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("cinnamoroll:textures/entities/cutetexture.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CuteEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
		this.addLayer(new RenderLayer<CuteEntity, Modelcute<CuteEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("cinnamoroll:textures/entities/pinkie.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CuteEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CuteEntity entity) {
		return ResourceLocation.parse("cinnamoroll:textures/entities/cutetexture.png");
	}
}
