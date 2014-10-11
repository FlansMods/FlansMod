package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;

public class EntityFlagpole extends Entity implements ITeamBase
{
	//Set this when an op sets the base and return to it when the gametype restarts
	public int defaultTeamID;
	//This is the team that currently holds this base, reset it to default team at the end of each round
	public int currentTeamID;
	//The map this base is a part of
	public TeamsMap map;
	//List of all TeamObjects associated with this base
	public List<ITeamObject> objects = new ArrayList<ITeamObject>();
	//The name of this base, changeable by the baseList and baseRename commands
	public String name = "Default Name";
	//This base's ID
	//Do not sync IDs. Not necessary. Only sync team of objects. Much easier than syncing base to object links.
	private int ID;
	
	private EntityFlag flag;
	
	public static TeamsManager teamsManager = TeamsManager.getInstance();
	
	//Chunk loading
	private boolean uninitialized = true;
	private int loadDistance = 1;

	public EntityFlagpole(World world) 
	{
		super(world);
		setSize(1F, 2F);
		renderDistanceWeight = 100D;
	}	
	
	public EntityFlagpole(World world, double x, double y, double z) 
	{
		this(world);
		setPosition(x, y, z);		
		flag = new EntityFlag(worldObj, this);
		objects.add(flag);
		worldObj.spawnEntityInWorld(flag);
		if(teamsManager.maps.size() > 0)
			map = teamsManager.maps.values().iterator().next();
	}	
	
	public EntityFlagpole(World world, int x, int y, int z) 
	{
		this(world, x + 0.5D, y, z + 0.5D);
	}
		
    @Override
	public AxisAlignedBB getBoundingBox()
    {
    	return null;
        //return AxisAlignedBB.getBoundingBox(posX - 0.5D, posY, posZ - 0.5D, posX + 0.5D, posY + 3D, posZ + 0.5D);
    }
    
    @Override
	public boolean canBeCollidedWith()
    {
        return true;
    }

	@Override
	protected void entityInit() 
	{
		//dataWatcher.addObject(16, new Integer(0));
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound tags) 
	{
		setBaseID(tags.getInteger("ID"));
		currentTeamID = defaultTeamID = tags.getInteger("TeamID");
		map = teamsManager.maps.get(tags.getString("Map"));
		name = tags.getString("Name");
		setMap(map);
	
		//flag = new EntityFlag(worldObj, this);
		//objects.add(flag);
		//worldObj.spawnEntityInWorld(flag);
		//worldObj.spawnEntityInWorld(new EntityFlag(worldObj, this));
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound tags)
	{
		tags.setInteger("TeamID", defaultTeamID);
		tags.setString("Map", map == null ? "" : map.shortName);
		tags.setInteger("ID", getBaseID());
		tags.setString("Name", name);
	}

	@Override
	public TeamsMap getMap() 
	{
		return map;
	}

	@Override
	public void setMap(TeamsMap newMap) 
	{
		if(newMap == null)
		{
			FlansMod.log("Flagpole given invalid map");
			return;
		}
		if(map != null && map != newMap)
			map.removeBase(this);
		map = newMap;
		newMap.addBase(this);
	}
	
	public void setMapFirstTime(TeamsMap newMap)
	{
		if(newMap == null)
		{
			FlansMod.log("Flagpole given invalid map");
			return;
		}
		if(map != null && map != newMap)
			map.removeBase(this);
		map = newMap;
		newMap.addBaseFirstTime(this);
	}

	@Override
	public List<ITeamObject> getObjects() 
	{
		return objects;
	}
		
	@Override
	public void tick() 
	{
		
	}

	@Override
	public void startRound() 
	{
		currentTeamID = defaultTeamID;
	}

	@Override
	public void addObject(ITeamObject object) 
	{
		objects.add(object);
	}

	@Override
	public String getName() 
	{
		return name;
	}

	@Override
	public void setName(String newName) 
	{
		name = newName;
	}

	@Override
	public void destroy()
	{
		setDead();
	}

	@Override
	public Entity getEntity()
	{
		return this;
	}

	@Override
	public double getPosX() 
	{
		return posX;
	}

	@Override
	public double getPosY() 
	{
		return posY;
	}

	@Override
	public double getPosZ() 
	{
		return posZ;
	}
	
	@Override
	public World getWorld()
	{
		return worldObj;
	}
	
	@Override
	public void roundCleanup()
	{
		if(flag != null)
			flag.reset();
	}
	
	@Override
	public ITeamObject getFlag() 
	{
		return flag;
	}
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		
		if(!worldObj.isRemote)
		{
			if(flag == null)
			{
				flag = new EntityFlag(worldObj, this);
				objects.add(flag);
			}
			if(!flag.addedToChunk)
				worldObj.spawnEntityInWorld(flag);
			if(flag.isHome)
				flag.setPosition(posX, posY + 2F, posZ);
		}
		
		//Temporary fire glitch fix
		if(worldObj.isRemote)
			extinguish();
	}
		
	@Override
	public void setDead() 
	{
		super.setDead();
	}
	
	@Override
    public boolean interactFirst(EntityPlayer player) //interact
    {
		PlayerData data = PlayerHandler.getPlayerData(player);
		if(!worldObj.isRemote && data.team == null && TeamsManager.getInstance().playerIsOp(player) && (player.getCurrentEquippedItem() == null || !(player.getCurrentEquippedItem().getItem() instanceof ItemOpStick)))
			ItemOpStick.openBaseEditGUI(this, (EntityPlayerMP)player);
		
    	/* TODO : Check the generalised code in TeamsManager works
    	if(player instanceof EntityPlayerMP && TeamsManager.getInstance().currentGametype != null)
    		TeamsManager.getInstance().currentGametype.baseClickedByPlayer(this, (EntityPlayerMP)player);
    		*/
        return false;
    }
	
	@Override
    public ItemStack getPickedResult(MovingObjectPosition target)
    {
		ItemStack stack = new ItemStack(FlansMod.flag, 1, 0);
		return stack;
    }

	@Override
	public void setBaseID(int i) 
	{
		ID = i;
	}

	@Override
	public int getBaseID() 
	{
		return ID;
	}

	@Override
	public int getDefaultOwnerID() 
	{
		return defaultTeamID;
	}

	@Override
	public void setDefaultOwnerID(int id) 
	{
		currentTeamID = defaultTeamID = id;
		for(ITeamObject object : objects)
			object.onBaseSet(id);
	}

	@Override
	public int getOwnerID() 
	{
		return currentTeamID;
	}

	@Override
	public void setOwnerID(int id) 
	{
		currentTeamID = id;
	}
	
	//Chunk loading
	/*
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
		Chunk centerChunk = worldObj.getChunkFromBlockCoords(MathHelper.floor_double(posX), MathHelper.floor_double(posZ));
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
	}*/
	
	@Override
    public boolean isBurning()
    {
    	return false;
    }
}
