package ba.minecraft.uniquematerials.common.helpers.feature;

import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public final class ModPlacedFeatureHelper {
	
	private ModPlacedFeatureHelper() {}

    public static ResourceKey<PlacedFeature> createResourceKey(String path) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(UniqueMaterialsMod.MODID, path));
    }

}
