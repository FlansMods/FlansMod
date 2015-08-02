package com.flansmod.common.types;

import com.flansmod.common.ItemHolderType;
import com.flansmod.common.TileEntityItemHolder;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.driveables.mechas.ItemMechaAddon;
import com.flansmod.common.driveables.mechas.MechaItemType;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.guns.AAGunType;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.EntityAAGun;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.EntityMG;
import com.flansmod.common.guns.GrenadeType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemAttachment;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.boxes.BlockGunBox;
import com.flansmod.common.guns.boxes.GunBoxType;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.teams.ArmourBoxType;
import com.flansmod.common.teams.ArmourType;
import com.flansmod.common.teams.BlockArmourBox;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.teams.PlayerClass;
import com.flansmod.common.teams.Team;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.tools.ToolType;

public enum EnumType 
{
	part("parts"), bullet("bullets"), attachment("attachments"), grenade("grenades"), gun("guns"), aa("aaguns"), vehicle("vehicles"), plane("planes"), mechaItem("mechaItems"), mecha("mechas"), tool("tools"), armour("armorFiles"), armourBox("armorBoxes"), box("boxes"), playerClass("classes"), team("teams"), itemHolder("itemHolders");
	
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
	
	public Class<? extends InfoType> getTypeClass()
	{
		switch(this)
		{
		case bullet : 		return BulletType.class;
		case aa : 			return AAGunType.class;
		case vehicle :		return VehicleType.class;
		case plane : 		return PlaneType.class;
		case mechaItem : 	return MechaItemType.class;
		case mecha : 		return MechaType.class;
		case attachment : 	return AttachmentType.class;
		case gun : 			return GunType.class;
		case grenade : 		return GrenadeType.class;
		case tool :			return ToolType.class;
		case armour : 		return ArmourType.class;
		case armourBox : 	return ArmourBoxType.class;
		case playerClass :	return PlayerClass.class;
		case team :			return Team.class;
		case box :			return GunBoxType.class;
		case part :			return PartType.class;
		case itemHolder:	return ItemHolderType.class;
		default : 		return InfoType.class;
		}
	}

	public static EnumType getFromObject(Object o)
	{
		if(o instanceof EntityMecha || o instanceof MechaType) return mecha;
		if(o instanceof EntityPlane || o instanceof PlaneType) return plane;
		if(o instanceof EntityVehicle || o instanceof VehicleType) return vehicle;
		if(o instanceof EntityBullet || o instanceof BulletType) return bullet;
		if(o instanceof EntityAAGun || o instanceof AAGunType) return aa;
		if(o instanceof ItemMechaAddon || o instanceof MechaItemType) return mechaItem;
		if(o instanceof ItemAttachment || o instanceof AttachmentType) return attachment;
		if(o instanceof ItemGun || o instanceof EntityMG || o instanceof GunType) return gun;
		if(o instanceof EntityGrenade || o instanceof GrenadeType) return grenade;
		if(o instanceof ItemTool || o instanceof ToolType) return tool;
		if(o instanceof ItemTeamArmour || o instanceof ArmourType) return armour;
		if(o instanceof BlockArmourBox || o instanceof ArmourBoxType) return armourBox;
		if(o instanceof PlayerClass) return playerClass;
		if(o instanceof Team) return team;
		if(o instanceof BlockGunBox || o instanceof GunBoxType) return box;
		if(o instanceof ItemPart || o instanceof PartType) return part;
		if(o instanceof TileEntityItemHolder || o instanceof ItemHolderType) return itemHolder;
		return null;
	}
}
