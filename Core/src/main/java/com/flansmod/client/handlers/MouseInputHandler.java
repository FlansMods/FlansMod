package com.flansmod.client.handlers;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.api.IControllable;

@SideOnly(Side.CLIENT)
public class MouseInputHandler
{
	private Minecraft mc;
	
	public MouseInputHandler()
	{
		mc = Minecraft.getMinecraft();
	}
	
	public void checkMouseInput(MouseEvent event)
	{
		if(mc.currentScreen != null)
		{
			return;
		}
		
		//Handle driving controls
		EntityPlayer player = mc.player;
		Entity ridingEntity = player.getRidingEntity();
		if(ridingEntity instanceof IControllable)
		{
			IControllable riding = (IControllable)ridingEntity;
			riding.onMouseMoved(event.getDx(), event.getDy());
		}
	}
}
