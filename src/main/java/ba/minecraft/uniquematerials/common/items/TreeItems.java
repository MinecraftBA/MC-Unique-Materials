package ba.minecraft.uniquematerials.common.items;

import ba.minecraft.uniquematerials.common.blocks.TreeBlocks;
import ba.minecraft.uniquematerials.common.items.base.BaseItemRegistry;
import net.minecraft.world.item.BlockItem;
import net.minecraftforge.registries.RegistryObject;

public final class TreeItems extends BaseItemRegistry {

	private TreeItems() {}
	
	// Beech items
	
	public static final RegistryObject<BlockItem> BEECH_LOG = 
			registerBlockItem("beech_log", () -> TreeBlocks.BEECH_LOG.get());
	
	public static final RegistryObject<BlockItem> STRIPPED_BEECH_LOG = 
			registerBlockItem("stripped_beech_log", () -> TreeBlocks.STRIPPED_BEECH_LOG.get());

	public static final RegistryObject<BlockItem> BEECH_WOOD = 
			registerBlockItem("beech_wood", () -> TreeBlocks.BEECH_WOOD.get());
	
	public static final RegistryObject<BlockItem> STRIPPED_BEECH_WOOD = 
			registerBlockItem("stripped_beech_wood", () -> TreeBlocks.STRIPPED_BEECH_WOOD.get());

	public static final RegistryObject<BlockItem> BEECH_SAPLING = 
			registerBlockItem("beech_sapling", () -> TreeBlocks.BEECH_SAPLING.get());

	public static final RegistryObject<BlockItem> BEECH_LEAVES = 
			registerBlockItem("beech_leaves", () -> TreeBlocks.BEECH_LEAVES.get());

	public static final RegistryObject<BlockItem> BEECH_PLANKS = 
			registerBlockItem("beech_planks", () -> TreeBlocks.BEECH_PLANKS.get());

	// Mahogany items
	
	public static final RegistryObject<BlockItem> MAHOGANY_LOG = 
			registerBlockItem("mahogany_log", () -> TreeBlocks.MAHOGANY_LOG.get());
	
	public static final RegistryObject<BlockItem> STRIPPED_MAHOGANY_LOG = 
			registerBlockItem("stripped_mahogany_log", () -> TreeBlocks.STRIPPED_MAHOGANY_LOG.get());

	public static final RegistryObject<BlockItem> MAHOGANY_WOOD = 
			registerBlockItem("mahogany_wood", () -> TreeBlocks.MAHOGANY_WOOD.get());
	
	public static final RegistryObject<BlockItem> STRIPPED_MAHOGANY_WOOD = 
			registerBlockItem("stripped_mahogany_wood", () -> TreeBlocks.STRIPPED_MAHOGANY_WOOD.get());

	public static final RegistryObject<BlockItem> MAHOGANY_PLANKS = 
			registerBlockItem("mahogany_planks", () -> TreeBlocks.MAHOGANY_PLANKS.get());
	
	public static final RegistryObject<BlockItem> MAHOGANY_LEAVES = 
			registerBlockItem("mahogany_leaves", () -> TreeBlocks.MAHOGANY_LEAVES.get());
	
	public static final RegistryObject<BlockItem> MAHOGANY_SAPLING = 
			registerBlockItem("mahogany_sapling", () -> TreeBlocks.MAHOGANY_SAPLING.get());
	
	// Sequoia items
	
	public static final RegistryObject<BlockItem> SEQUOIA_LOG = 
			registerBlockItem("sequoia_log", () -> TreeBlocks.SEQUOIA_LOG.get());
	
	public static final RegistryObject<BlockItem> STRIPPED_SEQUOIA_LOG = 
			registerBlockItem("stripped_sequoia_log", () -> TreeBlocks.STRIPPED_SEQUOIA_LOG.get());

	public static final RegistryObject<BlockItem> SEQUOIA_WOOD = 
			registerBlockItem("sequoia_wood", () -> TreeBlocks.SEQUOIA_WOOD.get());
	
	public static final RegistryObject<BlockItem> STRIPPED_SEQUOIA_WOOD = 
			registerBlockItem("stripped_sequoia_wood", () -> TreeBlocks.STRIPPED_SEQUOIA_WOOD.get());

	public static final RegistryObject<BlockItem> SEQUOIA_SAPLING = 
			registerBlockItem("sequoia_sapling", () -> TreeBlocks.SEQUOIA_SAPLING.get());

	public static final RegistryObject<BlockItem> SEQUOIA_LEAVES = 
			registerBlockItem("sequoia_leaves", () -> TreeBlocks.SEQUOIA_LEAVES.get());

	public static final RegistryObject<BlockItem> SEQUOIA_PLANKS = 
			registerBlockItem("sequoia_planks", () -> TreeBlocks.SEQUOIA_PLANKS.get());
	
}
