package co.uk.flansmods.common;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.packet.Packet;
import net.minecraft.tileentity.TileEntity;
import co.uk.flansmods.common.network.PacketGunBoxTE;

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
