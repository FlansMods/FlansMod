package com.flansmod.common.teams;

import com.flansmod.common.CraftingInstance;
import com.flansmod.common.FlansMod;
import com.flansmod.common.teams.ArmourBoxType.ArmourBoxEntry;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockArmourBox extends Block 
{
	public ArmourBoxType type;
	
	public BlockArmourBox(ArmourBoxType t) 
	{
		super(Material.wood);
		type = t;

		setBlockName(type.shortName);
		setHardness(2F);
	    setResistance(4F);
	    GameRegistry.registerBlock(this, "armorBox." + type.shortName);
		setCreativeTab(FlansMod.tabFlanTeams);
		type.block = this;
		type.item = Item.getItemFromBlock(this);
	}
	
	public void buyArmour(String shortName, int piece, InventoryPlayer inventory)
	{
		if(FMLCommonHandler.instance().getEffectiveSide().isClient())
		{
			FlansMod.proxy.buyArmour(shortName, piece, type);
		} 
		ArmourBoxEntry entryPicked = null;
		for(ArmourBoxEntry page : type.pages)
		{
			if(page.shortName.equals(shortName))
				entryPicked = page;
		}
		
		ItemStack resultStack = new ItemStack(entryPicked.armours[piece].item);
		
		CraftingInstance crafting = new CraftingInstance(inventory, entryPicked.requiredStacks[piece], resultStack);
		if(crafting.canCraft())
		{
			crafting.craft(inventory.player);
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
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register)
    {
		type.top = register.registerIcon("FlansMod:" + type.topTexturePath);
		type.side = register.registerIcon("FlansMod:" + type.sideTexturePath);
		type.bottom = register.registerIcon("FlansMod:" + type.bottomTexturePath);
    }

	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par6, float par7, float par8, float par9)
	{
		if(entityplayer.isSneaking())
			return false;
		entityplayer.openGui(FlansMod.INSTANCE, 11, world, i, j, k);
		return true;
	}
}
