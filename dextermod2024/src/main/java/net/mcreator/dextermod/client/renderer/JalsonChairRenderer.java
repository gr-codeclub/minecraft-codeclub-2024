
package net.mcreator.dextermod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dextermod.entity.JalsonChairEntity;
import net.mcreator.dextermod.client.model.Modelcityhall;

public class JalsonChairRenderer extends MobRenderer<JalsonChairEntity, Modelcityhall<JalsonChairEntity>> {
	public JalsonChairRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcityhall(context.bakeLayer(Modelcityhall.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JalsonChairEntity entity) {
		return ResourceLocation.parse("dextermod:textures/entities/tungtungtungsahur.png");
	}
}
