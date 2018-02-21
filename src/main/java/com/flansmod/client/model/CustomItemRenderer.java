package com.flansmod.client.model;

import com.flansmod.common.types.InfoType;

import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;

public interface CustomItemRenderer
{
	public void renderItem(CustomItemRenderType type, EnumHand hand, ItemStack item, Object... data);
}
