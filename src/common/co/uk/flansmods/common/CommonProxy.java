package co.uk.flansmods.common;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.lwjgl.input.Keyboard;

import co.uk.flansmods.client.GuiPlaneMenu;
import co.uk.flansmods.client.KeyInputHandler;
import co.uk.flansmods.common.network.FlanPacketCommon;
import co.uk.flansmods.common.network.PacketBreakSound;
import co.uk.flansmods.common.network.PacketParticleSpawn;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.network.PacketDispatcher;

import net.minecraft.src.*;

public class CommonProxy
{
	public void load()
	{
		
	}
	
	// BEGIN ABRAR EDITS --------------------------------------
	
	public List<File> getContentList(Method method, ClassLoader classloader)
	{
		// this stuff is only done client side.
		List<File> contentPacks = new ArrayList<File>();
		for (File file : FlansMod.flanDir.listFiles())
		{
			if (file.isDirectory())
			{
				// Add the images to the classpath so they can be loaded
				FlansMod.log("Not client. images and models skipped.");
				// Add the directory to the content pack list
				FlansMod.log("Loaded content pack : " + file.getName());
				contentPacks.add(file);
			}
		}
		FlansMod.log("Loaded textures and models.");
		return contentPacks;
	}
	
	public void loadDefaultGraphics()
	{
		FlansMod.log("Not client. Graphic loading skipped.");
	}
	
	public void loadContentPackGraphics(Method method, ClassLoader classloader)
	{
		FlansMod.log("Not client. ContentPack graphic loading skipped.");
	}
	
	public void loadKeyBindings()
	{
		FlansMod.log("Not client. Key Bindings skipped.");
	}
	
	public void doTutorialStuff(EntityPlayer player, EntityDriveable entityType)
	{
		// FlansMod.log("Tutorial skipped on server");
	}
	
	public void changeControlMode(EntityPlayer player)
	{
	}
	
	// --------------- END ABRAR EDITS ----------------------
	
	public boolean mouseControlEnabled()
	{
		return false;
	}
	
	// ------------------ PACKET SENDING OR NOT -------------
	
	public void playBlockBreakSound(int x, int y, int z, int blockID)
	{
		PacketDispatcher.sendPacketToAllPlayers(PacketBreakSound.buildBreakSoundPacket(x, y, z, blockID));
	}
	
	public void spawnParticle(String type, double x1, double y1, double z1, double x2, double y2, double z2, int number)
	{
		PacketDispatcher.sendPacketToAllPlayers(PacketParticleSpawn.buildParticleSpawnPacket(type, x1, y1, z1, x2, y2, z2, number));
	}
	
	// ---------------END PACKET SENDING OR NOT -------------	

	public void doTickStuff()
	{
		// overriden in client
	}

	/**
	 * Gets the client GUI element from ClientProxy.
	 * @param ID
	 * @param player
	 * @param world
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public Object getClientGui(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		return null;
	}

	public Container getServerGui(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		switch(ID) 
		{
			case 0: return new ContainerPlaneCrafting(player.inventory, world, x, y, z, false);
			case 1: return new ContainerPlaneCrafting(player.inventory, world, x, y, z, true);
			case 2: return new ContainerVehicleCrafting(player.inventory, world, x, y, z);
			case 3: return new ContainerPlaneMenu(player.inventory, world);
			case 4: return new ContainerPlaneMenu(player.inventory, world, true, (EntityDriveable)player.ridingEntity);
		}
		return null;
	}

	public Object loadBulletModel(String[] split, String shortName)
	{
		return null;
	}

	public Object loadMGModel(String[] split, String shortName)
	{
		return null;
	}

	public Object loadAAGunModel(String[] split, String shortName)
	{
	
		return null;
	}

	public Object loadVehicleModel(String[] split, String shortName)
	{
		return null;
	}
	
	public Object loadPlaneModel(String[] split, String shortName)
	{
		return null;
	}
	
	public void shootAAGun(World world, double posX, double posY, double posZ, AAGunType type, float gunYaw, float gunPitch, Random rand, BulletType bullet, EntityAAGun entity, Entity player)
	{
	}
	
	public void shootVehicle(World world, double posX, double posY, double posZ, VehicleType type, VehicleData data, EntityPassengerSeat seat, EntityVehicle entity, RotatedAxes axes, EntityPlayer player)
	{
	}
	
	public boolean isThePlayer(EntityPlayer player)
	{
		return false;
	}
}