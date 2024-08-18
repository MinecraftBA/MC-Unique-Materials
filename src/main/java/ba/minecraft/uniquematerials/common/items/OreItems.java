package ba.minecraft.uniquematerials.common.items;

import ba.minecraft.uniquematerials.common.blocks.OreBlocks;
import ba.minecraft.uniquematerials.common.items.base.BaseItemRegistry;
import ba.minecraft.uniquematerials.common.items.base.GemstoneItem;
import ba.minecraft.uniquematerials.common.items.base.IngotItem;
import ba.minecraft.uniquematerials.common.items.base.NuggetItem;
import ba.minecraft.uniquematerials.common.items.base.RawOreItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public final class OreItems extends BaseItemRegistry {

	private OreItems() {}

	// Rutile -> Titanium

	public static final RegistryObject<BlockItem> RUTILE_ORE = 
			registerBlockItem("rutile_ore", () -> OreBlocks.RUTILE_ORE.get());

	public static final RegistryObject<BlockItem> DEEPSLATE_RUTILE_ORE = 
			registerBlockItem("deepslate_rutile_ore", () -> OreBlocks.DEEPSLATE_RUTILE_ORE.get());

	public static final RegistryObject<Item> RAW_RUTILE = 
			REGISTRY.register("raw_rutile", () -> new RawOreItem());

	public static final RegistryObject<Item> TITANIUM_INGOT = 
			REGISTRY.register("titanium_ingot", () -> new IngotItem(false));

	public static final RegistryObject<BlockItem> RAW_RUTILE_BLOCK = 
			registerBlockItem("raw_rutile_block", () -> OreBlocks.RAW_RUTILE_BLOCK.get());

	public static final RegistryObject<BlockItem> TITANIUM_BLOCK = 
			registerBlockItem("titanium_block", () -> OreBlocks.TITANIUM_BLOCK.get());

	// Bauxite -> Aluminium

	public static final RegistryObject<BlockItem> BAUXITE_ORE = 
			registerBlockItem("bauxite_ore", () -> OreBlocks.BAUXITE_ORE.get());
	
	public static final RegistryObject<BlockItem> DEEPSLATE_BAUXITE_ORE = 
			registerBlockItem("deepslate_bauxite_ore", () -> OreBlocks.DEEPSLATE_BAUXITE_ORE.get());

	public static final RegistryObject<Item> RAW_BAUXITE = 
			REGISTRY.register("raw_bauxite", () -> new RawOreItem());
	
	public static final RegistryObject<Item> ALUMINIUM_INGOT = 
			REGISTRY.register("aluminium_ingot", () -> new IngotItem(false));
	
	public static final RegistryObject<Item> ALUMINIUM_NUGGET = 
			REGISTRY.register("aluminium_nugget", () -> new NuggetItem());
	
	public static final RegistryObject<BlockItem> RAW_BAUXITE_BLOCK = 
			registerBlockItem("raw_bauxite_block", () -> OreBlocks.RAW_BAUXITE_BLOCK.get());
	
	public static final RegistryObject<BlockItem> ALUMINIUM_BLOCK = 
			registerBlockItem("aluminium_block", () -> OreBlocks.ALUMINIUM_BLOCK.get());

	// Halite
			
	public static final RegistryObject<BlockItem> SANDSTONE_HALITE_ORE = 
			registerBlockItem("sand_halite_ore", () -> OreBlocks.SANDSTONE_HALITE_ORE.get());
	
	public static final RegistryObject<BlockItem> RED_SANDSTONE_HALITE_ORE = 
			registerBlockItem("red_sand_halite_ore", () -> OreBlocks.RED_SANDSTONE_HALITE_ORE.get());

	public static final RegistryObject<Item> RAW_HALITE = 
			REGISTRY.register("raw_halite", () -> new RawOreItem());
	
	public static final RegistryObject<BlockItem> RAW_HALITE_BLOCK = 
			registerBlockItem("raw_halite_block", () -> OreBlocks.RAW_HALITE_BLOCK.get());
	
	//olivine = silicon
	public static final RegistryObject<Item> RAW_OLIVINE = 
			REGISTRY.register("raw_olivine", () -> new RawOreItem());

	public static final RegistryObject<Item> SILICON_INGOT = 
			REGISTRY.register("silicon_ingot", () -> new IngotItem(true));
	
	public static final RegistryObject<Item> SILICON_NUGGET = 
			REGISTRY.register("silicon_nugget", () -> new NuggetItem());
	
	public static final RegistryObject<BlockItem> SILICON_BLOCK = 
			registerBlockItem("silicon_block", () -> OreBlocks.SILICON_BLOCK.get());
	
	public static final RegistryObject<BlockItem> OLIVINE_ORE = 
			registerBlockItem("olivine_ore", () -> OreBlocks.OLIVINE_ORE.get());
	
	public static final RegistryObject<BlockItem> DEEPSLATE_OLIVINE_ORE = 
			registerBlockItem("deepslate_olivine_ore", () -> OreBlocks.DEEPSLATE_OLIVINE_ORE.get());
		
	public static final RegistryObject<BlockItem> RAW_OLIVINE_BLOCK = 
			registerBlockItem("raw_olivine_block", () -> OreBlocks.RAW_OLIVINE_BLOCK.get());
	
	// Silver Ore -> Silver
	
	public static final RegistryObject<BlockItem> SILVER_ORE = 
			registerBlockItem("silver_ore", () -> OreBlocks.SILVER_ORE.get());

	public static final RegistryObject<BlockItem> DEEPSLATE_SILVER_ORE = 
			registerBlockItem("deepslate_silver_ore", () -> OreBlocks.DEEPSLATE_SILVER_ORE.get());
		
	public static final RegistryObject<Item> RAW_SILVER =  
			REGISTRY.register("raw_silver", () -> new RawOreItem());
	
	public static final RegistryObject<Item> SILVER_INGOT =  
			REGISTRY.register("silver_ingot", () -> new IngotItem(false));
	
	public static final RegistryObject<BlockItem> RAW_SILVER_BLOCK =  
			registerBlockItem("raw_silver_block", () -> OreBlocks.RAW_SILVER_BLOCK.get());
	
	public static final RegistryObject<BlockItem> SILVER_BLOCK =  
			registerBlockItem("silver_block", () -> OreBlocks.SILVER_BLOCK.get());

	// Citrine Ore -> Citrine Crystal

	public static final RegistryObject<Item> CITRINE =  
			REGISTRY.register("citrine", () -> new GemstoneItem(false));
	
	public static final RegistryObject<BlockItem> NETHERRACK_CITRINE_ORE = 
			registerBlockItem("netherrack_citrine_ore", () -> OreBlocks.NETHERRACK_CITRINE_ORE.get());

	// Aventurine Ore -> Aventurine Crystal

	public static final RegistryObject<Item> AVENTURINE =  
			REGISTRY.register("aventurine", () -> new GemstoneItem(false));
	
	public static final RegistryObject<BlockItem> NETHERRACK_AVENTURINE_ORE = 
			registerBlockItem("netherrack_aventurine_ore", () -> OreBlocks.NETHERRACK_AVENTURINE_ORE.get());

	// Galena ore -> Lead
	
	public static final RegistryObject<Item> RAW_GALENA =  
			REGISTRY.register("raw_galena", () -> new RawOreItem());
	
	public static final RegistryObject<BlockItem> RAW_GALENA_BLOCK =  
			registerBlockItem("raw_galena_block", () -> OreBlocks.RAW_GALENA_BLOCK.get() );
	
	public static final RegistryObject<Item> LEAD_INGOT =  
			REGISTRY.register("lead_ingot", () -> new IngotItem(false));
	
	public static final RegistryObject<BlockItem> GALENA_ORE = 
			registerBlockItem("galena_ore", () -> OreBlocks.GALENA_ORE.get());
	
	public static final RegistryObject<BlockItem> LEAD_BLOCK = 
			registerBlockItem("lead_block", () -> OreBlocks.LEAD_BLOCK.get());
	
	public static final RegistryObject<Item> LEAD_NUGGET = 
			REGISTRY.register("lead_nugget", () -> new NuggetItem());

	// Black diamond
	
	public static final RegistryObject<Item> BLACK_DIAMOND =  
			REGISTRY.register("black_diamond", () -> new GemstoneItem(true));

	public static final RegistryObject<BlockItem> SANDSTONE_BLACK_DIAMOND_ORE = 
			registerBlockItem("sand_black_diamond_ore", () -> OreBlocks.SANDSTONE_BLACK_DIAMOND_ORE.get());

	public static final RegistryObject<BlockItem> RED_SANDSTONE_BLACK_DIAMOND_ORE = 
			registerBlockItem("red_sand_black_diamond_ore", () -> OreBlocks.RED_SANDSTONE_BLACK_DIAMOND_ORE.get());

}