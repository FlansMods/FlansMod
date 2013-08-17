package co.uk.flansmods.client;

import co.uk.flansmods.common.driveables.EntityDriveable;
import co.uk.flansmods.common.driveables.EntitySeat;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiDriveableRepair extends GuiScreen 
{
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/repair.png");
	
	private EntityPlayer driver;
	private EntityDriveable driving;
	
	public GuiDriveableRepair(EntityPlayer player)
	{
		driver = player;
		driving = ((EntitySeat)player.ridingEntity).driveable;
	}
	
    @Override
	public void initGui()
	{
		super.initGui();
		//buttonList.add(new GuiButton(0, width / 2 - 60, height / 2 - 71, 58, 20, "Guns"));
	}
    
    
	
}
