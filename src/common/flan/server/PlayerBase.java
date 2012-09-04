package flan.server;

import net.minecraft.client.Minecraft;
import net.minecraft.src.*;

public abstract class PlayerBase
{
	protected final EntityPlayerSP player;
	private final HexAPI playerAPI;

	public PlayerBase(HexAPI var1)
	{
		this.playerAPI = var1;
		this.player = var1.player;
	}

	public void beforeLocalConstructing(Minecraft var1, World var2, Session var3, int var4)
	{
	}

	public void afterLocalConstructing(Minecraft var1, World var2, Session var3, int var4)
	{
	}

	public final int hashCode()
	{
		return super.hashCode();
	}

	public void beforeAddExhaustion(float var1)
	{
	}

	public void addExhaustion(float var1)
	{
		PlayerBase var2 = this.playerAPI.GetOverwrittenAddExhaustion(this);

		if (var2 == null)
		{
			this.player.localAddExhaustion(var1);
		} else if (var2 != this)
		{
			var2.addExhaustion(var1);
		}
	}

	public void afterAddExhaustion(float var1)
	{
	}

	public void beforeAddMovementStat(double var1, double var3, double var5)
	{
	}

	public void addMovementStat(double var1, double var3, double var5)
	{
		PlayerBase var7 = this.playerAPI.GetOverwrittenAddMovementStat(this);

		if (var7 == null)
		{
			this.player.localAddMovementStat(var1, var3, var5);
		} else if (var7 != this)
		{
			var7.addMovementStat(var1, var3, var5);
		}
	}

	public void afterAddMovementStat(double var1, double var3, double var5)
	{
	}

	public void beforeAddStat(StatBase var1, int var2)
	{
	}

	public void addStat(StatBase var1, int var2)
	{
		PlayerBase var3 = this.playerAPI.GetOverwrittenAddStat(this);

		if (var3 == null)
		{
			this.player.localAddStat(var1, var2);
		} else if (var3 != this)
		{
			var3.addStat(var1, var2);
		}
	}

	public void afterAddStat(StatBase var1, int var2)
	{
	}

	public void beforeAttackEntityFrom(DamageSource var1, int var2)
	{
	}

	public boolean attackEntityFrom(DamageSource var1, int var2)
	{
		PlayerBase var3 = this.playerAPI.GetOverwrittenAttackEntityFrom(this);
		boolean var4;

		if (var3 == null)
		{
			var4 = this.player.localAttackEntityFrom(var1, var2);
		} else if (var3 != this)
		{
			var4 = var3.attackEntityFrom(var1, var2);
		} else
		{
			var4 = false;
		}

		return var4;
	}

	public void afterAttackEntityFrom(DamageSource var1, int var2)
	{
	}

	public void beforeAlertWolves(EntityLiving var1, boolean var2)
	{
	}

	public void alertWolves(EntityLiving var1, boolean var2)
	{
		PlayerBase var3 = this.playerAPI.GetOverwrittenAlertWolves(this);

		if (var3 == null)
		{
			this.player.localAlertWolves(var1, var2);
		} else if (var3 != this)
		{
			var3.alertWolves(var1, var2);
		}
	}

	public void afterAlertWolves(EntityLiving var1, boolean var2)
	{
	}

	public void beforeAttackTargetEntityWithCurrentItem(Entity var1)
	{
	}

	public void attackTargetEntityWithCurrentItem(Entity var1)
	{
		PlayerBase var2 = this.playerAPI.GetOverwrittenAttackTargetEntityWithCurrentItem(this);

		if (var2 == null)
		{
			this.player.localAttackTargetEntityWithCurrentItem(var1);
		} else if (var2 != this)
		{
			var2.attackTargetEntityWithCurrentItem(var1);
		}
	}

	public void afterAttackTargetEntityWithCurrentItem(Entity var1)
	{
	}

	public void beforeCanBreatheUnderwater()
	{
	}

	public boolean canBreatheUnderwater()
	{
		PlayerBase var1 = this.playerAPI.GetOverwrittenCanBreatheUnderwater(this);
		boolean var2;

		if (var1 == null)
		{
			var2 = this.player.localCanBreatheUnderwater();
		} else if (var1 != this)
		{
			var2 = var1.canBreatheUnderwater();
		} else
		{
			var2 = false;
		}

		return var2;
	}

