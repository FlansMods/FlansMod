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

import co.uk.flansmods.client.model.ModelAAGun;
import co.uk.flansmods.client.model.ModelMG;
import co.uk.flansmods.client.model.ModelPlane;
import co.uk.flansmods.client.model.ModelVehicle;
import co.uk.flansmods.common.AAGunType;
import co.uk.flansmods.common.BulletType;
import co.uk.flansmods.common.CommonProxy;
import co.uk.flansmods.common.DriveableType;
import co.uk.flansmods.common.EntityAAGun;
import co.uk.flansmods.common.EntityBullet;
import co.uk.flansmods.common.EntityCollisionBox;
import co.uk.flansmods.common.EntityDriveable;
import co.uk.flansmods.common.EntityMG;
import co.uk.flansmods.common.EntityPassengerSeat;
import co.uk.flansmods.common.EntityPlane;
import co.uk.flansmods.common.EntityVehicle;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.GunBoxType;
import co.uk.flansmods.common.GunType;
import co.uk.flansmods.common.InfoType;
import co.uk.flansmods.common.ItemBullet;
import co.uk.flansmods.common.PartType;
import co.uk.flansmods.common.PlaneType;
import co.uk.flansmods.common.RotatedAxes;
import co.uk.flansmods.common.TileEntityGunBox;
import co.uk.flansmods.common.VehicleData;
import co.uk.flansmods.common.VehicleType;
import co.uk.flansmods.common.network.PacketBuyWeapon;
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
	public static String modelDir = "co.uk.flansmods.client.model.Model";
	
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
			if (file.isDirectory())
			{
				try
				{
					method.invoke(classloader, new Object[]
							{ file.toURI().toURL() });
					method.invoke(classloader, new Object[]
							{ new File(file, "/assets/flansmod/models/").toURI().toURL() });
					
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
		try {
			Class.forName("co.uk.flansmods.client.model.ModelBF109");
		}
		catch(Exception e)
		{
			e.printStackTrace();
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
		//MinecraftForgeClient.preloadTexture("/spriteSheets/bullets.png");
		
		RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, new RenderBullet());
		
		//MinecraftForgeClient.preloadTexture("/spriteSheets/guns.png");
		
		//MinecraftForgeClient.preloadTexture("/spriteSheets/parts.png");
		
		//MinecraftForgeClient.preloadTexture("/spriteSheets/planes.png");
		
		//MinecraftForgeClient.preloadTexture("/spriteSheets/vehicles.png");
		
		RenderingRegistry.registerEntityRenderingHandler(EntityPlane.class, new RenderPlane());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityVehicle.class, new RenderVehicle());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityAAGun.class, new RenderAAGun());
		
		//MinecraftForgeClient.preloadTexture("/spriteSheets/gunBoxes.png");
		
		//MinecraftForgeClient.preloadTexture("/spriteSheets/armour.png");
		
		RenderingRegistry.registerEntityRenderingHandler(EntityFlagpole.class, new RenderFlagpole());

		RenderingRegistry.registerEntityRenderingHandler(EntityFlag.class, new RenderFlag());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityCollisionBox.class, new RenderNull());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityPassengerSeat.class, new RenderNull());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMG.class, new RenderMG());
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
                player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.gearKey.keyCode) + " to switch the gear");
                player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.doorKey.keyCode) + " to switch the doors");
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
	
	// --------------- END ABRAR EDITS ----------------------
	
	public boolean mouseControlEnabled()
	{
		return FlansModClient.controlModeMouse;
	}
	
	// ------------------ PACKET SENDING OR NOT -------------
	
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
	
	// ---------------END PACKET SENDING OR NOT -------------

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
			case 0: return new GuiPlaneCrafting(player.inventory, world, x, y, z, false);
			case 1: return new GuiPlaneCrafting(player.inventory, world, x, y, z, true);
			case 2: return new GuiVehicleCrafting(player.inventory, world, x, y, z);
			//case 3: return new GuiPlaneMenu(player.inventory, world, (EntityDriveable) player.ridingEntity);
			//case 4: return new GuiPlaneFuel(player.inventory, world, (EntityDriveable) player.ridingEntity);
			case 5: return new GuiGunBox(player.inventory, ((TileEntityGunBox)world.getBlockTileEntity(x, y, z)).getType());
			case 6: return new GuiPlaneInventory(player.inventory, world, (EntityDriveable) player.ridingEntity, 0);
			case 7: return new GuiPlaneInventory(player.inventory, world, (EntityDriveable) player.ridingEntity, 1);
			case 8: return new GuiPlaneFuel(player.inventory, world, (EntityDriveable) player.ridingEntity);
			case 9: return new GuiPlaneInventory(player.inventory, world, (EntityDriveable) player.ridingEntity, 2);
		}
		return null;
	}
	
	@Override
	public void openDriveableMenu(EntityPlayer player, World world, EntityDriveable driveable)
	{
		FMLClientHandler.instance().getClient().displayGuiScreen(new GuiPlaneMenu(player.inventory, world, driveable));
	}

	@Override
	public void loadBulletModel(String[] split, String shortName, BulletType type)
	{
		try
		{
			ModelBase model = (ModelBase) Class.forName(modelDir + split[1]).getConstructor().newInstance();
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
			ModelMG model = (ModelMG) Class.forName(modelDir + split[1]).getConstructor().newInstance();
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
			ModelAAGun model = (ModelAAGun) Class.forName(modelDir + split[1]).getConstructor().newInstance();
			type.model = model;
		} catch (Exception e)
		{
			FlansMod.log("Failed to load AA gun model : " + shortName);
			e.printStackTrace();
		}
	}

	/*@Override
	public void shootVehicle(World world, double posX, double posY, double posZ, VehicleType type, VehicleData data, EntityPassengerSeat seat, EntityVehicle entity, RotatedAxes axes, EntityPlayer player)
	{
		ModelVehicle vehicleModel = (ModelVehicle)type.model;
		if(vehicleModel.gunModel.length > 0 && data.guns[1] != null && data.ammo[1] != null && data.ammo[1].getItem() instanceof ItemBullet && data.guns[1].isAmmo(((ItemBullet)data.ammo[1].getItem()).type))
		{				
			double cosYaw = Math.cos((player.rotationYaw - axes.getYaw()) * 3.14159265F / 180F);
			double sinYaw = Math.sin((player.rotationYaw - axes.getYaw()) * 3.14159265F / 180F);
			double cosPitch = Math.cos((player.rotationPitch - axes.getPitch()) * 3.14159265F / 180F);
			double sinPitch = Math.sin((player.rotationPitch - axes.getPitch()) * 3.14159265F / 180F);

			double newX = 3D * cosPitch * sinYaw;
			double newY = -3D * sinPitch;
			double newZ = 3D * cosPitch * cosYaw;
			Vec3 gunOriginVec = entity.rotate(type.barrelX / 16D, type.barrelY / 16D, type.barrelZ / 16D);
			world.spawnEntityInWorld(new EntityBullet(world, gunOriginVec.addVector(posX, posY, posZ), player.rotationYaw, axes.getPitch(), (EntityLiving)seat.riddenByEntity, data.guns[1].accuracy, data.guns[1].damage, ((ItemBullet)data.ammo[1].getItem()).type, 3.0F));
			if(seat.soundDelay <= 0)
			{
				world.playSoundAtEntity(entity, type.shootSound, 1.0F , 1.0F);
				seat.soundDelay = data.guns[1].shootSoundLength;
			}
			int damage = data.ammo[1].getItemDamage();
			data.ammo[1].setItemDamage(damage + 1);	
			if(damage + 1 == data.ammo[1].getMaxDamage())
			{
				if(player.capabilities.isCreativeMode)
					data.ammo[1].setItemDamage(0);
				else data.setInventorySlotContents(1, null);
			}
			seat.gunDelay = type.vehicleShootDelay;
		}
	}*/

	@Override
	public void loadVehicleModel(String[] split, String shortName, VehicleType type)
	{
		try 
		{	
			ModelVehicle model = (ModelVehicle)Class.forName(modelDir + split[1]).getConstructor().newInstance();
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
			ModelPlane model = (ModelPlane)Class.forName(modelDir + split[1]).getConstructor().newInstance();
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
	public List<DriveableType> getBlueprints(boolean vehicle)
	{
		return vehicle ? FlansModClient.vehicleBlueprintsUnlocked : FlansModClient.blueprintsUnlocked;
	}
}
