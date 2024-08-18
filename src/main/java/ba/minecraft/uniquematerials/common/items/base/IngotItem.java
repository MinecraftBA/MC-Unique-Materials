package ba.minecraft.uniquematerials.common.items.base;

import net.minecraft.world.item.Item;

public final class IngotItem extends Item {

	public IngotItem(Boolean isFireResistant) {
		super(createProperties(isFireResistant));
	}
	
	private static Properties createProperties(Boolean isFireResistant) {
		Properties properties = new Properties();
		
		if (isFireResistant) {
			properties.fireResistant();
		}
		
		return properties;
	}

}
