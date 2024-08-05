package ba.minecraft.uniquematerials.datagen.loot;

import java.util.Set;

import ba.minecraft.uniquematerials.common.blocks.OreBlocks;
import ba.minecraft.uniquematerials.common.items.OreItems;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public final class OreBlockLootSubProvider extends BlockLootSubProvider {

	protected OreBlockLootSubProvider(Provider provider) {
		super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
	}

	@Override
	protected void generate() {

		// Rutile -> Titanium
		
		add(OreBlocks.RUTILE_ORE.get(), (oreBlock) -> {
	    	return createOreDrop(oreBlock, OreItems.RAW_RUTILE.get());
		});

		add(OreBlocks.DEEPSLATE_RUTILE_ORE.get(), (oreBlock) -> {
	    	return createOreDrop(oreBlock, OreItems.RAW_RUTILE.get());
		});
		
		dropSelf(OreBlocks.RAW_RUTILE_BLOCK.get());
		dropSelf(OreBlocks.TITANIUM_BLOCK.get());
		
		// Bauxite -> Aluminium

		add(OreBlocks.BAUXITE_ORE.get(), (oreBlock) -> {
	    	return createOreDrop(oreBlock, OreItems.RAW_BAUXITE.get());
		});
		
		add(OreBlocks.DEEPSLATE_BAUXITE_ORE.get(), (oreBlock) -> {
	    	return createOreDrop(oreBlock, OreItems.RAW_BAUXITE.get());
		});
		
		dropSelf(OreBlocks.RAW_BAUXITE_BLOCK.get());
		dropSelf(OreBlocks.ALUMINIUM_BLOCK.get());

		// Halite
		
		add(OreBlocks.RED_SANDSTONE_HALITE_ORE.get(), (oreBlock) -> {
	    	return createOreDrop(oreBlock, OreItems.RAW_HALITE.get());
		});
		
		add(OreBlocks.SANDSTONE_HALITE_ORE.get(), (oreBlock) -> {
	    	return createOreDrop(oreBlock, OreItems.RAW_HALITE.get());
		});
		
		dropSelf(OreBlocks.RAW_HALITE_BLOCK.get());
		
		// Olivine -> Silicon
		
		add(OreBlocks.OLIVINE_ORE.get(), (oreBlock) -> {
	    	return createOreDrop(oreBlock, OreItems.RAW_OLIVINE.get());
		});
		
		add(OreBlocks.DEEPSLATE_OLIVINE_ORE.get(), (oreBlock) -> {
	    	return createOreDrop(oreBlock, OreItems.RAW_OLIVINE.get());
		});
		
		dropSelf(OreBlocks.SILICON_BLOCK.get());
		dropSelf(OreBlocks.RAW_OLIVINE_BLOCK.get());
		
		// Silver
		
		add(OreBlocks.SILVER_ORE.get(), (oreBlock) -> { 
		    return createOreDrop(oreBlock, OreItems.RAW_SILVER.get()); 
		}); 

		add(OreBlocks.DEEPSLATE_SILVER_ORE.get(), (oreBlock) -> { 
		    return createOreDrop(oreBlock, OreItems.RAW_SILVER.get()); 
		});
		
		dropSelf(OreBlocks.RAW_SILVER_BLOCK.get());
		dropSelf(OreBlocks.SILVER_BLOCK.get());
		
		// Citrine
		
		add(OreBlocks.NETHERRACK_CITRINE_ORE.get(), (oreBlock) -> {
	    	return createOreDrop(oreBlock, OreItems.CITRINE.get());
		});
		
		// Galena => Lead
		
		add(OreBlocks.GALENA_ORE.get(), (oreBlock) -> {
	    	return createOreDrop(oreBlock, OreItems.RAW_GALENA.get());
		});
		dropSelf(OreBlocks.RAW_GALENA_BLOCK.get());
		dropSelf(OreBlocks.LEAD_BLOCK.get());
		
		// Black diamond

		add(OreBlocks.SANDSTONE_BLACK_DIAMOND_ORE.get(), (oreBlock) -> {
	    	return createOreDrop(oreBlock, OreItems.BLACK_DIAMOND.get());
		});
		add(OreBlocks.RED_SANDSTONE_BLACK_DIAMOND_ORE.get(), (oreBlock) -> {
	    	return createOreDrop(oreBlock, OreItems.BLACK_DIAMOND.get());
		});
		
	}
	
	@Override
	protected Iterable<Block> getKnownBlocks() {
		return OreBlocks.REGISTRY.getEntries().stream().map(RegistryObject::get)::iterator;
	}

}