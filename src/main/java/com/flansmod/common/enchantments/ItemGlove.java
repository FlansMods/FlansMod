package com.flansmod.common.enchantments;

import java.util.List;

import javax.annotation.Nullable;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemGlove extends Item implements IFlanItem
{
	
	private GloveType mType;
	
	public ItemGlove(GloveType glove)
	{
		mType = glove;	
		maxStackSize = 1;
		glove.item = this;
		setMaxDamage(mType.Durability);
		setRegistryName(glove.shortName);
		setTranslationKey(glove.shortName);
		setCreativeTab(FlansMod.tabFlanTeams);
	}
	
	@Override
	public InfoType getInfoType() 
	{
		return mType;
	}

	@Override
    public int getItemEnchantability()
    {
        return mType.Enchantability;
    }
	
    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
    	tooltip.add("\u00a73Improves gun, sword or axe handling when enchanted and held in off hand");
    	tooltip.add("\u00a73Works with two-handed guns");
    }
}
