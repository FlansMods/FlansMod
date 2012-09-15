package co.uk.flansmods.common;

public final class ServerPlayerBaseSorting
{
	private String[] beforeLocalConstructingSuperiors = null;
	private String[] beforeLocalConstructingInferiors = null;
	private String[] afterLocalConstructingSuperiors = null;
	private String[] afterLocalConstructingInferiors = null;
	private String[] beforeAttackEntityFromSuperiors = null;
	private String[] beforeAttackEntityFromInferiors = null;
	private String[] overrideAttackEntityFromSuperiors = null;
	private String[] overrideAttackEntityFromInferiors = null;
	private String[] afterAttackEntityFromSuperiors = null;
	private String[] afterAttackEntityFromInferiors = null;
	private String[] beforeAttackTargetEntityWithCurrentItemSuperiors = null;
	private String[] beforeAttackTargetEntityWithCurrentItemInferiors = null;
	private String[] overrideAttackTargetEntityWithCurrentItemSuperiors = null;
	private String[] overrideAttackTargetEntityWithCurrentItemInferiors = null;
	private String[] afterAttackTargetEntityWithCurrentItemSuperiors = null;
	private String[] afterAttackTargetEntityWithCurrentItemInferiors = null;
	private String[] beforeCanHarvestBlockSuperiors = null;
	private String[] beforeCanHarvestBlockInferiors = null;
	private String[] overrideCanHarvestBlockSuperiors = null;
	private String[] overrideCanHarvestBlockInferiors = null;
	private String[] afterCanHarvestBlockSuperiors = null;
	private String[] afterCanHarvestBlockInferiors = null;
	private String[] beforeCanPlayerEditSuperiors = null;
	private String[] beforeCanPlayerEditInferiors = null;
	private String[] overrideCanPlayerEditSuperiors = null;
	private String[] overrideCanPlayerEditInferiors = null;
	private String[] afterCanPlayerEditSuperiors = null;
	private String[] afterCanPlayerEditInferiors = null;
	private String[] beforeCanTriggerWalkingSuperiors = null;
	private String[] beforeCanTriggerWalkingInferiors = null;
	private String[] overrideCanTriggerWalkingSuperiors = null;
	private String[] overrideCanTriggerWalkingInferiors = null;
	private String[] afterCanTriggerWalkingSuperiors = null;
	private String[] afterCanTriggerWalkingInferiors = null;
	private String[] beforeDamageEntitySuperiors = null;
	private String[] beforeDamageEntityInferiors = null;
	private String[] overrideDamageEntitySuperiors = null;
	private String[] overrideDamageEntityInferiors = null;
	private String[] afterDamageEntitySuperiors = null;
	private String[] afterDamageEntityInferiors = null;
	private String[] beforeDisplayGUIChestSuperiors = null;
	private String[] beforeDisplayGUIChestInferiors = null;
	private String[] overrideDisplayGUIChestSuperiors = null;
	private String[] overrideDisplayGUIChestInferiors = null;
	private String[] afterDisplayGUIChestSuperiors = null;
	private String[] afterDisplayGUIChestInferiors = null;
	private String[] beforeDisplayGUIDispenserSuperiors = null;
	private String[] beforeDisplayGUIDispenserInferiors = null;
	private String[] overrideDisplayGUIDispenserSuperiors = null;
	private String[] overrideDisplayGUIDispenserInferiors = null;
	private String[] afterDisplayGUIDispenserSuperiors = null;
	private String[] afterDisplayGUIDispenserInferiors = null;
	private String[] beforeDisplayGUIFurnaceSuperiors = null;
	private String[] beforeDisplayGUIFurnaceInferiors = null;
	private String[] overrideDisplayGUIFurnaceSuperiors = null;
	private String[] overrideDisplayGUIFurnaceInferiors = null;
	private String[] afterDisplayGUIFurnaceSuperiors = null;
	private String[] afterDisplayGUIFurnaceInferiors = null;
	private String[] beforeDisplayWorkbenchGUISuperiors = null;
	private String[] beforeDisplayWorkbenchGUIInferiors = null;
	private String[] overrideDisplayWorkbenchGUISuperiors = null;
	private String[] overrideDisplayWorkbenchGUIInferiors = null;
	private String[] afterDisplayWorkbenchGUISuperiors = null;
	private String[] afterDisplayWorkbenchGUIInferiors = null;
	private String[] beforeDropOneItemSuperiors = null;
	private String[] beforeDropOneItemInferiors = null;
	private String[] overrideDropOneItemSuperiors = null;
	private String[] overrideDropOneItemInferiors = null;
	private String[] afterDropOneItemSuperiors = null;
	private String[] afterDropOneItemInferiors = null;
	private String[] beforeDropPlayerItemSuperiors = null;
	private String[] beforeDropPlayerItemInferiors = null;
	private String[] overrideDropPlayerItemSuperiors = null;
	private String[] overrideDropPlayerItemInferiors = null;
	private String[] afterDropPlayerItemSuperiors = null;
	private String[] afterDropPlayerItemInferiors = null;
	private String[] beforeFallSuperiors = null;
	private String[] beforeFallInferiors = null;
	private String[] overrideFallSuperiors = null;
	private String[] overrideFallInferiors = null;
	private String[] afterFallSuperiors = null;
	private String[] afterFallInferiors = null;
	private String[] beforeGetCurrentPlayerStrVsBlockSuperiors = null;
	private String[] beforeGetCurrentPlayerStrVsBlockInferiors = null;
	private String[] overrideGetCurrentPlayerStrVsBlockSuperiors = null;
	private String[] overrideGetCurrentPlayerStrVsBlockInferiors = null;
	private String[] afterGetCurrentPlayerStrVsBlockSuperiors = null;
	private String[] afterGetCurrentPlayerStrVsBlockInferiors = null;
	private String[] beforeGetDistanceSqSuperiors = null;
	private String[] beforeGetDistanceSqInferiors = null;
	private String[] overrideGetDistanceSqSuperiors = null;
	private String[] overrideGetDistanceSqInferiors = null;
	private String[] afterGetDistanceSqSuperiors = null;
	private String[] afterGetDistanceSqInferiors = null;
	private String[] beforeGetBrightnessSuperiors = null;
	private String[] beforeGetBrightnessInferiors = null;
	private String[] overrideGetBrightnessSuperiors = null;
	private String[] overrideGetBrightnessInferiors = null;
	private String[] afterGetBrightnessSuperiors = null;
	private String[] afterGetBrightnessInferiors = null;
	private String[] beforeGetEyeHeightSuperiors = null;
	private String[] beforeGetEyeHeightInferiors = null;
	private String[] overrideGetEyeHeightSuperiors = null;
	private String[] overrideGetEyeHeightInferiors = null;
	private String[] afterGetEyeHeightSuperiors = null;
	private String[] afterGetEyeHeightInferiors = null;
	private String[] beforeGetSpeedModifierSuperiors = null;
	private String[] beforeGetSpeedModifierInferiors = null;
	private String[] overrideGetSpeedModifierSuperiors = null;
	private String[] overrideGetSpeedModifierInferiors = null;
	private String[] afterGetSpeedModifierSuperiors = null;
	private String[] afterGetSpeedModifierInferiors = null;
	private String[] beforeHealSuperiors = null;
	private String[] beforeHealInferiors = null;
	private String[] overrideHealSuperiors = null;
	private String[] overrideHealInferiors = null;
	private String[] afterHealSuperiors = null;
	private String[] afterHealInferiors = null;
	private String[] beforeInteractSuperiors = null;
	private String[] beforeInteractInferiors = null;
	private String[] overrideInteractSuperiors = null;
	private String[] overrideInteractInferiors = null;
	private String[] afterInteractSuperiors = null;
	private String[] afterInteractInferiors = null;
	private String[] beforeIsEntityInsideOpaqueBlockSuperiors = null;
	private String[] beforeIsEntityInsideOpaqueBlockInferiors = null;
	private String[] overrideIsEntityInsideOpaqueBlockSuperiors = null;
	private String[] overrideIsEntityInsideOpaqueBlockInferiors = null;
	private String[] afterIsEntityInsideOpaqueBlockSuperiors = null;
	private String[] afterIsEntityInsideOpaqueBlockInferiors = null;
	private String[] beforeIsInWaterSuperiors = null;
	private String[] beforeIsInWaterInferiors = null;
	private String[] overrideIsInWaterSuperiors = null;
	private String[] overrideIsInWaterInferiors = null;
	private String[] afterIsInWaterSuperiors = null;
	private String[] afterIsInWaterInferiors = null;
	private String[] beforeIsInsideOfMaterialSuperiors = null;
	private String[] beforeIsInsideOfMaterialInferiors = null;
	private String[] overrideIsInsideOfMaterialSuperiors = null;
	private String[] overrideIsInsideOfMaterialInferiors = null;
	private String[] afterIsInsideOfMaterialSuperiors = null;
	private String[] afterIsInsideOfMaterialInferiors = null;
	private String[] beforeIsOnLadderSuperiors = null;
	private String[] beforeIsOnLadderInferiors = null;
	private String[] overrideIsOnLadderSuperiors = null;
	private String[] overrideIsOnLadderInferiors = null;
	private String[] afterIsOnLadderSuperiors = null;
	private String[] afterIsOnLadderInferiors = null;
	private String[] beforeIsPlayerSleepingSuperiors = null;
	private String[] beforeIsPlayerSleepingInferiors = null;
	private String[] overrideIsPlayerSleepingSuperiors = null;
	private String[] overrideIsPlayerSleepingInferiors = null;
	private String[] afterIsPlayerSleepingSuperiors = null;
	private String[] afterIsPlayerSleepingInferiors = null;
	private String[] beforeJumpSuperiors = null;
	private String[] beforeJumpInferiors = null;
	private String[] overrideJumpSuperiors = null;
	private String[] overrideJumpInferiors = null;
	private String[] afterJumpSuperiors = null;
	private String[] afterJumpInferiors = null;
	private String[] beforeMoveEntitySuperiors = null;
	private String[] beforeMoveEntityInferiors = null;
	private String[] overrideMoveEntitySuperiors = null;
	private String[] overrideMoveEntityInferiors = null;
	private String[] afterMoveEntitySuperiors = null;
	private String[] afterMoveEntityInferiors = null;
	private String[] beforeMoveEntityWithHeadingSuperiors = null;
	private String[] beforeMoveEntityWithHeadingInferiors = null;
	private String[] overrideMoveEntityWithHeadingSuperiors = null;
	private String[] overrideMoveEntityWithHeadingInferiors = null;
	private String[] afterMoveEntityWithHeadingSuperiors = null;
	private String[] afterMoveEntityWithHeadingInferiors = null;
	private String[] beforeMoveFlyingSuperiors = null;
	private String[] beforeMoveFlyingInferiors = null;
	private String[] overrideMoveFlyingSuperiors = null;
	private String[] overrideMoveFlyingInferiors = null;
	private String[] afterMoveFlyingSuperiors = null;
	private String[] afterMoveFlyingInferiors = null;
	private String[] beforeOnDeathSuperiors = null;
	private String[] beforeOnDeathInferiors = null;
	private String[] overrideOnDeathSuperiors = null;
	private String[] overrideOnDeathInferiors = null;
	private String[] afterOnDeathSuperiors = null;
	private String[] afterOnDeathInferiors = null;
	private String[] beforeOnLivingUpdateSuperiors = null;
	private String[] beforeOnLivingUpdateInferiors = null;
	private String[] overrideOnLivingUpdateSuperiors = null;
	private String[] overrideOnLivingUpdateInferiors = null;
	private String[] afterOnLivingUpdateSuperiors = null;
	private String[] afterOnLivingUpdateInferiors = null;
	private String[] beforeOnKillEntitySuperiors = null;
	private String[] beforeOnKillEntityInferiors = null;
	private String[] overrideOnKillEntitySuperiors = null;
	private String[] overrideOnKillEntityInferiors = null;
	private String[] afterOnKillEntitySuperiors = null;
	private String[] afterOnKillEntityInferiors = null;
	private String[] beforeOnUpdateSuperiors = null;
	private String[] beforeOnUpdateInferiors = null;
	private String[] overrideOnUpdateSuperiors = null;
	private String[] overrideOnUpdateInferiors = null;
	private String[] afterOnUpdateSuperiors = null;
	private String[] afterOnUpdateInferiors = null;
	private String[] beforeOnUpdateEntitySuperiors = null;
	private String[] beforeOnUpdateEntityInferiors = null;
	private String[] overrideOnUpdateEntitySuperiors = null;
	private String[] overrideOnUpdateEntityInferiors = null;
	private String[] afterOnUpdateEntitySuperiors = null;
	private String[] afterOnUpdateEntityInferiors = null;
	private String[] beforeReadEntityFromNBTSuperiors = null;
	private String[] beforeReadEntityFromNBTInferiors = null;
	private String[] overrideReadEntityFromNBTSuperiors = null;
	private String[] overrideReadEntityFromNBTInferiors = null;
	private String[] afterReadEntityFromNBTSuperiors = null;
	private String[] afterReadEntityFromNBTInferiors = null;
	private String[] beforeSetDeadSuperiors = null;
	private String[] beforeSetDeadInferiors = null;
	private String[] overrideSetDeadSuperiors = null;
	private String[] overrideSetDeadInferiors = null;
	private String[] afterSetDeadSuperiors = null;
	private String[] afterSetDeadInferiors = null;
	private String[] beforeSetPositionSuperiors = null;
	private String[] beforeSetPositionInferiors = null;
	private String[] overrideSetPositionSuperiors = null;
	private String[] overrideSetPositionInferiors = null;
	private String[] afterSetPositionSuperiors = null;
	private String[] afterSetPositionInferiors = null;
	private String[] beforeUpdateEntityActionStateSuperiors = null;
	private String[] beforeUpdateEntityActionStateInferiors = null;
	private String[] overrideUpdateEntityActionStateSuperiors = null;
	private String[] overrideUpdateEntityActionStateInferiors = null;
	private String[] afterUpdateEntityActionStateSuperiors = null;
	private String[] afterUpdateEntityActionStateInferiors = null;
	private String[] beforeWriteEntityToNBTSuperiors = null;
	private String[] beforeWriteEntityToNBTInferiors = null;
	private String[] overrideWriteEntityToNBTSuperiors = null;
	private String[] overrideWriteEntityToNBTInferiors = null;
	private String[] afterWriteEntityToNBTSuperiors = null;
	private String[] afterWriteEntityToNBTInferiors = null;

