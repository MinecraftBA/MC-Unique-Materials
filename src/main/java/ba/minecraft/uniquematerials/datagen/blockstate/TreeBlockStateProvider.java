package ba.minecraft.uniquematerials.datagen.blockstate;

import ba.minecraft.uniquematerials.common.blocks.TreeBlocks;
import ba.minecraft.uniquematerials.common.blocks.tree.LogBlock;
import ba.minecraft.uniquematerials.common.blocks.tree.TreeLeavesBlock;
import ba.minecraft.uniquematerials.common.blocks.tree.TreeSaplingBlock;
import ba.minecraft.uniquematerials.common.blocks.tree.WoodBlock;
import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import ba.minecraft.uniquematerials.datagen.blockstate.base.BaseBlockStateProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public final class TreeBlockStateProvider extends BaseBlockStateProvider {

	public TreeBlockStateProvider(PackOutput packOutput, ExistingFileHelper exFileHelper) {
		super(packOutput, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		
		logBlock(TreeBlocks.BEECH_LOG.get());
		logBlock(TreeBlocks.STRIPPED_BEECH_LOG.get());
		woodBlock(TreeBlocks.BEECH_WOOD.get(), TreeBlocks.BEECH_LOG.get());
		woodBlock(TreeBlocks.STRIPPED_BEECH_WOOD.get(), TreeBlocks.STRIPPED_BEECH_LOG.get());
		simpleBlock(TreeBlocks.BEECH_PLANKS.get());
		saplingBlock(TreeBlocks.BEECH_SAPLING.get());
		leavesBlock(TreeBlocks.BEECH_LEAVES.get());
		
		logBlock(TreeBlocks.MAHOGANY_LOG.get());
		logBlock(TreeBlocks.STRIPPED_MAHOGANY_LOG.get());
		woodBlock(TreeBlocks.MAHOGANY_WOOD.get(), TreeBlocks.MAHOGANY_LOG.get());
		woodBlock(TreeBlocks.STRIPPED_MAHOGANY_WOOD.get(), TreeBlocks.STRIPPED_MAHOGANY_LOG.get());
		simpleBlock(TreeBlocks.MAHOGANY_PLANKS.get());
		saplingBlock(TreeBlocks.MAHOGANY_SAPLING.get());
		leavesBlock(TreeBlocks.MAHOGANY_LEAVES.get());
		
		logBlock(TreeBlocks.SEQUOIA_LOG.get());
		logBlock(TreeBlocks.STRIPPED_SEQUOIA_LOG.get());
		woodBlock(TreeBlocks.SEQUOIA_WOOD.get(), TreeBlocks.SEQUOIA_LOG.get());
		woodBlock(TreeBlocks.STRIPPED_SEQUOIA_WOOD.get(), TreeBlocks.STRIPPED_SEQUOIA_LOG.get());
		simpleBlock(TreeBlocks.SEQUOIA_PLANKS.get());
		saplingBlock(TreeBlocks.SEQUOIA_SAPLING.get());
		leavesBlock(TreeBlocks.SEQUOIA_LEAVES.get());
		
	}
	
	protected void woodBlock(WoodBlock woodBlock, LogBlock logBlock) {
		String logBlockPath = ForgeRegistries.BLOCKS.getKey(logBlock).getPath();
		ResourceLocation logBlockLocation = ResourceLocation.fromNamespaceAndPath(UniqueMaterialsMod.MODID, "block/" + logBlockPath);
		axisBlock(woodBlock, logBlockLocation, logBlockLocation);
	}

	protected void leavesBlock(TreeLeavesBlock block) {
		String path = ForgeRegistries.BLOCKS.getKey(block).getPath();
		ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(UniqueMaterialsMod.MODID, "block/" + path);
		ResourceLocation parent = ResourceLocation.withDefaultNamespace("block/leaves");

		BlockModelBuilder modelBuilder = models()
				.singleTexture(path, parent, "all", texture)
				.renderType(cutout());
		
		simpleBlock(block, modelBuilder);
	}

	protected void saplingBlock(TreeSaplingBlock block) {
		String path = ForgeRegistries.BLOCKS.getKey(block).getPath();
		ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(UniqueMaterialsMod.MODID, "block/" + path);
		
		BlockModelBuilder modelBuilder = models()
				.cross(path, texture)
				.renderType(cutout());
		
		simpleBlock(block, modelBuilder);
	}

}