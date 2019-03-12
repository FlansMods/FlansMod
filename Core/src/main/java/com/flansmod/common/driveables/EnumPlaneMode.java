package com.flansmod.common.driveables;

public enum EnumPlaneMode
{
	PLANE, VTOL, HELI;
	
	public static EnumPlaneMode getMode(String s)
	{
		if(s.toLowerCase().equals("vtol"))
			return VTOL;
		if(s.toLowerCase().equals("heli"))
			return HELI;
		return PLANE;
	}
}
