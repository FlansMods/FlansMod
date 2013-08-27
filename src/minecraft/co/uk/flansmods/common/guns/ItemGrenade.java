package co.uk.flansmods.common.guns;

import co.uk.flansmods.common.FlansMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemGrenade extends Item {

	public GrenadeType type;
	
	public ItemGrenade(int i, GrenadeType t) 
	{
		super(i);
		type = t;
		maxStackSize = type.maxStackSize;
		type.item = this;
		setCreativeTab(FlansMod.tabFlanGuns);
	}

	@Override
	public float getDamageVsEntity(Entity par1Entity, ItemStack itemStack)
	{
		return type.meleeDamage;
	}

	@Override
	public boolean isFull3D()
	{
		return true;
	}
	
	@Override
	public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack)
	{
		return type.meleeDamage == 0;
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
}
