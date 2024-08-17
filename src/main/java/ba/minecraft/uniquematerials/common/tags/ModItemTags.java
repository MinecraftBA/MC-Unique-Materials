package ba.minecraft.uniquematerials.common.tags;

import ba.minecraft.uniquematerials.common.helpers.resource.ModResourceHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public final class ModItemTags {
	
	private ModItemTags() {}
	
	public static void init() {}
	
    private static TagKey<Item> create(String name){
        return TagKey.create(Registries.ITEM, ModResourceHelper.create(name));
    }
	public static final TagKey<Item> BEECH_LOGS = create("beech_logs");
	public static final TagKey<Item> MAHOGANY_LOGS = create("mahogany_logs");
	public static final TagKey<Item> SEQUOIA_LOGS = create("sequoia_logs");

}

