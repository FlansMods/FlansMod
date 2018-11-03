package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;

public class EntityFlagpole extends Entity implements ITeamBase
{
	protected static final AxisAlignedBB POLE_AABB = new AxisAlignedBB(-0.2D, 0.0D, -0.2D, 0.4D, 2.0D, 0.4D);
	private static final DataParameter<Integer> FLAGPOLE_ID = EntityDataManager.createKey(EntityFlagpole.class, DataSerializers.VARINT);
	
	//Set this when an op sets the base and return to it when the gametype restarts
	public int defaultTeamID;
	//This is the team that currently holds this base, reset it to default team at the end of each round
	public int currentTeamID;
	//The map this base is a part of
	public TeamsMap map;
	//List of all TeamObjects associated with this base
	public List<ITeamObject> objects = new ArrayList<>();
	// List of spawn points. 
	public List<BlockPos> spawnPoints = new ArrayList<>();
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
	}
	
	public EntityFlagpole(World world, double x, double y, double z)
	{
		this(world);
		setPosition(x, y, z);
		flag = new EntityFlag(world, this);
		objects.add(flag);
		world.spawnEntity(flag);
		//flag.startRiding(this);
		if(teamsManager.maps.size() > 0)
			map = teamsManager.maps.values().iterator().next();
	}
	
	public EntityFlagpole(World world, int x, int y, int z)
	{
		this(world, x + 0.5D, y, z + 0.5D);
	}
	
	public EntityFlagpole(World world, BlockPos pos)
	{
		this(world, pos.getX() + 0.5D, pos.getY() + 1D, pos.getZ() + 0.5D);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public boolean isInRangeToRender3d(double x, double y, double z)
	{
		double dX = this.posX - x;
		double dY = this.posY - y;
		double dZ = this.posZ - z;
		double distSq = dX * dX + dY * dY + dZ * dZ;
		double maxDist = 128.0D * getRenderDistanceWeight();
		return distSq < maxDist * maxDist;
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBox()
	{
		return POLE_AABB;
	}
	
	@Override
	public boolean canBeCollidedWith()
	{
		return true;
	}
	
	@Override
	protected void entityInit()
	{
		getDataManager().register(FLAGPOLE_ID, 0);
	}
	
	@Override
	protected void readEntityFromNBT(NBTTagCompound tags)
	{
		setBaseID(tags.getInteger("ID"));
		currentTeamID = defaultTeamID = tags.getInteger("TeamID");
		map = teamsManager.maps.get(tags.getString("Map"));
		name = tags.getString("Name");
		setMap(map);
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
			FlansMod.log.warn("Flagpole given invalid map");
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
			FlansMod.log.warn("Flagpole given invalid map");
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
		if(map != null)
		{
			map.addObject(this, object);
		}
	}
	
	@Override
	public String getBaseName()
	{
		return name;
	}
	
	@Override
	public void setBaseName(String newName)
	{
		name = newName;
	}
	
	@Override
	public void destroy()
	{
		if(map != null)
		{
			map.removeBase(this);
		}
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
		return world;
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
		
		if(!world.isRemote)
		{
			if(flag == null && getPassengers().get(0) instanceof EntityFlag)
			{
				flag = (EntityFlag)getPassengers().get(0);
			}
			if(flag == null)
			{
				flag = new EntityFlag(world, this);
				objects.add(flag);
			}
			if(!flag.addedToChunk)
				world.spawnEntity(flag);
			if(flag.isHome)
			{
				flag.setPosition(posX, posY + 2F, posZ);
				if(!flag.isRiding() && ticksExisted > 2) // Heckin' race conditions. You'd think MC would sort queue bad passenger packets until later...
					flag.startRiding(this);
			}
		}
		
		//Temporary fire glitch fix
		if(world.isRemote)
			extinguish();
	}
	
	@Override
	public void setDead()
	{
		super.setDead();
	}
	
	@Override
	public boolean processInitialInteract(EntityPlayer player, EnumHand hand)
	{
		PlayerData data = PlayerHandler.getPlayerData(player);
		if(!world.isRemote && data.team == null && TeamsManager.getInstance().playerIsOp(player) && (player.getHeldItemMainhand() == null || !(player.getHeldItemMainhand().getItem() instanceof ItemOpStick)))
			ItemOpStick.openBaseEditGUI(this, (EntityPlayerMP)player);
		
		/* TODO : Check the generalised code in TeamsManager works
		if(player instanceof EntityPlayerMP && TeamsManager.getInstance().currentGametype != null)
			TeamsManager.getInstance().currentGametype.baseClickedByPlayer(this, (EntityPlayerMP)player);
			*/
		return false;
	}
	
	@Override
	public ItemStack getPickedResult(RayTraceResult target)
	{
		return new ItemStack(FlansMod.flag, 1, 0);
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
	
	@Override
	public boolean isBurning()
	{
		return false;
	}
}
