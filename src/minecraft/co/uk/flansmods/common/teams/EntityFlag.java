package co.uk.flansmods.common.teams;

import java.util.ArrayList;

import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.FlansModPlayerHandler;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import cpw.mods.fml.common.FMLCommonHandler;

public class EntityFlag extends Entity implements ITeamObject {
	
	public int baseID;
	public EntityFlagpole base;
	public boolean isHome = true;

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
	
    public boolean canBeCollidedWith()
    {
        return true;
    }

	@Override
	protected void entityInit() 
	{
		dataWatcher.addObject(16, new String("none"));
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
				Team team = FlansModPlayerHandler.getPlayerData(player.username).team;
				TeamsManager.getInstance().messageAll("\u00a7f" + player.username + " dropped the \u00a7" + team.textColour + team.name + "\u00a7f flag");
			}
			ridingEntity = null;
			
		}
	}
	
	public void reset()
	{
		mountEntity(null);
		setPosition(base.posX, base.posY + 2F, base.posZ);
		isHome = true;
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound tags) 
	{
		baseID = tags.getInteger("Base");
		setBase(TeamsManager.getInstance().getBase(baseID));
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound tags) 
	{
		tags.setInteger("Base", base.getID());
	}

	@Override
	public ITeamBase getBase() 
	{
		return base;
	}

	@Override
	public void onBaseSet(Team newOwners) 
	{
		if(newOwners != null)
			dataWatcher.updateObject(16, newOwners.shortName);
		else dataWatcher.updateObject(16, "none");
		setPosition(base.posX, base.posY + 2F, base.posZ);
	}

	@Override
	public void onBaseCapture(Team newOwners) 
	{
		onBaseSet(newOwners);
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
			Team owner = base.getOwner();
			onBaseSet(owner);
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

	public String getTeamName()
	{
		return dataWatcher.getWatchableObjectString(16);
	}
	
	public Team getTeam()
	{
		return Team.getTeam(getTeamName());
	}
	
	@Override
	public boolean isSpawnPoint()
	{
		return false;
	}
	
	@Override
    public boolean interactFirst(EntityPlayer player) //interact
    {
    	if(player instanceof EntityPlayerMP && TeamsManager.getInstance().currentGametype != null)
    		TeamsManager.getInstance().currentGametype.objectClickedByPlayer(this, (EntityPlayerMP)player);
        return false;
    }
	
	@Override
    public ItemStack getPickedResult(MovingObjectPosition target)
    {
		ItemStack stack = new ItemStack(FlansMod.flag.itemID, 1, 0);
		return stack;
    }
}
