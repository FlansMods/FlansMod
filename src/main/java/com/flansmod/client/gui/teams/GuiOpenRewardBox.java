package com.flansmod.client.gui.teams;

import java.util.ArrayList;
import java.util.Random;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.client.FMLClientHandler;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.client.teams.ClientTeamsData;
import com.flansmod.common.FlansMod;
import com.flansmod.common.ModuloHelper;
import com.flansmod.common.guns.Paintjob;
import com.flansmod.common.teams.LoadoutPool;
import com.flansmod.common.teams.PlayerRankData;
import com.flansmod.common.teams.RewardBox;

public class GuiOpenRewardBox extends GuiTeamsBase
{
	private enum EnumPageState
	{
		SPINNING,
		READY_TO_SLOW_DOWN,
		SLOWING_DOWN,
		STOPPED,
	}
	
	/**
	 * The background image
	 */
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/OpenCrates.png");
	private static final int WIDTH = 196, HEIGHT = 200;
	private static final int WAITING_FOR_SERVER = -1;
	private static int spinTime = 30, slowdownTime = 130;
	private static long timeOfLastSound = 0;
	private static Random gunScrambler = new Random();
	private float spinSpeed = 0.555555555f;
	
	private ArrayList<Paintjob> options = new ArrayList<>();
	private int target = WAITING_FOR_SERVER;
	private EnumPageState state = EnumPageState.SPINNING;
	private int timeLeftInState = spinTime;
	private float spinner = 0.0f;
	private GuiButton doneButton;
	
	public void SetTarget(Paintjob paint)
	{
		for(int i = 0; i < options.size(); i++)
		{
			if(options.get(i) == paint)
			{
				target = i;
				return;
			}
		}
		FlansMod.Assert(false, "Could not find paintjob we just unlocked!");
	}
	
	@Override
	public void initGui()
	{
		super.initGui();
		
		ScaledResolution scaledresolution = new ScaledResolution(mc);
		int w = scaledresolution.getScaledWidth();
		int h = scaledresolution.getScaledHeight();
		guiOriginX = w / 2 - WIDTH / 2;
		guiOriginY = h / 2 - HEIGHT / 2;
		
		doneButton = new GuiButton(0, width / 2 - 20, guiOriginY + 170, 40, 20, "Done");
		doneButton.enabled = false;
		buttonList.add(doneButton);
	}
	
	@Override
	protected void actionPerformed(GuiButton button)
	{
		if(button.id == 0)
		{
			ClientTeamsData.OpenLandingPage();
		}
	}
	
	public GuiOpenRewardBox(RewardBox rewardBox)
	{
		super();
		state = EnumPageState.SPINNING;
		timeLeftInState = spinTime;
		target = WAITING_FOR_SERVER;
		
		ArrayList<Paintjob> temp = new ArrayList<>(rewardBox.paintjobs);
		
		int size = rewardBox.paintjobs.size();
		for(int i = 0; i < size; i++)
		{
			int random = gunScrambler.nextInt(size - i);
			options.add(temp.get(random));
			temp.remove(random);
		}
		
		spinSpeed = InitialVelocity();
	}
	
	@Override
	public void updateScreen()
	{
		super.updateScreen();
		
		timeLeftInState--;
		
		switch(state)
		{
			case SPINNING:
			{
				SimulateSpinner();
				// Make sure we have our target from the server before trying to spin down on to it
				if(timeLeftInState <= 0 && target != WAITING_FOR_SERVER)
				{
					SwitchToState(EnumPageState.READY_TO_SLOW_DOWN);
					timeLeftInState = slowdownTime;
				}
				break;
			}
			case READY_TO_SLOW_DOWN:
			{
				SimulateSpinner();
				float difference = MathHelper.abs(spinner - target);
				if(difference < 1.0f)
				{
					// We're here (ish). Fix the position and then spin round one last time, slowing down as we go.
					spinner = target;
					timeLeftInState = slowdownTime;
					SwitchToState(EnumPageState.SLOWING_DOWN);
				}
				break;
			}
			case SLOWING_DOWN:
			{
				spinSpeed += Acceleration();
				if(spinSpeed <= -Acceleration())
				{
					spinSpeed = 0.0f;
					FMLClientHandler.instance().getClient().getSoundHandler().playSound(
							new PositionedSoundRecord(FlansModResourceHandler.getSoundEvent("UnlockNotch"), SoundCategory.NEUTRAL, 1.0F, 2.0f,
									(float)mc.player.posX, (float)mc.player.posY, (float)mc.player.posZ));
					SwitchToState(EnumPageState.STOPPED);
				}
				int timeInState = slowdownTime - timeLeftInState;
				int preIndex = MathHelper.floor(spinner) % options.size();
				spinner = target + timeInState * InitialVelocity() + 0.5f * Acceleration() * timeInState * timeInState;
				int postIndex = MathHelper.floor(spinner) % options.size();
				
				
				break;
				
			}
			case STOPPED:
			{
				spinner = target;
				doneButton.enabled = true;
				break;
			}
			
			default:
				break;
		}
	}
	
