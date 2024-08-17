package ba.minecraft.uniquematerials.common.world.feature.ore;

import ba.minecraft.uniquematerials.common.helpers.feature.ModConfiguredFeatureHelper;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;

public final class OreConfiguredFeatures {

	private OreConfiguredFeatures() {}
    
	// Rutile
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> RUTILE_SMALL_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("rutile_small_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> RUTILE_LARGE_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("rutile_large_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> RUTILE_BURIED_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("rutile_buried_ore");

	// Bauxite
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> BAUXITE_SMALL_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("bauxite_small_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> BAUXITE_LARGE_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("bauxite_large_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> BAUXITE_BURIED_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("bauxite_buried_ore");

	// Olivine
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> OLIVINE_SMALL_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("olivine_small_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> OLIVINE_LARGE_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("olivine_large_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> OLIVINE_BURIED_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("olivine_buried_ore");

	// Silver
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_SMALL_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("silver_small_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_LARGE_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("silver_large_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_BURIED_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("silver_buried_ore");

	// Halite

	public static final ResourceKey<ConfiguredFeature<?, ?>> HALITE_SMALL_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("halite_small_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> HALITE_LARGE_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("halite_large_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> HALITE_BURIED_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("halite_buried_ore");

	// Citrine

	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_CITRINE_SMALL_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("nether_citrine_small_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_CITRINE_LARGE_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("nether_citrine_large_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_CITRINE_BURIED_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("nether_citrine_buried_ore");

	// Galena

	public static final ResourceKey<ConfiguredFeature<?, ?>> GALENA_SMALL_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("galena_small_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> GALENA_LARGE_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("galena_large_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> GALENA_BURIED_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("galena_buried_ore");
	
	// Black diamond
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_DIAMOND_SMALL_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("black_diamond_small_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_DIAMOND_LARGE_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("black_diamond_large_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_DIAMOND_BURIED_ORE = 
        	ModConfiguredFeatureHelper.createResourceKey("black_diamond_buried_ore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

    	// Rutile
    	FeatureUtils.register(context, RUTILE_SMALL_ORE, Feature.ORE, OreConfigurations.RUTILE_SMALL.get());
    	FeatureUtils.register(context, RUTILE_LARGE_ORE, Feature.ORE, OreConfigurations.RUTILE_LARGE.get());
    	FeatureUtils.register(context, RUTILE_BURIED_ORE, Feature.ORE, OreConfigurations.RUTILE_BURIED.get());

    	// Bauxite
    	FeatureUtils.register(context, BAUXITE_SMALL_ORE, Feature.ORE, OreConfigurations.BAUXITE_SMALL.get());
    	FeatureUtils.register(context, BAUXITE_LARGE_ORE, Feature.ORE, OreConfigurations.BAUXITE_LARGE.get());
    	FeatureUtils.register(context, BAUXITE_BURIED_ORE, Feature.ORE, OreConfigurations.BAUXITE_BURIED.get());

    	// Olivine
    	FeatureUtils.register(context, OLIVINE_SMALL_ORE, Feature.ORE, OreConfigurations.OLIVINE_SMALL.get());
    	FeatureUtils.register(context, OLIVINE_LARGE_ORE, Feature.ORE, OreConfigurations.OLIVINE_LARGE.get());
    	FeatureUtils.register(context, OLIVINE_BURIED_ORE, Feature.ORE, OreConfigurations.OLIVINE_BURIED.get());
    	
    	// Silver
    	FeatureUtils.register(context, SILVER_SMALL_ORE, Feature.ORE, OreConfigurations.SILVER_SMALL.get());
    	FeatureUtils.register(context, SILVER_LARGE_ORE, Feature.ORE, OreConfigurations.SILVER_LARGE.get());
    	FeatureUtils.register(context, SILVER_BURIED_ORE, Feature.ORE, OreConfigurations.SILVER_BURIED.get());

    	// Halite
    	FeatureUtils.register(context, HALITE_SMALL_ORE, Feature.ORE, OreConfigurations.HALITE_SMALL.get());
    	FeatureUtils.register(context, HALITE_LARGE_ORE, Feature.ORE, OreConfigurations.HALITE_LARGE.get());
    	FeatureUtils.register(context, HALITE_BURIED_ORE, Feature.ORE, OreConfigurations.HALITE_BURIED.get());

    	// Citrine
    	FeatureUtils.register(context, NETHER_CITRINE_SMALL_ORE, Feature.ORE, OreConfigurations.NETHER_CITRINE_SMALL.get());
    	FeatureUtils.register(context, NETHER_CITRINE_LARGE_ORE, Feature.ORE, OreConfigurations.NETHER_CITRINE_LARGE.get());
    	FeatureUtils.register(context, NETHER_CITRINE_BURIED_ORE, Feature.ORE, OreConfigurations.NETHER_CITRINE_BURIED.get());

    	// Galena
    	FeatureUtils.register(context, GALENA_SMALL_ORE, Feature.ORE, OreConfigurations.GALENA_SMALL.get());
    	FeatureUtils.register(context, GALENA_LARGE_ORE, Feature.ORE, OreConfigurations.GALENA_LARGE.get());
    	FeatureUtils.register(context, GALENA_BURIED_ORE, Feature.ORE, OreConfigurations.GALENA_BURIED.get());

    	// Black diamond
    	FeatureUtils.register(context, BLACK_DIAMOND_SMALL_ORE, Feature.ORE, OreConfigurations.BLACK_DIAMOND_SMALL.get());
    	FeatureUtils.register(context, BLACK_DIAMOND_LARGE_ORE, Feature.ORE, OreConfigurations.BLACK_DIAMOND_LARGE.get());
    	FeatureUtils.register(context, BLACK_DIAMOND_BURIED_ORE, Feature.ORE, OreConfigurations.BLACK_DIAMOND_BURIED.get());

    }
	
}
