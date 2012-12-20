package co.uk.flansmods.common.teams;

import co.uk.flansmods.common.FlansMod;
import cpw.mods.fml.common.network.PacketDispatcher;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet132TileEntityData;
import net.minecraft.tileentity.TileEntity;

public class TileEntitySpawner extends TileEntity implements ITeamObject
{
	//Server side
	public int spawnDelay;
	public ItemStack[] stacksToSpawn;
	public ITeamBase base;
	private int baseID = -1;
	private int dimension;
	
	//Client side
	private String team;
	
	public TileEntitySpawner()
	{
		TeamsManager.getInstance().registerObject(this);
		stacksToSpawn = new ItemStack[5];
	}
	
	@Override
    public Packet getDescriptionPacket()
    {
        NBTTagCompound tags = new NBTTagCompound();
        tags.setString("Team", base == null || base.getOwner() == null ? "none" : base.getOwner().shortName);
        return new Packet132TileEntityData(xCoord, yCoord, zCoord, 1, tags);
    }
    
    @Override
    public void onDataPacket(INetworkManager net, Packet132TileEntityData packet)
    {
    	team = packet.customParam1.getString("Team");
    }
    
    
    
    @Override
    public void updateEntity()
    {
    	if(worldObj.isRemote)
    		return;
		//If the base was loaded after the spawner, check to see if the base has now been loaded
		if(baseID >= 0 && base == null)
		{
			ITeamBase newBase = TeamsManager.getInstance().getBase(baseID);
			if(newBase != null)
			{
				setBase(newBase);
				newBase.addObject(this);
			}
		}
    }
    
	@Override
    public void writeToNBT(NBTTagCompound nbt)
    {
		super.writeToNBT(nbt);
		nbt.setInteger("delay", spawnDelay);
		if(base != null)
			nbt.setInteger("Base", base.getID());
		nbt.setInteger("dim", worldObj.provider.dimensionId);
	
    }
	
	@Override
    public void readFromNBT(NBTTagCompound nbt)
    {
		super.readFromNBT(nbt);
		spawnDelay = nbt.getInteger("delay");
		baseID = nbt.getInteger("Base");
		dimension = nbt.getInteger("dim");
		setBase(TeamsManager.getInstance().getBase(baseID));
		if(base != null)
			base.addObject(this);
    }

	@Override
	public ITeamBase getBase() 
	{
		return base;
	}
	
	public Team getTeam()
	{
		return Team.getTeam(team);
	}

	@Override
	public void onBaseSet(Team newOwners) 
	{
		PacketDispatcher.sendPacketToAllInDimension(getDescriptionPacket(), worldObj == null ? dimension : worldObj.provider.dimensionId);
	}

	@Override
	public void onBaseCapture(Team newOwners) 
	{
		
	}

	@Override
	public void setBase(ITeamBase b) 
	{
		base = b;
		PacketDispatcher.sendPacketToAllInDimension(getDescriptionPacket(), worldObj == null ? dimension : worldObj.provider.dimensionId);
	}

	@Override
	public void tick() 
	{

	}

	@Override
	public void destroy() 
	{
		worldObj.setBlockWithNotify(xCoord, yCoord, zCoord, 0);
	}

	@Override
	public double getPosX() 
	{
		return xCoord + 0.5F;
	}

	@Override
	public double getPosY() 
	{
		return yCoord + 0.5F;
	}

	@Override
	public double getPosZ() 
	{
		return zCoord + 0.5F;
	}
	
	@Override
	public boolean isSpawnPoint()
	{
		return true;
	}
}
