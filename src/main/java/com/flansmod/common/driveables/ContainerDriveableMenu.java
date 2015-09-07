package com.flansmod.common.driveables;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ContainerDriveableMenu extends Container
{
	//Fuel Container is combined with this because they are so similar
	public ContainerDriveableMenu(InventoryPlayer inventoryplayer, World worldy)
	{
		this(inventoryplayer, worldy, false, null);
	}
	
    public ContainerDriveableMenu(InventoryPlayer inventoryplayer, World worldy, boolean fuel, EntityDriveable planey)
    {
		inventory = inventoryplayer;
        world = worldy;
		plane = planey;
		isFuel = fuel;
		
		//Fuel slot
		if(isFuel)
		{
			addSlotToContainer(new Slot(plane.driveableData, plane.driveableData.getFuelSlot(), 35, 44));
		}
		
		//Main inventory slots
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 9; col++)
            {
            	addSlotToContainer(new Slot(inventoryplayer, col + row * 9 + 9, 8 + col * 18, 79 + (isFuel ? 0 : 19) + row * 18));
            }

        }
		//Quickbar slots
        for(int col = 0; col < 9; col++)
        {
        	addSlotToContainer(new Slot(inventoryplayer, col, 8 + col * 18, 137 + (isFuel ? 0 : 19)));
        }
    }
    
	@Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slotID)
    {
		ItemStack stack = null;
        Slot currentSlot = (Slot)inventorySlots.get(slotID);

        if(currentSlot != null && currentSlot.getHasStack())
        {
            ItemStack slotStack = currentSlot.getStack();
            stack = slotStack.copy();
            
            if(slotID != 0)
            {
            	if(!mergeItemStack(slotStack, 0, 1, false))
            	{
            		return null;
            	}
            }
            else {
            	if(!mergeItemStack(slotStack, 1, inventorySlots.size(), true))
            	{
            		return null;
            	}
            }
            
            if (slotStack.stackSize == 0)
            {
                currentSlot.putStack(null);
            }
            else
            {
                currentSlot.onSlotChanged();
            }

            if (slotStack.stackSize == stack.stackSize)
            {
                return null;
            }

            currentSlot.onPickupFromSlot(player, slotStack);
        }

        return stack;
    }
    
    @Override
    public boolean canInteractWith(EntityPlayer entityplayer)
    {
    	return true;
    }

	public EntityDriveable plane;
	public boolean isFuel;
	public InventoryPlayer inventory;
    public World world;
}
