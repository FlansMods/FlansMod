package co.uk.flansmods.common;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockManyNames extends ItemBlock {
	
	public ItemBlockManyNames(int i)
	{
		super(i);
		setHasSubtypes(true);
	}
	
	@Override
	public String getItemNameIS(ItemStack stack)
	{
		int damage = stack.getItemDamage();
		return getItemName() + damage;
	}
	
	@Override
	public int getMetadata(int par1) {
		return par1;
	}
}