	public void afterCanBreatheUnderwater()
	{
	}

	public void beforeCanHarvestBlock(Block var1)
	{
	}

	public boolean canHarvestBlock(Block var1)
	{
		PlayerBase var2 = this.playerAPI.GetOverwrittenCanHarvestBlock(this);
		boolean var3;

		if (var2 == null)
		{
			var3 = this.player.localCanHarvestBlock(var1);
		} else if (var2 != this)
		{
			var3 = var2.canHarvestBlock(var1);
		} else
		{
			var3 = false;
		}

		return var3;
	}

	public void afterCanHarvestBlock(Block var1)
	{
	}

	public void beforeCanPlayerEdit(int var1, int var2, int var3)
	{
	}

	public boolean canPlayerEdit(int var1, int var2, int var3)
	{
		PlayerBase var4 = this.playerAPI.GetOverwrittenCanPlayerEdit(this);
		boolean var5;

		if (var4 == null)
		{
			var5 = this.player.localCanPlayerEdit(var1, var2, var3);
		} else if (var4 != this)
		{
			var5 = var4.canPlayerEdit(var1, var2, var3);
		} else
		{
			var5 = false;
		}

		return var5;
	}

	public void afterCanPlayerEdit(int var1, int var2, int var3)
	{
	}

	public void beforeCanTriggerWalking()
	{
	}

	public boolean canTriggerWalking()
	{
		PlayerBase var1 = this.playerAPI.GetOverwrittenCanTriggerWalking(this);
		boolean var2;

		if (var1 == null)
		{
			var2 = this.player.localCanTriggerWalking();
		} else if (var1 != this)
		{
			var2 = var1.canTriggerWalking();
		} else
		{
			var2 = false;
		}

		return var2;
	}

	public void afterCanTriggerWalking()
	{
	}

	public void beforeCloseScreen()
	{
	}

	public void closeScreen()
	{
		PlayerBase var1 = this.playerAPI.GetOverwrittenCloseScreen(this);

		if (var1 == null)
		{
			this.player.localCloseScreen();
		} else if (var1 != this)
		{
			var1.closeScreen();
		}
	}

	public void afterCloseScreen()
	{
	}

	public void beforeDamageEntity(DamageSource var1, int var2)
	{
	}

	public void damageEntity(DamageSource var1, int var2)
	{
		PlayerBase var3 = this.playerAPI.GetOverwrittenDamageEntity(this);

		if (var3 == null)
		{
			this.player.localDamageEntity(var1, var2);
		} else if (var3 != this)
		{
			var3.damageEntity(var1, var2);
		}
	}

	public void afterDamageEntity(DamageSource var1, int var2)
	{
	}

	public void beforeDisplayGUIBrewingStand(TileEntityBrewingStand var1)
	{
	}

	public void displayGUIBrewingStand(TileEntityBrewingStand var1)
	{
		PlayerBase var2 = this.playerAPI.GetOverwrittenDisplayGUIBrewingStand(this);

		if (var2 == null)
		{
			this.player.localDisplayGUIBrewingStand(var1);
		} else if (var2 != this)
		{
			var2.displayGUIBrewingStand(var1);
		}
	}

	public void afterDisplayGUIBrewingStand(TileEntityBrewingStand var1)
	{
	}

	public void beforeDisplayGUIChest(IInventory var1)
	{
	}

	public void displayGUIChest(IInventory var1)
	{
		PlayerBase var2 = this.playerAPI.GetOverwrittenDisplayGUIChest(this);

		if (var2 == null)
		{
			this.player.localDisplayGUIChest(var1);
		} else if (var2 != this)
		{
			var2.displayGUIChest(var1);
		}
	}

	public void afterDisplayGUIChest(IInventory var1)
	{
	}

	public void beforeDisplayGUIDispenser(TileEntityDispenser var1)
	{
	}

