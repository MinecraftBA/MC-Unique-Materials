package ba.minecraft.uniquematerials.common.items;

import java.util.function.Supplier;

import ba.minecraft.uniquematerials.common.blocks.TreeBlocks;
import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import ba.minecraft.uniquematerials.common.items.base.BaseItemRegistry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class TreeItems extends BaseItemRegistry {

	private TreeItems() {}
	
	public static final DeferredRegister<Item> REGISTRY = 
			DeferredRegister.create(ForgeRegistries.ITEMS, UniqueMaterialsMod.MODID);

	private static RegistryObject<BlockItem> registerWoodBlockItem(String name, Supplier<Block> supplier) {
		return registerBlockItem(REGISTRY, name, supplier, CreativeModeTab.TAB_BUILDING_BLOCKS);
	}

	private static RegistryObject<BlockItem> registerLeavesBlockItem(String name, Supplier<Block> supplier) {
		return registerBlockItem(REGISTRY, name, supplier, CreativeModeTab.TAB_DECORATIONS);
	}

	private static RegistryObject<BlockItem> registerSaplingBlockItem(String name, Supplier<Block> supplier) {
		return registerBlockItem(REGISTRY, name, supplier, CreativeModeTab.TAB_DECORATIONS);
	}

	// Beech items
	
	public static final RegistryObject<BlockItem> BEECH_LOG = 
			registerWoodBlockItem("beech_log", () -> TreeBlocks.BEECH_LOG.get());
	
	public static final RegistryObject<BlockItem> STRIPPED_BEECH_LOG = 
			registerWoodBlockItem("stripped_beech_log", () -> TreeBlocks.STRIPPED_BEECH_LOG.get());

	public static final RegistryObject<BlockItem> BEECH_WOOD = 
			registerWoodBlockItem("beech_wood", () -> TreeBlocks.BEECH_WOOD.get());
	
	public static final RegistryObject<BlockItem> STRIPPED_BEECH_WOOD = 
			registerWoodBlockItem("stripped_beech_wood", () -> TreeBlocks.STRIPPED_BEECH_WOOD.get());

	public static final RegistryObject<BlockItem> BEECH_SAPLING = 
			registerSaplingBlockItem("beech_sapling", () -> TreeBlocks.BEECH_SAPLING.get());

	public static final RegistryObject<BlockItem> BEECH_LEAVES = 
			registerLeavesBlockItem("beech_leaves", () -> TreeBlocks.BEECH_LEAVES.get());

	public static final RegistryObject<BlockItem> BEECH_PLANKS = 
			registerWoodBlockItem("beech_planks", () -> TreeBlocks.BEECH_PLANKS.get());

	// Mahogany items
	
	public static final RegistryObject<BlockItem> MAHOGANY_LOG = 
			registerWoodBlockItem("mahogany_log", () -> TreeBlocks.MAHOGANY_LOG.get());
	
	public static final RegistryObject<BlockItem> STRIPPED_MAHOGANY_LOG = 
			registerWoodBlockItem("stripped_mahogany_log", () -> TreeBlocks.STRIPPED_MAHOGANY_LOG.get());

	public static final RegistryObject<BlockItem> MAHOGANY_WOOD = 
			registerWoodBlockItem("mahogany_wood", () -> TreeBlocks.MAHOGANY_WOOD.get());
	
	public static final RegistryObject<BlockItem> STRIPPED_MAHOGANY_WOOD = 
			registerWoodBlockItem("stripped_mahogany_wood", () -> TreeBlocks.STRIPPED_MAHOGANY_WOOD.get());

	public static final RegistryObject<BlockItem> MAHOGANY_PLANKS = 
			registerWoodBlockItem("mahogany_planks", () -> TreeBlocks.MAHOGANY_PLANKS.get());
	
	public static final RegistryObject<BlockItem> MAHOGANY_LEAVES = 
			registerLeavesBlockItem("mahogany_leaves", () -> TreeBlocks.MAHOGANY_LEAVES.get());
	
	public static final RegistryObject<BlockItem> MAHOGANY_SAPLING = 
			registerSaplingBlockItem("mahogany_sapling", () -> TreeBlocks.MAHOGANY_SAPLING.get());
	
	// Sequoia items
	
	public static final RegistryObject<BlockItem> SEQUOIA_LOG = 
			registerWoodBlockItem("sequoia_log", () -> TreeBlocks.SEQUOIA_LOG.get());
	
	public static final RegistryObject<BlockItem> STRIPPED_SEQUOIA_LOG = 
			registerWoodBlockItem("stripped_sequoia_log", () -> TreeBlocks.STRIPPED_SEQUOIA_LOG.get());

	public static final RegistryObject<BlockItem> SEQUOIA_WOOD = 
			registerWoodBlockItem("sequoia_wood", () -> TreeBlocks.SEQUOIA_WOOD.get());
	
	public static final RegistryObject<BlockItem> STRIPPED_SEQUOIA_WOOD = 
			registerWoodBlockItem("stripped_sequoia_wood", () -> TreeBlocks.STRIPPED_SEQUOIA_WOOD.get());

	public static final RegistryObject<BlockItem> SEQUOIA_SAPLING = 
			registerSaplingBlockItem("sequoia_sapling", () -> TreeBlocks.SEQUOIA_SAPLING.get());

	public static final RegistryObject<BlockItem> SEQUOIA_LEAVES = 
			registerLeavesBlockItem("sequoia_leaves", () -> TreeBlocks.SEQUOIA_LEAVES.get());

	public static final RegistryObject<BlockItem> SEQUOIA_PLANKS = 
			registerWoodBlockItem("sequoia_planks", () -> TreeBlocks.SEQUOIA_PLANKS.get());
	
}
