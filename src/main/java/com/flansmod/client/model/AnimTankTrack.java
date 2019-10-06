package com.flansmod.client.model;

import java.util.ArrayList;

import com.flansmod.common.vector.Vector3f;


public class AnimTankTrack
{
	
	public ArrayList<Vector3f> points;
	public float trackLinkLength;
	
	public AnimTankTrack(ArrayList<Vector3f> trackPoints, float linkLength)
	{
		points = trackPoints;
		trackLinkLength = linkLength;
	}
	
	public void setLinkLength(float length)
	{
		trackLinkLength = length;
	}
	
	public float distBetweenPoints(Vector3f p1, Vector3f p2)
	{
		float distance;
		
		float x = p1.x - p2.x;
		float y = p1.y - p2.y;
		distance = (float)Math.sqrt((x * x) + (y * y));
		
		return distance;
	}
	
	public float getTrackLength()
	{
		float length = 0;
		for(int i = 0; i < points.size(); i++)
		{
			length += distBetweenPoints(points.get(i), points.get((i == 0) ? points.size() - 1 : i - 1));
		}
		return length;
	}
	
	public int getTrackPart(float distance)
	{
		float length = 0;
		for(int i = 0; i < points.size(); i++)
		{
			if(length >= distance)
			{
				return i;
			}
			else
			{
				length += distBetweenPoints(points.get(i), points.get((i == (points.size() - 1)) ? 0 : i + 1));
			}
		}
		return 0;
	}
	
	
	public float getProgressAlongTrackPart(float distance, int trackPart)
	{
		float length = 0;
		for(int i = 0; i < trackPart + 1; i++)
		{
			if(i != 0)
			{
				length += distBetweenPoints(points.get(i - 1), points.get(i));
			}
		}
		return length;
	}
	
	public Vector3f getPositionOnTrack(float distance)
	{
		
		int trackPart = getTrackPart(distance);
		Vector3f p2 = points.get((trackPart == 0) ? points.size() - 1 : trackPart - 1);
		Vector3f p1 = points.get(trackPart);
		
		float partLength = distBetweenPoints(p2, p1);
		float prog =
			distance - (getProgressAlongTrackPart(distance, (trackPart == 0) ? points.size() - 1 : trackPart - 1));
		float progress = prog / partLength;
		
		return new Vector3f(lerp(p2.x, p1.x, progress), lerp(p2.y, p1.y, progress), lerp(p2.z, p1.z, progress));
	}
	
	public float lerp(float a, float b, float f)
	{
		return (a + f * (b - a));
	}
	
}
