package co.uk.flansmods.client;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.Entity;
import net.minecraft.util.MouseHelper;

import org.lwjgl.opengl.GL11;

import co.uk.flansmods.common.EntityDriveable;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class TickHandlerClient implements ITickHandler
{
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData)
	{
		if (type.equals(EnumSet.of(TickType.RENDER)))
		{
			rTickStart(FMLClientHandler.instance().getClient());
		}
		if (type.equals(EnumSet.of(TickType.CLIENT)))
		{
			cTickStart(FMLClientHandler.instance().getClient());
		}
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData)
	{
		if (type.equals(EnumSet.of(TickType.RENDER)))
		{
			rTickEnd(FMLClientHandler.instance().getClient());
		}
		if (type.equals(EnumSet.of(TickType.CLIENT)))
		{
			cTickEnd(FMLClientHandler.instance().getClient());
		}
	}
	
	public void cTickStart(Minecraft minecraft)
	{ /* Client side only */
		
	}

	public void cTickEnd(Minecraft minecraft)
	{ /* Client side only */
		FlansModClient.tick();
	}
	
	
	public void rTickStart(Minecraft mc)
	{
		// CAPTURE MOUSE INPUT!
		if (mc.currentScreen == null && FlansModClient.controlModeMouse)
		{
			MouseHelper mouse = mc.mouseHelper;
			Entity ridden = mc.thePlayer.ridingEntity;

			if (ridden instanceof EntityDriveable)
			{
				EntityDriveable entity = (EntityDriveable) ridden;
				entity.onMouseMoved(mouse.deltaX, mouse.deltaY);
			}
		}
	}

	public void rTickEnd(Minecraft mc)
	{
		if (FlansModClient.zoomOverlay != null && FMLClientHandler.instance().getClient().currentScreen == null)
		{
			ScaledResolution scaledresolution = new ScaledResolution(FlansModClient.minecraft.gameSettings, FlansModClient.minecraft.displayWidth, FlansModClient.minecraft.displayHeight);
			int i = scaledresolution.getScaledWidth();
			int j = scaledresolution.getScaledHeight();
			FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
			GL11.glEnable(3042 /* GL_BLEND */);
			GL11.glDisable(2929 /* GL_DEPTH_TEST */);
			GL11.glDepthMask(false);
			GL11.glBlendFunc(770, 771);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			GL11.glDisable(3008 /* GL_ALPHA_TEST */);
			GL11.glBindTexture(3553 /* GL_TEXTURE_2D */, FlansModClient.minecraft.renderEngine.getTexture("/gui/" + FlansModClient.zoomOverlay + ".png"));
			Tessellator tessellator = Tessellator.instance;
			tessellator.startDrawingQuads();
			tessellator.addVertexWithUV(i / 2 - 2 * j, j, -90D, 0.0D, 1.0D);
			tessellator.addVertexWithUV(i / 2 + 2 * j, j, -90D, 1.0D, 1.0D);
			tessellator.addVertexWithUV(i / 2 + 2 * j, 0.0D, -90D, 1.0D, 0.0D);
			tessellator.addVertexWithUV(i / 2 - 2 * j, 0.0D, -90D, 0.0D, 0.0D);
			tessellator.draw();
			GL11.glDepthMask(true);
			GL11.glEnable(2929 /* GL_DEPTH_TEST */);
			GL11.glEnable(3008 /* GL_ALPHA_TEST */);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
		if (FlansModClient.errorString != null && FlansModClient.errorStringTimer > 0)
		{
			ScaledResolution scaledresolution = new ScaledResolution(FlansModClient.minecraft.gameSettings, FlansModClient.minecraft.displayWidth, FlansModClient.minecraft.displayHeight);
			int i = scaledresolution.getScaledWidth();
			int j = scaledresolution.getScaledHeight();
			GL11.glEnable(3042 /* GL_BLEND */);
			GL11.glDisable(2929 /* GL_DEPTH_TEST */);
			GL11.glDepthMask(false);
			GL11.glBlendFunc(770, 771);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			GL11.glDisable(3008 /* GL_ALPHA_TEST */);
			GL11.glBindTexture(3553 /* GL_TEXTURE_2D */, FlansModClient.minecraft.renderEngine.getTexture("/gui/gui.png"));
			Tessellator tessellator = Tessellator.instance;
			tessellator.startDrawingQuads();
			tessellator.addVertexWithUV(0, 20, -90D, 0D, 66D / 256D);
			tessellator.addVertexWithUV(200, 20, -90D, 200D / 256D, 66D / 256D);
			tessellator.addVertexWithUV(200, 0D, -90D, 200D / 256D, 46D / 256D);
			tessellator.addVertexWithUV(0, 0D, -90D, 0D, 46D / 256D);
			tessellator.draw();
			GL11.glDepthMask(true);
			GL11.glEnable(2929 /* GL_DEPTH_TEST */);
			GL11.glEnable(3008 /* GL_ALPHA_TEST */);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			FlansModClient.minecraft.fontRenderer.drawString(FlansModClient.errorString, 6, 6, 0x000000);
		}
		if(GuiTeamScores.numTeams > 0)
		{
			ScaledResolution scaledresolution = new ScaledResolution(FlansModClient.minecraft.gameSettings, FlansModClient.minecraft.displayWidth, FlansModClient.minecraft.displayHeight);
			int i = scaledresolution.getScaledWidth();
			int j = scaledresolution.getScaledHeight();
			GL11.glEnable(3042 /* GL_BLEND */);
			GL11.glDisable(2929 /* GL_DEPTH_TEST */);
			GL11.glDepthMask(false);
			GL11.glBlendFunc(770, 771);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			GL11.glDisable(3008 /* GL_ALPHA_TEST */);
			GL11.glBindTexture(3553 /* GL_TEXTURE_2D */, FlansModClient.minecraft.renderEngine.getTexture("/gui/teamsScores.png"));
			Tessellator tessellator = Tessellator.instance;
			tessellator.startDrawingQuads();
			tessellator.addVertexWithUV(i / 2 - 19, 27, -90D, 109D / 256D, 27D / 256D);
			tessellator.addVertexWithUV(i / 2 + 19, 27, -90D, 147D / 256D, 27D / 256D);
			tessellator.addVertexWithUV(i / 2 + 19, 0D, -90D, 147D / 256D, 0D / 256D);
			tessellator.addVertexWithUV(i / 2 - 19, 0D, -90D, 109D / 256D, 0D / 256D);
			tessellator.draw();
			GL11.glDepthMask(true);
			GL11.glEnable(2929 /* GL_DEPTH_TEST */);
			GL11.glEnable(3008 /* GL_ALPHA_TEST */);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			String playerUsername = FlansModClient.minecraft.thePlayer.username;
			if(GuiTeamScores.getPlayerData(playerUsername) != null)
			{
				FlansModClient.minecraft.fontRenderer.drawString(GuiTeamScores.getPlayerData(playerUsername).score + "", i / 2 - 7, 1, 0x000000);
				FlansModClient.minecraft.fontRenderer.drawString(GuiTeamScores.getPlayerData(playerUsername).kills + "", i / 2 - 7, 9, 0x000000);
				FlansModClient.minecraft.fontRenderer.drawString(GuiTeamScores.getPlayerData(playerUsername).deaths + "", i / 2 - 7, 17, 0x000000);
			}
			
		}
	}

	public EnumSet<TickType> ticks()
	{
		return EnumSet.of(TickType.RENDER, TickType.CLIENT);
	}

	public String getLabel()
	{
		return "FlansModClient";
	}
}
