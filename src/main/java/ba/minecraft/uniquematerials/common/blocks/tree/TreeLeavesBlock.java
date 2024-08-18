package ba.minecraft.uniquematerials.common.blocks.tree;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public final class TreeLeavesBlock extends LeavesBlock {

	private final static Properties PROPERTIES = createProperties();
	
	public TreeLeavesBlock() {
		super(PROPERTIES);
	}
	
	private static Properties createProperties() {
		
		Properties properties = Properties.of();
		properties.mapColor(MapColor.PLANT);
		properties.strength(0.2f);
		properties.randomTicks();
		properties.sound(SoundType.GRASS);
		properties.noOcclusion();
		properties.isValidSpawn(($blockState, $blockGetter, $blockPos, $entityType) -> {
			return $entityType == EntityType.OCELOT || $entityType == EntityType.PARROT; // Taken from Blocks::ocelotOrParrot
		});
		properties.isSuffocating(($blockState, $blockGetter, $blockPos) -> {
			return false; // Taken from Blocks::never
		});
		properties.isViewBlocking(($blockState, $blockGetter, $blockPos) -> {
			return false; // Taken from Blocks::never
		});
		properties.ignitedByLava();
		properties.pushReaction(PushReaction.DESTROY);
		properties.isRedstoneConductor(($blockState, $blockGetter, $blockPos) -> {
			return false; // Taken from Blocks::never
		});
		
		return properties;
	}

}