package ba.minecraft.uniquematerials.common.blocks.tree;

import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public final class TreeSaplingBlock extends SaplingBlock {

	public static Properties PROPERTIES = createProperties();
	
	public TreeSaplingBlock(TreeGrower treeGrower) {
		super(treeGrower, PROPERTIES);
	}

	private static Properties createProperties() {

		Properties properties = Properties.of();
		properties.mapColor(MapColor.PLANT);
		properties.sound(SoundType.GRASS);
		properties.noCollission();
		properties.randomTicks();
		properties.instabreak();
		properties.pushReaction(PushReaction.DESTROY);
		
		return properties;
		
	}
	
}
