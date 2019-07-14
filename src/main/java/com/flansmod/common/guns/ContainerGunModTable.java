package com.flansmod.common.guns;

import com.flansmod.common.paintjob.Paintjob;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ContainerGunModTable extends Container 
{
	private InventoryGunModTable inventory;
	public InventoryPlayer playerInv;
	public World world;
	
	public ContainerGunModTable(InventoryPlayer i, World w)
	{
		playerInv = i;
		inventory = new InventoryGunModTable();
		world = w;
		
		//Gun slot
		SlotGun gunSlot = new SlotGun(inventory, 0, 184, 37, null);
		addSlotToContainer(gunSlot);
		
		//Attachment Slots
		for(int k = 0; k < 8; k++)
		{
			addSlotToContainer(new SlotGun(inventory, k + 1, 17 + (k * 18), 89, gunSlot));
		}

		//Generic Attachment Slots
		for(int col = 0; col < 8; col++)
		{
			addSlotToContainer(new SlotGun(inventory, 9 + col, 17 + (col * 18), 115 + (col * 18), gunSlot));
		}

		//Main inventory slots
		for(int row = 0; row < 3; row++)
		{
			for(int col = 0; col < 9; col++)
			{
				addSlotToContainer(new Slot(playerInv, col + row * 9 + 9, 8 + col * 18, 154 + row * 18));
			}
		}

		//Quickbar slots
		for(int col = 0; col < 9; col++)
		{
			addSlotToContainer(new Slot(playerInv, col, 8 + col * 18, 212));
		}
	}
	
	@Override
    public void onContainerClosed(EntityPlayer player)
    {
		if(inventory.getStackInSlot(0) != null)
			player.dropPlayerItemWithRandomChoice(inventory.getStackInSlot(0), false);
    }
		
	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) 
	{
		return true;
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
            
            if(slotID >= 17)
            {
            	return null;
            }
            else 
            {
            	if(!mergeItemStack(slotStack, 17, inventorySlots.size(), true))
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

	public void pressButton(boolean paint, boolean left)
	{
		//Nope.
	}
	
	public void clickPaintjob(int id)
	{
		ItemStack gunStack = inventory.getStackInSlot(0);
        if(gunStack != null && gunStack.getItem() instanceof ItemGun)
        {
        	GunType gunType = ((ItemGun)gunStack.getItem()).type;
        	clickPaintjob(gunType.getPaintjob(id));
        }
	}
	
	public void clickPaintjob(Paintjob paintjob)
	{
		ItemStack gunStack = inventory.getStackInSlot(0);
        if(gunStack != null && gunStack.getItem() instanceof ItemGun)
        {
        	GunType gunType = ((ItemGun)gunStack.getItem()).type;

			int numDyes = paintjob.dyesNeeded.length;

	    	if(!playerInv.player.capabilities.isCreativeMode)
	    	{
	    		//Calculate which dyes we have in our inventory
	        	for(int n = 0; n < numDyes; n++)
	        	{
	        		int amountNeeded = paintjob.dyesNeeded[n].stackSize;
	        		for(int s = 0; s < playerInv.getSizeInventory(); s++)
	        		{
	        			ItemStack stack = playerInv.getStackInSlot(s);
	        			if(stack != null && stack.getItem() == Items.dye && stack.getItemDamage() == paintjob.dyesNeeded[n].getItemDamage())
	        			{
	        				amountNeeded -= stack.stackSize;
	        			}
	        		}
	        		//We don't have enough of this dye
					if(amountNeeded > 0)
						return;
	        	}

	        	for(int n = 0; n < numDyes; n++)
	        	{
	        		int amountNeeded = paintjob.dyesNeeded[n].stackSize;
	        		for(int s = 0; s < playerInv.getSizeInventory(); s++)
	        		{
	        			if(amountNeeded <= 0)
	        				continue;
	        			ItemStack stack = playerInv.getStackInSlot(s);
	        			if(stack != null && stack.getItem() == Items.dye && stack.getItemDamage() == paintjob.dyesNeeded[n].getItemDamage())
	        			{
	        				ItemStack consumed = playerInv.decrStackSize(s, amountNeeded);
	        				amountNeeded -= consumed.stackSize;
	        			}
	        		}
	        	}
	    	}

	    	//Paint the gun. This line is only reached if the player is in creative or they have had their dyes taken already
			//gunStack.stackTagCompound.setString("Paint", paintjob.iconName);
			gunStack.setItemDamage(paintjob.ID);
		}
	}
}
