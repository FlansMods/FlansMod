package com.flansmod.client.handlers;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.api.IControllable;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.gui.teams.GuiLandingPage;
import com.flansmod.client.gui.teams.GuiTeamScores;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.client.model.GunAnimations.LookAtState;
import com.flansmod.client.util.FlansKeyConflictContext;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.network.PacketReload;
import com.flansmod.common.network.PacketRequestDebug;

@SideOnly(value = Side.CLIENT)
public class KeyInputHandler
{
	public static KeyBinding downKey = new KeyBinding("key.pitchDown.desc",
			FlansKeyConflictContext.VEHICLE,
			Keyboard.KEY_LCONTROL,
			"key.flansmod.category");
	public static KeyBinding vehicleMenuKey = new KeyBinding("key.vehicleMenu.desc",
			FlansKeyConflictContext.VEHICLE,
			Keyboard.KEY_M,
			"key.flansmod.category");
	public static KeyBinding bombKey = new KeyBinding("key.dropBomb.desc",
			FlansKeyConflictContext.VEHICLE,
			Keyboard.KEY_B,
			"key.flansmod.category");
	public static KeyBinding gunKey = new KeyBinding("key.fireVehicleGuns.desc",
			FlansKeyConflictContext.VEHICLE,
			Keyboard.KEY_V,
			"key.flansmod.category");
	public static KeyBinding controlSwitchKey = new KeyBinding("key.switchControlMode.desc",
			FlansKeyConflictContext.VEHICLE,
			Keyboard.KEY_C,
			"key.flansmod.category");
	public static KeyBinding reloadKey = new KeyBinding("key.reload.desc",
			FlansKeyConflictContext.GUN,
			Keyboard.KEY_R,
			"key.flansmod.category");
	public static KeyBinding teamsMenuKey = new KeyBinding("key.teamsMenu.desc",
			KeyConflictContext.UNIVERSAL,
			Keyboard.KEY_G,
			"key.flansmod.category");
	public static KeyBinding teamsScoresKey = new KeyBinding("key.teamsScores.desc",
			KeyConflictContext.UNIVERSAL,
			Keyboard.KEY_H,
			"key.flansmod.category");
	public static KeyBinding leftRollKey = new KeyBinding("key.rollLeft.desc",
			FlansKeyConflictContext.VEHICLE,
			Keyboard.KEY_Z,
			"key.flansmod.category");
	public static KeyBinding rightRollKey = new KeyBinding("Roll right",
			FlansKeyConflictContext.VEHICLE,
			Keyboard.KEY_X,
			"key.flansmod.category");
	public static KeyBinding gearKey = new KeyBinding("key.toggleLandingGear.desc",
			FlansKeyConflictContext.VEHICLE,
			Keyboard.KEY_L,
			"key.flansmod.category");
	public static KeyBinding doorKey = new KeyBinding("key.toggleDoors.desc",
			FlansKeyConflictContext.VEHICLE,
			Keyboard.KEY_K,
			"key.flansmod.category");
	public static KeyBinding modeKey = new KeyBinding("key.switchMovementMode.desc",
			FlansKeyConflictContext.VEHICLE,
			Keyboard.KEY_J,
			"key.flansmod.category");
	public static KeyBinding lookAtGunKey = new KeyBinding("key.lookAtGun.desc",
			FlansKeyConflictContext.GUN,
			Keyboard.KEY_L,
			"key.flansmod.category");
	public static KeyBinding debugKey = new KeyBinding("key.debug.desc",
			KeyConflictContext.UNIVERSAL,
			Keyboard.KEY_F10,
			"key.flansmod.category");
	public static KeyBinding reloadModelsKey = new KeyBinding("key.reloadModels.desc",
			KeyConflictContext.UNIVERSAL,
			Keyboard.KEY_F9,
			"key.flansmod.category");
	public static KeyBinding toggleCameraPerspective = new KeyBinding("key.toggleCameraPerspective.desc",
			FlansKeyConflictContext.VEHICLE,
			Keyboard.KEY_F5,
			"key.flansmod.category");
	public static KeyBinding primaryVehicleInteract = new KeyBinding("key.primaryVehicleInteract.desc",
			FlansKeyConflictContext.VEHICLE,
			Minecraft.getMinecraft().gameSettings.keyBindAttack.getKeyCode(),
			"key.flansmod.category");
	public static KeyBinding secondaryVehicleInteract = new KeyBinding("key.secondaryVehicleInteract.desc",
			FlansKeyConflictContext.VEHICLE,
			Minecraft.getMinecraft().gameSettings.keyBindUseItem.getKeyCode(),
			"key.flansmod.category");
	
	private Minecraft mc;
	
	KeyInputHandler()
	{
		ClientRegistry.registerKeyBinding(downKey);
		ClientRegistry.registerKeyBinding(vehicleMenuKey);
		ClientRegistry.registerKeyBinding(bombKey);
		ClientRegistry.registerKeyBinding(gunKey);
		ClientRegistry.registerKeyBinding(controlSwitchKey);
		ClientRegistry.registerKeyBinding(reloadKey);
		ClientRegistry.registerKeyBinding(teamsMenuKey);
		ClientRegistry.registerKeyBinding(teamsScoresKey);
		ClientRegistry.registerKeyBinding(leftRollKey);
		ClientRegistry.registerKeyBinding(rightRollKey);
		ClientRegistry.registerKeyBinding(gearKey);
		ClientRegistry.registerKeyBinding(doorKey);
		ClientRegistry.registerKeyBinding(modeKey);
		ClientRegistry.registerKeyBinding(lookAtGunKey);
		ClientRegistry.registerKeyBinding(debugKey);
		ClientRegistry.registerKeyBinding(reloadModelsKey);
		ClientRegistry.registerKeyBinding(primaryVehicleInteract);
		ClientRegistry.registerKeyBinding(secondaryVehicleInteract);
		
		mc = Minecraft.getMinecraft();
	}
	
