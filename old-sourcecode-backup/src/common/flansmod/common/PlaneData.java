package flansmod.common;

import net.minecraft.src.NBTTagCompound;

public class PlaneData extends DriveableData
{
	public PlaneData(String s)
	{
		super(s, 8, 0, 0);
	}
	
    public PlaneData(String s, PlaneType planeType)
    {
        super(s, planeType, 8, planeType.numBombSlots, planeType.numCargoSlots);
		plane = planeType;
    }
	
	public void readFromNBT(NBTTagCompound tag)
    {
		super.readFromNBT(tag);
		plane = (PlaneType)type;
	}
	
	public PlaneType plane;
}
