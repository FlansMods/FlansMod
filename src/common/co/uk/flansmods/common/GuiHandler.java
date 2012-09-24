package co.uk.flansmods.common;

import co.uk.flansmods.client.*;
import net.minecraft.src.*;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import cpw.mods.fml.common.network.*;

public class GuiHandler implements IGuiHandler 
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(ID) 
		{
			case 0: return new ContainerPlaneCrafting(player.inventory, world, x, y, z, false);
			case 1: return new ContainerPlaneCrafting(player.inventory, world, x, y, z, true);
			case 2: return new ContainerVehicleCrafting(player.inventory, world, x, y, z);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(ID) 
		{
			case 0: return new GuiPlaneCrafting(player.inventory, world, x, y, z, false);
			case 1: return new GuiPlaneCrafting(player.inventory, world, x, y, z, true);
			case 2: return new GuiVehicleCrafting(player.inventory, world, x, y, z);
		}
		
		return null;
	}
	
	@SideOnly(Side.CLIENT)
	public static void openGui(EntityPlayer player) {
		if(FlansMod.currentGunBox != null) {
			EntityPlayerMP playerMP = FMLClientHandler.instance().getServer().getConfigurationManager().getPlayerForUsername(player.username);
			FMLClientHandler.instance().displayGuiScreen(player, new GuiGunBox(playerMP.inventory, (BlockGunBox) FlansMod.currentGunBox));
			FlansMod.currentGunBox = null;
		}
	}
}
