package ba.minecraft.uniquematerials.datagen.blockstate;

import ba.minecraft.uniquematerials.common.blocks.OreBlocks;
import ba.minecraft.uniquematerials.common.blocks.TreeBlocks;
import ba.minecraft.uniquematerials.common.blocks.tree.LogBlock;
import ba.minecraft.uniquematerials.common.blocks.tree.TreeLeavesBlock;
import ba.minecraft.uniquematerials.common.blocks.tree.TreeSaplingBlock;
import ba.minecraft.uniquematerials.common.blocks.tree.WoodBlock;
import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import ba.minecraft.uniquematerials.common.helpers.resource.ModResourceHelper;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
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
		quartzVariantBlock(OreBlocks.CITRINE_BLOCK.get());
		simpleBlock(OreBlocks.CITRINE_BRICKS.get());
		quartzVariantPillarBlock(OreBlocks.CITRINE_PILLAR.get());
		quartzVariantStairsBlock(OreBlocks.CITRINE_STAIRS.get(), OreBlocks.CITRINE_BLOCK.get());
		quartzVariantSlabBlock(OreBlocks.CITRINE_SLAB.get(), OreBlocks.CITRINE_BLOCK.get());
		quartzVariantChiseledBlock(OreBlocks.CHISELED_CITRINE_BLOCK.get());
		quartzVariantSmoothBlock(OreBlocks.SMOOTH_CITRINE.get(), OreBlocks.CITRINE_BLOCK.get());
		quartzVariantSmoothSlabBlock(OreBlocks.SMOOTH_CITRINE_SLAB.get(), OreBlocks.CITRINE_BLOCK.get());
		quartzVariantSmoothStairsBlock(OreBlocks.SMOOTH_CITRINE_STAIRS.get(), OreBlocks.CITRINE_BLOCK.get());

		// Aventurine
		simpleBlock(OreBlocks.NETHERRACK_AVENTURINE_ORE.get());
		quartzVariantBlock(OreBlocks.AVENTURINE_BLOCK.get());
		simpleBlock(OreBlocks.AVENTURINE_BRICKS.get());
		quartzVariantPillarBlock(OreBlocks.AVENTURINE_PILLAR.get());
		quartzVariantStairsBlock(OreBlocks.AVENTURINE_STAIRS.get(), OreBlocks.AVENTURINE_BLOCK.get());
		quartzVariantSlabBlock(OreBlocks.AVENTURINE_SLAB.get(), OreBlocks.AVENTURINE_BLOCK.get());
		quartzVariantChiseledBlock(OreBlocks.CHISELED_AVENTURINE_BLOCK.get());
		quartzVariantSmoothBlock(OreBlocks.SMOOTH_AVENTURINE.get(), OreBlocks.AVENTURINE_BLOCK.get());
		quartzVariantSmoothSlabBlock(OreBlocks.SMOOTH_AVENTURINE_SLAB.get(), OreBlocks.AVENTURINE_BLOCK.get());
		quartzVariantSmoothStairsBlock(OreBlocks.SMOOTH_AVENTURINE_STAIRS.get(), OreBlocks.AVENTURINE_BLOCK.get());

		// Galena => Lead
		simpleBlock(OreBlocks.GALENA_ORE.get());
		simpleBlock(OreBlocks.RAW_GALENA_BLOCK.get());
		simpleBlock(OreBlocks.LEAD_BLOCK.get());

		// Black Diamond
		simpleBlock(OreBlocks.SANDSTONE_BLACK_DIAMOND_ORE.get());
		simpleBlock(OreBlocks.RED_SANDSTONE_BLACK_DIAMOND_ORE.get());
	}
	
	private void woodBlock(WoodBlock woodBlock, LogBlock logBlock) {
		String logRegistryName = registryName(logBlock);
		ResourceLocation logBlockLocation = ModResourceHelper.create("block/" + logRegistryName);
		axisBlock(woodBlock, logBlockLocation, logBlockLocation);
	}

	private void leavesBlock(TreeLeavesBlock block) {
		String registryName = registryName(block);
		ResourceLocation texture = ModResourceHelper.create("block/" + registryName);
		ResourceLocation parent = ResourceLocation.withDefaultNamespace("block/leaves");

		BlockModelBuilder modelBuilder = models()
				.singleTexture(registryName, parent, "all", texture)
				.renderType(cutout());
		
		simpleBlock(block, modelBuilder);
	}

	private void saplingBlock(TreeSaplingBlock block) {
		String path = registryName(block);
		ResourceLocation texture =  ModResourceHelper.create("block/" + path);
		
		BlockModelBuilder modelBuilder = models()
				.cross(path, texture)
				.renderType(cutout());
		
		simpleBlock(block, modelBuilder);
	}

	private void cubeColumnBlock(Block block, String sideSuffix, String topSuffix) {
		
		// eg: block/aventurine_block
		String registryName = registryName(block);
		
		// eg: block/aventurine_block_side
		ResourceLocation sideTextureLocation = textureResourceLocation(block, sideSuffix);

		// eg: block/aventurine_block_top
		ResourceLocation endTextureLocation = textureResourceLocation(block, topSuffix);

		BlockModelBuilder modelBuilder = models()
				.cubeColumn(registryName, sideTextureLocation, endTextureLocation);
		
		simpleBlock(block, modelBuilder);
	}
	
	private void quartzVariantChiseledBlock(Block block) {
		cubeColumnBlock(block, "", "_top");
	}

	private void quartzVariantBlock(Block block) {
		cubeColumnBlock(block, "_side", "_top");
	}
	
	private void quartzVariantSmoothBlock(Block smoothBlock, Block block) {
		
		// eg: block/aventurine_block_bottom
		ResourceLocation textureLocation = textureResourceLocation(block, "_bottom");
		
		simpleBlock(smoothBlock, textureLocation);
	}
	
    public void simpleBlock(Block block, ResourceLocation textureLocation) {
        simpleBlock(block, cubeAll(block, textureLocation));
    }
    
    public ModelFile cubeAll(Block block, ResourceLocation textureLocation) {
        return models().cubeAll(registryName(block), textureLocation);
    }

	private void quartzVariantPillarBlock(RotatedPillarBlock block) {
		
		// eg: block/aventurine_pillar_block
		ResourceLocation sideTextureLocation = textureResourceLocation(block);
		
		// eg: block/aventurine_pillar_block_top
		ResourceLocation endTextureLocation = textureResourceLocation(block, "_top");
		
		axisBlock(block, sideTextureLocation, endTextureLocation);
	}
	
	private void quartzVariantSlabBlock(SlabBlock slabBlock, Block block) 
	{
		// Eg: block/aventurine_slab_top
		String doublesName = registryName(slabBlock) + "_top";
		ResourceLocation doubleResourceLocation = ModResourceHelper.create(doublesName);
		
		// Eg: block/aventurine_block_top and blocks/aventurine_block_side
		ResourceLocation topTextureLocation = textureResourceLocation(block, "_top");
		ResourceLocation sideTextureLocation = textureResourceLocation(block, "_side");
		
		slabBlock(slabBlock, doubleResourceLocation, sideTextureLocation, topTextureLocation, topTextureLocation);
	}
	
	private void quartzVariantSmoothSlabBlock(SlabBlock slabBlock, Block block) 
	{
		// Eg: block/aventurine_slab_top
		String doublesName = registryName(slabBlock) + "_top";
		ResourceLocation doubleResourceLocation = ModResourceHelper.create(doublesName);
		
		// Eg: block/aventurine_block_top and blocks/aventurine_block_side
		ResourceLocation bottomTextureLocation = textureResourceLocation(block, "_bottom");
		
		slabBlock(slabBlock, doubleResourceLocation, bottomTextureLocation, bottomTextureLocation, bottomTextureLocation);
	}
	
	private void quartzVariantStairsBlock(StairBlock stairsBlock, Block block) 
	{
		// Eg: block/aventurine_block_top and blocks/aventurine_block_side
		ResourceLocation topTextureLocation = textureResourceLocation(block, "_top");
		ResourceLocation sideTextureLocation = textureResourceLocation(block, "_side");
		
		stairsBlock(stairsBlock, sideTextureLocation, topTextureLocation, topTextureLocation);
	}
	
	private void quartzVariantSmoothStairsBlock(StairBlock stairsBlock, Block block) 
	{
		// Eg: block/aventurine_block_top and blocks/aventurine_block_side
		ResourceLocation bottomTextureLocation = textureResourceLocation(block, "_bottom");
		
		stairsBlock(stairsBlock, bottomTextureLocation, bottomTextureLocation, bottomTextureLocation);
	}
	
	private String getRenderTypeName(RenderType renderType) {
		String renderTypeName = renderType.toString().replace("RenderType[", "");
		int colonPosition = renderTypeName.indexOf(':');
		renderTypeName = renderTypeName.substring(0, colonPosition);
		return renderTypeName;
	}
	
    private String registryName(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block).getPath();
    }
    
	private String cutout() {
		return getRenderTypeName(RenderType.cutout());
	}
	
	private ResourceLocation textureResourceLocation(Block block) {
		String registryName = registryName(block);
		return ModResourceHelper.create("block/" + registryName);
	}
	
	private ResourceLocation textureResourceLocation(Block block, String suffix) {
		String registryName = registryName(block);
		return ModResourceHelper.create("block/" + registryName + suffix);
	}

}