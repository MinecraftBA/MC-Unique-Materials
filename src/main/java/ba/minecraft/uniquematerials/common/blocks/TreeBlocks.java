package ba.minecraft.uniquematerials.common.blocks;

import ba.minecraft.uniquematerials.common.blocks.tree.LogBlock;
import ba.minecraft.uniquematerials.common.blocks.tree.PlanksBlock;
import ba.minecraft.uniquematerials.common.blocks.tree.TreeLeavesBlock;
import ba.minecraft.uniquematerials.common.blocks.tree.TreeSaplingBlock;
import ba.minecraft.uniquematerials.common.blocks.tree.WoodBlock;
import ba.minecraft.uniquematerials.common.colors.TreeMapColors;
import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import ba.minecraft.uniquematerials.common.world.feature.tree.TreeGrowers;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class TreeBlocks {

	private TreeBlocks() {
	}

	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS,
			UniqueMaterialsMod.MODID);

	private static RegistryObject<LogBlock> registerLogBlock(String name, MapColor logColor,
			MapColor barkColor) {
		return REGISTRY.register(name, () -> new LogBlock(logColor, barkColor));
	}

	private static RegistryObject<LogBlock> registerStrippedLogBlock(String name, MapColor logColor) {
		return REGISTRY.register(name, () -> new LogBlock(logColor));
	}

	private static RegistryObject<PlanksBlock> registerPlanksBlock(String name, MapColor logColor) {
		return REGISTRY.register(name, () -> new PlanksBlock(logColor));
	}

	private static RegistryObject<WoodBlock> registerWoodBlock(String name, MapColor barkColor) {
		return REGISTRY.register(name, () -> new WoodBlock(barkColor));
	}

	private static RegistryObject<TreeLeavesBlock> registerLeavesBlock(String name) {
		return REGISTRY.register(name, () -> new TreeLeavesBlock());
	}

	private static RegistryObject<TreeSaplingBlock> registerSaplingBlock(String name, TreeGrower treeGrower) {
		return REGISTRY.register(name, () -> new TreeSaplingBlock(treeGrower));
	}

	// Beech blocks

	public static final RegistryObject<LogBlock> BEECH_LOG = 
			registerLogBlock("beech_log", TreeMapColors.BEECH_LOG,TreeMapColors.BEECH_BARK);

	public static final RegistryObject<LogBlock> STRIPPED_BEECH_LOG = 
			registerStrippedLogBlock("stripped_beech_log", TreeMapColors.BEECH_LOG);

	public static final RegistryObject<WoodBlock> BEECH_WOOD = 
			registerWoodBlock("beech_wood", TreeMapColors.BEECH_BARK);

	public static final RegistryObject<WoodBlock> STRIPPED_BEECH_WOOD = 
			registerWoodBlock("stripped_beech_wood", TreeMapColors.BEECH_LOG);

	public static final RegistryObject<PlanksBlock> BEECH_PLANKS = 
			registerPlanksBlock("beech_planks", TreeMapColors.BEECH_LOG);

	public static final RegistryObject<TreeLeavesBlock> BEECH_LEAVES = 
			registerLeavesBlock("beech_leaves");

	public static final RegistryObject<TreeSaplingBlock> BEECH_SAPLING = 
			registerSaplingBlock("beech_sapling", TreeGrowers.BEECH);

	// Mahogany blocks

	public static final RegistryObject<LogBlock> MAHOGANY_LOG = 
			registerLogBlock("mahogany_log", TreeMapColors.MAHOGANY_LOG, TreeMapColors.MAHOGANY_BARK);

	public static final RegistryObject<LogBlock> STRIPPED_MAHOGANY_LOG = 
			registerStrippedLogBlock("stripped_mahogany_log", TreeMapColors.MAHOGANY_LOG);

	public static final RegistryObject<WoodBlock> MAHOGANY_WOOD = 
			registerWoodBlock("mahogany_wood", TreeMapColors.MAHOGANY_BARK);

	public static final RegistryObject<WoodBlock> STRIPPED_MAHOGANY_WOOD = 
			registerWoodBlock("stripped_mahogany_wood", TreeMapColors.MAHOGANY_LOG);

	public static final RegistryObject<PlanksBlock> MAHOGANY_PLANKS = 
			registerPlanksBlock("mahogany_planks", TreeMapColors.MAHOGANY_LOG);

	public static final RegistryObject<TreeLeavesBlock> MAHOGANY_LEAVES = 
			registerLeavesBlock("mahogany_leaves");

	public static final RegistryObject<TreeSaplingBlock> MAHOGANY_SAPLING = 
			registerSaplingBlock("mahogany_sapling", TreeGrowers.MAHOGANY);

	// Sequoia blocks

	public static final RegistryObject<LogBlock> SEQUOIA_LOG = 
			registerLogBlock("sequoia_log", TreeMapColors.SEQUOIA_LOG, TreeMapColors.SEQUOIA_BARK);

	public static final RegistryObject<LogBlock> STRIPPED_SEQUOIA_LOG = 
			registerStrippedLogBlock("stripped_sequoia_log", TreeMapColors.SEQUOIA_LOG);

	public static final RegistryObject<WoodBlock> SEQUOIA_WOOD = 
			registerWoodBlock("sequoia_wood", TreeMapColors.SEQUOIA_BARK);

	public static final RegistryObject<WoodBlock> STRIPPED_SEQUOIA_WOOD = 
			registerWoodBlock("stripped_sequoia_wood", TreeMapColors.SEQUOIA_LOG);

	public static final RegistryObject<PlanksBlock> SEQUOIA_PLANKS = 
			registerPlanksBlock("sequoia_planks", TreeMapColors.SEQUOIA_LOG);

	public static final RegistryObject<TreeLeavesBlock> SEQUOIA_LEAVES = 
			registerLeavesBlock("sequoia_leaves");

	public static final RegistryObject<TreeSaplingBlock> SEQUOIA_SAPLING = 
			registerSaplingBlock("sequoia_sapling", TreeGrowers.SEQUOIA);

}
