package ba.minecraft.uniquematerials.common.world.feature;

import ba.minecraft.uniquematerials.common.world.feature.ore.OrePlacedFeatures;
import ba.minecraft.uniquematerials.common.world.feature.tree.TreePlacedFeatures;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public final class ModPlacedFeatures {

	private ModPlacedFeatures() {}
	
    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
    	
    	// Required to load Vanilla placed features.
        PlacementUtils.bootstrap(context);

    	OrePlacedFeatures.bootstrap(context);
    	TreePlacedFeatures.bootstrap(context);
    }
}
