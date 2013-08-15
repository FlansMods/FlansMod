package co.uk.flansmods.common.driveables;

import co.uk.flansmods.common.GunType;
import co.uk.flansmods.common.vector.Vector3f;

public class PilotGun 
{
	public Vector3f position;
	public EnumDriveablePart driveablePart;
	public GunType type;
	/** Auto assigned by the driveable type for ammo handling */
	public int gunID;
	
	public PilotGun(String[] split)
	{
		position = new Vector3f(Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3]));
		driveablePart = EnumDriveablePart.getPart(split[4]);
		type = GunType.getGun(split[5]);
	}
}
