package ba.minecraft.uniquematerials.common.world.feature.tree;

import java.util.List;
import java.util.function.Supplier;

import com.google.common.base.Suppliers;

import ba.minecraft.uniquematerials.common.blocks.TreeBlocks;
import ba.minecraft.uniquematerials.common.blocks.tree.TreeSaplingBlock;
import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import net.minecraft.core.BlockPos;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class TreePlacedFeatures {

	private TreePlacedFeatures() {
	}

	public static final DeferredRegister<PlacedFeature> REGISTRY = 
		DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, UniqueMaterialsMod.MODID);
	
	private static RegistryObject<PlacedFeature> register(String name, RegistryObject<ConfiguredFeature<?, ?>> treeFeature, RegistryObject<? extends TreeSaplingBlock> saplingBlock) {
		
		Supplier<List<PlacementModifier>> placementModifiers = Suppliers.memoize(() -> List.of(
			PlacementUtils.countExtra(0, 0.05F, 1), 
			InSquarePlacement.spread(), 
			VegetationPlacements.TREE_THRESHOLD, 
			PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, 
			BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(saplingBlock.get().defaultBlockState(), BlockPos.ZERO)), 
			BiomeFilter.biome()
		));
		
		return REGISTRY.register(name, () -> new PlacedFeature(treeFeature.getHolder().get(), placementModifiers.get()));
	}

	// Beech
	
	public static final RegistryObject<PlacedFeature> BEECH_PLAINS = 
		register("beech_plains", TreeConfiguredFeatures.BEECH, TreeBlocks.BEECH_SAPLING);

	public static final RegistryObject<PlacedFeature> BEECH_BEEHIVE_020_PLAINS = 
		register("beech_beehive_020_plains", TreeConfiguredFeatures.BEECH_BEEHIVE_020, TreeBlocks.BEECH_SAPLING);

	// Mahogany

	public static final RegistryObject<PlacedFeature> MAHOGANY_HOT_OVERWORLD = 
		register("mahogany_hot_overworld", TreeConfiguredFeatures.MAHOGANY, TreeBlocks.MAHOGANY_SAPLING);

	public static final RegistryObject<PlacedFeature> MAHOGANY_BEEHIVE_020_HOT_OVERWORLD = 
		register("mahogany_beehive_020_hot_overworld", TreeConfiguredFeatures.MAHOGANY_BEEHIVE_020, TreeBlocks.MAHOGANY_SAPLING);

	// Sequoia

	public static final RegistryObject<PlacedFeature> SEQUOIA_MOUNTAIN = 
		register("sequoia_mountain", TreeConfiguredFeatures.SEQUOIA, TreeBlocks.SEQUOIA_SAPLING);

	public static final RegistryObject<PlacedFeature> SEQUOIA_BEEHIVE_030_MOUNTAIN = 
		register("sequoia_beehive_030_mountain", TreeConfiguredFeatures.SEQUOIA_BEEHIVE_030, TreeBlocks.SEQUOIA_SAPLING);

}