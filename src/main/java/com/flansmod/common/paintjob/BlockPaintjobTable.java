package com.flansmod.common.paintjob;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.InventoryHelper;
import com.flansmod.common.teams.ItemOpStick;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.TileEntitySpawner;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockPaintjobTable extends BlockContainer
{	
	private IIcon side;
	private IIcon top;
	
	public BlockPaintjobTable() 
	{
		super(Material.rock);
		setHardness(2F);
		setResistance(4F);
	    setBlockName("paintjobTable");
		setCreativeTab(FlansMod.tabFlanGuns);
	}

	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z)
	{
	    return world.doesBlockHaveSolidTopSurface(world, x, y - 1, z);
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int i)
	{
		return new TileEntityPaintjobTable();
	}

    @Override
    public IIcon getIcon(int i, int j)
    {
        if(i == 1)
        {
            return top;
        } else
        {
            return side;
        }
    }
	
    @Override
	public boolean onBlockActivated(World world, int x, int y, int z,  EntityPlayer player, int facing, float par7, float par8, float par9)
    {
    	if(world.isRemote)
    	{
    		FlansMod.playerHandler.getPlayerData(player, Side.CLIENT).shootTimeLeft = FlansMod.playerHandler.getPlayerData(player, Side.CLIENT).shootTimeRight = 10;
    		return true;
    	}

    	TileEntityPaintjobTable table = (TileEntityPaintjobTable)world.getTileEntity(x, y, z);
    	
    	if(!world.isRemote) 
    	{
    		player.openGui(FlansMod.INSTANCE, 13, world, x, y, z);
    	}
		return true;
    }
    
    @Override
    public void breakBlock(World worldIn, int x, int y, int z, Block block, int meta)
    {
        TileEntity tileentity = worldIn.getTileEntity(x, y, z);

        if (tileentity instanceof IInventory)
        {
            InventoryHelper.dropInventoryItems(worldIn, x, y, z, (IInventory)tileentity);
        }

        super.breakBlock(worldIn, x, y, z, block, meta);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register)
    {
    	top = register.registerIcon("FlansMod:" + "paintjobTableTop");
    	side = register.registerIcon("FlansMod:" + "planeCraftingTableSide");
    }
}