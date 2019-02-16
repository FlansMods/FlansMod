package com.flansmod.client.handlers;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.api.IControllable;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.gui.teams.GuiLandingPage;
import com.flansmod.client.gui.teams.GuiTeamScores;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.client.model.GunAnimations.LookAtState;
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
	public static KeyBinding downKey = new KeyBinding("Down key", Keyboard.KEY_LCONTROL, "Flan's Mod");
	public static KeyBinding inventoryKey = new KeyBinding("Inventory key", Keyboard.KEY_R, "Flan's Mod");
	public static KeyBinding bombKey = new KeyBinding("Bomb Key", Keyboard.KEY_V, "Flan's Mod");
	public static KeyBinding gunKey = new KeyBinding("Gun Key", Keyboard.KEY_B, "Flan's Mod");
	public static KeyBinding controlSwitchKey = new KeyBinding("Control Switch key", Keyboard.KEY_C, "Flan's Mod");
	public static KeyBinding reloadKey = new KeyBinding("Reload key", Keyboard.KEY_R, "Flan's Mod");
	public static KeyBinding teamsMenuKey = new KeyBinding("Teams Menu Key", Keyboard.KEY_G, "Flan's Mod");
	public static KeyBinding teamsScoresKey = new KeyBinding("Teams Scores Key", Keyboard.KEY_H, "Flan's Mod");
	public static KeyBinding leftRollKey = new KeyBinding("Roll Left Key", Keyboard.KEY_Z, "Flan's Mod");
	public static KeyBinding rightRollKey = new KeyBinding("Roll Right Key", Keyboard.KEY_X, "Flan's Mod");
	public static KeyBinding gearKey = new KeyBinding("Gear Up / Down Key", Keyboard.KEY_L, "Flan's Mod");
	public static KeyBinding doorKey = new KeyBinding("Door Open / Close Key", Keyboard.KEY_K, "Flan's Mod");
	public static KeyBinding modeKey = new KeyBinding("Mode Switch Key", Keyboard.KEY_J, "Flan's Mod");
	public static KeyBinding lookAtGunKey = new KeyBinding("Look at Gun", Keyboard.KEY_L, "Flan's Mod");
	public static KeyBinding debugKey = new KeyBinding("Debug Key", Keyboard.KEY_F10, "Flan's Mod");
	public static KeyBinding reloadModelsKey = new KeyBinding("Reload Models Key", Keyboard.KEY_F9, "Flan's Mod");
	
	private Minecraft mc;
	
	public KeyInputHandler()
	{
		ClientRegistry.registerKeyBinding(downKey);
		ClientRegistry.registerKeyBinding(inventoryKey);
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
		
		mc = Minecraft.getMinecraft();
	}
	
	public void CheckKeyInput(KeyInputEvent event)
	{
		if(FMLClientHandler.instance().isGUIOpen(GuiChat.class) || mc.currentScreen != null)
			return;
		
		EntityPlayer player = mc.player;
		Entity ridingEntity = player.getRidingEntity();
		
		//Handle universal keys
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
						
						//Set player shoot delay to be the reload delay
						//Set both gun delays to avoid reloading two guns at once
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
		}
		if(lookAtGunKey.isPressed())
		{
			FlansModClient.getGunAnimations(mc.player, EnumHand.MAIN_HAND).lookAt = LookAtState.TILT1;
			FlansModClient.getGunAnimations(mc.player, EnumHand.OFF_HAND).lookAt = LookAtState.TILT1;
		}
		if(debugKey.isPressed())
		{
			if(FlansMod.DEBUG)
				FlansMod.DEBUG = false;
			else
			{
				FlansMod.packetHandler.sendToServer(new PacketRequestDebug());
			}
		}
		if(reloadModelsKey.isPressed())
		{
			FlansModClient.reloadModels(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT));
		}
		
		//Handle driving keys
		if(ridingEntity instanceof IControllable)
		{
			IControllable riding = (IControllable)ridingEntity;
			if(mc.gameSettings.keyBindForward.isPressed())
				riding.pressKey(0, player);
			if(mc.gameSettings.keyBindBack.isPressed())
				riding.pressKey(1, player);
			if(mc.gameSettings.keyBindLeft.isPressed())
				riding.pressKey(2, player);
			if(mc.gameSettings.keyBindRight.isPressed())
				riding.pressKey(3, player);
			if(mc.gameSettings.keyBindJump.isPressed())
				riding.pressKey(4, player);
			if(downKey.isPressed())
				riding.pressKey(5, player);
			if(mc.gameSettings.keyBindSneak.isPressed())
				riding.pressKey(6, player);
			if(mc.gameSettings.keyBindInventory.isPressed() || inventoryKey.isPressed())
				riding.pressKey(7, player);
			if(bombKey.isPressed())
				riding.pressKey(8, player);
			if(gunKey.isPressed())
				riding.pressKey(9, player);
			if(controlSwitchKey.isPressed())
				riding.pressKey(10, player);
			if(leftRollKey.isPressed())
				riding.pressKey(11, player);
			if(rightRollKey.isPressed())
				riding.pressKey(12, player);
			if(gearKey.isPressed())
				riding.pressKey(13, player);
			if(doorKey.isPressed())
				riding.pressKey(14, player);
			if(modeKey.isPressed())
				riding.pressKey(15, player);
		}
	}
}
