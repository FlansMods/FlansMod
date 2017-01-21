package com.flansmod.common.teams;

import java.util.List;

import com.flansmod.common.FlansMod;
import com.flansmod.common.parts.EnumPartCategory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

// Does nothing. Just here for rendering purposes
public class ItemRewardBox extends Item 
{
	public RewardBox type;
	
	public ItemRewardBox(RewardBox box)
	{
		super();
		type = box;
		type.item = this;

		GameRegistry.registerItem(this, type.shortName, FlansMod.MODID);
	}
	
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		par3List.add("Useless item. Never used outside of rank-based PVP");
	}
}
