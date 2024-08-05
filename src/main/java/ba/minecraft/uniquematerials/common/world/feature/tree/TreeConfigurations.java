package ba.minecraft.uniquematerials.common.world.feature.tree;

import java.util.ArrayList;
import java.util.function.Supplier;

import ba.minecraft.uniquematerials.common.blocks.TreeBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration.TreeConfigurationBuilder;
import net.minecraft.world.level.levelgen.feature.featuresize.FeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.BeehiveDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TrunkVineDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;

public final class TreeConfigurations {

	private TreeConfigurations() {
	}

	private static TreeConfigurationBuilder createDefaultBuilder(Block trunkBlock, Block leavesBlock, TrunkPlacer trunkPlacer, FoliagePlacer foliagePlacer, FeatureSize featureSize) {
		return new TreeConfigurationBuilder(
			BlockStateProvider.simple(trunkBlock), // Block that will be used as body of the tree.
			trunkPlacer, // Strategy for placing trunk blocks.
			BlockStateProvider.simple(leavesBlock), // Block that will be used to form foliage.
			foliagePlacer, // Strategy for placing foliage blocks.
			featureSize // Size of the feature in the world?
		);
	}
	
	private static void addDecorators(TreeConfigurationBuilder builder, boolean addVines, float beeHiveProbability) {
		ArrayList<TreeDecorator> decorators = new ArrayList<TreeDecorator>();
		
		// IF: Vines should be added to the tree.
		if(addVines) {
			decorators.add(TrunkVineDecorator.INSTANCE);
			decorators.add(new LeaveVineDecorator(0.25F));
		} else {
			builder.ignoreVines();
		}
		
		// IF: There is a probability that bee hive should be spawned.
		if(beeHiveProbability > 0) {
			decorators.add(new BeehiveDecorator(beeHiveProbability));
		}
		
		// IF: There are decorators to be added to the tree.
		if(decorators.size() != 0) {
			builder.decorators(decorators);
		}
	}
	
	private static TreeConfiguration createBeechConfiguration(boolean addVines, float beeHiveProbability) {
		TreeConfigurationBuilder builder = createDefaultBuilder(
			TreeBlocks.BEECH_LOG.get(),
			TreeBlocks.BEECH_LEAVES.get(),
			TreeTrunkPlacers.BEECH,
			TreeFoliagePlacers.BEECH,
			TreeFeatureSizes.BEECH
		);
		
		addDecorators(builder, addVines, beeHiveProbability);
		
		return builder.build();
	}
	
	private static TreeConfiguration createMahoganyConfiguration(boolean addVines, float beeHiveProbability) {
		TreeConfigurationBuilder builder = createDefaultBuilder(
			TreeBlocks.MAHOGANY_LOG.get(),
			TreeBlocks.MAHOGANY_LEAVES.get(),
			TreeTrunkPlacers.MAHOGANY,
			TreeFoliagePlacers.MAHOGANY,
			TreeFeatureSizes.MAHOGANY
		);
		
		addDecorators(builder, addVines, beeHiveProbability);
		return builder.build();
	}
	
	private static TreeConfiguration createSequoiaConfiguration(boolean addVines, float beeHiveProbability) {
		TreeConfigurationBuilder builder = createDefaultBuilder(
			TreeBlocks.SEQUOIA_LOG.get(),
			TreeBlocks.SEQUOIA_LEAVES.get(),
			TreeTrunkPlacers.SEQUOIA,
			TreeFoliagePlacers.SEQUOIA,
			TreeFeatureSizes.SEQUOIA
		);
		
		addDecorators(builder, addVines, beeHiveProbability);
		
		return builder.build();
	}
	
	// Beech
	
	public static final Supplier<TreeConfiguration> BEECH = 
		() -> createBeechConfiguration(false, 0);
	
	public static final Supplier<TreeConfiguration> BEECH_BEEHIVE_005 = 
		() -> createBeechConfiguration(false, 0.05f);

	// Mahogany
	
	public static final Supplier<TreeConfiguration> MAHOGANY = 
		() -> createMahoganyConfiguration(false, 0);
	
	// Sequoia
	
	public static final Supplier<TreeConfiguration> SEQUOIA = 
		() -> createSequoiaConfiguration(false, 0);
		
}
