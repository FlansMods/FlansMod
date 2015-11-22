package com.flansmod.client;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.api.IControllable;
import com.flansmod.client.gui.GuiTeamScores;
import com.flansmod.client.gui.GuiTeamSelect;
import com.flansmod.common.FlansMod;
import com.flansmod.common.network.PacketReload;

@SideOnly(value = Side.CLIENT)
public class KeyInputHandler
{  
	//public static KeyBinding accelerateKey = new KeyBinding("Accelerate Key", Keyboard.KEY_W, "Flan's Mod");
	//public static KeyBinding decelerateKey = new KeyBinding("Decelerate Key", Keyboard.KEY_S, "Flan's Mod");
	//public static KeyBinding leftKey = new KeyBinding("Left Key", Keyboard.KEY_A, "Flan's Mod");
	//public static KeyBinding rightKey = new KeyBinding("Right Key", Keyboard.KEY_D, "Flan's Mod");
	//public static KeyBinding upKey = new KeyBinding("Up Key", Keyboard.KEY_SPACE, "Flan's Mod");
	public static KeyBinding downKey = new KeyBinding("Down key", Keyboard.KEY_LCONTROL, "Flan's Mod");
	//public static KeyBinding exitKey = new KeyBinding("Exit Key", Keyboard.KEY_LSHIFT, "Flan's Mod");
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
    //public static KeyBinding trimKey = new KeyBinding("Trim Key", Keyboard.KEY_O, "Flan's Mod");
    public static KeyBinding debugKey = new KeyBinding("Debug Key", Keyboard.KEY_F10, "Flan's Mod");
    public static KeyBinding reloadModelsKey = new KeyBinding("Reload Models Key", Keyboard.KEY_F9, "Flan's Mod");
    //public static KeyBinding zoomKey = new KeyBinding("Zoom Key", 2 - 100, "Flan's Mod");

	Minecraft mc;
	
	public KeyInputHandler()
	{
		//ClientRegistry.registerKeyBinding(accelerateKey);
		//ClientRegistry.registerKeyBinding(decelerateKey);
		//ClientRegistry.registerKeyBinding(leftKey);
		//ClientRegistry.registerKeyBinding(rightKey);
		//ClientRegistry.registerKeyBinding(upKey);
		ClientRegistry.registerKeyBinding(downKey);
		//ClientRegistry.registerKeyBinding(exitKey);
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
		//ClientRegistry.registerKeyBinding(trimKey);
		ClientRegistry.registerKeyBinding(debugKey);
		ClientRegistry.registerKeyBinding(reloadModelsKey);
		//ClientRegistry.registerKeyBinding(zoomKey);
		
		mc = Minecraft.getMinecraft();
	}
	
	@SubscribeEvent
	public void onKeyInput(KeyInputEvent event)
	{
		if(FMLClientHandler.instance().isGUIOpen(GuiChat.class) || mc.currentScreen != null)
			return;
		
		EntityPlayer player = mc.thePlayer;
		Entity ridingEntity = player.ridingEntity;
		
		//Handle universal keys
		if(teamsMenuKey.isPressed())
		{
			mc.displayGuiScreen(new GuiTeamSelect());
			return;
		}
		if(teamsScoresKey.isPressed())
		{
			mc.displayGuiScreen(new GuiTeamScores());
			return;
		}
		if(reloadKey.isPressed() && FlansModClient.shootTime(false) <= 0)
		{
			FlansMod.getPacketHandler().sendToServer(new PacketReload(false));
			return;
		}
		if(debugKey.isPressed())
		{
			FlansMod.DEBUG = !FlansMod.DEBUG;
		}
		if(reloadModelsKey.isPressed())
		{
			FlansModClient.reloadModels(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT));
		}
		
		//Handle driving keys
		if(ridingEntity instanceof IControllable)
		{
			IControllable riding = (IControllable)ridingEntity;
			if(mc.gameSettings.keyBindForward.isPressed())//if(accelerateKey.isPressed())
				riding.pressKey(0, player);
			if(mc.gameSettings.keyBindBack.isPressed())//if(decelerateKey.isPressed())
				riding.pressKey(1, player);
			if(mc.gameSettings.keyBindLeft.isPressed())//if(leftKey.isPressed())
				riding.pressKey(2, player);
			if(mc.gameSettings.keyBindRight.isPressed())//if(rightKey.isPressed())
				riding.pressKey(3, player);
			if(mc.gameSettings.keyBindJump.isPressed())//if(upKey.isPressed())
				riding.pressKey(4, player);
			if(downKey.isPressed())
				riding.pressKey(5, player);
			if(mc.gameSettings.keyBindSneak.isPressed())//if(exitKey.isPressed())
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
			//if(trimKey.isPressed())
			//	riding.pressKey(16, player);
			
			/*
			for(KeyBinding key : mc.gameSettings.keyBindings )
			{
				if(key.isPressed())
				{
					key.pressed = true;
					key.pressTime = 1;
				}
			}
			*/
		}
	}
}
