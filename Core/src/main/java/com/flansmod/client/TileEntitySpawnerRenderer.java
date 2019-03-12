package com.flansmod.client;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

import com.flansmod.client.util.WorldRenderer;
import com.flansmod.common.FlansMod;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.TileEntitySpawner;

public class TileEntitySpawnerRenderer extends TileEntitySpecialRenderer<TileEntitySpawner>
{
	@Override
	public void render(TileEntitySpawner te, double x, double y, double z, float f, int i, float alpha)
	{
		WorldRenderer worldrenderer = FlansModClient.getWorldRenderer();
		
		int spawnerTeamID = te.getTeamID();
		Team spawnerTeam = FlansModClient.getTeam(spawnerTeamID);
		
		boolean currentMap = FlansModClient.isCurrentMap(te.map);
		
		//Use default colours
		if(spawnerTeam == null || !currentMap)
		{
			switch(spawnerTeamID)
			{
				case 0: GlStateManager.color(0.5f, 0.5f, 0.5f);
					break; //No team : light grey
				case 1: GlStateManager.color(0.25f, 0.25f, 0.25f);
					break; //Spectators : dark grey
				case 2: GlStateManager.color(0.8f, 0.5f, 1.0f);
					break; //Team 1 : purple
				case 3: GlStateManager.color(1.0f, 0.5f, 0.8f);
					break; //Team 2 : pink
			}
		}
		else
		{
			float red = (float)((spawnerTeam.teamColour >> 16) & 0xff) / 255f;
			float green = (float)((spawnerTeam.teamColour >> 8) & 0xff) / 255f;
			float blue = (float)((spawnerTeam.teamColour >> 0) & 0xff) / 255f;
			GlStateManager.color(red, green, blue);
		}
		
		GlStateManager.disableTexture2D();
		
		double inset = 0.0d;
		switch(te.getBlockMetadata())
		{
			case 0: inset = 0.375d;
				break;
			case 1: inset = 0.25d;
				break;
			case 2: inset = 0.0625d;
				break;
			default: FlansMod.log.warn("" + te.getBlockMetadata());
		}
		
		RenderBox(worldrenderer, x + inset, x + 1.0d - inset, y + 0.0625d, y + 0.125d, z + inset, z + 1.0d - inset);
		
		GlStateManager.enableTexture2D();
		GlStateManager.color(1.0f, 1.0f, 1.0f);
	}
	
	private void RenderBox(WorldRenderer wr, double x0, double x1, double y0, double y1, double z0, double z1)
	{
		// Top
		wr.startDrawingQuads();
		wr.addVertexWithUV(x0, y1, z0, 0d, 0d);
		wr.addVertexWithUV(x0, y1, z1, 0d, 0d);
		wr.addVertexWithUV(x1, y1, z1, 0d, 0d);
		wr.addVertexWithUV(x1, y1, z0, 0d, 0d);
		wr.draw();
		// Bottom
		wr.startDrawingQuads();
		wr.addVertexWithUV(x0, y0, z0, 0d, 0d);
		wr.addVertexWithUV(x1, y0, z0, 0d, 0d);
		wr.addVertexWithUV(x1, y0, z1, 0d, 0d);
		wr.addVertexWithUV(x0, y0, z1, 0d, 0d);
		wr.draw();
		// Left
		wr.startDrawingQuads();
		wr.addVertexWithUV(x0, y1, z1, 0d, 0d);
		wr.addVertexWithUV(x0, y0, z1, 0d, 0d);
		wr.addVertexWithUV(x1, y0, z1, 0d, 0d);
		wr.addVertexWithUV(x1, y1, z1, 0d, 0d);
		wr.draw();
		// Right
		wr.startDrawingQuads();
		wr.addVertexWithUV(x0, y0, z0, 0d, 0d);
		wr.addVertexWithUV(x0, y1, z0, 0d, 0d);
		wr.addVertexWithUV(x1, y1, z0, 0d, 0d);
		wr.addVertexWithUV(x1, y0, z0, 0d, 0d);
		wr.draw();
		// Front
		wr.startDrawingQuads();
		wr.addVertexWithUV(x1, y1, z0, 0d, 0d);
		wr.addVertexWithUV(x1, y1, z1, 0d, 0d);
		wr.addVertexWithUV(x1, y0, z1, 0d, 0d);
		wr.addVertexWithUV(x1, y0, z0, 0d, 0d);
		wr.draw();
		// Front
		wr.startDrawingQuads();
		wr.addVertexWithUV(x0, y0, z0, 0d, 0d);
		wr.addVertexWithUV(x0, y0, z1, 0d, 0d);
		wr.addVertexWithUV(x0, y1, z1, 0d, 0d);
		wr.addVertexWithUV(x0, y1, z0, 0d, 0d);
		wr.draw();
	}
}
