package ba.minecraft.uniquematerials.common.event.core;

import ba.minecraft.uniquematerials.common.blocks.OreBlocks;
import ba.minecraft.uniquematerials.common.blocks.TreeBlocks;
import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = UniqueMaterialsMod.MODID, bus = Bus.MOD)
public final class BuildCreativeModeTabContentsEventHandler {

	@SubscribeEvent()
	public static void onBuildCreativeModeTabContents(final BuildCreativeModeTabContentsEvent event) {

		ResourceKey<CreativeModeTab> tabKey = event.getTabKey();

		if(tabKey == CreativeModeTabs.NATURAL_BLOCKS) {

			// Ores spawning in normal heights instead of Stone.
			event.accept(OreBlocks.BAUXITE_ORE);
			event.accept(OreBlocks.GALENA_ORE);
			event.accept(OreBlocks.OLIVINE_ORE);
			event.accept(OreBlocks.RUTILE_ORE);
			event.accept(OreBlocks.SILVER_ORE);

			// Ores spawning in deep instead of Deepslate.
			event.accept(OreBlocks.DEEPSLATE_BAUXITE_ORE);
			event.accept(OreBlocks.DEEPSLATE_OLIVINE_ORE);
			event.accept(OreBlocks.DEEPSLATE_RUTILE_ORE);
			event.accept(OreBlocks.DEEPSLATE_SILVER_ORE);

			// Ores spawning instead of Red Sand.
			event.accept(OreBlocks.RED_SAND_BLACK_DIAMOND_ORE);
			event.accept(OreBlocks.RED_SAND_HALITE_ORE);

			// Ores spawning instead of Sand.
			event.accept(OreBlocks.SAND_BLACK_DIAMOND_ORE);
			event.accept(OreBlocks.SAND_HALITE_ORE);

			// Ores spawning in Nether.
			event.accept(OreBlocks.NETHERRACK_CITRINE_ORE);
			
			// Blocks of raw ores.
			event.accept(OreBlocks.RAW_BAUXITE_BLOCK);
			event.accept(OreBlocks.RAW_GALENA_BLOCK);
			event.accept(OreBlocks.RAW_HALITE_BLOCK);
			event.accept(OreBlocks.RAW_OLIVINE_BLOCK);
			event.accept(OreBlocks.RAW_RUTILE_BLOCK);
			event.accept(OreBlocks.RAW_SILVER_BLOCK);

			// Leaves.
			event.accept(TreeBlocks.BEECH_LEAVES);
			event.accept(TreeBlocks.MAHOGANY_LEAVES);
			event.accept(TreeBlocks.SEQUOIA_LEAVES);

			// Saplings.
			event.accept(TreeBlocks.BEECH_SAPLING);
			event.accept(TreeBlocks.MAHOGANY_SAPLING);
			event.accept(TreeBlocks.SEQUOIA_SAPLING);

			// Woods.
			event.accept(TreeBlocks.BEECH_WOOD);
			event.accept(TreeBlocks.MAHOGANY_WOOD);
			event.accept(TreeBlocks.SEQUOIA_WOOD);

			// Logs (available as both natural and building blocks)
			event.accept(TreeBlocks.BEECH_LOG);
			event.accept(TreeBlocks.MAHOGANY_LOG);
			event.accept(TreeBlocks.SEQUOIA_LOG);

		}
		
		if(tabKey == CreativeModeTabs.BUILDING_BLOCKS) {

			event.accept(OreBlocks.ALUMINIUM_BLOCK);
			event.accept(OreBlocks.LEAD_BLOCK);
			event.accept(OreBlocks.SILICON_BLOCK);
			event.accept(OreBlocks.SILVER_BLOCK);
			event.accept(OreBlocks.TITANIUM_BLOCK);

			// Logs (available as both natural and building blocks)
			event.accept(TreeBlocks.BEECH_LOG);
			event.accept(TreeBlocks.MAHOGANY_LOG);
			event.accept(TreeBlocks.SEQUOIA_LOG);

			// Stripped logs and woods.
			event.accept(TreeBlocks.STRIPPED_BEECH_LOG);
			event.accept(TreeBlocks.STRIPPED_BEECH_WOOD);
			event.accept(TreeBlocks.STRIPPED_MAHOGANY_LOG);
			event.accept(TreeBlocks.STRIPPED_MAHOGANY_WOOD);
			event.accept(TreeBlocks.STRIPPED_SEQUOIA_LOG);
			event.accept(TreeBlocks.STRIPPED_SEQUOIA_WOOD);

			// Planks.
			event.accept(TreeBlocks.BEECH_PLANKS);
			event.accept(TreeBlocks.MAHOGANY_PLANKS);
			event.accept(TreeBlocks.SEQUOIA_PLANKS);

		}

	}
}