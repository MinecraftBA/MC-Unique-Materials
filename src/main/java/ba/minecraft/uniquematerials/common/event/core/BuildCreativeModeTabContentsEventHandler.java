package ba.minecraft.uniquematerials.common.event.core;

import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import ba.minecraft.uniquematerials.common.items.OreItems;
import ba.minecraft.uniquematerials.common.items.TreeItems;
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

		if (tabKey == CreativeModeTabs.NATURAL_BLOCKS) {

			// Ores spawning in normal heights instead of Stone.
			event.accept(OreItems.BAUXITE_ORE);
			event.accept(OreItems.GALENA_ORE);
			event.accept(OreItems.OLIVINE_ORE);
			event.accept(OreItems.RUTILE_ORE);
			event.accept(OreItems.SILVER_ORE);

			// Ores spawning in deep instead of Deepslate.
			event.accept(OreItems.DEEPSLATE_BAUXITE_ORE);
			event.accept(OreItems.DEEPSLATE_OLIVINE_ORE);
			event.accept(OreItems.DEEPSLATE_RUTILE_ORE);
			event.accept(OreItems.DEEPSLATE_SILVER_ORE);

			// Ores spawning instead of Red Sand.
			event.accept(OreItems.RED_SANDSTONE_BLACK_DIAMOND_ORE);
			event.accept(OreItems.RED_SANDSTONE_HALITE_ORE);

			// Ores spawning instead of Sand.
			event.accept(OreItems.SANDSTONE_BLACK_DIAMOND_ORE);
			event.accept(OreItems.SANDSTONE_HALITE_ORE);

			// Ores spawning in Nether.
			event.accept(OreItems.NETHERRACK_AVENTURINE_ORE);
			event.accept(OreItems.NETHERRACK_CITRINE_ORE);
			
			// Blocks of raw ores.
			event.accept(OreItems.RAW_BAUXITE_BLOCK);
			event.accept(OreItems.RAW_GALENA_BLOCK);
			event.accept(OreItems.RAW_HALITE_BLOCK);
			event.accept(OreItems.RAW_OLIVINE_BLOCK);
			event.accept(OreItems.RAW_RUTILE_BLOCK);
			event.accept(OreItems.RAW_SILVER_BLOCK);

			// Leaves.
			event.accept(TreeItems.BEECH_LEAVES);
			event.accept(TreeItems.MAHOGANY_LEAVES);
			event.accept(TreeItems.SEQUOIA_LEAVES);

			// Saplings.
			event.accept(TreeItems.BEECH_SAPLING);
			event.accept(TreeItems.MAHOGANY_SAPLING);
			event.accept(TreeItems.SEQUOIA_SAPLING);

			// Woods.
			event.accept(TreeItems.BEECH_WOOD);
			event.accept(TreeItems.MAHOGANY_WOOD);
			event.accept(TreeItems.SEQUOIA_WOOD);

			// Logs (available as both natural and building blocks)
			event.accept(TreeItems.BEECH_LOG);
			event.accept(TreeItems.MAHOGANY_LOG);
			event.accept(TreeItems.SEQUOIA_LOG);

		}
		
		if (tabKey == CreativeModeTabs.BUILDING_BLOCKS) {

			event.accept(OreItems.ALUMINIUM_BLOCK);
			event.accept(OreItems.LEAD_BLOCK);
			event.accept(OreItems.SILICON_BLOCK);
			event.accept(OreItems.SILVER_BLOCK);
			event.accept(OreItems.TITANIUM_BLOCK);

			// Aventurine
			event.accept(OreItems.AVENTURINE_BLOCK);
			event.accept(OreItems.AVENTURINE_BRICKS);
			event.accept(OreItems.AVENTURINE_PILLAR);
			event.accept(OreItems.AVENTURINE_SLAB);
			event.accept(OreItems.AVENTURINE_STAIRS);
			event.accept(OreItems.CHISELED_AVENTURINE_BLOCK);
			event.accept(OreItems.SMOOTH_AVENTURINE);
			event.accept(OreItems.SMOOTH_AVENTURINE_SLAB);
			event.accept(OreItems.SMOOTH_AVENTURINE_STAIRS);
			
			// Citrine
			event.accept(OreItems.CITRINE_BLOCK);
			event.accept(OreItems.CITRINE_BRICKS);
			event.accept(OreItems.CITRINE_PILLAR);
			event.accept(OreItems.CITRINE_SLAB);
			event.accept(OreItems.CITRINE_STAIRS);
			event.accept(OreItems.CHISELED_CITRINE_BLOCK);
			event.accept(OreItems.SMOOTH_CITRINE);
			event.accept(OreItems.SMOOTH_CITRINE_SLAB);
			event.accept(OreItems.SMOOTH_CITRINE_STAIRS);

			// Logs (available as both natural and building blocks)
			event.accept(TreeItems.BEECH_LOG);
			event.accept(TreeItems.MAHOGANY_LOG);
			event.accept(TreeItems.SEQUOIA_LOG);

			// Stripped logs and woods.
			event.accept(TreeItems.STRIPPED_BEECH_LOG);
			event.accept(TreeItems.STRIPPED_BEECH_WOOD);
			event.accept(TreeItems.STRIPPED_MAHOGANY_LOG);
			event.accept(TreeItems.STRIPPED_MAHOGANY_WOOD);
			event.accept(TreeItems.STRIPPED_SEQUOIA_LOG);
			event.accept(TreeItems.STRIPPED_SEQUOIA_WOOD);

			// Planks.
			event.accept(TreeItems.BEECH_PLANKS);
			event.accept(TreeItems.MAHOGANY_PLANKS);
			event.accept(TreeItems.SEQUOIA_PLANKS);

		}
		
		if (tabKey == CreativeModeTabs.INGREDIENTS) {

			event.accept(OreItems.RAW_BAUXITE);
			event.accept(OreItems.RAW_GALENA);
			event.accept(OreItems.RAW_HALITE);
			event.accept(OreItems.RAW_OLIVINE);
			event.accept(OreItems.RAW_RUTILE);
			event.accept(OreItems.RAW_SILVER);

			event.accept(OreItems.AVENTURINE);
			event.accept(OreItems.BLACK_DIAMOND);
			event.accept(OreItems.CITRINE);

			event.accept(OreItems.ALUMINIUM_INGOT);
			event.accept(OreItems.LEAD_INGOT);
			event.accept(OreItems.SILICON_INGOT);
			event.accept(OreItems.SILVER_INGOT);
			event.accept(OreItems.TITANIUM_INGOT);

		}

	}
}