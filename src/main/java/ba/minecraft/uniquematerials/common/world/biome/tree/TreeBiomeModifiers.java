package ba.minecraft.uniquematerials.common.world.biome.tree;

import ba.minecraft.uniquematerials.common.helpers.biome.ModBiomeModifierHelper;
import ba.minecraft.uniquematerials.common.world.feature.tree.TreePlacedFeatures;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;

public final class TreeBiomeModifiers {

	private TreeBiomeModifiers() {}

	public static final ResourceKey<BiomeModifier> ADD_BEECH_TREE = 
			ModBiomeModifierHelper.createResourceKey("add_beech_tree");

	public static final ResourceKey<BiomeModifier> ADD_BEECH_BEES_005_TREE = 
			ModBiomeModifierHelper.createResourceKey("add_beech_bees_005_tree");

	public static final ResourceKey<BiomeModifier> ADD_MAHOGANY_TREE = 
			ModBiomeModifierHelper.createResourceKey("add_mahogany_tree");

	public static final ResourceKey<BiomeModifier> ADD_SEQUOIA_TREE = 
			ModBiomeModifierHelper.createResourceKey("add_sequoia_tree");

	public static void bootstrap(BootstrapContext<BiomeModifier> context) { 
	
        HolderGetter<Biome> biomesGetter = context.lookup(Registries.BIOME);
        HolderGetter<PlacedFeature> placedFeaturesGetter = context.lookup(Registries.PLACED_FEATURE);

        context.register(ADD_BEECH_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomesGetter.getOrThrow(Biomes.FOREST), biomesGetter.getOrThrow(Biomes.BIRCH_FOREST), biomesGetter.getOrThrow(Biomes.OLD_GROWTH_BIRCH_FOREST), biomesGetter.getOrThrow(Biomes.TAIGA), biomesGetter.getOrThrow(Biomes.OLD_GROWTH_PINE_TAIGA), biomesGetter.getOrThrow(Biomes.OLD_GROWTH_SPRUCE_TAIGA), biomesGetter.getOrThrow(Biomes.DARK_FOREST)),
                HolderSet.direct(placedFeaturesGetter.getOrThrow(TreePlacedFeatures.BEECH_CHECKED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_BEECH_BEES_005_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomesGetter.getOrThrow(Biomes.FOREST), biomesGetter.getOrThrow(Biomes.BIRCH_FOREST), biomesGetter.getOrThrow(Biomes.OLD_GROWTH_BIRCH_FOREST), biomesGetter.getOrThrow(Biomes.TAIGA), biomesGetter.getOrThrow(Biomes.OLD_GROWTH_PINE_TAIGA), biomesGetter.getOrThrow(Biomes.OLD_GROWTH_SPRUCE_TAIGA), biomesGetter.getOrThrow(Biomes.DARK_FOREST)),
                HolderSet.direct(placedFeaturesGetter.getOrThrow(TreePlacedFeatures.BEECH_BEES_005)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_MAHOGANY_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomesGetter.getOrThrow(Biomes.JUNGLE), biomesGetter.getOrThrow(Biomes.BAMBOO_JUNGLE), biomesGetter.getOrThrow(Biomes.SPARSE_JUNGLE), biomesGetter.getOrThrow(Biomes.SAVANNA), biomesGetter.getOrThrow(Biomes.SAVANNA_PLATEAU), biomesGetter.getOrThrow(Biomes.LUSH_CAVES)),
                HolderSet.direct(placedFeaturesGetter.getOrThrow(TreePlacedFeatures.MAHOGANY_CHECKED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_SEQUOIA_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomesGetter.getOrThrow(Biomes.TAIGA), biomesGetter.getOrThrow(Biomes.OLD_GROWTH_PINE_TAIGA), biomesGetter.getOrThrow(Biomes.OLD_GROWTH_SPRUCE_TAIGA), biomesGetter.getOrThrow(Biomes.FOREST), biomesGetter.getOrThrow(Biomes.DARK_FOREST), biomesGetter.getOrThrow(Biomes.SNOWY_TAIGA)),
                HolderSet.direct(placedFeaturesGetter.getOrThrow(TreePlacedFeatures.SEQUOIA_CHECKED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

	}
	
}
