package ba.minecraft.uniquematerials.datagen.blockstate;

import ba.minecraft.uniquematerials.common.blocks.OreBlocks;
import ba.minecraft.uniquematerials.common.blocks.TreeBlocks;
import ba.minecraft.uniquematerials.common.blocks.tree.LogBlock;
import ba.minecraft.uniquematerials.common.blocks.tree.TreeLeavesBlock;
import ba.minecraft.uniquematerials.common.blocks.tree.TreeSaplingBlock;
import ba.minecraft.uniquematerials.common.blocks.tree.WoodBlock;
import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModBlockStateProvider extends BlockStateProvider {

	public ModBlockStateProvider(PackOutput packOutput, ExistingFileHelper exFileHelper) {
		super(packOutput, UniqueMaterialsMod.MODID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		
		registerOreStatesAndModels();
		registerTreeStatesAndModels();

	}
	
	private void registerTreeStatesAndModels() {
		
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
	
	private void registerOreStatesAndModels() {
		
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

		// Aventurine
		simpleBlock(OreBlocks.NETHERRACK_AVENTURINE_ORE.get());

		// Galena => Lead
		simpleBlock(OreBlocks.GALENA_ORE.get());
		simpleBlock(OreBlocks.RAW_GALENA_BLOCK.get());
		simpleBlock(OreBlocks.LEAD_BLOCK.get());

		// Black Diamond
		simpleBlock(OreBlocks.SANDSTONE_BLACK_DIAMOND_ORE.get());
		simpleBlock(OreBlocks.RED_SANDSTONE_BLACK_DIAMOND_ORE.get());
	}
	
	private void woodBlock(WoodBlock woodBlock, LogBlock logBlock) {
		String logBlockPath = ForgeRegistries.BLOCKS.getKey(logBlock).getPath();
		ResourceLocation logBlockLocation = ResourceLocation.fromNamespaceAndPath(UniqueMaterialsMod.MODID, "block/" + logBlockPath);
		axisBlock(woodBlock, logBlockLocation, logBlockLocation);
	}

	private void leavesBlock(TreeLeavesBlock block) {
		String path = ForgeRegistries.BLOCKS.getKey(block).getPath();
		ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(UniqueMaterialsMod.MODID, "block/" + path);
		ResourceLocation parent = ResourceLocation.withDefaultNamespace("block/leaves");

		BlockModelBuilder modelBuilder = models()
				.singleTexture(path, parent, "all", texture)
				.renderType(cutout());
		
		simpleBlock(block, modelBuilder);
	}

	private void saplingBlock(TreeSaplingBlock block) {
		String path = ForgeRegistries.BLOCKS.getKey(block).getPath();
		ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(UniqueMaterialsMod.MODID, "block/" + path);
		
		BlockModelBuilder modelBuilder = models()
				.cross(path, texture)
				.renderType(cutout());
		
		simpleBlock(block, modelBuilder);
	}
	
	private String getRenderTypeName(RenderType renderType) {
		String renderTypeName = renderType.toString().replace("RenderType[", "");
		int colonPosition = renderTypeName.indexOf(':');
		renderTypeName = renderTypeName.substring(0, colonPosition);
		return renderTypeName;
	}
	
	private String cutout() {
		return getRenderTypeName(RenderType.cutout());
	}
}