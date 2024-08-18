package ba.minecraft.uniquematerials.common.blocks.ore.base;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public final class RawOreBlock extends Block {

	public RawOreBlock(MapColor color) {
		super(createProperties(color));
	}
	
	private static Properties createProperties(MapColor color) {

		Properties properties = Properties.of();
		properties.mapColor(color);
		properties.instrument(NoteBlockInstrument.BASEDRUM);
		properties.requiresCorrectToolForDrops();
		properties.strength(5.0F, 6.0F);
		
		return properties;
	}

}
