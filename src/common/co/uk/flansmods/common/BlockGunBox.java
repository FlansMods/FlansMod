package co.uk.flansmods.common;

import java.util.Random;
import java.util.ArrayList;

import co.uk.flansmods.client.GuiGunBox;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

import net.minecraft.src.Block;
import net.minecraft.src.BlockContainer;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.ModLoader;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;


public class BlockGunBox extends BlockContainer
{
	public BlockGunBox(int i)
	{
		//super(i, boxType.material);
		// set specific material.
		super(i, Material.wood);
		
		setCreativeTab(CreativeTabs.tabDecorations);
		this.setTextureFile("/spriteSheets/gunBoxes.png");
	}
	
	public void buyGun(int i, InventoryPlayer inventory, GunBoxType type)
	{
		FlansMod.shootTime = 10;
		if (FMLCommonHandler.instance().getEffectiveSide().isClient())
		{
			FlansMod.buyGun(type, i);
		} 
		if (i <= type.numGuns && type.guns[i] != null)
		{
			boolean canBuy = true;
			for (ItemStack check : type.gunParts[i])
			{
				int numMatchingStuff = 0;
				for (int j = 0; j < inventory.getSizeInventory(); j++)
				{
					ItemStack stack = inventory.getStackInSlot(j);
					if (stack != null && stack.itemID == check.itemID && stack.getItemDamage() == check.getItemDamage())
					{
						numMatchingStuff += stack.stackSize;
					}
				}
				if (numMatchingStuff < check.stackSize)
				{
					canBuy = false;
				}
			}
			if (canBuy)
			{
				for (ItemStack remove : type.gunParts[i])
				{
					int amountLeft = remove.stackSize;
					for (int j = 0; j < inventory.getSizeInventory(); j++)
					{
						ItemStack stack = inventory.getStackInSlot(j);
						if (amountLeft > 0 && stack != null && stack.itemID == remove.itemID && stack.getItemDamage() == remove.getItemDamage())
						{
							amountLeft -= inventory.decrStackSize(j, amountLeft).stackSize;
						}
					}
				}
				if (!inventory.addItemStackToInventory(new ItemStack(type.guns[i].getItem())))
				{
					// Drop gun on floor
				}
			} else
			{
				// Cant buy
				// TODO : Add flashing red squares around the items you lack
			}
		}
	}

	public void buyAmmo(int i, InventoryPlayer inventory, GunBoxType type)
	{
		FlansMod.shootTime = 10;
		if (FMLCommonHandler.instance().getEffectiveSide().isClient())
		{
			FlansMod.buyAmmo(type, i, 1);
		} 
		if (i <= type.numGuns && type.bulletParts[i] != null)
		{
			boolean canBuy = true;
			for (ItemStack check : type.bulletParts[i])
			{
				int numMatchingStuff = 0;
				for (int j = 0; j < inventory.getSizeInventory(); j++)
				{
					ItemStack stack = inventory.getStackInSlot(j);
					if (stack != null && stack.itemID == check.itemID && stack.getItemDamage() == check.getItemDamage())
					{
						numMatchingStuff += stack.stackSize;
					}
				}
				if (numMatchingStuff < check.stackSize)
				{
					canBuy = false;
				}
			}
			if (canBuy)
			{
				for (ItemStack remove : type.bulletParts[i])
				{
					int amountLeft = remove.stackSize;
					for (int j = 0; j < inventory.getSizeInventory(); j++)
					{
						ItemStack stack = inventory.getStackInSlot(j);
						if (amountLeft > 0 && stack != null && stack.itemID == remove.itemID && stack.getItemDamage() == remove.getItemDamage())
						{
							amountLeft -= inventory.decrStackSize(j, amountLeft).stackSize;
						}
					}
				}
				if (!inventory.addItemStackToInventory(new ItemStack(type.bullets[i].getItem())))
				{
						// Drop gun on floor
				}
			} 
		}
		//TODO Add flashing red squares if cant buy.
	}

