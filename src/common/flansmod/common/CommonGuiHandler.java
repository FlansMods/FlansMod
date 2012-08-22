package flansmod.common;

import net.minecraft.src.*;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonGuiHandler implements IGuiHandler
{
     public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
     {
          return FlansMod.proxy.getServerGui(ID, player, world, x, y, z);
     }

     public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
     {
          return FlansMod.proxy.getClientGui(ID, player, world, x, y, z);
     }
}