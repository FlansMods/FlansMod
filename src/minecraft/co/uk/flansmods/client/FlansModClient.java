package co.uk.flansmods.client;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.world.WorldEvent;
import co.uk.flansmods.api.IControllable;
import co.uk.flansmods.common.BlockGunBox;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.GunBoxType;
import co.uk.flansmods.common.InfoType;
import co.uk.flansmods.common.driveables.DriveableType;
import co.uk.flansmods.common.driveables.EntityDriveable;
import co.uk.flansmods.common.driveables.EntityPlane;
import co.uk.flansmods.common.driveables.EntityVehicle;
import co.uk.flansmods.common.driveables.PlaneType;
import co.uk.flansmods.common.driveables.VehicleType;
import co.uk.flansmods.common.guns.GunType;
import co.uk.flansmods.common.guns.ItemGun;
import co.uk.flansmods.common.network.PacketBuyWeapon;
import co.uk.flansmods.common.teams.Gametype;
import co.uk.flansmods.common.teams.Team;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.ObfuscationReflectionHelper;

public class FlansModClient extends FlansMod
{
	public static boolean doneTutorial = false;
	
	public static boolean controlModeMouse = false; // 0 = Standard controls, 1 = Mouse
	public static int controlModeSwitchTimer = 20;
	
	public static int shootTime;
	public static int scopeTime;
	public static GunType zoomOverlay;
	public static float playerRecoil;
	public static float antiRecoil;
	public static float playerZoom = 1.0F;
	public static float newZoom = 1.0F;
	public static float lastPlayerZoom;
    
	public static float originalMouseSensitivity = 0.5F;
	public static boolean originalHideGUI = false;
	public static int originalThirdPerson = 0;
	
	public static boolean inPlane = false;
	
	public static ResourceLocation resources;
	
	public void load()
	{
		if (ABORT)
		{
			log("Failed to load dependencies! Not loading Flan's Mod.");
			return;
		}
		
		log("Loading Flan's mod.");

		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@ForgeSubscribe
	public void renderLiving(RenderPlayerEvent.Pre event)
	{
		RendererLivingEntity.NAME_TAG_RANGE = 64F;
		RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 32F;
		
		if(event.entity instanceof EntityPlayer)
		{
			GuiTeamScores.PlayerData rendering = GuiTeamScores.getPlayerData(event.entity.getEntityName());
			GuiTeamScores.PlayerData thePlayer = GuiTeamScores.getPlayerData(minecraft.thePlayer.username);
			
			Team renderingTeam = rendering == null ? Team.spectators : rendering.team.team;
			Team thePlayerTeam = thePlayer == null ? Team.spectators : thePlayer.team.team;
			
			//Spectators see all
			if(thePlayerTeam == Team.spectators)
				return;
			//Nobody sees spectators
			if(renderingTeam == Team.spectators)
			{
				event.setCanceled(true);
				return;
			}
			//If we are on the other team, don't render the name tag
			if(renderingTeam != thePlayerTeam)
			{
				RendererLivingEntity.NAME_TAG_RANGE = 0F;
				RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 0F;
				return;
			}
			//If its DM, don't render the name tag
			if(!GuiTeamScores.sortedByTeam)
			{
				RendererLivingEntity.NAME_TAG_RANGE = 0F;
				RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 0F;
				return;
			}
		}
	}

	public static void tick()
	{
		if (minecraft.thePlayer == null)
			return;
		
		if(minecraft.thePlayer.ridingEntity instanceof IControllable && minecraft.currentScreen == null)
			minecraft.displayGuiScreen(new GuiDriveableController((IControllable)minecraft.thePlayer.ridingEntity));
		// Guns
		if (shootTime > 0)
			shootTime--;
		if(scopeTime > 0)
			scopeTime--;
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

		if (Math.abs(playerZoom - lastPlayerZoom) > 1F / 64F)
		{
			try
			{
				ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, playerZoom, "cameraZoom", "Y", "field_78503_V");
			} catch (Exception e)
			{
				log("I forgot to update obfuscated reflection D:");
				throw new RuntimeException(e);
			}
		}
		lastPlayerZoom = playerZoom;
		if (minecraft.thePlayer.ridingEntity instanceof IControllable)
		{
			inPlane = true;
			try
			{
				ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, ((IControllable)minecraft.thePlayer.ridingEntity).getPlayerRoll(), "camRoll", "N", "field_78495_O");
			} catch (Exception e)
			{
				log("I forgot to update obfuscated reflection D:");
				throw new RuntimeException(e);
			}			
			if(minecraft.thePlayer.ridingEntity instanceof IControllable)
			{
				try
				{
					ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, ((IControllable)minecraft.thePlayer.ridingEntity).getCameraDistance(), "thirdPersonDistance", "A", "field_78490_B");
				} catch (Exception e)
				{
					log("I forgot to update obfuscated reflection D:");
					throw new RuntimeException(e);
				}		
			}
		}
		else if(inPlane)
		{
			try
			{
				ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, 0F, "camRoll", "N", "field_78495_O");
			} catch (Exception e)
			{
				log("I forgot to update obfuscated reflection D:");
				throw new RuntimeException(e);
			}			
			try
			{
				ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, 4.0F, "thirdPersonDistance", "A", "field_78490_B");
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
	
	@ForgeSubscribe
	public void chatMessage(ClientChatReceivedEvent event)
	{
		if(event.message.startsWith("{\"translate\":\"flanDeath."))
		{
			String[] split = event.message.split("\\.");
			split[split.length - 1] = split[split.length - 1].split("\"}")[0];
			event.setCanceled(true);
			TickHandlerClient.addKillMessage(split);
			//FMLClientHandler.instance().getClient().thePlayer.sendChatToPlayer(split[3] + " killed " + split[2] + " with a " + InfoType.getType(split[1]).name);
		}
	}
	
	@ForgeSubscribe
	public void entitySpawn(EntityJoinWorldEvent event)
	{
		/*
		if(event.entity.worldObj.isRemote && event.entity == Minecraft.getMinecraft().thePlayer)
			System.out.println(event.entity.toString());
		if(event.entity.worldObj.isRemote && event.entity instanceof EntityHorse)
			System.out.println(event.entity.toString());
		*/
	}
		
	private boolean checkFileExists(File file)
	{
		if(!file.exists())
		{
			try
			{ 
				file.createNewFile();
			}
			catch(Exception e)
			{
				FlansMod.log("Failed to create file");
				FlansMod.log(file.getAbsolutePath());
			}
			return false;
		}	
		return true;
	}

	public static boolean flipControlMode()
	{
		if (controlModeSwitchTimer > 0)
			return false;
		controlModeMouse = !controlModeMouse;
		FMLClientHandler.instance().getClient().displayGuiScreen(controlModeMouse ? new GuiDriveableController((IControllable)FMLClientHandler.instance().getClient().thePlayer.ridingEntity) : null);
		controlModeSwitchTimer = 40;
		return true;
	}

	public static void shoot()
	{
		// TODO : SMP guns
	}
	
	public static Minecraft minecraft = FMLClientHandler.instance().getClient();
}
