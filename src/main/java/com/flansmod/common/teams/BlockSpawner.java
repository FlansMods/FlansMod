package com.flansmod.common.teams;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;

import com.flansmod.common.FlansMod;

public class BlockSpawner extends BlockContainer
{
	protected static final AxisAlignedBB CARPET_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0625D, 1.0D);
	public static final PropertyInteger TYPE = PropertyInteger.create("type", 0, 2);
	public static boolean colouredPass = false;
	
	public BlockSpawner(Material material)
	{
		super(material);
		setCreativeTab(FlansMod.tabFlanTeams);
		setRegistryName("teamsSpawner");
		setDefaultState(blockState.getBaseState().withProperty(TYPE, 0));
	}
	
	@Override
	public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> list)
	{
		if(tab == FlansMod.tabFlanTeams)
		{
			list.add(new ItemStack(this, 1, 0));
			list.add(new ItemStack(this, 1, 1));
			list.add(new ItemStack(this, 1, 2));
		}
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return CARPET_AABB;
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
	public boolean canPlaceBlockAt(World world, BlockPos pos)
	{
		return world.getBlockState(pos.add(0, -1, 0)).isSideSolid(world, pos.add(0, -1, 0), EnumFacing.UP);
	}
	
	@Override
	public TileEntity createNewTileEntity(World var1, int i)
	{
		return new TileEntitySpawner();
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float par7, float par8, float par9)
	{
		if(world.isRemote)
			return true;
    	/* TODO : Check the generalised code in TeamsManager works
    	if(TeamsManager.getInstance().currentGametype != null)
    		TeamsManager.getInstance().currentGametype.objectClickedByPlayer((TileEntitySpawner)world.getTileEntity(x, y, z), (EntityPlayerMP)player);
    	*/
		if(FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().canSendCommands(player.getGameProfile()))
		{
			TileEntitySpawner spawner = (TileEntitySpawner)world.getTileEntity(pos);
			ItemStack item = player.getHeldItemMainhand();
			if(item == null || item.getItem() == null)
			{
				spawner.spawnDelay = (spawner.spawnDelay + 200) % 6000;
				player.sendMessage(new TextComponentString("Set spawn delay to " + spawner.spawnDelay / 20));
			}
			else if(!(item.getItem() instanceof ItemOpStick))
			{
				spawner.stacksToSpawn.add(item.copy());
				for(Entity entity : spawner.itemEntities)
				{
					entity.setDead();
				}
				spawner.currentDelay = 10;
			}
		}
		return true;
	}
	
	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, TYPE);
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(TYPE, meta);
	}
	
	@Override
	public int getMetaFromState(IBlockState state)
	{
		return state.getValue(TYPE);
	}
	
	@Override
	public int damageDropped(IBlockState state)
	{
		return state.getValue(TYPE);
	}
	
	
}
