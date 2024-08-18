package ba.minecraft.uniquematerials.common.world.feature.tree;

import ba.minecraft.uniquematerials.common.helpers.feature.ModConfiguredFeatureHelper;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;

public final class TreeConfiguredFeatures {

	private TreeConfiguredFeatures() {
	}

    public static final ResourceKey<ConfiguredFeature<?, ?>> BEECH = 
        	ModConfiguredFeatureHelper.createResourceKey("tree_beech");
        
    public static final ResourceKey<ConfiguredFeature<?, ?>> BEECH_BEES_005 = 
    		ModConfiguredFeatureHelper.createResourceKey("tree_beech_bees_005");

    public static final ResourceKey<ConfiguredFeature<?, ?>> MAHOGANY = 
    		ModConfiguredFeatureHelper.createResourceKey("tree_mahogany");
        
    public static final ResourceKey<ConfiguredFeature<?, ?>> SEQUOIA = 
    		ModConfiguredFeatureHelper.createResourceKey("tree_sequoia");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
    	
        FeatureUtils.register(context, BEECH, Feature.TREE, TreeConfigurations.BEECH.get());
        FeatureUtils.register(context, BEECH_BEES_005, Feature.TREE, TreeConfigurations.BEECH_BEEHIVE_005.get());
        FeatureUtils.register(context, MAHOGANY, Feature.TREE, TreeConfigurations.MAHOGANY.get());
        FeatureUtils.register(context, SEQUOIA, Feature.TREE, TreeConfigurations.SEQUOIA.get());
        
    }
    
}
