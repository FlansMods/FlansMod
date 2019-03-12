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
	/**
	 * Health of each driveable part
	 */
	public HashMap<EnumDriveablePart, CollisionBox> health = new HashMap<>();
	/**
	 * Recipe parts associated to each driveable part
	 */
	public HashMap<EnumDriveablePart, ItemStack[]> partwiseRecipe = new HashMap<>();
	/**
	 * Recipe parts as one complete list
	 */
	public ArrayList<ItemStack> driveableRecipe = new ArrayList<>();
	
	//Ammo
	/**
	 * If true, then all ammo is accepted. Default is true to minimise backwards compatibility issues
	 */
	public boolean acceptAllAmmo = true;
	/**
	 * The list of bullet types that can be used in this driveable for the main gun (tank shells, plane bombs etc)
	 */
	public List<BulletType> ammo = new ArrayList<>();
	
	//Harvesting variables
	/**
	 * If true, then this vehicle harvests blocks from the harvester hitbox and places them in the inventory
	 */
	public boolean harvestBlocks = false;
	/**
	 * What materials this harvester eats
	 */
	public ArrayList<Material> materialsHarvested = new ArrayList<>();
	
	
	//Weapon variables
	/**
	 * The weapon type assigned to left mouse
	 */
	public EnumWeaponType primary = EnumWeaponType.NONE, secondary = EnumWeaponType.NONE;
	/**
	 * Whether to alternate weapons or fire all at once
	 */
	public boolean alternatePrimary = false, alternateSecondary = false;
	/**
	 * Delays. Can override gun delays
	 */
	public int shootDelayPrimary = 1, shootDelaySecondary = 1;
	/**
	 * Firing modes for primary and secondary guns. Minigun also an option
	 */
	public EnumFireMode modePrimary = EnumFireMode.FULLAUTO, modeSecondary = EnumFireMode.FULLAUTO;
	/**
	 * Damage modifiers, so that different vehicles firing the same weapons can do different damage
	 */
	public int damageModifierPrimary = 1, damageModifierSecondary = 1;
	/**
	 * Sounds
	 */
	public String shootSoundPrimary, shootSoundSecondary;
	/**
	 * Positions of primary and secondary weapons
	 */
	public ArrayList<DriveablePosition> shootPointsPrimary = new ArrayList<>(), shootPointsSecondary = new ArrayList<>();
	/**
	 * Pilot guns also have their own seperate array so ammo handling can be done
	 */
	public ArrayList<PilotGun> pilotGuns = new ArrayList<>();
	
	//Passengers
	/**
	 * The number of passengers, not including the pilot
	 */
	public int numPassengers = 0;
	/**
	 * Seat objects for holding information about the position and gun setup of each seat
	 */
	public Seat[] seats;
	/**
	 * Automatic counter used to setup ammo inventory for gunners
	 */
	public int numPassengerGunners = 0;
	
	//Inventory + Pilot guns
	/**
	 * Inventory sizes
	 */
	public int numCargoSlots, numBombSlots, numMissileSlots;
	/**
	 * The fuel tank size
	 */
	public int fuelTankSize = 100;
	
	//Rendering variables
	/**
	 * The yOffset of the model. Shouldn't be needed if you made your model properly
	 */
	public float yOffset = 10F / 16F;
	/**
	 * Third person render distance
	 */
	public float cameraDistance = 5F;
	/**
	 * A list of ambient particle emitters on this vehicle
	 */
	public ArrayList<ParticleEmitter> emitters = new ArrayList<>();
	
	//Movement variables
	/**
	 * Generic movement modifiers, no longer repeated for plane and vehicle
	 */
	public float maxThrottle = 1F, maxNegativeThrottle = 0F;
	/**
	 * The origin of the tank turret
	 */
	public Vector3f turretOrigin = new Vector3f();
	
	/**
	 * Wheel positions
	 */
	public DriveablePosition[] wheelPositions = new DriveablePosition[0];
	/**
	 * Strength of springs connecting car to wheels
	 */
	public float wheelSpringStrength = 0.5F;
	/**
	 * The wheel radius for onGround checks
	 */
	public float wheelStepHeight = 1.0F;
	/**
	 * Whether or not the vehicle rolls
	 */
	public boolean canRoll = false;
	/** */
	public float turretRotationSpeed = 2.5F;
	
	
	/**
	 * Collision points for block based collisions
	 */
	public ArrayList<DriveablePosition> collisionPoints = new ArrayList<>();
	
	/**
	 * Coefficient of drag
	 */
	public float drag = 1F;
	
	//Boat Stuff
	/**
	 * If true, then the vehicles wheels float on water
	 */
	public boolean floatOnWater = false;
	/**
	 * Defines where you can place this vehicle
	 */
	public boolean placeableOnLand = true, placeableOnWater = false;
	/**
	 * The upwards force to apply to the vehicle per wheel when on water
	 */
	public float buoyancy = 0.0165F;
	
	/**
	 * The radius within which to check for bullets
	 */
	public float bulletDetectionRadius = 5F;
	
	/**
	 * Plane is shown on ICBM Radar and engaged by AA Guns
	 */
	public boolean onRadar = false;
	
	/**
	 * Sounds
	 */
	//TODO : Overhaul sounds
	public String startSound;
	public int startSoundLength;
	public String engineSound;
	public int engineSoundLength;
	
	/**
	 * Track animation frames
	 */
	public int animFrames = 0;
	
	
	public static ArrayList<DriveableType> types = new ArrayList<>();
	
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
			if(FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model"))
				model = FlansMod.proxy.loadModel(split[1], shortName, ModelDriveable.class);
				
				//Movement Variables
			else if(split[0].equals("MaxThrottle"))
				maxThrottle = Float.parseFloat(split[1]);
			else if(split[0].equals("MaxNegativeThrottle"))
				maxNegativeThrottle = Float.parseFloat(split[1]);
			else if(split[0].equals("Drag"))
				drag = Float.parseFloat(split[1]);
			else if(split[0].equals("TurretOrigin"))
				turretOrigin = new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F);
			else if(split[0].equals("CollisionPoint") || split[0].equals("AddCollisionPoint"))
				collisionPoints.add(new DriveablePosition(split));
			if(split[0].equals("TurretRotationSpeed"))
				turretRotationSpeed = Float.parseFloat(split[1]);
			else if(split[0].equals("CanRoll"))
				canRoll = Boolean.parseBoolean(split[1]);
				//Boats
			else if(split[0].equals("PlaceableOnLand"))
				placeableOnLand = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("PlaceableOnWater"))
				placeableOnWater = Boolean.parseBoolean(split[1]);
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
				
				//Wheels
			else if(split[0].equals("Wheel") || split[0].equals("WheelPosition"))
			{
				wheelPositions[Integer.parseInt(split[1])] = new DriveablePosition(new Vector3f(Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F, Float.parseFloat(split[4]) / 16F), split.length > 5 ? EnumDriveablePart.getPart(split[5]) : EnumDriveablePart.coreWheel);
			}
			else if(split[0].equals("WheelRadius") || split[0].equals("WheelStepHeight"))
				wheelStepHeight = Float.parseFloat(split[1]);
			else if(split[0].equals("WheelSpringStrength") || split[0].equals("SpringStrength"))
				wheelSpringStrength = Float.parseFloat(split[1]);
				
				//Harvesting
			else if(split[0].equals("Harvester"))
				harvestBlocks = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("HarvestMaterial"))
			{
				materialsHarvested.add(getMaterial(split[1]));
			}
			else if(split[0].equals("HarvestToolType"))
			{
				if(split[1].equals("Axe"))
				{
					materialsHarvested.add(Material.WOOD);
					materialsHarvested.add(Material.PLANTS);
					materialsHarvested.add(Material.VINE);
				}
				else if(split[1].equals("Pickaxe") || split[1].equals("Drill"))
				{
					materialsHarvested.add(Material.IRON);
					materialsHarvested.add(Material.ANVIL);
					materialsHarvested.add(Material.ROCK);
				}
				else if(split[1].equals("Spade") || split[1].equals("Shovel") || split[1].equals("Excavator"))
				{
					materialsHarvested.add(Material.GROUND);
					materialsHarvested.add(Material.GRASS);
					materialsHarvested.add(Material.SAND);
					materialsHarvested.add(Material.SNOW);
					materialsHarvested.add(Material.CLAY);
				}
				else if(split[1].equals("Hoe") || split[1].equals("Combine"))
				{
					materialsHarvested.add(Material.PLANTS);
					materialsHarvested.add(Material.LEAVES);
					materialsHarvested.add(Material.VINE);
					materialsHarvested.add(Material.CACTUS);
					materialsHarvested.add(Material.GOURD);
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
			else if(split[0].equals("TrackFrames"))
				animFrames = Integer.parseInt(split[1]) - 1;
			
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
			else if(split[0].equals("DamageModifierPrimary"))
				damageModifierPrimary = Integer.parseInt(split[1]);
			else if(split[0].equals("DamageModifierSecondary"))
				damageModifierSecondary = Integer.parseInt(split[1]);
			else if(split[0].equals("AlternatePrimary"))
				alternatePrimary = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("AlternateSecondary"))
				alternateSecondary = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("ModePrimary"))
				modePrimary = EnumFireMode.valueOf(split[1].toUpperCase());
			else if(split[0].equals("ModeSecondary"))
				modeSecondary = EnumFireMode.valueOf(split[1].toUpperCase());
			else if(split[0].equals("ShootPointPrimary"))
			{
				DriveablePosition shootPoint = getShootPoint(split);
				shootPointsPrimary.add(shootPoint);
				if(shootPoint instanceof PilotGun)
					pilotGuns.add((PilotGun)shootPoint);
			}
			else if(split[0].equals("ShootPointSecondary"))
			{
				DriveablePosition shootPoint = getShootPoint(split);
				shootPointsSecondary.add(shootPoint);
				if(shootPoint instanceof PilotGun)
					pilotGuns.add((PilotGun)shootPoint);
			}
			
			
			//Backwards compatibility stuff
			else if(split[0].equals("AddGun"))
			{
				secondary = EnumWeaponType.GUN;
				PilotGun pilotGun = (PilotGun)getShootPoint(split);
				shootPointsSecondary.add(pilotGun);
				pilotGuns.add(pilotGun);
				driveableRecipe.add(new ItemStack(pilotGun.type.item));
			}
			else if(split[0].equals("BombPosition"))
			{
				primary = EnumWeaponType.BOMB;
				shootPointsPrimary.add(new DriveablePosition(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F), EnumDriveablePart.core));
			}
			else if(split[0].equals("BarrelPosition"))
			{
				primary = EnumWeaponType.SHELL;
				shootPointsPrimary.add(new DriveablePosition(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F), EnumDriveablePart.turret));
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
				for(int i = 0; i < EnumDyeColor.values().length; i++)
				{
					if(EnumDyeColor.byDyeDamage(i).getTranslationKey().equals(split[2]))
						damage = i;
				}
				if(damage == -1)
				{
					FlansMod.log.warn("Failed to find dye colour : " + split[2] + " while adding " + file.name);
					return;
				}
				driveableRecipe.add(new ItemStack(Items.DYE, amount, damage));
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
				else
					seats[0] = new Seat(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
			}
			
			else if(split[0].equals("RotatedDriverOffset"))
			{
				seats[0].rotatedOffset = new Vector3f(Integer.parseInt(split[1]) / 16F, Integer.parseInt(split[2]) / 16F, Integer.parseInt(split[3]) / 16F);
			}
			else if(split[0].equals("DriverAimSpeed"))
			{
				seats[0].aimingSpeed = new Vector3f(Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3]));
			}
			else if(split[0].equals("RotatedPassengerOffset"))
			{
				seats[Integer.parseInt(split[1])].rotatedOffset = new Vector3f(Integer.parseInt(split[2]) / 16F, Integer.parseInt(split[3]) / 16F, Integer.parseInt(split[4]) / 16F);
			}
			else if(split[0].equals("PassengerAimSpeed"))
			{
				seats[Integer.parseInt(split[1])].aimingSpeed = new Vector3f(Float.parseFloat(split[2]), Float.parseFloat(split[3]), Float.parseFloat(split[4]));
			}
			else if(split[0].equals("DriverLegacyAiming"))
			{
				seats[0].legacyAiming = Boolean.parseBoolean(split[1]);
			}
			else if(split[0].equals("PassengerLegacyAiming"))
			{
				seats[Integer.parseInt(split[1])].legacyAiming = Boolean.parseBoolean(split[2]);
			}
			else if(split[0].equals("DriverYawBeforePitch"))
			{
				seats[0].yawBeforePitch = Boolean.parseBoolean(split[1]);
			}
			else if(split[0].equals("PassengerYawBeforePitch"))
			{
				seats[Integer.parseInt(split[1])].yawBeforePitch = Boolean.parseBoolean(split[2]);
			}
			else if(split[0].equals("DriverLatePitch"))
			{
				seats[0].latePitch = Boolean.parseBoolean(split[1]);
			}
			else if(split[0].equals("PassengerLatePitch"))
			{
				seats[Integer.parseInt(split[1])].latePitch = Boolean.parseBoolean(split[2]);
			}
			else if(split[0].equals("DriverTraverseSounds"))
			{
				seats[0].traverseSounds = Boolean.parseBoolean(split[1]);
			}
			else if(split[0].equals("PassengerTraverseSounds"))
			{
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
			else if(split[0].equals("StartSoundLength"))
				startSoundLength = Integer.parseInt(split[1]);
			else if(split[0].equals("EngineSoundLength"))
				engineSoundLength = Integer.parseInt(split[1]);
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
			else if(split[0].equals("ShootSecondarySound") || split[0].equals("ShootSoundSecondary"))
			{
				shootSoundSecondary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			// ICBM Mod Radar
			else if(split[0].equals("OnRadar"))
				onRadar = split[1].equals("True");
			
			else if(split[0].equalsIgnoreCase("AddParticle") || split[0].equalsIgnoreCase("AddEmitter"))
			{
				ParticleEmitter emitter = new ParticleEmitter();
				emitter.effectType = FlansMod.getParticleType(split[1]);
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
	
	public ArrayList<DriveablePosition> shootPoints(boolean s)
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
	 * Find the items needed to rebuild a part. The returned array is disconnected from the template items it has looked up
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
				//if(data.ammo[numPassengerGunners + pilotGuns.indexOf(gun)] != null)
				//	stacks.add(data.ammo[numPassengerGunners + pilotGuns.indexOf(gun)]);
			}
		}
		for(Seat seat : seats)
		{
			if(seat != null && seat.part == part.type && seat.gunType != null)
			{
				stacks.add(new ItemStack(seat.gunType.item));
				//if(data.ammo[seat.id] != null)
				//	stacks.add(data.ammo[seat.id]);
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
