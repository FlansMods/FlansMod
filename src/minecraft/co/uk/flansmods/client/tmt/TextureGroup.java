package co.uk.flansmods.client.tmt;

import java.util.ArrayList;

import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.entity.RenderManager;
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
			renderengine.func_110577_a(new ResourceLocation("", texture)); //TODO : Check. Not sure about this one
		}
		else if(defaultTexture > -1)
		{
			RenderManager.instance.renderEngine.func_110577_a(new ResourceLocation("", ""));
		}
	}
	
	public ArrayList<TexturedPolygon> poly;
	public String texture;
}
