package ba.minecraft.uniquematerials.common.world.feature.ore;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public final class OrePlacedFeatures {
	
	private OrePlacedFeatures() {}
	
	public static void bootstrap(BootstrapContext<PlacedFeature> context) {
		
	    HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

	}
}
