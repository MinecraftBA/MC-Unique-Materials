package ba.minecraft.uniquematerials.datagen.lang;

import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import ba.minecraft.uniquematerials.common.items.OreItems;
import ba.minecraft.uniquematerials.common.items.TreeItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public final class EnUsLanguageProvider extends LanguageProvider {

	public EnUsLanguageProvider(PackOutput packOutput) {
		super(packOutput, UniqueMaterialsMod.MODID, "en_us");
	}

	@Override
	protected void addTranslations() {
		
		addOreItems();
		addTreeItems();
		
	}


	private void addTreeItems() {

		// Beech items
		
		add(TreeItems.BEECH_LOG.get(), "Beech Log");
		add(TreeItems.STRIPPED_BEECH_LOG.get(), "Stripped Beech Log");
		add(TreeItems.BEECH_WOOD.get(), "Beech Wood");
		add(TreeItems.STRIPPED_BEECH_WOOD.get(), "Stripped Beech Wood");
		add(TreeItems.BEECH_PLANKS.get(), "Beech Planks");
		add(TreeItems.BEECH_SAPLING.get(), "Beech Sapling");
		add(TreeItems.BEECH_LEAVES.get(), "Beech Leaves");
		
		// Mahogany items
		
		add(TreeItems.MAHOGANY_LOG.get(), "Mahogany Log");
		add(TreeItems.STRIPPED_MAHOGANY_LOG.get(), "Stripped Mahogany Log");
		add(TreeItems.MAHOGANY_WOOD.get(), "Mahogany Wood");
		add(TreeItems.STRIPPED_MAHOGANY_WOOD.get(), "Stripped Mahogany Wood");
		add(TreeItems.MAHOGANY_PLANKS.get(), "Mahogany Planks");
		add(TreeItems.MAHOGANY_SAPLING.get(), "Mahogany Sapling");
		add(TreeItems.MAHOGANY_LEAVES.get(),"Mahogany Leaves");
		
		// Sequoia items
		
		add(TreeItems.SEQUOIA_LOG.get(), "Sequoia Log");
		add(TreeItems.STRIPPED_SEQUOIA_LOG.get(), "Stripped Sequoia Log");
		add(TreeItems.SEQUOIA_WOOD.get(), "Sequoia Wood");
		add(TreeItems.STRIPPED_SEQUOIA_WOOD.get(), "Stripped Sequoia Wood");
		add(TreeItems.SEQUOIA_PLANKS.get(), "Sequoia Planks");
		add(TreeItems.SEQUOIA_SAPLING.get(), "Sequoia Sapling");
		add(TreeItems.SEQUOIA_LEAVES.get(), "Sequoia Leaves");
		
	}

	private void addOreItems() {

		// Bauxite => Aluminium
		add(OreItems.BAUXITE_ORE.get(), "Bauxite Ore");
		add(OreItems.DEEPSLATE_BAUXITE_ORE.get(), "Deepslate Bauxite Ore");
		add(OreItems.RAW_BAUXITE.get(), "Raw Bauxite");
		add(OreItems.ALUMINIUM_INGOT.get(), "Aluminium Ingot");
		add(OreItems.ALUMINIUM_NUGGET.get(), "Aluminium Nugget");
		add(OreItems.RAW_BAUXITE_BLOCK.get(), "Block of Raw Bauxite");
		add(OreItems.ALUMINIUM_BLOCK.get(), "Aluminium Block");
		
		// Rutile => Titanium
		add(OreItems.RUTILE_ORE.get(), "Rutile Ore");
		add(OreItems.DEEPSLATE_RUTILE_ORE.get(), "Deepslate Rutile Ore");
		add(OreItems.RAW_RUTILE.get(), "Raw Rutile");
		add(OreItems.TITANIUM_INGOT.get(), "Titanium Ingot");
		add(OreItems.RAW_RUTILE_BLOCK.get(), "Block of Raw Rutile");
		add(OreItems.TITANIUM_BLOCK.get(), "Titanium Block");

		// Halite => Salt
		add(OreItems.SAND_HALITE_ORE.get(), "Sand Halite Ore");
		add(OreItems.RED_SAND_HALITE_ORE.get(), "Red Sand Halite Ore");
		add(OreItems.RAW_HALITE.get(), "Raw Halite");
		add(OreItems.RAW_HALITE_BLOCK.get(), "Raw Halite Block");
		
		// Olivine => Silicon
		add(OreItems.OLIVINE_ORE.get(), "Olivine Ore");
		add(OreItems.DEEPSLATE_OLIVINE_ORE.get(), "Deepslate Olivine Ore");
		add(OreItems.RAW_OLIVINE.get(), "Raw Olivine");
		add(OreItems.RAW_OLIVINE_BLOCK.get(), "Raw Olivine Block");
		add(OreItems.SILICON_INGOT.get(), "Silicon Ingot");
		add(OreItems.SILICON_NUGGET.get(), "Silicon Nugget");
		add(OreItems.SILICON_BLOCK.get(), "Silicon Block");
		
		// Silver
		add(OreItems.SILVER_ORE.get(), "Silver Ore");
		add(OreItems.DEEPSLATE_SILVER_ORE.get(), "Deepslate Silver Ore");
		add(OreItems.RAW_SILVER.get(), "Raw Silver");
		add(OreItems.SILVER_INGOT.get(), "Silver Ingot"); 
		add(OreItems.RAW_SILVER_BLOCK.get(), "Block of Raw Silver");
		add(OreItems.SILVER_BLOCK.get(), "Silver Block"); 
		
		// Citrine
		add(OreItems.CITRINE.get(), "Citrine"); 
		add(OreItems.NETHERRACK_CITRINE_ORE.get(), "Nether Citrine Ore");
		
		// Galena -> Lead
		add(OreItems.GALENA_ORE.get(), "Galena Ore");
		add(OreItems.RAW_GALENA.get(), "Raw Galena");
		add(OreItems.LEAD_INGOT.get(), "Lead Ingot"); 
		add(OreItems.RAW_GALENA_BLOCK.get(), "Block of Raw Galena");
		add(OreItems.LEAD_BLOCK.get(), "Block of Lead");
		add(OreItems.LEAD_NUGGET.get(), "Lead Nugget");
		
		// Black diamond
		add(OreItems.BLACK_DIAMOND.get(), "Black Diamond"); 
		add(OreItems.RED_SAND_BLACK_DIAMOND_ORE.get(), "Red Sand Black Diamond Ore"); 
		add(OreItems.SAND_BLACK_DIAMOND_ORE.get(), "Sand Black Diamond Ore"); 
	}
	

}