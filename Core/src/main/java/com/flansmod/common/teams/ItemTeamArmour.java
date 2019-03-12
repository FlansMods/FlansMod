package com.flansmod.common.teams;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import com.google.common.collect.Multimap;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;

public class ItemTeamArmour extends ItemArmor implements ISpecialArmor, IFlanItem
{
	public ArmourType type;
	protected static final UUID[] uuid = new UUID[]{UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID()};
	
	public ItemTeamArmour(ArmourType t)
	{
		super(ItemArmor.ArmorMaterial.LEATHER, 0, EntityEquipmentSlot.values()[5 - t.type]);
		type = t;
		type.item = this;
		setRegistryName(type.shortName);
		setCreativeTab(FlansMod.tabFlanTeams);
	}
	
	public ItemTeamArmour(ItemArmor.ArmorMaterial armorMaterial, int renderIndex, int armourType)
	{
		super(armorMaterial, renderIndex, EntityEquipmentSlot.values()[5 - armourType]);
	}
	
	@Override
	public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot)
	{
		return new ArmorProperties(1, type.defence, Integer.MAX_VALUE);
	}
	
	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot)
	{
		return (int)(type.defence * 20);
	}
	
	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot)
	{
		//Do nothing to the armour. It should not break as that would leave the player's team ambiguous
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String armourType)
	{
		return "flansmod:armor/" + type.armourTextureName + "_" + (type.type == 2 ? "2" : "1") + ".png";
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		return type.model;
	}
	
	@Override
	public void addInformation(ItemStack stack, World world, List<String> lines, ITooltipFlag b)
	{
		if(type.description != null)
		{
			Collections.addAll(lines, type.description.split("_"));
		}
		if(Math.abs(type.jumpModifier - 1F) > 0.01F)
			lines.add("\u00a73+" + (int)((type.jumpModifier - 1F) * 100F) + "% Jump Height");
		if(type.smokeProtection)
			lines.add("\u00a72+Smoke Protection");
		if(type.nightVision)
			lines.add("\u00a72+Night Vision");
		if(type.negateFallDamage)
			lines.add("\u00a72+Negates Fall Damage");
	}
	
	protected static final UUID KNOCKBACK_RESIST_MODIFIER = UUID.fromString("77777777-645C-4F38-A497-9C13A33DB5CF");
	protected static final UUID MOVEMENT_SPEED_MODIFIER = UUID.fromString("99999999-4180-4865-B01B-BCCE9785ACA3");
	
	@Override
	public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack)
	{
		Multimap multimap = super.getAttributeModifiers(slot, stack);
		/** 0 = Helmet, 1 = Chestplate, 2 = Legs, 3 = Shoes */
		boolean bShouldAdd = false;
		switch(type.type)
		{
			case 0: bShouldAdd = slot == EntityEquipmentSlot.HEAD;
				break;
			case 1: bShouldAdd = slot == EntityEquipmentSlot.CHEST;
				break;
			case 2: bShouldAdd = slot == EntityEquipmentSlot.LEGS;
				break;
			case 3: bShouldAdd = slot == EntityEquipmentSlot.FEET;
				break;
		}
		if(bShouldAdd)
		{
			multimap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName(), new AttributeModifier(uuid[type.type], "KnockbackResist", type.knockbackModifier, 0));
			multimap.put(SharedMonsterAttributes.MOVEMENT_SPEED.getName(), new AttributeModifier(uuid[type.type], "MovementSpeed", type.moveSpeedModifier - 1.0f, 2));
		}
		return multimap;
	}
	
	@Override
	public InfoType getInfoType()
	{
		return type;
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		if(type.nightVision && FlansMod.ticker % 25 == 0)
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(16), 250)); // 16 = night vision
		if(type.jumpModifier > 1.01F && FlansMod.ticker % 25 == 0)
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(8), 250, (int)((type.jumpModifier - 1F) * 2F), true, false)); // 8 = jump boost
		if(type.negateFallDamage)
			player.fallDistance = 0F;
	}
}