	public String[] getBeforeLocalConstructingSuperiors()
	{
		return this.beforeLocalConstructingSuperiors;
	}

	public String[] getBeforeLocalConstructingInferiors()
	{
		return this.beforeLocalConstructingInferiors;
	}

	public String[] getAfterLocalConstructingSuperiors()
	{
		return this.afterLocalConstructingSuperiors;
	}

	public String[] getAfterLocalConstructingInferiors()
	{
		return this.afterLocalConstructingInferiors;
	}

	public void setBeforeLocalConstructingSuperiors(String[] var1)
	{
		this.beforeLocalConstructingSuperiors = var1;
	}

	public void setBeforeLocalConstructingInferiors(String[] var1)
	{
		this.beforeLocalConstructingInferiors = var1;
	}

	public void setAfterLocalConstructingSuperiors(String[] var1)
	{
		this.afterLocalConstructingSuperiors = var1;
	}

	public void setAfterLocalConstructingInferiors(String[] var1)
	{
		this.afterLocalConstructingInferiors = var1;
	}

	public String[] getBeforeAttackEntityFromSuperiors()
	{
		return this.beforeAttackEntityFromSuperiors;
	}

	public String[] getBeforeAttackEntityFromInferiors()
	{
		return this.beforeAttackEntityFromInferiors;
	}

	public String[] getOverrideAttackEntityFromSuperiors()
	{
		return this.overrideAttackEntityFromSuperiors;
	}

	public String[] getOverrideAttackEntityFromInferiors()
	{
		return this.overrideAttackEntityFromInferiors;
	}

	public String[] getAfterAttackEntityFromSuperiors()
	{
		return this.afterAttackEntityFromSuperiors;
	}

	public String[] getAfterAttackEntityFromInferiors()
	{
		return this.afterAttackEntityFromInferiors;
	}

	public void setBeforeAttackEntityFromSuperiors(String[] var1)
	{
		this.beforeAttackEntityFromSuperiors = var1;
	}

	public void setBeforeAttackEntityFromInferiors(String[] var1)
	{
		this.beforeAttackEntityFromInferiors = var1;
	}

	public void setOverrideAttackEntityFromSuperiors(String[] var1)
	{
		this.overrideAttackEntityFromSuperiors = var1;
	}

	public void setOverrideAttackEntityFromInferiors(String[] var1)
	{
		this.overrideAttackEntityFromInferiors = var1;
	}

	public void setAfterAttackEntityFromSuperiors(String[] var1)
	{
		this.afterAttackEntityFromSuperiors = var1;
	}

	public void setAfterAttackEntityFromInferiors(String[] var1)
	{
		this.afterAttackEntityFromInferiors = var1;
	}

	public String[] getBeforeAttackTargetEntityWithCurrentItemSuperiors()
	{
		return this.beforeAttackTargetEntityWithCurrentItemSuperiors;
	}

	public String[] getBeforeAttackTargetEntityWithCurrentItemInferiors()
	{
		return this.beforeAttackTargetEntityWithCurrentItemInferiors;
	}

	public String[] getOverrideAttackTargetEntityWithCurrentItemSuperiors()
	{
		return this.overrideAttackTargetEntityWithCurrentItemSuperiors;
	}

	public String[] getOverrideAttackTargetEntityWithCurrentItemInferiors()
	{
		return this.overrideAttackTargetEntityWithCurrentItemInferiors;
	}

	public String[] getAfterAttackTargetEntityWithCurrentItemSuperiors()
	{
		return this.afterAttackTargetEntityWithCurrentItemSuperiors;
	}

	public String[] getAfterAttackTargetEntityWithCurrentItemInferiors()
	{
		return this.afterAttackTargetEntityWithCurrentItemInferiors;
	}

	public void setBeforeAttackTargetEntityWithCurrentItemSuperiors(String[] var1)
	{
		this.beforeAttackTargetEntityWithCurrentItemSuperiors = var1;
	}

	public void setBeforeAttackTargetEntityWithCurrentItemInferiors(String[] var1)
	{
		this.beforeAttackTargetEntityWithCurrentItemInferiors = var1;
	}

	public void setOverrideAttackTargetEntityWithCurrentItemSuperiors(String[] var1)
	{
		this.overrideAttackTargetEntityWithCurrentItemSuperiors = var1;
	}

	public void setOverrideAttackTargetEntityWithCurrentItemInferiors(String[] var1)
	{
		this.overrideAttackTargetEntityWithCurrentItemInferiors = var1;
	}

	public void setAfterAttackTargetEntityWithCurrentItemSuperiors(String[] var1)
	{
		this.afterAttackTargetEntityWithCurrentItemSuperiors = var1;
	}

	public void setAfterAttackTargetEntityWithCurrentItemInferiors(String[] var1)
	{
		this.afterAttackTargetEntityWithCurrentItemInferiors = var1;
	}

	public String[] getBeforeCanHarvestBlockSuperiors()
	{
		return this.beforeCanHarvestBlockSuperiors;
	}

	public String[] getBeforeCanHarvestBlockInferiors()
	{
		return this.beforeCanHarvestBlockInferiors;
	}

	public String[] getOverrideCanHarvestBlockSuperiors()
	{
		return this.overrideCanHarvestBlockSuperiors;
	}

	public String[] getOverrideCanHarvestBlockInferiors()
	{
		return this.overrideCanHarvestBlockInferiors;
	}

