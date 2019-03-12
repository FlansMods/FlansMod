package com.flansmod.common.guns;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;

public abstract class ItemShootable extends Item
{
	public ShootableType type;
	
	public ItemShootable(ShootableType t)
	{
		type = t;
		maxStackSize = type.maxStackSize;
		setRegistryName(type.shortName);
		setMaxDamage(type.roundsPerItem);
	}
	
	//Can be overriden to allow new types of bullets to be created, for planes
	public abstract EntityShootable getEntity(World world, Vec3d origin, float yaw,
											  float pitch, double motionX, double motionY, double motionZ,
											  EntityLivingBase shooter, float gunDamage, InfoType shotFrom);
	
	//Can be overriden to allow new types of bullets to be created, vector constructor
	public abstract EntityShootable getEntity(World world, Vector3f origin, Vector3f direction,
											  EntityLivingBase shooter, float spread, float damage, float speed, InfoType shotFrom);
	
	//Can be overriden to allow new types of bullets to be created, AA/MG constructor
	public abstract EntityShootable getEntity(World world, Vec3d origin, float yaw,
											  float pitch, EntityLivingBase shooter, float spread, float damage,
											  InfoType shotFrom);
	
	//Can be overriden to allow new types of bullets to be created, Handheld constructor
	public abstract EntityShootable getEntity(World world, EntityLivingBase player,
											  float bulletSpread, float damage, float bulletSpeed, boolean b,
											  InfoType shotFrom);
	
	public abstract void shoot(World world,
							   Vector3f origin,
							   Vector3f direction,
							   float damageModifier,
							   float spreadModifier,
							   float speedModifier,
							   InfoType shotFrom,
							   EntityLivingBase shooter);
}