	public void buyAltAmmo(int i, InventoryPlayer inventory, GunBoxType type)
	{
		FlansMod.shootTime = 10;
		if (FMLCommonHandler.instance().getEffectiveSide().isClient())
		{
			FlansMod.buyAmmo(type, i, 2);
		} 
		if (i <= type.numGuns && type.altBulletParts[i] != null)
		{
			boolean canBuy = true;
			for (ItemStack check : type.altBulletParts[i])
			{
				int numMatchingStuff = 0;
				for (int j = 0; j < inventory.getSizeInventory(); j++)
				{
					ItemStack stack = inventory.getStackInSlot(j);
					if (stack != null && stack.itemID == check.itemID && stack.getItemDamage() == check.getItemDamage())
					{
						numMatchingStuff += stack.stackSize;
					}
				}
				if (numMatchingStuff < check.stackSize)
				{
					canBuy = false;
				}
			}
			if (canBuy)
			{
				for (ItemStack remove : type.altBulletParts[i])
				{
					int amountLeft = remove.stackSize;
					for (int j = 0; j < inventory.getSizeInventory(); j++)
					{
						ItemStack stack = inventory.getStackInSlot(j);
						if (amountLeft > 0 && stack != null && stack.itemID == remove.itemID && stack.getItemDamage() == remove.getItemDamage())
						{
							amountLeft -= inventory.decrStackSize(j, amountLeft).stackSize;
						}
					}
				}
				if (!inventory.addItemStackToInventory(new ItemStack(type.altBullets[i].getItem())))
				{
					// Drop gun on floor
				}
			} else
			{
				// Cant buy
				// TODO : Add flashing red squares around the items you lack
			}
		}
	}
	
	@SideOnly(value = Side.CLIENT)
	@Override
	public int getBlockTexture(IBlockAccess iba, int x,int y, int z, int side)
	{
		TileEntityGunBox TE = (TileEntityGunBox) iba.getBlockTileEntity(x, y, z);
		GunBoxType type = TE.getType();
		
		if (type == null)
			return 0;
		
		if (side == 1)
		{
			return type.topTextureIndex;
		}
		if (side == 0)
		{
			return type.bottomTextureIndex;
		}
		return type.sideTextureIndex;
	}
	
	@SideOnly(value = Side.CLIENT)
	@Override
	public int getBlockTextureFromSideAndMetadata(int side, int metadata)
	{
		GunBoxType type = GunBoxType.gunBoxMap.get(GunBoxType.shortNameList.get(metadata));
		
		if (type == null)
			return 0;
		
		if (side == 1)
		{
			return type.topTextureIndex;
		}
		if (side == 0)
		{
			return type.bottomTextureIndex;
		}
		return type.sideTextureIndex;
	}

	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par6, float par7, float par8, float par9)
	{
		if(world.isRemote)
		{
			return true;
		}
		else {
			TileEntityGunBox tileEntity = (TileEntityGunBox)world.getBlockTileEntity(i, j, k);
			if(tileEntity != null)
			{
				if(!entityplayer.isSneaking())
				{
					entityplayer.openGui(FlansMod.instance, 5, world, i, j, k);
				}
				else {
					return false;
				}
			}
			return true;
		}
	}

	@Override
	public void addCreativeItems(ArrayList itemList)
	{
		itemList.add(new ItemStack(this));
	}
	
	public Block purchaseItem(int i, int id, InventoryPlayer inventory, GunBoxType type) {
		switch(i) 
		{
			case 0: buyGun(id, inventory, type);
			case 1: buyAmmo(id, inventory, type);
			case 2: buyAltAmmo(id, inventory, type);
		}
		return this;
	}

	@Override
	public TileEntity createNewTileEntity(World var1)
	{
		return new TileEntityGunBox();
	}
}