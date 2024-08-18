package ba.minecraft.uniquematerials.datagen.tag.block;

import java.util.concurrent.CompletableFuture;

import ba.minecraft.uniquematerials.common.blocks.OreBlocks;
import ba.minecraft.uniquematerials.common.blocks.TreeBlocks;
import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public final class MinecraftBlockTagsProvider extends BlockTagsProvider {

	public MinecraftBlockTagsProvider(PackOutput packOutput, CompletableFuture<Provider> provider, ExistingFileHelper existingFileHelper) {
		super(packOutput, provider, UniqueMaterialsMod.MODID, existingFileHelper);
	}

	private void addLogTags(Block block) {
		tag(BlockTags.LOGS).add(block);
		tag(BlockTags.LOGS_THAT_BURN).add(block);
		tag(BlockTags.MINEABLE_WITH_AXE).add(block);
	}
	
	private void addPlanksTags(Block block) {
		tag(BlockTags.PLANKS).add(block);
		tag(BlockTags.MINEABLE_WITH_AXE).add(block);
	}

	private void addSaplingTags(Block block) {
		tag(BlockTags.SAPLINGS).add(block);
	}

	private void addLeavesTags(Block block) {
		tag(BlockTags.LEAVES).add(block);
		tag(BlockTags.LAVA_POOL_STONE_CANNOT_REPLACE).add(block);
		tag(BlockTags.MINEABLE_WITH_HOE).add(block);
	}

	@Override
	protected void addTags(Provider pProvider) {

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
	
	tag(BlockTags.NEEDS_DIAMOND_TOOL)
		.add(OreBlocks.RUTILE_ORE.get())
		.add(OreBlocks.DEEPSLATE_RUTILE_ORE.get())
		.add(OreBlocks.RAW_RUTILE_BLOCK.get())
		.add(OreBlocks.TITANIUM_BLOCK.get())
		.add(OreBlocks.RED_SANDSTONE_BLACK_DIAMOND_ORE.get())
		.add(OreBlocks.SANDSTONE_BLACK_DIAMOND_ORE.get());

	// Beech
	
	addLogTags(TreeBlocks.BEECH_LOG.get());
	addLogTags(TreeBlocks.STRIPPED_BEECH_LOG.get());
	addLogTags(TreeBlocks.BEECH_WOOD.get());
	addLogTags(TreeBlocks.STRIPPED_BEECH_WOOD.get());
	addPlanksTags(TreeBlocks.BEECH_PLANKS.get());
	addSaplingTags(TreeBlocks.BEECH_SAPLING.get());
	addLeavesTags(TreeBlocks.BEECH_LEAVES.get());

	// Mahogany
	
	addLogTags(TreeBlocks.MAHOGANY_LOG.get());
	addLogTags(TreeBlocks.STRIPPED_MAHOGANY_LOG.get());
	addLogTags(TreeBlocks.MAHOGANY_WOOD.get());
	addLogTags(TreeBlocks.STRIPPED_MAHOGANY_WOOD.get());
	addPlanksTags(TreeBlocks.MAHOGANY_PLANKS.get());
	addSaplingTags(TreeBlocks.MAHOGANY_SAPLING.get());
	addLeavesTags(TreeBlocks.MAHOGANY_LEAVES.get());
	
	// Sequoia
	
	addLogTags(TreeBlocks.SEQUOIA_LOG.get());
	addLogTags(TreeBlocks.STRIPPED_SEQUOIA_LOG.get());
	addLogTags(TreeBlocks.SEQUOIA_WOOD.get());
	addLogTags(TreeBlocks.STRIPPED_SEQUOIA_WOOD.get());
	addPlanksTags(TreeBlocks.SEQUOIA_PLANKS.get());
	addSaplingTags(TreeBlocks.SEQUOIA_SAPLING.get());
	addLeavesTags(TreeBlocks.SEQUOIA_LEAVES.get());
		
	}

}