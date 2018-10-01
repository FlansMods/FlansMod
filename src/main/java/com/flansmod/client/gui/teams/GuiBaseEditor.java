package com.flansmod.client.gui.teams;

import java.io.IOException;
import java.util.Arrays;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;

import com.flansmod.common.FlansMod;
import com.flansmod.common.network.PacketBaseEdit;

public class GuiBaseEditor extends GuiScreen
{
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/baseEdit.png");
	private int guiOriginX;
	private int guiOriginY;
	private GuiTextField nameEntryField;
	private GuiButton[] teamButtons;
	private GuiButton[] mapButtons;
	private GuiButton leftButton;
	private GuiButton rightButton;
	private int mapsPage;
	
	/**
	 * The packet received from the server containing all the base information. Modify this and send it back
	 */
	public PacketBaseEdit packet;
	
	public GuiBaseEditor(PacketBaseEdit packet)
	{
		this.packet = packet;
	}
	
	public void initGui()
	{
		super.initGui();
		this.buttonList.clear();
		//Setup the text entry field
		Keyboard.enableRepeatEvents(true);
		nameEntryField = new GuiTextField(0, this.fontRenderer, width / 2 - 128 + 70, height / 2 - 94 + 24, 179, fontRenderer.FONT_HEIGHT);
		nameEntryField.setMaxStringLength(60);
		nameEntryField.setEnableBackgroundDrawing(true);
		nameEntryField.setVisible(true);
		nameEntryField.setFocused(true);
		nameEntryField.setTextColor(16777215);
		nameEntryField.setText(packet.baseName);
		
		//Add buttons
		teamButtons = new GuiButton[4];
		teamButtons[0] = new GuiButton(0, width / 2 - 128 + 6, height / 2 - 94 + 38, 58, 20, "No Team");
		teamButtons[1] = new GuiButton(1, width / 2 - 128 + 68, height / 2 - 94 + 38, 58, 20, "Spectator");
		teamButtons[2] = new GuiButton(2, width / 2 - 128 + 130, height / 2 - 94 + 38, 58, 20, "Team 1");
		teamButtons[3] = new GuiButton(3, width / 2 - 128 + 192, height / 2 - 94 + 38, 58, 20, "Team 2");

		buttonList.addAll(Arrays.asList(teamButtons).subList(0, 4));
		
		mapButtons = new GuiButton[5];
		for(int i = 0; i < 5; i++)
		{
			mapButtons[i] = new GuiButton(4 + i, width / 2 - 128 + 28, height / 2 - 94 + 75 + 22 * i, 200, 20, "Map " + (i + 1));
			buttonList.add(mapButtons[i]);
		}
		
		leftButton = new GuiButton(9, width / 2 - 128 + 6, height / 2 - 94 + 119, 20, 20, "<");
		rightButton = new GuiButton(10, width / 2 + 128 - 26, height / 2 - 94 + 119, 20, 20, ">");
		buttonList.add(leftButton);
		buttonList.add(rightButton);
	}

	@Override
	public void drawScreen(int i, int j, float f)
	{
		ScaledResolution scaledresolution = new ScaledResolution(mc);
		int k = scaledresolution.getScaledWidth();
		int l = scaledresolution.getScaledHeight();
		FontRenderer fontrenderer = mc.fontRenderer;
		drawDefaultBackground();
		GL11.glEnable(3042 /*GL_BLEND*/);
		mc.renderEngine.bindTexture(texture);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		int m = guiOriginX = k / 2 - 128;
		int n = guiOriginY = l / 2 - 94;
		drawTexturedModalRect(m, n, 0, 0, 256, 189);
		
		drawString(fontRenderer, "Base Settings", guiOriginX + 6, guiOriginY + 6, 0xffffff);
		drawString(fontRenderer, "Base Name : ", guiOriginX + 6, guiOriginY + 24, 0xffffff);
		drawString(fontRenderer, "Map", guiOriginX + 6, guiOriginY + 64, 0xffffff);
		
		nameEntryField.drawTextBox();
		
		super.drawScreen(i, j, f);
		
	}
	
	@Override
	protected void actionPerformed(GuiButton button)
	{
		switch(button.id)
		{
			case 0: case 1: case 2: case 3:
			packet.teamID = button.id;
			break;
			case 4: case 5: case 6: case 7: case 8:
			packet.mapID = mapsPage * 5 + button.id - 4;
			break;
			case 9: mapsPage--;
				break;
			case 10: mapsPage++;
				break;
		}

	}
	
	@Override
	public void updateScreen()
	{
		for(int i = 0; i < 4; i++)
		{
			teamButtons[i].enabled = packet.teamID != i;
		}
		for(int i = 0; i < 5; i++)
		{
			mapButtons[i].visible = packet.maps.length > i + mapsPage * 5;
			if(mapButtons[i].visible)
			{
				mapButtons[i].displayString = packet.maps[i + mapsPage * 5];
				mapButtons[i].enabled = i + mapsPage * 5 != packet.mapID;
			}
		}
		rightButton.visible = packet.maps.length > (mapsPage + 1) * 5;
		leftButton.visible = mapsPage > 0;

		nameEntryField.updateCursorCounter();
	}
	
	@Override
	protected void mouseClicked(int i, int j, int k)
	{
		try
		{
			super.mouseClicked(i, j, k);
		}
		catch(IOException e)
		{
		}

		nameEntryField.mouseClicked(i, j, k);
	}
	
	@Override
	protected void keyTyped(char c, int i)
	{
		try
		{
			super.keyTyped(c, i);
		}
		catch(IOException e)
		{
		}
		nameEntryField.textboxKeyTyped(c, i);
	}
	
	@Override
	public void onGuiClosed()
	{
		super.onGuiClosed();
		packet.baseName = nameEntryField.getText();
		Keyboard.enableRepeatEvents(false);
		FlansMod.getPacketHandler().sendToServer(packet);
	}
	
	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}
}
