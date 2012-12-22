package co.uk.flansmods.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import co.uk.flansmods.common.BlockGunBox;
import co.uk.flansmods.common.EntityDriveable;
import co.uk.flansmods.common.EntityPlane;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.ItemGun;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ObfuscationReflectionHelper;

public class FlansModClient extends FlansMod
{
	public static boolean doneTutorial = false;
	
	public static boolean controlModeMouse = false; // 0 = Standard controls, 1 = Mouse
	public static int controlModeSwitchTimer = 20;
	
	public static int shootTime;
	public static String zoomOverlay;
	public static float playerRecoil;
	public static float antiRecoil;
	public static float playerZoom = 1.0F;
	public static float newZoom = 1.0F;
	public static float lastPlayerZoom;
	
	public static float originalMouseSensitivity = 0.5F;
	public static boolean originalHideGUI = false;
	public static int originalThirdPerson = 0;
	
	public static boolean inPlane = false;
	
	public void load()
	{
		if (ABORT)
		{
			log("Failed to load dependencies! Not loading Flan's Mod.");
			return;
		}
		
		log("Loading Flan's mod.");

		// Properties
		// TODO: move to common and proxy-ify
		try
		{
			File file = new File(FMLClientHandler.instance().getClient().getMinecraftDir() + "/Flan/properties.txt");
			if (file != null)
			{
				BufferedReader properties = new BufferedReader(new FileReader(file));
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
			}
		} catch (Exception e)
		{
			log("No properties file found. Using defaults.");
			createNewProperties();
		}
	}

	public static void tick()
	{
		if (minecraft.thePlayer == null)
			return;
		// Guns
		if (shootTime > 0)
			shootTime--;
		if (playerRecoil > 0)
			playerRecoil *= 0.8F;
		minecraft.thePlayer.rotationPitch -= playerRecoil;
		antiRecoil += playerRecoil;

		minecraft.thePlayer.rotationPitch += antiRecoil * 0.2F;
		antiRecoil *= 0.8F;

		Item itemInHand = null;
		ItemStack itemstackInHand = minecraft.thePlayer.inventory.getCurrentItem();
		if (itemstackInHand != null)
			itemInHand = itemstackInHand.getItem();
		if (itemInHand != null)
		{
			if (!(itemInHand instanceof ItemGun && ((ItemGun) itemInHand).type.hasScope))
			{
				newZoom = 1.0F;
			}
		}

		float dZoom = newZoom - playerZoom;
		playerZoom += dZoom / 3F;
		if (playerZoom < 1.1F && zoomOverlay != null)
		{
			minecraft.gameSettings.mouseSensitivity = originalMouseSensitivity;
			playerZoom = 1.0F;
			zoomOverlay = null;
			minecraft.gameSettings.hideGUI = originalHideGUI;
			minecraft.gameSettings.thirdPersonView = originalThirdPerson;
		}

		String field = inMCP ? "cameraZoom" : "V";
		if (Math.abs(playerZoom - lastPlayerZoom) > 1F / 64F)
		{
			try
			{
				ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, playerZoom, "cameraZoom", "X");
			} catch (Exception e)
			{
				log("I forgot to update obfuscated reflection D:");
				throw new RuntimeException(e);
			}
		}
		lastPlayerZoom = playerZoom;
		field = inMCP ? "camRoll" : "O";
		if (minecraft.thePlayer.ridingEntity instanceof EntityDriveable)
		{
			try
			{
				ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, ((EntityDriveable)minecraft.thePlayer.ridingEntity).axes.getRoll(), "camRoll", "O");
			} catch (Exception e)
			{
				log("I forgot to update obfuscated reflection D:");
				throw new RuntimeException(e);
			}			
			if(!inPlane && minecraft.thePlayer.ridingEntity instanceof EntityPlane)
			{
				try
				{
					ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, ((EntityPlane)minecraft.thePlayer.ridingEntity).getPlaneType().cameraDistance, "thirdPersonDistance", "B");
				} catch (Exception e)
				{
					log("I forgot to update obfuscated reflection D:");
					throw new RuntimeException(e);
				}		
				inPlane = true;
			}
		}
		else if(inPlane)
		{
			try
			{
				ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, 0F, "camRoll", "O");
			} catch (Exception e)
			{
				log("I forgot to update obfuscated reflection D:");
				throw new RuntimeException(e);
			}			
			try
			{
				ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, 4.0F, "thirdPersonDistance", "B");
			} catch (Exception e)
			{
				log("I forgot to update obfuscated reflection D:");
				throw new RuntimeException(e);
			}	
			inPlane = false;
		}
		if (controlModeSwitchTimer > 0)
			controlModeSwitchTimer--;
		if (errorStringTimer > 0)
			errorStringTimer--;
	}

	public static void flipControlMode()
	{
		if (controlModeSwitchTimer > 0)
			return;
		controlModeMouse = !controlModeMouse;
		controlModeSwitchTimer = 40;
	}

	public static void shoot()
	{
		// TODO : SMP guns
	}

	public static void buyGun(BlockGunBox box, int gun)
	{
		// TODO : SMP gun boxes
	}

	public static void buyAmmo(BlockGunBox box, int ammo)
	{
		// TODO : SMP gun boxes
	}
	
	private void doPropertyStuff(File file)
	{
		
	}

	private void readProperties(String[] split, BufferedReader file)
	{
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

	private void createNewProperties()
	{
		try
		{
			FileOutputStream propsOut = new FileOutputStream(new File(FMLClientHandler.instance().getClient().getMinecraftDir() + "/Flan/properties.txt"));
			propsOut.write(("Explosions True\r\nBombs True\r\nBullets True").getBytes());
			propsOut.close();
		} catch (Exception e)
		{
			log("Failed to write default properties");
			e.printStackTrace();
		}
	}

	public static Minecraft minecraft = FMLClientHandler.instance().getClient();
}
