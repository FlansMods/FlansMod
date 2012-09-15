package co.uk.flansmods.common;

public final class PlayerBaseSorting
{
	private String[] beforeLocalConstructingSuperiors = null;
	private String[] beforeLocalConstructingInferiors = null;
	private String[] afterLocalConstructingSuperiors = null;
	private String[] afterLocalConstructingInferiors = null;
	private String[] beforeAddExhaustionSuperiors = null;
	private String[] beforeAddExhaustionInferiors = null;
	private String[] overrideAddExhaustionSuperiors = null;
	private String[] overrideAddExhaustionInferiors = null;
	private String[] afterAddExhaustionSuperiors = null;
	private String[] afterAddExhaustionInferiors = null;
	private String[] beforeAddMovementStatSuperiors = null;
	private String[] beforeAddMovementStatInferiors = null;
	private String[] overrideAddMovementStatSuperiors = null;
	private String[] overrideAddMovementStatInferiors = null;
	private String[] afterAddMovementStatSuperiors = null;
	private String[] afterAddMovementStatInferiors = null;
	private String[] beforeAddStatSuperiors = null;
	private String[] beforeAddStatInferiors = null;
	private String[] overrideAddStatSuperiors = null;
	private String[] overrideAddStatInferiors = null;
	private String[] afterAddStatSuperiors = null;
	private String[] afterAddStatInferiors = null;
	private String[] beforeAttackEntityFromSuperiors = null;
	private String[] beforeAttackEntityFromInferiors = null;
	private String[] overrideAttackEntityFromSuperiors = null;
	private String[] overrideAttackEntityFromInferiors = null;
	private String[] afterAttackEntityFromSuperiors = null;
	private String[] afterAttackEntityFromInferiors = null;
	private String[] beforeAlertWolvesSuperiors = null;
	private String[] beforeAlertWolvesInferiors = null;
	private String[] overrideAlertWolvesSuperiors = null;
	private String[] overrideAlertWolvesInferiors = null;
	private String[] afterAlertWolvesSuperiors = null;
	private String[] afterAlertWolvesInferiors = null;
	private String[] beforeAttackTargetEntityWithCurrentItemSuperiors = null;
	private String[] beforeAttackTargetEntityWithCurrentItemInferiors = null;
	private String[] overrideAttackTargetEntityWithCurrentItemSuperiors = null;
	private String[] overrideAttackTargetEntityWithCurrentItemInferiors = null;
	private String[] afterAttackTargetEntityWithCurrentItemSuperiors = null;
	private String[] afterAttackTargetEntityWithCurrentItemInferiors = null;
	private String[] beforeCanBreatheUnderwaterSuperiors = null;
	private String[] beforeCanBreatheUnderwaterInferiors = null;
	private String[] overrideCanBreatheUnderwaterSuperiors = null;
	private String[] overrideCanBreatheUnderwaterInferiors = null;
	private String[] afterCanBreatheUnderwaterSuperiors = null;
	private String[] afterCanBreatheUnderwaterInferiors = null;
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
	private String[] beforeCloseScreenSuperiors = null;
	private String[] beforeCloseScreenInferiors = null;
	private String[] overrideCloseScreenSuperiors = null;
	private String[] overrideCloseScreenInferiors = null;
	private String[] afterCloseScreenSuperiors = null;
	private String[] afterCloseScreenInferiors = null;
	private String[] beforeDamageEntitySuperiors = null;
	private String[] beforeDamageEntityInferiors = null;
	private String[] overrideDamageEntitySuperiors = null;
	private String[] overrideDamageEntityInferiors = null;
	private String[] afterDamageEntitySuperiors = null;
	private String[] afterDamageEntityInferiors = null;
	private String[] beforeDisplayGUIBrewingStandSuperiors = null;
	private String[] beforeDisplayGUIBrewingStandInferiors = null;
	private String[] overrideDisplayGUIBrewingStandSuperiors = null;
	private String[] overrideDisplayGUIBrewingStandInferiors = null;
	private String[] afterDisplayGUIBrewingStandSuperiors = null;
	private String[] afterDisplayGUIBrewingStandInferiors = null;
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
	private String[] beforeDisplayGUIEditSignSuperiors = null;
	private String[] beforeDisplayGUIEditSignInferiors = null;
	private String[] overrideDisplayGUIEditSignSuperiors = null;
	private String[] overrideDisplayGUIEditSignInferiors = null;
	private String[] afterDisplayGUIEditSignSuperiors = null;
	private String[] afterDisplayGUIEditSignInferiors = null;
	private String[] beforeDisplayGUIEnchantmentSuperiors = null;
	private String[] beforeDisplayGUIEnchantmentInferiors = null;
	private String[] overrideDisplayGUIEnchantmentSuperiors = null;
	private String[] overrideDisplayGUIEnchantmentInferiors = null;
	private String[] afterDisplayGUIEnchantmentSuperiors = null;
	private String[] afterDisplayGUIEnchantmentInferiors = null;
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
	private String[] beforeDropPlayerItemWithRandomChoiceSuperiors = null;
	private String[] beforeDropPlayerItemWithRandomChoiceInferiors = null;
	private String[] overrideDropPlayerItemWithRandomChoiceSuperiors = null;
	private String[] overrideDropPlayerItemWithRandomChoiceInferiors = null;
	private String[] afterDropPlayerItemWithRandomChoiceSuperiors = null;
	private String[] afterDropPlayerItemWithRandomChoiceInferiors = null;
	private String[] beforeFallSuperiors = null;
	private String[] beforeFallInferiors = null;
	private String[] overrideFallSuperiors = null;
	private String[] overrideFallInferiors = null;
	private String[] afterFallSuperiors = null;
	private String[] afterFallInferiors = null;
	private String[] beforeGetBrightnessSuperiors = null;
	private String[] beforeGetBrightnessInferiors = null;
	private String[] overrideGetBrightnessSuperiors = null;
	private String[] overrideGetBrightnessInferiors = null;
	private String[] afterGetBrightnessSuperiors = null;
	private String[] afterGetBrightnessInferiors = null;
	private String[] beforeGetBrightnessForRenderSuperiors = null;
	private String[] beforeGetBrightnessForRenderInferiors = null;
	private String[] overrideGetBrightnessForRenderSuperiors = null;
	private String[] overrideGetBrightnessForRenderInferiors = null;
	private String[] afterGetBrightnessForRenderSuperiors = null;
	private String[] afterGetBrightnessForRenderInferiors = null;
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
	private String[] beforeGetDistanceSqToEntitySuperiors = null;
	private String[] beforeGetDistanceSqToEntityInferiors = null;
	private String[] overrideGetDistanceSqToEntitySuperiors = null;
	private String[] overrideGetDistanceSqToEntityInferiors = null;
	private String[] afterGetDistanceSqToEntitySuperiors = null;
	private String[] afterGetDistanceSqToEntityInferiors = null;
	private String[] beforeGetFOVMultiplierSuperiors = null;
	private String[] beforeGetFOVMultiplierInferiors = null;
	private String[] overrideGetFOVMultiplierSuperiors = null;
	private String[] overrideGetFOVMultiplierInferiors = null;
	private String[] afterGetFOVMultiplierSuperiors = null;
	private String[] afterGetFOVMultiplierInferiors = null;
	private String[] beforeGetHurtSoundSuperiors = null;
	private String[] beforeGetHurtSoundInferiors = null;
	private String[] overrideGetHurtSoundSuperiors = null;
	private String[] overrideGetHurtSoundInferiors = null;
	private String[] afterGetHurtSoundSuperiors = null;
	private String[] afterGetHurtSoundInferiors = null;
	private String[] beforeGetItemIconSuperiors = null;
	private String[] beforeGetItemIconInferiors = null;
	private String[] overrideGetItemIconSuperiors = null;
	private String[] overrideGetItemIconInferiors = null;
	private String[] afterGetItemIconSuperiors = null;
	private String[] afterGetItemIconInferiors = null;
	private String[] beforeGetSleepTimerSuperiors = null;
	private String[] beforeGetSleepTimerInferiors = null;
	private String[] overrideGetSleepTimerSuperiors = null;
	private String[] overrideGetSleepTimerInferiors = null;
	private String[] afterGetSleepTimerSuperiors = null;
	private String[] afterGetSleepTimerInferiors = null;
	private String[] beforeGetSpeedModifierSuperiors = null;
	private String[] beforeGetSpeedModifierInferiors = null;
	private String[] overrideGetSpeedModifierSuperiors = null;
	private String[] overrideGetSpeedModifierInferiors = null;
	private String[] afterGetSpeedModifierSuperiors = null;
	private String[] afterGetSpeedModifierInferiors = null;
	private String[] beforeHandleLavaMovementSuperiors = null;
	private String[] beforeHandleLavaMovementInferiors = null;
	private String[] overrideHandleLavaMovementSuperiors = null;
	private String[] overrideHandleLavaMovementInferiors = null;
	private String[] afterHandleLavaMovementSuperiors = null;
	private String[] afterHandleLavaMovementInferiors = null;
	private String[] beforeHandleWaterMovementSuperiors = null;
	private String[] beforeHandleWaterMovementInferiors = null;
	private String[] overrideHandleWaterMovementSuperiors = null;
	private String[] overrideHandleWaterMovementInferiors = null;
	private String[] afterHandleWaterMovementSuperiors = null;
	private String[] afterHandleWaterMovementInferiors = null;
	private String[] beforeHealSuperiors = null;
	private String[] beforeHealInferiors = null;
	private String[] overrideHealSuperiors = null;
	private String[] overrideHealInferiors = null;
	private String[] afterHealSuperiors = null;
	private String[] afterHealInferiors = null;
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
	private String[] beforeIsSneakingSuperiors = null;
	private String[] beforeIsSneakingInferiors = null;
	private String[] overrideIsSneakingSuperiors = null;
	private String[] overrideIsSneakingInferiors = null;
	private String[] afterIsSneakingSuperiors = null;
	private String[] afterIsSneakingInferiors = null;
	private String[] beforeIsSprintingSuperiors = null;
	private String[] beforeIsSprintingInferiors = null;
	private String[] overrideIsSprintingSuperiors = null;
	private String[] overrideIsSprintingInferiors = null;
	private String[] afterIsSprintingSuperiors = null;
	private String[] afterIsSprintingInferiors = null;
	private String[] beforeJumpSuperiors = null;
	private String[] beforeJumpInferiors = null;
	private String[] overrideJumpSuperiors = null;
	private String[] overrideJumpInferiors = null;
	private String[] afterJumpSuperiors = null;
	private String[] afterJumpInferiors = null;
	private String[] beforeKnockBackSuperiors = null;
	private String[] beforeKnockBackInferiors = null;
	private String[] overrideKnockBackSuperiors = null;
	private String[] overrideKnockBackInferiors = null;
	private String[] afterKnockBackSuperiors = null;
	private String[] afterKnockBackInferiors = null;
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
	private String[] beforePlayStepSoundSuperiors = null;
	private String[] beforePlayStepSoundInferiors = null;
	private String[] overridePlayStepSoundSuperiors = null;
	private String[] overridePlayStepSoundInferiors = null;
	private String[] afterPlayStepSoundSuperiors = null;
	private String[] afterPlayStepSoundInferiors = null;
	private String[] beforePushOutOfBlocksSuperiors = null;
	private String[] beforePushOutOfBlocksInferiors = null;
	private String[] overridePushOutOfBlocksSuperiors = null;
	private String[] overridePushOutOfBlocksInferiors = null;
	private String[] afterPushOutOfBlocksSuperiors = null;
	private String[] afterPushOutOfBlocksInferiors = null;
	private String[] beforeRayTraceSuperiors = null;
	private String[] beforeRayTraceInferiors = null;
	private String[] overrideRayTraceSuperiors = null;
	private String[] overrideRayTraceInferiors = null;
	private String[] afterRayTraceSuperiors = null;
	private String[] afterRayTraceInferiors = null;
	private String[] beforeReadEntityFromNBTSuperiors = null;
	private String[] beforeReadEntityFromNBTInferiors = null;
	private String[] overrideReadEntityFromNBTSuperiors = null;
	private String[] overrideReadEntityFromNBTInferiors = null;
	private String[] afterReadEntityFromNBTSuperiors = null;
	private String[] afterReadEntityFromNBTInferiors = null;
	private String[] beforeRespawnPlayerSuperiors = null;
	private String[] beforeRespawnPlayerInferiors = null;
	private String[] overrideRespawnPlayerSuperiors = null;
	private String[] overrideRespawnPlayerInferiors = null;
	private String[] afterRespawnPlayerSuperiors = null;
	private String[] afterRespawnPlayerInferiors = null;
	private String[] beforeSetDeadSuperiors = null;
	private String[] beforeSetDeadInferiors = null;
	private String[] overrideSetDeadSuperiors = null;
	private String[] overrideSetDeadInferiors = null;
	private String[] afterSetDeadSuperiors = null;
	private String[] afterSetDeadInferiors = null;
	private String[] beforeSetPositionAndRotationSuperiors = null;
	private String[] beforeSetPositionAndRotationInferiors = null;
	private String[] overrideSetPositionAndRotationSuperiors = null;
	private String[] overrideSetPositionAndRotationInferiors = null;
	private String[] afterSetPositionAndRotationSuperiors = null;
	private String[] afterSetPositionAndRotationInferiors = null;
	private String[] beforeSleepInBedAtSuperiors = null;
	private String[] beforeSleepInBedAtInferiors = null;
	private String[] overrideSleepInBedAtSuperiors = null;
	private String[] overrideSleepInBedAtInferiors = null;
	private String[] afterSleepInBedAtSuperiors = null;
	private String[] afterSleepInBedAtInferiors = null;
	private String[] beforeSwingItemSuperiors = null;
	private String[] beforeSwingItemInferiors = null;
	private String[] overrideSwingItemSuperiors = null;
	private String[] overrideSwingItemInferiors = null;
	private String[] afterSwingItemSuperiors = null;
	private String[] afterSwingItemInferiors = null;
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

