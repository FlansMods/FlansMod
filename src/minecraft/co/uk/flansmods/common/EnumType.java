package co.uk.flansmods.common;

import co.uk.flansmods.common.driveables.EntityPlane;
import co.uk.flansmods.common.driveables.EntityVehicle;
import co.uk.flansmods.common.driveables.PlaneType;
import co.uk.flansmods.common.driveables.VehicleType;
import co.uk.flansmods.common.driveables.mechas.EntityMecha;
import co.uk.flansmods.common.driveables.mechas.MechaType;

public enum EnumType 
{
	bullet("bullets"), aa("aaguns"), vehicle("vehicles"), plane("planes"), mechaItem("mechaItems"), mecha("mechas"), gun("guns"), grenade("grenades"), tool("tools"), armour("armorFiles"), playerClass("classes"), team("teams"), box("boxes"), part("parts");
	
	public String folderName;
	
	private EnumType(String s)
	{
		folderName = s;
	}
	
	public static EnumType get(String s)
	{
		for(EnumType e : values())
		{
			if(e.folderName.equals(s))
				return e;
		}
		return null;
	}
	
	public static EnumType getFromObject(Object o)
	{
		if(o instanceof EntityMecha || o instanceof MechaType) return mecha;
		if(o instanceof EntityPlane || o instanceof PlaneType) return plane;
		if(o instanceof EntityVehicle || o instanceof VehicleType) return vehicle;
		return null;
	}
}
