package co.uk.flansmods.common;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGunBox extends BlockContainer
{
	@SideOnly(Side.CLIENT)
    private Icon[][] icons;
    
	public BlockGunBox(int i)
	{
		//super(i, boxType.material);
		// set specific material.
		super(i, Material.wood);
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
	public Icon getBlockTexture(IBlockAccess iba, int x,int y, int z, int side)
	{
		TileEntityGunBox TE = (TileEntityGunBox) iba.getBlockTileEntity(x, y, z);
		GunBoxType type = TE.getType();
		
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
	
	@SideOnly(value = Side.CLIENT)
	@Override
	public Icon getBlockTextureFromSideAndMetadata(int side, int metadata)
	{
		GunBoxType type = GunBoxType.getBox(metadata);
		
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

	@Override
	public void addCreativeItems(ArrayList itemList)
	{
		itemList.add(new ItemStack(this));
	}
	
	public Block purchaseItem(int i, int id, InventoryPlayer inventory, GunBoxType type) {
		switch(i) 
		{
			case 0: buyGun(id, inventory, type); break;
			case 1: buyAmmo(id, inventory, type); break;
			case 2: buyAltAmmo(id, inventory, type); break;
		}
		return this;
	}

	@Override
	public TileEntity createNewTileEntity(World var1)
	{
		return new TileEntityGunBox();
	}
	
	@Override
	public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		TileEntityGunBox te = (TileEntityGunBox)world.getBlockTileEntity(x, y, z);
		if(te != null && te.getType() != null)
		{
			ret.add(new ItemStack(blockID, 1, te.getType().gunBoxID));
		}

        return ret;
    }
	
    public void breakBlock(World world, int x, int y, int z, int par5, int par6)
    {
		TileEntityGunBox te = (TileEntityGunBox)world.getBlockTileEntity(x, y, z);
    	if(te != null && te.getType() != null)    		world.spawnEntityInWorld(new EntityItem(world, x + 0.5F, y + 0.5F, z + 0.5F, new ItemStack(blockID, 1, te.getType().gunBoxID)));
        super.breakBlock(world, x, y, z, par5, par6);
    }
    
    @SideOnly(Side.CLIENT)
    public void func_94581_a(IconRegister register)
    {
    	for(GunBoxType type : GunBoxType.gunBoxMap.values())
    	{
    		type.top = register.func_94245_a(type.topTexturePath);
    		type.side = register.func_94245_a(type.sideTexturePath);
    		type.bottom = register.func_94245_a(type.bottomTexturePath);
    	}
    }
}