package ba.minecraft.uniquematerials.common.world.feature.tree;

import ba.minecraft.uniquematerials.common.helpers.ModConfiguredFeatureHelper;
import net.minecraft.core.HolderGetter;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public final class TreeConfiguredFeatures {

	private TreeConfiguredFeatures() {
	}

    public static final ResourceKey<ConfiguredFeature<?, ?>> BEECH = 
        	ModConfiguredFeatureHelper.createResourceKey("beech");
        
    public static final ResourceKey<ConfiguredFeature<?, ?>> BEECH_BEES_002 = 
    	ModConfiguredFeatureHelper.createResourceKey("beech_bees_002");

    public static final ResourceKey<ConfiguredFeature<?, ?>> MAHOGANY = 
    	ModConfiguredFeatureHelper.createResourceKey("mahogany");
        
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAHOGANY_BEES_002 = 
		ModConfiguredFeatureHelper.createResourceKey("mahogany_bees_002");

    public static final ResourceKey<ConfiguredFeature<?, ?>> SEQUOIA = 
        ModConfiguredFeatureHelper.createResourceKey("sequoia");
            
    public static final ResourceKey<ConfiguredFeature<?, ?>> SEQUOIA_BEES_002 = 
    	ModConfiguredFeatureHelper.createResourceKey("sequoia_bees_002");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
    	
    	HolderGetter<Item> itemsRegistry = context.lookup(Registries.ITEM);
    	HolderGetter<Enchantment> enchantmentsRegistry = context.lookup(Registries.ENCHANTMENT);
    	
    	registerExploration(context, itemsRegistry, enchantmentsRegistry);
    	registerOmnivore(context, itemsRegistry);

    	registerFreezingProtection(context, itemsRegistry, enchantmentsRegistry);
    	registerLightningProtection(context, itemsRegistry, enchantmentsRegistry);
    	registerMagicProtection(context, itemsRegistry, enchantmentsRegistry);
    	registerSonicProtection(context, itemsRegistry, enchantmentsRegistry);
    }
	
    
}
