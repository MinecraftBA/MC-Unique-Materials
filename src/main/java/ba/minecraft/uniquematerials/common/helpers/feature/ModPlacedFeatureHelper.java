package ba.minecraft.uniquematerials.common.helpers.feature;

import java.util.List;

import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
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

}
