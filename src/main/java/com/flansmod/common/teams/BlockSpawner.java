package com.flansmod.common.teams;

import java.util.List;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;

public class BlockSpawner extends BlockContainer 
{
	public static boolean colouredPass = false;
	
	public IIcon[][] icons;
	
	public BlockSpawner(Material material) 
	{
		super(material);
		setCreativeTab(FlansMod.tabFlanTeams);
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
    public IIcon getIcon(int i, int j)
    {
    	if(j > 2)
    		j = 2;
    	return icons[colouredPass ? 1 : 0][j];
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }
    
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public boolean getBlocksMovement(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        return true;
    }
    
    @Override
    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        return par1World.doesBlockHaveSolidTopSurface(par1World, par2, par3 - 1, par4) || BlockFence.func_149825_a(par1World.getBlock(par2, par3 - 1, par4));
    }
    
    @Override
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
        if (!par1World.isRemote)
        {
            if (par1World.getBlockMetadata(par2, par3, par4) != 1)
            {
            }
        }
    }
    
    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess access, int i, int j, int k)
    {
    	setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.03125F, 1.0F);
    }
    
    @Override
    public void setBlockBoundsForItemRender()
    {
        float var1 = 0.5F;
        float var2 = 0.015625F;
        float var3 = 0.5F;
        this.setBlockBounds(0.0F, 0.5F - var2, 0.0F, 1F, 0.5F + var2, 1F);
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
	public int colorMultiplier(IBlockAccess access, int x, int y, int z)
	{
		if(!colouredPass)
			return 0xffffff;
		try
		{
			TileEntitySpawner spawner = (TileEntitySpawner)access.getTileEntity(x, y, z);
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
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float par7, float par8, float par9)
    {
    	if(world.isRemote)
    		return true;
    	/* TODO : Check the generalised code in TeamsManager works
    	if(TeamsManager.getInstance().currentGametype != null)
    		TeamsManager.getInstance().currentGametype.objectClickedByPlayer((TileEntitySpawner)world.getTileEntity(x, y, z), (EntityPlayerMP)player);
    	*/
    	if(MinecraftServer.getServer().getConfigurationManager().func_152596_g(player.getGameProfile()))
    	{
    		TileEntitySpawner spawner = (TileEntitySpawner)world.getTileEntity(x, y, z);
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
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register)
    {
    	icons = new IIcon[2][3];
    	for(int i = 0; i < 2; i++)
    	{
    		icons[i][0] = register.registerIcon("FlansMod:" + "spawner_item_" + (i + 1));
    		icons[i][1] = register.registerIcon("FlansMod:" + "spawner_player_" + (i + 1));
    		icons[i][2] = register.registerIcon("FlansMod:" + "spawner_vehicle_" + (i + 1));
    	}
    }
}
