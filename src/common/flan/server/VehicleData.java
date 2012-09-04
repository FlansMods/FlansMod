package flan.server;

import net.minecraft.src.ItemStack;
import net.minecraft.src.NBTTagCompound;

public class VehicleData extends DriveableData
{
	public VehicleData(String s)
	{
		super(s, 2, 0, 0);
	}
	
    public VehicleData(String s, VehicleType vehicleType)
    {
        super(s, vehicleType, 2, vehicleType.numBombSlots, vehicleType.numCargoSlots);
		vehicle = vehicleType;
    }
	
	public void readFromNBT(NBTTagCompound tag)
    {
		super.readFromNBT(tag);
		vehicle = (VehicleType)type;
		numBombs = type.numBombSlots;
		numCargo = type.numCargoSlots;
		bombs = new ItemStack[numBombs];
		cargo = new ItemStack[numCargo];
		for(int i = 0; i < numBombs; i++)
		{
			bombs[i] = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("Bombs " + i));
		}
 		for(int i = 0; i < numCargo; i++)
		{
			cargo[i] = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("Cargo " + i));
		}
	}
	
	public VehicleType vehicle;
}