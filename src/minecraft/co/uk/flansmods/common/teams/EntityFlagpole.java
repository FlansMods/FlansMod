package co.uk.flansmods.common.teams;

import java.util.ArrayList;
import java.util.List;

import co.uk.flansmods.common.teams.TeamsManager.TeamsMap;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class EntityFlagpole extends Entity implements ITeamBase {
	
	//Set this when an op sets the base and return to it when the gametype restarts
	public Team defaultTeam;
	//This is the team that currently holds this base, reset it to default team at the end of each round
	public Team currentTeam;
	//The map this base is a part of
	public TeamsMap map;
	//List of all TeamObjects associated with this base
	public List<ITeamObject> objects = new ArrayList<ITeamObject>();
	//The name of this base, changeable by the baseList and baseRename commands
	public String name = "Default Name";
	//This base's ID
	//Do not sync IDs. Not necessary. Only sync team of objects. Much easier than syncing base to object links.
	private int ID;
	
	public static TeamsManager teamsManager = TeamsManager.getInstance();

	public EntityFlagpole(World world) 
	{
		super(world);
		setSize(1F, 2F);
	}	
	
	public EntityFlagpole(World world, double x, double y, double z) 
	{
		this(world);
		setPosition(x, y, z);		
		EntityFlag flag = new EntityFlag(worldObj, this);
		objects.add(flag);
		worldObj.spawnEntityInWorld(flag);
	}	
	
	public EntityFlagpole(World world, int x, int y, int z) 
	{
		this(world, x + 0.5D, y, z + 0.5D);
	}
		
    public AxisAlignedBB getBoundingBox()
    {
    	return null;
        //return AxisAlignedBB.getBoundingBox(posX - 0.5D, posY, posZ - 0.5D, posX + 0.5D, posY + 3D, posZ + 0.5D);
    }
    
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
		setID(tags.getInteger("ID"));
		currentTeam = defaultTeam = Team.getTeam(tags.getString("Team"));
		if(currentTeam != null)
			currentTeam.bases.add(this);
		map = teamsManager.getTeamsMap(tags.getString("Map"));
		//worldObj.spawnEntityInWorld(new EntityFlag(worldObj, this));
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound tags)
	{
		if(defaultTeam != null)
			tags.setString("Team", defaultTeam.shortName);
		tags.setString("Map", map.shortName);
		tags.setInteger("ID", getID());
	}

	@Override
	public Team getOwner() 
	{
		return currentTeam;
	}

	@Override
	public TeamsMap getMap() 
	{
		return map;
	}

	@Override
	public void setMap(TeamsMap newMap) 
	{
		map = newMap;
	}

	@Override
	public List<ITeamObject> getObjects() 
	{
		return objects;
	}

	@Override
	public void setBase(Team newOwners) 
	{
		updateOwners(newOwners);
		currentTeam = defaultTeam = newOwners;
	}

	@Override
	public void captureBase(Team newOwners) 
	{
		updateOwners(newOwners);
		currentTeam = newOwners;
		teamsManager.messageAll("\u00a7" + newOwners.textColour + newOwners.name + "\u00a7f captured " + name + "!");
	}
	
	public void updateOwners(Team newOwners)
	{
		ArrayList<ITeamBase> thisBase = new ArrayList<ITeamBase>();
		thisBase.add(this);
		for(Team team : Team.teams)
		{
			team.bases.removeAll(thisBase);
		}
		if(newOwners != null)
			newOwners.bases.add(this);
	}

	@Override
	public void tick() 
	{
		
	}

	@Override
	public void startRound() 
	{
		updateOwners(defaultTeam);
		currentTeam = defaultTeam;
		for(ITeamObject object : getObjects())
		{
			object.onBaseSet(defaultTeam);
		}
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
	public void setID(int i)
	{
		//dataWatcher.updateObject(16, new Integer(i));
		ID = i;
	}
	
	@Override
	public int getID()
	{
		//return dataWatcher.getWatchableObjectInt(16);
		return ID;
	}
}