	public String[] getBeforeAddExhaustionSuperiors()
	{
		return this.beforeAddExhaustionSuperiors;
	}

	public String[] getBeforeAddExhaustionInferiors()
	{
		return this.beforeAddExhaustionInferiors;
	}

	public String[] getOverrideAddExhaustionSuperiors()
	{
		return this.overrideAddExhaustionSuperiors;
	}

	public String[] getOverrideAddExhaustionInferiors()
	{
		return this.overrideAddExhaustionInferiors;
	}

	public String[] getAfterAddExhaustionSuperiors()
	{
		return this.afterAddExhaustionSuperiors;
	}

	public String[] getAfterAddExhaustionInferiors()
	{
		return this.afterAddExhaustionInferiors;
	}

	public void setBeforeAddExhaustionSuperiors(String[] var1)
	{
		this.beforeAddExhaustionSuperiors = var1;
	}

	public void setBeforeAddExhaustionInferiors(String[] var1)
	{
		this.beforeAddExhaustionInferiors = var1;
	}

	public void setOverrideAddExhaustionSuperiors(String[] var1)
	{
		this.overrideAddExhaustionSuperiors = var1;
	}

	public void setOverrideAddExhaustionInferiors(String[] var1)
	{
		this.overrideAddExhaustionInferiors = var1;
	}

