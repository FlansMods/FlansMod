package com.flansmod.common.guns.boxes;

import java.util.ArrayList;

import com.flansmod.common.FlansMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGunBox extends Block
{
	public GunBoxType type;
	
	public BlockGunBox(GunBoxType t)
	{
		super(Material.wood);
		setHardness(2F);
	    setResistance(4F);
	    type = t;
	    type.block = this;
	    GameRegistry.registerBlock(this, ItemGunBox.class, "gunBox." + type.shortName);
		setCreativeTab(FlansMod.tabFlanGuns);
	}
		
	public void buyGun(int i, InventoryPlayer inventory, GunBoxType type)
	{
		if (FMLCommonHandler.instance().getEffectiveSide().isClient())
		{
			FlansMod.proxy.buyGun(type, i);
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
					if (stack != null && stack.getItem() == check.getItem() && stack.getItemDamage() == check.getItemDamage())
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
						if (amountLeft > 0 && stack != null && stack.getItem() == remove.getItem() && stack.getItemDamage() == remove.getItemDamage())
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
		
		if (FMLCommonHandler.instance().getEffectiveSide().isClient())
		{
			FlansMod.proxy.buyAmmo(type, i, 1);
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
					if (stack != null && stack.getItem() == check.getItem() && stack.getItemDamage() == check.getItemDamage())
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
						if (amountLeft > 0 && stack != null && stack.getItem() == remove.getItem() && stack.getItemDamage() == remove.getItemDamage())
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
		if (FMLCommonHandler.instance().getEffectiveSide().isClient())
		{
			FlansMod.proxy.buyAmmo(type, i, 2);
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
					if (stack != null && stack.getItem() == check.getItem() && stack.getItemDamage() == check.getItemDamage())
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
						if (amountLeft > 0 && stack != null && stack.getItem() == remove.getItem() && stack.getItemDamage() == remove.getItemDamage())
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
	public IIcon getIcon(int side, int metadata)
	{		
		if (type == null)
			return null;
		
		if (side == 1)
		{
			return type.top;
		}
		if (side == 0)
		{
			return type.bottom;
		}
		return type.side;
	}

	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par6, float par7, float par8, float par9)
	{
		if(entityplayer.isSneaking())
			return false;
		entityplayer.openGui(FlansMod.INSTANCE, 5, world, i, j, k);
		return true;
	}
	
	public Block purchaseItem(int i, int id, InventoryPlayer inventory, GunBoxType type) 
	{
		switch(i) 
		{
			case 0: buyGun(id, inventory, type); break;
			case 1: buyAmmo(id, inventory, type); break;
			case 2: buyAltAmmo(id, inventory, type); break;
		}
		return this;
	}
	
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		ret.add(new ItemStack(this, 1, 0));
        return ret;
    }
	
    @Override
	public void breakBlock(World world, int x, int y, int z, Block block, int metadata)
    {
    	world.spawnEntityInWorld(new EntityItem(world, x + 0.5F, y + 0.5F, z + 0.5F, new ItemStack(block, 1, 0)));
        super.breakBlock(world, x, y, z, block, metadata);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register)
    {
    	//for(GunBoxType type : GunBoxType.gunBoxMap.values())
    	//{
    		type.top = register.registerIcon("FlansMod:" + type.topTexturePath);
    		type.side = register.registerIcon("FlansMod:" + type.sideTexturePath);
    		type.bottom = register.registerIcon("FlansMod:" + type.bottomTexturePath);
    	//}
    }
}