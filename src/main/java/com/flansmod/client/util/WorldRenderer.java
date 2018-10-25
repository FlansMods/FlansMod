package com.flansmod.client.util;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;

public class WorldRenderer
{
	public Tessellator tessellator;
	
	public WorldRenderer()
	{
		
	}
	
	public void startDrawingQuads()
	{
		tessellator = Tessellator.getInstance();
		tessellator.getBuffer().begin(7, DefaultVertexFormats.POSITION_TEX);
	}
	
	public void addVertexWithUV(double x, double y, double z, double u, double v)
	{
		tessellator.getBuffer().pos(x, y, z).tex(u, v).endVertex();
	}
	
	public void draw()
	{
		tessellator.draw();
	}
}
