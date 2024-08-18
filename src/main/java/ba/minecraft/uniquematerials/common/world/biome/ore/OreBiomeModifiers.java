package ba.minecraft.uniquematerials.common.world.biome.ore;

import ba.minecraft.uniquematerials.common.helpers.biome.ModBiomeModifierHelper;
import ba.minecraft.uniquematerials.common.world.feature.ore.OrePlacedFeatures;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;

public final class OreBiomeModifiers {
	
	private OreBiomeModifiers() {}
	
    public static final ResourceKey<BiomeModifier> ADD_RUTILE_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_rutile_ore");

    public static final ResourceKey<BiomeModifier> ADD_BAUXITE_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_bauxite_ore");

    public static final ResourceKey<BiomeModifier> ADD_OLIVINE_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_olivine_ore");

    public static final ResourceKey<BiomeModifier> ADD_HALITE_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_halite_ore");

    public static final ResourceKey<BiomeModifier> ADD_BLACK_DIAMOND_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_black_diamond_ore");

    public static final ResourceKey<BiomeModifier> ADD_SILVER_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_silver_ore");

    public static final ResourceKey<BiomeModifier> ADD_GALENA_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_galena_ore");

    public static final ResourceKey<BiomeModifier> ADD_NETHER_CITRINE_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_nether_citrine_ore");

    public static final ResourceKey<BiomeModifier> ADD_NETHER_AVENTURINE_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_nether_aventurine_ore");
    
    public static void bootstrap(BootstrapContext<BiomeModifier> context) { 
    	
        HolderGetter<PlacedFeature> placedFeaturesGetter = context.lookup(Registries.PLACED_FEATURE);
        HolderGetter<Biome> biomesGetter = context.lookup(Registries.BIOME);

        context.register(ADD_RUTILE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
        		biomesGetter.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeaturesGetter.getOrThrow(OrePlacedFeatures.RUTILE_SMALL), placedFeaturesGetter.getOrThrow(OrePlacedFeatures.RUTILE_LARGE), placedFeaturesGetter.getOrThrow(OrePlacedFeatures.RUTILE_BURIED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BAUXITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
        		biomesGetter.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeaturesGetter.getOrThrow(OrePlacedFeatures.BAUXITE_SMALL), placedFeaturesGetter.getOrThrow(OrePlacedFeatures.BAUXITE_LARGE), placedFeaturesGetter.getOrThrow(OrePlacedFeatures.BAUXITE_BURIED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OLIVINE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
        		biomesGetter.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeaturesGetter.getOrThrow(OrePlacedFeatures.OLIVINE_SMALL), placedFeaturesGetter.getOrThrow(OrePlacedFeatures.OLIVINE_LARGE), placedFeaturesGetter.getOrThrow(OrePlacedFeatures.OLIVINE_BURIED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GALENA_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
        		biomesGetter.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeaturesGetter.getOrThrow(OrePlacedFeatures.GALENA_SMALL), placedFeaturesGetter.getOrThrow(OrePlacedFeatures.GALENA_LARGE), placedFeaturesGetter.getOrThrow(OrePlacedFeatures.GALENA_BURIED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SILVER_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
        		biomesGetter.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeaturesGetter.getOrThrow(OrePlacedFeatures.SILVER_SMALL), placedFeaturesGetter.getOrThrow(OrePlacedFeatures.SILVER_LARGE), placedFeaturesGetter.getOrThrow(OrePlacedFeatures.SILVER_BURIED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_HALITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
        		biomesGetter.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeaturesGetter.getOrThrow(OrePlacedFeatures.HALITE_SMALL), placedFeaturesGetter.getOrThrow(OrePlacedFeatures.HALITE_LARGE), placedFeaturesGetter.getOrThrow(OrePlacedFeatures.HALITE_BURIED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLACK_DIAMOND_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
        		biomesGetter.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeaturesGetter.getOrThrow(OrePlacedFeatures.BLACK_DIAMOND_SMALL), placedFeaturesGetter.getOrThrow(OrePlacedFeatures.BLACK_DIAMOND_LARGE), placedFeaturesGetter.getOrThrow(OrePlacedFeatures.BLACK_DIAMOND_BURIED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_AVENTURINE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
        		biomesGetter.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeaturesGetter.getOrThrow(OrePlacedFeatures.AVENTURINE_NETHER_SMALL), placedFeaturesGetter.getOrThrow(OrePlacedFeatures.AVENTURINE_NETHER_LARGE), placedFeaturesGetter.getOrThrow(OrePlacedFeatures.AVENTURINE_NETHER_BURIED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_CITRINE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
        		biomesGetter.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeaturesGetter.getOrThrow(OrePlacedFeatures.CITRINE_NETHER_SMALL), placedFeaturesGetter.getOrThrow(OrePlacedFeatures.CITRINE_NETHER_LARGE), placedFeaturesGetter.getOrThrow(OrePlacedFeatures.CITRINE_NETHER_BURIED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

    }
}
