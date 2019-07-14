package com.flansmod.common.guns;

import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class InventoryGunModTable extends InventoryBasic
{
	public InventoryGunModTable() 
	{
		super("Gun Modification Table", true, 17);
	}

	public ItemStack lastGunStack;
	public GunType gunType;
	public int genericScroll = 0;
	/** Hacky way to change slots within onInventoryChanged without causing a huge stack overflow */
	private boolean busy = false;
	
	@Override
	public void markDirty() 
	{
		if(busy)
			return;
		ItemStack gunStack = getStackInSlot(0);
		if(gunStack == null || !(gunStack.getItem() instanceof ItemGun))
			return;
		
		gunType = ((ItemGun)gunStack.getItem()).type;
		String[] tags = {"barrel", "scope", "stock", "grip", "gadget", "slide", "pump", "accessory"};
		
		//If we changed the gun (i.e. a new gun has been placed in the table)
		if(gunStack != lastGunStack)
		{
			busy = true;
			NBTTagCompound attachmentTags = gunStack.stackTagCompound.getCompoundTag("attachments");
			for(int i = 0; i < 8; i++)
				setInventorySlotContents(i + 1, ItemStack.loadItemStackFromNBT(attachmentTags.getCompoundTag(tags[i])));

			genericScroll = 0;
			for(int i = 0; i < Math.min(gunType.numGenericAttachmentSlots, 8); i++)
				setInventorySlotContents(tags.length + i + 1, ItemStack.loadItemStackFromNBT(attachmentTags.getCompoundTag("generic_" + i)));
			busy = false;
		}
		//Else we changed an attachment
		else
		{
			//Create a new NBT tag compound for our gun item
			NBTTagCompound gunTags = new NBTTagCompound();
			//Copy the ammo and paintjob from the old stack
			gunTags.setTag("ammo", getStackInSlot(0).stackTagCompound.getTag("ammo"));
			if(getStackInSlot(0).stackTagCompound.getTag("Paint") != null)
				gunTags.setTag("Paint", getStackInSlot(0).stackTagCompound.getTag("Paint"));
			
			//Add each attachment from the inventory to our gun stack
	    	NBTTagCompound attachmentTags = new NBTTagCompound();
			for(int i = 0; i < 8; i++)
				writeAttachmentTags(attachmentTags, getStackInSlot(i + 1), tags[i]);
	
	       	//Change all the attachments that we are looking at, but copy in the old ones
	       	for(int i = 0; i < gunType.numGenericAttachmentSlots; i++)
	       	{
	       		if(i >= genericScroll * 4 && i < genericScroll * 4 + 8)
	       		{
	       			writeAttachmentTags(attachmentTags, getStackInSlot(i - genericScroll * 4 + tags.length + 1), "generic_" + i);
	       		}
	       		else attachmentTags.setTag("generic_" + i, getStackInSlot(0).stackTagCompound.getTag("generic_" + i));
	       	}
	       	
	       	//Set the tags to be these new tags
	       	gunTags.setTag("attachments", attachmentTags);
	       	gunStack.stackTagCompound = gunTags;
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
