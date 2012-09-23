package com.overminddl1.minecraft.libs.NMT;

import java.util.ArrayList;

import net.minecraft.src.Vec3;

public class NMTVertex
{
	public Vec3 baseVector;
	public Vec3 transformVector;
	public ArrayList<NMTTransformation> transformations;
	public Vec3 baseNormal;
	public Vec3 normal;
	
	public NMTVertex(float x, float y, float z)
	{
		this(Vec3.createVectorHelper(x, y, z));
	}
	
	public NMTVertex(Vec3 vector)
	{
		baseVector = vector;
		transformVector = Vec3.createVectorHelper(baseVector.xCoord, baseVector.yCoord, baseVector.zCoord);
		transformations = new ArrayList<NMTTransformation>();
		baseNormal = null;
		normal = null;
	}
	
	public NMTVertex copyVertex()
	{
		NMTVertex vert = new NMTVertex((float)baseVector.xCoord, (float)baseVector.yCoord, (float)baseVector.zCoord);
		if(normal != null)
		{
			vert.setNormals(Vec3.createVectorHelper(baseNormal.xCoord, baseNormal.yCoord, baseNormal.zCoord));
		}
		return vert;
	}
	
	public void addTransformation(NMTTransformation transformation)
	{
		transformations.add(transformation);
	}
	
	public void setNormals(Vec3 n)
	{
		normal = n;
		baseNormal = Vec3.createVectorHelper(n.xCoord, n.yCoord, n.zCoord);
	}
	
	public void applyTransformations()
	{
		transformVector.xCoord = baseVector.xCoord;
		transformVector.yCoord = baseVector.yCoord;
		transformVector.zCoord = baseVector.zCoord;
		normal.xCoord = baseNormal.xCoord;
		normal.yCoord = baseNormal.yCoord;
		normal.zCoord = baseNormal.zCoord;
		float weight = 0;
		float totalWeight = 0;
		NMTVertex tempVert;
		
		for(int idx = 0; idx < transformations.size(); idx++)
		{
			tempVert = copyVertex();
			weight = transformations.get(idx).weight;
			totalWeight+= weight;
			
			tempVert = transformations.get(idx).doTransformation(tempVert);
			
			transformVector.xCoord+= tempVert.transformVector.xCoord * weight;
			transformVector.yCoord+= tempVert.transformVector.yCoord * weight;
			transformVector.zCoord+= tempVert.transformVector.zCoord * weight;
			normal.xCoord = tempVert.normal.xCoord * weight;
			normal.yCoord = tempVert.normal.yCoord * weight;
			normal.zCoord = tempVert.normal.zCoord * weight;
		}
		transformVector.xCoord/= totalWeight;
		transformVector.yCoord/= totalWeight;
		transformVector.zCoord/= totalWeight;
		normal.xCoord/= totalWeight;
		normal.yCoord/= totalWeight;
		normal.zCoord/= totalWeight;
	}
	
	public boolean equals(NMTVertex vertex)
	{
		if(vertex == this)
			return true;
		if(vertex == null)
			return false;
		if(baseVector.xCoord != vertex.baseVector.xCoord || baseVector.yCoord != vertex.baseVector.yCoord || baseVector.zCoord != vertex.baseVector.zCoord)
		{
			return false;
		}
		return true;
	}
}
