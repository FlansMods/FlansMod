package com.flansmod.apocalypse.common;

import java.util.Random;

import com.flansmod.apocalypse.common.blocks.BlockPowerCube;
import com.flansmod.apocalypse.common.blocks.BlockStatic;
import com.flansmod.apocalypse.common.blocks.BlockSulphur;
import com.flansmod.apocalypse.common.blocks.BlockSulphuricAcid;
import com.flansmod.apocalypse.common.blocks.TileEntityPowerCube;
import com.flansmod.apocalypse.common.world.WorldProviderApocalypse;
import com.flansmod.common.BlockItemHolder;
import com.flansmod.common.CreativeTabFlan;
import com.flansmod.common.FlansMod;
import com.flansmod.common.ItemHolderType;
import com.flansmod.common.TileEntityItemHolder;
import com.flansmod.common.parts.PartType;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = FlansModApocalypse.MODID, name = "Flan's Mod: Apocalypse", version = FlansModApocalypse.VERSION, acceptableRemoteVersions = "@APOCALYPSEALLOWEDVERSIONS@", dependencies = "required-after:" + FlansMod.MODID)//, guiFactory = "com.flansmod.client.gui.config.ModGuiFactory")
public class FlansModApocalypse 
{
	//Core mod stuff
	public static boolean DEBUG = false;
	public static final String MODID = "flansmodapocalypse";
	public static final String VERSION = "1.0";

	@Instance(MODID)
	public static FlansModApocalypse INSTANCE;
	@SidedProxy(clientSide = "com.flansmod.apocalypse.client.ClientProxyApocalypse", serverSide = "com.flansmod.apocalypse.common.CommonProxyApocalypse")
	public static CommonProxyApocalypse proxy;
	
	//Config options
	public static Configuration configFile;
	/** The time it takes between an AI chip being activated and the apocalypse happening (in ticks) */
	public static int apocalypseCountdownLength = 469;
	public static int SURVIVOR_RARITY = 450;
	public static int WANDERING_SURVIVOR_RARITY = 2500;
	public static int SKELETON_RARITY = 50;
	public static int DEAD_TREE_RARITY = 100;
	public static int VEHICLE_RARITY = 2000;
	public static int AIRPORT_RARITY = 125;
	public static int DYE_FACTORY_RARITY = 800;
	public static int LAB_RARITY = 100;
	/** The distance between where the player left the overworld, and where they return */
	public static int RETURN_RADIUS = 100;
	/** How far from their death point does the player respawn? */
	public static int SPAWN_RADIUS = 100;
	/** Who gets teleported to the apocalypse when a player places a mecha? */
	public static TeleportOption OPTION = TeleportOption.PLACER_ONLY;
	
	public static int dimensionID;
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
	
	public static CreativeTabFlan tabApocalypse = new CreativeTabFlan(5);
	
	//References to apocalypse specific items and blocks:
	public static BlockItemHolder skeleton, slumpedSkeleton, gunRack;

	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//Load config
		configFile = new Configuration(event.getSuggestedConfigurationFile());
		syncConfig();
		
		//Custom apoclypse defined items and blocks
		
