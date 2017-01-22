package com.flansmod.apocalypse.common.blocks;

import com.flansmod.apocalypse.common.PropertyFloat;
import com.flansmod.common.FlansMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.property.ExtendedBlockState;
import net.minecraftforge.common.property.IExtendedBlockState;
import net.minecraftforge.common.property.IUnlistedProperty;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.IFluidBlock;

public class BlockSulphuricAcid extends BlockFluidClassic
{
	public static final PropertyFloat HEIGHT_NW = new PropertyFloat("height_nw", 0F, 1F), HEIGHT_SW = new PropertyFloat("height_sw", 0F, 1F),
			HEIGHT_SE = new PropertyFloat("height_se", 0F, 1F), HEIGHT_NE = new PropertyFloat("height_ne", 0F, 1F);
	//public static final PropertyFloat FLOW_DIRECTION = new PropertyFloat("flow_direction");
	public static final DamageSource acidDamage = new DamageSource("sulphuricAcid");
	
	public BlockSulphuricAcid(Fluid fluid, Material material)
	{
		super(fluid, material);
		setCreativeTab(FlansMod.tabFlanParts);
	}
	
	@Override
    public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity)
    {
        entity.attackEntityFrom(acidDamage, 5.0F);
    }
	
	@Override
	protected BlockState createBlockState()
	{
		return new ExtendedBlockState(this, new IProperty[] {LEVEL}, new IUnlistedProperty[] {HEIGHT_SW, HEIGHT_NW, HEIGHT_SE, HEIGHT_NE, FLOW_DIRECTION, LEVEL_CORNERS[0], LEVEL_CORNERS[1], LEVEL_CORNERS[2], LEVEL_CORNERS[3]});
	}
	
	@Override
	public IBlockState getExtendedState(IBlockState state, IBlockAccess world, BlockPos pos)
	{
		state = super.getExtendedState(state, world, pos);
		
		float heightNW, heightSW, heightSE, heightNE;
		float flow11 = getFluidHeightForRender(world, pos);
		
		if (flow11 != 1)
		{
			float flow00 = getFluidHeightForRender(world, pos.add(-1, 0, -1));
			float flow01 = getFluidHeightForRender(world, pos.add(-1, 0,  0));
			float flow02 = getFluidHeightForRender(world, pos.add(-1, 0,  1));
			float flow10 = getFluidHeightForRender(world, pos.add( 0, 0, -1));
			float flow12 = getFluidHeightForRender(world, pos.add( 0, 0,  1));
			float flow20 = getFluidHeightForRender(world, pos.add( 1, 0, -1));
			float flow21 = getFluidHeightForRender(world, pos.add( 1, 0,  0));
			float flow22 = getFluidHeightForRender(world, pos.add( 1, 0,  1));
			
			heightNW = getFluidHeightAverage(new float[]{ flow00, flow01, flow10, flow11 });
			heightSW = getFluidHeightAverage(new float[]{ flow01, flow02, flow12, flow11 });
			heightSE = getFluidHeightAverage(new float[]{ flow12, flow21, flow22, flow11 });
			heightNE = getFluidHeightAverage(new float[]{ flow10, flow20, flow21, flow11 });
		}
		else
		{
			heightNW = flow11;
			heightSW = flow11;
			heightSE = flow11;
			heightNE = flow11;
		}
		
		IExtendedBlockState extState = (IExtendedBlockState) state;
		extState = extState.withProperty(HEIGHT_NW, heightNW).withProperty(HEIGHT_SW, heightSW);
		extState = extState.withProperty(HEIGHT_SE, heightSE).withProperty(HEIGHT_NE, heightNE);
		extState = extState.withProperty(FLOW_DIRECTION, (float) BlockFluidBase.getFlowDirection(world, pos));
		
		return extState;
	}
	
	@Override
	public boolean shouldSideBeRendered(IBlockAccess world, BlockPos pos, EnumFacing side)
	{
		if(side == EnumFacing.UP)
			return world.getBlockState(pos).getBlock() != this;
		else return super.shouldSideBeRendered(world, pos, side);
	}
	
	@Override
	public float getFluidHeightForRender(IBlockAccess world, BlockPos pos)
	{
		IBlockState state = world.getBlockState(pos);
		Block verticalOrigin = world.getBlockState(pos.down(this.densityDir)).getBlock();
		if (state.getBlock() == this)
		{
			if (verticalOrigin.getMaterial().isLiquid() || verticalOrigin instanceof IFluidBlock)
			{
				return 1;
			}
			
			if ((Integer) state.getValue(LEVEL) == this.getMaxRenderHeightMeta())
			{
				return 0.875F;
			}
		}
		return !state.getBlock().getMaterial().isSolid() && verticalOrigin == this ? 1 : this.getQuantaPercentage(world, pos) * 0.875F;
	}
	
	@Override
	public float getFluidHeightAverage(float... height)
	{
		float total = 0;
		int count = 0;
		
		float end = 0;
		
		for (int i = 0; i < height.length; i++)
		{
			if (height[i] >= 0.875F && end != 1F)
			{
				end = height[i];
			}
			
			if (height[i] >= 0)
			{
				total += height[i];
				count++;
			}
		}
		
		if (end == 0)
			end = total / count;
		
		return end;
	}
	
	@Override
	public int getRenderType()
	{
		return 3;
	}
	
}