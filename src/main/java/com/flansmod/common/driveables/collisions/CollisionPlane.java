package com.flansmod.common.driveables.collisions;

import com.flansmod.common.vector.Vector3f;

public class CollisionPlane {
	
	public float[] equation;
	public Vector3f normal;
	public Vector3f origin;
	
	
	public CollisionPlane(Vector3f origin, Vector3f normal)
	{
		this.origin = origin;
		this.normal = normal;
		
		equation = new float[4];
		
		equation[0] = normal.x;
		equation[1] = normal.y;
		equation[2] = normal.z;
		equation[3] = -(normal.x*origin.x + normal.y*origin.y + normal.z*origin.z);
	}
	
	//Plane constructor using vertex co-ordinates of a triangle
	public CollisionPlane(Vector3f p1, Vector3f p2, Vector3f p3)
	{
		Vector3f edge1 = Vector3f.sub(p2, p1, null);
		Vector3f edge2 = Vector3f.sub(p3, p1, null);
		normal = Vector3f.cross(edge1, edge2, null);
		normal.normalise();
		origin = p1;
		
		equation = new float[4];
		
		equation[0] = normal.x;
		equation[1] = normal.y;
		equation[2] = normal.z;
		equation[3] = -(normal.x*origin.x + normal.y*origin.y + normal.z*origin.z);
	}
	
	//Which way are we facing?
	public boolean isFrontFacingTo(Vector3f direction)
	{
		double dot = Vector3f.dot(normal, direction);
		
		return (dot <= 0);
	}
	
	
	public double signedDistanceTo(Vector3f point)
	{
		return Vector3f.dot(point, normal) + equation[3];
	}

}
