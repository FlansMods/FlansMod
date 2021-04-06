package com.flansmod.common.guns;

import java.util.Collections;
import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import com.flansmod.common.FlansMod;
import com.flansmod.common.paintjob.IPaintableItem;
import com.flansmod.common.paintjob.PaintableType;
import com.flansmod.common.types.InfoType;

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
		
		if(type.shootDelayMultiplier != 1.0f)
			lines.add("Rate of Fire x" + MathHelper.floor(100.0f / type.shootDelayMultiplier) + "%");
		
		if(type.damageMultiplier != 1.0f)
			lines.add("Damage x" + MathHelper.floor(type.damageMultiplier * 100.0f) + "%");
	
		if(type.recoilMultiplier != 1.0f)
			lines.add("Recoil x" + MathHelper.floor(type.recoilMultiplier * 100.0f) + "%");

		if(type.spreadMultiplier != 1.0f)
			lines.add("Bullet Spread x" + MathHelper.floor(type.spreadMultiplier * 100.0f) + "%");
		
		if(type.reloadTimeMultiplier != 1.0f)
			lines.add("Reload Time x" + MathHelper.floor(type.reloadTimeMultiplier * 100.0f) + "%");
		
		if(type.bulletSpeedMultiplier != 1.0f)
			lines.add("Projectile Speed x" + MathHelper.floor(type.bulletSpeedMultiplier * 100.0f) + "%");
		
		if(type.silencer)
			lines.add("Silenced");
		
		if(type.meleeDamageMultiplier != 1.0f)
			lines.add("Melee Damage x" + MathHelper.floor(type.meleeDamageMultiplier * 100.0f) + "%");
		
		if(type.flashlight)
			lines.add("Flashlight " + type.flashlightStrength);

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
