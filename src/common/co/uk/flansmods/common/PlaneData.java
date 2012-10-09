package co.uk.flansmods.common;

import net.minecraft.src.NBTTagCompound;

public class PlaneData extends DriveableData
{
	public PlaneData(String s)
	{
		super(s, 8, 0, 0);
	}
	
    public PlaneData(String s, PlaneType planeType)
    {
        super(s, planeType.shortName, 8, planeType.numBombSlots, planeType.numCargoSlots);
    }
	
	public PlaneType getPlaneType()
	{
		return PlaneType.getPlane(type);
	}
}
