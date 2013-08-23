package co.uk.flansmods.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipFile;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;

import org.lwjgl.input.Keyboard;

import co.uk.flansmods.client.debug.EntityDebugVector;
import co.uk.flansmods.client.debug.RenderDebugVector;
import co.uk.flansmods.client.model.ModelAAGun;
import co.uk.flansmods.client.model.ModelMG;
import co.uk.flansmods.client.model.ModelPlane;
import co.uk.flansmods.client.model.ModelVehicle;
import co.uk.flansmods.common.CommonProxy;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.GunBoxType;
import co.uk.flansmods.common.InfoType;
import co.uk.flansmods.common.ItemBullet;
import co.uk.flansmods.common.PartType;
import co.uk.flansmods.common.RotatedAxes;
import co.uk.flansmods.common.TileEntityGunBox;
import co.uk.flansmods.common.driveables.DriveablePart;
import co.uk.flansmods.common.driveables.DriveableType;
import co.uk.flansmods.common.driveables.EntityDriveable;
import co.uk.flansmods.common.driveables.EntityPlane;
import co.uk.flansmods.common.driveables.EntitySeat;
import co.uk.flansmods.common.driveables.EntityVehicle;
import co.uk.flansmods.common.driveables.PlaneType;
import co.uk.flansmods.common.driveables.VehicleType;
import co.uk.flansmods.common.guns.AAGunType;
import co.uk.flansmods.common.guns.BulletType;
import co.uk.flansmods.common.guns.EntityAAGun;
import co.uk.flansmods.common.guns.EntityBullet;
import co.uk.flansmods.common.guns.EntityMG;
import co.uk.flansmods.common.guns.GunType;
import co.uk.flansmods.common.network.PacketBuyWeapon;
import co.uk.flansmods.common.network.PacketDriveableCrafting;
import co.uk.flansmods.common.network.PacketRepairDriveable;
import co.uk.flansmods.common.teams.ArmourType;
import co.uk.flansmods.common.teams.EntityFlag;
import co.uk.flansmods.common.teams.EntityFlagpole;
import co.uk.flansmods.common.teams.TileEntitySpawner;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.TextureFXManager;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLModContainer;
import cpw.mods.fml.common.MetadataCollection;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class ClientProxy extends CommonProxy
{
	public static String modelDir = "co.uk.flansmods.client.model.";
	
	public List<File> contentPacks;

	@Override
	public void load()
	{
		new FlansModClient().load();
	}
	
	// BEGIN ABRAR EDITS --------------------------------------

	@Override
	public List<File> getContentList(Method method, ClassLoader classloader)
	{
		// this stuff is only done client side.

		contentPacks = new ArrayList<File>();
		for (File file : FlansMod.flanDir.listFiles())
		{
			if (file.isDirectory() || zipJar.matcher(file.getName()).matches())
			{
				try
				{
					method.invoke(classloader, new Object[]
							{ file.toURI().toURL() });
					
					HashMap<String, Object> map = new HashMap<String, Object>();
					map.put("modid", "FlansMod");
					map.put("name", "Flan's Mod : " + file.getName());
					map.put("version", "1");
					FMLModContainer container = new FMLModContainer("co.uk.flansmods.common.FlansMod", file, map);
					container.bindMetadata(MetadataCollection.from(null, ""));
					FMLClientHandler.instance().addModAsResource(container);
				
				} catch (Exception e)
				{
					FlansMod.log("Failed to load images for content pack : " + file.getName());
					e.printStackTrace();
				}
				// Add the directory to the content pack list
				FlansMod.log("Loaded content pack : " + file.getName());
				contentPacks.add(file);
			}
		}
			
		FlansMod.log("Loaded textures and models.");
		return contentPacks;
	}
	
	public List<File> getContentList()
	{
		return contentPacks;
	}

	@Override
	public void loadDefaultGraphics()
	{		
		RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, new RenderBullet());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityPlane.class, new RenderPlane());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityVehicle.class, new RenderVehicle());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityAAGun.class, new RenderAAGun());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityFlagpole.class, new RenderFlagpole());

		RenderingRegistry.registerEntityRenderingHandler(EntityFlag.class, new RenderFlag());
		
		RenderingRegistry.registerEntityRenderingHandler(EntitySeat.class, new RenderNull());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMG.class, new RenderMG());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityDebugVector.class, new RenderDebugVector());
	}
	
	@Override
	public void registerTileEntityRenderers() 
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySpawner.class, new TileEntitySpawnerRenderer());
	}

	@Override
	public void loadContentPackGraphics(Method method, ClassLoader classloader)
	{
		//No longer necessary since sprite sheets are no more
	}
	
	@Override
	public void loadKeyBindings()
	{
		KeyBindingRegistry.registerKeyBinding(new KeyInputHandler());
	}
	
	@Override
	public void doTutorialStuff(EntityPlayer player, EntityDriveable entityType)
	{
		if (!FlansModClient.doneTutorial)
		{
			FlansModClient.doneTutorial = true;
			
			if (entityType instanceof EntityPlane)
			{
				player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.inventoryKey.keyCode) + " to open the menu");
				player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.exitKey.keyCode) + " to get out");
				player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.controlSwitchKey.keyCode) + " to switch controls");
				if(PlaneType.getPlane(((EntityPlane)entityType).driveableType).hasGear)
					player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.gearKey.keyCode) + " to switch the gear");
				if(PlaneType.getPlane(((EntityPlane)entityType).driveableType).hasDoor)
					player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.doorKey.keyCode) + " to switch the doors");
				if(PlaneType.getPlane(((EntityPlane)entityType).driveableType).hasWing)
					player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.wingKey.keyCode) + " to switch the wings");
                player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.trimKey.keyCode) + " to reposition the plane");
			}
			else if (entityType instanceof EntityVehicle)
			{
				player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.inventoryKey.keyCode) + " to open the menu");
				player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.exitKey.keyCode) + " to get out");
                player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.doorKey.keyCode) + " to switch the doors");
                player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.trimKey.keyCode) + " to reposition the vehicle");
			}
		}
	}
	
	@Override
	public void changeControlMode(EntityPlayer player)
	{
		if(FlansModClient.flipControlMode())
			player.addChatMessage("Mouse Control mode is now set to " + FlansModClient.controlModeMouse);
	}
	
	public boolean mouseControlEnabled()
	{
		return FlansModClient.controlModeMouse;
	}
	
	@Override
	public void playBlockBreakSound(int x, int y, int z, int blockID)
	{
		if (FMLClientHandler.instance().getClient().theWorld == null)
			return;
		
		Block block = Block.blocksList[blockID];
    	FMLClientHandler.instance().getClient().effectRenderer.addBlockHitEffects((int)x, (int)y, (int)z, 1);
    	FMLClientHandler.instance().getClient().sndManager.playSound(block.stepSound.getBreakSound(), (float)x + 0.5F, (float)y + 0.5F, (float)z + 0.5F, (block.stepSound.getVolume() + 1.0F) / 2.0F, block.stepSound.getPitch() * 0.8F);
	}
	
	@Override
	public void spawnParticle(String type, double x1, double y1, double z1, double x2, double y2, double z2, int number)
	{
		World world = FMLClientHandler.instance().getClient().theWorld;
		
		if (world == null)
			return;
		
		for (int i = 0; i < number; i++)
		{
			world.spawnParticle(type, x1, y1, z1, x2, y2, z2);
		}
	}

	@Override
	public void doTickStuff()
	{
		super.doTickStuff();
		TickRegistry.registerTickHandler(new TickHandlerClient(), Side.CLIENT);
	}

	@Override
	public Object getClientGui(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		switch(ID) 
		{
			case 0: return new GuiDriveableCrafting(player.inventory, world, x, y, z);
			case 1: return new GuiDriveableRepair(player);
			//case 2: return new GuiVehicleCrafting(player.inventory, world, x, y, z);
			case 5: return new GuiGunBox(player.inventory, ((TileEntityGunBox)world.getBlockTileEntity(x, y, z)).getType());
			case 6: return new GuiDriveableInventory(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable, 0);
			case 7: return new GuiDriveableInventory(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable, 1);
			case 8: return new GuiDriveableFuel		(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable);
			case 9: return new GuiDriveableInventory(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable, 2);
		}
		return null;
	}
	
	@Override
	public void openDriveableMenu(EntityPlayer player, World world, EntityDriveable driveable)
	{
		FMLClientHandler.instance().getClient().displayGuiScreen(new GuiDriveableMenu(player.inventory, world, driveable));
	}
	
	private String getModelName(String in)
	{
		String[] split = in.split("\\.");
		if(split.length == 1)
			return "Model" + in;
		if(split.length > 1)
		{
			String out = "Model" + split[split.length - 1];
			for(int i = split.length - 2; i >= 0; i--)
			{
				out = split[i] + "." + out;
			}
			return out;
		}
		return in;
	}

	@Override
	public void loadBulletModel(String[] split, String shortName, BulletType type)
	{
		try
		{
			ModelBase model = (ModelBase) Class.forName(modelDir + getModelName(split[1])).getConstructor().newInstance();
			type.model = model;
		} catch (Exception e)
		{
			FlansMod.log("Failed to load bullet model : " + shortName);
			e.printStackTrace();
		}
	}

	@Override
	public void loadMGModel(String[] split, String shortName, GunType type)
	{
		try
		{
			ModelMG model = (ModelMG) Class.forName(modelDir + getModelName(split[1])).getConstructor().newInstance();
			type.model = model;
		} catch (Exception e)
		{
			FlansMod.log("Failed to load deployable MG model : " + shortName);
			e.printStackTrace();
		}
	}

	@Override
	public void loadAAGunModel(String[] split, String shortName, AAGunType type)
	{
		try
		{
			ModelAAGun model = (ModelAAGun) Class.forName(modelDir + getModelName(split[1])).getConstructor().newInstance();
			type.model = model;
		} catch (Exception e)
		{
			FlansMod.log("Failed to load AA gun model : " + shortName);
			e.printStackTrace();
		}
	}

	@Override
	public void loadVehicleModel(String[] split, String shortName, VehicleType type)
	{
		try 
		{	
			ModelVehicle model = (ModelVehicle)Class.forName(modelDir + getModelName(split[1])).getConstructor().newInstance();
			type.model = model;
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to load vehicle model : " + shortName + " (" + split[1] + ")");
			e.printStackTrace();
		}
	}	

	@Override
	public void loadPlaneModel(String[] split, String shortName, PlaneType type)
	{
		try 
		{	
			ModelPlane model = (ModelPlane)Class.forName(modelDir + getModelName(split[1])).getConstructor().newInstance();
			type.model = model;
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to load plane model : " + shortName + " (" + split[1] + ")");
			e.printStackTrace();
		}
	}
	
	@Override
	public void loadSound(String contentPack, String type, String sound)
	{
		FlansModResourceHandler.getSound(contentPack, type, sound);
		//FMLClientHandler.instance().getClient().installResource("sound3/" + type + "/" + sound + ".ogg", new File(FMLClientHandler.instance().getClient().mcDataDir, "/Flan/" + contentPack + "/sounds/" + sound + ".ogg"));
	}
	
	public boolean isThePlayer(EntityPlayer player)
	{
		return player == FMLClientHandler.instance().getClient().thePlayer;
	}
	
	@Override
	public void buyGun(GunBoxType type, int gun)
	{
		PacketDispatcher.sendPacketToServer(PacketBuyWeapon.buildBuyWeaponPacket(type, 0, gun));
		FlansModClient.shootTime = 10;
	}

	@Override
	public void buyAmmo(GunBoxType box, int ammo, int type)
	{
		PacketDispatcher.sendPacketToServer(PacketBuyWeapon.buildBuyWeaponPacket(box, type, ammo));
		FlansModClient.shootTime = 10;
	}
	
	@Override
	public void craftDriveable(EntityPlayer player, DriveableType type)
	{
		//Craft it this side (so the inventory updates immediately) and then send a packet to the server so that it is crafted that side too
		super.craftDriveable(player, type);
		if(player.worldObj.isRemote)
			PacketDispatcher.sendPacketToServer(PacketDriveableCrafting.buildCraftingPacket(type.shortName));
	}
	
	@Override
	public void repairDriveable(EntityPlayer driver, EntityDriveable driving, DriveablePart part)
	{
		//Repair it this side (so the inventory updates immediately) and then send a packet to the server so that it is repaired that side too
		super.repairDriveable(driver, driving, part);
		if(driver.worldObj.isRemote)
			PacketDispatcher.sendPacketToServer(PacketRepairDriveable.buildRepairPacket(part.type));
	}
}
