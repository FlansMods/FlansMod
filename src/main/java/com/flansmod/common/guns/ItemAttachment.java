package com.flansmod.common.guns;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;

public class ItemAttachment extends Item 
{
	public AttachmentType type;
	
	public ItemAttachment(AttachmentType t) 
	{
		type = t;
		type.item = this;
		maxStackSize = t.maxStackSize;
		setCreativeTab(FlansMod.tabFlanGuns);
		GameRegistry.registerItem(this, type.shortName, FlansMod.MODID);
	}
	
    @SideOnly(Side.CLIENT)
    @Override
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	return type.colour;
    }
        
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon) 
    {
    	itemIcon = icon.registerIcon("FlansMod:" + type.iconPath);
    }
    
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean b)
	{
		if(type.description != null)
		{
			for(String s : type.description.split("_"))
				lines.add(s);
		}
	}
}
