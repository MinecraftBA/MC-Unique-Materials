package ba.minecraft.uniquematerials.common.blocks.ore;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public final class SilverBlock extends Block {

	private static final Properties PROPERTIES = createProperties();
	
	public SilverBlock() {
		super(PROPERTIES);
	}

	private static Properties createProperties() {
		Properties properties = Properties.of();
		properties.strength(3.0F, 6.0F);
		properties.sound(SoundType.METAL);
		properties.requiresCorrectToolForDrops();
		return properties;
	}
}