package com.flansmod.common;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EnumPlaneMode;
import com.flansmod.common.driveables.ItemPlane;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemAAGun;
import com.flansmod.common.guns.ItemAttachment;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGrenade;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

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
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public ItemStack getIconItemStack()
	{
		icon = FlansMod.ticker / 20;
		switch(type)
		{
			case 0 : return GunType.gunList.size() == 0 ? new ItemStack(Blocks.wool, 1, 4) : new ItemStack(GunType.gunList.get(icon % GunType.gunList.size()).item);
			case 1 : return DriveableType.types.size() == 0 ? new ItemStack(Blocks.wool, 1, 14) : new ItemStack(DriveableType.types.get(icon % DriveableType.types.size()).item);
			case 2 : return FlansMod.partItems.size() == 0 ? new ItemStack(Blocks.wool, 1, 5) : new ItemStack(FlansMod.partItems.get(icon % FlansMod.partItems.size()));
			case 3 : return FlansMod.armourItems.size() == 0 ? new ItemStack(Blocks.wool, 1, 11) : new ItemStack(FlansMod.armourItems.get(icon % FlansMod.armourItems.size()));
			case 4 : return FlansMod.mechaItems.size() == 0 ? new ItemStack(Blocks.wool, 1, 10) : new ItemStack(FlansMod.mechaItems.get(icon % FlansMod.mechaItems.size()));
		}
		return new ItemStack(FlansMod.workbench);
	}
	
	@SideOnly(Side.CLIENT)
	public void displayAllReleventItems(List list)
	{
		super.displayAllReleventItems(list);

		Comparator cmp = new Comparator<ItemStack>()
		{
			public int compare(ItemStack is1, ItemStack is2)
			{
				String s1 = is1.getUnlocalizedName();
				String s2 = is2.getUnlocalizedName();
				Item   i1 = is1.getItem();
				Item   i2 = is2.getItem();
				
				if(i1 instanceof IFlanItem && i2 instanceof IFlanItem)
				{
					String it1 = ((IFlanItem)i1).getInfoType().packName;
					String it2 = ((IFlanItem)i2).getInfoType().packName;
					int cmp = it1.compareTo(it2);
					if(cmp!=0)
					{
						return cmp;
					}
				}

				if(i1 instanceof ItemBlockManyNames && i2 instanceof ItemBlockManyNames==false)	return -1;
				if(i1 instanceof ItemBlockManyNames==false && i2 instanceof ItemBlockManyNames)	return 1;
				if(i1 instanceof ItemBlock && i2 instanceof ItemBlock==false)	return -1;
				if(i1 instanceof ItemBlock==false && i2 instanceof ItemBlock)	return 1;
				if(i1 instanceof ItemAttachment && i2 instanceof ItemAttachment==false)	return -1;
				if(i1 instanceof ItemAttachment==false && i2 instanceof ItemAttachment)	return 1;
				if(i1 instanceof ItemAAGun && i2 instanceof ItemAAGun==false)	return -1;
				if(i1 instanceof ItemAAGun==false && i2 instanceof ItemAAGun)	return 1;

				if(i1 instanceof ItemVehicle && i2 instanceof ItemBullet)	return 1;
				if(i1 instanceof ItemBullet  && i2 instanceof ItemVehicle)	return -1;
				if(i1 instanceof ItemPlane && i2 instanceof ItemBullet)		return 1;
				if(i1 instanceof ItemBullet  && i2 instanceof ItemPlane)	return -1;
				
				DriveableType dt1 = null;
				DriveableType dt2 = null;
				if(i1 instanceof ItemVehicle)	dt1 = ((ItemVehicle)i1).type;
				if(i2 instanceof ItemVehicle)	dt2 = ((ItemVehicle)i2).type;
				if(i1 instanceof ItemPlane)		dt1 = ((ItemPlane)i1).type;
				if(i2 instanceof ItemPlane)		dt2 = ((ItemPlane)i2).type;
				if(dt1 != null && dt2 != null)
				{
					String ct1 = "";
					String ct2 = "";
					if(dt1.modelString.indexOf(".") >= 1) ct1 = dt1.modelString.substring(0, dt1.modelString.indexOf(".")-1);
					if(dt2.modelString.indexOf(".") >= 1) ct1 = dt2.modelString.substring(0, dt2.modelString.indexOf(".")-1);
					if(!ct1.equals(ct2))
					{
						return ct1.compareTo(ct2);
					}
				}

				if(i1 instanceof ItemVehicle && i2 instanceof ItemVehicle==false)	return -1;
				if(i1 instanceof ItemVehicle==false && i2 instanceof ItemVehicle)	return 1;
				if(i1 instanceof ItemPlane && i2 instanceof ItemPlane==false)	return -1;
				if(i1 instanceof ItemPlane==false && i2 instanceof ItemPlane)	return 1;
				if(i1 instanceof ItemPlane && i2 instanceof ItemPlane)
				{
					EnumPlaneMode epm1 = ((ItemPlane)i1).type.mode;
					EnumPlaneMode epm2 = ((ItemPlane)i2).type.mode;
					return epm1.compareTo(epm2);
				}

				if(i1 instanceof ItemGrenade==false && i2 instanceof ItemGrenade)	return -1;
				if(i1 instanceof ItemGrenade && i2 instanceof ItemGrenade==false)	return 1;

				return s1.compareTo(s2);
			}
		};
		try
		{
			Collections.sort(list, cmp);
		}
		catch(Exception e)
		{
//			e.printStackTrace();
		}
		/*
		System.out.println("===============================================================");
		for(int i=0; i<list.size(); i++)
		{
			ItemStack is = (ItemStack)list.get(i);
			System.out.println(is.getItem() + " : " + is.getDisplayName() + "("+ is.getUnlocalizedName() +")");
		}
		*/
	}
}
