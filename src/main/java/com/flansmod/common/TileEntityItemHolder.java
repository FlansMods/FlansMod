package com.flansmod.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.flansmod.apocalypse.common.FlansModApocalypse;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.teams.TeamsManager;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ITickable;

public class TileEntityItemHolder extends TileEntity implements IInventory, ITickable
{
	private ItemStack stack;
	public ItemHolderType type;
	
	public TileEntityItemHolder()
	{
		
	}
	
	public TileEntityItemHolder(ItemHolderType type)
	{
		this.type = type;
	}
	
	@Override
	public String getName() { return "ItemHolder"; }

	@Override
	public boolean hasCustomName() { return false; }

	@Override
	public IChatComponent getDisplayName() { return null; }

	@Override
	public int getSizeInventory() { return 1; }

	@Override
	public ItemStack getStackInSlot(int index) { return getStack(); }

	@Override
	public ItemStack decrStackSize(int index, int count) { if(getStack() != null) { getStack().stackSize -= count; if(getStack().stackSize <= 0) setStack(null); } return getStack(); }

	@Override
	public void setInventorySlotContents(int index, ItemStack stack) { this.setStack(stack); }

	@Override
	public int getInventoryStackLimit() { return 64; }

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) { return true; }

	@Override
	public void openInventory(EntityPlayer player) { }

	@Override
	public void closeInventory(EntityPlayer player) { }

	@Override
	public boolean isItemValidForSlot(int index, ItemStack stack) { return true; }

	@Override
	public int getField(int id) { return 0; }

	@Override
	public void setField(int id, int value) { }

	@Override
	public int getFieldCount() { return 0; }

	@Override
	public void clear() { }
	
	@Override
	public void writeToNBT(NBTTagCompound nbt)
	{
		super.writeToNBT(nbt);

		NBTTagCompound stackNBT = new NBTTagCompound();
		if(getStack() != null)
			getStack().writeToNBT(stackNBT);
		nbt.setTag("stack", stackNBT);		
		nbt.setString("type", type.shortName);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		super.readFromNBT(nbt);

		setStack(ItemStack.loadItemStackFromNBT(nbt.getCompoundTag("stack")));
		type = ItemHolderType.getItemHolder(nbt.getString("type"));
	}

	@Override
	public void update() 
	{

	}
	
	@Override
    public Packet getDescriptionPacket()
    {
		NBTTagCompound nbt = new NBTTagCompound();
		writeToNBT(nbt);
        return new S35PacketUpdateTileEntity(getPos(), getBlockMetadata(), nbt);
    }
	
	@Override
    public void onDataPacket(net.minecraft.network.NetworkManager net, net.minecraft.network.play.server.S35PacketUpdateTileEntity packet)
    {
		readFromNBT(packet.getNbtCompound());
    }

	public ItemStack getStack() 
	{
		return stack;
	}

	public void setStack(ItemStack stack) 
	{
		this.stack = stack;
	}

	@Override
	public ItemStack removeStackFromSlot(int index) {
		// TODO Auto-generated method stub
		return null;
	}
}
