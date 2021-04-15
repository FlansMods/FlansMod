package com.flansmod.apocalypse.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.InitMapGenEvent.EventType;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.flansmod.apocalypse.common.blocks.BlockPowerCube;
import com.flansmod.apocalypse.common.blocks.BlockStatic;
import com.flansmod.apocalypse.common.blocks.BlockSulphur;
import com.flansmod.apocalypse.common.blocks.BlockSulphuricAcid;
import com.flansmod.apocalypse.common.blocks.TileEntityPowerCube;
import com.flansmod.apocalypse.common.entity.EntityAIMecha;
import com.flansmod.apocalypse.common.entity.EntitySkullDrone;
import com.flansmod.apocalypse.common.entity.EntityFakePlayer;
import com.flansmod.apocalypse.common.entity.EntityFlyByPlane;
import com.flansmod.apocalypse.common.entity.EntityNukeDrop;
import com.flansmod.apocalypse.common.entity.EntitySkullBoss;
import com.flansmod.apocalypse.common.entity.EntitySurvivor;
import com.flansmod.apocalypse.common.entity.EntityTeleporter;
import com.flansmod.apocalypse.common.world.BiomeApocalypse;
import com.flansmod.apocalypse.common.world.WorldProviderApocalypse;
import com.flansmod.apocalypse.common.world.buildings.WorldGenAbandonedPortal;
import com.flansmod.apocalypse.common.world.buildings.WorldGenBossPillar;
import com.flansmod.common.BlockItemHolder;
import com.flansmod.common.CreativeTabFlan;
import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansModContentProvider;
import com.flansmod.common.ItemHolderType;
import com.flansmod.common.enchantments.GloveType;
import com.flansmod.common.enchantments.ItemGlove;
import com.flansmod.common.parts.PartType;

@Mod(modid = FlansModApocalypse.MODID, name = "Flan's Mod: Apocalypse", version = FlansModApocalypse.VERSION, acceptableRemoteVersions = "@ALLOWED_VERSIONS_APOCALYPSE@", dependencies = "required-after:" + FlansMod.MODID)
//, guiFactory = "com.flansmod.client.gui.config.ModGuiFactory")
public class FlansModApocalypse implements IFlansModContentProvider
{
	//Core mod stuff
	public static boolean DEBUG = false;
	public static final String MODID = "flansmodapocalypse";
	public static final String VERSION = "@VERSION_APOCALYPSE@";
	
	@Instance(MODID)
	public static FlansModApocalypse INSTANCE;
	@SidedProxy(clientSide = "com.flansmod.apocalypse.client.ClientProxyApocalypse", serverSide = "com.flansmod.apocalypse.common.CommonProxyApocalypse")
	public static CommonProxyApocalypse proxy;
	
	//Config options
	public static Configuration configFile;
	/**
	 * The time it takes between an AI chip being activated and the apocalypse happening (in ticks)
	 */
	public static int apocalypseCountdownLength = 469;
	public static int SURVIVOR_RARITY = 250;
	public static int WANDERING_SURVIVOR_RARITY = 500;
	public static int SKELETON_RARITY = 50;
	public static int DEAD_TREE_RARITY = 100;
	public static int VEHICLE_RARITY = 2000;
	public static int AIRPORT_RARITY = 125;
	public static int DYE_FACTORY_RARITY = 400;
	public static int LAB_RARITY = 100;

	
	// TODO: Configify
	public static int ABANDONED_PORTAL_APOC_RARITY = 4000;
	public static int ABANDONED_PORTAL_OVERWORLD_RARITY = 4000;
	
	/**
	 * The distance between where the player left the overworld, and where they return
	 */
	public static int RETURN_RADIUS = 100;
	/**
	 * How far from their death point does the player respawn?
	 */
	public static int SPAWN_RADIUS = 100;
	public static boolean RESPAWN_IN_APOC = false;
	/**
	 * Who gets teleported to the apocalypse when a player places a mecha?
	 */
	public static TeleportOption OPTION = TeleportOption.PLACER_ONLY;
	
	public static int dimensionID;
	public static DimensionType APOCALYPSE_DIM = null;
	public static FlansModLootGenerator lootGenerator;
	
