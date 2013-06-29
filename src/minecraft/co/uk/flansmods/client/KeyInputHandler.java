package co.uk.flansmods.client;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

import org.lwjgl.input.Keyboard;

import co.uk.flansmods.api.IControllable;
import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

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
	protected static KeyBinding teamsMenuKey = new KeyBinding("Teams Menu Key", Keyboard.KEY_G);
	protected static KeyBinding teamsScoresKey = new KeyBinding("Teams Scores Key", Keyboard.KEY_H);
	protected static KeyBinding leftRollKey = new KeyBinding("Roll Left Key", Keyboard.KEY_BACKSLASH);
	protected static KeyBinding rightRollKey = new KeyBinding("Roll Right Key", Keyboard.KEY_X);
    protected static KeyBinding gearKey = new KeyBinding("Change Gear Status Key", Keyboard.KEY_L);
    protected static KeyBinding doorKey = new KeyBinding("Change Door Status Key", Keyboard.KEY_K);
    protected static KeyBinding wingKey = new KeyBinding("Change Wing Position Key", Keyboard.KEY_J);
    protected static KeyBinding trimKey = new KeyBinding("Trim Key", Keyboard.KEY_O);
    protected static KeyBinding parkKey = new KeyBinding("Park Key", Keyboard.KEY_P);

	Minecraft mc;
	
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
				controlSwitchKey,
				leftRollKey,
				rightRollKey,
                gearKey,
                doorKey,
                wingKey,
                trimKey,
                parkKey,
				teamsMenuKey,
				teamsScoresKey
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
				false, // control switch
				true, //left Roll
				true, //right Roll
                false, // gear
                false, // door
                false, //wing
                false, // trim button
                false, //park
				false, // teams menu
				false // teams scores menu
						});
		
		mc = Minecraft.getMinecraft();
	}

	@Override
	public String getLabel()
	{
		return "Flan Control key Ticker";
	}

	@Override
	public void keyDown(EnumSet<TickType> types, KeyBinding kb,	boolean tickEnd, boolean isRepeat)
	{
		if(mc.currentScreen != null || tickEnd)
			return;
		
		int keyNum = -1;
		boolean handled = true;
		
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
		else if(kb == leftRollKey)
			keyNum = 11;
		else if(kb == rightRollKey)
			keyNum = 12;
        else if(kb == gearKey)
            keyNum = 13;
        else if(kb == doorKey)
            keyNum = 14;
        else if(kb == wingKey)
            keyNum = 15;
        else if(kb == trimKey)
            keyNum = 16;
        else if(kb == parkKey)
            keyNum = 17;
		else if(kb == teamsMenuKey)
		{
			mc.displayGuiScreen(new GuiTeamSelect());
			return;
		}
		else if(kb == teamsScoresKey)
		{
			mc.displayGuiScreen(new GuiTeamScores());
			return;
		}
		else
			handled = false;
		
		
		
		EntityPlayer player = mc.thePlayer;
		Entity entityTest  = player.ridingEntity;
		
		if (entityTest != null && entityTest instanceof IControllable && handled == true)
		{
			IControllable entity = (IControllable)entityTest;
			if (kb.keyCode == mc.gameSettings.keyBindInventory.keyCode)
			{
				mc.gameSettings.keyBindInventory.pressed = false;
				mc.gameSettings.keyBindInventory.pressTime = 0;
			}
			handled = entity.pressKey(keyNum, player);
			
			//if (handled)
			//	PacketDispatcher.sendPacketToServer(PacketVehicleControl.buildVehicleControlButton(keyNum));
		}
		else
			handled = false;
		
		
		if (handled == true)
			return;
		
		for (KeyBinding key : mc.gameSettings.keyBindings )
		{
			if (kb.keyCode == key.keyCode && key != kb)
			{
				key.pressed = true;
				key.pressTime = 1;
			}
		}
	}

	@Override
	public void keyUp(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd)
	{
		if (tickEnd)
			return;
		
		for (KeyBinding key : mc.gameSettings.keyBindings)
		{
			if (kb.keyCode == key.keyCode && key != kb)
				key.pressed = false;
		}
	}

	@Override
	public EnumSet<TickType> ticks()
	{
		return EnumSet.of(TickType.CLIENT);
	}

}
