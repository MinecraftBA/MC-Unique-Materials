package ba.minecraft.uniquematerials.common.items;

import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import ba.minecraft.uniquematerials.common.items.tools.TileCarverItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ToolItems {

	private ToolItems() {}
	
	public static final DeferredRegister<Item> REGISTRY = 
			DeferredRegister.create(ForgeRegistries.ITEMS, UniqueMaterialsMod.MODID);

	public static final RegistryObject<TileCarverItem> TILE_CARVER = 
			REGISTRY.register("tile_carver", () -> new TileCarverItem());
}
