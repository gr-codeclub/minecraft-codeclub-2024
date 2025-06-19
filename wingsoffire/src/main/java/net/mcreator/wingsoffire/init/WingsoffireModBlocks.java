
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wingsoffire.init;

import org.checkerframework.checker.units.qual.A;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.wingsoffire.block.WwwBlock;
import net.mcreator.wingsoffire.block.WowtenshousanisrubbishBlock;
import net.mcreator.wingsoffire.block.WoewBlock;
import net.mcreator.wingsoffire.block.WinningBlock;
import net.mcreator.wingsoffire.block.WingsOfFireexBlock;
import net.mcreator.wingsoffire.block.TwentyblockcelebrationBlock;
import net.mcreator.wingsoffire.block.StrawberryBlock;
import net.mcreator.wingsoffire.block.PollyfrogblockBlock;
import net.mcreator.wingsoffire.block.MomolandhouseblockBlock;
import net.mcreator.wingsoffire.block.MomofrogsigmaBlock;
import net.mcreator.wingsoffire.block.MomofrogdimensionPortalBlock;
import net.mcreator.wingsoffire.block.MeowBlock;
import net.mcreator.wingsoffire.block.LolBlock;
import net.mcreator.wingsoffire.block.IwillhavrmostblocksBlock;
import net.mcreator.wingsoffire.block.IwillbeatsophieinmostblocksBlock;
import net.mcreator.wingsoffire.block.IdkBlock;
import net.mcreator.wingsoffire.block.HhshhsshsBlock;
import net.mcreator.wingsoffire.block.GyattBlock;
import net.mcreator.wingsoffire.block.FunblockBlock;
import net.mcreator.wingsoffire.block.CuteBlock;
import net.mcreator.wingsoffire.block.CheckersBlock;
import net.mcreator.wingsoffire.block.BlockyBlock;
import net.mcreator.wingsoffire.block.ANIKABlock;
import net.mcreator.wingsoffire.block.ABlock;
import net.mcreator.wingsoffire.WingsoffireMod;

public class WingsoffireModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(WingsoffireMod.MODID);
	public static final DeferredBlock<Block> WINGS_OF_FIREEX = REGISTRY.register("wings_of_fireex", WingsOfFireexBlock::new);
	public static final DeferredBlock<Block> CHECKERS = REGISTRY.register("checkers", CheckersBlock::new);
	public static final DeferredBlock<Block> FUNBLOCK = REGISTRY.register("funblock", FunblockBlock::new);
	public static final DeferredBlock<Block> MOMOFROGSIGMA = REGISTRY.register("momofrogsigma", MomofrogsigmaBlock::new);
	public static final DeferredBlock<Block> MOMOFROGDIMENSION_PORTAL = REGISTRY.register("momofrogdimension_portal", MomofrogdimensionPortalBlock::new);
	public static final DeferredBlock<Block> POLLYFROGBLOCK = REGISTRY.register("pollyfrogblock", PollyfrogblockBlock::new);
	public static final DeferredBlock<Block> MOMOLANDHOUSEBLOCK = REGISTRY.register("momolandhouseblock", MomolandhouseblockBlock::new);
	public static final DeferredBlock<Block> BLOCKY = REGISTRY.register("blocky", BlockyBlock::new);
	public static final DeferredBlock<Block> GYATT = REGISTRY.register("gyatt", GyattBlock::new);
	public static final DeferredBlock<Block> IDK = REGISTRY.register("idk", IdkBlock::new);
	public static final DeferredBlock<Block> HHSHHSSHS = REGISTRY.register("hhshhsshs", HhshhsshsBlock::new);
	public static final DeferredBlock<Block> STRAWBERRY = REGISTRY.register("strawberry", StrawberryBlock::new);
	public static final DeferredBlock<Block> LOL = REGISTRY.register("lol", LolBlock::new);
	public static final DeferredBlock<Block> ANIKA = REGISTRY.register("anika", ANIKABlock::new);
	public static final DeferredBlock<Block> WINNING = REGISTRY.register("winning", WinningBlock::new);
	public static final DeferredBlock<Block> IWILLHAVRMOSTBLOCKS = REGISTRY.register("iwillhavrmostblocks", IwillhavrmostblocksBlock::new);
	public static final DeferredBlock<Block> IWILLBEATSOPHIEINMOSTBLOCKS = REGISTRY.register("iwillbeatsophieinmostblocks", IwillbeatsophieinmostblocksBlock::new);
	public static final DeferredBlock<Block> WOEW = REGISTRY.register("woew", WoewBlock::new);
	public static final DeferredBlock<Block> A = REGISTRY.register("a", ABlock::new);
	public static final DeferredBlock<Block> WOWTENSHOUSANISRUBBISH = REGISTRY.register("wowtenshousanisrubbish", WowtenshousanisrubbishBlock::new);
	public static final DeferredBlock<Block> CUTE = REGISTRY.register("cute", CuteBlock::new);
	public static final DeferredBlock<Block> MEOW = REGISTRY.register("meow", MeowBlock::new);
	public static final DeferredBlock<Block> WWW = REGISTRY.register("www", WwwBlock::new);
	public static final DeferredBlock<Block> TWENTYBLOCKCELEBRATION = REGISTRY.register("twentyblockcelebration", TwentyblockcelebrationBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			StrawberryBlock.blockColorLoad(event);
		}
	}
}
