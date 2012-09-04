package flan.server;

import net.minecraft.server.MinecraftServer;
import net.minecraft.src.*;

public abstract class ServerPlayerBase
{
	protected final EntityPlayerMP player;
	private final ServerHexAPI playerAPI;

	public ServerPlayerBase(ServerHexAPI var1)
	{
		this.playerAPI = var1;
		this.player = var1.player;
	}

	public void beforeLocalConstructing(MinecraftServer var1, World var2, String var3, ItemInWorldManager var4)
	{
	}

	public void afterLocalConstructing(MinecraftServer var1, World var2, String var3, ItemInWorldManager var4)
	{
	}

	public final int hashCode()
	{
		return super.hashCode();
	}

	public void beforeAttackEntityFrom(DamageSource var1, int var2)
	{
	}

	public boolean attackEntityFrom(DamageSource var1, int var2)
	{
		ServerPlayerBase var3 = this.playerAPI.GetOverwrittenAttackEntityFrom(this);
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

	public void beforeAttackTargetEntityWithCurrentItem(Entity var1)
	{
	}

	public void attackTargetEntityWithCurrentItem(Entity var1)
	{
		ServerPlayerBase var2 = this.playerAPI.GetOverwrittenAttackTargetEntityWithCurrentItem(this);

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

	public void beforeCanHarvestBlock(Block var1)
	{
	}

	public boolean canHarvestBlock(Block var1)
	{
		ServerPlayerBase var2 = this.playerAPI.GetOverwrittenCanHarvestBlock(this);
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
		ServerPlayerBase var4 = this.playerAPI.GetOverwrittenCanPlayerEdit(this);
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
		ServerPlayerBase var1 = this.playerAPI.GetOverwrittenCanTriggerWalking(this);
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

	public void beforeDamageEntity(DamageSource var1, int var2)
	{
	}

	public void damageEntity(DamageSource var1, int var2)
	{
		ServerPlayerBase var3 = this.playerAPI.GetOverwrittenDamageEntity(this);

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

	public void beforeDisplayGUIChest(IInventory var1)
	{
	}

	public void displayGUIChest(IInventory var1)
	{
		ServerPlayerBase var2 = this.playerAPI.GetOverwrittenDisplayGUIChest(this);

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
		ServerPlayerBase var2 = this.playerAPI.GetOverwrittenDisplayGUIDispenser(this);

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

	public void beforeDisplayGUIFurnace(TileEntityFurnace var1)
	{
	}

	public void displayGUIFurnace(TileEntityFurnace var1)
	{
		ServerPlayerBase var2 = this.playerAPI.GetOverwrittenDisplayGUIFurnace(this);

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
		ServerPlayerBase var4 = this.playerAPI.GetOverwrittenDisplayWorkbenchGUI(this);

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
		ServerPlayerBase var1 = this.playerAPI.GetOverwrittenDropOneItem(this);
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
		ServerPlayerBase var2 = this.playerAPI.GetOverwrittenDropPlayerItem(this);
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

	public void beforeFall(float var1)
	{
	}

	public void fall(float var1)
	{
		ServerPlayerBase var2 = this.playerAPI.GetOverwrittenFall(this);

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

	public void beforeGetCurrentPlayerStrVsBlock(Block var1)
	{
	}

	public float getCurrentPlayerStrVsBlock(Block var1)
	{
		ServerPlayerBase var2 = this.playerAPI.GetOverwrittenGetCurrentPlayerStrVsBlock(this);
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
		ServerPlayerBase var7 = this.playerAPI.GetOverwrittenGetDistanceSq(this);
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

	public void beforeGetBrightness(float var1)
	{
	}

	public float getBrightness(float var1)
	{
		ServerPlayerBase var2 = this.playerAPI.GetOverwrittenGetBrightness(this);
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

	public void beforeGetEyeHeight()
	{
	}

	public float getEyeHeight()
	{
		ServerPlayerBase var1 = this.playerAPI.GetOverwrittenGetEyeHeight(this);
		float var2;

		if (var1 == null)
		{
			var2 = this.player.localGetEyeHeight();
		} else if (var1 != this)
		{
			var2 = var1.getEyeHeight();
		} else
		{
			var2 = 0.0F;
		}

		return var2;
	}

	public void afterGetEyeHeight()
	{
	}

	public void beforeGetSpeedModifier()
	{
	}

	public float getSpeedModifier()
	{
		ServerPlayerBase var1 = this.playerAPI.GetOverwrittenGetSpeedModifier(this);
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

	public void beforeHeal(int var1)
	{
	}

	public void heal(int var1)
	{
		ServerPlayerBase var2 = this.playerAPI.GetOverwrittenHeal(this);

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

	public void beforeInteract(EntityPlayer var1)
	{
	}

	public boolean interact(EntityPlayer var1)
	{
		ServerPlayerBase var2 = this.playerAPI.GetOverwrittenInteract(this);
		boolean var3;

		if (var2 == null)
		{
			var3 = this.player.localInteract(var1);
		} else if (var2 != this)
		{
			var3 = var2.interact(var1);
		} else
		{
			var3 = false;
		}

		return var3;
	}

	public void afterInteract(EntityPlayer var1)
	{
	}

	public void beforeIsEntityInsideOpaqueBlock()
	{
	}

	public boolean isEntityInsideOpaqueBlock()
	{
		ServerPlayerBase var1 = this.playerAPI.GetOverwrittenIsEntityInsideOpaqueBlock(this);
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
		ServerPlayerBase var1 = this.playerAPI.GetOverwrittenIsInWater(this);
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
		ServerPlayerBase var2 = this.playerAPI.GetOverwrittenIsInsideOfMaterial(this);
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
		ServerPlayerBase var1 = this.playerAPI.GetOverwrittenIsOnLadder(this);
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

	public void beforeIsPlayerSleeping()
	{
	}

	public boolean isPlayerSleeping()
	{
		ServerPlayerBase var1 = this.playerAPI.GetOverwrittenIsPlayerSleeping(this);
		boolean var2;

		if (var1 == null)
		{
			var2 = this.player.localIsPlayerSleeping();
		} else if (var1 != this)
		{
			var2 = var1.isPlayerSleeping();
		} else
		{
			var2 = false;
		}

		return var2;
	}

	public void afterIsPlayerSleeping()
	{
	}

	public void beforeJump()
	{
	}

	public void jump()
	{
		ServerPlayerBase var1 = this.playerAPI.GetOverwrittenJump(this);

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

	public void beforeMoveEntity(double var1, double var3, double var5)
	{
	}

	public void moveEntity(double var1, double var3, double var5)
	{
		ServerPlayerBase var7 = this.playerAPI.GetOverwrittenMoveEntity(this);

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
		ServerPlayerBase var3 = this.playerAPI.GetOverwrittenMoveEntityWithHeading(this);

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
		ServerPlayerBase var4 = this.playerAPI.GetOverwrittenMoveFlying(this);

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
		ServerPlayerBase var2 = this.playerAPI.GetOverwrittenOnDeath(this);

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
		ServerPlayerBase var1 = this.playerAPI.GetOverwrittenOnLivingUpdate(this);

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
		ServerPlayerBase var2 = this.playerAPI.GetOverwrittenOnKillEntity(this);

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
		ServerPlayerBase var1 = this.playerAPI.GetOverwrittenOnUpdate(this);

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

	public void beforeOnUpdateEntity()
	{
	}

	public void onUpdateEntity()
	{
		ServerPlayerBase var1 = this.playerAPI.GetOverwrittenOnUpdateEntity(this);

		if (var1 == null)
		{
			this.player.localOnUpdateEntity();
		} else if (var1 != this)
		{
			var1.onUpdateEntity();
		}
	}

	public void afterOnUpdateEntity()
	{
	}

	public void beforeReadEntityFromNBT(NBTTagCompound var1)
	{
	}

	public void readEntityFromNBT(NBTTagCompound var1)
	{
		ServerPlayerBase var2 = this.playerAPI.GetOverwrittenReadEntityFromNBT(this);

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

	public void beforeSetDead()
	{
	}

	public void setDead()
	{
		ServerPlayerBase var1 = this.playerAPI.GetOverwrittenSetDead(this);

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

	public void beforeSetPosition(double var1, double var3, double var5)
	{
	}

	public void setPosition(double var1, double var3, double var5)
	{
		ServerPlayerBase var7 = this.playerAPI.GetOverwrittenSetPosition(this);

		if (var7 == null)
		{
			this.player.localSetPosition(var1, var3, var5);
		} else if (var7 != this)
		{
			var7.setPosition(var1, var3, var5);
		}
	}

	public void afterSetPosition(double var1, double var3, double var5)
	{
	}

	public void beforeUpdateEntityActionState()
	{
	}

	public void updateEntityActionState()
	{
		ServerPlayerBase var1 = this.playerAPI.GetOverwrittenUpdateEntityActionState(this);

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
		ServerPlayerBase var2 = this.playerAPI.GetOverwrittenWriteEntityToNBT(this);

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