	public void displayGUIDispenser(TileEntityDispenser var1)
	{
		PlayerBase var2 = this.playerAPI.GetOverwrittenDisplayGUIDispenser(this);

		if (var2 == null)
		{
			this.player.localDisplayGUIDispenser(var1);
		} else if (var2 != this)
		{
			var2.displayGUIDispenser(var1);
		}
	}

	public void afterDisplayGUIDispenser(TileEntityDispenser var1)
	{
	}

	public void beforeDisplayGUIEditSign(TileEntitySign var1)
	{
	}

	public void displayGUIEditSign(TileEntitySign var1)
	{
		PlayerBase var2 = this.playerAPI.GetOverwrittenDisplayGUIEditSign(this);

		if (var2 == null)
		{
			this.player.localDisplayGUIEditSign(var1);
		} else if (var2 != this)
		{
			var2.displayGUIEditSign(var1);
		}
	}

	public void afterDisplayGUIEditSign(TileEntitySign var1)
	{
	}

	public void beforeDisplayGUIEnchantment(int var1, int var2, int var3)
	{
	}

	public void displayGUIEnchantment(int var1, int var2, int var3)
	{
		PlayerBase var4 = this.playerAPI.GetOverwrittenDisplayGUIEnchantment(this);

		if (var4 == null)
		{
			this.player.localDisplayGUIEnchantment(var1, var2, var3);
		} else if (var4 != this)
		{
			var4.displayGUIEnchantment(var1, var2, var3);
		}
	}

	public void afterDisplayGUIEnchantment(int var1, int var2, int var3)
	{
	}

	public void beforeDisplayGUIFurnace(TileEntityFurnace var1)
	{
	}

	public void displayGUIFurnace(TileEntityFurnace var1)
	{
		PlayerBase var2 = this.playerAPI.GetOverwrittenDisplayGUIFurnace(this);

		if (var2 == null)
		{
			this.player.localDisplayGUIFurnace(var1);
		} else if (var2 != this)
		{
			var2.displayGUIFurnace(var1);
		}
	}

	public void afterDisplayGUIFurnace(TileEntityFurnace var1)
	{
	}

	public void beforeDisplayWorkbenchGUI(int var1, int var2, int var3)
	{
	}

	public void displayWorkbenchGUI(int var1, int var2, int var3)
	{
		PlayerBase var4 = this.playerAPI.GetOverwrittenDisplayWorkbenchGUI(this);

		if (var4 == null)
		{
			this.player.localDisplayWorkbenchGUI(var1, var2, var3);
		} else if (var4 != this)
		{
			var4.displayWorkbenchGUI(var1, var2, var3);
		}
	}

	public void afterDisplayWorkbenchGUI(int var1, int var2, int var3)
	{
	}

	public void beforeDropOneItem()
	{
	}

	public EntityItem dropOneItem()
	{
		PlayerBase var1 = this.playerAPI.GetOverwrittenDropOneItem(this);
		EntityItem var2;

		if (var1 == null)
		{
			var2 = this.player.localDropOneItem();
		} else if (var1 != this)
		{
			var2 = var1.dropOneItem();
		} else
		{
			var2 = null;
		}

		return var2;
	}

	public void afterDropOneItem()
	{
	}

	public void beforeDropPlayerItem(ItemStack var1)
	{
	}

	public EntityItem dropPlayerItem(ItemStack var1)
	{
		PlayerBase var2 = this.playerAPI.GetOverwrittenDropPlayerItem(this);
		EntityItem var3;

		if (var2 == null)
		{
			var3 = this.player.localDropPlayerItem(var1);
		} else if (var2 != this)
		{
			var3 = var2.dropPlayerItem(var1);
		} else
		{
			var3 = null;
		}

		return var3;
	}

	public void afterDropPlayerItem(ItemStack var1)
	{
	}

	public void beforeDropPlayerItemWithRandomChoice(ItemStack var1, boolean var2)
	{
	}

	public EntityItem dropPlayerItemWithRandomChoice(ItemStack var1, boolean var2)
	{
		PlayerBase var3 = this.playerAPI.GetOverwrittenDropPlayerItemWithRandomChoice(this);
		EntityItem var4;

		if (var3 == null)
		{
			var4 = this.player.localDropPlayerItemWithRandomChoice(var1, var2);
		} else if (var3 != this)
		{
			var4 = var3.dropPlayerItemWithRandomChoice(var1, var2);
		} else
		{
			var4 = null;
		}

		return var4;
	}

