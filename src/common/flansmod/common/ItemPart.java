package flansmod.common;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemPart extends Item
{
	public ItemPart(int i, PartType type1)
	{
		super(i);
		type = type1;
		setIconIndex(type.iconIndex);
		setMaxStackSize(type.stackSize);
		if(type.category == 9)
		{
			setMaxDamage(type.fuel);
			setHasSubtypes(true);
		}
		type.item = this;
		setTabToDisplayOn(CreativeTabs.tabMaterials);
	}
	
	public String getTextureFile()
    {
        return "/spriteSheets/parts.png";
    }
	
	public int getColorFromDamage(int i)
    {
        return type.colour;
    }

	public PartType type;
}