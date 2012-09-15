package co.uk.flansmods.client;

import co.uk.flansmods.common.EntityCollisionBox;
import co.uk.flansmods.common.EntityPassengerSeat;
import co.uk.flansmods.common.EntityPlane;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.PlaneData;
import co.uk.flansmods.common.PlaneType;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.World;

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