		//Sulphur block and item
		blockSulphur = new BlockSulphur().setUnlocalizedName("blockSulphur").setStepSound(Block.soundTypeSand).setCreativeTab(tabApocalypse);
		GameRegistry.registerBlock(blockSulphur, "blockSulphur");
		sulphur = new Item().setUnlocalizedName("flanSulphur").setCreativeTab(tabApocalypse);
		GameRegistry.registerItem(sulphur, "flanSulphur", MODID);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.gunpowder), new ItemStack(Blocks.sand), new ItemStack(sulphur));
		
		//Sulphuric acid
		sulphuricAcid = new Fluid("sulphuricAcid", sulphuricAcidStill, sulphuricAcidFlowing).setTemperature(300).setViscosity(800);
		FluidRegistry.registerFluid(sulphuricAcid);
		blockSulphuricAcid = new BlockSulphuricAcid(sulphuricAcid, Material.water).setUnlocalizedName("blockSulphuricAcid").setCreativeTab(tabApocalypse);
		sulphuricAcid.setBlock(blockSulphuricAcid);
		GameRegistry.registerBlock(blockSulphuricAcid, "blockSulphuricAcid");
		sulphuricAcid.setUnlocalizedName(blockSulphuricAcid.getUnlocalizedName());
		
		//Laboratory Stone
		blockLabStone = new BlockStatic(Material.rock).setHardness(3F).setResistance(5F).setUnlocalizedName("labStone").setCreativeTab(tabApocalypse);
		GameRegistry.registerBlock(blockLabStone, "labStone");
		
		//Power Cube
		blockPowerCube = new BlockPowerCube(Material.circuits).setUnlocalizedName("powerCube").setHardness(3F).setResistance(5F).setCreativeTab(tabApocalypse);
		GameRegistry.registerBlock(blockPowerCube, "powerCube");
		GameRegistry.registerTileEntity(TileEntityPowerCube.class, "powerCube");
		
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init(event);
		dimensionID = DimensionManager.getNextFreeDimId();
		DimensionManager.registerProviderType(dimensionID, WorldProviderApocalypse.class, true);
		DimensionManager.registerDimension(dimensionID, dimensionID);
		

		
		//Grab references to apocalypse specific items and blocks here:
		if(ItemHolderType.getItemHolder("flanSkeleton") != null)
		{
			skeleton = ItemHolderType.getItemHolder("flanSkeleton").block;
			skeleton.setCreativeTab(tabApocalypse);
		}
		if(ItemHolderType.getItemHolder("flanSkeleton2") != null)
		{
			slumpedSkeleton = ItemHolderType.getItemHolder("flanSkeleton2").block;
			slumpedSkeleton.setCreativeTab(tabApocalypse);
		}
		if(ItemHolderType.getItemHolder("flanGunRack") != null)
		{
			gunRack = ItemHolderType.getItemHolder("flanGunRack").block;
			gunRack.setCreativeTab(tabApocalypse);
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
		SURVIVOR_RARITY = 			configFile.getInt("Survivor Rarity", Configuration.CATEGORY_GENERAL, SURVIVOR_RARITY, 1, Integer.MAX_VALUE, "Rarity of survivor entities spawned during world creation");
		WANDERING_SURVIVOR_RARITY = configFile.getInt("Wandering Survivor Rarity", Configuration.CATEGORY_GENERAL, WANDERING_SURVIVOR_RARITY, 1, Integer.MAX_VALUE, "Rarity of survivor entities spawned at night");
		SKELETON_RARITY = 			configFile.getInt("Skeleton Rarity", Configuration.CATEGORY_GENERAL, SKELETON_RARITY, 1, Integer.MAX_VALUE, "Rarity of buried skeletons");
		DEAD_TREE_RARITY = 			configFile.getInt("Dead Tree Rarity", Configuration.CATEGORY_GENERAL, DEAD_TREE_RARITY, 1, Integer.MAX_VALUE, "Rarity of dead trees");
		VEHICLE_RARITY = 			configFile.getInt("Vehicle Rarity", Configuration.CATEGORY_GENERAL, VEHICLE_RARITY, 1, Integer.MAX_VALUE, "Rarity of broken vehicles");
		AIRPORT_RARITY = 			configFile.getInt("Airport Rarity", Configuration.CATEGORY_GENERAL, AIRPORT_RARITY, 1, Integer.MAX_VALUE, "Rarity of airstrips");
		DYE_FACTORY_RARITY = 		configFile.getInt("Dye Factory Rarity", Configuration.CATEGORY_GENERAL, DYE_FACTORY_RARITY, 1, Integer.MAX_VALUE, "Rarity of dye factories");
		LAB_RARITY = 				configFile.getInt("Lab Rarity", Configuration.CATEGORY_GENERAL, LAB_RARITY, 1, Integer.MAX_VALUE, "Rarity of the research lab");
		RETURN_RADIUS = 			configFile.getInt("Return Radius", Configuration.CATEGORY_GENERAL, RETURN_RADIUS, 1, Integer.MAX_VALUE, "The distance away from your initial AI mecha that your return portal appears");
		SPAWN_RADIUS = 				configFile.getInt("Spawn Radius", Configuration.CATEGORY_GENERAL, SPAWN_RADIUS, 1, Integer.MAX_VALUE, "The distance from your deathpoint that you respawn in the apocalypse");
		OPTION = 					TeleportOption.getOption(configFile.getString("Option", Configuration.CATEGORY_GENERAL, OPTION.toString(), "Who gets teleported to the apocalypse with a player (One of PLACER_ONLY, DIM, DIM_OPT_IN, NEARBY, NEARBY_OPT_IN)"));

		if(configFile.hasChanged())
			configFile.save();
	}
	
	public static enum TeleportOption
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
