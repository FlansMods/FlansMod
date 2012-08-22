package flansmod.minecraft;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.src.*;
import net.minecraft.src.PlayerAPI;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import flansmod.common.AAGunType;
import flansmod.common.BlockGunBox;
import flansmod.common.BlockPlaneWorkbench;
import flansmod.common.BulletType;
import flansmod.common.CommonProxy;
import flansmod.common.EntityAAGun;
import flansmod.common.EntityBullet;
import flansmod.common.EntityMG;
import flansmod.common.EntityPlane;
import flansmod.common.EntityVehicle;
import flansmod.common.FlansMod;
import flansmod.common.GunBoxType;
import flansmod.common.GunType;
import flansmod.common.ItemAAGun;
import flansmod.common.ItemBlockManyNames;
import flansmod.common.ItemBullet;
import flansmod.common.ItemGun;
import flansmod.common.ItemPart;
import flansmod.common.ItemPlane;
import flansmod.common.ItemVehicle;
import flansmod.common.PartType;
import flansmod.common.PlaneType;
import flansmod.common.TypeType;
import flansmod.common.VehicleType;

public class ClientProxy extends CommonProxy 
{
	public void load()
	{
		if(ABORT)
		{
			log("Failed to load dependencies! Not loading Flan's Mod.");
			return;
		}
		log("Loading Flan's mod.");
		
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
		
		//Bullets / Bombs
		MinecraftForgeClient.preloadTexture("/spriteSheets/bullets.png");
		RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, new RenderBullet());   
		for(BulletType type : BulletType.bullets)
		{
			try
			{
				java.awt.image.BufferedImage bufferedimage = ModLoader.loadImage(minecraft.renderEngine, type.iconPath);
				CustomModTextureStatic modtexturestatic = new CustomModTextureStatic("/spriteSheets/bullets.png", type.iconIndex, bufferedimage);
				minecraft.renderEngine.registerTextureFX(modtexturestatic);
			}
			catch(Exception e)
			{
				log("Failed to override bullet icon");
				e.printStackTrace();
			}
		}
		log("Loaded bullet icons.");
		
		//Guns
		MinecraftForgeClient.preloadTexture("/spriteSheets/guns.png");
		for(GunType type : GunType.guns)
		{
			try
			{
				java.awt.image.BufferedImage bufferedimage = ModLoader.loadImage(minecraft.renderEngine, type.iconPath);
				CustomModTextureStatic modtexturestatic = new CustomModTextureStatic("/spriteSheets/guns.png", type.iconIndex, bufferedimage);
				minecraft.renderEngine.registerTextureFX(modtexturestatic);
			}
			catch(Exception e)
			{
				log("Failed to override gun icon");
				e.printStackTrace();
			}
		}
		log("Loaded gun icons.");
		
		//Parts
		MinecraftForgeClient.preloadTexture("/spriteSheets/parts.png");
		for(PartType type : PartType.parts)
		{
			try
			{
				java.awt.image.BufferedImage bufferedimage = ModLoader.loadImage(minecraft.renderEngine, type.iconPath);
				CustomModTextureStatic modtexturestatic = new CustomModTextureStatic("/spriteSheets/parts.png", type.iconIndex, bufferedimage);
				minecraft.renderEngine.registerTextureFX(modtexturestatic);
			}
			catch(Exception e)
			{
				log("Failed to override part icon");
				e.printStackTrace();
			}
		}
		log("Loaded part icons.");
		
		//Planes
		MinecraftForgeClient.preloadTexture("/spriteSheets/planes.png");
		RenderingRegistry.registerEntityRenderingHandler(EntityPlane.class, new RenderPlane());  
		for(PlaneType type : PlaneType.types)
		{
			try
			{
				java.awt.image.BufferedImage bufferedimage = ModLoader.loadImage(minecraft.renderEngine, type.iconPath);
				CustomModTextureStatic modtexturestatic = new CustomModTextureStatic("/spriteSheets/planes.png", type.iconIndex, bufferedimage);
				minecraft.renderEngine.registerTextureFX(modtexturestatic);
			}
			catch(Exception e)
			{
				log("Failed to override plane icon");
				e.printStackTrace();
			}
		}
		log("Loaded plane icons.");
		