	public String[] getAfterCanHarvestBlockSuperiors()
	{
		return this.afterCanHarvestBlockSuperiors;
	}

	public String[] getAfterCanHarvestBlockInferiors()
	{
		return this.afterCanHarvestBlockInferiors;
	}

	public void setBeforeCanHarvestBlockSuperiors(String[] var1)
	{
		this.beforeCanHarvestBlockSuperiors = var1;
	}

	public void setBeforeCanHarvestBlockInferiors(String[] var1)
	{
		this.beforeCanHarvestBlockInferiors = var1;
	}

	public void setOverrideCanHarvestBlockSuperiors(String[] var1)
	{
		this.overrideCanHarvestBlockSuperiors = var1;
	}

	public void setOverrideCanHarvestBlockInferiors(String[] var1)
	{
		this.overrideCanHarvestBlockInferiors = var1;
	}

	public void setAfterCanHarvestBlockSuperiors(String[] var1)
	{
		this.afterCanHarvestBlockSuperiors = var1;
	}

	public void setAfterCanHarvestBlockInferiors(String[] var1)
	{
		this.afterCanHarvestBlockInferiors = var1;
	}

	public String[] getBeforeCanPlayerEditSuperiors()
	{
		return this.beforeCanPlayerEditSuperiors;
	}

	public String[] getBeforeCanPlayerEditInferiors()
	{
		return this.beforeCanPlayerEditInferiors;
	}

	public String[] getOverrideCanPlayerEditSuperiors()
	{
		return this.overrideCanPlayerEditSuperiors;
	}

	public String[] getOverrideCanPlayerEditInferiors()
	{
		return this.overrideCanPlayerEditInferiors;
	}

	public String[] getAfterCanPlayerEditSuperiors()
	{
		return this.afterCanPlayerEditSuperiors;
	}

	public String[] getAfterCanPlayerEditInferiors()
	{
		return this.afterCanPlayerEditInferiors;
	}

	public void setBeforeCanPlayerEditSuperiors(String[] var1)
	{
		this.beforeCanPlayerEditSuperiors = var1;
	}

	public void setBeforeCanPlayerEditInferiors(String[] var1)
	{
		this.beforeCanPlayerEditInferiors = var1;
	}

	public void setOverrideCanPlayerEditSuperiors(String[] var1)
	{
		this.overrideCanPlayerEditSuperiors = var1;
	}

	public void setOverrideCanPlayerEditInferiors(String[] var1)
	{
		this.overrideCanPlayerEditInferiors = var1;
	}

	public void setAfterCanPlayerEditSuperiors(String[] var1)
	{
		this.afterCanPlayerEditSuperiors = var1;
	}

	public void setAfterCanPlayerEditInferiors(String[] var1)
	{
		this.afterCanPlayerEditInferiors = var1;
	}

	public String[] getBeforeCanTriggerWalkingSuperiors()
	{
		return this.beforeCanTriggerWalkingSuperiors;
	}

	public String[] getBeforeCanTriggerWalkingInferiors()
	{
		return this.beforeCanTriggerWalkingInferiors;
	}

	public String[] getOverrideCanTriggerWalkingSuperiors()
	{
		return this.overrideCanTriggerWalkingSuperiors;
	}

	public String[] getOverrideCanTriggerWalkingInferiors()
	{
		return this.overrideCanTriggerWalkingInferiors;
	}

	public String[] getAfterCanTriggerWalkingSuperiors()
	{
		return this.afterCanTriggerWalkingSuperiors;
	}

	public String[] getAfterCanTriggerWalkingInferiors()
	{
		return this.afterCanTriggerWalkingInferiors;
	}

	public void setBeforeCanTriggerWalkingSuperiors(String[] var1)
	{
		this.beforeCanTriggerWalkingSuperiors = var1;
	}

	public void setBeforeCanTriggerWalkingInferiors(String[] var1)
	{
		this.beforeCanTriggerWalkingInferiors = var1;
	}

	public void setOverrideCanTriggerWalkingSuperiors(String[] var1)
	{
		this.overrideCanTriggerWalkingSuperiors = var1;
	}

	public void setOverrideCanTriggerWalkingInferiors(String[] var1)
	{
		this.overrideCanTriggerWalkingInferiors = var1;
	}

	public void setAfterCanTriggerWalkingSuperiors(String[] var1)
	{
		this.afterCanTriggerWalkingSuperiors = var1;
	}

	public void setAfterCanTriggerWalkingInferiors(String[] var1)
	{
		this.afterCanTriggerWalkingInferiors = var1;
	}

	public String[] getBeforeDamageEntitySuperiors()
	{
		return this.beforeDamageEntitySuperiors;
	}

	public String[] getBeforeDamageEntityInferiors()
	{
		return this.beforeDamageEntityInferiors;
	}

	public String[] getOverrideDamageEntitySuperiors()
	{
		return this.overrideDamageEntitySuperiors;
	}

	public String[] getOverrideDamageEntityInferiors()
	{
		return this.overrideDamageEntityInferiors;
	}

	public String[] getAfterDamageEntitySuperiors()
	{
		return this.afterDamageEntitySuperiors;
	}

	public String[] getAfterDamageEntityInferiors()
	{
		return this.afterDamageEntityInferiors;
	}

	public void setBeforeDamageEntitySuperiors(String[] var1)
	{
		this.beforeDamageEntitySuperiors = var1;
	}

	public void setBeforeDamageEntityInferiors(String[] var1)
	{
		this.beforeDamageEntityInferiors = var1;
	}

	public void setOverrideDamageEntitySuperiors(String[] var1)
	{
		this.overrideDamageEntitySuperiors = var1;
	}

	public void setOverrideDamageEntityInferiors(String[] var1)
	{
		this.overrideDamageEntityInferiors = var1;
	}

	public void setAfterDamageEntitySuperiors(String[] var1)
	{
		this.afterDamageEntitySuperiors = var1;
	}

	public void setAfterDamageEntityInferiors(String[] var1)
	{
		this.afterDamageEntityInferiors = var1;
	}

	public String[] getBeforeDisplayGUIChestSuperiors()
	{
		return this.beforeDisplayGUIChestSuperiors;
	}

	public String[] getBeforeDisplayGUIChestInferiors()
	{
		return this.beforeDisplayGUIChestInferiors;
	}

	public String[] getOverrideDisplayGUIChestSuperiors()
	{
		return this.overrideDisplayGUIChestSuperiors;
	}

	public String[] getOverrideDisplayGUIChestInferiors()
	{
		return this.overrideDisplayGUIChestInferiors;
	}

	public String[] getAfterDisplayGUIChestSuperiors()
	{
		return this.afterDisplayGUIChestSuperiors;
	}

	public String[] getAfterDisplayGUIChestInferiors()
	{
		return this.afterDisplayGUIChestInferiors;
	}

	public void setBeforeDisplayGUIChestSuperiors(String[] var1)
	{
		this.beforeDisplayGUIChestSuperiors = var1;
	}

	public void setBeforeDisplayGUIChestInferiors(String[] var1)
	{
		this.beforeDisplayGUIChestInferiors = var1;
	}

	public void setOverrideDisplayGUIChestSuperiors(String[] var1)
	{
		this.overrideDisplayGUIChestSuperiors = var1;
	}

	public void setOverrideDisplayGUIChestInferiors(String[] var1)
	{
		this.overrideDisplayGUIChestInferiors = var1;
	}

	public void setAfterDisplayGUIChestSuperiors(String[] var1)
	{
		this.afterDisplayGUIChestSuperiors = var1;
	}

	public void setAfterDisplayGUIChestInferiors(String[] var1)
	{
		this.afterDisplayGUIChestInferiors = var1;
	}

	public String[] getBeforeDisplayGUIDispenserSuperiors()
	{
		return this.beforeDisplayGUIDispenserSuperiors;
	}

	public String[] getBeforeDisplayGUIDispenserInferiors()
	{
		return this.beforeDisplayGUIDispenserInferiors;
	}

	public String[] getOverrideDisplayGUIDispenserSuperiors()
	{
		return this.overrideDisplayGUIDispenserSuperiors;
	}

	public String[] getOverrideDisplayGUIDispenserInferiors()
	{
		return this.overrideDisplayGUIDispenserInferiors;
	}

	public String[] getAfterDisplayGUIDispenserSuperiors()
	{
		return this.afterDisplayGUIDispenserSuperiors;
	}

	public String[] getAfterDisplayGUIDispenserInferiors()
	{
		return this.afterDisplayGUIDispenserInferiors;
	}

	public void setBeforeDisplayGUIDispenserSuperiors(String[] var1)
	{
		this.beforeDisplayGUIDispenserSuperiors = var1;
	}

	public void setBeforeDisplayGUIDispenserInferiors(String[] var1)
	{
		this.beforeDisplayGUIDispenserInferiors = var1;
	}

	public void setOverrideDisplayGUIDispenserSuperiors(String[] var1)
	{
		this.overrideDisplayGUIDispenserSuperiors = var1;
	}

	public void setOverrideDisplayGUIDispenserInferiors(String[] var1)
	{
		this.overrideDisplayGUIDispenserInferiors = var1;
	}

	public void setAfterDisplayGUIDispenserSuperiors(String[] var1)
	{
		this.afterDisplayGUIDispenserSuperiors = var1;
	}

	public void setAfterDisplayGUIDispenserInferiors(String[] var1)
	{
		this.afterDisplayGUIDispenserInferiors = var1;
	}

	public String[] getBeforeDisplayGUIFurnaceSuperiors()
	{
		return this.beforeDisplayGUIFurnaceSuperiors;
	}

	public String[] getBeforeDisplayGUIFurnaceInferiors()
	{
		return this.beforeDisplayGUIFurnaceInferiors;
	}

	public String[] getOverrideDisplayGUIFurnaceSuperiors()
	{
		return this.overrideDisplayGUIFurnaceSuperiors;
	}

