package com.flansmod.common.guns;

import java.util.Collections;
import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.paintjob.IPaintableItem;
import com.flansmod.common.paintjob.PaintableType;
import com.flansmod.common.paintjob.Paintjob;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;

public class ItemAttachment extends Item implements IPaintableItem
{
	public AttachmentType type;
	
	public IIcon[] icons;
	
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
    	icons = new IIcon[type.paintjobs.size()];
    	
        itemIcon = icon.registerIcon("FlansMod:" + type.iconPath);
    	for(int i = 0; i < type.paintjobs.size(); i++)
    	{
    		icons[i] = icon.registerIcon("FlansMod:" + type.paintjobs.get(i).iconName);
    	}
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconIndex(ItemStack stack)
    {
        return icons[stack.getItemDamage()];
    }
    
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean b)
	{
		String paintName = type.getPaintjob(stack.getItemDamage()).displayName;		
		if(!paintName.equals("default") && !paintName.isEmpty())
			lines.add("\u00a7b\u00a7o" + paintName);

		if(!type.packName.isEmpty())
		{
			lines.add(type.packName);
		}
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