	private void SimulateSpinner()
	{
		int preIndex = MathHelper.floor(spinner) % options.size();
		spinner += spinSpeed;
		int postIndex = MathHelper.floor(spinner) % options.size();
		
		if(spinner > options.size())
		{
			spinner -= options.size();
		}
	}
	
	private float InitialVelocity()
	{
		return (2.0f / (float)slowdownTime) * options.size();
	}
	
	private float Acceleration()
	{
		return -(InitialVelocity() * InitialVelocity()) / (2 * options.size());
	}
	
	private void SwitchToState(EnumPageState newState)
	{
		state = newState;
	}
	
	@Override
	public void drawScreen(int i, int j, float f)
	{
		int preIndex = MathHelper.floor(spinner) % options.size();
		int postIndex = MathHelper.floor(spinner + spinSpeed * f) % options.size();
		
		if(preIndex != postIndex && Minecraft.getSystemTime() - timeOfLastSound >= 80)
		{
			FMLClientHandler.instance().getClient().getSoundHandler().playSound(
					new PositionedSoundRecord(FlansModResourceHandler.getSoundEvent("UnlockNotch"), SoundCategory.NEUTRAL, 0.5F, 1.0f,
							(float)mc.player.posX, (float)mc.player.posY, (float)mc.player.posZ));
			timeOfLastSound = Minecraft.getSystemTime();
		}
		
		
		ScaledResolution scaledresolution = new ScaledResolution(mc);
		int w = scaledresolution.getScaledWidth();
		int h = scaledresolution.getScaledHeight();
		drawDefaultBackground();
		GL11.glEnable(3042 /*GL_BLEND*/);
		
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		guiOriginX = w / 2 - WIDTH / 2;
		guiOriginY = h / 2 - HEIGHT / 2;
		
		//Bind the background texture
		mc.renderEngine.bindTexture(texture);
		
		int textureX = 512;
		int textureY = 256;
		PlayerRankData data = ClientTeamsData.theRankData;
		LoadoutPool pool = ClientTeamsData.currentPool;
		
		if(data == null || pool == null)
		{
			FlansMod.log.warn("Problem in landing page!");
			return;
		}
		
		//Draw the background
		drawModalRectWithCustomSizedTexture(guiOriginX, guiOriginY, 0, 0, WIDTH, HEIGHT, textureX, textureY);
		
		int pixelOffset = ModuloHelper.modulo(MathHelper.floor(spinner * 18.0f), 18) - 18;
		
		drawModalRectWithCustomSizedTexture(guiOriginX + 9, guiOriginY + 101, 239 + pixelOffset + 10, 101, 180, 18, textureX, textureY);
		
		// Draw text
		drawCenteredString(fontRenderer, "Reward Box", guiOriginX + 98, guiOriginY + 12, 0xffffff);
		
		for(int n = 0; n < 10; n++)
		{
			int index = MathHelper.floor(spinner) - 4 + n;
			Paintjob paintjob = options.get(ModuloHelper.modulo(index, options.size()));
			
			ItemStack stack = new ItemStack(paintjob.parent.getItem(), 1, paintjob.ID);
			drawSlotInventory(stack, guiOriginX + 18 - 18 - pixelOffset + 18 * n, guiOriginY + 102);
		}
		
		for(int n = 0; n < 10; n++)
		{
			int index = MathHelper.floor(spinner) - 4 + n;
			Paintjob paintjob = options.get(ModuloHelper.modulo(index, options.size()));
			
			DrawRarityBackground(paintjob.rarity, guiOriginX + 18 - 18 - pixelOffset + 18 * n, guiOriginY + 102);
		}
		
		mc.renderEngine.bindTexture(texture);
		GlStateManager.disableDepth();
		drawModalRectWithCustomSizedTexture(guiOriginX + 0, guiOriginY + 93, 0, 93, 196, 34, textureX, textureY);
		GlStateManager.enableDepth();
		
		int currentIndex = MathHelper.floor(spinner) % options.size();
		ItemStack gunStack = new ItemStack(options.get(currentIndex).parent.item, 1, options.get(currentIndex).ID);
		DrawGun(gunStack, guiOriginX + 98, guiOriginY + 65, 60.0f);
		
		if(state == EnumPageState.STOPPED)
		{
			drawCenteredString(fontRenderer, "New paintjob unlocked!", guiOriginX + 98, guiOriginY + 130, 0xffffff);
			drawCenteredString(fontRenderer, options.get(target).parent.name, guiOriginX + 98, guiOriginY + 142, 0xffffff);
			drawCenteredString(fontRenderer, "\"" + options.get(target).iconName + "\"", guiOriginX + 98, guiOriginY + 154, 0xffffff);
		}
		
		super.drawScreen(i, j, f);
	}
	
	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}
}
