package com.flansmod.client.debug;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

import com.flansmod.common.vector.Vector3f;

/**
 * Entity for debugging purposes.
 * On the client side a line (Vector) between the position of the entity and its pointing location is rendered
 */
public class EntityDebugVector extends EntityDebugColor
{
	
	private static final DataParameter<Float> POINTING_X = EntityDataManager.createKey(EntityDebugVector.class, DataSerializers.FLOAT);
	private static final DataParameter<Float> POINTING_Y = EntityDataManager.createKey(EntityDebugVector.class, DataSerializers.FLOAT);
	private static final DataParameter<Float> POINTING_Z = EntityDataManager.createKey(EntityDebugVector.class, DataSerializers.FLOAT);
	
	public int life = 1000;
	
	/**
	 * @param w World for Entity Constructor
	 */
	public EntityDebugVector(World w)
	{
		super(w);
		setSize(0.25F, 0.25F);
	}
	
	/**
	 * Spawns an EntityDebug Vector
	 *
	 * @param w World for Entity Constructor
	 * @param u Position where the Vector starts
	 * @param v Position where the Vector ends
	 * @param i Lifetime given in ticks
	 * @param r Red Color Value
	 * @param g Green Color Value
	 * @param b Blue Color Value
	 */
	public EntityDebugVector(World w, Vector3f u, Vector3f v, int i, float r, float g, float b)
	{
		this(w);
		setPosition(u.x, u.y, u.z);
		setPointing(v.x, v.y, v.z);
		setColor(r, g, b);
		life = i;
	}
	
	/**
	 * @param w World for Entity Constructor
	 * @param u Position where the Vector starts
	 * @param v Position where the Vector ends
	 * @param i Lifetime given in ticks
	 */
	public EntityDebugVector(World w, Vector3f u, Vector3f v, int i)
	{
		this(w, u, v, i, 1F, 1F, 1F);
	}
	
	@Override
	public void onUpdate()
	{
		life--;
		if(life <= 0)
			setDead();
	}
	
	
	@Override
	protected void entityInit()
	{
		super.entityInit();
		this.dataManager.register(POINTING_X, 1F);
		this.dataManager.register(POINTING_Y, 1F);
		this.dataManager.register(POINTING_Z, 1F);
	}
	
	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound)
	{
		super.readEntityFromNBT(nbttagcompound);
		this.dataManager.set(POINTING_X, nbttagcompound.getFloat("pointing_x"));
		this.dataManager.set(POINTING_Y, nbttagcompound.getFloat("pointing_y"));
		this.dataManager.set(POINTING_Z, nbttagcompound.getFloat("pointing_z"));
	}
	
	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound)
	{
		super.writeEntityToNBT(nbttagcompound);
		nbttagcompound.setFloat("pointing_x", getPointingX());
		nbttagcompound.setFloat("pointing_y", getPointingY());
		nbttagcompound.setFloat("pointing_z", getPointingZ());
	}
	
	/**
	 * @param x The X value of the Position the Vector points to (Relative to Entity Position)
	 */
	public void setPointingX(Float x)
	{
		dataManager.set(POINTING_X, x);
	}
	
	/**
	 * @return The X value of the Position the Vector points to (Relative to Entity Position)
	 */
	public Float getPointingX()
	{
		return dataManager.get(POINTING_X);
	}
	
	/**
	 * @param y The Y value of the Position the Vector points to (Relative to Entity Position)
	 */
	public void setPointingY(Float y)
	{
		dataManager.set(POINTING_Y, y);
	}
	
	/**
	 * @return The Y value of the Position the Vector points to (Relative to Entity Position)
	 */
	public Float getPointingY()
	{
		return dataManager.get(POINTING_Y);
	}
	
	/**
	 * @param z The Z value of the Position the Vector points to (Relative to Entity Position)
	 */
	public void setPointingZ(Float z)
	{
		dataManager.set(POINTING_Z, z);
	}
	
	/**
	 * @return The Z value of the Position the Vector points to (Relative to Entity Position)
	 */
	public Float getPointingZ()
	{
		return dataManager.get(POINTING_Z);
	}
	
	/**
	 * All Parameters are relative to the position of the Entity.
	 * These 3 Parameters describe the location of the Position the Vector points to.
	 *
	 * @param x The X Coordinate
	 * @param y The Y Coordinate
	 * @param z The Z Coordinate
	 */
	public void setPointing(Float x, Float y, Float z)
	{
		setPointingX(x);
		setPointingY(y);
		setPointingZ(z);
	}
}
