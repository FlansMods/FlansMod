package co.uk.flansmods.common.teams;

import java.util.List;

import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.GunBoxType;
import co.uk.flansmods.common.TileEntityGunBox;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockSpawner extends BlockContainer 
{
	public static boolean colouredPass = false;
	
	public Icon[][] icons;
	
	public BlockSpawner(int i, Material material) 
	{
		super(i, material);
		setCreativeTab(FlansMod.tabFlanTeams);
	}

    @Override
    public void getSubBlocks(int i, CreativeTabs tabs, List list)
    {
        list.add(new ItemStack(i, 1, 0));
        list.add(new ItemStack(i, 1, 1));
        list.add(new ItemStack(i, 1, 2));
    }
    
    @Override
    public Icon getIcon(int i, int j)
    {
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
        return par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4) || BlockFence.isIdAFence(par1World.getBlockId(par2, par3 - 1, par4));
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
	public TileEntity createNewTileEntity(World var1)
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
			TileEntitySpawner spawner = (TileEntitySpawner)access.getBlockTileEntity(x, y, z);
			Team team = spawner.getTeam();
			return team.teamColour;
		}
		catch(Exception e)
		{
			return 0xffffff;
		}
	}
	
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float par7, float par8, float par9)
    {
    	if(world.isRemote)
    		return true;
    	if(TeamsManager.getInstance().currentGametype != null)
    		TeamsManager.getInstance().currentGametype.objectClickedByPlayer((TileEntitySpawner)world.getBlockTileEntity(x, y, z), (EntityPlayerMP)player);
    	if(MinecraftServer.getServerConfigurationManager(MinecraftServer.getServer()).areCommandsAllowed(player.username))
    	{
    		TileEntitySpawner spawner = (TileEntitySpawner)world.getBlockTileEntity(x, y, z);
    		ItemStack item = player.getCurrentEquippedItem();
    		if(item == null || item.getItem() == null)
    		{
    			spawner.spawnDelay = (spawner.spawnDelay + 200) % 6000;
    			player.addChatMessage("Set spawn delay to " + spawner.spawnDelay / 20);
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
    public void registerIcons(IconRegister register)
    {
    	icons = new Icon[2][3];
    	for(int i = 0; i < 2; i++)
    	{
    		icons[i][0] = register.registerIcon("FlansMod:" + "spawner_item_" + (i + 1));
    		icons[i][1] = register.registerIcon("FlansMod:" + "spawner_player_" + (i + 1));
    		icons[i][2] = register.registerIcon("FlansMod:" + "spawner_vehicle_" + (i + 1));
    	}
    }
}
