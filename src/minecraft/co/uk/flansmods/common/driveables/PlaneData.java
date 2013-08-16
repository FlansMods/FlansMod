package co.uk.flansmods.common.driveables;

public class PlaneData extends DriveableData
{	
	/** Used for reflective loading from NBT */
	public PlaneData(String s)
	{
		super(s, s, 0, 0, 0);
	}
	
    public PlaneData(String s, PlaneType planeType)
    {
        super(s, planeType.shortName, planeType.numPassengerGunners + planeType.guns.size(), planeType.numBombSlots, planeType.numCargoSlots);
    }
	
	public PlaneType getPlaneType()
	{
		return PlaneType.getPlane(type);
	}
}
