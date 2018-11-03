package com.flansmod.common.driveables.mechas;

import java.util.HashMap;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.ITextComponent;

import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGun;

public class MechaInventory implements IInventory
{
	public EntityMecha mecha;
	public HashMap<EnumMechaSlotType, ItemStack> stacks;
	
	public MechaInventory(EntityMecha m)
	{
		mecha = m;
		stacks = new HashMap<>();
		for(EnumMechaSlotType type : EnumMechaSlotType.values())
		{
			stacks.put(type, null);
		}
	}
	
	public MechaInventory(EntityMecha m, NBTTagCompound tags)
	{
		this(m);
		readFromNBT(tags);
	}
	
	public void readFromNBT(NBTTagCompound tags)
	{
		if(tags == null)
			return;
		for(EnumMechaSlotType type : EnumMechaSlotType.values())
		{
			stacks.put(type, new ItemStack(tags.getCompoundTag(type.toString())));
		}
	}
	
	public NBTTagCompound writeToNBT(NBTTagCompound tags)
	{
		if(tags == null)
			return null;
		for(EnumMechaSlotType type : EnumMechaSlotType.values())
		{
			if(stacks.get(type) != null)
				tags.setTag(type.toString(), stacks.get(type).writeToNBT(new NBTTagCompound()));
		}
		return tags;
	}
	
	@Override
	public int getSizeInventory()
	{
		return EnumMechaSlotType.values().length;
	}
	
	@Override
	public ItemStack getStackInSlot(int i)
	{
		return stacks.get(EnumMechaSlotType.values()[i]);
	}
	
	public ItemStack getStackInSlot(EnumMechaSlotType e)
	{
		return stacks.get(e);
	}
	
	@Override
	public ItemStack decrStackSize(int i, int j)
	{
		markDirty();
		ItemStack slot = getStackInSlot(i);
		if(slot == null)
			return ItemStack.EMPTY.copy();
		
		int numToTake = Math.min(j, slot.getCount());
		ItemStack returnStack = slot.copy();
		returnStack.setCount(numToTake);
		slot.setCount(slot.getCount() - numToTake);
		if(slot.getCount() <= 0)
			slot = ItemStack.EMPTY.copy();
		
		setInventorySlotContents(i, slot);
		
		return returnStack;
	}
	
	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack)
	{
		setInventorySlotContents(EnumMechaSlotType.values()[i], itemstack);
	}
	
	public void setInventorySlotContents(EnumMechaSlotType e, ItemStack itemstack)
	{
		markDirty();
		stacks.put(e, itemstack);
	}
	
	@Override
	public int getInventoryStackLimit()
	{
		return 64;
	}
	
	@Override
	public void markDirty()
	{
		if(mecha != null)
			mecha.couldNotFindFuel = false;
	}
	
	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack)
	{
		Item item = itemstack.getItem();
		if(item == null)
			return true;
		switch(EnumMechaSlotType.values()[i])
		{
			case leftTool: case rightTool: return item instanceof ItemGun || item instanceof ItemMechaAddon;
			case leftArm: case rightArm: return item instanceof ItemBullet;
			default: return false;
		}
	}
	
	@Override
	public String getName()
	{
		return "Mecha";
	}
	
	@Override
	public boolean hasCustomName()
	{
		return true;
	}
	
	@Override
	public ITextComponent getDisplayName()
	{
		return null;
	}
	
	@Override
	public void openInventory(EntityPlayer player)
	{
		
	}
	
	@Override
	public void closeInventory(EntityPlayer player)
	{
		
	}
	
	@Override
	public int getField(int id)
	{
		return 0;
	}
	
	@Override
	public void setField(int id, int value)
	{
		
	}
	
	@Override
	public int getFieldCount()
	{
		return 0;
	}
	
	@Override
	public void clear()
	{
		
	}
	
	@Override
	public boolean isEmpty()
	{
		return false;
	}
	
	@Override
	public ItemStack removeStackFromSlot(int index)
	{
		return ItemStack.EMPTY.copy();
	}
	
	@Override
	public boolean isUsableByPlayer(EntityPlayer player)
	{
		return mecha != null && player.getDistanceSq(mecha) <= 10D * 10D;
	}
}
