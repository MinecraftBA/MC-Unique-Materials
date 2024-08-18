package ba.minecraft.uniquematerials.common.blocks.tree;

import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public final class WoodBlock extends RotatedPillarBlock {

	public WoodBlock(MapColor color) {
		super(createProperties(color));
	}

	private static Properties createProperties(MapColor color) {

		Properties properties = Properties.of();
		properties.strength(2.0F);
		properties.sound(SoundType.WOOD);
		properties.mapColor(color);
		properties.instrument(NoteBlockInstrument.BASS);
		properties.ignitedByLava();
		
		return properties;
		
	}
}
