package co.uk.flansmods.common;

import co.uk.flansmods.common.driveables.DriveableType;
import co.uk.flansmods.common.guns.GunType;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabFlan extends CreativeTabs
{
	public int type; //0 = Guns, 1 = Vehicles + Planes, 2 = Teams, 3 = Parts, 4 = Mechas
	public int icon;
	public int time = 0;
	
	public CreativeTabFlan(int i)
	{
		super("tabFlan" + i);
		type = i;
	}
	
	@Override
	public ItemStack getIconItemStack()
	{
		icon = FlansMod.ticker / 20;
		switch(type)
		{
			case 0 : return GunType.guns.size() == 0 ? new ItemStack(Block.cloth, 1, 4) : new ItemStack(GunType.guns.get(icon % GunType.guns.size()).item);
			case 1 : return DriveableType.types.size() == 0 ? new ItemStack(Block.cloth, 1, 14) : new ItemStack(DriveableType.types.get(icon % DriveableType.types.size()).item);
			case 2 : return FlansMod.partItems.size() == 0 ? new ItemStack(Block.cloth, 1, 5) : new ItemStack(FlansMod.partItems.get(icon % FlansMod.partItems.size()));
			case 3 : return FlansMod.armourItems.size() == 0 ? new ItemStack(Block.cloth, 1, 11) : new ItemStack(FlansMod.armourItems.get(icon % FlansMod.armourItems.size()));
			case 4 : return FlansMod.mechaItems.size() == 0 ? new ItemStack(Block.cloth, 1, 10) : new ItemStack(FlansMod.mechaItems.get(icon % FlansMod.mechaItems.size()));
		}
		return new ItemStack(FlansMod.craftingTable);
	}
}
