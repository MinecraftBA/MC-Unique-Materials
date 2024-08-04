package ba.minecraft.uniquematerials.datagen.model.item;

import ba.minecraft.uniquematerials.common.items.OreItems;
import ba.minecraft.uniquematerials.datagen.model.item.base.BaseItemModelProvider;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;

public final class OreItemModelProvider extends BaseItemModelProvider {

	public OreItemModelProvider(PackOutput packOutput, ExistingFileHelper exFileHelper) {
		super(packOutput, exFileHelper);
	}

	@Override
	protected void registerModels() {

		// Rutile => Titanium

		blockItem(OreItems.RUTILE_ORE.get());
		blockItem(OreItems.DEEPSLATE_RUTILE_ORE.get());
		generated(OreItems.RAW_RUTILE.get());
		generated(OreItems.TITANIUM_INGOT.get());
		blockItem(OreItems.RAW_RUTILE_BLOCK.get());
		blockItem(OreItems.TITANIUM_BLOCK.get());

		// Bauxite => Aluminium
		blockItem(OreItems.BAUXITE_ORE.get());
		blockItem(OreItems.DEEPSLATE_BAUXITE_ORE.get());
		generated(OreItems.RAW_BAUXITE.get());
		generated(OreItems.ALUMINIUM_INGOT.get());
		generated(OreItems.ALUMINIUM_NUGGET.get());
		blockItem(OreItems.RAW_BAUXITE_BLOCK.get());
		blockItem(OreItems.ALUMINIUM_BLOCK.get());
		
		blockItem(OreItems.SAND_HALITE_ORE.get());
		blockItem(OreItems.RED_SAND_HALITE_ORE.get());
		blockItem(OreItems.RAW_HALITE_BLOCK.get());
		generated(OreItems.RAW_HALITE.get());

		generated(OreItems.RAW_OLIVINE.get());
		generated(OreItems.SILICON_INGOT.get());
		generated(OreItems.SILICON_NUGGET.get());
		blockItem(OreItems.OLIVINE_ORE.get());
		blockItem(OreItems.RAW_OLIVINE_BLOCK.get());
		blockItem(OreItems.DEEPSLATE_OLIVINE_ORE.get());
		blockItem(OreItems.SILICON_BLOCK.get());
		
		// Silver Ore -> Silver
		blockItem(OreItems.SILVER_ORE.get());
		blockItem(OreItems.DEEPSLATE_SILVER_ORE.get());
		generated(OreItems.RAW_SILVER.get());
		generated(OreItems.SILVER_INGOT.get());
		blockItem(OreItems.RAW_SILVER_BLOCK.get());
		blockItem(OreItems.SILVER_BLOCK.get());
		
		// Citrine
		
		generated(OreItems.CITRINE.get());
		blockItem(OreItems.NETHERRACK_CITRINE_ORE.get());
		
		// Galena == lead
		
		blockItem(OreItems.GALENA_ORE.get());
		generated(OreItems.LEAD_NUGGET.get());
		generated(OreItems.RAW_GALENA.get());
		generated(OreItems.LEAD_INGOT.get());
		blockItem(OreItems.RAW_GALENA_BLOCK.get());
		blockItem(OreItems.LEAD_BLOCK.get());

		// Black diamond
		
		blockItem(OreItems.RED_SAND_BLACK_DIAMOND_ORE.get());
		blockItem(OreItems.SAND_BLACK_DIAMOND_ORE.get());
	}

}
