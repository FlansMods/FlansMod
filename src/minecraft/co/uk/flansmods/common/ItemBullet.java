package co.uk.flansmods.common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/** Implemented from old source. */
public class ItemBullet extends Item
{
	public ItemBullet(int i, int j, int k, BulletType type1)
	{
		super(i);
		colour = k;
		type = type1;
		setMaxDamage(type.roundsPerItem);
		setMaxStackSize(type.maxStackSize);
		setHasSubtypes(true);
		type.item = this;
		setCreativeTab(FlansMod.tabFlanGuns);
	}

    @SideOnly(Side.CLIENT)
    @Override
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
    
	public int colour;
	public BulletType type;
}