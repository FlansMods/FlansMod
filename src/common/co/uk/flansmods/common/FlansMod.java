package co.uk.flansmods.common;

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

import co.uk.flansmods.common.network.PacketBuyWeapon;
import co.uk.flansmods.common.teams.ArmourType;
import co.uk.flansmods.common.teams.CommandTeams;
import co.uk.flansmods.common.teams.EntityFlag;
import co.uk.flansmods.common.teams.EntityFlagpole;
import co.uk.flansmods.common.teams.ItemFlagpole;
import co.uk.flansmods.common.teams.ItemOpStick;
import co.uk.flansmods.common.teams.ItemTeamArmour;
import co.uk.flansmods.common.teams.PlayerClass;
import co.uk.flansmods.common.teams.Team;
import co.uk.flansmods.common.teams.TeamsManager;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.ServerStarted;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkMod.NULL;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.*;
import net.minecraftforge.*;

@Mod(modid = "FlansMod", name = "Flan's Mod", version = "2.0")
@NetworkMod(
		clientSideRequired = true,
		serverSideRequired = true,
		channels = {"flansmods"},
	    versionBounds = "[2.0,]",
	    clientPacketHandlerSpec = @SidedPacketHandler(channels = {"flansmods"}, packetHandler = co.uk.flansmods.client.network.FlanPacketClient.class ),
	    serverPacketHandlerSpec = @SidedPacketHandler(channels = {"flansmods"}, packetHandler = co.uk.flansmods.common.network.FlanPacketCommon.class )
		)
