package ba.minecraft.uniquematerials.common.tags;

import ba.minecraft.uniquematerials.common.helpers.resource.ModResourceHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public final class ModBlockTags {

	private ModBlockTags() {}
	
	public static void init() {}

    private static TagKey<Block> create(String name){
        return TagKey.create(Registries.BLOCK, ModResourceHelper.create(name));
    }

    public static final TagKey<Block> SANDSTONE_ORE_REPLACEABLES = create("sandstone_ore_replaceables");
    public static final TagKey<Block> RED_SANDSTONE_ORE_REPLACEABLES = create("red_sandstone_ore_replaceables");
    public static final TagKey<Block> NETHERRACK_ORE_REPLACEABLES = create("netherrack_ore_replaceables");

	public static final TagKey<Block> NEEDS_NETHERITE_TOOL = create("needs_netherite_tool");

	public static final TagKey<Block> BEECH_LOGS = create("beech_logs");
	public static final TagKey<Block> MAHOGANY_LOGS = create("mahogany_logs");
	public static final TagKey<Block> SEQUOIA_LOGS = create("sequoia_logs");

}
