package ba.minecraft.uniquematerials.common.world.feature;

import ba.minecraft.uniquematerials.common.world.feature.ore.OreConfiguredFeatures;
import ba.minecraft.uniquematerials.common.world.feature.tree.TreeConfiguredFeatures;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public final class ModConfiguredFeatures {

	private ModConfiguredFeatures() {}
	
	public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
		
		OreConfiguredFeatures.bootstrap(context);
		TreeConfiguredFeatures.bootstrap(context);
		
    }
}