	//Custom apoclypse defined items and blocks
	public static Item sulphur;
	public static Block blockSulphur;
	public static Fluid sulphuricAcid;
	public static Block blockSulphuricAcid;
	public static ResourceLocation sulphuricAcidStill = new ResourceLocation("flansmodapocalypse", "blocks/sulphuricAcidStill"),
			sulphuricAcidFlowing = new ResourceLocation("flansmodapocalypse", "blocks/sulphuricAcidFlowing");
	public static Block blockLabStone;
	public static Block blockPowerCube;
	
	public static Item itemBlockPowerCube, itemBlockLabStone, itemBlockSulphur;
	
	public static CreativeTabFlan tabApocalypse = new CreativeTabFlan(5);
	
	//References to apocalypse specific items and blocks:
	public static BlockItemHolder skeleton, slumpedSkeleton, gunRack;
	
	public static ItemGlove nukraniumGauntlet;
	
	static
	{
		FluidRegistry.enableUniversalBucket();
	}
	
	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(sulphur);
		event.getRegistry().register(itemBlockLabStone);
		event.getRegistry().register(itemBlockSulphur);
		event.getRegistry().register(itemBlockPowerCube);
	}
	
	@SubscribeEvent
	public void registerBlocks(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().register(blockSulphur);
		event.getRegistry().register(blockSulphuricAcid);
		event.getRegistry().register(blockLabStone);
		event.getRegistry().register(blockPowerCube);
	}
	
	@SubscribeEvent
	public void registerBiomes(RegistryEvent.Register<Biome> event)
	{
		BiomeApocalypse.registerBiomes();
		event.getRegistry().register(BiomeApocalypse.deepCanyon);
		event.getRegistry().register(BiomeApocalypse.canyon);
		event.getRegistry().register(BiomeApocalypse.desert);
		event.getRegistry().register(BiomeApocalypse.plateau);
		event.getRegistry().register(BiomeApocalypse.highPlateau);
		event.getRegistry().register(BiomeApocalypse.sulphurPits);
	}
	
	@SubscribeEvent
	public void registerRecipes(RegistryEvent.Register<IRecipe> event)
	{
		NonNullList<Ingredient> ingredients = NonNullList.create();
		ingredients.add(Ingredient.fromItem(ItemBlock.getItemFromBlock(Blocks.SAND)));
		ingredients.add(Ingredient.fromStacks(new ItemStack(sulphur)));
		
		event.getRegistry().register(new ShapelessRecipes("FlansModApocalypse", new ItemStack(Items.GUNPOWDER), ingredients).setRegistryName("GunpowderFromSulphur"));
		
		ingredients = NonNullList.create();
		for(int i = 0; i < 4; i++)
			ingredients.add(Ingredient.fromItem(ItemBlock.getItemFromBlock((Blocks.OBSIDIAN))));
		ingredients.add(Ingredient.fromItem(Items.END_CRYSTAL));
		for(int i = 0; i < 4; i++)
			ingredients.add(Ingredient.fromItem(ItemBlock.getItemFromBlock((Blocks.OBSIDIAN))));

		event.getRegistry().register(new ShapedRecipes(MODID, 3, 3, ingredients, new ItemStack(itemBlockPowerCube)).setRegistryName("PowerCubeCrafting"));
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(this);
		
		//Load config
		configFile = new Configuration(event.getSuggestedConfigurationFile());
		syncConfig();
		
		//Custom apoclypse defined items and blocks
		
		//Sulphur block and item
		// TODO: [1.12] .setStepSound(Block.soundTypeSand)
		blockSulphur = new BlockSulphur().setTranslationKey("blocksulphur").setRegistryName("blocksulphur").setCreativeTab(tabApocalypse);
		sulphur = new Item().setTranslationKey("flansulphur").setRegistryName("flansulphur").setCreativeTab(tabApocalypse);
		
		itemBlockSulphur = new ItemBlock(blockSulphur).setTranslationKey("blocksulphur").setRegistryName("blocksulphur").setCreativeTab(tabApocalypse);
		
		//Sulphuric acid
		sulphuricAcid = new Fluid("sulphuricacid", sulphuricAcidStill, sulphuricAcidFlowing).setTemperature(300).setViscosity(800);
		if(FluidRegistry.registerFluid(sulphuricAcid))
		{
			blockSulphuricAcid = new BlockSulphuricAcid(sulphuricAcid, Material.WATER).setTranslationKey("blocksulphuricacid").setRegistryName("blocksulphuricacid").setCreativeTab(tabApocalypse);
			sulphuricAcid.setBlock(blockSulphuricAcid);
			sulphuricAcid.setUnlocalizedName(blockSulphuricAcid.getTranslationKey());
			FluidRegistry.addBucketForFluid(sulphuricAcid);
		}
		else
		{
			sulphuricAcid = FluidRegistry.getFluid("sulphuricacid");
			blockSulphuricAcid = sulphuricAcid.getBlock();
		}
		
		//Laboratory Stone
		blockLabStone = new BlockStatic(Material.ROCK).setHardness(3F).setResistance(5F).setTranslationKey("blocklabstone").setRegistryName("blocklabstone").setCreativeTab(tabApocalypse);
		itemBlockLabStone = new ItemBlock(blockLabStone).setTranslationKey("blocklabstone").setRegistryName("blocklabstone").setCreativeTab(tabApocalypse);
		
		//Power Cube
		blockPowerCube = new BlockPowerCube(Material.CIRCUITS).setTranslationKey("blockpowercube").setRegistryName("blockpowercube").setHardness(3F).setResistance(5F).setCreativeTab(tabApocalypse);
		itemBlockPowerCube = new ItemBlock(blockPowerCube).setTranslationKey("blockpowercube").setRegistryName("blockpowercube").setCreativeTab(tabApocalypse);
		GameRegistry.registerTileEntity(TileEntityPowerCube.class, new ResourceLocation("flansmodapocalypse:powercube"));
		
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init(event);
		dimensionID = DimensionManager.getNextFreeDimId();
		APOCALYPSE_DIM = DimensionType.register("Apocalypse", "_apocalypse", dimensionID, WorldProviderApocalypse.class, false);
		DimensionManager.registerDimension(dimensionID, APOCALYPSE_DIM);
		
		//Grab references to apocalypse specific items and blocks here:
		if(ItemHolderType.getItemHolder("flanSkeleton") != null)
		{
			skeleton = ItemHolderType.getItemHolder("flanSkeleton").block;
			skeleton.setCreativeTab(tabApocalypse);
		}
		else
		{
			FlansMod.log.warn("Could not find skeleton item holder!");
		}
		if(ItemHolderType.getItemHolder("flanSkeleton2") != null)
		{
			slumpedSkeleton = ItemHolderType.getItemHolder("flanSkeleton2").block;
			slumpedSkeleton.setCreativeTab(tabApocalypse);
		}
		else
		{
			FlansMod.log.warn("Could not find skeleton2 item holder!");
		}
		if(ItemHolderType.getItemHolder("flanGunRack") != null)
		{
			gunRack = ItemHolderType.getItemHolder("flanGunRack").block;
			gunRack.setCreativeTab(tabApocalypse);
		}
		else
		{
			FlansMod.log.warn("Could not find gun rack item holder!");
		}
		
		//Put ai chip in apocalypse tab
		if(PartType.getPart("aiChip") != null)
			PartType.getPart("aiChip").item.setCreativeTab(tabApocalypse);
		if(PartType.getPart("complicatedCircuit") != null)
			PartType.getPart("complicatedCircuit").item.setCreativeTab(tabApocalypse);
		if(PartType.getPart("nuclearPowerCore") != null)
			PartType.getPart("nuclearPowerCore").item.setCreativeTab(tabApocalypse);
		
		if(GloveType.getGlove("nukranium_gauntlet") != null)
		{
			nukraniumGauntlet = (ItemGlove)GloveType.getGlove("nukranium_gauntlet").item;
		}
		
		lootGenerator = new FlansModLootGenerator();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
	}
	
	private WorldGenAbandonedPortal portalGen = new WorldGenAbandonedPortal();
	
	
	@SubscribeEvent
	public void populateOverworldChunk(PopulateChunkEvent event)
	{
		if(event.getRand().nextInt(FlansModApocalypse.ABANDONED_PORTAL_OVERWORLD_RARITY) == 0)
		{
			int i = event.getChunkX() * 16 + 8;
			int j = event.getChunkZ() * 16 + 8;
			
			int height = event.getWorld().getHeight(i, j);
			portalGen.generate(event.getWorld(), event.getRand(), new BlockPos(i, height, j));
		}
	}
	
	@SubscribeEvent
	public void registerEntities(RegistryEvent.Register<EntityEntry> event)
	{
		event.getRegistry().register(new EntityEntry(EntitySurvivor.class, "Survivor").setRegistryName("Survivor"));
		event.getRegistry().register(new EntityEntry(EntityTeleporter.class, "Teleporter").setRegistryName("Teleporter"));
		event.getRegistry().register(new EntityEntry(EntityAIMecha.class, "AIMecha").setRegistryName("AIMecha"));
		event.getRegistry().register(new EntityEntry(EntityFakePlayer.class, "FakePlayer").setRegistryName("FakePlayer"));
		event.getRegistry().register(new EntityEntry(EntityNukeDrop.class, "NukeDrop").setRegistryName("NukeDrop"));
		event.getRegistry().register(new EntityEntry(EntityFlyByPlane.class, "FlyByPlane").setRegistryName("FlyByPlane"));
		event.getRegistry().register(new EntityEntry(EntitySkullBoss.class, "SkullBoss").setRegistryName("SkullBoss"));
		event.getRegistry().register(new EntityEntry(EntitySkullDrone.class, "AutoDrone").setRegistryName("AutoDrone"));
		
		//EntityRegistry.registerModEntity(new ResourceLocation("flansmodapocalypse:Survivor"), 		EntitySurvivor.class, "Survivor", 112, FlansModApocalypse.INSTANCE, 100, 20, true, 0, 0);
		EntityRegistry.registerModEntity(new ResourceLocation("flansmodapocalypse:Teleporter"), EntityTeleporter.class, "Teleporter", 113, FlansModApocalypse.INSTANCE, 100, 20, true);
		EntityRegistry.registerModEntity(new ResourceLocation("flansmodapocalypse:AIMecha"), EntityAIMecha.class, "AIMecha", 114, FlansModApocalypse.INSTANCE, 250, 20, false);
		EntityRegistry.registerModEntity(new ResourceLocation("flansmodapocalypse:FakePlayer"), EntityFakePlayer.class, "FakePlayer", 115, FlansModApocalypse.INSTANCE, 250, 20, false);
		EntityRegistry.registerModEntity(new ResourceLocation("flansmodapocalypse:NukeDrop"), EntityNukeDrop.class, "NukeDrop", 116, FlansModApocalypse.INSTANCE, 250, 20, false);
		EntityRegistry.registerModEntity(new ResourceLocation("flansmodapocalypse:FlyByPlane"), EntityFlyByPlane.class, "FlyByPlane", 117, FlansModApocalypse.INSTANCE, 250, 20, false);
		EntityRegistry.registerModEntity(new ResourceLocation("flansmodapocalypse:SkullBoss"), EntitySkullBoss.class, "SkullBoss", 118, FlansModApocalypse.INSTANCE, 500, 5, false);
		EntityRegistry.registerModEntity(new ResourceLocation("flansmodapocalypse:AutoDrone"), EntitySkullDrone.class, "AutoDrone", 119, FlansModApocalypse.INSTANCE, 500, 5, true);
	}
	
	public static FlansModLootGenerator getLootGenerator()
	{
		return lootGenerator;
	}
	
	public static void syncConfig()
	{
		apocalypseCountdownLength = configFile.getInt("Apocalypse Countdown Length", Configuration.CATEGORY_GENERAL, apocalypseCountdownLength, 19, Integer.MAX_VALUE, "Time between placing an AI mecha and going to the apocalypse");
		SURVIVOR_RARITY = configFile.getInt("Survivor Rarity", Configuration.CATEGORY_GENERAL, SURVIVOR_RARITY, 1, Integer.MAX_VALUE, "Rarity of survivor entities spawned during world creation");
		WANDERING_SURVIVOR_RARITY = configFile.getInt("Wandering Survivor Rarity", Configuration.CATEGORY_GENERAL, WANDERING_SURVIVOR_RARITY, 1, Integer.MAX_VALUE, "Rarity of survivor entities spawned at night");
		SKELETON_RARITY = configFile.getInt("Skeleton Rarity", Configuration.CATEGORY_GENERAL, SKELETON_RARITY, 1, Integer.MAX_VALUE, "Rarity of buried skeletons");
		DEAD_TREE_RARITY = configFile.getInt("Dead Tree Rarity", Configuration.CATEGORY_GENERAL, DEAD_TREE_RARITY, 1, Integer.MAX_VALUE, "Rarity of dead trees");
		VEHICLE_RARITY = configFile.getInt("Vehicle Rarity", Configuration.CATEGORY_GENERAL, VEHICLE_RARITY, 1, Integer.MAX_VALUE, "Rarity of broken vehicles");
		AIRPORT_RARITY = configFile.getInt("Airport Rarity", Configuration.CATEGORY_GENERAL, AIRPORT_RARITY, 1, Integer.MAX_VALUE, "Rarity of airstrips");
		DYE_FACTORY_RARITY = configFile.getInt("Dye Factory Rarity", Configuration.CATEGORY_GENERAL, DYE_FACTORY_RARITY, 1, Integer.MAX_VALUE, "Rarity of dye factories");
		LAB_RARITY = configFile.getInt("Lab Rarity", Configuration.CATEGORY_GENERAL, LAB_RARITY, 1, Integer.MAX_VALUE, "Rarity of the research lab");
		RETURN_RADIUS = configFile.getInt("Return Radius", Configuration.CATEGORY_GENERAL, RETURN_RADIUS, 1, Integer.MAX_VALUE, "The distance away from your initial AI mecha that your return portal appears");
		SPAWN_RADIUS = configFile.getInt("Spawn Radius", Configuration.CATEGORY_GENERAL, SPAWN_RADIUS, 1, Integer.MAX_VALUE, "The distance from your deathpoint that you respawn in the apocalypse");
		OPTION = TeleportOption.getOption(configFile.getString("Option", Configuration.CATEGORY_GENERAL, OPTION.toString(), "Who gets teleported to the apocalypse with a player (One of PLACER_ONLY, DIM, DIM_OPT_IN, NEARBY, NEARBY_OPT_IN)"));
		
		ABANDONED_PORTAL_APOC_RARITY = configFile.getInt("Abandoned Portal Rarity (Apocalypse)", Configuration.CATEGORY_GENERAL, ABANDONED_PORTAL_APOC_RARITY, 1, Integer.MAX_VALUE, "Rarity of the abandoned portal structures in the apocalypse");
		ABANDONED_PORTAL_OVERWORLD_RARITY = configFile.getInt("Abandoned Portal Rarity (Other Dimensions)", Configuration.CATEGORY_GENERAL, ABANDONED_PORTAL_OVERWORLD_RARITY, 1, Integer.MAX_VALUE, "Rarity of the abandoned portal structures in other dimensions");
		RESPAWN_IN_APOC = configFile.getBoolean("Respawn in Apocalypse", Configuration.CATEGORY_GENERAL, RESPAWN_IN_APOC, "If false, players will return to their overworld spawn point");
		
		if(configFile.hasChanged())
			configFile.save();
	}
	
	public enum TeleportOption
	{
		PLACER_ONLY, DIM, DIM_OPT_IN, NEARBY, NEARBY_OPT_IN;
		
		public static TeleportOption getOption(String s)
		{
			if(s.equals("PLACER_ONLY"))
				return PLACER_ONLY;
			else if(s.equals("DIM"))
				return DIM;
			else if(s.equals("DIM_OPT_IN"))
				return DIM_OPT_IN;
			else if(s.equals("NEARBY"))
				return NEARBY;
			else if(s.equals("NEARBY_OPT_IN"))
				return NEARBY_OPT_IN;
			return PLACER_ONLY;
		}
	}

	@Override
	public String GetContentFolder() 
	{
		return "Apocalypse";
	}

	@Override
	public void RegisterModelRedirects() 
	{
		FlansMod.RegisterModelRedirect("apocalypse", "com.flansmod.apocalypse.client.model");
	}

	// Boss fight server control
	
	private static final int kBossWarmupTicks = 200;
	
	
	private static int sElapsedTicks = 0;
	private static boolean sBossFightInProgress = false;
	private static EntitySkullBoss sTheBoss = null;
	
	public void TriggerBossFight(World world, EntityLivingBase placer) 
	{
		sElapsedTicks = 0;
		
		if(world.isRemote) {
			return;
		}
		
		sTheBoss = new EntitySkullBoss(world);
		sTheBoss.setPosition(0d, WorldGenBossPillar.kBossSpawnHeight, 0d);
		sTheBoss.SetTarget(placer);
		world.spawnEntity(sTheBoss);
		
	}
	
	public void UpdateBossFight(World world)
	{
		sElapsedTicks++;
		
		if(sElapsedTicks >= kBossWarmupTicks)
		{
			
		}
	}
}
