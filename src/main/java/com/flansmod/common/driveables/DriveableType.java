package com.flansmod.common.driveables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;

import com.flansmod.client.model.AnimTankTrack;
import com.flansmod.client.model.ModelDriveable;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.paintjob.PaintableType;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.driveables.ShootPoint;
import com.flansmod.common.driveables.collisions.CollisionShapeBox;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DriveableType extends PaintableType
{
	@SideOnly(value = Side.CLIENT)
	/** The plane model */
	public ModelDriveable model;

	//Health and recipe
	/** Health of each driveable part */
	public HashMap<EnumDriveablePart, CollisionBox> health = new HashMap<EnumDriveablePart, CollisionBox>();
	/** Recipe parts associated to each driveable part */
	public HashMap<EnumDriveablePart, ItemStack[]> partwiseRecipe = new HashMap<EnumDriveablePart, ItemStack[]>();
	/** Recipe parts as one complete list */
	public ArrayList<ItemStack> driveableRecipe = new ArrayList<ItemStack>();

	//Ammo
	/** If true, then all ammo is accepted. Default is true to minimise backwards compatibility issues */
	public boolean acceptAllAmmo = true;
	/** The list of bullet types that can be used in this driveable for the main gun (tank shells, plane bombs etc) */
	public List<BulletType> ammo = new ArrayList<BulletType>();

	//Harvesting variables
	/** If true, then this vehicle harvests blocks from the harvester hitbox and places them in the inventory */
	public boolean harvestBlocks = false;
	/** What materials this harvester eats */
	public ArrayList<Material> materialsHarvested = new ArrayList<Material>();
	public boolean collectHarvest= false;
	public boolean dropHarvest = false;
	public Vector3f harvestBoxSize = new Vector3f(0,0,0);
	public Vector3f harvestBoxPos = new Vector3f(0,0,0);
	public int reloadSoundTick = 15214541;
	public float fallDamageFactor = 1.0F;

	//Weapon variables
	/** The weapon type assigned to left mouse */
	public EnumWeaponType primary = EnumWeaponType.NONE, secondary = EnumWeaponType.NONE;
	/** Whether to alternate weapons or fire all at once */
	public boolean alternatePrimary = false, alternateSecondary = false;
	/** Delays. Can override gun delays */
	public int shootDelayPrimary = 1, shootDelaySecondary = 1;
	/** Firing modes for primary and secondary guns. Minigun also an option */
	public EnumFireMode modePrimary = EnumFireMode.FULLAUTO, modeSecondary = EnumFireMode.FULLAUTO;
	/** Sounds */
	public String shootSoundPrimary, shootSoundSecondary, shootReloadSound;
	/** Positions of primary and secondary weapons */
	public ArrayList<ShootPoint> shootPointsPrimary = new ArrayList<ShootPoint>(), shootPointsSecondary = new ArrayList<ShootPoint>();
	/** Pilot guns also have their own seperate array so ammo handling can be done */
	public ArrayList<PilotGun> pilotGuns = new ArrayList<PilotGun>();

	public int		reloadTimePrimary		= 0,
					reloadTimeSecondary		= 0;
	public String	reloadSoundPrimary		= "",
					reloadSoundSecondary	= "";
	public int		placeTimePrimary		= 5,
					placeTimeSecondary		= 5;
	public String	placeSoundPrimary		= "",
					placeSoundSecondary		= "";
	//Passengers
	/** The number of passengers, not including the pilot */
	public int numPassengers = 0;
	/** Seat objects for holding information about the position and gun setup of each seat */
	public Seat[] seats;
	/** Automatic counter used to setup ammo inventory for gunners */
	public int numPassengerGunners = 0;

	public float vehicleGunModelScale = 1f;
	
	public class ShootParticle
	{
		public ShootParticle(String s, float x1, float y1, float z1)
		{
			x=x1; y=y1; z=z1;
			name = s;
		}
		float	x=0, y=0, z=0;
		String  name;
	}
	public ArrayList<ShootParticle> shootParticlesPrimary = new ArrayList<ShootParticle>();
	public ArrayList<ShootParticle> shootParticlesSecondary = new ArrayList<ShootParticle>();

	//Inventory + Pilot guns
	/** Inventory sizes */
	public int numCargoSlots, numBombSlots, numMissileSlots;
	/** The fuel tank size */
	public int fuelTankSize = 100;

	//Rendering variables
	/** The yOffset of the model. Shouldn't be needed if you made your model properly */
	public float yOffset = 10F / 16F;
	/** Third person render distance */
	public float cameraDistance = 5F;
	
	//Particle system
	/** A list of ambient particle emitters on this vehicle */
	public ArrayList<ParticleEmitter> emitters = new ArrayList<ParticleEmitter>();

	//Movement variables
	/** Generic movement modifiers, no longer repeated for plane and vehicle */
	public float maxThrottle = 1F, maxNegativeThrottle = 0F;
	public float ClutchBrake = 0F;
	/** The origin of the tank turret */
	public Vector3f turretOrigin = new Vector3f();
	public Vector3f turretOriginOffset = new Vector3f();

	/** Wheel positions */
	public DriveablePosition[] wheelPositions = new DriveablePosition[0];
	/** Strength of springs connecting car to wheels */
	public float wheelSpringStrength = 0.5F;
	/** The wheel radius for onGround checks */
	public float wheelStepHeight = 1.0F;
	/** Whether or not the vehicle rolls */
	public boolean canRoll = true;

	/** Collision points for block based collisions */
	public ArrayList<DriveablePosition> collisionPoints = new ArrayList<DriveablePosition>();

	/** Coefficient of drag */
	public float drag = 1F;

	//Boat Stuff
	/** If true, then the vehicles wheels float on water */
	public boolean floatOnWater = false;
	/** Defines where you can place this vehicle */
	public boolean placeableOnLand = true, placeableOnWater = false, placeableOnSponge = false;
	/** The upwards force to apply to the vehicle per wheel when on water */
	public float buoyancy = 0.0165F;

	public float floatOffset = 0;

	/** The radius within which to check for bullets */
	public float bulletDetectionRadius = 5F;

	/** Plane is shown on ICBM Radar and engaged by AA Guns */
    public boolean onRadar = false;
    
	/**Track animation frames */
	public int animFrames = 2;

	/** Sounds */
	public int startSoundRange = 50;
	public String startSound = "";
	public int startSoundLength;
	public int engineSoundRange = 50;
	public String engineSound = "";
	public int engineSoundLength;
	public int backSoundRange = 50;
	public String idleSound = "";
	public int idleSoundLength = 50;
	public String backSound = "";
	public int backSoundLength;

	public boolean collisionDamageEnable = false;
	public boolean pushOnCollision = true;
	public float collisionDamageThrottle = 0;
	public float collisionDamageTimes = 0;

	public boolean enableReloadTime = false;

    public boolean canMountEntity = false;

    public float bulletSpread = 0F;
    public float bulletSpeed = 3F;
    public boolean rangingGun = false;

    public boolean isExplosionWhenDestroyed = false;

    public String lockedOnSound = "";
    public int soundTime = 0;

    public int canLockOnAngle = 10;
	public int lockOnSoundTime = 60;
	public String lockOnSound = "";
	public int maxRangeLockOn = 500;
	public int lockedOnSoundRange = 5;
	public String lockingOnSound = "";

	public boolean lockOnToPlanes = false, lockOnToVehicles = false, lockOnToMechas = false, lockOnToPlayers = false, lockOnToLivings = false;

	//flares
	public boolean	hasFlare	= false;
	public int		flareDelay	= 20*10;
	public String	flareSound	= "";
	public int 		timeFlareUsing = 1;

	// radar (for mapwriter)
	/** The height of the entity that can be detected by radar.<br>
	* -1 = It does not detect.<br> */
	public int radarDetectableAltitude = -1;
	public boolean stealth = false;
	
    /** Barrel Recoil stuff */
    public float recoilDist = 5F;
    public float recoilTime = 5F;
    
    /** more nonsense */
    public boolean fixedPrimaryFire = false;
    public Vector3f primaryFireAngle = new Vector3f(0,0,0);
    
    /** backwards compatibility attempt */
    public float gunLength = 0;
    
    
    public boolean setPlayerInvisible = false;
    
    public float maxThrottleInWater = 0.5F;
    public int maxDepth = 3;

	public ArrayList<Vector3f> leftTrackPoints = new ArrayList<Vector3f>();
	public ArrayList<Vector3f> rightTrackPoints = new ArrayList<Vector3f>();
	public float trackLinkLength = 0;
    
    /** activator boolean for IT-1 reloads */
    public boolean IT1 = false;
	
	public static ArrayList<DriveableType> types = new ArrayList<DriveableType>();
	
	public ArrayList<CollisionShapeBox> collisionBox = new ArrayList<CollisionShapeBox>();
	public boolean fancyCollision = false;
	
	public CollisionShapeBox colbox;

    public DriveableType(TypeFile file)
    {
		super(file);
    }

    @Override
    public void preRead(TypeFile file)
    {
    	super.preRead(file);
		//Make sure the passenger arrays are set up first
		for(String line : file.lines)
		{
			if(line == null)
				break;
			if(line.startsWith("//"))
				continue;
			String[] split = line.split(" ");
			if(split.length < 2)
				continue;

			if(split[0].equals("Passengers"))
			{
				numPassengers = Integer.parseInt(split[1]);
				seats = new Seat[numPassengers + 1];
				break;
			}
		}
		//Make sure NumWheels is read before anything else
		for(String line : file.lines)
		{
			if(line == null)
				break;
			if(line.startsWith("//"))
				continue;
			String[] split = line.split(" ");
			if(split.length < 2)
				continue;

			if (split[0].equals("NumWheels"))
			{
				wheelPositions = new DriveablePosition[Integer.parseInt(split[1])];
				break;
			}
		}
		types.add(this);
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
			if(split[0].equals("VehicleGunModelScale"))
			     vehicleGunModelScale = Float.parseFloat(split[1]);
			
			if(FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model"))
				model = FlansMod.proxy.loadModel(split[1], shortName, ModelDriveable.class);
		    else if(split[0].equals("VehicleGunReloadTick"))
                reloadSoundTick = Integer.parseInt(split[1]);
			else if(split[0].equals("Texture"))
				texture = split[1];

			else if(split[0].equals("IsExplosionWhenDestroyed"))
				isExplosionWhenDestroyed = Boolean.parseBoolean(split[1]);

			else if(split[0].equals("FallDamageFactor"))
				fallDamageFactor = Float.parseFloat(split[1]);

			//Movement Variables
			else if(split[0].equals("MaxThrottle"))
				maxThrottle = Float.parseFloat(split[1]);
			else if(split[0].equals("MaxNegativeThrottle"))
				maxNegativeThrottle = Float.parseFloat(split[1]);
			else if(split[0].equals("ClutchBrake"))
				ClutchBrake = Float.parseFloat(split[1]);
			else if(split[0].equals("MaxThrottleInWater"))
				maxThrottleInWater = Float.parseFloat(split[1]);
			else if(split[0].equals("MaxDepth"))
				maxDepth = Integer.parseInt(split[1]);
			else if(split[0].equals("Drag"))
				drag = Float.parseFloat(split[1]);
			else if(split[0].equals("TurretOrigin"))
            	turretOrigin = new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F);
			else if(split[0].equals("TurretOriginOffset"))
            	turretOriginOffset = new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F);
			else if(split[0].equals("CollisionPoint") || split[0].equals("AddCollisionPoint"))
            	collisionPoints.add(new DriveablePosition(split));
			else if(split[0].equals("CollisionDamageEnable"))
				collisionDamageEnable = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("CollisionDamageThrottle"))
				collisionDamageThrottle = Float.parseFloat(split[1]);
			else if(split[0].equals("CollisionDamageTimes"))
				collisionDamageTimes = Float.parseFloat(split[1]);
			else if(split[0].equals("CanLockAngle"))
				canLockOnAngle = Integer.parseInt(split[1]);
			else if(split[0].equals("LockOnSoundTime"))
				lockOnSoundTime = Integer.parseInt(split[1]);
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
			else if(split[0].equals("LockedOnSoundRange"))
				lockedOnSoundRange = Integer.parseInt(split[1]);
			else if(split[0].equals("CanRoll"))
				canRoll = Boolean.parseBoolean(split[1]);
			
			//Flares
			if(split[0].equals("HasFlare"))
				hasFlare = Boolean.parseBoolean(split[1]);
			if(split[0].equals("FlareDelay"))
			{
				flareDelay = Integer.parseInt(split[1]);
				if(flareDelay<=0)
					flareDelay = 1;
			}
			if(split[0].equals("TimeFlareUsing"))
			{
				timeFlareUsing = Integer.parseInt(split[1]);
				if(timeFlareUsing<=0)
					timeFlareUsing = 1;
			}


			//Boats
			else if(split[0].equals("PlaceableOnLand"))
            	placeableOnLand = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("PlaceableOnWater"))
            	placeableOnWater = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("PlaceableOnSponge"))
            	placeableOnSponge = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("FloatOnWater"))
            	floatOnWater = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("Boat"))
            {
            	placeableOnLand = false;
            	placeableOnWater = true;
            	floatOnWater = true;
            	wheelStepHeight = 0F;
            }
			else if(split[0].equals("Buoyancy"))
				buoyancy = Float.parseFloat(split[1]);
			else if(split[0].equals("FloatOffset"))
				floatOffset = Float.parseFloat(split[1]);

			else if(split[0].equals("CanMountEntity"))
				canMountEntity = Boolean.parseBoolean(split[1]);

            //Wheels
			else if(split[0].equals("Wheel") || split[0].equals("WheelPosition"))
            {
            	wheelPositions[Integer.parseInt(split[1])] = new DriveablePosition(new Vector3f(Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F, Float.parseFloat(split[4]) / 16F), split.length > 5 ? EnumDriveablePart.getPart(split[5]) : EnumDriveablePart.coreWheel);
            }
			else if(split[0].equals("WheelRadius") || split[0].equals("WheelStepHeight"))
            	wheelStepHeight = Float.parseFloat(split[1]);
			else if(split[0].equals("WheelSpringStrength") || split[0].equals("SpringStrength"))
                wheelSpringStrength = Float.parseFloat(split[1]);
			else if(split[0].equals("TrackFrames"))
				animFrames = Integer.parseInt(split[1])-1;

			//Harvesting
			else if(split[0].equals("Harvester"))
            	harvestBlocks = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("CollectHarvest"))
            	collectHarvest = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("DropHarvest"))
            	dropHarvest = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("HarvestBox")){
				harvestBoxSize = new Vector3f(split[1], shortName);
				harvestBoxPos = new Vector3f(split[2], shortName);
			}
			else if(split[0].equals("HarvestMaterial"))
			{
				materialsHarvested.add(getMaterial(split[1]));
			}
			else if(split[0].equals("HarvestToolType"))
			{
				if(split[1].equals("Axe"))
				{
					materialsHarvested.add(Material.wood);
					materialsHarvested.add(Material.plants);
					materialsHarvested.add(Material.vine);
				}
				else if(split[1].equals("Pickaxe") || split[1].equals("Drill"))
				{
					materialsHarvested.add(Material.iron);
					materialsHarvested.add(Material.anvil);
					materialsHarvested.add(Material.rock);
				}
				else if(split[1].equals("Spade") || split[1].equals("Shovel") || split[1].equals("Excavator"))
				{
					materialsHarvested.add(Material.ground);
					materialsHarvested.add(Material.grass);
					materialsHarvested.add(Material.sand);
					materialsHarvested.add(Material.snow);
					materialsHarvested.add(Material.clay);
				}
				else if(split[1].equals("Hoe") || split[1].equals("Combine"))
				{
					materialsHarvested.add(Material.plants);
					materialsHarvested.add(Material.leaves);
					materialsHarvested.add(Material.vine);
					materialsHarvested.add(Material.cactus);
					materialsHarvested.add(Material.gourd);
				}
				else if(split[1].equals("Tank"))
				{
					materialsHarvested.add(Material.leaves);	
					materialsHarvested.add(Material.cactus);
					materialsHarvested.add(Material.wood);
					materialsHarvested.add(Material.plants);
				}
			}

			//Cargo / Payload
			else if(split[0].equals("CargoSlots"))
				numCargoSlots = Integer.parseInt(split[1]);
			else if(split[0].equals("BombSlots") || split[0].equals("MineSlots"))
				numBombSlots = Integer.parseInt(split[1]);
			else if(split[0].equals("MissileSlots") || split[0].equals("ShellSlots"))
				numMissileSlots = Integer.parseInt(split[1]);
			else if(split[0].equals("FuelTankSize"))
				fuelTankSize = Integer.parseInt(split[1]);

			else if(split[0].equals("BulletDetection"))
				bulletDetectionRadius = Integer.parseInt(split[1]);

			//Ammo limiters
			else if(split[0].equals("AddAmmo"))
				ammo.add(BulletType.getBullet(split[1]));
			else if(split[0].equals("AllowAllAmmo") || split[0].equals("AcceptAllAmmo"))
				acceptAllAmmo = Boolean.parseBoolean(split[1]);

			//Weaponry
			else if(split[0].equals("Primary"))
				primary = EnumWeaponType.valueOf(split[1].toUpperCase());
			else if(split[0].equals("Secondary"))
				secondary = EnumWeaponType.valueOf(split[1].toUpperCase());
			else if(split[0].equals("ShootDelayPrimary"))
				shootDelayPrimary = Integer.parseInt(split[1]);
			else if(split[0].equals("ShootDelaySecondary"))
				shootDelaySecondary = Integer.parseInt(split[1]);
			else if(split[0].equals("PlaceTimePrimary"))
				placeTimePrimary = Integer.parseInt(split[1]);
			else if(split[0].equals("PlaceTimeSecondary"))
				placeTimeSecondary = Integer.parseInt(split[1]);
			else if(split[0].equals("ReloadTimePrimary"))
				reloadTimePrimary = Integer.parseInt(split[1]);
			else if(split[0].equals("ReloadTimeSecondary"))
				reloadTimeSecondary = Integer.parseInt(split[1]);
			else if(split[0].equals("AlternatePrimary"))
				alternatePrimary = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("AlternateSecondary"))
				alternateSecondary = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("ModePrimary"))
				modePrimary = EnumFireMode.valueOf(split[1].toUpperCase());
			else if(split[0].equals("ModeSecondary"))
				modeSecondary = EnumFireMode.valueOf(split[1].toUpperCase());
			else if(split[0].equals("BulletSpeed"))
				bulletSpeed = Float.parseFloat(split[1]);
			else if(split[0].equals("BulletSpread"))
				bulletSpread = Float.parseFloat(split[1]);
			else if(split[0].equals("RangingGun"))
				rangingGun = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("GunLength"))
				gunLength = Float.parseFloat(split[1]);
			else if(split[0].equals("RecoilDistance"))
				recoilDist = Float.parseFloat(split[1]);
			else if(split[0].equals("RecoilTime"))
				recoilTime = Float.parseFloat(split[1]);
			else if(split[0].equals("ShootPointPrimary"))
			{
				DriveablePosition rootPos;
				Vector3f offPos;
				String[] gun;
		    	if(split.length == 9)
		    	{
		    	gun = new String[]{split[0], split[1], split[2], split[3], split[4], split[5]};
		    	offPos = new Vector3f(Float.parseFloat(split[6])/16F,Float.parseFloat(split[7])/16F,Float.parseFloat(split[8])/16F);
		    	} else if (split.length == 8){
		    	gun = new String[]{split[0], split[1], split[2], split[3], split[4]};
		    	offPos = new Vector3f(Float.parseFloat(split[5])/16F,Float.parseFloat(split[6])/16F,Float.parseFloat(split[7])/16F);
		    	} else {
		    		gun = split;
		    		offPos = new Vector3f(0,0,0);
		    	}
				rootPos = getShootPoint(gun);
				ShootPoint sPoint = new ShootPoint(rootPos, offPos);
				shootPointsPrimary.add(sPoint);
				if(rootPos instanceof PilotGun)
					pilotGuns.add((PilotGun)sPoint.rootPos);
			}
			else if(split[0].equals("ShootPointSecondary"))
			{
				DriveablePosition rootPos;
				Vector3f offPos;
				String[] gun;
		    	if(split.length == 9)
		    	{
		    	gun = new String[]{split[0], split[1], split[2], split[3], split[4], split[5]};
		    	offPos = new Vector3f(Float.parseFloat(split[6])/16F,Float.parseFloat(split[7])/16F,Float.parseFloat(split[8])/16F);
		    	} else if (split.length == 8){
		    	gun = new String[]{split[0], split[1], split[2], split[3], split[4]};
		    	offPos = new Vector3f(Float.parseFloat(split[5])/16F,Float.parseFloat(split[6])/16F,Float.parseFloat(split[7])/16F);
		    	} else {
		    		gun = split;
		    		offPos = new Vector3f(0,0,0);
		    	}
				rootPos = getShootPoint(gun);
				ShootPoint sPoint = new ShootPoint(rootPos, offPos);
				shootPointsSecondary.add(sPoint);
				if(rootPos instanceof PilotGun)
					pilotGuns.add((PilotGun)sPoint.rootPos);
			}
			else if(split[0].equals("EnableReloadTime"))
				enableReloadTime = Boolean.parseBoolean(split[1]);

			else if(split[0].equals("ShootParticlesPrimary"))
				shootParticlesPrimary.add(new ShootParticle(
						split[1],
						Float.valueOf(split[2]),
						Float.valueOf(split[3]),
						Float.valueOf(split[4])));
			else if(split[0].equals("ShootParticlesSecondary"))
				shootParticlesSecondary.add(new ShootParticle(
						split[1],
						Float.valueOf(split[2]),
						Float.valueOf(split[3]),
						Float.valueOf(split[4])));
			
			
            if(split[0].equals("SetPlayerInvisible"))
            	setPlayerInvisible = Boolean.parseBoolean(split[1].toLowerCase());
            if(split[0].equals("IT1"))
            	IT1 = Boolean.parseBoolean(split[1].toLowerCase());
            if(split[0].equals("FixedPrimary"))
            	fixedPrimaryFire = Boolean.parseBoolean(split[1].toLowerCase());
            if(split[0].equals("PrimaryAngle"))
            	primaryFireAngle = new Vector3f(Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3]));

			//Backwards compatibility stuff
			else if(split[0].equals("AddGun"))
			{
				DriveablePosition rootPos;
				Vector3f offPos;
				secondary = EnumWeaponType.GUN;
				PilotGun pilotGun;
				if(split.length == 6)
				{
					rootPos = (PilotGun)getShootPoint(split);
					offPos = new Vector3f(0,0,0);
					pilotGun = (PilotGun)getShootPoint(split);
				} else {
					String[] gun = new String[]{split[0],split[1],split[2],split[3],split[4], split[5]};
					rootPos = (PilotGun)getShootPoint(gun);
					pilotGun = (PilotGun)getShootPoint(gun);
					offPos = new Vector3f(Float.parseFloat(split[6])/16F,Float.parseFloat(split[7])/16F,Float.parseFloat(split[8])/16F);
				}
				ShootPoint sPoint = new ShootPoint(rootPos, offPos);
				shootPointsSecondary.add(sPoint);
				pilotGuns.add(pilotGun);
				driveableRecipe.add(new ItemStack(pilotGun.type.item));
			}
			else if(split[0].equals("BombPosition"))
			{
				primary = EnumWeaponType.BOMB;
				if(split.length == 4)
				shootPointsPrimary.add(new ShootPoint(new DriveablePosition(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F), EnumDriveablePart.core), new Vector3f(0,0,0)));
				else if (split.length == 7)
				shootPointsPrimary.add(new ShootPoint(new DriveablePosition(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F), EnumDriveablePart.core), new Vector3f(Float.parseFloat(split[4]) / 16F,Float.parseFloat(split[5]) / 16F,Float.parseFloat(split[6]) / 16F)));

			}
			else if(split[0].equals("BarrelPosition"))
			{
				primary = EnumWeaponType.SHELL;
				if(split.length == 4)
				shootPointsPrimary.add(new ShootPoint(new DriveablePosition(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F), EnumDriveablePart.turret), new Vector3f(0,0,0)));
				else if (split.length == 7)
				shootPointsPrimary.add(new ShootPoint(new DriveablePosition(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F), EnumDriveablePart.turret), new Vector3f(Float.parseFloat(split[4]) / 16F,Float.parseFloat(split[5]) / 16F,Float.parseFloat(split[6]) / 16F)));
			}
			else if(split[0].equals("ShootDelay"))
				shootDelaySecondary = Integer.parseInt(split[1]);
			else if(split[0].equals("ShellDelay") || split[0].equals("BombDelay"))
				shootDelayPrimary = Integer.parseInt(split[1]);

			//Recipe
			else if(split[0].equals("AddRecipeParts"))
			{
				EnumDriveablePart part = EnumDriveablePart.getPart(split[1]);
				ItemStack[] stacks = new ItemStack[(split.length - 2) / 2];
				for(int i = 0; i < (split.length - 2) / 2; i++)
				{
					int amount = Integer.parseInt(split[2 * i + 2]);
					boolean damaged = split[2 * i + 3].contains(".");
					String itemName = damaged ? split[2 * i + 3].split("\\.")[0] : split[2 * i + 3];
					int damage = damaged ? Integer.parseInt(split[2 * i + 3].split("\\.")[1]) : 0;
					stacks[i] = getRecipeElement(itemName, amount, damage, shortName);
					driveableRecipe.add(stacks[i]);
				}
				partwiseRecipe.put(part, stacks);
			}

			//Dyes
			else if(split[0].equals("AddDye"))
			{
				int amount = Integer.parseInt(split[1]);
				int damage = -1;
				for(int i = 0; i < ItemDye.field_150923_a.length; i++)
				{
					if(ItemDye.field_150923_a[i].equals(split[2]))
						damage = i;
				}
				if(damage == -1)
				{
					FlansMod.log("Failed to find dye colour : " + split[2] + " while adding " + file.name);
					return;
				}
				driveableRecipe.add(new ItemStack(Items.dye, amount, damage));
			}


			//Health
			else if(split[0].equals("SetupPart"))
			{
				EnumDriveablePart part = EnumDriveablePart.getPart(split[1]);
				CollisionBox box = new CollisionBox(Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]), Integer.parseInt(split[7]), Integer.parseInt(split[8]));
				health.put(part, box);
			}

			//Driver Position
			else if(split[0].equals("Driver") || split[0].equals("Pilot"))
			{
				if(split.length > 4)
					seats[0] = new Seat(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Float.parseFloat(split[4]), Float.parseFloat(split[5]), Float.parseFloat(split[6]), Float.parseFloat(split[7]));
				else seats[0] = new Seat(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
			}
			else if(split[0].equals("DriverPart")){
				seats[0].part = EnumDriveablePart.getPart(split[1]);
			}
			else if(split[0].equals("DriverGun") || split[0].equals("PilotGun"))
			{
				seats[0].gunName = split[2];
			}
			else if(split[0].equals("DriverGunOrigin"))
				seats[0].gunOrigin = new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F);

			else if(split[0].equals("RotatedDriverOffset"))
			{
				seats[0].rotatedOffset = new Vector3f(Integer.parseInt(split[1]) / 16F, Integer.parseInt(split[2]) / 16F, Integer.parseInt(split[3]) / 16F);
			}
			else if(split[0].equals("RotatedPassengerOffset"))
			{
				seats[Integer.parseInt(split[1])].rotatedOffset = new Vector3f(Integer.parseInt(split[2]) / 16F, Integer.parseInt(split[3]) / 16F, Integer.parseInt(split[4]) / 16F);
			}
            else if(split[0].equals("DriverAimSpeed"))
            {
                seats[0].aimingSpeed = new Vector3f(Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3]));
            }
            else if(split[0].equals("PassengerAimSpeed"))
            {
                seats[Integer.parseInt(split[1])].aimingSpeed = new Vector3f(Float.parseFloat(split[2]), Float.parseFloat(split[3]), Float.parseFloat(split[4]));
            }
            else if(split[0].equals("DriverLegacyAiming")){
                seats[0].legacyAiming = Boolean.parseBoolean(split[1]);
            }
            else if(split[0].equals("PassengerLegacyAiming")){
                seats[Integer.parseInt(split[1])].legacyAiming = Boolean.parseBoolean(split[2]);
            }
            else if(split[0].equals("DriverYawBeforePitch")){
                seats[0].yawBeforePitch = Boolean.parseBoolean(split[1]);
            }
            else if(split[0].equals("PassengerYawBeforePitch")){
                seats[Integer.parseInt(split[1])].yawBeforePitch = Boolean.parseBoolean(split[2]);
            }
			else if(split[0].equals("DriverLatePitch")){
				seats[0].latePitch = Boolean.parseBoolean(split[1]);
			}
			else if(split[0].equals("PassengerLatePitch")){
				seats[Integer.parseInt(split[1])].latePitch = Boolean.parseBoolean(split[2]);
			}
            else if(split[0].equals("DriverTraverseSounds")){
                seats[0].traverseSounds = Boolean.parseBoolean(split[1]);
            }
            else if(split[0].equals("PassengerTraverseSounds")){
                seats[Integer.parseInt(split[1])].traverseSounds = Boolean.parseBoolean(split[2]);
            }

			//Passengers / Gunner Seats
			else if(split[0].equals("Passenger"))
			{
				Seat seat = new Seat(split);
				seats[seat.id] = seat;
				if(seat.gunType != null)
				{
					seat.gunnerID = numPassengerGunners++;
					driveableRecipe.add(new ItemStack(seat.gunType.item));
				}
			}
			else if(split[0].equals("GunOrigin"))
				seats[Integer.parseInt(split[1])].gunOrigin = new Vector3f(Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F, Float.parseFloat(split[4]) / 16F);

			//Y offset for badly built models :P
			else if(split[0].equals("YOffset"))
				yOffset = Float.parseFloat(split[1]);
            //Third person camera distance
			else if(split[0].equals("CameraDistance"))
				cameraDistance = Float.parseFloat(split[1]);

			//Sound
			else if(split[0].equals("StartSoundRange"))
				startSoundRange = Integer.parseInt(split[1]);
			else if(split[0].equals("StartSoundLength"))
				startSoundLength = Integer.parseInt(split[1]);
			else if(split[0].equals("EngineSoundRange"))
				engineSoundRange = Integer.parseInt(split[1]);
			else if(split[0].equals("EngineSoundLength"))
				engineSoundLength = Integer.parseInt(split[1]);
			else if(split[0].equals("IdleSoundLength"))
				idleSoundLength = Integer.parseInt(split[1]);
			else if(split[0].equals("BackSoundRange"))
				backSoundRange = Integer.parseInt(split[1]);
			else if(split[0].equals("BackSoundLength"))
				backSoundLength = Integer.parseInt(split[1]);
			else if(split[0].equals("SoundTime"))
				soundTime = Integer.parseInt(split[1]);
            else if(split[0].equals("YawSoundLength"))
                seats[0].yawSoundLength = Integer.parseInt(split[1]);
            else if(split[0].equals("PitchSoundLength"))
                seats[0].pitchSoundLength = Integer.parseInt(split[1]);
            else if(split[0].equals("PassengerYawSoundLength"))
                seats[Integer.parseInt(split[1])].yawSoundLength = Integer.parseInt(split[2]);
            else if(split[0].equals("PassengerPitchSoundLength"))
                seats[Integer.parseInt(split[1])].pitchSoundLength = Integer.parseInt(split[2]);
			else if(split[0].equals("StartSound"))
			{
				startSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			else if(split[0].equals("EngineSound"))
			{
				engineSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			else if(split[0].equals("IdleSound"))
			{
				idleSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			else if(split[0].equals("BackSound"))
			{
				backSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
            else if(split[0].equals("YawSound"))
            {
                seats[0].yawSound = split[1];
                FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
            }
            else if(split[0].equals("PitchSound"))
            {
                seats[0].pitchSound = split[1];
                FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
            }
            else if(split[0].equals("PassengerYawSound"))
            {
                seats[Integer.parseInt(split[1])].yawSound = split[2];
                FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
            }
            else if(split[0].equals("PassengerPitchSound"))
            {
                seats[Integer.parseInt(split[1])].pitchSound = split[2];
                FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
            }
			else if(split[0].equals("ShootMainSound") || split[0].equals("ShootSoundPrimary") || split[0].equals("ShellSound") || split[0].equals("BombSound"))
			{
				shootSoundPrimary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
            else if(split[0].equals("ShootReloadSound"))
            {
                shootReloadSound = split[1];
                FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
            }
			else if(split[0].equals("ShootSecondarySound") || split[0].equals("ShootSoundSecondary"))
			{
				shootSoundSecondary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			else if(split[0].equals("PlaceSoundPrimary"))
			{
				placeSoundPrimary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			else if(split[0].equals("PlaceSoundSecondary"))
			{
				placeSoundSecondary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			else if(split[0].equals("ReloadSoundPrimary"))
			{
				reloadSoundPrimary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			else if(split[0].equals("ReloadSoundSecondary"))
			{
				reloadSoundSecondary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			else if(split[0].equals("LockedOnSound"))
			{
				lockedOnSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			else if(split[0].equals("LockOnSound"))
			{
				lockOnSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}
			else if(split[0].equals("LockingOnSound"))
			{
				lockingOnSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}
			if(split[0].equals("FlareSound"))
			{
				flareSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			
			if(split[0].equals("FancyCollision")) 
				fancyCollision = Boolean.parseBoolean(split[1]);
			
			if(split[0].equals("AddCollisionMesh"))
			{
				CollisionShapeBox box = new CollisionShapeBox(new Vector3f(split[1], shortName), new Vector3f(split[2], shortName), new Vector3f(split[3], shortName), new Vector3f(split[4], shortName), new Vector3f(split[5], shortName), new Vector3f(split[6], shortName), new Vector3f(split[7], shortName), new Vector3f(split[8], shortName), new Vector3f(split[9], shortName), new Vector3f(split[10], shortName), "core");
				collisionBox.add(box);
				//colbox = box;
			}
			
			if(split[0].equals("AddCollisionMeshRaw"))
			{
				Vector3f pos = new Vector3f(Float.parseFloat(split[1]),Float.parseFloat(split[2]), Float.parseFloat(split[3]));
				Vector3f size = new Vector3f(Float.parseFloat(split[4]),Float.parseFloat(split[5]), Float.parseFloat(split[6]));
				Vector3f p1 = new Vector3f(Float.parseFloat(split[8]),Float.parseFloat(split[9]), Float.parseFloat(split[10]));
				Vector3f p2 = new Vector3f(Float.parseFloat(split[11]),Float.parseFloat(split[12]), Float.parseFloat(split[13]));
				Vector3f p3 = new Vector3f(Float.parseFloat(split[14]),Float.parseFloat(split[15]), Float.parseFloat(split[16]));
				Vector3f p4 = new Vector3f(Float.parseFloat(split[17]),Float.parseFloat(split[18]), Float.parseFloat(split[19]));
				Vector3f p5 = new Vector3f(Float.parseFloat(split[20]),Float.parseFloat(split[21]), Float.parseFloat(split[22]));
				Vector3f p6 = new Vector3f(Float.parseFloat(split[23]),Float.parseFloat(split[24]), Float.parseFloat(split[25]));
				Vector3f p7 = new Vector3f(Float.parseFloat(split[26]),Float.parseFloat(split[27]), Float.parseFloat(split[28]));
				Vector3f p8 = new Vector3f(Float.parseFloat(split[29]),Float.parseFloat(split[30]), Float.parseFloat(split[31]));				
				CollisionShapeBox box = new CollisionShapeBox(pos, size, p1, p2, p3, p4, p5, p6, p7, p8, "core");
				collisionBox.add(box);
				//colbox = box;
			}
			
			if(split[0].equals("AddTurretCollisionMesh"))
			{
				CollisionShapeBox box = new CollisionShapeBox(new Vector3f(split[1], shortName), new Vector3f(split[2], shortName), new Vector3f(split[3], shortName), new Vector3f(split[4], shortName), new Vector3f(split[5], shortName), new Vector3f(split[6], shortName), new Vector3f(split[7], shortName), new Vector3f(split[8], shortName), new Vector3f(split[9], shortName), new Vector3f(split[10], shortName), "turret");
				collisionBox.add(box);
				//colbox = box;
			}
			
			if(split[0].equals("AddTurretCollisionMeshRaw"))
			{
				Vector3f pos = new Vector3f(Float.parseFloat(split[1]),Float.parseFloat(split[2]), Float.parseFloat(split[3]));
				Vector3f size = new Vector3f(Float.parseFloat(split[4]),Float.parseFloat(split[5]), Float.parseFloat(split[6]));
				Vector3f p1 = new Vector3f(Float.parseFloat(split[8]),Float.parseFloat(split[9]), Float.parseFloat(split[10]));
				Vector3f p2 = new Vector3f(Float.parseFloat(split[11]),Float.parseFloat(split[12]), Float.parseFloat(split[13]));
				Vector3f p3 = new Vector3f(Float.parseFloat(split[14]),Float.parseFloat(split[15]), Float.parseFloat(split[16]));
				Vector3f p4 = new Vector3f(Float.parseFloat(split[17]),Float.parseFloat(split[18]), Float.parseFloat(split[19]));
				Vector3f p5 = new Vector3f(Float.parseFloat(split[20]),Float.parseFloat(split[21]), Float.parseFloat(split[22]));
				Vector3f p6 = new Vector3f(Float.parseFloat(split[23]),Float.parseFloat(split[24]), Float.parseFloat(split[25]));
				Vector3f p7 = new Vector3f(Float.parseFloat(split[26]),Float.parseFloat(split[27]), Float.parseFloat(split[28]));
				Vector3f p8 = new Vector3f(Float.parseFloat(split[29]),Float.parseFloat(split[30]), Float.parseFloat(split[31]));				
				CollisionShapeBox box = new CollisionShapeBox(pos, size, p1, p2, p3, p4, p5, p6, p7, p8, "turret");
				collisionBox.add(box);
				//colbox = box;
			}

			
			if(split[0].equals("LeftLinkPoint"))
			{
				leftTrackPoints.add(new Vector3f(split[1], shortName));
			}
			
			if(split[0].equals("RightLinkPoint"))
			{
				rightTrackPoints.add(new Vector3f(split[1], shortName));
			}
			
			if(split[0].equals("TrackLinkLength"))
			{
				trackLinkLength = Float.parseFloat(split[1]);
			}
			
			// ICBM Mod Radar
			else if(split[0].equals("OnRadar"))
                onRadar = split[1].equals("True");
			
			else if(split[0].equalsIgnoreCase("AddParticle") || split[0].equalsIgnoreCase("AddEmitter"))
			{
				ParticleEmitter emitter = new ParticleEmitter();
				emitter.effectType = split[1];
				emitter.emitRate = Integer.parseInt(split[2]);
				emitter.origin = new Vector3f(split[3], shortName);
				emitter.extents = new Vector3f(split[4], shortName);
				emitter.velocity = new Vector3f(split[5], shortName);
				emitter.minThrottle = Float.parseFloat(split[6]);
				emitter.maxThrottle = Float.parseFloat(split[7]);
				emitter.minHealth = Float.parseFloat(split[8]);
				emitter.maxHealth = Float.parseFloat(split[9]);
				emitter.part = split[10];
				//Scale from model coords to world coords
				emitter.origin.scale(1.0f / 16.0f);
				emitter.extents.scale(1.0f / 16.0f);
				emitter.velocity.scale(1.0f / 16.0f);
				emitters.add(emitter);
			}
			
			// radar (for mapwriter)
			else if(split[0].equals("RadarDetectableAltitude"))
			radarDetectableAltitude = Integer.parseInt(split[1]);
			else if(split[0].equals("Stealth"))
			stealth = split[1].equals("True");
		}
		catch (Exception e)
		{
			if(split!=null)
			{
				String msg = " : ";
				for(String s : split) msg = msg + " " + s;
				FlansMod.log("Errored reading " + file.name + "");
			}
			else
			{
				FlansMod.log("Errored reading " + file.name);
			}
			if(FlansMod.printStackTrace)
			{
				e.printStackTrace();
			}
		}
	}

    private DriveablePosition getShootPoint(String[] split)
    {
    	//Its a gun with a type
    	if(split.length == 6)
    	{
    		return new PilotGun(split);
    	}
    	else if(split.length == 5)
    	{
    		return new DriveablePosition(split);
    	}
		return new DriveablePosition(new Vector3f(), EnumDriveablePart.core);
	}

    public ArrayList<ShootPoint> shootPoints(boolean s)
    {
    	return s ? shootPointsSecondary : shootPointsPrimary;
    }

    public boolean alternate(boolean s)
    {
    	return s ? alternateSecondary : alternatePrimary;
    }

    public EnumWeaponType weaponType(boolean s)
    {
    	return s ? secondary : primary;
    }

    public int shootDelay(boolean s)
    {
    	return s ? shootDelaySecondary : shootDelayPrimary;
    }

    public String shootSound(boolean s)
    {
    	return s ? shootSoundSecondary : shootSoundPrimary;
    }

    public ArrayList<ShootParticle> shootParticle(boolean s)
    {
    	return s ? shootParticlesSecondary : shootParticlesPrimary;
    }

	public int numEngines()
    {
    	return 1;
    }

    public int ammoSlots()
    {
    	return numPassengerGunners + pilotGuns.size();
    }

    public boolean isValidAmmo(BulletType bulletType, EnumWeaponType weaponType)
    {
    	return (acceptAllAmmo || ammo.contains(bulletType)) && bulletType.weaponType == weaponType;
    }

    /** Find the items needed to rebuild a part. The returned array is disconnected from the template items it has looked up */
    public ArrayList<ItemStack> getItemsRequired(DriveablePart part, PartType engine)
    {
    	ArrayList<ItemStack> stacks = new ArrayList<ItemStack>();
    	//Start with the items required to build this part
    	if(partwiseRecipe.get(part.type) != null)
    	{
	    	for(ItemStack stack : partwiseRecipe.get(part.type))
	    	{
	    		stacks.add(stack.copy());
	    	}
    	}
    	//Add the items required for the guns connected to this part
    	for(PilotGun gun : pilotGuns)
    	{
    		if(gun.part == part.type)
    			stacks.add(new ItemStack(gun.type.item));
    	}
    	for(Seat seat : seats)
    	{
    		if(seat != null && seat.part == part.type && seat.gunType != null)
    			stacks.add(new ItemStack(seat.gunType.item));
    	}
    	return stacks;
    }

	public static DriveableType getDriveable(String find)
	{
		for(DriveableType type : types)
		{
			if(type.shortName.equals(find))
				return type;
		}
		return null;
	}
	
	@Override
	public float GetRecommendedScale()
	{
		return 100.0f / cameraDistance;
	}
	
	public class ParticleEmitter
	{
		/** The name of the effect */
		public String effectType;
		/** The rate of emission */
		public int emitRate;
		/** The centre of the effect emitter */
		public Vector3f origin;
		/** The size of the box in which it emits */
		public Vector3f extents;
		/** The velocity of the particle */
		public Vector3f velocity;
		/** Lower throttle bound */
		public float minThrottle;
		/** Upper throttle bound */
		public float maxThrottle;
		/** Model part the emitter is bound to */
		public String part;
		/** Minimum health for the emitter to work */
		public float minHealth;
		/** Maximum health for the emitter to work */
		public float maxHealth;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBase GetModel() 
	{
		return model;
	}
}