package co.uk.flansmods.common;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemGunBox extends ItemBlock {
	
	public static final String tagTypeName = "type";

	public ItemGunBox(int id)
	{
		super(id);
		setHasSubtypes(true);
	}
	
	@Override
    public String getUnlocalizedName(ItemStack stack)
    {
		GunBoxType type = GunBoxType.getBox(stack.getItemDamage());
		if(type == null)
			return "";
    	return type.shortName;
    }
    
    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
	@Override
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
    	for(GunBoxType type : GunBoxType.gunBoxMap.values())
    		par3List.add(new ItemStack(par1, 1, type.gunBoxID));
    }
	
	@Override
    public boolean placeBlockAt(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int metadata)
    {
		GunBoxType type = GunBoxType.getBox(stack.getItemDamage());
		if(type == null)
			return false;
    	boolean place = super.placeBlockAt(stack, player, world, x, y, z, side, hitX, hitY, hitZ, metadata);
    	
    	if (place)
    	{
    		TileEntityGunBox entity = (TileEntityGunBox) world.getBlockTileEntity(x, y, z);
    		entity.setShortName(type.shortName);
    	}
    	
    	return place;
    }

}
