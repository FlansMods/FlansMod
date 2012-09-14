package flan.server;

import java.util.Random;

import net.minecraft.src.*;

public abstract class CommonProxy
{
	public abstract void load();

	public abstract Object getClientGui(int ID, EntityPlayer player, World world, int x, int y, int z);

	public Container getServerGui(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		return null;
	}

	public abstract Object loadBulletModel(String[] split, String shortName);

	public abstract Object loadMGModel(String[] split, String shortName);

	public abstract Object loadAAGunModel(String[] split, String shortName);

	public abstract Object loadVehicleModel(String[] split, String shortName);
	
	public abstract Object loadPlaneModel(String[] split, String shortName);
	
	public abstract void spawnAAGun(World world, double posX, double posY, double posZ, AAGunType type, float gunYaw, float gunPitch, Random rand, BulletType bullet, EntityAAGun entity, Entity player);
	
	public abstract void spawnVehicle(World world, double posX, double posY, double posZ, VehicleType type, VehicleData data, EntityPassengerSeat seat, EntityVehicle entity, RotatedAxes axes, EntityPlayer player);
}