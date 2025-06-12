
package net.mcreator.erikmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.erikmod.entity.ShockwaveEntity;
import net.mcreator.erikmod.client.model.Modelshockwave;

public class ShockwaveRenderer extends MobRenderer<ShockwaveEntity, Modelshockwave<ShockwaveEntity>> {
	public ShockwaveRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshockwave(context.bakeLayer(Modelshockwave.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShockwaveEntity entity) {
		return ResourceLocation.parse("erikmod:textures/entities/shockwave.png");
	}
}
