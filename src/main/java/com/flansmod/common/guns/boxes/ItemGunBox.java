package com.flansmod.common.guns.boxes;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemGunBox extends ItemBlock {
	
	public static final String tagTypeName = "type";

	public ItemGunBox(Block b)
	{
		super(b);
		setHasSubtypes(true);
	}
	
	@Override
    public String getUnlocalizedName(ItemStack stack)
    {
		GunBoxType type = ((BlockGunBox)((ItemGunBox)stack.getItem()).field_150939_a).type;
		if(type == null)
			return "";
    	return type.shortName;
    }
    
    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
	@Override
    public void getSubItems(Item item, CreativeTabs par2CreativeTabs, List par3List)
    {
    	//for(GunBoxType type : GunBoxType.gunBoxMap.values())
    		par3List.add(new ItemStack(item, 1, 0));
    }
	
	/*@Override
    public boolean placeBlockAt(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int metadata)
    {
		GunBoxType type = GunBoxType.getBox(stack.getItemDamage());
		if(type == null)
			return false;
    	boolean place = super.placeBlockAt(stack, player, world, x, y, z, side, hitX, hitY, hitZ, metadata);
    	
    	if (place)
    	{
    		TileEntityGunBox entity = (TileEntityGunBox) world.getTileEntity(x, y, z);
    		entity.setShortName(type.shortName);
    	}
    	
    	return place;
    }*/
}
