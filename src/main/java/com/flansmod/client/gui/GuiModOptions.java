package com.flansmod.client.gui;

import com.flansmod.client.AimType;
import com.flansmod.client.FlanMouseButton;
import com.flansmod.client.FlansModClient;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;

public class GuiModOptions extends GuiScreen {
		
	@Override
	public void initGui()
	{
		addButtons(0, 0);
	}
	
	@Override
	public void drawScreen(int var1, int var2, float var3)
	{
        this.drawWorldBackground(0);
        
		FontRenderer fontRenderer = mc.fontRenderer;
		fontRenderer.drawStringWithShadow("Flan's Options", this.width/2-(fontRenderer.getStringWidth("Flan's Options")/2), 10, 16777215);
        		
		super.drawScreen(var1, var2, var3);
	}
	
	private void addButtons(int var1, int var2) {
		FontRenderer fontRenderer = mc.fontRenderer;
		
		int fireButtonWidth = 132; 
		this.buttonList.add(new GuiButton(1, (this.width/2)-(fireButtonWidth/2), 60, fireButtonWidth, 20, "Fire Button: " + FlansModClient.fireButton.getName()));
		
		this.buttonList.add(new GuiButton(2, (this.width/2)-(fireButtonWidth/2), 90, fireButtonWidth, 20, "Aim Button: " + FlansModClient.aimButton.getName()));
		
		int aimTypeWidth = fireButtonWidth; 
		this.buttonList.add(new GuiButton(0, (this.width/2)-(aimTypeWidth/2), 30, aimTypeWidth, 20, "Aim Type: " + FlansModClient.aimType.getName()));
		
	}
	
	protected void actionPerformed(GuiButton button) {
		if (button.id == 0) {
			if(FlansModClient.aimType == AimType.HOLD)
			{
				FlansModClient.setAimType(AimType.TOGGLE);
			} else
			{
				FlansModClient.setAimType(AimType.HOLD);
			}
			this.buttonList.clear();
			addButtons(0, 0);
		}
		
		if (button.id == 1) {
			if(FlansModClient.fireButton == FlanMouseButton.LEFT)
			{
				FlansModClient.setFireButton(FlanMouseButton.RIGHT);
			} else
			{
				FlansModClient.setFireButton(FlanMouseButton.LEFT);
			}
			this.buttonList.clear();
			addButtons(0, 0);
		}
		
		if (button.id == 2) {
			if(FlansModClient.aimButton == FlanMouseButton.LEFT)
			{
				FlansModClient.setAimButton(FlanMouseButton.RIGHT);
			} else
			{
				FlansModClient.setAimButton(FlanMouseButton.LEFT);
			}
			this.buttonList.clear();
			addButtons(0, 0);
		}
	}
	
	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}
	
}