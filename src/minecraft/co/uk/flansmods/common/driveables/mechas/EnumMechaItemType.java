package co.uk.flansmods.common.driveables.mechas;

public enum EnumMechaItemType 
{
	upgrade, tool, armUpgrade, legUpgrade, headUpgrade, shoulderUpgrade, hipsUpgrade, nothing;
	
	public static EnumMechaItemType getToolType(String s)
	{
		for(EnumMechaItemType type : values())
		{
			if(type.toString().equals(s))
				return type;
		}
		return nothing;
	}
	
}
