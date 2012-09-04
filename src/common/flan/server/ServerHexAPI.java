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
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.*;

public final class ServerHexAPI
{
	private static final Class[] Class = new Class[]
	{ ServerHexAPI.class };
	private static final Class[] Classes = new Class[]
	{ ServerHexAPI.class, String.class };
	private static boolean isCreated;
	private static final Logger logger = Logger.getLogger("ServerHexAPI");
	private static final List beforeAttackEntityFromHookTypes = new LinkedList();
	private static final List overrideAttackEntityFromHookTypes = new LinkedList();
	private static final List afterAttackEntityFromHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeAttackEntityFromHooks;
	private final ServerPlayerBase[] overrideAttackEntityFromHooks;
	private final ServerPlayerBase[] afterAttackEntityFromHooks;
	public final boolean isAttackEntityFromModded;
	private static final List beforeAttackTargetEntityWithCurrentItemHookTypes = new LinkedList();
	private static final List overrideAttackTargetEntityWithCurrentItemHookTypes = new LinkedList();
	private static final List afterAttackTargetEntityWithCurrentItemHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeAttackTargetEntityWithCurrentItemHooks;
	private final ServerPlayerBase[] overrideAttackTargetEntityWithCurrentItemHooks;
	private final ServerPlayerBase[] afterAttackTargetEntityWithCurrentItemHooks;
	public final boolean isAttackTargetEntityWithCurrentItemModded;
	private static final List beforeCanHarvestBlockHookTypes = new LinkedList();
	private static final List overrideCanHarvestBlockHookTypes = new LinkedList();
	private static final List afterCanHarvestBlockHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeCanHarvestBlockHooks;
	private final ServerPlayerBase[] overrideCanHarvestBlockHooks;
	private final ServerPlayerBase[] afterCanHarvestBlockHooks;
	public final boolean isCanHarvestBlockModded;
	private static final List beforeCanPlayerEditHookTypes = new LinkedList();
	private static final List overrideCanPlayerEditHookTypes = new LinkedList();
	private static final List afterCanPlayerEditHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeCanPlayerEditHooks;
	private final ServerPlayerBase[] overrideCanPlayerEditHooks;
	private final ServerPlayerBase[] afterCanPlayerEditHooks;
	public final boolean isCanPlayerEditModded;
	private static final List beforeCanTriggerWalkingHookTypes = new LinkedList();
	private static final List overrideCanTriggerWalkingHookTypes = new LinkedList();
	private static final List afterCanTriggerWalkingHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeCanTriggerWalkingHooks;
	private final ServerPlayerBase[] overrideCanTriggerWalkingHooks;
	private final ServerPlayerBase[] afterCanTriggerWalkingHooks;
	public final boolean isCanTriggerWalkingModded;
	private static final List beforeDamageEntityHookTypes = new LinkedList();
	private static final List overrideDamageEntityHookTypes = new LinkedList();
	private static final List afterDamageEntityHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeDamageEntityHooks;
	private final ServerPlayerBase[] overrideDamageEntityHooks;
	private final ServerPlayerBase[] afterDamageEntityHooks;
	public final boolean isDamageEntityModded;
	private static final List beforeDisplayGUIChestHookTypes = new LinkedList();
	private static final List overrideDisplayGUIChestHookTypes = new LinkedList();
	private static final List afterDisplayGUIChestHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeDisplayGUIChestHooks;
	private final ServerPlayerBase[] overrideDisplayGUIChestHooks;
	private final ServerPlayerBase[] afterDisplayGUIChestHooks;
	public final boolean isDisplayGUIChestModded;
	private static final List beforeDisplayGUIDispenserHookTypes = new LinkedList();
	private static final List overrideDisplayGUIDispenserHookTypes = new LinkedList();
	private static final List afterDisplayGUIDispenserHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeDisplayGUIDispenserHooks;
	private final ServerPlayerBase[] overrideDisplayGUIDispenserHooks;
	private final ServerPlayerBase[] afterDisplayGUIDispenserHooks;
	public final boolean isDisplayGUIDispenserModded;
	private static final List beforeDisplayGUIFurnaceHookTypes = new LinkedList();
	private static final List overrideDisplayGUIFurnaceHookTypes = new LinkedList();
	private static final List afterDisplayGUIFurnaceHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeDisplayGUIFurnaceHooks;
	private final ServerPlayerBase[] overrideDisplayGUIFurnaceHooks;
	private final ServerPlayerBase[] afterDisplayGUIFurnaceHooks;
	public final boolean isDisplayGUIFurnaceModded;
	private static final List beforeDisplayWorkbenchGUIHookTypes = new LinkedList();
	private static final List overrideDisplayWorkbenchGUIHookTypes = new LinkedList();
	private static final List afterDisplayWorkbenchGUIHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeDisplayWorkbenchGUIHooks;
	private final ServerPlayerBase[] overrideDisplayWorkbenchGUIHooks;
	private final ServerPlayerBase[] afterDisplayWorkbenchGUIHooks;
	public final boolean isDisplayWorkbenchGUIModded;
	private static final List beforeDropOneItemHookTypes = new LinkedList();
	private static final List overrideDropOneItemHookTypes = new LinkedList();
	private static final List afterDropOneItemHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeDropOneItemHooks;
	private final ServerPlayerBase[] overrideDropOneItemHooks;
	private final ServerPlayerBase[] afterDropOneItemHooks;
	public final boolean isDropOneItemModded;
	private static final List beforeDropPlayerItemHookTypes = new LinkedList();
	private static final List overrideDropPlayerItemHookTypes = new LinkedList();
	private static final List afterDropPlayerItemHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeDropPlayerItemHooks;
	private final ServerPlayerBase[] overrideDropPlayerItemHooks;
	private final ServerPlayerBase[] afterDropPlayerItemHooks;
	public final boolean isDropPlayerItemModded;
	private static final List beforeFallHookTypes = new LinkedList();
	private static final List overrideFallHookTypes = new LinkedList();
	private static final List afterFallHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeFallHooks;
	private final ServerPlayerBase[] overrideFallHooks;
	private final ServerPlayerBase[] afterFallHooks;
	public final boolean isFallModded;
	private static final List beforeGetCurrentPlayerStrVsBlockHookTypes = new LinkedList();
	private static final List overrideGetCurrentPlayerStrVsBlockHookTypes = new LinkedList();
	private static final List afterGetCurrentPlayerStrVsBlockHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeGetCurrentPlayerStrVsBlockHooks;
	private final ServerPlayerBase[] overrideGetCurrentPlayerStrVsBlockHooks;
	private final ServerPlayerBase[] afterGetCurrentPlayerStrVsBlockHooks;
	public final boolean isGetCurrentPlayerStrVsBlockModded;
	private static final List beforeGetDistanceSqHookTypes = new LinkedList();
	private static final List overrideGetDistanceSqHookTypes = new LinkedList();
	private static final List afterGetDistanceSqHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeGetDistanceSqHooks;
	private final ServerPlayerBase[] overrideGetDistanceSqHooks;
	private final ServerPlayerBase[] afterGetDistanceSqHooks;
	public final boolean isGetDistanceSqModded;
	private static final List beforeGetBrightnessHookTypes = new LinkedList();
	private static final List overrideGetBrightnessHookTypes = new LinkedList();
	private static final List afterGetBrightnessHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeGetBrightnessHooks;
	private final ServerPlayerBase[] overrideGetBrightnessHooks;
	private final ServerPlayerBase[] afterGetBrightnessHooks;
	public final boolean isGetBrightnessModded;
	private static final List beforeGetEyeHeightHookTypes = new LinkedList();
	private static final List overrideGetEyeHeightHookTypes = new LinkedList();
	private static final List afterGetEyeHeightHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeGetEyeHeightHooks;
	private final ServerPlayerBase[] overrideGetEyeHeightHooks;
	private final ServerPlayerBase[] afterGetEyeHeightHooks;
	public final boolean isGetEyeHeightModded;
	private static final List beforeGetSpeedModifierHookTypes = new LinkedList();
	private static final List overrideGetSpeedModifierHookTypes = new LinkedList();
	private static final List afterGetSpeedModifierHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeGetSpeedModifierHooks;
	private final ServerPlayerBase[] overrideGetSpeedModifierHooks;
	private final ServerPlayerBase[] afterGetSpeedModifierHooks;
	public final boolean isGetSpeedModifierModded;
	private static final List beforeHealHookTypes = new LinkedList();
	private static final List overrideHealHookTypes = new LinkedList();
	private static final List afterHealHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeHealHooks;
	private final ServerPlayerBase[] overrideHealHooks;
	private final ServerPlayerBase[] afterHealHooks;
	public final boolean isHealModded;
	private static final List beforeInteractHookTypes = new LinkedList();
	private static final List overrideInteractHookTypes = new LinkedList();
	private static final List afterInteractHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeInteractHooks;
	private final ServerPlayerBase[] overrideInteractHooks;
	private final ServerPlayerBase[] afterInteractHooks;
	public final boolean isInteractModded;
	private static final List beforeIsEntityInsideOpaqueBlockHookTypes = new LinkedList();
	private static final List overrideIsEntityInsideOpaqueBlockHookTypes = new LinkedList();
	private static final List afterIsEntityInsideOpaqueBlockHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeIsEntityInsideOpaqueBlockHooks;
	private final ServerPlayerBase[] overrideIsEntityInsideOpaqueBlockHooks;
	private final ServerPlayerBase[] afterIsEntityInsideOpaqueBlockHooks;
	public final boolean isIsEntityInsideOpaqueBlockModded;
	private static final List beforeIsInWaterHookTypes = new LinkedList();
	private static final List overrideIsInWaterHookTypes = new LinkedList();
	private static final List afterIsInWaterHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeIsInWaterHooks;
	private final ServerPlayerBase[] overrideIsInWaterHooks;
	private final ServerPlayerBase[] afterIsInWaterHooks;
	public final boolean isIsInWaterModded;
	private static final List beforeIsInsideOfMaterialHookTypes = new LinkedList();
	private static final List overrideIsInsideOfMaterialHookTypes = new LinkedList();
	private static final List afterIsInsideOfMaterialHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeIsInsideOfMaterialHooks;
	private final ServerPlayerBase[] overrideIsInsideOfMaterialHooks;
	private final ServerPlayerBase[] afterIsInsideOfMaterialHooks;
	public final boolean isIsInsideOfMaterialModded;
	private static final List beforeIsOnLadderHookTypes = new LinkedList();
	private static final List overrideIsOnLadderHookTypes = new LinkedList();
	private static final List afterIsOnLadderHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeIsOnLadderHooks;
	private final ServerPlayerBase[] overrideIsOnLadderHooks;
	private final ServerPlayerBase[] afterIsOnLadderHooks;
	public final boolean isIsOnLadderModded;
	private static final List beforeIsPlayerSleepingHookTypes = new LinkedList();
	private static final List overrideIsPlayerSleepingHookTypes = new LinkedList();
	private static final List afterIsPlayerSleepingHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeIsPlayerSleepingHooks;
	private final ServerPlayerBase[] overrideIsPlayerSleepingHooks;
	private final ServerPlayerBase[] afterIsPlayerSleepingHooks;
	public final boolean isIsPlayerSleepingModded;
	private static final List beforeJumpHookTypes = new LinkedList();
	private static final List overrideJumpHookTypes = new LinkedList();
	private static final List afterJumpHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeJumpHooks;
	private final ServerPlayerBase[] overrideJumpHooks;
	private final ServerPlayerBase[] afterJumpHooks;
	public final boolean isJumpModded;
	private static final List beforeMoveEntityHookTypes = new LinkedList();
	private static final List overrideMoveEntityHookTypes = new LinkedList();
	private static final List afterMoveEntityHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeMoveEntityHooks;
	private final ServerPlayerBase[] overrideMoveEntityHooks;
	private final ServerPlayerBase[] afterMoveEntityHooks;
	public final boolean isMoveEntityModded;
	private static final List beforeMoveEntityWithHeadingHookTypes = new LinkedList();
	private static final List overrideMoveEntityWithHeadingHookTypes = new LinkedList();
	private static final List afterMoveEntityWithHeadingHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeMoveEntityWithHeadingHooks;
	private final ServerPlayerBase[] overrideMoveEntityWithHeadingHooks;
	private final ServerPlayerBase[] afterMoveEntityWithHeadingHooks;
	public final boolean isMoveEntityWithHeadingModded;
	private static final List beforeMoveFlyingHookTypes = new LinkedList();
	private static final List overrideMoveFlyingHookTypes = new LinkedList();
	private static final List afterMoveFlyingHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeMoveFlyingHooks;
	private final ServerPlayerBase[] overrideMoveFlyingHooks;
	private final ServerPlayerBase[] afterMoveFlyingHooks;
	public final boolean isMoveFlyingModded;
	private static final List beforeOnDeathHookTypes = new LinkedList();
	private static final List overrideOnDeathHookTypes = new LinkedList();
	private static final List afterOnDeathHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeOnDeathHooks;
	private final ServerPlayerBase[] overrideOnDeathHooks;
	private final ServerPlayerBase[] afterOnDeathHooks;
	public final boolean isOnDeathModded;
	private static final List beforeOnLivingUpdateHookTypes = new LinkedList();
	private static final List overrideOnLivingUpdateHookTypes = new LinkedList();
	private static final List afterOnLivingUpdateHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeOnLivingUpdateHooks;
	private final ServerPlayerBase[] overrideOnLivingUpdateHooks;
	private final ServerPlayerBase[] afterOnLivingUpdateHooks;
	public final boolean isOnLivingUpdateModded;
	private static final List beforeOnKillEntityHookTypes = new LinkedList();
	private static final List overrideOnKillEntityHookTypes = new LinkedList();
	private static final List afterOnKillEntityHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeOnKillEntityHooks;
	private final ServerPlayerBase[] overrideOnKillEntityHooks;
	private final ServerPlayerBase[] afterOnKillEntityHooks;
	public final boolean isOnKillEntityModded;
	private static final List beforeOnUpdateHookTypes = new LinkedList();
	private static final List overrideOnUpdateHookTypes = new LinkedList();
	private static final List afterOnUpdateHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeOnUpdateHooks;
	private final ServerPlayerBase[] overrideOnUpdateHooks;
	private final ServerPlayerBase[] afterOnUpdateHooks;
	public final boolean isOnUpdateModded;
	private static final List beforeOnUpdateEntityHookTypes = new LinkedList();
	private static final List overrideOnUpdateEntityHookTypes = new LinkedList();
	private static final List afterOnUpdateEntityHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeOnUpdateEntityHooks;
	private final ServerPlayerBase[] overrideOnUpdateEntityHooks;
	private final ServerPlayerBase[] afterOnUpdateEntityHooks;
	public final boolean isOnUpdateEntityModded;
	private static final List beforeReadEntityFromNBTHookTypes = new LinkedList();
	private static final List overrideReadEntityFromNBTHookTypes = new LinkedList();
	private static final List afterReadEntityFromNBTHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeReadEntityFromNBTHooks;
	private final ServerPlayerBase[] overrideReadEntityFromNBTHooks;
	private final ServerPlayerBase[] afterReadEntityFromNBTHooks;
	public final boolean isReadEntityFromNBTModded;
	private static final List beforeSetDeadHookTypes = new LinkedList();
	private static final List overrideSetDeadHookTypes = new LinkedList();
	private static final List afterSetDeadHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeSetDeadHooks;
	private final ServerPlayerBase[] overrideSetDeadHooks;
	private final ServerPlayerBase[] afterSetDeadHooks;
	public final boolean isSetDeadModded;
	private static final List beforeSetPositionHookTypes = new LinkedList();
	private static final List overrideSetPositionHookTypes = new LinkedList();
	private static final List afterSetPositionHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeSetPositionHooks;
	private final ServerPlayerBase[] overrideSetPositionHooks;
	private final ServerPlayerBase[] afterSetPositionHooks;
	public final boolean isSetPositionModded;
	private static final List beforeUpdateEntityActionStateHookTypes = new LinkedList();
	private static final List overrideUpdateEntityActionStateHookTypes = new LinkedList();
	private static final List afterUpdateEntityActionStateHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeUpdateEntityActionStateHooks;
	private final ServerPlayerBase[] overrideUpdateEntityActionStateHooks;
	private final ServerPlayerBase[] afterUpdateEntityActionStateHooks;
	public final boolean isUpdateEntityActionStateModded;
	private static final List beforeWriteEntityToNBTHookTypes = new LinkedList();
	private static final List overrideWriteEntityToNBTHookTypes = new LinkedList();
	private static final List afterWriteEntityToNBTHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeWriteEntityToNBTHooks;
	private final ServerPlayerBase[] overrideWriteEntityToNBTHooks;
	private final ServerPlayerBase[] afterWriteEntityToNBTHooks;
	public final boolean isWriteEntityToNBTModded;
	public final EntityPlayerMP player;
	private static final List beforeLocalConstructingHookTypes = new LinkedList();
	private static final List afterLocalConstructingHookTypes = new LinkedList();
	private final ServerPlayerBase[] beforeLocalConstructingHooks;
	private final ServerPlayerBase[] afterLocalConstructingHooks;
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
		register(var0, var1, (ServerPlayerBaseSorting) null);
	}

	public static void register(String var0, Class var1, ServerPlayerBaseSorting var2)
	{
		try
		{
			register(var1, var0, var2);
		} catch (RuntimeException var4)
		{
			if (var0 != null)
			{
				log("SHPAPI: failed to register id \'" + var0 + "\'");
			} else
			{
				log("SHPAPI: failed to register ServerPlayerBase");
			}

			throw var4;
		}
	}

	private static void register(Class var0, String var1, ServerPlayerBaseSorting var2)
	{
		if (!isCreated)
		{
			log("SHPAPI 1.2 Created");
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
						throw new IllegalArgumentException("Can not find necessary constructor with one argument of type \'" + ServerHexAPI.class.getName() + "\' and eventually a second argument of type \'String\' in the class \'" + var0.getName() + "\'", var8);
					}
				}

				allBaseConstructors.put(var1, var4);

				if (var2 != null)
				{
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeLocalConstructingSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeLocalConstructingInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterLocalConstructingSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterLocalConstructingInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeAttackEntityFromSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeAttackEntityFromInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideAttackEntityFromSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideAttackEntityFromInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterAttackEntityFromSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterAttackEntityFromInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeAttackTargetEntityWithCurrentItemSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeAttackTargetEntityWithCurrentItemInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideAttackTargetEntityWithCurrentItemSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideAttackTargetEntityWithCurrentItemInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterAttackTargetEntityWithCurrentItemSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterAttackTargetEntityWithCurrentItemInferiors());
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
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeDamageEntitySuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeDamageEntityInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideDamageEntitySuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideDamageEntityInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterDamageEntitySuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterDamageEntityInferiors());
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
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeFallSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeFallInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideFallSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideFallInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterFallSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterFallInferiors());
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
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeGetBrightnessSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeGetBrightnessInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideGetBrightnessSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideGetBrightnessInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterGetBrightnessSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterGetBrightnessInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeGetEyeHeightSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeGetEyeHeightInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideGetEyeHeightSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideGetEyeHeightInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterGetEyeHeightSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterGetEyeHeightInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeGetSpeedModifierSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeGetSpeedModifierInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideGetSpeedModifierSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideGetSpeedModifierInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterGetSpeedModifierSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterGetSpeedModifierInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeHealSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeHealInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideHealSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideHealInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterHealSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterHealInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeInteractSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeInteractInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideInteractSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideInteractInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterInteractSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterInteractInferiors());
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
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeIsPlayerSleepingSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeIsPlayerSleepingInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideIsPlayerSleepingSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideIsPlayerSleepingInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterIsPlayerSleepingSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterIsPlayerSleepingInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeJumpSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeJumpInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideJumpSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideJumpInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterJumpSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterJumpInferiors());
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
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeOnUpdateEntitySuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeOnUpdateEntityInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideOnUpdateEntitySuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideOnUpdateEntityInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterOnUpdateEntitySuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterOnUpdateEntityInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeReadEntityFromNBTSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeReadEntityFromNBTInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideReadEntityFromNBTSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideReadEntityFromNBTInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterReadEntityFromNBTSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterReadEntityFromNBTInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeSetDeadSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeSetDeadInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideSetDeadSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideSetDeadInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterSetDeadSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterSetDeadInferiors());
					addSorting(var1, allBaseBeforeSuperiors, var2.getBeforeSetPositionSuperiors());
					addSorting(var1, allBaseBeforeInferiors, var2.getBeforeSetPositionInferiors());
					addSorting(var1, allBaseOverrideSuperiors, var2.getOverrideSetPositionSuperiors());
					addSorting(var1, allBaseOverrideInferiors, var2.getOverrideSetPositionInferiors());
					addSorting(var1, allBaseAfterSuperiors, var2.getAfterSetPositionSuperiors());
					addSorting(var1, allBaseAfterInferiors, var2.getAfterSetPositionInferiors());
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
				{ MinecraftServer.class, World.class, String.class, ItemInWorldManager.class });
				addMethod(var1, var0, afterLocalConstructingHookTypes, "afterLocalConstructing", new Class[]
				{ MinecraftServer.class, World.class, String.class, ItemInWorldManager.class });
				addMethod(var1, var0, beforeAttackEntityFromHookTypes, "beforeAttackEntityFrom", new Class[]
				{ DamageSource.class, Integer.TYPE });
				addMethod(var1, var0, overrideAttackEntityFromHookTypes, "attackEntityFrom", new Class[]
				{ DamageSource.class, Integer.TYPE });
				addMethod(var1, var0, afterAttackEntityFromHookTypes, "afterAttackEntityFrom", new Class[]
				{ DamageSource.class, Integer.TYPE });
				addMethod(var1, var0, beforeAttackTargetEntityWithCurrentItemHookTypes, "beforeAttackTargetEntityWithCurrentItem", new Class[]
				{ Entity.class });
				addMethod(var1, var0, overrideAttackTargetEntityWithCurrentItemHookTypes, "attackTargetEntityWithCurrentItem", new Class[]
				{ Entity.class });
				addMethod(var1, var0, afterAttackTargetEntityWithCurrentItemHookTypes, "afterAttackTargetEntityWithCurrentItem", new Class[]
				{ Entity.class });
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
				addMethod(var1, var0, beforeDamageEntityHookTypes, "beforeDamageEntity", new Class[]
				{ DamageSource.class, Integer.TYPE });
				addMethod(var1, var0, overrideDamageEntityHookTypes, "damageEntity", new Class[]
				{ DamageSource.class, Integer.TYPE });
				addMethod(var1, var0, afterDamageEntityHookTypes, "afterDamageEntity", new Class[]
				{ DamageSource.class, Integer.TYPE });
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
				addMethod(var1, var0, beforeFallHookTypes, "beforeFall", new Class[]
				{ Float.TYPE });
				addMethod(var1, var0, overrideFallHookTypes, "fall", new Class[]
				{ Float.TYPE });
				addMethod(var1, var0, afterFallHookTypes, "afterFall", new Class[]
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
				addMethod(var1, var0, beforeGetBrightnessHookTypes, "beforeGetBrightness", new Class[]
				{ Float.TYPE });
				addMethod(var1, var0, overrideGetBrightnessHookTypes, "getBrightness", new Class[]
				{ Float.TYPE });
				addMethod(var1, var0, afterGetBrightnessHookTypes, "afterGetBrightness", new Class[]
				{ Float.TYPE });
				addMethod(var1, var0, beforeGetEyeHeightHookTypes, "beforeGetEyeHeight", new Class[0]);
				addMethod(var1, var0, overrideGetEyeHeightHookTypes, "getEyeHeight", new Class[0]);
				addMethod(var1, var0, afterGetEyeHeightHookTypes, "afterGetEyeHeight", new Class[0]);
				addMethod(var1, var0, beforeGetSpeedModifierHookTypes, "beforeGetSpeedModifier", new Class[0]);
				addMethod(var1, var0, overrideGetSpeedModifierHookTypes, "getSpeedModifier", new Class[0]);
				addMethod(var1, var0, afterGetSpeedModifierHookTypes, "afterGetSpeedModifier", new Class[0]);
				addMethod(var1, var0, beforeHealHookTypes, "beforeHeal", new Class[]
				{ Integer.TYPE });
				addMethod(var1, var0, overrideHealHookTypes, "heal", new Class[]
				{ Integer.TYPE });
				addMethod(var1, var0, afterHealHookTypes, "afterHeal", new Class[]
				{ Integer.TYPE });
				addMethod(var1, var0, beforeInteractHookTypes, "beforeInteract", new Class[]
				{ EntityPlayer.class });
				addMethod(var1, var0, overrideInteractHookTypes, "interact", new Class[]
				{ EntityPlayer.class });
				addMethod(var1, var0, afterInteractHookTypes, "afterInteract", new Class[]
				{ EntityPlayer.class });
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
				addMethod(var1, var0, beforeIsPlayerSleepingHookTypes, "beforeIsPlayerSleeping", new Class[0]);
				addMethod(var1, var0, overrideIsPlayerSleepingHookTypes, "isPlayerSleeping", new Class[0]);
				addMethod(var1, var0, afterIsPlayerSleepingHookTypes, "afterIsPlayerSleeping", new Class[0]);
				addMethod(var1, var0, beforeJumpHookTypes, "beforeJump", new Class[0]);
				addMethod(var1, var0, overrideJumpHookTypes, "jump", new Class[0]);
				addMethod(var1, var0, afterJumpHookTypes, "afterJump", new Class[0]);
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
				addMethod(var1, var0, beforeOnUpdateEntityHookTypes, "beforeOnUpdateEntity", new Class[0]);
				addMethod(var1, var0, overrideOnUpdateEntityHookTypes, "onUpdateEntity", new Class[0]);
				addMethod(var1, var0, afterOnUpdateEntityHookTypes, "afterOnUpdateEntity", new Class[0]);
				addMethod(var1, var0, beforeReadEntityFromNBTHookTypes, "beforeReadEntityFromNBT", new Class[]
				{ NBTTagCompound.class });
				addMethod(var1, var0, overrideReadEntityFromNBTHookTypes, "readEntityFromNBT", new Class[]
				{ NBTTagCompound.class });
				addMethod(var1, var0, afterReadEntityFromNBTHookTypes, "afterReadEntityFromNBT", new Class[]
				{ NBTTagCompound.class });
				addMethod(var1, var0, beforeSetDeadHookTypes, "beforeSetDead", new Class[0]);
				addMethod(var1, var0, overrideSetDeadHookTypes, "setDead", new Class[0]);
				addMethod(var1, var0, afterSetDeadHookTypes, "afterSetDead", new Class[0]);
				addMethod(var1, var0, beforeSetPositionHookTypes, "beforeSetPosition", new Class[]
				{ Double.TYPE, Double.TYPE, Double.TYPE });
				addMethod(var1, var0, overrideSetPositionHookTypes, "setPosition", new Class[]
				{ Double.TYPE, Double.TYPE, Double.TYPE });
				addMethod(var1, var0, afterSetPositionHookTypes, "afterSetPosition", new Class[]
				{ Double.TYPE, Double.TYPE, Double.TYPE });
				addMethod(var1, var0, beforeUpdateEntityActionStateHookTypes, "beforeUpdateEntityActionState", new Class[0]);
				addMethod(var1, var0, overrideUpdateEntityActionStateHookTypes, "updateEntityActionState", new Class[0]);
				addMethod(var1, var0, afterUpdateEntityActionStateHookTypes, "afterUpdateEntityActionState", new Class[0]);
				addMethod(var1, var0, beforeWriteEntityToNBTHookTypes, "beforeWriteEntityToNBT", new Class[]
				{ NBTTagCompound.class });
				addMethod(var1, var0, overrideWriteEntityToNBTHookTypes, "writeEntityToNBT", new Class[]
				{ NBTTagCompound.class });
				addMethod(var1, var0, afterWriteEntityToNBTHookTypes, "afterWriteEntityToNBT", new Class[]
				{ NBTTagCompound.class });
				System.out.println("SHPAPI: registered " + var1);
				logger.fine("SHPAPI: registered class \'" + var0.getName() + "\' with id \'" + var1 + "\'");
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
			beforeAttackEntityFromHookTypes.remove(var0);
			overrideAttackEntityFromHookTypes.remove(var0);
			afterAttackEntityFromHookTypes.remove(var0);
			beforeAttackTargetEntityWithCurrentItemHookTypes.remove(var0);
			overrideAttackTargetEntityWithCurrentItemHookTypes.remove(var0);
			afterAttackTargetEntityWithCurrentItemHookTypes.remove(var0);
			beforeCanHarvestBlockHookTypes.remove(var0);
			overrideCanHarvestBlockHookTypes.remove(var0);
			afterCanHarvestBlockHookTypes.remove(var0);
			beforeCanPlayerEditHookTypes.remove(var0);
			overrideCanPlayerEditHookTypes.remove(var0);
			afterCanPlayerEditHookTypes.remove(var0);
			beforeCanTriggerWalkingHookTypes.remove(var0);
			overrideCanTriggerWalkingHookTypes.remove(var0);
			afterCanTriggerWalkingHookTypes.remove(var0);
			beforeDamageEntityHookTypes.remove(var0);
			overrideDamageEntityHookTypes.remove(var0);
			afterDamageEntityHookTypes.remove(var0);
			beforeDisplayGUIChestHookTypes.remove(var0);
			overrideDisplayGUIChestHookTypes.remove(var0);
			afterDisplayGUIChestHookTypes.remove(var0);
			beforeDisplayGUIDispenserHookTypes.remove(var0);
			overrideDisplayGUIDispenserHookTypes.remove(var0);
			afterDisplayGUIDispenserHookTypes.remove(var0);
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
			beforeFallHookTypes.remove(var0);
			overrideFallHookTypes.remove(var0);
			afterFallHookTypes.remove(var0);
			beforeGetCurrentPlayerStrVsBlockHookTypes.remove(var0);
			overrideGetCurrentPlayerStrVsBlockHookTypes.remove(var0);
			afterGetCurrentPlayerStrVsBlockHookTypes.remove(var0);
			beforeGetDistanceSqHookTypes.remove(var0);
			overrideGetDistanceSqHookTypes.remove(var0);
			afterGetDistanceSqHookTypes.remove(var0);
			beforeGetBrightnessHookTypes.remove(var0);
			overrideGetBrightnessHookTypes.remove(var0);
			afterGetBrightnessHookTypes.remove(var0);
			beforeGetEyeHeightHookTypes.remove(var0);
			overrideGetEyeHeightHookTypes.remove(var0);
			afterGetEyeHeightHookTypes.remove(var0);
			beforeGetSpeedModifierHookTypes.remove(var0);
			overrideGetSpeedModifierHookTypes.remove(var0);
			afterGetSpeedModifierHookTypes.remove(var0);
			beforeHealHookTypes.remove(var0);
			overrideHealHookTypes.remove(var0);
			afterHealHookTypes.remove(var0);
			beforeInteractHookTypes.remove(var0);
			overrideInteractHookTypes.remove(var0);
			afterInteractHookTypes.remove(var0);
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
			beforeIsPlayerSleepingHookTypes.remove(var0);
			overrideIsPlayerSleepingHookTypes.remove(var0);
			afterIsPlayerSleepingHookTypes.remove(var0);
			beforeJumpHookTypes.remove(var0);
			overrideJumpHookTypes.remove(var0);
			afterJumpHookTypes.remove(var0);
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
			beforeOnUpdateEntityHookTypes.remove(var0);
			overrideOnUpdateEntityHookTypes.remove(var0);
			afterOnUpdateEntityHookTypes.remove(var0);
			beforeReadEntityFromNBTHookTypes.remove(var0);
			overrideReadEntityFromNBTHookTypes.remove(var0);
			afterReadEntityFromNBTHookTypes.remove(var0);
			beforeSetDeadHookTypes.remove(var0);
			overrideSetDeadHookTypes.remove(var0);
			afterSetDeadHookTypes.remove(var0);
			beforeSetPositionHookTypes.remove(var0);
			overrideSetPositionHookTypes.remove(var0);
			afterSetPositionHookTypes.remove(var0);
			beforeUpdateEntityActionStateHookTypes.remove(var0);
			overrideUpdateEntityActionStateHookTypes.remove(var0);
			afterUpdateEntityActionStateHookTypes.remove(var0);
			beforeWriteEntityToNBTHookTypes.remove(var0);
			overrideWriteEntityToNBTHookTypes.remove(var0);
			afterWriteEntityToNBTHookTypes.remove(var0);
			log("SHPAPI: unregistered id \'" + var0 + "\'");
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
			boolean var6 = var5.getDeclaringClass() != ServerPlayerBase.class;

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

	public static ServerHexAPI create(EntityPlayerMP var0)
	{
		if (allBaseConstructors.size() > 0)
		{
			if (!initialized)
			{
				initialize();
			}

			return new ServerHexAPI(var0);
		} else
		{
			return null;
		}
	}

	private static void initialize()
	{
		sortBases(beforeLocalConstructingHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeLocalConstructing");
		sortBases(afterLocalConstructingHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterLocalConstructing");
		sortBases(beforeAttackEntityFromHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeAttackEntityFrom");
		sortBases(overrideAttackEntityFromHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideAttackEntityFrom");
		sortBases(afterAttackEntityFromHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterAttackEntityFrom");
		sortBases(beforeAttackTargetEntityWithCurrentItemHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeAttackTargetEntityWithCurrentItem");
		sortBases(overrideAttackTargetEntityWithCurrentItemHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideAttackTargetEntityWithCurrentItem");
		sortBases(afterAttackTargetEntityWithCurrentItemHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterAttackTargetEntityWithCurrentItem");
		sortBases(beforeCanHarvestBlockHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeCanHarvestBlock");
		sortBases(overrideCanHarvestBlockHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideCanHarvestBlock");
		sortBases(afterCanHarvestBlockHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterCanHarvestBlock");
		sortBases(beforeCanPlayerEditHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeCanPlayerEdit");
		sortBases(overrideCanPlayerEditHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideCanPlayerEdit");
		sortBases(afterCanPlayerEditHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterCanPlayerEdit");
		sortBases(beforeCanTriggerWalkingHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeCanTriggerWalking");
		sortBases(overrideCanTriggerWalkingHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideCanTriggerWalking");
		sortBases(afterCanTriggerWalkingHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterCanTriggerWalking");
		sortBases(beforeDamageEntityHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDamageEntity");
		sortBases(overrideDamageEntityHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDamageEntity");
		sortBases(afterDamageEntityHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDamageEntity");
		sortBases(beforeDisplayGUIChestHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDisplayGUIChest");
		sortBases(overrideDisplayGUIChestHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDisplayGUIChest");
		sortBases(afterDisplayGUIChestHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDisplayGUIChest");
		sortBases(beforeDisplayGUIDispenserHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDisplayGUIDispenser");
		sortBases(overrideDisplayGUIDispenserHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDisplayGUIDispenser");
		sortBases(afterDisplayGUIDispenserHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDisplayGUIDispenser");
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
		sortBases(beforeFallHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeFall");
		sortBases(overrideFallHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideFall");
		sortBases(afterFallHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterFall");
		sortBases(beforeGetCurrentPlayerStrVsBlockHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetCurrentPlayerStrVsBlock");
		sortBases(overrideGetCurrentPlayerStrVsBlockHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetCurrentPlayerStrVsBlock");
		sortBases(afterGetCurrentPlayerStrVsBlockHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetCurrentPlayerStrVsBlock");
		sortBases(beforeGetDistanceSqHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetDistanceSq");
		sortBases(overrideGetDistanceSqHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetDistanceSq");
		sortBases(afterGetDistanceSqHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetDistanceSq");
		sortBases(beforeGetBrightnessHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetBrightness");
		sortBases(overrideGetBrightnessHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetBrightness");
		sortBases(afterGetBrightnessHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetBrightness");
		sortBases(beforeGetEyeHeightHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetEyeHeight");
		sortBases(overrideGetEyeHeightHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetEyeHeight");
		sortBases(afterGetEyeHeightHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetEyeHeight");
		sortBases(beforeGetSpeedModifierHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetSpeedModifier");
		sortBases(overrideGetSpeedModifierHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetSpeedModifier");
		sortBases(afterGetSpeedModifierHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetSpeedModifier");
		sortBases(beforeHealHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeHeal");
		sortBases(overrideHealHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideHeal");
		sortBases(afterHealHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterHeal");
		sortBases(beforeInteractHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeInteract");
		sortBases(overrideInteractHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideInteract");
		sortBases(afterInteractHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterInteract");
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
		sortBases(beforeIsPlayerSleepingHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeIsPlayerSleeping");
		sortBases(overrideIsPlayerSleepingHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideIsPlayerSleeping");
		sortBases(afterIsPlayerSleepingHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterIsPlayerSleeping");
		sortBases(beforeJumpHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeJump");
		sortBases(overrideJumpHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideJump");
		sortBases(afterJumpHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterJump");
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
		sortBases(beforeOnUpdateEntityHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeOnUpdateEntity");
		sortBases(overrideOnUpdateEntityHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideOnUpdateEntity");
		sortBases(afterOnUpdateEntityHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterOnUpdateEntity");
		sortBases(beforeReadEntityFromNBTHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeReadEntityFromNBT");
		sortBases(overrideReadEntityFromNBTHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideReadEntityFromNBT");
		sortBases(afterReadEntityFromNBTHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterReadEntityFromNBT");
		sortBases(beforeSetDeadHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeSetDead");
		sortBases(overrideSetDeadHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideSetDead");
		sortBases(afterSetDeadHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterSetDead");
		sortBases(beforeSetPositionHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeSetPosition");
		sortBases(overrideSetPositionHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideSetPosition");
		sortBases(afterSetPositionHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterSetPosition");
		sortBases(beforeUpdateEntityActionStateHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeUpdateEntityActionState");
		sortBases(overrideUpdateEntityActionStateHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideUpdateEntityActionState");
		sortBases(afterUpdateEntityActionStateHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterUpdateEntityActionState");
		sortBases(beforeWriteEntityToNBTHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeWriteEntityToNBT");
		sortBases(overrideWriteEntityToNBTHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideWriteEntityToNBT");
		sortBases(afterWriteEntityToNBTHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterWriteEntityToNBT");
		initialized = true;
	}

	public static void beforeLocalConstructing(EntityPlayerMP var0, MinecraftServer var1, World var2, String var3, ItemInWorldManager var4)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.beforeLocalConstructing(var1, var2, var3, var4);
		}
	}

	public static void afterLocalConstructing(EntityPlayerMP var0, MinecraftServer var1, World var2, String var3, ItemInWorldManager var4)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.afterLocalConstructing(var1, var2, var3, var4);
		}
	}

	private static void sortBases(List var0, Map var1, Map var2, String var3)
	{
		(new ServerPlayerBaseSorter(var0, var1, var2, var3)).Sort();
	}

	private ServerHexAPI(EntityPlayerMP var1)
	{
		this.unmodifiableAllBaseIds = Collections.unmodifiableSet(this.allBaseObjects.keySet());
		this.player = var1;
		Object[] var2 = new Object[]
		{ this };
		Object[] var3 = new Object[]
		{ this, null };
		Entry var5;
		ServerPlayerBase var7;

		for (Iterator var4 = allBaseConstructors.entrySet().iterator(); var4.hasNext(); this.allBaseObjects.put(var5.getKey(), var7))
		{
			var5 = (Entry) var4.next();
			Constructor var6 = (Constructor) var5.getValue();
			var3[1] = var5.getKey();

			try
			{
				if (var6.getParameterTypes().length == 1)
				{
					var7 = (ServerPlayerBase) var6.newInstance(var2);
				} else
				{
					var7 = (ServerPlayerBase) var6.newInstance(var3);
				}
			} catch (Exception var9)
			{
				throw new RuntimeException("Exception while creating a ServerPlayerBase of type \'" + var6.getDeclaringClass() + "\'", var9);
			}
		}

		this.beforeLocalConstructingHooks = this.create(beforeLocalConstructingHookTypes);
		this.afterLocalConstructingHooks = this.create(afterLocalConstructingHookTypes);
		this.beforeAttackEntityFromHooks = this.create(beforeAttackEntityFromHookTypes);
		this.overrideAttackEntityFromHooks = this.create(overrideAttackEntityFromHookTypes);
		this.afterAttackEntityFromHooks = this.create(afterAttackEntityFromHookTypes);
		this.isAttackEntityFromModded = this.beforeAttackEntityFromHooks != null || this.overrideAttackEntityFromHooks != null || this.afterAttackEntityFromHooks != null;
		this.beforeAttackTargetEntityWithCurrentItemHooks = this.create(beforeAttackTargetEntityWithCurrentItemHookTypes);
		this.overrideAttackTargetEntityWithCurrentItemHooks = this.create(overrideAttackTargetEntityWithCurrentItemHookTypes);
		this.afterAttackTargetEntityWithCurrentItemHooks = this.create(afterAttackTargetEntityWithCurrentItemHookTypes);
		this.isAttackTargetEntityWithCurrentItemModded = this.beforeAttackTargetEntityWithCurrentItemHooks != null || this.overrideAttackTargetEntityWithCurrentItemHooks != null || this.afterAttackTargetEntityWithCurrentItemHooks != null;
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
		this.beforeDamageEntityHooks = this.create(beforeDamageEntityHookTypes);
		this.overrideDamageEntityHooks = this.create(overrideDamageEntityHookTypes);
		this.afterDamageEntityHooks = this.create(afterDamageEntityHookTypes);
		this.isDamageEntityModded = this.beforeDamageEntityHooks != null || this.overrideDamageEntityHooks != null || this.afterDamageEntityHooks != null;
		this.beforeDisplayGUIChestHooks = this.create(beforeDisplayGUIChestHookTypes);
		this.overrideDisplayGUIChestHooks = this.create(overrideDisplayGUIChestHookTypes);
		this.afterDisplayGUIChestHooks = this.create(afterDisplayGUIChestHookTypes);
		this.isDisplayGUIChestModded = this.beforeDisplayGUIChestHooks != null || this.overrideDisplayGUIChestHooks != null || this.afterDisplayGUIChestHooks != null;
		this.beforeDisplayGUIDispenserHooks = this.create(beforeDisplayGUIDispenserHookTypes);
		this.overrideDisplayGUIDispenserHooks = this.create(overrideDisplayGUIDispenserHookTypes);
		this.afterDisplayGUIDispenserHooks = this.create(afterDisplayGUIDispenserHookTypes);
		this.isDisplayGUIDispenserModded = this.beforeDisplayGUIDispenserHooks != null || this.overrideDisplayGUIDispenserHooks != null || this.afterDisplayGUIDispenserHooks != null;
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
		this.beforeFallHooks = this.create(beforeFallHookTypes);
		this.overrideFallHooks = this.create(overrideFallHookTypes);
		this.afterFallHooks = this.create(afterFallHookTypes);
		this.isFallModded = this.beforeFallHooks != null || this.overrideFallHooks != null || this.afterFallHooks != null;
		this.beforeGetCurrentPlayerStrVsBlockHooks = this.create(beforeGetCurrentPlayerStrVsBlockHookTypes);
		this.overrideGetCurrentPlayerStrVsBlockHooks = this.create(overrideGetCurrentPlayerStrVsBlockHookTypes);
		this.afterGetCurrentPlayerStrVsBlockHooks = this.create(afterGetCurrentPlayerStrVsBlockHookTypes);
		this.isGetCurrentPlayerStrVsBlockModded = this.beforeGetCurrentPlayerStrVsBlockHooks != null || this.overrideGetCurrentPlayerStrVsBlockHooks != null || this.afterGetCurrentPlayerStrVsBlockHooks != null;
		this.beforeGetDistanceSqHooks = this.create(beforeGetDistanceSqHookTypes);
		this.overrideGetDistanceSqHooks = this.create(overrideGetDistanceSqHookTypes);
		this.afterGetDistanceSqHooks = this.create(afterGetDistanceSqHookTypes);
		this.isGetDistanceSqModded = this.beforeGetDistanceSqHooks != null || this.overrideGetDistanceSqHooks != null || this.afterGetDistanceSqHooks != null;
		this.beforeGetBrightnessHooks = this.create(beforeGetBrightnessHookTypes);
		this.overrideGetBrightnessHooks = this.create(overrideGetBrightnessHookTypes);
		this.afterGetBrightnessHooks = this.create(afterGetBrightnessHookTypes);
		this.isGetBrightnessModded = this.beforeGetBrightnessHooks != null || this.overrideGetBrightnessHooks != null || this.afterGetBrightnessHooks != null;
		this.beforeGetEyeHeightHooks = this.create(beforeGetEyeHeightHookTypes);
		this.overrideGetEyeHeightHooks = this.create(overrideGetEyeHeightHookTypes);
		this.afterGetEyeHeightHooks = this.create(afterGetEyeHeightHookTypes);
		this.isGetEyeHeightModded = this.beforeGetEyeHeightHooks != null || this.overrideGetEyeHeightHooks != null || this.afterGetEyeHeightHooks != null;
		this.beforeGetSpeedModifierHooks = this.create(beforeGetSpeedModifierHookTypes);
		this.overrideGetSpeedModifierHooks = this.create(overrideGetSpeedModifierHookTypes);
		this.afterGetSpeedModifierHooks = this.create(afterGetSpeedModifierHookTypes);
		this.isGetSpeedModifierModded = this.beforeGetSpeedModifierHooks != null || this.overrideGetSpeedModifierHooks != null || this.afterGetSpeedModifierHooks != null;
		this.beforeHealHooks = this.create(beforeHealHookTypes);
		this.overrideHealHooks = this.create(overrideHealHookTypes);
		this.afterHealHooks = this.create(afterHealHookTypes);
		this.isHealModded = this.beforeHealHooks != null || this.overrideHealHooks != null || this.afterHealHooks != null;
		this.beforeInteractHooks = this.create(beforeInteractHookTypes);
		this.overrideInteractHooks = this.create(overrideInteractHookTypes);
		this.afterInteractHooks = this.create(afterInteractHookTypes);
		this.isInteractModded = this.beforeInteractHooks != null || this.overrideInteractHooks != null || this.afterInteractHooks != null;
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
		this.beforeIsPlayerSleepingHooks = this.create(beforeIsPlayerSleepingHookTypes);
		this.overrideIsPlayerSleepingHooks = this.create(overrideIsPlayerSleepingHookTypes);
		this.afterIsPlayerSleepingHooks = this.create(afterIsPlayerSleepingHookTypes);
		this.isIsPlayerSleepingModded = this.beforeIsPlayerSleepingHooks != null || this.overrideIsPlayerSleepingHooks != null || this.afterIsPlayerSleepingHooks != null;
		this.beforeJumpHooks = this.create(beforeJumpHookTypes);
		this.overrideJumpHooks = this.create(overrideJumpHookTypes);
		this.afterJumpHooks = this.create(afterJumpHookTypes);
		this.isJumpModded = this.beforeJumpHooks != null || this.overrideJumpHooks != null || this.afterJumpHooks != null;
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
		this.beforeOnUpdateEntityHooks = this.create(beforeOnUpdateEntityHookTypes);
		this.overrideOnUpdateEntityHooks = this.create(overrideOnUpdateEntityHookTypes);
		this.afterOnUpdateEntityHooks = this.create(afterOnUpdateEntityHookTypes);
		this.isOnUpdateEntityModded = this.beforeOnUpdateEntityHooks != null || this.overrideOnUpdateEntityHooks != null || this.afterOnUpdateEntityHooks != null;
		this.beforeReadEntityFromNBTHooks = this.create(beforeReadEntityFromNBTHookTypes);
		this.overrideReadEntityFromNBTHooks = this.create(overrideReadEntityFromNBTHookTypes);
		this.afterReadEntityFromNBTHooks = this.create(afterReadEntityFromNBTHookTypes);
		this.isReadEntityFromNBTModded = this.beforeReadEntityFromNBTHooks != null || this.overrideReadEntityFromNBTHooks != null || this.afterReadEntityFromNBTHooks != null;
		this.beforeSetDeadHooks = this.create(beforeSetDeadHookTypes);
		this.overrideSetDeadHooks = this.create(overrideSetDeadHookTypes);
		this.afterSetDeadHooks = this.create(afterSetDeadHookTypes);
		this.isSetDeadModded = this.beforeSetDeadHooks != null || this.overrideSetDeadHooks != null || this.afterSetDeadHooks != null;
		this.beforeSetPositionHooks = this.create(beforeSetPositionHookTypes);
		this.overrideSetPositionHooks = this.create(overrideSetPositionHookTypes);
		this.afterSetPositionHooks = this.create(afterSetPositionHookTypes);
		this.isSetPositionModded = this.beforeSetPositionHooks != null || this.overrideSetPositionHooks != null || this.afterSetPositionHooks != null;
		this.beforeUpdateEntityActionStateHooks = this.create(beforeUpdateEntityActionStateHookTypes);
		this.overrideUpdateEntityActionStateHooks = this.create(overrideUpdateEntityActionStateHookTypes);
		this.afterUpdateEntityActionStateHooks = this.create(afterUpdateEntityActionStateHookTypes);
		this.isUpdateEntityActionStateModded = this.beforeUpdateEntityActionStateHooks != null || this.overrideUpdateEntityActionStateHooks != null || this.afterUpdateEntityActionStateHooks != null;
		this.beforeWriteEntityToNBTHooks = this.create(beforeWriteEntityToNBTHookTypes);
		this.overrideWriteEntityToNBTHooks = this.create(overrideWriteEntityToNBTHookTypes);
		this.afterWriteEntityToNBTHooks = this.create(afterWriteEntityToNBTHookTypes);
		this.isWriteEntityToNBTModded = this.beforeWriteEntityToNBTHooks != null || this.overrideWriteEntityToNBTHooks != null || this.afterWriteEntityToNBTHooks != null;
	}

	private ServerPlayerBase[] create(List var1)
	{
		if (var1.isEmpty())
		{
			return null;
		} else
		{
			ServerPlayerBase[] var2 = new ServerPlayerBase[var1.size()];

			for (int var3 = 0; var3 < var2.length; ++var3)
			{
				var2[var3] = this.getServerPlayerBase((String) var1.get(var3));
			}

			return var2;
		}
	}

	private void beforeLocalConstructing(MinecraftServer var1, World var2, String var3, ItemInWorldManager var4)
	{
		if (this.beforeLocalConstructingHooks != null)
		{
			for (int var5 = this.beforeLocalConstructingHooks.length - 1; var5 >= 0; --var5)
			{
				this.beforeLocalConstructingHooks[var5].beforeLocalConstructing(var1, var2, var3, var4);
			}
		}
	}

	private void afterLocalConstructing(MinecraftServer var1, World var2, String var3, ItemInWorldManager var4)
	{
		if (this.afterLocalConstructingHooks != null)
		{
			for (int var5 = 0; var5 < this.afterLocalConstructingHooks.length; ++var5)
			{
				this.afterLocalConstructingHooks[var5].afterLocalConstructing(var1, var2, var3, var4);
			}
		}
	}

	public ServerPlayerBase getServerPlayerBase(String var1)
	{
		return (ServerPlayerBase) this.allBaseObjects.get(var1);
	}

	public Set getServerPlayerBaseIds()
	{
		return this.unmodifiableAllBaseIds;
	}

	public static boolean attackEntityFrom(EntityPlayerMP var0, DamageSource var1, int var2)
	{
		boolean var3;

		if (var0.SHPAPI != null)
		{
			var3 = var0.SHPAPI.attackEntityFrom(var1, var2);
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

	public ServerPlayerBase GetOverwrittenAttackEntityFrom(ServerPlayerBase var1)
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

	public static void attackTargetEntityWithCurrentItem(EntityPlayerMP var0, Entity var1)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.attackTargetEntityWithCurrentItem(var1);
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

	public ServerPlayerBase GetOverwrittenAttackTargetEntityWithCurrentItem(ServerPlayerBase var1)
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

	public static boolean canHarvestBlock(EntityPlayerMP var0, Block var1)
	{
		boolean var2;

		if (var0.SHPAPI != null)
		{
			var2 = var0.SHPAPI.canHarvestBlock(var1);
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

	public ServerPlayerBase GetOverwrittenCanHarvestBlock(ServerPlayerBase var1)
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

	public static boolean canPlayerEdit(EntityPlayerMP var0, int var1, int var2, int var3)
	{
		boolean var4;

		if (var0.SHPAPI != null)
		{
			var4 = var0.SHPAPI.canPlayerEdit(var1, var2, var3);
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

	public ServerPlayerBase GetOverwrittenCanPlayerEdit(ServerPlayerBase var1)
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

	public static boolean canTriggerWalking(EntityPlayerMP var0)
	{
		boolean var1;

		if (var0.SHPAPI != null)
		{
			var1 = var0.SHPAPI.canTriggerWalking();
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

	public ServerPlayerBase GetOverwrittenCanTriggerWalking(ServerPlayerBase var1)
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

	public static void damageEntity(EntityPlayerMP var0, DamageSource var1, int var2)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.damageEntity(var1, var2);
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

	public ServerPlayerBase GetOverwrittenDamageEntity(ServerPlayerBase var1)
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

	public static void displayGUIChest(EntityPlayerMP var0, IInventory var1)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.displayGUIChest(var1);
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

	public ServerPlayerBase GetOverwrittenDisplayGUIChest(ServerPlayerBase var1)
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

	public static void displayGUIDispenser(EntityPlayerMP var0, TileEntityDispenser var1)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.displayGUIDispenser(var1);
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

	public ServerPlayerBase GetOverwrittenDisplayGUIDispenser(ServerPlayerBase var1)
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

	public static void displayGUIFurnace(EntityPlayerMP var0, TileEntityFurnace var1)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.displayGUIFurnace(var1);
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

	public ServerPlayerBase GetOverwrittenDisplayGUIFurnace(ServerPlayerBase var1)
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

	public static void displayWorkbenchGUI(EntityPlayerMP var0, int var1, int var2, int var3)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.displayWorkbenchGUI(var1, var2, var3);
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

	public ServerPlayerBase GetOverwrittenDisplayWorkbenchGUI(ServerPlayerBase var1)
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

	public static EntityItem dropOneItem(EntityPlayerMP var0)
	{
		EntityItem var1;

		if (var0.SHPAPI != null)
		{
			var1 = var0.SHPAPI.dropOneItem();
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

	public ServerPlayerBase GetOverwrittenDropOneItem(ServerPlayerBase var1)
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

	public static EntityItem dropPlayerItem(EntityPlayerMP var0, ItemStack var1)
	{
		EntityItem var2;

		if (var0.SHPAPI != null)
		{
			var2 = var0.SHPAPI.dropPlayerItem(var1);
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

	public ServerPlayerBase GetOverwrittenDropPlayerItem(ServerPlayerBase var1)
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

	public static void fall(EntityPlayerMP var0, float var1)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.fall(var1);
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

	public ServerPlayerBase GetOverwrittenFall(ServerPlayerBase var1)
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

	public static float getCurrentPlayerStrVsBlock(EntityPlayerMP var0, Block var1)
	{
		float var2;

		if (var0.SHPAPI != null)
		{
			var2 = var0.SHPAPI.getCurrentPlayerStrVsBlock(var1);
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

	public ServerPlayerBase GetOverwrittenGetCurrentPlayerStrVsBlock(ServerPlayerBase var1)
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

	public static double getDistanceSq(EntityPlayerMP var0, double var1, double var3, double var5)
	{
		double var7;

		if (var0.SHPAPI != null)
		{
			var7 = var0.SHPAPI.getDistanceSq(var1, var3, var5);
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

	public ServerPlayerBase GetOverwrittenGetDistanceSq(ServerPlayerBase var1)
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

	public static float getBrightness(EntityPlayerMP var0, float var1)
	{
		float var2;

		if (var0.SHPAPI != null)
		{
			var2 = var0.SHPAPI.getBrightness(var1);
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

	public ServerPlayerBase GetOverwrittenGetBrightness(ServerPlayerBase var1)
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

	public static float getEyeHeight(EntityPlayerMP var0)
	{
		float var1;

		if (var0.SHPAPI != null)
		{
			var1 = var0.SHPAPI.getEyeHeight();
		} else
		{
			var1 = var0.localGetEyeHeight();
		}

		return var1;
	}

	public float getEyeHeight()
	{
		if (this.beforeGetEyeHeightHooks != null)
		{
			for (int var1 = this.beforeGetEyeHeightHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeGetEyeHeightHooks[var1].beforeGetEyeHeight();
			}
		}

		float var3;

		if (this.overrideGetEyeHeightHooks != null)
		{
			var3 = this.overrideGetEyeHeightHooks[this.overrideGetEyeHeightHooks.length - 1].getEyeHeight();
		} else
		{
			var3 = this.player.localGetEyeHeight();
		}

		if (this.afterGetEyeHeightHooks != null)
		{
			for (int var2 = 0; var2 < this.afterGetEyeHeightHooks.length; ++var2)
			{
				this.afterGetEyeHeightHooks[var2].afterGetEyeHeight();
			}
		}

		return var3;
	}

	public ServerPlayerBase GetOverwrittenGetEyeHeight(ServerPlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideGetEyeHeightHooks.length; ++var2)
		{
			if (this.overrideGetEyeHeightHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideGetEyeHeightHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static float getSpeedModifier(EntityPlayerMP var0)
	{
		float var1;

		if (var0.SHPAPI != null)
		{
			var1 = var0.SHPAPI.getSpeedModifier();
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

	public ServerPlayerBase GetOverwrittenGetSpeedModifier(ServerPlayerBase var1)
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

	public static void heal(EntityPlayerMP var0, int var1)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.heal(var1);
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

	public ServerPlayerBase GetOverwrittenHeal(ServerPlayerBase var1)
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

	public static boolean interact(EntityPlayerMP var0, EntityPlayer var1)
	{
		boolean var2;

		if (var0.SHPAPI != null)
		{
			var2 = var0.SHPAPI.interact(var1);
		} else
		{
			var2 = var0.localInteract(var1);
		}

		return var2;
	}

	public boolean interact(EntityPlayer var1)
	{
		if (this.beforeInteractHooks != null)
		{
			for (int var2 = this.beforeInteractHooks.length - 1; var2 >= 0; --var2)
			{
				this.beforeInteractHooks[var2].beforeInteract(var1);
			}
		}

		boolean var4;

		if (this.overrideInteractHooks != null)
		{
			var4 = this.overrideInteractHooks[this.overrideInteractHooks.length - 1].interact(var1);
		} else
		{
			var4 = this.player.localInteract(var1);
		}

		if (this.afterInteractHooks != null)
		{
			for (int var3 = 0; var3 < this.afterInteractHooks.length; ++var3)
			{
				this.afterInteractHooks[var3].afterInteract(var1);
			}
		}

		return var4;
	}

	public ServerPlayerBase GetOverwrittenInteract(ServerPlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideInteractHooks.length; ++var2)
		{
			if (this.overrideInteractHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideInteractHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static boolean isEntityInsideOpaqueBlock(EntityPlayerMP var0)
	{
		boolean var1;

		if (var0.SHPAPI != null)
		{
			var1 = var0.SHPAPI.isEntityInsideOpaqueBlock();
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

	public ServerPlayerBase GetOverwrittenIsEntityInsideOpaqueBlock(ServerPlayerBase var1)
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

	public static boolean isInWater(EntityPlayerMP var0)
	{
		boolean var1;

		if (var0.SHPAPI != null)
		{
			var1 = var0.SHPAPI.isInWater();
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

	public ServerPlayerBase GetOverwrittenIsInWater(ServerPlayerBase var1)
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

	public static boolean isInsideOfMaterial(EntityPlayerMP var0, Material var1)
	{
		boolean var2;

		if (var0.SHPAPI != null)
		{
			var2 = var0.SHPAPI.isInsideOfMaterial(var1);
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

	public ServerPlayerBase GetOverwrittenIsInsideOfMaterial(ServerPlayerBase var1)
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

	public static boolean isOnLadder(EntityPlayerMP var0)
	{
		boolean var1;

		if (var0.SHPAPI != null)
		{
			var1 = var0.SHPAPI.isOnLadder();
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

	public ServerPlayerBase GetOverwrittenIsOnLadder(ServerPlayerBase var1)
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

	public static boolean isPlayerSleeping(EntityPlayerMP var0)
	{
		boolean var1;

		if (var0.SHPAPI != null)
		{
			var1 = var0.SHPAPI.isPlayerSleeping();
		} else
		{
			var1 = var0.localIsPlayerSleeping();
		}

		return var1;
	}

	public boolean isPlayerSleeping()
	{
		if (this.beforeIsPlayerSleepingHooks != null)
		{
			for (int var1 = this.beforeIsPlayerSleepingHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeIsPlayerSleepingHooks[var1].beforeIsPlayerSleeping();
			}
		}

		boolean var3;

		if (this.overrideIsPlayerSleepingHooks != null)
		{
			var3 = this.overrideIsPlayerSleepingHooks[this.overrideIsPlayerSleepingHooks.length - 1].isPlayerSleeping();
		} else
		{
			var3 = this.player.localIsPlayerSleeping();
		}

		if (this.afterIsPlayerSleepingHooks != null)
		{
			for (int var2 = 0; var2 < this.afterIsPlayerSleepingHooks.length; ++var2)
			{
				this.afterIsPlayerSleepingHooks[var2].afterIsPlayerSleeping();
			}
		}

		return var3;
	}

	public ServerPlayerBase GetOverwrittenIsPlayerSleeping(ServerPlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideIsPlayerSleepingHooks.length; ++var2)
		{
			if (this.overrideIsPlayerSleepingHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideIsPlayerSleepingHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void jump(EntityPlayerMP var0)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.jump();
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

	public ServerPlayerBase GetOverwrittenJump(ServerPlayerBase var1)
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

	public static void moveEntity(EntityPlayerMP var0, double var1, double var3, double var5)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.moveEntity(var1, var3, var5);
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

	public ServerPlayerBase GetOverwrittenMoveEntity(ServerPlayerBase var1)
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

	public static void moveEntityWithHeading(EntityPlayerMP var0, float var1, float var2)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.moveEntityWithHeading(var1, var2);
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

	public ServerPlayerBase GetOverwrittenMoveEntityWithHeading(ServerPlayerBase var1)
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

	public static void moveFlying(EntityPlayerMP var0, float var1, float var2, float var3)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.moveFlying(var1, var2, var3);
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

	public ServerPlayerBase GetOverwrittenMoveFlying(ServerPlayerBase var1)
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

	public static void onDeath(EntityPlayerMP var0, DamageSource var1)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.onDeath(var1);
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

	public ServerPlayerBase GetOverwrittenOnDeath(ServerPlayerBase var1)
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

	public static void onLivingUpdate(EntityPlayerMP var0)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.onLivingUpdate();
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

	public ServerPlayerBase GetOverwrittenOnLivingUpdate(ServerPlayerBase var1)
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

	public static void onKillEntity(EntityPlayerMP var0, EntityLiving var1)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.onKillEntity(var1);
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

	public ServerPlayerBase GetOverwrittenOnKillEntity(ServerPlayerBase var1)
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

	public static void onUpdate(EntityPlayerMP var0)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.onUpdate();
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

	public ServerPlayerBase GetOverwrittenOnUpdate(ServerPlayerBase var1)
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

	public static void onUpdateEntity(EntityPlayerMP var0)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.onUpdateEntity();
		} else
		{
			var0.localOnUpdateEntity();
		}
	}

	public void onUpdateEntity()
	{
		int var1;

		if (this.beforeOnUpdateEntityHooks != null)
		{
			for (var1 = this.beforeOnUpdateEntityHooks.length - 1; var1 >= 0; --var1)
			{
				this.beforeOnUpdateEntityHooks[var1].beforeOnUpdateEntity();
			}
		}

		if (this.overrideOnUpdateEntityHooks != null)
		{
			this.overrideOnUpdateEntityHooks[this.overrideOnUpdateEntityHooks.length - 1].onUpdateEntity();
		} else
		{
			this.player.localOnUpdateEntity();
		}

		if (this.afterOnUpdateEntityHooks != null)
		{
			for (var1 = 0; var1 < this.afterOnUpdateEntityHooks.length; ++var1)
			{
				this.afterOnUpdateEntityHooks[var1].afterOnUpdateEntity();
			}
		}
	}

	public ServerPlayerBase GetOverwrittenOnUpdateEntity(ServerPlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideOnUpdateEntityHooks.length; ++var2)
		{
			if (this.overrideOnUpdateEntityHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideOnUpdateEntityHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void readEntityFromNBT(EntityPlayerMP var0, NBTTagCompound var1)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.readEntityFromNBT(var1);
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

	public ServerPlayerBase GetOverwrittenReadEntityFromNBT(ServerPlayerBase var1)
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

	public static void setDead(EntityPlayerMP var0)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.setDead();
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

	public ServerPlayerBase GetOverwrittenSetDead(ServerPlayerBase var1)
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

	public static void setPosition(EntityPlayerMP var0, double var1, double var3, double var5)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.setPosition(var1, var3, var5);
		} else
		{
			var0.localSetPosition(var1, var3, var5);
		}
	}

	public void setPosition(double var1, double var3, double var5)
	{
		int var7;

		if (this.beforeSetPositionHooks != null)
		{
			for (var7 = this.beforeSetPositionHooks.length - 1; var7 >= 0; --var7)
			{
				this.beforeSetPositionHooks[var7].beforeSetPosition(var1, var3, var5);
			}
		}

		if (this.overrideSetPositionHooks != null)
		{
			this.overrideSetPositionHooks[this.overrideSetPositionHooks.length - 1].setPosition(var1, var3, var5);
		} else
		{
			this.player.localSetPosition(var1, var3, var5);
		}

		if (this.afterSetPositionHooks != null)
		{
			for (var7 = 0; var7 < this.afterSetPositionHooks.length; ++var7)
			{
				this.afterSetPositionHooks[var7].afterSetPosition(var1, var3, var5);
			}
		}
	}

	public ServerPlayerBase GetOverwrittenSetPosition(ServerPlayerBase var1)
	{
		for (int var2 = 0; var2 < this.overrideSetPositionHooks.length; ++var2)
		{
			if (this.overrideSetPositionHooks[var2] == var1)
			{
				if (var2 == 0)
				{
					return null;
				}

				return this.overrideSetPositionHooks[var2 - 1];
			}
		}

		return var1;
	}

	public static void updateEntityActionState(EntityPlayerMP var0)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.updateEntityActionState();
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

	public ServerPlayerBase GetOverwrittenUpdateEntityActionState(ServerPlayerBase var1)
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

	public static void writeEntityToNBT(EntityPlayerMP var0, NBTTagCompound var1)
	{
		if (var0.SHPAPI != null)
		{
			var0.SHPAPI.writeEntityToNBT(var1);
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

	public ServerPlayerBase GetOverwrittenWriteEntityToNBT(ServerPlayerBase var1)
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
