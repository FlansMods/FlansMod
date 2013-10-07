package co.uk.flansmods.common.driveables;

import java.util.HashMap;
import java.util.ArrayList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;

import co.uk.flansmods.client.model.ModelDriveable;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.InfoType;
import co.uk.flansmods.common.PartType;
import co.uk.flansmods.common.TypeFile;
import co.uk.flansmods.common.vector.Vector3f;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DriveableType extends InfoType
{
	@SideOnly(value = Side.CLIENT)
	/** The plane model */
	public ModelDriveable model;
		
	/** Points for calculating collision. Each one is tied to a part of the driveable */
	public ArrayList<CollisionPoint> points = new ArrayList<CollisionPoint>();

	/** Health of each driveable part */
	public HashMap<EnumDriveablePart, CollisionBox> health = new HashMap<EnumDriveablePart, CollisionBox>();
	/** Recipe parts associated to each driveable part */
	public HashMap<EnumDriveablePart, ItemStack[]> partwiseRecipe = new HashMap<EnumDriveablePart, ItemStack[]>();
	/** Recipe parts as one complete list */
	public ArrayList<ItemStack> recipe = new ArrayList<ItemStack>();
	
	/** The number of passengers, not including the pilot */
	public int numPassengers = 0;	
	/** Seat objects for holding information about the position and gun setup of each seat */
	public Seat[] seats;
	/** Automatic counter used to setup ammo inventory for gunners */
	public int numPassengerGunners = 0;
	/** Automatic counter used to setup ammo inventory for pilot guns */
	public int nextGunID = 0;
	/** Inventory sizes */
	public int numCargoSlots, numBombSlots;
	/** The fuel tank size */
	public int fuelTankSize = 100;
	/** The guns controlled by the driver */
	public ArrayList<PilotGun> guns = new ArrayList<PilotGun>();
	
	/** The offset of the driver from their point of rotation. Used in tank turrets where the player is in a rotating turret, but on one side of the gun */
	public Vector3f rotatedDriverOffset = new Vector3f();
	
	/** The yOffset of the model. Shouldn't be needed if you made your model properly */
	public float yOffset = 10F / 16F;
	/** Third person render distance */
	public float cameraDistance = 5F;
	
	/** Generic movement modifiers, no longer repeated for plane and vehicle */
	public float maxThrottle = 1F, maxNegativeThrottle = 0F;
	
	/** Mass in tons */
	public float mass = 1F;
	/** Coefficient of drag */
	public float drag = 1F;
	/** Moment of inertia in metre tons or whatnot */
	public float momentOfInertia = 1F;
	/** Couldn't decide on the best value for this constant, so now it is variable. 
	 * This scales the push-out-of-blocks force exerted on driveables */
	public float bounciness = 0.4F;
	
	/** The radius within which to check for bullets */
	public float bulletDetectionRadius = 5F;

	/** Plane is shown on ICBM Radar and engaged by AA Guns */
    public boolean onRadar = false;

	
	/** Sounds */
	//TODO : Overhaul sounds
	public String startSound;
	public int startSoundLength;
	public String engineSound;
	public int engineSoundLength;
	public String shootMainSound;
	public String shootSecondarySound;
	
	public static ArrayList<DriveableType> types = new ArrayList<DriveableType>();
	
    public DriveableType(TypeFile file)
    {
		super(file);
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
			}
		}
		types.add(this);
    }
	
    @Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if(FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model"))
				model = FlansMod.proxy.loadModel(split[1], shortName, ModelDriveable.class);
			
			if(split[0].equals("Texture"))
			{
				texture = split[1];
			}
			
			//Movement Variables
			if(split[0].equals("MaxThrottle"))
				maxThrottle = Float.parseFloat(split[1]);
			if(split[0].equals("MaxNegativeThrottle"))
				maxNegativeThrottle = Float.parseFloat(split[1]);
			if(split[0].equals("Mass"))
				mass = Float.parseFloat(split[1]);
			if(split[0].equals("MomentOfInertia"))
				momentOfInertia = Float.parseFloat(split[1]);
			if(split[0].equals("Drag"))
				drag = Float.parseFloat(split[1]);
			if(split[0].equals("Bounciness"))
				bounciness = Float.parseFloat(split[1]);
			
			//Cargo / Payload
			if(split[0].equals("CargoSlots"))
				numCargoSlots = Integer.parseInt(split[1]);
			if(split[0].equals("BombSlots") || split[0].equals("ShellSlots"))
				numBombSlots = Integer.parseInt(split[1]);
			if(split[0].equals("FuelTankSize"))
				fuelTankSize = Integer.parseInt(split[1]);
			
			if(split[0].equals("BulletDetection"))
				bulletDetectionRadius = Integer.parseInt(split[1]);

			//Recipe
			if(split[0].equals("AddRecipeParts"))
			{
				EnumDriveablePart part = EnumDriveablePart.getPart(split[1]);
				ItemStack[] stacks = new ItemStack[(split.length - 2) / 2];
				for(int i = 0; i < (split.length - 2) / 2; i++)
				{
					int amount = Integer.parseInt(split[2 * i + 2]);
					boolean damaged = split[2 * i + 3].contains(".");
					String itemName = damaged ? split[2 * i + 3].split("\\.")[0] : split[2 * i + 3];
					int damage = damaged ? Integer.parseInt(split[2 * i + 3].split("\\.")[1]) : 0;
					stacks[i] = getRecipeElement(itemName, amount, damage);
					recipe.add(stacks[i]);
				}
				partwiseRecipe.put(part, stacks);
			}
			
			//Dyes
			if(split[0].equals("AddDye"))
			{
				int amount = Integer.parseInt(split[1]);
				int damage = -1;
				for(int i = 0; i < ItemDye.dyeColorNames.length; i++)
				{
					if(ItemDye.dyeColorNames[i].equals(split[2]))
						damage = i;
				}
				if(damage == -1)
				{
					FlansMod.log("Failed to find dye colour : " + split[2] + " while adding " + file.name);
					return;
				}
				recipe.add(new ItemStack(Item.dyePowder, amount, damage));
			}
			
			
			//Health
			if(split[0].equals("SetupPart"))
			{
				EnumDriveablePart part = EnumDriveablePart.getPart(split[1]);
				CollisionBox box = new CollisionBox(Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]), Integer.parseInt(split[7]), Integer.parseInt(split[8]));
				health.put(part, box);
				for(int i = 0; i < 2; i++)
					for(int j = 0; j < 2; j++)
						for(int k = 0; k < 2; k++)
							points.add(new CollisionPoint(box.x + i * box.w, box.y + j * box.h, box.z + k * box.d, part.getShortName(), 1.0F));
			}
			
			//Driver Position
			if(split[0].equals("Driver") || split[0].equals("Pilot"))
			{
				if(split.length > 4)
					seats[0] = new Seat(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Float.parseFloat(split[4]), Float.parseFloat(split[5]), Float.parseFloat(split[6]), Float.parseFloat(split[7]));
				else seats[0] = new Seat(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
			}
			
			if(split[0].equals("RotatedDriverOffset"))
			{
				rotatedDriverOffset = new Vector3f(Integer.parseInt(split[1]) / 16F, Integer.parseInt(split[2]) / 16F, Integer.parseInt(split[3]) / 16F);
			}
			
			//Passengers / Gunner Seats
			if(split[0].equals("Passenger"))
			{
				Seat seat = new Seat(split);
				seats[seat.id] = seat;
				if(seat.gunType != null)
				{
					seat.gunnerID = numPassengerGunners++;
					recipe.add(new ItemStack(seat.gunType.item));
				}
			}
			
			//Driver guns
			if(split[0].equals("AddGun"))
			{
				PilotGun gun = new PilotGun(split);
				guns.add(gun);
				gun.gunID = nextGunID++;
				recipe.add(new ItemStack(gun.type.item));
			}
			
			//Y offset for badly built models :P
			if(split[0].equals("YOffset"))
				yOffset = Float.parseFloat(split[1]);
            //Third person camera distance
			if(split[0].equals("CameraDistance"))
				cameraDistance = Float.parseFloat(split[1]);
			
			//Sound
			if(split[0].equals("StartSoundLength"))
				startSoundLength = Integer.parseInt(split[1]);
			if(split[0].equals("EngineSoundLength"))
				engineSoundLength = Integer.parseInt(split[1]);
			if(split[0].equals("StartSound"))
			{
				startSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			if(split[0].equals("EngineSound"))
			{
				engineSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			if(split[0].equals("ShootMainSound"))
			{
				shootMainSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			if(split[0].equals("ShootSecondarySound"))
			{
				shootSecondarySound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			// ICBM Mod Radar
            if(split[0].equals("OnRadar"))
                onRadar = split[1].equals("True");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
    
    public int numEngines()
    {
    	return 1;
    }
    
    public int ammoSlots()
    {
    	return numPassengerGunners + guns.size();
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
    	for(PilotGun gun : guns)
    	{
    		if(gun.driveablePart == part.type)
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
}