	public void afterDropPlayerItemWithRandomChoice(ItemStack var1, boolean var2)
	{
	}

	public void beforeFall(float var1)
	{
	}

	public void fall(float var1)
	{
		PlayerBase var2 = this.playerAPI.GetOverwrittenFall(this);

		if (var2 == null)
		{
			this.player.localFall(var1);
		} else if (var2 != this)
		{
			var2.fall(var1);
		}
	}

	public void afterFall(float var1)
	{
	}

	public void beforeGetBrightness(float var1)
	{
	}

	public float getBrightness(float var1)
	{
		PlayerBase var2 = this.playerAPI.GetOverwrittenGetBrightness(this);
		float var3;

		if (var2 == null)
		{
			var3 = this.player.localGetBrightness(var1);
		} else if (var2 != this)
		{
			var3 = var2.getBrightness(var1);
		} else
		{
			var3 = 0.0F;
		}

		return var3;
	}

	public void afterGetBrightness(float var1)
	{
	}

	public void beforeGetBrightnessForRender(float var1)
	{
	}

	public int getBrightnessForRender(float var1)
	{
		PlayerBase var2 = this.playerAPI.GetOverwrittenGetBrightnessForRender(this);
		int var3;

		if (var2 == null)
		{
			var3 = this.player.localGetBrightnessForRender(var1);
		} else if (var2 != this)
		{
			var3 = var2.getBrightnessForRender(var1);
		} else
		{
			var3 = 0;
		}

		return var3;
	}

	public void afterGetBrightnessForRender(float var1)
	{
	}

	public void beforeGetCurrentPlayerStrVsBlock(Block var1)
	{
	}

	public float getCurrentPlayerStrVsBlock(Block var1)
	{
		PlayerBase var2 = this.playerAPI.GetOverwrittenGetCurrentPlayerStrVsBlock(this);
		float var3;

		if (var2 == null)
		{
			var3 = this.player.localGetCurrentPlayerStrVsBlock(var1);
		} else if (var2 != this)
		{
			var3 = var2.getCurrentPlayerStrVsBlock(var1);
		} else
		{
			var3 = 0.0F;
		}

		return var3;
	}

	public void afterGetCurrentPlayerStrVsBlock(Block var1)
	{
	}

	public void beforeGetDistanceSq(double var1, double var3, double var5)
	{
	}

	public double getDistanceSq(double var1, double var3, double var5)
	{
		PlayerBase var7 = this.playerAPI.GetOverwrittenGetDistanceSq(this);
		double var8;

		if (var7 == null)
		{
			var8 = this.player.localGetDistanceSq(var1, var3, var5);
		} else if (var7 != this)
		{
			var8 = var7.getDistanceSq(var1, var3, var5);
		} else
		{
			var8 = 0.0D;
		}

		return var8;
	}

	public void afterGetDistanceSq(double var1, double var3, double var5)
	{
	}

	public void beforeGetDistanceSqToEntity(Entity var1)
	{
	}

	public double getDistanceSqToEntity(Entity var1)
	{
		PlayerBase var2 = this.playerAPI.GetOverwrittenGetDistanceSqToEntity(this);
		double var3;

		if (var2 == null)
		{
			var3 = this.player.localGetDistanceSqToEntity(var1);
		} else if (var2 != this)
		{
			var3 = var2.getDistanceSqToEntity(var1);
		} else
		{
			var3 = 0.0D;
		}

		return var3;
	}

	public void afterGetDistanceSqToEntity(Entity var1)
	{
	}

	public void beforeGetFOVMultiplier()
	{
	}

	public float getFOVMultiplier()
	{
		PlayerBase var1 = this.playerAPI.GetOverwrittenGetFOVMultiplier(this);
		float var2;

		if (var1 == null)
		{
			var2 = this.player.localGetFOVMultiplier();
		} else if (var1 != this)
		{
			var2 = var1.getFOVMultiplier();
		} else
		{
			var2 = 0.0F;
		}

		return var2;
	}

