package com.flansmod.common;

import java.util.Random;

import com.flansmod.apocalypse.common.FlansModApocalypse;
import com.flansmod.common.teams.TeamsManager;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IChatComponent;

public class TileEntityItemHolder extends TileEntity implements IInventory, IUpdatePlayerListBox
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
	public ItemStack getStackInSlot(int index) { return stack; }

	@Override
	public ItemStack decrStackSize(int index, int count) { if(stack != null) { stack.stackSize -= count; if(stack.stackSize <= 0) stack = null; } return stack; }

	@Override
	public ItemStack getStackInSlotOnClosing(int index) { return getStackInSlot(index); }

	@Override
	public void setInventorySlotContents(int index, ItemStack stack) { this.stack = stack; }

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
		if(stack != null)
			stack.writeToNBT(stackNBT);
		nbt.setTag("stack", stackNBT);		
		nbt.setString("type", type.shortName);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		super.readFromNBT(nbt);

		stack = ItemStack.loadItemStackFromNBT(nbt.getCompoundTag("stack"));
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

	public void addRandomLoot(Random rand) 
	{
		//Add a gun, 2/3rds of the time
		if(rand.nextInt(3) != 0)
			stack = FlansModApocalypse.getLootGenerator().getRandomLoadedGun(rand);
	}
}
