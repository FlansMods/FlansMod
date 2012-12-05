package co.uk.flansmods.common;

import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

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
