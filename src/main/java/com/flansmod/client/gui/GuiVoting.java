package com.flansmod.client.gui;

import org.lwjgl.opengl.GL11;

import com.flansmod.common.FlansMod;
import com.flansmod.common.network.PacketVoteCast;
import com.flansmod.common.network.PacketVoting;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;

public class GuiVoting extends GuiScreen 
{
	public static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/vote.png");
	public static PacketVoting packet;
	public static int myVote = 0;
	private int guiHeight;
	
	public GuiVoting(PacketVoting packet)
	{
		myVote = 0;
		this.packet = packet;
	}
	
	@Override
	public void initGui()
	{
		super.initGui();
		this.buttonList.clear();
		
		guiHeight = 29 + packet.clientOptions.length * 24;
		
		//Add buttons
		for(int i = 0; i < packet.clientOptions.length; i++)
		{
			buttonList.add(new GuiButton(i, width / 2 + 128 - 50, height / 2 - guiHeight / 2 + 24 + 24 * i, 40, 20, "Vote"));
		}
	}
	
	
	@Override
    protected void actionPerformed(GuiButton button)
    {
		myVote = button.id + 1;
		FlansMod.getPacketHandler().sendToServer(new PacketVoteCast(myVote));
    }		
	
	@Override
	public void drawScreen(int i, int j, float f)
	{
		ScaledResolution scaledresolution = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
		int k = scaledresolution.getScaledWidth();
		int l = scaledresolution.getScaledHeight();
		FontRenderer fontrenderer = mc.fontRenderer;
		drawDefaultBackground();
		GL11.glEnable(3042 /*GL_BLEND*/);

		mc.renderEngine.bindTexture(texture);
		

		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		int m = k / 2 - 128;
		int n = l / 2 - guiHeight / 2;
		
		
		
		drawTexturedModalRect(m, n, 0, 0, 256, 22);
		for(int p = 0; p < packet.clientOptions.length; p++)
			drawTexturedModalRect(m, n + 22 + 24 * p, 0, 23, 256, 24);
		drawTexturedModalRect(m, l / 2 + guiHeight / 2 - 6, 0, 73, 256, 7);
		
		drawString(fontRendererObj, "Vote for the Next Round", m + 8, n + 8, 0xffffff);
		drawString(fontRendererObj, (packet.timeLeft / 20) + "", m + 256 - 20, n + 8, 0xffffff);
		
		for(int p = 0; p < packet.clientOptions.length; p++)
		{
			drawString(fontRendererObj, packet.clientOptions[p].mapName, m + 10, n + 25 + 24 * p, 0xffffff);
			drawString(fontRendererObj, packet.clientOptions[p].gametype + " : \u00a7" + packet.clientOptions[p].teamNames[0] + ", \u00a7" + packet.clientOptions[p].teamNames[1], m + 10, n + 35 + 24 * p, 0xffffff);
			
			drawCenteredString(fontRendererObj, (myVote == p + 1 ? "\u00a72" : "") + packet.numVotes[p], m + 196, n + 31 + 24 * p, 0xffffff);
		}
		
		super.drawScreen(i, j, f);
	}
	
	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}
}
