
package net.mcreator.oogaboogablockgen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.oogaboogablockgen.entity.GrenadeEntity;
import net.mcreator.oogaboogablockgen.client.model.ModelMy_Majestic_Pet_Grenade;

public class GrenadeRenderer extends MobRenderer<GrenadeEntity, ModelMy_Majestic_Pet_Grenade<GrenadeEntity>> {
	public GrenadeRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMy_Majestic_Pet_Grenade(context.bakeLayer(ModelMy_Majestic_Pet_Grenade.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GrenadeEntity entity) {
		return ResourceLocation.parse("oogaboogablockgen:textures/entities/green_thingy_mabob.png");
	}
}
