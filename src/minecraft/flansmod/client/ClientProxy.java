package flansmod.client;

import java.util.Random;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.registry.TickRegistry;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumGameType;
import net.minecraft.src.ModelBase;
import net.minecraft.src.Vec3;
import net.minecraft.src.World;
import flansmod.common.AAGunType;
import flansmod.common.BulletType;
import flansmod.common.CommonProxy;
import flansmod.common.EntityAAGun;
import flansmod.common.EntityBullet;
import flansmod.common.EntityCollisionBox;
import flansmod.common.EntityPassengerSeat;
import flansmod.common.EntityPlane;
import flansmod.common.EntityVehicle;
import flansmod.common.FlansMod;
import flansmod.common.ItemBullet;
import flansmod.common.PlaneType;
import flansmod.common.RotatedAxes;
import flansmod.common.VehicleData;
import flansmod.common.VehicleType;

public class ClientProxy extends CommonProxy
{
	public void load() 
	{
		new FlansModClient().load();
		TickRegistry.registerTickHandler(new ClientTickHandler(), Side.CLIENT);
	}
	
	public Object getClientGui(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		return null;
	}
	
	public ModelBase loadBulletModel(String[] split, String shortName)
	{
		String s = "flansmod.client.Model";
		try 
		{	
			ModelBase model = (ModelBase)Class.forName(s + split[1]).getConstructor().newInstance();
			return model;
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to load bullet model : " + shortName);
			e.printStackTrace();
			return null;
		}
	}
	
	public ModelPlane loadPlaneModel(String[] split, String shortName)
	{
		String s = "flansmod.client.Model";
		try 
		{	
			ModelPlane model = (ModelPlane)Class.forName(s + split[1]).getConstructor().newInstance();
			return model;
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to load plane model : " + shortName);
			e.printStackTrace();
			return null;
		}
	}
	
	public ModelMG loadMGModel(String[] split, String shortName)
	{
		String s = "flansmod.client.Model";
		try 
		{	
			ModelMG model = (ModelMG)Class.forName(s + split[1]).getConstructor().newInstance();
			return model;
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to load deployable MG model : " + shortName);
			e.printStackTrace();
			return null;
		}
	}
	
	public ModelAAGun loadAAGunModel(String[] split, String shortName)
	{
		String s = "flansmod.client.Model";
		try 
		{	
			ModelAAGun model = (ModelAAGun)Class.forName(s + split[1]).getConstructor().newInstance();
			return model;
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to load AA gun model : " + shortName);
			e.printStackTrace();
			return null;
		}
	}
	
	public ModelVehicle loadVehicleModel(String[] split, String shortName)
	{
		String s = "flansmod.client.Model";
		try 
		{	
			ModelVehicle model = (ModelVehicle)Class.forName(s + split[1]).getConstructor().newInstance();
			return model;
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to load vehicle model : " + shortName);
			e.printStackTrace();
			return null;
		}
	}
	
	public void spawnAAGun(World world, double posX, double posY, double posZ, AAGunType type, float gunYaw, float gunPitch, Random rand, BulletType bullet, EntityAAGun entity, Entity player)
	{
		ModelAAGun model = (ModelAAGun)type.model;
		world.spawnEntityInWorld(new EntityBullet(world, entity.rotate(model.barrelX / 16D + 3D, model.barrelY / 16D, model.barrelZ / 16D + 3D).addVector(posX, posY, posZ), gunYaw + 90F, gunPitch, (EntityLiving)player, type.accuracy, type.damage, bullet));
		world.playSoundAtEntity(entity, type.shootSound, 1.0F, 1.0F / (rand.nextFloat() * 0.4F + 0.8F));
	}
	
	public void spawnVehicle(World world, double posX, double posY, double posZ, VehicleType type, VehicleData data, EntityPassengerSeat seat, EntityVehicle entity, RotatedAxes axes, EntityPlayer player)
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
	}
}
