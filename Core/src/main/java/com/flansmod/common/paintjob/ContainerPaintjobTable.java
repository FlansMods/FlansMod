package com.flansmod.common.paintjob;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.flansmod.common.guns.Paintjob;
import com.flansmod.common.types.IPaintableItem;
import com.flansmod.common.types.PaintableType;

public class ContainerPaintjobTable extends Container
{
	public InventoryPlayer playerInv;
	public TileEntityPaintjobTable table;
	public World world;
	
	public ContainerPaintjobTable(InventoryPlayer i, World w, TileEntityPaintjobTable te)
	{
		playerInv = i;
		world = w;
		table = te;
		
		// Gun slot
		addSlotToContainer(new Slot(table, 0, 187, 139));
		// Paint cans slot
		addSlotToContainer(new Slot(table, 1, 187, 193));
		
		// Main inventory slots
		for(int row = 0; row < 3; row++)
		{
			for(int col = 0; col < 9; col++)
			{
				addSlotToContainer(new Slot(playerInv, col + row * 9 + 9, 8 + col * 18, 184 + row * 18));
			}
			
		}
		// Quickbar slots
		for(int col = 0; col < 9; col++)
		{
			addSlotToContainer(new Slot(playerInv, col, 8 + col * 18, 242));
		}
	}
	
	@Override
	public void onContainerClosed(EntityPlayer player)
	{
		// Save out paintjob?
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
			
			if(slotID >= 1)
			{
				return ItemStack.EMPTY.copy();
			}
			else
			{
				if(!mergeItemStack(slotStack, 1, inventorySlots.size(), true))
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
	
	public void pressButton(boolean paint, boolean left)
	{
		//Nope.
	}
	
	public void clickPaintjob(int i)
	{
		ItemStack paintableStack = table.getPaintableStack();
		if(paintableStack != null && paintableStack.getItem() instanceof IPaintableItem)
		{
			PaintableType paintableType = ((IPaintableItem)paintableStack.getItem()).GetPaintableType();
			clickPaintjob(paintableType.getPaintjob(i));
		}
	}
	
	public void clickPaintjob(Paintjob paintjob)
	{
		ItemStack paintableStack = table.getPaintableStack();
		if(paintableStack != null && paintableStack.getItem() instanceof IPaintableItem)
		{
			PaintableType paintableType = ((IPaintableItem)paintableStack.getItem()).GetPaintableType();
			
			int numDyes = paintjob.dyesNeeded.length;
			
			if(!playerInv.player.capabilities.isCreativeMode)
			{
				//Calculate which dyes we have in our inventory
				for(int n = 0; n < numDyes; n++)
				{
					int amountNeeded = paintjob.dyesNeeded[n].getCount();
					for(int s = 0; s < playerInv.getSizeInventory(); s++)
					{
						ItemStack stack = playerInv.getStackInSlot(s);
						if(stack != null && stack.getItem() == Items.DYE && stack.getItemDamage() == paintjob.dyesNeeded[n].getItemDamage())
						{
							amountNeeded -= stack.getCount();
						}
					}
					//We don't have enough of this dye
					if(amountNeeded > 0)
						return;
				}
				
				for(int n = 0; n < numDyes; n++)
				{
					int amountNeeded = paintjob.dyesNeeded[n].getCount();
					for(int s = 0; s < playerInv.getSizeInventory(); s++)
					{
						if(amountNeeded <= 0)
							continue;
						ItemStack stack = playerInv.getStackInSlot(s);
						if(stack != null && stack.getItem() == Items.DYE && stack.getItemDamage() == paintjob.dyesNeeded[n].getItemDamage())
						{
							ItemStack consumed = playerInv.decrStackSize(s, amountNeeded);
							amountNeeded -= consumed.getCount();
						}
					}
				}
			}
			
			//Paint the gun. This line is only reached if the player is in creative or they have had their dyes taken already
			//gunStack.getTagCompound().setString("Paint", paintjob.iconName);
			paintableStack.setItemDamage(paintjob.ID);
		}
	}
}
