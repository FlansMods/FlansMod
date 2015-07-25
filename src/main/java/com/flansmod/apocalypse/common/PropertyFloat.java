package com.flansmod.apocalypse.common;

import net.minecraftforge.common.property.IUnlistedProperty;

public class PropertyFloat implements IUnlistedProperty<Float>
{
	
	protected final String name;
	protected final float minValue, maxValue;
	
	public PropertyFloat(String name)
	{
		this(name, Float.MAX_VALUE, Float.MIN_VALUE);
	}
	
	public PropertyFloat(String name, float minValue, float maxValue)
	{
		this.name = name;
		this.minValue = minValue;
		this.maxValue = maxValue;
	}
	
	@Override
	public String getName()
	{
		return name;
	}
	
	@Override
	public boolean isValid(Float value)
	{
		return minValue > maxValue ? true : (value >= minValue && value <= maxValue);
	}
	
	@Override
	public Class<Float> getType()
	{
		return Float.class;
	}
	
	@Override
	public String valueToString(Float value)
	{
		return value.toString();
	}
	
}