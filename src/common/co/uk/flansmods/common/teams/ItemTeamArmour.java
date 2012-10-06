package co.uk.flansmods.common.teams;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.DamageSource;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import net.minecraftforge.common.ISpecialArmor;

public class ItemTeamArmour extends ItemArmor implements ISpecialArmor, IArmorTextureProvider {
	
	public ArmourType type;
	
	public ItemTeamArmour(ArmourType t)
	{
		super(t.itemID - 256, EnumArmorMaterial.CLOTH, 0, t.type);
		type = t;
		setIconIndex(type.iconIndex);
		setCreativeTab(CreativeTabs.tabCombat);
	}

	public ItemTeamArmour(int ID, EnumArmorMaterial armorMaterial, int renderIndex, int armourType) 
	{
		super(ID, armorMaterial, renderIndex, armourType);
	}

	@Override
	public ArmorProperties getProperties(EntityLiving player, ItemStack armor, DamageSource source, double damage, int slot) 
	{
		return new ArmorProperties(1, type.defence, Integer.MAX_VALUE);
	}

	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) 
	{
		return (int)(type.defence * 20);
	}

	@Override
	public void damageArmor(EntityLiving entity, ItemStack stack, DamageSource source, int damage, int slot) 
	{
		//Do nothing to the armour. It should not break as that would leave the player's team ambiguous
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) 
	{
		return "/armor/" + type.armourTextureName + "_" + (type.type == 2 ? "2" : "1") + ".png";
	}

	public String getTextureFile()
	{
		return "/spriteSheets/armour.png";
	}

	public int getColorFromDamage(int i, int j)
	{
		return type.colour;
	}
}
