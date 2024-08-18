package ba.minecraft.uniquematerials.client.colors;

import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.state.BlockState;

public final class BiomeLeavesItemColor implements ItemColor {

	private final BlockColors blockColors;
	
	public BiomeLeavesItemColor(BlockColors blockColors) {
		this.blockColors = blockColors;
	}

	@Override
	public int getColor(ItemStack itemStack, int tintIndex) {
        BlockState blockState = ((BlockItem)itemStack.getItem()).getBlock().defaultBlockState();
        return blockColors.getColor(blockState, (BlockAndTintGetter)null, (BlockPos)null, tintIndex);
	}

}