	public void afterGetFOVMultiplier()
	{
	}

	public void beforeGetHurtSound()
	{
	}

	public String getHurtSound()
	{
		PlayerBase var1 = this.playerAPI.GetOverwrittenGetHurtSound(this);
		String var2;

		if (var1 == null)
		{
			var2 = this.player.localGetHurtSound();
		} else if (var1 != this)
		{
			var2 = var1.getHurtSound();
		} else
		{
			var2 = null;
		}

		return var2;
	}

	public void afterGetHurtSound()
	{
	}

	public void beforeGetItemIcon(ItemStack var1, int var2)
	{
	}

	public int getItemIcon(ItemStack var1, int var2)
	{
		PlayerBase var3 = this.playerAPI.GetOverwrittenGetItemIcon(this);
		int var4;

		if (var3 == null)
		{
			var4 = this.player.localGetItemIcon(var1, var2);
		} else if (var3 != this)
		{
			var4 = var3.getItemIcon(var1, var2);
		} else
		{
			var4 = 0;
		}

		return var4;
	}

	public void afterGetItemIcon(ItemStack var1, int var2)
	{
	}

	public void beforeGetSleepTimer()
	{
	}

	public int getSleepTimer()
	{
		PlayerBase var1 = this.playerAPI.GetOverwrittenGetSleepTimer(this);
		int var2;

		if (var1 == null)
		{
			var2 = this.player.localGetSleepTimer();
		} else if (var1 != this)
		{
			var2 = var1.getSleepTimer();
		} else
		{
			var2 = 0;
		}

		return var2;
	}

	public void afterGetSleepTimer()
	{
	}

	public void beforeGetSpeedModifier()
	{
	}

	public float getSpeedModifier()
	{
		PlayerBase var1 = this.playerAPI.GetOverwrittenGetSpeedModifier(this);
		float var2;

		if (var1 == null)
		{
			var2 = this.player.localGetSpeedModifier();
		} else if (var1 != this)
		{
			var2 = var1.getSpeedModifier();
		} else
		{
			var2 = 0.0F;
		}

		return var2;
	}

	public void afterGetSpeedModifier()
	{
	}

	public void beforeHandleLavaMovement()
	{
	}

	public boolean handleLavaMovement()
	{
		PlayerBase var1 = this.playerAPI.GetOverwrittenHandleLavaMovement(this);
		boolean var2;

		if (var1 == null)
		{
			var2 = this.player.localHandleLavaMovement();
		} else if (var1 != this)
		{
			var2 = var1.handleLavaMovement();
		} else
		{
			var2 = false;
		}

		return var2;
	}

	public void afterHandleLavaMovement()
	{
	}

	public void beforeHandleWaterMovement()
	{
	}

	public boolean handleWaterMovement()
	{
		PlayerBase var1 = this.playerAPI.GetOverwrittenHandleWaterMovement(this);
		boolean var2;

		if (var1 == null)
		{
			var2 = this.player.localHandleWaterMovement();
		} else if (var1 != this)
		{
			var2 = var1.handleWaterMovement();
		} else
		{
			var2 = false;
		}

		return var2;
	}

	public void afterHandleWaterMovement()
	{
	}

	public void beforeHeal(int var1)
	{
	}

	public void heal(int var1)
	{
		PlayerBase var2 = this.playerAPI.GetOverwrittenHeal(this);

		if (var2 == null)
		{
			this.player.localHeal(var1);
		} else if (var2 != this)
		{
			var2.heal(var1);
		}
	}

	public void afterHeal(int var1)
	{
	}

	public void beforeIsEntityInsideOpaqueBlock()
	{
	}

	public boolean isEntityInsideOpaqueBlock()
	{
		PlayerBase var1 = this.playerAPI.GetOverwrittenIsEntityInsideOpaqueBlock(this);
		boolean var2;

		if (var1 == null)
		{
			var2 = this.player.localIsEntityInsideOpaqueBlock();
		} else if (var1 != this)
		{
			var2 = var1.isEntityInsideOpaqueBlock();
		} else
		{
			var2 = false;
		}

		return var2;
	}

