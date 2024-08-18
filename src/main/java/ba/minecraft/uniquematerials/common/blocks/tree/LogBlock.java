package ba.minecraft.uniquematerials.common.blocks.tree;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public final class LogBlock extends RotatedPillarBlock {

	public LogBlock(MapColor logColor, MapColor barkColor) {
		super(createProperties(logColor, barkColor));
	}
	
	public LogBlock(MapColor logColor) {
		super(createProperties(logColor, logColor));
	}

	private static Properties createProperties(MapColor logColor, MapColor barkColor) {

		Properties properties = Properties.of();
		properties.mapColor($bs -> $bs.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? logColor : barkColor);
		properties.sound(SoundType.WOOD);
		properties.instrument(NoteBlockInstrument.BASS);
		properties.strength(2.0F);
		properties.ignitedByLava();
		
		return properties;
	}
}
