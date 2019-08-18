package com.flansmod.common.guns;

public enum EnumAttachmentType
{
	barrel, sights, stock, grip, gadget, slide, pump, accessory, generic;
	
	public static EnumAttachmentType get(String s)
	{
		for(EnumAttachmentType type : values())
		{
			if(type.toString().equals(s))
				return type;
		}
		return generic;
	}
}
