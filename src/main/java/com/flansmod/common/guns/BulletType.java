package com.flansmod.common.guns;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.model.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EnumWeaponType;
import com.flansmod.common.types.TypeFile;

public class BulletType extends ShootableType
{
	/** The number of flak particles to spawn upon exploding */
	public int flak = 0;
	/** The type of flak particles to spawn */
	public String flakParticles = "largesmoke";

	/** If true then this bullet will burn entites it hits */
	public boolean setEntitiesOnFire = false;

	/** If > 0 this will act like a mine and explode when a living entity comes within this radius of the grenade */
	public float livingProximityTrigger = -1F;
	/** If > 0 this will act like a mine and explode when a driveable comes within this radius of the grenade */
	public float driveableProximityTrigger = -1F;
	/** How much damage to deal to the entity that triggered it */
	public float damageToTriggerer = 0F;
	/** Detonation will not occur until after this time */
	public int primeDelay = 0;
	/** Particles given off in the detonation */
	public int explodeParticles = 0;
	public String explodeParticleType = "largesmoke";

	/** Exclusively for driveable usage. Replaces old isBomb and isShell booleans with something more flexible */
	public EnumWeaponType weaponType = EnumWeaponType.NONE;

	public String hitSound;
	public float hitSoundRange;
	public boolean hitSoundEnable = false;
	public boolean entityHitSoundEnable = false;

	public boolean hasLight = false;
	public float penetratingPower = 1F;
	/** Lock on variables. If true, then the bullet will search for a target at the moment it is fired */
	public boolean lockOnToPlanes = false, lockOnToVehicles = false, lockOnToMechas = false, lockOnToPlayers = false, lockOnToLivings = false;
	/** Lock on maximum angle for finding a target */
	public float maxLockOnAngle = 45F;
	/** Lock on force that pulls the bullet towards its prey */
	public float lockOnForce = 1F;
	public int maxDegreeOfMissile = 20;
	public int tickStartHoming = 5;
	public boolean enableSACLOS = false;
	public int maxDegreeOfSACLOS = 5;
	public int maxRangeOfMissile = 150;
	//public int maxDegreeOfMissileXAxis = 10;
	//public int maxDegreeOfMissileYAxis = 10;
	//public int maxDegreeOfMissileZAxis = 10;

	public boolean manualGuidance = false;
	public int lockOnFuse = 10;

	public ArrayList<PotionEffect> hitEffects = new ArrayList<PotionEffect>();

	/** Number of bullets to fire per shot if allowNumBulletsByBulletType = true */
	public int numBullets = -1;
	/** Ammo based spread setting if allowSpreadByBullet = true */
	public float bulletSpread = -1;

	public float dragInAir   = 0.99F;
	public float dragInWater = 0.80F;

	public boolean canSpotEntityDriveable = false;

	public int maxRange = -1;

	public boolean shootForSettingPos = false;
	public int shootForSettingPosHeight = 100;

	public boolean isDoTopAttack = false;
	
	
	//Smoke
	/** Time to remain after detonation */
	public int smokeTime = 0;
	/** Particles given off after detonation */
	public String smokeParticleType = "explode";
	/** The effects to be given to people coming too close */
	public ArrayList<PotionEffect> smokeEffects = new ArrayList<PotionEffect>();
	/** The radius for smoke effects to take place in */
	public float smokeRadius = 5F;
	public boolean TVguide = true;
	
	//Other stuff
	public boolean VLS = false;
	public int VLSTime = 0;
	public boolean fixedDirection = false;
	public float turnRadius = 3;
	public String boostPhaseParticle;
	public float trackPhaseSpeed = 2;
	public float trackPhaseTurn = 0.2F;
	
	public boolean torpedo = false;

	/** The static bullets list */
	public static List<BulletType> bullets = new ArrayList<BulletType>();

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
			if(split[0].equals("FlakParticles"))
				flak = Integer.parseInt(split[1]);
			else if(split[0].equals("FlakParticleType"))
				flakParticles = split[1];
			else if(split[0].equals("SetEntitiesOnFire"))
				setEntitiesOnFire = Boolean.parseBoolean(split[1]);

