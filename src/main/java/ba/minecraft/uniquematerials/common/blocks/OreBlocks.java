package ba.minecraft.uniquematerials.common.blocks;

import ba.minecraft.uniquematerials.common.blocks.ore.base.DeepslateFoundOreBlock;
import ba.minecraft.uniquematerials.common.blocks.ore.base.NetherrackFoundOreBlock;
import ba.minecraft.uniquematerials.common.blocks.ore.base.RawOreBlock;
import ba.minecraft.uniquematerials.common.blocks.ore.base.StoneFoundOreBlock;
import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class OreBlocks {
	
	private OreBlocks() {}
	
	public static final DeferredRegister<Block> REGISTRY = 
			DeferredRegister.create(ForgeRegistries.BLOCKS, UniqueMaterialsMod.MODID);

	// Rutile => Titanium
	
	public static final RegistryObject<DropExperienceBlock> RUTILE_ORE = 
			REGISTRY.register("rutile_ore", () -> new StoneFoundOreBlock());

	public static final RegistryObject<DropExperienceBlock> DEEPSLATE_RUTILE_ORE = 
			REGISTRY.register("deepslate_rutile_ore", () -> new DeepslateFoundOreBlock());

	public static final RegistryObject<Block> RAW_RUTILE_BLOCK =
			REGISTRY.register("raw_rutile_block", () -> new RawOreBlock(MaterialColor.CRIMSON_HYPHAE));

	public static final RegistryObject<Block> TITANIUM_BLOCK =
			REGISTRY.register("titanium_block", () -> new TitaniumBlock());

	// Bauxite => Aluminium
	
	public static final RegistryObject<DropExperienceBlock> BAUXITE_ORE = 
			REGISTRY.register("bauxite_ore", () -> new StosaneFoundOreBlock());
	
	public static final RegistryObject<DropExperienceBlock> DEEPSLATE_BAUXITE_ORE = 
			REGISTRY.register("deepslate_bauxite_ore", () -> new DeepslateFoundOreBlock());
	
	public static final RegistryObject<Block> RAW_BAUXITE_BLOCK = 
			REGISTRY.register("raw_bauxite_block", () -> new RawOreBlock(MaterialColor.METAL));
	
	public static final RegistryObject<Block> ALUMINIUM_BLOCK = 
			REGISTRY.register("aluminium_block", () -> new AluminiumBlock());

	// Halite => Salt
	
	public static final RegistryObject<DropExperienceBlock> SAND_HALITE_ORE = 
			REGISTRY.register("sand_halite_ore", () -> new SandFoundOreBlock());
	
	public static final RegistryObject<DropExperienceBlock> RED_SAND_HALITE_ORE = 
			REGISTRY.register("red_sand_halite_ore", () -> new SandFoundOreBlock());
	
	public static final RegistryObject<Block> RAW_HALITE_BLOCK =
			REGISTRY.register("raw_halite_block", () -> new RawOreBlock(MaterialColor.QUARTZ));

	// Olivine => Silicon
	
	public static final RegistryObject<DropExperienceBlock> OLIVINE_ORE = 
			REGISTRY.register("olivine_ore", () -> new StoneFoundOreBlock());
	
	public static final RegistryObject<DropExperienceBlock> DEEPSLATE_OLIVINE_ORE = 
			REGISTRY.register("deepslate_olivine_ore", () -> new DeepslateFoundOreBlock());
	
	public static final RegistryObject<Block> SILICON_BLOCK =
			REGISTRY.register("silicon_block", () -> new SiliconBlock());
	
	public static final RegistryObject<Block> RAW_OLIVINE_BLOCK =
			REGISTRY.register("raw_olivine_block", () -> new RawOreBlock(MaterialColor.GRASS));
	
	// Silver
	
	public static final RegistryObject<DropExperienceBlock> SILVER_ORE = 
			REGISTRY.register("silver_ore", () -> new StoneFoundOreBlock());

	public static final RegistryObject<DropExperienceBlock> DEEPSLATE_SILVER_ORE = 
			REGISTRY.register("deepslate_silver_ore", () -> new DeepslateFoundOreBlock());
	
	public static final RegistryObject<Block> RAW_SILVER_BLOCK = 
			REGISTRY.register("raw_silver_block", () -> new RawOreBlock(MaterialColor.QUARTZ));
	
	public static final RegistryObject<Block> SILVER_BLOCK = 
			REGISTRY.register("silver_block", () -> new SilverBlock()); 
	
	// Citrine

	public static final RegistryObject<DropExperienceBlock> NETHERRACK_CITRINE_ORE = 
			REGISTRY.register("netherrack_citrine_ore", () -> new NetherrackFoundOreBlock(UniformInt.of(3, 7))); 
	
	// Galena => Lead
	
	public static final RegistryObject<DropExperienceBlock> GALENA_ORE = 
			REGISTRY.register("galena_ore", () -> new StoneFoundOreBlock());
	
	public static final RegistryObject<RawOreBlock> RAW_GALENA_BLOCK	 = 
			REGISTRY.register("raw_galena_block", () -> new RawOreBlock(MaterialColor.CRIMSON_HYPHAE));
	
	public static final RegistryObject<Block> LEAD_BLOCK = 
			REGISTRY.register("lead_block", () -> new LeadBlock());
	
	// Black diamond
	
	public static final RegistryObject<DropExperienceBlock> SAND_BLACK_DIAMOND_ORE = 
			REGISTRY.register("sand_black_diamond_ore", () -> new SandFoundOreBlock(UniformInt.of(3, 7)));

	public static final RegistryObject<DropExperienceBlock> RED_SAND_BLACK_DIAMOND_ORE = 
			REGISTRY.register("red_sand_black_diamond_ore", () -> new SandFoundOreBlock(UniformInt.of(3, 7)));

}