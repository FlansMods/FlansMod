package co.uk.flansmods.common.teams;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import cpw.mods.fml.common.FMLCommonHandler;

public class EntityFlag extends Entity implements ITeamObject {
	
	public int baseID;
	public ITeamBase base;

	public EntityFlag(World world) 
	{
		super(world);
		setSize(1F, 1F);
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
		if(base == null && FMLCommonHandler.instance().getEffectiveSide().isServer())
		{
			setBase(TeamsManager.getInstance().getBase(baseID));
		}
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
		base = b;
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
}
