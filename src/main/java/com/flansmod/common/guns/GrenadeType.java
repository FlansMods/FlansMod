package com.flansmod.common.guns;

import java.util.ArrayList;

import net.minecraft.client.model.ModelBase;
import net.minecraft.potion.PotionEffect;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.TypeFile;

public class GrenadeType extends ShootableType
{
	public static ArrayList<GrenadeType> grenades = new ArrayList<>();
	
	//Misc
	/**
	 * The damage imparted by smacking someone over the head with this grenade
	 */
	public int meleeDamage = 1;
	
	//Throwing
	/**
	 * The delay between subsequent grenade throws
	 */
	public int throwDelay = 0;
	/**
	 * The sound to play upon throwing this grenade
	 */
	public String throwSound = "";
	/**
	 * The name of the item to drop (if any) when throwing the grenade
	 */
	public String dropItemOnThrow = null;
	/**
	 * Whether you can throw this grenade by right clicking
	 */
	public boolean canThrow = true;
	
	//Physics
	/**
	 * Upon hitting a block or entity, the grenade will be deflected and its motion will be multiplied by this constant
	 */
	public float bounciness = 0.9F;
	/**
	 * Whether this grenade may pass through entities or blocks
	 */
	public boolean penetratesEntities = false, penetratesBlocks = false;
	/**
	 * The sound to play upon bouncing off a surface
	 */
	public String bounceSound = "";
	/**
	 * Whether the grenade should stick to surfaces
	 */
	public boolean sticky = false;
	/**
	 * If true, then the grenade will stick to the player that threw it. Used to make delayed self destruct weapons
	 */
	public boolean stickToThrower = false;
	
	//Conditions for detonation
	/**
	 * If > 0 this will act like a mine and explode when a living entity comes within this radius of the grenade
	 */
	public float livingProximityTrigger = -1F;
	/**
	 * If > 0 this will act like a mine and explode when a driveable comes within this radius of the grenade
	 */
	public float driveableProximityTrigger = -1F;
	/**
	 * If true, then anything attacking this entity will detonate it
	 */
	public boolean detonateWhenShot = false;
	/**
	 * If true, then this grenade can be detonated by any remote detonator tool
	 */
	public boolean remote = false;
	/**
	 * How much damage to deal to the entity that triggered it
	 */
	public float damageToTriggerer = 0F;
	
	//Detonation
	/**
	 * Explosion damage vs various classes of entities
	 */
	public float explosionDamageVsLiving = 0F, explosionDamageVsDriveable = 0F;
	/**
	 * Detonation will not occur until after this time
	 */
	public int primeDelay = 0;
	
	//Aesthetics
	/**
	 * Particles given off in the detonation
	 */
	public int explodeParticles = 0;
	public String explodeParticleType = "largesmoke";
	/**
	 * Whether the grenade should spin when thrown. Generally false for mines or things that should lie flat
	 */
	public boolean spinWhenThrown = true;
	
	//Smoke
	/**
	 * Time to remain after detonation
	 */
	public int smokeTime = 0;
	/**
	 * Particles given off after detonation
	 */
	public String smokeParticleType = "explode";
	/**
	 * The effects to be given to people coming too close
	 */
	public ArrayList<PotionEffect> smokeEffects = new ArrayList<>();
	/**
	 * The radius for smoke effects to take place in
	 */
	public float smokeRadius = 5F;
	
	//Deployed bag functionality
	/**
	 * If true, then right clicking this "grenade" will give the player health or buffs or ammo as defined below
	 */
	public boolean isDeployableBag = false;
	/**
	 * The number of times players can use this bag before it runs out
	 */
	public int numUses = 1;
	/**
	 * The amount to heal the player using this bag
	 */
	public float healAmount = 0;
	/**
	 * The potion effects to apply to users of this bag
	 */
	public ArrayList<PotionEffect> potionEffects = new ArrayList<>();
	/**
	 * The number of clips to give to the player when using this bag
	 * When they right click with a gun, they will get this number of clips for that gun.
	 * They get the first ammo type, as listed in the gun type file
	 * The number of clips they get is multiplied by numBulletsInGun too
	 * TODO : Give guns a "can get ammo from bag" variable. Stops miniguns and such getting ammo
	 */
	public int numClips = 0;
	
	public GrenadeType(TypeFile file)
	{
		super(file);
		grenades.add(this);
	}
	
	@Override
	public void postRead(TypeFile file)
	{
		super.postRead(file);
	}
	
	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if(split[0].equals("MeleeDamage"))
				meleeDamage = Integer.parseInt(split[1]);
				
				//Grenade Throwing
			else if(split[0].equals("ThrowDelay"))
				throwDelay = Integer.parseInt(split[1]);
			else if(split[0].equals("ThrowSound"))
			{
				throwSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "grenades", split[1]);
			}
			else if(split[0].equals("DropItemOnThrow"))
				dropItemOnThrow = split[1];
			else if(split[0].equals("CanThrow"))
				canThrow = Boolean.parseBoolean(split[1]);
				
				//Grenade Physics
			else if(split[0].equals("Bounciness"))
				bounciness = Float.parseFloat(split[1]);
			else if(split[0].equals("PenetratesEntities"))
				penetratesEntities = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("PenetratesBlocks"))
				penetratesBlocks = Boolean.parseBoolean(split[1].toLowerCase());
			
			else if(split[0].equals("BounceSound"))
			{
				bounceSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "grenades", split[1]);
			}
			else if(split[0].equals("Sticky"))
				sticky = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("LivingProximityTrigger"))
				livingProximityTrigger = Float.parseFloat(split[1]);
			else if(split[0].equals("VehicleProximityTrigger"))
				driveableProximityTrigger = Float.parseFloat(split[1]);
			else if(split[0].equals("DamageToTriggerer"))
				damageToTriggerer = Float.parseFloat(split[1]);
			else if(split[0].equals("DetonateWhenShot"))
				detonateWhenShot = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("PrimeDelay") || split[0].equals("TriggerDelay"))
				primeDelay = Integer.parseInt(split[1]);
			
			else if(split[0].equals("StickToThrower"))
				stickToThrower = Boolean.parseBoolean(split[1]);
			
			else if(split[0].equals("ExplosionDamageVsLiving"))
				explosionDamageVsLiving = Float.parseFloat(split[1]);
			else if(split[0].equals("ExplosionDamageVsDrivable"))
				explosionDamageVsDriveable = Float.parseFloat(split[1]);
			
			
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
			else if(split[0].equals("SpinWhenThrown"))
				spinWhenThrown = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("Remote"))
				remote = Boolean.parseBoolean(split[1].toLowerCase());
				
				//Deployable Bag Stuff
			else if(split[0].equals("DeployableBag"))
				isDeployableBag = true;
			else if(split[0].equals("NumUses"))
				numUses = Integer.parseInt(split[1]);
			else if(split[0].equals("HealAmount"))
				healAmount = Float.parseFloat(split[1]);
			else if(split[0].equals("AddPotionEffect") || split[0].equals("PotionEffect"))
				potionEffects.add(getPotionEffect(split));
			else if(split[0].equals("NumClips"))
				numClips = Integer.parseInt(split[1]);
		}
		catch(Exception e)
		{
			FlansMod.log.error("Reading grenade file failed.");
			FlansMod.log.throwing(e);
		}
	}
	
	public static GrenadeType getGrenade(String s)
	{
		for(GrenadeType grenade : grenades)
		{
			if(grenade.shortName.equals(s))
				return grenade;
		}
		return null;
	}
	
	/**
	 * To be overriden by subtypes for model reloading
	 */
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelBase.class);
	}
}
