
package net.mcreator.cavarli.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.cavarli.entity.SonicEntity;

public class SonicRenderer extends MobRenderer<SonicEntity, CreeperModel<SonicEntity>> {
	public SonicRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SonicEntity entity) {
		return ResourceLocation.parse("cavarli:textures/entities/cavarlidragon.png");
	}
}
