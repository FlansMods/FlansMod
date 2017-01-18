package com.flansmod.apocalypse.common.world.buildings;

import java.util.Random;

import com.flansmod.apocalypse.common.FlansModApocalypse;
import com.flansmod.common.FlansMod;
import com.flansmod.common.ModuloHelper;
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EnumDriveablePart;

import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockColored;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenRunway extends WorldGenFlan 
{
	@Override
	public boolean generate(World world, Random rand, BlockPos pos) 
	{
		int chunkX = pos.getX() / 16;
		
		int x = pos.getX();
		int z = pos.getZ();
		
		int yHeight = 108;
		
		//Create runway
		for(int j = 1; j < 8; j++)
		{
			fillArea(world, x, yHeight - j, z + j, x + 16, yHeight - j + 1, z + 16 - j, Blocks.stone.getDefaultState());
		}
		fillArea(world, x, yHeight, z, x + 16, yHeight + 1, z + 16, Blocks.stained_hardened_clay.getStateFromMeta(15));
		
		fillArea(world, x + 2, yHeight, z + 7, x + 6, yHeight + 1, z + 9, Blocks.quartz_block.getDefaultState());
		fillArea(world, x + 10, yHeight, z + 7, x + 14, yHeight + 1, z + 9, Blocks.quartz_block.getDefaultState());
		

		
		fillArea(world, x, yHeight + 1, z, x + 16, yHeight + 11, z + 16, Blocks.air.getDefaultState());
		
		if(ModuloHelper.modulo(chunkX, 4) == 0)
		{
			//Create hangar
			fillArea(world, x, yHeight + 1, z, x + 16, yHeight + 5, z + 1, Blocks.wool.getStateFromMeta(13));
			fillArea(world, x, yHeight + 5, z + 1, x + 16, yHeight + 7, z + 2, Blocks.wool.getStateFromMeta(13));
			fillArea(world, x, yHeight + 7, z + 2, x + 16, yHeight + 8, z + 3, Blocks.wool.getStateFromMeta(13));
			fillArea(world, x, yHeight + 8, z + 3, x + 16, yHeight + 9, z + 5, Blocks.wool.getStateFromMeta(13));
			fillArea(world, x, yHeight + 9, z + 5, x + 16, yHeight + 10, z + 11, Blocks.wool.getStateFromMeta(13));
			
			fillArea(world, x, yHeight + 8, z + 11, x + 16, yHeight + 9, z + 13, Blocks.wool.getStateFromMeta(13));
			fillArea(world, x, yHeight + 7, z + 13, x + 16, yHeight + 8, z + 14, Blocks.wool.getStateFromMeta(13));
			fillArea(world, x, yHeight + 5, z + 14, x + 16, yHeight + 7, z + 15, Blocks.wool.getStateFromMeta(13));		
			fillArea(world, x, yHeight + 1, z + 15, x + 16, yHeight + 5, z + 16, Blocks.wool.getStateFromMeta(13));
			
			fillArea(world, x, yHeight + 1, z + 1, x + 1, yHeight + 5, z + 15, Blocks.wool.getStateFromMeta(13));
			fillArea(world, x, yHeight + 5, z + 2, x + 1, yHeight + 7, z + 14, Blocks.wool.getStateFromMeta(13));
			fillArea(world, x, yHeight + 7, z + 3, x + 1, yHeight + 8, z + 13, Blocks.wool.getStateFromMeta(13));
			fillArea(world, x, yHeight + 8, z + 5, x + 1, yHeight + 9, z + 11, Blocks.wool.getStateFromMeta(13));
			
			world.setBlockState(new BlockPos(x + 1, yHeight + 1, z + 1), Blocks.crafting_table.getDefaultState());
			world.setBlockState(new BlockPos(x + 2, yHeight + 1, z + 1), FlansMod.workbench.getStateFromMeta(0));
			world.setBlockState(new BlockPos(x + 1, yHeight + 1, z + 14), FlansMod.workbench.getStateFromMeta(0));
			
			
			world.setBlockState(new BlockPos(x + 1, yHeight + 4, z + 14), Blocks.glowstone.getDefaultState(), 2);
			world.setBlockState(new BlockPos(x + 1, yHeight + 4, z + 1), Blocks.glowstone.getDefaultState(), 2);
			world.setBlockState(new BlockPos(x + 1, yHeight + 7, z + 12), Blocks.glowstone.getDefaultState(), 2);
			world.setBlockState(new BlockPos(x + 1, yHeight + 7, z + 3), Blocks.glowstone.getDefaultState(), 2);
			
			world.setBlockState(new BlockPos(x + 3, yHeight + 1, z + 14), FlansModApocalypse.getLootGenerator().getRandomWeaponBox(rand).getDefaultState());
			world.setBlockState(new BlockPos(x + 4, yHeight + 1, z + 14), FlansModApocalypse.getLootGenerator().getRandomWeaponBox(rand).getDefaultState());

			world.setBlockState(new BlockPos(x + 4, yHeight + 1, z + 1), Blocks.chest.getDefaultState().withProperty(BlockChest.FACING, EnumFacing.NORTH), 2);
			world.setBlockState(new BlockPos(x + 5, yHeight + 1, z + 1), Blocks.chest.getDefaultState().withProperty(BlockChest.FACING, EnumFacing.NORTH), 2);
			
			BlockPos chestPos = new BlockPos(x + 4, yHeight + 1, z + 1);
            TileEntity tileentity = world.getTileEntity(chestPos);
            if (tileentity instanceof TileEntityChest)
            {
            	FlansModApocalypse.getLootGenerator().fillVillageChest(rand, (TileEntityChest)tileentity);
            }
            
			chestPos = new BlockPos(x + 5, yHeight + 1, z + 1);
            tileentity = world.getTileEntity(chestPos);
            if (tileentity instanceof TileEntityChest)
            {
            	FlansModApocalypse.getLootGenerator().fillVillageChest(rand, (TileEntityChest)tileentity);
            }

		}
		
		if(ModuloHelper.modulo(chunkX, 4) == 1)
		{
			//Spawn a plane
			DriveableType type = FlansModApocalypse.getLootGenerator().getRandomPlane(rand);
	    	NBTTagCompound tags = new NBTTagCompound();
	    	tags.setString("Engine", FlansModApocalypse.getLootGenerator().getRandomEngine(type, rand).shortName);
	    	tags.setString("Type", type.shortName);
	    	for(EnumDriveablePart part : EnumDriveablePart.values())
	    	{
	    		tags.setInteger(part.getShortName() + "_Health", type.health.get(part) == null ? 0 : rand.nextInt(type.health.get(part).health));
	    		tags.setBoolean(part.getShortName() + "_Fire", false);
	    	}
	    	
	    	EntityDriveable entity = type.createDriveable(world, x + 8, yHeight + 3, z + 8, new DriveableData(tags));
	    	
	    	entity.setRotation(0F, 0, 0);
	    	
	        world.spawnEntityInWorld(entity);
		}

		return false;
	}
}
