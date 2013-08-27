package co.uk.flansmods.common.guns;

import java.util.ArrayList;

import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.InfoType;
import co.uk.flansmods.common.TypeFile;
import cpw.mods.fml.common.FMLCommonHandler;

public class GrenadeType extends InfoType 
{
	public static ArrayList<GrenadeType> grenades = new ArrayList<GrenadeType>();
	
	//Misc
	/** The damage imparted by smacking someone over the head with this grenade */
	public int meleeDamage = 1;
	/** The maximum number of grenades that can be stacked together */
	public int maxStackSize = 1;
	
	//Throwing
	/** The delay between subsequent grenade throws */
	public int throwDelay = 0;
	/** The sound to play upon throwing this grenade */
	public String throwSound = "";	
	/** The name of the item to drop (if any) when throwing the grenade */
	public String dropItemOnThrow = null;
	
	//Physics
	/** True implies that the grenade will explode the moment it hits something */
	public boolean explodeOnImpact = false;
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
	
	//Conditions for detonation
	/** If > 0 this will act like a mine and explode when a living entity comes within this radius of the grenade */
	public float proximityTrigger = -1F;
	/** If 0, then the grenade will last until some other detonation condition is met, else the grenade will detonate after this time (in ticks) */
	public int fuse = 0;
	
	//Detonation
	/** The radius in which to spread fire */
	public float fire = 0F;
	/** The size of explosion to produce */
	public int explosionSize = 0;
	/** Whether the explosion can destroy blocks */
	public boolean explosionBreaksBlocks = false;
	/** The name of the item to drop upon detonating */
	public String dropItemOnDetonate = null;
	
	//Aesthetics
	/** Trail particles given off by the grenade while being thrown */
	public boolean trailParticles = false;
	public String trailParticleType = "smoke";
	/** Particles given off in the detonation */
	public int explodeParticles = 0;
	public String explodeParticleType = "largeSmoke";
	
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
			
		} 
		catch (Exception e)
		{
			System.out.println("Reading grenade file failed.");
			e.printStackTrace();
		}
	}
}
