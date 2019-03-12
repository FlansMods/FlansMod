package com.flansmod.apocalypse.common.world.buildings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSandStone;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.template.TemplateManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.BiomeEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;

import com.flansmod.apocalypse.common.FlansModApocalypse;
import com.flansmod.common.FlansMod;
import com.flansmod.common.TileEntityItemHolder;

public class StructureAbandonedVillagePieces
{
	private static final String __OBFID = "CL_00000516";
	
	public static void registerVillagePieces()
	{
		MapGenStructureIO.registerStructureComponent(StructureAbandonedVillagePieces.Library.class, "AVBH");
		MapGenStructureIO.registerStructureComponent(StructureAbandonedVillagePieces.Field1.class, "AVDF");
		MapGenStructureIO.registerStructureComponent(StructureAbandonedVillagePieces.Field2.class, "AVF");
		MapGenStructureIO.registerStructureComponent(StructureAbandonedVillagePieces.Torch.class, "AVL");
		MapGenStructureIO.registerStructureComponent(StructureAbandonedVillagePieces.Hall.class, "AVPH");
		MapGenStructureIO.registerStructureComponent(StructureAbandonedVillagePieces.House4Garden.class, "AVSH");
		MapGenStructureIO.registerStructureComponent(StructureAbandonedVillagePieces.WoodHut.class, "AVSmH");
		MapGenStructureIO.registerStructureComponent(StructureAbandonedVillagePieces.Church.class, "AVST");
		MapGenStructureIO.registerStructureComponent(StructureAbandonedVillagePieces.Blacksmith.class, "AVS");
		MapGenStructureIO.registerStructureComponent(StructureAbandonedVillagePieces.Start.class, "AVStart");
		MapGenStructureIO.registerStructureComponent(StructureAbandonedVillagePieces.Path.class, "AVSR");
		MapGenStructureIO.registerStructureComponent(StructureAbandonedVillagePieces.House3.class, "AVTRH");
		MapGenStructureIO.registerStructureComponent(StructureAbandonedVillagePieces.Well.class, "AVW");
		MapGenStructureIO.registerStructure(MapGenAbandonedVillage.Start.class, "AbandonedVillage");
	}
	
	public static List getStructureVillageWeightedPieceList(Random p_75084_0_, int p_75084_1_)
	{
		ArrayList arraylist = Lists.newArrayList();
		arraylist.add(new StructureAbandonedVillagePieces.PieceWeight(StructureAbandonedVillagePieces.House4Garden.class, 4, MathHelper.getInt(p_75084_0_, 2 + p_75084_1_, 4 + p_75084_1_ * 2)));
		arraylist.add(new StructureAbandonedVillagePieces.PieceWeight(StructureAbandonedVillagePieces.Church.class, 20, MathHelper.getInt(p_75084_0_, 0 + p_75084_1_, 1 + p_75084_1_)));
		arraylist.add(new StructureAbandonedVillagePieces.PieceWeight(StructureAbandonedVillagePieces.Library.class, 20, MathHelper.getInt(p_75084_0_, 0 + p_75084_1_, 2 + p_75084_1_)));
		arraylist.add(new StructureAbandonedVillagePieces.PieceWeight(StructureAbandonedVillagePieces.WoodHut.class, 3, MathHelper.getInt(p_75084_0_, 2 + p_75084_1_, 5 + p_75084_1_ * 3)));
		arraylist.add(new StructureAbandonedVillagePieces.PieceWeight(StructureAbandonedVillagePieces.Hall.class, 15, MathHelper.getInt(p_75084_0_, 0 + p_75084_1_, 2 + p_75084_1_)));
		arraylist.add(new StructureAbandonedVillagePieces.PieceWeight(StructureAbandonedVillagePieces.Field1.class, 3, MathHelper.getInt(p_75084_0_, 1 + p_75084_1_, 4 + p_75084_1_)));
		arraylist.add(new StructureAbandonedVillagePieces.PieceWeight(StructureAbandonedVillagePieces.Field2.class, 3, MathHelper.getInt(p_75084_0_, 2 + p_75084_1_, 4 + p_75084_1_ * 2)));
		arraylist.add(new StructureAbandonedVillagePieces.PieceWeight(StructureAbandonedVillagePieces.Blacksmith.class, 15, MathHelper.getInt(p_75084_0_, 0, 1 + p_75084_1_)));
		arraylist.add(new StructureAbandonedVillagePieces.PieceWeight(StructureAbandonedVillagePieces.House3.class, 8, MathHelper.getInt(p_75084_0_, 0 + p_75084_1_, 3 + p_75084_1_ * 2)));
		net.minecraftforge.fml.common.registry.VillagerRegistry.addExtraVillageComponents(arraylist, p_75084_0_, p_75084_1_);
		
		arraylist.removeIf(o -> ((PieceWeight)o).villagePiecesLimit == 0);
		
		return arraylist;
	}
	
	private static int func_75079_a(List p_75079_0_)
	{
		boolean flag = false;
		int i = 0;
		StructureAbandonedVillagePieces.PieceWeight pieceweight;
		
		for(Iterator iterator = p_75079_0_.iterator(); iterator.hasNext(); i += pieceweight.villagePieceWeight)
		{
			pieceweight = (StructureAbandonedVillagePieces.PieceWeight)iterator.next();
			
			if(pieceweight.villagePiecesLimit > 0 && pieceweight.villagePiecesSpawned < pieceweight.villagePiecesLimit)
			{
				flag = true;
			}
		}
		
		return flag ? i : -1;
	}
	
	private static StructureAbandonedVillagePieces.Village func_176065_a(StructureAbandonedVillagePieces.Start p_176065_0_, StructureAbandonedVillagePieces.PieceWeight p_176065_1_, List p_176065_2_, Random p_176065_3_, int p_176065_4_, int p_176065_5_, int p_176065_6_, EnumFacing p_176065_7_, int p_176065_8_)
	{
		Class oclass = p_176065_1_.villagePieceClass;
		Object object = null;
		
		if(oclass == StructureAbandonedVillagePieces.House4Garden.class)
		{
			object = StructureAbandonedVillagePieces.House4Garden.func_175858_a(p_176065_0_, p_176065_2_, p_176065_3_, p_176065_4_, p_176065_5_, p_176065_6_, p_176065_7_, p_176065_8_);
		}
		else if(oclass == StructureAbandonedVillagePieces.Church.class)
		{
			object = StructureAbandonedVillagePieces.Church.func_175854_a(p_176065_0_, p_176065_2_, p_176065_3_, p_176065_4_, p_176065_5_, p_176065_6_, p_176065_7_, p_176065_8_);
		}
		else if(oclass == StructureAbandonedVillagePieces.Library.class)
		{
			object = StructureAbandonedVillagePieces.Library.func_175850_a(p_176065_0_, p_176065_2_, p_176065_3_, p_176065_4_, p_176065_5_, p_176065_6_, p_176065_7_, p_176065_8_);
		}
		else if(oclass == StructureAbandonedVillagePieces.WoodHut.class)
		{
			object = StructureAbandonedVillagePieces.WoodHut.func_175853_a(p_176065_0_, p_176065_2_, p_176065_3_, p_176065_4_, p_176065_5_, p_176065_6_, p_176065_7_, p_176065_8_);
		}
		else if(oclass == StructureAbandonedVillagePieces.Hall.class)
		{
			object = StructureAbandonedVillagePieces.Hall.func_175857_a(p_176065_0_, p_176065_2_, p_176065_3_, p_176065_4_, p_176065_5_, p_176065_6_, p_176065_7_, p_176065_8_);
		}
		else if(oclass == StructureAbandonedVillagePieces.Field1.class)
		{
			object = StructureAbandonedVillagePieces.Field1.func_175851_a(p_176065_0_, p_176065_2_, p_176065_3_, p_176065_4_, p_176065_5_, p_176065_6_, p_176065_7_, p_176065_8_);
		}
		else if(oclass == StructureAbandonedVillagePieces.Field2.class)
		{
			object = StructureAbandonedVillagePieces.Field2.func_175852_a(p_176065_0_, p_176065_2_, p_176065_3_, p_176065_4_, p_176065_5_, p_176065_6_, p_176065_7_, p_176065_8_);
		}
		else if(oclass == StructureAbandonedVillagePieces.Blacksmith.class)
		{
			object = StructureAbandonedVillagePieces.Blacksmith.func_175855_a(p_176065_0_, p_176065_2_, p_176065_3_, p_176065_4_, p_176065_5_, p_176065_6_, p_176065_7_, p_176065_8_);
		}
		else if(oclass == StructureAbandonedVillagePieces.House3.class)
		{
			object = StructureAbandonedVillagePieces.House3.func_175849_a(p_176065_0_, p_176065_2_, p_176065_3_, p_176065_4_, p_176065_5_, p_176065_6_, p_176065_7_, p_176065_8_);
		}
		
		return (StructureAbandonedVillagePieces.Village)object;
	}
	
	private static StructureAbandonedVillagePieces.Village func_176067_c(StructureAbandonedVillagePieces.Start p_176067_0_, List p_176067_1_, Random p_176067_2_, int p_176067_3_, int p_176067_4_, int p_176067_5_, EnumFacing p_176067_6_, int p_176067_7_)
	{
		int i1 = func_75079_a(p_176067_0_.structureVillageWeightedPieceList);
		
		if(i1 <= 0)
		{
			return null;
		}
		else
		{
			int j1 = 0;
			
			while(j1 < 5)
			{
				++j1;
				int k1 = p_176067_2_.nextInt(i1);
				
				for(Object aStructureVillageWeightedPieceList : p_176067_0_.structureVillageWeightedPieceList)
				{
					PieceWeight pieceweight = (PieceWeight)aStructureVillageWeightedPieceList;
					k1 -= pieceweight.villagePieceWeight;
					
					if(k1 < 0)
					{
						if(!pieceweight.canSpawnMoreVillagePiecesOfType(p_176067_7_) || pieceweight == p_176067_0_.structVillagePieceWeight && p_176067_0_.structureVillageWeightedPieceList.size() > 1)
						{
							break;
						}
						
						Village village = func_176065_a(p_176067_0_, pieceweight, p_176067_1_, p_176067_2_, p_176067_3_, p_176067_4_, p_176067_5_, p_176067_6_, p_176067_7_);
						
						if(village != null)
						{
							++pieceweight.villagePiecesSpawned;
							p_176067_0_.structVillagePieceWeight = pieceweight;
							
							if(!pieceweight.canSpawnMoreVillagePieces())
							{
								p_176067_0_.structureVillageWeightedPieceList.remove(pieceweight);
							}
							
							return village;
						}
					}
				}
			}
			
			StructureBoundingBox structureboundingbox = StructureAbandonedVillagePieces.Torch.func_175856_a(p_176067_0_, p_176067_1_, p_176067_2_, p_176067_3_, p_176067_4_, p_176067_5_, p_176067_6_);
			
			if(structureboundingbox != null)
			{
				return new StructureAbandonedVillagePieces.Torch(p_176067_0_, p_176067_7_, p_176067_2_, structureboundingbox, p_176067_6_);
			}
			else
			{
				return null;
			}
		}
	}
	
	private static StructureComponent func_176066_d(StructureAbandonedVillagePieces.Start p_176066_0_, List p_176066_1_, Random p_176066_2_, int p_176066_3_, int p_176066_4_, int p_176066_5_, EnumFacing p_176066_6_, int p_176066_7_)
	{
		if(p_176066_7_ > 50)
		{
			return null;
		}
		else if(Math.abs(p_176066_3_ - p_176066_0_.getBoundingBox().minX) <= 112 && Math.abs(p_176066_5_ - p_176066_0_.getBoundingBox().minZ) <= 112)
		{
			StructureAbandonedVillagePieces.Village village = func_176067_c(p_176066_0_, p_176066_1_, p_176066_2_, p_176066_3_, p_176066_4_, p_176066_5_, p_176066_6_, p_176066_7_ + 1);
			
			if(village != null)
			{
				int i1 = (village.getBoundingBox().minX + village.getBoundingBox().maxX) / 2;
				int j1 = (village.getBoundingBox().minZ + village.getBoundingBox().maxZ) / 2;
				int k1 = village.getBoundingBox().maxX - village.getBoundingBox().minX;
				int l1 = village.getBoundingBox().maxZ - village.getBoundingBox().minZ;
				int i2 = k1 > l1 ? k1 : l1;
				
				if(p_176066_0_.getBiomeProvider().areBiomesViable(i1, j1, i2 / 2 + 4, MapGenAbandonedVillage.villageSpawnBiomes))
				{
					p_176066_1_.add(village);
					p_176066_0_.field_74932_i.add(village);
					return village;
				}
			}
			
			return null;
		}
		else
		{
			return null;
		}
	}
	
