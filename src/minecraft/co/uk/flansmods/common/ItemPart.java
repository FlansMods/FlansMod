package co.uk.flansmods.common;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemPart extends Item
{
	public ItemPart(int i, PartType type1)
	{
		super(i);
		type = type1;
		setMaxStackSize(type.stackSize);
		if (type.category == 9)
		{
			setMaxDamage(type.fuel);
			setHasSubtypes(true);
		}
		type.item = this;
		setCreativeTab(FlansMod.tabFlanParts);
	}
	
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		if(type.category == 9)
		{
			par3List.add("Fuel Stored: " + (type.fuel - par1ItemStack.getItemDamage()) + " / " + type.fuel);
		}
	}

    @Override
	@SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	return type.colour;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) 
    {
    	itemIcon = icon.registerIcon("FlansMod:" + type.iconPath);
    }

	public PartType type;
}