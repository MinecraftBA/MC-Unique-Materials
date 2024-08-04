package ba.minecraft.uniquematerials.common.items.base;

import net.minecraft.world.item.Item;

public final class RawOreItem extends Item {
	
	private static final Properties PROPERTIES = createProperties();
	
	public RawOreItem() {
		super(PROPERTIES);
	}
	
	private static Properties createProperties() {
		Properties properties = new Properties();
		return properties;
	}
}
