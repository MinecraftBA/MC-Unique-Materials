package ba.minecraft.uniquematerials.common.world.feature.ore;

import ba.minecraft.uniquematerials.common.helpers.feature.ModConfiguredFeatureHelper;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;

public final class OreConfiguredFeatures {

	private OreConfiguredFeatures() {
	}

	// Rutile

	public static final ResourceKey<ConfiguredFeature<?, ?>> RUTILE_SMALL = ModConfiguredFeatureHelper
			.createResourceKey("ore_rutile_small");

	public static final ResourceKey<ConfiguredFeature<?, ?>> RUTILE_LARGE = ModConfiguredFeatureHelper
			.createResourceKey("ore_rutile_large");

	public static final ResourceKey<ConfiguredFeature<?, ?>> RUTILE_BURIED = ModConfiguredFeatureHelper
			.createResourceKey("ore_rutile_buried");

	// Bauxite

	public static final ResourceKey<ConfiguredFeature<?, ?>> BAUXITE_SMALL = ModConfiguredFeatureHelper
			.createResourceKey("ore_bauxite_small");

	public static final ResourceKey<ConfiguredFeature<?, ?>> BAUXITE_LARGE = ModConfiguredFeatureHelper
			.createResourceKey("ore_bauxite_large");

	public static final ResourceKey<ConfiguredFeature<?, ?>> BAUXITE_BURIED = ModConfiguredFeatureHelper
			.createResourceKey("ore_bauxite_buried");

	// Olivine

	public static final ResourceKey<ConfiguredFeature<?, ?>> OLIVINE_SMALL = ModConfiguredFeatureHelper
			.createResourceKey("ore_olivine_small");

	public static final ResourceKey<ConfiguredFeature<?, ?>> OLIVINE_LARGE = ModConfiguredFeatureHelper
			.createResourceKey("ore_olivine_large");

	public static final ResourceKey<ConfiguredFeature<?, ?>> OLIVINE_BURIED = ModConfiguredFeatureHelper
			.createResourceKey("ore_olivine_buried");

	// Silver

	public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_SMALL = ModConfiguredFeatureHelper
			.createResourceKey("ore_silver_small");

	public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_LARGE = ModConfiguredFeatureHelper
			.createResourceKey("ore_silver_large");

	public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_BURIED = ModConfiguredFeatureHelper
			.createResourceKey("ore_silver_buried");

	// Halite

	public static final ResourceKey<ConfiguredFeature<?, ?>> HALITE_SMALL = ModConfiguredFeatureHelper
			.createResourceKey("ore_halite_small");

	public static final ResourceKey<ConfiguredFeature<?, ?>> HALITE_LARGE = ModConfiguredFeatureHelper
			.createResourceKey("ore_halite_large");

	public static final ResourceKey<ConfiguredFeature<?, ?>> HALITE_BURIED = ModConfiguredFeatureHelper
			.createResourceKey("ore_halite_buried");

	// Citrine

	public static final ResourceKey<ConfiguredFeature<?, ?>> CITRINE_NETHER_SMALL = ModConfiguredFeatureHelper
			.createResourceKey("ore_citrine_nether_small");

	public static final ResourceKey<ConfiguredFeature<?, ?>> CITRINE_NETHER_LARGE = ModConfiguredFeatureHelper
			.createResourceKey("ore_citrine_nether_large");

	public static final ResourceKey<ConfiguredFeature<?, ?>> CITRINE_NETHER_BURIED = ModConfiguredFeatureHelper
			.createResourceKey("ore_citrine_nether_buried");

	// Aventurine

	public static final ResourceKey<ConfiguredFeature<?, ?>> AVENTURINE_NETHER_SMALL = ModConfiguredFeatureHelper
			.createResourceKey("ore_aventurine_nether_small");

	public static final ResourceKey<ConfiguredFeature<?, ?>> AVENTURINE_NETHER_LARGE = ModConfiguredFeatureHelper
			.createResourceKey("ore_aventurine_nether_large");

	public static final ResourceKey<ConfiguredFeature<?, ?>> AVENTURINE_NETHER_BURIED = ModConfiguredFeatureHelper
			.createResourceKey("ore_aventurine_nether_buried");

	// Galena

	public static final ResourceKey<ConfiguredFeature<?, ?>> GALENA_SMALL = ModConfiguredFeatureHelper
			.createResourceKey("ore_galena_small");

	public static final ResourceKey<ConfiguredFeature<?, ?>> GALENA_LARGE = ModConfiguredFeatureHelper
			.createResourceKey("ore_galena_large");

