package net.lico.almyra.item.custom;

import net.lico.almyra.block.ModBlocks;
import net.lico.almyra.item.ModItems;
import net.lico.almyra.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class SoulScytheItem extends Item
{
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
		world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_SAND_HIT,
				SoundCategory.BLOCKS, 1f, 1f);

		return ActionResult.SUCCESS;
	}

	@Override
	public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner)
	{
		if(world.isClient()) return false;

		Random rand = new Random();
		int nb = rand.nextInt(3) + 2;

		if(state.isIn(ModTags.Blocks.SOUL_SCYTHE_MINEABLE))
			for(int i=0 ; i<nb ; i++)
				world.spawnEntity(new ItemEntity(world,
						pos.getX(), pos.getY(), pos.getZ(),
						new ItemStack(ModItems.NORMAL_SOUL)));

		return true;
	}

	@Override
	public float getMiningSpeedMultiplier(ItemStack stack, BlockState state)
	{
		return state.isIn(ModTags.Blocks.SOUL_SCYTHE_MINEABLE) ? 7.0f : .5f;
	}
}