	private static StructureComponent func_176069_e(StructureAbandonedVillagePieces.Start p_176069_0_, List p_176069_1_, Random p_176069_2_, int p_176069_3_, int p_176069_4_, int p_176069_5_, EnumFacing p_176069_6_, int p_176069_7_)
	{
		if(p_176069_7_ > 3 + p_176069_0_.terrainType)
		{
			return null;
		}
		else if(Math.abs(p_176069_3_ - p_176069_0_.getBoundingBox().minX) <= 112 && Math.abs(p_176069_5_ - p_176069_0_.getBoundingBox().minZ) <= 112)
		{
			StructureBoundingBox structureboundingbox = StructureAbandonedVillagePieces.Path.func_175848_a(p_176069_0_, p_176069_1_, p_176069_2_, p_176069_3_, p_176069_4_, p_176069_5_, p_176069_6_);
			
			if(structureboundingbox != null && structureboundingbox.minY > 10)
			{
				StructureAbandonedVillagePieces.Path path = new StructureAbandonedVillagePieces.Path(p_176069_0_, p_176069_7_, p_176069_2_, structureboundingbox, p_176069_6_);
				int i1 = (path.getBoundingBox().minX + path.getBoundingBox().maxX) / 2;
				int j1 = (path.getBoundingBox().minZ + path.getBoundingBox().maxZ) / 2;
				int k1 = path.getBoundingBox().maxX - path.getBoundingBox().minX;
				int l1 = path.getBoundingBox().maxZ - path.getBoundingBox().minZ;
				int i2 = k1 > l1 ? k1 : l1;
				
				if(p_176069_0_.getBiomeProvider().areBiomesViable(i1, j1, i2 / 2 + 4, MapGenAbandonedVillage.villageSpawnBiomes))
				{
					p_176069_1_.add(path);
					p_176069_0_.field_74930_j.add(path);
					return path;
				}
			}
			
			return null;
		}
		else
		{
			return null;
		}
	}
	
	public static class Church extends StructureAbandonedVillagePieces.Village
	{
		private static final String __OBFID = "CL_00000525";
		
		public Church()
		{
		}
		
		public Church(StructureAbandonedVillagePieces.Start p_i45564_1_, int p_i45564_2_, Random p_i45564_3_, StructureBoundingBox p_i45564_4_, EnumFacing p_i45564_5_)
		{
			super(p_i45564_1_, p_i45564_2_);
			this.setCoordBaseMode(p_i45564_5_);
			this.boundingBox = p_i45564_4_;
		}
		
		public static StructureAbandonedVillagePieces.Church func_175854_a(StructureAbandonedVillagePieces.Start p_175854_0_, List p_175854_1_, Random p_175854_2_, int p_175854_3_, int p_175854_4_, int p_175854_5_, EnumFacing p_175854_6_, int p_175854_7_)
		{
			StructureBoundingBox structureboundingbox = StructureBoundingBox.getComponentToAddBoundingBox(p_175854_3_, p_175854_4_, p_175854_5_, 0, 0, 0, 5, 12, 9, p_175854_6_);
			return canVillageGoDeeper(structureboundingbox) && StructureComponent.findIntersecting(p_175854_1_, structureboundingbox) == null ? new StructureAbandonedVillagePieces.Church(p_175854_0_, p_175854_7_, p_175854_2_, structureboundingbox, p_175854_6_) : null;
		}
		
