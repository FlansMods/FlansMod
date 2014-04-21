package com.flansmod.common.driveables.mechas;

public enum EnumMechaSlotType 
{
	leftTool, rightTool, leftArm, rightArm, head, leftShoulder, rightShoulder, hips, legs, feet, u1, u2, u3, u4, u5;
	
	public boolean accepts(EnumMechaItemType type)
	{
		switch(this)
		{
		case leftTool : case rightTool : 					return type == EnumMechaItemType.tool;
		case leftArm : 	case rightArm : 					return type == EnumMechaItemType.armUpgrade;
		case head : 										return type == EnumMechaItemType.headUpgrade;
		case leftShoulder : case rightShoulder : 			return type == EnumMechaItemType.shoulderUpgrade;
		case legs :											return type == EnumMechaItemType.legUpgrade;
		case hips : 										return type == EnumMechaItemType.hipsUpgrade;
		case feet : 										return type == EnumMechaItemType.feetUpgrade;
		case u1 : case u2 : case u3 : case u4 : case u5 : 	return type == EnumMechaItemType.upgrade;
		}
		return false;
	}
}