	public String[] getOverrideDisplayGUIFurnaceInferiors()
	{
		return this.overrideDisplayGUIFurnaceInferiors;
	}

	public String[] getAfterDisplayGUIFurnaceSuperiors()
	{
		return this.afterDisplayGUIFurnaceSuperiors;
	}

	public String[] getAfterDisplayGUIFurnaceInferiors()
	{
		return this.afterDisplayGUIFurnaceInferiors;
	}

	public void setBeforeDisplayGUIFurnaceSuperiors(String[] var1)
	{
		this.beforeDisplayGUIFurnaceSuperiors = var1;
	}

	public void setBeforeDisplayGUIFurnaceInferiors(String[] var1)
	{
		this.beforeDisplayGUIFurnaceInferiors = var1;
	}

	public void setOverrideDisplayGUIFurnaceSuperiors(String[] var1)
	{
		this.overrideDisplayGUIFurnaceSuperiors = var1;
	}

	public void setOverrideDisplayGUIFurnaceInferiors(String[] var1)
	{
		this.overrideDisplayGUIFurnaceInferiors = var1;
	}

	public void setAfterDisplayGUIFurnaceSuperiors(String[] var1)
	{
		this.afterDisplayGUIFurnaceSuperiors = var1;
	}

	public void setAfterDisplayGUIFurnaceInferiors(String[] var1)
	{
		this.afterDisplayGUIFurnaceInferiors = var1;
	}

	public String[] getBeforeDisplayWorkbenchGUISuperiors()
	{
		return this.beforeDisplayWorkbenchGUISuperiors;
	}

	public String[] getBeforeDisplayWorkbenchGUIInferiors()
	{
		return this.beforeDisplayWorkbenchGUIInferiors;
	}

	public String[] getOverrideDisplayWorkbenchGUISuperiors()
	{
		return this.overrideDisplayWorkbenchGUISuperiors;
	}

	public String[] getOverrideDisplayWorkbenchGUIInferiors()
	{
		return this.overrideDisplayWorkbenchGUIInferiors;
	}

	public String[] getAfterDisplayWorkbenchGUISuperiors()
	{
		return this.afterDisplayWorkbenchGUISuperiors;
	}

	public String[] getAfterDisplayWorkbenchGUIInferiors()
	{
		return this.afterDisplayWorkbenchGUIInferiors;
	}

	public void setBeforeDisplayWorkbenchGUISuperiors(String[] var1)
	{
		this.beforeDisplayWorkbenchGUISuperiors = var1;
	}

	public void setBeforeDisplayWorkbenchGUIInferiors(String[] var1)
	{
		this.beforeDisplayWorkbenchGUIInferiors = var1;
	}

	public void setOverrideDisplayWorkbenchGUISuperiors(String[] var1)
	{
		this.overrideDisplayWorkbenchGUISuperiors = var1;
	}

	public void setOverrideDisplayWorkbenchGUIInferiors(String[] var1)
	{
		this.overrideDisplayWorkbenchGUIInferiors = var1;
	}

	public void setAfterDisplayWorkbenchGUISuperiors(String[] var1)
	{
		this.afterDisplayWorkbenchGUISuperiors = var1;
	}

	public void setAfterDisplayWorkbenchGUIInferiors(String[] var1)
	{
		this.afterDisplayWorkbenchGUIInferiors = var1;
	}

	public String[] getBeforeDropOneItemSuperiors()
	{
		return this.beforeDropOneItemSuperiors;
	}

	public String[] getBeforeDropOneItemInferiors()
	{
		return this.beforeDropOneItemInferiors;
	}

	public String[] getOverrideDropOneItemSuperiors()
	{
		return this.overrideDropOneItemSuperiors;
	}

	public String[] getOverrideDropOneItemInferiors()
	{
		return this.overrideDropOneItemInferiors;
	}

	public String[] getAfterDropOneItemSuperiors()
	{
		return this.afterDropOneItemSuperiors;
	}

	public String[] getAfterDropOneItemInferiors()
	{
		return this.afterDropOneItemInferiors;
	}

	public void setBeforeDropOneItemSuperiors(String[] var1)
	{
		this.beforeDropOneItemSuperiors = var1;
	}

	public void setBeforeDropOneItemInferiors(String[] var1)
	{
		this.beforeDropOneItemInferiors = var1;
	}

	public void setOverrideDropOneItemSuperiors(String[] var1)
	{
		this.overrideDropOneItemSuperiors = var1;
	}

	public void setOverrideDropOneItemInferiors(String[] var1)
	{
		this.overrideDropOneItemInferiors = var1;
	}

	public void setAfterDropOneItemSuperiors(String[] var1)
	{
		this.afterDropOneItemSuperiors = var1;
	}

	public void setAfterDropOneItemInferiors(String[] var1)
	{
		this.afterDropOneItemInferiors = var1;
	}

	public String[] getBeforeDropPlayerItemSuperiors()
	{
		return this.beforeDropPlayerItemSuperiors;
	}

	public String[] getBeforeDropPlayerItemInferiors()
	{
		return this.beforeDropPlayerItemInferiors;
	}

	public String[] getOverrideDropPlayerItemSuperiors()
	{
		return this.overrideDropPlayerItemSuperiors;
	}

	public String[] getOverrideDropPlayerItemInferiors()
	{
		return this.overrideDropPlayerItemInferiors;
	}

	public String[] getAfterDropPlayerItemSuperiors()
	{
		return this.afterDropPlayerItemSuperiors;
	}

	public String[] getAfterDropPlayerItemInferiors()
	{
		return this.afterDropPlayerItemInferiors;
	}

	public void setBeforeDropPlayerItemSuperiors(String[] var1)
	{
		this.beforeDropPlayerItemSuperiors = var1;
	}

	public void setBeforeDropPlayerItemInferiors(String[] var1)
	{
		this.beforeDropPlayerItemInferiors = var1;
	}

	public void setOverrideDropPlayerItemSuperiors(String[] var1)
	{
		this.overrideDropPlayerItemSuperiors = var1;
	}

	public void setOverrideDropPlayerItemInferiors(String[] var1)
	{
		this.overrideDropPlayerItemInferiors = var1;
	}

	public void setAfterDropPlayerItemSuperiors(String[] var1)
	{
		this.afterDropPlayerItemSuperiors = var1;
	}

	public void setAfterDropPlayerItemInferiors(String[] var1)
	{
		this.afterDropPlayerItemInferiors = var1;
	}

	public String[] getBeforeFallSuperiors()
	{
		return this.beforeFallSuperiors;
	}

	public String[] getBeforeFallInferiors()
	{
		return this.beforeFallInferiors;
	}

	public String[] getOverrideFallSuperiors()
	{
		return this.overrideFallSuperiors;
	}

	public String[] getOverrideFallInferiors()
	{
		return this.overrideFallInferiors;
	}

	public String[] getAfterFallSuperiors()
	{
		return this.afterFallSuperiors;
	}

	public String[] getAfterFallInferiors()
	{
		return this.afterFallInferiors;
	}

	public void setBeforeFallSuperiors(String[] var1)
	{
		this.beforeFallSuperiors = var1;
	}

	public void setBeforeFallInferiors(String[] var1)
	{
		this.beforeFallInferiors = var1;
	}

	public void setOverrideFallSuperiors(String[] var1)
	{
		this.overrideFallSuperiors = var1;
	}

	public void setOverrideFallInferiors(String[] var1)
	{
		this.overrideFallInferiors = var1;
	}

	public void setAfterFallSuperiors(String[] var1)
	{
		this.afterFallSuperiors = var1;
	}

	public void setAfterFallInferiors(String[] var1)
	{
		this.afterFallInferiors = var1;
	}

	public String[] getBeforeGetCurrentPlayerStrVsBlockSuperiors()
	{
		return this.beforeGetCurrentPlayerStrVsBlockSuperiors;
	}

	public String[] getBeforeGetCurrentPlayerStrVsBlockInferiors()
	{
		return this.beforeGetCurrentPlayerStrVsBlockInferiors;
	}

	public String[] getOverrideGetCurrentPlayerStrVsBlockSuperiors()
	{
		return this.overrideGetCurrentPlayerStrVsBlockSuperiors;
	}

	public String[] getOverrideGetCurrentPlayerStrVsBlockInferiors()
	{
		return this.overrideGetCurrentPlayerStrVsBlockInferiors;
	}

	public String[] getAfterGetCurrentPlayerStrVsBlockSuperiors()
	{
		return this.afterGetCurrentPlayerStrVsBlockSuperiors;
	}

	public String[] getAfterGetCurrentPlayerStrVsBlockInferiors()
	{
		return this.afterGetCurrentPlayerStrVsBlockInferiors;
	}

	public void setBeforeGetCurrentPlayerStrVsBlockSuperiors(String[] var1)
	{
		this.beforeGetCurrentPlayerStrVsBlockSuperiors = var1;
	}

	public void setBeforeGetCurrentPlayerStrVsBlockInferiors(String[] var1)
	{
		this.beforeGetCurrentPlayerStrVsBlockInferiors = var1;
	}

	public void setOverrideGetCurrentPlayerStrVsBlockSuperiors(String[] var1)
	{
		this.overrideGetCurrentPlayerStrVsBlockSuperiors = var1;
	}

	public void setOverrideGetCurrentPlayerStrVsBlockInferiors(String[] var1)
	{
		this.overrideGetCurrentPlayerStrVsBlockInferiors = var1;
	}

	public void setAfterGetCurrentPlayerStrVsBlockSuperiors(String[] var1)
	{
		this.afterGetCurrentPlayerStrVsBlockSuperiors = var1;
	}

	public void setAfterGetCurrentPlayerStrVsBlockInferiors(String[] var1)
	{
		this.afterGetCurrentPlayerStrVsBlockInferiors = var1;
	}

	public String[] getBeforeGetDistanceSqSuperiors()
	{
		return this.beforeGetDistanceSqSuperiors;
	}

