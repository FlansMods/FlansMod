package co.uk.flansmods.client;

import java.util.EnumSet;

import org.lwjgl.input.Keyboard;

import co.uk.flansmods.common.EntityDriveable;

import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.GameSettings;
import net.minecraft.src.KeyBinding;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.common.asm.SideOnly;

@SideOnly(value = Side.CLIENT)
public class KeyInputHandler extends KeyHandler
{  
	protected static KeyBinding accelerateKey = new KeyBinding("Accelerate Key", Keyboard.KEY_W);
	protected static KeyBinding decelerateKey = new KeyBinding("Decelerate Key", Keyboard.KEY_S);
	protected static KeyBinding leftKey = new KeyBinding("Left Key", Keyboard.KEY_A);
	protected static KeyBinding rightKey = new KeyBinding("Right Key", Keyboard.KEY_D);
	protected static KeyBinding upKey = new KeyBinding("Up Key", Keyboard.KEY_SPACE);
	protected static KeyBinding downKey = new KeyBinding("Down key", Keyboard.KEY_LSHIFT);
	protected static KeyBinding exitKey = new KeyBinding("Exit Key", Keyboard.KEY_E);
	protected static KeyBinding inventoryKey = new KeyBinding("Inventory key", Keyboard.KEY_R);
	protected static KeyBinding bombKey = new KeyBinding("Bomb Key", Keyboard.KEY_V);
	protected static KeyBinding gunKey = new KeyBinding("Gun Key", Keyboard.KEY_LCONTROL);
	protected static KeyBinding controlSwitchKey = new KeyBinding("Control Switch key", Keyboard.KEY_C);
	
	GameSettings settings;

	public KeyInputHandler()
	{
		super(new KeyBinding[]
				{
				accelerateKey,
				decelerateKey,
				leftKey,
				rightKey,
				upKey,
				downKey,
				exitKey,
				inventoryKey,
				bombKey,
				gunKey,
				controlSwitchKey
				},
				new boolean[]
						{
				true, // accelerate key
				true, // decelerate
				true, // left
				true, // right
				true, // up
				true, // down
				false, // exit
				false, // inventory
				true, // bomb
				true, // gun
				false // control switch
						});
		settings = FMLClientHandler.instance().getClient().gameSettings; 
	}

	@Override
	public String getLabel()
	{
		return "Control key Ticker";
	}

	@Override
	public void keyDown(EnumSet<TickType> types, KeyBinding kb,	boolean tickEnd, boolean isRepeat)
	{
		for (KeyBinding key : settings.keyBindings )
		{
			if (kb.keyCode == key.keyCode)
				key.pressed =  kb.pressed = true;
		}
		
		int keyNum = 0;
		
		if(kb == accelerateKey)
			keyNum = 0;
		else if(kb == decelerateKey)
			keyNum = 1;
		else if(kb == leftKey)
			keyNum = 2;
		else if(kb == rightKey)
			keyNum = 3;
		else if(kb == upKey)
			keyNum = 4;
		else if(kb == downKey)
			keyNum = 5;
		else if(kb == exitKey)
			keyNum = 6;
		else if(kb == inventoryKey)
			keyNum = 7;
		else if(kb == bombKey)
			keyNum = 8;
		else if(kb == gunKey)
			keyNum = 9;
		else if(kb == controlSwitchKey)
			keyNum = 10;
		
		EntityPlayer player = FMLClientHandler.instance().getClient().thePlayer;
		if(player == null)
			return;
		Entity entityTest = player.ridingEntity;
		
		if (entityTest != null && entityTest instanceof EntityDriveable)
		{
			EntityDriveable driveable = (EntityDriveable) entityTest;
			driveable.pressKey(keyNum);
		}
	}

	@Override
	public void keyUp(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd)
	{
		for (KeyBinding key : settings.keyBindings )
		{
			if (kb.keyCode == key.keyCode)
				key.pressed =  kb.pressed = false;
		}
	}

	@Override
	public EnumSet<TickType> ticks()
	{
		return EnumSet.of(TickType.CLIENT);
	}

}
