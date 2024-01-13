package ba.minecraft.uniquematerials.common.item.base;

import com.google.common.base.Supplier;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public abstract class BaseItemRegistry {

	protected static RegistryObject<BlockItem> registerBlockItem(DeferredRegister<Item> registry, String name, Supplier<Block> supplier) {
		return registry.register(name, () -> 
		{ 
			Properties properties = new Properties();
			properties.stacksTo(Item.MAX_STACK_SIZE);
			return new BlockItem(supplier.get(), properties);
		});
	}
}
