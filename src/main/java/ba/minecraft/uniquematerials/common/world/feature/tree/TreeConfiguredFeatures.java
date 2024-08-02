package ba.minecraft.uniquematerials.common.world.feature.tree;

import ba.minecraft.uniquematerials.common.helpers.ModFeatureHelper;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public final class TreeConfiguredFeatures {

	private TreeConfiguredFeatures() {
	}
	
    public static final ResourceKey<ConfiguredFeature<?, ?>> BEECH = 
    	ModFeatureHelper.createResourceKey("beech");
    
    public static final ResourceKey<ConfiguredFeature<?, ?>> BEECH_BEES_002 = 
    	ModFeatureHelper.createResourceKey("beech_bees_002");

    public static final ResourceKey<ConfiguredFeature<?, ?>> MAHOGANY = 
    	ModFeatureHelper.createResourceKey("mahogany");
        
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAHOGANY_BEES_002 = 
		ModFeatureHelper.createResourceKey("mahogany_bees_002");

    public static final ResourceKey<ConfiguredFeature<?, ?>> SEQUOIA = 
        ModFeatureHelper.createResourceKey("sequoia");
            
    public static final ResourceKey<ConfiguredFeature<?, ?>> SEQUOIA_BEES_002 = 
    	ModFeatureHelper.createResourceKey("sequoia_bees_002");
    
}