public class FlansMod
{
	@SidedProxy(clientSide = "co.uk.flansmods.client.ClientProxy", serverSide = "co.uk.flansmods.common.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance("FlansMod")
	public static FlansMod instance;
	
	public static TeamsManager teamsManager;

	public static final boolean DEBUG = false;
	public static List<Item> bulletItems = new ArrayList<Item>();
	public static List<Item> partItems = new ArrayList<Item>();
	
	// TODO remove
	public static List<Block> gunBoxBlocks = new ArrayList<Block>();
	
	public static List<Item> gunItems = new ArrayList<Item>();
	public static List<Item> aaGunItems = new ArrayList<Item>();
	public static List<Item> armourItems = new ArrayList<Item>();
	public static boolean inMCP = false;
	public static boolean ABORT = false;
	public static int shootTime;
	public static String zoomOverlay;
	public static float playerRecoil;
	public static float antiRecoil;
	public static float playerZoom = 1.0F;
	public static float newZoom = 1.0F;
	public static float lastPlayerZoom;
	public static long lastTime;
	
	// Player changeable stuff
	// TODO: move keys to client side only
	// TODO: create key handlers and register keys.
	public static boolean explosions = true;
	public static boolean bombsEnabled = true;
	public static boolean bulletsEnabled = true;

	public static Block craftingTable;
	public static Item opStick;
	public static Item flag;

	public static float originalMouseSensitivity = 0.5F;
	public static boolean originalHideGUI = false;
	public static String errorString = "";
	public static int errorStringTimer = 0;
	public static FlansModPlayerHandler playerHandler;
	public static List<PlaneType> blueprintsUnlocked = new ArrayList<PlaneType>();
	public static List<Item> planeItems = new ArrayList<Item>();
	public static List<VehicleType> vehicleBlueprintsUnlocked = new ArrayList<VehicleType>();

	//GunBoxBlock
	public static BlockGunBox gunBoxBlock;
	
	public static File flanDir;
	public static File propertyFile;
	
	@PreInit
	public void load(FMLPreInitializationEvent event)
	{
		log("Preinitializing Flan's mod.");
		
		flanDir = new File(event.getModConfigurationDirectory().getParentFile(), "/Flan/");
	
		if (!flanDir.exists())
		{
			log("Flan folder not found. Creating empty folder.");
			log("You should get some content packs and put them in the Flan folder.");
			flanDir.mkdirs();
			flanDir.mkdir();
			//return;
		}
		
		// Properties
		try
		{
			propertyFile = new File(flanDir, "properties.txt");
			if (propertyFile.exists())
			{
				BufferedReader properties = new BufferedReader(new FileReader(propertyFile));
				do
				{
					String line = null;
					try
					{
						line = properties.readLine();
					} catch (Exception e)
					{
						break;
					}
					if (line == null)
					{
						break;
					}
					if (line.startsWith("//"))
						continue;
					String[] split = line.split(" ");
					if (split.length < 2)
						continue;
					readProperties(split, properties);
				} while (true);
				log("Loaded properties.");
			} else
			{
				log("No properties file found. Using defaults.");
				createNewProperties();
			}
		} catch (Exception e)
		{
			log("No properties file found. Using defaults.");
			createNewProperties();
		}
		
		playerHandler = new FlansModPlayerHandler();
		teamsManager = new TeamsManager();
		
		try
		{
			Class.forName("net.minecraft.src.World");
		}
		catch(Exception e)
		{
			inMCP = true;
		}
		
		log("Preinitializing complete.");
	}
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		log("Loading Flan's mod.");
		
		// Tick handlers
		TickRegistry.registerTickHandler(new ServerTickHandler(), event.getSide());
		proxy.doTickStuff();
		
		// default stuff
		EntityRegistry.registerGlobalEntityID(EntityMG.class, "MG", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityMG.class, "MG", 91, this, 40, 5, true);
		
		// default planes stuff
		craftingTable = new BlockPlaneWorkbench(255, 1, 0).setBlockName("flansCraftingBench");
		GameRegistry.registerBlock(craftingTable, ItemBlockManyNames.class);
		LanguageRegistry.addName(new ItemStack(craftingTable, 1, 0), "Small Plane Crafting Table");
		LanguageRegistry.addName(new ItemStack(craftingTable, 1, 1), "Large Plane Crafting Table");
		LanguageRegistry.addName(new ItemStack(craftingTable, 1, 2), "Vehicle Crafting Table");
		GameRegistry.addRecipe(new ItemStack(craftingTable, 1, 0), new Object[]
		{ "BBB", "III", "III", Character.valueOf('B'), Item.bowlEmpty, Character.valueOf('I'), Item.ingotIron });
		GameRegistry.addShapelessRecipe(new ItemStack(craftingTable, 1, 1), craftingTable, craftingTable);
		EntityRegistry.registerGlobalEntityID(EntityPlane.class, "Plane", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityPlane.class, "Plane", 90, this, 40, 5, true);
		
		// default aa guns stuff
		EntityRegistry.registerGlobalEntityID(EntityAAGun.class, "AAGun", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityAAGun.class, "AAGun", 92, this, 40, 5, true);
		
		// gunBxStuff.. must be done after content packs.
		// GunBox Block       ID=???  200 is temporary one
		gunBoxBlock = (BlockGunBox) new BlockGunBox(200);
		GameRegistry.registerBlock(gunBoxBlock, ItemGunBox.class);
		GameRegistry.registerTileEntity(TileEntityGunBox.class, "GunBoxTE");
		for (int i = 0; i < GunBoxType.shortNameList.size(); i++)
		{
			GunBoxType type = GunBoxType.gunBoxMap.get(GunBoxType.shortNameList.get(i));
			LanguageRegistry.addName(new ItemStack(gunBoxBlock, 1, i), type.name);
		}
		
		// GUI handler		
		NetworkRegistry.instance().registerGuiHandler(this, new CommonGuiHandler());
		
		// Default teams stuff
		opStick = new ItemOpStick(23540);
		LanguageRegistry.addName(new ItemStack(opStick, 1, 0), "Stick of Ownership");
		LanguageRegistry.addName(new ItemStack(opStick, 1, 1), "Stick of Connecting");
		LanguageRegistry.addName(new ItemStack(opStick, 1, 2), "Stick of Mapping");
		LanguageRegistry.addName(new ItemStack(opStick, 1, 3), "Stick of Destruction");
		EntityRegistry.registerGlobalEntityID(EntityFlagpole.class, "Flagpole", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityFlagpole.class, "Flagpole", 93, this, 40, 5, true);
		EntityRegistry.registerGlobalEntityID(EntityFlag.class, "Flag", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityFlag.class, "Flag", 94, this, 40, 5, true);
		flag = new ItemFlagpole(23541).setIconIndex(6).setItemName("flagpole");
		LanguageRegistry.addName(flag, "Flag");
		
		proxy.loadDefaultGraphics();
		
		// read Content Packs
		readContentPacks(event);
		
		// names registry.
		for (int i = 0; i < GunBoxType.shortNameList.size(); i++)
		{
			GunBoxType type = GunBoxType.gunBoxMap.get(GunBoxType.shortNameList.get(i));
			LanguageRegistry.addName(new ItemStack(gunBoxBlock, 1, i), type.name);
		}
		
		proxy.load();
		
		proxy.loadKeyBindings();

		
		log("Loading complete.");
	}
		
