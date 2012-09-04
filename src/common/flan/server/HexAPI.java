package flan.server;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.logging.Logger;
import net.minecraft.client.Minecraft;
import net.minecraft.src.*;

public final class HexAPI
{
	private static final Class[] Class = new Class[]
	{ HexAPI.class };
	private static final Class[] Classes = new Class[]
	{ HexAPI.class, String.class };
	private static boolean isCreated;
	private static final Logger logger = Logger.getLogger("HexAPI");
	private static final List beforeAddExhaustionHookTypes = new LinkedList();
	private static final List overrideAddExhaustionHookTypes = new LinkedList();
	private static final List afterAddExhaustionHookTypes = new LinkedList();
	private final PlayerBase[] beforeAddExhaustionHooks;
	private final PlayerBase[] overrideAddExhaustionHooks;
	private final PlayerBase[] afterAddExhaustionHooks;
	public final boolean isAddExhaustionModded;
	private static final List beforeAddMovementStatHookTypes = new LinkedList();
	private static final List overrideAddMovementStatHookTypes = new LinkedList();
	private static final List afterAddMovementStatHookTypes = new LinkedList();
	private final PlayerBase[] beforeAddMovementStatHooks;
	private final PlayerBase[] overrideAddMovementStatHooks;
	private final PlayerBase[] afterAddMovementStatHooks;
	public final boolean isAddMovementStatModded;
	private static final List beforeAddStatHookTypes = new LinkedList();
	private static final List overrideAddStatHookTypes = new LinkedList();
	private static final List afterAddStatHookTypes = new LinkedList();
	private final PlayerBase[] beforeAddStatHooks;
	private final PlayerBase[] overrideAddStatHooks;
	private final PlayerBase[] afterAddStatHooks;
	public final boolean isAddStatModded;
	private static final List beforeAttackEntityFromHookTypes = new LinkedList();
	private static final List overrideAttackEntityFromHookTypes = new LinkedList();
	private static final List afterAttackEntityFromHookTypes = new LinkedList();
	private final PlayerBase[] beforeAttackEntityFromHooks;
	private final PlayerBase[] overrideAttackEntityFromHooks;
	private final PlayerBase[] afterAttackEntityFromHooks;
	public final boolean isAttackEntityFromModded;
	private static final List beforeAlertWolvesHookTypes = new LinkedList();
	private static final List overrideAlertWolvesHookTypes = new LinkedList();
	private static final List afterAlertWolvesHookTypes = new LinkedList();
	private final PlayerBase[] beforeAlertWolvesHooks;
	private final PlayerBase[] overrideAlertWolvesHooks;
	private final PlayerBase[] afterAlertWolvesHooks;
	public final boolean isAlertWolvesModded;
	private static final List beforeAttackTargetEntityWithCurrentItemHookTypes = new LinkedList();
	private static final List overrideAttackTargetEntityWithCurrentItemHookTypes = new LinkedList();
	private static final List afterAttackTargetEntityWithCurrentItemHookTypes = new LinkedList();
	private final PlayerBase[] beforeAttackTargetEntityWithCurrentItemHooks;
	private final PlayerBase[] overrideAttackTargetEntityWithCurrentItemHooks;
	private final PlayerBase[] afterAttackTargetEntityWithCurrentItemHooks;
	public final boolean isAttackTargetEntityWithCurrentItemModded;
	private static final List beforeCanBreatheUnderwaterHookTypes = new LinkedList();
	private static final List overrideCanBreatheUnderwaterHookTypes = new LinkedList();
	private static final List afterCanBreatheUnderwaterHookTypes = new LinkedList();
	private final PlayerBase[] beforeCanBreatheUnderwaterHooks;
	private final PlayerBase[] overrideCanBreatheUnderwaterHooks;
	private final PlayerBase[] afterCanBreatheUnderwaterHooks;
	public final boolean isCanBreatheUnderwaterModded;
	private static final List beforeCanHarvestBlockHookTypes = new LinkedList();
	private static final List overrideCanHarvestBlockHookTypes = new LinkedList();
	private static final List afterCanHarvestBlockHookTypes = new LinkedList();
	private final PlayerBase[] beforeCanHarvestBlockHooks;
	private final PlayerBase[] overrideCanHarvestBlockHooks;
	private final PlayerBase[] afterCanHarvestBlockHooks;
	public final boolean isCanHarvestBlockModded;
	private static final List beforeCanPlayerEditHookTypes = new LinkedList();
	private static final List overrideCanPlayerEditHookTypes = new LinkedList();
	private static final List afterCanPlayerEditHookTypes = new LinkedList();
	private final PlayerBase[] beforeCanPlayerEditHooks;
	private final PlayerBase[] overrideCanPlayerEditHooks;
	private final PlayerBase[] afterCanPlayerEditHooks;
	public final boolean isCanPlayerEditModded;
	private static final List beforeCanTriggerWalkingHookTypes = new LinkedList();
	private static final List overrideCanTriggerWalkingHookTypes = new LinkedList();
	private static final List afterCanTriggerWalkingHookTypes = new LinkedList();
	private final PlayerBase[] beforeCanTriggerWalkingHooks;
	private final PlayerBase[] overrideCanTriggerWalkingHooks;
	private final PlayerBase[] afterCanTriggerWalkingHooks;
	public final boolean isCanTriggerWalkingModded;
	private static final List beforeCloseScreenHookTypes = new LinkedList();
	private static final List overrideCloseScreenHookTypes = new LinkedList();
	private static final List afterCloseScreenHookTypes = new LinkedList();
	private final PlayerBase[] beforeCloseScreenHooks;
	private final PlayerBase[] overrideCloseScreenHooks;
	private final PlayerBase[] afterCloseScreenHooks;
	public final boolean isCloseScreenModded;
	private static final List beforeDamageEntityHookTypes = new LinkedList();
	private static final List overrideDamageEntityHookTypes = new LinkedList();
	private static final List afterDamageEntityHookTypes = new LinkedList();
	private final PlayerBase[] beforeDamageEntityHooks;
	private final PlayerBase[] overrideDamageEntityHooks;
	private final PlayerBase[] afterDamageEntityHooks;
	public final boolean isDamageEntityModded;
	private static final List beforeDisplayGUIBrewingStandHookTypes = new LinkedList();
	private static final List overrideDisplayGUIBrewingStandHookTypes = new LinkedList();
	private static final List afterDisplayGUIBrewingStandHookTypes = new LinkedList();
	private final PlayerBase[] beforeDisplayGUIBrewingStandHooks;
	private final PlayerBase[] overrideDisplayGUIBrewingStandHooks;
	private final PlayerBase[] afterDisplayGUIBrewingStandHooks;
	public final boolean isDisplayGUIBrewingStandModded;
	private static final List beforeDisplayGUIChestHookTypes = new LinkedList();
	private static final List overrideDisplayGUIChestHookTypes = new LinkedList();
	private static final List afterDisplayGUIChestHookTypes = new LinkedList();
	private final PlayerBase[] beforeDisplayGUIChestHooks;
	private final PlayerBase[] overrideDisplayGUIChestHooks;
	private final PlayerBase[] afterDisplayGUIChestHooks;
	public final boolean isDisplayGUIChestModded;
	private static final List beforeDisplayGUIDispenserHookTypes = new LinkedList();
	private static final List overrideDisplayGUIDispenserHookTypes = new LinkedList();
	private static final List afterDisplayGUIDispenserHookTypes = new LinkedList();
	private final PlayerBase[] beforeDisplayGUIDispenserHooks;
	private final PlayerBase[] overrideDisplayGUIDispenserHooks;
	private final PlayerBase[] afterDisplayGUIDispenserHooks;
	public final boolean isDisplayGUIDispenserModded;
	private static final List beforeDisplayGUIEditSignHookTypes = new LinkedList();
	private static final List overrideDisplayGUIEditSignHookTypes = new LinkedList();
	private static final List afterDisplayGUIEditSignHookTypes = new LinkedList();
	private final PlayerBase[] beforeDisplayGUIEditSignHooks;
	private final PlayerBase[] overrideDisplayGUIEditSignHooks;
	private final PlayerBase[] afterDisplayGUIEditSignHooks;
	public final boolean isDisplayGUIEditSignModded;
	private static final List beforeDisplayGUIEnchantmentHookTypes = new LinkedList();
	private static final List overrideDisplayGUIEnchantmentHookTypes = new LinkedList();
	private static final List afterDisplayGUIEnchantmentHookTypes = new LinkedList();
	private final PlayerBase[] beforeDisplayGUIEnchantmentHooks;
	private final PlayerBase[] overrideDisplayGUIEnchantmentHooks;
	private final PlayerBase[] afterDisplayGUIEnchantmentHooks;
	public final boolean isDisplayGUIEnchantmentModded;
	private static final List beforeDisplayGUIFurnaceHookTypes = new LinkedList();
	private static final List overrideDisplayGUIFurnaceHookTypes = new LinkedList();
	private static final List afterDisplayGUIFurnaceHookTypes = new LinkedList();
	private final PlayerBase[] beforeDisplayGUIFurnaceHooks;
	private final PlayerBase[] overrideDisplayGUIFurnaceHooks;
	private final PlayerBase[] afterDisplayGUIFurnaceHooks;
	public final boolean isDisplayGUIFurnaceModded;
	private static final List beforeDisplayWorkbenchGUIHookTypes = new LinkedList();
	private static final List overrideDisplayWorkbenchGUIHookTypes = new LinkedList();
	private static final List afterDisplayWorkbenchGUIHookTypes = new LinkedList();
	private final PlayerBase[] beforeDisplayWorkbenchGUIHooks;
	private final PlayerBase[] overrideDisplayWorkbenchGUIHooks;
	private final PlayerBase[] afterDisplayWorkbenchGUIHooks;
	public final boolean isDisplayWorkbenchGUIModded;
	private static final List beforeDropOneItemHookTypes = new LinkedList();
	private static final List overrideDropOneItemHookTypes = new LinkedList();
	private static final List afterDropOneItemHookTypes = new LinkedList();
	private final PlayerBase[] beforeDropOneItemHooks;
	private final PlayerBase[] overrideDropOneItemHooks;
	private final PlayerBase[] afterDropOneItemHooks;
	public final boolean isDropOneItemModded;
	private static final List beforeDropPlayerItemHookTypes = new LinkedList();
	private static final List overrideDropPlayerItemHookTypes = new LinkedList();
	private static final List afterDropPlayerItemHookTypes = new LinkedList();
	private final PlayerBase[] beforeDropPlayerItemHooks;
	private final PlayerBase[] overrideDropPlayerItemHooks;
	private final PlayerBase[] afterDropPlayerItemHooks;
	public final boolean isDropPlayerItemModded;
	private static final List beforeDropPlayerItemWithRandomChoiceHookTypes = new LinkedList();
	private static final List overrideDropPlayerItemWithRandomChoiceHookTypes = new LinkedList();
	private static final List afterDropPlayerItemWithRandomChoiceHookTypes = new LinkedList();
	private final PlayerBase[] beforeDropPlayerItemWithRandomChoiceHooks;
	private final PlayerBase[] overrideDropPlayerItemWithRandomChoiceHooks;
	private final PlayerBase[] afterDropPlayerItemWithRandomChoiceHooks;
	public final boolean isDropPlayerItemWithRandomChoiceModded;
	private static final List beforeFallHookTypes = new LinkedList();
	private static final List overrideFallHookTypes = new LinkedList();
	private static final List afterFallHookTypes = new LinkedList();
	private final PlayerBase[] beforeFallHooks;
	private final PlayerBase[] overrideFallHooks;
	private final PlayerBase[] afterFallHooks;
	public final boolean isFallModded;
	private static final List beforeGetBrightnessHookTypes = new LinkedList();
	private static final List overrideGetBrightnessHookTypes = new LinkedList();
	private static final List afterGetBrightnessHookTypes = new LinkedList();
	private final PlayerBase[] beforeGetBrightnessHooks;
	private final PlayerBase[] overrideGetBrightnessHooks;
	private final PlayerBase[] afterGetBrightnessHooks;
	public final boolean isGetBrightnessModded;
	private static final List beforeGetBrightnessForRenderHookTypes = new LinkedList();
	private static final List overrideGetBrightnessForRenderHookTypes = new LinkedList();
	private static final List afterGetBrightnessForRenderHookTypes = new LinkedList();
	private final PlayerBase[] beforeGetBrightnessForRenderHooks;
	private final PlayerBase[] overrideGetBrightnessForRenderHooks;
	private final PlayerBase[] afterGetBrightnessForRenderHooks;
	public final boolean isGetBrightnessForRenderModded;
	private static final List beforeGetCurrentPlayerStrVsBlockHookTypes = new LinkedList();
	private static final List overrideGetCurrentPlayerStrVsBlockHookTypes = new LinkedList();
	private static final List afterGetCurrentPlayerStrVsBlockHookTypes = new LinkedList();
	private final PlayerBase[] beforeGetCurrentPlayerStrVsBlockHooks;
	private final PlayerBase[] overrideGetCurrentPlayerStrVsBlockHooks;
	private final PlayerBase[] afterGetCurrentPlayerStrVsBlockHooks;
	public final boolean isGetCurrentPlayerStrVsBlockModded;
	private static final List beforeGetDistanceSqHookTypes = new LinkedList();
	private static final List overrideGetDistanceSqHookTypes = new LinkedList();
	private static final List afterGetDistanceSqHookTypes = new LinkedList();
	private final PlayerBase[] beforeGetDistanceSqHooks;
	private final PlayerBase[] overrideGetDistanceSqHooks;
	private final PlayerBase[] afterGetDistanceSqHooks;
	public final boolean isGetDistanceSqModded;
	private static final List beforeGetDistanceSqToEntityHookTypes = new LinkedList();
	private static final List overrideGetDistanceSqToEntityHookTypes = new LinkedList();
	private static final List afterGetDistanceSqToEntityHookTypes = new LinkedList();
	private final PlayerBase[] beforeGetDistanceSqToEntityHooks;
	private final PlayerBase[] overrideGetDistanceSqToEntityHooks;
	private final PlayerBase[] afterGetDistanceSqToEntityHooks;
	public final boolean isGetDistanceSqToEntityModded;
	private static final List beforeGetFOVMultiplierHookTypes = new LinkedList();
	private static final List overrideGetFOVMultiplierHookTypes = new LinkedList();
	private static final List afterGetFOVMultiplierHookTypes = new LinkedList();
	private final PlayerBase[] beforeGetFOVMultiplierHooks;
	private final PlayerBase[] overrideGetFOVMultiplierHooks;
	private final PlayerBase[] afterGetFOVMultiplierHooks;
	public final boolean isGetFOVMultiplierModded;
	private static final List beforeGetHurtSoundHookTypes = new LinkedList();
	private static final List overrideGetHurtSoundHookTypes = new LinkedList();
	private static final List afterGetHurtSoundHookTypes = new LinkedList();
	private final PlayerBase[] beforeGetHurtSoundHooks;
	private final PlayerBase[] overrideGetHurtSoundHooks;
	private final PlayerBase[] afterGetHurtSoundHooks;
	public final boolean isGetHurtSoundModded;
	private static final List beforeGetItemIconHookTypes = new LinkedList();
	private static final List overrideGetItemIconHookTypes = new LinkedList();
	private static final List afterGetItemIconHookTypes = new LinkedList();
	private final PlayerBase[] beforeGetItemIconHooks;
	private final PlayerBase[] overrideGetItemIconHooks;
	private final PlayerBase[] afterGetItemIconHooks;
	public final boolean isGetItemIconModded;
	private static final List beforeGetSleepTimerHookTypes = new LinkedList();
	private static final List overrideGetSleepTimerHookTypes = new LinkedList();
	private static final List afterGetSleepTimerHookTypes = new LinkedList();
	private final PlayerBase[] beforeGetSleepTimerHooks;
	private final PlayerBase[] overrideGetSleepTimerHooks;
	private final PlayerBase[] afterGetSleepTimerHooks;
	public final boolean isGetSleepTimerModded;
	private static final List beforeGetSpeedModifierHookTypes = new LinkedList();
	private static final List overrideGetSpeedModifierHookTypes = new LinkedList();
	private static final List afterGetSpeedModifierHookTypes = new LinkedList();
	private final PlayerBase[] beforeGetSpeedModifierHooks;
	private final PlayerBase[] overrideGetSpeedModifierHooks;
	private final PlayerBase[] afterGetSpeedModifierHooks;
	public final boolean isGetSpeedModifierModded;
	private static final List beforeHandleLavaMovementHookTypes = new LinkedList();
	private static final List overrideHandleLavaMovementHookTypes = new LinkedList();
	private static final List afterHandleLavaMovementHookTypes = new LinkedList();
	private final PlayerBase[] beforeHandleLavaMovementHooks;
	private final PlayerBase[] overrideHandleLavaMovementHooks;
	private final PlayerBase[] afterHandleLavaMovementHooks;
	public final boolean isHandleLavaMovementModded;
	private static final List beforeHandleWaterMovementHookTypes = new LinkedList();
	private static final List overrideHandleWaterMovementHookTypes = new LinkedList();
	private static final List afterHandleWaterMovementHookTypes = new LinkedList();
	private final PlayerBase[] beforeHandleWaterMovementHooks;
	private final PlayerBase[] overrideHandleWaterMovementHooks;
	private final PlayerBase[] afterHandleWaterMovementHooks;
	public final boolean isHandleWaterMovementModded;
	private static final List beforeHealHookTypes = new LinkedList();
	private static final List overrideHealHookTypes = new LinkedList();
	private static final List afterHealHookTypes = new LinkedList();
	private final PlayerBase[] beforeHealHooks;
	private final PlayerBase[] overrideHealHooks;
	private final PlayerBase[] afterHealHooks;
	public final boolean isHealModded;
	private static final List beforeIsEntityInsideOpaqueBlockHookTypes = new LinkedList();
	private static final List overrideIsEntityInsideOpaqueBlockHookTypes = new LinkedList();
	private static final List afterIsEntityInsideOpaqueBlockHookTypes = new LinkedList();
	private final PlayerBase[] beforeIsEntityInsideOpaqueBlockHooks;
	private final PlayerBase[] overrideIsEntityInsideOpaqueBlockHooks;
	private final PlayerBase[] afterIsEntityInsideOpaqueBlockHooks;
	public final boolean isIsEntityInsideOpaqueBlockModded;
	private static final List beforeIsInWaterHookTypes = new LinkedList();
	private static final List overrideIsInWaterHookTypes = new LinkedList();
	private static final List afterIsInWaterHookTypes = new LinkedList();
	private final PlayerBase[] beforeIsInWaterHooks;
	private final PlayerBase[] overrideIsInWaterHooks;
	private final PlayerBase[] afterIsInWaterHooks;
	public final boolean isIsInWaterModded;
	private static final List beforeIsInsideOfMaterialHookTypes = new LinkedList();
	private static final List overrideIsInsideOfMaterialHookTypes = new LinkedList();
	private static final List afterIsInsideOfMaterialHookTypes = new LinkedList();
	private final PlayerBase[] beforeIsInsideOfMaterialHooks;
	private final PlayerBase[] overrideIsInsideOfMaterialHooks;
	private final PlayerBase[] afterIsInsideOfMaterialHooks;
	public final boolean isIsInsideOfMaterialModded;
	private static final List beforeIsOnLadderHookTypes = new LinkedList();
	private static final List overrideIsOnLadderHookTypes = new LinkedList();
	private static final List afterIsOnLadderHookTypes = new LinkedList();
	private final PlayerBase[] beforeIsOnLadderHooks;
	private final PlayerBase[] overrideIsOnLadderHooks;
	private final PlayerBase[] afterIsOnLadderHooks;
	public final boolean isIsOnLadderModded;
	private static final List beforeIsSneakingHookTypes = new LinkedList();
	private static final List overrideIsSneakingHookTypes = new LinkedList();
	private static final List afterIsSneakingHookTypes = new LinkedList();
	private final PlayerBase[] beforeIsSneakingHooks;
	private final PlayerBase[] overrideIsSneakingHooks;
	private final PlayerBase[] afterIsSneakingHooks;
	public final boolean isIsSneakingModded;
	private static final List beforeIsSprintingHookTypes = new LinkedList();
	private static final List overrideIsSprintingHookTypes = new LinkedList();
	private static final List afterIsSprintingHookTypes = new LinkedList();
	private final PlayerBase[] beforeIsSprintingHooks;
	private final PlayerBase[] overrideIsSprintingHooks;
	private final PlayerBase[] afterIsSprintingHooks;
	public final boolean isIsSprintingModded;
	private static final List beforeJumpHookTypes = new LinkedList();
	private static final List overrideJumpHookTypes = new LinkedList();
	private static final List afterJumpHookTypes = new LinkedList();
	private final PlayerBase[] beforeJumpHooks;
	private final PlayerBase[] overrideJumpHooks;
	private final PlayerBase[] afterJumpHooks;
	public final boolean isJumpModded;
	private static final List beforeKnockBackHookTypes = new LinkedList();
	private static final List overrideKnockBackHookTypes = new LinkedList();
	private static final List afterKnockBackHookTypes = new LinkedList();
	private final PlayerBase[] beforeKnockBackHooks;
	private final PlayerBase[] overrideKnockBackHooks;
	private final PlayerBase[] afterKnockBackHooks;
	public final boolean isKnockBackModded;
	private static final List beforeMoveEntityHookTypes = new LinkedList();
	private static final List overrideMoveEntityHookTypes = new LinkedList();
	private static final List afterMoveEntityHookTypes = new LinkedList();
	private final PlayerBase[] beforeMoveEntityHooks;
	private final PlayerBase[] overrideMoveEntityHooks;
	private final PlayerBase[] afterMoveEntityHooks;
	public final boolean isMoveEntityModded;
	private static final List beforeMoveEntityWithHeadingHookTypes = new LinkedList();
	private static final List overrideMoveEntityWithHeadingHookTypes = new LinkedList();
	private static final List afterMoveEntityWithHeadingHookTypes = new LinkedList();
	private final PlayerBase[] beforeMoveEntityWithHeadingHooks;
	private final PlayerBase[] overrideMoveEntityWithHeadingHooks;
	private final PlayerBase[] afterMoveEntityWithHeadingHooks;
	public final boolean isMoveEntityWithHeadingModded;
	private static final List beforeMoveFlyingHookTypes = new LinkedList();
	private static final List overrideMoveFlyingHookTypes = new LinkedList();
	private static final List afterMoveFlyingHookTypes = new LinkedList();
	private final PlayerBase[] beforeMoveFlyingHooks;
	private final PlayerBase[] overrideMoveFlyingHooks;
	private final PlayerBase[] afterMoveFlyingHooks;
	public final boolean isMoveFlyingModded;
	private static final List beforeOnDeathHookTypes = new LinkedList();
	private static final List overrideOnDeathHookTypes = new LinkedList();
	private static final List afterOnDeathHookTypes = new LinkedList();
	private final PlayerBase[] beforeOnDeathHooks;
	private final PlayerBase[] overrideOnDeathHooks;
	private final PlayerBase[] afterOnDeathHooks;
	public final boolean isOnDeathModded;
	private static final List beforeOnLivingUpdateHookTypes = new LinkedList();
	private static final List overrideOnLivingUpdateHookTypes = new LinkedList();
	private static final List afterOnLivingUpdateHookTypes = new LinkedList();
	private final PlayerBase[] beforeOnLivingUpdateHooks;
	private final PlayerBase[] overrideOnLivingUpdateHooks;
	private final PlayerBase[] afterOnLivingUpdateHooks;
	public final boolean isOnLivingUpdateModded;
	private static final List beforeOnKillEntityHookTypes = new LinkedList();
	private static final List overrideOnKillEntityHookTypes = new LinkedList();
	private static final List afterOnKillEntityHookTypes = new LinkedList();
	private final PlayerBase[] beforeOnKillEntityHooks;
	private final PlayerBase[] overrideOnKillEntityHooks;
	private final PlayerBase[] afterOnKillEntityHooks;
	public final boolean isOnKillEntityModded;
	private static final List beforeOnUpdateHookTypes = new LinkedList();
	private static final List overrideOnUpdateHookTypes = new LinkedList();
	private static final List afterOnUpdateHookTypes = new LinkedList();
	private final PlayerBase[] beforeOnUpdateHooks;
	private final PlayerBase[] overrideOnUpdateHooks;
	private final PlayerBase[] afterOnUpdateHooks;
	public final boolean isOnUpdateModded;
	private static final List beforePlayStepSoundHookTypes = new LinkedList();
	private static final List overridePlayStepSoundHookTypes = new LinkedList();
	private static final List afterPlayStepSoundHookTypes = new LinkedList();
	private final PlayerBase[] beforePlayStepSoundHooks;
	private final PlayerBase[] overridePlayStepSoundHooks;
	private final PlayerBase[] afterPlayStepSoundHooks;
	public final boolean isPlayStepSoundModded;
	private static final List beforePushOutOfBlocksHookTypes = new LinkedList();
	private static final List overridePushOutOfBlocksHookTypes = new LinkedList();
	private static final List afterPushOutOfBlocksHookTypes = new LinkedList();
	private final PlayerBase[] beforePushOutOfBlocksHooks;
	private final PlayerBase[] overridePushOutOfBlocksHooks;
	private final PlayerBase[] afterPushOutOfBlocksHooks;
	public final boolean isPushOutOfBlocksModded;
	private static final List beforeRayTraceHookTypes = new LinkedList();
	private static final List overrideRayTraceHookTypes = new LinkedList();
	private static final List afterRayTraceHookTypes = new LinkedList();
	private final PlayerBase[] beforeRayTraceHooks;
	private final PlayerBase[] overrideRayTraceHooks;
	private final PlayerBase[] afterRayTraceHooks;
	public final boolean isRayTraceModded;
	private static final List beforeReadEntityFromNBTHookTypes = new LinkedList();
	private static final List overrideReadEntityFromNBTHookTypes = new LinkedList();
	private static final List afterReadEntityFromNBTHookTypes = new LinkedList();
	private final PlayerBase[] beforeReadEntityFromNBTHooks;
	private final PlayerBase[] overrideReadEntityFromNBTHooks;
	private final PlayerBase[] afterReadEntityFromNBTHooks;
	public final boolean isReadEntityFromNBTModded;
	private static final List beforeRespawnPlayerHookTypes = new LinkedList();
	private static final List overrideRespawnPlayerHookTypes = new LinkedList();
	private static final List afterRespawnPlayerHookTypes = new LinkedList();
	private final PlayerBase[] beforeRespawnPlayerHooks;
	private final PlayerBase[] overrideRespawnPlayerHooks;
	private final PlayerBase[] afterRespawnPlayerHooks;
	public final boolean isRespawnPlayerModded;
	private static final List beforeSetDeadHookTypes = new LinkedList();
	private static final List overrideSetDeadHookTypes = new LinkedList();
	private static final List afterSetDeadHookTypes = new LinkedList();
	private final PlayerBase[] beforeSetDeadHooks;
	private final PlayerBase[] overrideSetDeadHooks;
	private final PlayerBase[] afterSetDeadHooks;
	public final boolean isSetDeadModded;
	private static final List beforeSetPositionAndRotationHookTypes = new LinkedList();
	private static final List overrideSetPositionAndRotationHookTypes = new LinkedList();
	private static final List afterSetPositionAndRotationHookTypes = new LinkedList();
	private final PlayerBase[] beforeSetPositionAndRotationHooks;
	private final PlayerBase[] overrideSetPositionAndRotationHooks;
	private final PlayerBase[] afterSetPositionAndRotationHooks;
	public final boolean isSetPositionAndRotationModded;
	private static final List beforeSleepInBedAtHookTypes = new LinkedList();
	private static final List overrideSleepInBedAtHookTypes = new LinkedList();
	private static final List afterSleepInBedAtHookTypes = new LinkedList();
	private final PlayerBase[] beforeSleepInBedAtHooks;
	private final PlayerBase[] overrideSleepInBedAtHooks;
	private final PlayerBase[] afterSleepInBedAtHooks;
	public final boolean isSleepInBedAtModded;
	private static final List beforeSwingItemHookTypes = new LinkedList();
	private static final List overrideSwingItemHookTypes = new LinkedList();
	private static final List afterSwingItemHookTypes = new LinkedList();
	private final PlayerBase[] beforeSwingItemHooks;
	private final PlayerBase[] overrideSwingItemHooks;
	private final PlayerBase[] afterSwingItemHooks;
	public final boolean isSwingItemModded;
	private static final List beforeUpdateEntityActionStateHookTypes = new LinkedList();
	private static final List overrideUpdateEntityActionStateHookTypes = new LinkedList();
	private static final List afterUpdateEntityActionStateHookTypes = new LinkedList();
	private final PlayerBase[] beforeUpdateEntityActionStateHooks;
	private final PlayerBase[] overrideUpdateEntityActionStateHooks;
	private final PlayerBase[] afterUpdateEntityActionStateHooks;
	public final boolean isUpdateEntityActionStateModded;
	private static final List beforeWriteEntityToNBTHookTypes = new LinkedList();
	private static final List overrideWriteEntityToNBTHookTypes = new LinkedList();
	private static final List afterWriteEntityToNBTHookTypes = new LinkedList();
	private final PlayerBase[] beforeWriteEntityToNBTHooks;
	private final PlayerBase[] overrideWriteEntityToNBTHooks;
	private final PlayerBase[] afterWriteEntityToNBTHooks;
	public final boolean isWriteEntityToNBTModded;
	public final EntityPlayerSP player;
	private static final List beforeLocalConstructingHookTypes = new LinkedList();
	private static final List afterLocalConstructingHookTypes = new LinkedList();
	private final PlayerBase[] beforeLocalConstructingHooks;
	private final PlayerBase[] afterLocalConstructingHooks;
	private final Map allBaseObjects = new Hashtable();
	private final Set unmodifiableAllBaseIds;
	private static final Map allBaseConstructors = new Hashtable();
	private static final Set unmodifiableAllIds = Collections.unmodifiableSet(allBaseConstructors.keySet());
	private static final Map allBaseBeforeSuperiors = new Hashtable();
	private static final Map allBaseBeforeInferiors = new Hashtable();
	private static final Map allBaseOverrideSuperiors = new Hashtable();
	private static final Map allBaseOverrideInferiors = new Hashtable();
	private static final Map allBaseAfterSuperiors = new Hashtable();
	private static final Map allBaseAfterInferiors = new Hashtable();
	private static boolean initialized = false;

