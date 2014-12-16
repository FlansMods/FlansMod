package com.flansmod.common.teams;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;

public class EntityFlag extends Entity implements ITeamObject {
	
	public int baseID;
	public EntityFlagpole base;
	public boolean isHome = true;
	public int timeUntilReturn;

	public EntityFlag(World world) 
	{
		super(world);
		setSize(1F, 1F);
		renderDistanceWeight = 100D;
		ignoreFrustumCheck = true;
	}
	
	public EntityFlag(World world, EntityFlagpole pole) 
	{
		this(world);
		setPosition(pole.posX, pole.posY + 2F, pole.posZ);
		setBase(pole);
	}
	
    @Override
	public boolean canBeCollidedWith()
    {
        return true;
    }

	@Override
	protected void entityInit() 
	{
		dataWatcher.addObject(2, (byte) 0);
	}
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		//If the base is null, maybe because the flag loaded before the base, check again to see if it exists.
		//Do not do this client side
		if(base == null && !worldObj.isRemote)
		{
			setBase(TeamsManager.getInstance().getBase(baseID));
		}
		if(ridingEntity != null && ridingEntity.isDead)
		{
			if(ridingEntity instanceof EntityPlayerMP)
			{
				EntityPlayerMP player = ((EntityPlayerMP)ridingEntity);
				Team team = PlayerHandler.getPlayerData(player.getCommandSenderName()).team;
				TeamsManager.getInstance();
				TeamsManager.messageAll("\u00a7f" + player.getCommandSenderName() + " dropped the \u00a7" + team.textColour + team.name + "\u00a7f flag");
			}
			mountEntity(null);
			
		}
		if(!addedToChunk)
			worldObj.spawnEntityInWorld(this);
		
		if(timeUntilReturn > 0)
		{
			if(ridingEntity != null || isHome)
				timeUntilReturn = 0;
			else
			{
				timeUntilReturn--;
				if(timeUntilReturn == 0)
				{
					reset();
					Team flagTeam = TeamsManager.getInstance().getTeam(getBase().getOwnerID());
					TeamsManager.messageAll("\u00a7fThe \u00a7" + flagTeam.textColour + flagTeam.name + "\u00a7f flag returned itself");
				}
			}
		}
		
		//Temporary fire glitch fix
		if(worldObj.isRemote)
			extinguish();
	}
	
	@Override
	public void mountEntity(Entity entity)
	{
		if(entity == null)
		{
			if(TeamsManager.getInstance().currentRound != null && TeamsManager.getInstance().currentRound.gametype instanceof GametypeCTF)
			{
				timeUntilReturn = ((GametypeCTF)TeamsManager.getInstance().currentRound.gametype).flagReturnTime * 20;
			}
			else timeUntilReturn = 600; //30 seconds
		}
		
		super.mountEntity(entity);
	}
	
	public void reset()
	{
		mountEntity(null);
		setPosition(base.posX, base.posY + 2F, base.posZ);
		isHome = true;
	}

	@Override
    public boolean writeToNBTOptional(NBTTagCompound tags)
    {
        return false;
    }
	
	@Override
	protected void readEntityFromNBT(NBTTagCompound tags) 
	{
		//baseID = tags.getInteger("Base");
		//setBase(TeamsManager.getInstance().getBase(baseID));
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound tags) 
	{
		//tags.setInteger("Base", base == null ? -1 : base.getBaseID());
		
	}

	@Override
	public ITeamBase getBase() 
	{
		return base;
	}

	@Override
	public void onBaseSet(int newTeamID) 
	{
		dataWatcher.updateObject(2, (byte)newTeamID);
		setPosition(base.posX, base.posY + 2F, base.posZ);
	}

	@Override
	public void onBaseCapture(int newTeamID) 
	{
		onBaseSet(newTeamID);
	}

	@Override
	public void tick() {

	}

	@Override
	public void setBase(ITeamBase b) 
	{
		base = (EntityFlagpole)b;
		if(base != null)
		{
			base.addObject(this);
			onBaseSet(base.getOwnerID());
		}
	}

	@Override
	public void destroy() 
	{
		setDead();
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

	public int getTeamID()
	{
		return dataWatcher.getWatchableObjectByte(2);
	}
		
	@Override
	public boolean isSpawnPoint()
	{
		return false;
	}
	
	@Override
    public boolean interactFirst(EntityPlayer player) //interact
    {
    	/* TODO : Check the generalised code in TeamsManager works
    	if(player instanceof EntityPlayerMP && TeamsManager.getInstance().currentGametype != null)
    		TeamsManager.getInstance().currentGametype.objectClickedByPlayer(this, (EntityPlayerMP)player);
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
	public boolean forceChunkLoading() 
	{
		return false;
	}
	
	@Override
    public boolean isBurning()
    {
    	return false;
    }
}
