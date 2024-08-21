package ba.minecraft.uniquematerials.datagen.tag;

import java.util.concurrent.CompletableFuture;

import ba.minecraft.uniquematerials.common.blocks.OreBlocks;
import ba.minecraft.uniquematerials.common.blocks.TreeBlocks;
import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import ba.minecraft.uniquematerials.common.tags.ModBlockTags;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public final class ModBlockTagsProvider extends BlockTagsProvider {

	public ModBlockTagsProvider(PackOutput packOutput, CompletableFuture<Provider> provider, ExistingFileHelper existingFileHelper) {
		super(packOutput, provider, UniqueMaterialsMod.MODID, existingFileHelper);
	}

	@Override
	protected void addTags(Provider pProvider) {

		addOreTags();
		addTreeTags();

	}
	
	private void addTreeTags() {
		
		// Beech

		tag(ModBlockTags.BEECH_LOGS)
			.add(TreeBlocks.BEECH_LOG.get())
			.add(TreeBlocks.STRIPPED_BEECH_LOG.get())
			.add(TreeBlocks.BEECH_WOOD.get())
			.add(TreeBlocks.STRIPPED_BEECH_WOOD.get());

		addLogTags(TreeBlocks.BEECH_LOG.get());
		addLogTags(TreeBlocks.STRIPPED_BEECH_LOG.get());
		addLogTags(TreeBlocks.BEECH_WOOD.get());
		addLogTags(TreeBlocks.STRIPPED_BEECH_WOOD.get());
		addPlanksTags(TreeBlocks.BEECH_PLANKS.get());
		addSaplingTags(TreeBlocks.BEECH_SAPLING.get());
		addLeavesTags(TreeBlocks.BEECH_LEAVES.get());

		// Mahogany
		
		tag(ModBlockTags.MAHOGANY_LOGS)
			.add(TreeBlocks.MAHOGANY_LOG.get())
			.add(TreeBlocks.STRIPPED_MAHOGANY_LOG.get())
			.add(TreeBlocks.MAHOGANY_WOOD.get())
			.add(TreeBlocks.STRIPPED_MAHOGANY_WOOD.get());

		addLogTags(TreeBlocks.MAHOGANY_LOG.get());
		addLogTags(TreeBlocks.STRIPPED_MAHOGANY_LOG.get());
		addLogTags(TreeBlocks.MAHOGANY_WOOD.get());
		addLogTags(TreeBlocks.STRIPPED_MAHOGANY_WOOD.get());
		addPlanksTags(TreeBlocks.MAHOGANY_PLANKS.get());
		addSaplingTags(TreeBlocks.MAHOGANY_SAPLING.get());
		addLeavesTags(TreeBlocks.MAHOGANY_LEAVES.get());
		
		// Sequoia
		
		tag(ModBlockTags.SEQUOIA_LOGS)
			.add(TreeBlocks.SEQUOIA_LOG.get())
			.add(TreeBlocks.STRIPPED_SEQUOIA_LOG.get())
			.add(TreeBlocks.SEQUOIA_WOOD.get())
			.add(TreeBlocks.STRIPPED_SEQUOIA_WOOD.get());

		addLogTags(TreeBlocks.SEQUOIA_LOG.get());
		addLogTags(TreeBlocks.STRIPPED_SEQUOIA_LOG.get());
		addLogTags(TreeBlocks.SEQUOIA_WOOD.get());
		addLogTags(TreeBlocks.STRIPPED_SEQUOIA_WOOD.get());
		addPlanksTags(TreeBlocks.SEQUOIA_PLANKS.get());
		addSaplingTags(TreeBlocks.SEQUOIA_SAPLING.get());
		addLeavesTags(TreeBlocks.SEQUOIA_LEAVES.get());

	}
	
	private void addOreTags() {

		// Defines which blocks can be replaced by ores that spawn in sandstone.
		tag(ModBlockTags.SANDSTONE_ORE_REPLACEABLES)
			.add(Blocks.SAND)
			.add(Blocks.SANDSTONE);

		// Defines which blocks can be replaced by ores that spawn in red sandstone.
		tag(ModBlockTags.RED_SANDSTONE_ORE_REPLACEABLES)
			.add(Blocks.RED_SAND)
			.add(Blocks.RED_SANDSTONE);

		// Defines which blocks can be replaced by ores that spawn in netherrack.
		tag(ModBlockTags.NETHERRACK_ORE_REPLACEABLES)
			.add(Blocks.NETHERRACK);
		
		// Tags all mod added ores with Forge ore tag.
		tag(Tags.Blocks.ORES)
			.add(OreBlocks.BAUXITE_ORE.get())
			.add(OreBlocks.DEEPSLATE_BAUXITE_ORE.get())
			.add(OreBlocks.RED_SANDSTONE_HALITE_ORE.get())
			.add(OreBlocks.SANDSTONE_HALITE_ORE.get())
			.add(OreBlocks.OLIVINE_ORE.get())
			.add(OreBlocks.DEEPSLATE_OLIVINE_ORE.get())
			.add(OreBlocks.RUTILE_ORE.get())
			.add(OreBlocks.DEEPSLATE_RUTILE_ORE.get())
			.add(OreBlocks.SILVER_ORE.get())
			.add(OreBlocks.DEEPSLATE_SILVER_ORE.get())
			.add(OreBlocks.NETHERRACK_AVENTURINE_ORE.get())
			.add(OreBlocks.NETHERRACK_CITRINE_ORE.get())
			.add(OreBlocks.GALENA_ORE.get())
			.add(OreBlocks.RED_SANDSTONE_BLACK_DIAMOND_ORE.get())
			.add(OreBlocks.SANDSTONE_BLACK_DIAMOND_ORE.get());
		
		// Tags ore blocks to be mineable with pickaxe.
		tag(BlockTags.MINEABLE_WITH_PICKAXE)
			.add(OreBlocks.BAUXITE_ORE.get())
			.add(OreBlocks.GALENA_ORE.get())
			.add(OreBlocks.OLIVINE_ORE.get())
			.add(OreBlocks.RUTILE_ORE.get())
			.add(OreBlocks.SILVER_ORE.get())
			.add(OreBlocks.DEEPSLATE_BAUXITE_ORE.get())
			.add(OreBlocks.DEEPSLATE_OLIVINE_ORE.get())
			.add(OreBlocks.DEEPSLATE_RUTILE_ORE.get())
			.add(OreBlocks.DEEPSLATE_SILVER_ORE.get())
			.add(OreBlocks.NETHERRACK_CITRINE_ORE.get())
			.add(OreBlocks.NETHERRACK_AVENTURINE_ORE.get())
			.add(OreBlocks.AVENTURINE_BLOCK.get())
			.add(OreBlocks.AVENTURINE_BRICKS.get())
			.add(OreBlocks.AVENTURINE_PILLAR.get())
			.add(OreBlocks.AVENTURINE_SLAB.get())
			.add(OreBlocks.AVENTURINE_STAIRS.get())
			.add(OreBlocks.CHISELED_AVENTURINE_BLOCK.get())
			.add(OreBlocks.SMOOTH_AVENTURINE.get())
			.add(OreBlocks.SMOOTH_AVENTURINE_SLAB.get())
			.add(OreBlocks.SMOOTH_AVENTURINE_STAIRS.get())
			.add(OreBlocks.RAW_BAUXITE_BLOCK.get())
			.add(OreBlocks.RAW_GALENA_BLOCK.get())
			.add(OreBlocks.RAW_HALITE_BLOCK.get())
			.add(OreBlocks.RAW_RUTILE_BLOCK.get())
			.add(OreBlocks.RAW_SILVER_BLOCK.get())
			.add(OreBlocks.RED_SANDSTONE_BLACK_DIAMOND_ORE.get())
			.add(OreBlocks.RED_SANDSTONE_HALITE_ORE.get())
			.add(OreBlocks.SANDSTONE_BLACK_DIAMOND_ORE.get())
			.add(OreBlocks.SANDSTONE_HALITE_ORE.get())
			.add(OreBlocks.ALUMINIUM_BLOCK.get())
			.add(OreBlocks.LEAD_BLOCK.get())
			.add(OreBlocks.TITANIUM_BLOCK.get())
			.add(OreBlocks.SILVER_BLOCK.get());;
	
		// Tags ores that require at least iron tool to be mined.
		tag(BlockTags.NEEDS_IRON_TOOL)
			.add(OreBlocks.BAUXITE_ORE.get())
			.add(OreBlocks.GALENA_ORE.get())
			.add(OreBlocks.OLIVINE_ORE.get())
			.add(OreBlocks.SILVER_ORE.get())
			.add(OreBlocks.DEEPSLATE_BAUXITE_ORE.get())
			.add(OreBlocks.DEEPSLATE_OLIVINE_ORE.get())
			.add(OreBlocks.DEEPSLATE_SILVER_ORE.get())
			.add(OreBlocks.RAW_GALENA_BLOCK.get())
			.add(OreBlocks.RAW_SILVER_BLOCK.get())
			.add(OreBlocks.SILVER_BLOCK.get())
			.add(OreBlocks.LEAD_BLOCK.get());
		
		// Tags ores that require at least diamond tool to be mined.
		tag(BlockTags.NEEDS_DIAMOND_TOOL)
			.add(OreBlocks.RUTILE_ORE.get())
			.add(OreBlocks.DEEPSLATE_RUTILE_ORE.get())
			.add(OreBlocks.RAW_RUTILE_BLOCK.get())
			.add(OreBlocks.TITANIUM_BLOCK.get())
			.add(OreBlocks.RED_SANDSTONE_BLACK_DIAMOND_ORE.get())
			.add(OreBlocks.SANDSTONE_BLACK_DIAMOND_ORE.get());

	}
	
	// Adds log specific tags to log block.
	private void addLogTags(Block block) {
		tag(BlockTags.LOGS).add(block);
		tag(BlockTags.LOGS_THAT_BURN).add(block);
		tag(BlockTags.MINEABLE_WITH_AXE).add(block);
	}
	
	// Adds plank specific tags to plank block.
	private void addPlanksTags(Block block) {
		tag(BlockTags.PLANKS).add(block);
		tag(BlockTags.MINEABLE_WITH_AXE).add(block);
	}

	// Adds sapling specific tags to sapling block.
	private void addSaplingTags(Block block) {
		tag(BlockTags.SAPLINGS).add(block);
	}

	// Adds leaves specific tags to leaves block.
	private void addLeavesTags(Block block) {
		tag(BlockTags.LEAVES).add(block);
		tag(BlockTags.LAVA_POOL_STONE_CANNOT_REPLACE).add(block);
		tag(BlockTags.MINEABLE_WITH_HOE).add(block);
	}
}

