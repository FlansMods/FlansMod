package com.flansmod.common.guns;

import java.util.Collections;
import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;

/** Implemented from old source. */
public class ItemBullet extends ItemShootable implements IFlanItem
{
	public BulletType type;
	
	public ItemBullet(BulletType infoType)
	{
		super(infoType);
		type = infoType;
		setMaxStackSize(type.maxStackSize);
		setHasSubtypes(true);
		type.item = this;
		switch(type.weaponType)
		{
		case SHELL : case BOMB : case MINE : case MISSILE : setCreativeTab(FlansMod.tabFlanDriveables); break;
		default : setCreativeTab(FlansMod.tabFlanGuns);
		}
	}

    @SideOnly(Side.CLIENT)
    @Override
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	return type.colour;
    }
    
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean b)
	{
		if(type.description != null)
		{
			Collections.addAll(lines, type.description.split("_"));
		}
	}

	//Can be overriden to allow new types of bullets to be created, for planes
	@Override
	public EntityShootable getEntity(World worldObj, Vec3 origin, float yaw,
			float pitch, double motionX, double motionY, double motionZ,
			EntityLivingBase shooter,float gunDamage, InfoType shotFrom) 
	{
		return new EntityBullet(worldObj, origin, yaw, pitch, motionX, motionY, motionZ, shooter, gunDamage, this.type, shotFrom);
	}

	//Can be overriden to allow new types of bullets to be created, vector constructor
	@Override
	public EntityShootable getEntity(World worldObj, Vector3f origin, Vector3f direction,
			EntityLivingBase shooter, float spread, float damage, float speed, InfoType shotFrom)
	{
		return new EntityBullet(worldObj, origin, direction, shooter, spread, damage, this.type, speed, shotFrom);
	}

	//Can be overriden to allow new types of bullets to be created, AA/MG constructor
	@Override
	public EntityShootable getEntity(World worldObj, Vec3 origin, float yaw,
			float pitch, EntityLivingBase shooter, float spread, float damage,
			InfoType shotFrom) 
	{
		return new EntityBullet(worldObj, origin, yaw, pitch, shooter, spread, damage, this.type, 3.0f, shotFrom);
	}

	//Can be overriden to allow new types of bullets to be created, Handheld constructor
	@Override
	public EntityShootable getEntity(World worldObj, EntityLivingBase player,
			float bulletSpread, float damage, float bulletSpeed, boolean isShotgun, InfoType shotFrom) 
	{
		return new EntityBullet(worldObj, player, bulletSpread, damage, this.type, bulletSpeed, isShotgun, shotFrom);
	}
		
	@Override
	public InfoType getInfoType() 
	{
		return type;
	}

	@Override
	public void Shoot(World world, Vector3f origin, Vector3f direction, float damageModifier, float spreadModifier, float speedModifier, InfoType shotFrom, EntityLivingBase shooter) 
	{
		world.spawnEntityInWorld(getEntity(world, shooter, spreadModifier, damageModifier, speedModifier, false, shotFrom));
	}
}