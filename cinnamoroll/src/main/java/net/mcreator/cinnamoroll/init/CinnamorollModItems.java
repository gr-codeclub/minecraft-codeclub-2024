
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cinnamoroll.init;

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

import net.mcreator.cinnamoroll.procedures.SunsetwandPropertyValueProviderProcedure;
import net.mcreator.cinnamoroll.item.SunsetwandItem;
import net.mcreator.cinnamoroll.item.BobTheBuilderItem;
import net.mcreator.cinnamoroll.CinnamorollMod;

public class CinnamorollModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CinnamorollMod.MODID);
	public static final DeferredItem<Item> WINTER_LAND = block(CinnamorollModBlocks.WINTER_LAND);
	public static final DeferredItem<Item> SUNSETWAND = REGISTRY.register("sunsetwand", SunsetwandItem::new);
	public static final DeferredItem<Item> LO_L = block(CinnamorollModBlocks.LO_L);
	public static final DeferredItem<Item> WINTERBLOCK_2 = block(CinnamorollModBlocks.WINTERBLOCK_2);
	public static final DeferredItem<Item> BOB_THE_BUILDER = REGISTRY.register("bob_the_builder", BobTheBuilderItem::new);
	public static final DeferredItem<Item> HOUSE = block(CinnamorollModBlocks.HOUSE);
	public static final DeferredItem<Item> JAMCHAIR_SPAWN_EGG = REGISTRY.register("jamchair_spawn_egg", () -> new DeferredSpawnEggItem(CinnamorollModEntities.JAMCHAIR, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> CUTE_SPAWN_EGG = REGISTRY.register("cute_spawn_egg", () -> new DeferredSpawnEggItem(CinnamorollModEntities.CUTE, -1, -1, new Item.Properties()));

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
				ItemProperties.register(SUNSETWAND.get(), ResourceLocation.parse("cinnamoroll:sunsetwand_sigma"),
						(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) SunsetwandPropertyValueProviderProcedure.execute(entity != null ? entity.level() : clientWorld));
			});
		}
	}
}
