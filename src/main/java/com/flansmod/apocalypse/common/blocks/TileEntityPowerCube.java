package com.flansmod.apocalypse.common.blocks;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TileEntityPowerCube extends TileEntity implements ITickable
{
	public int age;
	
	@Override
	public void update()
	{
		age++;
	}
}
