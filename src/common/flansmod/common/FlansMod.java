package flansmod.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.Block;
import net.minecraft.src.EntityRenderer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.PlayerAPI;
import net.minecraft.src.ScaledResolution;
import net.minecraft.src.Tessellator;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;

@Mod(modid = "Flan_FlansMod", name = "Flan's Mod", version = "2.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class FlansMod implements ITickHandler 
{
	@SidedProxy(clientSide = "flansmod.minecraft.ClientProxy", serverSide = "flansmod.common.CommonProxy")
	public static CommonProxy proxy;
	@Init
	public void load(FMLInitializationEvent event)
	{
		proxy.load();
		log("Loading Flan's mod.");
		TickRegistry.registerTickHandler(this, Side.SERVER);
		PlayerAPI.register("Flan", PlayerBaseFlan.class);
		File flanDir = new File(FMLClientHandler.instance().getClient().getMinecraftDir() + "/Flan/");
		if(!flanDir.exists())
		{
			log("Flan folder not found. Creating empty folder.");
			log("You should get some content packs and put them in the Flan folder.");
			flanDir.mkdir();
			return;
		}
		
		//Properties
		try
		{
			File file = new File(FMLClientHandler.instance().getClient().getMinecraftDir() + "/Flan/properties.txt");
			if(file != null)
			{
				BufferedReader properties = new BufferedReader(new FileReader(file));
				do
				{
					String line = null;
					try
					{
						line = properties.readLine();
					}
					catch(Exception e)
					{
						break;
					}
					if(line == null)
					{
						break;
					}
					if(line.startsWith("//"))
						continue;
					String[] split = line.split(" ");
					if(split.length < 2)
						continue;
					readProperties(split, properties);
				}
				while(true);
				log("Loaded properties.");
			}
			else 
			{
				log("No properties file found. Using defaults.");
				createNewProperties();
			}
		}
		catch(Exception e)
		{
			log("No properties file found. Using defaults.");
			createNewProperties();
		}
		
		
		//Icons, Skins, Models
		//Get the classloader in order to load the images
		ClassLoader classloader = (net.minecraft.client.Minecraft.class).getClassLoader();
		Method method = null;
		try
		{
			method = (java.net.URLClassLoader.class).getDeclaredMethod("addURL", new Class[] { java.net.URL.class });
			method.setAccessible(true);
		}
		catch(Exception e)
		{
			log("Failed to get class loader. All content loading will now fail.");
			e.printStackTrace();
		}
		

		List<File> contentPacks = new ArrayList<File>();
		for(File file : flanDir.listFiles())
		{
			if(file.isDirectory())
			{
				//Add the images to the classpath so they can be loaded
				try
				{
					method.invoke(classloader, new Object[] { file.toURL() } );
					method.invoke(classloader, new Object[] { new File(file, "/models/").toURL() } );
				}
				catch(Exception e)
				{
					log("Failed to load images for content pack : " + file.getName());
					e.printStackTrace();
				}
				//Add the directory to the content pack list
				log("Loaded content pack : " + file.getName());
				contentPacks.add(file);
			}
		}
		log("Loaded textures and models.");
		
		//Gametypes (Server only)
		
		
		//Bullets / Bombs
		for(File file : contentPacks)
		{
			File bulletsDir = new File(file, "/bullets/");
			File[] bullets = bulletsDir.listFiles();
			if(bullets == null)
			{
				logQuietly("No bullet files found.");
			}
			else
			{
				for(int i = 0; i < bullets.length; i++)
				{
					if(bullets[i].isDirectory())
						continue;
					try
					{
						BulletType type = new BulletType(new BufferedReader(new FileReader(bullets[i])));
						Item bulletItem = new ItemBullet(type.itemID - 256, type.iconIndex, type.colour, type).setItemName(type.shortName);
						bulletItems.add(bulletItem);
						LanguageRegistry.addName(bulletItem, type.name);
					}
					catch(Exception e)
					{
						log("Failed to add bullet : " + bullets[i].getName());
						e.printStackTrace();
					}
				}
			}
		}
		log("Loaded bullets.");
		
		//Guns
		EntityRegistry.registerGlobalEntityID(EntityMG.class, "MG", EntityRegistry.findGlobalUniqueEntityId());
		for(File file : contentPacks)
		{
			File gunsDir = new File(file, "/guns/");
			File[] guns = gunsDir.listFiles();
			if(guns == null)
			{
				logQuietly("No gun files found.");
			}
			else
			{
				for(int i = 0; i < guns.length; i++)
				{
					if(guns[i].isDirectory())
						continue;
					try
					{
						GunType type = new GunType(new BufferedReader(new FileReader(guns[i])), file.getName());
						Item gunItem = new ItemGun(type.itemID - 256, type).setItemName(type.shortName);
						gunItems.add(gunItem);
						LanguageRegistry.addName(gunItem, type.name);
					}
					catch(Exception e)
					{
						log("Failed to add gun : " + guns[i].getName());
						e.printStackTrace();
					}
				}
			}
		}
		log("Loaded guns.");	
		
		//Parts
		for(File file : contentPacks)
		{
			File partsDir = new File(file, "/parts/");
			File[] parts = partsDir.listFiles();
			if(parts == null)
			{
				logQuietly("No part files found.");
			}
			else
			{
				for(int i = 0; i < parts.length; i++)
				{
					if(parts[i].isDirectory())
						continue;
					try
					{
						PartType type = new PartType(new BufferedReader(new FileReader(parts[i])));
						Item partItem = new ItemPart(type.itemID - 256, type).setItemName(type.shortName);
						partItems.add(partItem);
						LanguageRegistry.addName(partItem, type.name);
					}
					catch(Exception e)
					{
						log("Failed to add part : " + parts[i].getName());
						e.printStackTrace();
					}
				}
			}
		}
		log("Loaded parts.");
		
		//Planes
		craftingTable = new BlockPlaneWorkbench(255, 1, 0).setBlockName("flansCraftingBench");
		GameRegistry.registerBlock(craftingTable, ItemBlockManyNames.class);
		LanguageRegistry.addName(new ItemStack(craftingTable, 1, 0), "Small Plane Crafting Table");
		LanguageRegistry.addName(new ItemStack(craftingTable, 1, 1), "Large Plane Crafting Table");
		LanguageRegistry.addName(new ItemStack(craftingTable, 1, 2), "Vehicle Crafting Table");
		GameRegistry.addRecipe(new ItemStack(craftingTable, 1, 0), new Object[] {"BBB", "III", "III", Character.valueOf('B'), Item.bowlEmpty, Character.valueOf('I'), Item.ingotIron });
		GameRegistry.addShapelessRecipe(new ItemStack(craftingTable, 1, 1), craftingTable, craftingTable);
		EntityRegistry.registerGlobalEntityID(EntityPlane.class, "Plane", EntityRegistry.findGlobalUniqueEntityId());
		for(File file : contentPacks)
		{
			File planesDir = new File(file, "/planes/");
			File[] planes = planesDir.listFiles();
			if(planes == null)
			{
				logQuietly("No plane files found.");
			}
			else
			{
				for(int i = 0; i < planes.length; i++)
				{
					if(planes[i].isDirectory())
						continue;
					try
					{
						PlaneType type = new PlaneType(new BufferedReader(new FileReader(planes[i])), file.getName());
						Item planeItem = new ItemPlane(type.itemID - 256, type).setItemName(type.shortName);
						planeItems.add(planeItem);
						LanguageRegistry.addName(planeItem, type.name);
					}
					catch(Exception e)
					{
						log("Failed to add plane : " + planes[i].getName());
						e.printStackTrace();
					}
				}
			}
		}
		log("Loaded planes.");
		
		//AAGuns
		EntityRegistry.registerGlobalEntityID(EntityAAGun.class, "AAGun", EntityRegistry.findGlobalUniqueEntityId());
		for(File file : contentPacks)
		{
			File aaGunsDir = new File(file, "/aaguns/");
			File[] aaGuns = aaGunsDir.listFiles();
			if(aaGuns == null)
			{
				logQuietly("No aa gun files found.");
			}
			else
			{
				for(int i = 0; i < aaGuns.length; i++)
				{
					if(aaGuns[i].isDirectory())
						continue;
					try
					{
						AAGunType type = new AAGunType(new BufferedReader(new FileReader(aaGuns[i])), file.getName());
						Item aaGunItem = new ItemAAGun(type.itemID - 256, type).setItemName(type.shortName);
						aaGunItems.add(aaGunItem);
						LanguageRegistry.addName(aaGunItem, type.name);
					}
					catch(Exception e)
					{
						log("Failed to add AA gun : " + aaGuns[i].getName());
						e.printStackTrace();
					}
				}
			}
		}
		log("Loaded AA guns.");	
		
		//Vehicles
		EntityRegistry.registerGlobalEntityID(EntityVehicle.class, "Vehicle", EntityRegistry.findGlobalUniqueEntityId());
		GameRegistry.addRecipe(new ItemStack(craftingTable, 1, 2), new Object[] {"BB", "II", "II", Character.valueOf('B'), Item.bowlEmpty, Character.valueOf('I'), Item.ingotIron });

		for(File file : contentPacks)
		{
			File vehiclesDir = new File(file, "/vehicles/");
			File[] vehicles = vehiclesDir.listFiles();
			if(vehicles == null)
			{
				logQuietly("No vehicle files found.");
			}
			else
			{
				for(int i = 0; i < vehicles.length; i++)
				{
					if(vehicles[i].isDirectory())
						continue;
					try
					{
						VehicleType type = new VehicleType(new BufferedReader(new FileReader(vehicles[i])), file.getName());
						Item vehicleItem = new ItemVehicle(type.itemID - 256, type).setItemName(type.shortName);
						vehicleItems.add(vehicleItem);
						LanguageRegistry.addName(vehicleItem, type.name);
					}
					catch(Exception e)
					{
						log("Failed to add vehicle : " + vehicles[i].getName());
						e.printStackTrace();
					}
				}
			}
		}
		log("Loaded vehicles.");	
		
		//Gun Boxes
		for(File file : contentPacks)
		{
			File boxesDir = new File(file, "/boxes/");
			File[] gunBoxes = boxesDir.listFiles();
			if(gunBoxes == null)
			{
				logQuietly("No gun box files found.");
			}
			else
			{
				for(int i = 0; i < gunBoxes.length; i++)
				{
					if(gunBoxes[i].isDirectory())
						continue;
					try
					{
						GunBoxType type = new GunBoxType(new BufferedReader(new FileReader(gunBoxes[i])));
						Block boxBlock = new BlockGunBox(type.blockID, type).setBlockName(type.shortName);
						gunBoxBlocks.add(boxBlock);
						LanguageRegistry.addName(boxBlock, type.name);
						GameRegistry.registerBlock(boxBlock);
						type.item = Item.itemsList[type.blockID];
					}
					catch(Exception e)
					{
						log("Failed to add gun box : " + gunBoxes[i].getName());
						e.printStackTrace();
					}
				}
			}
		}
		log("Loaded gun boxes.");		
		
		//Recipes
		for(TypeType type : TypeType.types)
		{
			type.addRecipe();
		}
		log("Loaded recipes.");
	}
	
	public void renderTick(Minecraft minecraft)
	{
		//Client side only
	}
		
	public void clientTick(Minecraft minecraft)
	{
		//Client side only
	}
	
	public void serverTick(MinecraftServer minecraft)
	{
	}
	
	public static void setControlMode(int i)
	{
		//Client side only
	}
		
	public static void log(String s)
	{
		System.out.println("Flan's Mod : " + s);
	}
	
	public static void logQuietly(String s)
	{
	}
	
	public static void logLoudly(String s)
	{
		System.out.println("SERIOUS PROBLEM!");
		System.out.println("Flan's Mod : " + s);
	}
		
	public static void buyGun(BlockGunBox box, int gun)
	{
		//Client side only
	}
	
	public static void buyAmmo(BlockGunBox box, int ammo)
	{
		//Client side only
	}	
	
	public void readProperties(String[] split, BufferedReader file)
	{
		try 
		{
			if(split[0].equals("Explosions"))
				explosions = split[1].equals("True");
			if(split[0].equals("Bombs"))
				bombsEnabled = split[1].equals("True");
			if(split[0].equals("Bullets"))
				bulletsEnabled = split[1].equals("True");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private void createNewProperties()
	{
		try
		{
			FileOutputStream propsOut = new FileOutputStream(new File(FMLClientHandler.instance().getClient().getMinecraftDir() + "/Flan/properties.txt"));
			propsOut.write(("Explosions True\r\nBombs True\r\nBullets True").getBytes());
			propsOut.close();
		}
		catch(Exception e)
		{
			log("Failed to write default properties");
			e.printStackTrace();
		}
	}
		
	private static final boolean DEBUG = false;
	public static List<Item> bulletItems = new ArrayList<Item>();
	public static List<Item> partItems = new ArrayList<Item>();
	public static List<Item> planeItems = new ArrayList<Item>();
	public static List<Item> vehicleItems = new ArrayList<Item>();
	public static List<Block> gunBoxBlocks = new ArrayList<Block>();
	public static List<Item> gunItems = new ArrayList<Item>();
	public static List<Item> aaGunItems = new ArrayList<Item>();
	public static boolean inMCP = false;
	private static boolean ABORT = false;
	public static int shootTime;
	public static String zoomOverlay;
	public static float playerRecoil;
	public static float antiRecoil;
	public static float playerZoom = 1.0F;
	public static float newZoom = 1.0F;
	public static float lastPlayerZoom;
	private static long lastTime;
	public static PlayerAPI papi;
	//Player changeable stuff
	public static int accelerateKey = Keyboard.KEY_W;
	public static int decelerateKey = Keyboard.KEY_S;
	public static int leftKey = Keyboard.KEY_A;
	public static int rightKey = Keyboard.KEY_D;
	public static int upKey = Keyboard.KEY_SPACE;
	public static int downKey = Keyboard.KEY_LSHIFT;
	public static int exitKey = Keyboard.KEY_E;
	public static int inventoryKey = Keyboard.KEY_R;
	public static int bombKey = Keyboard.KEY_V;
	public static int gunKey = Keyboard.KEY_LCONTROL;
	public static int controlSwitchKey = Keyboard.KEY_C;
	public static boolean explosions = true;
	public static boolean bombsEnabled = true;
	public static boolean bulletsEnabled = true;
	
	public static Block craftingTable;
	public static List<PlaneType> blueprintsUnlocked = new ArrayList<PlaneType>();
	public static List<VehicleType> vehicleBlueprintsUnlocked = new ArrayList<VehicleType>();
	public static int controlMode = 0; //0 = Standard controls, 1 = Mouse controls
	public static int controlModeSwitchTimer = 20;
	public static boolean doneTutorial = false;
	private static float lastRoll = 0.0F;
	private static boolean playerInPlane = false;
	public static boolean chaseCam = false;
	public static float originalMouseSensitivity = 0.5F;
	public static boolean originalHideGUI = false;
	private static String errorString = "";
	private static int errorStringTimer = 0;
	
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) 
	{
        if(type.equals(EnumSet.of(TickType.RENDER)))
        {
            renderTick(FMLClientHandler.instance().getClient());
        }        
        if(type.equals(EnumSet.of(TickType.CLIENT)))
        {
            clientTick(FMLClientHandler.instance().getClient());
        }
        if(type.equals(EnumSet.of(TickType.SERVER)))
        {
            serverTick(FMLClientHandler.instance().getServer());
        }
	}

	@Override
	public EnumSet<TickType> ticks() 
	{
		return EnumSet.of(TickType.CLIENT, TickType.SERVER, TickType.RENDER);
	}

	@Override
	public String getLabel() 
	{
		return null;
	}

}

