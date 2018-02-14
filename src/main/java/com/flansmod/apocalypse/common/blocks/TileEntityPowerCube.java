package com.flansmod.apocalypse.common.blocks;

import net.minecraft.server.gui.ITickable;
import net.minecraft.tileentity.TileEntity;

public class TileEntityPowerCube extends TileEntity implements ITickable
{
	public int age;
	
	@Override
	public void update()
	{
		age++;
	}
}
