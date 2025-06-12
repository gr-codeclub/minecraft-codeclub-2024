
package net.mcreator.something.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.something.entity.POOEntity;
import net.mcreator.something.client.model.Modelmodel;

public class POORenderer extends MobRenderer<POOEntity, Modelmodel<POOEntity>> {
	public POORenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmodel(context.bakeLayer(Modelmodel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(POOEntity entity) {
		return ResourceLocation.parse("something:textures/entities/mytexture.png");
	}
}
