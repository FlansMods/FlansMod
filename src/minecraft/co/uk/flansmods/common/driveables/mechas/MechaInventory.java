package co.uk.flansmods.common.driveables.mechas;

import java.util.HashMap;

import co.uk.flansmods.common.ItemBullet;
import co.uk.flansmods.common.guns.ItemGun;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class MechaInventory implements IInventory 
{
	public EntityMecha mecha;
	public HashMap<EnumMechaSlotType, ItemStack> stacks;
	
	public MechaInventory(EntityMecha m)
	{
		mecha = m;
		stacks = new HashMap<EnumMechaSlotType, ItemStack>();
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
			stacks.put(type, ItemStack.loadItemStackFromNBT(tags.getCompoundTag(type.toString())));
		}
	}
	
	public NBTTagCompound writeToNBT(NBTTagCompound tags)
	{
		if(tags == null)
			return null;
		for(EnumMechaSlotType type : EnumMechaSlotType.values())
		{
			if(stacks.get(type) != null)
				tags.setCompoundTag(type.toString(), stacks.get(type).writeToNBT(new NBTTagCompound()));
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
		onInventoryChanged();
		ItemStack slot = getStackInSlot(i);
		if(slot == null)
			return null;
		
		int numToTake = Math.min(j, slot.stackSize);		
		ItemStack returnStack = slot.copy();
		returnStack.stackSize = numToTake;
		slot.stackSize -= numToTake;
		if(slot.stackSize <= 0)
			slot = null;
		
		setInventorySlotContents(i, slot);
		
		return returnStack;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int i) 
	{
		return getStackInSlot(i);
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) 
	{
		onInventoryChanged();
		stacks.put(EnumMechaSlotType.values()[i], itemstack);
	}

	@Override
	public String getInvName() 
	{
		return "Mecha";
	}

	@Override
	public boolean isInvNameLocalized() 
	{
		return true;
	}

	@Override
	public int getInventoryStackLimit() 
	{
		return 64;
	}

	@Override
	public void onInventoryChanged() 
	{
		if(mecha != null)
			mecha.couldNotFindFuel = false;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer entityplayer) 
	{
		return mecha != null && entityplayer.getDistanceToEntity(mecha) <= 10D;
	}

	@Override
	public void openChest() 
	{
	}

	@Override
	public void closeChest() 
	{
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) 
	{
		Item item = itemstack.getItem();
		if(item == null)
			return true;
		switch(EnumMechaSlotType.values()[i])
		{
		case leftTool : case rightTool : return item instanceof ItemGun || item instanceof ItemMechaAddon;
		case leftArm : case rightArm : return item instanceof ItemBullet;
		
		}
		return false;
	}

}
