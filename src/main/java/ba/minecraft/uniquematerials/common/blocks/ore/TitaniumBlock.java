package ba.minecraft.uniquematerials.common.blocks.ore;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public final class TitaniumBlock extends Block {

	private static final Properties PROPERTIES = createProperties();
	
	public TitaniumBlock() {
		super(PROPERTIES);
	}

	private static Properties createProperties() {
		Properties properties = Properties.of();
		properties.mapColor(MapColor.COLOR_LIGHT_GRAY);
		properties.instrument(NoteBlockInstrument.IRON_XYLOPHONE);
		properties.strength(50.0F, 1200.0F); // Same as Netherite.
		properties.sound(SoundType.METAL);
		properties.requiresCorrectToolForDrops();
		return properties;
	}
}