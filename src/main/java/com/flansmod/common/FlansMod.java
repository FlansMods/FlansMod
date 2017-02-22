package com.flansmod.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import net.minecraft.block.material.Material;
import net.minecraft.command.CommandHandler;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EntityWheel;
import com.flansmod.common.driveables.ItemPlane;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.driveables.mechas.ItemMecha;
import com.flansmod.common.driveables.mechas.ItemMechaAddon;
import com.flansmod.common.driveables.mechas.MechaItemType;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.guns.AAGunType;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.EntityAAGun;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.EntityMG;
import com.flansmod.common.guns.GrenadeType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemAAGun;
import com.flansmod.common.guns.ItemAttachment;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGrenade;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.boxes.BlockGunBox;
import com.flansmod.common.guns.boxes.GunBoxType;
import com.flansmod.common.network.PacketHandler;
import com.flansmod.common.paintjob.BlockPaintjobTable;
import com.flansmod.common.paintjob.TileEntityPaintjobTable;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.teams.ArmourBoxType;
import com.flansmod.common.teams.ArmourType;
import com.flansmod.common.teams.BlockArmourBox;
import com.flansmod.common.teams.BlockSpawner;
import com.flansmod.common.teams.ChunkLoadingHandler;
import com.flansmod.common.teams.CommandTeams;
import com.flansmod.common.teams.EntityFlag;
import com.flansmod.common.teams.EntityFlagpole;
import com.flansmod.common.teams.EntityGunItem;
import com.flansmod.common.teams.EntityTeamItem;
import com.flansmod.common.teams.ItemFlagpole;
import com.flansmod.common.teams.ItemOpStick;
import com.flansmod.common.teams.ItemRewardBox;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.teams.PlayerClass;
import com.flansmod.common.teams.RewardBox;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.teams.TeamsManagerRanked;
import com.flansmod.common.teams.TileEntitySpawner;
import com.flansmod.common.tools.EntityParachute;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.tools.ToolType;
import com.flansmod.common.types.EnumType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.eventhandlers.PlayerDeathEventListener;

@Mod(modid = FlansMod.MODID, name = "Flan's Mod", version = FlansMod.VERSION, acceptableRemoteVersions = "@ALLOWEDVERSIONS@", guiFactory = "com.flansmod.client.gui.config.ModGuiFactory")
public class FlansMod
{
	//Core mod stuff
	public static boolean DEBUG = false;
	public static Configuration configFile;
	public static final String MODID = "flansmod";
	public static final String VERSION = "@VERSION@";
	@Instance(MODID)
	public static FlansMod INSTANCE;

	@SidedProxy(clientSide = "com.flansmod.client.ClientProxy", serverSide = "com.flansmod.common.CommonProxy")
	public static CommonProxy proxy;
	//A standardised ticker for all bits of the mod to call upon if they need one
	public static int ticker = 0;
	public static long lastTime;
	public static File flanDir;
	public static final float soundRange = 50F;
	public static final float driveableUpdateRange = 200F;
	public static final int numPlayerSnapshots = 20;
	public static boolean isApocalypseLoaded = false;
	public static boolean addAllPaintjobsToCreative = false;
	public static boolean addGunpowderRecipe = true;
	public static boolean shootOnRightClick = false;
	
	public static float armourSpawnRate = 0.25F;
	
	public static int dungeonLootChance = 500;
	
	/** The spectator team. Moved here to avoid a concurrent modification error */
	public static Team spectators = new Team("spectators", "Spectators", 0x404040, '7');

	//Handlers
	public static final PacketHandler packetHandler = new PacketHandler();
	public static final PlayerHandler playerHandler = new PlayerHandler();
	public static final TeamsManager teamsManager = new TeamsManagerRanked();
	public static final CommonTickHandler tickHandler = new CommonTickHandler();
	public static FlansHooks hooks = new FlansHooks();
	
