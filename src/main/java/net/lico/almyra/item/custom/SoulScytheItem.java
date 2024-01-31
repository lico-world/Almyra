package net.lico.almyra.item.custom;

import net.lico.almyra.block.ModBlocks;
import net.lico.almyra.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Arrays;

public class SoulScytheItem extends Item
{
	private final ArrayList<TagKey<Block>> mineableTags = new ArrayList<>(Arrays.asList(
			BlockTags.LOGS,
			BlockTags.CROPS
	));
	private final Block[] otherMineableBlocks = {

	};

	public SoulScytheItem(Settings settings)
	{
		super(settings);
	}

	@Override
	public ActionResult useOnBlock(ItemUsageContext context)
	{
		World world = context.getWorld();
		if(world.isClient()) return ActionResult.PASS;

		if(!world.getBlockState(context.getBlockPos()).isIn(ModTags.Blocks.SOUL_TRANSFORMABLE))
			return ActionResult.FAIL;

		world.setBlockState(context.getBlockPos(), ModBlocks.SOUL_DUST_BLOCK.getDefaultState());

		return ActionResult.SUCCESS;
	}
}
