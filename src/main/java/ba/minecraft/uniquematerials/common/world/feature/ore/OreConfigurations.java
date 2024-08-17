package ba.minecraft.uniquematerials.common.world.feature.ore;

import java.util.List;
import java.util.function.Supplier;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;

import ba.minecraft.uniquematerials.common.blocks.OreBlocks;
import ba.minecraft.uniquematerials.common.tags.ModBlockTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration.TargetBlockState;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public final class OreConfigurations {

	private OreConfigurations() {}
	
	private static final RuleTest SAND_TEST = 
			new TagMatchTest(ModBlockTags.SANDSTONE_ORE_REPLACEABLES);

	private static final RuleTest RED_SAND_TEST = 
			new TagMatchTest(ModBlockTags.RED_SANDSTONE_ORE_REPLACEABLES);

	private static final RuleTest STONE_TEST = 
			new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);

	private static final RuleTest DEEPSLATE_TEST = 
			new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

	private static final RuleTest NETHERRACK_TEST = 
			new TagMatchTest(ModBlockTags.NETHERRACK_ORE_REPLACEABLES);

	// Bauxite

	private static final Supplier<List<TargetBlockState>> BAUXITE_TARGET_LIST = Suppliers.memoize(() -> {
		return ImmutableList.of(
			OreConfiguration.target(STONE_TEST, OreBlocks.BAUXITE_ORE.get().defaultBlockState()),
			OreConfiguration.target(DEEPSLATE_TEST, OreBlocks.DEEPSLATE_BAUXITE_ORE.get().defaultBlockState())
		);
	});
	
	public static final Supplier<OreConfiguration> BAUXITE_SMALL = 
		() -> new OreConfiguration(BAUXITE_TARGET_LIST.get(), 4, 0.5F);

	public static final Supplier<OreConfiguration> BAUXITE_LARGE = 
		() -> new OreConfiguration(BAUXITE_TARGET_LIST.get(), 12, 0.75F);
	
	public static final Supplier<OreConfiguration> BAUXITE_BURIED = 
		() -> new OreConfiguration(BAUXITE_TARGET_LIST.get(), 8, 1.0F);

	// Galena

	private static final Supplier<List<TargetBlockState>> GALENA_TARGET_LIST = Suppliers.memoize(() -> {
		return ImmutableList.of(
			OreConfiguration.target(STONE_TEST, OreBlocks.GALENA_ORE.get().defaultBlockState())
		);
	});
			
	public static final Supplier<OreConfiguration> GALENA_SMALL = 
		() -> new OreConfiguration(GALENA_TARGET_LIST.get(), 4, 0.5F);

	public static final Supplier<OreConfiguration> GALENA_LARGE = 
		() -> new OreConfiguration(GALENA_TARGET_LIST.get(), 12, 0.75F);
			
	public static final Supplier<OreConfiguration> GALENA_BURIED = 
		() -> new OreConfiguration(GALENA_TARGET_LIST.get(), 8, 1.0F);

	// Olivine
	
	private static final Supplier<List<TargetBlockState>> OLIVINE_TARGET_LIST = Suppliers.memoize(() -> {
		return ImmutableList.of(
			OreConfiguration.target(STONE_TEST, OreBlocks.OLIVINE_ORE.get().defaultBlockState()),
			OreConfiguration.target(DEEPSLATE_TEST, OreBlocks.DEEPSLATE_OLIVINE_ORE.get().defaultBlockState())
		);
	});
				
	public static final Supplier<OreConfiguration> OLIVINE_SMALL = 
		() -> new OreConfiguration(OLIVINE_TARGET_LIST.get(), 4, 0.5F);

	public static final Supplier<OreConfiguration> OLIVINE_LARGE = 
		() -> new OreConfiguration(OLIVINE_TARGET_LIST.get(), 12, 0.75F);
			
	public static final Supplier<OreConfiguration> OLIVINE_BURIED = 
		() -> new OreConfiguration(OLIVINE_TARGET_LIST.get(), 8, 1.0F);

	// Silver
	
	private static final Supplier<List<TargetBlockState>> SILVER_TARGET_LIST = Suppliers.memoize(() -> {
		return ImmutableList.of(
			OreConfiguration.target(STONE_TEST, OreBlocks.SILVER_ORE.get().defaultBlockState()),
			OreConfiguration.target(DEEPSLATE_TEST, OreBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState())
		);
	});
		
	public static final Supplier<OreConfiguration> SILVER_SMALL =  
		() -> new OreConfiguration(SILVER_TARGET_LIST.get(), 4, 0.1F); 

	public static final Supplier<OreConfiguration> SILVER_LARGE =  
		() -> new OreConfiguration(SILVER_TARGET_LIST.get(), 12, 0.1F); 

	public static final Supplier<OreConfiguration> SILVER_BURIED =  
		() -> new OreConfiguration(SILVER_TARGET_LIST.get(), 8, 0.1F); 
	
	// Rutile
	
	private static final Supplier<List<TargetBlockState>> RUTILE_TARGET_LIST = Suppliers.memoize(() -> {
		return ImmutableList.of(
			OreConfiguration.target(STONE_TEST, OreBlocks.RUTILE_ORE.get().defaultBlockState()),
			OreConfiguration.target(DEEPSLATE_TEST, OreBlocks.DEEPSLATE_RUTILE_ORE.get().defaultBlockState())
		);
	});
		
	public static final Supplier<OreConfiguration> RUTILE_SMALL = 
		() -> new OreConfiguration(RUTILE_TARGET_LIST.get(), 4, 0.5F);

	public static final Supplier<OreConfiguration> RUTILE_LARGE = 
		() -> new OreConfiguration(RUTILE_TARGET_LIST.get(), 12, 0.75F);
		
	public static final Supplier<OreConfiguration> RUTILE_BURIED = 
		() -> new OreConfiguration(RUTILE_TARGET_LIST.get(), 8, 1.0F);
	
	// Nether Citrine
	
	private static final Supplier<List<TargetBlockState>> NETHER_CITRINE_TARGET_LIST = Suppliers.memoize(() -> {
		return ImmutableList.of(
			OreConfiguration.target(NETHERRACK_TEST, OreBlocks.NETHERRACK_CITRINE_ORE.get().defaultBlockState())
		);
	});
		
	public static final Supplier<OreConfiguration> NETHER_CITRINE_SMALL = 
		() -> new OreConfiguration(NETHER_CITRINE_TARGET_LIST.get(), 4, 0.5F);

	public static final Supplier<OreConfiguration> NETHER_CITRINE_LARGE = 
		() -> new OreConfiguration(NETHER_CITRINE_TARGET_LIST.get(), 12, 0.7F);

	public static final Supplier<OreConfiguration> NETHER_CITRINE_BURIED = 
		() -> new OreConfiguration(NETHER_CITRINE_TARGET_LIST.get(), 8, 1.0F);
		
	// Black Diamond

	private static final Supplier<List<TargetBlockState>> BLACK_DIAMOND_TARGET_LIST = Suppliers.memoize(() -> {
		return ImmutableList.of(
			OreConfiguration.target(SAND_TEST, OreBlocks.SANDSTONE_BLACK_DIAMOND_ORE.get().defaultBlockState()),
			OreConfiguration.target(RED_SAND_TEST, OreBlocks.RED_SANDSTONE_BLACK_DIAMOND_ORE.get().defaultBlockState())
		);
	});
	
	public static final Supplier<OreConfiguration> BLACK_DIAMOND_SMALL = 
		() -> new OreConfiguration(BLACK_DIAMOND_TARGET_LIST.get(), 4, 0.5F);

	public static final Supplier<OreConfiguration> BLACK_DIAMOND_LARGE = 
		() -> new OreConfiguration(BLACK_DIAMOND_TARGET_LIST.get(), 12, 0.7F);

	public static final Supplier<OreConfiguration> BLACK_DIAMOND_BURIED = 
		() -> new OreConfiguration(BLACK_DIAMOND_TARGET_LIST.get(), 8, 1.0F);
		
	// Halite

	private static final Supplier<List<TargetBlockState>> HALITE_TARGET_LIST = Suppliers.memoize(() -> {
		return ImmutableList.of(
			OreConfiguration.target(SAND_TEST, OreBlocks.SANDSTONE_HALITE_ORE.get().defaultBlockState()),
			OreConfiguration.target(RED_SAND_TEST, OreBlocks.RED_SANDSTONE_HALITE_ORE.get().defaultBlockState())
		);
	});
	
	public static final Supplier<OreConfiguration> HALITE_SMALL = 
		() -> new OreConfiguration(HALITE_TARGET_LIST.get(), 4, 0.5F);

	public static final Supplier<OreConfiguration> HALITE_LARGE = 
		() -> new OreConfiguration(HALITE_TARGET_LIST.get(), 12, 0.7F);

	public static final Supplier<OreConfiguration> HALITE_BURIED = 
		() -> new OreConfiguration(HALITE_TARGET_LIST.get(), 8, 1.0F);

}