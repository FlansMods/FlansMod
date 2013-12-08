package co.uk.flansmods.common.guns;

import java.util.List;

import co.uk.flansmods.common.FlansMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/** Implemented from old source. */
public class ItemBullet extends Item
{
	public ItemBullet(int i, int k, BulletType type1)
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
    
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean b)
	{
		if(type.description != null)
		{
			for(String s : type.description.split("_"))
				lines.add(s);
		}
	}
    
	public int colour;
	public BulletType type;
}