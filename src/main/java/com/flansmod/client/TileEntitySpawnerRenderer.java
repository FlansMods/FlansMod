package com.flansmod.client;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.flansmod.common.FlansMod;
import com.flansmod.common.teams.BlockSpawner;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.TileEntitySpawner;

public class TileEntitySpawnerRenderer extends TileEntitySpecialRenderer 
{
	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float f, int i) 
	{
		Tessellator tessellator = Tessellator.getInstance();
		WorldRenderer worldRenderer = tessellator.getWorldRenderer();
		
		TileEntitySpawner spawner = (TileEntitySpawner)te;
        int spawnerTeamID = spawner.getTeamID();
        Team spawnerTeam = FlansModClient.getTeam(spawnerTeamID);
        
        boolean currentMap = FlansModClient.isCurrentMap(spawner.map);
        
        //Use default colours
        if(spawnerTeam == null || !currentMap)
        {
        	switch(spawnerTeamID)
        	{
	        	case 0 : GlStateManager.color(0.5f, 0.5f, 0.5f); break; //No team : light grey
	        	case 1 : GlStateManager.color(0.25f, 0.25f, 0.25f); break; //Spectators : dark grey
	        	case 2 : GlStateManager.color(0.8f, 0.5f, 1.0f); break; //Team 1 : purple
	        	case 3 : GlStateManager.color(1.0f, 0.5f, 0.8f); break; //Team 2 : pink
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
	        case 0: inset = 0.375d; break;
	        case 1: inset = 0.25d; break;
	        case 2: inset = 0.0625d; break;
	        default: FlansMod.log("" + te.getBlockMetadata());
        }
        
        RenderBox(tessellator, worldRenderer, x + inset, x + 1.0d - inset, y + 0.0625d, y + 0.125d, z + inset, z + 1.0d - inset);

        GlStateManager.enableTexture2D();
		GlStateManager.color(1.0f, 1.0f, 1.0f);		
	}
	
	private void RenderBox(Tessellator t, WorldRenderer wr, double x0, double x1, double y0, double y1, double z0, double z1)
	{
		// Top
		wr.begin(7, DefaultVertexFormats.POSITION_TEX);
        wr.pos(x0, y1, z0);
        wr.pos(x0, y1, z1);
        wr.pos(x1, y1, z1);
        wr.pos(x1, y1, z0);
        t.draw();
        // Bottom
        wr.begin(7, DefaultVertexFormats.POSITION_TEX);
        wr.pos(x0, y0, z0);
        wr.pos(x1, y0, z0);
        wr.pos(x1, y0, z1);
        wr.pos(x0, y0, z1);
        t.draw();
        // Left
        wr.begin(7, DefaultVertexFormats.POSITION_TEX);
        wr.pos(x0, y1, z1);
        wr.pos(x0, y0, z1);
        wr.pos(x1, y0, z1);
        wr.pos(x1, y1, z1);
        t.draw();
        // Right
        wr.begin(7, DefaultVertexFormats.POSITION_TEX);
        wr.pos(x0, y0, z0);
        wr.pos(x0, y1, z0);
        wr.pos(x1, y1, z0);
        wr.pos(x1, y0, z0);
        t.draw();
        // Front
        wr.begin(7, DefaultVertexFormats.POSITION_TEX);
        wr.pos(x1, y1, z0);
        wr.pos(x1, y1, z1);
        wr.pos(x1, y0, z1);
        wr.pos(x1, y0, z0);
        t.draw();
        // Front
        wr.begin(7, DefaultVertexFormats.POSITION_TEX);
        wr.pos(x0, y0, z0);
        wr.pos(x0, y0, z1);
        wr.pos(x0, y1, z1);
        wr.pos(x0, y1, z0);
        t.draw();
	}
}