	public void afterIsEntityInsideOpaqueBlock()
	{
	}

	public void beforeIsInWater()
	{
	}

	public boolean isInWater()
	{
		PlayerBase var1 = this.playerAPI.GetOverwrittenIsInWater(this);
		boolean var2;

		if (var1 == null)
		{
			var2 = this.player.localIsInWater();
		} else if (var1 != this)
		{
			var2 = var1.isInWater();
		} else
		{
			var2 = false;
		}

		return var2;
	}

	public void afterIsInWater()
	{
	}

	public void beforeIsInsideOfMaterial(Material var1)
	{
	}

	public boolean isInsideOfMaterial(Material var1)
	{
		PlayerBase var2 = this.playerAPI.GetOverwrittenIsInsideOfMaterial(this);
		boolean var3;

		if (var2 == null)
		{
			var3 = this.player.localIsInsideOfMaterial(var1);
		} else if (var2 != this)
		{
			var3 = var2.isInsideOfMaterial(var1);
		} else
		{
			var3 = false;
		}

		return var3;
	}

	public void afterIsInsideOfMaterial(Material var1)
	{
	}

	public void beforeIsOnLadder()
	{
	}

	public boolean isOnLadder()
	{
		PlayerBase var1 = this.playerAPI.GetOverwrittenIsOnLadder(this);
		boolean var2;

		if (var1 == null)
		{
			var2 = this.player.localIsOnLadder();
		} else if (var1 != this)
		{
			var2 = var1.isOnLadder();
		} else
		{
			var2 = false;
		}

		return var2;
	}

	public void afterIsOnLadder()
	{
	}

	public void beforeIsSneaking()
	{
	}

	public boolean isSneaking()
	{
		PlayerBase var1 = this.playerAPI.GetOverwrittenIsSneaking(this);
		boolean var2;

		if (var1 == null)
		{
			var2 = this.player.localIsSneaking();
		} else if (var1 != this)
		{
			var2 = var1.isSneaking();
		} else
		{
			var2 = false;
		}

		return var2;
	}

	public void afterIsSneaking()
	{
	}

	public void beforeIsSprinting()
	{
	}

	public boolean isSprinting()
	{
		PlayerBase var1 = this.playerAPI.GetOverwrittenIsSprinting(this);
		boolean var2;

		if (var1 == null)
		{
			var2 = this.player.localIsSprinting();
		} else if (var1 != this)
		{
			var2 = var1.isSprinting();
		} else
		{
			var2 = false;
		}

		return var2;
	}

	public void afterIsSprinting()
	{
	}

	public void beforeJump()
	{
	}

	public void jump()
	{
		PlayerBase var1 = this.playerAPI.GetOverwrittenJump(this);

		if (var1 == null)
		{
			this.player.localJump();
		} else if (var1 != this)
		{
			var1.jump();
		}
	}

	public void afterJump()
	{
	}

	public void beforeKnockBack(Entity var1, int var2, double var3, double var5)
	{
	}

	public void knockBack(Entity var1, int var2, double var3, double var5)
	{
		PlayerBase var7 = this.playerAPI.GetOverwrittenKnockBack(this);

		if (var7 == null)
		{
			this.player.localKnockBack(var1, var2, var3, var5);
		} else if (var7 != this)
		{
			var7.knockBack(var1, var2, var3, var5);
		}
	}

	public void afterKnockBack(Entity var1, int var2, double var3, double var5)
	{
	}

	public void beforeMoveEntity(double var1, double var3, double var5)
	{
	}

	public void moveEntity(double var1, double var3, double var5)
	{
		PlayerBase var7 = this.playerAPI.GetOverwrittenMoveEntity(this);

		if (var7 == null)
		{
			this.player.localMoveEntity(var1, var3, var5);
		} else if (var7 != this)
		{
			var7.moveEntity(var1, var3, var5);
		}
	}

	public void afterMoveEntity(double var1, double var3, double var5)
	{
	}

	public void beforeMoveEntityWithHeading(float var1, float var2)
	{
	}

