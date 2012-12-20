package co.uk.flansmods.common.teams;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntitySpawner extends TileEntity implements ITeamObject
{
	public int spawnDelay;
	public ItemStack[] stacksToSpawn;
	public ITeamBase base;
	private int baseID = -1;
	
	public TileEntitySpawner()
	{
		stacksToSpawn = new ItemStack[5];
	}
	
	@Override
    public void writeToNBT(NBTTagCompound nbt)
    {
		super.writeToNBT(nbt);
		nbt.setInteger("delay", spawnDelay);
		if(base != null)
			nbt.setInteger("Base", base.getID());
    }
	
	@Override
    public void readFromNBT(NBTTagCompound nbt)
    {
		super.readFromNBT(nbt);
		spawnDelay = nbt.getInteger("delay");
		baseID = nbt.getInteger("Base");
		setBase(TeamsManager.getInstance().getBase(baseID));
    }

	@Override
	public ITeamBase getBase() 
	{
		return base;
	}

	@Override
	public void onBaseSet(Team newOwners) 
	{
		
	}

	@Override
	public void onBaseCapture(Team newOwners) 
	{
		
	}

	@Override
	public void setBase(ITeamBase b) 
	{
		base = b;
	}

	@Override
	public void tick() 
	{
		//If the base was loaded after the spawner, check to see if the base has now been loaded
		if(baseID >= 0 && base == null && !worldObj.isRemote)
		{
			setBase(TeamsManager.getInstance().getBase(baseID));
		}
	}

	@Override
	public void destroy() 
	{
		worldObj.setBlockWithNotify(xCoord, yCoord, zCoord, 0);
	}

	@Override
	public double getPosX() 
	{
		return xCoord;
	}

	@Override
	public double getPosY() 
	{
		return yCoord;
	}

	@Override
	public double getPosZ() 
	{
		return zCoord;
	}
}
