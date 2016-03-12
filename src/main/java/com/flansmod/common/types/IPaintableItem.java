package com.flansmod.common.types;

import net.minecraft.client.model.ModelBase;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public interface IPaintableItem extends IFlanItem
{
	public PaintableType GetPaintableType();
}
