package co.uk.flansmods.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/** Implemented from old source. */
public class ItemBullet extends Item
{
	public ItemBullet(int i, int j, int k, BulletType type1)
	{
		super(i);
		setIconIndex(j);
		colour = k;
		type = type1;
		setMaxDamage(type.roundsPerItem);
		setMaxStackSize(type.maxStackSize);
		type.item = this;
		setCreativeTab(CreativeTabs.tabCombat);
	}

	public String getTextureFile()
	{
		return "/spriteSheets/bullets.png";
	}

	public int getColorFromDamage(int i, int j)
	{
		return type.colour;
	}

	public int colour;
	public BulletType type;
}