	//Items and creative tabs
	public static BlockFlansWorkbench workbench;
	public static BlockSpawner spawner;
	public static ItemOpStick opStick;
	public static ItemFlagpole flag;
	public static ArrayList<ItemPart> partItems = new ArrayList<ItemPart>();
	public static ArrayList<ItemMecha> mechaItems = new ArrayList<ItemMecha>();
	public static ArrayList<ItemTool> toolItems = new ArrayList<ItemTool>();
	public static ArrayList<ItemTeamArmour> armourItems = new ArrayList<ItemTeamArmour>();
	public static CreativeTabFlan tabFlanGuns = new CreativeTabFlan(0), tabFlanDriveables = new CreativeTabFlan(1),
			tabFlanParts = new CreativeTabFlan(2), tabFlanTeams = new CreativeTabFlan(3), tabFlanMechas = new CreativeTabFlan(4);
	
	/** Custom paintjob item */
	public static Item rainbowPaintcan;
	public static BlockPaintjobTable paintjobTable;
	
	private static Random rewardsRandom = new Random();
	public static float Pick(float totalWeight) { return rewardsRandom.nextFloat() * totalWeight; }

	/** The mod pre-initialiser method */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		log("Preinitialising Flan's mod.");
		configFile = new Configuration(event.getSuggestedConfigurationFile());
		syncConfig();

		//TODO : Load properties
		//configuration = new Configuration(event.getSuggestedConfigurationFile());
		//loadProperties();
		
		try
		{
			isApocalypseLoaded = true;
			Class.forName("com.flansmod.apocalypse.common.FlansModApocalypse");
		}
		catch(Exception e)
		{
			isApocalypseLoaded = false;
		}
		
		flanDir = new File(event.getModConfigurationDirectory().getParentFile(), "/Flan/");
	
		if (!flanDir.exists())
		{
			log("Flan folder not found. Creating empty folder.");
			log("You should get some content packs and put them in the Flan folder.");
			flanDir.mkdirs();
			flanDir.mkdir();
		}
		
		//Set up mod blocks and items
		workbench = (BlockFlansWorkbench)(new BlockFlansWorkbench(1, 0).setUnlocalizedName("flansWorkbench"));
		GameRegistry.registerBlock(workbench, ItemBlockManyNames.class, "flansWorkbench");
		GameRegistry.addRecipe(new ItemStack(workbench, 1, 0), "BBB", "III", "III", 'B', Items.bowl, 'I', Items.iron_ingot );
		GameRegistry.addRecipe(new ItemStack(workbench, 1, 1), "ICI", "III", 'C', Items.cauldron, 'I', Items.iron_ingot );
		opStick = new ItemOpStick();
		GameRegistry.registerItem(opStick, "opStick", MODID);
		flag = (ItemFlagpole)(new ItemFlagpole().setUnlocalizedName("flagpole"));
		GameRegistry.registerItem(flag, "flagpole", MODID);
		spawner = (BlockSpawner)(new BlockSpawner(Material.iron).setUnlocalizedName("teamsSpawner").setBlockUnbreakable().setResistance(1000000F));
		GameRegistry.registerBlock(spawner, ItemBlockManyNames.class, "teamsSpawner");
		GameRegistry.registerTileEntity(TileEntitySpawner.class, "teamsSpawner");
		
		rainbowPaintcan = new Item().setUnlocalizedName("rainbowPaintcan").setCreativeTab(tabFlanGuns);
		GameRegistry.registerItem(rainbowPaintcan, "rainbowPaintcan", MODID);
		paintjobTable = new BlockPaintjobTable();
		GameRegistry.registerBlock(paintjobTable, "paintjobTable");
		GameRegistry.registerTileEntity(TileEntityPaintjobTable.class, MODID);
		
		GameRegistry.registerTileEntity(TileEntityItemHolder.class, "itemHolder");
		
		//Read content packs
		readContentPacks(event);

		//Force Minecraft to reload all resources in order to load content pack resources.
		proxy.forceReload();
						
