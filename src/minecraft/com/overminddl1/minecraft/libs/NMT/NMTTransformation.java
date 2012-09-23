package com.overminddl1.minecraft.libs.NMT;

public abstract class NMTTransformation
{
	public float weight;
	
	public NMTTransformation(float w)
	{
		weight = w;
	}
	
	public abstract NMTVertex doTransformation(NMTVertex vertexOrig);
}
