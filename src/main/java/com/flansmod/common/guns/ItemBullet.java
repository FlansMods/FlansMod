package com.flansmod.common.guns;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;

/** Implemented from old source. */
public class ItemBullet extends Item
{
	public ItemBullet(InfoType infoType)
	{
		type = (BulletType)infoType;
		setMaxDamage(type.roundsPerItem);
		setMaxStackSize(type.maxStackSize);
		setHasSubtypes(true);
		type.item = this;
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
    
	public BulletType type;

	//Can be overriden to allow new types of bullets to be created, for planes
	public EntityBullet getEntity(World worldObj, Vec3 origin, float yaw,
			float pitch, double motionX, double motionY, double motionZ,
			EntityLivingBase shooter,float gunDamage, int itemDamage, InfoType shotFrom) 
	{
		return new EntityBullet(worldObj, origin, yaw, pitch, motionX, motionY, motionZ, shooter, gunDamage, this.type, shotFrom);
	}

	//Can be overriden to allow new types of bullets to be created, vector constructor
	public EntityBullet getEntity(World worldObj, Vector3f origin, Vector3f direction,
			EntityLivingBase shooter, float spread, float damage, float speed, int itemDamage, InfoType shotFrom)
	{
		return new EntityBullet(worldObj, origin, direction, shooter, spread, damage, this.type, speed, shotFrom);
	}

	//Can be overriden to allow new types of bullets to be created, AA/MG constructor
	public Entity getEntity(World worldObj, Vec3 origin, float yaw,
			float pitch, EntityLivingBase shooter, float spread, float damage,
			int itemDamage, InfoType shotFrom) 
	{
		return new EntityBullet(worldObj, origin, yaw, pitch, shooter, spread, damage, this.type, shotFrom);
	}

	//Can be overriden to allow new types of bullets to be created, Handheld constructor
	public Entity getEntity(World worldObj, EntityLivingBase player,
			float bulletSpread, float damage, float bulletSpeed, boolean b,
			int itemDamage, InfoType shotFrom) 
	{
		return new EntityBullet(worldObj, player, bulletSpread, damage, this.type, bulletSpeed, b, shotFrom);
	}
}