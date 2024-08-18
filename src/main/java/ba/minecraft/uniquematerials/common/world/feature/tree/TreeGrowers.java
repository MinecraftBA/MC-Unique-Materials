package ba.minecraft.uniquematerials.common.world.feature.tree;

import java.util.Optional;

import net.minecraft.world.level.block.grower.TreeGrower;

public final class TreeGrowers {

	public static final TreeGrower BEECH = 
		new TreeGrower("beech", Optional.empty(), Optional.of(TreeConfiguredFeatures.BEECH), Optional.of(TreeConfiguredFeatures.BEECH_BEES_005));

	public static final TreeGrower MAHOGANY = 
		new TreeGrower("mahogany", Optional.empty(), Optional.of(TreeConfiguredFeatures.MAHOGANY), Optional.empty());
	
	public static final TreeGrower SEQUOIA = 
		new TreeGrower("sequoia", Optional.empty(), Optional.of(TreeConfiguredFeatures.SEQUOIA), Optional.empty());
}