	public void setAfterAddExhaustionSuperiors(String[] var1)
	{
		this.afterAddExhaustionSuperiors = var1;
	}

	public void setAfterAddExhaustionInferiors(String[] var1)
	{
		this.afterAddExhaustionInferiors = var1;
	}

	public String[] getBeforeAddMovementStatSuperiors()
	{
		return this.beforeAddMovementStatSuperiors;
	}

	public String[] getBeforeAddMovementStatInferiors()
	{
		return this.beforeAddMovementStatInferiors;
	}

	public String[] getOverrideAddMovementStatSuperiors()
	{
		return this.overrideAddMovementStatSuperiors;
	}

	public String[] getOverrideAddMovementStatInferiors()
	{
		return this.overrideAddMovementStatInferiors;
	}

	public String[] getAfterAddMovementStatSuperiors()
	{
		return this.afterAddMovementStatSuperiors;
	}

	public String[] getAfterAddMovementStatInferiors()
	{
		return this.afterAddMovementStatInferiors;
	}

	public void setBeforeAddMovementStatSuperiors(String[] var1)
	{
		this.beforeAddMovementStatSuperiors = var1;
	}

	public void setBeforeAddMovementStatInferiors(String[] var1)
	{
		this.beforeAddMovementStatInferiors = var1;
	}

	public void setOverrideAddMovementStatSuperiors(String[] var1)
	{
		this.overrideAddMovementStatSuperiors = var1;
	}

	public void setOverrideAddMovementStatInferiors(String[] var1)
	{
		this.overrideAddMovementStatInferiors = var1;
	}

	public void setAfterAddMovementStatSuperiors(String[] var1)
	{
		this.afterAddMovementStatSuperiors = var1;
	}

	public void setAfterAddMovementStatInferiors(String[] var1)
	{
		this.afterAddMovementStatInferiors = var1;
	}

	public String[] getBeforeAddStatSuperiors()
	{
		return this.beforeAddStatSuperiors;
	}

	public String[] getBeforeAddStatInferiors()
	{
		return this.beforeAddStatInferiors;
	}

	public String[] getOverrideAddStatSuperiors()
	{
		return this.overrideAddStatSuperiors;
	}

	public String[] getOverrideAddStatInferiors()
	{
		return this.overrideAddStatInferiors;
	}

	public String[] getAfterAddStatSuperiors()
	{
		return this.afterAddStatSuperiors;
	}

	public String[] getAfterAddStatInferiors()
	{
		return this.afterAddStatInferiors;
	}

	public void setBeforeAddStatSuperiors(String[] var1)
	{
		this.beforeAddStatSuperiors = var1;
	}

	public void setBeforeAddStatInferiors(String[] var1)
	{
		this.beforeAddStatInferiors = var1;
	}

	public void setOverrideAddStatSuperiors(String[] var1)
	{
		this.overrideAddStatSuperiors = var1;
	}

	public void setOverrideAddStatInferiors(String[] var1)
	{
		this.overrideAddStatInferiors = var1;
	}

	public void setAfterAddStatSuperiors(String[] var1)
	{
		this.afterAddStatSuperiors = var1;
	}

