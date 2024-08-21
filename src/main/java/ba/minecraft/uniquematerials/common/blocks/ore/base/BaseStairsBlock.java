package ba.minecraft.uniquematerials.common.blocks.ore.base;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class BaseStairsBlock extends StairBlock {

	public BaseStairsBlock(Block baseBlock) {
		super(baseBlock.defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(baseBlock));
	}

}
