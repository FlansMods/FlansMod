package com.flansmod.common.teams;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

// Does nothing. Just here for rendering purposes
public class ItemRewardBox extends Item
{
	public RewardBox type;
	
	public ItemRewardBox(RewardBox box)
	{
		super();
		type = box;
		setRegistryName(type.shortName);
		type.item = this;
	}
	
	@Override
	public void addInformation(ItemStack stack, World world, List<String> lines, ITooltipFlag b)
	{
		lines.add("Useless item. Never used outside of rank-based PVP");
	}
}
