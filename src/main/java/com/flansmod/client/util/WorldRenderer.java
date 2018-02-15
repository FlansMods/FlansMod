package com.flansmod.client.util;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;

public class WorldRenderer 
{
	public Tessellator tessellator;
	
	public WorldRenderer()
	{
		tessellator = Tessellator.getInstance();
	}
	
	public void startDrawingQuads()
	{
		tessellator.getBuffer().begin(7, DefaultVertexFormats.POSITION_TEX);
	}
	
	public void addVertexWithUV(double x, double y, double z, double u, double v)
	{
		tessellator.getBuffer().pos(x, y, z).tex(u, v);
	}
	
	public void draw()
	{
		tessellator.draw();
	}
}
