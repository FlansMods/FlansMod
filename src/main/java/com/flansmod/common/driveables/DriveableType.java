package com.flansmod.common.driveables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.client.model.ModelDriveable;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.collisions.CollisionShapeBox;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.PaintableType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;

public abstract class DriveableType extends PaintableType
{
	@SideOnly(value = Side.CLIENT)
	/** The plane model */
	public ModelDriveable model;
	
	//Health and recipe
	/** Health of each driveable part */
	public HashMap<EnumDriveablePart, CollisionBox> health = new HashMap<>();
	/** Recipe parts associated to each driveable part */
	public HashMap<EnumDriveablePart, ItemStack[]> partwiseRecipe = new HashMap<>();
	/** Recipe parts as one complete list */
	public ArrayList<ItemStack> driveableRecipe = new ArrayList<>();
	
	//Ammo
	/** If true, then all ammo is accepted. Default is true to minimise backwards compatibility issues */
	public boolean acceptAllAmmo = true;
	/** The list of bullet types that can be used in this driveable for the main gun (tank shells, plane bombs etc) */
	public List<BulletType> ammo = new ArrayList<>();
	
	//Harvesting variables
	/** If true, then this vehicle harvests blocks from the harvester hitbox and places them in the inventory */
	public boolean harvestBlocks = false;
	/** What materials this harvester eats */
	public ArrayList<Material> materialsHarvested = new ArrayList<>();
	public boolean collectHarvest = false;
	public boolean dropHarvest = false;
	public Vector3f harvestBoxSize = new Vector3f(0, 0, 0);
	public Vector3f harvestBoxPos = new Vector3f(0, 0, 0);
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
	/** Damage modifiers, so that different vehicles firing the same weapons can do different damage */
	public int damageModifierPrimary = 1, damageModifierSecondary = 1;
	
	/** Positions of primary and secondary weapons */
	public ArrayList<ShootPoint> shootPointsPrimary = new ArrayList<>();
	public ArrayList<ShootPoint> shootPointsSecondary = new ArrayList<>();
	/** Pilot guns also have their own separate array so ammo handling can be done */
	public ArrayList<PilotGun> pilotGuns = new ArrayList<>();
	
	/** Sounds */
	public String shootSoundPrimary, shootSoundSecondary;
	public int reloadTimePrimary = 0, reloadTimeSecondary = 0;
	public String reloadSoundPrimary = "", reloadSoundSecondary = "";
	public int placeTimePrimary = 5, placeTimeSecondary = 5;
	public String placeSoundPrimary = "", placeSoundSecondary = "";
	
	//Passengers
	/** The number of passengers, not including the pilot */
	public int numPassengers = 0;
	/** Seat objects for holding information about the position and gun setup of each seat */
	public Seat[] seats;
	/** Automatic counter used to setup ammo inventory for gunners */
	public int numPassengerGunners = 0;
	
	//Rendering variables
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
	public ArrayList<ParticleEmitter> emitters = new ArrayList<>();
	// Shoot particles
	public float vehicleGunModelScale = 1f;
	
	public static class ShootParticle
	{
		public ShootParticle(String s, float x1, float y1, float z1)
		{
			x = x1;
			y = y1;
			z = z1;
			name = s;
		}
		
		float x = 0, y = 0, z = 0;
		String name;
	}
	
	public ArrayList<ShootParticle> shootParticlesPrimary = new ArrayList<>();
	public ArrayList<ShootParticle> shootParticlesSecondary = new ArrayList<>();
	
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
	/**
	 *
	 */
	public float turretRotationSpeed = 2.5F;
	
	/** Collision points for block based collisions */
	public ArrayList<DriveablePosition> collisionPoints = new ArrayList<>();
	
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
	
	/** Track animation frames */
	public int animFrames = 2;
	
	/** Sounds */
	public String startSound = "";
	public int startSoundLength;
	public String engineSound = "";
	public int engineSoundLength;
	
	public boolean collisionDamageEnable = false;
	public float collisionDamageThrottle = 0;
	public float collisionDamageTimes = 0;
	
	public boolean enableReloadTime = false;
	
	public boolean canMountEntity = false;
	
	public float bulletSpread = 0F;
	public float bulletSpeed = 3F;
	public boolean rangingGun = false;
	
	public boolean isExplosionWhenDestroyed = false;
	
	public String lockedOnSound = "";
	
	public int canLockOnAngle = 10;
	public int lockOnSoundTime = 60;
	public int lockedOnSoundRange = 5;
	public String lockingOnSound = "";
	
	public boolean lockOnToPlanes = false, lockOnToVehicles = false, lockOnToMechas = false, lockOnToPlayers = false, lockOnToLivings = false;
	
	//flares
	public boolean hasFlare = false;
	public int flareDelay = 20 * 10;
	public String flareSound = "";
	public int timeFlareUsing = 1;
	
	// radar (for mapwriter)
	/**
	 * The height of the entity that can be detected by radar.<br> -1 = It does not detect.<br>
	 */
	public int radarDetectableAltitude = -1;
	public boolean stealth = false;
	
	/** Barrel Recoil stuff */
	public float recoilDist = 5F;
	public float recoilTime = 5F;
	
	/** more nonsense */
	public boolean fixedPrimaryFire = false;
	public Vector3f primaryFireAngle = new Vector3f(0, 0, 0);
	
	/** backwards compatibility attempt */
	public float gunLength = 0;
	
	
	public boolean setPlayerInvisible = false;
	
	public float maxThrottleInWater = 0.5F;
	
	public ArrayList<Vector3f> leftTrackPoints = new ArrayList<>();
	public ArrayList<Vector3f> rightTrackPoints = new ArrayList<>();
	public float trackLinkLength = 0;
	
