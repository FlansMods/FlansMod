package com.flansmod.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.client.gui.GuiGunBox;
import com.flansmod.common.guns.boxes.GunBoxType;

public class CommonGuiHandler implements IGuiHandler
{
	 @Override
     public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
     {
          return FlansMod.proxy.getServerGui(ID, player, world, x, y, z);
     }

	 @Override
     public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
     {
          return FlansMod.proxy.getClientGui(ID, player, world, x, y, z);
     }
     
 	@SideOnly(Side.CLIENT)
 	public static void openGunBoxGui(EntityPlayer player, GunBoxType type) 
 	{
 		EntityPlayerMP playerMP = FMLClientHandler.instance().getServer().getConfigurationManager().func_152612_a(player.getCommandSenderName());
 		FMLClientHandler.instance().displayGuiScreen(player, new GuiGunBox(playerMP.inventory, type));
 	}
}