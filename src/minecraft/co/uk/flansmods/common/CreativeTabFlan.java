package co.uk.flansmods.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabFlan extends CreativeTabs
{
	public CreativeTabFlan()
	{
		super("tabFlan");
	}
	
	@Override
	public ItemStack getIconItemStack()
	{
		return new ItemStack(FlansMod.craftingTable);
	}
}