	@ServerStarted
	public void registerCommand(FMLServerStartedEvent e)
	{
		CommandHandler handler = ((CommandHandler)FMLCommonHandler.instance().getSidedDelegate().getServer().getCommandManager());
		handler.registerCommand(new CommandTeams());
	}
	
	/**
	 * reads and loads the content packs.
	 */
	private void readContentPacks(FMLInitializationEvent event)
	{
		// Icons, Skins, Models
		// Get the classloader in order to load the images
		ClassLoader classloader = (net.minecraft.client.Minecraft.class).getClassLoader();
		Method method = null;
		try
		{
			method = (java.net.URLClassLoader.class).getDeclaredMethod("addURL", new Class[]
			{ java.net.URL.class });
			method.setAccessible(true);
		} catch (Exception e)
		{
			log("Failed to get class loader. All content loading will now fail.");
			e.printStackTrace();
		}

		List<File> contentPacks = proxy.getContentList(method, classloader);

		if (!event.getSide().equals(Side.CLIENT))
		{
			//Gametypes (Server only)
			// TODO: gameTypes
		}

		// Bullets / Bombs
		for (File file : contentPacks)
		{
			File bulletsDir = new File(file, "/bullets/");
			File[] bullets = bulletsDir.listFiles();
			if (bullets == null)
			{
				logQuietly("No bullet files found.");
			} else
			{
				for (int i = 0; i < bullets.length; i++)
				{
					if (bullets[i].isDirectory())
						continue;
					try
					{
						BulletType type = new BulletType(new BufferedReader(new FileReader(bullets[i])));
						Item bulletItem = new ItemBullet(type.itemID - 256, type.iconIndex, type.colour, type).setItemName(type.shortName);
						bulletItems.add(bulletItem);
						LanguageRegistry.addName(bulletItem, type.name);
					} catch (Exception e)
					{
						log("Failed to add bullet : " + bullets[i].getName());
						e.printStackTrace();
					}
				}
			}
		}
		log("Loaded bullets.");

		// Guns
		for (File file : contentPacks)
		{
			File gunsDir = new File(file, "/guns/");
			File[] guns = gunsDir.listFiles();
			if (guns == null)
			{
				logQuietly("No gun files found.");
			} else
			{
				for (int i = 0; i < guns.length; i++)
				{
					if (guns[i].isDirectory())
						continue;
					try
					{
						// TO BE MADE BETTER
						GunType type = new GunType(new BufferedReader(new FileReader(guns[i])), file.getName());
						Item gunItem = new ItemGun(type.itemID - 256, type).setItemName(type.shortName);
						gunItems.add(gunItem);
						LanguageRegistry.addName(gunItem, type.name);
					} catch (Exception e)
					{
						log("Failed to add gun : " + guns[i].getName());
						e.printStackTrace();
					}
				}
			}
		}
		log("Loaded guns.");

		// Parts
		for (File file : contentPacks)
		{
			File partsDir = new File(file, "/parts/");
			File[] parts = partsDir.listFiles();
			if (parts == null)
			{
				logQuietly("No part files found.");
			} else
			{
				for (int i = 0; i < parts.length; i++)
				{
					if (parts[i].isDirectory())
						continue;
					try
					{
						PartType type = new PartType(new BufferedReader(new FileReader(parts[i])));
						Item partItem = new ItemPart(type.itemID - 256, type).setItemName(type.shortName);
						partItems.add(partItem);
						LanguageRegistry.addName(partItem, type.name);
					} catch (Exception e)
					{
						log("Failed to add part : " + parts[i].getName());
						e.printStackTrace();
					}
				}
			}
		}
		log("Loaded parts.");

		// Planes
		for (File file : contentPacks)
		{
			File planesDir = new File(file, "/planes/");
			File[] planes = planesDir.listFiles();
			if (planes == null)
			{
				logQuietly("No plane files found.");
			} else
			{
				for (int i = 0; i < planes.length; i++)
				{
					if (planes[i].isDirectory())
						continue;
					try
					{
						PlaneType type = new PlaneType(new BufferedReader(new FileReader(planes[i])), file.getName());
						Item planeItem = new ItemPlane(type.itemID - 256, type).setItemName(type.shortName);
						planeItems.add(planeItem);
						LanguageRegistry.addName(planeItem, type.name);
					} catch (Exception e)
					{
						log("Failed to add plane : " + planes[i].getName());
						e.printStackTrace();
					}
				}
			}
		}
		log("Loaded planes.");

		// AAGuns
		for (File file : contentPacks)
		{
			File aaGunsDir = new File(file, "/aaguns/");
			File[] aaGuns = aaGunsDir.listFiles();
			if (aaGuns == null)
			{
				logQuietly("No aa gun files found.");
			} else
			{
				for (int i = 0; i < aaGuns.length; i++)
				{
					if (aaGuns[i].isDirectory())
						continue;
					try
					{
						AAGunType type = new AAGunType(new BufferedReader(new FileReader(aaGuns[i])), file.getName());
						Item aaGunItem = new ItemAAGun(type.itemID - 256, type).setItemName(type.shortName);
						aaGunItems.add(aaGunItem);
						LanguageRegistry.addName(aaGunItem, type.name);
					} catch (Exception e)
					{
						log("Failed to add AA gun : " + aaGuns[i].getName());
						e.printStackTrace();
					}
				}
			}
		}
		log("Loaded AA guns.");

		// Gun Boxes
		for (File file : contentPacks)
		{
			File boxesDir = new File(file, "/boxes/");
			File[] gunBoxes = boxesDir.listFiles();
			if (gunBoxes == null)
			{
				logQuietly("No gun box files found.");
			} else
			{
				for (int i = 0; i < gunBoxes.length; i++)
				{
					if (gunBoxes[i].isDirectory())
						continue;
					try
					{
						GunBoxType type = new GunBoxType(new BufferedReader(new FileReader(gunBoxes[i])));
						type.item = Item.itemsList[gunBoxBlock.blockID];
						type.itemID = gunBoxBlock.blockID;
					} catch (Exception e)
					{
						log("Failed to add gun box : " + gunBoxes[i].getName());
						e.printStackTrace();
					}
				}
			}
		}
		log("Loaded gun boxes.");
		
		//Armour
		for (File file : contentPacks)
		{
			//Directory is armorFiles because armor is already the set directory for armour skins
			File armourDir = new File(file, "/armorFiles/");
			File[] armours = armourDir.listFiles();
			if (armours == null)
			{
				logQuietly("No team files found.");
			} else
			{
				for (int i = 0; i < armours.length; i++)
				{
					if (armours[i].isDirectory())
						continue;
					try
					{
						ArmourType type = new ArmourType(new BufferedReader(new FileReader(armours[i])), file.getName());
						Item armourItem = new ItemTeamArmour(type).setItemName(type.shortName);
						armourItems.add(armourItem);
						LanguageRegistry.addName(armourItem, type.name);
					} catch (Exception e)
					{
						log("Failed to add armour : " + armours[i].getName());
						e.printStackTrace();
					}
				}
			}
		}
		log("Loaded armour.");
		
		//Classes
		for(File file : contentPacks)
		{
			File classesDir = new File(file, "/classes/");
			File[] classes = classesDir.listFiles();
			if (classes == null)
			{
				logQuietly("No player class files found.");
			} else
			{
				for (int i = 0; i < classes.length; i++)
				{
					if (classes[i].isDirectory())
						continue;
					try
					{
						PlayerClass playerClass = new PlayerClass(new BufferedReader(new FileReader(classes[i])), file.getName());
					} catch (Exception e)
					{
						log("Failed to add player class : " + classes[i].getName());
						e.printStackTrace();
					}
				}
			}
		}
		log("Loaded player classes.");	
		
		//Teams
		for (File file : contentPacks)
		{
			File teamsDir = new File(file, "/teams/");
			File[] teams = teamsDir.listFiles();
			if (teams == null)
			{
				logQuietly("No team files found.");
			} else
			{
				for (int i = 0; i < teams.length; i++)
				{
					if (teams[i].isDirectory())
						continue;
					try
					{
						Team team = new Team(new BufferedReader(new FileReader(teams[i])), file.getName());
					} catch (Exception e)
					{
						log("Failed to add team : " + teams[i].getName());
						e.printStackTrace();
					}
				}
			}
		}
		log("Loaded teams.");
		
		// Recipes
		for (InfoType type : InfoType.infoTypes)
		{
			type.addRecipe();
		}
		log("Loaded recipes.");
		
		// LOAD GRAPHICS
		proxy.loadContentPackGraphics(method, classloader);
	}