	public static final ResourceKey<ConfiguredFeature<?, ?>> GALENA_BURIED = ModConfiguredFeatureHelper
			.createResourceKey("ore_galena_buried");

	// Black diamond

	public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_DIAMOND_SMALL = ModConfiguredFeatureHelper
			.createResourceKey("ore_black_diamond_small");

	public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_DIAMOND_LARGE = ModConfiguredFeatureHelper
			.createResourceKey("ore_black_diamond_large");

	public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_DIAMOND_BURIED = ModConfiguredFeatureHelper
			.createResourceKey("ore_black_diamond_buried");

	public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

		// Rutile
		FeatureUtils.register(context, RUTILE_SMALL, Feature.ORE, OreConfigurations.RUTILE_SMALL.get());
		FeatureUtils.register(context, RUTILE_LARGE, Feature.ORE, OreConfigurations.RUTILE_LARGE.get());
		FeatureUtils.register(context, RUTILE_BURIED, Feature.ORE, OreConfigurations.RUTILE_BURIED.get());

		// Bauxite
		FeatureUtils.register(context, BAUXITE_SMALL, Feature.ORE, OreConfigurations.BAUXITE_SMALL.get());
		FeatureUtils.register(context, BAUXITE_LARGE, Feature.ORE, OreConfigurations.BAUXITE_LARGE.get());
		FeatureUtils.register(context, BAUXITE_BURIED, Feature.ORE, OreConfigurations.BAUXITE_BURIED.get());

		// Olivine
		FeatureUtils.register(context, OLIVINE_SMALL, Feature.ORE, OreConfigurations.OLIVINE_SMALL.get());
		FeatureUtils.register(context, OLIVINE_LARGE, Feature.ORE, OreConfigurations.OLIVINE_LARGE.get());
		FeatureUtils.register(context, OLIVINE_BURIED, Feature.ORE, OreConfigurations.OLIVINE_BURIED.get());

		// Silver
		FeatureUtils.register(context, SILVER_SMALL, Feature.ORE, OreConfigurations.SILVER_SMALL.get());
		FeatureUtils.register(context, SILVER_LARGE, Feature.ORE, OreConfigurations.SILVER_LARGE.get());
		FeatureUtils.register(context, SILVER_BURIED, Feature.ORE, OreConfigurations.SILVER_BURIED.get());

		// Halite
		FeatureUtils.register(context, HALITE_SMALL, Feature.ORE, OreConfigurations.HALITE_SMALL.get());
		FeatureUtils.register(context, HALITE_LARGE, Feature.ORE, OreConfigurations.HALITE_LARGE.get());
		FeatureUtils.register(context, HALITE_BURIED, Feature.ORE, OreConfigurations.HALITE_BURIED.get());

		// Citrine
		FeatureUtils.register(context, CITRINE_NETHER_SMALL, Feature.ORE, OreConfigurations.CITRINE_NETHER_SMALL.get());
		FeatureUtils.register(context, CITRINE_NETHER_LARGE, Feature.ORE, OreConfigurations.CITRINE_NETHER_LARGE.get());
		FeatureUtils.register(context, CITRINE_NETHER_BURIED, Feature.ORE, OreConfigurations.CITRINE_NETHER_BURIED.get());

		// Aventurine
		FeatureUtils.register(context, AVENTURINE_NETHER_SMALL, Feature.ORE, OreConfigurations.AVENTURINE_NETHER_SMALL.get());
		FeatureUtils.register(context, AVENTURINE_NETHER_LARGE, Feature.ORE, OreConfigurations.AVENTURINE_NETHER_LARGE.get());
		FeatureUtils.register(context, AVENTURINE_NETHER_BURIED, Feature.ORE, OreConfigurations.AVENTURINE_NETHER_BURIED.get());

		// Galena
		FeatureUtils.register(context, GALENA_SMALL, Feature.ORE, OreConfigurations.GALENA_SMALL.get());
		FeatureUtils.register(context, GALENA_LARGE, Feature.ORE, OreConfigurations.GALENA_LARGE.get());
		FeatureUtils.register(context, GALENA_BURIED, Feature.ORE, OreConfigurations.GALENA_BURIED.get());

		// Black diamond
		FeatureUtils.register(context, BLACK_DIAMOND_SMALL, Feature.ORE, OreConfigurations.BLACK_DIAMOND_SMALL.get());
		FeatureUtils.register(context, BLACK_DIAMOND_LARGE, Feature.ORE, OreConfigurations.BLACK_DIAMOND_LARGE.get());
		FeatureUtils.register(context, BLACK_DIAMOND_BURIED, Feature.ORE, OreConfigurations.BLACK_DIAMOND_BURIED.get());

	}

}