	public void moveEntityWithHeading(float var1, float var2)
	{
		PlayerBase var3 = this.playerAPI.GetOverwrittenMoveEntityWithHeading(this);

		if (var3 == null)
		{
			this.player.localMoveEntityWithHeading(var1, var2);
		} else if (var3 != this)
		{
			var3.moveEntityWithHeading(var1, var2);
		}
	}

	public void afterMoveEntityWithHeading(float var1, float var2)
	{
	}

	public void beforeMoveFlying(float var1, float var2, float var3)
	{
	}

	public void moveFlying(float var1, float var2, float var3)
	{
		PlayerBase var4 = this.playerAPI.GetOverwrittenMoveFlying(this);

		if (var4 == null)
		{
			this.player.localMoveFlying(var1, var2, var3);
		} else if (var4 != this)
		{
			var4.moveFlying(var1, var2, var3);
		}
	}

	public void afterMoveFlying(float var1, float var2, float var3)
	{
	}

	public void beforeOnDeath(DamageSource var1)
	{
	}

	public void onDeath(DamageSource var1)
	{
		PlayerBase var2 = this.playerAPI.GetOverwrittenOnDeath(this);

		if (var2 == null)
		{
			this.player.localOnDeath(var1);
		} else if (var2 != this)
		{
			var2.onDeath(var1);
		}
	}

	public void afterOnDeath(DamageSource var1)
	{
	}

	public void beforeOnLivingUpdate()
	{
	}

	public void onLivingUpdate()
	{
		PlayerBase var1 = this.playerAPI.GetOverwrittenOnLivingUpdate(this);

		if (var1 == null)
		{
			this.player.localOnLivingUpdate();
		} else if (var1 != this)
		{
			var1.onLivingUpdate();
		}
	}

	public void afterOnLivingUpdate()
	{
	}

	public void beforeOnKillEntity(EntityLiving var1)
	{
	}

	public void onKillEntity(EntityLiving var1)
	{
		PlayerBase var2 = this.playerAPI.GetOverwrittenOnKillEntity(this);

		if (var2 == null)
		{
			this.player.localOnKillEntity(var1);
		} else if (var2 != this)
		{
			var2.onKillEntity(var1);
		}
	}

	public void afterOnKillEntity(EntityLiving var1)
	{
	}

	public void beforeOnUpdate()
	{
	}

	public void onUpdate()
	{
		PlayerBase var1 = this.playerAPI.GetOverwrittenOnUpdate(this);

		if (var1 == null)
		{
			this.player.localOnUpdate();
		} else if (var1 != this)
		{
			var1.onUpdate();
		}
	}

	public void afterOnUpdate()
	{
	}

	public void beforePlayStepSound(int var1, int var2, int var3, int var4)
	{
	}

	public void playStepSound(int var1, int var2, int var3, int var4)
	{
		PlayerBase var5 = this.playerAPI.GetOverwrittenPlayStepSound(this);

		if (var5 == null)
		{
			this.player.localPlayStepSound(var1, var2, var3, var4);
		} else if (var5 != this)
		{
			var5.playStepSound(var1, var2, var3, var4);
		}
	}

	public void afterPlayStepSound(int var1, int var2, int var3, int var4)
	{
	}

	public void beforePushOutOfBlocks(double var1, double var3, double var5)
	{
	}

	public boolean pushOutOfBlocks(double var1, double var3, double var5)
	{
		PlayerBase var7 = this.playerAPI.GetOverwrittenPushOutOfBlocks(this);
		boolean var8;

		if (var7 == null)
		{
			var8 = this.player.localPushOutOfBlocks(var1, var3, var5);
		} else if (var7 != this)
		{
			var8 = var7.pushOutOfBlocks(var1, var3, var5);
		} else
		{
			var8 = false;
		}

		return var8;
	}

	public void afterPushOutOfBlocks(double var1, double var3, double var5)
	{
	}

	public void beforeRayTrace(double var1, float var3)
	{
	}

	public MovingObjectPosition rayTrace(double var1, float var3)
	{
		PlayerBase var4 = this.playerAPI.GetOverwrittenRayTrace(this);
		MovingObjectPosition var5;

		if (var4 == null)
		{
			var5 = this.player.localRayTrace(var1, var3);
		} else if (var4 != this)
		{
			var5 = var4.rayTrace(var1, var3);
		} else
		{
			var5 = null;
		}

		return var5;
	}

