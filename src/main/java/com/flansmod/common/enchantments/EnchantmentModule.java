package com.flansmod.common.enchantments;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.FireableGun;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EnchantmentModule 
{
	public static final EnumEnchantmentType SHIELDS = EnumHelper.addEnchantmentType("shields", (item)->(item instanceof ItemShield));
	public static final EnumEnchantmentType GLOVES = EnumHelper.addEnchantmentType("gloves", (item)->(item instanceof ItemGlove));
	public static final EnumEnchantmentType OFF_HAND = EnumHelper.addEnchantmentType("offHand", (item)->(item instanceof ItemGlove || item instanceof ItemShield));
	
	public static Enchantment STEADY_ENCHANT,
								NIMBLE_ENCHANT,
								LUMBERJACK_ENCHANT,
								DUELIST_ENCHANT,
								SHARPSHOOTER_ENCHANT,
								JUGGERNAUT_ENCHANT;
	
	public EnchantmentModule()
	{
		
	}
	
	public void PreInit()
	{
		MinecraftForge.EVENT_BUS.register(this);
		STEADY_ENCHANT = new EnchantmentSteady().setRegistryName("enchantment_steady").setName("enchantment_steady");
		NIMBLE_ENCHANT = new EnchantmentNimble().setRegistryName("enchantment_nimble").setName("enchantment_nimble");
		LUMBERJACK_ENCHANT = new EnchantmentLumberjack().setRegistryName("enchantment_lumberjack").setName("enchantment_lumberjack");
		DUELIST_ENCHANT = new EnchantmentDuelist().setRegistryName("enchantment_duelist").setName("enchantment_duelist");
		SHARPSHOOTER_ENCHANT = new EnchantmentSharpshooter().setRegistryName("enchantment_sharpshooter").setName("enchantment_sharpshooter");
		JUGGERNAUT_ENCHANT = new EnchantmentJuggernaut().setRegistryName("enchantment_juggernaut").setName("enchantment_juggernaut");
	}
	
	public void Init()
	{
		
	}
	
	public void PostInit()
	{
		
	}
	
	@SubscribeEvent
	public void RegisterEnchants(RegistryEvent.Register<Enchantment> event)
	{
		event.getRegistry().register(STEADY_ENCHANT);
		event.getRegistry().register(NIMBLE_ENCHANT);
		event.getRegistry().register(LUMBERJACK_ENCHANT);
		event.getRegistry().register(DUELIST_ENCHANT);
		event.getRegistry().register(SHARPSHOOTER_ENCHANT);
		event.getRegistry().register(JUGGERNAUT_ENCHANT);
	}
	
	@SubscribeEvent
	public void AttackEvent(LivingHurtEvent event)
	{
		Entity trueSource = event.getSource().getTrueSource();
		if(trueSource != null && trueSource instanceof EntityLivingBase)
		{
			EntityLivingBase attacker = (EntityLivingBase)trueSource;
			ItemStack weaponStack = attacker.getHeldItemMainhand();
			ItemStack offHandStack = attacker.getHeldItemOffhand();
			
			// Apply lumberjack offhand effect
			if(weaponStack.getItem() instanceof ItemAxe)
			{
				int lumberjackLevel = EnchantmentHelper.getEnchantmentLevel(LUMBERJACK_ENCHANT, offHandStack);
				// Add 10% damage for each level of Lumberjack on the glove (multiplicative)
				for(int i = 0; i < lumberjackLevel; i++)
					event.setAmount(event.getAmount() * 1.10f);
				
				if(lumberjackLevel > 0)
					offHandStack.damageItem(1, attacker);
			}
			// Apply duelist offhand effect
			if(weaponStack.getItem() instanceof ItemSword)
			{
				int duelistLevel = EnchantmentHelper.getEnchantmentLevel(DUELIST_ENCHANT, offHandStack);
				// Add 10% damage for each level of Duelist on the glove (multiplicative)
				for(int i = 0; i < duelistLevel; i++)
					event.setAmount(event.getAmount() * 1.10f);
				
				if(duelistLevel > 0)
					offHandStack.damageItem(1, attacker);
			}
			
			// Then apply juggernaut effects
			int juggernautLevel = 0;
			for(ItemStack armour : event.getEntityLiving().getArmorInventoryList())
			{
				juggernautLevel += EnchantmentHelper.getEnchantmentLevel(JUGGERNAUT_ENCHANT, armour);
			}
			
			if(juggernautLevel > 0)
			{
				final float minPercent = 0.25f; // With all 4 armour pieces enchanted, we drop to 25% max damage per hit
				final float exponent = (float)Math.log(minPercent) / 4f; // 4 because that's the theoretical max level of the enchant
				
				float maxDamageAsPercentOfHP = (float)Math.exp(exponent * juggernautLevel);
				
				float maxHP = event.getEntityLiving().getMaxHealth() + event.getEntityLiving().getTotalArmorValue();
				
				if(event.getAmount() > maxHP * maxDamageAsPercentOfHP)
				{
					float absorbedDmg = event.getAmount() - maxHP * maxDamageAsPercentOfHP;
					// Don't want to just annihalate the armour in edge cases. That would be :(
					if(absorbedDmg > 256.0f)
						absorbedDmg = 256.0f;
					for(ItemStack armour : event.getEntityLiving().getArmorInventoryList())
					{
						if(EnchantmentHelper.getEnchantmentLevel(JUGGERNAUT_ENCHANT, armour) > 0)
						{
							armour.damageItem(MathHelper.floor(absorbedDmg), event.getEntityLiving());
						}
					}
					
					
					FlansMod.log.info("Juggernaut applied to incoming damage of " + event.getAmount() + " over the threshold of " + (maxHP * maxDamageAsPercentOfHP));
					event.setAmount(maxHP * maxDamageAsPercentOfHP);
				}
			}

			
		}
	}

	public static void ModifyGun(FireableGun fireableGun, EntityLivingBase entity, ItemStack otherHand) 
	{
		if(!FlansMod.enchantmentModuleEnabled)
			return;
		
		int steadyLevel = EnchantmentHelper.getEnchantmentLevel(STEADY_ENCHANT, otherHand);
		// Cut 25% of spread for each level of Steady on the glove (multiplicative)
		for(int i = 0; i < steadyLevel; i++)
			fireableGun.MultiplySpread(0.75f);

		
		int sharpshooterLevel = EnchantmentHelper.getEnchantmentLevel(SHARPSHOOTER_ENCHANT, otherHand);
		// Add 10% damage for each level of Sharpshooter on the glove (multiplicative)
		for(int i = 0; i < sharpshooterLevel; i++)
			fireableGun.MultiplyDamage(1.10f);		
		
		if(steadyLevel > 0 || sharpshooterLevel > 0)
			otherHand.damageItem(1, entity);
	}

	public static float ModifyReloadTime(float reloadTime, EntityLivingBase entity, ItemStack otherHand) 
	{
		if(!FlansMod.enchantmentModuleEnabled)
			return reloadTime;
		
		int nimbleLevel = EnchantmentHelper.getEnchantmentLevel(NIMBLE_ENCHANT, otherHand);
		// Cut 15% of reload time for each level of Nimble on the glove (multiplicative)
		for(int i = 0; i < nimbleLevel; i++)
			reloadTime *= 0.85f;
		if(nimbleLevel > 0)
			otherHand.damageItem(1, entity);
		
		return reloadTime;
	}
}
