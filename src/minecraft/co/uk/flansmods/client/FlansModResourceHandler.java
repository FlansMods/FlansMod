package co.uk.flansmods.client;

import java.util.HashMap;

import co.uk.flansmods.common.DriveableType;
import co.uk.flansmods.common.GunType;
import co.uk.flansmods.common.InfoType;
import net.minecraft.util.ResourceLocation;

public class FlansModResourceHandler 
{
	private static HashMap<InfoType, ResourceLocation> iconMap = new HashMap<InfoType, ResourceLocation>();
	private static HashMap<InfoType, ResourceLocation> textureMap = new HashMap<InfoType, ResourceLocation>();
	private static HashMap<GunType, ResourceLocation> scopeMap = new HashMap<GunType, ResourceLocation>();
	
	
	public static ResourceLocation getIcon(InfoType infoType)
	{
		if(iconMap.containsKey(infoType))
		{
			return iconMap.get(infoType);
		}
		ResourceLocation resLoc = new ResourceLocation("Flan/" + infoType.contentPack, "textures/items/" + infoType.iconPath + ".png");
		iconMap.put(infoType, resLoc);
		return resLoc;
	}	
	
	public static ResourceLocation getTexture(InfoType infoType)
	{
		if(textureMap.containsKey(infoType))
		{
			return textureMap.get(infoType);
		}
		ResourceLocation resLoc = new ResourceLocation("Flan/" + infoType.contentPack, "skins/" + infoType.texture + ".png");
		textureMap.put(infoType, resLoc);
		return resLoc;
	}
	
	public static ResourceLocation getScope(GunType gunType)
	{
		if(textureMap.containsKey(gunType))
		{
			return textureMap.get(gunType);
		}
		ResourceLocation resLoc = new ResourceLocation("Flan/" + gunType.contentPack, "gui/" + gunType.scope + ".png");
		textureMap.put(gunType, resLoc);
		return resLoc;
	}
	
	
}
