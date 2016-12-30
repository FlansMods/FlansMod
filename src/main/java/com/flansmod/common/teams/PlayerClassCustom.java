package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.List;

import com.flansmod.client.gui.teams.EnumLoadoutSlot;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ShootableType;

import net.minecraft.item.ItemStack;

public class PlayerClassCustom implements IPlayerClass 
{
	public int index;
	public PlayerLoadout loadout;
	public List<ItemStack> startingItems = new ArrayList<ItemStack>();
	
	public PlayerClassCustom(int i, PlayerLoadout playerLoadout) 
	{
		index = i;
		loadout = playerLoadout;
		
		for(int n = 0; n < EnumLoadoutSlot.values().length; n++)
		{
			ItemStack stack = playerLoadout.slots[n];
			if(stack != null)
			{
				startingItems.add(stack);
				if(stack.getItem() instanceof ItemGun)
				{
					GunType type = ((ItemGun)stack.getItem()).GetType();
					if(type.ammo.size() > 0)
					{
						ShootableType ammoType = type.ammo.get(0);
						startingItems.add(new ItemStack(ammoType.getItem(), ammoType.maxStackSize));
					}
				}
			}
		}
	}
	
	@Override
	public List<ItemStack> GetStartingItems() 
	{
		return startingItems;
	}

	@Override
	public boolean GetHorse() 
	{
		return false;
	}

	@Override
	public ItemStack GetHat() 
	{
		return null;
	}

	@Override
	public ItemStack GetChest() 
	{
		return null;
	}

	@Override
	public ItemStack GetLegs() 
	{
		return null;
	}

	@Override
	public ItemStack GetShoes() 
	{
		return null;
	}

	@Override
	public String GetName() 
	{
		return "Loadout " + index;
	}

	@Override
	public String GetShortName() 
	{
		return "custom_" + index;
	}

}