	public String getLabel()
	{
		return null;
	}
	
	public static void setControlMode(int i)
	{
		// Client side only
	}

	public static void logQuietly(String s)
	{
	}

	public static void logLoudly(String s)
	{
		errorString = s;
		errorStringTimer = 100;
		System.out.println("SERIOUS PROBLEM!");
		log(s);
	}

	public static void buyGun(GunBoxType type, int gun)
	{
		PacketBuyWeapon.buildBuyWeaponPacket(type, gun, 0);
	}

	public static void buyAmmo(GunBoxType box, int ammo, int type)
	{
		PacketBuyWeapon.buildBuyWeaponPacket(box, type, ammo);
	}

	/** read properties */
	private void readProperties(String[] split, BufferedReader file)
	{
		// TODO: use forge Configuration class
		try
		{
			if (split[0].equals("Explosions"))
				explosions = split[1].equals("True");
			if (split[0].equals("Bombs"))
				bombsEnabled = split[1].equals("True");
			if (split[0].equals("Bullets"))
				bulletsEnabled = split[1].equals("True");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/** creating new properties */
	private void createNewProperties()
	{
		// TODO: use forge configuration class
		try
		{
			FileOutputStream propsOut = new FileOutputStream(propertyFile);
			propsOut.write(("Explosions True\r\nBombs True\r\nBullets True").getBytes());
			propsOut.close();
		} catch (Exception e)
		{
			log("Failed to write default properties");
			e.printStackTrace();
		}
	}

	/** Logger. */
	public static void log(Object arg0)
	{
		// TODO: get a propper logger class/instance
		System.out.println("Flan's Mod : " + arg0);
	}
}
