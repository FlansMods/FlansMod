package com.flansmod.common.guns;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotGun extends Slot
{
	private int slotID;
	private SlotGun gunSlot;
	
	public SlotGun(IInventory inventory, int i, int x, int y, SlotGun s)
	{
		super(inventory, i, x, y);
		slotID = i;
		gunSlot = s;
	}
	
	public boolean isItemValid(ItemStack stack)
	{
		if(stack == null)
			return false;
		if(stack.isEmpty())
			return true;
		switch(slotID)
		{
			case 0: return (stack.getItem() instanceof ItemGun && !((ItemGun)stack.getItem()).GetType().deployable && stack.getTagCompound() != null);
			case 1: return (canAttachToCurrentGun(stack) && ((ItemAttachment)stack.getItem()).type.type == EnumAttachmentType.barrel);
			case 2: return (canAttachToCurrentGun(stack) && ((ItemAttachment)stack.getItem()).type.type == EnumAttachmentType.sights);
			case 3: return (canAttachToCurrentGun(stack) && ((ItemAttachment)stack.getItem()).type.type == EnumAttachmentType.stock);
			case 4: return (canAttachToCurrentGun(stack) && ((ItemAttachment)stack.getItem()).type.type == EnumAttachmentType.grip);
			default: return (canAttachToCurrentGun(stack) && ((ItemAttachment)stack.getItem()).type.type == EnumAttachmentType.generic);
		}
	}
	
	public boolean canAttachToCurrentGun(ItemStack stack)
	{
		if(stack == null || !(stack.getItem() instanceof ItemAttachment) || !gunSlot.getHasStack() || !(gunSlot.getStack().getItem() instanceof ItemGun))
			return false;
		AttachmentType attachmentType = ((ItemAttachment)stack.getItem()).type;
		GunType gunType = ((ItemGun)gunSlot.getStack().getItem()).GetType();
		return gunType.allowAllAttachments || gunType.allowedAttachments.contains(attachmentType);
	}
}
