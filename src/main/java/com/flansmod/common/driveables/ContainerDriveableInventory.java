package com.flansmod.common.driveables;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ContainerDriveableInventory extends Container
{
	public InventoryPlayer inventory;
	public World world;
	public EntityDriveable plane;
	public int numItems;
	public int screen;
	public int maxScroll;
	public int scroll;
	
	public ContainerDriveableInventory(InventoryPlayer inventoryplayer, World worldy, EntityDriveable entPlane, int i)
	{
		inventory = inventoryplayer;
		world = worldy;
		plane = entPlane;
		screen = i;
		//Find the number of items in the inventory
		numItems = 0;
		switch(i)
		{
			case 0:
			{
				numItems = plane.driveableData.numGuns;
				maxScroll = (numItems > 3 ? numItems - 3 : 0);
				break;
			}
			case 1:
			{
				numItems = plane.getDriveableType().numBombSlots;
				maxScroll = (((numItems + 7) / 8) > 3 ? ((numItems + 7) / 8) - 3 : 0);
				break;
			}
			case 2:
			{
				numItems = plane.getDriveableType().numCargoSlots;
				maxScroll = (((numItems + 7) / 8) > 3 ? ((numItems + 7) / 8) - 3 : 0);
				break;
			}
			case 3:
			{
				numItems = plane.getDriveableType().numMissileSlots;
				maxScroll = (((numItems + 7) / 8) > 3 ? ((numItems + 7) / 8) - 3 : 0);
				break;
			}
		}
		
		//Add screen specific slots
		switch(screen)
		{
			case 0: //Guns
			{
				int slotsDone = 0;
				for(int j = 0; j < plane.driveableData.numGuns; j++)
				{
					int yPos = -1000;
					if(slotsDone < 3 + scroll && slotsDone >= scroll)
						yPos = 25 + 19 * slotsDone;
					addSlotToContainer(new Slot(plane.driveableData, j, 29, yPos));
					slotsDone++;
				}
				break;
			}
			case 1: //Bombs
			case 2: //Cargo
			case 3: //Missiles
			{
				int startSlot = plane.driveableData.getBombInventoryStart();
				if(screen == 2)
					startSlot = plane.driveableData.getCargoInventoryStart();
				if(screen == 3)
					startSlot = plane.driveableData.getMissileInventoryStart();
				int m = ((numItems + 7) / 8);
				for(int row = 0; row < m; row++)
				{
					int yPos = -1000;
					if(row < 3 + scroll && row >= scroll)
						yPos = 25 + 19 * (row - scroll);
					for(int col = 0; col < ((row + scroll + 1) * 8 <= numItems ? 8 : numItems % 8); col++)
					{
						addSlotToContainer(new Slot(plane.driveableData, startSlot + row * 8 + col, 10 + 18 * col, yPos));
					}
				}
				break;
			}
		}
		
		//Main inventory slots
		for(int row = 0; row < 3; row++)
		{
			for(int col = 0; col < 9; col++)
			{
				addSlotToContainer(new Slot(inventoryplayer, col + row * 9 + 9, 8 + col * 18, 98 + row * 18));
			}
			
		}
		//Quickbar slots
		for(int col = 0; col < 9; col++)
		{
			addSlotToContainer(new Slot(inventoryplayer, col, 8 + col * 18, 156));
		}
	}
	
	public void updateScroll(int scrololol)
	{
		scroll = scrololol;
		switch(screen)
		{
			case 0:
			{
				int slotsDone = 0;
				for(int i = 0; i < plane.driveableData.numGuns; i++)
				{
					int yPos = -1000;
					if(slotsDone < 3 + scroll && slotsDone >= scroll)
						yPos = 25 + 19 * (slotsDone - scroll);
					inventorySlots.get(slotsDone).yPos = yPos;
					slotsDone++;
				}
				break;
			}
			case 1:
			case 2:
			case 3:
			{
				int m = ((numItems + 7) / 8);
				for(int row = 0; row < m; row++)
				{
					int yPos = -1000;
					if(row < 3 + scroll && row >= scroll)
						yPos = 25 + 19 * (row - scroll);
					for(int col = 0; col < ((row + 1) * 8 <= numItems ? 8 : numItems % 8); col++)
					{
						inventorySlots.get(row * 8 + col).yPos = yPos;
					}
				}
				break;
			}
		}
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer entityplayer)
	{
		return true;
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int slotID)
	{
		ItemStack stack = ItemStack.EMPTY.copy();
		Slot currentSlot = inventorySlots.get(slotID);
		
		if(currentSlot != null && currentSlot.getHasStack())
		{
			ItemStack slotStack = currentSlot.getStack();
			stack = slotStack.copy();
			
			if(slotID >= numItems)
			{
				if(!mergeItemStack(slotStack, 0, numItems, false))
				{
					return ItemStack.EMPTY.copy();
				}
			}
			else
			{
				if(!mergeItemStack(slotStack, numItems, inventorySlots.size(), true))
				{
					return ItemStack.EMPTY.copy();
				}
			}
			
			if(slotStack.getCount() == 0)
			{
				currentSlot.putStack(ItemStack.EMPTY.copy());
			}
			else
			{
				currentSlot.onSlotChanged();
			}
			
			if(slotStack.getCount() == stack.getCount())
			{
				return ItemStack.EMPTY.copy();
			}
			
			currentSlot.onTake(player, slotStack);
		}
		
		return stack;
	}
}
