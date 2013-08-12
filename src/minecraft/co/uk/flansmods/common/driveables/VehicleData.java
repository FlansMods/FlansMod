package co.uk.flansmods.common.driveables;

public class VehicleData extends DriveableData
{
	/** Used for reflective loading from NBT */
	public VehicleData(String s)
	{
		super(s, s, 4, 0, 0);
	}
	
    public VehicleData(String s, VehicleType vehicleType)
    {
        super(s, vehicleType.shortName, 2, vehicleType.numBombSlots, vehicleType.numCargoSlots);
    }
	
	public VehicleType getVehicleType()
	{
		return VehicleType.getVehicle(type);
	}
}