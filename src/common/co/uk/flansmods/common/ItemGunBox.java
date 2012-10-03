package co.uk.flansmods.common;

import java.util.List;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;

public class ItemGunBox extends ItemBlock {
	
	public static final String tagTypeName = "type";

	public ItemGunBox(int id)
	{
		super(id);
	}
	
    public String getItemNameIS(ItemStack stack)
    {
		NBTTagCompound tag = stack.getTagCompound();
		
		if (tag != null)
		{
			// TODO: full name?
			return GunBoxType.gunBoxMap.get(tag.getString(tagTypeName)).name;
		}
		
		return Block.blocksList[this.getBlockID()].getBlockName();
    }
    
    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
    	for (int i = 0; i < GunBoxType.shortNameList.size(); i++)
    		par3List.add(new ItemStack(par1, 1, i));
    }
    
    public void onCreated(ItemStack stack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	NBTTagCompound tag = new NBTTagCompound();
    	tag.setString(tagTypeName, GunBoxType.shortNameList.get(stack.getItemDamage()));
    	stack.setTagCompound(tag);
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