	void checkTickKeys()
	{
		EntityPlayer player = mc.player;
		if(player == null)
		{
			return;
		}
		
		Entity ridingEntity = player.getRidingEntity();
		if(ridingEntity instanceof IControllable)
		{
			IControllable controllable = (IControllable)ridingEntity;
			if(mc.gameSettings.keyBindForward.isKeyDown())
				controllable.pressKey(0, player, false);
			if(mc.gameSettings.keyBindBack.isKeyDown())
				controllable.pressKey(1, player, false);
			if(mc.gameSettings.keyBindLeft.isKeyDown())
				controllable.pressKey(2, player, false);
			if(mc.gameSettings.keyBindRight.isKeyDown())
				controllable.pressKey(3, player, false);
			if(mc.gameSettings.keyBindJump.isKeyDown())
				controllable.pressKey(4, player, false);
			if(downKey.isKeyDown())
				controllable.pressKey(5, player, false);
			if(secondaryVehicleInteract.isKeyDown())
				controllable.pressKey(8, player, false);
			if(primaryVehicleInteract.isKeyDown())
				controllable.pressKey(9, player, false);
			if(leftRollKey.isKeyDown())
				controllable.pressKey(11, player, false);
			if(rightRollKey.isKeyDown())
				controllable.pressKey(12, player, false);
		}
	}
	
	void checkEventKeys()
	{
		if(FMLClientHandler.instance().isGUIOpen(GuiChat.class) || mc.currentScreen != null)
			return;
		
		EntityPlayer player = mc.player;
		
		if(teamsMenuKey.isPressed())
		{
			mc.displayGuiScreen(new GuiLandingPage());
			return;
		}
		if(teamsScoresKey.isPressed())
		{
			mc.displayGuiScreen(new GuiTeamScores());
			return;
		}
		if(reloadKey.isPressed())
		{
			PlayerData data = PlayerHandler.getPlayerData(player, Side.CLIENT);
			ItemStack stack = player.getHeldItemMainhand();
			
			if(data.shootTimeRight <= 0.0f)
			{
				if(stack.getItem() instanceof ItemGun)
				{
					ItemGun item = (ItemGun)stack.getItem();
					GunType type = item.GetType();
					
					if(item.CanReload(stack, player.inventory))
					{
						FlansMod.getPacketHandler().sendToServer(new PacketReload(EnumHand.MAIN_HAND, true));
						
						// Set player shoot delay to be the reload delay
						// Set both gun delays to avoid reloading two guns at once
						data.shootTimeRight = data.shootTimeLeft = (int)type.getReloadTime(stack);
						
						GunAnimations animations = FlansModClient.getGunAnimations(player, EnumHand.MAIN_HAND);
						
						int pumpDelay = type.model == null ? 0 : type.model.pumpDelayAfterReload;
						int pumpTime = type.model == null ? 1 : type.model.pumpTime;
						animations.doReload(type.reloadTime, pumpDelay, pumpTime);
						
						data.reloadingRight = true;
						data.burstRoundsRemainingRight = 0;
					}
				}
			}
			return;
		}
		if(lookAtGunKey.isPressed())
		{
			FlansModClient.getGunAnimations(mc.player, EnumHand.MAIN_HAND).lookAt = LookAtState.TILT1;
			FlansModClient.getGunAnimations(mc.player, EnumHand.OFF_HAND).lookAt = LookAtState.TILT1;
			return;
		}
		if(debugKey.isPressed())
		{
			if(FlansMod.DEBUG)
				FlansMod.DEBUG = false;
			else
			{
				FlansMod.packetHandler.sendToServer(new PacketRequestDebug());
			}
			return;
		}
		if(reloadModelsKey.isPressed())
		{
			FlansModClient.reloadModels(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT));
			return;
		}
		
		if(player == null)
		{
			return;
		}
		
		Entity ridingEntity = player.getRidingEntity();
		if(ridingEntity instanceof IControllable)
		{
			IControllable controllable = (IControllable)ridingEntity;
			if(mc.gameSettings.keyBindSneak.isPressed())
				controllable.pressKey(6, player, true);
			if(vehicleMenuKey.isPressed())
				controllable.pressKey(7, player, true);
			if(primaryVehicleInteract.isPressed())
				controllable.pressKey(9, player, true);
			if(secondaryVehicleInteract.isPressed())
				controllable.pressKey(8, player, true);
			if(controlSwitchKey.isPressed())
				controllable.pressKey(10, player, true);
			if(gearKey.isPressed())
				controllable.pressKey(13, player, true);
			if(doorKey.isPressed())
				controllable.pressKey(14, player, true);
			if(modeKey.isPressed())
				controllable.pressKey(15, player, true);
			if(toggleCameraPerspective.isKeyDown())
				controllable.pressKey(18, player, true);
		}
	}
}
