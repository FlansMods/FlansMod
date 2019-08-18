package com.flansmod.common.paintjob;

import com.flansmod.common.types.IFlanItem;

import net.minecraft.client.model.ModelBase;

public interface IPaintableItem extends IFlanItem
{
	public PaintableType GetPaintableType();
}