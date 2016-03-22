package com.flansmod.common.teams;

import java.util.List;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;

public class BlockSpawner extends BlockContainer
{
	public static final PropertyInteger TYPE = PropertyInteger.create("type", 0, 2);
	public static boolean colouredPass = false;
	
	public BlockSpawner(Material material) 
	{
		super(material);
		setCreativeTab(FlansMod.tabFlanTeams);
		setDefaultState(blockState.getBaseState().withProperty(TYPE, Integer.valueOf(0)));
	}

    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, List list)
    {
    	if(tab == FlansMod.tabFlanTeams)
    	{
	        list.add(new ItemStack(item, 1, 0));
	        list.add(new ItemStack(item, 1, 1));
	        list.add(new ItemStack(item, 1, 2));
    	}
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(World par1World, BlockPos pos, IBlockState state)
    {
        return null;
    }
    
    @Override
    public boolean isFullCube()
    {
        return false;
    }
    
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    @Override
    public int getRenderType()
    {
        return 3;
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
    	setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
    }

	@Override
	public int getMobilityFlag()
	{
		return 1;
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int i)
	{
		return new TileEntitySpawner();
	}
	
	@Override
	public int colorMultiplier(IBlockAccess access, BlockPos pos, int renderPass)
	{		
		if(!colouredPass)
			return 0xffffff;
		try
		{
			TileEntitySpawner spawner = (TileEntitySpawner)access.getTileEntity(pos);
            int spawnerTeamID = spawner.getTeamID();
            Team spawnerTeam = FlansModClient.getTeam(spawnerTeamID);
            
            boolean currentMap = FlansModClient.isCurrentMap(spawner.map);
            
            //Use default colours
            if(spawnerTeam == null || !currentMap)
            {
            	switch(spawnerTeamID)
            	{
            	case 0 : return 0x808080;	//No team : light grey
            	case 1 : return 0x404040;	//Spectators : dark grey
            	case 2 : return 0xa17fff;	//Team 1 : purple
            	case 3 : return 0xff7fb6;	//Team 2 : pink
            	}
            }
            
			return spawnerTeam.teamColour;
		}
		catch(Exception e)
		{
			return 0xffffff;
		}
	}
	
    @Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9)
    {
    	if(world.isRemote)
    		return true;
    	/* TODO : Check the generalised code in TeamsManager works
    	if(TeamsManager.getInstance().currentGametype != null)
    		TeamsManager.getInstance().currentGametype.objectClickedByPlayer((TileEntitySpawner)world.getTileEntity(x, y, z), (EntityPlayerMP)player);
    	*/
    	if(MinecraftServer.getServer().getConfigurationManager().canSendCommands(player.getGameProfile()))
    	{
    		TileEntitySpawner spawner = (TileEntitySpawner)world.getTileEntity(pos);
    		ItemStack item = player.getCurrentEquippedItem();
    		if(item == null || item.getItem() == null)
    		{
    			spawner.spawnDelay = (spawner.spawnDelay + 200) % 6000;
    			player.addChatMessage(new ChatComponentText("Set spawn delay to " + spawner.spawnDelay / 20));
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
    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {TYPE});
    }
    
    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(TYPE, Integer.valueOf(meta));
    }
    
    @Override
    public int getMetaFromState(IBlockState state)
    {
        return ((Integer)state.getValue(TYPE)).intValue();
    }
    
    @Override
    public int damageDropped(IBlockState state)
    {
        return ((Integer)state.getValue(TYPE)).intValue();
    }


}
