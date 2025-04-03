
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wingsoffire.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.wingsoffire.block.entity.WingsOfFireexBlockEntity;
import net.mcreator.wingsoffire.block.entity.MomolandhouseblockBlockEntity;
import net.mcreator.wingsoffire.block.entity.FunblockBlockEntity;
import net.mcreator.wingsoffire.block.entity.CheckersBlockEntity;
import net.mcreator.wingsoffire.block.entity.BlockyBlockEntity;
import net.mcreator.wingsoffire.WingsoffireMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class WingsoffireModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, WingsoffireMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> WINGS_OF_FIREEX = register("wings_of_fireex", WingsoffireModBlocks.WINGS_OF_FIREEX, WingsOfFireexBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> CHECKERS = register("checkers", WingsoffireModBlocks.CHECKERS, CheckersBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> FUNBLOCK = register("funblock", WingsoffireModBlocks.FUNBLOCK, FunblockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> MOMOLANDHOUSEBLOCK = register("momolandhouseblock", WingsoffireModBlocks.MOMOLANDHOUSEBLOCK, MomolandhouseblockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> BLOCKY = register("blocky", WingsoffireModBlocks.BLOCKY, BlockyBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WINGS_OF_FIREEX.get(), (blockEntity, side) -> ((WingsOfFireexBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CHECKERS.get(), (blockEntity, side) -> ((CheckersBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, FUNBLOCK.get(), (blockEntity, side) -> ((FunblockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, MOMOLANDHOUSEBLOCK.get(), (blockEntity, side) -> ((MomolandhouseblockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BLOCKY.get(), (blockEntity, side) -> ((BlockyBlockEntity) blockEntity).getItemHandler());
	}
}
