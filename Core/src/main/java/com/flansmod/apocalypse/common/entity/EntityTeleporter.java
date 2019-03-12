package com.flansmod.apocalypse.common.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;

import com.flansmod.apocalypse.common.FlansModApocalypse;
import com.flansmod.apocalypse.common.world.TeleporterApocalypse;

public class EntityTeleporter extends Entity
{
	/**
	 * Points to the lower left power cube in the portal frame
	 */
	private BlockPos lowerLeftCornerPowerCube;
	/**
	 * Points to the lower left power cube in the target teleporter
	 */
	private BlockPos targetTeleporter;
	
	public EntityTeleporter(World world)
	{
		super(world);
		setSize(1F, 1F);
	}
	
	public EntityTeleporter(World world, BlockPos pos)
	{
		this(world);
		this.lowerLeftCornerPowerCube = pos;
		this.setPosition(pos.getX() + 2D, pos.getY(), pos.getZ() + 2D);
	}
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		
		if(lowerLeftCornerPowerCube == null)
		{
			lowerLeftCornerPowerCube = new BlockPos(MathHelper.floor(posX - 1.5D), MathHelper.floor(posY + 0.5D), MathHelper.floor(posZ - 1.5D));
		}

		if(!world.isRemote)
			for(int i = 0; i < 2; i++)
				for(int j = 0; j < 2; j++)
					if(world.getBlockState(lowerLeftCornerPowerCube.add(3 * i, 0, 3 * j)).getBlock() != FlansModApocalypse.blockPowerCube)
					{
						setDead();
						//if(targetTeleporter != null)
						//	FMLCommonHandler.instance().getMinecraftServerInstance().worldServerForDimension(otherDimension(this.dimension)).
					}
		
		for(int i = 0; i < 10; i++)
		{
			double dX = rand.nextGaussian();
			double dY = rand.nextGaussian();
			double dZ = rand.nextGaussian();
			world.spawnParticle(EnumParticleTypes.PORTAL, posX + dX, posY + 1 + dY, posZ + dZ, dX, dY, dZ);
		}
	}
	
	private int otherDimension(int i)
	{
		if(i == 0)
			return FlansModApocalypse.dimensionID;
		return 0;
	}
	
	@Override
	public void onCollideWithPlayer(EntityPlayer player)
	{
		if(!world.isRemote)
		{
			if(targetTeleporter == null && world.provider.getDimension() == FlansModApocalypse.dimensionID)
				findPortal(player);
			
			if(targetTeleporter != null && player.timeUntilPortal <= 0)
			{
				player.timeUntilPortal = 200;
				//Switch between overworld and apocalypse
				if(world.provider.getDimension() == 0)
				{
					FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().transferPlayerToDimension((EntityPlayerMP)player,
							FlansModApocalypse.dimensionID,
							new TeleporterApocalypse(FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(FlansModApocalypse.dimensionID), this.targetTeleporter));
				}
				else
				{
					FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().transferPlayerToDimension((EntityPlayerMP)player,
							0, new TeleporterApocalypse(FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(0), this.targetTeleporter));
				}
			}
		}
		
	}
	
	private void findPortal(EntityPlayer player)
	{
		BlockPos entryPoint = FlansModApocalypse.proxy.data.entryPoints.get(player.getPersistentID());

		//Find a valid place to enter the world
		World overworld = FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(0);
		
		if(entryPoint == null)
			entryPoint = overworld.getSpawnPoint();

		for(int i = overworld.rand.nextInt(100); i < 300; i++)
		{
			double dX = Math.cos(i) * FlansModApocalypse.RETURN_RADIUS;
			double dZ = Math.sin(i) * FlansModApocalypse.RETURN_RADIUS;
			
			BlockPos pos = new BlockPos(entryPoint.getX() + dX, 256, entryPoint.getZ() + dZ);
			for(; pos.getY() >= 0; pos = pos.down())
			{
				if(overworld.isAirBlock(pos) && overworld.isSideSolid(pos.down(), EnumFacing.UP))
				{
					//We have found a valid position
					if(createPortal(overworld, pos))
					{
						targetTeleporter = pos;
						return;
					}
				}
			}
		}
	}
	
	private boolean createPortal(World world, BlockPos pos)
	{
		//If there isn't enough space, reject this spot
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				for(int k = 0; k < 4; k++)
				{
					if(world.getBlockState(pos.add(i, j, k)).getBlock() != Blocks.AIR)
						return false;
				}
			}
		}
		//Create portal
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				world.setBlockState(pos.add(i * 3, -1, j * 3), Blocks.OBSIDIAN.getDefaultState());
				world.setBlockState(pos.add(i * 3, 0, j * 3), FlansModApocalypse.blockPowerCube.getDefaultState());
				world.setBlockState(pos.add(1 + i, -1, 1 + j), Blocks.OBSIDIAN.getDefaultState());
			}
		}
		//Create obsidian base pillar to avoid floating portals
		for(int i = 0; i < 4; i++)
		{
			for(int k = 0; k < 4; k++)
			{
				for(int j = -1; j >= 1 && world.getBlockState(pos.add(i, j, k)).getBlock() == Blocks.AIR; j--)
				{
					world.setBlockState(pos.add(i, j, k), Blocks.OBSIDIAN.getDefaultState());
				}
			}
		}
		EntityTeleporter teleporter = new EntityTeleporter(world, pos);
		teleporter.targetTeleporter = new BlockPos(lowerLeftCornerPowerCube);
		world.spawnEntity(teleporter);
		
		return true;
	}

	@Override
	protected void entityInit()
	{

	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound tags)
	{
		lowerLeftCornerPowerCube = new BlockPos(tags.getInteger("X"), tags.getInteger("Y"), tags.getInteger("Z"));
		this.setPosition(lowerLeftCornerPowerCube.getX() + 2D, lowerLeftCornerPowerCube.getY() + 1D, lowerLeftCornerPowerCube.getZ() + 2D);
		if(tags.hasKey("targetX"))
			targetTeleporter = new BlockPos(tags.getInteger("targetX"), tags.getInteger("targetY"), tags.getInteger("targetZ"));
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound tags)
	{
		tags.setInteger("X", lowerLeftCornerPowerCube.getX());
		tags.setInteger("Y", lowerLeftCornerPowerCube.getY());
		tags.setInteger("Z", lowerLeftCornerPowerCube.getZ());
		if(targetTeleporter != null)
		{
			tags.setInteger("targetX", targetTeleporter.getX());
			tags.setInteger("targetY", targetTeleporter.getY());
			tags.setInteger("targetZ", targetTeleporter.getZ());
		}
	}

}
