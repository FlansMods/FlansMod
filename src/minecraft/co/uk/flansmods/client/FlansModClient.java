package co.uk.flansmods.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import co.uk.flansmods.common.AAGunType;
import co.uk.flansmods.common.BlockGunBox;
import co.uk.flansmods.common.BulletType;
import co.uk.flansmods.common.EntityAAGun;
import co.uk.flansmods.common.EntityBullet;
import co.uk.flansmods.common.EntityPlane;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.GunBoxType;
import co.uk.flansmods.common.GunType;
import co.uk.flansmods.common.ItemGun;
import co.uk.flansmods.common.PartType;
import co.uk.flansmods.common.PlaneType;

import net.minecraft.client.Minecraft;
import net.minecraft.src.*;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class FlansModClient extends FlansMod
{
	public static boolean doneTutorial = false;
	
	public static int controlMode = 0; // 0 = Standard controls, 1 = Mouse
	public static int controlModeSwitchTimer = 20;
	
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
		}

		String field = inMCP ? "cameraZoom" : "V";
		if (Math.abs(playerZoom - lastPlayerZoom) > 1F / 64F)
		{
			try
			{
				ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, playerZoom, "cameraZoom", "V");
			} catch (Exception e)
			{
				log("I forgot to update obfuscated reflection D:");
				throw new RuntimeException(e);
			}
		}
		lastPlayerZoom = playerZoom;
		field = inMCP ? "camRoll" : "O";

		if (controlModeSwitchTimer > 0)
			controlModeSwitchTimer--;
		if (errorStringTimer > 0)
			errorStringTimer--;
	}

	public static void setControlMode(int i)
	{
		if (controlModeSwitchTimer > 0)
			return;
		controlMode = i;
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
