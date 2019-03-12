package com.flansmod.common;

import java.util.Comparator;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;

public class CreativeTabFlan extends CreativeTabs
{
	public int type; //0 = Guns, 1 = Vehicles + Planes, 2 = Teams, 3 = Parts, 4 = Mechas
	public int icon;
	public int time = 0;
	
	public CreativeTabFlan(int i)
	{
		super("tabFlan" + i);
		type = i;
	}
	
	@Override
	public ItemStack createIcon()
	{
		icon = FlansMod.ticker / 20;
		switch(type)
		{
			case 0: return GunType.gunList.isEmpty() ? new ItemStack(Blocks.WOOL, 1, 4) : new ItemStack(GunType.gunList.get(icon % GunType.gunList.size()).item);
			case 1: return DriveableType.types.isEmpty() ? new ItemStack(Blocks.WOOL, 1, 14) : new ItemStack(DriveableType.types.get(icon % DriveableType.types.size()).item);
			case 2: return FlansMod.partItems.isEmpty() ? new ItemStack(Blocks.WOOL, 1, 5) : new ItemStack(FlansMod.partItems.get(icon % FlansMod.partItems.size()));
			case 3: return FlansMod.armourItems.isEmpty() ? new ItemStack(Blocks.WOOL, 1, 11) : new ItemStack(FlansMod.armourItems.get(icon % FlansMod.armourItems.size()));
			case 4: return FlansMod.mechaItems.isEmpty() ? new ItemStack(Blocks.WOOL, 1, 10) : new ItemStack(FlansMod.mechaItems.get(icon % FlansMod.mechaItems.size()));
			case 5: return new ItemStack(Blocks.SAND, 1, 1);
		}
		return new ItemStack(FlansMod.workbench);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void displayAllRelevantItems(NonNullList<ItemStack> list)
	{
		super.displayAllRelevantItems(list);
		
		list.sort(new ItemSorter());
	}
	
	private class ItemSorter implements Comparator<ItemStack>
	{
		@Override
		public int compare(ItemStack stackA, ItemStack stackB)
		{
			Item itemA = stackA.getItem();
			Item itemB = stackB.getItem();
			boolean invalidA = !(itemA instanceof IFlanItem);
			boolean invalidB = !(itemB instanceof IFlanItem);
			
			if(invalidA)
			{
				return invalidB ? 0 : -1;
			}
			if(invalidB)
			{
				return 1;
			}
			
			InfoType typeA = ((IFlanItem)itemA).getInfoType();
			InfoType typeB = ((IFlanItem)itemB).getInfoType();
			
			if(typeA == null)
				return typeB == null ? 0 : -1;
			if(typeB == null)
				return 1;
			
			int contentPackComparison = typeA.contentPack.compareTo(typeB.contentPack);
			if(contentPackComparison != 0)
				return contentPackComparison;
			
			int shortNameComparison = typeA.shortName.compareTo(typeB.shortName);
			
			return 0;
		}
		
	}
}
