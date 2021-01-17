package com.flansmod.common.guns;

public enum EnumSpreadPattern 
{
	circle,
	cube,
	triangle,
	horizontal,
	vertical;
	
	public static EnumSpreadPattern get(String s)
	{
		s = s.toLowerCase();
		if(s.equals("circle"))
			return circle;
		else if(s.equals("rectangle"))
			return cube;
		else if(s.equals("triangle"))
			return triangle;
		
		
		return null;
	}
}
