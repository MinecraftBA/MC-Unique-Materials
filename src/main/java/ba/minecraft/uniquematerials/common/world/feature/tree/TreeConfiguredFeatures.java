package ba.minecraft.uniquematerials.common.world.feature.tree;

import ba.minecraft.uniquematerials.common.helpers.feature.ModConfiguredFeatureHelper;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;

public final class TreeConfiguredFeatures {

	private TreeConfiguredFeatures() {
	}

    public static final ResourceKey<ConfiguredFeature<?, ?>> BEECH = 
        	ModConfiguredFeatureHelper.createResourceKey("beech");
        
    public static final ResourceKey<ConfiguredFeature<?, ?>> BEECH_BEES_005 = 
    	ModConfiguredFeatureHelper.createResourceKey("beech_bees_005");

    public static final ResourceKey<ConfiguredFeature<?, ?>> MAHOGANY = 
    	ModConfiguredFeatureHelper.createResourceKey("mahogany");
        
    public static final ResourceKey<ConfiguredFeature<?, ?>> SEQUOIA = 
        ModConfiguredFeatureHelper.createResourceKey("sequoia");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
    	
        ModConfiguredFeatureHelper.register(context, BEECH, Feature.TREE, TreeConfigurations.BEECH.get());
        ModConfiguredFeatureHelper.register(context, BEECH_BEES_005, Feature.TREE, TreeConfigurations.BEECH_BEEHIVE_005.get());
        ModConfiguredFeatureHelper.register(context, BEECH, Feature.TREE, TreeConfigurations.BEECH.get());
        ModConfiguredFeatureHelper.register(context, BEECH, Feature.TREE, TreeConfigurations.BEECH.get());
    }
    
}
