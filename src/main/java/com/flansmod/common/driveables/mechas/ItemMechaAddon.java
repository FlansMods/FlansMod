package com.flansmod.common.driveables.mechas;

import java.util.Collections;
import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;

public class ItemMechaAddon extends Item implements IFlanItem
{
	public MechaItemType type;
	
	public ItemMechaAddon(MechaItemType type1)
	{
		type = type1;
		setMaxStackSize(1);
		type.item = this;
		setRegistryName(type.shortName);
		setCreativeTab(FlansMod.tabFlanMechas);
	}
	
	@Override
	public void addInformation(ItemStack stack, World world, List<String> lines, ITooltipFlag b)
	{
		if(type.description != null)
		{
			Collections.addAll(lines, type.description.split("_"));
		}
	}
	
	@Override
	public InfoType getInfoType()
	{
		return type;
	}
}
