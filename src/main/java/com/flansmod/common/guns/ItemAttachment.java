package com.flansmod.common.guns;

import java.util.Collections;
import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.IPaintableItem;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.PaintableType;

public class ItemAttachment extends Item implements IPaintableItem
{
	public AttachmentType type;
	
	public ItemAttachment(AttachmentType t)
	{
		type = t;
		type.item = this;
		maxStackSize = t.maxStackSize;
		setRegistryName(type.shortName);
		setCreativeTab(FlansMod.tabFlanGuns);
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
	
	@Override
	public PaintableType GetPaintableType()
	{
		return type;
	}
	
	// ----------------- Paintjobs -----------------
	
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if(tab != FlansMod.tabFlanGuns && tab != CreativeTabs.SEARCH)
			return;
		
		PaintableType type = ((IPaintableItem)this).GetPaintableType();
		if(FlansMod.addAllPaintjobsToCreative)
		{
			for(Paintjob paintjob : type.paintjobs)
				addPaintjobToList(this, type, paintjob, items);
		}
		else addPaintjobToList(this, type, type.defaultPaintjob, items);
	}
	
	private void addPaintjobToList(Item item, PaintableType type, Paintjob paintjob, List list)
	{
		ItemStack paintableStack = new ItemStack(item, 1, paintjob.ID);
		NBTTagCompound tags = new NBTTagCompound();
		paintableStack.setTagCompound(tags);
		list.add(paintableStack);
	}
	
	// ---------------------------------------------
}
