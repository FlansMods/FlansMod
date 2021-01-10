package com.flansmod.apocalypse.common.world.buildings;

import java.util.Random;

import com.flansmod.apocalypse.common.FlansModApocalypse;
import com.flansmod.apocalypse.common.entity.EntityAIMecha;
import com.flansmod.common.BlockItemHolder;
import com.flansmod.common.FlansMod;
import com.flansmod.common.ModuloHelper;
import com.flansmod.common.TileEntityItemHolder;
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.mechas.EnumMechaSlotType;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ShootableType;

import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockFlowerPot;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityBrewingStand;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

public class WorldGenAbandonedPortal extends WorldGenFlan
{
	@Override
	public boolean generate(World world, Random rand, BlockPos pos)
	{
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		
		// Base
		replaceEmpty(world, x + 0, y - 3, z + 0, x + 12, y - 2, z + 12, FlansModApocalypse.blockLabStone.getDefaultState());
		replaceEmpty(world, x + 1, y - 2, z + 1, x + 11, y - 1, z + 11, FlansModApocalypse.blockLabStone.getDefaultState());
		replaceEmpty(world, x + 2, y - 1, z + 2, x + 10, y - 0, z + 10, FlansModApocalypse.blockLabStone.getDefaultState());
		replaceEmpty(world, x + 3, y - 0, z + 3, x + 9, y + 1, z + 9, FlansModApocalypse.blockLabStone.getDefaultState());
		
		//Teleporter Room
		{
			fillArea(world, x + 4, y + 1, z + 4, x + 8, y + 2, z + 8, Blocks.OBSIDIAN.getDefaultState());
			for(int n = 0; n < 2; n++)
			{
				world.setBlockState(new BlockPos(x + 4 + rand.nextInt(2) * 3, y + 2, z + 4 + rand.nextInt(2) * 3), FlansModApocalypse.blockPowerCube.getDefaultState());
			}
			
			BlockPos chestPos = new BlockPos(x + 3 + rand.nextInt(2) * 5, y + 1, z + 3 + rand.nextInt(2) * 5);
			
			world.setBlockState(chestPos, Blocks.CHEST.getDefaultState().withProperty(BlockChest.FACING, EnumFacing.SOUTH));
			
			//Fill chests
			TileEntity tileentity = world.getTileEntity(chestPos);
			if(tileentity instanceof TileEntityChest)
			{
				TileEntityChest chest = (TileEntityChest)tileentity;
				FlansModApocalypse.getLootGenerator().fillWeaponChest(rand, chest);
				chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Blocks.OBSIDIAN, rand.nextInt(8) + 1));
				chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(FlansModApocalypse.itemBlockPowerCube));
			}
		}
		return false;
	}
	


}