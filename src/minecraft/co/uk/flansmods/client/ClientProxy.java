package co.uk.flansmods.client;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.lwjgl.input.Keyboard;

import co.uk.flansmods.client.model.ModelAAGun;
import co.uk.flansmods.client.model.ModelMG;
import co.uk.flansmods.client.model.ModelPlane;
import co.uk.flansmods.client.model.ModelVehicle;
import co.uk.flansmods.common.AAGunType;
import co.uk.flansmods.common.BulletType;
import co.uk.flansmods.common.CommonProxy;
import co.uk.flansmods.common.ServerTickHandler;
import co.uk.flansmods.common.EntityAAGun;
import co.uk.flansmods.common.EntityBullet;
import co.uk.flansmods.common.EntityDriveable;
import co.uk.flansmods.common.EntityPassengerSeat;
import co.uk.flansmods.common.EntityPlane;
import co.uk.flansmods.common.EntityVehicle;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.GunBoxType;
import co.uk.flansmods.common.GunType;
import co.uk.flansmods.common.ItemBullet;
import co.uk.flansmods.common.PartType;
import co.uk.flansmods.common.PlaneType;
import co.uk.flansmods.common.RotatedAxes;
import co.uk.flansmods.common.VehicleData;
import co.uk.flansmods.common.VehicleType;
import co.uk.flansmods.common.network.FlanPacketServer;
import co.uk.flansmods.common.network.PacketBreakSound;
import co.uk.flansmods.common.network.PacketParticleSpawn;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.registry.TickRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumGameType;
import net.minecraft.src.ModLoader;
import net.minecraft.src.ModelBase;
import net.minecraft.src.Vec3;
import net.minecraft.src.World;
import net.minecraft.src.WorldClient;
import net.minecraft.src.WorldServer;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy
{
	public static String modelDir = "co.uk.flansmods.client.model";

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
		List<File> contentPacks = new ArrayList<File>();
		for (File file : FlansMod.flanDir.listFiles())
		{
			if (file.isDirectory())
			{
				try
				{
					method.invoke(classloader, new Object[]
							{ file.toURI().toURL() });
					method.invoke(classloader, new Object[]
							{ new File(file, "/models/").toURI().toURL() });
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

	@Override
	public void loadDefaultGraphics()
	{
		MinecraftForgeClient.preloadTexture("/spriteSheets/bullets.png");
		RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, new RenderBullet());
		
		MinecraftForgeClient.preloadTexture("/spriteSheets/guns.png");
		
		MinecraftForgeClient.preloadTexture("/spriteSheets/parts.png");
		
		MinecraftForgeClient.preloadTexture("/spriteSheets/planes.png");
		
		RenderingRegistry.registerEntityRenderingHandler(EntityPlane.class, new RenderPlane());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityAAGun.class, new RenderAAGun());
		
		MinecraftForgeClient.preloadTexture("/spriteSheets/gunBoxes.png");
	}

	@Override
	public void loadContentPackGraphics(Method method, ClassLoader classloader)
	{
		Minecraft minecraft = FMLClientHandler.instance().getClient();
		
		// Bullets / Bombs
		for (BulletType type : BulletType.bullets)
		{
			try
			{
				java.awt.image.BufferedImage bufferedimage = ModLoader.loadImage(minecraft.renderEngine, type.iconPath);
				CustomModTextureStatic modtexturestatic = new CustomModTextureStatic("/spriteSheets/bullets.png", type.iconIndex, bufferedimage);
				minecraft.renderEngine.registerTextureFX(modtexturestatic);
			} catch (Exception e)
			{
				FlansMod.log("Failed to override bullet icon");
				e.printStackTrace();
			}
		}
		FlansMod.log("Loaded bullet icons.");

		// Guns
		for (GunType type : GunType.guns)
		{
			try
			{
				java.awt.image.BufferedImage bufferedimage = ModLoader.loadImage(minecraft.renderEngine, type.iconPath);
				CustomModTextureStatic modtexturestatic = new CustomModTextureStatic("/spriteSheets/guns.png", type.iconIndex, bufferedimage);
				minecraft.renderEngine.registerTextureFX(modtexturestatic);
			} catch (Exception e)
			{
				FlansMod.log("Failed to override gun icon");
				e.printStackTrace();
			}
		}
		FlansMod.log("Loaded gun icons.");

		// Parts
		for (PartType type : PartType.parts)
		{
			try
			{
				java.awt.image.BufferedImage bufferedimage = ModLoader.loadImage(minecraft.renderEngine, type.iconPath);
				CustomModTextureStatic modtexturestatic = new CustomModTextureStatic("/spriteSheets/parts.png", type.iconIndex, bufferedimage);
				minecraft.renderEngine.registerTextureFX(modtexturestatic);
			} catch (Exception e)
			{
				FlansMod.log("Failed to override part icon");
				e.printStackTrace();
			}
		}
		FlansMod.log("Loaded part icons.");

		// Planes
		for (PlaneType type : PlaneType.types)
		{
			try
			{
				java.awt.image.BufferedImage bufferedimage = ModLoader.loadImage(minecraft.renderEngine, type.iconPath);
				CustomModTextureStatic modtexturestatic = new CustomModTextureStatic("/spriteSheets/planes.png", type.iconIndex, bufferedimage);
				minecraft.renderEngine.registerTextureFX(modtexturestatic);
			} catch (Exception e)
			{
				FlansMod.log("Failed to override plane icon");
				e.printStackTrace();
			}
		}
		FlansMod.log("Loaded plane icons.");

		// AAGuns
		for (AAGunType type : AAGunType.infoTypes)
		{
			try
			{
				java.awt.image.BufferedImage bufferedimage = ModLoader.loadImage(minecraft.renderEngine, type.iconPath);
				CustomModTextureStatic modtexturestatic = new CustomModTextureStatic("/spriteSheets/planes.png", type.iconIndex, bufferedimage);
				minecraft.renderEngine.registerTextureFX(modtexturestatic);
			} catch (Exception e)
			{
				FlansMod.log("Failed to override AAGun icon");
				e.printStackTrace();
			}
		}
		FlansMod.log("Loaded AA gun icons.");

		// Gun Boxes
		for (GunBoxType type : GunBoxType.boxes)
		{
			try
			{
				if (type.topTextureIndex != 0)
				{
					java.awt.image.BufferedImage bufferedimage = ModLoader.loadImage(minecraft.renderEngine, type.topTexturePath);
					CustomModTextureStatic modtexturestatic = new CustomModTextureStatic("/spriteSheets/gunBoxes.png", type.topTextureIndex, bufferedimage);
					minecraft.renderEngine.registerTextureFX(modtexturestatic);
				}

				java.awt.image.BufferedImage bufferedimage1 = ModLoader.loadImage(minecraft.renderEngine, type.sideTexturePath);
				CustomModTextureStatic modtexturestatic1 = new CustomModTextureStatic("/spriteSheets/gunBoxes.png", type.sideTextureIndex, bufferedimage1);
				minecraft.renderEngine.registerTextureFX(modtexturestatic1);

				if (type.bottomTextureIndex != 1)
				{
					java.awt.image.BufferedImage bufferedimage2 = ModLoader.loadImage(minecraft.renderEngine, type.bottomTexturePath);
					CustomModTextureStatic modtexturestatic2 = new CustomModTextureStatic("/spriteSheets/gunBoxes.png", type.bottomTextureIndex, bufferedimage2);
					minecraft.renderEngine.registerTextureFX(modtexturestatic2);
				}
			} catch (Exception e)
			{
				FlansMod.log("Failed to override gun box texture");
				e.printStackTrace();
			}
		}
		FlansMod.log("Loaded gun box textures.");
	}
	
	@Override
	public void loadKeyBindings()
	{
		KeyBindingRegistry.registerKeyBinding(new KeyInputHandler());
	}
	
	@Override
	public void keyPress(int key, EntityPlayer player)
	{
		WorldClient world = (WorldClient) FMLClientHandler.instance().getClient().theWorld;
		Entity entityTest  = player.ridingEntity;
		
		if (entityTest == null || !world.isRemote || !(entityTest instanceof EntityDriveable))
			return;
		
		EntityDriveable entity = (EntityDriveable)entityTest;
		
		if (entity.riddenByEntity != player)
			return;
		
		// if its not the inventory key, do whatever the entity wants.
		if (key != 7)
			entity.pressKey(key);
		
		FMLClientHandler.instance().displayGuiScreen(player, new GuiPlaneMenu((player).inventory, world, entity));
	}
	
	@Override
	public void doTutorialStuff(EntityPlayer player)
	{
		FlansMod.doneTutorial = true;
		player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.inventoryKey.keyCode) + " to open the menu");
		player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.exitKey.keyCode) + " to get out");
		player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.controlSwitchKey.keyCode) + " to switch controls");
	}
	
	// --------------- END ABRAR EDITS ----------------------
	
	
	// ------------------ PACKET SENDING OR NOT -------------
	
	public void playBlockBreakSound(int x, int y, int z, int blockID)
	{
		Block block = Block.blocksList[blockID];
    	FMLClientHandler.instance().getClient().effectRenderer.addBlockHitEffects((int)x, (int)y, (int)z, 1);
    	FMLClientHandler.instance().getClient().sndManager.playSound(block.stepSound.getBreakSound(), (float)x + 0.5F, (float)y + 0.5F, (float)z + 0.5F, (block.stepSound.getVolume() + 1.0F) / 2.0F, block.stepSound.getPitch() * 0.8F);
	}
	
	public void spawnParticle(String type, double x1, double y1, double z1, double x2, double y2, double z2, int number)
	{
		World world = FMLClientHandler.instance().getClient().theWorld;
		
		for (int i = 0; i < number; i++)
		{
			(world).spawnParticle(type, x1, y1, z1, x2, y2, z2);
		}
	}
	
	// ---------------END PACKET SENDING OR NOT -------------

	@Override
	public void doTickStuff()
	{
		TickRegistry.registerTickHandler(new ClientTickHandler(), Side.CLIENT);
	}

	@Override
	public Object getClientGui(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		return null;
	}

	@Override
	public ModelBase loadBulletModel(String[] split, String shortName)
	{
		try
		{
			ModelBase model = (ModelBase) Class.forName(modelDir + split[1]).getConstructor().newInstance();
			return model;
		} catch (Exception e)
		{
			FlansMod.log("Failed to load bullet model : " + shortName);
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public ModelMG loadMGModel(String[] split, String shortName)
	{
		try
		{
			ModelMG model = (ModelMG) Class.forName(modelDir + split[1]).getConstructor().newInstance();
			return model;
		} catch (Exception e)
		{
			FlansMod.log("Failed to load deployable MG model : " + shortName);
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public ModelAAGun loadAAGunModel(String[] split, String shortName)
	{
		try
		{
			ModelAAGun model = (ModelAAGun) Class.forName(modelDir + split[1]).getConstructor().newInstance();
			return model;
		} catch (Exception e)
		{
			FlansMod.log(modelDir + split[1]);
			FlansMod.log("Failed to load AA gun model : " + shortName);
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void spawnAAGun(World world, double posX, double posY, double posZ, AAGunType type, float gunYaw, float gunPitch, Random rand, BulletType bullet, EntityAAGun entity, Entity player)
	{
		ModelAAGun model = (ModelAAGun) type.model;
		world.spawnEntityInWorld(new EntityBullet(world, entity.rotate(model.barrelX / 16D + 3D, model.barrelY / 16D, model.barrelZ / 16D + 3D).addVector(posX, posY, posZ), gunYaw + 90F, gunPitch, (EntityLiving) player, type.accuracy, type.damage, bullet));
		world.playSoundAtEntity(entity, type.shootSound, 1.0F, 1.0F / (rand.nextFloat() * 0.4F + 0.8F));
	}

	@Override
	public void spawnVehicle(World world, double posX, double posY, double posZ, VehicleType type, VehicleData data, EntityPassengerSeat seat, EntityVehicle entity, RotatedAxes axes, EntityPlayer player)
	{
		ModelVehicle vehicleModel = (ModelVehicle)type.model;
		/*
		 * Someone seems to have gotten a little confused here. This is the shooting code.
		 * 
		if(vehicleModel.gunModel.length > 0 && data.guns[1] != null && data.ammo[1] != null && data.ammo[1].getItem() instanceof ItemBullet && data.guns[1].isAmmo(((ItemBullet)data.ammo[1].getItem()).type))
		{				
			double cosYaw = Math.cos((player.rotationYaw - axes.getYaw()) * 3.14159265F / 180F);
			double sinYaw = Math.sin((player.rotationYaw - axes.getYaw()) * 3.14159265F / 180F);
			double cosPitch = Math.cos((player.rotationPitch - axes.getPitch()) * 3.14159265F / 180F);
			double sinPitch = Math.sin((player.rotationPitch - axes.getPitch()) * 3.14159265F / 180F);

			double newX = 3D * cosPitch * sinYaw;
			double newY = -3D * sinPitch;
			double newZ = 3D * cosPitch * cosYaw;
			Vec3 gunOriginVec = entity.rotate(vehicleModel.gunModel[0].rotationPointX / 16D, vehicleModel.gunModel[0].rotationPointY / 16D, vehicleModel.gunModel[0].rotationPointZ / 16D);
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
				if(world.getWorldInfo().getGameType() == EnumGameType.CREATIVE)
					data.ammo[1].setItemDamage(0);
				else data.setInventorySlotContents(1, null);
			}
			seat.gunDelay = type.vehicleShootDelay;
		}
		 */
	}

	@Override
	public ModelVehicle loadVehicleModel(String[] split, String shortName)
	{
		try 
		{	
			ModelVehicle model = (ModelVehicle)Class.forName(modelDir + split[1]).getConstructor().newInstance();
			return model;
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to load vehicle model : " + shortName);
			e.printStackTrace();
			return null;
		}
	}	

	@Override
	public ModelPlane loadPlaneModel(String[] split, String shortName)
	{
		try 
		{	
			ModelPlane model = (ModelPlane)Class.forName(modelDir + split[1]).getConstructor().newInstance();
			return model;
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to load vehicle model : " + shortName);
			e.printStackTrace();
			return null;
		}
	}
}
