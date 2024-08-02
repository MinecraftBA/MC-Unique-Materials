package ba.minecraft.uniquematerials.common.blocks.tree;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public final class PlanksBlock extends Block {

	public PlanksBlock(MapColor color) {
		super(createProperties(color));
	}

	private static Properties createProperties(MapColor color) {

		Properties properties = Properties.of();
		properties.mapColor(color);
		properties.sound(SoundType.WOOD);
		properties.instrument(NoteBlockInstrument.BASS);
		properties.strength(2.0F, 3.0F);
		properties.ignitedByLava();
		
		return properties;
	}

}
