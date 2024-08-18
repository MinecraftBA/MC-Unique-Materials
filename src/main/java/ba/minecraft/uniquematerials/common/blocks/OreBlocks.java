package ba.minecraft.uniquematerials.common.blocks;

import ba.minecraft.uniquematerials.common.blocks.ore.AluminiumBlock;
import ba.minecraft.uniquematerials.common.blocks.ore.LeadBlock;
import ba.minecraft.uniquematerials.common.blocks.ore.SiliconBlock;
import ba.minecraft.uniquematerials.common.blocks.ore.SilverBlock;
import ba.minecraft.uniquematerials.common.blocks.ore.TitaniumBlock;
import ba.minecraft.uniquematerials.common.blocks.ore.base.DeepslateFoundOreBlock;
import ba.minecraft.uniquematerials.common.blocks.ore.base.NetherrackFoundOreBlock;
import ba.minecraft.uniquematerials.common.blocks.ore.base.QuartzVariantBlock;
import ba.minecraft.uniquematerials.common.blocks.ore.base.RawOreBlock;
import ba.minecraft.uniquematerials.common.blocks.ore.base.SandstoneFoundOreBlock;
import ba.minecraft.uniquematerials.common.blocks.ore.base.StoneFoundOreBlock;
import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.material.MapColor;
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
			REGISTRY.register("raw_rutile_block", () -> new RawOreBlock(MapColor.CRIMSON_HYPHAE));

	public static final RegistryObject<Block> TITANIUM_BLOCK =
			REGISTRY.register("titanium_block", () -> new TitaniumBlock());

	// Bauxite => Aluminium
	
	public static final RegistryObject<DropExperienceBlock> BAUXITE_ORE = 
			REGISTRY.register("bauxite_ore", () -> new StoneFoundOreBlock());
	
	public static final RegistryObject<DropExperienceBlock> DEEPSLATE_BAUXITE_ORE = 
			REGISTRY.register("deepslate_bauxite_ore", () -> new DeepslateFoundOreBlock());
	
	public static final RegistryObject<Block> RAW_BAUXITE_BLOCK = 
			REGISTRY.register("raw_bauxite_block", () -> new RawOreBlock(MapColor.METAL));
	
	public static final RegistryObject<Block> ALUMINIUM_BLOCK = 
			REGISTRY.register("aluminium_block", () -> new AluminiumBlock());

	// Halite => Salt
	
	public static final RegistryObject<DropExperienceBlock> SANDSTONE_HALITE_ORE = 
			REGISTRY.register("sandstone_halite_ore", () -> new SandstoneFoundOreBlock());
	
	public static final RegistryObject<DropExperienceBlock> RED_SANDSTONE_HALITE_ORE = 
			REGISTRY.register("red_sandstone_halite_ore", () -> new SandstoneFoundOreBlock());
	
	public static final RegistryObject<Block> RAW_HALITE_BLOCK =
			REGISTRY.register("raw_halite_block", () -> new RawOreBlock(MapColor.QUARTZ));

	// Olivine => Silicon
	
	public static final RegistryObject<DropExperienceBlock> OLIVINE_ORE = 
			REGISTRY.register("olivine_ore", () -> new StoneFoundOreBlock());
	
	public static final RegistryObject<DropExperienceBlock> DEEPSLATE_OLIVINE_ORE = 
			REGISTRY.register("deepslate_olivine_ore", () -> new DeepslateFoundOreBlock());
	
	public static final RegistryObject<Block> SILICON_BLOCK =
			REGISTRY.register("silicon_block", () -> new SiliconBlock());
	
	public static final RegistryObject<Block> RAW_OLIVINE_BLOCK =
			REGISTRY.register("raw_olivine_block", () -> new RawOreBlock(MapColor.GRASS));
	
	// Silver
	
	public static final RegistryObject<DropExperienceBlock> SILVER_ORE = 
			REGISTRY.register("silver_ore", () -> new StoneFoundOreBlock());

	public static final RegistryObject<DropExperienceBlock> DEEPSLATE_SILVER_ORE = 
			REGISTRY.register("deepslate_silver_ore", () -> new DeepslateFoundOreBlock());
	
	public static final RegistryObject<Block> RAW_SILVER_BLOCK = 
			REGISTRY.register("raw_silver_block", () -> new RawOreBlock(MapColor.QUARTZ));
	
	public static final RegistryObject<Block> SILVER_BLOCK = 
			REGISTRY.register("silver_block", () -> new SilverBlock()); 
	
	// Citrine

	public static final RegistryObject<DropExperienceBlock> NETHERRACK_CITRINE_ORE = 
			REGISTRY.register("netherrack_citrine_ore", () -> new NetherrackFoundOreBlock(UniformInt.of(3, 7))); 

	// Aventurine

	public static final RegistryObject<DropExperienceBlock> NETHERRACK_AVENTURINE_ORE = 
			REGISTRY.register("netherrack_aventurine_ore", () -> new NetherrackFoundOreBlock(UniformInt.of(3, 7))); 

	public static final RegistryObject<QuartzVariantBlock> AVENTURINE_BLOCK = 
			REGISTRY.register("aventurine_block", () -> new QuartzVariantBlock(MapColor.COLOR_GREEN)); 

	// Galena => Lead
	
	public static final RegistryObject<DropExperienceBlock> GALENA_ORE = 
			REGISTRY.register("galena_ore", () -> new StoneFoundOreBlock());
	
	public static final RegistryObject<RawOreBlock> RAW_GALENA_BLOCK	 = 
			REGISTRY.register("raw_galena_block", () -> new RawOreBlock(MapColor.CRIMSON_HYPHAE));
	
	public static final RegistryObject<Block> LEAD_BLOCK = 
			REGISTRY.register("lead_block", () -> new LeadBlock());
	
	// Black diamond
	
	public static final RegistryObject<DropExperienceBlock> SANDSTONE_BLACK_DIAMOND_ORE = 
			REGISTRY.register("sandstone_black_diamond_ore", () -> new SandstoneFoundOreBlock(UniformInt.of(3, 7)));

	public static final RegistryObject<DropExperienceBlock> RED_SANDSTONE_BLACK_DIAMOND_ORE = 
			REGISTRY.register("red_sandstone_black_diamond_ore", () -> new SandstoneFoundOreBlock(UniformInt.of(3, 7)));

}