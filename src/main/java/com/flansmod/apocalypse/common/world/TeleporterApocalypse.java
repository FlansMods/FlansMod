package com.flansmod.apocalypse.common.world;

import net.minecraft.block.BlockPortal;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class TeleporterApocalypse extends Teleporter 
{
	private WorldServer world;
	private BlockPos targetTeleporter;
	
	public TeleporterApocalypse(WorldServer world, BlockPos targetTeleporter) 
	{
		super(world);
		this.world = world;
		this.targetTeleporter = targetTeleporter;
	}
	
	@Override
	public boolean makePortal(Entity entity)
    {
		return true;
    }

	@Override
    public boolean placeInExistingPortal(Entity entity, float f)
    {
		entity.setPosition(targetTeleporter.getX() + 2D, targetTeleporter.getY() + 1.5D, targetTeleporter.getZ() + 2D);
		return true;
    }
}
