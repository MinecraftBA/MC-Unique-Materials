package ba.minecraft.uniquematerials.common.blocks.ore.base;

import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class QuartzVariantPillarBlock extends RotatedPillarBlock {

	public QuartzVariantPillarBlock(MapColor mapColor) {
		super(createProperties(mapColor));
	}
	
	private static Properties createProperties(MapColor mapColor) {

		Properties properties = Properties.of();
		properties.mapColor(mapColor);
		properties.requiresCorrectToolForDrops();
		properties.strength(0.8F);
		properties.instrument(NoteBlockInstrument.BASEDRUM);
		
		return properties;
	}
}

