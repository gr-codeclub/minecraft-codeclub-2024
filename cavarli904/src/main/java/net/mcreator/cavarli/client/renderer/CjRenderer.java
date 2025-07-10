
package net.mcreator.cavarli.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cavarli.entity.CjEntity;
import net.mcreator.cavarli.client.model.Modelcj;

public class CjRenderer extends MobRenderer<CjEntity, Modelcj<CjEntity>> {
	public CjRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcj<CjEntity>(context.bakeLayer(Modelcj.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CjEntity entity) {
		return ResourceLocation.parse("cavarli:textures/entities/cavarli_texture.png");
	}
}
