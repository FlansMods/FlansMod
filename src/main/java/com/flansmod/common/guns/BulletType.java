package com.flansmod.common.guns;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.model.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EnumWeaponType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

public class BulletType extends InfoType
{
	public Object model;
	public float fallSpeed = 1.0F;
	public int damageVsLiving = 1;
	public int damageVsDriveable = 1;
	public int explosion = 0;
	public boolean explodeOnImpact = false;
	public int fuse = 0;
	/** The number of flak particles to spawn upon exploding */
	public int flak = 0;
	/** The type of flak particles to spawn */
	public String flakParticles = "largesmoke";
	/** The radius of fire to spawn upon hitting the ground */
	public int fire = 0;
	/** If true then this bullet will burn entites it hits */
	public boolean setEntitiesOnFire = false;
	public String dropItemOnReload = null;
	public String dropItemOnShoot = null;
	public String dropItemOnHit = null;
	public boolean breaksGlass = false;
	/** The type of trail particles to have */
	public String trailParticles = "smoke";
	/** Whether to have trail particles following the bullet or not */
	public boolean smokeTrail = false;
	/** Exclusively for driveable usage. Replaces old isBomb and isShell booleans with something more flexible */
	public EnumWeaponType weaponType = EnumWeaponType.NONE;
	public float hitBoxSize = 0.5F;
	public String hitSound;
	public int roundsPerItem = 1;
	public int maxStackSize = 1;
	public static List<BulletType> bullets = new ArrayList<BulletType>();
	public boolean hasLight = false;
	public float penetratingPower = 1F;
	/** Lock on variables. If true, then the bullet will search for a target at the moment it is fired */
	public boolean lockOnToPlanes = false, lockOnToVehicles = false, lockOnToMechas = false, lockOnToPlayers = false, lockOnToLivings = false;
	/** Lock on maximum angle for finding a target */
	public float maxLockOnAngle = 45F;
	/** Lock on force that pulls the bullet towards its prey */
	public float lockOnForce = 1F;
	
	public ArrayList<PotionEffect> hitEffects = new ArrayList<PotionEffect>();
	
	public BulletType(TypeFile file)
	{
		super(file);
		texture = "defaultBullet";
		bullets.add(this);
	}

	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if(split[0].equals("Model"))
			{
				model = FlansMod.proxy.loadModel(split[1], shortName, ModelBase.class);
			}
			else if(split[0].equals("Texture"))
				texture = split[1];
			else if(split[0].equals("FallSpeed"))
				fallSpeed = Float.parseFloat(split[1]);
			else if(split[0].equals("Damage") || split[0].equals("DamageVsLiving") || split[0].equals("DamageVsPlayer"))
				damageVsLiving = Integer.parseInt(split[1]);
			else if(split[0].equals("DamageVsVehicles"))
				damageVsDriveable = Integer.parseInt(split[1]);
			else if(split[0].equals("Explosion"))
				explosion = Integer.parseInt(split[1]);
			else if(split[0].equals("FlakParticles"))
				flak = Integer.parseInt(split[1]);
			else if(split[0].equals("FlakParticleType"))
				flakParticles = split[1];
			else if(split[0].equals("Fire"))
			{
				fire = Integer.parseInt(split[1]);
				//setEntitiesOnFire = true;
			}
			else if(split[0].equals("SetEntitiesOnFire"))
				setEntitiesOnFire = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("ExplodeOnImpact"))
				explodeOnImpact = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("Fuse"))
				fuse = Integer.parseInt(split[1]);
			else if(split[0].equals("BreaksGlass"))
				breaksGlass = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("HitBoxSize"))
				hitBoxSize = Float.parseFloat(split[1]);
			else if(split[0].equals("HitSound"))
				hitSound = split[1];
			else if(split[0].equals("Penetrates"))
				penetratingPower = (Boolean.parseBoolean(split[1].toLowerCase()) ? 1F : 0.25F);
			else if(split[0].equals("Penetration") || split[0].equals("PenetratingPower"))
				penetratingPower = Float.parseFloat(split[1]);
			else if(split[0].equals("SmokeTrail"))
				smokeTrail = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("TrailParticleType"))
			{
				smokeTrail = true;
				trailParticles = split[1];
			}
			else if(split[0].equals("RoundsPerItem"))
				roundsPerItem = Integer.parseInt(split[1]);
			else if(split[0].equals("MaxStackSize"))
				maxStackSize = Integer.parseInt(split[1]);
			else if(split[0].equals("Bomb"))
				weaponType = EnumWeaponType.BOMB;
			else if(split[0].equals("Shell"))
				weaponType = EnumWeaponType.SHELL;
			else if(split[0].equals("Missile"))
				weaponType = EnumWeaponType.MISSILE;
			else if(split[0].equals("WeaponType"))
				weaponType = EnumWeaponType.valueOf(split[1].toUpperCase());
			else if(split[0].equals("DropItemOnShoot"))
				dropItemOnShoot = split[1];
			else if(split[0].equals("DropItemOnReload"))
				dropItemOnReload = split[1];
			else if(split[0].equals("DropItemOnHit"))
				dropItemOnHit = split[1];
			else if(split[0].equals("HasLight"))
				hasLight = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("LockOnToDriveables"))
				lockOnToPlanes = lockOnToVehicles = lockOnToMechas = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("LockOnToVehicles"))
				lockOnToVehicles = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("LockOnToPlanes"))
				lockOnToPlanes = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("LockOnToMechas"))
				lockOnToMechas = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("LockOnToPlayers"))
				lockOnToPlayers = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("LockOnToLivings"))
				lockOnToLivings = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("MaxLockOnAngle"))
				maxLockOnAngle = Float.parseFloat(split[1]);			
			else if(split[0].equals("LockOnForce") || split[0].equals("TurningForce"))
				lockOnForce = Float.parseFloat(split[1]);
			else if(split[0].equals("PotionEffect"))
				hitEffects.add(getPotionEffect(split));
		} 
		catch (Exception e)
		{
			System.out.println("Reading bullet file failed.");
			e.printStackTrace();
		}
	}

	public static BulletType getBullet(String s)
	{
		for(BulletType bullet : bullets)
		{
			if(bullet.shortName.equals(s))
				return bullet;
		}
		return null;
	}

	public static BulletType getBullet(Item item)
	{
		for(BulletType bullet : bullets)
		{
			if(bullet.item == item)
				return bullet;
		}
		return null;
	}
	
	/** To be overriden by subtypes for model reloading */
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelBase.class);
	}
	
	public PotionEffect getPotionEffect(String[] split)
	{
		int potionID = Integer.parseInt(split[1]);
		int duration = Integer.parseInt(split[2]);
		int amplifier = Integer.parseInt(split[3]);
		return new PotionEffect(potionID, duration, amplifier, false);
	}
}
