package ba.minecraft.uniquematerials.datagen.blockstate;

import ba.minecraft.uniquematerials.common.blocks.OreBlocks;
import ba.minecraft.uniquematerials.datagen.blockstate.base.BaseBlockStateProvider;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;

public final class OreBlockStateProvider extends BaseBlockStateProvider {

	public OreBlockStateProvider(PackOutput packOutput, ExistingFileHelper exFileHelper) {
		super(packOutput, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		
		// Rutile => Titanium
		simpleBlock(OreBlocks.RUTILE_ORE.get());
		simpleBlock(OreBlocks.DEEPSLATE_RUTILE_ORE.get());
		simpleBlock(OreBlocks.RAW_RUTILE_BLOCK.get());
		simpleBlock(OreBlocks.TITANIUM_BLOCK.get());

		// Bauxite => Aluminium
		simpleBlock(OreBlocks.BAUXITE_ORE.get());
		simpleBlock(OreBlocks.DEEPSLATE_BAUXITE_ORE.get());
		simpleBlock(OreBlocks.RAW_BAUXITE_BLOCK.get());
		simpleBlock(OreBlocks.ALUMINIUM_BLOCK.get());

		// Halite => Salt
		simpleBlock(OreBlocks.SANDSTONE_HALITE_ORE.get());
		simpleBlock(OreBlocks.RED_SANDSTONE_HALITE_ORE.get());
		simpleBlock(OreBlocks.RAW_HALITE_BLOCK.get());
		
		// Olivine => Silicon
		simpleBlock(OreBlocks.SILICON_BLOCK.get());
		simpleBlock(OreBlocks.OLIVINE_ORE.get());
		simpleBlock(OreBlocks.RAW_OLIVINE_BLOCK.get());
		simpleBlock(OreBlocks.DEEPSLATE_OLIVINE_ORE.get());
		
		// Silver
		simpleBlock(OreBlocks.SILVER_ORE.get());
		simpleBlock(OreBlocks.DEEPSLATE_SILVER_ORE.get());
		simpleBlock(OreBlocks.RAW_SILVER_BLOCK.get());
		simpleBlock(OreBlocks.SILVER_BLOCK.get());
		
		// Citrine
		simpleBlock(OreBlocks.NETHERRACK_CITRINE_ORE.get());
		
		// Galena => Lead
		simpleBlock(OreBlocks.GALENA_ORE.get());
		simpleBlock(OreBlocks.RAW_GALENA_BLOCK.get());
		simpleBlock(OreBlocks.LEAD_BLOCK.get());

		// Black Diamond
		simpleBlock(OreBlocks.SANDSTONE_BLACK_DIAMOND_ORE.get());
		simpleBlock(OreBlocks.RED_SANDSTONE_BLACK_DIAMOND_ORE.get());
	}
}