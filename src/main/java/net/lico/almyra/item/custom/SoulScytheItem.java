package net.lico.almyra.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.math.BlockPos;
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
	public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner)
	{
		for(TagKey<Block> tag : mineableTags)
			if(state.isIn(tag)) return true;

		for(Block bs : this.otherMineableBlocks)
			if(bs.getDefaultState().equals(state)) return true;
		return false;
	}
}
