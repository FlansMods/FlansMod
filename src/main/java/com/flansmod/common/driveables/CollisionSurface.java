package com.flansmod.common.driveables;

import com.flansmod.common.vector.Vector3f;

public class CollisionSurface 
{
	/** The origin of this surface, relative to the current position of the driveable rounded down */
	public Vector3f localisedOrigin;
	/** The edge vectors of this surface such that the plane = localisedOrigin + m * u + n * v for m, n in [0,1] */
	public Vector3f u, v;
	
	public CollisionSurface(Vector3f o, Vector3f u1, Vector3f v1)
	{
		localisedOrigin = o;
		u = u1;
		v = v1;
	}
}