			else if(split[0].equals("HitSoundEnable"))
				hitSoundEnable = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("EntityHitSoundEnable"))
				entityHitSoundEnable = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("HitSound"))
			{
				hitSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "sound", split[1]);
			}
			else if(split[0].equals("HitSoundRange"))
				hitSoundRange = Float.parseFloat(split[1]);
			else if(split[0].equals("Penetrates"))
				penetratingPower = (Boolean.parseBoolean(split[1].toLowerCase()) ? 1F : 0.25F);
			else if(split[0].equals("Penetration") || split[0].equals("PenetratingPower"))
				penetratingPower = Float.parseFloat(split[1]);

			else if(split[0].equals("DragInAir"))
			{
				dragInAir = Float.parseFloat(split[1]);
				dragInAir = dragInAir<0? 0: dragInAir>1? 1: dragInAir;
			}
			else if(split[0].equals("DragInWater"))
			{
				dragInWater = Float.parseFloat(split[1]);
				dragInWater = dragInWater<0? 0: dragInWater>1? 1: dragInWater;
			}

			else if(split[0].equals("NumBullets"))
				numBullets = Integer.parseInt(split[1]);
			else if(split[0].equals("Accuracy") || split[0].equals("Spread"))
				bulletSpread = Float.parseFloat(split[1]);

			else if(split[0].equals("LivingProximityTrigger"))
				livingProximityTrigger = Float.parseFloat(split[1]);
			else if(split[0].equals("VehicleProximityTrigger"))
				driveableProximityTrigger = Float.parseFloat(split[1]);
			else if(split[0].equals("DamageToTriggerer"))
				damageToTriggerer = Float.parseFloat(split[1]);
			else if(split[0].equals("PrimeDelay") || split[0].equals("TriggerDelay"))
				primeDelay = Integer.parseInt(split[1]);
			else if(split[0].equals("NumExplodeParticles"))
				explodeParticles = Integer.parseInt(split[1]);
			else if(split[0].equals("ExplodeParticles"))
				explodeParticleType = split[1];
			else if(split[0].equals("SmokeTime"))
				smokeTime = Integer.parseInt(split[1]);
			else if(split[0].equals("SmokeParticles"))
				smokeParticleType = split[1];
			else if(split[0].equals("SmokeEffect"))
				smokeEffects.add(getPotionEffect(split));
			else if(split[0].equals("SmokeRadius"))
				smokeRadius = Float.parseFloat(split[1]);
			else if(split[0].equals("VLS") || split[0].equals("HasDeadZone"))
				VLS = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("VLSTime") || split[0].equals("DeadZoneTime"))
				VLSTime = Integer.parseInt(split[1]);
			else if(split[0].equals("FixedTrackDirection"))
				fixedDirection = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("GuidedTurnRadius"))
				turnRadius = Float.parseFloat(split[1]);
			else if(split[0].equals("GuidedPhaseSpeed"))
				trackPhaseSpeed = Float.parseFloat(split[1]);
			else if(split[0].equals("GuidedPhaseTurnSpeed"))
				trackPhaseTurn = Float.parseFloat(split[1]);
			else if(split[0].equals("BoostParticle"))
				boostPhaseParticle = split[1];
			else if(split[0].equals("Torpedo"))
				torpedo = Boolean.parseBoolean(split[1]);
			
			else if(split[0].equals("Bomb"))
				weaponType = EnumWeaponType.BOMB;
			else if(split[0].equals("Shell"))
				weaponType = EnumWeaponType.SHELL;
			else if(split[0].equals("Missile"))
				weaponType = EnumWeaponType.MISSILE;
			else if(split[0].equals("WeaponType"))
				weaponType = EnumWeaponType.valueOf(split[1].toUpperCase());

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
			else if(split[0].equals("MaxDegreeOfLockOnMissile"))
				maxDegreeOfMissile = Integer.parseInt(split[1]);
			else if(split[0].equals("TickStartHoming"))
				tickStartHoming = Integer.parseInt(split[1]);
			else if(split[0].equals("EnableSACLOS"))
				enableSACLOS = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("EnableSACLOS"))
				enableSACLOS = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("MaxRangeOfMissile"))
				maxRangeOfMissile = Integer.parseInt(split[1]);
			else if(split[0].equals("CanSpotEntityDriveable"))
				canSpotEntityDriveable = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("ShootForSettingPos"))
				shootForSettingPos = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("ShootForSettingPosHeight"))
				shootForSettingPosHeight = Integer.parseInt(split[1]);
			else if(split[0].equals("IsDoTopAttack"))
				isDoTopAttack = Boolean.parseBoolean(split[1].toLowerCase());



			else if(split[0].equals("PotionEffect"))
				hitEffects.add(getPotionEffect(split));
			else if(split[0].equals("ManualGuidance"))
				manualGuidance = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("LockOnFuse"))
				lockOnFuse = Integer.parseInt(split[1]);
			else if(split[0].equals("MaxRange"))
				maxRange = Integer.parseInt(split[1]);
		}
		catch (Exception e)
		{
			System.out.println("Reading bullet file failed.");
			if(FlansMod.printStackTrace)
			{
				e.printStackTrace();
			}
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
}
