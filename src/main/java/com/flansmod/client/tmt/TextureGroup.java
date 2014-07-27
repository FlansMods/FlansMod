package com.flansmod.client.tmt;

import java.util.ArrayList;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;

public class TextureGroup
{
	public TextureGroup()
	{
		poly = new ArrayList<TexturedPolygon>();
		texture = "";
	}
	
	public void addPoly(TexturedPolygon polygon)
	{
		poly.add(polygon);
	}

	public void loadTexture()
	{
		loadTexture(-1);
	}
	
	public void loadTexture(int defaultTexture)
	{
		if(!texture.equals(""))
		{
			TextureManager renderengine = RenderManager.instance.renderEngine;
			renderengine.bindTexture(new ResourceLocation("", texture)); //TODO : Check. Not sure about this one
		}
		else if(defaultTexture > -1)
		{
			RenderManager.instance.renderEngine.bindTexture(new ResourceLocation("", ""));
		}
	}
	
	public ArrayList<TexturedPolygon> poly;
	public String texture;
}
