package com.flansmod.common.guns;

import java.util.Collections;
import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.IPaintableItem;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.PaintableType;

public class ItemAttachment extends Item implements IPaintableItem
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
	public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean b)
	{
		if(type.description != null)
		{
			Collections.addAll(lines, type.description.split("_"));
		}
	}
	
	@Override
	public InfoType getInfoType() { return type; }
	
	@Override 
	public PaintableType GetPaintableType() { return type; }
	
	// ----------------- Paintjobs -----------------
	
    @Override
    public void getSubItems(Item item, CreativeTabs tabs, List list)
    {
    	PaintableType type = ((IPaintableItem)item).GetPaintableType();
    	if(FlansMod.addAllPaintjobsToCreative)
    	{
    		for(Paintjob paintjob : type.paintjobs)
    			addPaintjobToList(item, type, paintjob, list);
    	}
        else addPaintjobToList(item, type, type.defaultPaintjob, list);
    }
    
    private void addPaintjobToList(Item item, PaintableType type, Paintjob paintjob, List list)
    {
    	ItemStack paintableStack = new ItemStack(item, 1, paintjob.ID);
    	NBTTagCompound tags = new NBTTagCompound();
    	paintableStack.setTagCompound(tags);
        list.add(paintableStack);
    }
    
    // ---------------------------------------------
}
