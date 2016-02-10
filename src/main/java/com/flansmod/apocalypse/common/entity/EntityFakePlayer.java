package com.flansmod.apocalypse.common.entity;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityFakePlayer extends EntityFlansModShooter
{
	private IInventory inventory;
	
	public EntityFakePlayer(World world) 
	{
		super(world);
	}
	
	public EntityFakePlayer(World world, EntityPlayer player) 
	{
		this(world);
		
		setPosition(player.posX, player.posY, player.posZ);
		
		//Copy the existing player's inventory
		inventory = new InventoryBasic("FakePlayer", true, player.inventory.getSizeInventory());
		for(int i = 0; i < player.inventory.getSizeInventory(); i++)
		{
			inventory.setInventorySlotContents(i, ItemStack.copyItemStack(player.inventory.getStackInSlot(i)));
		}
	}

	@Override
    protected void dropFewItems(boolean b, int i)
	{
		if(!worldObj.isRemote)
		{
			for(int j = 0; j < inventory.getSizeInventory(); j++)
			{
				if(inventory.getStackInSlot(j) != null)
					worldObj.spawnEntityInWorld(new EntityItem(worldObj, posX, posY, posZ, inventory.getStackInSlot(j)));
			}
		}
	}
	
	@Override
	public void readEntityFromNBT(NBTTagCompound tags) 
	{
		super.readEntityFromNBT(tags);
		inventory = new InventoryBasic("FakePlayer", true, 40);
		for(int i = 0; i < 40; i++)
		{
			inventory.setInventorySlotContents(i, ItemStack.loadItemStackFromNBT(tags.getCompoundTag("S" + i)));
		}	
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound tags) 
	{
		super.writeEntityToNBT(tags);
		for(int i = 0; i < 40; i++)
		{
			NBTTagCompound itemtags = new NBTTagCompound();
			if(inventory.getStackInSlot(i) != null)
				inventory.getStackInSlot(i).writeToNBT(itemtags);
			tags.setTag("S" + i, itemtags);
		}
	}
}
