package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeChunkManager.Ticket;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.ItemPlane;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.guns.ItemAAGun;

public class TileEntitySpawner extends TileEntity implements ITeamObject
{
	//Server side
	public int spawnDelay = 1200;
	public List<ItemStack> stacksToSpawn = new ArrayList<ItemStack>();
	public List<EntityTeamItem> itemEntities = new ArrayList<EntityTeamItem>();
	public Entity spawnedEntity;
	public ITeamBase base;
	private int baseID = -1;
	private int dimension;
	public int currentDelay;

	//Chunk loading
	private Ticket chunkTicket;
	private boolean uninitialized = true;
	private int loadDistance = 1;
	
	//Client side
	private int teamID;
	public String map;
	
	public TileEntitySpawner()
	{
		TeamsManager.getInstance().registerObject(this);
	}
	
	@Override
    public Packet getDescriptionPacket()
    {
        NBTTagCompound tags = new NBTTagCompound();
        tags.setByte("TeamID", base == null ? (byte)0 : (byte)base.getOwnerID());
        tags.setString("Map", base == null || base.getMap() == null ? "" : base.getMap().shortName);
        return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 1, tags);
    }
    
    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity packet)
    {
    	teamID = packet.func_148857_g().getByte("TeamID");
    	map = packet.func_148857_g().getString("Map");
    }
    
    @Override
    public void updateEntity()
    {
    	if(worldObj.isRemote)
    		return;
    	//updateChunkLoading();
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
		if(worldObj.getBlock(xCoord, yCoord, zCoord) != FlansMod.spawner)
		{
			destroy();
			return;
		}
		if(worldObj.getBlockMetadata(xCoord, yCoord, zCoord) == 1)
			return;
		for(int i = itemEntities.size() - 1; i >= 0; i--)
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
				if(worldObj.getBlockMetadata(xCoord, yCoord, zCoord) == 2)
				{
					if(spawnedEntity != null && !spawnedEntity.isDead)
					{
						continue;
					}
					ItemStack stack = stacksToSpawn.get(i);
					if(stack != null && stack.getItem() instanceof ItemPlane)
					{
						spawnedEntity = ((ItemPlane)stack.getItem()).spawnPlane(worldObj, xCoord + 0.5F, yCoord + 0.5F, zCoord + 0.5F, stack);
					}					
					if(stack != null && stack.getItem() instanceof ItemVehicle)
					{
						spawnedEntity = ((ItemVehicle)stack.getItem()).spawnVehicle(worldObj, xCoord + 0.5F, yCoord + 0.5F, zCoord + 0.5F, stack);
					}
					if(stack != null && stack.getItem() instanceof ItemAAGun)
					{
						spawnedEntity = ((ItemAAGun)stack.getItem()).spawnAAGun(worldObj, xCoord + 0.5F, yCoord, zCoord + 0.5F, stack);
					}
				}
				else
				{
					EntityTeamItem itemEntity = new EntityTeamItem(this, i);
					worldObj.spawnEntityInWorld(itemEntity);
				}
			}
		}
    }
    
	@Override
    public void writeToNBT(NBTTagCompound nbt)
    {
		super.writeToNBT(nbt);
		nbt.setInteger("delay", spawnDelay);
		nbt.setInteger("Base", baseID);
		nbt.setInteger("dim", worldObj.provider.dimensionId);
		nbt.setInteger("numStacks", stacksToSpawn.size());
		for(int i = 0; i < stacksToSpawn.size(); i++)
		{
			NBTTagCompound stackNBT = new NBTTagCompound();
			stacksToSpawn.get(i).writeToNBT(stackNBT);
			nbt.setTag("stack" + i, stackNBT);
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
	
	public int getTeamID()
	{
		if(worldObj.isRemote)
			return teamID;
		else return base == null ? 0 : base.getOwnerID();
	}

	@Override
	public void onBaseSet(int newTeamID) 
	{
		FlansMod.packetHandler.sendToDimension(getDescriptionPacket(), worldObj == null ? dimension : worldObj.provider.dimensionId);
	}

	@Override
	public void onBaseCapture(int newTeamID) 
	{
		onBaseSet(newTeamID);
	}

	@Override
	public void setBase(ITeamBase b) 
	{
		base = b;
		if(b != null)
			baseID = b.getBaseID();
		FlansMod.packetHandler.sendToDimension(getDescriptionPacket(), worldObj == null ? dimension : worldObj.provider.dimensionId);
	}

	@Override
	public void tick() 
	{

	}

	@Override
	public void destroy() 
	{
		worldObj.setBlock(xCoord, yCoord, zCoord, Blocks.air);
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
	/*
	
	//Chunk loading
	public void forceChunkLoading(Ticket ticket) 
	{
		chunkTicket = ticket;
		for (ChunkCoordIntPair coord : getLoadArea()) {
			FlansMod.log(String.format("Force loading chunk %s in %s",coord, worldObj.provider.getClass()));
			ForgeChunkManager.forceChunk(ticket, coord);
		}
	}
	
	public List<ChunkCoordIntPair> getLoadArea() 
	{
		List<ChunkCoordIntPair> loadArea = new LinkedList<ChunkCoordIntPair>();
		Chunk centerChunk = worldObj.getChunkFromBlockCoords(xCoord, zCoord);
		loadArea.add(new ChunkCoordIntPair(centerChunk.xPosition, centerChunk.zPosition));
		return loadArea;
	}
	
	public void updateChunkLoading()
	{
		if (worldObj.isRemote)
			return;
		if (uninitialized && chunkTicket == null) 
		{
			chunkTicket = ForgeChunkManager.requestTicket(FlansMod.INSTANCE, worldObj, Type.NORMAL);
			if (chunkTicket != null) 
			{
				forceChunkLoading(chunkTicket);
			}
			uninitialized = false;
		}
	}
	
	@Override
	public void invalidate() 
	{
		super.invalidate();
		ForgeChunkManager.releaseTicket(chunkTicket);
	}
*/

	@Override
	public boolean forceChunkLoading() 
	{
		return false;
	}
}
