package flansmod.common;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

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
		setTabToDisplayOn(CreativeTabs.tabCombat);	 
	}
	
	public String getTextureFile()
    {
        return "/spriteSheets/bullets.png";
    }
	
	public int getColorFromDamage(int i)
    {
        return colour;
    }

	public int colour;
	public BulletType type;
}