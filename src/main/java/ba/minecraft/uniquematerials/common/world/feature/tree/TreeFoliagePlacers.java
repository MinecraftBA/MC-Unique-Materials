package ba.minecraft.uniquematerials.common.world.feature.tree;

import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;

public final class TreeFoliagePlacers {

	public static final BlobFoliagePlacer BEECH = 
		new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 5);
	
	public static final BlobFoliagePlacer MAHOGANY = 
		new BlobFoliagePlacer(ConstantInt.of(5), ConstantInt.of(0), 5);
	
	public static final BlobFoliagePlacer SEQUOIA = 
		new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), 6);
	
}
