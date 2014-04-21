package com.flansmod.common;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockFlansWorkbench extends Block
{
	private IIcon side;
	private IIcon[] top;
	
    public BlockFlansWorkbench(int j, int k)
    {
        super(Material.iron);
        setHardness(3F);
        setResistance(6F);
        setCreativeTab(FlansMod.tabFlanDriveables);
    }
    
    @Override
    public void getSubBlocks(Item item, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(item, 1, 0));
        par3List.add(new ItemStack(item, 1, 1));
        par3List.add(new ItemStack(item, 1, 2));
    }

    @Override
    public IIcon getIcon(int i, int j)
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
    	case 0 : if(world.isRemote) entityplayer.openGui(FlansMod.INSTANCE, 0, world, i, j, k); break;
    	case 1 : if(!world.isRemote) entityplayer.openGui(FlansMod.INSTANCE, 2, world, i, j, k); break; 
    	}    	
		return true;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register)
    {
    	top = new IIcon[3];
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
}
