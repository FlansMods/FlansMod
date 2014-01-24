package co.uk.flansmods.common;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockPlaneWorkbench extends Block
{
    public BlockPlaneWorkbench(int i, int j, int k)
    {
        super(i, Material.iron);
        setHardness(3F);
        setResistance(6F);
        setCreativeTab(FlansMod.tabFlanDriveables);
    }
    
    @Override
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
        par3List.add(new ItemStack(par1, 1, 1));
        par3List.add(new ItemStack(par1, 1, 2));
    }

    @Override
    public Icon getIcon(int i, int j)
    {
        if(i == 1)
        {
            return top[j];
        } else
        {
            return side;
        }
    }

    @Override
    public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par6, float par7, float par8, float par9)
    {
    	switch(world.getBlockMetadata(i, j, k))
    	{
    	case 0 : if(world.isRemote) entityplayer.openGui(FlansMod.instance, 0, world, i, j, k); break;
    	case 1 : if(!world.isRemote) entityplayer.openGui(FlansMod.instance, 2, world, i, j, k); break; 
    	}    	
		return true;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register)
    {
    	top = new Icon[3];
    	top[0] = register.registerIcon("FlansMod:" + "planeCraftingTableSmall");
    	top[1] = register.registerIcon("FlansMod:" + "planeCraftingTableLarge");
    	top[2] = register.registerIcon("FlansMod:" + "vehicleCraftingTable");
    	side = register.registerIcon("FlansMod:" + "planeCraftingTableSide");
    }
    
    @Override
    public int damageDropped(int par1)
    {
        return par1;
    }
    
	private Icon side;
	private Icon[] top;
}
