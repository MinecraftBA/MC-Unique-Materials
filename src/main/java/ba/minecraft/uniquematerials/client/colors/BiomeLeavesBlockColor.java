package ba.minecraft.uniquematerials.client.colors;

import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.state.BlockState;

public final class BiomeLeavesBlockColor implements BlockColor {

	@Override
	public int getColor(BlockState blockState, BlockAndTintGetter getter, BlockPos blockPos, int tintIndex) {
        return getter != null && blockPos != null ? 
        		BiomeColors.getAverageFoliageColor(getter, blockPos) : 
    			FoliageColor.getDefaultColor();
	}

}