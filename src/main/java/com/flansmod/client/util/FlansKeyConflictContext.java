package com.flansmod.client.util;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.settings.IKeyConflictContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.api.IControllable;
import com.flansmod.common.guns.ItemGun;

@SideOnly(Side.CLIENT)
public enum FlansKeyConflictContext implements IKeyConflictContext
{
	GUN
			{
				@Override
				public boolean isActive()
				{
					Minecraft mc = Minecraft.getMinecraft();
					return mc.player != null && (mc.player.getHeldItemMainhand().getItem() instanceof ItemGun ||
							mc.player.getHeldItemOffhand().getItem() instanceof ItemGun);
				}
				
				@Override
				public boolean conflicts(IKeyConflictContext other)
				{
					return this == other;
				}
			},
	
	VEHICLE
			{
				@Override
				public boolean isActive()
				{
					Minecraft mc = Minecraft.getMinecraft();
					return mc.player != null && mc.player.getRidingEntity() instanceof IControllable;
				}
				
				@Override
				public boolean conflicts(IKeyConflictContext other)
				{
					return this == other;
				}
			}
}
