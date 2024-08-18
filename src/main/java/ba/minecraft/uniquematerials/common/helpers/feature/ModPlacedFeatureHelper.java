package ba.minecraft.uniquematerials.common.helpers.feature;

import java.util.List;

import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public final class ModPlacedFeatureHelper {
	
	private ModPlacedFeatureHelper() {}

    public static ResourceKey<PlacedFeature> createResourceKey(String path) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(UniqueMaterialsMod.MODID, path));
    }
    
    public static List<PlacementModifier> createCommonUniformPlacement(int count, int minHeight, int maxHeight) {
        return orePlacement(CountPlacement.of(count), HeightRangePlacement.uniform(VerticalAnchor.absolute(minHeight), VerticalAnchor.absolute(maxHeight)));
    }
    
    public static List<PlacementModifier> createCommonTrianglePlacement(int count, int minHeight, int maxHeight) {
        return orePlacement(CountPlacement.of(count), HeightRangePlacement.triangle(VerticalAnchor.absolute(minHeight), VerticalAnchor.absolute(maxHeight)));
    }
    
    public static List<PlacementModifier> createRareUniformPlacement(int chance, int minHeight, int maxHeight) {
        return orePlacement(RarityFilter.onAverageOnceEvery(chance), HeightRangePlacement.uniform(VerticalAnchor.absolute(minHeight), VerticalAnchor.absolute(maxHeight)));
    }

    public static List<PlacementModifier> createRareTrianglePlacement(int chance, int minHeight, int maxHeight) {
        return orePlacement(RarityFilter.onAverageOnceEvery(chance), HeightRangePlacement.triangle(VerticalAnchor.absolute(minHeight), VerticalAnchor.absolute(maxHeight)));
    }

    private static List<PlacementModifier> orePlacement(PlacementModifier countPlacementModifier, PlacementModifier heightRangeModifier) {
        return List.of(countPlacementModifier, InSquarePlacement.spread(), heightRangeModifier, BiomeFilter.biome());
    }
    
    public static List<PlacementModifier> createTreePlacement(int baseCount, float extraChance, int extraCount, Block sapplingBlock) {
    	
    	// baseCount
    	// This is the base number of times the feature will attempt to generate in each chunk. 
    	// This number is guaranteed, meaning that if you set this to 1, the feature will try to generate at least once in every chunk.

    	// extraChance
    	// This is the probability (expressed as a float between 0.0 and 1.0) that an additional extraCount number of features will be generated in the chunk. 
    	// This chance is evaluated for each chunk independently.
    	
    	// extraCount
    	// This is the number of additional instances of the feature that will be generated if the extraChance condition is met. 
    	// If the random chance (determined by extraChance) succeeds, this many additional instances will be attempted in the chunk.
    	
    	// sapplingBlock
    	// Sapling block is passed to ensure that tree can survive on the terrain where is it about to be generated.
    	
    	return VegetationPlacements.treePlacement(PlacementUtils.countExtra(baseCount, extraChance, extraCount), sapplingBlock);
    }

}
