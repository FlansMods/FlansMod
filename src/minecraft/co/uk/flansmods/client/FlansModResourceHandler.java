package co.uk.flansmods.client;

import java.util.HashMap;
import co.uk.flansmods.common.InfoType;
import net.minecraft.util.ResourceLocation;

public class FlansModResourceHandler 
{
	private static HashMap<InfoType, ResourceLocation> iconMap = new HashMap<InfoType, ResourceLocation>();
	
	
	
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
	
	
}
