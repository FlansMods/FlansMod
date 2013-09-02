package co.uk.flansmods.common.guns;

import java.util.ArrayList;

import net.minecraft.client.model.ModelBase;

import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.InfoType;
import co.uk.flansmods.common.TypeFile;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GrenadeType extends InfoType 
{
	public static ArrayList<GrenadeType> grenades = new ArrayList<GrenadeType>();
	
	//Misc
	/** The damage imparted by smacking someone over the head with this grenade */
	public int meleeDamage = 1;
	/** The maximum number of grenades that can be stacked together */
	public int maxStackSize = 1;
	/** After this time the grenade will despawn quietly. 0 means no despawn time */
	public int despawnTime = 0;
	
	//Throwing
	/** The delay between subsequent grenade throws */
	public int throwDelay = 0;
	/** The sound to play upon throwing this grenade */
	public String throwSound = "";	
	/** The name of the item to drop (if any) when throwing the grenade */
	public String dropItemOnThrow = null;
	
	//Physics
	/** True implies that the grenade will explode the moment it hits something */
	public boolean detonateOnImpact = false;
	/** Upon hitting a block or entity, the grenade will be deflected and its motion will be multiplied by this constant */
	public float bounciness = 0.9F;
	/** The damage to impart upon bouncing off an entity */
	public int hitEntityDamage = 0;
	/** The speed at which to throw the grenade. 0 will just drop it on the floor */
	public float throwSpeed = 1.0F;
	/** The speed at which the grenade should fall */
	public float fallSpeed = 1.0F;
	/** Whether this grenade will break glass when thrown against it */
	public boolean breaksGlass = false;
	/** Whether this grenade may pass through entities */
	public boolean penetratesEntities = false;
	/** Whether this grenade may pass through blocks */
	public boolean penetratesBlocks = false;
	/** The size of this grenade's hitbox */
	public float hitBoxSize = 0.5F;
	/** The sound to play upon bouncing off a surface */
	public String bounceSound = "";
	/** Whether the grenade should stick to surfaces */
	public boolean sticky = false;
	
	//Conditions for detonation
	/** If > 0 this will act like a mine and explode when a living entity comes within this radius of the grenade */
	public float livingProximityTrigger = -1F;
	/** If > 0 this will act like a mine and explode when a driveable comes within this radius of the grenade */
	public float driveableProximityTrigger = -1F;
	/** If 0, then the grenade will last until some other detonation condition is met, else the grenade will detonate after this time (in ticks) */
	public int fuse = 0;
	/**  If true, then anything attacking this entity will detonate it */
	public boolean detonateWhenShot = false;
	/** If true, then this grenade can be detonated by any remote detonator tool */
	public boolean remote = false;
	
	//Detonation
	/** The radius in which to spread fire */
	public float fireRadius = 0F;
	/** The size of explosion to produce */
	public float explosionRadius = 0F;
	/** Whether the explosion can destroy blocks */
	public boolean explosionBreaksBlocks = false;
	/** Explosion damage vs various classes of entities */
	public float explosionDamageVsLiving = 0F, explosionDamageVsDriveable = 0F;
	/** The name of the item to drop upon detonating */
	public String dropItemOnDetonate = null;
	/** Sound to play upon detonation */
	public String detonateSound = "";
	/** Detonation will not occur until after this time */
	public int primeDelay = 0;
	
	//Aesthetics
	/** The model to render for this grenade in the world */
	@SideOnly(Side.CLIENT)
	public ModelBase model = null;
	/** Trail particles given off by the grenade while being thrown */
	public boolean trailParticles = false;
	public String trailParticleType = "smoke";
	/** Particles given off in the detonation */
	public int explodeParticles = 0;
	public String explodeParticleType = "largesmoke";
	/** Time to remain after detonation */
	public int smokeTime = 0;
	/** Particles given off after detonation */
	public String smokeParticleType = "explode";
	/** Whether the grenade should spin when thrown. Generally false for mines or things that should lie flat */
	public boolean spinWhenThrown = true;
	
	public GrenadeType(TypeFile file) 
	{
		super(file);
		grenades.add(this);
	}

	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if(split[0].equals("Model"))
				model = FlansMod.proxy.loadModel(split, shortName, ModelBase.class);
			if(split[0].equals("Texture"))
				texture = split[1];
			if(split[0].equals("MeleeDamage"))
				meleeDamage = Integer.parseInt(split[1]);
			if(split[0].equals("StackSize"))
				maxStackSize = Integer.parseInt(split[1]);
			if(split[0].equals("ThrowDelay"))
				throwDelay = Integer.parseInt(split[1]);
			if(split[0].equals("ThrowSound"))
				throwSound = split[1];
			if(split[0].equals("DropItemOnThrow"))
				dropItemOnThrow = split[1];
			if(split[0].equals("DetonateOnImpact"))
				detonateOnImpact = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("Bounciness"))
				bounciness = Float.parseFloat(split[1]);
			if(split[0].equals("HitEntityDamage"))
				hitEntityDamage = Integer.parseInt(split[1]);
			if(split[0].equals("ThrowSpeed"))
				throwSpeed = Float.parseFloat(split[1]);
			if(split[0].equals("FallSpeed"))
				fallSpeed = Float.parseFloat(split[1]);
			if(split[0].equals("BreaksGlass"))
				breaksGlass = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("PenetratesEntities"))
				penetratesEntities = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("PenetratesBlocks"))
				penetratesBlocks = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("HitBoxSize"))
				hitBoxSize = Float.parseFloat(split[1]);
			if(split[0].equals("BounceSound"))
				bounceSound = split[1];
			if(split[0].equals("Sticky"))
				sticky = Boolean.parseBoolean(split[1]);
			if(split[0].equals("LivingProximityTrigger"))
				livingProximityTrigger = Float.parseFloat(split[1]);	
			if(split[0].equals("VehicleProximityTrigger"))
				driveableProximityTrigger = Float.parseFloat(split[1]);	
			if(split[0].equals("Fuse"))
				fuse = Integer.parseInt(split[1]);
			if(split[0].equals("DetonateWhenShot"))
				detonateWhenShot = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("PrimeDelay") || split[0].equals("TriggerDelay"))
				primeDelay = Integer.parseInt(split[1]);		
			if(split[0].equals("FireRadius"))
				fireRadius = Float.parseFloat(split[1]);
			if(split[0].equals("ExplosionRadius"))
				explosionRadius = Float.parseFloat(split[1]);
			
			if(split[0].equals("ExplosionDamageVsLiving"))
				explosionRadius = Float.parseFloat(split[1]);
			if(split[0].equals("ExplosionDamageVsLiving"))
				explosionRadius = Float.parseFloat(split[1]);
			if(split[0].equals("ExplosionDamageVsLiving"))
				explosionRadius = Float.parseFloat(split[1]);
			
			if(split[0].equals("ExplosionBreaksBlocks"))
				explosionBreaksBlocks = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("DropItemOnDetonate"))
				dropItemOnDetonate = split[1];
			if(split[0].equals("DetonateSound"))
				detonateSound = split[1];
			if(split[0].equals("HasTrailParticles"))
				trailParticles = Boolean.parseBoolean(split[1].toLowerCase());	
			if(split[0].equals("TrailParticles"))
				trailParticleType = split[1];
			if(split[0].equals("NumExplodeParticles"))
				explodeParticles = Integer.parseInt(split[1]);	
			if(split[0].equals("ExplodeParticles"))
				explodeParticleType = split[1];
			if(split[0].equals("SmokeTime"))
				smokeTime = Integer.parseInt(split[1]);
			if(split[0].equals("SmokeParticles"))
				smokeParticleType = split[1];
			if(split[0].equals("SpinWhenThrown"))
				spinWhenThrown = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("Remote"))
				remote = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("DespawnTime"))
				despawnTime = Integer.parseInt(split[1]);		
		} 
		catch (Exception e)
		{
			System.out.println("Reading grenade file failed.");
			e.printStackTrace();
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
}
