package co.uk.flansmods.common;

import co.uk.flansmods.common.teams.ArmourType;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabFlan extends CreativeTabs
{
	public int type; //0 = Guns, 1 = Vehicles + Planes, 2 = Teams, 3 = Parts
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
		time++;
		if(time % 200 == 0)
			icon++;
		switch(type)
		{
			case 0 : return GunType.guns.size() == 0 ? new ItemStack(Block.cloth, 1, 4) : new ItemStack(GunType.guns.get(icon % GunType.guns.size()).item);
			case 1 : return DriveableType.typeList.size() == 0 ? new ItemStack(Block.cloth, 1, 14) : new ItemStack(DriveableType.typeList.get(icon % DriveableType.typeList.size()).item);
			case 2 : return FlansMod.partItems.size() == 0 ? new ItemStack(Block.cloth, 1, 5) : new ItemStack(FlansMod.partItems.get(icon % FlansMod.partItems.size()));
			case 3 : return FlansMod.armourItems.size() == 0 ? new ItemStack(Block.cloth, 1, 11) : new ItemStack(FlansMod.armourItems.get(icon % FlansMod.armourItems.size()));
		}
		return new ItemStack(FlansMod.craftingTable);
	}
}
