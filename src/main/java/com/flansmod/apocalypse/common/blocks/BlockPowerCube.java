package com.flansmod.apocalypse.common.blocks;

import com.flansmod.apocalypse.common.FlansModApocalypse;
import com.flansmod.apocalypse.common.entity.EntityTeleporter;
import com.flansmod.common.FlansMod;
import com.flansmod.common.TileEntityItemHolder;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockPowerCube extends Block implements ITileEntityProvider
{
	public BlockPowerCube(Material material) 
	{
		super(material);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) 
	{
		return new TileEntityPowerCube();
	}
		
	public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
	{
	   return false;
	}
		
	@Override
	public boolean isOpaqueCube()
	{
	    return false;
	}
    
	@Override
	public boolean canPlaceBlockAt(World par1World, BlockPos pos)
	{
	    return par1World.doesBlockHaveSolidTopSurface(par1World, pos.add(0, -1, 0));
	}
	
	@Override
    public void onEntityCollidedWithBlock(World par1World, BlockPos pos, Entity par5Entity)
    {
    }
    
    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess access, BlockPos pos)
    {
    	setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1F, 1.0F);
    }
    
    @Override
    public void setBlockBoundsForItemRender()
    {
        float var1 = 0.5F;
        float var2 = 0.5F;
        float var3 = 0.5F;
        this.setBlockBounds(0.0F, 0.5F - var2, 0.0F, 1F, 0.5F + var2, 1F);
    }

	@Override
	public int getMobilityFlag()
	{
		return 1;
	}  
	
	@Override
    public int getRenderType()
    {
        return -1;
    }
	
	@Override
    public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
    {
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				if(world.provider.getDimensionId() == FlansModApocalypse.dimensionID && isPortal(world, pos.add(-3 * i, 0, -3 * j)))
				{
					world.spawnEntity(new EntityTeleporter(world, pos.add(-3 * i, 0, -3 * j)));
				}
			}
		}
    }
	
	private boolean isPortal(World world, BlockPos pos)
	{
		if(world.getBlockState(pos).getBlock() != FlansModApocalypse.blockPowerCube 				|| world.getBlockState(pos.add(3, 0, 0)).getBlock() != FlansModApocalypse.blockPowerCube
		|| world.getBlockState(pos.add(0, 0, 3)).getBlock() != FlansModApocalypse.blockPowerCube 	|| world.getBlockState(pos.add(3, 0, 3)).getBlock() != FlansModApocalypse.blockPowerCube)
			return false;
		for(int i = 0; i < 2; i++)
			for(int j = 0; j < 2; j++)
				if(world.getBlockState(pos.add(i * 3, -1, j * 3)).getBlock() != Blocks.OBSIDIAN || world.getBlockState(pos.add(1 + i, -1, 1 + j)).getBlock() != Blocks.OBSIDIAN)
					return false;
		return true;
	}
}
