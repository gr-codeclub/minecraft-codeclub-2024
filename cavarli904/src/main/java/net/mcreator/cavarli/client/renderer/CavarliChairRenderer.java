
package net.mcreator.cavarli.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cavarli.entity.CavarliChairEntity;
import net.mcreator.cavarli.client.model.Modelcj;

public class CavarliChairRenderer extends MobRenderer<CavarliChairEntity, Modelcj<CavarliChairEntity>> {
	public CavarliChairRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcj(context.bakeLayer(Modelcj.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CavarliChairEntity entity) {
		return ResourceLocation.parse("cavarli:textures/entities/chickenchairtex.png");
	}
}
