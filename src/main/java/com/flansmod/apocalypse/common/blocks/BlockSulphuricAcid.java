package com.flansmod.apocalypse.common.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;

public class BlockSulphuricAcid extends BlockFluidClassic
{
	public static final DamageSource acidDamage = new DamageSource("sulphuricAcid");
	
	public BlockSulphuricAcid(Fluid fluid, Material material)
	{
		super(fluid, material);
		setCreativeTab(FlansMod.tabFlanParts);
	}
	
	@Override
	public void onEntityCollision(World world, BlockPos pos, IBlockState state, Entity entity)
	{
		entity.attackEntityFrom(acidDamage, 5.0F);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerRenderer()
	{
		ModelLoader.setCustomStateMapper(this, new StateMap.Builder().ignore(LEVEL).build());
	}
}
