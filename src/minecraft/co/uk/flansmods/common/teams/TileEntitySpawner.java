package co.uk.flansmods.common.teams;

import java.util.ArrayList;
import java.util.List;

import co.uk.flansmods.common.FlansMod;
import cpw.mods.fml.common.network.PacketDispatcher;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet132TileEntityData;
import net.minecraft.tileentity.TileEntity;

public class TileEntitySpawner extends TileEntity implements ITeamObject
{
	//Server side
	public int spawnDelay = 1200;
	public List<ItemStack> stacksToSpawn = new ArrayList<ItemStack>();
	public List<EntityTeamItem> itemEntities = new ArrayList<EntityTeamItem>();
	public ITeamBase base;
	private int baseID = -1;
	private int dimension;
	public int currentDelay;
	
	//Client side
	private String team;
	
	public TileEntitySpawner()
	{
		TeamsManager.getInstance().registerObject(this);
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
		if(worldObj.getBlockMetadata(xCoord, yCoord, zCoord) == 1)
			return;
		for(int i = 0; i < itemEntities.size(); i++)
		{
			if(itemEntities.get(i).isDead)
				itemEntities.remove(i);
		}
		if(currentDelay > 0 && itemEntities.size() == 0)
		{
			currentDelay--;
		}
		if(currentDelay == 0)
		{
			currentDelay = spawnDelay;
			for(int i = 0; i < stacksToSpawn.size(); i++)
			{
				EntityTeamItem itemEntity = new EntityTeamItem(this, i);
				worldObj.spawnEntityInWorld(itemEntity);
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
		nbt.setInteger("numStacks", stacksToSpawn.size());
		for(int i = 0; i < stacksToSpawn.size(); i++)
		{
			NBTTagCompound stackNBT = new NBTTagCompound();
			stacksToSpawn.get(i).writeToNBT(stackNBT);
			nbt.setCompoundTag("stack" + i, stackNBT);
		}
			
    }
	
	@Override
    public void readFromNBT(NBTTagCompound nbt)
    {
		super.readFromNBT(nbt);
		currentDelay = spawnDelay = nbt.getInteger("delay");
		baseID = nbt.getInteger("Base");
		dimension = nbt.getInteger("dim");
		setBase(TeamsManager.getInstance().getBase(baseID));
		if(base != null)
			base.addObject(this);
		for(int i = 0; i < nbt.getInteger("numStacks"); i++)
		{
			stacksToSpawn.add(ItemStack.loadItemStackFromNBT(nbt.getCompoundTag("stack" + i)));
		}
    }

	@Override
	public ITeamBase getBase() 
	{
		return base;
	}
	
	public Team getTeam()
	{
		if(worldObj.isRemote)
			return Team.getTeam(team);
		else return base == null ? null : base.getOwner();
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
		int metadata = worldObj.getBlockMetadata(xCoord, yCoord, zCoord);
		return metadata == 1;
	}
}
