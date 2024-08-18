package ba.minecraft.uniquematerials.client.events.color;

import ba.minecraft.uniquematerials.client.colors.BiomeLeavesBlockColor;
import ba.minecraft.uniquematerials.client.colors.BiomeLeavesItemColor;
import ba.minecraft.uniquematerials.common.blocks.TreeBlocks;
import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import ba.minecraft.uniquematerials.common.items.TreeItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = UniqueMaterialsMod.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public final class RegisterColorHandlersEventHandler {

	@SubscribeEvent
	public static void onRegisterBlockColorHandlers(final RegisterColorHandlersEvent.Block event) {
		event.register(new BiomeLeavesBlockColor(), 
			TreeBlocks.BEECH_LEAVES.get(),
			TreeBlocks.MAHOGANY_LEAVES.get(),
			TreeBlocks.SEQUOIA_LEAVES.get()
		);
	}

	@SubscribeEvent
	public static void onRegisterItemColorHandlers(final RegisterColorHandlersEvent.Item event) {
		event.register(new BiomeLeavesItemColor(event.getBlockColors()), 
			TreeItems.BEECH_LEAVES.get(), 
			TreeItems.MAHOGANY_LEAVES.get(),
			TreeItems.SEQUOIA_LEAVES.get()
		);
	}
	
}