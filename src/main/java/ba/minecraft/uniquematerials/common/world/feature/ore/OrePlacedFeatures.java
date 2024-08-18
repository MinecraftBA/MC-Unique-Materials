package ba.minecraft.uniquematerials.common.world.feature.ore;

import ba.minecraft.uniquematerials.common.helpers.feature.ModPlacedFeatureHelper;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public final class OrePlacedFeatures {

	// Rutile
	
    public static final ResourceKey<PlacedFeature> RUTILE_SMALL = 
    		ModPlacedFeatureHelper.createResourceKey("ore_rutile_small");

    public static final ResourceKey<PlacedFeature> RUTILE_LARGE = 
    		ModPlacedFeatureHelper.createResourceKey("ore_rutile_large");

    public static final ResourceKey<PlacedFeature> RUTILE_BURIED = 
    		ModPlacedFeatureHelper.createResourceKey("ore_rutile_buried");

	// Olivine
	
    public static final ResourceKey<PlacedFeature> OLIVINE_SMALL = 
    		ModPlacedFeatureHelper.createResourceKey("ore_olivine_small");

    public static final ResourceKey<PlacedFeature> OLIVINE_LARGE = 
    		ModPlacedFeatureHelper.createResourceKey("ore_olivine_large");

    public static final ResourceKey<PlacedFeature> OLIVINE_BURIED = 
    		ModPlacedFeatureHelper.createResourceKey("ore_olivine_buried");

	// Bauxite
	
    public static final ResourceKey<PlacedFeature> BAUXITE_SMALL = 
    		ModPlacedFeatureHelper.createResourceKey("ore_bauxite_small");

    public static final ResourceKey<PlacedFeature> BAUXITE_LARGE = 
    		ModPlacedFeatureHelper.createResourceKey("ore_bauxite_large");

    public static final ResourceKey<PlacedFeature> BAUXITE_BURIED = 
    		ModPlacedFeatureHelper.createResourceKey("ore_bauxite_buried");

	// Galena
	
    public static final ResourceKey<PlacedFeature> GALENA_SMALL = 
    		ModPlacedFeatureHelper.createResourceKey("ore_galena_small");

    public static final ResourceKey<PlacedFeature> GALENA_LARGE = 
    		ModPlacedFeatureHelper.createResourceKey("ore_galena_large");

    public static final ResourceKey<PlacedFeature> GALENA_BURIED = 
    		ModPlacedFeatureHelper.createResourceKey("ore_galena_buried");

	// Silver
	
    public static final ResourceKey<PlacedFeature> SILVER_SMALL = 
    		ModPlacedFeatureHelper.createResourceKey("ore_silver_small");

    public static final ResourceKey<PlacedFeature> SILVER_LARGE = 
    		ModPlacedFeatureHelper.createResourceKey("ore_silver_large");

    public static final ResourceKey<PlacedFeature> SILVER_BURIED = 
    		ModPlacedFeatureHelper.createResourceKey("ore_silver_buried");

	// Halite
	
    public static final ResourceKey<PlacedFeature> HALITE_SMALL = 
    		ModPlacedFeatureHelper.createResourceKey("ore_halite_small");

    public static final ResourceKey<PlacedFeature> HALITE_LARGE = 
    		ModPlacedFeatureHelper.createResourceKey("ore_halite_large");

    public static final ResourceKey<PlacedFeature> HALITE_BURIED = 
    		ModPlacedFeatureHelper.createResourceKey("ore_halite_buried");

	// Black diamond
	
    public static final ResourceKey<PlacedFeature> BLACK_DIAMOND_SMALL = 
    		ModPlacedFeatureHelper.createResourceKey("ore_black_diamond_small");

    public static final ResourceKey<PlacedFeature> BLACK_DIAMOND_LARGE = 
    		ModPlacedFeatureHelper.createResourceKey("ore_black_diamond_large");

    public static final ResourceKey<PlacedFeature> BLACK_DIAMOND_BURIED = 
    		ModPlacedFeatureHelper.createResourceKey("ore_black_diamond_buried");

	// Citrine
	
    public static final ResourceKey<PlacedFeature> CITRINE_NETHER_SMALL = 
    		ModPlacedFeatureHelper.createResourceKey("ore_citrine_nether_small");

    public static final ResourceKey<PlacedFeature> CITRINE_NETHER_LARGE = 
    		ModPlacedFeatureHelper.createResourceKey("ore_citrine_nether_large");

    public static final ResourceKey<PlacedFeature> CITRINE_NETHER_BURIED = 
    		ModPlacedFeatureHelper.createResourceKey("ore_citrine_nether_buried");

	// Aventurine
	
    public static final ResourceKey<PlacedFeature> AVENTURINE_NETHER_SMALL = 
    		ModPlacedFeatureHelper.createResourceKey("ore_aventurine_nether_small");

    public static final ResourceKey<PlacedFeature> AVENTURINE_NETHER_LARGE = 
    		ModPlacedFeatureHelper.createResourceKey("ore_aventurine_nether_large");

    public static final ResourceKey<PlacedFeature> AVENTURINE_NETHER_BURIED = 
    		ModPlacedFeatureHelper.createResourceKey("ore_aventurine_nether_buried");

	private OrePlacedFeatures() {}
	
	public static void bootstrap(BootstrapContext<PlacedFeature> context) {
		
	    HolderGetter<ConfiguredFeature<?, ?>> configuredFeaturesGetter = context.lookup(Registries.CONFIGURED_FEATURE);

	    // Rutile (placement similar to diamond with recommended range 0 => 32)
	    
        Holder<ConfiguredFeature<?, ?>> rutileSmallHolder = configuredFeaturesGetter.getOrThrow(OreConfiguredFeatures.RUTILE_SMALL);
        PlacementUtils.register(context, RUTILE_SMALL, rutileSmallHolder, ModPlacedFeatureHelper.createCommonUniformPlacement(2, 0, 32));

        Holder<ConfiguredFeature<?, ?>> rutileLargeHolder = configuredFeaturesGetter.getOrThrow(OreConfiguredFeatures.RUTILE_LARGE);
        PlacementUtils.register(context, RUTILE_LARGE, rutileLargeHolder, ModPlacedFeatureHelper.createRareTrianglePlacement(8, 0, 32));

        Holder<ConfiguredFeature<?, ?>> rutileBuriedHolder = configuredFeaturesGetter.getOrThrow(OreConfiguredFeatures.RUTILE_BURIED);
        PlacementUtils.register(context, RUTILE_BURIED, rutileBuriedHolder, ModPlacedFeatureHelper.createCommonTrianglePlacement(4, 0, 32));

	    // Olivine (placement similar to iron with recommended range -24 => 16)
	    
        Holder<ConfiguredFeature<?, ?>> olivineSmallHolder = configuredFeaturesGetter.getOrThrow(OreConfiguredFeatures.OLIVINE_SMALL);
        PlacementUtils.register(context, OLIVINE_SMALL, olivineSmallHolder, ModPlacedFeatureHelper.createCommonUniformPlacement(5, -24, 16));

        Holder<ConfiguredFeature<?, ?>> olivineLargeHolder = configuredFeaturesGetter.getOrThrow(OreConfiguredFeatures.OLIVINE_LARGE);
        PlacementUtils.register(context, OLIVINE_LARGE, olivineLargeHolder, ModPlacedFeatureHelper.createCommonTrianglePlacement(20, -24, 16));

        Holder<ConfiguredFeature<?, ?>> olivineBuriedHolder = configuredFeaturesGetter.getOrThrow(OreConfiguredFeatures.OLIVINE_BURIED);
        PlacementUtils.register(context, OLIVINE_BURIED, olivineBuriedHolder, ModPlacedFeatureHelper.createCommonTrianglePlacement(10, -24, 16));
        
	    // Bauxite (placement similar to iron with recommended range 40 => 70)
	    
        Holder<ConfiguredFeature<?, ?>> bauxiteSmallHolder = configuredFeaturesGetter.getOrThrow(OreConfiguredFeatures.BAUXITE_SMALL);
        PlacementUtils.register(context, BAUXITE_SMALL, bauxiteSmallHolder, ModPlacedFeatureHelper.createCommonUniformPlacement(5, 40, 70));

        Holder<ConfiguredFeature<?, ?>> bauxiteLargeHolder = configuredFeaturesGetter.getOrThrow(OreConfiguredFeatures.BAUXITE_LARGE);
        PlacementUtils.register(context, BAUXITE_LARGE, bauxiteLargeHolder, ModPlacedFeatureHelper.createCommonTrianglePlacement(20, 40, 70));

        Holder<ConfiguredFeature<?, ?>> bauxiteBuriedHolder = configuredFeaturesGetter.getOrThrow(OreConfiguredFeatures.BAUXITE_BURIED);
        PlacementUtils.register(context, BAUXITE_BURIED, bauxiteBuriedHolder, ModPlacedFeatureHelper.createCommonTrianglePlacement(10, 40, 70));

	    // Galena (placement similar to iron with recommended range -32 => 32)
	    
        Holder<ConfiguredFeature<?, ?>> galenaSmallHolder = configuredFeaturesGetter.getOrThrow(OreConfiguredFeatures.GALENA_SMALL);
        PlacementUtils.register(context, GALENA_SMALL, galenaSmallHolder, ModPlacedFeatureHelper.createCommonUniformPlacement(5, -32, 32));

        Holder<ConfiguredFeature<?, ?>> galenaLargeHolder = configuredFeaturesGetter.getOrThrow(OreConfiguredFeatures.GALENA_LARGE);
        PlacementUtils.register(context, GALENA_LARGE, galenaLargeHolder, ModPlacedFeatureHelper.createCommonTrianglePlacement(20, -32, 32));

        Holder<ConfiguredFeature<?, ?>> galenaBuriedHolder = configuredFeaturesGetter.getOrThrow(OreConfiguredFeatures.GALENA_BURIED);
        PlacementUtils.register(context, GALENA_BURIED, galenaBuriedHolder, ModPlacedFeatureHelper.createCommonTrianglePlacement(10, -32, 32));

	    // Silver (placement similar to diamond with recommended range -64 => 16)
	    
        Holder<ConfiguredFeature<?, ?>> silverSmallHolder = configuredFeaturesGetter.getOrThrow(OreConfiguredFeatures.SILVER_SMALL);
        PlacementUtils.register(context, SILVER_SMALL, silverSmallHolder, ModPlacedFeatureHelper.createCommonUniformPlacement(2, -64, 16));

        Holder<ConfiguredFeature<?, ?>> silverLargeHolder = configuredFeaturesGetter.getOrThrow(OreConfiguredFeatures.SILVER_LARGE);
        PlacementUtils.register(context, SILVER_LARGE, silverLargeHolder, ModPlacedFeatureHelper.createCommonTrianglePlacement(8, -64, 16));

        Holder<ConfiguredFeature<?, ?>> silverBuriedHolder = configuredFeaturesGetter.getOrThrow(OreConfiguredFeatures.SILVER_BURIED);
        PlacementUtils.register(context, SILVER_BURIED, silverBuriedHolder, ModPlacedFeatureHelper.createCommonTrianglePlacement(4, -64, 16));

	    // Citrine (placement similar to quartz with recommended range 10 => 80)
	    
        Holder<ConfiguredFeature<?, ?>> citrineSmallHolder = configuredFeaturesGetter.getOrThrow(OreConfiguredFeatures.CITRINE_NETHER_SMALL);
        PlacementUtils.register(context, CITRINE_NETHER_SMALL, citrineSmallHolder, ModPlacedFeatureHelper.createCommonUniformPlacement(4, 10, 80));

        Holder<ConfiguredFeature<?, ?>> citrineLargeHolder = configuredFeaturesGetter.getOrThrow(OreConfiguredFeatures.CITRINE_NETHER_LARGE);
        PlacementUtils.register(context, CITRINE_NETHER_LARGE, citrineLargeHolder, ModPlacedFeatureHelper.createCommonUniformPlacement(16, 10, 80));

        Holder<ConfiguredFeature<?, ?>> citrineBuriedHolder = configuredFeaturesGetter.getOrThrow(OreConfiguredFeatures.CITRINE_NETHER_BURIED);
        PlacementUtils.register(context, CITRINE_NETHER_BURIED, citrineBuriedHolder, ModPlacedFeatureHelper.createCommonUniformPlacement(8, 10, 80));

	    // Aventurine (placement similar to quartz with recommended range 30 => 90)
	    
        Holder<ConfiguredFeature<?, ?>> aventurineSmallHolder = configuredFeaturesGetter.getOrThrow(OreConfiguredFeatures.AVENTURINE_NETHER_SMALL);
        PlacementUtils.register(context, AVENTURINE_NETHER_SMALL, aventurineSmallHolder, ModPlacedFeatureHelper.createCommonUniformPlacement(4, 30, 90));

        Holder<ConfiguredFeature<?, ?>> aventurineLargeHolder = configuredFeaturesGetter.getOrThrow(OreConfiguredFeatures.AVENTURINE_NETHER_LARGE);
        PlacementUtils.register(context, AVENTURINE_NETHER_LARGE, aventurineLargeHolder, ModPlacedFeatureHelper.createCommonUniformPlacement(16, 30, 90));

        Holder<ConfiguredFeature<?, ?>> aventurineBuriedHolder = configuredFeaturesGetter.getOrThrow(OreConfiguredFeatures.AVENTURINE_NETHER_BURIED);
        PlacementUtils.register(context, AVENTURINE_NETHER_BURIED, aventurineBuriedHolder, ModPlacedFeatureHelper.createCommonUniformPlacement(8, 30, 90));

        
	}
}
