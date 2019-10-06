package com.flansmod.client.model;

import com.flansmod.common.RotatedAxes;
import com.flansmod.common.vector.Vector3f;

public class AnimTrackLink
{
	
	public Vector3f position;
	public Vector3f prevPosition;
	public float zRot = 0;
	public float prevZRot;
	public float progress;
	public RotatedAxes rot;
	
	public AnimTrackLink(float prog)
	{
		progress = prog;
	}
}
