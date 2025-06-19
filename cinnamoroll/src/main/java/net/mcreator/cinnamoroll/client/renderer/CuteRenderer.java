
package net.mcreator.cinnamoroll.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cinnamoroll.entity.CuteEntity;
import net.mcreator.cinnamoroll.client.model.Modelcute;

public class CuteRenderer extends MobRenderer<CuteEntity, Modelcute<CuteEntity>> {
	public CuteRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcute(context.bakeLayer(Modelcute.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CuteEntity entity) {
		return ResourceLocation.parse("cinnamoroll:textures/entities/cutetexture.png");
	}
}
