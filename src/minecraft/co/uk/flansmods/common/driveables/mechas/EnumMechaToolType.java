package co.uk.flansmods.common.driveables.mechas;

public enum EnumMechaToolType 
{
	pickaxe, axe, shovel, sword;
	
	public static EnumMechaToolType getToolType(String s)
	{
		for(EnumMechaToolType type : values())
		{
			if(type.toString().equals(s))
				return type;
		}
		return sword;
	}
}
