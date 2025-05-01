
package net.mcreator.yousefmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.yousefmod.entity.YoyochairEntity;
import net.mcreator.yousefmod.client.model.Modelyoyochair;

public class YoyochairRenderer extends MobRenderer<YoyochairEntity, Modelyoyochair<YoyochairEntity>> {
	public YoyochairRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelyoyochair(context.bakeLayer(Modelyoyochair.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(YoyochairEntity entity) {
		return ResourceLocation.parse("yousefmod:textures/entities/yoyochair.png");
	}
}