		//AAGuns
		RenderingRegistry.registerEntityRenderingHandler(EntityAAGun.class, new RenderAAGun());  
		for(AAGunType type : AAGunType.types)
		{
			try
			{
				java.awt.image.BufferedImage bufferedimage = ModLoader.loadImage(minecraft.renderEngine, type.iconPath);
				CustomModTextureStatic modtexturestatic = new CustomModTextureStatic("/spriteSheets/planes.png", type.iconIndex, bufferedimage);
				minecraft.renderEngine.registerTextureFX(modtexturestatic);
			}
			catch(Exception e)
			{
				log("Failed to override AAGun icon");
				e.printStackTrace();
			}
		}
		log("Loaded AA gun icons.");	
		
		//Vehicles
		RenderingRegistry.registerEntityRenderingHandler(EntityVehicle.class, new RenderVehicle());  
		for(VehicleType type : VehicleType.types)
		{
			try
			{
				java.awt.image.BufferedImage bufferedimage = ModLoader.loadImage(minecraft.renderEngine, type.iconPath);
				CustomModTextureStatic modtexturestatic = new CustomModTextureStatic("/spriteSheets/vehicles.png", type.iconIndex, bufferedimage);
				minecraft.renderEngine.registerTextureFX(modtexturestatic);
			}
			catch(Exception e)
			{
				log("Failed to override vehicle icon");
				e.printStackTrace();
			}
		}
		log("Loaded vehicle icons.");	
		
