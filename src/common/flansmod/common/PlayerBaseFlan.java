package flansmod.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import net.minecraft.src.CompressedStreamTools;
import net.minecraft.src.DamageSource;
import net.minecraft.src.FlansModHandler;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.NBTTagList;
import net.minecraft.src.NBTTagString;
import net.minecraft.src.PlayerAPI;
import net.minecraft.src.PlayerBase;
import net.minecraft.src.SaveHandler;


public class PlayerBaseFlan extends PlayerBase
{
    public PlayerBaseFlan(PlayerAPI playerapi)
    {
        super(playerapi);
		FlansMod.papi = playerapi;
    }
	
	public void beforeReadEntityFromNBT(NBTTagCompound tags) 
	{
		if(player.worldObj.isRemote)
			return;
		NBTTagCompound customData = new NBTTagCompound();
		try
		{
			//Load the data
			File file = new File(FlansModHandler.getSaveDirectory(player.worldObj), "Flan.dat");
			customData = CompressedStreamTools.readCompressed(new FileInputStream(file));
			//Fill the unlocks list
			NBTTagList unlocks = customData.getTagList("Unlocks");
			for(int i = 0; i < unlocks.tagCount(); ++i)
			{
				NBTTagString string = (NBTTagString)unlocks.tagAt(i);
				FlansMod.blueprintsUnlocked = new ArrayList<PlaneType>();
				FlansMod.blueprintsUnlocked.add(PlaneType.getPlane(string.toString()));
			}
			NBTTagList vehicleUnlocks = customData.getTagList("VehicleUnlocks");
			for(int i = 0; i < vehicleUnlocks.tagCount(); ++i)
			{
				NBTTagString string = (NBTTagString)vehicleUnlocks.tagAt(i);
				FlansMod.vehicleBlueprintsUnlocked = new ArrayList<VehicleType>();
				FlansMod.vehicleBlueprintsUnlocked.add(VehicleType.getVehicle(string.toString()));
			}
			FlansMod.doneTutorial = customData.getBoolean("DoneTutorial");
		}
		catch(IOException ioexception)
		{
			System.out.println("Failed to read data for Flan's mod. Using defaults.");
		}
	}
	
	public void afterWriteEntityToNBT(NBTTagCompound tags)
	{
		if(player.worldObj.isRemote)
			return;
		NBTTagCompound customData = new NBTTagCompound();
		NBTTagList unlocks = new NBTTagList();
		for(PlaneType type : FlansMod.blueprintsUnlocked)
		{
			unlocks.appendTag(new NBTTagString("Plane", type.shortName));
		}
		customData.setTag("Unlocks", unlocks);
		NBTTagList vehicleUnlocks = new NBTTagList();
		for(VehicleType type : FlansMod.vehicleBlueprintsUnlocked)
		{
			vehicleUnlocks.appendTag(new NBTTagString("Vehicle", type.shortName));
		}
		customData.setTag("VehicleUnlocks", vehicleUnlocks);
		customData.setBoolean("DoneTutorial", FlansMod.doneTutorial);
		
		//Store the data
		try
        {
            File file = new File(FlansModHandler.getSaveDirectory(player.worldObj), "Flan.dat");
			CompressedStreamTools.writeCompressed(customData, new FileOutputStream(file));
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
            throw new RuntimeException("Failed to create data for Flan's mod.");
        }
	}
	
	//To stop players in tanks from taking damage
    public boolean attackEntityFrom(DamageSource var1, int var2)
    {
		if(player.ridingEntity != null && player.ridingEntity instanceof EntityVehicle && ((EntityVehicle)player.ridingEntity).type.tank)
			return false;
		return super.attackEntityFrom(var1, var2);
    }
		
	public EntityMG mountingGun;
}