	public String[] getBeforeGetDistanceSqInferiors()
	{
		return this.beforeGetDistanceSqInferiors;
	}

	public String[] getOverrideGetDistanceSqSuperiors()
	{
		return this.overrideGetDistanceSqSuperiors;
	}

	public String[] getOverrideGetDistanceSqInferiors()
	{
		return this.overrideGetDistanceSqInferiors;
	}

	public String[] getAfterGetDistanceSqSuperiors()
	{
		return this.afterGetDistanceSqSuperiors;
	}

	public String[] getAfterGetDistanceSqInferiors()
	{
		return this.afterGetDistanceSqInferiors;
	}

	public void setBeforeGetDistanceSqSuperiors(String[] var1)
	{
		this.beforeGetDistanceSqSuperiors = var1;
	}

	public void setBeforeGetDistanceSqInferiors(String[] var1)
	{
		this.beforeGetDistanceSqInferiors = var1;
	}

	public void setOverrideGetDistanceSqSuperiors(String[] var1)
	{
		this.overrideGetDistanceSqSuperiors = var1;
	}

	public void setOverrideGetDistanceSqInferiors(String[] var1)
	{
		this.overrideGetDistanceSqInferiors = var1;
	}

	public void setAfterGetDistanceSqSuperiors(String[] var1)
	{
		this.afterGetDistanceSqSuperiors = var1;
	}

	public void setAfterGetDistanceSqInferiors(String[] var1)
	{
		this.afterGetDistanceSqInferiors = var1;
	}

	public String[] getBeforeGetBrightnessSuperiors()
	{
		return this.beforeGetBrightnessSuperiors;
	}

	public String[] getBeforeGetBrightnessInferiors()
	{
		return this.beforeGetBrightnessInferiors;
	}

	public String[] getOverrideGetBrightnessSuperiors()
	{
		return this.overrideGetBrightnessSuperiors;
	}

	public String[] getOverrideGetBrightnessInferiors()
	{
		return this.overrideGetBrightnessInferiors;
	}

	public String[] getAfterGetBrightnessSuperiors()
	{
		return this.afterGetBrightnessSuperiors;
	}

	public String[] getAfterGetBrightnessInferiors()
	{
		return this.afterGetBrightnessInferiors;
	}

	public void setBeforeGetBrightnessSuperiors(String[] var1)
	{
		this.beforeGetBrightnessSuperiors = var1;
	}

	public void setBeforeGetBrightnessInferiors(String[] var1)
	{
		this.beforeGetBrightnessInferiors = var1;
	}

	public void setOverrideGetBrightnessSuperiors(String[] var1)
	{
		this.overrideGetBrightnessSuperiors = var1;
	}

	public void setOverrideGetBrightnessInferiors(String[] var1)
	{
		this.overrideGetBrightnessInferiors = var1;
	}

	public void setAfterGetBrightnessSuperiors(String[] var1)
	{
		this.afterGetBrightnessSuperiors = var1;
	}

	public void setAfterGetBrightnessInferiors(String[] var1)
	{
		this.afterGetBrightnessInferiors = var1;
	}

	public String[] getBeforeGetEyeHeightSuperiors()
	{
		return this.beforeGetEyeHeightSuperiors;
	}

	public String[] getBeforeGetEyeHeightInferiors()
	{
		return this.beforeGetEyeHeightInferiors;
	}

	public String[] getOverrideGetEyeHeightSuperiors()
	{
		return this.overrideGetEyeHeightSuperiors;
	}

	public String[] getOverrideGetEyeHeightInferiors()
	{
		return this.overrideGetEyeHeightInferiors;
	}

	public String[] getAfterGetEyeHeightSuperiors()
	{
		return this.afterGetEyeHeightSuperiors;
	}

	public String[] getAfterGetEyeHeightInferiors()
	{
		return this.afterGetEyeHeightInferiors;
	}

	public void setBeforeGetEyeHeightSuperiors(String[] var1)
	{
		this.beforeGetEyeHeightSuperiors = var1;
	}

	public void setBeforeGetEyeHeightInferiors(String[] var1)
	{
		this.beforeGetEyeHeightInferiors = var1;
	}

	public void setOverrideGetEyeHeightSuperiors(String[] var1)
	{
		this.overrideGetEyeHeightSuperiors = var1;
	}

	public void setOverrideGetEyeHeightInferiors(String[] var1)
	{
		this.overrideGetEyeHeightInferiors = var1;
	}

	public void setAfterGetEyeHeightSuperiors(String[] var1)
	{
		this.afterGetEyeHeightSuperiors = var1;
	}

	public void setAfterGetEyeHeightInferiors(String[] var1)
	{
		this.afterGetEyeHeightInferiors = var1;
	}

	public String[] getBeforeGetSpeedModifierSuperiors()
	{
		return this.beforeGetSpeedModifierSuperiors;
	}

	public String[] getBeforeGetSpeedModifierInferiors()
	{
		return this.beforeGetSpeedModifierInferiors;
	}

	public String[] getOverrideGetSpeedModifierSuperiors()
	{
		return this.overrideGetSpeedModifierSuperiors;
	}

	public String[] getOverrideGetSpeedModifierInferiors()
	{
		return this.overrideGetSpeedModifierInferiors;
	}

	public String[] getAfterGetSpeedModifierSuperiors()
	{
		return this.afterGetSpeedModifierSuperiors;
	}

	public String[] getAfterGetSpeedModifierInferiors()
	{
		return this.afterGetSpeedModifierInferiors;
	}

	public void setBeforeGetSpeedModifierSuperiors(String[] var1)
	{
		this.beforeGetSpeedModifierSuperiors = var1;
	}

	public void setBeforeGetSpeedModifierInferiors(String[] var1)
	{
		this.beforeGetSpeedModifierInferiors = var1;
	}

	public void setOverrideGetSpeedModifierSuperiors(String[] var1)
	{
		this.overrideGetSpeedModifierSuperiors = var1;
	}

	public void setOverrideGetSpeedModifierInferiors(String[] var1)
	{
		this.overrideGetSpeedModifierInferiors = var1;
	}

	public void setAfterGetSpeedModifierSuperiors(String[] var1)
	{
		this.afterGetSpeedModifierSuperiors = var1;
	}

	public void setAfterGetSpeedModifierInferiors(String[] var1)
	{
		this.afterGetSpeedModifierInferiors = var1;
	}

	public String[] getBeforeHealSuperiors()
	{
		return this.beforeHealSuperiors;
	}

	public String[] getBeforeHealInferiors()
	{
		return this.beforeHealInferiors;
	}

	public String[] getOverrideHealSuperiors()
	{
		return this.overrideHealSuperiors;
	}

	public String[] getOverrideHealInferiors()
	{
		return this.overrideHealInferiors;
	}

	public String[] getAfterHealSuperiors()
	{
		return this.afterHealSuperiors;
	}

	public String[] getAfterHealInferiors()
	{
		return this.afterHealInferiors;
	}

	public void setBeforeHealSuperiors(String[] var1)
	{
		this.beforeHealSuperiors = var1;
	}

	public void setBeforeHealInferiors(String[] var1)
	{
		this.beforeHealInferiors = var1;
	}

	public void setOverrideHealSuperiors(String[] var1)
	{
		this.overrideHealSuperiors = var1;
	}

	public void setOverrideHealInferiors(String[] var1)
	{
		this.overrideHealInferiors = var1;
	}

	public void setAfterHealSuperiors(String[] var1)
	{
		this.afterHealSuperiors = var1;
	}

	public void setAfterHealInferiors(String[] var1)
	{
		this.afterHealInferiors = var1;
	}

	public String[] getBeforeInteractSuperiors()
	{
		return this.beforeInteractSuperiors;
	}

	public String[] getBeforeInteractInferiors()
	{
		return this.beforeInteractInferiors;
	}

	public String[] getOverrideInteractSuperiors()
	{
		return this.overrideInteractSuperiors;
	}

	public String[] getOverrideInteractInferiors()
	{
		return this.overrideInteractInferiors;
	}

	public String[] getAfterInteractSuperiors()
	{
		return this.afterInteractSuperiors;
	}

	public String[] getAfterInteractInferiors()
	{
		return this.afterInteractInferiors;
	}

	public void setBeforeInteractSuperiors(String[] var1)
	{
		this.beforeInteractSuperiors = var1;
	}

	public void setBeforeInteractInferiors(String[] var1)
	{
		this.beforeInteractInferiors = var1;
	}

	public void setOverrideInteractSuperiors(String[] var1)
	{
		this.overrideInteractSuperiors = var1;
	}

	public void setOverrideInteractInferiors(String[] var1)
	{
		this.overrideInteractInferiors = var1;
	}

	public void setAfterInteractSuperiors(String[] var1)
	{
		this.afterInteractSuperiors = var1;
	}

	public void setAfterInteractInferiors(String[] var1)
	{
		this.afterInteractInferiors = var1;
	}

	public String[] getBeforeIsEntityInsideOpaqueBlockSuperiors()
	{
		return this.beforeIsEntityInsideOpaqueBlockSuperiors;
	}

	public String[] getBeforeIsEntityInsideOpaqueBlockInferiors()
	{
		return this.beforeIsEntityInsideOpaqueBlockInferiors;
	}

	public String[] getOverrideIsEntityInsideOpaqueBlockSuperiors()
	{
		return this.overrideIsEntityInsideOpaqueBlockSuperiors;
	}

	public String[] getOverrideIsEntityInsideOpaqueBlockInferiors()
	{
		return this.overrideIsEntityInsideOpaqueBlockInferiors;
	}

	public String[] getAfterIsEntityInsideOpaqueBlockSuperiors()
	{
		return this.afterIsEntityInsideOpaqueBlockSuperiors;
	}

	public String[] getAfterIsEntityInsideOpaqueBlockInferiors()
	{
		return this.afterIsEntityInsideOpaqueBlockInferiors;
	}

