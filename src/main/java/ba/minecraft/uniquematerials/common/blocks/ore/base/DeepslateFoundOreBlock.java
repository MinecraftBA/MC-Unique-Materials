package ba.minecraft.uniquematerials.common.blocks.ore.base;

import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public final class DeepslateFoundOreBlock extends DropExperienceBlock {

	private static final Properties PROPERTIES = createProperties();
	
	public DeepslateFoundOreBlock(UniformInt xpRange) {
		super(xpRange, PROPERTIES);
	}
	
	public DeepslateFoundOreBlock() {
		super(ConstantInt.of(0), PROPERTIES);
	}

	private static Properties createProperties() {

		Properties properties = Properties.of();
		properties.mapColor(MapColor.DEEPSLATE);
		properties.instrument(NoteBlockInstrument.BASEDRUM);
		properties.requiresCorrectToolForDrops();
		properties.strength(4.5F, 3.0F);
		properties.sound(SoundType.DEEPSLATE);
		
		return properties;
	}
	
}
