package co.uk.flansmods.common;

import java.util.Random;
import java.util.ArrayList;

import co.uk.flansmods.client.GuiGunBox;

import cpw.mods.fml.client.FMLClientHandler;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.World;


public class BlockGunBox extends Block
{
	public BlockGunBox(int i, GunBoxType boxType)
	{
		super(i, boxType.material);
		type = boxType;
		blockIndexInTexture = type.topTextureIndex;
		setCreativeTab(CreativeTabs.tabDeco);
	}

	public String getTextureFile()
	{
		return "/spriteSheets/gunBoxes.png";
	}

	public void buyGun(int i, InventoryPlayer inventory)
	{
		FlansMod.shootTime = 10;
		if (!FMLClientHandler.instance().getClient().isSingleplayer())
		{
			FlansMod.buyGun(this, i);
		} else
		{
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
	}

	public void buyAmmo(int i, InventoryPlayer inventory)
	{
		FlansMod.shootTime = 10;
		if (!FMLClientHandler.instance().getClient().isSingleplayer())
		{
			FlansMod.buyAmmo(this, i);
		} else
		{
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
				} else
				{
					// Cant buy
					// TODO : Add flashing red squares around the items you lack
				}
			}
		}
	}

	public void buyAltAmmo(int i, InventoryPlayer inventory)
	{
		FlansMod.shootTime = 10;
		if (!FMLClientHandler.instance().getClient().isSingleplayer())
		{
			FlansMod.buyAmmo(this, i);
		} else
		{
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
	}

	public int getBlockTextureFromSide(int i)
	{
		if (i == 1)
		{
			return type.topTextureIndex;
		}
		if (i == 0)
		{
			return type.bottomTextureIndex;
		}
		return type.sideTextureIndex;
	}

	public boolean blockActivated(World world, int i, int j, int k, EntityPlayer entityplayer)
	{
		ModLoader.openGUI(entityplayer, new GuiGunBox(entityplayer.inventory, this));
		return true;
	}

	public void addCreativeItems(ArrayList itemList)
	{
		itemList.add(new ItemStack(this));
	}

	public GunBoxType type;
}