package com.flansmod.common.teams;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;

public class EntityFlag extends Entity implements ITeamObject
{
	private static final DataParameter<Byte> TEAMID = EntityDataManager.createKey(EntityFlag.class, DataSerializers.BYTE);
	
	public int baseID;
	public EntityFlagpole base;
	public boolean isHome = true;
	public int timeUntilReturn;
	
	public EntityFlag(World world)
	{
		super(world);
		setSize(1F, 1F);
		ignoreFrustumCheck = true;
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
		getDataManager().register(TEAMID, (byte)0);
	}
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		//If the base is null, maybe because the flag loaded before the base, check again to see if it exists.
		//Do not do this client side
		if(base == null && !world.isRemote)
		{
			setBase(TeamsManager.getInstance().getBase(baseID));
		}
		if(getRidingEntity() != null && getRidingEntity().isDead)
		{
			if(getRidingEntity() instanceof EntityPlayerMP)
			{
				EntityPlayerMP player = ((EntityPlayerMP)getRidingEntity());
				Team team = PlayerHandler.getPlayerData(player.getName()).team;
				TeamsManager.getInstance();
				TeamsManager.messageAll("\u00a7f" + player.getName() + " dropped the \u00a7" + team.textColour + team.name + "\u00a7f flag");
			}
			else if(getRidingEntity() instanceof EntityFlagpole)
			{
				setDead();
			}
			dismountRidingEntity();
		}
		if(!addedToChunk)
			world.spawnEntity(this);
		
		if(timeUntilReturn > 0)
		{
			if(getRidingEntity() instanceof EntityPlayerMP || isHome)
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
		if(world.isRemote)
			extinguish();
	}
	
	@Override
	public void dismountRidingEntity()
	{
		if(TeamsManager.getInstance().currentRound != null && TeamsManager.getInstance().currentRound.gametype instanceof GametypeCTF)
		{
			timeUntilReturn = ((GametypeCTF)TeamsManager.getInstance().currentRound.gametype).flagReturnTime * 20;
		}
		else timeUntilReturn = 600; //30 seconds
	}
	
	public void reset()
	{
		if(base == null)
		{
			if(getRidingEntity() instanceof EntityFlagpole)
				base = (EntityFlagpole)getRidingEntity();
		}
		dismountRidingEntity();
		if(base != null)
			setPosition(base.posX, base.posY + 2F, base.posZ);
		//startRiding(base);
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
		getDataManager().set(TEAMID, (byte)newTeamID);
		setPosition(base.posX, base.posY + 2F, base.posZ);
		//startRiding(base);
	}
	
	@Override
	public void onBaseCapture(int newTeamID)
	{
		onBaseSet(newTeamID);
	}
	
	@Override
	public void tick()
	{
	
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
		return getDataManager().get(TEAMID);
	}
	
	@Override
	public boolean isSpawnPoint()
	{
		return false;
	}
	
	@Override
	public boolean processInitialInteract(EntityPlayer player, EnumHand hand)
	{
		/* TODO : Check the generalised code in TeamsManager works
		if(player instanceof EntityPlayerMP && TeamsManager.getInstance().currentGametype != null)
			TeamsManager.getInstance().currentGametype.objectClickedByPlayer(this, (EntityPlayerMP)player);
			*/
		return false;
	}
	
	@Override
	public ItemStack getPickedResult(RayTraceResult target)
	{
		return new ItemStack(FlansMod.flag, 1, 0);
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
