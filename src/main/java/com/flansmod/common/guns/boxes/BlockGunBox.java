package com.flansmod.common.guns.boxes;

import java.util.ArrayList;

import com.flansmod.common.types.InfoType;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.GunType;

public class BlockGunBox extends Block
{
	public GunBoxType type;
	
	public BlockGunBox(GunBoxType t) throws Exception
	{
		super(Material.wood);
		setHardness(2F);
	    setResistance(4F);
	    type = t;

	    setBlockName(type.shortName);
	    Block block = Block.getBlockFromName("flansmod:gunBox." + type.shortName);
	    if(block != null)
	    {
	    	throw new Exception("Caught an exception during block registration");
	    }
	    GameRegistry.registerBlock(this, "gunBox." + type.shortName);
		setCreativeTab(FlansMod.tabFlanGuns);
	    type.block = this;
	    type.item = Item.getItemFromBlock(this);	
	}

	public void buyGun(InfoType item, InventoryPlayer inventory, GunBoxType type)
	{
		if (FMLCommonHandler.instance().getEffectiveSide().isClient())
		{
			FlansMod.proxy.buyGun(type, item);
		}
		GunBoxEntry entry = searchFor(item);
		if(entry != null)
		{
			boolean canBuy = true;
			for (ItemStack check : entry.requiredParts)
			{
				int numMatchingStuff = 0;
				for (int j = 0; j < inventory.getSizeInventory(); j++)
				{
					ItemStack stack = inventory.getStackInSlot(j);
					if (stack != null && stack.getItem() == check.getItem() && stack.getItemDamage() == check.getItemDamage())
						numMatchingStuff += stack.stackSize;
				}
				if (numMatchingStuff < check.stackSize)
					canBuy = false;
			}

			if (canBuy)
			{
				for (ItemStack remove : entry.requiredParts)
				{
					int amountLeft = remove.stackSize;
					for (int j = 0; j < inventory.getSizeInventory(); j++)
					{
						ItemStack stack = inventory.getStackInSlot(j);
						if (amountLeft > 0 && stack != null && stack.getItem() == remove.getItem() && stack.getItemDamage() == remove.getItemDamage())
							amountLeft -= inventory.decrStackSize(j, amountLeft).stackSize;
					}
				}

				ItemStack gunStack = new ItemStack(entry.type.getItem());
				if(entry.type instanceof GunType)
				{
					GunType gunType = (GunType)entry.type;
					NBTTagCompound tags = new NBTTagCompound();
					tags.setString("Paint", gunType.defaultPaintjob.iconName);
					//Add ammo tags
					NBTTagList ammoTagsList = new NBTTagList();
					for(int j = 0; j < gunType.numPrimaryAmmoItems; j++)
						ammoTagsList.appendTag(new NBTTagCompound());

					tags.setTag("ammo", ammoTagsList);
					gunStack.stackTagCompound = tags;
				}

				// Drop gun on floor
				if (!inventory.addItemStackToInventory(gunStack))
					inventory.player.dropPlayerItemWithRandomChoice(gunStack, false);
			}
 			else
			{
				// Cant buy
				// TODO : Add flashing red squares around the items you lack
			}
		}
	}

	private GunBoxEntry searchFor(InfoType item)
	{
		for(GunPage page: type.gunPages)
		{
			for(GunBoxEntry entry: page.gunList)
			{
				if(entry.type == item)
				{
					return entry;
				}
				else
				{
					if(!entry.isAmmoNullOrEmpty())
					{
						for(GunBoxEntry ammoEntry: entry.ammoEntryList)
						{
							if(ammoEntry.type == item)
								return ammoEntry;
						}
					}
				}
			}
		}

		return null; //No InfoType was found
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
		//entityplayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.BLUE + "CFR " + EnumChatFormatting.WHITE + "♦ Flans crafting is disabled."));
		return true;
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