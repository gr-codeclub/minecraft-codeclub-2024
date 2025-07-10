
package net.mcreator.cavarli.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.cavarli.entity.SusEntity;

public class SusRenderer extends MobRenderer<SusEntity, CreeperModel<SusEntity>> {
	public SusRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SusEntity entity) {
		return ResourceLocation.parse("cavarli:textures/entities/chickenchairtex.png");
	}
}