		log("Preinitializing complete.");
	}
	
	/** The mod initialiser method */
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		log("Initialising Flan's Mod.");
		
		
		//Do proxy loading
		proxy.load();
		proxy.registerRenderers();
				
		//Initialising handlers
		packetHandler.initialise();
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new CommonGuiHandler());		
		
		// Recipes
		for (InfoType type : InfoType.infoTypes.values())
		{
			type.addRecipe();
			type.addDungeonLoot();
		}
		if(addGunpowderRecipe)
		{
			ItemStack charcoal = new ItemStack(Items.coal, 1, 1);
			GameRegistry.addShapelessRecipe(new ItemStack(Items.gunpowder), charcoal, charcoal, charcoal, new ItemStack(Items.glowstone_dust));
		}
		log("Loaded recipes.");
		
		// Really randomise the rewards generator
		rewardsRandom = new Random();
		rewardsRandom.setSeed(System.currentTimeMillis() ^ 0x5AB49DE08DE3B1DFl);
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < rewardsRandom.nextInt(10); j++)
			{
				rewardsRandom.nextGaussian();
			}
		}
		
		//Register teams mod entities
		EntityRegistry.registerGlobalEntityID(EntityFlagpole.class, "Flagpole", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityFlagpole.class, "Flagpole", 93, this, 40, 5, true);
		EntityRegistry.registerGlobalEntityID(EntityFlag.class, "Flag", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityFlag.class, "Flag", 94, this, 40, 5, true);
		EntityRegistry.registerGlobalEntityID(EntityTeamItem.class, "TeamsItem", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityTeamItem.class, "TeamsItem", 97, this, 100, 10000, true);
		EntityRegistry.registerGlobalEntityID(EntityGunItem.class, "GunItem", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityGunItem.class, "GunItem", 98, this, 100, 20, true);
		EntityRegistry.registerGlobalEntityID(EntityItemCustomRender.class, "CustomItem", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityItemCustomRender.class, "CustomItem", 89, this, 100, 20, true);
		
		//Register driveables
		EntityRegistry.registerGlobalEntityID(EntityPlane.class, "Plane", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityPlane.class, "Plane", 90, this, 250, 3, false);
		EntityRegistry.registerGlobalEntityID(EntityVehicle.class, "Vehicle", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityVehicle.class, "Vehicle", 95, this, 250, 10, false);
		EntityRegistry.registerGlobalEntityID(EntitySeat.class, "Seat", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntitySeat.class, "Seat", 99, this, 250, 10, false);
		EntityRegistry.registerGlobalEntityID(EntityWheel.class, "Wheel", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityWheel.class, "Wheel", 103, this, 250, 20, false);
		EntityRegistry.registerGlobalEntityID(EntityParachute.class, "Parachute", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityParachute.class, "Parachute", 101, this, 40, 20, false);
		EntityRegistry.registerGlobalEntityID(EntityMecha.class, "Mecha", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityMecha.class, "Mecha", 102, this, 250, 20, false);
		
		//Register bullets and grenades
		//EntityRegistry.registerGlobalEntityID(EntityBullet.class, "Bullet", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityBullet.class, "Bullet", 96, this, 40, 100, false);
		EntityRegistry.registerGlobalEntityID(EntityGrenade.class, "Grenade", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityGrenade.class, "Grenade", 100, this, 40, 100, true);

		//Register MGs and AA guns
		EntityRegistry.registerGlobalEntityID(EntityMG.class, "MG", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityMG.class, "MG", 91, this, 40, 5, true);
		EntityRegistry.registerGlobalEntityID(EntityAAGun.class, "AAGun", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityAAGun.class, "AAGun", 92, this, 40, 500, false);
		
		//Register the chunk loader 
		//TODO : Re-do chunk loading
		ForgeChunkManager.setForcedChunkLoadingCallback(this, new ChunkLoadingHandler());

		//Config
		FMLCommonHandler.instance().bus().register(INSTANCE);
		MinecraftForge.EVENT_BUS.register(INSTANCE);
		//Starting the EventListener
		new PlayerDeathEventListener();
		log("Loading complete.");
	}
	
	/** The mod post-initialisation method */
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		packetHandler.postInitialise();
		
		hooks.hook();
	}
	
	@SubscribeEvent
	public void playerDrops(PlayerDropsEvent event)
	{
		for(int i = event.drops.size() - 1; i >= 0; i--)
		{
			EntityItem ent = event.drops.get(i);
			InfoType type = InfoType.getType(ent.getEntityItem());
			if(type != null && !type.canDrop)
				event.drops.remove(i);
		}
	}
	
	@SubscribeEvent
	public void playerDrops(ItemTossEvent event)
	{
		InfoType type = InfoType.getType(event.entityItem.getEntityItem());
		if(type != null && !type.canDrop)
			event.setCanceled(true);
	}
	
	/** Teams command register method */
	@EventHandler
	public void registerCommand(FMLServerStartedEvent e)
	{
		CommandHandler handler = ((CommandHandler)FMLCommonHandler.instance().getSidedDelegate().getServer().getCommandManager());
		handler.registerCommand(new CommandTeams());
	}

	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
		if(eventArgs.modID.equals(MODID))
			syncConfig();
	}
	
	@SubscribeEvent
	public void onBlockBreak(BlockEvent.BreakEvent event)
	{
		if(event.getPlayer() != null
				&& event.getPlayer().getCurrentEquippedItem() != null
				&& event.getPlayer().getCurrentEquippedItem().getItem() instanceof ItemGun)
		{
			event.setCanceled(true);
		}
	}

	@SubscribeEvent
	public void onLivingSpecialSpawn(EntityJoinWorldEvent event)
	{
		double chance = event.world.rand.nextDouble();

		if(chance < armourSpawnRate && event.entity instanceof EntityZombie || event.entity instanceof EntitySkeleton)
		{
			if(event.world.rand.nextBoolean() && ArmourType.armours.size() > 0)
			{
				//Give a completely random piece of armour
				ArmourType armour = ArmourType.armours.get(event.world.rand.nextInt(ArmourType.armours.size()));
				if(armour != null && armour.type != 2)
					event.entity.setCurrentItemOrArmor(armour.type + 1, new ItemStack(armour.item));
			}
			else if(Team.teams.size() > 0)
			{
				//Give a random set of armour
				Team team = Team.teams.get(event.world.rand.nextInt(Team.teams.size()));
				if(team.hat != null)
					event.entity.setCurrentItemOrArmor(1, team.hat.copy());
				if(team.chest != null)
					event.entity.setCurrentItemOrArmor(2, team.chest.copy());
				if(team.legs != null)
					event.entity.setCurrentItemOrArmor(3, team.legs.copy());
				if(team.shoes != null)
					event.entity.setCurrentItemOrArmor(4, team.shoes.copy());
				
				if(team.classes.size() > 0)
				{
					PlayerClass playerClass = team.classes.get(event.world.rand.nextInt(team.classes.size()));
					if(playerClass.hat != null)
						event.entity.setCurrentItemOrArmor(1, playerClass.hat.copy());
					if(playerClass.chest != null)
						event.entity.setCurrentItemOrArmor(2, playerClass.chest.copy());
					if(playerClass.legs != null)
						event.entity.setCurrentItemOrArmor(3, playerClass.legs.copy());
					if(playerClass.shoes != null)
						event.entity.setCurrentItemOrArmor(4, playerClass.shoes.copy());
				}
			}
		}
		
		tickHandler.onEntitySpawn(event);
	}

	@SubscribeEvent
	public void onAttackEntity(AttackEntityEvent event)
	{
		if(event.entity instanceof EntityGunItem)
		{
			event.setCanceled(true);
		}
	}
	
	/** Reads type files from all content packs */
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
							TypeFile typeFile = new TypeFile(contentPack.getName(), typeToCheckFor, splitName[splitName.length - 1].split("\\.")[0]);
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
								typeFile = new TypeFile(zip.getName(), type, splitName[splitName.length - 1].split("\\.")[0]);
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
					zip.close();
					zipStream.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	/** Content pack reader method */
	private void readContentPacks(FMLPreInitializationEvent event)
	{
		// Icons, Skins, Models
		// Get the classloader in order to load the images
		ClassLoader classloader = (net.minecraft.server.MinecraftServer.class).getClassLoader();
		Method method = null;
		try
		{
			method = (java.net.URLClassLoader.class).getDeclaredMethod("addURL", java.net.URL.class);
			method.setAccessible(true);
		} catch (Exception e)
		{
			log("Failed to get class loader. All content loading will now fail.");
			e.printStackTrace();
		}

		List<File> contentPacks = proxy.getContentList(method, classloader);

		//TODO : Add gametype loader
		getTypeFiles(contentPacks);
		
		for(EnumType type : EnumType.values())
		{
			Class<? extends InfoType> typeClass = type.getTypeClass();
			for(TypeFile typeFile : TypeFile.files.get(type))
			{
				try
				{
					InfoType infoType = (typeClass.getConstructor(TypeFile.class).newInstance(typeFile));
					infoType.read(typeFile);
					switch(type)
					{
					case bullet : 		new ItemBullet((BulletType)infoType).setUnlocalizedName(infoType.shortName); break;
					case attachment : 	new ItemAttachment((AttachmentType)infoType).setUnlocalizedName(infoType.shortName); break;
					case gun : 			new ItemGun((GunType)infoType).setUnlocalizedName(infoType.shortName); break;
					case grenade : 		new ItemGrenade((GrenadeType)infoType).setUnlocalizedName(infoType.shortName); break;
					case part : 		partItems.add((ItemPart)new ItemPart((PartType)infoType).setUnlocalizedName(infoType.shortName)); break;
					case plane : 		new ItemPlane((PlaneType)infoType).setUnlocalizedName(infoType.shortName); break;
					case vehicle : 		new ItemVehicle((VehicleType)infoType).setUnlocalizedName(infoType.shortName); break;
					case aa : 			new ItemAAGun((AAGunType)infoType).setUnlocalizedName(infoType.shortName); break;
					case mechaItem : 	new ItemMechaAddon((MechaItemType)infoType).setUnlocalizedName(infoType.shortName); break;
					case mecha : 		mechaItems.add((ItemMecha)new ItemMecha((MechaType)infoType).setUnlocalizedName(infoType.shortName)); break;
					case tool : 		toolItems.add((ItemTool)new ItemTool((ToolType)infoType).setUnlocalizedName(infoType.shortName)); break;
					case box : 			new BlockGunBox((GunBoxType)infoType).setUnlocalizedName(infoType.shortName); break;
					case armour : 		armourItems.add((ItemTeamArmour)new ItemTeamArmour((ArmourType)infoType).setUnlocalizedName(infoType.shortName)); break;
					case armourBox : 	new BlockArmourBox((ArmourBoxType)infoType).setUnlocalizedName(infoType.shortName); break; 
					case playerClass : 	break;
					case team : 		break;
					case itemHolder:	new BlockItemHolder((ItemHolderType)infoType); break;
					case rewardBox:		new ItemRewardBox((RewardBox)infoType).setUnlocalizedName(infoType.shortName); break;
					case loadout:		break;
					default : log("Unrecognised type for " + infoType.shortName); break;
					}
				}
				catch(Exception e)
				{
					log("Failed to add " + type.name() + " : " + typeFile.name);
					e.printStackTrace();
				}
			}
			log("Loaded " + type.name() + ".");
		}		
		Team.spectators = spectators;
		
		//Automates JSON adding for old content packs
		proxy.addMissingJSONs(InfoType.infoTypes);
	}
	
	public static PacketHandler getPacketHandler()
	{
		return INSTANCE.packetHandler;
	}

	public static void syncConfig() 
	{
		addGunpowderRecipe = configFile.getBoolean("Gunpowder Recipe", Configuration.CATEGORY_GENERAL, addGunpowderRecipe, "Whether or not to add the extra gunpowder recipe (3 charcoal + 1 lightstone)");
		shootOnRightClick = configFile.getBoolean("ShootOnRightClick", Configuration.CATEGORY_GENERAL, shootOnRightClick, "If true, then shoot will be on right click");
		addAllPaintjobsToCreative = configFile.getBoolean("Add All Paintjobs to Creative", Configuration.CATEGORY_GENERAL, addAllPaintjobsToCreative, "Whether all paintjobs should appear in creative");

		if(configFile.hasChanged())
			configFile.save();
	}

	//TODO : Proper logger
	public static void log(String string) 
	{
		System.out.println("[Flan's Mod] " + string);
	}

	public static void Assert(boolean b, String string)
	{
		if(!b)
		{
			log(string);
		}
	}
	
	public static EnumParticleTypes getParticleType(String s)
	{
		if(s.equals("hugeexplosion")) 		return EnumParticleTypes.EXPLOSION_HUGE;
		else if(s.equals("largeexplode"))	return EnumParticleTypes.EXPLOSION_LARGE;
		else if(s.equals("explode"))		return EnumParticleTypes.EXPLOSION_NORMAL;
		else if(s.equals("fireworksSpark"))	return EnumParticleTypes.FIREWORKS_SPARK;
		else if(s.equals("bubble"))			return EnumParticleTypes.WATER_BUBBLE;
		else if(s.equals("splash"))			return EnumParticleTypes.WATER_SPLASH;
		else if(s.equals("wake"))			return EnumParticleTypes.WATER_WAKE;
		else if(s.equals("drop"))			return EnumParticleTypes.WATER_DROP;
		else if(s.equals("suspended"))		return EnumParticleTypes.SUSPENDED;
		else if(s.equals("depthsuspend"))	return EnumParticleTypes.SUSPENDED_DEPTH;
		else if(s.equals("townaura"))		return EnumParticleTypes.TOWN_AURA;
		else if(s.equals("crit"))			return EnumParticleTypes.CRIT;
		else if(s.equals("magicCrit"))		return EnumParticleTypes.CRIT_MAGIC;
		else if(s.equals("smoke"))			return EnumParticleTypes.SMOKE_NORMAL;
		else if(s.equals("largesmoke"))		return EnumParticleTypes.SMOKE_LARGE;
		else if(s.equals("spell"))			return EnumParticleTypes.SPELL;
		else if(s.equals("instantSpell"))	return EnumParticleTypes.SPELL_INSTANT;
		else if(s.equals("mobSpell"))		return EnumParticleTypes.SPELL_MOB;
		else if(s.equals("mobSpellAmbient"))return EnumParticleTypes.SPELL_MOB_AMBIENT;
		else if(s.equals("witchMagic"))		return EnumParticleTypes.SPELL_WITCH;
		else if(s.equals("dripWater"))		return EnumParticleTypes.DRIP_WATER;
		else if(s.equals("dripLava"))		return EnumParticleTypes.DRIP_LAVA;
		else if(s.equals("angryVillager"))	return EnumParticleTypes.VILLAGER_ANGRY;
		else if(s.equals("happyVillager"))	return EnumParticleTypes.VILLAGER_HAPPY;
		else if(s.equals("note"))			return EnumParticleTypes.NOTE;
		else if(s.equals("portal"))			return EnumParticleTypes.PORTAL;
		else if(s.equals("enchantmenttable"))return EnumParticleTypes.ENCHANTMENT_TABLE;
		else if(s.equals("flame"))			return EnumParticleTypes.FLAME;
		else if(s.equals("lava"))			return EnumParticleTypes.LAVA;
		else if(s.equals("footstep"))		return EnumParticleTypes.FOOTSTEP;
		else if(s.equals("cloud"))			return EnumParticleTypes.CLOUD;
		else if(s.equals("reddust"))		return EnumParticleTypes.REDSTONE;
		else if(s.equals("snowballpoof"))	return EnumParticleTypes.SNOWBALL;
		else if(s.equals("snowshovel"))		return EnumParticleTypes.SNOW_SHOVEL;
		else if(s.equals("slime"))			return EnumParticleTypes.SLIME;
		else if(s.equals("heart"))			return EnumParticleTypes.HEART;
		else if(s.equals("barrier"))		return EnumParticleTypes.BARRIER;
		
		return EnumParticleTypes.WATER_BUBBLE;
	}
}