	public void afterRayTrace(double var1, float var3)
	{
	}

	public void beforeReadEntityFromNBT(NBTTagCompound var1)
	{
	}

	public void readEntityFromNBT(NBTTagCompound var1)
	{
		PlayerBase var2 = this.playerAPI.GetOverwrittenReadEntityFromNBT(this);

		if (var2 == null)
		{
			this.player.localReadEntityFromNBT(var1);
		} else if (var2 != this)
		{
			var2.readEntityFromNBT(var1);
		}
	}

	public void afterReadEntityFromNBT(NBTTagCompound var1)
	{
	}

	public void beforeRespawnPlayer()
	{
	}

	public void respawnPlayer()
	{
		PlayerBase var1 = this.playerAPI.GetOverwrittenRespawnPlayer(this);

		if (var1 == null)
		{
			this.player.localRespawnPlayer();
		} else if (var1 != this)
		{
			var1.respawnPlayer();
		}
	}

	public void afterRespawnPlayer()
	{
	}

	public void beforeSetDead()
	{
	}

	public void setDead()
	{
		PlayerBase var1 = this.playerAPI.GetOverwrittenSetDead(this);

		if (var1 == null)
		{
			this.player.localSetDead();
		} else if (var1 != this)
		{
			var1.setDead();
		}
	}

	public void afterSetDead()
	{
	}

	public void beforeSetPositionAndRotation(double var1, double var3, double var5, float var7, float var8)
	{
	}

	public void setPositionAndRotation(double var1, double var3, double var5, float var7, float var8)
	{
		PlayerBase var9 = this.playerAPI.GetOverwrittenSetPositionAndRotation(this);

		if (var9 == null)
		{
			this.player.localSetPositionAndRotation(var1, var3, var5, var7, var8);
		} else if (var9 != this)
		{
			var9.setPositionAndRotation(var1, var3, var5, var7, var8);
		}
	}

	public void afterSetPositionAndRotation(double var1, double var3, double var5, float var7, float var8)
	{
	}

	public void beforeSleepInBedAt(int var1, int var2, int var3)
	{
	}

	public EnumStatus sleepInBedAt(int var1, int var2, int var3)
	{
		PlayerBase var4 = this.playerAPI.GetOverwrittenSleepInBedAt(this);
		EnumStatus var5;

		if (var4 == null)
		{
			var5 = this.player.localSleepInBedAt(var1, var2, var3);
		} else if (var4 != this)
		{
			var5 = var4.sleepInBedAt(var1, var2, var3);
		} else
		{
			var5 = null;
		}

		return var5;
	}

	public void afterSleepInBedAt(int var1, int var2, int var3)
	{
	}

	public void beforeSwingItem()
	{
	}

	public void swingItem()
	{
		PlayerBase var1 = this.playerAPI.GetOverwrittenSwingItem(this);

		if (var1 == null)
		{
			this.player.localSwingItem();
		} else if (var1 != this)
		{
			var1.swingItem();
		}
	}

	public void afterSwingItem()
	{
	}

	public void beforeUpdateEntityActionState()
	{
	}

	public void updateEntityActionState()
	{
		PlayerBase var1 = this.playerAPI.GetOverwrittenUpdateEntityActionState(this);

		if (var1 == null)
		{
			this.player.localUpdateEntityActionState();
		} else if (var1 != this)
		{
			var1.updateEntityActionState();
		}
	}

	public void afterUpdateEntityActionState()
	{
	}

	public void beforeWriteEntityToNBT(NBTTagCompound var1)
	{
	}

	public void writeEntityToNBT(NBTTagCompound var1)
	{
		PlayerBase var2 = this.playerAPI.GetOverwrittenWriteEntityToNBT(this);

		if (var2 == null)
		{
			this.player.localWriteEntityToNBT(var1);
		} else if (var2 != this)
		{
			var2.writeEntityToNBT(var1);
		}
	}

	public void afterWriteEntityToNBT(NBTTagCompound var1)
	{
	}
}