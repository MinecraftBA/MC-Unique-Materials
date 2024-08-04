package ba.minecraft.uniquematerials.common.items.base;

import java.util.function.Supplier;

import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public abstract class BaseItemRegistry {

	public static final DeferredRegister<Item> REGISTRY = 
			DeferredRegister.create(ForgeRegistries.ITEMS, UniqueMaterialsMod.MODID);


	protected static RegistryObject<BlockItem> registerBlockItem(String name, Supplier<Block> supplier) {
		return REGISTRY.register(name, () -> 
		{ 
			Properties properties = new Properties();
			properties.stacksTo(Item.DEFAULT_MAX_STACK_SIZE);
			return new BlockItem(supplier.get(), properties);
		});
	}
}
