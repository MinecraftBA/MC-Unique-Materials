package ba.minecraft.uniquematerials.common.blocks.ore.base;

import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public final class NetherrackFoundOreBlock extends DropExperienceBlock {

	private static final Properties PROPERTIES = createProperties();

	public NetherrackFoundOreBlock(UniformInt xpRange) {
		super(xpRange, PROPERTIES);
	}
	
	public NetherrackFoundOreBlock() {
		super(ConstantInt.of(0), PROPERTIES);
	}
	
	private static Properties createProperties() {

		Properties properties = Properties.of();
		properties.mapColor(MapColor.NETHER);
		properties.requiresCorrectToolForDrops();
		properties.strength(3.0F, 3.0F);
		properties.instrument(NoteBlockInstrument.BASEDRUM);
		properties.sound(SoundType.NETHER_ORE);
		
		return properties;
	}
}
