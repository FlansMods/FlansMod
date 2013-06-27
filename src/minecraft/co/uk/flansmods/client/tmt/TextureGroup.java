package co.uk.flansmods.client.tmt;

import java.util.ArrayList;

import net.minecraft.client.renderer.RenderEngine;
import net.minecraft.client.renderer.entity.RenderManager;

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
			RenderEngine renderengine = RenderManager.instance.renderEngine;
			renderengine.bindTexture(texture);
		}
		else if(defaultTexture > -1)
		{
			RenderManager.instance.renderEngine.bindTexture("");
		}
	}
	
	public ArrayList<TexturedPolygon> poly;
	public String texture;
}
