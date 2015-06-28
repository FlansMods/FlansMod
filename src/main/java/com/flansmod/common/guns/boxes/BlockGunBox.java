package com.flansmod.common.guns.boxes;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.client.renderhack.ITextureHandler;
import com.flansmod.client.renderhack.TextureLoader;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.GunType;

public class BlockGunBox extends Block implements ITextureHandler
{
	public GunBoxType type;
	
	public BlockGunBox(GunBoxType t)
	{
		super(Material.wood);
		setHardness(2F);
		setResistance(4F);
		type = t;

	    setUnlocalizedName(type.shortName);
	    GameRegistry.registerBlock(this, "gunBox." + type.shortName);
		setCreativeTab(FlansMod.tabFlanGuns);
		type.block = this;
		type.item = Item.getItemFromBlock(this);
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
				ItemStack gunStack = new ItemStack(type.guns[i].getItem());
				if(type.guns[i] instanceof GunType)
				{
					GunType gunType = (GunType)type.guns[i];
					NBTTagCompound tags = new NBTTagCompound();
					tags.setString("Paint", gunType.defaultPaintjob.iconName);
					//Add ammo tags
					NBTTagList ammoTagsList = new NBTTagList();
					for(int j = 0; j < gunType.numAmmoItemsInGun; j++)
					{
						ammoTagsList.appendTag(new NBTTagCompound());
					}
					tags.setTag("ammo", ammoTagsList);
					
					gunStack.setTagCompound(tags);
				}
				if (!inventory.addItemStackToInventory(gunStack))
				{
					// Drop gun on floor
					inventory.player.dropPlayerItemWithRandomChoice(gunStack, false);
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
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9)
	{
		if(player.isSneaking())
			return false;
		player.openGui(FlansMod.INSTANCE, 5, world, pos.getX(), pos.getY(), pos.getZ());
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
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		ret.add(new ItemStack(this, 1, 0));
		return ret;
	}
	
	@SideOnly(Side.CLIENT)
    public int getRenderType() 
    {
        return 100;
    }
	
	@SideOnly(Side.CLIENT)
    private TextureLoader textureLoader;
    
	public static ResourceLocation workbench1 = new ResourceLocation("flansmod", "blocks/planeCraftingTableSmall");
	public static ResourceLocation workbench2 = new ResourceLocation("flansmod", "blocks/planeCraftingTableLarge");
	public static ResourceLocation workbench3 = new ResourceLocation("flansmod", "blocks/vehicleCraftingTable");
	
	@Override
	public void loadTextures(TextureLoader loader) 
	{
        this.textureLoader = loader;
        loader.registerTexture(FlansModResourceHandler.getBlockTexture(type.topTexturePath));
        loader.registerTexture(FlansModResourceHandler.getBlockTexture(type.sideTexturePath));
        loader.registerTexture(FlansModResourceHandler.getBlockTexture(type.bottomTexturePath));
	}

	@Override
	public TextureAtlasSprite getSidedTexture(IBlockState state, EnumFacing facing) 
	{
		ResourceLocation res = FlansModResourceHandler.getBlockTexture(type.sideTexturePath);
		switch(facing)
		{
		case UP:   res = FlansModResourceHandler.getBlockTexture(type.topTexturePath); break;
		case DOWN: res = FlansModResourceHandler.getBlockTexture(type.bottomTexturePath); break;
		default:
		}
		return textureLoader.getTextureMap().getAtlasSprite(res.toString());
	}
}