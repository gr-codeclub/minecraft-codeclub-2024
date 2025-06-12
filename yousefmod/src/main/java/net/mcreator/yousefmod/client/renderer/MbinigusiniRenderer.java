
package net.mcreator.yousefmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.yousefmod.entity.MbinigusiniEntity;
import net.mcreator.yousefmod.client.model.Modelbombininigusinini;

public class MbinigusiniRenderer extends MobRenderer<MbinigusiniEntity, Modelbombininigusinini<MbinigusiniEntity>> {
	public MbinigusiniRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbombininigusinini(context.bakeLayer(Modelbombininigusinini.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MbinigusiniEntity entity) {
		return ResourceLocation.parse("yousefmod:textures/entities/hieveryone.png");
	}
}
