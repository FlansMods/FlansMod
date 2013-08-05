package co.uk.flansmods.common;

public enum EnumType 
{
	bullet("bullets"), aa("aaguns"), vehicle("vehicles"), plane("planes"), gun("guns"), armour("armorFiles"), playerClass("classes"), team("teams"), box("boxes"), part("parts");
	
	public String folderName;
	
	private EnumType(String s)
	{
		folderName = s;
	}
}
