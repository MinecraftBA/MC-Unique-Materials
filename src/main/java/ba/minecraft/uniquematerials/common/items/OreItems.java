package ba.minecraft.uniquematerials.common.items;

import com.google.common.base.Supplier;

import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import ba.minecraft.uniquematerials.common.items.base.BaseItemRegistry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class OreItems extends BaseItemRegistry {

	private OreItems() {}

	public static final DeferredRegister<Item> REGISTRY = 
			DeferredRegister.create(ForgeRegistries.ITEMS, UniqueMaterialsMod.MODID);

	private static RegistryObject<BlockItem> registerOreBlockItem(String name, Supplier<Block> supplier) {
		return registerBlockItem(REGISTRY, name, supplier);
	}

}
