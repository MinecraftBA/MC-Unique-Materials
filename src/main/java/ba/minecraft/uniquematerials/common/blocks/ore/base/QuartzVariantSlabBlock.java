package ba.minecraft.uniquematerials.common.blocks.ore.base;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public final class QuartzVariantSlabBlock extends SlabBlock {

	public QuartzVariantSlabBlock(MapColor mapColor) {
		super(createProperties(mapColor));
	}

	public QuartzVariantSlabBlock(Block baseBlock) {
		super(Properties.ofLegacyCopy(baseBlock));
	}

	private static Properties createProperties(MapColor mapColor) {

		Properties properties = Properties.of();
		properties.mapColor(mapColor);
		properties.requiresCorrectToolForDrops();
		properties.strength(2.0F, 6.0F);
		properties.instrument(NoteBlockInstrument.BASEDRUM);
		
		return properties;
	}
}
