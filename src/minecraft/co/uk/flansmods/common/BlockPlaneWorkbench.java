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
        setCreativeTab(FlansMod.tabFlanVehicles);
    }
    
    @Override
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
        par3List.add(new ItemStack(par1, 1, 1));
        par3List.add(new ItemStack(par1, 1, 2));
    }

    @Override
    public Icon getBlockTextureFromSideAndMetadata(int i, int j)
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
    	int metadata = world.getBlockMetadata(i, j, k);
    	entityplayer.openGui(FlansMod.instance, metadata, world, i, j, k);
		return true;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void func_94332_a(IconRegister register)
    {
    	top = new Icon[3];
    	top[0] = register.func_94245_a("planeCraftingTableSmall");
    	top[1] = register.func_94245_a("planeCraftingTableLarge");
    	top[2] = register.func_94245_a("vehicleCraftingTable");
    	side = register.func_94245_a("planeCraftingTableSide");
    }
    
	private Icon side;
	private Icon[] top;
}
