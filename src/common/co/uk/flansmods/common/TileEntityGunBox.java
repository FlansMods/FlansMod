package co.uk.flansmods.common;

import co.uk.flansmods.common.network.PacketGunBoxTE;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.Packet;
import net.minecraft.src.TileEntity;

public class TileEntityGunBox extends TileEntity
{
	@Override
    public void writeToNBT(NBTTagCompound nbt)
    {
		super.writeToNBT(nbt);
		nbt.setString("type", shortName);
    }
	
	@Override
    public void readFromNBT(NBTTagCompound nbt)
    {
		super.readFromNBT(nbt);
		shortName = nbt.getString("type");
    }
	
	@Override
    public boolean canUpdate()
    {
        return false;
    }
	
	public GunBoxType getType()
	{
		return GunBoxType.gunBoxMap.get(shortName);
	}
	
	@Override
    public Packet getDescriptionPacket()
    {
        return PacketGunBoxTE.buildGunBoxPacket(this);
    }
	
	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	private String shortName;
}