	public void setBeforeIsEntityInsideOpaqueBlockSuperiors(String[] var1)
	{
		this.beforeIsEntityInsideOpaqueBlockSuperiors = var1;
	}

	public void setBeforeIsEntityInsideOpaqueBlockInferiors(String[] var1)
	{
		this.beforeIsEntityInsideOpaqueBlockInferiors = var1;
	}

	public void setOverrideIsEntityInsideOpaqueBlockSuperiors(String[] var1)
	{
		this.overrideIsEntityInsideOpaqueBlockSuperiors = var1;
	}

	public void setOverrideIsEntityInsideOpaqueBlockInferiors(String[] var1)
	{
		this.overrideIsEntityInsideOpaqueBlockInferiors = var1;
	}

	public void setAfterIsEntityInsideOpaqueBlockSuperiors(String[] var1)
	{
		this.afterIsEntityInsideOpaqueBlockSuperiors = var1;
	}

	public void setAfterIsEntityInsideOpaqueBlockInferiors(String[] var1)
	{
		this.afterIsEntityInsideOpaqueBlockInferiors = var1;
	}

	public String[] getBeforeIsInWaterSuperiors()
	{
		return this.beforeIsInWaterSuperiors;
	}

	public String[] getBeforeIsInWaterInferiors()
	{
		return this.beforeIsInWaterInferiors;
	}

	public String[] getOverrideIsInWaterSuperiors()
	{
		return this.overrideIsInWaterSuperiors;
	}

	public String[] getOverrideIsInWaterInferiors()
	{
		return this.overrideIsInWaterInferiors;
	}

	public String[] getAfterIsInWaterSuperiors()
	{
		return this.afterIsInWaterSuperiors;
	}

	public String[] getAfterIsInWaterInferiors()
	{
		return this.afterIsInWaterInferiors;
	}

	public void setBeforeIsInWaterSuperiors(String[] var1)
	{
		this.beforeIsInWaterSuperiors = var1;
	}

	public void setBeforeIsInWaterInferiors(String[] var1)
	{
		this.beforeIsInWaterInferiors = var1;
	}

	public void setOverrideIsInWaterSuperiors(String[] var1)
	{
		this.overrideIsInWaterSuperiors = var1;
	}

	public void setOverrideIsInWaterInferiors(String[] var1)
	{
		this.overrideIsInWaterInferiors = var1;
	}

	public void setAfterIsInWaterSuperiors(String[] var1)
	{
		this.afterIsInWaterSuperiors = var1;
	}

	public void setAfterIsInWaterInferiors(String[] var1)
	{
		this.afterIsInWaterInferiors = var1;
	}

	public String[] getBeforeIsInsideOfMaterialSuperiors()
	{
		return this.beforeIsInsideOfMaterialSuperiors;
	}

	public String[] getBeforeIsInsideOfMaterialInferiors()
	{
		return this.beforeIsInsideOfMaterialInferiors;
	}

	public String[] getOverrideIsInsideOfMaterialSuperiors()
	{
		return this.overrideIsInsideOfMaterialSuperiors;
	}

	public String[] getOverrideIsInsideOfMaterialInferiors()
	{
		return this.overrideIsInsideOfMaterialInferiors;
	}

	public String[] getAfterIsInsideOfMaterialSuperiors()
	{
		return this.afterIsInsideOfMaterialSuperiors;
	}

	public String[] getAfterIsInsideOfMaterialInferiors()
	{
		return this.afterIsInsideOfMaterialInferiors;
	}

	public void setBeforeIsInsideOfMaterialSuperiors(String[] var1)
	{
		this.beforeIsInsideOfMaterialSuperiors = var1;
	}

	public void setBeforeIsInsideOfMaterialInferiors(String[] var1)
	{
		this.beforeIsInsideOfMaterialInferiors = var1;
	}

	public void setOverrideIsInsideOfMaterialSuperiors(String[] var1)
	{
		this.overrideIsInsideOfMaterialSuperiors = var1;
	}

	public void setOverrideIsInsideOfMaterialInferiors(String[] var1)
	{
		this.overrideIsInsideOfMaterialInferiors = var1;
	}

	public void setAfterIsInsideOfMaterialSuperiors(String[] var1)
	{
		this.afterIsInsideOfMaterialSuperiors = var1;
	}

	public void setAfterIsInsideOfMaterialInferiors(String[] var1)
	{
		this.afterIsInsideOfMaterialInferiors = var1;
	}

	public String[] getBeforeIsOnLadderSuperiors()
	{
		return this.beforeIsOnLadderSuperiors;
	}

	public String[] getBeforeIsOnLadderInferiors()
	{
		return this.beforeIsOnLadderInferiors;
	}

	public String[] getOverrideIsOnLadderSuperiors()
	{
		return this.overrideIsOnLadderSuperiors;
	}

	public String[] getOverrideIsOnLadderInferiors()
	{
		return this.overrideIsOnLadderInferiors;
	}

	public String[] getAfterIsOnLadderSuperiors()
	{
		return this.afterIsOnLadderSuperiors;
	}

	public String[] getAfterIsOnLadderInferiors()
	{
		return this.afterIsOnLadderInferiors;
	}

	public void setBeforeIsOnLadderSuperiors(String[] var1)
	{
		this.beforeIsOnLadderSuperiors = var1;
	}

	public void setBeforeIsOnLadderInferiors(String[] var1)
	{
		this.beforeIsOnLadderInferiors = var1;
	}

	public void setOverrideIsOnLadderSuperiors(String[] var1)
	{
		this.overrideIsOnLadderSuperiors = var1;
	}

	public void setOverrideIsOnLadderInferiors(String[] var1)
	{
		this.overrideIsOnLadderInferiors = var1;
	}

	public void setAfterIsOnLadderSuperiors(String[] var1)
	{
		this.afterIsOnLadderSuperiors = var1;
	}

	public void setAfterIsOnLadderInferiors(String[] var1)
	{
		this.afterIsOnLadderInferiors = var1;
	}

	public String[] getBeforeIsPlayerSleepingSuperiors()
	{
		return this.beforeIsPlayerSleepingSuperiors;
	}

	public String[] getBeforeIsPlayerSleepingInferiors()
	{
		return this.beforeIsPlayerSleepingInferiors;
	}

	public String[] getOverrideIsPlayerSleepingSuperiors()
	{
		return this.overrideIsPlayerSleepingSuperiors;
	}

	public String[] getOverrideIsPlayerSleepingInferiors()
	{
		return this.overrideIsPlayerSleepingInferiors;
	}

	public String[] getAfterIsPlayerSleepingSuperiors()
	{
		return this.afterIsPlayerSleepingSuperiors;
	}

	public String[] getAfterIsPlayerSleepingInferiors()
	{
		return this.afterIsPlayerSleepingInferiors;
	}

	public void setBeforeIsPlayerSleepingSuperiors(String[] var1)
	{
		this.beforeIsPlayerSleepingSuperiors = var1;
	}

	public void setBeforeIsPlayerSleepingInferiors(String[] var1)
	{
		this.beforeIsPlayerSleepingInferiors = var1;
	}

	public void setOverrideIsPlayerSleepingSuperiors(String[] var1)
	{
		this.overrideIsPlayerSleepingSuperiors = var1;
	}

	public void setOverrideIsPlayerSleepingInferiors(String[] var1)
	{
		this.overrideIsPlayerSleepingInferiors = var1;
	}

	public void setAfterIsPlayerSleepingSuperiors(String[] var1)
	{
		this.afterIsPlayerSleepingSuperiors = var1;
	}

	public void setAfterIsPlayerSleepingInferiors(String[] var1)
	{
		this.afterIsPlayerSleepingInferiors = var1;
	}

	public String[] getBeforeJumpSuperiors()
	{
		return this.beforeJumpSuperiors;
	}

	public String[] getBeforeJumpInferiors()
	{
		return this.beforeJumpInferiors;
	}

	public String[] getOverrideJumpSuperiors()
	{
		return this.overrideJumpSuperiors;
	}

	public String[] getOverrideJumpInferiors()
	{
		return this.overrideJumpInferiors;
	}

	public String[] getAfterJumpSuperiors()
	{
		return this.afterJumpSuperiors;
	}

	public String[] getAfterJumpInferiors()
	{
		return this.afterJumpInferiors;
	}

	public void setBeforeJumpSuperiors(String[] var1)
	{
		this.beforeJumpSuperiors = var1;
	}

	public void setBeforeJumpInferiors(String[] var1)
	{
		this.beforeJumpInferiors = var1;
	}

	public void setOverrideJumpSuperiors(String[] var1)
	{
		this.overrideJumpSuperiors = var1;
	}

	public void setOverrideJumpInferiors(String[] var1)
	{
		this.overrideJumpInferiors = var1;
	}

	public void setAfterJumpSuperiors(String[] var1)
	{
		this.afterJumpSuperiors = var1;
	}

	public void setAfterJumpInferiors(String[] var1)
	{
		this.afterJumpInferiors = var1;
	}

	public String[] getBeforeMoveEntitySuperiors()
	{
		return this.beforeMoveEntitySuperiors;
	}

	public String[] getBeforeMoveEntityInferiors()
	{
		return this.beforeMoveEntityInferiors;
	}

	public String[] getOverrideMoveEntitySuperiors()
	{
		return this.overrideMoveEntitySuperiors;
	}

	public String[] getOverrideMoveEntityInferiors()
	{
		return this.overrideMoveEntityInferiors;
	}

	public String[] getAfterMoveEntitySuperiors()
	{
		return this.afterMoveEntitySuperiors;
	}

	public String[] getAfterMoveEntityInferiors()
	{
		return this.afterMoveEntityInferiors;
	}

	public void setBeforeMoveEntitySuperiors(String[] var1)
	{
		this.beforeMoveEntitySuperiors = var1;
	}

	public void setBeforeMoveEntityInferiors(String[] var1)
	{
		this.beforeMoveEntityInferiors = var1;
	}

