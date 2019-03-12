package com.flansmod.common.driveables.mechas;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.flansmod.common.guns.ItemGun;

public class SlotMecha extends Slot
{
	private EnumMechaSlotType slotType;
	
	public SlotMecha(IInventory inv, EnumMechaSlotType e, int x, int y)
	{
		super(inv, e.ordinal(), x, y);
		slotType = e;
	}
	
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		if(stack == null || stack.isEmpty())
			return true;

		EnumMechaItemType itemType = null;
		Item item = stack.getItem();
		if(item instanceof ItemGun && ((ItemGun)item).GetType().usableByMechas)
			itemType = EnumMechaItemType.tool;
		else if(item instanceof ItemMechaAddon)
			itemType = ((ItemMechaAddon)item).type.type;
		else return false;

		return slotType.accepts(itemType);
	}
	
	@Override
	public void putStack(ItemStack stack)
	{
		if(!isItemValid(stack))
			return;
		inventory.setInventorySlotContents(slotType.ordinal(), stack);
		onSlotChanged();
	}

}
