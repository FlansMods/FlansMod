package com.flansmod.client.model.animation;

import com.flansmod.common.vector.Vector3f;

public class PoseComponent
{
	String name;
	Vector3f position;
	Vector3f rotation;
	int speed1;
	int speed2;
	boolean trackPlayerView = false;

	public PoseComponent(String nam,Vector3f pos, Vector3f rot, int s1, int s2,boolean tpv)
	{
		this.name = nam;
		this.position = pos;
		this.rotation = rot;
		this.trackPlayerView = tpv;
		this.speed1 = s1;
		this.speed2 = s2;
	}
}
