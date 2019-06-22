package com.flansmod.apocalypse.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.DimensionType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
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
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.flansmod.apocalypse.common.blocks.BlockPowerCube;
import com.flansmod.apocalypse.common.blocks.BlockStatic;
import com.flansmod.apocalypse.common.blocks.BlockSulphur;
import com.flansmod.apocalypse.common.blocks.BlockSulphuricAcid;
import com.flansmod.apocalypse.common.blocks.TileEntityPowerCube;
import com.flansmod.apocalypse.common.world.BiomeApocalypse;
import com.flansmod.apocalypse.common.world.WorldProviderApocalypse;
import com.flansmod.common.BlockItemHolder;
import com.flansmod.common.CreativeTabFlan;
import com.flansmod.common.FlansMod;
import com.flansmod.common.ItemHolderType;
import com.flansmod.common.parts.PartType;

@Mod(modid = FlansModApocalypse.MODID, name = "Flan's Mod: Apocalypse", version = FlansModApocalypse.VERSION, acceptableRemoteVersions = "@ALLOWED_VERSIONS_APOCALYPSE@", dependencies = "required-after:" + FlansMod.MODID)
//, guiFactory = "com.flansmod.client.gui.config.ModGuiFactory")
public class FlansModApocalypse
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
	public static int SURVIVOR_RARITY = 450;
	public static int WANDERING_SURVIVOR_RARITY = 2500;
	public static int SKELETON_RARITY = 50;
	public static int DEAD_TREE_RARITY = 100;
	public static int VEHICLE_RARITY = 2000;
	public static int AIRPORT_RARITY = 125;
	public static int DYE_FACTORY_RARITY = 800;
	public static int LAB_RARITY = 100;
	/**
	 * The distance between where the player left the overworld, and where they return
	 */
	public static int RETURN_RADIUS = 100;
	/**
	 * How far from their death point does the player respawn?
	 */
	public static int SPAWN_RADIUS = 100;
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
		ingredients.add(Ingredient.fromStacks(new ItemStack(Blocks.SAND)));
		ingredients.add(Ingredient.fromStacks(new ItemStack(sulphur)));
		
		event.getRegistry().register(new ShapelessRecipes("FlansModApocalypse", new ItemStack(Items.GUNPOWDER), ingredients).setRegistryName("GunpowderFromSulphur"));
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(INSTANCE);
		
		//Load config
		configFile = new Configuration(event.getSuggestedConfigurationFile());
		syncConfig();
		
		//Custom apoclypse defined items and blocks
		
		//Sulphur block and item
		// TODO: [1.12] .setStepSound(Block.soundTypeSand)
		blockSulphur = new BlockSulphur().setTranslationKey("blockSulphur").setRegistryName("blockSulphur").setCreativeTab(tabApocalypse);
		sulphur = new Item().setTranslationKey("flanSulphur").setRegistryName("flanSulphur").setCreativeTab(tabApocalypse);
		
		itemBlockSulphur = new ItemBlock(blockSulphur).setTranslationKey("blockSulphur").setRegistryName("itemBlockSulphur").setCreativeTab(tabApocalypse);
		
		//Sulphuric acid
		sulphuricAcid = new Fluid("sulphuricAcid", sulphuricAcidStill, sulphuricAcidFlowing).setTemperature(300).setViscosity(800);
		if(FluidRegistry.registerFluid(sulphuricAcid))
		{
			blockSulphuricAcid = new BlockSulphuricAcid(sulphuricAcid, Material.WATER).setTranslationKey("blockSulphuricAcid").setRegistryName("blockSulphuricAcid").setCreativeTab(tabApocalypse);
			sulphuricAcid.setBlock(blockSulphuricAcid);
			sulphuricAcid.setUnlocalizedName(blockSulphuricAcid.getTranslationKey());
			FluidRegistry.addBucketForFluid(sulphuricAcid);
		}
		else
		{
			sulphuricAcid = FluidRegistry.getFluid("sulphuricAcid");
			blockSulphuricAcid = sulphuricAcid.getBlock();
		}
		
		//Laboratory Stone
		blockLabStone = new BlockStatic(Material.ROCK).setHardness(3F).setResistance(5F).setTranslationKey("labStone").setRegistryName("labStone").setCreativeTab(tabApocalypse);
		itemBlockLabStone = new ItemBlock(blockLabStone).setTranslationKey("labStone").setRegistryName("itemBlockLabStone").setCreativeTab(tabApocalypse);
		
		//Power Cube
		blockPowerCube = new BlockPowerCube(Material.CIRCUITS).setTranslationKey("powerCube").setRegistryName("powerCube").setHardness(3F).setResistance(5F).setCreativeTab(tabApocalypse);
		itemBlockPowerCube = new ItemBlock(blockPowerCube).setTranslationKey("powerCube").setRegistryName("itemBlockPowerCube").setCreativeTab(tabApocalypse);
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
		
		lootGenerator = new FlansModLootGenerator();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
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
}
