
package net.mcreator.cavarli.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.cavarli.entity.GyatEntity;

public class GyatRenderer extends MobRenderer<GyatEntity, CreeperModel<GyatEntity>> {
	public GyatRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GyatEntity entity) {
		return ResourceLocation.parse("cavarli:textures/entities/lol.png");
	}
}