	public void setAfterAddStatInferiors(String[] var1)
	{
		this.afterAddStatInferiors = var1;
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

	public String[] getBeforeAlertWolvesSuperiors()
	{
		return this.beforeAlertWolvesSuperiors;
	}

	public String[] getBeforeAlertWolvesInferiors()
	{
		return this.beforeAlertWolvesInferiors;
	}

	public String[] getOverrideAlertWolvesSuperiors()
	{
		return this.overrideAlertWolvesSuperiors;
	}

	public String[] getOverrideAlertWolvesInferiors()
	{
		return this.overrideAlertWolvesInferiors;
	}

	public String[] getAfterAlertWolvesSuperiors()
	{
		return this.afterAlertWolvesSuperiors;
	}

	public String[] getAfterAlertWolvesInferiors()
	{
		return this.afterAlertWolvesInferiors;
	}

	public void setBeforeAlertWolvesSuperiors(String[] var1)
	{
		this.beforeAlertWolvesSuperiors = var1;
	}

	public void setBeforeAlertWolvesInferiors(String[] var1)
	{
		this.beforeAlertWolvesInferiors = var1;
	}

	public void setOverrideAlertWolvesSuperiors(String[] var1)
	{
		this.overrideAlertWolvesSuperiors = var1;
	}

	public void setOverrideAlertWolvesInferiors(String[] var1)
	{
		this.overrideAlertWolvesInferiors = var1;
	}

	public void setAfterAlertWolvesSuperiors(String[] var1)
	{
		this.afterAlertWolvesSuperiors = var1;
	}

	public void setAfterAlertWolvesInferiors(String[] var1)
	{
		this.afterAlertWolvesInferiors = var1;
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

	public String[] getBeforeCanBreatheUnderwaterSuperiors()
	{
		return this.beforeCanBreatheUnderwaterSuperiors;
	}

	public String[] getBeforeCanBreatheUnderwaterInferiors()
	{
		return this.beforeCanBreatheUnderwaterInferiors;
	}

	public String[] getOverrideCanBreatheUnderwaterSuperiors()
	{
		return this.overrideCanBreatheUnderwaterSuperiors;
	}

	public String[] getOverrideCanBreatheUnderwaterInferiors()
	{
		return this.overrideCanBreatheUnderwaterInferiors;
	}

	public String[] getAfterCanBreatheUnderwaterSuperiors()
	{
		return this.afterCanBreatheUnderwaterSuperiors;
	}

	public String[] getAfterCanBreatheUnderwaterInferiors()
	{
		return this.afterCanBreatheUnderwaterInferiors;
	}

	public void setBeforeCanBreatheUnderwaterSuperiors(String[] var1)
	{
		this.beforeCanBreatheUnderwaterSuperiors = var1;
	}

	public void setBeforeCanBreatheUnderwaterInferiors(String[] var1)
	{
		this.beforeCanBreatheUnderwaterInferiors = var1;
	}

	public void setOverrideCanBreatheUnderwaterSuperiors(String[] var1)
	{
		this.overrideCanBreatheUnderwaterSuperiors = var1;
	}

	public void setOverrideCanBreatheUnderwaterInferiors(String[] var1)
	{
		this.overrideCanBreatheUnderwaterInferiors = var1;
	}

	public void setAfterCanBreatheUnderwaterSuperiors(String[] var1)
	{
		this.afterCanBreatheUnderwaterSuperiors = var1;
	}

	public void setAfterCanBreatheUnderwaterInferiors(String[] var1)
	{
		this.afterCanBreatheUnderwaterInferiors = var1;
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

	public String[] getBeforeCloseScreenSuperiors()
	{
		return this.beforeCloseScreenSuperiors;
	}

	public String[] getBeforeCloseScreenInferiors()
	{
		return this.beforeCloseScreenInferiors;
	}

	public String[] getOverrideCloseScreenSuperiors()
	{
		return this.overrideCloseScreenSuperiors;
	}

	public String[] getOverrideCloseScreenInferiors()
	{
		return this.overrideCloseScreenInferiors;
	}

	public String[] getAfterCloseScreenSuperiors()
	{
		return this.afterCloseScreenSuperiors;
	}

	public String[] getAfterCloseScreenInferiors()
	{
		return this.afterCloseScreenInferiors;
	}

	public void setBeforeCloseScreenSuperiors(String[] var1)
	{
		this.beforeCloseScreenSuperiors = var1;
	}

	public void setBeforeCloseScreenInferiors(String[] var1)
	{
		this.beforeCloseScreenInferiors = var1;
	}

	public void setOverrideCloseScreenSuperiors(String[] var1)
	{
		this.overrideCloseScreenSuperiors = var1;
	}

	public void setOverrideCloseScreenInferiors(String[] var1)
	{
		this.overrideCloseScreenInferiors = var1;
	}

	public void setAfterCloseScreenSuperiors(String[] var1)
	{
		this.afterCloseScreenSuperiors = var1;
	}

	public void setAfterCloseScreenInferiors(String[] var1)
	{
		this.afterCloseScreenInferiors = var1;
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

	public String[] getBeforeDisplayGUIBrewingStandSuperiors()
	{
		return this.beforeDisplayGUIBrewingStandSuperiors;
	}

	public String[] getBeforeDisplayGUIBrewingStandInferiors()
	{
		return this.beforeDisplayGUIBrewingStandInferiors;
	}

	public String[] getOverrideDisplayGUIBrewingStandSuperiors()
	{
		return this.overrideDisplayGUIBrewingStandSuperiors;
	}

	public String[] getOverrideDisplayGUIBrewingStandInferiors()
	{
		return this.overrideDisplayGUIBrewingStandInferiors;
	}

	public String[] getAfterDisplayGUIBrewingStandSuperiors()
	{
		return this.afterDisplayGUIBrewingStandSuperiors;
	}

	public String[] getAfterDisplayGUIBrewingStandInferiors()
	{
		return this.afterDisplayGUIBrewingStandInferiors;
	}

	public void setBeforeDisplayGUIBrewingStandSuperiors(String[] var1)
	{
		this.beforeDisplayGUIBrewingStandSuperiors = var1;
	}

	public void setBeforeDisplayGUIBrewingStandInferiors(String[] var1)
	{
		this.beforeDisplayGUIBrewingStandInferiors = var1;
	}

	public void setOverrideDisplayGUIBrewingStandSuperiors(String[] var1)
	{
		this.overrideDisplayGUIBrewingStandSuperiors = var1;
	}

	public void setOverrideDisplayGUIBrewingStandInferiors(String[] var1)
	{
		this.overrideDisplayGUIBrewingStandInferiors = var1;
	}

	public void setAfterDisplayGUIBrewingStandSuperiors(String[] var1)
	{
		this.afterDisplayGUIBrewingStandSuperiors = var1;
	}

	public void setAfterDisplayGUIBrewingStandInferiors(String[] var1)
	{
		this.afterDisplayGUIBrewingStandInferiors = var1;
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

	public String[] getBeforeDisplayGUIEditSignSuperiors()
	{
		return this.beforeDisplayGUIEditSignSuperiors;
	}

	public String[] getBeforeDisplayGUIEditSignInferiors()
	{
		return this.beforeDisplayGUIEditSignInferiors;
	}

	public String[] getOverrideDisplayGUIEditSignSuperiors()
	{
		return this.overrideDisplayGUIEditSignSuperiors;
	}

	public String[] getOverrideDisplayGUIEditSignInferiors()
	{
		return this.overrideDisplayGUIEditSignInferiors;
	}

	public String[] getAfterDisplayGUIEditSignSuperiors()
	{
		return this.afterDisplayGUIEditSignSuperiors;
	}

	public String[] getAfterDisplayGUIEditSignInferiors()
	{
		return this.afterDisplayGUIEditSignInferiors;
	}

	public void setBeforeDisplayGUIEditSignSuperiors(String[] var1)
	{
		this.beforeDisplayGUIEditSignSuperiors = var1;
	}

	public void setBeforeDisplayGUIEditSignInferiors(String[] var1)
	{
		this.beforeDisplayGUIEditSignInferiors = var1;
	}

	public void setOverrideDisplayGUIEditSignSuperiors(String[] var1)
	{
		this.overrideDisplayGUIEditSignSuperiors = var1;
	}

	public void setOverrideDisplayGUIEditSignInferiors(String[] var1)
	{
		this.overrideDisplayGUIEditSignInferiors = var1;
	}

	public void setAfterDisplayGUIEditSignSuperiors(String[] var1)
	{
		this.afterDisplayGUIEditSignSuperiors = var1;
	}

	public void setAfterDisplayGUIEditSignInferiors(String[] var1)
	{
		this.afterDisplayGUIEditSignInferiors = var1;
	}

	public String[] getBeforeDisplayGUIEnchantmentSuperiors()
	{
		return this.beforeDisplayGUIEnchantmentSuperiors;
	}

	public String[] getBeforeDisplayGUIEnchantmentInferiors()
	{
		return this.beforeDisplayGUIEnchantmentInferiors;
	}

	public String[] getOverrideDisplayGUIEnchantmentSuperiors()
	{
		return this.overrideDisplayGUIEnchantmentSuperiors;
	}

	public String[] getOverrideDisplayGUIEnchantmentInferiors()
	{
		return this.overrideDisplayGUIEnchantmentInferiors;
	}

	public String[] getAfterDisplayGUIEnchantmentSuperiors()
	{
		return this.afterDisplayGUIEnchantmentSuperiors;
	}

	public String[] getAfterDisplayGUIEnchantmentInferiors()
	{
		return this.afterDisplayGUIEnchantmentInferiors;
	}

	public void setBeforeDisplayGUIEnchantmentSuperiors(String[] var1)
	{
		this.beforeDisplayGUIEnchantmentSuperiors = var1;
	}

	public void setBeforeDisplayGUIEnchantmentInferiors(String[] var1)
	{
		this.beforeDisplayGUIEnchantmentInferiors = var1;
	}

	public void setOverrideDisplayGUIEnchantmentSuperiors(String[] var1)
	{
		this.overrideDisplayGUIEnchantmentSuperiors = var1;
	}

	public void setOverrideDisplayGUIEnchantmentInferiors(String[] var1)
	{
		this.overrideDisplayGUIEnchantmentInferiors = var1;
	}

	public void setAfterDisplayGUIEnchantmentSuperiors(String[] var1)
	{
		this.afterDisplayGUIEnchantmentSuperiors = var1;
	}

	public void setAfterDisplayGUIEnchantmentInferiors(String[] var1)
	{
		this.afterDisplayGUIEnchantmentInferiors = var1;
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

	public String[] getBeforeDropPlayerItemWithRandomChoiceSuperiors()
	{
		return this.beforeDropPlayerItemWithRandomChoiceSuperiors;
	}

	public String[] getBeforeDropPlayerItemWithRandomChoiceInferiors()
	{
		return this.beforeDropPlayerItemWithRandomChoiceInferiors;
	}

	public String[] getOverrideDropPlayerItemWithRandomChoiceSuperiors()
	{
		return this.overrideDropPlayerItemWithRandomChoiceSuperiors;
	}

	public String[] getOverrideDropPlayerItemWithRandomChoiceInferiors()
	{
		return this.overrideDropPlayerItemWithRandomChoiceInferiors;
	}

	public String[] getAfterDropPlayerItemWithRandomChoiceSuperiors()
	{
		return this.afterDropPlayerItemWithRandomChoiceSuperiors;
	}

	public String[] getAfterDropPlayerItemWithRandomChoiceInferiors()
	{
		return this.afterDropPlayerItemWithRandomChoiceInferiors;
	}

	public void setBeforeDropPlayerItemWithRandomChoiceSuperiors(String[] var1)
	{
		this.beforeDropPlayerItemWithRandomChoiceSuperiors = var1;
	}

	public void setBeforeDropPlayerItemWithRandomChoiceInferiors(String[] var1)
	{
		this.beforeDropPlayerItemWithRandomChoiceInferiors = var1;
	}

	public void setOverrideDropPlayerItemWithRandomChoiceSuperiors(String[] var1)
	{
		this.overrideDropPlayerItemWithRandomChoiceSuperiors = var1;
	}

	public void setOverrideDropPlayerItemWithRandomChoiceInferiors(String[] var1)
	{
		this.overrideDropPlayerItemWithRandomChoiceInferiors = var1;
	}

	public void setAfterDropPlayerItemWithRandomChoiceSuperiors(String[] var1)
	{
		this.afterDropPlayerItemWithRandomChoiceSuperiors = var1;
	}

	public void setAfterDropPlayerItemWithRandomChoiceInferiors(String[] var1)
	{
		this.afterDropPlayerItemWithRandomChoiceInferiors = var1;
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

	public String[] getBeforeGetBrightnessForRenderSuperiors()
	{
		return this.beforeGetBrightnessForRenderSuperiors;
	}

	public String[] getBeforeGetBrightnessForRenderInferiors()
	{
		return this.beforeGetBrightnessForRenderInferiors;
	}

	public String[] getOverrideGetBrightnessForRenderSuperiors()
	{
		return this.overrideGetBrightnessForRenderSuperiors;
	}

	public String[] getOverrideGetBrightnessForRenderInferiors()
	{
		return this.overrideGetBrightnessForRenderInferiors;
	}

	public String[] getAfterGetBrightnessForRenderSuperiors()
	{
		return this.afterGetBrightnessForRenderSuperiors;
	}

	public String[] getAfterGetBrightnessForRenderInferiors()
	{
		return this.afterGetBrightnessForRenderInferiors;
	}

	public void setBeforeGetBrightnessForRenderSuperiors(String[] var1)
	{
		this.beforeGetBrightnessForRenderSuperiors = var1;
	}

	public void setBeforeGetBrightnessForRenderInferiors(String[] var1)
	{
		this.beforeGetBrightnessForRenderInferiors = var1;
	}

	public void setOverrideGetBrightnessForRenderSuperiors(String[] var1)
	{
		this.overrideGetBrightnessForRenderSuperiors = var1;
	}

	public void setOverrideGetBrightnessForRenderInferiors(String[] var1)
	{
		this.overrideGetBrightnessForRenderInferiors = var1;
	}

	public void setAfterGetBrightnessForRenderSuperiors(String[] var1)
	{
		this.afterGetBrightnessForRenderSuperiors = var1;
	}

	public void setAfterGetBrightnessForRenderInferiors(String[] var1)
	{
		this.afterGetBrightnessForRenderInferiors = var1;
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

	public String[] getBeforeGetDistanceSqToEntitySuperiors()
	{
		return this.beforeGetDistanceSqToEntitySuperiors;
	}

	public String[] getBeforeGetDistanceSqToEntityInferiors()
	{
		return this.beforeGetDistanceSqToEntityInferiors;
	}

	public String[] getOverrideGetDistanceSqToEntitySuperiors()
	{
		return this.overrideGetDistanceSqToEntitySuperiors;
	}

	public String[] getOverrideGetDistanceSqToEntityInferiors()
	{
		return this.overrideGetDistanceSqToEntityInferiors;
	}

	public String[] getAfterGetDistanceSqToEntitySuperiors()
	{
		return this.afterGetDistanceSqToEntitySuperiors;
	}

	public String[] getAfterGetDistanceSqToEntityInferiors()
	{
		return this.afterGetDistanceSqToEntityInferiors;
	}

	public void setBeforeGetDistanceSqToEntitySuperiors(String[] var1)
	{
		this.beforeGetDistanceSqToEntitySuperiors = var1;
	}

	public void setBeforeGetDistanceSqToEntityInferiors(String[] var1)
	{
		this.beforeGetDistanceSqToEntityInferiors = var1;
	}

	public void setOverrideGetDistanceSqToEntitySuperiors(String[] var1)
	{
		this.overrideGetDistanceSqToEntitySuperiors = var1;
	}

	public void setOverrideGetDistanceSqToEntityInferiors(String[] var1)
	{
		this.overrideGetDistanceSqToEntityInferiors = var1;
	}

	public void setAfterGetDistanceSqToEntitySuperiors(String[] var1)
	{
		this.afterGetDistanceSqToEntitySuperiors = var1;
	}

	public void setAfterGetDistanceSqToEntityInferiors(String[] var1)
	{
		this.afterGetDistanceSqToEntityInferiors = var1;
	}

	public String[] getBeforeGetFOVMultiplierSuperiors()
	{
		return this.beforeGetFOVMultiplierSuperiors;
	}

	public String[] getBeforeGetFOVMultiplierInferiors()
	{
		return this.beforeGetFOVMultiplierInferiors;
	}

	public String[] getOverrideGetFOVMultiplierSuperiors()
	{
		return this.overrideGetFOVMultiplierSuperiors;
	}

	public String[] getOverrideGetFOVMultiplierInferiors()
	{
		return this.overrideGetFOVMultiplierInferiors;
	}

	public String[] getAfterGetFOVMultiplierSuperiors()
	{
		return this.afterGetFOVMultiplierSuperiors;
	}

	public String[] getAfterGetFOVMultiplierInferiors()
	{
		return this.afterGetFOVMultiplierInferiors;
	}

	public void setBeforeGetFOVMultiplierSuperiors(String[] var1)
	{
		this.beforeGetFOVMultiplierSuperiors = var1;
	}

	public void setBeforeGetFOVMultiplierInferiors(String[] var1)
	{
		this.beforeGetFOVMultiplierInferiors = var1;
	}

	public void setOverrideGetFOVMultiplierSuperiors(String[] var1)
	{
		this.overrideGetFOVMultiplierSuperiors = var1;
	}

	public void setOverrideGetFOVMultiplierInferiors(String[] var1)
	{
		this.overrideGetFOVMultiplierInferiors = var1;
	}

	public void setAfterGetFOVMultiplierSuperiors(String[] var1)
	{
		this.afterGetFOVMultiplierSuperiors = var1;
	}

	public void setAfterGetFOVMultiplierInferiors(String[] var1)
	{
		this.afterGetFOVMultiplierInferiors = var1;
	}

	public String[] getBeforeGetHurtSoundSuperiors()
	{
		return this.beforeGetHurtSoundSuperiors;
	}

	public String[] getBeforeGetHurtSoundInferiors()
	{
		return this.beforeGetHurtSoundInferiors;
	}

	public String[] getOverrideGetHurtSoundSuperiors()
	{
		return this.overrideGetHurtSoundSuperiors;
	}

	public String[] getOverrideGetHurtSoundInferiors()
	{
		return this.overrideGetHurtSoundInferiors;
	}

	public String[] getAfterGetHurtSoundSuperiors()
	{
		return this.afterGetHurtSoundSuperiors;
	}

	public String[] getAfterGetHurtSoundInferiors()
	{
		return this.afterGetHurtSoundInferiors;
	}

	public void setBeforeGetHurtSoundSuperiors(String[] var1)
	{
		this.beforeGetHurtSoundSuperiors = var1;
	}

	public void setBeforeGetHurtSoundInferiors(String[] var1)
	{
		this.beforeGetHurtSoundInferiors = var1;
	}

	public void setOverrideGetHurtSoundSuperiors(String[] var1)
	{
		this.overrideGetHurtSoundSuperiors = var1;
	}

	public void setOverrideGetHurtSoundInferiors(String[] var1)
	{
		this.overrideGetHurtSoundInferiors = var1;
	}

	public void setAfterGetHurtSoundSuperiors(String[] var1)
	{
		this.afterGetHurtSoundSuperiors = var1;
	}

	public void setAfterGetHurtSoundInferiors(String[] var1)
	{
		this.afterGetHurtSoundInferiors = var1;
	}

	public String[] getBeforeGetItemIconSuperiors()
	{
		return this.beforeGetItemIconSuperiors;
	}

	public String[] getBeforeGetItemIconInferiors()
	{
		return this.beforeGetItemIconInferiors;
	}

	public String[] getOverrideGetItemIconSuperiors()
	{
		return this.overrideGetItemIconSuperiors;
	}

	public String[] getOverrideGetItemIconInferiors()
	{
		return this.overrideGetItemIconInferiors;
	}

	public String[] getAfterGetItemIconSuperiors()
	{
		return this.afterGetItemIconSuperiors;
	}

	public String[] getAfterGetItemIconInferiors()
	{
		return this.afterGetItemIconInferiors;
	}

	public void setBeforeGetItemIconSuperiors(String[] var1)
	{
		this.beforeGetItemIconSuperiors = var1;
	}

	public void setBeforeGetItemIconInferiors(String[] var1)
	{
		this.beforeGetItemIconInferiors = var1;
	}

	public void setOverrideGetItemIconSuperiors(String[] var1)
	{
		this.overrideGetItemIconSuperiors = var1;
	}

	public void setOverrideGetItemIconInferiors(String[] var1)
	{
		this.overrideGetItemIconInferiors = var1;
	}

	public void setAfterGetItemIconSuperiors(String[] var1)
	{
		this.afterGetItemIconSuperiors = var1;
	}

	public void setAfterGetItemIconInferiors(String[] var1)
	{
		this.afterGetItemIconInferiors = var1;
	}

	public String[] getBeforeGetSleepTimerSuperiors()
	{
		return this.beforeGetSleepTimerSuperiors;
	}

	public String[] getBeforeGetSleepTimerInferiors()
	{
		return this.beforeGetSleepTimerInferiors;
	}

	public String[] getOverrideGetSleepTimerSuperiors()
	{
		return this.overrideGetSleepTimerSuperiors;
	}

	public String[] getOverrideGetSleepTimerInferiors()
	{
		return this.overrideGetSleepTimerInferiors;
	}

	public String[] getAfterGetSleepTimerSuperiors()
	{
		return this.afterGetSleepTimerSuperiors;
	}

	public String[] getAfterGetSleepTimerInferiors()
	{
		return this.afterGetSleepTimerInferiors;
	}

	public void setBeforeGetSleepTimerSuperiors(String[] var1)
	{
		this.beforeGetSleepTimerSuperiors = var1;
	}

	public void setBeforeGetSleepTimerInferiors(String[] var1)
	{
		this.beforeGetSleepTimerInferiors = var1;
	}

	public void setOverrideGetSleepTimerSuperiors(String[] var1)
	{
		this.overrideGetSleepTimerSuperiors = var1;
	}

	public void setOverrideGetSleepTimerInferiors(String[] var1)
	{
		this.overrideGetSleepTimerInferiors = var1;
	}

	public void setAfterGetSleepTimerSuperiors(String[] var1)
	{
		this.afterGetSleepTimerSuperiors = var1;
	}

	public void setAfterGetSleepTimerInferiors(String[] var1)
	{
		this.afterGetSleepTimerInferiors = var1;
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

	public String[] getBeforeHandleLavaMovementSuperiors()
	{
		return this.beforeHandleLavaMovementSuperiors;
	}

	public String[] getBeforeHandleLavaMovementInferiors()
	{
		return this.beforeHandleLavaMovementInferiors;
	}

	public String[] getOverrideHandleLavaMovementSuperiors()
	{
		return this.overrideHandleLavaMovementSuperiors;
	}

	public String[] getOverrideHandleLavaMovementInferiors()
	{
		return this.overrideHandleLavaMovementInferiors;
	}

	public String[] getAfterHandleLavaMovementSuperiors()
	{
		return this.afterHandleLavaMovementSuperiors;
	}

	public String[] getAfterHandleLavaMovementInferiors()
	{
		return this.afterHandleLavaMovementInferiors;
	}

	public void setBeforeHandleLavaMovementSuperiors(String[] var1)
	{
		this.beforeHandleLavaMovementSuperiors = var1;
	}

	public void setBeforeHandleLavaMovementInferiors(String[] var1)
	{
		this.beforeHandleLavaMovementInferiors = var1;
	}

	public void setOverrideHandleLavaMovementSuperiors(String[] var1)
	{
		this.overrideHandleLavaMovementSuperiors = var1;
	}

	public void setOverrideHandleLavaMovementInferiors(String[] var1)
	{
		this.overrideHandleLavaMovementInferiors = var1;
	}

	public void setAfterHandleLavaMovementSuperiors(String[] var1)
	{
		this.afterHandleLavaMovementSuperiors = var1;
	}

	public void setAfterHandleLavaMovementInferiors(String[] var1)
	{
		this.afterHandleLavaMovementInferiors = var1;
	}

	public String[] getBeforeHandleWaterMovementSuperiors()
	{
		return this.beforeHandleWaterMovementSuperiors;
	}

	public String[] getBeforeHandleWaterMovementInferiors()
	{
		return this.beforeHandleWaterMovementInferiors;
	}

	public String[] getOverrideHandleWaterMovementSuperiors()
	{
		return this.overrideHandleWaterMovementSuperiors;
	}

	public String[] getOverrideHandleWaterMovementInferiors()
	{
		return this.overrideHandleWaterMovementInferiors;
	}

	public String[] getAfterHandleWaterMovementSuperiors()
	{
		return this.afterHandleWaterMovementSuperiors;
	}

	public String[] getAfterHandleWaterMovementInferiors()
	{
		return this.afterHandleWaterMovementInferiors;
	}

	public void setBeforeHandleWaterMovementSuperiors(String[] var1)
	{
		this.beforeHandleWaterMovementSuperiors = var1;
	}

	public void setBeforeHandleWaterMovementInferiors(String[] var1)
	{
		this.beforeHandleWaterMovementInferiors = var1;
	}

	public void setOverrideHandleWaterMovementSuperiors(String[] var1)
	{
		this.overrideHandleWaterMovementSuperiors = var1;
	}

	public void setOverrideHandleWaterMovementInferiors(String[] var1)
	{
		this.overrideHandleWaterMovementInferiors = var1;
	}

	public void setAfterHandleWaterMovementSuperiors(String[] var1)
	{
		this.afterHandleWaterMovementSuperiors = var1;
	}

	public void setAfterHandleWaterMovementInferiors(String[] var1)
	{
		this.afterHandleWaterMovementInferiors = var1;
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

	public String[] getBeforeIsSneakingSuperiors()
	{
		return this.beforeIsSneakingSuperiors;
	}

	public String[] getBeforeIsSneakingInferiors()
	{
		return this.beforeIsSneakingInferiors;
	}

	public String[] getOverrideIsSneakingSuperiors()
	{
		return this.overrideIsSneakingSuperiors;
	}

	public String[] getOverrideIsSneakingInferiors()
	{
		return this.overrideIsSneakingInferiors;
	}

	public String[] getAfterIsSneakingSuperiors()
	{
		return this.afterIsSneakingSuperiors;
	}

	public String[] getAfterIsSneakingInferiors()
	{
		return this.afterIsSneakingInferiors;
	}

	public void setBeforeIsSneakingSuperiors(String[] var1)
	{
		this.beforeIsSneakingSuperiors = var1;
	}

	public void setBeforeIsSneakingInferiors(String[] var1)
	{
		this.beforeIsSneakingInferiors = var1;
	}

	public void setOverrideIsSneakingSuperiors(String[] var1)
	{
		this.overrideIsSneakingSuperiors = var1;
	}

	public void setOverrideIsSneakingInferiors(String[] var1)
	{
		this.overrideIsSneakingInferiors = var1;
	}

	public void setAfterIsSneakingSuperiors(String[] var1)
	{
		this.afterIsSneakingSuperiors = var1;
	}

	public void setAfterIsSneakingInferiors(String[] var1)
	{
		this.afterIsSneakingInferiors = var1;
	}

	public String[] getBeforeIsSprintingSuperiors()
	{
		return this.beforeIsSprintingSuperiors;
	}

	public String[] getBeforeIsSprintingInferiors()
	{
		return this.beforeIsSprintingInferiors;
	}

	public String[] getOverrideIsSprintingSuperiors()
	{
		return this.overrideIsSprintingSuperiors;
	}

	public String[] getOverrideIsSprintingInferiors()
	{
		return this.overrideIsSprintingInferiors;
	}

	public String[] getAfterIsSprintingSuperiors()
	{
		return this.afterIsSprintingSuperiors;
	}

	public String[] getAfterIsSprintingInferiors()
	{
		return this.afterIsSprintingInferiors;
	}

	public void setBeforeIsSprintingSuperiors(String[] var1)
	{
		this.beforeIsSprintingSuperiors = var1;
	}

	public void setBeforeIsSprintingInferiors(String[] var1)
	{
		this.beforeIsSprintingInferiors = var1;
	}

	public void setOverrideIsSprintingSuperiors(String[] var1)
	{
		this.overrideIsSprintingSuperiors = var1;
	}

	public void setOverrideIsSprintingInferiors(String[] var1)
	{
		this.overrideIsSprintingInferiors = var1;
	}

	public void setAfterIsSprintingSuperiors(String[] var1)
	{
		this.afterIsSprintingSuperiors = var1;
	}

	public void setAfterIsSprintingInferiors(String[] var1)
	{
		this.afterIsSprintingInferiors = var1;
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

	public String[] getBeforeKnockBackSuperiors()
	{
		return this.beforeKnockBackSuperiors;
	}

	public String[] getBeforeKnockBackInferiors()
	{
		return this.beforeKnockBackInferiors;
	}

	public String[] getOverrideKnockBackSuperiors()
	{
		return this.overrideKnockBackSuperiors;
	}

	public String[] getOverrideKnockBackInferiors()
	{
		return this.overrideKnockBackInferiors;
	}

	public String[] getAfterKnockBackSuperiors()
	{
		return this.afterKnockBackSuperiors;
	}

	public String[] getAfterKnockBackInferiors()
	{
		return this.afterKnockBackInferiors;
	}

	public void setBeforeKnockBackSuperiors(String[] var1)
	{
		this.beforeKnockBackSuperiors = var1;
	}

	public void setBeforeKnockBackInferiors(String[] var1)
	{
		this.beforeKnockBackInferiors = var1;
	}

	public void setOverrideKnockBackSuperiors(String[] var1)
	{
		this.overrideKnockBackSuperiors = var1;
	}

	public void setOverrideKnockBackInferiors(String[] var1)
	{
		this.overrideKnockBackInferiors = var1;
	}

	public void setAfterKnockBackSuperiors(String[] var1)
	{
		this.afterKnockBackSuperiors = var1;
	}

	public void setAfterKnockBackInferiors(String[] var1)
	{
		this.afterKnockBackInferiors = var1;
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

	public String[] getBeforePlayStepSoundSuperiors()
	{
		return this.beforePlayStepSoundSuperiors;
	}

	public String[] getBeforePlayStepSoundInferiors()
	{
		return this.beforePlayStepSoundInferiors;
	}

	public String[] getOverridePlayStepSoundSuperiors()
	{
		return this.overridePlayStepSoundSuperiors;
	}

	public String[] getOverridePlayStepSoundInferiors()
	{
		return this.overridePlayStepSoundInferiors;
	}

	public String[] getAfterPlayStepSoundSuperiors()
	{
		return this.afterPlayStepSoundSuperiors;
	}

	public String[] getAfterPlayStepSoundInferiors()
	{
		return this.afterPlayStepSoundInferiors;
	}

	public void setBeforePlayStepSoundSuperiors(String[] var1)
	{
		this.beforePlayStepSoundSuperiors = var1;
	}

	public void setBeforePlayStepSoundInferiors(String[] var1)
	{
		this.beforePlayStepSoundInferiors = var1;
	}

	public void setOverridePlayStepSoundSuperiors(String[] var1)
	{
		this.overridePlayStepSoundSuperiors = var1;
	}

	public void setOverridePlayStepSoundInferiors(String[] var1)
	{
		this.overridePlayStepSoundInferiors = var1;
	}

	public void setAfterPlayStepSoundSuperiors(String[] var1)
	{
		this.afterPlayStepSoundSuperiors = var1;
	}

	public void setAfterPlayStepSoundInferiors(String[] var1)
	{
		this.afterPlayStepSoundInferiors = var1;
	}

	public String[] getBeforePushOutOfBlocksSuperiors()
	{
		return this.beforePushOutOfBlocksSuperiors;
	}

	public String[] getBeforePushOutOfBlocksInferiors()
	{
		return this.beforePushOutOfBlocksInferiors;
	}

	public String[] getOverridePushOutOfBlocksSuperiors()
	{
		return this.overridePushOutOfBlocksSuperiors;
	}

	public String[] getOverridePushOutOfBlocksInferiors()
	{
		return this.overridePushOutOfBlocksInferiors;
	}

	public String[] getAfterPushOutOfBlocksSuperiors()
	{
		return this.afterPushOutOfBlocksSuperiors;
	}

	public String[] getAfterPushOutOfBlocksInferiors()
	{
		return this.afterPushOutOfBlocksInferiors;
	}

	public void setBeforePushOutOfBlocksSuperiors(String[] var1)
	{
		this.beforePushOutOfBlocksSuperiors = var1;
	}

	public void setBeforePushOutOfBlocksInferiors(String[] var1)
	{
		this.beforePushOutOfBlocksInferiors = var1;
	}

	public void setOverridePushOutOfBlocksSuperiors(String[] var1)
	{
		this.overridePushOutOfBlocksSuperiors = var1;
	}

	public void setOverridePushOutOfBlocksInferiors(String[] var1)
	{
		this.overridePushOutOfBlocksInferiors = var1;
	}

	public void setAfterPushOutOfBlocksSuperiors(String[] var1)
	{
		this.afterPushOutOfBlocksSuperiors = var1;
	}

	public void setAfterPushOutOfBlocksInferiors(String[] var1)
	{
		this.afterPushOutOfBlocksInferiors = var1;
	}

	public String[] getBeforeRayTraceSuperiors()
	{
		return this.beforeRayTraceSuperiors;
	}

	public String[] getBeforeRayTraceInferiors()
	{
		return this.beforeRayTraceInferiors;
	}

	public String[] getOverrideRayTraceSuperiors()
	{
		return this.overrideRayTraceSuperiors;
	}

	public String[] getOverrideRayTraceInferiors()
	{
		return this.overrideRayTraceInferiors;
	}

	public String[] getAfterRayTraceSuperiors()
	{
		return this.afterRayTraceSuperiors;
	}

	public String[] getAfterRayTraceInferiors()
	{
		return this.afterRayTraceInferiors;
	}

	public void setBeforeRayTraceSuperiors(String[] var1)
	{
		this.beforeRayTraceSuperiors = var1;
	}

	public void setBeforeRayTraceInferiors(String[] var1)
	{
		this.beforeRayTraceInferiors = var1;
	}

	public void setOverrideRayTraceSuperiors(String[] var1)
	{
		this.overrideRayTraceSuperiors = var1;
	}

	public void setOverrideRayTraceInferiors(String[] var1)
	{
		this.overrideRayTraceInferiors = var1;
	}

	public void setAfterRayTraceSuperiors(String[] var1)
	{
		this.afterRayTraceSuperiors = var1;
	}

	public void setAfterRayTraceInferiors(String[] var1)
	{
		this.afterRayTraceInferiors = var1;
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

	public String[] getBeforeRespawnPlayerSuperiors()
	{
		return this.beforeRespawnPlayerSuperiors;
	}

	public String[] getBeforeRespawnPlayerInferiors()
	{
		return this.beforeRespawnPlayerInferiors;
	}

	public String[] getOverrideRespawnPlayerSuperiors()
	{
		return this.overrideRespawnPlayerSuperiors;
	}

	public String[] getOverrideRespawnPlayerInferiors()
	{
		return this.overrideRespawnPlayerInferiors;
	}

	public String[] getAfterRespawnPlayerSuperiors()
	{
		return this.afterRespawnPlayerSuperiors;
	}

	public String[] getAfterRespawnPlayerInferiors()
	{
		return this.afterRespawnPlayerInferiors;
	}

	public void setBeforeRespawnPlayerSuperiors(String[] var1)
	{
		this.beforeRespawnPlayerSuperiors = var1;
	}

	public void setBeforeRespawnPlayerInferiors(String[] var1)
	{
		this.beforeRespawnPlayerInferiors = var1;
	}

	public void setOverrideRespawnPlayerSuperiors(String[] var1)
	{
		this.overrideRespawnPlayerSuperiors = var1;
	}

	public void setOverrideRespawnPlayerInferiors(String[] var1)
	{
		this.overrideRespawnPlayerInferiors = var1;
	}

	public void setAfterRespawnPlayerSuperiors(String[] var1)
	{
		this.afterRespawnPlayerSuperiors = var1;
	}

	public void setAfterRespawnPlayerInferiors(String[] var1)
	{
		this.afterRespawnPlayerInferiors = var1;
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

	public String[] getBeforeSetPositionAndRotationSuperiors()
	{
		return this.beforeSetPositionAndRotationSuperiors;
	}

	public String[] getBeforeSetPositionAndRotationInferiors()
	{
		return this.beforeSetPositionAndRotationInferiors;
	}

	public String[] getOverrideSetPositionAndRotationSuperiors()
	{
		return this.overrideSetPositionAndRotationSuperiors;
	}

	public String[] getOverrideSetPositionAndRotationInferiors()
	{
		return this.overrideSetPositionAndRotationInferiors;
	}

	public String[] getAfterSetPositionAndRotationSuperiors()
	{
		return this.afterSetPositionAndRotationSuperiors;
	}

	public String[] getAfterSetPositionAndRotationInferiors()
	{
		return this.afterSetPositionAndRotationInferiors;
	}

	public void setBeforeSetPositionAndRotationSuperiors(String[] var1)
	{
		this.beforeSetPositionAndRotationSuperiors = var1;
	}

	public void setBeforeSetPositionAndRotationInferiors(String[] var1)
	{
		this.beforeSetPositionAndRotationInferiors = var1;
	}

	public void setOverrideSetPositionAndRotationSuperiors(String[] var1)
	{
		this.overrideSetPositionAndRotationSuperiors = var1;
	}

	public void setOverrideSetPositionAndRotationInferiors(String[] var1)
	{
		this.overrideSetPositionAndRotationInferiors = var1;
	}

	public void setAfterSetPositionAndRotationSuperiors(String[] var1)
	{
		this.afterSetPositionAndRotationSuperiors = var1;
	}

	public void setAfterSetPositionAndRotationInferiors(String[] var1)
	{
		this.afterSetPositionAndRotationInferiors = var1;
	}

	public String[] getBeforeSleepInBedAtSuperiors()
	{
		return this.beforeSleepInBedAtSuperiors;
	}

	public String[] getBeforeSleepInBedAtInferiors()
	{
		return this.beforeSleepInBedAtInferiors;
	}

	public String[] getOverrideSleepInBedAtSuperiors()
	{
		return this.overrideSleepInBedAtSuperiors;
	}

	public String[] getOverrideSleepInBedAtInferiors()
	{
		return this.overrideSleepInBedAtInferiors;
	}

	public String[] getAfterSleepInBedAtSuperiors()
	{
		return this.afterSleepInBedAtSuperiors;
	}

	public String[] getAfterSleepInBedAtInferiors()
	{
		return this.afterSleepInBedAtInferiors;
	}

	public void setBeforeSleepInBedAtSuperiors(String[] var1)
	{
		this.beforeSleepInBedAtSuperiors = var1;
	}

	public void setBeforeSleepInBedAtInferiors(String[] var1)
	{
		this.beforeSleepInBedAtInferiors = var1;
	}

	public void setOverrideSleepInBedAtSuperiors(String[] var1)
	{
		this.overrideSleepInBedAtSuperiors = var1;
	}

	public void setOverrideSleepInBedAtInferiors(String[] var1)
	{
		this.overrideSleepInBedAtInferiors = var1;
	}

	public void setAfterSleepInBedAtSuperiors(String[] var1)
	{
		this.afterSleepInBedAtSuperiors = var1;
	}

	public void setAfterSleepInBedAtInferiors(String[] var1)
	{
		this.afterSleepInBedAtInferiors = var1;
	}

	public String[] getBeforeSwingItemSuperiors()
	{
		return this.beforeSwingItemSuperiors;
	}

	public String[] getBeforeSwingItemInferiors()
	{
		return this.beforeSwingItemInferiors;
	}

	public String[] getOverrideSwingItemSuperiors()
	{
		return this.overrideSwingItemSuperiors;
	}

	public String[] getOverrideSwingItemInferiors()
	{
		return this.overrideSwingItemInferiors;
	}

	public String[] getAfterSwingItemSuperiors()
	{
		return this.afterSwingItemSuperiors;
	}

	public String[] getAfterSwingItemInferiors()
	{
		return this.afterSwingItemInferiors;
	}

	public void setBeforeSwingItemSuperiors(String[] var1)
	{
		this.beforeSwingItemSuperiors = var1;
	}

	public void setBeforeSwingItemInferiors(String[] var1)
	{
		this.beforeSwingItemInferiors = var1;
	}

	public void setOverrideSwingItemSuperiors(String[] var1)
	{
		this.overrideSwingItemSuperiors = var1;
	}

	public void setOverrideSwingItemInferiors(String[] var1)
	{
		this.overrideSwingItemInferiors = var1;
	}

	public void setAfterSwingItemSuperiors(String[] var1)
	{
		this.afterSwingItemSuperiors = var1;
	}

	public void setAfterSwingItemInferiors(String[] var1)
	{
		this.afterSwingItemInferiors = var1;
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
