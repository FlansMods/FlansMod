package com.flansmod.apocalypse.common.blocks;

import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;

public class TileEntityPowerCube extends TileEntity implements IUpdatePlayerListBox
{
	public int age;
	
	@Override
	public void update()
	{
		age++;
	}
}
