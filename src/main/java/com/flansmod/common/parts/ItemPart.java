package com.flansmod.common.parts;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;

public class ItemPart extends Item implements IFlanItem
{
	public PartType type;
	
	public ItemPart(PartType type1)
	{
		super();
		type = type1;
		setMaxStackSize(type.stackSize);
		if(type.category == EnumPartCategory.FUEL)
		{
			setMaxDamage(type.fuel);
			setHasSubtypes(true);
		}
		type.item = this;
		setTranslationKey("FlansMod:" + type.iconPath);
		setRegistryName(type.shortName);
		setCreativeTab(FlansMod.tabFlanParts);
	}
	
	@Override
	public void addInformation(ItemStack stack, World world, List<String> lines, ITooltipFlag b)
	{
		if(type.category == EnumPartCategory.FUEL)
		{
			lines.add("Fuel Stored: " + (type.fuel - stack.getItemDamage()) + " / " + type.fuel);
		}
	}
	
	@Override
	public InfoType getInfoType()
	{
		return type;
	}
}
