package com.flansmod.common;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;

public class BlockItemHolder extends BlockContainer
{
	public ItemHolderType type;
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	
	public BlockItemHolder(ItemHolderType type)
	{
		super(Material.ROCK);
		this.type = type;
		setCreativeTab(FlansMod.tabFlanParts);
		setHardness(2F);
		setResistance(4F);
		setRegistryName(type.shortName);
		setTranslationKey(type.shortName);
		setCreativeTab(FlansMod.tabFlanParts);
		setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		type.block = this;
		//type.item = Item.getItemFromBlock(this);
		this.lightOpacity = 0;
	}
	
	@Override
	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
	{
		return false;
	}
	
	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
	{
		EnumFacing enumfacing = EnumFacing.fromAngle((double)placer.rotationYaw);
		worldIn.setBlockState(pos, state.withProperty(FACING, enumfacing), 2);
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(FACING, EnumFacing.byHorizontalIndex(meta));
	}
	
	@Override
	public int getMetaFromState(IBlockState state)
	{
		byte b0 = 0;
		return b0 | state.getValue(FACING).getHorizontalIndex();
	}
	
	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, FACING);
	}
	
	
	@Override
	public boolean canPlaceBlockAt(World par1World, BlockPos pos)
	{
		return par1World.getBlockState(pos.add(0, -1, 0)).isSideSolid(par1World, pos.add(0, -1, 0), EnumFacing.UP);
	}
	
	protected static final AxisAlignedBB AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return AABB;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public TileEntity createNewTileEntity(World var1, int i)
	{
		return new TileEntityItemHolder(type);
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float par7, float par8, float par9)
	{
		if(world.isRemote)
		{
			FlansMod.playerHandler.getPlayerData(player, Side.CLIENT).shootTimeLeft = FlansMod.playerHandler.getPlayerData(player, Side.CLIENT).shootTimeRight = 10;
			return true;
		}
		
		TileEntityItemHolder holder = (TileEntityItemHolder)world.getTileEntity(pos);
		ItemStack item = player.getHeldItemMainhand();
		
		if(holder.getStackInSlot(0).isEmpty())
		{
			holder.setInventorySlotContents(0, item);
			player.inventory.setInventorySlotContents(player.inventory.currentItem, ItemStack.EMPTY.copy());
		}
		else
		{
			world.spawnEntity(new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), holder.getStackInSlot(0)));
			holder.setInventorySlotContents(0, ItemStack.EMPTY.copy());
			FlansMod.playerHandler.getPlayerData(player, Side.SERVER).shootTimeLeft = FlansMod.playerHandler.getPlayerData(player, Side.SERVER).shootTimeRight = 10;
		}
		
		world.scheduleUpdate(pos, this, 0);
		
		return true;
	}
	
	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state)
	{
		TileEntity tileentity = worldIn.getTileEntity(pos);
		
		if(tileentity instanceof IInventory)
		{
			InventoryHelper.dropInventoryItems(worldIn, pos, (IInventory)tileentity);
			worldIn.updateComparatorOutputLevel(pos, this);
		}
		
		super.breakBlock(worldIn, pos, state);
	}
}