		//Gun Boxes
		MinecraftForgeClient.preloadTexture("/spriteSheets/gunBoxes.png");
		for(GunBoxType type : GunBoxType.boxes)
		{
			try
			{
				if(type.topTextureIndex != 0)
				{
					java.awt.image.BufferedImage bufferedimage = ModLoader.loadImage(minecraft.renderEngine, type.topTexturePath);
					CustomModTextureStatic modtexturestatic = new CustomModTextureStatic("/spriteSheets/gunBoxes.png", type.topTextureIndex, bufferedimage);
					minecraft.renderEngine.registerTextureFX(modtexturestatic);
				}
				
				java.awt.image.BufferedImage bufferedimage1 = ModLoader.loadImage(minecraft.renderEngine, type.sideTexturePath);
				CustomModTextureStatic modtexturestatic1 = new CustomModTextureStatic("/spriteSheets/gunBoxes.png", type.sideTextureIndex, bufferedimage1);
				minecraft.renderEngine.registerTextureFX(modtexturestatic1);
				
				if(type.bottomTextureIndex != 1)
				{
					java.awt.image.BufferedImage bufferedimage2 = ModLoader.loadImage(minecraft.renderEngine, type.bottomTexturePath);
					CustomModTextureStatic modtexturestatic2 = new CustomModTextureStatic("/spriteSheets/gunBoxes.png", type.bottomTextureIndex, bufferedimage2);
					minecraft.renderEngine.registerTextureFX(modtexturestatic2);
				}
			}
			catch(Exception e)
			{
				log("Failed to override gun box texture");
				e.printStackTrace();
			}
		}
		log("Loaded gun box textures.");		
	}
	
    public boolean onTickInGame(float f, Minecraft minecraft)
	{
		if(zoomOverlay != null && ModLoader.isGUIOpen(null))
		{
		    ScaledResolution scaledresolution = new ScaledResolution(minecraft.gameSettings, minecraft.displayWidth, minecraft.displayHeight);
			int i = scaledresolution.getScaledWidth();
			int j = scaledresolution.getScaledHeight();
			minecraft.entityRenderer.setupOverlayRendering();
			GL11.glEnable(3042 /*GL_BLEND*/);
			GL11.glDisable(2929 /*GL_DEPTH_TEST*/);
			GL11.glDepthMask(false);
			GL11.glBlendFunc(770, 771);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			GL11.glDisable(3008 /*GL_ALPHA_TEST*/);
			GL11.glBindTexture(3553 /*GL_TEXTURE_2D*/, minecraft.renderEngine.getTexture("/gui/" + zoomOverlay + ".png"));
			Tessellator tessellator = Tessellator.instance;
			tessellator.startDrawingQuads();
			tessellator.addVertexWithUV(i / 2 - 2 * j, j, -90D, 0.0D, 1.0D);
			tessellator.addVertexWithUV(i / 2 + 2 * j, j , -90D, 1.0D, 1.0D);
			tessellator.addVertexWithUV(i / 2 + 2 * j, 0.0D, -90D, 1.0D, 0.0D);
			tessellator.addVertexWithUV(i / 2 - 2 * j, 0.0D, -90D, 0.0D, 0.0D);
			tessellator.draw();
			GL11.glDepthMask(true);
			GL11.glEnable(2929 /*GL_DEPTH_TEST*/);
			GL11.glEnable(3008 /*GL_ALPHA_TEST*/);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
		if(errorString != null && errorStringTimer > 0)
		{
		    ScaledResolution scaledresolution = new ScaledResolution(minecraft.gameSettings, minecraft.displayWidth, minecraft.displayHeight);
			int i = scaledresolution.getScaledWidth();
			int j = scaledresolution.getScaledHeight();
			GL11.glEnable(3042 /*GL_BLEND*/);
			GL11.glDisable(2929 /*GL_DEPTH_TEST*/);
			GL11.glDepthMask(false);
			GL11.glBlendFunc(770, 771);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			GL11.glDisable(3008 /*GL_ALPHA_TEST*/);
			GL11.glBindTexture(3553 /*GL_TEXTURE_2D*/, minecraft.renderEngine.getTexture("/gui/gui.png"));
			Tessellator tessellator = Tessellator.instance;
			tessellator.startDrawingQuads();
			tessellator.addVertexWithUV(0, 20, -90D, 0D, 66D / 256D);
			tessellator.addVertexWithUV(200, 20 , -90D, 200D / 256D, 66D / 256D);
			tessellator.addVertexWithUV(200, 0D, -90D, 200D / 256D, 46D / 256D);
			tessellator.addVertexWithUV(0, 0D, -90D, 0D, 46D / 256D);
			tessellator.draw();
			GL11.glDepthMask(true);
			GL11.glEnable(2929 /*GL_DEPTH_TEST*/);
			GL11.glEnable(3008 /*GL_ALPHA_TEST*/);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			minecraft.fontRenderer.drawString(errorString, 6, 6, 0x404040);
		}
		return false;
	}
	
	private void tick(Minecraft minecraft, boolean inGUI)
	{
		//Guns
		if(shootTime > 0)
			shootTime--;
		if(playerRecoil > 0)
			playerRecoil *= 0.8F;
		minecraft.thePlayer.rotationPitch -= playerRecoil;
		antiRecoil += playerRecoil;
		
		minecraft.thePlayer.rotationPitch += antiRecoil * 0.2F;
		antiRecoil *= 0.8F;
		
		Item itemInHand = null;
		ItemStack itemstackInHand = minecraft.thePlayer.inventory.getCurrentItem();
		if(itemstackInHand != null)
			itemInHand = itemstackInHand.getItem();
		if(itemInHand != null)
		{
			if(!(itemInHand instanceof ItemGun && ((ItemGun)itemInHand).type.hasScope))
			{
				newZoom = 1.0F;
			}
		}
		
		float dZoom = newZoom - playerZoom;
		playerZoom += dZoom / 3F;
		if(playerZoom < 1.1F && zoomOverlay != null)
		{
			minecraft.gameSettings.mouseSensitivity = originalMouseSensitivity;
			playerZoom = 1.0F;
			zoomOverlay = null;
			minecraft.gameSettings.hideGUI = originalHideGUI;
		}
			
		String field = inMCP ? "cameraZoom" : "V";
		if(Math.abs(playerZoom - lastPlayerZoom) > 1F / 64F)
		{
			try
			{
				ModLoader.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, field, playerZoom);
			}
			catch(Exception e)
			{
				log("I forgot to update obfuscated reflection D:");
				throw new RuntimeException(e);
			}
		}
		lastPlayerZoom = playerZoom;
		field = inMCP ? "camRoll" : "O";
		if(controlMode == 1 && minecraft.thePlayer.ridingEntity != null && minecraft.thePlayer.ridingEntity instanceof EntityPlane)
		{
			EntityPlane plane = (EntityPlane)minecraft.thePlayer.ridingEntity;
			try
			{
				ModLoader.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, field, plane.axes.getRoll());
			}
			catch(Exception e)
			{
				log("I forgot to update obfuscated reflection D:");
				throw new RuntimeException(e);
			}
			lastRoll = plane.axes.getRoll();
		}
		else if(Math.abs(lastRoll) > 0.01F)
		{
			try
			{
				ModLoader.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, field, 0.0F);
			}
			catch(Exception e)
			{
				log("I forgot to update obfuscated reflection D:");
				throw new RuntimeException(e);
			}
			lastRoll = 0.0F;
		}
		
		//If the player has gotten into or out of a plane, change the third person distance
		boolean playerInPlaneNow = minecraft.thePlayer.ridingEntity != null && minecraft.thePlayer.ridingEntity instanceof EntityPlane;
		float newDistance = 4.0F;
		if(!playerInPlane && playerInPlaneNow)
		{ 
			newDistance = ((EntityPlane)minecraft.thePlayer.ridingEntity).type.cameraDistance;
		}
		field = inMCP ? "thirdPersonDistance" : "B";
		if(playerInPlane != playerInPlaneNow)
		{
			try
			{
				ModLoader.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, field, newDistance);
			}
			catch(Exception e)
			{
				log("I forgot to update obfuscated reflection D:");
				throw new RuntimeException(e);
			}
		}
		playerInPlane = playerInPlaneNow;
		
		if(controlModeSwitchTimer > 0)
			controlModeSwitchTimer--;
		if(errorStringTimer > 0)
			errorStringTimer--;
	}
	
	public static void setControlMode(int i)
	{
		if(controlModeSwitchTimer > 0)
			return;
		controlMode = i;
		controlModeSwitchTimer = 40;
	}
		
	public static void log(String s)
	{
		//TODO : Make better logger
		System.out.println("Flan's Mod : " + s);
	}
	
	public static void logQuietly(String s)
	{
		//TODO : Log dis.
	}
	
	public static void logLoudly(String s)
	{
		errorString = s;
		errorStringTimer = 100;
		System.out.println("SERIOUS PROBLEM!");
		System.out.println("Flan's Mod : " + s);
	}
	
	public static void shoot()
	{
		//TODO : SMP guns
	}
	
	public static void buyGun(BlockGunBox box, int gun)
	{
		//TODO : SMP gun boxes
	}
	
	public static void buyAmmo(BlockGunBox box, int ammo)
	{
		//TODO : SMP gun boxes
	}

	public GuiScreen getClientGui(int ID, EntityPlayer player, World world, int x, int y, int z)	
	{
		return null;
	}
	
	public void readProperties(String[] split, BufferedReader file)
	{
		try 
		{
			if(split[0].equals("Accelerate"))
				accelerateKey = Keyboard.getKeyIndex(split[1]);
			if(split[0].equals("Decelerate"))
				decelerateKey = Keyboard.getKeyIndex(split[1]);
			if(split[0].equals("Left"))
				leftKey = Keyboard.getKeyIndex(split[1]);
			if(split[0].equals("Right"))
				rightKey = Keyboard.getKeyIndex(split[1]);
			if(split[0].equals("Up"))
				upKey = Keyboard.getKeyIndex(split[1]);
			if(split[0].equals("Down"))
				downKey = Keyboard.getKeyIndex(split[1]);
			if(split[0].equals("Exit"))
				exitKey = Keyboard.getKeyIndex(split[1]);
			if(split[0].equals("Inventory"))
				inventoryKey = Keyboard.getKeyIndex(split[1]);
			if(split[0].equals("Bomb"))
				bombKey = Keyboard.getKeyIndex(split[1]);
			if(split[0].equals("Shoot"))
				gunKey = Keyboard.getKeyIndex(split[1]);
			if(split[0].equals("ControlSwitch"))
				controlSwitchKey = Keyboard.getKeyIndex(split[1]);
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
			propsOut.write(("Accelerate W\r\nDecelerate S\r\nLeft A\r\nRight D\r\nUp SPACE\r\nDown LSHIFT\r\nExit E\r\nInventory R\r\nBomb V\r\nGun LCONTROL\r\nControlSwitch C\r\nExplosions True\r\nBombs True\r\nBullets True").getBytes());
			propsOut.close();
		}
		catch(Exception e)
		{
			log("Failed to write default properties");
			e.printStackTrace();
		}
	}
		
	private static final boolean DEBUG = false;
	private static Minecraft minecraft = FMLClientHandler.instance().getClient();
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
}

