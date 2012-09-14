package flan.client;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.World;
import flan.server.EntityCollisionBox;
import flan.server.EntityPassengerSeat;
import flan.server.EntityPlane;
import flan.server.FlansMod;
import flan.server.PlaneData;
import flan.server.PlaneType;

public class EntityPlaneClient extends EntityPlane
{
	public EntityPlaneClient(World world) 
	{
		super(world);
	}
	public EntityPlaneClient(World world, double x, double y, double z,
			EntityPlayer placer, PlaneType type1, PlaneData data1) 
	{
		super(world, x, y, z, placer, type1, data1);
	}

	protected void initType()
	{
		super.initType();
		if(type.model == null)
		{
			FlansMod.logLoudly("NitroModelThingy not installed");
			return;
		}
	}
}