	public void setOverrideMoveEntitySuperiors(String[] var1)
	{
		this.overrideMoveEntitySuperiors = var1;
	}

	public void setOverrideMoveEntityInferiors(String[] var1)
	{
		this.overrideMoveEntityInferiors = var1;
	}

	public void setAfterMoveEntitySuperiors(String[] var1)
	{
		this.afterMoveEntitySuperiors = var1;
	}

	public void setAfterMoveEntityInferiors(String[] var1)
	{
		this.afterMoveEntityInferiors = var1;
	}

	public String[] getBeforeMoveEntityWithHeadingSuperiors()
	{
		return this.beforeMoveEntityWithHeadingSuperiors;
	}

	public String[] getBeforeMoveEntityWithHeadingInferiors()
	{
		return this.beforeMoveEntityWithHeadingInferiors;
	}

	public String[] getOverrideMoveEntityWithHeadingSuperiors()
	{
		return this.overrideMoveEntityWithHeadingSuperiors;
	}

	public String[] getOverrideMoveEntityWithHeadingInferiors()
	{
		return this.overrideMoveEntityWithHeadingInferiors;
	}

	public String[] getAfterMoveEntityWithHeadingSuperiors()
	{
		return this.afterMoveEntityWithHeadingSuperiors;
	}

	public String[] getAfterMoveEntityWithHeadingInferiors()
	{
		return this.afterMoveEntityWithHeadingInferiors;
	}

	public void setBeforeMoveEntityWithHeadingSuperiors(String[] var1)
	{
		this.beforeMoveEntityWithHeadingSuperiors = var1;
	}

	public void setBeforeMoveEntityWithHeadingInferiors(String[] var1)
	{
		this.beforeMoveEntityWithHeadingInferiors = var1;
	}

	public void setOverrideMoveEntityWithHeadingSuperiors(String[] var1)
	{
		this.overrideMoveEntityWithHeadingSuperiors = var1;
	}

	public void setOverrideMoveEntityWithHeadingInferiors(String[] var1)
	{
		this.overrideMoveEntityWithHeadingInferiors = var1;
	}

	public void setAfterMoveEntityWithHeadingSuperiors(String[] var1)
	{
		this.afterMoveEntityWithHeadingSuperiors = var1;
	}

	public void setAfterMoveEntityWithHeadingInferiors(String[] var1)
	{
		this.afterMoveEntityWithHeadingInferiors = var1;
	}

	public String[] getBeforeMoveFlyingSuperiors()
	{
		return this.beforeMoveFlyingSuperiors;
	}

	public String[] getBeforeMoveFlyingInferiors()
	{
		return this.beforeMoveFlyingInferiors;
	}

	public String[] getOverrideMoveFlyingSuperiors()
	{
		return this.overrideMoveFlyingSuperiors;
	}

	public String[] getOverrideMoveFlyingInferiors()
	{
		return this.overrideMoveFlyingInferiors;
	}

	public String[] getAfterMoveFlyingSuperiors()
	{
		return this.afterMoveFlyingSuperiors;
	}

	public String[] getAfterMoveFlyingInferiors()
	{
		return this.afterMoveFlyingInferiors;
	}

	public void setBeforeMoveFlyingSuperiors(String[] var1)
	{
		this.beforeMoveFlyingSuperiors = var1;
	}

	public void setBeforeMoveFlyingInferiors(String[] var1)
	{
		this.beforeMoveFlyingInferiors = var1;
	}

	public void setOverrideMoveFlyingSuperiors(String[] var1)
	{
		this.overrideMoveFlyingSuperiors = var1;
	}

	public void setOverrideMoveFlyingInferiors(String[] var1)
	{
		this.overrideMoveFlyingInferiors = var1;
	}

	public void setAfterMoveFlyingSuperiors(String[] var1)
	{
		this.afterMoveFlyingSuperiors = var1;
	}

	public void setAfterMoveFlyingInferiors(String[] var1)
	{
		this.afterMoveFlyingInferiors = var1;
	}

	public String[] getBeforeOnDeathSuperiors()
	{
		return this.beforeOnDeathSuperiors;
	}

	public String[] getBeforeOnDeathInferiors()
	{
		return this.beforeOnDeathInferiors;
	}

	public String[] getOverrideOnDeathSuperiors()
	{
		return this.overrideOnDeathSuperiors;
	}

	public String[] getOverrideOnDeathInferiors()
	{
		return this.overrideOnDeathInferiors;
	}

	public String[] getAfterOnDeathSuperiors()
	{
		return this.afterOnDeathSuperiors;
	}

	public String[] getAfterOnDeathInferiors()
	{
		return this.afterOnDeathInferiors;
	}

	public void setBeforeOnDeathSuperiors(String[] var1)
	{
		this.beforeOnDeathSuperiors = var1;
	}

	public void setBeforeOnDeathInferiors(String[] var1)
	{
		this.beforeOnDeathInferiors = var1;
	}

	public void setOverrideOnDeathSuperiors(String[] var1)
	{
		this.overrideOnDeathSuperiors = var1;
	}

	public void setOverrideOnDeathInferiors(String[] var1)
	{
		this.overrideOnDeathInferiors = var1;
	}

	public void setAfterOnDeathSuperiors(String[] var1)
	{
		this.afterOnDeathSuperiors = var1;
	}

	public void setAfterOnDeathInferiors(String[] var1)
	{
		this.afterOnDeathInferiors = var1;
	}

	public String[] getBeforeOnLivingUpdateSuperiors()
	{
		return this.beforeOnLivingUpdateSuperiors;
	}

	public String[] getBeforeOnLivingUpdateInferiors()
	{
		return this.beforeOnLivingUpdateInferiors;
	}

	public String[] getOverrideOnLivingUpdateSuperiors()
	{
		return this.overrideOnLivingUpdateSuperiors;
	}

	public String[] getOverrideOnLivingUpdateInferiors()
	{
		return this.overrideOnLivingUpdateInferiors;
	}

	public String[] getAfterOnLivingUpdateSuperiors()
	{
		return this.afterOnLivingUpdateSuperiors;
	}

	public String[] getAfterOnLivingUpdateInferiors()
	{
		return this.afterOnLivingUpdateInferiors;
	}

	public void setBeforeOnLivingUpdateSuperiors(String[] var1)
	{
		this.beforeOnLivingUpdateSuperiors = var1;
	}

	public void setBeforeOnLivingUpdateInferiors(String[] var1)
	{
		this.beforeOnLivingUpdateInferiors = var1;
	}

	public void setOverrideOnLivingUpdateSuperiors(String[] var1)
	{
		this.overrideOnLivingUpdateSuperiors = var1;
	}

	public void setOverrideOnLivingUpdateInferiors(String[] var1)
	{
		this.overrideOnLivingUpdateInferiors = var1;
	}

	public void setAfterOnLivingUpdateSuperiors(String[] var1)
	{
		this.afterOnLivingUpdateSuperiors = var1;
	}

	public void setAfterOnLivingUpdateInferiors(String[] var1)
	{
		this.afterOnLivingUpdateInferiors = var1;
	}

	public String[] getBeforeOnKillEntitySuperiors()
	{
		return this.beforeOnKillEntitySuperiors;
	}

	public String[] getBeforeOnKillEntityInferiors()
	{
		return this.beforeOnKillEntityInferiors;
	}

	public String[] getOverrideOnKillEntitySuperiors()
	{
		return this.overrideOnKillEntitySuperiors;
	}

	public String[] getOverrideOnKillEntityInferiors()
	{
		return this.overrideOnKillEntityInferiors;
	}

	public String[] getAfterOnKillEntitySuperiors()
	{
		return this.afterOnKillEntitySuperiors;
	}

	public String[] getAfterOnKillEntityInferiors()
	{
		return this.afterOnKillEntityInferiors;
	}

	public void setBeforeOnKillEntitySuperiors(String[] var1)
	{
		this.beforeOnKillEntitySuperiors = var1;
	}

	public void setBeforeOnKillEntityInferiors(String[] var1)
	{
		this.beforeOnKillEntityInferiors = var1;
	}

	public void setOverrideOnKillEntitySuperiors(String[] var1)
	{
		this.overrideOnKillEntitySuperiors = var1;
	}

	public void setOverrideOnKillEntityInferiors(String[] var1)
	{
		this.overrideOnKillEntityInferiors = var1;
	}

	public void setAfterOnKillEntitySuperiors(String[] var1)
	{
		this.afterOnKillEntitySuperiors = var1;
	}

	public void setAfterOnKillEntityInferiors(String[] var1)
	{
		this.afterOnKillEntityInferiors = var1;
	}

	public String[] getBeforeOnUpdateSuperiors()
	{
		return this.beforeOnUpdateSuperiors;
	}

	public String[] getBeforeOnUpdateInferiors()
	{
		return this.beforeOnUpdateInferiors;
	}

	public String[] getOverrideOnUpdateSuperiors()
	{
		return this.overrideOnUpdateSuperiors;
	}

	public String[] getOverrideOnUpdateInferiors()
	{
		return this.overrideOnUpdateInferiors;
	}

	public String[] getAfterOnUpdateSuperiors()
	{
		return this.afterOnUpdateSuperiors;
	}

	public String[] getAfterOnUpdateInferiors()
	{
		return this.afterOnUpdateInferiors;
	}

	public void setBeforeOnUpdateSuperiors(String[] var1)
	{
		this.beforeOnUpdateSuperiors = var1;
	}

	public void setBeforeOnUpdateInferiors(String[] var1)
	{
		this.beforeOnUpdateInferiors = var1;
	}

	public void setOverrideOnUpdateSuperiors(String[] var1)
	{
		this.overrideOnUpdateSuperiors = var1;
	}

	public void setOverrideOnUpdateInferiors(String[] var1)
	{
		this.overrideOnUpdateInferiors = var1;
	}

	public void setAfterOnUpdateSuperiors(String[] var1)
	{
		this.afterOnUpdateSuperiors = var1;
	}

