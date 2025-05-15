
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wingsoffire.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.mcreator.wingsoffire.procedures.GloryandthehiddenkingdomPropertyValueProviderProcedure;
import net.mcreator.wingsoffire.item.MomofrogdimensionItem;
import net.mcreator.wingsoffire.item.GloryandthehiddenkingdomItem;
import net.mcreator.wingsoffire.WingsoffireMod;

public class WingsoffireModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(WingsoffireMod.MODID);
	public static final DeferredItem<Item> WINGS_OF_FIREEX = block(WingsoffireModBlocks.WINGS_OF_FIREEX);
	public static final DeferredItem<Item> GLORYANDTHEHIDDENKINGDOM = REGISTRY.register("gloryandthehiddenkingdom", GloryandthehiddenkingdomItem::new);
	public static final DeferredItem<Item> CHECKERS = block(WingsoffireModBlocks.CHECKERS);
	public static final DeferredItem<Item> FUNBLOCK = block(WingsoffireModBlocks.FUNBLOCK);
	public static final DeferredItem<Item> ANIKAWOF_SPAWN_EGG = REGISTRY.register("anikawof_spawn_egg", () -> new DeferredSpawnEggItem(WingsoffireModEntities.ANIKAWOF, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> MOMOFROGSIGMA = block(WingsoffireModBlocks.MOMOFROGSIGMA);
	public static final DeferredItem<Item> MOMOFROGDIMENSION = REGISTRY.register("momofrogdimension", MomofrogdimensionItem::new);
	public static final DeferredItem<Item> POLLYFROGBLOCK = block(WingsoffireModBlocks.POLLYFROGBLOCK);
	public static final DeferredItem<Item> MOMOLANDHOUSEBLOCK = block(WingsoffireModBlocks.MOMOLANDHOUSEBLOCK);
	public static final DeferredItem<Item> BLOCKY = block(WingsoffireModBlocks.BLOCKY);
	public static final DeferredItem<Item> GYATT = block(WingsoffireModBlocks.GYATT);
	public static final DeferredItem<Item> ANIKA_CHAIR_SPAWN_EGG = REGISTRY.register("anika_chair_spawn_egg", () -> new DeferredSpawnEggItem(WingsoffireModEntities.ANIKA_CHAIR, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> IDK = block(WingsoffireModBlocks.IDK);
	public static final DeferredItem<Item> HHSHHSSHS = block(WingsoffireModBlocks.HHSHHSSHS);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ItemsClientSideHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void clientLoad(FMLClientSetupEvent event) {
			event.enqueueWork(() -> {
				ItemProperties.register(GLORYANDTHEHIDDENKINGDOM.get(), ResourceLocation.parse("wingsoffire:gloryandthehiddenkingdom_youtube"),
						(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) GloryandthehiddenkingdomPropertyValueProviderProcedure.execute(entity != null ? entity.level() : clientWorld));
			});
		}
	}
}
