package com.flansmod.client.model;

import com.flansmod.common.types.InfoType;

import net.minecraft.item.ItemStack;

public interface CustomItemRenderer
{
	public void renderItem(CustomItemRenderType type, ItemStack item, Object... data);
}
