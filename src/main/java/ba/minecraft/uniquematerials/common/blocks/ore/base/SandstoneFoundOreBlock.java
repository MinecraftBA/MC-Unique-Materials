package ba.minecraft.uniquematerials.common.blocks.ore.base;

import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public final class SandstoneFoundOreBlock extends DropExperienceBlock {

	private static final Properties PROPERTIES = createProperties();
	
	public SandstoneFoundOreBlock(UniformInt xpRange) {
		super(xpRange, PROPERTIES);
	}

	public SandstoneFoundOreBlock() {
		super(ConstantInt.of(0), PROPERTIES);
	}
	
	private static Properties createProperties() {
		
		Properties properties = Properties.of();
		properties.mapColor(MapColor.SAND);
		properties.sound(SoundType.SAND);
		properties.instrument(NoteBlockInstrument.BASEDRUM);
		properties.requiresCorrectToolForDrops();
		properties.strength(0.8F);
		
		return properties;
	}
	
}
