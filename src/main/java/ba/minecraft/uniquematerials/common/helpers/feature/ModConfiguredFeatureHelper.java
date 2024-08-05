package ba.minecraft.uniquematerials.common.helpers.feature;

import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;

public final class ModConfiguredFeatureHelper {
	
	private ModConfiguredFeatureHelper() {}

    public static ResourceKey<ConfiguredFeature<?, ?>> createResourceKey(String path) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(UniqueMaterialsMod.MODID, path));
    }

    public static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
    	context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