	/** activator boolean for IT-1 reloads */
	public boolean IT1 = false;
	
	public ArrayList<CollisionShapeBox> collisionBox = new ArrayList<>();
	public boolean fancyCollision = false;
	
	
	public static ArrayList<DriveableType> types = new ArrayList<>();
	
	interface ParseFunc
	{
		void Parse(String[] split, DriveableType d);
	}
	
	private static HashMap<String, ParseFunc> parsers = new HashMap<>();
	
	static
	{
		// BASICS /////////////////////////////////////////////////////////////////////////////
		parsers.put("MaxThrottle", (split, d) -> d.maxThrottle = Float.parseFloat(split[1]));
		parsers.put("MaxNegativeThrottle", (split, d) -> d.maxNegativeThrottle = Float.parseFloat(split[1]));
		parsers.put("Drag", (split, d) -> d.drag = Float.parseFloat(split[1]));
		parsers.put("TurretOrigin", (split, d) ->
			d.turretOrigin = new Vector3f(Float.parseFloat(split[1]) / 16F,
				Float.parseFloat(split[2]) / 16F,
				Float.parseFloat(split[3]) / 16F));
		
		parsers.put("TurretRotationSpeed", (split, d) -> d.turretRotationSpeed = Float.parseFloat(split[1]));
		parsers.put("CanRoll", (split, d) -> d.canRoll = Boolean.parseBoolean(split[1]));
		parsers.put("YOffset", (split, d) -> d.yOffset = Float.parseFloat(split[1]));
		parsers.put("CameraDistance", (split, d) -> d.cameraDistance = Float.parseFloat(split[1]));
		
		// BOATS ////////////////////////////////////////////////////////////////////////////
		parsers.put("PlaceableOnLand", (split, d) -> d.placeableOnLand = Boolean.parseBoolean(split[1]));
		parsers.put("PlaceableOnWater", (split, d) -> d.placeableOnWater = Boolean.parseBoolean(split[1]));
		parsers.put("FloatOnWater", (split, d) -> d.floatOnWater = Boolean.parseBoolean(split[1]));
		parsers.put("Boat", (split, d) ->
		{
			d.placeableOnLand = false;
			d.placeableOnWater = true;
			d.floatOnWater = true;
			d.wheelStepHeight = 0F;
		});
		parsers.put("Buoyancy", (split, d) -> d.buoyancy = Float.parseFloat(split[1]));
		
		// WHEELS ////////////////////////////////////////////////////////////////////////////////
		parsers.put("Wheel", (split, d) ->
			d.wheelPositions[Integer.parseInt(split[1])] = new DriveablePosition(new Vector3f(
				Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F, Float.parseFloat(split[4]) / 16F),
				split.length > 5 ? EnumDriveablePart.getPart(split[5]) : EnumDriveablePart.coreWheel));
		parsers.put("WheelPosition", parsers.get("Wheel")); // Alt name
		parsers.put("WheelRadius", (split, d) -> d.wheelStepHeight = Float.parseFloat(split[1]));
		parsers.put("WheelStepHeight", parsers.get("WheelRadius")); // Alt name
		parsers.put("WheelSpringStrength", (split, d) -> d.wheelSpringStrength = Float.parseFloat(split[1]));
		parsers.put("SpringStrength", parsers.get("WheelSpringStrength")); // Alt name
		
		// HARVESTERS //////////////////////////////////////////////////////////////////////////////
		parsers.put("Harvester", (split, d) -> d.harvestBlocks = Boolean.parseBoolean(split[1]));
		parsers.put("HarvestMaterial", (split, d) -> d.materialsHarvested.add(getMaterial(split[1])));
		parsers.put("HarvestToolType", (split, d) ->
		{
			switch(split[1])
			{
				case "Axe":
					d.materialsHarvested.add(Material.WOOD);
					d.materialsHarvested.add(Material.PLANTS);
					d.materialsHarvested.add(Material.VINE);
					break;
				case "Pickaxe":
				case "Drill":
					d.materialsHarvested.add(Material.IRON);
					d.materialsHarvested.add(Material.ANVIL);
					d.materialsHarvested.add(Material.ROCK);
					break;
				case "Spade":
				case "Shovel":
				case "Excavator":
					d.materialsHarvested.add(Material.GROUND);
					d.materialsHarvested.add(Material.GRASS);
					d.materialsHarvested.add(Material.SAND);
					d.materialsHarvested.add(Material.SNOW);
					d.materialsHarvested.add(Material.CLAY);
					break;
				case "Hoe":
				case "Combine":
					d.materialsHarvested.add(Material.PLANTS);
					d.materialsHarvested.add(Material.LEAVES);
					d.materialsHarvested.add(Material.VINE);
					d.materialsHarvested.add(Material.CACTUS);
					d.materialsHarvested.add(Material.GOURD);
					break;
			}
		});
		
		// CARGO ////////////////////////////////////////////////////////////////////////////////////////
		parsers.put("CargoSlots", (split, d) -> d.numCargoSlots = Integer.parseInt(split[1]));
		parsers.put("BombSlots", (split, d) -> d.numBombSlots = Integer.parseInt(split[1]));
		parsers.put("MineSlots", parsers.get("BombSlots")); // Alt name
		parsers.put("MissileSlots", (split, d) -> d.numMissileSlots = Integer.parseInt(split[1]));
		parsers.put("ShellSlots", parsers.get("MissileSlots")); // Alt name
		parsers.put("FuelTankSize", (split, d) -> d.fuelTankSize = Integer.parseInt(split[1]));
		parsers.put("TrackFrames", (split, d) -> d.animFrames = Integer.parseInt(split[1]) - 1);
		parsers.put("BulletDetection", (split, d) -> d.bulletDetectionRadius = Integer.parseInt(split[1]));
		
		// AMMO ////////////////////////////////////////////////////////////////////////////////////////
		parsers.put("AddAmmo", (split, d) -> d.ammo.add(BulletType.getBullet(split[1])));
		parsers.put("AllowAllAmmo", (split, d) -> d.acceptAllAmmo = Boolean.parseBoolean(split[1]));
		parsers.put("AcceptAllAmmo", parsers.get("AllowAllAmmo")); // Alt name
		parsers.put("Primary", (split, d) -> d.primary = EnumWeaponType.valueOf(split[1].toUpperCase()));
		parsers.put("Secondary", (split, d) -> d.secondary = EnumWeaponType.valueOf(split[1].toUpperCase()));
		parsers.put("ShootDelayPrimary", (split, d) -> d.shootDelayPrimary = Integer.parseInt(split[1]));
		parsers.put("ShootDelaySecondary", (split, d) -> d.shootDelaySecondary = Integer.parseInt(split[1]));
		parsers.put("DamageModifierPrimary", (split, d) -> d.damageModifierPrimary = Integer.parseInt(split[1]));
		parsers.put("DamageModifierSecondary", (split, d) -> d.damageModifierSecondary = Integer.parseInt(split[1]));
		parsers.put("AlternatePrimary", (split, d) -> d.alternatePrimary = Boolean.parseBoolean(split[1]));
		parsers.put("AlternateSecondary", (split, d) -> d.alternateSecondary = Boolean.parseBoolean(split[1]));
		parsers.put("ModePrimary", (split, d) -> d.modePrimary = EnumFireMode.valueOf(split[1].toUpperCase()));
		parsers.put("ModeSecondary", (split, d) -> d.modeSecondary = EnumFireMode.valueOf(split[1].toUpperCase()));
		parsers.put("ShootPointPrimary", (split, d) ->
		{
			DriveablePosition rootPos;
			Vector3f offPos;
			String[] gun;
			if(split.length == 9)
			{
				gun = new String[]{split[0], split[1], split[2], split[3], split[4], split[5]};
				offPos = new Vector3f(Float.parseFloat(split[6]) / 16F,
					Float.parseFloat(split[7]) / 16F,
					Float.parseFloat(split[8]) / 16F);
			}
			else if(split.length == 8)
			{
				gun = new String[]{split[0], split[1], split[2], split[3], split[4]};
				offPos = new Vector3f(Float.parseFloat(split[5]) / 16F,
					Float.parseFloat(split[6]) / 16F,
					Float.parseFloat(split[7]) / 16F);
			}
			else
			{
				gun = split;
				offPos = new Vector3f(0, 0, 0);
			}
			rootPos = d.getShootPoint(gun);
			ShootPoint sPoint = new ShootPoint(rootPos, offPos);
			d.shootPointsPrimary.add(sPoint);
			if(rootPos instanceof PilotGun)
				d.pilotGuns.add((PilotGun)sPoint.rootPos);
		});
		parsers.put("ShootPointSecondary", (split, d) ->
		{
			DriveablePosition rootPos;
			Vector3f offPos;
			String[] gun;
			if(split.length == 9)
			{
				gun = new String[]{split[0], split[1], split[2], split[3], split[4], split[5]};
				offPos = new Vector3f(Float.parseFloat(split[6]) / 16F,
					Float.parseFloat(split[7]) / 16F,
					Float.parseFloat(split[8]) / 16F);
			}
			else if(split.length == 8)
			{
				gun = new String[]{split[0], split[1], split[2], split[3], split[4]};
				offPos = new Vector3f(Float.parseFloat(split[5]) / 16F,
					Float.parseFloat(split[6]) / 16F,
					Float.parseFloat(split[7]) / 16F);
			}
			else
			{
				gun = split;
				offPos = new Vector3f(0, 0, 0);
			}
			rootPos = d.getShootPoint(gun);
			ShootPoint sPoint = new ShootPoint(rootPos, offPos);
			d.shootPointsSecondary.add(sPoint);
			if(rootPos instanceof PilotGun)
				d.pilotGuns.add((PilotGun)sPoint.rootPos);
		});
		
		// BACKWARDS COMPATIBILITY ////////////////////////////////////////////////////////////
		parsers.put("AddGun", (split, d) ->
		{
			d.secondary = EnumWeaponType.GUN;
			PilotGun pilotGun = (PilotGun)d.getShootPoint(split);
			d.shootPointsSecondary.add(new ShootPoint(pilotGun, new Vector3f(0, 0, 0)));
			d.pilotGuns.add(pilotGun);
			d.driveableRecipe.add(new ItemStack(pilotGun.type.item));
		});
		parsers.put("BombPosition", (split, d) ->
		{
			d.primary = EnumWeaponType.BOMB;
			DriveablePosition pos = new DriveablePosition(new Vector3f(
				Float.parseFloat(split[1]) / 16F,
				Float.parseFloat(split[2]) / 16F,
				Float.parseFloat(split[3]) / 16F),
				EnumDriveablePart.core);
			d.shootPointsPrimary.add(new ShootPoint(pos, new Vector3f(0, 0, 0)));
		});
		parsers.put("BarrelPosition", (split, d) ->
		{
			d.primary = EnumWeaponType.SHELL;
			DriveablePosition pos = new DriveablePosition(new Vector3f(
				Float.parseFloat(split[1]) / 16F,
				Float.parseFloat(split[2]) / 16F,
				Float.parseFloat(split[3]) / 16F),
				EnumDriveablePart.turret);
			d.shootPointsPrimary.add(new ShootPoint(pos, new Vector3f(0, 0, 0)));
		});
		parsers.put("ShootDelay", (split, d) -> d.shootDelaySecondary = Integer.parseInt(split[1]));
		parsers.put("ShellDelay", (split, d) -> d.shootDelayPrimary = Integer.parseInt(split[1]));
		parsers.put("BombDelay", parsers.get("ShellDelay")); // Alt name
		
		// RECIPE ////////////////////////////////////////////////////////////////////////////////
		parsers.put("AddRecipeParts", (split, d) ->
		{
			EnumDriveablePart part = EnumDriveablePart.getPart(split[1]);
			ItemStack[] stacks = new ItemStack[(split.length - 2) / 2];
			for(int i = 0; i < (split.length - 2) / 2; i++)
			{
				int amount = Integer.parseInt(split[2 * i + 2]);
				boolean damaged = split[2 * i + 3].contains(".");
				String itemName = damaged ? split[2 * i + 3].split("\\.")[0] : split[2 * i + 3];
				int damage = damaged ? Integer.parseInt(split[2 * i + 3].split("\\.")[1]) : 0;
				stacks[i] = getRecipeElement(itemName, amount, damage, d.shortName);
				d.driveableRecipe.add(stacks[i]);
			}
			d.partwiseRecipe.put(part, stacks);
		});
		parsers.put("AddDye", (split, d) ->
		{
			int amount = Integer.parseInt(split[1]);
			int damage = -1;
			for(int i = 0; i < EnumDyeColor.values().length; i++)
			{
				if(EnumDyeColor.byDyeDamage(i).getTranslationKey().equals(split[2]))
					damage = i;
			}
			if(damage == -1)
			{
				FlansMod.log.warn("Failed to find dye colour : " + split[2] + " while adding " + d.shortName);
				return;
			}
			d.driveableRecipe.add(new ItemStack(Items.DYE, amount, damage));
		});
		
		// HEALTH & COLLISION //////////////////////////////////////////////////////
		parsers.put("SetupPart", (split, d) ->
		{
			EnumDriveablePart part = EnumDriveablePart.getPart(split[1]);
			CollisionBox box = new CollisionBox(Integer.parseInt(split[2]),
				Integer.parseInt(split[3]),
				Integer.parseInt(split[4]),
				Integer.parseInt(split[5]),
				Integer.parseInt(split[6]),
				Integer.parseInt(split[7]),
				Integer.parseInt(split[8]));
			d.health.put(part, box);
		});
		parsers.put("CollisionPoint", (split, d) -> d.collisionPoints.add(new DriveablePosition(split)));
		parsers.put("AddCollisionPoint", parsers.get("CollisionPoint")); // Alt name
		
		
		// PASSENGERS /////////////////////////////////////////////////////////////
		parsers.put("Driver", (split, d) ->
		{
			if(split.length > 4)
				d.seats[0] = new Seat(Integer.parseInt(split[1]),
					Integer.parseInt(split[2]),
					Integer.parseInt(split[3]),
					Float.parseFloat(split[4]),
					Float.parseFloat(split[5]),
					Float.parseFloat(split[6]),
					Float.parseFloat(split[7]));
			else
				d.seats[0] = new Seat(Integer.parseInt(split[1]),
					Integer.parseInt(split[2]),
					Integer.parseInt(split[3]));
		});
		parsers.put("Pilot", parsers.get("Driver")); // Alt name
		parsers.put("Passenger", (split, d) ->
		{
			Seat seat = new Seat(split);
			d.seats[seat.id] = seat;
			if(seat.gunType != null)
			{
				seat.gunnerID = d.numPassengerGunners++;
				d.driveableRecipe.add(new ItemStack(seat.gunType.item));
			}
		});
		parsers.put("GunOrigin", (split, d) ->
		{
			if(d.seats[Integer.parseInt(split[1])] == null)
				FlansMod.log.error(
					"GunOrigin line found in vehicle / mecha / plane file before Passenger line [" + d.shortName + "]");
			d.seats[Integer.parseInt(split[1])].gunOrigin = new Vector3f(Float.parseFloat(split[2]) / 16F,
				Float.parseFloat(split[3]) / 16F,
				Float.parseFloat(split[4]) / 16F);
		});
		parsers.put("RotatedDriverOffset", (split, d) ->
			d.seats[0].rotatedOffset = new Vector3f(Integer.parseInt(split[1]) / 16F,
				Integer.parseInt(split[2]) / 16F,
				Integer.parseInt(split[3]) / 16F));
		parsers.put("DriverAimSpeed", (split, d) ->
			d.seats[0].aimingSpeed = new Vector3f(Float.parseFloat(split[1]),
				Float.parseFloat(split[2]),
				Float.parseFloat(split[3])));
		parsers.put("RotatedPassengerOffset", (split, d) ->
			d.seats[Integer.parseInt(split[1])].rotatedOffset = new Vector3f(Integer.parseInt(split[2]) / 16F,
				Integer.parseInt(split[3]) / 16F,
				Integer.parseInt(split[4]) / 16F));
		parsers.put("PassengerAimSpeed", (split, d) ->
			d.seats[Integer.parseInt(split[1])].aimingSpeed = new Vector3f(Float.parseFloat(split[2]),
				Float.parseFloat(split[3]),
				Float.parseFloat(split[4])));
		parsers.put("DriverLegacyAiming", (split, d) -> d.seats[0].legacyAiming = Boolean.parseBoolean(split[1]));
		parsers.put("PassengerLegacyAiming", (split, d) ->
			d.seats[Integer.parseInt(split[1])].legacyAiming = Boolean.parseBoolean(split[2]));
		parsers.put("DriverYawBeforePitch", (split, d) -> d.seats[0].yawBeforePitch = Boolean.parseBoolean(split[1]));
		parsers.put("PassengerYawBeforePitch", (split, d) ->
			d.seats[Integer.parseInt(split[1])].yawBeforePitch = Boolean.parseBoolean(split[2]));
		parsers.put("DriverLatePitch", (split, d) -> d.seats[0].latePitch = Boolean.parseBoolean(split[1]));
		parsers.put("PassengerLatePitch", (split, d) ->
			d.seats[Integer.parseInt(split[1])].latePitch = Boolean.parseBoolean(split[2]));
		
		
		// SOUNDS /////////////////////////////////////////////////////////////////////
		parsers.put("DriverTraverseSounds", (split, d) -> d.seats[0].traverseSounds = Boolean.parseBoolean(split[1]));
		parsers.put("PassengerTraverseSounds", (split, d) ->
			d.seats[Integer.parseInt(split[1])].traverseSounds = Boolean.parseBoolean(split[2]));
		
		parsers.put("StartSoundLength", (split, d) -> d.startSoundLength = Integer.parseInt(split[1]));
		parsers.put("EngineSoundLength", (split, d) -> d.engineSoundLength = Integer.parseInt(split[1]));
		parsers.put("YawSoundLength", (split, d) -> d.seats[0].yawSoundLength = Integer.parseInt(split[1]));
		parsers.put("PitchSoundLength", (split, d) -> d.seats[0].pitchSoundLength = Integer.parseInt(split[1]));
		parsers.put("PassengerYawSoundLength", (split, d) ->
			d.seats[Integer.parseInt(split[1])].yawSoundLength = Integer.parseInt(split[2]));
		parsers.put("PassengerPitchSoundLength",
			(split, d) -> d.seats[Integer.parseInt(split[1])].pitchSoundLength = Integer.parseInt(split[2]));
		parsers.put("StartSound", (split, d) ->
		{
			d.startSound = split[1];
			FlansMod.proxy.loadSound(d.contentPack, "driveables", split[1]);
		});
		parsers.put("EngineSound", (split, d) ->
		{
			d.engineSound = split[1];
			FlansMod.proxy.loadSound(d.contentPack, "driveables", split[1]);
		});
		parsers.put("YawSound", (split, d) ->
		{
			d.seats[0].yawSound = split[1];
			FlansMod.proxy.loadSound(d.contentPack, "driveables", split[1]);
		});
		parsers.put("PitchSound", (split, d) ->
		{
			d.seats[0].pitchSound = split[1];
			FlansMod.proxy.loadSound(d.contentPack, "driveables", split[1]);
		});
		parsers.put("PassengerYawSound", (split, d) ->
		{
			d.seats[Integer.parseInt(split[1])].yawSound = split[2];
			FlansMod.proxy.loadSound(d.contentPack, "driveables", split[1]);
		});
		parsers.put("PassengerPitchSound", (split, d) ->
		{
			d.seats[Integer.parseInt(split[1])].pitchSound = split[2];
			FlansMod.proxy.loadSound(d.contentPack, "driveables", split[1]);
		});
		parsers.put("ShootMainSound", (split, d) ->
		{
			d.shootSoundPrimary = split[1];
			FlansMod.proxy.loadSound(d.contentPack, "driveables", split[1]);
		});
		parsers.put("ShootSoundPrimary", parsers.get("ShootMainSound")); // Alt name
		parsers.put("ShellSound", parsers.get("ShootMainSound")); // Alt name
		parsers.put("BombSound", parsers.get("ShootMainSound")); // Alt name
		parsers.put("ShootSecondarySound", (split, d) ->
		{
			d.shootSoundSecondary = split[1];
			FlansMod.proxy.loadSound(d.contentPack, "driveables", split[1]);
		});
		parsers.put("ShootSoundSecondary", parsers.get("ShootSecondarySound")); // Alt name
		
		// ICBM Mod Integration
		parsers.put("OnRadar", (split, d) ->
			d.onRadar = split[1].equals("True"));
		
		// PARTICLES & GRAPHICS /////////////////////////////////////////////////////////////
		parsers.put("AddParticle", (split, d) ->
		{
			ParticleEmitter emitter = d.new ParticleEmitter();
			emitter.effectType = FlansMod.getParticleType(split[1]);
			emitter.emitRate = Integer.parseInt(split[2]);
			emitter.origin = new Vector3f(split[3], d.shortName);
			emitter.extents = new Vector3f(split[4], d.shortName);
			emitter.velocity = new Vector3f(split[5], d.shortName);
			emitter.minThrottle = Float.parseFloat(split[6]);
			emitter.maxThrottle = Float.parseFloat(split[7]);
			emitter.minHealth = Float.parseFloat(split[8]);
			emitter.maxHealth = Float.parseFloat(split[9]);
			emitter.part = split[10];
			//Scale from model coords to world coords
			emitter.origin.scale(1.0f / 16.0f);
			emitter.extents.scale(1.0f / 16.0f);
			emitter.velocity.scale(1.0f / 16.0f);
			d.emitters.add(emitter);
		});
		parsers.put("Model", (split, d) ->
		{
			if(FMLCommonHandler.instance().getSide().isClient())
				d.model = FlansMod.proxy.loadModel(split[1], d.shortName, ModelDriveable.class);
		});
		
		
		// FM+ TODO
		
		parsers.put("IsExplosionWhenDestroyed", (split, d) ->
			d.isExplosionWhenDestroyed = Boolean.parseBoolean(split[1]));
		parsers.put("VehicleGunModelScale", (split, d) -> d.vehicleGunModelScale = Float.parseFloat(split[1]));
		parsers.put("VehicleGunReloadTick", (split, d) -> d.reloadSoundTick = Integer.parseInt(split[1]));
		parsers.put("FallDamageFactor", (split, d) -> d.fallDamageFactor = Float.parseFloat(split[1]));
		parsers.put("ClutchBrake", (split, d) -> d.ClutchBrake = Float.parseFloat(split[1]));
		parsers.put("MaxThrottleInWater", (split, d) -> d.maxThrottleInWater = Float.parseFloat(split[1]));
		parsers.put("TurretOriginOffset", (split, d) ->
			d.turretOriginOffset = new Vector3f(
				Float.parseFloat(split[1]) / 16F,
				Float.parseFloat(split[2]) / 16F,
				Float.parseFloat(split[3]) / 16F));
		parsers.put("CollisionDamageEnable", (split, d) -> d.collisionDamageEnable = Boolean.parseBoolean(split[1]));
		parsers.put("CollisionDamageThrottle", (split, d) -> d.collisionDamageThrottle = Float.parseFloat(split[1]));
		parsers.put("CollisionDamageTimes", (split, d) -> d.collisionDamageTimes = Float.parseFloat(split[1]));
		parsers.put("CanLockAngle", (split, d) -> d.canLockOnAngle = Integer.parseInt(split[1]));
		parsers.put("LockOnSoundTime", (split, d) -> d.lockOnSoundTime = Integer.parseInt(split[1]));
		parsers.put("LockOnToDriveables", (split, d) ->
			d.lockOnToPlanes = d.lockOnToVehicles = d.lockOnToMechas = Boolean.parseBoolean(split[1].toLowerCase()));
		parsers.put("LockOnToVehicles", (split, d) ->
			d.lockOnToVehicles = Boolean.parseBoolean(split[1].toLowerCase()));
		parsers.put("LockOnToPlanes", (split, d) -> d.lockOnToPlanes = Boolean.parseBoolean(split[1].toLowerCase()));
		parsers.put("LockOnToMechas", (split, d) -> d.lockOnToMechas = Boolean.parseBoolean(split[1].toLowerCase()));
		parsers.put("LockOnToPlayers", (split, d) -> d.lockOnToPlayers = Boolean.parseBoolean(split[1].toLowerCase()));
		parsers.put("LockOnToLivings", (split, d) -> d.lockOnToLivings = Boolean.parseBoolean(split[1].toLowerCase()));
		parsers.put("LockedOnSoundRange", (split, d) -> d.lockedOnSoundRange = Integer.parseInt(split[1]));
		parsers.put("HasFlare", (split, d) -> d.hasFlare = Boolean.parseBoolean(split[1]));
		parsers.put("FlareDelay", (split, d) ->
		{
			d.flareDelay = Integer.parseInt(split[1]);
			if(d.flareDelay <= 0)
				d.flareDelay = 1;
		});
		parsers.put("TimeFlareUsing", (split, d) ->
		{
			d.timeFlareUsing = Integer.parseInt(split[1]);
			if(d.timeFlareUsing <= 0)
				d.timeFlareUsing = 1;
		});
		parsers.put("PlaceableOnSponge", (split, d) -> d.placeableOnSponge = Boolean.parseBoolean(split[1]));
		parsers.put("FloatOffset", (split, d) -> d.floatOffset = Float.parseFloat(split[1]));
		parsers.put("CanMountEntity", (split, d) -> d.canMountEntity = Boolean.parseBoolean(split[1]));
		parsers.put("CollectHarvest", (split, d) -> d.collectHarvest = Boolean.parseBoolean(split[1]));
		parsers.put("DropHarvest", (split, d) -> d.dropHarvest = Boolean.parseBoolean(split[1]));
		parsers.put("HarvestBox", (split, d) ->
		{
			d.harvestBoxSize = new Vector3f(split[1], d.shortName);
			d.harvestBoxPos = new Vector3f(split[2], d.shortName);
		});
		parsers.put("PlaceTimePrimary", (split, d) -> d.placeTimePrimary = Integer.parseInt(split[1]));
		parsers.put("PlaceTimeSecondary", (split, d) -> d.placeTimeSecondary = Integer.parseInt(split[1]));
		parsers.put("ReloadTimePrimary", (split, d) -> d.reloadTimePrimary = Integer.parseInt(split[1]));
		parsers.put("ReloadTimeSecondary", (split, d) -> d.reloadTimeSecondary = Integer.parseInt(split[1]));
		parsers.put("BulletSpeed", (split, d) -> d.bulletSpeed = Float.parseFloat(split[1]));
		parsers.put("BulletSpread", (split, d) -> d.bulletSpread = Float.parseFloat(split[1]));
		parsers.put("RangingGun", (split, d) -> d.rangingGun = Boolean.parseBoolean(split[1]));
		parsers.put("GunLength", (split, d) -> d.gunLength = Float.parseFloat(split[1]));
		parsers.put("RecoilDistance", (split, d) -> d.recoilDist = Float.parseFloat(split[1]));
		parsers.put("RecoilTime", (split, d) -> d.recoilTime = Float.parseFloat(split[1]));
		parsers.put("EnableReloadTime", (split, d) -> d.enableReloadTime = Boolean.parseBoolean(split[1]));
		parsers.put("ShootParticlesPrimary", (split, d) ->
			d.shootParticlesPrimary.add(new ShootParticle(
				split[1],
				Float.valueOf(split[2]),
				Float.valueOf(split[3]),
				Float.valueOf(split[4]))));
		parsers.put("ShootParticlesSecondary", (split, d) ->
			d.shootParticlesSecondary.add(new ShootParticle(
				split[1],
				Float.valueOf(split[2]),
				Float.valueOf(split[3]),
				Float.valueOf(split[4]))));
		parsers.put("SetPlayerInvisible", (split, d) ->
			d.setPlayerInvisible = Boolean.parseBoolean(split[1].toLowerCase()));
		parsers.put("IT1", (split, d) -> d.IT1 = Boolean.parseBoolean(split[1].toLowerCase()));
		parsers.put("FixedPrimary", (split, d) -> d.fixedPrimaryFire = Boolean.parseBoolean(split[1].toLowerCase()));
		parsers.put("PrimaryAngle", (split, d) ->
			d.primaryFireAngle = new Vector3f(Float.parseFloat(split[1]),
				Float.parseFloat(split[2]),
				Float.parseFloat(split[3])));
		parsers.put("PlaceSoundPrimary", (split, d) ->
		{
			d.placeSoundPrimary = split[1];
			FlansMod.proxy.loadSound(d.contentPack, "driveables", split[1]);
		});
		parsers.put("PlaceSoundSecondary", (split, d) ->
		{
			d.placeSoundSecondary = split[1];
			FlansMod.proxy.loadSound(d.contentPack, "driveables", split[1]);
		});
		parsers.put("ReloadSoundPrimary", (split, d) ->
		{
			d.reloadSoundPrimary = split[1];
			FlansMod.proxy.loadSound(d.contentPack, "driveables", split[1]);
		});
		parsers.put("ReloadSoundSecondary", (split, d) ->
		{
			d.reloadSoundSecondary = split[1];
			FlansMod.proxy.loadSound(d.contentPack, "driveables", split[1]);
		});
		parsers.put("LockedOnSound", (split, d) ->
		{
			d.lockedOnSound = split[1];
			FlansMod.proxy.loadSound(d.contentPack, "driveables", split[1]);
		});
		parsers.put("LockingOnSound", (split, d) ->
		{
			d.lockingOnSound = split[1];
			FlansMod.proxy.loadSound(d.contentPack, "guns", split[1]);
		});
		parsers.put("FlareSound", (split, d) ->
		{
			d.flareSound = split[1];
			FlansMod.proxy.loadSound(d.contentPack, "driveables", split[1]);
		});
		parsers.put("FancyCollision", (split, d) ->
			d.fancyCollision = Boolean.parseBoolean(split[1]));
		parsers.put("AddCollisionMesh", (split, d) ->
		{
			CollisionShapeBox box = new CollisionShapeBox(new Vector3f(split[1], d.shortName),
				new Vector3f(split[2], d.shortName),
				new Vector3f(split[3], d.shortName),
				new Vector3f(split[4], d.shortName),
				new Vector3f(split[5], d.shortName),
				new Vector3f(split[6], d.shortName),
				new Vector3f(split[7], d.shortName),
				new Vector3f(split[8], d.shortName),
				new Vector3f(split[9], d.shortName),
				new Vector3f(split[10], d.shortName),
				"core");
			d.collisionBox.add(box);
		});
		parsers.put("AddCollisionMeshRaw", (split, d) ->
		{
			Vector3f pos = new Vector3f(Float.parseFloat(split[1]),
				Float.parseFloat(split[2]),
				Float.parseFloat(split[3]));
			Vector3f size = new Vector3f(Float.parseFloat(split[4]),
				Float.parseFloat(split[5]),
				Float.parseFloat(split[6]));
			Vector3f p1 = new Vector3f(Float.parseFloat(split[8]),
				Float.parseFloat(split[9]),
				Float.parseFloat(split[10]));
			Vector3f p2 = new Vector3f(Float.parseFloat(split[11]),
				Float.parseFloat(split[12]),
				Float.parseFloat(split[13]));
			Vector3f p3 = new Vector3f(Float.parseFloat(split[14]),
				Float.parseFloat(split[15]),
				Float.parseFloat(split[16]));
			Vector3f p4 = new Vector3f(Float.parseFloat(split[17]),
				Float.parseFloat(split[18]),
				Float.parseFloat(split[19]));
			Vector3f p5 = new Vector3f(Float.parseFloat(split[20]),
				Float.parseFloat(split[21]),
				Float.parseFloat(split[22]));
			Vector3f p6 = new Vector3f(Float.parseFloat(split[23]),
				Float.parseFloat(split[24]),
				Float.parseFloat(split[25]));
			Vector3f p7 = new Vector3f(Float.parseFloat(split[26]),
				Float.parseFloat(split[27]),
				Float.parseFloat(split[28]));
			Vector3f p8 = new Vector3f(Float.parseFloat(split[29]),
				Float.parseFloat(split[30]),
				Float.parseFloat(split[31]));
			CollisionShapeBox box = new CollisionShapeBox(pos, size, p1, p2, p3, p4, p5, p6, p7, p8, "core");
			d.collisionBox.add(box);
		});
		parsers.put("AddTurretCollisionMesh", (split, d) ->
		{
			CollisionShapeBox box = new CollisionShapeBox(new Vector3f(split[1], d.shortName),
				new Vector3f(split[2], d.shortName),
				new Vector3f(split[3], d.shortName),
				new Vector3f(split[4], d.shortName),
				new Vector3f(split[5], d.shortName),
				new Vector3f(split[6], d.shortName),
				new Vector3f(split[7], d.shortName),
				new Vector3f(split[8], d.shortName),
				new Vector3f(split[9], d.shortName),
				new Vector3f(split[10], d.shortName),
				"core");
			d.collisionBox.add(box);
		});
		parsers.put("AddTurretCollisionMeshRaw", (split, d) ->
		{
			Vector3f pos = new Vector3f(Float.parseFloat(split[1]),
				Float.parseFloat(split[2]),
				Float.parseFloat(split[3]));
			Vector3f size = new Vector3f(Float.parseFloat(split[4]),
				Float.parseFloat(split[5]),
				Float.parseFloat(split[6]));
			Vector3f p1 = new Vector3f(Float.parseFloat(split[8]),
				Float.parseFloat(split[9]),
				Float.parseFloat(split[10]));
			Vector3f p2 = new Vector3f(Float.parseFloat(split[11]),
				Float.parseFloat(split[12]),
				Float.parseFloat(split[13]));
			Vector3f p3 = new Vector3f(Float.parseFloat(split[14]),
				Float.parseFloat(split[15]),
				Float.parseFloat(split[16]));
			Vector3f p4 = new Vector3f(Float.parseFloat(split[17]),
				Float.parseFloat(split[18]),
				Float.parseFloat(split[19]));
			Vector3f p5 = new Vector3f(Float.parseFloat(split[20]),
				Float.parseFloat(split[21]),
				Float.parseFloat(split[22]));
			Vector3f p6 = new Vector3f(Float.parseFloat(split[23]),
				Float.parseFloat(split[24]),
				Float.parseFloat(split[25]));
			Vector3f p7 = new Vector3f(Float.parseFloat(split[26]),
				Float.parseFloat(split[27]),
				Float.parseFloat(split[28]));
			Vector3f p8 = new Vector3f(Float.parseFloat(split[29]),
				Float.parseFloat(split[30]),
				Float.parseFloat(split[31]));
			CollisionShapeBox box = new CollisionShapeBox(pos, size, p1, p2, p3, p4, p5, p6, p7, p8, "turret");
			d.collisionBox.add(box);
		});
		parsers.put("LeftLinkPoint", (split, d) -> d.leftTrackPoints.add(new Vector3f(split[1], d.shortName)));
		parsers.put("RightLinkPoint", (split, d) -> d.rightTrackPoints.add(new Vector3f(split[1], d.shortName)));
		parsers.put("TrackLinkLength", (split, d) -> d.trackLinkLength = Float.parseFloat(split[1]));
		parsers.put("RadarDetectableAltitude", (split, d) -> d.radarDetectableAltitude = Integer.parseInt(split[1]));
		parsers.put("Stealth", (split, d) -> d.stealth = split[1].equals("True"));
		
	}
	
