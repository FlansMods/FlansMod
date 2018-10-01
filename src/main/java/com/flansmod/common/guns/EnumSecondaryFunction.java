package com.flansmod.common.guns;

public enum EnumSecondaryFunction
{
	ZOOM, ADS_ZOOM, MELEE, CUSTOM_MELEE;
	
	public static EnumSecondaryFunction get(String s)
	{
		s = s.toLowerCase();
		if(s.equals("zoom"))
			return ZOOM;
		else if(s.equals("melee"))
			return MELEE;
		else if(s.equals("custommelee"))
			return CUSTOM_MELEE;
		else return ADS_ZOOM;
	}
}
