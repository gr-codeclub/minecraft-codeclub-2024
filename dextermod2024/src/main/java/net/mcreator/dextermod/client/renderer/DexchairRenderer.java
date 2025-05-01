
package net.mcreator.dextermod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dextermod.entity.DexchairEntity;
import net.mcreator.dextermod.client.model.Modeldexchair;

public class DexchairRenderer extends MobRenderer<DexchairEntity, Modeldexchair<DexchairEntity>> {
	public DexchairRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldexchair(context.bakeLayer(Modeldexchair.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DexchairEntity entity) {
		return ResourceLocation.parse("dextermod:textures/entities/dexchairtex.png");
	}
}
