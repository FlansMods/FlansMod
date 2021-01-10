package com.flansmod.common;

public class ModuloHelper
{
	public static int divide(int x, int y)
	{
		int z = x / y;
		return z < 0 ? z - 1 : z;
	}
	
	public static int modulo(int x, int y)
	{
		int z = x % y;
		return z < 0 ? z + y : z;
	}
	
	public static double modulo(double x, double y)
	{
		double z = x % y;
		return z < 0 ? z + y : z;
	}
}
