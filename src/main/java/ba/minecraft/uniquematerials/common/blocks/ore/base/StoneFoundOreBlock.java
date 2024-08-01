package ba.minecraft.uniquematerials.common.blocks.ore.base;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public final class StoneFoundOreBlock extends DropExperienceBlock {

	private static final Properties PROPERTIES = createProperties();
	
	public StoneFoundOreBlock(UniformInt xpRange) {
		super(xpRange, PROPERTIES);
	}

	private static Properties createProperties() {

		Properties properties = Properties.of();
		properties.mapColor(MapColor.STONE);
		properties.instrument(NoteBlockInstrument.BASEDRUM);
		properties.requiresCorrectToolForDrops();
		properties.strength(3.0F, 3.0F);
		
		return properties;
	}
	
}