	public DriveableType(TypeFile file)
	{
		super(file);
	}
	
	@Override
	public void preRead(TypeFile file)
	{
		super.preRead(file);
		//Make sure the passenger arrays are set up first
		for(String line : file.getLines())
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
		for(String line : file.getLines())
		{
			if(line == null)
				break;
			if(line.startsWith("//"))
				continue;
			String[] split = line.split(" ");
			if(split.length < 2)
				continue;
			
			if(split[0].equals("NumWheels"))
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
			// Special case for anything that reads multiple lines
			if(FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model"))
				model = FlansMod.proxy.loadModel(split[1], shortName, ModelDriveable.class);
			
			else
			{
				ParseFunc parser = parsers.get(split[0]);
				if(parser == null)
				{
					FlansMod.log.warn("Could not find parser for " + split[0] + " in driveable " + shortName);
				}
				else
				{
					FlansMod.log.info("Found and invoked parser for " + split[0] + " in driveable " + shortName);
					parser.Parse(split, this);
				}
			}
		}
		catch(Exception e)
		{
			FlansMod.log.error("Errored reading " + file.name);
			FlansMod.log.throwing(e);
		}
	}
	
	public abstract EntityDriveable createDriveable(World world, double x, double y, double z, DriveableData data);
	
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
	
	/**
	 * Find the items needed to rebuild a part. The returned array is disconnected from the template items it has looked
	 * up
	 */
	public ArrayList<ItemStack> getItemsRequired(DriveablePart part, PartType engine)
	{
		ArrayList<ItemStack> stacks = new ArrayList<>();
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
			{
				stacks.add(new ItemStack(gun.type.item));
			}
		}
		for(Seat seat : seats)
		{
			if(seat != null && seat.part == part.type && seat.gunType != null)
			{
				stacks.add(new ItemStack(seat.gunType.item));
			}
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
	public void addLoot(LootTableLoadEvent event)
	{
		//Do not add vehicles to dungeon chests. That would be so op.
	}
	
	public class ParticleEmitter
	{
		/**
		 * The name of the effect
		 */
		public EnumParticleTypes effectType;
		/**
		 * The rate of emission
		 */
		public int emitRate;
		/**
		 * The centre of the effect emitter
		 */
		public Vector3f origin;
		/**
		 * The size of the box in which it emits
		 */
		public Vector3f extents;
		/**
		 * The velocity of the particle
		 */
		public Vector3f velocity;
		/**
		 * Lower throttle bound
		 */
		public float minThrottle;
		/**
		 * Upper throttle bound
		 */
		public float maxThrottle;
		/**
		 * Model part the emitter is bound to
		 */
		public String part;
		/**
		 * Minimum health for the emitter to work
		 */
		public float minHealth;
		/**
		 * Maximum health for the emitter to work
		 */
		public float maxHealth;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBase GetModel()
	{
		return model;
	}
	
	@Override
	public float GetRecommendedScale()
	{
		return 100.0f / cameraDistance;
	}
}