		/**
		 * second Part of Structure generating, this for example places Spiderwebs, Mob Spawners, it closes
		 * Mineshafts at the end, it adds Fences...
		 */
		public boolean addComponentParts(World worldIn, Random rand, StructureBoundingBox p_74875_3_)
		{
			if(this.field_143015_k < 0)
			{
				this.field_143015_k = this.getAverageGroundLevel(worldIn, p_74875_3_);
				
				if(this.field_143015_k < 0)
				{
					return true;
				}
				
				this.boundingBox.offset(0, this.field_143015_k - this.boundingBox.maxY + 12 - 1, 0);
			}
			
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 1, 1, 3, 3, 7, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 5, 1, 3, 9, 3, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 0, 0, 3, 0, 8, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 1, 0, 3, 10, 0, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 1, 1, 0, 10, 3, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 4, 1, 1, 4, 10, 3, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 0, 4, 0, 4, 7, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 4, 0, 4, 4, 4, 7, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 1, 8, 3, 4, 8, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 5, 4, 3, 10, 4, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 5, 5, 3, 5, 7, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 9, 0, 4, 9, 4, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 4, 0, 4, 4, 4, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.setBlockState(worldIn, Blocks.COBBLESTONE.getDefaultState(), 0, 11, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.COBBLESTONE.getDefaultState(), 4, 11, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.COBBLESTONE.getDefaultState(), 2, 11, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.COBBLESTONE.getDefaultState(), 2, 11, 4, p_74875_3_);
			this.setBlockState(worldIn, Blocks.COBBLESTONE.getDefaultState(), 1, 1, 6, p_74875_3_);
			this.setBlockState(worldIn, Blocks.COBBLESTONE.getDefaultState(), 1, 1, 7, p_74875_3_);
			this.setBlockState(worldIn, Blocks.COBBLESTONE.getDefaultState(), 2, 1, 7, p_74875_3_);
			this.setBlockState(worldIn, Blocks.COBBLESTONE.getDefaultState(), 3, 1, 6, p_74875_3_);
			this.setBlockState(worldIn, Blocks.COBBLESTONE.getDefaultState(), 3, 1, 7, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 0, 2, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 0, 3, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 4, 2, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 4, 3, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 0, 6, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 0, 7, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 4, 6, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 4, 7, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 2, 6, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 2, 7, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 2, 6, 4, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 2, 7, 4, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 0, 3, 6, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 4, 3, 6, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 2, 3, 8, p_74875_3_);
			this.setBlockState(worldIn, Blocks.STONE_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.WEST), 1, 1, 5, p_74875_3_);
			this.setBlockState(worldIn, Blocks.STONE_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.WEST), 2, 1, 6, p_74875_3_);
			this.setBlockState(worldIn, Blocks.STONE_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.WEST), 3, 1, 5, p_74875_3_);
			this.setBlockState(worldIn, Blocks.STONE_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.EAST), 1, 2, 7, p_74875_3_);
			this.setBlockState(worldIn, Blocks.STONE_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.NORTH), 3, 2, 7, p_74875_3_);
			
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 2, 1, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 2, 2, 0, p_74875_3_);
			
			if(this.getBlockStateFromPos(worldIn, 2, 0, -1, p_74875_3_).getMaterial() == Material.AIR && this.getBlockStateFromPos(worldIn, 2, -1, -1, p_74875_3_).getMaterial() != Material.AIR)
			{
				this.setBlockState(worldIn, Blocks.STONE_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.WEST), 2, 0, -1, p_74875_3_);
			}
			
			for(int j = 0; j < 9; ++j)
			{
				for(int k = 0; k < 5; ++k)
				{
					this.clearCurrentPositionBlocksUpwards(worldIn, k, 12, j, p_74875_3_);
					this.replaceAirAndLiquidDownwards(worldIn, Blocks.COBBLESTONE.getDefaultState(), k, -1, j, p_74875_3_);
				}
			}
			
			int[][] destruction = {
					{3, 3, 0, 0, 0},
					{4, 0, 0, 0, 0},
					{6, 3, 0, 0, 0},
					{8, 9, 3, 0, 0},
					{9, 9, 6, 0, 0},
					{10, 9, 0, 0, 0},
					{10, 9, 9, 0, 0},
					{10, 9, 9, 0, 0},
					{10, 9, 9, 0, 0}
			};
			destroyBuilding(worldIn, destruction, p_74875_3_);
			
			this.spawnVillagers(worldIn, p_74875_3_, 2, 1, 2, 1);
			return true;
		}
		
		protected int func_180779_c(int p_180779_1_, int p_180779_2_)
		{
			return 2;
		}
	}
	
	public static class Field1 extends StructureAbandonedVillagePieces.Village
	{
		/**
		 * First crop type for this field.
		 */
		private Block cropTypeA;
		/**
		 * Second crop type for this field.
		 */
		private Block cropTypeB;
		/**
		 * Third crop type for this field.
		 */
		private Block cropTypeC;
		/**
		 * Fourth crop type for this field.
		 */
		private Block cropTypeD;
		private static final String __OBFID = "CL_00000518";
		
		public Field1()
		{
		}
		
		public Field1(StructureAbandonedVillagePieces.Start p_i45570_1_, int p_i45570_2_, Random p_i45570_3_, StructureBoundingBox p_i45570_4_, EnumFacing p_i45570_5_)
		{
			super(p_i45570_1_, p_i45570_2_);
			this.setCoordBaseMode(p_i45570_5_);
			this.boundingBox = p_i45570_4_;
			this.cropTypeA = this.func_151559_a(p_i45570_3_);
			this.cropTypeB = this.func_151559_a(p_i45570_3_);
			this.cropTypeC = this.func_151559_a(p_i45570_3_);
			this.cropTypeD = this.func_151559_a(p_i45570_3_);
		}
		
		/**
		 * (abstract) Helper method to write subclass data to NBT
		 */
		protected void writeStructureToNBT(NBTTagCompound p_143012_1_)
		{
			super.writeStructureToNBT(p_143012_1_);
			p_143012_1_.setInteger("CA", Block.REGISTRY.getIDForObject(this.cropTypeA));
			p_143012_1_.setInteger("CB", Block.REGISTRY.getIDForObject(this.cropTypeB));
			p_143012_1_.setInteger("CC", Block.REGISTRY.getIDForObject(this.cropTypeC));
			p_143012_1_.setInteger("CD", Block.REGISTRY.getIDForObject(this.cropTypeD));
		}
		
		/**
		 * (abstract) Helper method to read subclass data from NBT
		 */
		protected void readStructureFromNBT(NBTTagCompound p_143011_1_, TemplateManager man)
		{
			super.readStructureFromNBT(p_143011_1_, man);
			this.cropTypeA = Block.getBlockById(p_143011_1_.getInteger("CA"));
			this.cropTypeB = Block.getBlockById(p_143011_1_.getInteger("CB"));
			this.cropTypeC = Block.getBlockById(p_143011_1_.getInteger("CC"));
			this.cropTypeD = Block.getBlockById(p_143011_1_.getInteger("CD"));
		}
		
		private Block func_151559_a(Random p_151559_1_)
		{
			switch(p_151559_1_.nextInt(5))
			{
				case 0:
					return Blocks.CARROTS;
				case 1:
					return Blocks.POTATOES;
				default:
					return Blocks.WHEAT;
			}
		}
		
		public static StructureAbandonedVillagePieces.Field1 func_175851_a(StructureAbandonedVillagePieces.Start p_175851_0_, List p_175851_1_, Random p_175851_2_, int p_175851_3_, int p_175851_4_, int p_175851_5_, EnumFacing p_175851_6_, int p_175851_7_)
		{
			StructureBoundingBox structureboundingbox = StructureBoundingBox.getComponentToAddBoundingBox(p_175851_3_, p_175851_4_, p_175851_5_, 0, 0, 0, 13, 4, 9, p_175851_6_);
			return canVillageGoDeeper(structureboundingbox) && StructureComponent.findIntersecting(p_175851_1_, structureboundingbox) == null ? new StructureAbandonedVillagePieces.Field1(p_175851_0_, p_175851_7_, p_175851_2_, structureboundingbox, p_175851_6_) : null;
		}
		
		/**
		 * second Part of Structure generating, this for example places Spiderwebs, Mob Spawners, it closes
		 * Mineshafts at the end, it adds Fences...
		 */
		public boolean addComponentParts(World worldIn, Random p_74875_2_, StructureBoundingBox p_74875_3_)
		{
			if(this.field_143015_k < 0)
			{
				this.field_143015_k = this.getAverageGroundLevel(worldIn, p_74875_3_);
				
				if(this.field_143015_k < 0)
				{
					return true;
				}
				
				this.boundingBox.offset(0, this.field_143015_k - this.boundingBox.maxY + 4 - 1, 0);
			}
			
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 1, 0, 12, 4, 8, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 0, 1, 2, 0, 7, Blocks.FARMLAND.getDefaultState(), Blocks.FARMLAND.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 4, 0, 1, 5, 0, 7, Blocks.FARMLAND.getDefaultState(), Blocks.FARMLAND.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 7, 0, 1, 8, 0, 7, Blocks.FARMLAND.getDefaultState(), Blocks.FARMLAND.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 10, 0, 1, 11, 0, 7, Blocks.FARMLAND.getDefaultState(), Blocks.FARMLAND.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 0, 0, 0, 0, 8, Blocks.LOG.getDefaultState(), Blocks.LOG.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 6, 0, 0, 6, 0, 8, Blocks.LOG.getDefaultState(), Blocks.LOG.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 12, 0, 0, 12, 0, 8, Blocks.LOG.getDefaultState(), Blocks.LOG.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 0, 0, 11, 0, 0, Blocks.LOG.getDefaultState(), Blocks.LOG.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 0, 8, 11, 0, 8, Blocks.LOG.getDefaultState(), Blocks.LOG.getDefaultState(), false);
			//this.fillWithBlocks(worldIn, p_74875_3_, 3, 0, 1, 3, 0, 7, Blocks.WATER.getDefaultState(), Blocks.WATER.getDefaultState(), false);
			//this.fillWithBlocks(worldIn, p_74875_3_, 9, 0, 1, 9, 0, 7, Blocks.WATER.getDefaultState(), Blocks.WATER.getDefaultState(), false);
			int i;
			
			for(i = 1; i <= 7; ++i)
			{
				if(p_74875_2_.nextInt(50) == 0)
				{
					int row = p_74875_2_.nextInt(11) + 1;
					if(row != 3 && row != 6 && row != 9)
						this.setBlockState(worldIn, this.cropTypeD.getStateFromMeta(MathHelper.getInt(p_74875_2_, 2, 7)), row, 1, i, p_74875_3_);
				}
			}
			
			for(i = 0; i < 9; ++i)
			{
				for(int j = 0; j < 13; ++j)
				{
					this.clearCurrentPositionBlocksUpwards(worldIn, j, 4, i, p_74875_3_);
					this.replaceAirAndLiquidDownwards(worldIn, Blocks.DIRT.getDefaultState(), j, -1, i, p_74875_3_);
				}
			}
			
			return true;
		}
	}
	
	public static class Field2 extends StructureAbandonedVillagePieces.Village
	{
		/**
		 * First crop type for this field.
		 */
		private Block cropTypeA;
		/**
		 * Second crop type for this field.
		 */
		private Block cropTypeB;
		private static final String __OBFID = "CL_00000519";
		
		public Field2()
		{
		}
		
		public Field2(StructureAbandonedVillagePieces.Start p_i45569_1_, int p_i45569_2_, Random p_i45569_3_, StructureBoundingBox p_i45569_4_, EnumFacing p_i45569_5_)
		{
			super(p_i45569_1_, p_i45569_2_);
			this.setCoordBaseMode(p_i45569_5_);
			this.boundingBox = p_i45569_4_;
			this.cropTypeA = this.func_151560_a(p_i45569_3_);
			this.cropTypeB = this.func_151560_a(p_i45569_3_);
		}
		
		/**
		 * (abstract) Helper method to write subclass data to NBT
		 */
		protected void writeStructureToNBT(NBTTagCompound p_143012_1_)
		{
			super.writeStructureToNBT(p_143012_1_);
			p_143012_1_.setInteger("CA", Block.REGISTRY.getIDForObject(this.cropTypeA));
			p_143012_1_.setInteger("CB", Block.REGISTRY.getIDForObject(this.cropTypeB));
		}
		
		/**
		 * (abstract) Helper method to read subclass data from NBT
		 */
		protected void readStructureFromNBT(NBTTagCompound p_143011_1_, TemplateManager man)
		{
			super.readStructureFromNBT(p_143011_1_, man);
			this.cropTypeA = Block.getBlockById(p_143011_1_.getInteger("CA"));
			this.cropTypeB = Block.getBlockById(p_143011_1_.getInteger("CB"));
		}
		
		private Block func_151560_a(Random p_151560_1_)
		{
			switch(p_151560_1_.nextInt(5))
			{
				case 0:
					return Blocks.CARROTS;
				case 1:
					return Blocks.POTATOES;
				default:
					return Blocks.WHEAT;
			}
		}
		
		public static StructureAbandonedVillagePieces.Field2 func_175852_a(StructureAbandonedVillagePieces.Start p_175852_0_, List p_175852_1_, Random p_175852_2_, int p_175852_3_, int p_175852_4_, int p_175852_5_, EnumFacing p_175852_6_, int p_175852_7_)
		{
			StructureBoundingBox structureboundingbox = StructureBoundingBox.getComponentToAddBoundingBox(p_175852_3_, p_175852_4_, p_175852_5_, 0, 0, 0, 7, 4, 9, p_175852_6_);
			return canVillageGoDeeper(structureboundingbox) && StructureComponent.findIntersecting(p_175852_1_, structureboundingbox) == null ? new StructureAbandonedVillagePieces.Field2(p_175852_0_, p_175852_7_, p_175852_2_, structureboundingbox, p_175852_6_) : null;
		}
		
		/**
		 * second Part of Structure generating, this for example places Spiderwebs, Mob Spawners, it closes
		 * Mineshafts at the end, it adds Fences...
		 */
		public boolean addComponentParts(World worldIn, Random p_74875_2_, StructureBoundingBox p_74875_3_)
		{
			if(this.field_143015_k < 0)
			{
				this.field_143015_k = this.getAverageGroundLevel(worldIn, p_74875_3_);
				
				if(this.field_143015_k < 0)
				{
					return true;
				}
				
				this.boundingBox.offset(0, this.field_143015_k - this.boundingBox.maxY + 4 - 1, 0);
			}
			
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 1, 0, 6, 4, 8, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 0, 1, 2, 0, 7, Blocks.FARMLAND.getDefaultState(), Blocks.FARMLAND.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 4, 0, 1, 5, 0, 7, Blocks.FARMLAND.getDefaultState(), Blocks.FARMLAND.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 0, 0, 0, 0, 8, Blocks.LOG.getDefaultState(), Blocks.LOG.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 6, 0, 0, 6, 0, 8, Blocks.LOG.getDefaultState(), Blocks.LOG.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 0, 0, 5, 0, 0, Blocks.LOG.getDefaultState(), Blocks.LOG.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 0, 8, 5, 0, 8, Blocks.LOG.getDefaultState(), Blocks.LOG.getDefaultState(), false);
			//this.fillWithBlocks(worldIn, p_74875_3_, 3, 0, 1, 3, 0, 7, Blocks.WATER.getDefaultState(), Blocks.WATER.getDefaultState(), false);
			int i;
			
			for(i = 1; i <= 7; ++i)
			{
				if(p_74875_2_.nextInt(50) == 0)
				{
					int row = p_74875_2_.nextInt(5) + 1;
					if(row != 3)
						this.setBlockState(worldIn, this.cropTypeA.getStateFromMeta(MathHelper.getInt(p_74875_2_, 2, 7)), row, 1, i, p_74875_3_);
				}
			}
			
			for(i = 0; i < 9; ++i)
			{
				for(int j = 0; j < 7; ++j)
				{
					this.clearCurrentPositionBlocksUpwards(worldIn, j, 4, i, p_74875_3_);
					this.replaceAirAndLiquidDownwards(worldIn, Blocks.DIRT.getDefaultState(), j, -1, i, p_74875_3_);
				}
			}
			
			return true;
		}
	}
	
	public static class Hall extends StructureAbandonedVillagePieces.Village
	{
		private static final String __OBFID = "CL_00000522";
		
		public Hall()
		{
		}
		
		public Hall(StructureAbandonedVillagePieces.Start p_i45567_1_, int p_i45567_2_, Random p_i45567_3_, StructureBoundingBox p_i45567_4_, EnumFacing p_i45567_5_)
		{
			super(p_i45567_1_, p_i45567_2_);
			this.setCoordBaseMode(p_i45567_5_);
			this.boundingBox = p_i45567_4_;
		}
		
		public static StructureAbandonedVillagePieces.Hall func_175857_a(StructureAbandonedVillagePieces.Start p_175857_0_, List p_175857_1_, Random p_175857_2_, int p_175857_3_, int p_175857_4_, int p_175857_5_, EnumFacing p_175857_6_, int p_175857_7_)
		{
			StructureBoundingBox structureboundingbox = StructureBoundingBox.getComponentToAddBoundingBox(p_175857_3_, p_175857_4_, p_175857_5_, 0, 0, 0, 9, 7, 11, p_175857_6_);
			return canVillageGoDeeper(structureboundingbox) && StructureComponent.findIntersecting(p_175857_1_, structureboundingbox) == null ? new StructureAbandonedVillagePieces.Hall(p_175857_0_, p_175857_7_, p_175857_2_, structureboundingbox, p_175857_6_) : null;
		}
		
		/**
		 * second Part of Structure generating, this for example places Spiderwebs, Mob Spawners, it closes
		 * Mineshafts at the end, it adds Fences...
		 */
		public boolean addComponentParts(World worldIn, Random p_74875_2_, StructureBoundingBox p_74875_3_)
		{
			if(this.field_143015_k < 0)
			{
				this.field_143015_k = this.getAverageGroundLevel(worldIn, p_74875_3_);
				
				if(this.field_143015_k < 0)
				{
					return true;
				}
				
				this.boundingBox.offset(0, this.field_143015_k - this.boundingBox.maxY + 7 - 1, 0);
			}
			
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 1, 1, 7, 4, 4, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 2, 1, 6, 8, 4, 10, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 2, 0, 6, 8, 0, 10, Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState(), false);
			this.setBlockState(worldIn, Blocks.COBBLESTONE.getDefaultState(), 6, 0, 6, p_74875_3_);
			this.fillWithBlocks(worldIn, p_74875_3_, 2, 1, 6, 2, 1, 10, Blocks.OAK_FENCE.getDefaultState(), Blocks.OAK_FENCE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 8, 1, 6, 8, 1, 10, Blocks.OAK_FENCE.getDefaultState(), Blocks.OAK_FENCE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 3, 1, 10, 7, 1, 10, Blocks.OAK_FENCE.getDefaultState(), Blocks.OAK_FENCE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 0, 1, 7, 0, 4, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 0, 0, 0, 3, 5, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 8, 0, 0, 8, 3, 5, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 0, 0, 7, 1, 0, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 0, 5, 7, 1, 5, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 2, 0, 7, 3, 0, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 2, 5, 7, 3, 5, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 4, 1, 8, 4, 1, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 4, 4, 8, 4, 4, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 5, 2, 8, 5, 3, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.setBlockState(worldIn, Blocks.PLANKS.getDefaultState(), 0, 4, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.PLANKS.getDefaultState(), 0, 4, 3, p_74875_3_);
			this.setBlockState(worldIn, Blocks.PLANKS.getDefaultState(), 8, 4, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.PLANKS.getDefaultState(), 8, 4, 3, p_74875_3_);
			int k;
			int l;
			
			for(k = -1; k <= 2; ++k)
			{
				for(l = 0; l <= 8; ++l)
				{
					this.setBlockState(worldIn, Blocks.OAK_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.WEST), l, 4 + k, k, p_74875_3_);
					this.setBlockState(worldIn, Blocks.OAK_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.SOUTH), l, 4 + k, 5 - k, p_74875_3_);
				}
			}
			
			this.setBlockState(worldIn, Blocks.LOG.getDefaultState(), 0, 2, 1, p_74875_3_);
			this.setBlockState(worldIn, Blocks.LOG.getDefaultState(), 0, 2, 4, p_74875_3_);
			this.setBlockState(worldIn, Blocks.LOG.getDefaultState(), 8, 2, 1, p_74875_3_);
			this.setBlockState(worldIn, Blocks.LOG.getDefaultState(), 8, 2, 4, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 0, 2, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 0, 2, 3, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 8, 2, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 8, 2, 3, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 2, 2, 5, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 3, 2, 5, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 5, 2, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 6, 2, 5, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 2, 1, 3, p_74875_3_);
			this.setBlockState(worldIn, Blocks.WOODEN_PRESSURE_PLATE.getDefaultState(), 2, 2, 3, p_74875_3_);
			this.setBlockState(worldIn, Blocks.PLANKS.getDefaultState(), 1, 1, 4, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.WEST), 2, 1, 4, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.EAST), 1, 1, 3, p_74875_3_);
			this.fillWithBlocks(worldIn, p_74875_3_, 5, 0, 1, 7, 0, 3, Blocks.DOUBLE_STONE_SLAB.getDefaultState(), Blocks.DOUBLE_STONE_SLAB.getDefaultState(), false);
			this.setBlockState(worldIn, Blocks.DOUBLE_STONE_SLAB.getDefaultState(), 6, 1, 1, p_74875_3_);
			this.setBlockState(worldIn, Blocks.DOUBLE_STONE_SLAB.getDefaultState(), 6, 1, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 2, 1, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 2, 2, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.TORCH.getDefaultState().withProperty(BlockTorch.FACING, this.getCoordBaseMode()), 2, 3, 1, p_74875_3_);
			
			if(this.getBlockStateFromPos(worldIn, 2, 0, -1, p_74875_3_).getMaterial() == Material.AIR && this.getBlockStateFromPos(worldIn, 2, -1, -1, p_74875_3_).getMaterial() != Material.AIR)
			{
				this.setBlockState(worldIn, Blocks.STONE_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.WEST), 2, 0, -1, p_74875_3_);
			}
			
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 6, 1, 5, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 6, 2, 5, p_74875_3_);
			this.setBlockState(worldIn, Blocks.TORCH.getDefaultState().withProperty(BlockTorch.FACING, this.getCoordBaseMode().getOpposite()), 6, 3, 4, p_74875_3_);
			
			for(k = 0; k < 5; ++k)
			{
				for(l = 0; l < 9; ++l)
				{
					this.clearCurrentPositionBlocksUpwards(worldIn, l, 7, k, p_74875_3_);
					this.replaceAirAndLiquidDownwards(worldIn, Blocks.COBBLESTONE.getDefaultState(), l, -1, k, p_74875_3_);
				}
			}
			
			this.spawnVillagers(worldIn, p_74875_3_, 4, 1, 2, 2);
			return true;
		}
		
		protected int func_180779_c(int p_180779_1_, int p_180779_2_)
		{
			return p_180779_1_ == 0 ? 4 : super.func_180779_c(p_180779_1_, p_180779_2_);
		}
	}
	
	public static class Library extends StructureAbandonedVillagePieces.Village
	{
		private static final String __OBFID = "CL_00000517";
		private boolean hasMadeChest = false;
		
		public Library()
		{
		}
		
		public Library(StructureAbandonedVillagePieces.Start p_i45571_1_, int p_i45571_2_, Random p_i45571_3_, StructureBoundingBox p_i45571_4_, EnumFacing p_i45571_5_)
		{
			super(p_i45571_1_, p_i45571_2_);
			this.setCoordBaseMode(p_i45571_5_);
			this.boundingBox = p_i45571_4_;
		}
		
		public static StructureAbandonedVillagePieces.Library func_175850_a(StructureAbandonedVillagePieces.Start p_175850_0_, List p_175850_1_, Random p_175850_2_, int p_175850_3_, int p_175850_4_, int p_175850_5_, EnumFacing p_175850_6_, int p_175850_7_)
		{
			StructureBoundingBox structureboundingbox = StructureBoundingBox.getComponentToAddBoundingBox(p_175850_3_, p_175850_4_, p_175850_5_, 0, 0, 0, 9, 9, 6, p_175850_6_);
			return canVillageGoDeeper(structureboundingbox) && StructureComponent.findIntersecting(p_175850_1_, structureboundingbox) == null ? new StructureAbandonedVillagePieces.Library(p_175850_0_, p_175850_7_, p_175850_2_, structureboundingbox, p_175850_6_) : null;
		}
		
		protected void writeStructureToNBT(NBTTagCompound p_143012_1_)
		{
			super.writeStructureToNBT(p_143012_1_);
			p_143012_1_.setBoolean("Chest", this.hasMadeChest);
		}
		
		protected void readStructureFromNBT(NBTTagCompound p_143011_1_, TemplateManager man)
		{
			super.readStructureFromNBT(p_143011_1_, man);
			this.hasMadeChest = p_143011_1_.getBoolean("Chest");
		}
		
		/**
		 * second Part of Structure generating, this for example places Spiderwebs, Mob Spawners, it closes
		 * Mineshafts at the end, it adds Fences...
		 */
		public boolean addComponentParts(World worldIn, Random p_74875_2_, StructureBoundingBox p_74875_3_)
		{
			if(this.field_143015_k < 0)
			{
				this.field_143015_k = this.getAverageGroundLevel(worldIn, p_74875_3_);
				
				if(this.field_143015_k < 0)
				{
					return true;
				}
				
				this.boundingBox.offset(0, this.field_143015_k - this.boundingBox.maxY + 9 - 1, 0);
			}
			
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 1, 1, 7, 5, 4, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 0, 0, 8, 0, 5, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 5, 0, 8, 5, 5, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 6, 1, 8, 6, 4, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 7, 2, 8, 7, 3, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			int k;
			int l;
			
			for(k = -1; k <= 2; ++k)
			{
				for(l = 0; l <= 8; ++l)
				{
					this.setBlockState(worldIn, Blocks.OAK_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.WEST), l, 6 + k, k, p_74875_3_);
					this.setBlockState(worldIn, Blocks.OAK_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.SOUTH), l, 6 + k, 5 - k, p_74875_3_);
				}
			}
			
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 1, 0, 0, 1, 5, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 1, 5, 8, 1, 5, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 8, 1, 0, 8, 1, 4, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 2, 1, 0, 7, 1, 0, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 2, 0, 0, 4, 0, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 2, 5, 0, 4, 5, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 8, 2, 5, 8, 4, 5, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 8, 2, 0, 8, 4, 0, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 2, 1, 0, 4, 4, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 2, 5, 7, 4, 5, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 8, 2, 1, 8, 4, 4, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 2, 0, 7, 4, 0, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 4, 2, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 5, 2, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 6, 2, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 4, 3, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 5, 3, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 6, 3, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 0, 2, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 0, 2, 3, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 0, 3, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 0, 3, 3, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 8, 2, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 8, 2, 3, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 8, 3, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 8, 3, 3, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 2, 2, 5, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 3, 2, 5, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 5, 2, 5, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 6, 2, 5, p_74875_3_);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 4, 1, 7, 4, 1, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 4, 4, 7, 4, 4, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 3, 4, 2, 3, 4, Blocks.BOOKSHELF.getDefaultState(), Blocks.BOOKSHELF.getDefaultState(), false);
			this.setBlockState(worldIn, Blocks.PLANKS.getDefaultState(), 7, 1, 4, p_74875_3_);
			
			//Flan's Mod Bits : Crafting tables
			this.setBlockState(worldIn, FlansModApocalypse.getLootGenerator().getRandomWeaponBox(p_74875_2_).getDefaultState(), 1, 1, 4, p_74875_3_);
			this.setBlockState(worldIn, FlansMod.workbench.getStateFromMeta(p_74875_2_.nextInt(2)), 7, 1, 3, p_74875_3_);
			this.setBlockState(worldIn, Blocks.CRAFTING_TABLE.getDefaultState(), 7, 1, 1, p_74875_3_);
			this.setBlockState(worldIn, Blocks.PLANKS.getDefaultState(), 3, 1, 4, p_74875_3_);
			
			
			if(!hasMadeChest && p_74875_3_.isVecInside(new BlockPos(this.getXWithOffset(2, 4), this.getYWithOffset(1), this.getZWithOffset(2, 4))))
			{
				hasMadeChest = true;
				
				//Chest with random Flan's Mod bits
				
				BlockPos chestPos = new BlockPos(this.getXWithOffset(2, 4), this.getYWithOffset(1), this.getZWithOffset(2, 4));
				IBlockState chestState = Blocks.CHEST.correctFacing(worldIn, chestPos, Blocks.CHEST.getDefaultState());
				worldIn.setBlockState(chestPos, Blocks.CHEST.correctFacing(worldIn, chestPos, chestState), 2);
				TileEntity tileentity = worldIn.getTileEntity(chestPos);
				if(tileentity instanceof TileEntityChest)
				{
					FlansModApocalypse.getLootGenerator().fillVillageChest(p_74875_2_, (TileEntityChest)tileentity);
				}
				
				//Dead skeleton with weapon
				BlockPos skeletonPos = new BlockPos(this.getXWithOffset(5, 4), this.getYWithOffset(1), this.getZWithOffset(5, 4));
				worldIn.setBlockState(skeletonPos, FlansModApocalypse.slumpedSkeleton.getStateFromMeta((4 - Blocks.CHEST.getMetaFromState(chestState)) % 4), 2);
				FlansModApocalypse.getLootGenerator().addRandomLoot((TileEntityItemHolder)worldIn.getTileEntity(skeletonPos), p_74875_2_, false);
			}
			
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 1, 1, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 1, 2, 0, p_74875_3_);
			
			if(this.getBlockStateFromPos(worldIn, 1, 0, -1, p_74875_3_).getMaterial() == Material.AIR && this.getBlockStateFromPos(worldIn, 1, -1, -1, p_74875_3_).getMaterial() != Material.AIR)
			{
				this.setBlockState(worldIn, Blocks.STONE_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.WEST), 1, 0, -1, p_74875_3_);
			}
			
			for(l = 0; l < 6; ++l)
			{
				for(int i1 = 0; i1 < 9; ++i1)
				{
					this.clearCurrentPositionBlocksUpwards(worldIn, i1, 9, l, p_74875_3_);
					this.replaceAirAndLiquidDownwards(worldIn, Blocks.COBBLESTONE.getDefaultState(), i1, -1, l, p_74875_3_);
				}
			}
			
			this.spawnVillagers(worldIn, p_74875_3_, 2, 1, 2, 1);
			return true;
		}
		
		protected int func_180779_c(int p_180779_1_, int p_180779_2_)
		{
			return 1;
		}
	}
	
	public static class Blacksmith extends StructureAbandonedVillagePieces.Village
	{
		/**
		 * List of items that Village's Blacksmith chest can contain.
		 */
		//private static final List villageBlacksmithChestContents = Lists.newArrayList(new WeightedRandomChestContent[] {new WeightedRandomChestContent(Items.diamond, 0, 1, 3, 3), new WeightedRandomChestContent(Items.iron_ingot, 0, 1, 5, 10), new WeightedRandomChestContent(Items.gold_ingot, 0, 1, 3, 5), new WeightedRandomChestContent(Items.bread, 0, 1, 3, 15), new WeightedRandomChestContent(Items.apple, 0, 1, 3, 15), new WeightedRandomChestContent(Items.iron_pickaxe, 0, 1, 1, 5), new WeightedRandomChestContent(Items.iron_sword, 0, 1, 1, 5), new WeightedRandomChestContent(Items.iron_chestplate, 0, 1, 1, 5), new WeightedRandomChestContent(Items.iron_helmet, 0, 1, 1, 5), new WeightedRandomChestContent(Items.iron_leggings, 0, 1, 1, 5), new WeightedRandomChestContent(Items.iron_boots, 0, 1, 1, 5), new WeightedRandomChestContent(Item.getItemFromBlock(Blocks.OBSIDIAN), 0, 3, 7, 5), new WeightedRandomChestContent(Item.getItemFromBlock(Blocks.sapling), 0, 3, 7, 5), new WeightedRandomChestContent(Items.saddle, 0, 1, 1, 3), new WeightedRandomChestContent(Items.iron_horse_armor, 0, 1, 1, 1), new WeightedRandomChestContent(Items.golden_horse_armor, 0, 1, 1, 1), new WeightedRandomChestContent(Items.diamond_horse_armor, 0, 1, 1, 1)});
		private boolean hasMadeChest;
		private static final String __OBFID = "CL_00000526";
		
		public Blacksmith()
		{
		}
		
		public Blacksmith(StructureAbandonedVillagePieces.Start p_i45563_1_, int p_i45563_2_, Random p_i45563_3_, StructureBoundingBox p_i45563_4_, EnumFacing p_i45563_5_)
		{
			super(p_i45563_1_, p_i45563_2_);
			this.setCoordBaseMode(p_i45563_5_);
			this.boundingBox = p_i45563_4_;
		}
		
		public static StructureAbandonedVillagePieces.Blacksmith func_175855_a(StructureAbandonedVillagePieces.Start p_175855_0_, List p_175855_1_, Random p_175855_2_, int p_175855_3_, int p_175855_4_, int p_175855_5_, EnumFacing p_175855_6_, int p_175855_7_)
		{
			StructureBoundingBox structureboundingbox = StructureBoundingBox.getComponentToAddBoundingBox(p_175855_3_, p_175855_4_, p_175855_5_, 0, 0, 0, 10, 6, 7, p_175855_6_);
			return canVillageGoDeeper(structureboundingbox) && StructureComponent.findIntersecting(p_175855_1_, structureboundingbox) == null ? new StructureAbandonedVillagePieces.Blacksmith(p_175855_0_, p_175855_7_, p_175855_2_, structureboundingbox, p_175855_6_) : null;
		}
		
		/**
		 * (abstract) Helper method to write subclass data to NBT
		 */
		protected void writeStructureToNBT(NBTTagCompound p_143012_1_)
		{
			super.writeStructureToNBT(p_143012_1_);
			p_143012_1_.setBoolean("Chest", this.hasMadeChest);
		}
		
		/**
		 * (abstract) Helper method to read subclass data from NBT
		 */
		protected void readStructureFromNBT(NBTTagCompound p_143011_1_, TemplateManager man)
		{
			super.readStructureFromNBT(p_143011_1_, man);
			this.hasMadeChest = p_143011_1_.getBoolean("Chest");
		}
		
		/**
		 * second Part of Structure generating, this for example places Spiderwebs, Mob Spawners, it closes
		 * Mineshafts at the end, it adds Fences...
		 */
		public boolean addComponentParts(World worldIn, Random rand, StructureBoundingBox p_74875_3_)
		{
			if(this.field_143015_k < 0)
			{
				this.field_143015_k = this.getAverageGroundLevel(worldIn, p_74875_3_);
				
				if(this.field_143015_k < 0)
				{
					return true;
				}
				
				this.boundingBox.offset(0, this.field_143015_k - this.boundingBox.maxY + 6 - 1, 0);
			}
			
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 1, 0, 9, 4, 6, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 0, 0, 9, 0, 6, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 4, 0, 9, 4, 6, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 5, 0, 9, 5, 6, Blocks.STONE_SLAB.getDefaultState(), Blocks.STONE_SLAB.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 5, 1, 8, 5, 5, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			//Front wall
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 1, 0, 2, 3, 0, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 1, 0, 1, 1, 0, Blocks.PLANKS.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 1, 0, 0, 4, 0, Blocks.LOG.getDefaultState(), Blocks.LOG.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 3, 1, 0, 3, 4, 0, Blocks.LOG.getDefaultState(), Blocks.LOG.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 1, 6, 0, 4, 6, Blocks.LOG.getDefaultState(), Blocks.LOG.getDefaultState(), false);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 3, 3, 1, p_74875_3_);
			this.fillWithBlocks(worldIn, p_74875_3_, 3, 1, 2, 3, 3, 2, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 4, 1, 3, 5, 3, 3, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			//Broken side wall
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 1, 1, 0, 3, 5, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 1, 3, 0, 1, 5, Blocks.PLANKS.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 2, 5, 0, 2, 5, Blocks.PLANKS.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			//Broken back wall
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 1, 6, 5, 3, 6, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 1, 6, 5, 1, 6, Blocks.PLANKS.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 2, 6, 3, 2, 6, Blocks.PLANKS.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 3, 6, 1, 3, 6, Blocks.PLANKS.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			//
			this.fillWithBlocks(worldIn, p_74875_3_, 5, 1, 0, 5, 3, 0, Blocks.OAK_FENCE.getDefaultState(), Blocks.OAK_FENCE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 9, 1, 0, 9, 3, 0, Blocks.OAK_FENCE.getDefaultState(), Blocks.OAK_FENCE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 6, 1, 4, 9, 4, 6, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 7, 1, 5, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 8, 1, 5, p_74875_3_);
			this.setBlockState(worldIn, Blocks.IRON_BARS.getDefaultState(), 9, 2, 5, p_74875_3_);
			this.setBlockState(worldIn, Blocks.IRON_BARS.getDefaultState(), 9, 2, 4, p_74875_3_);
			this.fillWithBlocks(worldIn, p_74875_3_, 7, 2, 4, 8, 2, 5, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			this.setBlockState(worldIn, Blocks.COBBLESTONE.getDefaultState(), 6, 1, 3, p_74875_3_);
			this.setBlockState(worldIn, Blocks.FURNACE.getDefaultState(), 6, 2, 3, p_74875_3_);
			this.setBlockState(worldIn, Blocks.FURNACE.getDefaultState(), 6, 3, 3, p_74875_3_);
			this.setBlockState(worldIn, Blocks.DOUBLE_STONE_SLAB.getDefaultState(), 8, 1, 1, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 0, 2, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 0, 2, 4, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 2, 2, 6, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 4, 2, 6, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 2, 1, 4, p_74875_3_);
			this.setBlockState(worldIn, Blocks.WOODEN_PRESSURE_PLATE.getDefaultState(), 2, 2, 4, p_74875_3_);
			this.setBlockState(worldIn, Blocks.PLANKS.getDefaultState(), 1, 1, 5, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.WEST), 2, 1, 5, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.EAST), 1, 1, 4, p_74875_3_);
			
			if(!this.hasMadeChest && p_74875_3_.isVecInside(new BlockPos(this.getXWithOffset(5, 5), this.getYWithOffset(1), this.getZWithOffset(5, 5))))
			{
				this.hasMadeChest = true;
				BlockPos blockpos = new BlockPos(this.getXWithOffset(5, 5), this.getYWithOffset(1), this.getZWithOffset(5, 5));
				
				if(p_74875_3_.isVecInside(blockpos) && worldIn.getBlockState(blockpos).getBlock() != Blocks.CHEST)
				{
					IBlockState iblockstate = Blocks.CHEST.getDefaultState();
					worldIn.setBlockState(blockpos, Blocks.CHEST.correctFacing(worldIn, blockpos, iblockstate), 2);
					TileEntity tileentity = worldIn.getTileEntity(blockpos);
					
					if(tileentity instanceof TileEntityChest)
					{
						//WeightedRandomChestContent.generateChestContents(p_180778_3_, p_180778_7_, (TileEntityChest)tileentity, p_180778_8_);
						FlansModApocalypse.getLootGenerator().fillVillageChest(rand, (TileEntityChest)tileentity);
					}
				}
			}
			
			int i;
			
			for(i = 6; i <= 8; ++i)
			{
				if(this.getBlockStateFromPos(worldIn, i, 0, -1, p_74875_3_).getMaterial() == Material.AIR && this.getBlockStateFromPos(worldIn, i, -1, -1, p_74875_3_).getMaterial() != Material.AIR)
				{
					this.setBlockState(worldIn, Blocks.STONE_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.WEST), i, 0, -1, p_74875_3_);
				}
			}
			
			for(i = 0; i < 7; ++i)
			{
				for(int j = 0; j < 10; ++j)
				{
					this.clearCurrentPositionBlocksUpwards(worldIn, j, 6, i, p_74875_3_);
					this.replaceAirAndLiquidDownwards(worldIn, Blocks.COBBLESTONE.getDefaultState(), j, -1, i, p_74875_3_);
				}
			}
			
			int[][] destruction = {
					{0, 0, 0, 0, 0, 0, 4, 4, 4, 4},
					{0, 0, 0, 0, 0, 0, 0, 4, 4, 4},
					{0, 0, 0, 0, 0, 0, 0, 0, 4, 4},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
			};
			destroyBuilding(worldIn, destruction, p_74875_3_);
			
			this.spawnVillagers(worldIn, p_74875_3_, 7, 1, 1, 1);
			return true;
		}
		
		protected int func_180779_c(int p_180779_1_, int p_180779_2_)
		{
			return 3;
		}
	}
	
	public static class House3 extends StructureAbandonedVillagePieces.Village
	{
		private static final String __OBFID = "CL_00000530";
		
		public House3()
		{
		}
		
		public House3(StructureAbandonedVillagePieces.Start p_i45561_1_, int p_i45561_2_, Random p_i45561_3_, StructureBoundingBox p_i45561_4_, EnumFacing p_i45561_5_)
		{
			super(p_i45561_1_, p_i45561_2_);
			this.setCoordBaseMode(p_i45561_5_);
			this.boundingBox = p_i45561_4_;
		}
		
		public static StructureAbandonedVillagePieces.House3 func_175849_a(StructureAbandonedVillagePieces.Start p_175849_0_, List p_175849_1_, Random p_175849_2_, int p_175849_3_, int p_175849_4_, int p_175849_5_, EnumFacing p_175849_6_, int p_175849_7_)
		{
			StructureBoundingBox structureboundingbox = StructureBoundingBox.getComponentToAddBoundingBox(p_175849_3_, p_175849_4_, p_175849_5_, 0, 0, 0, 9, 7, 12, p_175849_6_);
			return canVillageGoDeeper(structureboundingbox) && StructureComponent.findIntersecting(p_175849_1_, structureboundingbox) == null ? new StructureAbandonedVillagePieces.House3(p_175849_0_, p_175849_7_, p_175849_2_, structureboundingbox, p_175849_6_) : null;
		}
		
		/**
		 * second Part of Structure generating, this for example places Spiderwebs, Mob Spawners, it closes
		 * Mineshafts at the end, it adds Fences...
		 */
		public boolean addComponentParts(World worldIn, Random p_74875_2_, StructureBoundingBox p_74875_3_)
		{
			if(this.field_143015_k < 0)
			{
				this.field_143015_k = this.getAverageGroundLevel(worldIn, p_74875_3_);
				
				if(this.field_143015_k < 0)
				{
					return true;
				}
				
				this.boundingBox.offset(0, this.field_143015_k - this.boundingBox.maxY + 7 - 1, 0);
			}
			
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 1, 1, 7, 4, 4, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 2, 1, 6, 8, 4, 10, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 2, 0, 5, 8, 0, 10, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 0, 1, 7, 0, 4, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 0, 0, 0, 3, 5, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 8, 0, 0, 8, 3, 10, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 0, 0, 7, 2, 0, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 0, 5, 2, 1, 5, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 2, 0, 6, 2, 3, 10, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 3, 0, 10, 7, 3, 10, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 2, 0, 7, 3, 0, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 2, 5, 2, 3, 5, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 4, 1, 8, 4, 1, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 4, 4, 3, 4, 4, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 5, 2, 8, 5, 3, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.setBlockState(worldIn, Blocks.PLANKS.getDefaultState(), 0, 4, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.PLANKS.getDefaultState(), 0, 4, 3, p_74875_3_);
			this.setBlockState(worldIn, Blocks.PLANKS.getDefaultState(), 8, 4, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.PLANKS.getDefaultState(), 8, 4, 3, p_74875_3_);
			this.setBlockState(worldIn, Blocks.PLANKS.getDefaultState(), 8, 4, 4, p_74875_3_);
			int k;
			int l;
			
			for(k = -1; k <= 2; ++k)
			{
				for(l = 0; l <= 8; ++l)
				{
					this.setBlockState(worldIn, Blocks.OAK_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.WEST), l, 4 + k, k, p_74875_3_);
					
					if((k > -1 || l <= 1) && (k > 0 || l <= 3) && (k > 1 || l <= 4 || l >= 6))
					{
						this.setBlockState(worldIn, Blocks.OAK_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.SOUTH), l, 4 + k, 5 - k, p_74875_3_);
					}
				}
			}
			
			this.fillWithBlocks(worldIn, p_74875_3_, 3, 4, 5, 3, 4, 10, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 7, 4, 2, 7, 4, 10, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 4, 5, 4, 4, 5, 10, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 6, 5, 4, 6, 5, 10, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 5, 6, 3, 5, 6, 10, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			
			int i1;
			
			for(l = 4; l >= 1; --l)
			{
				this.setBlockState(worldIn, Blocks.PLANKS.getDefaultState(), l, 2 + l, 7 - l, p_74875_3_);
				
				for(i1 = 8 - l; i1 <= 10; ++i1)
				{
					this.setBlockState(worldIn, Blocks.OAK_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.NORTH), l, 2 + l, i1, p_74875_3_);
				}
			}
			
			this.setBlockState(worldIn, Blocks.PLANKS.getDefaultState(), 6, 6, 3, p_74875_3_);
			this.setBlockState(worldIn, Blocks.PLANKS.getDefaultState(), 7, 5, 4, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.EAST), 6, 6, 4, p_74875_3_);
			int j1;
			
			for(i1 = 6; i1 <= 8; ++i1)
			{
				for(j1 = 5; j1 <= 10; ++j1)
				{
					this.setBlockState(worldIn, Blocks.OAK_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.EAST), i1, 12 - i1, j1, p_74875_3_);
				}
			}
			
			this.setBlockState(worldIn, Blocks.LOG.getDefaultState(), 0, 2, 1, p_74875_3_);
			this.setBlockState(worldIn, Blocks.LOG.getDefaultState(), 0, 2, 4, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 0, 2, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 0, 2, 3, p_74875_3_);
			this.setBlockState(worldIn, Blocks.LOG.getDefaultState(), 4, 2, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 5, 2, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.LOG.getDefaultState(), 6, 2, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.LOG.getDefaultState(), 8, 2, 1, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 8, 2, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 8, 2, 3, p_74875_3_);
			this.setBlockState(worldIn, Blocks.LOG.getDefaultState(), 8, 2, 4, p_74875_3_);
			this.setBlockState(worldIn, Blocks.PLANKS.getDefaultState(), 8, 2, 5, p_74875_3_);
			this.setBlockState(worldIn, Blocks.LOG.getDefaultState(), 8, 2, 6, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 8, 2, 7, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 8, 2, 8, p_74875_3_);
			this.setBlockState(worldIn, Blocks.LOG.getDefaultState(), 8, 2, 9, p_74875_3_);
			this.setBlockState(worldIn, Blocks.LOG.getDefaultState(), 2, 2, 6, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 2, 2, 7, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 2, 2, 8, p_74875_3_);
			this.setBlockState(worldIn, Blocks.LOG.getDefaultState(), 2, 2, 9, p_74875_3_);
			this.setBlockState(worldIn, Blocks.LOG.getDefaultState(), 4, 4, 10, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 5, 4, 10, p_74875_3_);
			this.setBlockState(worldIn, Blocks.LOG.getDefaultState(), 6, 4, 10, p_74875_3_);
			this.setBlockState(worldIn, Blocks.PLANKS.getDefaultState(), 5, 5, 10, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 2, 1, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 2, 2, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.TORCH.getDefaultState().withProperty(BlockTorch.FACING, this.getCoordBaseMode()), 2, 3, 1, p_74875_3_);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 0, -1, 3, 2, -1, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			
			if(this.getBlockStateFromPos(worldIn, 2, 0, -1, p_74875_3_).getMaterial() == Material.AIR && this.getBlockStateFromPos(worldIn, 2, -1, -1, p_74875_3_).getMaterial() != Material.AIR)
			{
				this.setBlockState(worldIn, Blocks.STONE_STAIRS.getStateFromMeta(3), 2, 0, -1, p_74875_3_);
			}
			
			for(i1 = 0; i1 < 5; ++i1)
			{
				for(j1 = 0; j1 < 9; ++j1)
				{
					this.clearCurrentPositionBlocksUpwards(worldIn, j1, 7, i1, p_74875_3_);
					this.replaceAirAndLiquidDownwards(worldIn, Blocks.COBBLESTONE.getDefaultState(), j1, -1, i1, p_74875_3_);
				}
			}
			
			for(i1 = 5; i1 < 11; ++i1)
			{
				for(j1 = 2; j1 < 9; ++j1)
				{
					this.clearCurrentPositionBlocksUpwards(worldIn, j1, 7, i1, p_74875_3_);
					this.replaceAirAndLiquidDownwards(worldIn, Blocks.COBBLESTONE.getDefaultState(), j1, -1, i1, p_74875_3_);
				}
			}
			
			this.spawnVillagers(worldIn, p_74875_3_, 4, 1, 2, 2);
			return true;
		}
	}
	
	public static class House4Garden extends StructureAbandonedVillagePieces.Village
	{
		private boolean isRoofAccessible;
		private static final String __OBFID = "CL_00000523";
		
		public House4Garden()
		{
		}
		
		public House4Garden(StructureAbandonedVillagePieces.Start p_i45566_1_, int p_i45566_2_, Random p_i45566_3_, StructureBoundingBox p_i45566_4_, EnumFacing p_i45566_5_)
		{
			super(p_i45566_1_, p_i45566_2_);
			this.setCoordBaseMode(p_i45566_5_);
			this.boundingBox = p_i45566_4_;
			this.isRoofAccessible = p_i45566_3_.nextBoolean();
		}
		
		/**
		 * (abstract) Helper method to write subclass data to NBT
		 */
		protected void writeStructureToNBT(NBTTagCompound p_143012_1_)
		{
			super.writeStructureToNBT(p_143012_1_);
			p_143012_1_.setBoolean("Terrace", this.isRoofAccessible);
		}
		
		/**
		 * (abstract) Helper method to read subclass data from NBT
		 */
		protected void readStructureFromNBT(NBTTagCompound p_143011_1_, TemplateManager man)
		{
			super.readStructureFromNBT(p_143011_1_, man);
			this.isRoofAccessible = p_143011_1_.getBoolean("Terrace");
		}
		
		public static StructureAbandonedVillagePieces.House4Garden func_175858_a(StructureAbandonedVillagePieces.Start p_175858_0_, List p_175858_1_, Random p_175858_2_, int p_175858_3_, int p_175858_4_, int p_175858_5_, EnumFacing p_175858_6_, int p_175858_7_)
		{
			StructureBoundingBox structureboundingbox = StructureBoundingBox.getComponentToAddBoundingBox(p_175858_3_, p_175858_4_, p_175858_5_, 0, 0, 0, 5, 6, 5, p_175858_6_);
			return StructureComponent.findIntersecting(p_175858_1_, structureboundingbox) != null ? null : new StructureAbandonedVillagePieces.House4Garden(p_175858_0_, p_175858_7_, p_175858_2_, structureboundingbox, p_175858_6_);
		}
		
		/**
		 * second Part of Structure generating, this for example places Spiderwebs, Mob Spawners, it closes
		 * Mineshafts at the end, it adds Fences...
		 */
		public boolean addComponentParts(World worldIn, Random p_74875_2_, StructureBoundingBox p_74875_3_)
		{
			if(this.field_143015_k < 0)
			{
				this.field_143015_k = this.getAverageGroundLevel(worldIn, p_74875_3_);
				
				if(this.field_143015_k < 0)
				{
					return true;
				}
				
				this.boundingBox.offset(0, this.field_143015_k - this.boundingBox.maxY + 6 - 1, 0);
			}
			
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 0, 0, 4, 0, 4, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			
			this.setBlockState(worldIn, Blocks.COBBLESTONE.getDefaultState(), 0, 1, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.COBBLESTONE.getDefaultState(), 0, 2, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.COBBLESTONE.getDefaultState(), 4, 1, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.COBBLESTONE.getDefaultState(), 4, 2, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.COBBLESTONE.getDefaultState(), 4, 3, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.COBBLESTONE.getDefaultState(), 0, 1, 4, p_74875_3_);
			this.setBlockState(worldIn, Blocks.COBBLESTONE.getDefaultState(), 4, 1, 4, p_74875_3_);
			this.setBlockState(worldIn, Blocks.COBBLESTONE.getDefaultState(), 4, 2, 4, p_74875_3_);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 1, 1, 0, 1, 3, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 4, 1, 1, 4, 1, 2, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
			
			if(this.getBlockStateFromPos(worldIn, 2, 0, -1, p_74875_3_).getMaterial() == Material.AIR && this.getBlockStateFromPos(worldIn, 2, -1, -1, p_74875_3_).getMaterial() != Material.AIR)
			{
				this.setBlockState(worldIn, Blocks.STONE_STAIRS.getStateFromMeta(3), 2, 0, -1, p_74875_3_);
			}
			
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 1, 1, 3, 3, 3, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			
			for(int i = 0; i < 5; ++i)
			{
				for(int j = 0; j < 5; ++j)
				{
					this.clearCurrentPositionBlocksUpwards(worldIn, j, 6, i, p_74875_3_);
					this.replaceAirAndLiquidDownwards(worldIn, Blocks.COBBLESTONE.getDefaultState(), j, -1, i, p_74875_3_);
				}
			}
			
			this.spawnVillagers(worldIn, p_74875_3_, 1, 1, 2, 1);
			return true;
		}
	}
	
	public static class Path extends StructureAbandonedVillagePieces.Road
	{
		private int averageGroundLevel;
		private static final String __OBFID = "CL_00000528";
		
		public Path()
		{
		}
		
		public Path(StructureAbandonedVillagePieces.Start p_i45562_1_, int p_i45562_2_, Random p_i45562_3_, StructureBoundingBox p_i45562_4_, EnumFacing p_i45562_5_)
		{
			super(p_i45562_1_, p_i45562_2_);
			this.setCoordBaseMode(p_i45562_5_);
			this.boundingBox = p_i45562_4_;
			this.averageGroundLevel = Math.max(p_i45562_4_.getXSize(), p_i45562_4_.getZSize());
		}
		
		/**
		 * (abstract) Helper method to write subclass data to NBT
		 */
		protected void writeStructureToNBT(NBTTagCompound p_143012_1_)
		{
			super.writeStructureToNBT(p_143012_1_);
			p_143012_1_.setInteger("Length", this.averageGroundLevel);
		}
		
		/**
		 * (abstract) Helper method to read subclass data from NBT
		 */
		protected void readStructureFromNBT(NBTTagCompound p_143011_1_, TemplateManager man)
		{
			super.readStructureFromNBT(p_143011_1_, man);
			this.averageGroundLevel = p_143011_1_.getInteger("Length");
		}
		
		/**
		 * Initiates construction of the Structure Component picked, at the current Location of StructGen
		 */
		public void buildComponent(StructureComponent p_74861_1_, List p_74861_2_, Random p_74861_3_)
		{
			boolean flag = false;
			int i;
			StructureComponent structurecomponent1;
			
			for(i = p_74861_3_.nextInt(5); i < this.averageGroundLevel - 8; i += 2 + p_74861_3_.nextInt(5))
			{
				structurecomponent1 = this.getNextComponentNN((StructureAbandonedVillagePieces.Start)p_74861_1_, p_74861_2_, p_74861_3_, 0, i);
				
				if(structurecomponent1 != null)
				{
					i += Math.max(structurecomponent1.getBoundingBox().getXSize(), structurecomponent1.getBoundingBox().getZSize());
					flag = true;
				}
			}
			
			for(i = p_74861_3_.nextInt(5); i < this.averageGroundLevel - 8; i += 2 + p_74861_3_.nextInt(5))
			{
				structurecomponent1 = this.getNextComponentPP((StructureAbandonedVillagePieces.Start)p_74861_1_, p_74861_2_, p_74861_3_, 0, i);
				
				if(structurecomponent1 != null)
				{
					i += Math.max(structurecomponent1.getBoundingBox().getXSize(), structurecomponent1.getBoundingBox().getZSize());
					flag = true;
				}
			}
			
			if(flag && p_74861_3_.nextInt(3) > 0 && this.getCoordBaseMode() != null)
			{
				switch(StructureAbandonedVillagePieces.SwitchEnumFacing.field_176064_a[this.getCoordBaseMode().ordinal()])
				{
					case 1:
						StructureAbandonedVillagePieces.func_176069_e((StructureAbandonedVillagePieces.Start)p_74861_1_, p_74861_2_, p_74861_3_, this.boundingBox.minX - 1, this.boundingBox.minY, this.boundingBox.minZ, EnumFacing.WEST, this.getComponentType());
						break;
					case 2:
						StructureAbandonedVillagePieces.func_176069_e((StructureAbandonedVillagePieces.Start)p_74861_1_, p_74861_2_, p_74861_3_, this.boundingBox.minX - 1, this.boundingBox.minY, this.boundingBox.maxZ - 2, EnumFacing.WEST, this.getComponentType());
						break;
					case 3:
						StructureAbandonedVillagePieces.func_176069_e((StructureAbandonedVillagePieces.Start)p_74861_1_, p_74861_2_, p_74861_3_, this.boundingBox.minX, this.boundingBox.minY, this.boundingBox.minZ - 1, EnumFacing.NORTH, this.getComponentType());
						break;
					case 4:
						StructureAbandonedVillagePieces.func_176069_e((StructureAbandonedVillagePieces.Start)p_74861_1_, p_74861_2_, p_74861_3_, this.boundingBox.maxX - 2, this.boundingBox.minY, this.boundingBox.minZ - 1, EnumFacing.NORTH, this.getComponentType());
				}
			}
			
			if(flag && p_74861_3_.nextInt(3) > 0 && this.getCoordBaseMode() != null)
			{
				switch(StructureAbandonedVillagePieces.SwitchEnumFacing.field_176064_a[this.getCoordBaseMode().ordinal()])
				{
					case 1:
						StructureAbandonedVillagePieces.func_176069_e((StructureAbandonedVillagePieces.Start)p_74861_1_, p_74861_2_, p_74861_3_, this.boundingBox.maxX + 1, this.boundingBox.minY, this.boundingBox.minZ, EnumFacing.EAST, this.getComponentType());
						break;
					case 2:
						StructureAbandonedVillagePieces.func_176069_e((StructureAbandonedVillagePieces.Start)p_74861_1_, p_74861_2_, p_74861_3_, this.boundingBox.maxX + 1, this.boundingBox.minY, this.boundingBox.maxZ - 2, EnumFacing.EAST, this.getComponentType());
						break;
					case 3:
						StructureAbandonedVillagePieces.func_176069_e((StructureAbandonedVillagePieces.Start)p_74861_1_, p_74861_2_, p_74861_3_, this.boundingBox.minX, this.boundingBox.minY, this.boundingBox.maxZ + 1, EnumFacing.SOUTH, this.getComponentType());
						break;
					case 4:
						StructureAbandonedVillagePieces.func_176069_e((StructureAbandonedVillagePieces.Start)p_74861_1_, p_74861_2_, p_74861_3_, this.boundingBox.maxX - 2, this.boundingBox.minY, this.boundingBox.maxZ + 1, EnumFacing.SOUTH, this.getComponentType());
				}
			}
		}
		
		public static StructureBoundingBox func_175848_a(StructureAbandonedVillagePieces.Start p_175848_0_, List p_175848_1_, Random p_175848_2_, int p_175848_3_, int p_175848_4_, int p_175848_5_, EnumFacing p_175848_6_)
		{
			for(int l = 7 * MathHelper.getInt(p_175848_2_, 3, 5); l >= 7; l -= 7)
			{
				StructureBoundingBox structureboundingbox = StructureBoundingBox.getComponentToAddBoundingBox(p_175848_3_, p_175848_4_, p_175848_5_, 0, 0, 0, 3, 3, l, p_175848_6_);
				
				if(StructureComponent.findIntersecting(p_175848_1_, structureboundingbox) == null)
				{
					return structureboundingbox;
				}
			}
			
			return null;
		}
		
		/**
		 * second Part of Structure generating, this for example places Spiderwebs, Mob Spawners, it closes
		 * Mineshafts at the end, it adds Fences...
		 */
		public boolean addComponentParts(World worldIn, Random p_74875_2_, StructureBoundingBox p_74875_3_)
		{
			IBlockState iblockstate = this.func_175847_a(Blocks.GRAVEL.getDefaultState());
			IBlockState iblockstate1 = this.func_175847_a(Blocks.COBBLESTONE.getDefaultState());
			
			for(int i = this.boundingBox.minX; i <= this.boundingBox.maxX; ++i)
			{
				for(int j = this.boundingBox.minZ; j <= this.boundingBox.maxZ; ++j)
				{
					BlockPos blockpos = new BlockPos(i, 64, j);
					
					if(p_74875_3_.isVecInside(blockpos))
					{
						blockpos = worldIn.getTopSolidOrLiquidBlock(blockpos).down();
						worldIn.setBlockState(blockpos, iblockstate, 2);
						worldIn.setBlockState(blockpos.down(), iblockstate1, 2);
					}
				}
			}
			
			return true;
		}
	}
	
	public static class PieceWeight
	{
		/**
		 * The Class object for the represantation of this village piece.
		 */
		public Class villagePieceClass;
		public final int villagePieceWeight;
		public int villagePiecesSpawned;
		public int villagePiecesLimit;
		private static final String __OBFID = "CL_00000521";
		
		public PieceWeight(Class p_i2098_1_, int p_i2098_2_, int p_i2098_3_)
		{
			this.villagePieceClass = p_i2098_1_;
			this.villagePieceWeight = p_i2098_2_;
			this.villagePiecesLimit = p_i2098_3_;
		}
		
		public boolean canSpawnMoreVillagePiecesOfType(int p_75085_1_)
		{
			return this.villagePiecesLimit == 0 || this.villagePiecesSpawned < this.villagePiecesLimit;
		}
		
		public boolean canSpawnMoreVillagePieces()
		{
			return this.villagePiecesLimit == 0 || this.villagePiecesSpawned < this.villagePiecesLimit;
		}
	}
	
	public abstract static class Road extends StructureAbandonedVillagePieces.Village
	{
		private static final String __OBFID = "CL_00000532";
		
		public Road()
		{
		}
		
		protected Road(StructureAbandonedVillagePieces.Start p_i2108_1_, int p_i2108_2_)
		{
			super(p_i2108_1_, p_i2108_2_);
		}
	}
	
	public static class Start extends StructureAbandonedVillagePieces.Well
	{
		public BiomeProvider worldChunkMngr;
		/**
		 * Boolean that determines if the village is in a desert or not.
		 */
		public boolean inDesert;
		/**
		 * World terrain type, 0 for normal, 1 for flap map
		 */
		public int terrainType;
		public StructureAbandonedVillagePieces.PieceWeight structVillagePieceWeight;
		/**
		 * Contains List of all spawnable Structure Piece Weights. If no more Pieces of a type can be spawned, they
		 * are removed from this list
		 */
		public List structureVillageWeightedPieceList;
		public List field_74932_i = Lists.newArrayList();
		public List field_74930_j = Lists.newArrayList();
		private static final String __OBFID = "CL_00000527";
		public Biome biome;
		
		public Start()
		{
		}
		
		public Start(BiomeProvider p_i2104_1_, int p_i2104_2_, Random p_i2104_3_, int p_i2104_4_, int p_i2104_5_, List p_i2104_6_, int p_i2104_7_)
		{
			super(null, 0, p_i2104_3_, p_i2104_4_, p_i2104_5_);
			this.worldChunkMngr = p_i2104_1_;
			this.structureVillageWeightedPieceList = p_i2104_6_;
			this.terrainType = p_i2104_7_;
			Biome biome = p_i2104_1_.getBiome(new BlockPos(p_i2104_4_, 0, p_i2104_5_), Biomes.DEFAULT);
			this.inDesert = biome == Biomes.DESERT || biome == Biomes.DESERT_HILLS;
			this.biome = biome;
			this.func_175846_a(this.inDesert);
		}
		
		public BiomeProvider getBiomeProvider()
		{
			return this.worldChunkMngr;
		}
	}
	
	static final class SwitchEnumFacing
	{
		static final int[] field_176064_a = new int[EnumFacing.values().length];
		private static final String __OBFID = "CL_00001968";
		
		static
		{
			try
			{
				field_176064_a[EnumFacing.NORTH.ordinal()] = 1;
			}
			catch(NoSuchFieldError var4)
			{
			}
			
			try
			{
				field_176064_a[EnumFacing.SOUTH.ordinal()] = 2;
			}
			catch(NoSuchFieldError var3)
			{
			}
			
			try
			{
				field_176064_a[EnumFacing.WEST.ordinal()] = 3;
			}
			catch(NoSuchFieldError var2)
			{
			}
			
			try
			{
				field_176064_a[EnumFacing.EAST.ordinal()] = 4;
			}
			catch(NoSuchFieldError var1)
			{
			}
		}
	}
	
	public static class Torch extends StructureAbandonedVillagePieces.Village
	{
		private static final String __OBFID = "CL_00000520";
		
		public Torch()
		{
		}
		
		public Torch(StructureAbandonedVillagePieces.Start p_i45568_1_, int p_i45568_2_, Random p_i45568_3_, StructureBoundingBox p_i45568_4_, EnumFacing p_i45568_5_)
		{
			super(p_i45568_1_, p_i45568_2_);
			this.setCoordBaseMode(p_i45568_5_);
			this.boundingBox = p_i45568_4_;
		}
		
		public static StructureBoundingBox func_175856_a(StructureAbandonedVillagePieces.Start p_175856_0_, List p_175856_1_, Random p_175856_2_, int p_175856_3_, int p_175856_4_, int p_175856_5_, EnumFacing p_175856_6_)
		{
			StructureBoundingBox structureboundingbox = StructureBoundingBox.getComponentToAddBoundingBox(p_175856_3_, p_175856_4_, p_175856_5_, 0, 0, 0, 3, 4, 2, p_175856_6_);
			return StructureComponent.findIntersecting(p_175856_1_, structureboundingbox) != null ? null : structureboundingbox;
		}
		
		/**
		 * second Part of Structure generating, this for example places Spiderwebs, Mob Spawners, it closes
		 * Mineshafts at the end, it adds Fences...
		 */
		public boolean addComponentParts(World worldIn, Random p_74875_2_, StructureBoundingBox p_74875_3_)
		{
			if(this.field_143015_k < 0)
			{
				this.field_143015_k = this.getAverageGroundLevel(worldIn, p_74875_3_);
				
				if(this.field_143015_k < 0)
				{
					return true;
				}
				
				this.boundingBox.offset(0, this.field_143015_k - this.boundingBox.maxY + 4 - 1, 0);
			}
			
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 0, 0, 2, 3, 1, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 1, 0, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 1, 1, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 1, 2, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.WOOL.getStateFromMeta(EnumDyeColor.WHITE.getDyeDamage()), 1, 3, 0, p_74875_3_);
			boolean flag = this.getCoordBaseMode() == EnumFacing.EAST || this.getCoordBaseMode() == EnumFacing.NORTH;
			this.setBlockState(worldIn, Blocks.TORCH.getDefaultState().withProperty(BlockTorch.FACING, this.getCoordBaseMode().rotateY()), flag ? 2 : 0, 3, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.TORCH.getDefaultState().withProperty(BlockTorch.FACING, this.getCoordBaseMode()), 1, 3, 1, p_74875_3_);
			this.setBlockState(worldIn, Blocks.TORCH.getDefaultState().withProperty(BlockTorch.FACING, this.getCoordBaseMode().rotateYCCW()), flag ? 0 : 2, 3, 0, p_74875_3_);
			this.setBlockState(worldIn, Blocks.TORCH.getDefaultState().withProperty(BlockTorch.FACING, this.getCoordBaseMode().getOpposite()), 1, 3, -1, p_74875_3_);
			return true;
		}
	}
	
	public abstract static class Village extends StructureComponent
	{
		protected int field_143015_k = -1;
		/**
		 * The number of villagers that have been spawned in this component.
		 */
		private int villagersSpawned;
		private boolean field_143014_b;
		private static final String __OBFID = "CL_00000531";
		private StructureAbandonedVillagePieces.Start startPiece;
		
		public Village()
		{
		}
		
		protected Village(StructureAbandonedVillagePieces.Start p_i2107_1_, int p_i2107_2_)
		{
			super(p_i2107_2_);
			
			if(p_i2107_1_ != null)
			{
				this.field_143014_b = p_i2107_1_.inDesert;
				startPiece = p_i2107_1_;
			}
		}
		
		/**
		 * (abstract) Helper method to write subclass data to NBT
		 */
		@Override
		protected void writeStructureToNBT(NBTTagCompound p_143012_1_)
		{
			p_143012_1_.setInteger("HPos", this.field_143015_k);
			p_143012_1_.setInteger("VCount", this.villagersSpawned);
			p_143012_1_.setBoolean("Desert", this.field_143014_b);
		}
		
		/**
		 * (abstract) Helper method to read subclass data from NBT
		 */
		@Override
		protected void readStructureFromNBT(NBTTagCompound p_143011_1_, TemplateManager p_143011_2_)
		{
			this.field_143015_k = p_143011_1_.getInteger("HPos");
			this.villagersSpawned = p_143011_1_.getInteger("VCount");
			this.field_143014_b = p_143011_1_.getBoolean("Desert");
		}
		
		/**
		 * Gets the next village component, with the bounding box shifted -1 in the X and Z direction.
		 */
		protected StructureComponent getNextComponentNN(StructureAbandonedVillagePieces.Start p_74891_1_, List p_74891_2_, Random p_74891_3_, int p_74891_4_, int p_74891_5_)
		{
			if(this.getCoordBaseMode() != null)
			{
				switch(StructureAbandonedVillagePieces.SwitchEnumFacing.field_176064_a[this.getCoordBaseMode().ordinal()])
				{
					case 1:
						return StructureAbandonedVillagePieces.func_176066_d(p_74891_1_, p_74891_2_, p_74891_3_, this.boundingBox.minX - 1, this.boundingBox.minY + p_74891_4_, this.boundingBox.minZ + p_74891_5_, EnumFacing.WEST, this.getComponentType());
					case 2:
						return StructureAbandonedVillagePieces.func_176066_d(p_74891_1_, p_74891_2_, p_74891_3_, this.boundingBox.minX - 1, this.boundingBox.minY + p_74891_4_, this.boundingBox.minZ + p_74891_5_, EnumFacing.WEST, this.getComponentType());
					case 3:
						return StructureAbandonedVillagePieces.func_176066_d(p_74891_1_, p_74891_2_, p_74891_3_, this.boundingBox.minX + p_74891_5_, this.boundingBox.minY + p_74891_4_, this.boundingBox.minZ - 1, EnumFacing.NORTH, this.getComponentType());
					case 4:
						return StructureAbandonedVillagePieces.func_176066_d(p_74891_1_, p_74891_2_, p_74891_3_, this.boundingBox.minX + p_74891_5_, this.boundingBox.minY + p_74891_4_, this.boundingBox.minZ - 1, EnumFacing.NORTH, this.getComponentType());
				}
			}
			
			return null;
		}
		
		/**
		 * Gets the next village component, with the bounding box shifted +1 in the X and Z direction.
		 */
		protected StructureComponent getNextComponentPP(StructureAbandonedVillagePieces.Start p_74894_1_, List p_74894_2_, Random p_74894_3_, int p_74894_4_, int p_74894_5_)
		{
			if(this.getCoordBaseMode() != null)
			{
				switch(StructureAbandonedVillagePieces.SwitchEnumFacing.field_176064_a[this.getCoordBaseMode().ordinal()])
				{
					case 1:
						return StructureAbandonedVillagePieces.func_176066_d(p_74894_1_, p_74894_2_, p_74894_3_, this.boundingBox.maxX + 1, this.boundingBox.minY + p_74894_4_, this.boundingBox.minZ + p_74894_5_, EnumFacing.EAST, this.getComponentType());
					case 2:
						return StructureAbandonedVillagePieces.func_176066_d(p_74894_1_, p_74894_2_, p_74894_3_, this.boundingBox.maxX + 1, this.boundingBox.minY + p_74894_4_, this.boundingBox.minZ + p_74894_5_, EnumFacing.EAST, this.getComponentType());
					case 3:
						return StructureAbandonedVillagePieces.func_176066_d(p_74894_1_, p_74894_2_, p_74894_3_, this.boundingBox.minX + p_74894_5_, this.boundingBox.minY + p_74894_4_, this.boundingBox.maxZ + 1, EnumFacing.SOUTH, this.getComponentType());
					case 4:
						return StructureAbandonedVillagePieces.func_176066_d(p_74894_1_, p_74894_2_, p_74894_3_, this.boundingBox.minX + p_74894_5_, this.boundingBox.minY + p_74894_4_, this.boundingBox.maxZ + 1, EnumFacing.SOUTH, this.getComponentType());
				}
			}
			
			return null;
		}
		
		/**
		 * Discover the y coordinate that will serve as the ground level of the supplied BoundingBox. (A median of
		 * all the levels in the BB's horizontal rectangle).
		 */
		protected int getAverageGroundLevel(World worldIn, StructureBoundingBox p_74889_2_)
		{
			int i = 0;
			int j = 0;
			
			for(int k = this.boundingBox.minZ; k <= this.boundingBox.maxZ; ++k)
			{
				for(int l = this.boundingBox.minX; l <= this.boundingBox.maxX; ++l)
				{
					BlockPos blockpos = new BlockPos(l, 64, k);
					
					if(p_74889_2_.isVecInside(blockpos))
					{
						i += Math.max(worldIn.getTopSolidOrLiquidBlock(blockpos).getY(), worldIn.provider.getAverageGroundLevel());
						++j;
					}
				}
			}
			
			if(j == 0)
			{
				return -1;
			}
			else
			{
				return i / j;
			}
		}
		
		protected static boolean canVillageGoDeeper(StructureBoundingBox p_74895_0_)
		{
			return p_74895_0_ != null && p_74895_0_.minY > 10;
		}
		
		/**
		 * Spawns a number of villagers in this component. Parameters: world, component bounding box, x offset, y
		 * offset, z offset, number of villagers
		 */
		protected void spawnVillagers(World worldIn, StructureBoundingBox p_74893_2_, int p_74893_3_, int p_74893_4_, int p_74893_5_, int p_74893_6_)
		{
		
		}
		
		protected int func_180779_c(int p_180779_1_, int p_180779_2_)
		{
			return p_180779_2_;
		}
		
		protected IBlockState func_175847_a(IBlockState p_175847_1_)
		{
			BiomeEvent.GetVillageBlockID event = new BiomeEvent.GetVillageBlockID(startPiece == null ? null : startPiece.biome, p_175847_1_);
			MinecraftForge.TERRAIN_GEN_BUS.post(event);
			if(event.getResult() == Result.DENY) return event.getReplacement();
			if(this.field_143014_b)
			{
				if(p_175847_1_.getBlock() == Blocks.LOG || p_175847_1_.getBlock() == Blocks.LOG2)
				{
					return Blocks.SANDSTONE.getDefaultState();
				}
				
				if(p_175847_1_.getBlock() == Blocks.COBBLESTONE)
				{
					return Blocks.SANDSTONE.getStateFromMeta(BlockSandStone.EnumType.DEFAULT.getMetadata());
				}
				
				if(p_175847_1_.getBlock() == Blocks.PLANKS)
				{
					return Blocks.SANDSTONE.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata());
				}
				
				if(p_175847_1_.getBlock() == Blocks.OAK_STAIRS)
				{
					return Blocks.SANDSTONE_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, p_175847_1_.getValue(BlockStairs.FACING));
				}
				
				if(p_175847_1_.getBlock() == Blocks.STONE_STAIRS)
				{
					return Blocks.SANDSTONE_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, p_175847_1_.getValue(BlockStairs.FACING));
				}
				
				if(p_175847_1_.getBlock() == Blocks.GRAVEL)
				{
					return Blocks.SANDSTONE.getDefaultState();
				}
			}
			
			return p_175847_1_;
		}
		
		protected void setBlockState(World worldIn, IBlockState p_175811_2_, int p_175811_3_, int p_175811_4_, int p_175811_5_, StructureBoundingBox p_175811_6_)
		{
			IBlockState iblockstate1 = this.func_175847_a(p_175811_2_);
			super.setBlockState(worldIn, iblockstate1, p_175811_3_, p_175811_4_, p_175811_5_, p_175811_6_);
		}
		
		protected void fillWithBlocks(World worldIn, StructureBoundingBox box, int minX, int minY, int minZ, int maxX, int maxY, int maxZ, IBlockState outerBlock, IBlockState innerBlock, boolean doNotReplaceAir)
		{
			IBlockState outerBlock2 = this.func_175847_a(outerBlock);
			IBlockState innerBlock2 = this.func_175847_a(innerBlock);
			super.fillWithBlocks(worldIn, box, minX, minY, minZ, maxX, maxY, maxZ, outerBlock2, innerBlock2, doNotReplaceAir);
		}
		
		protected void replaceAirAndLiquidDownwards(World worldIn, IBlockState p_175808_2_, int p_175808_3_, int p_175808_4_, int p_175808_5_, StructureBoundingBox p_175808_6_)
		{
			IBlockState iblockstate1 = this.func_175847_a(p_175808_2_);
			super.replaceAirAndLiquidDownwards(worldIn, iblockstate1, p_175808_3_, p_175808_4_, p_175808_5_, p_175808_6_);
		}
		
		protected void func_175846_a(boolean p_175846_1_)
		{
			this.field_143014_b = p_175846_1_;
		}
		
		protected void destroyBuilding(World world, int x, int z, int blocksToDestroy, StructureBoundingBox box)
		{
			BlockPos blockpos = new BlockPos(this.getXWithOffset(z, x), this.boundingBox.maxY, this.getZWithOffset(z, x));
			
			for(int i = 0; i < blocksToDestroy; i++)
			{
				world.setBlockState(blockpos, Blocks.AIR.getDefaultState(), 2);
				blockpos = blockpos.down();
			}
		}
		
		protected void destroyBuilding(World world, int[][] blocksToDestroy, StructureBoundingBox box)
		{
			for(int i = 0; i < blocksToDestroy.length; i++)
				for(int j = 0; j < blocksToDestroy[i].length; j++)
					destroyBuilding(world, i, j, blocksToDestroy[i][j], box);
		}
		
	}
	
	public static class Well extends StructureAbandonedVillagePieces.Village
	{
		private static final String __OBFID = "CL_00000533";
		
		public Well()
		{
		}
		
		public Well(StructureAbandonedVillagePieces.Start p_i2109_1_, int p_i2109_2_, Random p_i2109_3_, int p_i2109_4_, int p_i2109_5_)
		{
			super(p_i2109_1_, p_i2109_2_);
			this.setCoordBaseMode(EnumFacing.Plane.HORIZONTAL.random(p_i2109_3_));
			
			switch(StructureAbandonedVillagePieces.SwitchEnumFacing.field_176064_a[this.getCoordBaseMode().ordinal()])
			{
				case 1:
				case 2:
					this.boundingBox = new StructureBoundingBox(p_i2109_4_, 64, p_i2109_5_, p_i2109_4_ + 6 - 1, 78, p_i2109_5_ + 6 - 1);
					break;
				default:
					this.boundingBox = new StructureBoundingBox(p_i2109_4_, 64, p_i2109_5_, p_i2109_4_ + 6 - 1, 78, p_i2109_5_ + 6 - 1);
			}
		}
		
		/**
		 * Initiates construction of the Structure Component picked, at the current Location of StructGen
		 */
		public void buildComponent(StructureComponent p_74861_1_, List p_74861_2_, Random p_74861_3_)
		{
			StructureAbandonedVillagePieces.func_176069_e((StructureAbandonedVillagePieces.Start)p_74861_1_, p_74861_2_, p_74861_3_, this.boundingBox.minX - 1, this.boundingBox.maxY - 4, this.boundingBox.minZ + 1, EnumFacing.WEST, this.getComponentType());
			StructureAbandonedVillagePieces.func_176069_e((StructureAbandonedVillagePieces.Start)p_74861_1_, p_74861_2_, p_74861_3_, this.boundingBox.maxX + 1, this.boundingBox.maxY - 4, this.boundingBox.minZ + 1, EnumFacing.EAST, this.getComponentType());
			StructureAbandonedVillagePieces.func_176069_e((StructureAbandonedVillagePieces.Start)p_74861_1_, p_74861_2_, p_74861_3_, this.boundingBox.minX + 1, this.boundingBox.maxY - 4, this.boundingBox.minZ - 1, EnumFacing.NORTH, this.getComponentType());
			StructureAbandonedVillagePieces.func_176069_e((StructureAbandonedVillagePieces.Start)p_74861_1_, p_74861_2_, p_74861_3_, this.boundingBox.minX + 1, this.boundingBox.maxY - 4, this.boundingBox.maxZ + 1, EnumFacing.SOUTH, this.getComponentType());
		}
		
		/**
		 * second Part of Structure generating, this for example places Spiderwebs, Mob Spawners, it closes
		 * Mineshafts at the end, it adds Fences...
		 */
		public boolean addComponentParts(World worldIn, Random p_74875_2_, StructureBoundingBox p_74875_3_)
		{
			if(this.field_143015_k < 0)
			{
				this.field_143015_k = this.getAverageGroundLevel(worldIn, p_74875_3_);
				
				if(this.field_143015_k < 0)
				{
					return true;
				}
				
				this.boundingBox.offset(0, this.field_143015_k - this.boundingBox.maxY + 3, 0);
			}
			
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 0, 1, 4, 12, 4, Blocks.COBBLESTONE.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			this.setBlockState(worldIn, Blocks.FLOWING_WATER.getDefaultState(), 2, 1, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 2, 12, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 3, 12, 2, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 2, 12, 3, p_74875_3_);
			this.setBlockState(worldIn, Blocks.AIR.getDefaultState(), 3, 12, 3, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 1, 13, 1, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 4, 13, 1, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 4, 14, 1, p_74875_3_);
			this.setBlockState(worldIn, Blocks.OAK_FENCE.getDefaultState(), 4, 13, 4, p_74875_3_);
			
			for(int i = 0; i <= 5; ++i)
			{
				for(int j = 0; j <= 5; ++j)
				{
					if(j == 0 || j == 5 || i == 0 || i == 5)
					{
						this.setBlockState(worldIn, Blocks.GRAVEL.getDefaultState(), j, 11, i, p_74875_3_);
						this.clearCurrentPositionBlocksUpwards(worldIn, j, 12, i, p_74875_3_);
					}
				}
			}
			
			return true;
		}
	}
	
	public static class WoodHut extends StructureAbandonedVillagePieces.Village
	{
		private boolean isTallHouse;
		private int tablePosition;
		private static final String __OBFID = "CL_00000524";
		
		public WoodHut()
		{
		}
		
		public WoodHut(StructureAbandonedVillagePieces.Start p_i45565_1_, int p_i45565_2_, Random p_i45565_3_, StructureBoundingBox p_i45565_4_, EnumFacing p_i45565_5_)
		{
			super(p_i45565_1_, p_i45565_2_);
			this.setCoordBaseMode(p_i45565_5_);
			this.boundingBox = p_i45565_4_;
			this.isTallHouse = p_i45565_3_.nextBoolean();
			this.tablePosition = p_i45565_3_.nextInt(3);
		}
		
		/**
		 * (abstract) Helper method to write subclass data to NBT
		 */
		@Override
		protected void writeStructureToNBT(NBTTagCompound p_143012_1_)
		{
			super.writeStructureToNBT(p_143012_1_);
			p_143012_1_.setInteger("T", this.tablePosition);
			p_143012_1_.setBoolean("C", this.isTallHouse);
		}
		
		/**
		 * (abstract) Helper method to read subclass data from NBT
		 */
		@Override
		protected void readStructureFromNBT(NBTTagCompound p_143011_1_, TemplateManager man)
		{
			super.readStructureFromNBT(p_143011_1_, man);
			this.tablePosition = p_143011_1_.getInteger("T");
			this.isTallHouse = p_143011_1_.getBoolean("C");
		}
		
		public static StructureAbandonedVillagePieces.WoodHut func_175853_a(StructureAbandonedVillagePieces.Start p_175853_0_, List p_175853_1_, Random p_175853_2_, int p_175853_3_, int p_175853_4_, int p_175853_5_, EnumFacing p_175853_6_, int p_175853_7_)
		{
			StructureBoundingBox structureboundingbox = StructureBoundingBox.getComponentToAddBoundingBox(p_175853_3_, p_175853_4_, p_175853_5_, 0, 0, 0, 4, 6, 5, p_175853_6_);
			return canVillageGoDeeper(structureboundingbox) && StructureComponent.findIntersecting(p_175853_1_, structureboundingbox) == null ? new StructureAbandonedVillagePieces.WoodHut(p_175853_0_, p_175853_7_, p_175853_2_, structureboundingbox, p_175853_6_) : null;
		}
		
		/**
		 * second Part of Structure generating, this for example places Spiderwebs, Mob Spawners, it closes
		 * Mineshafts at the end, it adds Fences...
		 */
		public boolean addComponentParts(World worldIn, Random p_74875_2_, StructureBoundingBox p_74875_3_)
		{
			if(this.field_143015_k < 0)
			{
				this.field_143015_k = this.getAverageGroundLevel(worldIn, p_74875_3_);
				
				if(this.field_143015_k < 0)
				{
					return true;
				}
				
				this.boundingBox.offset(0, this.field_143015_k - this.boundingBox.maxY + 6 - 1, 0);
			}
			
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 1, 1, 3, 5, 4, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 0, 0, 0, 3, 0, 4, Blocks.COBBLESTONE.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), false);
			this.fillWithBlocks(worldIn, p_74875_3_, 1, 0, 1, 2, 0, 3, Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState(), false);
			this.setBlockState(worldIn, Blocks.LOG.getDefaultState(), 1, 1, 0, p_74875_3_);
			
			for(int i = 0; i < 5; ++i)
			{
				for(int j = 0; j < 4; ++j)
				{
					this.clearCurrentPositionBlocksUpwards(worldIn, j, 6, i, p_74875_3_);
					this.replaceAirAndLiquidDownwards(worldIn, Blocks.COBBLESTONE.getDefaultState(), j, -1, i, p_74875_3_);
				}
			}
			this.spawnVillagers(worldIn, p_74875_3_, 1, 1, 2, 1);
			return true;
		}
	}
}
