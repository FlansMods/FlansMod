package com.flansmod.common.driveables.mechas;

public enum EnumMechaItemType
{
	upgrade, tool, armUpgrade, legUpgrade, headUpgrade, shoulderUpgrade, feetUpgrade, hipsUpgrade, nothing;
	
	public static EnumMechaItemType getToolType(String s)
	{
		for(EnumMechaItemType type : values())
		{
			if(type.toString().equals(s))
				return type;
		}
		return nothing;
	}
	
	public EnumMechaSlotType[] getValidSlots()
	{
		switch(this)
		{
			case upgrade: return new EnumMechaSlotType[]{EnumMechaSlotType.u1, EnumMechaSlotType.u2, EnumMechaSlotType.u3, EnumMechaSlotType.u4, EnumMechaSlotType.u5};
			case tool: return new EnumMechaSlotType[]{EnumMechaSlotType.leftTool, EnumMechaSlotType.rightTool};
			case armUpgrade: return new EnumMechaSlotType[]{EnumMechaSlotType.leftArm, EnumMechaSlotType.rightArm};
			case legUpgrade: return new EnumMechaSlotType[]{EnumMechaSlotType.legs};
			case headUpgrade: return new EnumMechaSlotType[]{EnumMechaSlotType.head};
			case shoulderUpgrade: return new EnumMechaSlotType[]{EnumMechaSlotType.leftShoulder, EnumMechaSlotType.rightShoulder};
			case feetUpgrade: return new EnumMechaSlotType[]{EnumMechaSlotType.feet};
			case hipsUpgrade: return new EnumMechaSlotType[]{EnumMechaSlotType.hips};
			default: return new EnumMechaSlotType[]{};
		}
	}
	
}
