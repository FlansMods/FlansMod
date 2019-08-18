package com.flansmod.utils;

public class MathUtils 
{
	public static double clampd(double val, double min, double max) 
	{
	     return (int) Math.max(min, Math.min(max, val));
	}
	public static float clampf(float val, float min, float max) 
	{
	     return (float) Math.max(min, Math.min(max, val));
	}
}
