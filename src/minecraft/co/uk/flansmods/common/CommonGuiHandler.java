package co.uk.flansmods.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import co.uk.flansmods.client.GuiGunBox;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
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
     
 	@SideOnly(Side.CLIENT)
 	public static void openGunBoxGui(EntityPlayer player, GunBoxType type) 
 	{
 		EntityPlayerMP playerMP = FMLClientHandler.instance().getServer().getConfigurationManager().getPlayerForUsername(player.username);
 		FMLClientHandler.instance().displayGuiScreen(player, new GuiGunBox(playerMP.inventory, type));
 	}
}