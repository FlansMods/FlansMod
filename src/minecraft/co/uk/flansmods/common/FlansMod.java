package co.uk.flansmods.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.command.CommandHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.MinecraftForge;
import co.uk.flansmods.common.driveables.DriveableType;
import co.uk.flansmods.common.driveables.EntityPlane;
import co.uk.flansmods.common.driveables.EntitySeat;
import co.uk.flansmods.common.driveables.EntityVehicle;
import co.uk.flansmods.common.driveables.PlaneType;
import co.uk.flansmods.common.driveables.VehicleType;
import co.uk.flansmods.common.guns.AAGunType;
import co.uk.flansmods.common.guns.BulletType;
import co.uk.flansmods.common.guns.EntityAAGun;
import co.uk.flansmods.common.guns.EntityBullet;
import co.uk.flansmods.common.guns.EntityGrenade;
import co.uk.flansmods.common.guns.EntityMG;
import co.uk.flansmods.common.guns.GrenadeType;
import co.uk.flansmods.common.guns.GunType;
import co.uk.flansmods.common.guns.ItemAAGun;
import co.uk.flansmods.common.guns.ItemGrenade;
import co.uk.flansmods.common.guns.ItemGun;
import co.uk.flansmods.common.network.FlansModContentPackVerifier;
import co.uk.flansmods.common.network.PacketBuyWeapon;
import co.uk.flansmods.common.teams.ArmourType;
import co.uk.flansmods.common.teams.BlockSpawner;
import co.uk.flansmods.common.teams.ChunkLoadingHandler;
import co.uk.flansmods.common.teams.CommandTeams;
import co.uk.flansmods.common.teams.EntityFlag;
import co.uk.flansmods.common.teams.EntityFlagpole;
import co.uk.flansmods.common.teams.EntityGunItem;
import co.uk.flansmods.common.teams.EntityTeamItem;
import co.uk.flansmods.common.teams.ItemFlagpole;
import co.uk.flansmods.common.teams.ItemOpStick;
import co.uk.flansmods.common.teams.ItemTeamArmour;
import co.uk.flansmods.common.teams.PlayerClass;
import co.uk.flansmods.common.teams.Team;
import co.uk.flansmods.common.teams.TeamsManager;
import co.uk.flansmods.common.teams.TileEntitySpawner;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.ServerStarted;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.common.registry.EntityRegistry.EntityRegistration;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = "FlansMod", name = "Flan's Mod", version = "3.0.2")
@NetworkMod(
		clientSideRequired = true,
		serverSideRequired = false,
		channels = {"flansmods"},
	    versionBounds = "[3.0,3.1)",
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
	
	public static FlansHooks hooks = new FlansHooks();
	
	public static Configuration configuration;
	
	public static int craftingTableID = 255, spawnerID = 254, gunBoxID = 200;
	
	public static CreativeTabFlan tabFlanGuns = new CreativeTabFlan(0);
	public static CreativeTabFlan tabFlanDriveables = new CreativeTabFlan(1);
	public static CreativeTabFlan tabFlanParts = new CreativeTabFlan(2);
	public static CreativeTabFlan tabFlanTeams = new CreativeTabFlan(3);

	public static boolean DEBUG = false;
	public static ArrayList<Item> bulletItems = new ArrayList<Item>(), partItems = new ArrayList<Item>(),
				toolItems = new ArrayList<Item>(), gunItems = new ArrayList<Item>(), aaGunItems = new ArrayList<Item>(), 
				grenadeItems = new ArrayList<Item>(), armourItems = new ArrayList<Item>();
	public static boolean inMCP = false;
	public static boolean ABORT = false;

	public static long lastTime;
	
	// Player changeable stuff
	public static boolean useRotation = false;
	public static boolean explosions = true;
	public static boolean driveablesBreakBlocks = true;
	public static boolean bombsEnabled = true;
	public static boolean bulletsEnabled = true;
	public static boolean forceAdventureMode = true;
	public static boolean canBreakGuns = true;
	public static boolean canBreakGlass = true;
	public static boolean armourDrops = true;
	public static int weaponDrops = 1; //0 = no drops, 1 = drops, 2 = smart drops
	public static boolean vehiclesNeedFuel = true;
	public static int mgLife = 0; //How long MGs stay around for. Anything 0 or less means they do not dissapear at all.
	public static int planeLife = 0; //How long planes stay around for. Anything 0 or less means they do not dissapear at all.
	public static int vehicleLife = 0; //How long vehicles stay around for. Anything 0 or less means they do not dissapear at all.
	public static int aaLife = 0; //How long AA Guns stay around for. Anything 0 or less means they do not dissapear at all.

	public static Block craftingTable;
	public static Block spawner;
	public static Item opStick;
	public static Item flag;

	public static int ticker; //General use ticker

	public static String errorString = "";
	public static int errorStringTimer = 0;
	public static FlansModPlayerHandler playerHandler;
	public static List<Item> planeItems = new ArrayList<Item>();
	public static List<Item> vehicleItems = new ArrayList<Item>();
		
	//GunBoxBlock
	public static BlockGunBox gunBoxBlock;
	
	public static File flanDir;
	
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event)
	{
		log("Preinitializing Flan's mod.");
		
		configuration = new Configuration(event.getSuggestedConfigurationFile());
		
		loadProperties();
		
		flanDir = new File(event.getModConfigurationDirectory().getParentFile(), "/Flan/");
	
		if (!flanDir.exists())
		{
			log("Flan folder not found. Creating empty folder.");
			log("You should get some content packs and put them in the Flan folder.");
			flanDir.mkdirs();
			flanDir.mkdir();
			//return;
		}
		
		playerHandler = new FlansModPlayerHandler();
		teamsManager = new TeamsManager();
		
		try
		{
			Class.forName("net.minecraft.src.ModLoader");
		}
		catch(Exception e)
		{
			inMCP = true;
		}
		
		log("Preinitializing complete.");
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		log("Loading Flan's mod.");
				
		//Tick handlers
		TickRegistry.registerTickHandler(new ServerTickHandler(), event.getSide());
		proxy.doTickStuff();
		
		//Creative tabs
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabFlan0", "Flan's Mod Guns");
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabFlan1", "Flan's Mod Vehicles");
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabFlan2", "Flan's Mod Parts");
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabFlan3", "Flan's Mod Team Stuff");
		
		//TODO : Content pack handler
		NetworkRegistry.instance().registerConnectionHandler(new FlansModContentPackVerifier());
				
		//Register driveable crafting table and add recipes
		craftingTable = new BlockPlaneWorkbench(craftingTableID, 1, 0).setUnlocalizedName("flansCraftingBench");
		GameRegistry.registerBlock(craftingTable, ItemBlockManyNames.class, "planeCraftingTable");
		LanguageRegistry.addName(new ItemStack(craftingTable, 1, 0), "Vehicle Crafting Table");
		LanguageRegistry.addName(new ItemStack(craftingTable, 1, 1), "Vehicle Crafting Table");
		LanguageRegistry.addName(new ItemStack(craftingTable, 1, 2), "Vehicle Crafting Table");
		GameRegistry.addRecipe(new ItemStack(craftingTable, 1, 0), new Object[]
		{ "BBB", "III", "III", Character.valueOf('B'), Item.bowlEmpty, Character.valueOf('I'), Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(craftingTable, 1, 2), new Object[] {"BB", "II", "II", Character.valueOf('B'), Item.bowlEmpty, Character.valueOf('I'), Item.ingotIron });
		GameRegistry.addShapelessRecipe(new ItemStack(craftingTable, 1, 1), craftingTable, craftingTable);
		
		//Register driveables
		EntityRegistry.registerGlobalEntityID(EntityPlane.class, "Plane", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityPlane.class, "Plane", 90, this, 250, 20, false);
		EntityRegistry.registerGlobalEntityID(EntityVehicle.class, "Vehicle", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityVehicle.class, "Vehicle", 95, this, 250, 20, false);
		EntityRegistry.registerGlobalEntityID(EntitySeat.class, "Seat", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntitySeat.class, "Seat", 99, this, 250, 20, false);
		EntityRegistry.registerGlobalEntityID(EntityParachute.class, "Parachute", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityParachute.class, "Parachute", 101, this, 40, 20, false);
		
		//Register bullets and grenades
		//EntityRegistry.registerGlobalEntityID(EntityBullet.class, "Bullet", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityBullet.class, "Bullet", 96, this, 40, 100, true);
		EntityRegistry.registerGlobalEntityID(EntityGrenade.class, "Grenade", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityGrenade.class, "Grenade", 100, this, 40, 100, true);

		
		//Register MGs and AA guns
		EntityRegistry.registerGlobalEntityID(EntityMG.class, "MG", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityMG.class, "MG", 91, this, 40, 5, true);
		EntityRegistry.registerGlobalEntityID(EntityAAGun.class, "AAGun", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityAAGun.class, "AAGun", 92, this, 40, 500, false);
		
		// GunBox block 
		gunBoxBlock = (BlockGunBox) new BlockGunBox(gunBoxID);
		GameRegistry.registerBlock(gunBoxBlock, ItemGunBox.class, "gunBox");
		GameRegistry.registerTileEntity(TileEntityGunBox.class, "GunBoxTE");

		// GUI handler		
		NetworkRegistry.instance().registerGuiHandler(this, new CommonGuiHandler());
		
		//Teams stuff
		opStick = new ItemOpStick(23540);
		LanguageRegistry.addName(new ItemStack(opStick, 1, 0), "Stick of Ownership");
		LanguageRegistry.addName(new ItemStack(opStick, 1, 1), "Stick of Connecting");
		LanguageRegistry.addName(new ItemStack(opStick, 1, 2), "Stick of Mapping");
		LanguageRegistry.addName(new ItemStack(opStick, 1, 3), "Stick of Destruction");
		LanguageRegistry.addName(new ItemStack(opStick, 1, 4), "Stick of Redness");
		LanguageRegistry.addName(new ItemStack(opStick, 1, 5), "Stick of Blueness");
		EntityRegistry.registerGlobalEntityID(EntityFlagpole.class, "Flagpole", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityFlagpole.class, "Flagpole", 93, this, 40, 5, true);
		EntityRegistry.registerGlobalEntityID(EntityFlag.class, "Flag", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityFlag.class, "Flag", 94, this, 40, 5, true);
		flag = new ItemFlagpole(23541).setUnlocalizedName("flagpole");
		LanguageRegistry.addName(flag, "Flag");
		spawner = new BlockSpawner(spawnerID, Material.iron).setUnlocalizedName("teamsSpawner").setBlockUnbreakable().setResistance(1000000F);
		GameRegistry.registerBlock(spawner, ItemBlockManyNames.class, "teamSpawner");
		LanguageRegistry.addName(new ItemStack(spawner, 1, 0), "Item Spawner");
		LanguageRegistry.addName(new ItemStack(spawner, 1, 1), "Player Spawner");
		LanguageRegistry.addName(new ItemStack(spawner, 1, 2), "Vehicle Spawner");
		GameRegistry.registerTileEntity(TileEntitySpawner.class, "TeamsSpawner");
		
		EntityRegistry.registerGlobalEntityID(EntityTeamItem.class, "TeamsItem", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityTeamItem.class, "TeamsItem", 97, this, 100, 10000, true);
		EntityRegistry.registerGlobalEntityID(EntityGunItem.class, "GunItem", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityGunItem.class, "GunItem", 98, this, 100, 20, true);
		
		//Register the chunk loader
		ForgeChunkManager.setForcedChunkLoadingCallback(this, new ChunkLoadingHandler());
		
		proxy.registerTileEntityRenderers();
		proxy.loadDefaultGraphics();
		
		//Read content packs
		readContentPacks(event);
		
		//Add gun box names
		for(GunBoxType type : GunBoxType.gunBoxMap.values())
			LanguageRegistry.addName(new ItemStack(gunBoxBlock, 1, type.gunBoxID), type.name);
			
		//Do proxy loading
		proxy.load();
		proxy.loadKeyBindings();
		
		log("Loading complete.");
	}
		
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		hooks.hook();
		System.out.println("[Flan] Hooking complete.");
	}
		
	@EventHandler
	public void registerCommand(FMLServerStartedEvent e)
	{
		CommandHandler handler = ((CommandHandler)FMLCommonHandler.instance().getSidedDelegate().getServer().getCommandManager());
		handler.registerCommand(new CommandTeams());
		handler.registerCommand(new CommandBuild());
	}
	
	private void getTypeFiles(List<File> contentPacks)
	{
		for (File contentPack : contentPacks)
		{
			if(contentPack.isDirectory())
			{				
				for(EnumType typeToCheckFor : EnumType.values())
				{
					File typesDir = new File(contentPack, "/" + typeToCheckFor.folderName + "/");
					if(!typesDir.exists())
						continue;
					for(File file : typesDir.listFiles())
					{
						try
						{
							BufferedReader reader = new BufferedReader(new FileReader(file));
							String[] splitName = file.getName().split("/");
							TypeFile typeFile = new TypeFile(typeToCheckFor, splitName[splitName.length - 1].split("\\.")[0]);
							for(;;)
							{
								String line = null;
								try
								{
									line = reader.readLine();
								} 
								catch (Exception e)
								{
									break;
								}
								if (line == null)
									break;
								typeFile.lines.add(line);
							}
							reader.close();
						}
						catch(FileNotFoundException e)
						{
							e.printStackTrace();
						}
						catch(IOException e)
						{
							e.printStackTrace();
						}
					}		
				}
			}
			else
			{
				try
				{
					ZipFile zip = new ZipFile(contentPack);
					ZipInputStream zipStream = new ZipInputStream(new FileInputStream(contentPack));
					BufferedReader reader = new BufferedReader(new InputStreamReader(zipStream));
					ZipEntry zipEntry = zipStream.getNextEntry();
					do
					{
						zipEntry = zipStream.getNextEntry();
						if(zipEntry == null)
							continue;
						TypeFile typeFile = null;
						for(EnumType type : EnumType.values())
						{
							if(zipEntry.getName().startsWith(type.folderName + "/") && zipEntry.getName().split(type.folderName + "/").length > 1 && zipEntry.getName().split(type.folderName + "/")[1].length() > 0)
							{
								String[] splitName = zipEntry.getName().split("/");
								typeFile = new TypeFile(type, splitName[splitName.length - 1].split("\\.")[0]);
							}
						}
						if(typeFile == null)
						{
							continue;
						}
						for(;;)
						{
							String line = null;
							try
							{
								line = reader.readLine();
							} 
							catch (Exception e)
							{
								break;
							}
							if (line == null)
								break;
							typeFile.lines.add(line);
						}
					}
					while(zipEntry != null);
					reader.close();
					zipStream.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
		
	/**
	 * reads and loads the content packs.
	 */
	private void readContentPacks(FMLInitializationEvent event)
	{
		// Icons, Skins, Models
		// Get the classloader in order to load the images
		ClassLoader classloader = (net.minecraft.server.MinecraftServer.class).getClassLoader();
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
			// TODO: gametype loader
		}
		
		getTypeFiles(contentPacks);
		

		// Bullets / Bombs
		for(TypeFile bulletFile : TypeFile.files.get(EnumType.bullet))
		{
			try
			{
				BulletType type = new BulletType(bulletFile);
				type.read(bulletFile);
				Item bulletItem = new ItemBullet(type.itemID - 256, type.colour, type).setUnlocalizedName(type.shortName);
				bulletItems.add(bulletItem);
				LanguageRegistry.addName(bulletItem, type.name);
			} 
			catch (Exception e)
			{
				log("Failed to add bullet : " + bulletFile.name);
				e.printStackTrace();
			}
		}
		log("Loaded bullets.");

		// Guns
		for(TypeFile gunFile : TypeFile.files.get(EnumType.gun))
		{
			try
			{
				GunType type = new GunType(gunFile);
				type.read(gunFile);
				Item gunItem = new ItemGun(type.itemID - 256, type).setUnlocalizedName(type.iconPath);
				gunItems.add(gunItem);
				LanguageRegistry.addName(gunItem, type.name);
			} 
			catch (Exception e)
			{
				log("Failed to add gun : " + gunFile.name);
				e.printStackTrace();
			}
		}
		log("Loaded guns.");
		
		//Grenades
		for(TypeFile grenadeFile : TypeFile.files.get(EnumType.grenade))
		{
			try
			{
				GrenadeType type = new GrenadeType(grenadeFile);
				type.read(grenadeFile);
				Item grenadeItem = new ItemGrenade(type.itemID - 256, type).setUnlocalizedName(type.iconPath);
				grenadeItems.add(grenadeItem);
				LanguageRegistry.addName(grenadeItem, type.name);
			} 
			catch (Exception e)
			{
				log("Failed to add grenade : " + grenadeFile.name);
				e.printStackTrace();
			}
		}
		log("Loaded grenades.");
		
		// Parts
		for(TypeFile partFile : TypeFile.files.get(EnumType.part))
		{
			try
			{
				PartType type = new PartType(partFile);
				type.read(partFile);
				Item partItem = new ItemPart(type.itemID - 256, type).setUnlocalizedName(type.iconPath);
				partItems.add(partItem);
				LanguageRegistry.addName(partItem, type.name);
			} 
			catch (Exception e)
			{
				log("Failed to add part : " + partFile.name);
				e.printStackTrace();
			}
		}
		log("Loaded parts.");		
		
		// Planes
		for(TypeFile planeFile : TypeFile.files.get(EnumType.plane))
		{
			try
			{
				PlaneType type = new PlaneType(planeFile);
				type.read(planeFile);
				Item planeItem = new ItemPlane(type.itemID - 256, type).setUnlocalizedName(type.iconPath);
				planeItems.add(planeItem);
				LanguageRegistry.addName(planeItem, type.name);
			} 
			catch (Exception e)
			{
				log("Failed to add plane : " + planeFile.name);
				e.printStackTrace();
			}
		}
		log("Loaded planes.");		
		
		// Vehicles
		for(TypeFile vehicleFile : TypeFile.files.get(EnumType.vehicle))
		{
			try
			{
				VehicleType type = new VehicleType(vehicleFile);
				type.read(vehicleFile);
				Item vehicleItem = new ItemVehicle(type.itemID - 256, type).setUnlocalizedName(type.iconPath);
				vehicleItems.add(vehicleItem);
				LanguageRegistry.addName(vehicleItem, type.name);
			} 
			catch (Exception e)
			{
				log("Failed to add vehicle : " + vehicleFile.name);
				e.printStackTrace();
			}
		}
		log("Loaded vehicles.");		
		
		// AAGuns
		for(TypeFile aaFile : TypeFile.files.get(EnumType.aa))
		{
			try
			{
				AAGunType type = new AAGunType(aaFile);
				type.read(aaFile);
				Item aaGunItem = new ItemAAGun(type.itemID - 256, type).setUnlocalizedName(type.iconPath);
				aaGunItems.add(aaGunItem);
				LanguageRegistry.addName(aaGunItem, type.name);
			} 
			catch (Exception e)
			{
				log("Failed to add AA gun : " + aaFile.name);
				e.printStackTrace();
			}
		}
		log("Loaded AA guns.");
		
		//Tools
		for(TypeFile toolFile : TypeFile.files.get(EnumType.tool))
		{
			try
			{
				ToolType type = new ToolType(toolFile);
				type.read(toolFile);
				Item toolItem = new ItemTool(type.itemID - 256, type).setUnlocalizedName(type.iconPath);
				toolItems.add(toolItem);
				LanguageRegistry.addName(toolItem, type.name);
			} 
			catch (Exception e)
			{
				log("Failed to add tool : " + toolFile.name);
				e.printStackTrace();
			}
		}
		log("Loaded tools.");

		// Gun Boxes
		for(TypeFile boxFile : TypeFile.files.get(EnumType.box))
		{
			try
			{
				GunBoxType type = new GunBoxType(boxFile);
				type.read(boxFile);
				type.item = Item.itemsList[gunBoxBlock.blockID];
				type.itemID = gunBoxBlock.blockID;
			} 
			catch (Exception e)
			{
				log("Failed to add gun box : " + boxFile.name);
				e.printStackTrace();
			}
		}
		log("Loaded gun boxes.");
		
		// Armour
		for(TypeFile armourFile : TypeFile.files.get(EnumType.armour))
		{
			try
			{
				ArmourType type = new ArmourType(armourFile);
				type.read(armourFile);
				Item armourItem = new ItemTeamArmour(type).setUnlocalizedName(type.iconPath);
				armourItems.add(armourItem);
				LanguageRegistry.addName(armourItem, type.name);
			} 
			catch (Exception e)
			{
				log("Failed to add armour : " + armourFile.name);
				e.printStackTrace();
			}
		}
		log("Loaded armour.");
		
		// Classes
		for(TypeFile classFile : TypeFile.files.get(EnumType.playerClass))
		{
			try
			{
				PlayerClass playerClass = new PlayerClass(classFile);
			} 
			catch (Exception e)
			{
				log("Failed to add class : " + classFile.name);
				e.printStackTrace();
			}
		}
		log("Loaded classes.");
		
		// Teams
		for(TypeFile teamFile : TypeFile.files.get(EnumType.team))
		{
			try
			{
				Team team = new Team(teamFile);
			} 
			catch (Exception e)
			{
				log("Failed to add team : " + teamFile.name);
				e.printStackTrace();
			}
		}
		log("Loaded teams.");
						
		// Recipes
		for (InfoType type : InfoType.infoTypes)
		{
			type.addRecipe();
		}
		log("Loaded recipes.");
	}
	
	public static void loadProperties()
	{
		configuration.load();
		craftingTableID = configuration.getBlock("Crafting Table", craftingTableID).getInt(craftingTableID);
		spawnerID = configuration.getBlock("Team Spawner", spawnerID).getInt(spawnerID);
		gunBoxID = configuration.getBlock("Gun Box", gunBoxID).getInt(gunBoxID);
		configuration.save();
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

	/** Logger. */
	public static void log(Object arg0)
	{
		// TODO: get a proper logger class/instance
		System.out.println("Flan's Mod : " + arg0);
	}
}
