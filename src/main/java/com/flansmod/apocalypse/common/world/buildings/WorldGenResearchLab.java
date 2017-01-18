package com.flansmod.apocalypse.common.world.buildings;

import java.util.Random;

import com.flansmod.apocalypse.common.FlansModApocalypse;
import com.flansmod.apocalypse.common.entity.EntityAIMecha;
import com.flansmod.common.BlockItemHolder;
import com.flansmod.common.FlansMod;
import com.flansmod.common.ModuloHelper;
import com.flansmod.common.TileEntityItemHolder;
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.mechas.EnumMechaSlotType;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ShootableType;

import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockFlowerPot;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityBrewingStand;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenResearchLab extends WorldGenFlan 
{
	@Override
	public boolean generate(World world, Random rand, BlockPos pos) 
	{
		int chunkX = ModuloHelper.divide(pos.getX(), 16);
		int chunkZ = ModuloHelper.divide(pos.getZ(), 16);
		
		int structureX = ModuloHelper.divide(chunkX, 3);
		int structureZ = ModuloHelper.divide(chunkZ, 3);
		
		int pieceX = ModuloHelper.modulo(chunkX, 3);
		int pieceZ = ModuloHelper.modulo(chunkZ, 3);
		
		int topLayerHeight = 99;
		
		//Generate empty rooms
		for(int i = (pieceX == 1 & pieceZ == 1 ? -1 : 0); i < 8; i++)
		{
			fillArea(world, chunkX * 16, topLayerHeight - 8 * i, chunkZ * 16, chunkX * 16 + 16, topLayerHeight - 8 * i + 8, chunkZ * 16 + 16, FlansModApocalypse.blockLabStone.getDefaultState(), Blocks.air.getDefaultState());			
			fillArea(world, chunkX * 16, topLayerHeight - 8 * i + 6, chunkZ * 16, chunkX * 16 + 16, topLayerHeight - 8 * i + 7, chunkZ * 16 + 16, FlansModApocalypse.blockLabStone.getDefaultState());	
			//Add glowstone lights
			for(int j = 0; j < 2; j++)
			{
				for(int k = 0; k < 2; k++)
				{
					fillArea(world, chunkX * 16 + 3 + 8 * j, topLayerHeight - 8 * i + 6, chunkZ * 16 + 3 + 8 * k, chunkX * 16 + 5 + 8 * j, topLayerHeight - 8 * i + 7, chunkZ * 16 + 5 + 8 * k, Blocks.glowstone.getDefaultState());
					if(world.isRemote)
					{
						for(int x = 0; x < 2; x++)
						{
							for(int z = 0; z < 2; z++)
							{
								world.setLightFor(EnumSkyBlock.BLOCK, new BlockPos(chunkX * 16 + 3 + 8 * j + x, topLayerHeight - 8 * i + 6, chunkZ * 16 + 3 + 8 * k + z), 15);
								world.getLightFromNeighborsFor(EnumSkyBlock.BLOCK, new BlockPos(chunkX * 16 + 3 + 8 * j + x, topLayerHeight - 8 * i + 5, chunkZ * 16 + 3 + 8 * k + z));
							}
						}	
					}
				}
			}
			
			//Make doors
			if(pieceX != 0)
				fillArea(world, chunkX * 16 + 0, topLayerHeight - 8 * i + 1, chunkZ * 16 + 7, chunkX * 16 + 1, topLayerHeight - 8 * i + 4, chunkZ * 16 + 9, Blocks.air.getDefaultState());			
			if(pieceX != 2)
				fillArea(world, chunkX * 16 + 15, topLayerHeight - 8 * i + 1, chunkZ * 16 + 7, chunkX * 16 + 16, topLayerHeight - 8 * i + 4, chunkZ * 16 + 9, Blocks.air.getDefaultState());			
			if(pieceZ != 0)
				fillArea(world, chunkX * 16 + 7, topLayerHeight - 8 * i + 1, chunkZ * 16 + 0, chunkX * 16 + 9, topLayerHeight - 8 * i + 4, chunkZ * 16 + 1, Blocks.air.getDefaultState());			
			if(pieceZ != 2)
				fillArea(world, chunkX * 16 + 7, topLayerHeight - 8 * i + 1, chunkZ * 16 + 15, chunkX * 16 + 9, topLayerHeight - 8 * i + 4, chunkZ * 16 + 16, Blocks.air.getDefaultState());	
			
			for(int j = 0; j < 16; j++)
			{
				for(int k = 0; k < 16; k++)
				{
					//world.checkLightFor(EnumSkyBlock.BLOCK, new BlockPos(chunkX * 16 + j, topLayerHeight - 8 * i + 4, chunkZ * 18 + k));
				}
			}
		}
		//Populate rooms
		for(int i = 0; i < 8; i++)
		{
			if(i == 7 && pieceX == 1 && pieceZ == 1)
			{
				//Teleporter Room
				fillArea(world, chunkX * 16 + 3, topLayerHeight - 8 * i, chunkZ * 16 + 3, chunkX * 16 + 13, topLayerHeight - 8 * i + 1, chunkZ * 16 + 13, Blocks.glowstone.getDefaultState());	
				fillArea(world, chunkX * 16 + 4, topLayerHeight - 8 * i, chunkZ * 16 + 4, chunkX * 16 + 12, topLayerHeight - 8 * i + 1, chunkZ * 16 + 12, FlansModApocalypse.blockLabStone.getDefaultState());
				fillArea(world, chunkX * 16 + 6, topLayerHeight - 8 * i + 1, chunkZ * 16 + 6, chunkX * 16 + 10, topLayerHeight - 8 * i + 2, chunkZ * 16 + 10, Blocks.obsidian.getDefaultState());
				fillArea(world, chunkX * 16 + 6, topLayerHeight - 8 * i + 1, chunkZ * 16 + 7, chunkX * 16 + 7, topLayerHeight - 8 * i + 2, chunkZ * 16 + 9, Blocks.stone_slab.getStateFromMeta(7));
				fillArea(world, chunkX * 16 + 9, topLayerHeight - 8 * i + 1, chunkZ * 16 + 7, chunkX * 16 + 10, topLayerHeight - 8 * i + 2, chunkZ * 16 + 9, Blocks.stone_slab.getStateFromMeta(7));
				fillArea(world, chunkX * 16 + 7, topLayerHeight - 8 * i + 1, chunkZ * 16 + 6, chunkX * 16 + 9, topLayerHeight - 8 * i + 2, chunkZ * 16 + 7, Blocks.stone_slab.getStateFromMeta(7));
				fillArea(world, chunkX * 16 + 7, topLayerHeight - 8 * i + 1, chunkZ * 16 + 9, chunkX * 16 + 9, topLayerHeight - 8 * i + 2, chunkZ * 16 + 10, Blocks.stone_slab.getStateFromMeta(7));
				world.setBlockState(new BlockPos(chunkX * 16 + 6, topLayerHeight - 8 * i + 2, chunkZ * 16 + 6), FlansModApocalypse.blockPowerCube.getDefaultState());
				
				for(int k = 0; k < 8; k++)
					spawnMecha(world, rand, chunkX * 16 + 4 + rand.nextInt(8), topLayerHeight - 8 * i + 2, chunkZ * 16 + 4 + rand.nextInt(8));
			}
			//Build entrance
			else if(i == 0 && pieceX == 1 && pieceZ == 1)
			{
				i--;
				
				//Make hole
				fillArea(world, chunkX * 16 + 4, topLayerHeight - 8 * i + 1, chunkZ * 16 + 4, chunkX * 16 + 12, topLayerHeight - 8 * i + 2, chunkZ * 16 + 12, Blocks.nether_brick_fence.getDefaultState());	
				fillArea(world, chunkX * 16 + 5, topLayerHeight - 8 * i - 2, chunkZ * 16 + 5, chunkX * 16 + 11, topLayerHeight - 8 * i + 2, chunkZ * 16 + 11, Blocks.air.getDefaultState());	
				fillArea(world, chunkX * 16 + 7, topLayerHeight - 8 * i + 1, chunkZ * 16 + 11, chunkX * 16 + 9, topLayerHeight - 8 * i + 2, chunkZ * 16 + 12, Blocks.air.getDefaultState());	
				
				//Build stairs
				fillArea(world, chunkX * 16 + 7, topLayerHeight - 8 * i - 1, chunkZ * 16 + 9, chunkX * 16 + 9, topLayerHeight - 8 * i, chunkZ * 16 + 11, FlansModApocalypse.blockLabStone.getDefaultState());	
				fillArea(world, chunkX * 16 + 5, topLayerHeight - 8 * i - 2, chunkZ * 16 + 9, chunkX * 16 + 7, topLayerHeight - 8 * i - 1, chunkZ * 16 + 11, FlansModApocalypse.blockLabStone.getDefaultState());	
				fillArea(world, chunkX * 16 + 9, topLayerHeight - 8 * i - 2, chunkZ * 16 + 9, chunkX * 16 + 11, topLayerHeight - 8 * i - 1, chunkZ * 16 + 11, FlansModApocalypse.blockLabStone.getDefaultState());	
				fillArea(world, chunkX * 16 + 9, topLayerHeight - 8 * i - 3, chunkZ * 16 + 7, chunkX * 16 + 11, topLayerHeight - 8 * i - 2, chunkZ * 16 + 9, FlansModApocalypse.blockLabStone.getDefaultState());	
				fillArea(world, chunkX * 16 + 5, topLayerHeight - 8 * i - 3, chunkZ * 16 + 7, chunkX * 16 + 7, topLayerHeight - 8 * i - 2, chunkZ * 16 + 9, FlansModApocalypse.blockLabStone.getDefaultState());	
				fillArea(world, chunkX * 16 + 5, topLayerHeight - 8 * i - 4, chunkZ * 16 + 5, chunkX * 16 + 11, topLayerHeight - 8 * i - 3, chunkZ * 16 + 7, FlansModApocalypse.blockLabStone.getDefaultState());	
				fillArea(world, chunkX * 16 + 7, topLayerHeight - 8 * i - 5, chunkZ * 16 + 7, chunkX * 16 + 9, topLayerHeight - 8 * i - 4, chunkZ * 16 + 9, FlansModApocalypse.blockLabStone.getDefaultState());	
				fillArea(world, chunkX * 16 + 7, topLayerHeight - 8 * i - 6, chunkZ * 16 + 9, chunkX * 16 + 9, topLayerHeight - 8 * i - 5, chunkZ * 16 + 11, FlansModApocalypse.blockLabStone.getDefaultState());	
				fillArea(world, chunkX * 16 + 7, topLayerHeight - 8 * i - 7, chunkZ * 16 + 11, chunkX * 16 + 9, topLayerHeight - 8 * i - 6, chunkZ * 16 + 13, FlansModApocalypse.blockLabStone.getDefaultState());	
				fillArea(world, chunkX * 16 + 5, topLayerHeight - 8 * i - 7, chunkZ * 16 + 9, chunkX * 16 + 7, topLayerHeight - 8 * i - 6, chunkZ * 16 + 11, FlansModApocalypse.blockLabStone.getDefaultState());	
				fillArea(world, chunkX * 16 + 9, topLayerHeight - 8 * i - 7, chunkZ * 16 + 9, chunkX * 16 + 11, topLayerHeight - 8 * i - 6, chunkZ * 16 + 11, FlansModApocalypse.blockLabStone.getDefaultState());	
				
				i++;
			}
			else
			{
				boolean spawnMecha = true;
				switch(i == 6 && pieceX == 1 && pieceZ == 1 ? 4 : rand.nextInt(7))
				{
				case 0 : //Stairs
				{
					//Make hole
					fillArea(world, chunkX * 16 + 4, topLayerHeight - 8 * i + 1, chunkZ * 16 + 4, chunkX * 16 + 12, topLayerHeight - 8 * i + 2, chunkZ * 16 + 12, Blocks.nether_brick_fence.getDefaultState());	
					fillArea(world, chunkX * 16 + 5, topLayerHeight - 8 * i - 2, chunkZ * 16 + 5, chunkX * 16 + 11, topLayerHeight - 8 * i + 2, chunkZ * 16 + 11, Blocks.air.getDefaultState());	
					fillArea(world, chunkX * 16 + 7, topLayerHeight - 8 * i + 1, chunkZ * 16 + 11, chunkX * 16 + 9, topLayerHeight - 8 * i + 2, chunkZ * 16 + 12, Blocks.air.getDefaultState());	
					
					//Build stairs
					fillArea(world, chunkX * 16 + 7, topLayerHeight - 8 * i - 1, chunkZ * 16 + 9, chunkX * 16 + 9, topLayerHeight - 8 * i, chunkZ * 16 + 11, FlansModApocalypse.blockLabStone.getDefaultState());	
					fillArea(world, chunkX * 16 + 5, topLayerHeight - 8 * i - 2, chunkZ * 16 + 9, chunkX * 16 + 7, topLayerHeight - 8 * i - 1, chunkZ * 16 + 11, FlansModApocalypse.blockLabStone.getDefaultState());	
					fillArea(world, chunkX * 16 + 9, topLayerHeight - 8 * i - 2, chunkZ * 16 + 9, chunkX * 16 + 11, topLayerHeight - 8 * i - 1, chunkZ * 16 + 11, FlansModApocalypse.blockLabStone.getDefaultState());	
					fillArea(world, chunkX * 16 + 9, topLayerHeight - 8 * i - 3, chunkZ * 16 + 7, chunkX * 16 + 11, topLayerHeight - 8 * i - 2, chunkZ * 16 + 9, FlansModApocalypse.blockLabStone.getDefaultState());	
					fillArea(world, chunkX * 16 + 5, topLayerHeight - 8 * i - 3, chunkZ * 16 + 7, chunkX * 16 + 7, topLayerHeight - 8 * i - 2, chunkZ * 16 + 9, FlansModApocalypse.blockLabStone.getDefaultState());	
					fillArea(world, chunkX * 16 + 5, topLayerHeight - 8 * i - 4, chunkZ * 16 + 5, chunkX * 16 + 11, topLayerHeight - 8 * i - 3, chunkZ * 16 + 7, FlansModApocalypse.blockLabStone.getDefaultState());	
					fillArea(world, chunkX * 16 + 7, topLayerHeight - 8 * i - 5, chunkZ * 16 + 7, chunkX * 16 + 9, topLayerHeight - 8 * i - 4, chunkZ * 16 + 9, FlansModApocalypse.blockLabStone.getDefaultState());	
					fillArea(world, chunkX * 16 + 7, topLayerHeight - 8 * i - 6, chunkZ * 16 + 9, chunkX * 16 + 9, topLayerHeight - 8 * i - 5, chunkZ * 16 + 11, FlansModApocalypse.blockLabStone.getDefaultState());	
					fillArea(world, chunkX * 16 + 7, topLayerHeight - 8 * i - 7, chunkZ * 16 + 11, chunkX * 16 + 9, topLayerHeight - 8 * i - 6, chunkZ * 16 + 13, FlansModApocalypse.blockLabStone.getDefaultState());	
					fillArea(world, chunkX * 16 + 5, topLayerHeight - 8 * i - 7, chunkZ * 16 + 9, chunkX * 16 + 7, topLayerHeight - 8 * i - 6, chunkZ * 16 + 11, FlansModApocalypse.blockLabStone.getDefaultState());	
					fillArea(world, chunkX * 16 + 9, topLayerHeight - 8 * i - 7, chunkZ * 16 + 9, chunkX * 16 + 11, topLayerHeight - 8 * i - 6, chunkZ * 16 + 11, FlansModApocalypse.blockLabStone.getDefaultState());	
					
					i++;
					
					spawnMecha = false;
					break;
				}
				case 1 : //Liquids room
				{
					for(int j = 0; j < 2; j++)
					{
						for(int k = 0; k < 2; k++)
						{
							if(rand.nextInt(3) == 0)
							{
								generateLiquidsLab(world, rand, chunkX * 16 + 1 + 8 * j, topLayerHeight - 8 * i + 1, chunkZ * 16 + 1 + 8 * k);
							}
							else generateLiquidContainer(world, rand, chunkX * 16 + 2 + 8 * j, topLayerHeight - 8 * i + 1, chunkZ * 16 + 2 + 8 * k, getRandomLiquid(rand));
						}
					}
					break;
				}
				case 2 : //Gun range
				{
					for(int j = 0; j < 2; j++)
					{
						generateTarget(world, rand, chunkX * 16 + 2 + 7 * j, topLayerHeight - 8 * i + 1, chunkZ * 16 + 1);
					}
					fillArea(world, chunkX * 16 + 3, topLayerHeight - 8 * i + 1, chunkZ * 16 + 6, chunkX * 16 + 4, topLayerHeight - 8 * i + 2, chunkZ * 16 + 12, Blocks.planks.getDefaultState());
					fillArea(world, chunkX * 16 + 12, topLayerHeight - 8 * i + 1, chunkZ * 16 + 6, chunkX * 16 + 13, topLayerHeight - 8 * i + 2, chunkZ * 16 + 12, Blocks.planks.getDefaultState());
					fillArea(world, chunkX * 16 + 4, topLayerHeight - 8 * i + 1, chunkZ * 16 + 11, chunkX * 16 + 12, topLayerHeight - 8 * i + 2, chunkZ * 16 + 12, Blocks.stone_slab.getStateFromMeta(10));
					world.setBlockState(new BlockPos(chunkX * 16 + 6, topLayerHeight - 8 * i + 1, chunkZ * 16 + 11), Blocks.planks.getDefaultState());
					world.setBlockState(new BlockPos(chunkX * 16 + 9, topLayerHeight - 8 * i + 1, chunkZ * 16 + 11), Blocks.planks.getDefaultState());
					
					generateGunRack(world, rand, chunkX * 16 + 1, topLayerHeight - 8 * i + 1, chunkZ * 16 + 14);
					generateGunRack(world, rand, chunkX * 16 + 4, topLayerHeight - 8 * i + 1, chunkZ * 16 + 14);
					generateGunRack(world, rand, chunkX * 16 + 10, topLayerHeight - 8 * i + 1, chunkZ * 16 + 14);
					generateGunRack(world, rand, chunkX * 16 + 13, topLayerHeight - 8 * i + 1, chunkZ * 16 + 14);
					
					break;
				}
				case 3 : //Plant room
				{
					for(int j = 0; j < 2; j++)
					{
						for(int k = 0; k < 2; k++)
						{
							switch(rand.nextInt(2))
							{
							case 0 : generatePlantPots(world, rand, chunkX * 16 + 1 + 8 * j, topLayerHeight - 8 * i + 1, chunkZ * 16 + 1 + 8 * k); break;
							case 1 : generateFarm(world, rand, chunkX * 16 + 9 * j, topLayerHeight - 8 * i + 1, chunkZ * 16 + 9 * k); break;
							}
						}
					}
					break;
				}
				case 4 : //Forge
				{
					for(int j = 0; j < 2; j++)
					{
						if(rand.nextBoolean())
							generateFurnace(world, rand, chunkX * 16 + 2 + 8 * j, topLayerHeight - 8 * i + 1, chunkZ * 16 + 1);
						else
						{
							if(rand.nextBoolean())
								world.setBlockState(new BlockPos(chunkX * 16 + 2 + 8 * j, topLayerHeight - 8 * i + 1, chunkZ * 16 + 1), Blocks.crafting_table.getDefaultState());
							else world.setBlockState(new BlockPos(chunkX * 16 + 2 + 8 * j, topLayerHeight - 8 * i + 1, chunkZ * 16 + 1), FlansMod.workbench.getStateFromMeta(1));
							world.setBlockState(new BlockPos(chunkX * 16 + 4 + 8 * j, topLayerHeight - 8 * i + 1, chunkZ * 16 + 1), Blocks.iron_block.getDefaultState());
							world.setBlockState(new BlockPos(chunkX * 16 + 5 + 8 * j, topLayerHeight - 8 * i + 2, chunkZ * 16 + 1), Blocks.iron_block.getDefaultState());
							world.setBlockState(new BlockPos(chunkX * 16 + 5 + 8 * j, topLayerHeight - 8 * i + 1, chunkZ * 16 + 1), Blocks.iron_block.getDefaultState());
							world.setBlockState(new BlockPos(chunkX * 16 + 4 + 8 * j, topLayerHeight - 8 * i + 1, chunkZ * 16 + 4), Blocks.anvil.getDefaultState());
						}
						
						{
							generateWeapons(world, rand, chunkX * 16 + 2 + 8 * j, topLayerHeight - 8 * i + 1, chunkZ * 16 + 10);
						}
					}
					break;
				}
				case 5 : //Power Room
				{
					generateServerRack(world, rand, chunkX * 16 + 1, topLayerHeight - 8 * i + 1, chunkZ * 16 + 2, true);
					generateServerRack(world, rand, chunkX * 16 + 1, topLayerHeight - 8 * i + 1, chunkZ * 16 + 5, false);
					generateServerRack(world, rand, chunkX * 16 + 1, topLayerHeight - 8 * i + 1, chunkZ * 16 + 10, false);
					generateServerRack(world, rand, chunkX * 16 + 1, topLayerHeight - 8 * i + 1, chunkZ * 16 + 13, true);
					
					generateServerRack(world, rand, chunkX * 16 + 10, topLayerHeight - 8 * i + 1, chunkZ * 16 + 2, true);
					generateServerRack(world, rand, chunkX * 16 + 12, topLayerHeight - 8 * i + 1, chunkZ * 16 + 5, false);
					generateServerRack(world, rand, chunkX * 16 + 12, topLayerHeight - 8 * i + 1, chunkZ * 16 + 10, false);
					generateServerRack(world, rand, chunkX * 16 + 10, topLayerHeight - 8 * i + 1, chunkZ * 16 + 13, true);
					
					generateServerPower(world, rand, chunkX * 16 + 6, topLayerHeight - 8 * i + 1, chunkZ * 16 + 6);
					
					spawnMecha = false;
					
					break;
				}
				}
				if(spawnMecha && rand.nextBoolean())
				{
					spawnMecha(world, rand, chunkX * 16 + 8, topLayerHeight - 8 * i + 1, chunkZ * 16 + 8);
				}
			}
		}
		return false;
	}
	
	private void spawnMecha(World world, Random rand, int x, int y, int z)
	{
		MechaType type = FlansModApocalypse.getLootGenerator().getRandomDungeonMecha(rand);
    	NBTTagCompound tags = new NBTTagCompound();
    	tags.setString("Engine", FlansModApocalypse.getLootGenerator().getRandomEngine(type, rand).shortName);
    	tags.setString("Type", type.shortName);
    	for(EnumDriveablePart part : EnumDriveablePart.values())
    	{
    		tags.setInteger(part.getShortName() + "_Health", type.health.get(part) == null ? 0 : type.health.get(part).health);
    		tags.setBoolean(part.getShortName() + "_Fire", false);
    	}
    	for(int k = 0; k < 2; k++)
    	{
    		ItemStack randomGun = FlansModApocalypse.getLootGenerator().getRandomLoadedGun(rand, false);
    		GunType gunType = ((ItemGun)randomGun.getItem()).GetType();
    		tags.setTag(k == 1 ? EnumMechaSlotType.rightTool.toString() : EnumMechaSlotType.leftTool.toString(), randomGun.writeToNBT(new NBTTagCompound()));
    		if(gunType.nonExplosiveAmmo.size() > 0)
    		{
	        	for(int j = 0; j < 1 + rand.nextInt(2); j++)
	        	{
	        		ShootableType ammo = gunType.nonExplosiveAmmo.get(rand.nextInt(gunType.nonExplosiveAmmo.size()));
	        		tags.setTag("Cargo " + rand.nextInt(type.numCargoSlots), new ItemStack(ammo.item, (ammo.maxStackSize > 1 ? rand.nextInt(ammo.maxStackSize - 1) + 1 : 1)).writeToNBT(new NBTTagCompound()));
	        	}
    		}
    	}
    	EntityAIMecha entity = new EntityAIMecha(world, x + 0.5D, y, z + 0.5D, type, new DriveableData(tags), tags);
        world.spawnEntityInWorld(entity);
	}
	
	private void generateServerPower(World world, Random rand, int x, int y, int z) 
	{
		fillArea(world, x, y, z, x + 2, y + 3, z + 2, Blocks.obsidian.getDefaultState());	
		fillArea(world, x + 1, y, z + 1, x + 3, y + 3, z + 3, Blocks.obsidian.getDefaultState());	
		fillArea(world, x + 2, y, z + 2, x + 4, y + 3, z + 4, Blocks.obsidian.getDefaultState());	
		world.setBlockState(new BlockPos(x + 1, y + 1, z + 1), FlansModApocalypse.blockPowerCube.getDefaultState());
		world.setBlockState(new BlockPos(x + 2, y + 1, z + 2), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 1, y + 2, z + 1), Blocks.iron_trapdoor.getStateFromMeta(8));
		world.setBlockState(new BlockPos(x + 2, y + 2, z + 2), Blocks.iron_trapdoor.getStateFromMeta(8));
	}
	
	private void generateServerRack(World world, Random rand, int x, int y, int z, boolean big) 
	{
		fillArea(world, x, y, z, x + 3, y + 3, z + 1, Blocks.obsidian.getDefaultState());	
		fillArea(world, x + 1, y, z, x + 2, y + 3, z + 1, Blocks.quartz_block.getStateFromMeta(3));	
		if(big)
		{
			fillArea(world, x + 3, y, z, x + 4, y + 3, z + 1, Blocks.quartz_block.getStateFromMeta(3));	
			fillArea(world, x + 4, y, z, x + 5, y + 3, z + 1, Blocks.obsidian.getDefaultState());	
		}
	}
	
	private void generateWeapons(World world, Random rand, int x, int y, int z) 
	{
		fillArea(world, x + 1, y, z, x + 3, y + 1, z + 2, Blocks.planks.getDefaultState());	
		fillArea(world, x, y, z, x + 1, y + 1, z + 2, Blocks.chest.getDefaultState());	
		fillArea(world, x + 3, y, z, x + 4, y + 1, z + 2, Blocks.chest.getDefaultState());	

		fillArea(world, x + 1, y + 1, z, x + 3, y + 2, z + 1, FlansModApocalypse.gunRack.getDefaultState().withProperty(BlockItemHolder.FACING, EnumFacing.SOUTH));	
		fillArea(world, x + 1, y + 1, z + 1, x + 3, y + 2, z + 2, FlansModApocalypse.gunRack.getDefaultState().withProperty(BlockItemHolder.FACING, EnumFacing.NORTH));	
		
		for(int i = 0; i < 2; i++)
			for(int j = 0; j < 2; j++)
				if(rand.nextInt(3) != 0)
					FlansModApocalypse.getLootGenerator().addRandomLoot((TileEntityItemHolder)world.getTileEntity(new BlockPos(x + 1 + i, y + 1, z + j)), rand, true);
		
		for(int i = 0; i < 2; i++)
		{
			FlansModApocalypse.getLootGenerator().fillWeaponChest(rand, ((TileEntityChest)world.getTileEntity(new BlockPos(x, y, z + i))));
			FlansModApocalypse.getLootGenerator().fillWeaponChest(rand, ((TileEntityChest)world.getTileEntity(new BlockPos(x + 3, y, z + i))));
		}
	}

	private void generateFurnace(World world, Random rand, int x, int y, int z)
	{
		fillArea(world, x, y, z, x + 1, y + 2, z + 2, FlansModApocalypse.blockLabStone.getDefaultState());	
		fillArea(world, x + 3, y, z, x + 4, y + 2, z + 2, FlansModApocalypse.blockLabStone.getDefaultState());	
		fillArea(world, x + 1, y, z + 2, x + 3, y + 1, z + 3, FlansModApocalypse.blockLabStone.getDefaultState());	
		fillArea(world, x + 1, y + 2, z, x + 3, y + 3, z + 2, FlansModApocalypse.blockLabStone.getDefaultState());	
		fillArea(world, x + 1, y + 3, z, x + 3, y + 5, z + 1, FlansModApocalypse.blockLabStone.getDefaultState());	
		fillArea(world, x + 1, y, z, x + 3, y + 1, z + 2, Blocks.lava.getDefaultState());	
	}
	
	private void generatePlantPots(World world, Random rand, int x, int y, int z)
	{
		fillArea(world, x, y, z, x + 6, y + 1, z + 1, Blocks.quartz_block.getDefaultState());	
		fillArea(world, x + 1, y, z, x + 5, y + 1, z + 1, Blocks.stone_slab.getStateFromMeta(15));	
		for(int i = 0; i < 6; i++)
			world.setBlockState(new BlockPos(x + i, y + 1, z), Blocks.flower_pot.getDefaultState().withProperty(BlockFlowerPot.LEGACY_DATA, rand.nextInt(14)));	
		
		fillArea(world, x, y, z + 5, x + 6, y + 1, z + 6, Blocks.quartz_block.getDefaultState());	
		fillArea(world, x + 1, y, z + 5, x + 5, y + 1, z + 6, Blocks.stone_slab.getStateFromMeta(15));	
		for(int i = 0; i < 6; i++)
			world.setBlockState(new BlockPos(x + i, y + 1, z + 5), Blocks.flower_pot.getDefaultState().withProperty(BlockFlowerPot.LEGACY_DATA, rand.nextInt(14)));	
		
	}
	
	private void generateFarm(World world, Random rand, int x, int y, int z)
	{
		fillArea(world, x, y, z, x + 7, y + 1, z + 7, FlansModApocalypse.blockLabStone.getDefaultState());	
		
		if(world.isRemote)
		{
			for(int i = 0; i < 2; i++)
			{
				for(int j = 0; j < 2; j++)
				{
					world.setBlockState(new BlockPos(x + 1 + 4 * i, y + 2, z + 1 + 4 * j), Blocks.glowstone.getDefaultState());
					world.setLightFor(EnumSkyBlock.BLOCK, new BlockPos(x + 1 + 4 * i, y + 2, z + 1 + 4 * j), 15);
					world.getLightFromNeighborsFor(EnumSkyBlock.BLOCK, new BlockPos(x + 1 + 4 * i, y + 1, z + 1 + 4 * j));
					world.setBlockState(new BlockPos(x + 1 + 4 * i, y + 3, z + 1 + 4 * j), Blocks.oak_fence.getDefaultState());
					world.setBlockState(new BlockPos(x + 1 + 4 * i, y + 4, z + 1 + 4 * j), Blocks.oak_fence.getDefaultState());				
				}
			}
		}
		
		fillArea(world, x + 1, y, z + 1, x + 6, y + 1, z + 6, Blocks.farmland.getStateFromMeta(7));	
		switch(rand.nextInt(3))
		{
		case 0 : fillArea(world, x + 1, y + 1, z + 1, x + 6, y + 2, z + 6, Blocks.wheat.getStateFromMeta(rand.nextInt(5) + 2)); break;	
		case 1 : fillArea(world, x + 1, y + 1, z + 1, x + 6, y + 2, z + 6, Blocks.carrots.getStateFromMeta(rand.nextInt(5) + 2)); break;	
		case 2 : fillArea(world, x + 1, y + 1, z + 1, x + 6, y + 2, z + 6, Blocks.potatoes.getStateFromMeta(rand.nextInt(5) + 2)); break;	
		}
		world.setBlockState(new BlockPos(x + 3, y + 1, z + 3), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 3, y, z + 3), Blocks.water.getDefaultState());
	}
	
	private void generateGunRack(World world, Random rand, int x, int y, int z)
	{
		fillArea(world, x, y, z, x + 2, y + 1, z + 1, Blocks.planks.getDefaultState());
		fillArea(world, x, y + 1, z, x + 2, y + 2, z + 1, FlansModApocalypse.gunRack.getDefaultState().withProperty(BlockItemHolder.FACING, EnumFacing.SOUTH));		
		for(int i = 0; i < 2; i++)
		{
			if(rand.nextInt(3) != 0)
				FlansModApocalypse.getLootGenerator().addRandomLoot((TileEntityItemHolder)world.getTileEntity(new BlockPos(x + i, y + 1, z)), rand, true);
		}
	}
	
	private void generateTarget(World world, Random rand, int x, int y, int z)
	{
		fillArea(world, x + 1, y + 1, z, x + 4, y + 4, z + 1, Blocks.wool.getStateFromMeta(14));
		world.setBlockState(new BlockPos(x + 2, y, z), Blocks.wool.getStateFromMeta(14));
		world.setBlockState(new BlockPos(x + 2, y + 4, z), Blocks.wool.getStateFromMeta(14));
		world.setBlockState(new BlockPos(x, y + 2, z), Blocks.wool.getStateFromMeta(14));
		world.setBlockState(new BlockPos(x + 4, y + 2, z), Blocks.wool.getStateFromMeta(14));
		world.setBlockState(new BlockPos(x + 2, y + 1, z), Blocks.wool.getDefaultState());
		world.setBlockState(new BlockPos(x + 2, y + 3, z), Blocks.wool.getDefaultState());
		world.setBlockState(new BlockPos(x + 1, y + 2, z), Blocks.wool.getDefaultState());
		world.setBlockState(new BlockPos(x + 3, y + 2, z), Blocks.wool.getDefaultState());
	}
	
	private void generateLiquidsLab(World world, Random rand, int x, int y, int z)
	{
		fillArea(world, x, y, z, x + 4, y + 1, z + 1, Blocks.quartz_block.getDefaultState());
		fillArea(world, x + 1, y, z, x + 3, y + 1, z + 1, Blocks.stone_slab.getStateFromMeta(15));
		
		fillArea(world, x, y, z + 5, x + 5, y + 1, z + 6, Blocks.quartz_block.getDefaultState());
		fillArea(world, x + 1, y, z + 5, x + 4, y + 1, z + 6, Blocks.stone_slab.getStateFromMeta(15));
		
		world.setBlockState(new BlockPos(x + 5, y, z + 5), Blocks.cauldron.getStateFromMeta(rand.nextInt(4)));
		
		world.setBlockState(new BlockPos(x + 4, y, z), Blocks.chest.getDefaultState().withProperty(BlockChest.FACING, EnumFacing.SOUTH));
		world.setBlockState(new BlockPos(x + 5, y, z), Blocks.chest.getDefaultState().withProperty(BlockChest.FACING, EnumFacing.SOUTH));
		
		//Fill chests
        TileEntity tileentity = world.getTileEntity(new BlockPos(x + 4, y, z));
        if (tileentity instanceof TileEntityChest)
        {
        	FlansModApocalypse.getLootGenerator().fillLiquidLabChest(rand, (TileEntityChest)tileentity);
        }
        
        tileentity = world.getTileEntity(new BlockPos(x + 5, y, z));
        if (tileentity instanceof TileEntityChest)
        {
        	FlansModApocalypse.getLootGenerator().fillLiquidLabChest(rand, (TileEntityChest)tileentity);
        }
		
		//Brewing stands
		BlockPos pos = new BlockPos(x + rand.nextInt(4), y + 1, z);
		world.setBlockState(pos, Blocks.brewing_stand.getDefaultState());
        tileentity = world.getTileEntity(pos);
        if (tileentity instanceof TileEntityBrewingStand)
        {
        	FlansModApocalypse.getLootGenerator().fillBrewingStand(rand, (TileEntityBrewingStand)tileentity);
        }
		
		pos = new BlockPos(x + rand.nextInt(5), y + 1, z + 5);
		world.setBlockState(pos, Blocks.brewing_stand.getDefaultState());
        tileentity = world.getTileEntity(pos);
        if (tileentity instanceof TileEntityBrewingStand)
        {
        	FlansModApocalypse.getLootGenerator().fillBrewingStand(rand, (TileEntityBrewingStand)tileentity);
        }
	}
	
	private void generateLiquidContainer(World world, Random rand, int x, int y, int z, IBlockState liquid)
	{
		fillArea(world, x, y, z, x + 4, y + 5, z + 4, FlansModApocalypse.blockLabStone.getDefaultState());
		fillArea(world, x, y + 1, z, x + 4, y + 4, z + 4, Blocks.glass.getDefaultState());
		
		fillArea(world, x + 1, y, z + 1, x + 3, y + 5, z + 3, Blocks.air.getDefaultState());
		fillArea(world, x + 1, y, z + 1, x + 3, y + rand.nextInt(4), z + 3, liquid);		
		
		fillArea(world, x, y, z, 			x + 1, y + 5, z + 1, Blocks.air.getDefaultState());
		fillArea(world, x + 3, y, z, 		x + 4, y + 5, z + 1, Blocks.air.getDefaultState());
		fillArea(world, x + 3, y, z + 3, 	x + 4, y + 5, z + 4, Blocks.air.getDefaultState());
		fillArea(world, x, y, z + 3, 		x + 1, y + 5, z + 4, Blocks.air.getDefaultState());
	}
	
	private IBlockState getRandomLiquid(Random rand)
	{
		switch(rand.nextInt(3))
		{
		case 0 : return Blocks.water.getDefaultState();
		case 1 : return Blocks.lava.getDefaultState();
		case 2 : return FlansModApocalypse.blockSulphuricAcid.getDefaultState();
		}
		
		return Blocks.water.getDefaultState();
	}
	
	private void generateRoom(World world, Random rand, int chunkX, int layerY, int chunkZ)
	{
		
	}
}
