package ba.minecraft.uniquematerials.common.world.feature;

import ba.minecraft.uniquematerials.common.world.feature.ore.OrePlacedFeatures;
import ba.minecraft.uniquematerials.common.world.feature.tree.TreePlacedFeatures;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public final class ModPlacedFeatures {

	private ModPlacedFeatures() {}
	
    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
    	
    	OrePlacedFeatures.bootstrap(context);
    	TreePlacedFeatures.bootstrap(context);
    }
}
