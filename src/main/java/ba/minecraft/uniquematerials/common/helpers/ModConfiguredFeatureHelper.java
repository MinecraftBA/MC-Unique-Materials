package ba.minecraft.uniquematerials.common.helpers;

import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public final class ModConfiguredFeatureHelper {
	
	private ModConfiguredFeatureHelper() {}

    public static ResourceKey<ConfiguredFeature<?, ?>> createResourceKey(String path) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(UniqueMaterialsMod.MODID, path));
    }

}
