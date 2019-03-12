package com.flansmod.client.debug;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

/**
 * Class Skeleton for DebugEntities which use a color
 */
public abstract class EntityDebugColor extends Entity
{
	
	private static final DataParameter<Float> COLOR_RED = EntityDataManager.createKey(EntityDebugVector.class, DataSerializers.FLOAT);
	private static final DataParameter<Float> COLOR_GREEN = EntityDataManager.createKey(EntityDebugVector.class, DataSerializers.FLOAT);
	private static final DataParameter<Float> COLOR_BLUE = EntityDataManager.createKey(EntityDebugVector.class, DataSerializers.FLOAT);
	
	/**
	 * @param w World for Entity Constructor
	 */
	public EntityDebugColor(World w)
	{
		super(w);
	}
	
	@Override
	protected void entityInit()
	{
		this.dataManager.register(COLOR_RED, 1F);
		this.dataManager.register(COLOR_GREEN, 1F);
		this.dataManager.register(COLOR_BLUE, 1F);
	}
	
	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound)
	{
		this.setColorRed(nbttagcompound.getFloat("color_red"));
		this.setColorGreen(nbttagcompound.getFloat("color_green"));
		this.setColorBlue(nbttagcompound.getFloat("color_blue"));
	}
	
	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound)
	{
		nbttagcompound.setFloat("color_red", getColorRed());
		nbttagcompound.setFloat("color_green", getColorGreen());
		nbttagcompound.setFloat("color_blue", getColorBlue());
	}
	
	/**
	 * Color values range from 0 (Nonexistent) to 1 (Fully Visible)
	 *
	 * @param red Red color value
	 */
	public void setColorRed(Float red)
	{
		this.dataManager.set(COLOR_RED, red);
	}
	
	/**
	 * Color values range from 0 (Nonexistent) to 1 (Fully Visible)
	 *
	 * @return Red color value
	 */
	public Float getColorRed()
	{
		return this.dataManager.get(COLOR_RED);
	}
	
	/**
	 * Color values range from 0 (Nonexistent) to 1 (Fully Visible)
	 *
	 * @param green Green color value
	 */
	public void setColorGreen(Float green)
	{
		this.dataManager.set(COLOR_GREEN, green);
	}
	
	/**
	 * Color values range from 0 (Nonexistent) to 1 (Fully Visible)
	 *
	 * @return Green color value
	 */
	public Float getColorGreen()
	{
		return dataManager.get(COLOR_GREEN);
	}
	
	/**
	 * Color values range from 0 (Nonexistend) to 1 (Fully Visible)
	 *
	 * @param blue Blue color value
	 */
	public void setColorBlue(Float blue)
	{
		dataManager.set(COLOR_BLUE, blue);
	}
	
	/**
	 * Color values range from 0 (Nonexistent) to 1 (Fully Visible)
	 *
	 * @return Blue color value
	 */
	public Float getColorBlue()
	{
		return dataManager.get(COLOR_BLUE);
	}
	
	/**
	 * Combined Setter for all three color values
	 * Color values range from 0 (Nonexistent) to 1 (Fully Visible)
	 *
	 * @param red   Red color value
	 * @param green Green color value
	 * @param blue  Blue color value
	 */
	public void setColor(Float red, Float green, Float blue)
	{
		setColorRed(red);
		setColorGreen(green);
		setColorBlue(blue);
	}
}
