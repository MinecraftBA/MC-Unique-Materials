package ba.minecraft.uniquematerials.common.world.feature.tree;

import ba.minecraft.uniquematerials.common.blocks.TreeBlocks;
import ba.minecraft.uniquematerials.common.helpers.feature.ModPlacedFeatureHelper;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public final class TreePlacedFeatures {

    public static final ResourceKey<PlacedFeature> BEECH_CHECKED = 
    		ModPlacedFeatureHelper.createResourceKey("beech_checked");

    public static final ResourceKey<PlacedFeature> BEECH_BEES_005 = 
    		ModPlacedFeatureHelper.createResourceKey("beech_bees_005");

    public static final ResourceKey<PlacedFeature> MAHOGANY_CHECKED = 
    		ModPlacedFeatureHelper.createResourceKey("mahogany_checked");

    public static final ResourceKey<PlacedFeature> SEQUOIA_CHECKED = 
    		ModPlacedFeatureHelper.createResourceKey("sequoia_checked");


	private TreePlacedFeatures() {
	}
	
    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
    	
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeaturesHolderGetter = context.lookup(Registries.CONFIGURED_FEATURE);
 
        Holder<ConfiguredFeature<?, ?>> beechHolder = configuredFeaturesHolderGetter.getOrThrow(TreeConfiguredFeatures.BEECH);
        PlacementUtils.register(context, BEECH_BEES_005, beechHolder, PlacementUtils.filteredByBlockSurvival(TreeBlocks.BEECH_SAPLING.get()));

        Holder<ConfiguredFeature<?, ?>> beechBees005Holder = configuredFeaturesHolderGetter.getOrThrow(TreeConfiguredFeatures.BEECH_BEES_005);
        PlacementUtils.register(context, BEECH_BEES_005, beechBees005Holder, PlacementUtils.filteredByBlockSurvival(TreeBlocks.BEECH_SAPLING.get()));

        Holder<ConfiguredFeature<?, ?>> mahoganyHolder = configuredFeaturesHolderGetter.getOrThrow(TreeConfiguredFeatures.MAHOGANY);
        PlacementUtils.register(context, MAHOGANY_CHECKED, mahoganyHolder, PlacementUtils.filteredByBlockSurvival(TreeBlocks.MAHOGANY_SAPLING.get()));

        Holder<ConfiguredFeature<?, ?>> sequoiaHolder = configuredFeaturesHolderGetter.getOrThrow(TreeConfiguredFeatures.SEQUOIA);
        PlacementUtils.register(context, SEQUOIA_CHECKED, sequoiaHolder, PlacementUtils.filteredByBlockSurvival(TreeBlocks.SEQUOIA_SAPLING.get()));

    }

}