	private static void log(String var0)
	{
		System.out.println(var0);
		logger.fine(var0);
	}

	public static void register(String var0, Class var1)
	{
		register(var0, var1, (PlayerBaseSorting) null);
	}

	public static void register(String var0, Class var1, PlayerBaseSorting var2)
	{
		try
		{
			register(var1, var0, var2);
		} catch (RuntimeException var4)
		{
			if (var0 != null)
			{
				log("HexAPI: failed to register id \'" + var0 + "\'");
			} else
			{
				log("HexAPI: failed to register PlayerBase");
			}

			throw var4;
		}
	}

	private static void register(Class var0, String var1, PlayerBaseSorting var2)
	{
		if (!isCreated)
		{
			log("HexAPI Created");
			isCreated = true;
		}

		if (var1 == null)
		{
			throw new NullPointerException("Argument \'id\' can not be null");
		} else if (var0 == null)
		{
			throw new NullPointerException("Argument \'baseClass\' can not be null");
		} else
		{
			Constructor var3 = (Constructor) allBaseConstructors.get(var1);

			if (var3 != null)
			{
				throw new IllegalArgumentException("The class \'" + var0.getName() + "\' can not be registered with the id \'" + var1 + "\' because the class \'" + var3.getDeclaringClass().getName() + "\' has allready been registered with the same id");
			} else
			{
				Constructor var4;

				try
				{
					var4 = var0.getDeclaredConstructor(Classes);
				} catch (Exception var8)
				{
					try
					{
						var4 = var0.getDeclaredConstructor(Class);
					} catch (Exception var7)
					{
						throw new IllegalArgumentException("Can not find necessary constructor with one argument of type \'" + HexAPI.class.getName() + "\' and eventually a second argument of type \'String\' in the class \'" + var0.getName() + "\'", var8);
					}
				}

				allBaseConstructors.put(var1, var4);

				if (var2 != null)
				{
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeLocalConstructingSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeLocalConstructingInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterLocalConstructingSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterLocalConstructingInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeAddExhaustionSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeAddExhaustionInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideAddExhaustionSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideAddExhaustionInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterAddExhaustionSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterAddExhaustionInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeAddMovementStatSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeAddMovementStatInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideAddMovementStatSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideAddMovementStatInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterAddMovementStatSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterAddMovementStatInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeAddStatSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeAddStatInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideAddStatSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideAddStatInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterAddStatSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterAddStatInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeAttackEntityFromSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeAttackEntityFromInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideAttackEntityFromSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideAttackEntityFromInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterAttackEntityFromSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterAttackEntityFromInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeAlertWolvesSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeAlertWolvesInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideAlertWolvesSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideAlertWolvesInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterAlertWolvesSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterAlertWolvesInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeAttackTargetEntityWithCurrentItemSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeAttackTargetEntityWithCurrentItemInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideAttackTargetEntityWithCurrentItemSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideAttackTargetEntityWithCurrentItemInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterAttackTargetEntityWithCurrentItemSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterAttackTargetEntityWithCurrentItemInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeCanBreatheUnderwaterSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeCanBreatheUnderwaterInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideCanBreatheUnderwaterSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideCanBreatheUnderwaterInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterCanBreatheUnderwaterSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterCanBreatheUnderwaterInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeCanHarvestBlockSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeCanHarvestBlockInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideCanHarvestBlockSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideCanHarvestBlockInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterCanHarvestBlockSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterCanHarvestBlockInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeCanPlayerEditSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeCanPlayerEditInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideCanPlayerEditSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideCanPlayerEditInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterCanPlayerEditSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterCanPlayerEditInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeCanTriggerWalkingSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeCanTriggerWalkingInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideCanTriggerWalkingSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideCanTriggerWalkingInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterCanTriggerWalkingSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterCanTriggerWalkingInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeCloseScreenSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeCloseScreenInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideCloseScreenSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideCloseScreenInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterCloseScreenSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterCloseScreenInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeDamageEntitySuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeDamageEntityInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideDamageEntitySuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideDamageEntityInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterDamageEntitySuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterDamageEntityInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeDisplayGUIBrewingStandSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeDisplayGUIBrewingStandInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideDisplayGUIBrewingStandSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideDisplayGUIBrewingStandInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterDisplayGUIBrewingStandSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterDisplayGUIBrewingStandInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeDisplayGUIChestSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeDisplayGUIChestInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideDisplayGUIChestSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideDisplayGUIChestInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterDisplayGUIChestSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterDisplayGUIChestInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeDisplayGUIDispenserSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeDisplayGUIDispenserInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideDisplayGUIDispenserSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideDisplayGUIDispenserInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterDisplayGUIDispenserSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterDisplayGUIDispenserInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeDisplayGUIEditSignSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeDisplayGUIEditSignInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideDisplayGUIEditSignSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideDisplayGUIEditSignInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterDisplayGUIEditSignSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterDisplayGUIEditSignInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeDisplayGUIEnchantmentSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeDisplayGUIEnchantmentInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideDisplayGUIEnchantmentSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideDisplayGUIEnchantmentInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterDisplayGUIEnchantmentSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterDisplayGUIEnchantmentInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeDisplayGUIFurnaceSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeDisplayGUIFurnaceInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideDisplayGUIFurnaceSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideDisplayGUIFurnaceInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterDisplayGUIFurnaceSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterDisplayGUIFurnaceInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeDisplayWorkbenchGUISuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeDisplayWorkbenchGUIInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideDisplayWorkbenchGUISuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideDisplayWorkbenchGUIInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterDisplayWorkbenchGUISuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterDisplayWorkbenchGUIInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeDropOneItemSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeDropOneItemInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideDropOneItemSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideDropOneItemInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterDropOneItemSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterDropOneItemInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeDropPlayerItemSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeDropPlayerItemInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideDropPlayerItemSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideDropPlayerItemInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterDropPlayerItemSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterDropPlayerItemInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeDropPlayerItemWithRandomChoiceSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeDropPlayerItemWithRandomChoiceInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideDropPlayerItemWithRandomChoiceSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideDropPlayerItemWithRandomChoiceInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterDropPlayerItemWithRandomChoiceSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterDropPlayerItemWithRandomChoiceInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeFallSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeFallInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideFallSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideFallInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterFallSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterFallInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeGetBrightnessSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeGetBrightnessInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideGetBrightnessSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideGetBrightnessInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterGetBrightnessSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterGetBrightnessInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeGetBrightnessForRenderSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeGetBrightnessForRenderInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideGetBrightnessForRenderSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideGetBrightnessForRenderInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterGetBrightnessForRenderSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterGetBrightnessForRenderInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeGetCurrentPlayerStrVsBlockSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeGetCurrentPlayerStrVsBlockInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideGetCurrentPlayerStrVsBlockSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideGetCurrentPlayerStrVsBlockInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterGetCurrentPlayerStrVsBlockSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterGetCurrentPlayerStrVsBlockInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeGetDistanceSqSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeGetDistanceSqInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideGetDistanceSqSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideGetDistanceSqInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterGetDistanceSqSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterGetDistanceSqInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeGetDistanceSqToEntitySuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeGetDistanceSqToEntityInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideGetDistanceSqToEntitySuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideGetDistanceSqToEntityInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterGetDistanceSqToEntitySuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterGetDistanceSqToEntityInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeGetFOVMultiplierSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeGetFOVMultiplierInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideGetFOVMultiplierSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideGetFOVMultiplierInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterGetFOVMultiplierSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterGetFOVMultiplierInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeGetHurtSoundSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeGetHurtSoundInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideGetHurtSoundSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideGetHurtSoundInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterGetHurtSoundSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterGetHurtSoundInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeGetItemIconSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeGetItemIconInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideGetItemIconSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideGetItemIconInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterGetItemIconSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterGetItemIconInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeGetSleepTimerSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeGetSleepTimerInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideGetSleepTimerSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideGetSleepTimerInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterGetSleepTimerSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterGetSleepTimerInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeGetSpeedModifierSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeGetSpeedModifierInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideGetSpeedModifierSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideGetSpeedModifierInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterGetSpeedModifierSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterGetSpeedModifierInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeHandleLavaMovementSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeHandleLavaMovementInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideHandleLavaMovementSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideHandleLavaMovementInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterHandleLavaMovementSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterHandleLavaMovementInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeHandleWaterMovementSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeHandleWaterMovementInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideHandleWaterMovementSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideHandleWaterMovementInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterHandleWaterMovementSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterHandleWaterMovementInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeHealSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeHealInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideHealSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideHealInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterHealSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterHealInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeIsEntityInsideOpaqueBlockSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeIsEntityInsideOpaqueBlockInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideIsEntityInsideOpaqueBlockSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideIsEntityInsideOpaqueBlockInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterIsEntityInsideOpaqueBlockSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterIsEntityInsideOpaqueBlockInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeIsInWaterSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeIsInWaterInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideIsInWaterSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideIsInWaterInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterIsInWaterSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterIsInWaterInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeIsInsideOfMaterialSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeIsInsideOfMaterialInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideIsInsideOfMaterialSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideIsInsideOfMaterialInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterIsInsideOfMaterialSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterIsInsideOfMaterialInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeIsOnLadderSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeIsOnLadderInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideIsOnLadderSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideIsOnLadderInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterIsOnLadderSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterIsOnLadderInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeIsSneakingSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeIsSneakingInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideIsSneakingSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideIsSneakingInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterIsSneakingSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterIsSneakingInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeIsSprintingSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeIsSprintingInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideIsSprintingSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideIsSprintingInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterIsSprintingSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterIsSprintingInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeJumpSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeJumpInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideJumpSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideJumpInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterJumpSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterJumpInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeKnockBackSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeKnockBackInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideKnockBackSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideKnockBackInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterKnockBackSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterKnockBackInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeMoveEntitySuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeMoveEntityInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideMoveEntitySuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideMoveEntityInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterMoveEntitySuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterMoveEntityInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeMoveEntityWithHeadingSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeMoveEntityWithHeadingInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideMoveEntityWithHeadingSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideMoveEntityWithHeadingInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterMoveEntityWithHeadingSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterMoveEntityWithHeadingInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeMoveFlyingSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeMoveFlyingInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideMoveFlyingSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideMoveFlyingInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterMoveFlyingSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterMoveFlyingInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeOnDeathSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeOnDeathInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideOnDeathSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideOnDeathInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterOnDeathSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterOnDeathInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeOnLivingUpdateSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeOnLivingUpdateInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideOnLivingUpdateSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideOnLivingUpdateInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterOnLivingUpdateSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterOnLivingUpdateInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeOnKillEntitySuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeOnKillEntityInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideOnKillEntitySuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideOnKillEntityInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterOnKillEntitySuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterOnKillEntityInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeOnUpdateSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeOnUpdateInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideOnUpdateSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideOnUpdateInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterOnUpdateSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterOnUpdateInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforePlayStepSoundSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforePlayStepSoundInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverridePlayStepSoundSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverridePlayStepSoundInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterPlayStepSoundSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterPlayStepSoundInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforePushOutOfBlocksSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforePushOutOfBlocksInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverridePushOutOfBlocksSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverridePushOutOfBlocksInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterPushOutOfBlocksSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterPushOutOfBlocksInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeRayTraceSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeRayTraceInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideRayTraceSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideRayTraceInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterRayTraceSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterRayTraceInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeReadEntityFromNBTSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeReadEntityFromNBTInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideReadEntityFromNBTSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideReadEntityFromNBTInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterReadEntityFromNBTSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterReadEntityFromNBTInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeRespawnPlayerSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeRespawnPlayerInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideRespawnPlayerSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideRespawnPlayerInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterRespawnPlayerSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterRespawnPlayerInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeSetDeadSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeSetDeadInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideSetDeadSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideSetDeadInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterSetDeadSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterSetDeadInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeSetPositionAndRotationSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeSetPositionAndRotationInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideSetPositionAndRotationSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideSetPositionAndRotationInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterSetPositionAndRotationSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterSetPositionAndRotationInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeSleepInBedAtSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeSleepInBedAtInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideSleepInBedAtSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideSleepInBedAtInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterSleepInBedAtSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterSleepInBedAtInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeSwingItemSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeSwingItemInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideSwingItemSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideSwingItemInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterSwingItemSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterSwingItemInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeUpdateEntityActionStateSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeUpdateEntityActionStateInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideUpdateEntityActionStateSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideUpdateEntityActionStateInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterUpdateEntityActionStateSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterUpdateEntityActionStateInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeWriteEntityToNBTSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeWriteEntityToNBTInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideWriteEntityToNBTSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideWriteEntityToNBTInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterWriteEntityToNBTSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterWriteEntityToNBTInferiors());
				}

				addMethod(var1, var0, beforeLocalConstructingHookTypes, "beforeLocalConstructing", new Class[]
				{ Minecraft.class, World.class, Session.class, Integer.TYPE });
				addMethod(var1, var0, afterLocalConstructingHookTypes, "afterLocalConstructing", new Class[]
				{ Minecraft.class, World.class, Session.class, Integer.TYPE });
				addMethod(var1, var0, beforeAddExhaustionHookTypes, "beforeAddExhaustion", new Class[]
				{ Float.TYPE });
				addMethod(var1, var0, overrideAddExhaustionHookTypes, "addExhaustion", new Class[]
				{ Float.TYPE });
				addMethod(var1, var0, afterAddExhaustionHookTypes, "afterAddExhaustion", new Class[]
				{ Float.TYPE });
				addMethod(var1, var0, beforeAddMovementStatHookTypes, "beforeAddMovementStat", new Class[]
				{ Double.TYPE, Double.TYPE, Double.TYPE });
				addMethod(var1, var0, overrideAddMovementStatHookTypes, "addMovementStat", new Class[]
				{ Double.TYPE, Double.TYPE, Double.TYPE });
				addMethod(var1, var0, afterAddMovementStatHookTypes, "afterAddMovementStat", new Class[]
				{ Double.TYPE, Double.TYPE, Double.TYPE });
				addMethod(var1, var0, beforeAddStatHookTypes, "beforeAddStat", new Class[]
				{ StatBase.class, Integer.TYPE });
				addMethod(var1, var0, overrideAddStatHookTypes, "addStat", new Class[]
				{ StatBase.class, Integer.TYPE });
				addMethod(var1, var0, afterAddStatHookTypes, "afterAddStat", new Class[]
				{ StatBase.class, Integer.TYPE });
				addMethod(var1, var0, beforeAttackEntityFromHookTypes, "beforeAttackEntityFrom", new Class[]
				{ DamageSource.class, Integer.TYPE });
				addMethod(var1, var0, overrideAttackEntityFromHookTypes, "attackEntityFrom", new Class[]
				{ DamageSource.class, Integer.TYPE });
				addMethod(var1, var0, afterAttackEntityFromHookTypes, "afterAttackEntityFrom", new Class[]
				{ DamageSource.class, Integer.TYPE });
				addMethod(var1, var0, beforeAlertWolvesHookTypes, "beforeAlertWolves", new Class[]
				{ EntityLiving.class, Boolean.TYPE });
				addMethod(var1, var0, overrideAlertWolvesHookTypes, "alertWolves", new Class[]
				{ EntityLiving.class, Boolean.TYPE });
				addMethod(var1, var0, afterAlertWolvesHookTypes, "afterAlertWolves", new Class[]
				{ EntityLiving.class, Boolean.TYPE });
				addMethod(var1, var0, beforeAttackTargetEntityWithCurrentItemHookTypes, "beforeAttackTargetEntityWithCurrentItem", new Class[]
				{ Entity.class });
				addMethod(var1, var0, overrideAttackTargetEntityWithCurrentItemHookTypes, "attackTargetEntityWithCurrentItem", new Class[]
				{ Entity.class });
				addMethod(var1, var0, afterAttackTargetEntityWithCurrentItemHookTypes, "afterAttackTargetEntityWithCurrentItem", new Class[]
				{ Entity.class });
				addMethod(var1, var0, beforeCanBreatheUnderwaterHookTypes, "beforeCanBreatheUnderwater", new Class[0]);
				addMethod(var1, var0, overrideCanBreatheUnderwaterHookTypes, "canBreatheUnderwater", new Class[0]);
				addMethod(var1, var0, afterCanBreatheUnderwaterHookTypes, "afterCanBreatheUnderwater", new Class[0]);
				addMethod(var1, var0, beforeCanHarvestBlockHookTypes, "beforeCanHarvestBlock", new Class[]
				{ Block.class });
				addMethod(var1, var0, overrideCanHarvestBlockHookTypes, "canHarvestBlock", new Class[]
				{ Block.class });
				addMethod(var1, var0, afterCanHarvestBlockHookTypes, "afterCanHarvestBlock", new Class[]
				{ Block.class });
				addMethod(var1, var0, beforeCanPlayerEditHookTypes, "beforeCanPlayerEdit", new Class[]
				{ Integer.TYPE, Integer.TYPE, Integer.TYPE });
				addMethod(var1, var0, overrideCanPlayerEditHookTypes, "canPlayerEdit", new Class[]
				{ Integer.TYPE, Integer.TYPE, Integer.TYPE });
				addMethod(var1, var0, afterCanPlayerEditHookTypes, "afterCanPlayerEdit", new Class[]
				{ Integer.TYPE, Integer.TYPE, Integer.TYPE });
				addMethod(var1, var0, beforeCanTriggerWalkingHookTypes, "beforeCanTriggerWalking", new Class[0]);
				addMethod(var1, var0, overrideCanTriggerWalkingHookTypes, "canTriggerWalking", new Class[0]);
				addMethod(var1, var0, afterCanTriggerWalkingHookTypes, "afterCanTriggerWalking", new Class[0]);
				addMethod(var1, var0, beforeCloseScreenHookTypes, "beforeCloseScreen", new Class[0]);
				addMethod(var1, var0, overrideCloseScreenHookTypes, "closeScreen", new Class[0]);
				addMethod(var1, var0, afterCloseScreenHookTypes, "afterCloseScreen", new Class[0]);
				addMethod(var1, var0, beforeDamageEntityHookTypes, "beforeDamageEntity", new Class[]
				{ DamageSource.class, Integer.TYPE });
				addMethod(var1, var0, overrideDamageEntityHookTypes, "damageEntity", new Class[]
				{ DamageSource.class, Integer.TYPE });
				addMethod(var1, var0, afterDamageEntityHookTypes, "afterDamageEntity", new Class[]
				{ DamageSource.class, Integer.TYPE });
				addMethod(var1, var0, beforeDisplayGUIBrewingStandHookTypes, "beforeDisplayGUIBrewingStand", new Class[]
				{ TileEntityBrewingStand.class });
				addMethod(var1, var0, overrideDisplayGUIBrewingStandHookTypes, "displayGUIBrewingStand", new Class[]
				{ TileEntityBrewingStand.class });
				addMethod(var1, var0, afterDisplayGUIBrewingStandHookTypes, "afterDisplayGUIBrewingStand", new Class[]
				{ TileEntityBrewingStand.class });
				addMethod(var1, var0, beforeDisplayGUIChestHookTypes, "beforeDisplayGUIChest", new Class[]
				{ IInventory.class });
				addMethod(var1, var0, overrideDisplayGUIChestHookTypes, "displayGUIChest", new Class[]
				{ IInventory.class });
				addMethod(var1, var0, afterDisplayGUIChestHookTypes, "afterDisplayGUIChest", new Class[]
				{ IInventory.class });
				addMethod(var1, var0, beforeDisplayGUIDispenserHookTypes, "beforeDisplayGUIDispenser", new Class[]
				{ TileEntityDispenser.class });
				addMethod(var1, var0, overrideDisplayGUIDispenserHookTypes, "displayGUIDispenser", new Class[]
				{ TileEntityDispenser.class });
				addMethod(var1, var0, afterDisplayGUIDispenserHookTypes, "afterDisplayGUIDispenser", new Class[]
				{ TileEntityDispenser.class });
				addMethod(var1, var0, beforeDisplayGUIEditSignHookTypes, "beforeDisplayGUIEditSign", new Class[]
				{ TileEntitySign.class });
				addMethod(var1, var0, overrideDisplayGUIEditSignHookTypes, "displayGUIEditSign", new Class[]
				{ TileEntitySign.class });
				addMethod(var1, var0, afterDisplayGUIEditSignHookTypes, "afterDisplayGUIEditSign", new Class[]
				{ TileEntitySign.class });
				addMethod(var1, var0, beforeDisplayGUIEnchantmentHookTypes, "beforeDisplayGUIEnchantment", new Class[]
				{ Integer.TYPE, Integer.TYPE, Integer.TYPE });
				addMethod(var1, var0, overrideDisplayGUIEnchantmentHookTypes, "displayGUIEnchantment", new Class[]
				{ Integer.TYPE, Integer.TYPE, Integer.TYPE });
				addMethod(var1, var0, afterDisplayGUIEnchantmentHookTypes, "afterDisplayGUIEnchantment", new Class[]
				{ Integer.TYPE, Integer.TYPE, Integer.TYPE });
				addMethod(var1, var0, beforeDisplayGUIFurnaceHookTypes, "beforeDisplayGUIFurnace", new Class[]
				{ TileEntityFurnace.class });
				addMethod(var1, var0, overrideDisplayGUIFurnaceHookTypes, "displayGUIFurnace", new Class[]
				{ TileEntityFurnace.class });
				addMethod(var1, var0, afterDisplayGUIFurnaceHookTypes, "afterDisplayGUIFurnace", new Class[]
				{ TileEntityFurnace.class });
				addMethod(var1, var0, beforeDisplayWorkbenchGUIHookTypes, "beforeDisplayWorkbenchGUI", new Class[]
				{ Integer.TYPE, Integer.TYPE, Integer.TYPE });
				addMethod(var1, var0, overrideDisplayWorkbenchGUIHookTypes, "displayWorkbenchGUI", new Class[]
				{ Integer.TYPE, Integer.TYPE, Integer.TYPE });
				addMethod(var1, var0, afterDisplayWorkbenchGUIHookTypes, "afterDisplayWorkbenchGUI", new Class[]
				{ Integer.TYPE, Integer.TYPE, Integer.TYPE });
				addMethod(var1, var0, beforeDropOneItemHookTypes, "beforeDropOneItem", new Class[0]);
				addMethod(var1, var0, overrideDropOneItemHookTypes, "dropOneItem", new Class[0]);
				addMethod(var1, var0, afterDropOneItemHookTypes, "afterDropOneItem", new Class[0]);
				addMethod(var1, var0, beforeDropPlayerItemHookTypes, "beforeDropPlayerItem", new Class[]
				{ ItemStack.class });
				addMethod(var1, var0, overrideDropPlayerItemHookTypes, "dropPlayerItem", new Class[]
				{ ItemStack.class });
				addMethod(var1, var0, afterDropPlayerItemHookTypes, "afterDropPlayerItem", new Class[]
				{ ItemStack.class });
				addMethod(var1, var0, beforeDropPlayerItemWithRandomChoiceHookTypes, "beforeDropPlayerItemWithRandomChoice", new Class[]
				{ ItemStack.class, Boolean.TYPE });
				addMethod(var1, var0, overrideDropPlayerItemWithRandomChoiceHookTypes, "dropPlayerItemWithRandomChoice", new Class[]
				{ ItemStack.class, Boolean.TYPE });
				addMethod(var1, var0, afterDropPlayerItemWithRandomChoiceHookTypes, "afterDropPlayerItemWithRandomChoice", new Class[]
				{ ItemStack.class, Boolean.TYPE });
				addMethod(var1, var0, beforeFallHookTypes, "beforeFall", new Class[]
				{ Float.TYPE });
				addMethod(var1, var0, overrideFallHookTypes, "fall", new Class[]
				{ Float.TYPE });
				addMethod(var1, var0, afterFallHookTypes, "afterFall", new Class[]
				{ Float.TYPE });
				addMethod(var1, var0, beforeGetBrightnessHookTypes, "beforeGetBrightness", new Class[]
				{ Float.TYPE });
				addMethod(var1, var0, overrideGetBrightnessHookTypes, "getBrightness", new Class[]
				{ Float.TYPE });
				addMethod(var1, var0, afterGetBrightnessHookTypes, "afterGetBrightness", new Class[]
				{ Float.TYPE });
				addMethod(var1, var0, beforeGetBrightnessForRenderHookTypes, "beforeGetBrightnessForRender", new Class[]
				{ Float.TYPE });
				addMethod(var1, var0, overrideGetBrightnessForRenderHookTypes, "getBrightnessForRender", new Class[]
				{ Float.TYPE });
				addMethod(var1, var0, afterGetBrightnessForRenderHookTypes, "afterGetBrightnessForRender", new Class[]
				{ Float.TYPE });
				addMethod(var1, var0, beforeGetCurrentPlayerStrVsBlockHookTypes, "beforeGetCurrentPlayerStrVsBlock", new Class[]
				{ Block.class });
				addMethod(var1, var0, overrideGetCurrentPlayerStrVsBlockHookTypes, "getCurrentPlayerStrVsBlock", new Class[]
				{ Block.class });
				addMethod(var1, var0, afterGetCurrentPlayerStrVsBlockHookTypes, "afterGetCurrentPlayerStrVsBlock", new Class[]
				{ Block.class });
				addMethod(var1, var0, beforeGetDistanceSqHookTypes, "beforeGetDistanceSq", new Class[]
				{ Double.TYPE, Double.TYPE, Double.TYPE });
				addMethod(var1, var0, overrideGetDistanceSqHookTypes, "getDistanceSq", new Class[]
				{ Double.TYPE, Double.TYPE, Double.TYPE });
				addMethod(var1, var0, afterGetDistanceSqHookTypes, "afterGetDistanceSq", new Class[]
				{ Double.TYPE, Double.TYPE, Double.TYPE });
				addMethod(var1, var0, beforeGetDistanceSqToEntityHookTypes, "beforeGetDistanceSqToEntity", new Class[]
				{ Entity.class });
				addMethod(var1, var0, overrideGetDistanceSqToEntityHookTypes, "getDistanceSqToEntity", new Class[]
				{ Entity.class });
				addMethod(var1, var0, afterGetDistanceSqToEntityHookTypes, "afterGetDistanceSqToEntity", new Class[]
				{ Entity.class });
				addMethod(var1, var0, beforeGetFOVMultiplierHookTypes, "beforeGetFOVMultiplier", new Class[0]);
				addMethod(var1, var0, overrideGetFOVMultiplierHookTypes, "getFOVMultiplier", new Class[0]);
				addMethod(var1, var0, afterGetFOVMultiplierHookTypes, "afterGetFOVMultiplier", new Class[0]);
				addMethod(var1, var0, beforeGetHurtSoundHookTypes, "beforeGetHurtSound", new Class[0]);
				addMethod(var1, var0, overrideGetHurtSoundHookTypes, "getHurtSound", new Class[0]);
				addMethod(var1, var0, afterGetHurtSoundHookTypes, "afterGetHurtSound", new Class[0]);
				addMethod(var1, var0, beforeGetItemIconHookTypes, "beforeGetItemIcon", new Class[]
				{ ItemStack.class, Integer.TYPE });
				addMethod(var1, var0, overrideGetItemIconHookTypes, "getItemIcon", new Class[]
				{ ItemStack.class, Integer.TYPE });
				addMethod(var1, var0, afterGetItemIconHookTypes, "afterGetItemIcon", new Class[]
				{ ItemStack.class, Integer.TYPE });
				addMethod(var1, var0, beforeGetSleepTimerHookTypes, "beforeGetSleepTimer", new Class[0]);
				addMethod(var1, var0, overrideGetSleepTimerHookTypes, "getSleepTimer", new Class[0]);
				addMethod(var1, var0, afterGetSleepTimerHookTypes, "afterGetSleepTimer", new Class[0]);
				addMethod(var1, var0, beforeGetSpeedModifierHookTypes, "beforeGetSpeedModifier", new Class[0]);
				addMethod(var1, var0, overrideGetSpeedModifierHookTypes, "getSpeedModifier", new Class[0]);
				addMethod(var1, var0, afterGetSpeedModifierHookTypes, "afterGetSpeedModifier", new Class[0]);
				addMethod(var1, var0, beforeHandleLavaMovementHookTypes, "beforeHandleLavaMovement", new Class[0]);
				addMethod(var1, var0, overrideHandleLavaMovementHookTypes, "handleLavaMovement", new Class[0]);
				addMethod(var1, var0, afterHandleLavaMovementHookTypes, "afterHandleLavaMovement", new Class[0]);
				addMethod(var1, var0, beforeHandleWaterMovementHookTypes, "beforeHandleWaterMovement", new Class[0]);
				addMethod(var1, var0, overrideHandleWaterMovementHookTypes, "handleWaterMovement", new Class[0]);
				addMethod(var1, var0, afterHandleWaterMovementHookTypes, "afterHandleWaterMovement", new Class[0]);
				addMethod(var1, var0, beforeHealHookTypes, "beforeHeal", new Class[]
				{ Integer.TYPE });
				addMethod(var1, var0, overrideHealHookTypes, "heal", new Class[]
				{ Integer.TYPE });
				addMethod(var1, var0, afterHealHookTypes, "afterHeal", new Class[]
				{ Integer.TYPE });
				addMethod(var1, var0, beforeIsEntityInsideOpaqueBlockHookTypes, "beforeIsEntityInsideOpaqueBlock", new Class[0]);
				addMethod(var1, var0, overrideIsEntityInsideOpaqueBlockHookTypes, "isEntityInsideOpaqueBlock", new Class[0]);
				addMethod(var1, var0, afterIsEntityInsideOpaqueBlockHookTypes, "afterIsEntityInsideOpaqueBlock", new Class[0]);
				addMethod(var1, var0, beforeIsInWaterHookTypes, "beforeIsInWater", new Class[0]);
				addMethod(var1, var0, overrideIsInWaterHookTypes, "isInWater", new Class[0]);
				addMethod(var1, var0, afterIsInWaterHookTypes, "afterIsInWater", new Class[0]);
				addMethod(var1, var0, beforeIsInsideOfMaterialHookTypes, "beforeIsInsideOfMaterial", new Class[]
				{ Material.class });
				addMethod(var1, var0, overrideIsInsideOfMaterialHookTypes, "isInsideOfMaterial", new Class[]
				{ Material.class });
				addMethod(var1, var0, afterIsInsideOfMaterialHookTypes, "afterIsInsideOfMaterial", new Class[]
				{ Material.class });
				addMethod(var1, var0, beforeIsOnLadderHookTypes, "beforeIsOnLadder", new Class[0]);
				addMethod(var1, var0, overrideIsOnLadderHookTypes, "isOnLadder", new Class[0]);
				addMethod(var1, var0, afterIsOnLadderHookTypes, "afterIsOnLadder", new Class[0]);
				addMethod(var1, var0, beforeIsSneakingHookTypes, "beforeIsSneaking", new Class[0]);
				addMethod(var1, var0, overrideIsSneakingHookTypes, "isSneaking", new Class[0]);
				addMethod(var1, var0, afterIsSneakingHookTypes, "afterIsSneaking", new Class[0]);
				addMethod(var1, var0, beforeIsSprintingHookTypes, "beforeIsSprinting", new Class[0]);
				addMethod(var1, var0, overrideIsSprintingHookTypes, "isSprinting", new Class[0]);
				addMethod(var1, var0, afterIsSprintingHookTypes, "afterIsSprinting", new Class[0]);
				addMethod(var1, var0, beforeJumpHookTypes, "beforeJump", new Class[0]);
				addMethod(var1, var0, overrideJumpHookTypes, "jump", new Class[0]);
				addMethod(var1, var0, afterJumpHookTypes, "afterJump", new Class[0]);
				addMethod(var1, var0, beforeKnockBackHookTypes, "beforeKnockBack", new Class[]
				{ Entity.class, Integer.TYPE, Double.TYPE, Double.TYPE });
				addMethod(var1, var0, overrideKnockBackHookTypes, "knockBack", new Class[]
				{ Entity.class, Integer.TYPE, Double.TYPE, Double.TYPE });
				addMethod(var1, var0, afterKnockBackHookTypes, "afterKnockBack", new Class[]
				{ Entity.class, Integer.TYPE, Double.TYPE, Double.TYPE });
				addMethod(var1, var0, beforeMoveEntityHookTypes, "beforeMoveEntity", new Class[]
				{ Double.TYPE, Double.TYPE, Double.TYPE });
				addMethod(var1, var0, overrideMoveEntityHookTypes, "moveEntity", new Class[]
				{ Double.TYPE, Double.TYPE, Double.TYPE });
				addMethod(var1, var0, afterMoveEntityHookTypes, "afterMoveEntity", new Class[]
				{ Double.TYPE, Double.TYPE, Double.TYPE });
				addMethod(var1, var0, beforeMoveEntityWithHeadingHookTypes, "beforeMoveEntityWithHeading", new Class[]
				{ Float.TYPE, Float.TYPE });
				addMethod(var1, var0, overrideMoveEntityWithHeadingHookTypes, "moveEntityWithHeading", new Class[]
				{ Float.TYPE, Float.TYPE });
				addMethod(var1, var0, afterMoveEntityWithHeadingHookTypes, "afterMoveEntityWithHeading", new Class[]
				{ Float.TYPE, Float.TYPE });
				addMethod(var1, var0, beforeMoveFlyingHookTypes, "beforeMoveFlying", new Class[]
				{ Float.TYPE, Float.TYPE, Float.TYPE });
				addMethod(var1, var0, overrideMoveFlyingHookTypes, "moveFlying", new Class[]
				{ Float.TYPE, Float.TYPE, Float.TYPE });
				addMethod(var1, var0, afterMoveFlyingHookTypes, "afterMoveFlying", new Class[]
				{ Float.TYPE, Float.TYPE, Float.TYPE });
				addMethod(var1, var0, beforeOnDeathHookTypes, "beforeOnDeath", new Class[]
				{ DamageSource.class });
				addMethod(var1, var0, overrideOnDeathHookTypes, "onDeath", new Class[]
				{ DamageSource.class });
				addMethod(var1, var0, afterOnDeathHookTypes, "afterOnDeath", new Class[]
				{ DamageSource.class });
				addMethod(var1, var0, beforeOnLivingUpdateHookTypes, "beforeOnLivingUpdate", new Class[0]);
				addMethod(var1, var0, overrideOnLivingUpdateHookTypes, "onLivingUpdate", new Class[0]);
				addMethod(var1, var0, afterOnLivingUpdateHookTypes, "afterOnLivingUpdate", new Class[0]);
				addMethod(var1, var0, beforeOnKillEntityHookTypes, "beforeOnKillEntity", new Class[]
				{ EntityLiving.class });
				addMethod(var1, var0, overrideOnKillEntityHookTypes, "onKillEntity", new Class[]
				{ EntityLiving.class });
				addMethod(var1, var0, afterOnKillEntityHookTypes, "afterOnKillEntity", new Class[]
				{ EntityLiving.class });
				addMethod(var1, var0, beforeOnUpdateHookTypes, "beforeOnUpdate", new Class[0]);
				addMethod(var1, var0, overrideOnUpdateHookTypes, "onUpdate", new Class[0]);
				addMethod(var1, var0, afterOnUpdateHookTypes, "afterOnUpdate", new Class[0]);
				addMethod(var1, var0, beforePlayStepSoundHookTypes, "beforePlayStepSound", new Class[]
				{ Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE });
				addMethod(var1, var0, overridePlayStepSoundHookTypes, "playStepSound", new Class[]
				{ Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE });
				addMethod(var1, var0, afterPlayStepSoundHookTypes, "afterPlayStepSound", new Class[]
				{ Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE });
				addMethod(var1, var0, beforePushOutOfBlocksHookTypes, "beforePushOutOfBlocks", new Class[]
				{ Double.TYPE, Double.TYPE, Double.TYPE });
				addMethod(var1, var0, overridePushOutOfBlocksHookTypes, "pushOutOfBlocks", new Class[]
				{ Double.TYPE, Double.TYPE, Double.TYPE });
				addMethod(var1, var0, afterPushOutOfBlocksHookTypes, "afterPushOutOfBlocks", new Class[]
				{ Double.TYPE, Double.TYPE, Double.TYPE });
				addMethod(var1, var0, beforeRayTraceHookTypes, "beforeRayTrace", new Class[]
				{ Double.TYPE, Float.TYPE });
				addMethod(var1, var0, overrideRayTraceHookTypes, "rayTrace", new Class[]
				{ Double.TYPE, Float.TYPE });
				addMethod(var1, var0, afterRayTraceHookTypes, "afterRayTrace", new Class[]
				{ Double.TYPE, Float.TYPE });
				addMethod(var1, var0, beforeReadEntityFromNBTHookTypes, "beforeReadEntityFromNBT", new Class[]
				{ NBTTagCompound.class });
				addMethod(var1, var0, overrideReadEntityFromNBTHookTypes, "readEntityFromNBT", new Class[]
				{ NBTTagCompound.class });
				addMethod(var1, var0, afterReadEntityFromNBTHookTypes, "afterReadEntityFromNBT", new Class[]
				{ NBTTagCompound.class });
				addMethod(var1, var0, beforeRespawnPlayerHookTypes, "beforeRespawnPlayer", new Class[0]);
				addMethod(var1, var0, overrideRespawnPlayerHookTypes, "respawnPlayer", new Class[0]);
				addMethod(var1, var0, afterRespawnPlayerHookTypes, "afterRespawnPlayer", new Class[0]);
				addMethod(var1, var0, beforeSetDeadHookTypes, "beforeSetDead", new Class[0]);
				addMethod(var1, var0, overrideSetDeadHookTypes, "setDead", new Class[0]);
				addMethod(var1, var0, afterSetDeadHookTypes, "afterSetDead", new Class[0]);
				addMethod(var1, var0, beforeSetPositionAndRotationHookTypes, "beforeSetPositionAndRotation", new Class[]
				{ Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE });
				addMethod(var1, var0, overrideSetPositionAndRotationHookTypes, "setPositionAndRotation", new Class[]
				{ Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE });
				addMethod(var1, var0, afterSetPositionAndRotationHookTypes, "afterSetPositionAndRotation", new Class[]
				{ Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE });
				addMethod(var1, var0, beforeSleepInBedAtHookTypes, "beforeSleepInBedAt", new Class[]
				{ Integer.TYPE, Integer.TYPE, Integer.TYPE });
				addMethod(var1, var0, overrideSleepInBedAtHookTypes, "sleepInBedAt", new Class[]
				{ Integer.TYPE, Integer.TYPE, Integer.TYPE });
				addMethod(var1, var0, afterSleepInBedAtHookTypes, "afterSleepInBedAt", new Class[]
				{ Integer.TYPE, Integer.TYPE, Integer.TYPE });
				addMethod(var1, var0, beforeSwingItemHookTypes, "beforeSwingItem", new Class[0]);
				addMethod(var1, var0, overrideSwingItemHookTypes, "swingItem", new Class[0]);
				addMethod(var1, var0, afterSwingItemHookTypes, "afterSwingItem", new Class[0]);
				addMethod(var1, var0, beforeUpdateEntityActionStateHookTypes, "beforeUpdateEntityActionState", new Class[0]);
				addMethod(var1, var0, overrideUpdateEntityActionStateHookTypes, "updateEntityActionState", new Class[0]);
				addMethod(var1, var0, afterUpdateEntityActionStateHookTypes, "afterUpdateEntityActionState", new Class[0]);
				addMethod(var1, var0, beforeWriteEntityToNBTHookTypes, "beforeWriteEntityToNBT", new Class[]
				{ NBTTagCompound.class });
				addMethod(var1, var0, overrideWriteEntityToNBTHookTypes, "writeEntityToNBT", new Class[]
				{ NBTTagCompound.class });
				addMethod(var1, var0, afterWriteEntityToNBTHookTypes, "afterWriteEntityToNBT", new Class[]
				{ NBTTagCompound.class });
				System.out.println("HexAPI: registered " + var1);
				logger.fine("HexAPI: registered class \'" + var0.getName() + "\' with id \'" + var1 + "\'");
				initialized = false;
			}
		}
	}

	public static boolean unregister(String var0)
	{
		if (var0 != null && allBaseConstructors.remove(var0) != null)
		{
			allBaseBeforeSuperiors.remove(var0);
			allBaseBeforeInferiors.remove(var0);
			allBaseOverrideSuperiors.remove(var0);
			allBaseOverrideInferiors.remove(var0);
			allBaseAfterSuperiors.remove(var0);
			allBaseAfterInferiors.remove(var0);
			beforeLocalConstructingHookTypes.remove(var0);
			afterLocalConstructingHookTypes.remove(var0);
			beforeAddExhaustionHookTypes.remove(var0);
			overrideAddExhaustionHookTypes.remove(var0);
			afterAddExhaustionHookTypes.remove(var0);
			beforeAddMovementStatHookTypes.remove(var0);
			overrideAddMovementStatHookTypes.remove(var0);
			afterAddMovementStatHookTypes.remove(var0);
			beforeAddStatHookTypes.remove(var0);
			overrideAddStatHookTypes.remove(var0);
			afterAddStatHookTypes.remove(var0);
			beforeAttackEntityFromHookTypes.remove(var0);
			overrideAttackEntityFromHookTypes.remove(var0);
			afterAttackEntityFromHookTypes.remove(var0);
			beforeAlertWolvesHookTypes.remove(var0);
			overrideAlertWolvesHookTypes.remove(var0);
			afterAlertWolvesHookTypes.remove(var0);
			beforeAttackTargetEntityWithCurrentItemHookTypes.remove(var0);
			overrideAttackTargetEntityWithCurrentItemHookTypes.remove(var0);
			afterAttackTargetEntityWithCurrentItemHookTypes.remove(var0);
			beforeCanBreatheUnderwaterHookTypes.remove(var0);
			overrideCanBreatheUnderwaterHookTypes.remove(var0);
			afterCanBreatheUnderwaterHookTypes.remove(var0);
			beforeCanHarvestBlockHookTypes.remove(var0);
			overrideCanHarvestBlockHookTypes.remove(var0);
			afterCanHarvestBlockHookTypes.remove(var0);
			beforeCanPlayerEditHookTypes.remove(var0);
			overrideCanPlayerEditHookTypes.remove(var0);
			afterCanPlayerEditHookTypes.remove(var0);
			beforeCanTriggerWalkingHookTypes.remove(var0);
			overrideCanTriggerWalkingHookTypes.remove(var0);
			afterCanTriggerWalkingHookTypes.remove(var0);
			beforeCloseScreenHookTypes.remove(var0);
			overrideCloseScreenHookTypes.remove(var0);
			afterCloseScreenHookTypes.remove(var0);
			beforeDamageEntityHookTypes.remove(var0);
			overrideDamageEntityHookTypes.remove(var0);
			afterDamageEntityHookTypes.remove(var0);
			beforeDisplayGUIBrewingStandHookTypes.remove(var0);
			overrideDisplayGUIBrewingStandHookTypes.remove(var0);
			afterDisplayGUIBrewingStandHookTypes.remove(var0);
			beforeDisplayGUIChestHookTypes.remove(var0);
			overrideDisplayGUIChestHookTypes.remove(var0);
			afterDisplayGUIChestHookTypes.remove(var0);
			beforeDisplayGUIDispenserHookTypes.remove(var0);
			overrideDisplayGUIDispenserHookTypes.remove(var0);
			afterDisplayGUIDispenserHookTypes.remove(var0);
			beforeDisplayGUIEditSignHookTypes.remove(var0);
			overrideDisplayGUIEditSignHookTypes.remove(var0);
			afterDisplayGUIEditSignHookTypes.remove(var0);
			beforeDisplayGUIEnchantmentHookTypes.remove(var0);
			overrideDisplayGUIEnchantmentHookTypes.remove(var0);
			afterDisplayGUIEnchantmentHookTypes.remove(var0);
			beforeDisplayGUIFurnaceHookTypes.remove(var0);
			overrideDisplayGUIFurnaceHookTypes.remove(var0);
			afterDisplayGUIFurnaceHookTypes.remove(var0);
			beforeDisplayWorkbenchGUIHookTypes.remove(var0);
			overrideDisplayWorkbenchGUIHookTypes.remove(var0);
			afterDisplayWorkbenchGUIHookTypes.remove(var0);
			beforeDropOneItemHookTypes.remove(var0);
			overrideDropOneItemHookTypes.remove(var0);
			afterDropOneItemHookTypes.remove(var0);
			beforeDropPlayerItemHookTypes.remove(var0);
			overrideDropPlayerItemHookTypes.remove(var0);
			afterDropPlayerItemHookTypes.remove(var0);
			beforeDropPlayerItemWithRandomChoiceHookTypes.remove(var0);
			overrideDropPlayerItemWithRandomChoiceHookTypes.remove(var0);
			afterDropPlayerItemWithRandomChoiceHookTypes.remove(var0);
			beforeFallHookTypes.remove(var0);
			overrideFallHookTypes.remove(var0);
			afterFallHookTypes.remove(var0);
			beforeGetBrightnessHookTypes.remove(var0);
			overrideGetBrightnessHookTypes.remove(var0);
			afterGetBrightnessHookTypes.remove(var0);
			beforeGetBrightnessForRenderHookTypes.remove(var0);
			overrideGetBrightnessForRenderHookTypes.remove(var0);
			afterGetBrightnessForRenderHookTypes.remove(var0);
			beforeGetCurrentPlayerStrVsBlockHookTypes.remove(var0);
			overrideGetCurrentPlayerStrVsBlockHookTypes.remove(var0);
			afterGetCurrentPlayerStrVsBlockHookTypes.remove(var0);
			beforeGetDistanceSqHookTypes.remove(var0);
			overrideGetDistanceSqHookTypes.remove(var0);
			afterGetDistanceSqHookTypes.remove(var0);
			beforeGetDistanceSqToEntityHookTypes.remove(var0);
			overrideGetDistanceSqToEntityHookTypes.remove(var0);
			afterGetDistanceSqToEntityHookTypes.remove(var0);
			beforeGetFOVMultiplierHookTypes.remove(var0);
			overrideGetFOVMultiplierHookTypes.remove(var0);
			afterGetFOVMultiplierHookTypes.remove(var0);
			beforeGetHurtSoundHookTypes.remove(var0);
			overrideGetHurtSoundHookTypes.remove(var0);
			afterGetHurtSoundHookTypes.remove(var0);
			beforeGetItemIconHookTypes.remove(var0);
			overrideGetItemIconHookTypes.remove(var0);
			afterGetItemIconHookTypes.remove(var0);
			beforeGetSleepTimerHookTypes.remove(var0);
			overrideGetSleepTimerHookTypes.remove(var0);
			afterGetSleepTimerHookTypes.remove(var0);
			beforeGetSpeedModifierHookTypes.remove(var0);
			overrideGetSpeedModifierHookTypes.remove(var0);
			afterGetSpeedModifierHookTypes.remove(var0);
			beforeHandleLavaMovementHookTypes.remove(var0);
			overrideHandleLavaMovementHookTypes.remove(var0);
			afterHandleLavaMovementHookTypes.remove(var0);
			beforeHandleWaterMovementHookTypes.remove(var0);
			overrideHandleWaterMovementHookTypes.remove(var0);
			afterHandleWaterMovementHookTypes.remove(var0);
			beforeHealHookTypes.remove(var0);
			overrideHealHookTypes.remove(var0);
			afterHealHookTypes.remove(var0);
			beforeIsEntityInsideOpaqueBlockHookTypes.remove(var0);
			overrideIsEntityInsideOpaqueBlockHookTypes.remove(var0);
			afterIsEntityInsideOpaqueBlockHookTypes.remove(var0);
			beforeIsInWaterHookTypes.remove(var0);
			overrideIsInWaterHookTypes.remove(var0);
			afterIsInWaterHookTypes.remove(var0);
			beforeIsInsideOfMaterialHookTypes.remove(var0);
			overrideIsInsideOfMaterialHookTypes.remove(var0);
			afterIsInsideOfMaterialHookTypes.remove(var0);
			beforeIsOnLadderHookTypes.remove(var0);
			overrideIsOnLadderHookTypes.remove(var0);
			afterIsOnLadderHookTypes.remove(var0);
			beforeIsSneakingHookTypes.remove(var0);
			overrideIsSneakingHookTypes.remove(var0);
			afterIsSneakingHookTypes.remove(var0);
			beforeIsSprintingHookTypes.remove(var0);
			overrideIsSprintingHookTypes.remove(var0);
			afterIsSprintingHookTypes.remove(var0);
			beforeJumpHookTypes.remove(var0);
			overrideJumpHookTypes.remove(var0);
			afterJumpHookTypes.remove(var0);
			beforeKnockBackHookTypes.remove(var0);
			overrideKnockBackHookTypes.remove(var0);
			afterKnockBackHookTypes.remove(var0);
			beforeMoveEntityHookTypes.remove(var0);
			overrideMoveEntityHookTypes.remove(var0);
			afterMoveEntityHookTypes.remove(var0);
			beforeMoveEntityWithHeadingHookTypes.remove(var0);
			overrideMoveEntityWithHeadingHookTypes.remove(var0);
			afterMoveEntityWithHeadingHookTypes.remove(var0);
			beforeMoveFlyingHookTypes.remove(var0);
			overrideMoveFlyingHookTypes.remove(var0);
			afterMoveFlyingHookTypes.remove(var0);
			beforeOnDeathHookTypes.remove(var0);
			overrideOnDeathHookTypes.remove(var0);
			afterOnDeathHookTypes.remove(var0);
			beforeOnLivingUpdateHookTypes.remove(var0);
			overrideOnLivingUpdateHookTypes.remove(var0);
			afterOnLivingUpdateHookTypes.remove(var0);
			beforeOnKillEntityHookTypes.remove(var0);
			overrideOnKillEntityHookTypes.remove(var0);
			afterOnKillEntityHookTypes.remove(var0);
			beforeOnUpdateHookTypes.remove(var0);
			overrideOnUpdateHookTypes.remove(var0);
			afterOnUpdateHookTypes.remove(var0);
			beforePlayStepSoundHookTypes.remove(var0);
			overridePlayStepSoundHookTypes.remove(var0);
			afterPlayStepSoundHookTypes.remove(var0);
			beforePushOutOfBlocksHookTypes.remove(var0);
			overridePushOutOfBlocksHookTypes.remove(var0);
			afterPushOutOfBlocksHookTypes.remove(var0);
			beforeRayTraceHookTypes.remove(var0);
			overrideRayTraceHookTypes.remove(var0);
			afterRayTraceHookTypes.remove(var0);
			beforeReadEntityFromNBTHookTypes.remove(var0);
			overrideReadEntityFromNBTHookTypes.remove(var0);
			afterReadEntityFromNBTHookTypes.remove(var0);
			beforeRespawnPlayerHookTypes.remove(var0);
			overrideRespawnPlayerHookTypes.remove(var0);
			afterRespawnPlayerHookTypes.remove(var0);
			beforeSetDeadHookTypes.remove(var0);
			overrideSetDeadHookTypes.remove(var0);
			afterSetDeadHookTypes.remove(var0);
			beforeSetPositionAndRotationHookTypes.remove(var0);
			overrideSetPositionAndRotationHookTypes.remove(var0);
			afterSetPositionAndRotationHookTypes.remove(var0);
			beforeSleepInBedAtHookTypes.remove(var0);
			overrideSleepInBedAtHookTypes.remove(var0);
			afterSleepInBedAtHookTypes.remove(var0);
			beforeSwingItemHookTypes.remove(var0);
			overrideSwingItemHookTypes.remove(var0);
			afterSwingItemHookTypes.remove(var0);
			beforeUpdateEntityActionStateHookTypes.remove(var0);
			overrideUpdateEntityActionStateHookTypes.remove(var0);
			afterUpdateEntityActionStateHookTypes.remove(var0);
			beforeWriteEntityToNBTHookTypes.remove(var0);
			overrideWriteEntityToNBTHookTypes.remove(var0);
			afterWriteEntityToNBTHookTypes.remove(var0);
			log("HexAPI: unregistered id \'" + var0 + "\'");
			return true;
		} else
		{
			return false;
		}
	}

	public static Set getRegisteredIds()
	{
		return unmodifiableAllIds;
	}

	private static void addSorting(String var0, Map var1, String[] var2)
	{
		if (var2 != null && var2.length > 0)
		{
			var1.put(var0, var2);
		}
	}

	private static boolean addMethod(String var0, Class var1, List var2, String var3, Class... var4)
	{
		try
		{
			Method var5 = var1.getMethod(var3, var4);
			boolean var6 = var5.getDeclaringClass() != PlayerBase.class;

			if (var6)
			{
				var2.add(var0);
			}

			return var6;
		} catch (Exception var7)
		{
			throw new RuntimeException("Can not reflect method \'" + var3 + "\' of class \'" + var1.getName() + "\'", var7);
		}
	}

	public static HexAPI create(EntityPlayerSP var0)
	{
		if (allBaseConstructors.size() > 0)
		{
			if (!initialized)
			{
				initialize();
			}

			return new HexAPI(var0);
		} else
		{
			return null;
		}
	}

	private static void initialize()
	{
		sortBases(beforeLocalConstructingHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeLocalConstructing");
		sortBases(afterLocalConstructingHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterLocalConstructing");
		sortBases(beforeAddExhaustionHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeAddExhaustion");
		sortBases(overrideAddExhaustionHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideAddExhaustion");
		sortBases(afterAddExhaustionHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterAddExhaustion");
		sortBases(beforeAddMovementStatHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeAddMovementStat");
		sortBases(overrideAddMovementStatHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideAddMovementStat");
		sortBases(afterAddMovementStatHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterAddMovementStat");
		sortBases(beforeAddStatHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeAddStat");
		sortBases(overrideAddStatHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideAddStat");
		sortBases(afterAddStatHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterAddStat");
		sortBases(beforeAttackEntityFromHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeAttackEntityFrom");
		sortBases(overrideAttackEntityFromHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideAttackEntityFrom");
		sortBases(afterAttackEntityFromHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterAttackEntityFrom");
		sortBases(beforeAlertWolvesHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeAlertWolves");
		sortBases(overrideAlertWolvesHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideAlertWolves");
		sortBases(afterAlertWolvesHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterAlertWolves");
		sortBases(beforeAttackTargetEntityWithCurrentItemHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeAttackTargetEntityWithCurrentItem");
		sortBases(overrideAttackTargetEntityWithCurrentItemHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideAttackTargetEntityWithCurrentItem");
		sortBases(afterAttackTargetEntityWithCurrentItemHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterAttackTargetEntityWithCurrentItem");
		sortBases(beforeCanBreatheUnderwaterHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeCanBreatheUnderwater");
		sortBases(overrideCanBreatheUnderwaterHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideCanBreatheUnderwater");
		sortBases(afterCanBreatheUnderwaterHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterCanBreatheUnderwater");
		sortBases(beforeCanHarvestBlockHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeCanHarvestBlock");
		sortBases(overrideCanHarvestBlockHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideCanHarvestBlock");
		sortBases(afterCanHarvestBlockHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterCanHarvestBlock");
		sortBases(beforeCanPlayerEditHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeCanPlayerEdit");
		sortBases(overrideCanPlayerEditHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideCanPlayerEdit");
		sortBases(afterCanPlayerEditHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterCanPlayerEdit");
		sortBases(beforeCanTriggerWalkingHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeCanTriggerWalking");
		sortBases(overrideCanTriggerWalkingHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideCanTriggerWalking");
		sortBases(afterCanTriggerWalkingHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterCanTriggerWalking");
		sortBases(beforeCloseScreenHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeCloseScreen");
		sortBases(overrideCloseScreenHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideCloseScreen");
		sortBases(afterCloseScreenHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterCloseScreen");
		sortBases(beforeDamageEntityHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDamageEntity");
		sortBases(overrideDamageEntityHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDamageEntity");
		sortBases(afterDamageEntityHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDamageEntity");
		sortBases(beforeDisplayGUIBrewingStandHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDisplayGUIBrewingStand");
		sortBases(overrideDisplayGUIBrewingStandHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDisplayGUIBrewingStand");
		sortBases(afterDisplayGUIBrewingStandHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDisplayGUIBrewingStand");
		sortBases(beforeDisplayGUIChestHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDisplayGUIChest");
		sortBases(overrideDisplayGUIChestHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDisplayGUIChest");
		sortBases(afterDisplayGUIChestHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDisplayGUIChest");
		sortBases(beforeDisplayGUIDispenserHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDisplayGUIDispenser");
		sortBases(overrideDisplayGUIDispenserHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDisplayGUIDispenser");
		sortBases(afterDisplayGUIDispenserHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDisplayGUIDispenser");
		sortBases(beforeDisplayGUIEditSignHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDisplayGUIEditSign");
		sortBases(overrideDisplayGUIEditSignHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDisplayGUIEditSign");
		sortBases(afterDisplayGUIEditSignHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDisplayGUIEditSign");
		sortBases(beforeDisplayGUIEnchantmentHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDisplayGUIEnchantment");
		sortBases(overrideDisplayGUIEnchantmentHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDisplayGUIEnchantment");
		sortBases(afterDisplayGUIEnchantmentHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDisplayGUIEnchantment");
		sortBases(beforeDisplayGUIFurnaceHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDisplayGUIFurnace");
		sortBases(overrideDisplayGUIFurnaceHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDisplayGUIFurnace");
		sortBases(afterDisplayGUIFurnaceHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDisplayGUIFurnace");
		sortBases(beforeDisplayWorkbenchGUIHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDisplayWorkbenchGUI");
		sortBases(overrideDisplayWorkbenchGUIHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDisplayWorkbenchGUI");
		sortBases(afterDisplayWorkbenchGUIHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDisplayWorkbenchGUI");
		sortBases(beforeDropOneItemHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDropOneItem");
		sortBases(overrideDropOneItemHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDropOneItem");
		sortBases(afterDropOneItemHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDropOneItem");
		sortBases(beforeDropPlayerItemHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDropPlayerItem");
		sortBases(overrideDropPlayerItemHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDropPlayerItem");
		sortBases(afterDropPlayerItemHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDropPlayerItem");
		sortBases(beforeDropPlayerItemWithRandomChoiceHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDropPlayerItemWithRandomChoice");
		sortBases(overrideDropPlayerItemWithRandomChoiceHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDropPlayerItemWithRandomChoice");
		sortBases(afterDropPlayerItemWithRandomChoiceHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDropPlayerItemWithRandomChoice");
		sortBases(beforeFallHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeFall");
		sortBases(overrideFallHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideFall");
		sortBases(afterFallHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterFall");
		sortBases(beforeGetBrightnessHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetBrightness");
		sortBases(overrideGetBrightnessHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetBrightness");
		sortBases(afterGetBrightnessHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetBrightness");
		sortBases(beforeGetBrightnessForRenderHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetBrightnessForRender");
		sortBases(overrideGetBrightnessForRenderHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetBrightnessForRender");
		sortBases(afterGetBrightnessForRenderHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetBrightnessForRender");
		sortBases(beforeGetCurrentPlayerStrVsBlockHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetCurrentPlayerStrVsBlock");
		sortBases(overrideGetCurrentPlayerStrVsBlockHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetCurrentPlayerStrVsBlock");
		sortBases(afterGetCurrentPlayerStrVsBlockHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetCurrentPlayerStrVsBlock");
		sortBases(beforeGetDistanceSqHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetDistanceSq");
		sortBases(overrideGetDistanceSqHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetDistanceSq");
		sortBases(afterGetDistanceSqHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetDistanceSq");
		sortBases(beforeGetDistanceSqToEntityHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetDistanceSqToEntity");
		sortBases(overrideGetDistanceSqToEntityHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetDistanceSqToEntity");
		sortBases(afterGetDistanceSqToEntityHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetDistanceSqToEntity");
		sortBases(beforeGetFOVMultiplierHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetFOVMultiplier");
		sortBases(overrideGetFOVMultiplierHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetFOVMultiplier");
		sortBases(afterGetFOVMultiplierHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetFOVMultiplier");
		sortBases(beforeGetHurtSoundHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetHurtSound");
		sortBases(overrideGetHurtSoundHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetHurtSound");
		sortBases(afterGetHurtSoundHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetHurtSound");
		sortBases(beforeGetItemIconHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetItemIcon");
		sortBases(overrideGetItemIconHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetItemIcon");
		sortBases(afterGetItemIconHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetItemIcon");
		sortBases(beforeGetSleepTimerHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetSleepTimer");
		sortBases(overrideGetSleepTimerHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetSleepTimer");
		sortBases(afterGetSleepTimerHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetSleepTimer");
		sortBases(beforeGetSpeedModifierHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetSpeedModifier");
		sortBases(overrideGetSpeedModifierHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetSpeedModifier");
		sortBases(afterGetSpeedModifierHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetSpeedModifier");
		sortBases(beforeHandleLavaMovementHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeHandleLavaMovement");
		sortBases(overrideHandleLavaMovementHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideHandleLavaMovement");
		sortBases(afterHandleLavaMovementHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterHandleLavaMovement");
		sortBases(beforeHandleWaterMovementHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeHandleWaterMovement");
		sortBases(overrideHandleWaterMovementHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideHandleWaterMovement");
		sortBases(afterHandleWaterMovementHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterHandleWaterMovement");
		sortBases(beforeHealHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeHeal");
		sortBases(overrideHealHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideHeal");
		sortBases(afterHealHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterHeal");
		sortBases(beforeIsEntityInsideOpaqueBlockHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeIsEntityInsideOpaqueBlock");
		sortBases(overrideIsEntityInsideOpaqueBlockHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideIsEntityInsideOpaqueBlock");
		sortBases(afterIsEntityInsideOpaqueBlockHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterIsEntityInsideOpaqueBlock");
		sortBases(beforeIsInWaterHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeIsInWater");
		sortBases(overrideIsInWaterHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideIsInWater");
		sortBases(afterIsInWaterHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterIsInWater");
		sortBases(beforeIsInsideOfMaterialHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeIsInsideOfMaterial");
		sortBases(overrideIsInsideOfMaterialHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideIsInsideOfMaterial");
		sortBases(afterIsInsideOfMaterialHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterIsInsideOfMaterial");
		sortBases(beforeIsOnLadderHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeIsOnLadder");
		sortBases(overrideIsOnLadderHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideIsOnLadder");
		sortBases(afterIsOnLadderHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterIsOnLadder");
		sortBases(beforeIsSneakingHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeIsSneaking");
		sortBases(overrideIsSneakingHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideIsSneaking");
		sortBases(afterIsSneakingHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterIsSneaking");
		sortBases(beforeIsSprintingHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeIsSprinting");
		sortBases(overrideIsSprintingHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideIsSprinting");
		sortBases(afterIsSprintingHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterIsSprinting");
		sortBases(beforeJumpHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeJump");
		sortBases(overrideJumpHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideJump");
		sortBases(afterJumpHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterJump");
		sortBases(beforeKnockBackHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeKnockBack");
		sortBases(overrideKnockBackHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideKnockBack");
		sortBases(afterKnockBackHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterKnockBack");
		sortBases(beforeMoveEntityHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeMoveEntity");
		sortBases(overrideMoveEntityHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideMoveEntity");
		sortBases(afterMoveEntityHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterMoveEntity");
		sortBases(beforeMoveEntityWithHeadingHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeMoveEntityWithHeading");
		sortBases(overrideMoveEntityWithHeadingHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideMoveEntityWithHeading");
		sortBases(afterMoveEntityWithHeadingHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterMoveEntityWithHeading");
		sortBases(beforeMoveFlyingHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeMoveFlying");
		sortBases(overrideMoveFlyingHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideMoveFlying");
		sortBases(afterMoveFlyingHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterMoveFlying");
		sortBases(beforeOnDeathHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeOnDeath");
		sortBases(overrideOnDeathHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideOnDeath");
		sortBases(afterOnDeathHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterOnDeath");
		sortBases(beforeOnLivingUpdateHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeOnLivingUpdate");
		sortBases(overrideOnLivingUpdateHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideOnLivingUpdate");
		sortBases(afterOnLivingUpdateHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterOnLivingUpdate");
		sortBases(beforeOnKillEntityHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeOnKillEntity");
		sortBases(overrideOnKillEntityHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideOnKillEntity");
		sortBases(afterOnKillEntityHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterOnKillEntity");
		sortBases(beforeOnUpdateHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeOnUpdate");
		sortBases(overrideOnUpdateHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideOnUpdate");
		sortBases(afterOnUpdateHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterOnUpdate");
		sortBases(beforePlayStepSoundHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforePlayStepSound");
		sortBases(overridePlayStepSoundHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overridePlayStepSound");
		sortBases(afterPlayStepSoundHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterPlayStepSound");
		sortBases(beforePushOutOfBlocksHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforePushOutOfBlocks");
		sortBases(overridePushOutOfBlocksHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overridePushOutOfBlocks");
		sortBases(afterPushOutOfBlocksHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterPushOutOfBlocks");
		sortBases(beforeRayTraceHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeRayTrace");
		sortBases(overrideRayTraceHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideRayTrace");
		sortBases(afterRayTraceHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterRayTrace");
		sortBases(beforeReadEntityFromNBTHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeReadEntityFromNBT");
		sortBases(overrideReadEntityFromNBTHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideReadEntityFromNBT");
		sortBases(afterReadEntityFromNBTHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterReadEntityFromNBT");
		sortBases(beforeRespawnPlayerHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeRespawnPlayer");
		sortBases(overrideRespawnPlayerHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideRespawnPlayer");
		sortBases(afterRespawnPlayerHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterRespawnPlayer");
		sortBases(beforeSetDeadHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeSetDead");
		sortBases(overrideSetDeadHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideSetDead");
		sortBases(afterSetDeadHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterSetDead");
		sortBases(beforeSetPositionAndRotationHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeSetPositionAndRotation");
		sortBases(overrideSetPositionAndRotationHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideSetPositionAndRotation");
		sortBases(afterSetPositionAndRotationHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterSetPositionAndRotation");
		sortBases(beforeSleepInBedAtHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeSleepInBedAt");
		sortBases(overrideSleepInBedAtHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideSleepInBedAt");
		sortBases(afterSleepInBedAtHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterSleepInBedAt");
		sortBases(beforeSwingItemHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeSwingItem");
		sortBases(overrideSwingItemHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideSwingItem");
		sortBases(afterSwingItemHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterSwingItem");
		sortBases(beforeUpdateEntityActionStateHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeUpdateEntityActionState");
		sortBases(overrideUpdateEntityActionStateHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideUpdateEntityActionState");
		sortBases(afterUpdateEntityActionStateHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterUpdateEntityActionState");
		sortBases(beforeWriteEntityToNBTHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeWriteEntityToNBT");
		sortBases(overrideWriteEntityToNBTHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideWriteEntityToNBT");
		sortBases(afterWriteEntityToNBTHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterWriteEntityToNBT");
		initialized = true;
	}

	public static void beforeLocalConstructing(EntityPlayerSP var0, Minecraft var1, World var2, Session var3, int var4)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.beforeLocalConstructing(var1, var2, var3, var4);
		}
	}

	public static void afterLocalConstructing(EntityPlayerSP var0, Minecraft var1, World var2, Session var3, int var4)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.afterLocalConstructing(var1, var2, var3, var4);
		}
	}

	private static void sortBases(List var0, Map var1, Map var2, String var3)
	{
		(new PlayerBaseSorter(var0, var1, var2, var3)).Sort();
	}

	private HexAPI(EntityPlayerSP var1)
	{
		this.unmodifiableAllBaseIds = Collections.unmodifiableSet(this.allBaseObjects.keySet());
		this.player = var1;
		Object[] var2 = new Object[]
		{ this };
		Object[] var3 = new Object[]
		{ this, null };
		Entry var5;
		PlayerBase var7;

		for (Iterator var4 = allBaseConstructors.entrySet().iterator(); var4.hasNext(); this.allBaseObjects.put(var5.getKey(), var7))
		{
			var5 = (Entry) var4.next();
			Constructor var6 = (Constructor) var5.getValue();
			var3[1] = var5.getKey();

			try
			{
				if (var6.getParameterTypes().length == 1)
				{
					var7 = (PlayerBase) var6.newInstance(var2);
				} else
				{
					var7 = (PlayerBase) var6.newInstance(var3);
				}
			} catch (Exception var9)
			{
				throw new RuntimeException("Exception while creating a PlayerBase of type \'" + var6.getDeclaringClass() + "\'", var9);
			}
		}

		this.beforeLocalConstructingHooks = this.create(beforeLocalConstructingHookTypes);
		this.afterLocalConstructingHooks = this.create(afterLocalConstructingHookTypes);
		this.beforeAddExhaustionHooks = this.create(beforeAddExhaustionHookTypes);
		this.overrideAddExhaustionHooks = this.create(overrideAddExhaustionHookTypes);
		this.afterAddExhaustionHooks = this.create(afterAddExhaustionHookTypes);
		this.isAddExhaustionModded = this.beforeAddExhaustionHooks != null || this.overrideAddExhaustionHooks != null || this.afterAddExhaustionHooks != null;
		this.beforeAddMovementStatHooks = this.create(beforeAddMovementStatHookTypes);
		this.overrideAddMovementStatHooks = this.create(overrideAddMovementStatHookTypes);
		this.afterAddMovementStatHooks = this.create(afterAddMovementStatHookTypes);
		this.isAddMovementStatModded = this.beforeAddMovementStatHooks != null || this.overrideAddMovementStatHooks != null || this.afterAddMovementStatHooks != null;
		this.beforeAddStatHooks = this.create(beforeAddStatHookTypes);
		this.overrideAddStatHooks = this.create(overrideAddStatHookTypes);
		this.afterAddStatHooks = this.create(afterAddStatHookTypes);
		this.isAddStatModded = this.beforeAddStatHooks != null || this.overrideAddStatHooks != null || this.afterAddStatHooks != null;
		this.beforeAttackEntityFromHooks = this.create(beforeAttackEntityFromHookTypes);
		this.overrideAttackEntityFromHooks = this.create(overrideAttackEntityFromHookTypes);
		this.afterAttackEntityFromHooks = this.create(afterAttackEntityFromHookTypes);
		this.isAttackEntityFromModded = this.beforeAttackEntityFromHooks != null || this.overrideAttackEntityFromHooks != null || this.afterAttackEntityFromHooks != null;
		this.beforeAlertWolvesHooks = this.create(beforeAlertWolvesHookTypes);
		this.overrideAlertWolvesHooks = this.create(overrideAlertWolvesHookTypes);
		this.afterAlertWolvesHooks = this.create(afterAlertWolvesHookTypes);
		this.isAlertWolvesModded = this.beforeAlertWolvesHooks != null || this.overrideAlertWolvesHooks != null || this.afterAlertWolvesHooks != null;
		this.beforeAttackTargetEntityWithCurrentItemHooks = this.create(beforeAttackTargetEntityWithCurrentItemHookTypes);
		this.overrideAttackTargetEntityWithCurrentItemHooks = this.create(overrideAttackTargetEntityWithCurrentItemHookTypes);
		this.afterAttackTargetEntityWithCurrentItemHooks = this.create(afterAttackTargetEntityWithCurrentItemHookTypes);
		this.isAttackTargetEntityWithCurrentItemModded = this.beforeAttackTargetEntityWithCurrentItemHooks != null || this.overrideAttackTargetEntityWithCurrentItemHooks != null || this.afterAttackTargetEntityWithCurrentItemHooks != null;
		this.beforeCanBreatheUnderwaterHooks = this.create(beforeCanBreatheUnderwaterHookTypes);
		this.overrideCanBreatheUnderwaterHooks = this.create(overrideCanBreatheUnderwaterHookTypes);
		this.afterCanBreatheUnderwaterHooks = this.create(afterCanBreatheUnderwaterHookTypes);
		this.isCanBreatheUnderwaterModded = this.beforeCanBreatheUnderwaterHooks != null || this.overrideCanBreatheUnderwaterHooks != null || this.afterCanBreatheUnderwaterHooks != null;
		this.beforeCanHarvestBlockHooks = this.create(beforeCanHarvestBlockHookTypes);
		this.overrideCanHarvestBlockHooks = this.create(overrideCanHarvestBlockHookTypes);
		this.afterCanHarvestBlockHooks = this.create(afterCanHarvestBlockHookTypes);
		this.isCanHarvestBlockModded = this.beforeCanHarvestBlockHooks != null || this.overrideCanHarvestBlockHooks != null || this.afterCanHarvestBlockHooks != null;
		this.beforeCanPlayerEditHooks = this.create(beforeCanPlayerEditHookTypes);
		this.overrideCanPlayerEditHooks = this.create(overrideCanPlayerEditHookTypes);
		this.afterCanPlayerEditHooks = this.create(afterCanPlayerEditHookTypes);
		this.isCanPlayerEditModded = this.beforeCanPlayerEditHooks != null || this.overrideCanPlayerEditHooks != null || this.afterCanPlayerEditHooks != null;
		this.beforeCanTriggerWalkingHooks = this.create(beforeCanTriggerWalkingHookTypes);
		this.overrideCanTriggerWalkingHooks = this.create(overrideCanTriggerWalkingHookTypes);
		this.afterCanTriggerWalkingHooks = this.create(afterCanTriggerWalkingHookTypes);
		this.isCanTriggerWalkingModded = this.beforeCanTriggerWalkingHooks != null || this.overrideCanTriggerWalkingHooks != null || this.afterCanTriggerWalkingHooks != null;
		this.beforeCloseScreenHooks = this.create(beforeCloseScreenHookTypes);
		this.overrideCloseScreenHooks = this.create(overrideCloseScreenHookTypes);
		this.afterCloseScreenHooks = this.create(afterCloseScreenHookTypes);
		this.isCloseScreenModded = this.beforeCloseScreenHooks != null || this.overrideCloseScreenHooks != null || this.afterCloseScreenHooks != null;
		this.beforeDamageEntityHooks = this.create(beforeDamageEntityHookTypes);
		this.overrideDamageEntityHooks = this.create(overrideDamageEntityHookTypes);
		this.afterDamageEntityHooks = this.create(afterDamageEntityHookTypes);
		this.isDamageEntityModded = this.beforeDamageEntityHooks != null || this.overrideDamageEntityHooks != null || this.afterDamageEntityHooks != null;
		this.beforeDisplayGUIBrewingStandHooks = this.create(beforeDisplayGUIBrewingStandHookTypes);
		this.overrideDisplayGUIBrewingStandHooks = this.create(overrideDisplayGUIBrewingStandHookTypes);
		this.afterDisplayGUIBrewingStandHooks = this.create(afterDisplayGUIBrewingStandHookTypes);
		this.isDisplayGUIBrewingStandModded = this.beforeDisplayGUIBrewingStandHooks != null || this.overrideDisplayGUIBrewingStandHooks != null || this.afterDisplayGUIBrewingStandHooks != null;
		this.beforeDisplayGUIChestHooks = this.create(beforeDisplayGUIChestHookTypes);
		this.overrideDisplayGUIChestHooks = this.create(overrideDisplayGUIChestHookTypes);
		this.afterDisplayGUIChestHooks = this.create(afterDisplayGUIChestHookTypes);
		this.isDisplayGUIChestModded = this.beforeDisplayGUIChestHooks != null || this.overrideDisplayGUIChestHooks != null || this.afterDisplayGUIChestHooks != null;
		this.beforeDisplayGUIDispenserHooks = this.create(beforeDisplayGUIDispenserHookTypes);
		this.overrideDisplayGUIDispenserHooks = this.create(overrideDisplayGUIDispenserHookTypes);
		this.afterDisplayGUIDispenserHooks = this.create(afterDisplayGUIDispenserHookTypes);
		this.isDisplayGUIDispenserModded = this.beforeDisplayGUIDispenserHooks != null || this.overrideDisplayGUIDispenserHooks != null || this.afterDisplayGUIDispenserHooks != null;
		this.beforeDisplayGUIEditSignHooks = this.create(beforeDisplayGUIEditSignHookTypes);
		this.overrideDisplayGUIEditSignHooks = this.create(overrideDisplayGUIEditSignHookTypes);
		this.afterDisplayGUIEditSignHooks = this.create(afterDisplayGUIEditSignHookTypes);
		this.isDisplayGUIEditSignModded = this.beforeDisplayGUIEditSignHooks != null || this.overrideDisplayGUIEditSignHooks != null || this.afterDisplayGUIEditSignHooks != null;
		this.beforeDisplayGUIEnchantmentHooks = this.create(beforeDisplayGUIEnchantmentHookTypes);
		this.overrideDisplayGUIEnchantmentHooks = this.create(overrideDisplayGUIEnchantmentHookTypes);
		this.afterDisplayGUIEnchantmentHooks = this.create(afterDisplayGUIEnchantmentHookTypes);
		this.isDisplayGUIEnchantmentModded = this.beforeDisplayGUIEnchantmentHooks != null || this.overrideDisplayGUIEnchantmentHooks != null || this.afterDisplayGUIEnchantmentHooks != null;
		this.beforeDisplayGUIFurnaceHooks = this.create(beforeDisplayGUIFurnaceHookTypes);
		this.overrideDisplayGUIFurnaceHooks = this.create(overrideDisplayGUIFurnaceHookTypes);
		this.afterDisplayGUIFurnaceHooks = this.create(afterDisplayGUIFurnaceHookTypes);
		this.isDisplayGUIFurnaceModded = this.beforeDisplayGUIFurnaceHooks != null || this.overrideDisplayGUIFurnaceHooks != null || this.afterDisplayGUIFurnaceHooks != null;
		this.beforeDisplayWorkbenchGUIHooks = this.create(beforeDisplayWorkbenchGUIHookTypes);
		this.overrideDisplayWorkbenchGUIHooks = this.create(overrideDisplayWorkbenchGUIHookTypes);
		this.afterDisplayWorkbenchGUIHooks = this.create(afterDisplayWorkbenchGUIHookTypes);
		this.isDisplayWorkbenchGUIModded = this.beforeDisplayWorkbenchGUIHooks != null || this.overrideDisplayWorkbenchGUIHooks != null || this.afterDisplayWorkbenchGUIHooks != null;
		this.beforeDropOneItemHooks = this.create(beforeDropOneItemHookTypes);
		this.overrideDropOneItemHooks = this.create(overrideDropOneItemHookTypes);
		this.afterDropOneItemHooks = this.create(afterDropOneItemHookTypes);
		this.isDropOneItemModded = this.beforeDropOneItemHooks != null || this.overrideDropOneItemHooks != null || this.afterDropOneItemHooks != null;
		this.beforeDropPlayerItemHooks = this.create(beforeDropPlayerItemHookTypes);
		this.overrideDropPlayerItemHooks = this.create(overrideDropPlayerItemHookTypes);
		this.afterDropPlayerItemHooks = this.create(afterDropPlayerItemHookTypes);
		this.isDropPlayerItemModded = this.beforeDropPlayerItemHooks != null || this.overrideDropPlayerItemHooks != null || this.afterDropPlayerItemHooks != null;
		this.beforeDropPlayerItemWithRandomChoiceHooks = this.create(beforeDropPlayerItemWithRandomChoiceHookTypes);
		this.overrideDropPlayerItemWithRandomChoiceHooks = this.create(overrideDropPlayerItemWithRandomChoiceHookTypes);
		this.afterDropPlayerItemWithRandomChoiceHooks = this.create(afterDropPlayerItemWithRandomChoiceHookTypes);
		this.isDropPlayerItemWithRandomChoiceModded = this.beforeDropPlayerItemWithRandomChoiceHooks != null || this.overrideDropPlayerItemWithRandomChoiceHooks != null || this.afterDropPlayerItemWithRandomChoiceHooks != null;
		this.beforeFallHooks = this.create(beforeFallHookTypes);
		this.overrideFallHooks = this.create(overrideFallHookTypes);
		this.afterFallHooks = this.create(afterFallHookTypes);
		this.isFallModded = this.beforeFallHooks != null || this.overrideFallHooks != null || this.afterFallHooks != null;
		this.beforeGetBrightnessHooks = this.create(beforeGetBrightnessHookTypes);
		this.overrideGetBrightnessHooks = this.create(overrideGetBrightnessHookTypes);
		this.afterGetBrightnessHooks = this.create(afterGetBrightnessHookTypes);
		this.isGetBrightnessModded = this.beforeGetBrightnessHooks != null || this.overrideGetBrightnessHooks != null || this.afterGetBrightnessHooks != null;
		this.beforeGetBrightnessForRenderHooks = this.create(beforeGetBrightnessForRenderHookTypes);
		this.overrideGetBrightnessForRenderHooks = this.create(overrideGetBrightnessForRenderHookTypes);
		this.afterGetBrightnessForRenderHooks = this.create(afterGetBrightnessForRenderHookTypes);
		this.isGetBrightnessForRenderModded = this.beforeGetBrightnessForRenderHooks != null || this.overrideGetBrightnessForRenderHooks != null || this.afterGetBrightnessForRenderHooks != null;
		this.beforeGetCurrentPlayerStrVsBlockHooks = this.create(beforeGetCurrentPlayerStrVsBlockHookTypes);
		this.overrideGetCurrentPlayerStrVsBlockHooks = this.create(overrideGetCurrentPlayerStrVsBlockHookTypes);
		this.afterGetCurrentPlayerStrVsBlockHooks = this.create(afterGetCurrentPlayerStrVsBlockHookTypes);
		this.isGetCurrentPlayerStrVsBlockModded = this.beforeGetCurrentPlayerStrVsBlockHooks != null || this.overrideGetCurrentPlayerStrVsBlockHooks != null || this.afterGetCurrentPlayerStrVsBlockHooks != null;
		this.beforeGetDistanceSqHooks = this.create(beforeGetDistanceSqHookTypes);
		this.overrideGetDistanceSqHooks = this.create(overrideGetDistanceSqHookTypes);
		this.afterGetDistanceSqHooks = this.create(afterGetDistanceSqHookTypes);
		this.isGetDistanceSqModded = this.beforeGetDistanceSqHooks != null || this.overrideGetDistanceSqHooks != null || this.afterGetDistanceSqHooks != null;
		this.beforeGetDistanceSqToEntityHooks = this.create(beforeGetDistanceSqToEntityHookTypes);
		this.overrideGetDistanceSqToEntityHooks = this.create(overrideGetDistanceSqToEntityHookTypes);
		this.afterGetDistanceSqToEntityHooks = this.create(afterGetDistanceSqToEntityHookTypes);
		this.isGetDistanceSqToEntityModded = this.beforeGetDistanceSqToEntityHooks != null || this.overrideGetDistanceSqToEntityHooks != null || this.afterGetDistanceSqToEntityHooks != null;
		this.beforeGetFOVMultiplierHooks = this.create(beforeGetFOVMultiplierHookTypes);
		this.overrideGetFOVMultiplierHooks = this.create(overrideGetFOVMultiplierHookTypes);
		this.afterGetFOVMultiplierHooks = this.create(afterGetFOVMultiplierHookTypes);
		this.isGetFOVMultiplierModded = this.beforeGetFOVMultiplierHooks != null || this.overrideGetFOVMultiplierHooks != null || this.afterGetFOVMultiplierHooks != null;
		this.beforeGetHurtSoundHooks = this.create(beforeGetHurtSoundHookTypes);
		this.overrideGetHurtSoundHooks = this.create(overrideGetHurtSoundHookTypes);
		this.afterGetHurtSoundHooks = this.create(afterGetHurtSoundHookTypes);
		this.isGetHurtSoundModded = this.beforeGetHurtSoundHooks != null || this.overrideGetHurtSoundHooks != null || this.afterGetHurtSoundHooks != null;
		this.beforeGetItemIconHooks = this.create(beforeGetItemIconHookTypes);
		this.overrideGetItemIconHooks = this.create(overrideGetItemIconHookTypes);
		this.afterGetItemIconHooks = this.create(afterGetItemIconHookTypes);
		this.isGetItemIconModded = this.beforeGetItemIconHooks != null || this.overrideGetItemIconHooks != null || this.afterGetItemIconHooks != null;
		this.beforeGetSleepTimerHooks = this.create(beforeGetSleepTimerHookTypes);
		this.overrideGetSleepTimerHooks = this.create(overrideGetSleepTimerHookTypes);
		this.afterGetSleepTimerHooks = this.create(afterGetSleepTimerHookTypes);
		this.isGetSleepTimerModded = this.beforeGetSleepTimerHooks != null || this.overrideGetSleepTimerHooks != null || this.afterGetSleepTimerHooks != null;
		this.beforeGetSpeedModifierHooks = this.create(beforeGetSpeedModifierHookTypes);
		this.overrideGetSpeedModifierHooks = this.create(overrideGetSpeedModifierHookTypes);
		this.afterGetSpeedModifierHooks = this.create(afterGetSpeedModifierHookTypes);
		this.isGetSpeedModifierModded = this.beforeGetSpeedModifierHooks != null || this.overrideGetSpeedModifierHooks != null || this.afterGetSpeedModifierHooks != null;
		this.beforeHandleLavaMovementHooks = this.create(beforeHandleLavaMovementHookTypes);
		this.overrideHandleLavaMovementHooks = this.create(overrideHandleLavaMovementHookTypes);
		this.afterHandleLavaMovementHooks = this.create(afterHandleLavaMovementHookTypes);
		this.isHandleLavaMovementModded = this.beforeHandleLavaMovementHooks != null || this.overrideHandleLavaMovementHooks != null || this.afterHandleLavaMovementHooks != null;
		this.beforeHandleWaterMovementHooks = this.create(beforeHandleWaterMovementHookTypes);
		this.overrideHandleWaterMovementHooks = this.create(overrideHandleWaterMovementHookTypes);
		this.afterHandleWaterMovementHooks = this.create(afterHandleWaterMovementHookTypes);
		this.isHandleWaterMovementModded = this.beforeHandleWaterMovementHooks != null || this.overrideHandleWaterMovementHooks != null || this.afterHandleWaterMovementHooks != null;
		this.beforeHealHooks = this.create(beforeHealHookTypes);
		this.overrideHealHooks = this.create(overrideHealHookTypes);
		this.afterHealHooks = this.create(afterHealHookTypes);
		this.isHealModded = this.beforeHealHooks != null || this.overrideHealHooks != null || this.afterHealHooks != null;
		this.beforeIsEntityInsideOpaqueBlockHooks = this.create(beforeIsEntityInsideOpaqueBlockHookTypes);
		this.overrideIsEntityInsideOpaqueBlockHooks = this.create(overrideIsEntityInsideOpaqueBlockHookTypes);
		this.afterIsEntityInsideOpaqueBlockHooks = this.create(afterIsEntityInsideOpaqueBlockHookTypes);
		this.isIsEntityInsideOpaqueBlockModded = this.beforeIsEntityInsideOpaqueBlockHooks != null || this.overrideIsEntityInsideOpaqueBlockHooks != null || this.afterIsEntityInsideOpaqueBlockHooks != null;
		this.beforeIsInWaterHooks = this.create(beforeIsInWaterHookTypes);
		this.overrideIsInWaterHooks = this.create(overrideIsInWaterHookTypes);
		this.afterIsInWaterHooks = this.create(afterIsInWaterHookTypes);
		this.isIsInWaterModded = this.beforeIsInWaterHooks != null || this.overrideIsInWaterHooks != null || this.afterIsInWaterHooks != null;
		this.beforeIsInsideOfMaterialHooks = this.create(beforeIsInsideOfMaterialHookTypes);
		this.overrideIsInsideOfMaterialHooks = this.create(overrideIsInsideOfMaterialHookTypes);
		this.afterIsInsideOfMaterialHooks = this.create(afterIsInsideOfMaterialHookTypes);
		this.isIsInsideOfMaterialModded = this.beforeIsInsideOfMaterialHooks != null || this.overrideIsInsideOfMaterialHooks != null || this.afterIsInsideOfMaterialHooks != null;
		this.beforeIsOnLadderHooks = this.create(beforeIsOnLadderHookTypes);
		this.overrideIsOnLadderHooks = this.create(overrideIsOnLadderHookTypes);
		this.afterIsOnLadderHooks = this.create(afterIsOnLadderHookTypes);
		this.isIsOnLadderModded = this.beforeIsOnLadderHooks != null || this.overrideIsOnLadderHooks != null || this.afterIsOnLadderHooks != null;
		this.beforeIsSneakingHooks = this.create(beforeIsSneakingHookTypes);
		this.overrideIsSneakingHooks = this.create(overrideIsSneakingHookTypes);
		this.afterIsSneakingHooks = this.create(afterIsSneakingHookTypes);
		this.isIsSneakingModded = this.beforeIsSneakingHooks != null || this.overrideIsSneakingHooks != null || this.afterIsSneakingHooks != null;
		this.beforeIsSprintingHooks = this.create(beforeIsSprintingHookTypes);
		this.overrideIsSprintingHooks = this.create(overrideIsSprintingHookTypes);
		this.afterIsSprintingHooks = this.create(afterIsSprintingHookTypes);
		this.isIsSprintingModded = this.beforeIsSprintingHooks != null || this.overrideIsSprintingHooks != null || this.afterIsSprintingHooks != null;
		this.beforeJumpHooks = this.create(beforeJumpHookTypes);
		this.overrideJumpHooks = this.create(overrideJumpHookTypes);
		this.afterJumpHooks = this.create(afterJumpHookTypes);
		this.isJumpModded = this.beforeJumpHooks != null || this.overrideJumpHooks != null || this.afterJumpHooks != null;
		this.beforeKnockBackHooks = this.create(beforeKnockBackHookTypes);
		this.overrideKnockBackHooks = this.create(overrideKnockBackHookTypes);
		this.afterKnockBackHooks = this.create(afterKnockBackHookTypes);
		this.isKnockBackModded = this.beforeKnockBackHooks != null || this.overrideKnockBackHooks != null || this.afterKnockBackHooks != null;
		this.beforeMoveEntityHooks = this.create(beforeMoveEntityHookTypes);
		this.overrideMoveEntityHooks = this.create(overrideMoveEntityHookTypes);
		this.afterMoveEntityHooks = this.create(afterMoveEntityHookTypes);
		this.isMoveEntityModded = this.beforeMoveEntityHooks != null || this.overrideMoveEntityHooks != null || this.afterMoveEntityHooks != null;
		this.beforeMoveEntityWithHeadingHooks = this.create(beforeMoveEntityWithHeadingHookTypes);
		this.overrideMoveEntityWithHeadingHooks = this.create(overrideMoveEntityWithHeadingHookTypes);
		this.afterMoveEntityWithHeadingHooks = this.create(afterMoveEntityWithHeadingHookTypes);
		this.isMoveEntityWithHeadingModded = this.beforeMoveEntityWithHeadingHooks != null || this.overrideMoveEntityWithHeadingHooks != null || this.afterMoveEntityWithHeadingHooks != null;
		this.beforeMoveFlyingHooks = this.create(beforeMoveFlyingHookTypes);
		this.overrideMoveFlyingHooks = this.create(overrideMoveFlyingHookTypes);
		this.afterMoveFlyingHooks = this.create(afterMoveFlyingHookTypes);
		this.isMoveFlyingModded = this.beforeMoveFlyingHooks != null || this.overrideMoveFlyingHooks != null || this.afterMoveFlyingHooks != null;
		this.beforeOnDeathHooks = this.create(beforeOnDeathHookTypes);
		this.overrideOnDeathHooks = this.create(overrideOnDeathHookTypes);
		this.afterOnDeathHooks = this.create(afterOnDeathHookTypes);
		this.isOnDeathModded = this.beforeOnDeathHooks != null || this.overrideOnDeathHooks != null || this.afterOnDeathHooks != null;
		this.beforeOnLivingUpdateHooks = this.create(beforeOnLivingUpdateHookTypes);
		this.overrideOnLivingUpdateHooks = this.create(overrideOnLivingUpdateHookTypes);
		this.afterOnLivingUpdateHooks = this.create(afterOnLivingUpdateHookTypes);
		this.isOnLivingUpdateModded = this.beforeOnLivingUpdateHooks != null || this.overrideOnLivingUpdateHooks != null || this.afterOnLivingUpdateHooks != null;
		this.beforeOnKillEntityHooks = this.create(beforeOnKillEntityHookTypes);
		this.overrideOnKillEntityHooks = this.create(overrideOnKillEntityHookTypes);
		this.afterOnKillEntityHooks = this.create(afterOnKillEntityHookTypes);
		this.isOnKillEntityModded = this.beforeOnKillEntityHooks != null || this.overrideOnKillEntityHooks != null || this.afterOnKillEntityHooks != null;
		this.beforeOnUpdateHooks = this.create(beforeOnUpdateHookTypes);
		this.overrideOnUpdateHooks = this.create(overrideOnUpdateHookTypes);
		this.afterOnUpdateHooks = this.create(afterOnUpdateHookTypes);
		this.isOnUpdateModded = this.beforeOnUpdateHooks != null || this.overrideOnUpdateHooks != null || this.afterOnUpdateHooks != null;
		this.beforePlayStepSoundHooks = this.create(beforePlayStepSoundHookTypes);
		this.overridePlayStepSoundHooks = this.create(overridePlayStepSoundHookTypes);
		this.afterPlayStepSoundHooks = this.create(afterPlayStepSoundHookTypes);
		this.isPlayStepSoundModded = this.beforePlayStepSoundHooks != null || this.overridePlayStepSoundHooks != null || this.afterPlayStepSoundHooks != null;
		this.beforePushOutOfBlocksHooks = this.create(beforePushOutOfBlocksHookTypes);
		this.overridePushOutOfBlocksHooks = this.create(overridePushOutOfBlocksHookTypes);
		this.afterPushOutOfBlocksHooks = this.create(afterPushOutOfBlocksHookTypes);
		this.isPushOutOfBlocksModded = this.beforePushOutOfBlocksHooks != null || this.overridePushOutOfBlocksHooks != null || this.afterPushOutOfBlocksHooks != null;
		this.beforeRayTraceHooks = this.create(beforeRayTraceHookTypes);
		this.overrideRayTraceHooks = this.create(overrideRayTraceHookTypes);
		this.afterRayTraceHooks = this.create(afterRayTraceHookTypes);
		this.isRayTraceModded = this.beforeRayTraceHooks != null || this.overrideRayTraceHooks != null || this.afterRayTraceHooks != null;
		this.beforeReadEntityFromNBTHooks = this.create(beforeReadEntityFromNBTHookTypes);
		this.overrideReadEntityFromNBTHooks = this.create(overrideReadEntityFromNBTHookTypes);
		this.afterReadEntityFromNBTHooks = this.create(afterReadEntityFromNBTHookTypes);
		this.isReadEntityFromNBTModded = this.beforeReadEntityFromNBTHooks != null || this.overrideReadEntityFromNBTHooks != null || this.afterReadEntityFromNBTHooks != null;
		this.beforeRespawnPlayerHooks = this.create(beforeRespawnPlayerHookTypes);
		this.overrideRespawnPlayerHooks = this.create(overrideRespawnPlayerHookTypes);
		this.afterRespawnPlayerHooks = this.create(afterRespawnPlayerHookTypes);
		this.isRespawnPlayerModded = this.beforeRespawnPlayerHooks != null || this.overrideRespawnPlayerHooks != null || this.afterRespawnPlayerHooks != null;
		this.beforeSetDeadHooks = this.create(beforeSetDeadHookTypes);
		this.overrideSetDeadHooks = this.create(overrideSetDeadHookTypes);
		this.afterSetDeadHooks = this.create(afterSetDeadHookTypes);
		this.isSetDeadModded = this.beforeSetDeadHooks != null || this.overrideSetDeadHooks != null || this.afterSetDeadHooks != null;
		this.beforeSetPositionAndRotationHooks = this.create(beforeSetPositionAndRotationHookTypes);
		this.overrideSetPositionAndRotationHooks = this.create(overrideSetPositionAndRotationHookTypes);
		this.afterSetPositionAndRotationHooks = this.create(afterSetPositionAndRotationHookTypes);
		this.isSetPositionAndRotationModded = this.beforeSetPositionAndRotationHooks != null || this.overrideSetPositionAndRotationHooks != null || this.afterSetPositionAndRotationHooks != null;
		this.beforeSleepInBedAtHooks = this.create(beforeSleepInBedAtHookTypes);
		this.overrideSleepInBedAtHooks = this.create(overrideSleepInBedAtHookTypes);
		this.afterSleepInBedAtHooks = this.create(afterSleepInBedAtHookTypes);
		this.isSleepInBedAtModded = this.beforeSleepInBedAtHooks != null || this.overrideSleepInBedAtHooks != null || this.afterSleepInBedAtHooks != null;
		this.beforeSwingItemHooks = this.create(beforeSwingItemHookTypes);
		this.overrideSwingItemHooks = this.create(overrideSwingItemHookTypes);
		this.afterSwingItemHooks = this.create(afterSwingItemHookTypes);
		this.isSwingItemModded = this.beforeSwingItemHooks != null || this.overrideSwingItemHooks != null || this.afterSwingItemHooks != null;
		this.beforeUpdateEntityActionStateHooks = this.create(beforeUpdateEntityActionStateHookTypes);
		this.overrideUpdateEntityActionStateHooks = this.create(overrideUpdateEntityActionStateHookTypes);
		this.afterUpdateEntityActionStateHooks = this.create(afterUpdateEntityActionStateHookTypes);
		this.isUpdateEntityActionStateModded = this.beforeUpdateEntityActionStateHooks != null || this.overrideUpdateEntityActionStateHooks != null || this.afterUpdateEntityActionStateHooks != null;
		this.beforeWriteEntityToNBTHooks = this.create(beforeWriteEntityToNBTHookTypes);
		this.overrideWriteEntityToNBTHooks = this.create(overrideWriteEntityToNBTHookTypes);
		this.afterWriteEntityToNBTHooks = this.create(afterWriteEntityToNBTHookTypes);
		this.isWriteEntityToNBTModded = this.beforeWriteEntityToNBTHooks != null || this.overrideWriteEntityToNBTHooks != null || this.afterWriteEntityToNBTHooks != null;
	}

	private PlayerBase[] create(List var1)
	{
		if (var1.isEmpty())
		{
			return null;
		} else
		{
			PlayerBase[] var2 = new PlayerBase[var1.size()];

			for (int var3 = 0; var3 < var2.length; ++var3)
			{
				var2[var3] = this.getPlayerBase((String) var1.get(var3));
			}

			return var2;
		}
	}

	private void beforeLocalConstructing(Minecraft var1, World var2, Session var3, int var4)
	{
		if (this.beforeLocalConstructingHooks != null)
		{
			for (int var5 = this.beforeLocalConstructingHooks.length - 1; var5 >= 0; --var5)
			{
				this.beforeLocalConstructingHooks[var5].beforeLocalConstructing(var1, var2, var3, var4);
			}
		}
	}

	private void afterLocalConstructing(Minecraft var1, World var2, Session var3, int var4)
	{
		if (this.afterLocalConstructingHooks != null)
		{
			for (int var5 = 0; var5 < this.afterLocalConstructingHooks.length; ++var5)
			{
				this.afterLocalConstructingHooks[var5].afterLocalConstructing(var1, var2, var3, var4);
			}
		}
	}

	public PlayerBase getPlayerBase(String var1)
	{
		return (PlayerBase) this.allBaseObjects.get(var1);
	}

	public Set getPlayerBaseIds()
	{
		return this.unmodifiableAllBaseIds;
	}

	public static void addExhaustion(EntityPlayerSP var0, float var1)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.addExhaustion(var1);
		} else
		{
			var0.localAddExhaustion(var1);
		}
	}

	public void addExhaustion(float var1)
	{
		int var2;

		if (this.beforeAddExhaustionHooks != null)
		{
			for (var2 = this.beforeAddExhaustionHooks.length - 1; var2 >= 0; --var2)
			{
				this.beforeAddExhaustionHooks[var2].beforeAddExhaustion(var1);
			}
		}

		if (this.overrideAddExhaustionHooks != null)
		{
			this.overrideAddExhaustionHooks[this.overrideAddExhaustionHooks.length - 1].addExhaustion(var1);
		} else
		{
			this.player.localAddExhaustion(var1);
		}

		if (this.afterAddExhaustionHooks != null)
		{
			for (var2 = 0; var2 < this.afterAddExhaustionHooks.length; ++var2)
			{
				this.afterAddExhaustionHooks[var2].afterAddExhaustion(var1);
			}
		}
	}

	public PlayerBase GetOverwrittenAddExhaustion(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideAddExhaustionHooks.length; ++var2)
		{
			if (this.overrideAddExhaustionHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideAddExhaustionHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void addMovementStat(EntityPlayerSP var0, double var1, double var3, double var5)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.addMovementStat(var1, var3, var5);
		} else
		{
			var0.localAddMovementStat(var1, var3, var5);
		}
	}

	public void addMovementStat(double var1, double var3, double var5)
	{
		int var7;

		if (this.beforeAddMovementStatHooks != null)
		{
			for (var7 = this.beforeAddMovementStatHooks.length - 1; var7 >= 0; --var7)
			{
				this.beforeAddMovementStatHooks[var7].beforeAddMovementStat(var1, var3, var5);
			}
		}

		if (this.overrideAddMovementStatHooks != null)
		{
			this.overrideAddMovementStatHooks[this.overrideAddMovementStatHooks.length - 1].addMovementStat(var1, var3, var5);
		} else
		{
			this.player.localAddMovementStat(var1, var3, var5);
		}

		if (this.afterAddMovementStatHooks != null)
		{
			for (var7 = 0; var7 < this.afterAddMovementStatHooks.length; ++var7)
			{
				this.afterAddMovementStatHooks[var7].afterAddMovementStat(var1, var3, var5);
			}
		}
	}

	public PlayerBase GetOverwrittenAddMovementStat(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideAddMovementStatHooks.length; ++var2)
		{
			if (this.overrideAddMovementStatHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideAddMovementStatHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void addStat(EntityPlayerSP var0, StatBase var1, int var2)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.addStat(var1, var2);
		} else
		{
			var0.localAddStat(var1, var2);
		}
	}

	public void addStat(StatBase var1, int var2)
	{
		int var3;

		if (this.beforeAddStatHooks != null)
		{
			for (var3 = this.beforeAddStatHooks.length - 1; var3 >= 0; --var3)
			{
				this.beforeAddStatHooks[var3].beforeAddStat(var1, var2);
			}
		}

		if (this.overrideAddStatHooks != null)
		{
			this.overrideAddStatHooks[this.overrideAddStatHooks.length - 1].addStat(var1, var2);
		} else
		{
			this.player.localAddStat(var1, var2);
		}

		if (this.afterAddStatHooks != null)
		{
			for (var3 = 0; var3 < this.afterAddStatHooks.length; ++var3)
			{
				this.afterAddStatHooks[var3].afterAddStat(var1, var2);
			}
		}
	}

	public PlayerBase GetOverwrittenAddStat(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideAddStatHooks.length; ++var2)
		{
			if (this.overrideAddStatHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideAddStatHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static boolean attackEntityFrom(EntityPlayerSP var0, DamageSource var1, int var2)
	{
		boolean var3;

		if (var0.HAPI != null)
		{
			var3 = var0.HAPI.attackEntityFrom(var1, var2);
		} else
		{
			var3 = var0.localAttackEntityFrom(var1, var2);
		}

		return var3;
	}

	public boolean attackEntityFrom(DamageSource var1, int var2)
	{
		if (this.beforeAttackEntityFromHooks != null)
		{
			for (int var3 = this.beforeAttackEntityFromHooks.length - 1; var3 >= 0; --var3)
			{
				this.beforeAttackEntityFromHooks[var3].beforeAttackEntityFrom(var1, var2);
			}
		}

		boolean var5;

		if (this.overrideAttackEntityFromHooks != null)
		{
			var5 = this.overrideAttackEntityFromHooks[this.overrideAttackEntityFromHooks.length - 1].attackEntityFrom(var1, var2);
		} else
		{
			var5 = this.player.localAttackEntityFrom(var1, var2);
		}

		if (this.afterAttackEntityFromHooks != null)
		{
			for (int var4 = 0; var4 < this.afterAttackEntityFromHooks.length; ++var4)
			{
				this.afterAttackEntityFromHooks[var4].afterAttackEntityFrom(var1, var2);
			}
		}

		return var5;
	}

	public PlayerBase GetOverwrittenAttackEntityFrom(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideAttackEntityFromHooks.length; ++var2)
		{
			if (this.overrideAttackEntityFromHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideAttackEntityFromHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void alertWolves(EntityPlayerSP var0, EntityLiving var1, boolean var2)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.alertWolves(var1, var2);
		} else
		{
			var0.localAlertWolves(var1, var2);
		}
	}

	public void alertWolves(EntityLiving var1, boolean var2)
	{
		int var3;

		if (this.beforeAlertWolvesHooks != null)
		{
			for (var3 = this.beforeAlertWolvesHooks.length - 1; var3 >= 0; --var3)
			{
				this.beforeAlertWolvesHooks[var3].beforeAlertWolves(var1, var2);
			}
		}

		if (this.overrideAlertWolvesHooks != null)
		{
			this.overrideAlertWolvesHooks[this.overrideAlertWolvesHooks.length - 1].alertWolves(var1, var2);
		} else
		{
			this.player.localAlertWolves(var1, var2);
		}

		if (this.afterAlertWolvesHooks != null)
		{
			for (var3 = 0; var3 < this.afterAlertWolvesHooks.length; ++var3)
			{
				this.afterAlertWolvesHooks[var3].afterAlertWolves(var1, var2);
			}
		}
	}

	public PlayerBase GetOverwrittenAlertWolves(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideAlertWolvesHooks.length; ++var2)
		{
			if (this.overrideAlertWolvesHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideAlertWolvesHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void attackTargetEntityWithCurrentItem(EntityPlayerSP var0, Entity var1)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.attackTargetEntityWithCurrentItem(var1);
		} else
		{
			var0.localAttackTargetEntityWithCurrentItem(var1);
		}
	}

	public void attackTargetEntityWithCurrentItem(Entity var1)
	{
		int var2;

		if (this.beforeAttackTargetEntityWithCurrentItemHooks != null)
		{
			for (var2 = this.beforeAttackTargetEntityWithCurrentItemHooks.length - 1; var2 >= 0; --var2)
			{
				this.beforeAttackTargetEntityWithCurrentItemHooks[var2].beforeAttackTargetEntityWithCurrentItem(var1);
			}
		}

		if (this.overrideAttackTargetEntityWithCurrentItemHooks != null)
		{
			this.overrideAttackTargetEntityWithCurrentItemHooks[this.overrideAttackTargetEntityWithCurrentItemHooks.length - 1].attackTargetEntityWithCurrentItem(var1);
		} else
		{
			this.player.localAttackTargetEntityWithCurrentItem(var1);
		}

		if (this.afterAttackTargetEntityWithCurrentItemHooks != null)
		{
			for (var2 = 0; var2 < this.afterAttackTargetEntityWithCurrentItemHooks.length; ++var2)
			{
				this.afterAttackTargetEntityWithCurrentItemHooks[var2].afterAttackTargetEntityWithCurrentItem(var1);
			}
		}
	}

	public PlayerBase GetOverwrittenAttackTargetEntityWithCurrentItem(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideAttackTargetEntityWithCurrentItemHooks.length; ++var2)
		{
			if (this.overrideAttackTargetEntityWithCurrentItemHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideAttackTargetEntityWithCurrentItemHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static boolean canBreatheUnderwater(EntityPlayerSP var0)
	{
		boolean var1;

		if (var0.HAPI != null)
		{
			var1 = var0.HAPI.canBreatheUnderwater();
		} else
		{
			var1 = var0.localCanBreatheUnderwater();
		}

		return var1;
	}

	public boolean canBreatheUnderwater()
	{
		if (this.beforeCanBreatheUnderwaterHooks != null)
		{
			for (int var1 = this.beforeCanBreatheUnderwaterHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeCanBreatheUnderwaterHooks[var1].beforeCanBreatheUnderwater();
			}
		}

		boolean var3;

		if (this.overrideCanBreatheUnderwaterHooks != null)
		{
			var3 = this.overrideCanBreatheUnderwaterHooks[this.overrideCanBreatheUnderwaterHooks.length - 1].canBreatheUnderwater();
		} else
		{
			var3 = this.player.localCanBreatheUnderwater();
		}

		if (this.afterCanBreatheUnderwaterHooks != null)
		{
			for (int var2 = 0; var2 < this.afterCanBreatheUnderwaterHooks.length; ++var2)
			{
				this.afterCanBreatheUnderwaterHooks[var2].afterCanBreatheUnderwater();
			}
		}

		return var3;
	}

	public PlayerBase GetOverwrittenCanBreatheUnderwater(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideCanBreatheUnderwaterHooks.length; ++var2)
		{
			if (this.overrideCanBreatheUnderwaterHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideCanBreatheUnderwaterHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static boolean canHarvestBlock(EntityPlayerSP var0, Block var1)
	{
		boolean var2;

		if (var0.HAPI != null)
		{
			var2 = var0.HAPI.canHarvestBlock(var1);
		} else
		{
			var2 = var0.localCanHarvestBlock(var1);
		}

		return var2;
	}

	public boolean canHarvestBlock(Block var1)
	{
		if (this.beforeCanHarvestBlockHooks != null)
		{
			for (int var2 = this.beforeCanHarvestBlockHooks.length - 1; var2 >= 0; --var2)
			{
				this.beforeCanHarvestBlockHooks[var2].beforeCanHarvestBlock(var1);
			}
		}

		boolean var4;

		if (this.overrideCanHarvestBlockHooks != null)
		{
			var4 = this.overrideCanHarvestBlockHooks[this.overrideCanHarvestBlockHooks.length - 1].canHarvestBlock(var1);
		} else
		{
			var4 = this.player.localCanHarvestBlock(var1);
		}

		if (this.afterCanHarvestBlockHooks != null)
		{
			for (int var3 = 0; var3 < this.afterCanHarvestBlockHooks.length; ++var3)
			{
				this.afterCanHarvestBlockHooks[var3].afterCanHarvestBlock(var1);
			}
		}

		return var4;
	}

	public PlayerBase GetOverwrittenCanHarvestBlock(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideCanHarvestBlockHooks.length; ++var2)
		{
			if (this.overrideCanHarvestBlockHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideCanHarvestBlockHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static boolean canPlayerEdit(EntityPlayerSP var0, int var1, int var2, int var3)
	{
		boolean var4;

		if (var0.HAPI != null)
		{
			var4 = var0.HAPI.canPlayerEdit(var1, var2, var3);
		} else
		{
			var4 = var0.localCanPlayerEdit(var1, var2, var3);
		}

		return var4;
	}

	public boolean canPlayerEdit(int var1, int var2, int var3)
	{
		if (this.beforeCanPlayerEditHooks != null)
		{
			for (int var4 = this.beforeCanPlayerEditHooks.length - 1; var4 >= 0; --var4)
			{
				this.beforeCanPlayerEditHooks[var4].beforeCanPlayerEdit(var1, var2, var3);
			}
		}

		boolean var6;

		if (this.overrideCanPlayerEditHooks != null)
		{
			var6 = this.overrideCanPlayerEditHooks[this.overrideCanPlayerEditHooks.length - 1].canPlayerEdit(var1, var2, var3);
		} else
		{
			var6 = this.player.localCanPlayerEdit(var1, var2, var3);
		}

		if (this.afterCanPlayerEditHooks != null)
		{
			for (int var5 = 0; var5 < this.afterCanPlayerEditHooks.length; ++var5)
			{
				this.afterCanPlayerEditHooks[var5].afterCanPlayerEdit(var1, var2, var3);
			}
		}

		return var6;
	}

	public PlayerBase GetOverwrittenCanPlayerEdit(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideCanPlayerEditHooks.length; ++var2)
		{
			if (this.overrideCanPlayerEditHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideCanPlayerEditHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static boolean canTriggerWalking(EntityPlayerSP var0)
	{
		boolean var1;

		if (var0.HAPI != null)
		{
			var1 = var0.HAPI.canTriggerWalking();
		} else
		{
			var1 = var0.localCanTriggerWalking();
		}

		return var1;
	}

	public boolean canTriggerWalking()
	{
		if (this.beforeCanTriggerWalkingHooks != null)
		{
			for (int var1 = this.beforeCanTriggerWalkingHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeCanTriggerWalkingHooks[var1].beforeCanTriggerWalking();
			}
		}

		boolean var3;

		if (this.overrideCanTriggerWalkingHooks != null)
		{
			var3 = this.overrideCanTriggerWalkingHooks[this.overrideCanTriggerWalkingHooks.length - 1].canTriggerWalking();
		} else
		{
			var3 = this.player.localCanTriggerWalking();
		}

		if (this.afterCanTriggerWalkingHooks != null)
		{
			for (int var2 = 0; var2 < this.afterCanTriggerWalkingHooks.length; ++var2)
			{
				this.afterCanTriggerWalkingHooks[var2].afterCanTriggerWalking();
			}
		}

		return var3;
	}

	public PlayerBase GetOverwrittenCanTriggerWalking(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideCanTriggerWalkingHooks.length; ++var2)
		{
			if (this.overrideCanTriggerWalkingHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideCanTriggerWalkingHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void closeScreen(EntityPlayerSP var0)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.closeScreen();
		} else
		{
			var0.localCloseScreen();
		}
	}

	public void closeScreen()
	{
		int var1;

		if (this.beforeCloseScreenHooks != null)
		{
			for (var1 = this.beforeCloseScreenHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeCloseScreenHooks[var1].beforeCloseScreen();
			}
		}

		if (this.overrideCloseScreenHooks != null)
		{
			this.overrideCloseScreenHooks[this.overrideCloseScreenHooks.length - 1].closeScreen();
		} else
		{
			this.player.localCloseScreen();
		}

		if (this.afterCloseScreenHooks != null)
		{
			for (var1 = 0; var1 < this.afterCloseScreenHooks.length; ++var1)
			{
				this.afterCloseScreenHooks[var1].afterCloseScreen();
			}
		}
	}

	public PlayerBase GetOverwrittenCloseScreen(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideCloseScreenHooks.length; ++var2)
		{
			if (this.overrideCloseScreenHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideCloseScreenHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void damageEntity(EntityPlayerSP var0, DamageSource var1, int var2)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.damageEntity(var1, var2);
		} else
		{
			var0.localDamageEntity(var1, var2);
		}
	}

	public void damageEntity(DamageSource var1, int var2)
	{
		int var3;

		if (this.beforeDamageEntityHooks != null)
		{
			for (var3 = this.beforeDamageEntityHooks.length - 1; var3 >= 0; --var3)
			{
				this.beforeDamageEntityHooks[var3].beforeDamageEntity(var1, var2);
			}
		}

		if (this.overrideDamageEntityHooks != null)
		{
			this.overrideDamageEntityHooks[this.overrideDamageEntityHooks.length - 1].damageEntity(var1, var2);
		} else
		{
			this.player.localDamageEntity(var1, var2);
		}

		if (this.afterDamageEntityHooks != null)
		{
			for (var3 = 0; var3 < this.afterDamageEntityHooks.length; ++var3)
			{
				this.afterDamageEntityHooks[var3].afterDamageEntity(var1, var2);
			}
		}
	}

	public PlayerBase GetOverwrittenDamageEntity(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideDamageEntityHooks.length; ++var2)
		{
			if (this.overrideDamageEntityHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideDamageEntityHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void displayGUIBrewingStand(EntityPlayerSP var0, TileEntityBrewingStand var1)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.displayGUIBrewingStand(var1);
		} else
		{
			var0.localDisplayGUIBrewingStand(var1);
		}
	}

	public void displayGUIBrewingStand(TileEntityBrewingStand var1)
	{
		int var2;

		if (this.beforeDisplayGUIBrewingStandHooks != null)
		{
			for (var2 = this.beforeDisplayGUIBrewingStandHooks.length - 1; var2 >= 0; --var2)
			{
				this.beforeDisplayGUIBrewingStandHooks[var2].beforeDisplayGUIBrewingStand(var1);
			}
		}

		if (this.overrideDisplayGUIBrewingStandHooks != null)
		{
			this.overrideDisplayGUIBrewingStandHooks[this.overrideDisplayGUIBrewingStandHooks.length - 1].displayGUIBrewingStand(var1);
		} else
		{
			this.player.localDisplayGUIBrewingStand(var1);
		}

		if (this.afterDisplayGUIBrewingStandHooks != null)
		{
			for (var2 = 0; var2 < this.afterDisplayGUIBrewingStandHooks.length; ++var2)
			{
				this.afterDisplayGUIBrewingStandHooks[var2].afterDisplayGUIBrewingStand(var1);
			}
		}
	}

	public PlayerBase GetOverwrittenDisplayGUIBrewingStand(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideDisplayGUIBrewingStandHooks.length; ++var2)
		{
			if (this.overrideDisplayGUIBrewingStandHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideDisplayGUIBrewingStandHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void displayGUIChest(EntityPlayerSP var0, IInventory var1)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.displayGUIChest(var1);
		} else
		{
			var0.localDisplayGUIChest(var1);
		}
	}

	public void displayGUIChest(IInventory var1)
	{
		int var2;

		if (this.beforeDisplayGUIChestHooks != null)
		{
			for (var2 = this.beforeDisplayGUIChestHooks.length - 1; var2 >= 0; --var2)
			{
				this.beforeDisplayGUIChestHooks[var2].beforeDisplayGUIChest(var1);
			}
		}

		if (this.overrideDisplayGUIChestHooks != null)
		{
			this.overrideDisplayGUIChestHooks[this.overrideDisplayGUIChestHooks.length - 1].displayGUIChest(var1);
		} else
		{
			this.player.localDisplayGUIChest(var1);
		}

		if (this.afterDisplayGUIChestHooks != null)
		{
			for (var2 = 0; var2 < this.afterDisplayGUIChestHooks.length; ++var2)
			{
				this.afterDisplayGUIChestHooks[var2].afterDisplayGUIChest(var1);
			}
		}
	}

	public PlayerBase GetOverwrittenDisplayGUIChest(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideDisplayGUIChestHooks.length; ++var2)
		{
			if (this.overrideDisplayGUIChestHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideDisplayGUIChestHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void displayGUIDispenser(EntityPlayerSP var0, TileEntityDispenser var1)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.displayGUIDispenser(var1);
		} else
		{
			var0.localDisplayGUIDispenser(var1);
		}
	}

	public void displayGUIDispenser(TileEntityDispenser var1)
	{
		int var2;

		if (this.beforeDisplayGUIDispenserHooks != null)
		{
			for (var2 = this.beforeDisplayGUIDispenserHooks.length - 1; var2 >= 0; --var2)
			{
				this.beforeDisplayGUIDispenserHooks[var2].beforeDisplayGUIDispenser(var1);
			}
		}

		if (this.overrideDisplayGUIDispenserHooks != null)
		{
			this.overrideDisplayGUIDispenserHooks[this.overrideDisplayGUIDispenserHooks.length - 1].displayGUIDispenser(var1);
		} else
		{
			this.player.localDisplayGUIDispenser(var1);
		}

		if (this.afterDisplayGUIDispenserHooks != null)
		{
			for (var2 = 0; var2 < this.afterDisplayGUIDispenserHooks.length; ++var2)
			{
				this.afterDisplayGUIDispenserHooks[var2].afterDisplayGUIDispenser(var1);
			}
		}
	}

	public PlayerBase GetOverwrittenDisplayGUIDispenser(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideDisplayGUIDispenserHooks.length; ++var2)
		{
			if (this.overrideDisplayGUIDispenserHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideDisplayGUIDispenserHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void displayGUIEditSign(EntityPlayerSP var0, TileEntitySign var1)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.displayGUIEditSign(var1);
		} else
		{
			var0.localDisplayGUIEditSign(var1);
		}
	}

	public void displayGUIEditSign(TileEntitySign var1)
	{
		int var2;

		if (this.beforeDisplayGUIEditSignHooks != null)
		{
			for (var2 = this.beforeDisplayGUIEditSignHooks.length - 1; var2 >= 0; --var2)
			{
				this.beforeDisplayGUIEditSignHooks[var2].beforeDisplayGUIEditSign(var1);
			}
		}

		if (this.overrideDisplayGUIEditSignHooks != null)
		{
			this.overrideDisplayGUIEditSignHooks[this.overrideDisplayGUIEditSignHooks.length - 1].displayGUIEditSign(var1);
		} else
		{
			this.player.localDisplayGUIEditSign(var1);
		}

		if (this.afterDisplayGUIEditSignHooks != null)
		{
			for (var2 = 0; var2 < this.afterDisplayGUIEditSignHooks.length; ++var2)
			{
				this.afterDisplayGUIEditSignHooks[var2].afterDisplayGUIEditSign(var1);
			}
		}
	}

	public PlayerBase GetOverwrittenDisplayGUIEditSign(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideDisplayGUIEditSignHooks.length; ++var2)
		{
			if (this.overrideDisplayGUIEditSignHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideDisplayGUIEditSignHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void displayGUIEnchantment(EntityPlayerSP var0, int var1, int var2, int var3)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.displayGUIEnchantment(var1, var2, var3);
		} else
		{
			var0.localDisplayGUIEnchantment(var1, var2, var3);
		}
	}

	public void displayGUIEnchantment(int var1, int var2, int var3)
	{
		int var4;

		if (this.beforeDisplayGUIEnchantmentHooks != null)
		{
			for (var4 = this.beforeDisplayGUIEnchantmentHooks.length - 1; var4 >= 0; --var4)
			{
				this.beforeDisplayGUIEnchantmentHooks[var4].beforeDisplayGUIEnchantment(var1, var2, var3);
			}
		}

		if (this.overrideDisplayGUIEnchantmentHooks != null)
		{
			this.overrideDisplayGUIEnchantmentHooks[this.overrideDisplayGUIEnchantmentHooks.length - 1].displayGUIEnchantment(var1, var2, var3);
		} else
		{
			this.player.localDisplayGUIEnchantment(var1, var2, var3);
		}

		if (this.afterDisplayGUIEnchantmentHooks != null)
		{
			for (var4 = 0; var4 < this.afterDisplayGUIEnchantmentHooks.length; ++var4)
			{
				this.afterDisplayGUIEnchantmentHooks[var4].afterDisplayGUIEnchantment(var1, var2, var3);
			}
		}
	}

	public PlayerBase GetOverwrittenDisplayGUIEnchantment(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideDisplayGUIEnchantmentHooks.length; ++var2)
		{
			if (this.overrideDisplayGUIEnchantmentHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideDisplayGUIEnchantmentHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void displayGUIFurnace(EntityPlayerSP var0, TileEntityFurnace var1)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.displayGUIFurnace(var1);
		} else
		{
			var0.localDisplayGUIFurnace(var1);
		}
	}

	public void displayGUIFurnace(TileEntityFurnace var1)
	{
		int var2;

		if (this.beforeDisplayGUIFurnaceHooks != null)
		{
			for (var2 = this.beforeDisplayGUIFurnaceHooks.length - 1; var2 >= 0; --var2)
			{
				this.beforeDisplayGUIFurnaceHooks[var2].beforeDisplayGUIFurnace(var1);
			}
		}

		if (this.overrideDisplayGUIFurnaceHooks != null)
		{
			this.overrideDisplayGUIFurnaceHooks[this.overrideDisplayGUIFurnaceHooks.length - 1].displayGUIFurnace(var1);
		} else
		{
			this.player.localDisplayGUIFurnace(var1);
		}

		if (this.afterDisplayGUIFurnaceHooks != null)
		{
			for (var2 = 0; var2 < this.afterDisplayGUIFurnaceHooks.length; ++var2)
			{
				this.afterDisplayGUIFurnaceHooks[var2].afterDisplayGUIFurnace(var1);
			}
		}
	}

	public PlayerBase GetOverwrittenDisplayGUIFurnace(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideDisplayGUIFurnaceHooks.length; ++var2)
		{
			if (this.overrideDisplayGUIFurnaceHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideDisplayGUIFurnaceHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void displayWorkbenchGUI(EntityPlayerSP var0, int var1, int var2, int var3)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.displayWorkbenchGUI(var1, var2, var3);
		} else
		{
			var0.localDisplayWorkbenchGUI(var1, var2, var3);
		}
	}

	public void displayWorkbenchGUI(int var1, int var2, int var3)
	{
		int var4;

		if (this.beforeDisplayWorkbenchGUIHooks != null)
		{
			for (var4 = this.beforeDisplayWorkbenchGUIHooks.length - 1; var4 >= 0; --var4)
			{
				this.beforeDisplayWorkbenchGUIHooks[var4].beforeDisplayWorkbenchGUI(var1, var2, var3);
			}
		}

		if (this.overrideDisplayWorkbenchGUIHooks != null)
		{
			this.overrideDisplayWorkbenchGUIHooks[this.overrideDisplayWorkbenchGUIHooks.length - 1].displayWorkbenchGUI(var1, var2, var3);
		} else
		{
			this.player.localDisplayWorkbenchGUI(var1, var2, var3);
		}

		if (this.afterDisplayWorkbenchGUIHooks != null)
		{
			for (var4 = 0; var4 < this.afterDisplayWorkbenchGUIHooks.length; ++var4)
			{
				this.afterDisplayWorkbenchGUIHooks[var4].afterDisplayWorkbenchGUI(var1, var2, var3);
			}
		}
	}

	public PlayerBase GetOverwrittenDisplayWorkbenchGUI(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideDisplayWorkbenchGUIHooks.length; ++var2)
		{
			if (this.overrideDisplayWorkbenchGUIHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideDisplayWorkbenchGUIHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static EntityItem dropOneItem(EntityPlayerSP var0)
	{
		EntityItem var1;

		if (var0.HAPI != null)
		{
			var1 = var0.HAPI.dropOneItem();
		} else
		{
			var1 = var0.localDropOneItem();
		}

		return var1;
	}

	public EntityItem dropOneItem()
	{
		if (this.beforeDropOneItemHooks != null)
		{
			for (int var1 = this.beforeDropOneItemHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeDropOneItemHooks[var1].beforeDropOneItem();
			}
		}

		EntityItem var3;

		if (this.overrideDropOneItemHooks != null)
		{
			var3 = this.overrideDropOneItemHooks[this.overrideDropOneItemHooks.length - 1].dropOneItem();
		} else
		{
			var3 = this.player.localDropOneItem();
		}

		if (this.afterDropOneItemHooks != null)
		{
			for (int var2 = 0; var2 < this.afterDropOneItemHooks.length; ++var2)
			{
				this.afterDropOneItemHooks[var2].afterDropOneItem();
			}
		}

		return var3;
	}

	public PlayerBase GetOverwrittenDropOneItem(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideDropOneItemHooks.length; ++var2)
		{
			if (this.overrideDropOneItemHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideDropOneItemHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static EntityItem dropPlayerItem(EntityPlayerSP var0, ItemStack var1)
	{
		EntityItem var2;

		if (var0.HAPI != null)
		{
			var2 = var0.HAPI.dropPlayerItem(var1);
		} else
		{
			var2 = var0.localDropPlayerItem(var1);
		}

		return var2;
	}

	public EntityItem dropPlayerItem(ItemStack var1)
	{
		if (this.beforeDropPlayerItemHooks != null)
		{
			for (int var2 = this.beforeDropPlayerItemHooks.length - 1; var2 >= 0; --var2)
			{
				this.beforeDropPlayerItemHooks[var2].beforeDropPlayerItem(var1);
			}
		}

		EntityItem var4;

		if (this.overrideDropPlayerItemHooks != null)
		{
			var4 = this.overrideDropPlayerItemHooks[this.overrideDropPlayerItemHooks.length - 1].dropPlayerItem(var1);
		} else
		{
			var4 = this.player.localDropPlayerItem(var1);
		}

		if (this.afterDropPlayerItemHooks != null)
		{
			for (int var3 = 0; var3 < this.afterDropPlayerItemHooks.length; ++var3)
			{
				this.afterDropPlayerItemHooks[var3].afterDropPlayerItem(var1);
			}
		}

		return var4;
	}

	public PlayerBase GetOverwrittenDropPlayerItem(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideDropPlayerItemHooks.length; ++var2)
		{
			if (this.overrideDropPlayerItemHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideDropPlayerItemHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static EntityItem dropPlayerItemWithRandomChoice(EntityPlayerSP var0, ItemStack var1, boolean var2)
	{
		EntityItem var3;

		if (var0.HAPI != null)
		{
			var3 = var0.HAPI.dropPlayerItemWithRandomChoice(var1, var2);
		} else
		{
			var3 = var0.localDropPlayerItemWithRandomChoice(var1, var2);
		}

		return var3;
	}

	public EntityItem dropPlayerItemWithRandomChoice(ItemStack var1, boolean var2)
	{
		if (this.beforeDropPlayerItemWithRandomChoiceHooks != null)
		{
			for (int var3 = this.beforeDropPlayerItemWithRandomChoiceHooks.length - 1; var3 >= 0; --var3)
			{
				this.beforeDropPlayerItemWithRandomChoiceHooks[var3].beforeDropPlayerItemWithRandomChoice(var1, var2);
			}
		}

		EntityItem var5;

		if (this.overrideDropPlayerItemWithRandomChoiceHooks != null)
		{
			var5 = this.overrideDropPlayerItemWithRandomChoiceHooks[this.overrideDropPlayerItemWithRandomChoiceHooks.length - 1].dropPlayerItemWithRandomChoice(var1, var2);
		} else
		{
			var5 = this.player.localDropPlayerItemWithRandomChoice(var1, var2);
		}

		if (this.afterDropPlayerItemWithRandomChoiceHooks != null)
		{
			for (int var4 = 0; var4 < this.afterDropPlayerItemWithRandomChoiceHooks.length; ++var4)
			{
				this.afterDropPlayerItemWithRandomChoiceHooks[var4].afterDropPlayerItemWithRandomChoice(var1, var2);
			}
		}

		return var5;
	}

	public PlayerBase GetOverwrittenDropPlayerItemWithRandomChoice(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideDropPlayerItemWithRandomChoiceHooks.length; ++var2)
		{
			if (this.overrideDropPlayerItemWithRandomChoiceHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideDropPlayerItemWithRandomChoiceHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void fall(EntityPlayerSP var0, float var1)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.fall(var1);
		} else
		{
			var0.localFall(var1);
		}
	}

	public void fall(float var1)
	{
		int var2;

		if (this.beforeFallHooks != null)
		{
			for (var2 = this.beforeFallHooks.length - 1; var2 >= 0; --var2)
			{
				this.beforeFallHooks[var2].beforeFall(var1);
			}
		}

		if (this.overrideFallHooks != null)
		{
			this.overrideFallHooks[this.overrideFallHooks.length - 1].fall(var1);
		} else
		{
			this.player.localFall(var1);
		}

		if (this.afterFallHooks != null)
		{
			for (var2 = 0; var2 < this.afterFallHooks.length; ++var2)
			{
				this.afterFallHooks[var2].afterFall(var1);
			}
		}
	}

	public PlayerBase GetOverwrittenFall(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideFallHooks.length; ++var2)
		{
			if (this.overrideFallHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideFallHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static float getBrightness(EntityPlayerSP var0, float var1)
	{
		float var2;

		if (var0.HAPI != null)
		{
			var2 = var0.HAPI.getBrightness(var1);
		} else
		{
			var2 = var0.localGetBrightness(var1);
		}

		return var2;
	}

	public float getBrightness(float var1)
	{
		if (this.beforeGetBrightnessHooks != null)
		{
			for (int var2 = this.beforeGetBrightnessHooks.length - 1; var2 >= 0; --var2)
			{
				this.beforeGetBrightnessHooks[var2].beforeGetBrightness(var1);
			}
		}

		float var4;

		if (this.overrideGetBrightnessHooks != null)
		{
			var4 = this.overrideGetBrightnessHooks[this.overrideGetBrightnessHooks.length - 1].getBrightness(var1);
		} else
		{
			var4 = this.player.localGetBrightness(var1);
		}

		if (this.afterGetBrightnessHooks != null)
		{
			for (int var3 = 0; var3 < this.afterGetBrightnessHooks.length; ++var3)
			{
				this.afterGetBrightnessHooks[var3].afterGetBrightness(var1);
			}
		}

		return var4;
	}

	public PlayerBase GetOverwrittenGetBrightness(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideGetBrightnessHooks.length; ++var2)
		{
			if (this.overrideGetBrightnessHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideGetBrightnessHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static int getBrightnessForRender(EntityPlayerSP var0, float var1)
	{
		int var2;

		if (var0.HAPI != null)
		{
			var2 = var0.HAPI.getBrightnessForRender(var1);
		} else
		{
			var2 = var0.localGetBrightnessForRender(var1);
		}

		return var2;
	}

	public int getBrightnessForRender(float var1)
	{
		int var2;

		if (this.beforeGetBrightnessForRenderHooks != null)
		{
			for (var2 = this.beforeGetBrightnessForRenderHooks.length - 1; var2 >= 0; --var2)
			{
				this.beforeGetBrightnessForRenderHooks[var2].beforeGetBrightnessForRender(var1);
			}
		}

		if (this.overrideGetBrightnessForRenderHooks != null)
		{
			var2 = this.overrideGetBrightnessForRenderHooks[this.overrideGetBrightnessForRenderHooks.length - 1].getBrightnessForRender(var1);
		} else
		{
			var2 = this.player.localGetBrightnessForRender(var1);
		}

		if (this.afterGetBrightnessForRenderHooks != null)
		{
			for (int var3 = 0; var3 < this.afterGetBrightnessForRenderHooks.length; ++var3)
			{
				this.afterGetBrightnessForRenderHooks[var3].afterGetBrightnessForRender(var1);
			}
		}

		return var2;
	}

	public PlayerBase GetOverwrittenGetBrightnessForRender(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideGetBrightnessForRenderHooks.length; ++var2)
		{
			if (this.overrideGetBrightnessForRenderHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideGetBrightnessForRenderHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static float getCurrentPlayerStrVsBlock(EntityPlayerSP var0, Block var1)
	{
		float var2;

		if (var0.HAPI != null)
		{
			var2 = var0.HAPI.getCurrentPlayerStrVsBlock(var1);
		} else
		{
			var2 = var0.localGetCurrentPlayerStrVsBlock(var1);
		}

		return var2;
	}

	public float getCurrentPlayerStrVsBlock(Block var1)
	{
		if (this.beforeGetCurrentPlayerStrVsBlockHooks != null)
		{
			for (int var2 = this.beforeGetCurrentPlayerStrVsBlockHooks.length - 1; var2 >= 0; --var2)
			{
				this.beforeGetCurrentPlayerStrVsBlockHooks[var2].beforeGetCurrentPlayerStrVsBlock(var1);
			}
		}

		float var4;

		if (this.overrideGetCurrentPlayerStrVsBlockHooks != null)
		{
			var4 = this.overrideGetCurrentPlayerStrVsBlockHooks[this.overrideGetCurrentPlayerStrVsBlockHooks.length - 1].getCurrentPlayerStrVsBlock(var1);
		} else
		{
			var4 = this.player.localGetCurrentPlayerStrVsBlock(var1);
		}

		if (this.afterGetCurrentPlayerStrVsBlockHooks != null)
		{
			for (int var3 = 0; var3 < this.afterGetCurrentPlayerStrVsBlockHooks.length; ++var3)
			{
				this.afterGetCurrentPlayerStrVsBlockHooks[var3].afterGetCurrentPlayerStrVsBlock(var1);
			}
		}

		return var4;
	}

	public PlayerBase GetOverwrittenGetCurrentPlayerStrVsBlock(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideGetCurrentPlayerStrVsBlockHooks.length; ++var2)
		{
			if (this.overrideGetCurrentPlayerStrVsBlockHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideGetCurrentPlayerStrVsBlockHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static double getDistanceSq(EntityPlayerSP var0, double var1, double var3, double var5)
	{
		double var7;

		if (var0.HAPI != null)
		{
			var7 = var0.HAPI.getDistanceSq(var1, var3, var5);
		} else
		{
			var7 = var0.localGetDistanceSq(var1, var3, var5);
		}

		return var7;
	}

	public double getDistanceSq(double var1, double var3, double var5)
	{
		if (this.beforeGetDistanceSqHooks != null)
		{
			for (int var7 = this.beforeGetDistanceSqHooks.length - 1; var7 >= 0; --var7)
			{
				this.beforeGetDistanceSqHooks[var7].beforeGetDistanceSq(var1, var3, var5);
			}
		}

		double var10;

		if (this.overrideGetDistanceSqHooks != null)
		{
			var10 = this.overrideGetDistanceSqHooks[this.overrideGetDistanceSqHooks.length - 1].getDistanceSq(var1, var3, var5);
		} else
		{
			var10 = this.player.localGetDistanceSq(var1, var3, var5);
		}

		if (this.afterGetDistanceSqHooks != null)
		{
			for (int var9 = 0; var9 < this.afterGetDistanceSqHooks.length; ++var9)
			{
				this.afterGetDistanceSqHooks[var9].afterGetDistanceSq(var1, var3, var5);
			}
		}

		return var10;
	}

	public PlayerBase GetOverwrittenGetDistanceSq(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideGetDistanceSqHooks.length; ++var2)
		{
			if (this.overrideGetDistanceSqHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideGetDistanceSqHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static double getDistanceSqToEntity(EntityPlayerSP var0, Entity var1)
	{
		double var2;

		if (var0.HAPI != null)
		{
			var2 = var0.HAPI.getDistanceSqToEntity(var1);
		} else
		{
			var2 = var0.localGetDistanceSqToEntity(var1);
		}

		return var2;
	}

	public double getDistanceSqToEntity(Entity var1)
	{
		if (this.beforeGetDistanceSqToEntityHooks != null)
		{
			for (int var2 = this.beforeGetDistanceSqToEntityHooks.length - 1; var2 >= 0; --var2)
			{
				this.beforeGetDistanceSqToEntityHooks[var2].beforeGetDistanceSqToEntity(var1);
			}
		}

		double var5;

		if (this.overrideGetDistanceSqToEntityHooks != null)
		{
			var5 = this.overrideGetDistanceSqToEntityHooks[this.overrideGetDistanceSqToEntityHooks.length - 1].getDistanceSqToEntity(var1);
		} else
		{
			var5 = this.player.localGetDistanceSqToEntity(var1);
		}

		if (this.afterGetDistanceSqToEntityHooks != null)
		{
			for (int var4 = 0; var4 < this.afterGetDistanceSqToEntityHooks.length; ++var4)
			{
				this.afterGetDistanceSqToEntityHooks[var4].afterGetDistanceSqToEntity(var1);
			}
		}

		return var5;
	}

	public PlayerBase GetOverwrittenGetDistanceSqToEntity(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideGetDistanceSqToEntityHooks.length; ++var2)
		{
			if (this.overrideGetDistanceSqToEntityHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideGetDistanceSqToEntityHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static float getFOVMultiplier(EntityPlayerSP var0)
	{
		float var1;

		if (var0.HAPI != null)
		{
			var1 = var0.HAPI.getFOVMultiplier();
		} else
		{
			var1 = var0.localGetFOVMultiplier();
		}

		return var1;
	}

	public float getFOVMultiplier()
	{
		if (this.beforeGetFOVMultiplierHooks != null)
		{
			for (int var1 = this.beforeGetFOVMultiplierHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeGetFOVMultiplierHooks[var1].beforeGetFOVMultiplier();
			}
		}

		float var3;

		if (this.overrideGetFOVMultiplierHooks != null)
		{
			var3 = this.overrideGetFOVMultiplierHooks[this.overrideGetFOVMultiplierHooks.length - 1].getFOVMultiplier();
		} else
		{
			var3 = this.player.localGetFOVMultiplier();
		}

		if (this.afterGetFOVMultiplierHooks != null)
		{
			for (int var2 = 0; var2 < this.afterGetFOVMultiplierHooks.length; ++var2)
			{
				this.afterGetFOVMultiplierHooks[var2].afterGetFOVMultiplier();
			}
		}

		return var3;
	}

	public PlayerBase GetOverwrittenGetFOVMultiplier(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideGetFOVMultiplierHooks.length; ++var2)
		{
			if (this.overrideGetFOVMultiplierHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideGetFOVMultiplierHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static String getHurtSound(EntityPlayerSP var0)
	{
		String var1;

		if (var0.HAPI != null)
		{
			var1 = var0.HAPI.getHurtSound();
		} else
		{
			var1 = var0.localGetHurtSound();
		}

		return var1;
	}

	public String getHurtSound()
	{
		if (this.beforeGetHurtSoundHooks != null)
		{
			for (int var1 = this.beforeGetHurtSoundHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeGetHurtSoundHooks[var1].beforeGetHurtSound();
			}
		}

		String var3;

		if (this.overrideGetHurtSoundHooks != null)
		{
			var3 = this.overrideGetHurtSoundHooks[this.overrideGetHurtSoundHooks.length - 1].getHurtSound();
		} else
		{
			var3 = this.player.localGetHurtSound();
		}

		if (this.afterGetHurtSoundHooks != null)
		{
			for (int var2 = 0; var2 < this.afterGetHurtSoundHooks.length; ++var2)
			{
				this.afterGetHurtSoundHooks[var2].afterGetHurtSound();
			}
		}

		return var3;
	}

	public PlayerBase GetOverwrittenGetHurtSound(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideGetHurtSoundHooks.length; ++var2)
		{
			if (this.overrideGetHurtSoundHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideGetHurtSoundHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static int getItemIcon(EntityPlayerSP var0, ItemStack var1, int var2)
	{
		int var3;

		if (var0.HAPI != null)
		{
			var3 = var0.HAPI.getItemIcon(var1, var2);
		} else
		{
			var3 = var0.localGetItemIcon(var1, var2);
		}

		return var3;
	}

	public int getItemIcon(ItemStack var1, int var2)
	{
		int var3;

		if (this.beforeGetItemIconHooks != null)
		{
			for (var3 = this.beforeGetItemIconHooks.length - 1; var3 >= 0; --var3)
			{
				this.beforeGetItemIconHooks[var3].beforeGetItemIcon(var1, var2);
			}
		}

		if (this.overrideGetItemIconHooks != null)
		{
			var3 = this.overrideGetItemIconHooks[this.overrideGetItemIconHooks.length - 1].getItemIcon(var1, var2);
		} else
		{
			var3 = this.player.localGetItemIcon(var1, var2);
		}

		if (this.afterGetItemIconHooks != null)
		{
			for (int var4 = 0; var4 < this.afterGetItemIconHooks.length; ++var4)
			{
				this.afterGetItemIconHooks[var4].afterGetItemIcon(var1, var2);
			}
		}

		return var3;
	}

	public PlayerBase GetOverwrittenGetItemIcon(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideGetItemIconHooks.length; ++var2)
		{
			if (this.overrideGetItemIconHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideGetItemIconHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static int getSleepTimer(EntityPlayerSP var0)
	{
		int var1;

		if (var0.HAPI != null)
		{
			var1 = var0.HAPI.getSleepTimer();
		} else
		{
			var1 = var0.localGetSleepTimer();
		}

		return var1;
	}

	public int getSleepTimer()
	{
		int var1;

		if (this.beforeGetSleepTimerHooks != null)
		{
			for (var1 = this.beforeGetSleepTimerHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeGetSleepTimerHooks[var1].beforeGetSleepTimer();
			}
		}

		if (this.overrideGetSleepTimerHooks != null)
		{
			var1 = this.overrideGetSleepTimerHooks[this.overrideGetSleepTimerHooks.length - 1].getSleepTimer();
		} else
		{
			var1 = this.player.localGetSleepTimer();
		}

		if (this.afterGetSleepTimerHooks != null)
		{
			for (int var2 = 0; var2 < this.afterGetSleepTimerHooks.length; ++var2)
			{
				this.afterGetSleepTimerHooks[var2].afterGetSleepTimer();
			}
		}

		return var1;
	}

	public PlayerBase GetOverwrittenGetSleepTimer(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideGetSleepTimerHooks.length; ++var2)
		{
			if (this.overrideGetSleepTimerHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideGetSleepTimerHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static float getSpeedModifier(EntityPlayerSP var0)
	{
		float var1;

		if (var0.HAPI != null)
		{
			var1 = var0.HAPI.getSpeedModifier();
		} else
		{
			var1 = var0.localGetSpeedModifier();
		}

		return var1;
	}

	public float getSpeedModifier()
	{
		if (this.beforeGetSpeedModifierHooks != null)
		{
			for (int var1 = this.beforeGetSpeedModifierHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeGetSpeedModifierHooks[var1].beforeGetSpeedModifier();
			}
		}

		float var3;

		if (this.overrideGetSpeedModifierHooks != null)
		{
			var3 = this.overrideGetSpeedModifierHooks[this.overrideGetSpeedModifierHooks.length - 1].getSpeedModifier();
		} else
		{
			var3 = this.player.localGetSpeedModifier();
		}

		if (this.afterGetSpeedModifierHooks != null)
		{
			for (int var2 = 0; var2 < this.afterGetSpeedModifierHooks.length; ++var2)
			{
				this.afterGetSpeedModifierHooks[var2].afterGetSpeedModifier();
			}
		}

		return var3;
	}

	public PlayerBase GetOverwrittenGetSpeedModifier(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideGetSpeedModifierHooks.length; ++var2)
		{
			if (this.overrideGetSpeedModifierHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideGetSpeedModifierHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static boolean handleLavaMovement(EntityPlayerSP var0)
	{
		boolean var1;

		if (var0.HAPI != null)
		{
			var1 = var0.HAPI.handleLavaMovement();
		} else
		{
			var1 = var0.localHandleLavaMovement();
		}

		return var1;
	}

	public boolean handleLavaMovement()
	{
		if (this.beforeHandleLavaMovementHooks != null)
		{
			for (int var1 = this.beforeHandleLavaMovementHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeHandleLavaMovementHooks[var1].beforeHandleLavaMovement();
			}
		}

		boolean var3;

		if (this.overrideHandleLavaMovementHooks != null)
		{
			var3 = this.overrideHandleLavaMovementHooks[this.overrideHandleLavaMovementHooks.length - 1].handleLavaMovement();
		} else
		{
			var3 = this.player.localHandleLavaMovement();
		}

		if (this.afterHandleLavaMovementHooks != null)
		{
			for (int var2 = 0; var2 < this.afterHandleLavaMovementHooks.length; ++var2)
			{
				this.afterHandleLavaMovementHooks[var2].afterHandleLavaMovement();
			}
		}

		return var3;
	}

	public PlayerBase GetOverwrittenHandleLavaMovement(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideHandleLavaMovementHooks.length; ++var2)
		{
			if (this.overrideHandleLavaMovementHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideHandleLavaMovementHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static boolean handleWaterMovement(EntityPlayerSP var0)
	{
		boolean var1;

		if (var0.HAPI != null)
		{
			var1 = var0.HAPI.handleWaterMovement();
		} else
		{
			var1 = var0.localHandleWaterMovement();
		}

		return var1;
	}

	public boolean handleWaterMovement()
	{
		if (this.beforeHandleWaterMovementHooks != null)
		{
			for (int var1 = this.beforeHandleWaterMovementHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeHandleWaterMovementHooks[var1].beforeHandleWaterMovement();
			}
		}

		boolean var3;

		if (this.overrideHandleWaterMovementHooks != null)
		{
			var3 = this.overrideHandleWaterMovementHooks[this.overrideHandleWaterMovementHooks.length - 1].handleWaterMovement();
		} else
		{
			var3 = this.player.localHandleWaterMovement();
		}

		if (this.afterHandleWaterMovementHooks != null)
		{
			for (int var2 = 0; var2 < this.afterHandleWaterMovementHooks.length; ++var2)
			{
				this.afterHandleWaterMovementHooks[var2].afterHandleWaterMovement();
			}
		}

		return var3;
	}

	public PlayerBase GetOverwrittenHandleWaterMovement(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideHandleWaterMovementHooks.length; ++var2)
		{
			if (this.overrideHandleWaterMovementHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideHandleWaterMovementHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void heal(EntityPlayerSP var0, int var1)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.heal(var1);
		} else
		{
			var0.localHeal(var1);
		}
	}

	public void heal(int var1)
	{
		int var2;

		if (this.beforeHealHooks != null)
		{
			for (var2 = this.beforeHealHooks.length - 1; var2 >= 0; --var2)
			{
				this.beforeHealHooks[var2].beforeHeal(var1);
			}
		}

		if (this.overrideHealHooks != null)
		{
			this.overrideHealHooks[this.overrideHealHooks.length - 1].heal(var1);
		} else
		{
			this.player.localHeal(var1);
		}

		if (this.afterHealHooks != null)
		{
			for (var2 = 0; var2 < this.afterHealHooks.length; ++var2)
			{
				this.afterHealHooks[var2].afterHeal(var1);
			}
		}
	}

	public PlayerBase GetOverwrittenHeal(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideHealHooks.length; ++var2)
		{
			if (this.overrideHealHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideHealHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static boolean isEntityInsideOpaqueBlock(EntityPlayerSP var0)
	{
		boolean var1;

		if (var0.HAPI != null)
		{
			var1 = var0.HAPI.isEntityInsideOpaqueBlock();
		} else
		{
			var1 = var0.localIsEntityInsideOpaqueBlock();
		}

		return var1;
	}

	public boolean isEntityInsideOpaqueBlock()
	{
		if (this.beforeIsEntityInsideOpaqueBlockHooks != null)
		{
			for (int var1 = this.beforeIsEntityInsideOpaqueBlockHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeIsEntityInsideOpaqueBlockHooks[var1].beforeIsEntityInsideOpaqueBlock();
			}
		}

		boolean var3;

		if (this.overrideIsEntityInsideOpaqueBlockHooks != null)
		{
			var3 = this.overrideIsEntityInsideOpaqueBlockHooks[this.overrideIsEntityInsideOpaqueBlockHooks.length - 1].isEntityInsideOpaqueBlock();
		} else
		{
			var3 = this.player.localIsEntityInsideOpaqueBlock();
		}

		if (this.afterIsEntityInsideOpaqueBlockHooks != null)
		{
			for (int var2 = 0; var2 < this.afterIsEntityInsideOpaqueBlockHooks.length; ++var2)
			{
				this.afterIsEntityInsideOpaqueBlockHooks[var2].afterIsEntityInsideOpaqueBlock();
			}
		}

		return var3;
	}

	public PlayerBase GetOverwrittenIsEntityInsideOpaqueBlock(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideIsEntityInsideOpaqueBlockHooks.length; ++var2)
		{
			if (this.overrideIsEntityInsideOpaqueBlockHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideIsEntityInsideOpaqueBlockHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static boolean isInWater(EntityPlayerSP var0)
	{
		boolean var1;

		if (var0.HAPI != null)
		{
			var1 = var0.HAPI.isInWater();
		} else
		{
			var1 = var0.localIsInWater();
		}

		return var1;
	}

	public boolean isInWater()
	{
		if (this.beforeIsInWaterHooks != null)
		{
			for (int var1 = this.beforeIsInWaterHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeIsInWaterHooks[var1].beforeIsInWater();
			}
		}

		boolean var3;

		if (this.overrideIsInWaterHooks != null)
		{
			var3 = this.overrideIsInWaterHooks[this.overrideIsInWaterHooks.length - 1].isInWater();
		} else
		{
			var3 = this.player.localIsInWater();
		}

		if (this.afterIsInWaterHooks != null)
		{
			for (int var2 = 0; var2 < this.afterIsInWaterHooks.length; ++var2)
			{
				this.afterIsInWaterHooks[var2].afterIsInWater();
			}
		}

		return var3;
	}

	public PlayerBase GetOverwrittenIsInWater(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideIsInWaterHooks.length; ++var2)
		{
			if (this.overrideIsInWaterHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideIsInWaterHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static boolean isInsideOfMaterial(EntityPlayerSP var0, Material var1)
	{
		boolean var2;

		if (var0.HAPI != null)
		{
			var2 = var0.HAPI.isInsideOfMaterial(var1);
		} else
		{
			var2 = var0.localIsInsideOfMaterial(var1);
		}

		return var2;
	}

	public boolean isInsideOfMaterial(Material var1)
	{
		if (this.beforeIsInsideOfMaterialHooks != null)
		{
			for (int var2 = this.beforeIsInsideOfMaterialHooks.length - 1; var2 >= 0; --var2)
			{
				this.beforeIsInsideOfMaterialHooks[var2].beforeIsInsideOfMaterial(var1);
			}
		}

		boolean var4;

		if (this.overrideIsInsideOfMaterialHooks != null)
		{
			var4 = this.overrideIsInsideOfMaterialHooks[this.overrideIsInsideOfMaterialHooks.length - 1].isInsideOfMaterial(var1);
		} else
		{
			var4 = this.player.localIsInsideOfMaterial(var1);
		}

		if (this.afterIsInsideOfMaterialHooks != null)
		{
			for (int var3 = 0; var3 < this.afterIsInsideOfMaterialHooks.length; ++var3)
			{
				this.afterIsInsideOfMaterialHooks[var3].afterIsInsideOfMaterial(var1);
			}
		}

		return var4;
	}

	public PlayerBase GetOverwrittenIsInsideOfMaterial(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideIsInsideOfMaterialHooks.length; ++var2)
		{
			if (this.overrideIsInsideOfMaterialHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideIsInsideOfMaterialHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static boolean isOnLadder(EntityPlayerSP var0)
	{
		boolean var1;

		if (var0.HAPI != null)
		{
			var1 = var0.HAPI.isOnLadder();
		} else
		{
			var1 = var0.localIsOnLadder();
		}

		return var1;
	}

	public boolean isOnLadder()
	{
		if (this.beforeIsOnLadderHooks != null)
		{
			for (int var1 = this.beforeIsOnLadderHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeIsOnLadderHooks[var1].beforeIsOnLadder();
			}
		}

		boolean var3;

		if (this.overrideIsOnLadderHooks != null)
		{
			var3 = this.overrideIsOnLadderHooks[this.overrideIsOnLadderHooks.length - 1].isOnLadder();
		} else
		{
			var3 = this.player.localIsOnLadder();
		}

		if (this.afterIsOnLadderHooks != null)
		{
			for (int var2 = 0; var2 < this.afterIsOnLadderHooks.length; ++var2)
			{
				this.afterIsOnLadderHooks[var2].afterIsOnLadder();
			}
		}

		return var3;
	}

	public PlayerBase GetOverwrittenIsOnLadder(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideIsOnLadderHooks.length; ++var2)
		{
			if (this.overrideIsOnLadderHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideIsOnLadderHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static boolean isSneaking(EntityPlayerSP var0)
	{
		boolean var1;

		if (var0.HAPI != null)
		{
			var1 = var0.HAPI.isSneaking();
		} else
		{
			var1 = var0.localIsSneaking();
		}

		return var1;
	}

	public boolean isSneaking()
	{
		if (this.beforeIsSneakingHooks != null)
		{
			for (int var1 = this.beforeIsSneakingHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeIsSneakingHooks[var1].beforeIsSneaking();
			}
		}

		boolean var3;

		if (this.overrideIsSneakingHooks != null)
		{
			var3 = this.overrideIsSneakingHooks[this.overrideIsSneakingHooks.length - 1].isSneaking();
		} else
		{
			var3 = this.player.localIsSneaking();
		}

		if (this.afterIsSneakingHooks != null)
		{
			for (int var2 = 0; var2 < this.afterIsSneakingHooks.length; ++var2)
			{
				this.afterIsSneakingHooks[var2].afterIsSneaking();
			}
		}

		return var3;
	}

	public PlayerBase GetOverwrittenIsSneaking(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideIsSneakingHooks.length; ++var2)
		{
			if (this.overrideIsSneakingHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideIsSneakingHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static boolean isSprinting(EntityPlayerSP var0)
	{
		boolean var1;

		if (var0.HAPI != null)
		{
			var1 = var0.HAPI.isSprinting();
		} else
		{
			var1 = var0.localIsSprinting();
		}

		return var1;
	}

	public boolean isSprinting()
	{
		if (this.beforeIsSprintingHooks != null)
		{
			for (int var1 = this.beforeIsSprintingHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeIsSprintingHooks[var1].beforeIsSprinting();
			}
		}

		boolean var3;

		if (this.overrideIsSprintingHooks != null)
		{
			var3 = this.overrideIsSprintingHooks[this.overrideIsSprintingHooks.length - 1].isSprinting();
		} else
		{
			var3 = this.player.localIsSprinting();
		}

		if (this.afterIsSprintingHooks != null)
		{
			for (int var2 = 0; var2 < this.afterIsSprintingHooks.length; ++var2)
			{
				this.afterIsSprintingHooks[var2].afterIsSprinting();
			}
		}

		return var3;
	}

	public PlayerBase GetOverwrittenIsSprinting(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideIsSprintingHooks.length; ++var2)
		{
			if (this.overrideIsSprintingHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideIsSprintingHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void jump(EntityPlayerSP var0)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.jump();
		} else
		{
			var0.localJump();
		}
	}

	public void jump()
	{
		int var1;

		if (this.beforeJumpHooks != null)
		{
			for (var1 = this.beforeJumpHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeJumpHooks[var1].beforeJump();
			}
		}

		if (this.overrideJumpHooks != null)
		{
			this.overrideJumpHooks[this.overrideJumpHooks.length - 1].jump();
		} else
		{
			this.player.localJump();
		}

		if (this.afterJumpHooks != null)
		{
			for (var1 = 0; var1 < this.afterJumpHooks.length; ++var1)
			{
				this.afterJumpHooks[var1].afterJump();
			}
		}
	}

	public PlayerBase GetOverwrittenJump(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideJumpHooks.length; ++var2)
		{
			if (this.overrideJumpHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideJumpHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void knockBack(EntityPlayerSP var0, Entity var1, int var2, double var3, double var5)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.knockBack(var1, var2, var3, var5);
		} else
		{
			var0.localKnockBack(var1, var2, var3, var5);
		}
	}

	public void knockBack(Entity var1, int var2, double var3, double var5)
	{
		int var7;

		if (this.beforeKnockBackHooks != null)
		{
			for (var7 = this.beforeKnockBackHooks.length - 1; var7 >= 0; --var7)
			{
				this.beforeKnockBackHooks[var7].beforeKnockBack(var1, var2, var3, var5);
			}
		}

		if (this.overrideKnockBackHooks != null)
		{
			this.overrideKnockBackHooks[this.overrideKnockBackHooks.length - 1].knockBack(var1, var2, var3, var5);
		} else
		{
			this.player.localKnockBack(var1, var2, var3, var5);
		}

		if (this.afterKnockBackHooks != null)
		{
			for (var7 = 0; var7 < this.afterKnockBackHooks.length; ++var7)
			{
				this.afterKnockBackHooks[var7].afterKnockBack(var1, var2, var3, var5);
			}
		}
	}

	public PlayerBase GetOverwrittenKnockBack(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideKnockBackHooks.length; ++var2)
		{
			if (this.overrideKnockBackHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideKnockBackHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void moveEntity(EntityPlayerSP var0, double var1, double var3, double var5)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.moveEntity(var1, var3, var5);
		} else
		{
			var0.localMoveEntity(var1, var3, var5);
		}
	}

	public void moveEntity(double var1, double var3, double var5)
	{
		int var7;

		if (this.beforeMoveEntityHooks != null)
		{
			for (var7 = this.beforeMoveEntityHooks.length - 1; var7 >= 0; --var7)
			{
				this.beforeMoveEntityHooks[var7].beforeMoveEntity(var1, var3, var5);
			}
		}

		if (this.overrideMoveEntityHooks != null)
		{
			this.overrideMoveEntityHooks[this.overrideMoveEntityHooks.length - 1].moveEntity(var1, var3, var5);
		} else
		{
			this.player.localMoveEntity(var1, var3, var5);
		}

		if (this.afterMoveEntityHooks != null)
		{
			for (var7 = 0; var7 < this.afterMoveEntityHooks.length; ++var7)
			{
				this.afterMoveEntityHooks[var7].afterMoveEntity(var1, var3, var5);
			}
		}
	}

	public PlayerBase GetOverwrittenMoveEntity(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideMoveEntityHooks.length; ++var2)
		{
			if (this.overrideMoveEntityHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideMoveEntityHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void moveEntityWithHeading(EntityPlayerSP var0, float var1, float var2)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.moveEntityWithHeading(var1, var2);
		} else
		{
			var0.localMoveEntityWithHeading(var1, var2);
		}
	}

	public void moveEntityWithHeading(float var1, float var2)
	{
		int var3;

		if (this.beforeMoveEntityWithHeadingHooks != null)
		{
			for (var3 = this.beforeMoveEntityWithHeadingHooks.length - 1; var3 >= 0; --var3)
			{
				this.beforeMoveEntityWithHeadingHooks[var3].beforeMoveEntityWithHeading(var1, var2);
			}
		}

		if (this.overrideMoveEntityWithHeadingHooks != null)
		{
			this.overrideMoveEntityWithHeadingHooks[this.overrideMoveEntityWithHeadingHooks.length - 1].moveEntityWithHeading(var1, var2);
		} else
		{
			this.player.localMoveEntityWithHeading(var1, var2);
		}

		if (this.afterMoveEntityWithHeadingHooks != null)
		{
			for (var3 = 0; var3 < this.afterMoveEntityWithHeadingHooks.length; ++var3)
			{
				this.afterMoveEntityWithHeadingHooks[var3].afterMoveEntityWithHeading(var1, var2);
			}
		}
	}

	public PlayerBase GetOverwrittenMoveEntityWithHeading(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideMoveEntityWithHeadingHooks.length; ++var2)
		{
			if (this.overrideMoveEntityWithHeadingHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideMoveEntityWithHeadingHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void moveFlying(EntityPlayerSP var0, float var1, float var2, float var3)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.moveFlying(var1, var2, var3);
		} else
		{
			var0.localMoveFlying(var1, var2, var3);
		}
	}

	public void moveFlying(float var1, float var2, float var3)
	{
		int var4;

		if (this.beforeMoveFlyingHooks != null)
		{
			for (var4 = this.beforeMoveFlyingHooks.length - 1; var4 >= 0; --var4)
			{
				this.beforeMoveFlyingHooks[var4].beforeMoveFlying(var1, var2, var3);
			}
		}

		if (this.overrideMoveFlyingHooks != null)
		{
			this.overrideMoveFlyingHooks[this.overrideMoveFlyingHooks.length - 1].moveFlying(var1, var2, var3);
		} else
		{
			this.player.localMoveFlying(var1, var2, var3);
		}

		if (this.afterMoveFlyingHooks != null)
		{
			for (var4 = 0; var4 < this.afterMoveFlyingHooks.length; ++var4)
			{
				this.afterMoveFlyingHooks[var4].afterMoveFlying(var1, var2, var3);
			}
		}
	}

	public PlayerBase GetOverwrittenMoveFlying(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideMoveFlyingHooks.length; ++var2)
		{
			if (this.overrideMoveFlyingHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideMoveFlyingHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void onDeath(EntityPlayerSP var0, DamageSource var1)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.onDeath(var1);
		} else
		{
			var0.localOnDeath(var1);
		}
	}

	public void onDeath(DamageSource var1)
	{
		int var2;

		if (this.beforeOnDeathHooks != null)
		{
			for (var2 = this.beforeOnDeathHooks.length - 1; var2 >= 0; --var2)
			{
				this.beforeOnDeathHooks[var2].beforeOnDeath(var1);
			}
		}

		if (this.overrideOnDeathHooks != null)
		{
			this.overrideOnDeathHooks[this.overrideOnDeathHooks.length - 1].onDeath(var1);
		} else
		{
			this.player.localOnDeath(var1);
		}

		if (this.afterOnDeathHooks != null)
		{
			for (var2 = 0; var2 < this.afterOnDeathHooks.length; ++var2)
			{
				this.afterOnDeathHooks[var2].afterOnDeath(var1);
			}
		}
	}

	public PlayerBase GetOverwrittenOnDeath(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideOnDeathHooks.length; ++var2)
		{
			if (this.overrideOnDeathHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideOnDeathHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void onLivingUpdate(EntityPlayerSP var0)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.onLivingUpdate();
		} else
		{
			var0.localOnLivingUpdate();
		}
	}

	public void onLivingUpdate()
	{
		int var1;

		if (this.beforeOnLivingUpdateHooks != null)
		{
			for (var1 = this.beforeOnLivingUpdateHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeOnLivingUpdateHooks[var1].beforeOnLivingUpdate();
			}
		}

		if (this.overrideOnLivingUpdateHooks != null)
		{
			this.overrideOnLivingUpdateHooks[this.overrideOnLivingUpdateHooks.length - 1].onLivingUpdate();
		} else
		{
			this.player.localOnLivingUpdate();
		}

		if (this.afterOnLivingUpdateHooks != null)
		{
			for (var1 = 0; var1 < this.afterOnLivingUpdateHooks.length; ++var1)
			{
				this.afterOnLivingUpdateHooks[var1].afterOnLivingUpdate();
			}
		}
	}

	public PlayerBase GetOverwrittenOnLivingUpdate(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideOnLivingUpdateHooks.length; ++var2)
		{
			if (this.overrideOnLivingUpdateHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideOnLivingUpdateHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void onKillEntity(EntityPlayerSP var0, EntityLiving var1)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.onKillEntity(var1);
		} else
		{
			var0.localOnKillEntity(var1);
		}
	}

	public void onKillEntity(EntityLiving var1)
	{
		int var2;

		if (this.beforeOnKillEntityHooks != null)
		{
			for (var2 = this.beforeOnKillEntityHooks.length - 1; var2 >= 0; --var2)
			{
				this.beforeOnKillEntityHooks[var2].beforeOnKillEntity(var1);
			}
		}

		if (this.overrideOnKillEntityHooks != null)
		{
			this.overrideOnKillEntityHooks[this.overrideOnKillEntityHooks.length - 1].onKillEntity(var1);
		} else
		{
			this.player.localOnKillEntity(var1);
		}

		if (this.afterOnKillEntityHooks != null)
		{
			for (var2 = 0; var2 < this.afterOnKillEntityHooks.length; ++var2)
			{
				this.afterOnKillEntityHooks[var2].afterOnKillEntity(var1);
			}
		}
	}

	public PlayerBase GetOverwrittenOnKillEntity(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideOnKillEntityHooks.length; ++var2)
		{
			if (this.overrideOnKillEntityHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideOnKillEntityHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void onUpdate(EntityPlayerSP var0)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.onUpdate();
		} else
		{
			var0.localOnUpdate();
		}
	}

	public void onUpdate()
	{
		int var1;

		if (this.beforeOnUpdateHooks != null)
		{
			for (var1 = this.beforeOnUpdateHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeOnUpdateHooks[var1].beforeOnUpdate();
			}
		}

		if (this.overrideOnUpdateHooks != null)
		{
			this.overrideOnUpdateHooks[this.overrideOnUpdateHooks.length - 1].onUpdate();
		} else
		{
			this.player.localOnUpdate();
		}

		if (this.afterOnUpdateHooks != null)
		{
			for (var1 = 0; var1 < this.afterOnUpdateHooks.length; ++var1)
			{
				this.afterOnUpdateHooks[var1].afterOnUpdate();
			}
		}
	}

	public PlayerBase GetOverwrittenOnUpdate(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideOnUpdateHooks.length; ++var2)
		{
			if (this.overrideOnUpdateHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideOnUpdateHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void playStepSound(EntityPlayerSP var0, int var1, int var2, int var3, int var4)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.playStepSound(var1, var2, var3, var4);
		} else
		{
			var0.localPlayStepSound(var1, var2, var3, var4);
		}
	}

	public void playStepSound(int var1, int var2, int var3, int var4)
	{
		int var5;

		if (this.beforePlayStepSoundHooks != null)
		{
			for (var5 = this.beforePlayStepSoundHooks.length - 1; var5 >= 0; --var5)
			{
				this.beforePlayStepSoundHooks[var5].beforePlayStepSound(var1, var2, var3, var4);
			}
		}

		if (this.overridePlayStepSoundHooks != null)
		{
			this.overridePlayStepSoundHooks[this.overridePlayStepSoundHooks.length - 1].playStepSound(var1, var2, var3, var4);
		} else
		{
			this.player.localPlayStepSound(var1, var2, var3, var4);
		}

		if (this.afterPlayStepSoundHooks != null)
		{
			for (var5 = 0; var5 < this.afterPlayStepSoundHooks.length; ++var5)
			{
				this.afterPlayStepSoundHooks[var5].afterPlayStepSound(var1, var2, var3, var4);
			}
		}
	}

	public PlayerBase GetOverwrittenPlayStepSound(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overridePlayStepSoundHooks.length; ++var2)
		{
			if (this.overridePlayStepSoundHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overridePlayStepSoundHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static boolean pushOutOfBlocks(EntityPlayerSP var0, double var1, double var3, double var5)
	{
		boolean var7;

		if (var0.HAPI != null)
		{
			var7 = var0.HAPI.pushOutOfBlocks(var1, var3, var5);
		} else
		{
			var7 = var0.localPushOutOfBlocks(var1, var3, var5);
		}

		return var7;
	}

	public boolean pushOutOfBlocks(double var1, double var3, double var5)
	{
		if (this.beforePushOutOfBlocksHooks != null)
		{
			for (int var7 = this.beforePushOutOfBlocksHooks.length - 1; var7 >= 0; --var7)
			{
				this.beforePushOutOfBlocksHooks[var7].beforePushOutOfBlocks(var1, var3, var5);
			}
		}

		boolean var9;

		if (this.overridePushOutOfBlocksHooks != null)
		{
			var9 = this.overridePushOutOfBlocksHooks[this.overridePushOutOfBlocksHooks.length - 1].pushOutOfBlocks(var1, var3, var5);
		} else
		{
			var9 = this.player.localPushOutOfBlocks(var1, var3, var5);
		}

		if (this.afterPushOutOfBlocksHooks != null)
		{
			for (int var8 = 0; var8 < this.afterPushOutOfBlocksHooks.length; ++var8)
			{
				this.afterPushOutOfBlocksHooks[var8].afterPushOutOfBlocks(var1, var3, var5);
			}
		}

		return var9;
	}

	public PlayerBase GetOverwrittenPushOutOfBlocks(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overridePushOutOfBlocksHooks.length; ++var2)
		{
			if (this.overridePushOutOfBlocksHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overridePushOutOfBlocksHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static MovingObjectPosition rayTrace(EntityPlayerSP var0, double var1, float var3)
	{
		MovingObjectPosition var4;

		if (var0.HAPI != null)
		{
			var4 = var0.HAPI.rayTrace(var1, var3);
		} else
		{
			var4 = var0.localRayTrace(var1, var3);
		}

		return var4;
	}

	public MovingObjectPosition rayTrace(double var1, float var3)
	{
		if (this.beforeRayTraceHooks != null)
		{
			for (int var4 = this.beforeRayTraceHooks.length - 1; var4 >= 0; --var4)
			{
				this.beforeRayTraceHooks[var4].beforeRayTrace(var1, var3);
			}
		}

		MovingObjectPosition var6;

		if (this.overrideRayTraceHooks != null)
		{
			var6 = this.overrideRayTraceHooks[this.overrideRayTraceHooks.length - 1].rayTrace(var1, var3);
		} else
		{
			var6 = this.player.localRayTrace(var1, var3);
		}

		if (this.afterRayTraceHooks != null)
		{
			for (int var5 = 0; var5 < this.afterRayTraceHooks.length; ++var5)
			{
				this.afterRayTraceHooks[var5].afterRayTrace(var1, var3);
			}
		}

		return var6;
	}

	public PlayerBase GetOverwrittenRayTrace(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideRayTraceHooks.length; ++var2)
		{
			if (this.overrideRayTraceHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideRayTraceHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void readEntityFromNBT(EntityPlayerSP var0, NBTTagCompound var1)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.readEntityFromNBT(var1);
		} else
		{
			var0.localReadEntityFromNBT(var1);
		}
	}

	public void readEntityFromNBT(NBTTagCompound var1)
	{
		int var2;

		if (this.beforeReadEntityFromNBTHooks != null)
		{
			for (var2 = this.beforeReadEntityFromNBTHooks.length - 1; var2 >= 0; --var2)
			{
				this.beforeReadEntityFromNBTHooks[var2].beforeReadEntityFromNBT(var1);
			}
		}

		if (this.overrideReadEntityFromNBTHooks != null)
		{
			this.overrideReadEntityFromNBTHooks[this.overrideReadEntityFromNBTHooks.length - 1].readEntityFromNBT(var1);
		} else
		{
			this.player.localReadEntityFromNBT(var1);
		}

		if (this.afterReadEntityFromNBTHooks != null)
		{
			for (var2 = 0; var2 < this.afterReadEntityFromNBTHooks.length; ++var2)
			{
				this.afterReadEntityFromNBTHooks[var2].afterReadEntityFromNBT(var1);
			}
		}
	}

	public PlayerBase GetOverwrittenReadEntityFromNBT(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideReadEntityFromNBTHooks.length; ++var2)
		{
			if (this.overrideReadEntityFromNBTHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideReadEntityFromNBTHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void respawnPlayer(EntityPlayerSP var0)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.respawnPlayer();
		} else
		{
			var0.localRespawnPlayer();
		}
	}

	public void respawnPlayer()
	{
		int var1;

		if (this.beforeRespawnPlayerHooks != null)
		{
			for (var1 = this.beforeRespawnPlayerHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeRespawnPlayerHooks[var1].beforeRespawnPlayer();
			}
		}

		if (this.overrideRespawnPlayerHooks != null)
		{
			this.overrideRespawnPlayerHooks[this.overrideRespawnPlayerHooks.length - 1].respawnPlayer();
		} else
		{
			this.player.localRespawnPlayer();
		}

		if (this.afterRespawnPlayerHooks != null)
		{
			for (var1 = 0; var1 < this.afterRespawnPlayerHooks.length; ++var1)
			{
				this.afterRespawnPlayerHooks[var1].afterRespawnPlayer();
			}
		}
	}

	public PlayerBase GetOverwrittenRespawnPlayer(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideRespawnPlayerHooks.length; ++var2)
		{
			if (this.overrideRespawnPlayerHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideRespawnPlayerHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void setDead(EntityPlayerSP var0)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.setDead();
		} else
		{
			var0.localSetDead();
		}
	}

	public void setDead()
	{
		int var1;

		if (this.beforeSetDeadHooks != null)
		{
			for (var1 = this.beforeSetDeadHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeSetDeadHooks[var1].beforeSetDead();
			}
		}

		if (this.overrideSetDeadHooks != null)
		{
			this.overrideSetDeadHooks[this.overrideSetDeadHooks.length - 1].setDead();
		} else
		{
			this.player.localSetDead();
		}

		if (this.afterSetDeadHooks != null)
		{
			for (var1 = 0; var1 < this.afterSetDeadHooks.length; ++var1)
			{
				this.afterSetDeadHooks[var1].afterSetDead();
			}
		}
	}

	public PlayerBase GetOverwrittenSetDead(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideSetDeadHooks.length; ++var2)
		{
			if (this.overrideSetDeadHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideSetDeadHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void setPositionAndRotation(EntityPlayerSP var0, double var1, double var3, double var5, float var7, float var8)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.setPositionAndRotation(var1, var3, var5, var7, var8);
		} else
		{
			var0.localSetPositionAndRotation(var1, var3, var5, var7, var8);
		}
	}

	public void setPositionAndRotation(double var1, double var3, double var5, float var7, float var8)
	{
		int var9;

		if (this.beforeSetPositionAndRotationHooks != null)
		{
			for (var9 = this.beforeSetPositionAndRotationHooks.length - 1; var9 >= 0; --var9)
			{
				this.beforeSetPositionAndRotationHooks[var9].beforeSetPositionAndRotation(var1, var3, var5, var7, var8);
			}
		}

		if (this.overrideSetPositionAndRotationHooks != null)
		{
			this.overrideSetPositionAndRotationHooks[this.overrideSetPositionAndRotationHooks.length - 1].setPositionAndRotation(var1, var3, var5, var7, var8);
		} else
		{
			this.player.localSetPositionAndRotation(var1, var3, var5, var7, var8);
		}

		if (this.afterSetPositionAndRotationHooks != null)
		{
			for (var9 = 0; var9 < this.afterSetPositionAndRotationHooks.length; ++var9)
			{
				this.afterSetPositionAndRotationHooks[var9].afterSetPositionAndRotation(var1, var3, var5, var7, var8);
			}
		}
	}

	public PlayerBase GetOverwrittenSetPositionAndRotation(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideSetPositionAndRotationHooks.length; ++var2)
		{
			if (this.overrideSetPositionAndRotationHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideSetPositionAndRotationHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static EnumStatus sleepInBedAt(EntityPlayerSP var0, int var1, int var2, int var3)
	{
		EnumStatus var4;

		if (var0.HAPI != null)
		{
			var4 = var0.HAPI.sleepInBedAt(var1, var2, var3);
		} else
		{
			var4 = var0.localSleepInBedAt(var1, var2, var3);
		}

		return var4;
	}

	public EnumStatus sleepInBedAt(int var1, int var2, int var3)
	{
		if (this.beforeSleepInBedAtHooks != null)
		{
			for (int var4 = this.beforeSleepInBedAtHooks.length - 1; var4 >= 0; --var4)
			{
				this.beforeSleepInBedAtHooks[var4].beforeSleepInBedAt(var1, var2, var3);
			}
		}

		EnumStatus var6;

		if (this.overrideSleepInBedAtHooks != null)
		{
			var6 = this.overrideSleepInBedAtHooks[this.overrideSleepInBedAtHooks.length - 1].sleepInBedAt(var1, var2, var3);
		} else
		{
			var6 = this.player.localSleepInBedAt(var1, var2, var3);
		}

		if (this.afterSleepInBedAtHooks != null)
		{
			for (int var5 = 0; var5 < this.afterSleepInBedAtHooks.length; ++var5)
			{
				this.afterSleepInBedAtHooks[var5].afterSleepInBedAt(var1, var2, var3);
			}
		}

		return var6;
	}

	public PlayerBase GetOverwrittenSleepInBedAt(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideSleepInBedAtHooks.length; ++var2)
		{
			if (this.overrideSleepInBedAtHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideSleepInBedAtHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void swingItem(EntityPlayerSP var0)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.swingItem();
		} else
		{
			var0.localSwingItem();
		}
	}

	public void swingItem()
	{
		int var1;

		if (this.beforeSwingItemHooks != null)
		{
			for (var1 = this.beforeSwingItemHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeSwingItemHooks[var1].beforeSwingItem();
			}
		}

		if (this.overrideSwingItemHooks != null)
		{
			this.overrideSwingItemHooks[this.overrideSwingItemHooks.length - 1].swingItem();
		} else
		{
			this.player.localSwingItem();
		}

		if (this.afterSwingItemHooks != null)
		{
			for (var1 = 0; var1 < this.afterSwingItemHooks.length; ++var1)
			{
				this.afterSwingItemHooks[var1].afterSwingItem();
			}
		}
	}

	public PlayerBase GetOverwrittenSwingItem(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideSwingItemHooks.length; ++var2)
		{
			if (this.overrideSwingItemHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideSwingItemHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void updateEntityActionState(EntityPlayerSP var0)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.updateEntityActionState();
		} else
		{
			var0.localUpdateEntityActionState();
		}
	}

	public void updateEntityActionState()
	{
		int var1;

		if (this.beforeUpdateEntityActionStateHooks != null)
		{
			for (var1 = this.beforeUpdateEntityActionStateHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeUpdateEntityActionStateHooks[var1].beforeUpdateEntityActionState();
			}
		}

		if (this.overrideUpdateEntityActionStateHooks != null)
		{
			this.overrideUpdateEntityActionStateHooks[this.overrideUpdateEntityActionStateHooks.length - 1].updateEntityActionState();
		} else
		{
			this.player.localUpdateEntityActionState();
		}

		if (this.afterUpdateEntityActionStateHooks != null)
		{
			for (var1 = 0; var1 < this.afterUpdateEntityActionStateHooks.length; ++var1)
			{
				this.afterUpdateEntityActionStateHooks[var1].afterUpdateEntityActionState();
			}
		}
	}

	public PlayerBase GetOverwrittenUpdateEntityActionState(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideUpdateEntityActionStateHooks.length; ++var2)
		{
			if (this.overrideUpdateEntityActionStateHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideUpdateEntityActionStateHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void writeEntityToNBT(EntityPlayerSP var0, NBTTagCompound var1)
	{
		if (var0.HAPI != null)
		{
			var0.HAPI.writeEntityToNBT(var1);
		} else
		{
			var0.localWriteEntityToNBT(var1);
		}
	}

	public void writeEntityToNBT(NBTTagCompound var1)
	{
		int var2;

		if (this.beforeWriteEntityToNBTHooks != null)
		{
			for (var2 = this.beforeWriteEntityToNBTHooks.length - 1; var2 >= 0; --var2)
			{
				this.beforeWriteEntityToNBTHooks[var2].beforeWriteEntityToNBT(var1);
			}
		}

		if (this.overrideWriteEntityToNBTHooks != null)
		{
			this.overrideWriteEntityToNBTHooks[this.overrideWriteEntityToNBTHooks.length - 1].writeEntityToNBT(var1);
		} else
		{
			this.player.localWriteEntityToNBT(var1);
		}

		if (this.afterWriteEntityToNBTHooks != null)
		{
			for (var2 = 0; var2 < this.afterWriteEntityToNBTHooks.length; ++var2)
			{
				this.afterWriteEntityToNBTHooks[var2].afterWriteEntityToNBT(var1);
			}
		}
	}

	public PlayerBase GetOverwrittenWriteEntityToNBT(PlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideWriteEntityToNBTHooks.length; ++var2)
		{
			if (this.overrideWriteEntityToNBTHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideWriteEntityToNBTHooks[var2 - 1];
			}
		}

		return var1;
	}
}