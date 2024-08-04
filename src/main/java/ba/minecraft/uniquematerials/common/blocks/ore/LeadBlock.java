package ba.minecraft.uniquematerials.common.blocks.ore;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public final class LeadBlock extends Block {
	
	private static final Properties PROPERTIES = createProperties();
		
	public LeadBlock() {
		super(PROPERTIES);
	}
	
	private static Properties createProperties() {

		Properties properties = Properties.of();
		properties.mapColor(MapColor.COLOR_GRAY);
		properties.instrument(NoteBlockInstrument.BASEDRUM);
		properties.strength(3.0F, 6.0F);
		properties.sound(SoundType.METAL);
		properties.requiresCorrectToolForDrops();
		return properties;
		
	}
}
