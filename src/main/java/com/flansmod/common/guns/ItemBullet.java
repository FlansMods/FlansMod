package com.flansmod.common.guns;

import java.util.Collections;
import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;

/**
 * Implemented from old source.
 */
public class ItemBullet extends ItemShootable implements IFlanItem
{
	public BulletType type;
	
	public ItemBullet(BulletType infoType)
	{
		super(infoType);
		type = infoType;
		setMaxStackSize(type.maxStackSize);
		setHasSubtypes(true);
		type.item = this;
		switch(type.weaponType)
		{
			case SHELL: case BOMB: case MINE: case MISSILE: setCreativeTab(FlansMod.tabFlanDriveables);
			break;
			default: setCreativeTab(FlansMod.tabFlanGuns);
		}
	}
	
	@Override
	public void addInformation(ItemStack stack, World world, List<String> lines, ITooltipFlag b)
	{
		if(type.description != null)
		{
			Collections.addAll(lines, type.description.split("_"));
		}
	}
	
	@Override
	public InfoType getInfoType()
	{
		return type;
	}
}
