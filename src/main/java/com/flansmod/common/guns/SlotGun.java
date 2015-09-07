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
    	switch(slotID)
    	{
    	case 0 : return stack == null || (stack.getItem() instanceof ItemGun && !((ItemGun)stack.getItem()).type.deployable);
    	case 1 : return stack == null || (canAttachToCurrentGun(stack) && ((ItemAttachment)stack.getItem()).type.type == EnumAttachmentType.barrel);
    	case 2 : return stack == null || (canAttachToCurrentGun(stack) && ((ItemAttachment)stack.getItem()).type.type == EnumAttachmentType.sights);
    	case 3 : return stack == null || (canAttachToCurrentGun(stack) && ((ItemAttachment)stack.getItem()).type.type == EnumAttachmentType.stock);
    	case 4 : return stack == null || (canAttachToCurrentGun(stack) && ((ItemAttachment)stack.getItem()).type.type == EnumAttachmentType.grip);
    	default : return stack == null || (canAttachToCurrentGun(stack) && ((ItemAttachment)stack.getItem()).type.type == EnumAttachmentType.generic);	
    	}
    }
    
    public boolean canAttachToCurrentGun(ItemStack stack)
    {
    	if(stack == null || !(stack.getItem() instanceof ItemAttachment) || !gunSlot.getHasStack() || !(gunSlot.getStack().getItem() instanceof ItemGun))
    		return false;
    	AttachmentType attachmentType = ((ItemAttachment)stack.getItem()).type;
    	GunType gunType = ((ItemGun)gunSlot.getStack().getItem()).type;
    	return gunType.allowAllAttachments || gunType.allowedAttachments.contains(attachmentType);
    }
}
