package co.uk.flansmods.common;

import java.util.ArrayList;
import java.util.List;

import co.uk.flansmods.client.GuiPlaneCrafting;
import co.uk.flansmods.client.GuiVehicleCrafting;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.ModLoader;
import net.minecraft.src.World;

public class BlockPlaneWorkbench extends Block
{
    public BlockPlaneWorkbench(int i, int j, int k)
    {
        super(i, Material.iron);
        blockIndexInTexture = j;
        sideTexture = k;
        setCreativeTab(CreativeTabs.tabDeco);
    }
    
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
        par3List.add(new ItemStack(par1, 1, 1));
        par3List.add(new ItemStack(par1, 1, 2));
    }
	
	public String getTextureFile()
    {
        return "/spriteSheets/planes.png";
    }

    public int getBlockTextureFromSideAndMetadata(int i, int j)
    {
        if(i == 1)
        {
            return j + 1;
        } else
        {
            return sideTexture;
        }
    }

    @Override
    public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par6, float par7, float par8, float par9)
    {
    	int metadata = world.getBlockMetadata(i, j, k);
    	entityplayer.openGui(FlansMod.instance, metadata, world, i, j, k);
		return true;
    }
    
	private int sideTexture;
}
