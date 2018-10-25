package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;

import com.flansmod.client.gui.teams.EnumLoadoutSlot;
import com.flansmod.common.teams.LoadoutPool.LoadoutEntryInfoType;
import com.flansmod.common.types.IFlanItem;

public class PlayerClassCustom implements IPlayerClass
{
	public int index;
	public PlayerLoadout loadout;
	public List<ItemStack> startingItems = new ArrayList<ItemStack>();
	public ItemStack chest = null;
	
	public PlayerClassCustom(int i, PlayerLoadout playerLoadout)
	{
		index = i;
		loadout = playerLoadout;
		
		for(int n = 0; n < EnumLoadoutSlot.values().length; n++)
		{
			ItemStack stack = playerLoadout.slots[n];
			if(stack != null && !stack.isEmpty())
			{
				// For now, just support chest slot overrides
				if(n == EnumLoadoutSlot.armour.ordinal())
				{
					chest = stack;
				}
				else
				{
					startingItems.add(stack);
				}
			}
		}
		
		// Add extra items after all main items are done
		for(int n = 0; n < EnumLoadoutSlot.values().length; n++)
		{
			ItemStack stack = playerLoadout.slots[n];
			if(stack != null && stack.getItem() instanceof IFlanItem)
			{
				LoadoutEntryInfoType loadoutEntry = TeamsManagerRanked.GetInstance().currentPool.GetLoadoutEntryForInfoType(n, ((IFlanItem)stack.getItem()).getInfoType());
				if(loadoutEntry != null)
				{
					for(ItemStack extraStack : loadoutEntry.extraItems)
					{
						startingItems.add(extraStack);
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
		return chest;
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
