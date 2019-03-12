package com.flansmod.client.tmt;

import java.util.ArrayList;

import net.minecraft.util.math.Vec3d;

public class PositionTransformVertex extends PositionTextureVertex
{
	public PositionTransformVertex(float x, float y, float z, float u, float v)
	{
		this(new Vec3d(x, y, z), u, v);
	}
	
	public PositionTransformVertex(PositionTextureVertex vertex, float u, float v)
	{
		super(vertex, u, v);
		if(vertex instanceof PositionTransformVertex)
			neutralVector = ((PositionTransformVertex)vertex).neutralVector;
		else
			neutralVector = new Vec3d(vertex.vector3D.x, vertex.vector3D.y, vertex.vector3D.z);
	}
	
	public PositionTransformVertex(PositionTextureVertex vertex)
	{
		this(vertex, vertex.texturePositionX, vertex.texturePositionY);
	}
	
	public PositionTransformVertex(Vec3d vector, float u, float v)
	{
		super(vector, u, v);
		neutralVector = new Vec3d(vector.x, vector.y, vector.z);
	}
	
	public void setTransformation()
	{
		if(transformGroups.isEmpty())
		{
			vector3D = new Vec3d(neutralVector.x, neutralVector.y, neutralVector.z);
			return;
		}
		double weight = 0D;
		for(TransformGroup transformGroup : transformGroups)
		{
			weight += transformGroup.getWeight();
		}
		vector3D = new Vec3d(0, 0, 0);
		
		for(TransformGroup group : transformGroups)
		{
			double cWeight = group.getWeight() / weight;
			Vec3d vector = group.doTransformation(this);
			
			vector3D = new Vec3d(vector3D.x + cWeight * vector.x, vector3D.y + cWeight * vector.y, vector3D.z + cWeight * vector.z);
		}
	}
	
	public void addGroup(TransformGroup group)
	{
		transformGroups.add(group);
	}
	
	public void removeGroup(TransformGroup group)
	{
		transformGroups.remove(group);
	}
	
	public Vec3d neutralVector;
	public ArrayList<TransformGroup> transformGroups = new ArrayList<>();
	
}
