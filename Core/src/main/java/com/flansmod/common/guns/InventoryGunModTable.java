package com.flansmod.common.guns;

import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class InventoryGunModTable extends InventoryBasic
{
	public InventoryGunModTable()
	{
		super("Gun Modification Table", true, 13);
	}
	
	public ItemStack lastGunStack;
	public GunType gunType;
	public int genericScroll = 0;
	/**
	 * Hacky way to change slots within onInventoryChanged without causing a huge stack overflow
	 */
	private boolean busy = false;
	
	@Override
	public void markDirty()
	{
		if(busy)
			return;
		ItemStack gunStack = getStackInSlot(0);
		if(gunStack == null || !(gunStack.getItem() instanceof ItemGun))
			return;
		
		gunType = ((ItemGun)gunStack.getItem()).GetType();
		
		//If we changed the gun (i.e. a new gun has been placed in the table)
		if(gunStack != lastGunStack)
		{
			busy = true;
			NBTTagCompound attachmentTags = gunStack.getTagCompound().getCompoundTag("attachments");
			setInventorySlotContents(1, new ItemStack(attachmentTags.getCompoundTag("barrel")));
			setInventorySlotContents(2, new ItemStack(attachmentTags.getCompoundTag("scope")));
			setInventorySlotContents(3, new ItemStack(attachmentTags.getCompoundTag("stock")));
			setInventorySlotContents(4, new ItemStack(attachmentTags.getCompoundTag("grip")));
			genericScroll = 0;
			for(int i = 0; i < Math.min(gunType.numGenericAttachmentSlots, 8); i++)
				setInventorySlotContents(5 + i, new ItemStack(attachmentTags.getCompoundTag("generic_" + i)));
			busy = false;
		}
		//Else we changed an attachment
		else
		{
			//Create a new NBT tag compound for our gun item
			NBTTagCompound gunTags = new NBTTagCompound();
			//Copy the ammo and paintjob from the old stack
			gunTags.setTag("ammo", getStackInSlot(0).getTagCompound().getTag("ammo"));
			if(getStackInSlot(0).getTagCompound().getTag("Paint") != null)
				gunTags.setTag("Paint", getStackInSlot(0).getTagCompound().getTag("Paint"));
			
			//Add each attachment from the inventory to our gun stack
			NBTTagCompound attachmentTags = new NBTTagCompound();
			
			writeAttachmentTags(attachmentTags, getStackInSlot(1), "barrel");
			writeAttachmentTags(attachmentTags, getStackInSlot(2), "scope");
			writeAttachmentTags(attachmentTags, getStackInSlot(3), "stock");
			writeAttachmentTags(attachmentTags, getStackInSlot(4), "grip");
			
			//Change all the attachments that we are looking at, but copy in the old ones
			for(int i = 0; i < gunType.numGenericAttachmentSlots; i++)
			{
				if(i >= genericScroll * 4 && i < genericScroll * 4 + 8)
				{
					writeAttachmentTags(attachmentTags, getStackInSlot(i - genericScroll * 4 + 5), "generic_" + i);
				}
				else attachmentTags.setTag("generic_" + i, getStackInSlot(0).getTagCompound().getTag("generic_" + i));
			}
			
			//Set the tags to be these new tags
			gunTags.setTag("attachments", attachmentTags);
			gunStack.setTagCompound(gunTags);
		}
		
		lastGunStack = gunStack;
	}
	
	public void writeAttachmentTags(NBTTagCompound attachmentTags, ItemStack attachmentStack, String attachmentName)
	{
		NBTTagCompound tags = new NBTTagCompound();
		if(attachmentStack != null)
			attachmentStack.writeToNBT(tags);
		attachmentTags.setTag(attachmentName, tags);
	}
	
	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack)
	{
		return false;
	}
	
}
