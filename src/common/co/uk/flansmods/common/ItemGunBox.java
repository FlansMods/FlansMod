package co.uk.flansmods.common;

import net.minecraft.src.Block;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;

public class ItemGunBox extends ItemBlock {

	protected ItemGunBox(int id)
	{
		super(id);
	}
	
    public String getItemNameIS(ItemStack stack)
    {
		NBTTagCompound tag = stack.getTagCompound();
		
		if (tag != null)
		{
			// TODO: full name?
			return GunBoxType.gunBoxMap.get(tag.getString("type")).name;
		}
		
		return Block.blocksList[this.getBlockID()].getBlockName();
    }
	
	@Override
    public boolean placeBlockAt(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
    {
    	boolean place = super.placeBlockAt(stack, player, world, x, y, z, side, hitX, hitY, hitZ);
    	
    	if (place)
    	{
    		TileEntityGunBox entity = (TileEntityGunBox) world.getBlockTileEntity(x, y, z);
    		NBTTagCompound tag = stack.getTagCompound();
    		
    		if (tag != null)
    			entity.setShortName(tag.getString("type"));
    	}
    	
    	return place;
    }

}
