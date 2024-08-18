package ba.minecraft.uniquematerials.datagen.loot;

import java.util.Set;

import ba.minecraft.uniquematerials.common.blocks.TreeBlocks;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public final class TreeBlockLootSubProvider extends BlockLootSubProvider {

	protected TreeBlockLootSubProvider(Provider provider) {
		super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
	}

	@Override
	protected void generate() {

		// Beech loot tables
		dropSelf(TreeBlocks.BEECH_LOG.get());
		dropSelf(TreeBlocks.STRIPPED_BEECH_LOG.get());
		dropSelf(TreeBlocks.BEECH_WOOD.get());
		dropSelf(TreeBlocks.STRIPPED_BEECH_WOOD.get());
		dropSelf(TreeBlocks.BEECH_PLANKS.get());
		dropSelf(TreeBlocks.BEECH_SAPLING.get());
	    add(TreeBlocks.BEECH_LEAVES.get(), (leavesBlock) -> {
	          return createLeavesDrops(leavesBlock, TreeBlocks.BEECH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES);
	    });
	    
	    // Mahogany loot tables
	    dropSelf(TreeBlocks.MAHOGANY_LOG.get());
		dropSelf(TreeBlocks.STRIPPED_MAHOGANY_LOG.get());
		dropSelf(TreeBlocks.MAHOGANY_WOOD.get());
		dropSelf(TreeBlocks.STRIPPED_MAHOGANY_WOOD.get());
		dropSelf(TreeBlocks.MAHOGANY_PLANKS.get());
		dropSelf(TreeBlocks.MAHOGANY_SAPLING.get());
	    add(TreeBlocks.MAHOGANY_LEAVES.get(), (leavesBlock) -> {
	          return createLeavesDrops(leavesBlock, TreeBlocks.MAHOGANY_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES);
	    });
	    
		// Sequoia loot tables
		dropSelf(TreeBlocks.SEQUOIA_LOG.get());
		dropSelf(TreeBlocks.STRIPPED_SEQUOIA_LOG.get());
		dropSelf(TreeBlocks.SEQUOIA_WOOD.get());
		dropSelf(TreeBlocks.STRIPPED_SEQUOIA_WOOD.get());
		dropSelf(TreeBlocks.SEQUOIA_PLANKS.get());
		dropSelf(TreeBlocks.SEQUOIA_SAPLING.get());
	    add(TreeBlocks.SEQUOIA_LEAVES.get(), (leavesBlock) -> {
	          return createLeavesDrops(leavesBlock, TreeBlocks.SEQUOIA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES);
	    });
	}
	
	@Override
	protected Iterable<Block> getKnownBlocks() {
		return TreeBlocks.REGISTRY.getEntries().stream().map(RegistryObject::get)::iterator;
	}

}
