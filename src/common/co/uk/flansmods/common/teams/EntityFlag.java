package co.uk.flansmods.common.teams;

import co.uk.flansmods.common.FlansMod;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Entity;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;

public class EntityFlag extends Entity implements ITeamObject {
	
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
		base = pole;
	}
	
    public boolean canBeCollidedWith()
    {
        return true;
    }

	@Override
	protected void entityInit() 
	{
		dataWatcher.addObject(16, new Integer(0));
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound var1) {
		
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound var1) {
	
	}

	@Override
	public ITeamBase getBase() 
	{
		return TeamsManager.getInstance().getBase(dataWatcher.getWatchableObjectInt(16));
	}

	@Override
	public void onBaseSet(Team newOwners) {

	}

	@Override
	public void onBaseCapture(Team newOwners) {

	}

	@Override
	public void tick() {
		if(base == null)
			setDead();
	}

	@Override
	public void setBase(ITeamBase b) 
	{
		base = b;
		dataWatcher.updateObject(16, new Integer(base.getID()));
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

}
