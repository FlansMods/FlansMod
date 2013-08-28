package co.uk.flansmods.common.guns;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityGrenade extends Entity 
{
	public GrenadeType type;
	public EntityLivingBase thrower;
	
	public EntityGrenade(World w, GrenadeType g, EntityLivingBase t) 
	{
		super(w);
		type = g;
		thrower = t;
	}

	@Override
	protected void entityInit() 
	{

	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) 
	{

	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) 
	{
		
	}

}
