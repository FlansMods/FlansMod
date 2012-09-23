package com.overminddl1.minecraft.libs.NMT;

import java.nio.FloatBuffer;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class NMTMaterial
{
	protected FloatBuffer ambient;
	protected FloatBuffer diffuse;
	protected FloatBuffer specular;
	protected FloatBuffer emission;
	protected float shininess;
	protected String mapAmbient;
	public String name;
	
	protected static NMTMaterial defaultMaterial = new NMTMaterial("");
	static
	{
		defaultMaterial.setAmbient(0.2F, 0.2F, 0.2F, 1.0F);
		defaultMaterial.setDiffuse(0.8F, 0.8F, 0.8F, 1.0F);
		defaultMaterial.setSpecular(0.0F, 0.0F, 0.0F, 1.0F);
		defaultMaterial.setEmission(0.0F, 0.0F, 0.0F, 1.0F);
		defaultMaterial.setShininess(0.0F);
	}
	
	public NMTMaterial(String matName)
	{
		name = matName;
		ambient = null;
		diffuse = null;
		specular = null;
		emission = null;
		shininess = 0.0F;
		mapAmbient = null;
	}
	
	public void setAmbient(float r, float g, float b, float a)
	{
		ambient = toFloatBuffer(new float[] {r, g, b, a});
	}
	
	public void setDiffuse(float r, float g, float b, float a)
	{
		diffuse = toFloatBuffer(new float[] {r, g, b, a});
	}
	
	public void setSpecular(float r, float g, float b, float a)
	{
		specular = toFloatBuffer(new float[] {r, g, b, a});
	}
	
	public void setEmission(float r, float g, float b, float a)
	{
		emission = toFloatBuffer(new float[] {r, g, b, a});
	}
	
	public void setShininess(float s)
	{
		shininess = s;
	}
	
	protected FloatBuffer toFloatBuffer(float[] flt)
	{
		FloatBuffer fltBuf = BufferUtils.createFloatBuffer(flt.length);
		fltBuf.put(flt);
		fltBuf.flip();
		return fltBuf;
	}
	
	public void setMaterial()
	{
		if(ambient != null)
		{
			GL11.glMaterial(GL11.GL_FRONT_AND_BACK, GL11.GL_AMBIENT, ambient);
		}
		if(diffuse != null)
		{
			GL11.glMaterial(GL11.GL_FRONT_AND_BACK, GL11.GL_DIFFUSE, diffuse);
		}
		if(specular != null)
		{
			GL11.glMaterial(GL11.GL_FRONT_AND_BACK, GL11.GL_SPECULAR, specular);
		}
		if(emission != null)
		{
			GL11.glMaterialf(GL11.GL_FRONT_AND_BACK, GL11.GL_SHININESS, shininess);
		}
	}

	public void resetMaterial()
	{
		defaultMaterial.setMaterial();
	}
}