	public void setAfterOnUpdateInferiors(String[] var1)
	{
		this.afterOnUpdateInferiors = var1;
	}

	public String[] getBeforeOnUpdateEntitySuperiors()
	{
		return this.beforeOnUpdateEntitySuperiors;
	}

	public String[] getBeforeOnUpdateEntityInferiors()
	{
		return this.beforeOnUpdateEntityInferiors;
	}

	public String[] getOverrideOnUpdateEntitySuperiors()
	{
		return this.overrideOnUpdateEntitySuperiors;
	}

	public String[] getOverrideOnUpdateEntityInferiors()
	{
		return this.overrideOnUpdateEntityInferiors;
	}

	public String[] getAfterOnUpdateEntitySuperiors()
	{
		return this.afterOnUpdateEntitySuperiors;
	}

	public String[] getAfterOnUpdateEntityInferiors()
	{
		return this.afterOnUpdateEntityInferiors;
	}

	public void setBeforeOnUpdateEntitySuperiors(String[] var1)
	{
		this.beforeOnUpdateEntitySuperiors = var1;
	}

	public void setBeforeOnUpdateEntityInferiors(String[] var1)
	{
		this.beforeOnUpdateEntityInferiors = var1;
	}

	public void setOverrideOnUpdateEntitySuperiors(String[] var1)
	{
		this.overrideOnUpdateEntitySuperiors = var1;
	}

	public void setOverrideOnUpdateEntityInferiors(String[] var1)
	{
		this.overrideOnUpdateEntityInferiors = var1;
	}

	public void setAfterOnUpdateEntitySuperiors(String[] var1)
	{
		this.afterOnUpdateEntitySuperiors = var1;
	}

	public void setAfterOnUpdateEntityInferiors(String[] var1)
	{
		this.afterOnUpdateEntityInferiors = var1;
	}

	public String[] getBeforeReadEntityFromNBTSuperiors()
	{
		return this.beforeReadEntityFromNBTSuperiors;
	}

	public String[] getBeforeReadEntityFromNBTInferiors()
	{
		return this.beforeReadEntityFromNBTInferiors;
	}

	public String[] getOverrideReadEntityFromNBTSuperiors()
	{
		return this.overrideReadEntityFromNBTSuperiors;
	}

	public String[] getOverrideReadEntityFromNBTInferiors()
	{
		return this.overrideReadEntityFromNBTInferiors;
	}

	public String[] getAfterReadEntityFromNBTSuperiors()
	{
		return this.afterReadEntityFromNBTSuperiors;
	}

	public String[] getAfterReadEntityFromNBTInferiors()
	{
		return this.afterReadEntityFromNBTInferiors;
	}

	public void setBeforeReadEntityFromNBTSuperiors(String[] var1)
	{
		this.beforeReadEntityFromNBTSuperiors = var1;
	}

	public void setBeforeReadEntityFromNBTInferiors(String[] var1)
	{
		this.beforeReadEntityFromNBTInferiors = var1;
	}

	public void setOverrideReadEntityFromNBTSuperiors(String[] var1)
	{
		this.overrideReadEntityFromNBTSuperiors = var1;
	}

	public void setOverrideReadEntityFromNBTInferiors(String[] var1)
	{
		this.overrideReadEntityFromNBTInferiors = var1;
	}

	public void setAfterReadEntityFromNBTSuperiors(String[] var1)
	{
		this.afterReadEntityFromNBTSuperiors = var1;
	}

	public void setAfterReadEntityFromNBTInferiors(String[] var1)
	{
		this.afterReadEntityFromNBTInferiors = var1;
	}

	public String[] getBeforeSetDeadSuperiors()
	{
		return this.beforeSetDeadSuperiors;
	}

	public String[] getBeforeSetDeadInferiors()
	{
		return this.beforeSetDeadInferiors;
	}

	public String[] getOverrideSetDeadSuperiors()
	{
		return this.overrideSetDeadSuperiors;
	}

	public String[] getOverrideSetDeadInferiors()
	{
		return this.overrideSetDeadInferiors;
	}

	public String[] getAfterSetDeadSuperiors()
	{
		return this.afterSetDeadSuperiors;
	}

	public String[] getAfterSetDeadInferiors()
	{
		return this.afterSetDeadInferiors;
	}

	public void setBeforeSetDeadSuperiors(String[] var1)
	{
		this.beforeSetDeadSuperiors = var1;
	}

	public void setBeforeSetDeadInferiors(String[] var1)
	{
		this.beforeSetDeadInferiors = var1;
	}

	public void setOverrideSetDeadSuperiors(String[] var1)
	{
		this.overrideSetDeadSuperiors = var1;
	}

	public void setOverrideSetDeadInferiors(String[] var1)
	{
		this.overrideSetDeadInferiors = var1;
	}

	public void setAfterSetDeadSuperiors(String[] var1)
	{
		this.afterSetDeadSuperiors = var1;
	}

	public void setAfterSetDeadInferiors(String[] var1)
	{
		this.afterSetDeadInferiors = var1;
	}

	public String[] getBeforeSetPositionSuperiors()
	{
		return this.beforeSetPositionSuperiors;
	}

	public String[] getBeforeSetPositionInferiors()
	{
		return this.beforeSetPositionInferiors;
	}

	public String[] getOverrideSetPositionSuperiors()
	{
		return this.overrideSetPositionSuperiors;
	}

	public String[] getOverrideSetPositionInferiors()
	{
		return this.overrideSetPositionInferiors;
	}

	public String[] getAfterSetPositionSuperiors()
	{
		return this.afterSetPositionSuperiors;
	}

	public String[] getAfterSetPositionInferiors()
	{
		return this.afterSetPositionInferiors;
	}

	public void setBeforeSetPositionSuperiors(String[] var1)
	{
		this.beforeSetPositionSuperiors = var1;
	}

	public void setBeforeSetPositionInferiors(String[] var1)
	{
		this.beforeSetPositionInferiors = var1;
	}

	public void setOverrideSetPositionSuperiors(String[] var1)
	{
		this.overrideSetPositionSuperiors = var1;
	}

	public void setOverrideSetPositionInferiors(String[] var1)
	{
		this.overrideSetPositionInferiors = var1;
	}

	public void setAfterSetPositionSuperiors(String[] var1)
	{
		this.afterSetPositionSuperiors = var1;
	}

	public void setAfterSetPositionInferiors(String[] var1)
	{
		this.afterSetPositionInferiors = var1;
	}

	public String[] getBeforeUpdateEntityActionStateSuperiors()
	{
		return this.beforeUpdateEntityActionStateSuperiors;
	}

	public String[] getBeforeUpdateEntityActionStateInferiors()
	{
		return this.beforeUpdateEntityActionStateInferiors;
	}

	public String[] getOverrideUpdateEntityActionStateSuperiors()
	{
		return this.overrideUpdateEntityActionStateSuperiors;
	}

	public String[] getOverrideUpdateEntityActionStateInferiors()
	{
		return this.overrideUpdateEntityActionStateInferiors;
	}

	public String[] getAfterUpdateEntityActionStateSuperiors()
	{
		return this.afterUpdateEntityActionStateSuperiors;
	}

	public String[] getAfterUpdateEntityActionStateInferiors()
	{
		return this.afterUpdateEntityActionStateInferiors;
	}

	public void setBeforeUpdateEntityActionStateSuperiors(String[] var1)
	{
		this.beforeUpdateEntityActionStateSuperiors = var1;
	}

	public void setBeforeUpdateEntityActionStateInferiors(String[] var1)
	{
		this.beforeUpdateEntityActionStateInferiors = var1;
	}

	public void setOverrideUpdateEntityActionStateSuperiors(String[] var1)
	{
		this.overrideUpdateEntityActionStateSuperiors = var1;
	}

	public void setOverrideUpdateEntityActionStateInferiors(String[] var1)
	{
		this.overrideUpdateEntityActionStateInferiors = var1;
	}

	public void setAfterUpdateEntityActionStateSuperiors(String[] var1)
	{
		this.afterUpdateEntityActionStateSuperiors = var1;
	}

	public void setAfterUpdateEntityActionStateInferiors(String[] var1)
	{
		this.afterUpdateEntityActionStateInferiors = var1;
	}

	public String[] getBeforeWriteEntityToNBTSuperiors()
	{
		return this.beforeWriteEntityToNBTSuperiors;
	}

	public String[] getBeforeWriteEntityToNBTInferiors()
	{
		return this.beforeWriteEntityToNBTInferiors;
	}

	public String[] getOverrideWriteEntityToNBTSuperiors()
	{
		return this.overrideWriteEntityToNBTSuperiors;
	}

	public String[] getOverrideWriteEntityToNBTInferiors()
	{
		return this.overrideWriteEntityToNBTInferiors;
	}

	public String[] getAfterWriteEntityToNBTSuperiors()
	{
		return this.afterWriteEntityToNBTSuperiors;
	}

	public String[] getAfterWriteEntityToNBTInferiors()
	{
		return this.afterWriteEntityToNBTInferiors;
	}

	public void setBeforeWriteEntityToNBTSuperiors(String[] var1)
	{
		this.beforeWriteEntityToNBTSuperiors = var1;
	}

	public void setBeforeWriteEntityToNBTInferiors(String[] var1)
	{
		this.beforeWriteEntityToNBTInferiors = var1;
	}

	public void setOverrideWriteEntityToNBTSuperiors(String[] var1)
	{
		this.overrideWriteEntityToNBTSuperiors = var1;
	}

	public void setOverrideWriteEntityToNBTInferiors(String[] var1)
	{
		this.overrideWriteEntityToNBTInferiors = var1;
	}

	public void setAfterWriteEntityToNBTSuperiors(String[] var1)
	{
		this.afterWriteEntityToNBTSuperiors = var1;
	}

	public void setAfterWriteEntityToNBTInferiors(String[] var1)
	{
		this.afterWriteEntityToNBTInferiors = var1;
	}
}
