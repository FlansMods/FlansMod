package co.uk.flansmods.client;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MouseHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import co.uk.flansmods.common.InfoType;
import co.uk.flansmods.common.driveables.EntityDriveable;
import co.uk.flansmods.common.guns.GunType;
import co.uk.flansmods.common.guns.ItemGun;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class TickHandlerClient implements ITickHandler
{
	public static final ResourceLocation gui = new ResourceLocation("FlansMod","textures/gui/gui.png");
	public static final ResourceLocation teamScores = new ResourceLocation("FlansMod","textures/gui/teamScores.png");
	public static final ResourceLocation zoomOverlay = new ResourceLocation("FlansMod","textures/gui/" + FlansModClient.zoomOverlay + ".png");
	
	public TickHandlerClient()
	{
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@ForgeSubscribe(priority = EventPriority.NORMAL)
	public void eventHandler(RenderGameOverlayEvent event)
	{
	    if(event.isCancelable() || event.type != ElementType.HOTBAR)
	    {      
	    	return;
	    }
		Minecraft mc = Minecraft.getMinecraft();
		ScaledResolution scaledresolution = new ScaledResolution(FlansModClient.minecraft.gameSettings, FlansModClient.minecraft.displayWidth, FlansModClient.minecraft.displayHeight);
		int i = scaledresolution.getScaledWidth();
		int j = scaledresolution.getScaledHeight();
		
		//Player ammo overlay
		if(mc.thePlayer != null)
		{
			ItemStack stack = mc.thePlayer.inventory.getCurrentItem();
			if(stack != null && stack.getItem() instanceof ItemGun)
			{
				ItemGun gunItem = (ItemGun)stack.getItem();
				GunType gunType = gunItem.type;
				int x = 0;
				for(int n = 0; n < gunType.numAmmoItemsInGun; n++)
				{
					ItemStack bulletStack = ((ItemGun)stack.getItem()).getBulletItemStack(stack, n);
					if(bulletStack != null && bulletStack.getItem() != null)
					{
						RenderHelper.enableGUIStandardItemLighting();
						GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
						GL11.glEnable(GL12.GL_RESCALE_NORMAL);
						OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
						drawSlotInventory(mc.fontRenderer, bulletStack, i / 2 - 89 + x, j - 65);
						GL11.glDisable(GL12.GL_RESCALE_NORMAL);
						RenderHelper.disableStandardItemLighting();
						String s = (bulletStack.getMaxDamage() - bulletStack.getItemDamage()) + "/" + bulletStack.getMaxDamage();
						if(bulletStack.getMaxDamage() == 1)
							s = "";
						mc.fontRenderer.drawString(s, i / 2 - 71 + x, j - 59, 0x000000);
						mc.fontRenderer.drawString(s, i / 2 - 72 + x, j - 60, 0xffffff);
						x += 16 + mc.fontRenderer.getStringWidth(s);
					}
				}
			}
		}

		if(FlansModClient.minecraft.thePlayer != null && (GuiTeamScores.numTeams > 0 || !GuiTeamScores.sortedByTeam) && GuiTeamScores.getPlayerData(FlansModClient.minecraft.thePlayer.username) != null)
		{
			GL11.glEnable(3042 /* GL_BLEND */);
			GL11.glDisable(2929 /* GL_DEPTH_TEST */);
			GL11.glDepthMask(false);
			GL11.glBlendFunc(770, 771);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			GL11.glDisable(3008 /* GL_ALPHA_TEST */);

			mc.renderEngine.func_110577_a(GuiTeamScores.texture);

			Tessellator tessellator = Tessellator.instance;
			tessellator.startDrawingQuads();
			tessellator.addVertexWithUV(i / 2 - 43, 27, -90D, 85D / 256D, 27D / 256D);
			tessellator.addVertexWithUV(i / 2 + 43, 27, -90D, 171D / 256D, 27D / 256D);
			tessellator.addVertexWithUV(i / 2 + 43, 0D, -90D, 171D / 256D, 0D / 256D);
			tessellator.addVertexWithUV(i / 2 - 43, 0D, -90D, 85D / 256D, 0D / 256D);
			tessellator.draw();
			
			//If we are in a two team gametype, draw the team scores at the top of the screen
			if(GuiTeamScores.numTeams == 2 && GuiTeamScores.sortedByTeam)
			{
				//Draw team 1 colour bit
				int colour = GuiTeamScores.teamData[0].team.teamColour;	
				GL11.glColor4f((float)((colour >> 16) & 0xff) / 256F, (float)((colour >> 8) & 0xff) / 256F, (float)(colour & 0xff) / 256F, 1.0F);
				tessellator.startDrawingQuads();
				tessellator.addVertexWithUV(i / 2 - 43, 27, -90D, 0D / 256D, 125D / 256D);
				tessellator.addVertexWithUV(i / 2 - 19, 27, -90D, 24D / 256D, 125D / 256D);
				tessellator.addVertexWithUV(i / 2 - 19, 0D, -90D, 24D / 256D, 98D / 256D);
				tessellator.addVertexWithUV(i / 2 - 43, 0D, -90D, 0D / 256D, 98D / 256D);
				tessellator.draw();
				//Draw team 2 colour bit
				colour = GuiTeamScores.teamData[1].team.teamColour;	
				GL11.glColor4f((float)((colour >> 16) & 0xff) / 256F, (float)((colour >> 8) & 0xff) / 256F, (float)(colour & 0xff) / 256F, 1.0F);
				tessellator.startDrawingQuads();
				tessellator.addVertexWithUV(i / 2 + 19, 27, -90D, 62D / 256D, 125D / 256D);
				tessellator.addVertexWithUV(i / 2 + 43, 27, -90D, 86D / 256D, 125D / 256D);
				tessellator.addVertexWithUV(i / 2 + 43, 0D, -90D, 86D / 256D, 98D / 256D);
				tessellator.addVertexWithUV(i / 2 + 19, 0D, -90D, 62D / 256D, 98D / 256D);
				tessellator.draw();
				
				GL11.glDepthMask(true);
				GL11.glEnable(2929 /* GL_DEPTH_TEST */);
				GL11.glEnable(3008 /* GL_ALPHA_TEST */);
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				
				//Draw the team scores
				mc.fontRenderer.drawString(GuiTeamScores.teamData[0].score + "", i / 2 - 35, 9, 0x000000);
				mc.fontRenderer.drawString(GuiTeamScores.teamData[1].score + "", i / 2 + 35 - mc.fontRenderer.getStringWidth(GuiTeamScores.teamData[1].score + ""), 9, 0x000000);
			}
			
			GL11.glDepthMask(true);
			GL11.glEnable(2929 /* GL_DEPTH_TEST */);
			GL11.glEnable(3008 /* GL_ALPHA_TEST */);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			String playerUsername = FlansModClient.minecraft.thePlayer.username;
			
			mc.fontRenderer.drawString(GuiTeamScores.getPlayerData(playerUsername).score + "", i / 2 - 7, 1, 0x000000);
			mc.fontRenderer.drawString(GuiTeamScores.getPlayerData(playerUsername).kills + "", i / 2 - 7, 9, 0x000000);
			mc.fontRenderer.drawString(GuiTeamScores.getPlayerData(playerUsername).deaths + "", i / 2 - 7, 17, 0x000000);
		}
		for(int n = 0; n < killMessages.size(); n++)
		{
			KillMessage killMessage = killMessages.get(n);
			mc.fontRenderer.drawString("\u00a7" + killMessage.killerName + "    " + "\u00a7" + killMessage.killedName, i - mc.fontRenderer.getStringWidth(killMessage.killerName + "    " + killMessage.killedName) - 5, j - 32 - killMessage.line * 16, 0xffffff);
		}
		RenderHelper.enableGUIStandardItemLighting();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
		
		for(int n = 0; n < killMessages.size(); n++)
		{
			KillMessage killMessage = killMessages.get(n);
			drawSlotInventory(mc.fontRenderer, new ItemStack(killMessage.weapon.item), i - mc.fontRenderer.getStringWidth("    " + killMessage.killedName) - 12, j - 36 - killMessage.line * 16);
		}
		GL11.glDisable(3042 /*GL_BLEND*/);
		RenderHelper.disableStandardItemLighting();
	}
	
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData)
	{
		if (type.equals(EnumSet.of(TickType.RENDER)))
		{
			rTickStart(FMLClientHandler.instance().getClient());
		}
		if (type.equals(EnumSet.of(TickType.CLIENT)))
		{
			cTickStart(FMLClientHandler.instance().getClient());
		}
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData)
	{
		if (type.equals(EnumSet.of(TickType.RENDER)))
		{
			rTickEnd(FMLClientHandler.instance().getClient());
		}
		if (type.equals(EnumSet.of(TickType.CLIENT)))
		{
			cTickEnd(FMLClientHandler.instance().getClient());
		}
	}
	
	public void cTickStart(Minecraft minecraft)
	{ /* Client side only */
		
	}

	public void cTickEnd(Minecraft minecraft)
	{ /* Client side only */
		for(int i = 0; i < killMessages.size(); i++)
		{
			killMessages.get(i).timer--;
			if(killMessages.get(i).timer == 0)
			{
				killMessages.remove(i);
			}
		}
		RenderFlag.angle += 2F;
		FlansModClient.tick();
	}
	
	
	public void rTickStart(Minecraft mc)
	{
		// CAPTURE MOUSE INPUT!
		if (mc.currentScreen == null && FlansModClient.controlModeMouse)
		{
			MouseHelper mouse = mc.mouseHelper;
			Entity ridden = mc.thePlayer.ridingEntity;

			if (ridden instanceof EntityDriveable)
			{
				EntityDriveable entity = (EntityDriveable) ridden;
				entity.onMouseMoved(mouse.deltaX, mouse.deltaY);
			}
		}
	}

	public void rTickEnd(Minecraft mc)
	{
		ScaledResolution scaledresolution = new ScaledResolution(FlansModClient.minecraft.gameSettings, FlansModClient.minecraft.displayWidth, FlansModClient.minecraft.displayHeight);
		int i = scaledresolution.getScaledWidth();
		int j = scaledresolution.getScaledHeight();
		
		if (FlansModClient.zoomOverlay != null && FMLClientHandler.instance().getClient().currentScreen == null)
		{
			FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
			GL11.glEnable(3042 /* GL_BLEND */);
			GL11.glDisable(2929 /* GL_DEPTH_TEST */);
			GL11.glDepthMask(false);
			GL11.glBlendFunc(770, 771);
			GL11.glColor4f(mc.ingameGUI.prevVignetteBrightness, mc.ingameGUI.prevVignetteBrightness, mc.ingameGUI.prevVignetteBrightness, 1.0F);
			GL11.glDisable(3008 /* GL_ALPHA_TEST */);

			mc.renderEngine.func_110577_a(FlansModResourceHandler.getScope(FlansModClient.zoomOverlay));

			Tessellator tessellator = Tessellator.instance;
			tessellator.startDrawingQuads();
			tessellator.addVertexWithUV(i / 2 - 2 * j, j, -90D, 0.0D, 1.0D);
			tessellator.addVertexWithUV(i / 2 + 2 * j, j, -90D, 1.0D, 1.0D);
			tessellator.addVertexWithUV(i / 2 + 2 * j, 0.0D, -90D, 1.0D, 0.0D);
			tessellator.addVertexWithUV(i / 2 - 2 * j, 0.0D, -90D, 0.0D, 0.0D);
			tessellator.draw();
			GL11.glDepthMask(true);
			GL11.glEnable(2929 /* GL_DEPTH_TEST */);
			GL11.glEnable(3008 /* GL_ALPHA_TEST */);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}
	
	private void drawSlotInventory(FontRenderer fontRenderer, ItemStack itemstack, int i, int j)
	{
		if(itemstack == null || itemstack.itemID == 0 || itemstack.getItem() == null)
			return;
		itemRenderer.renderItemIntoGUI(fontRenderer, FlansModClient.minecraft.renderEngine, itemstack, i, j);
		itemRenderer.renderItemOverlayIntoGUI(fontRenderer, FlansModClient.minecraft.renderEngine, itemstack, i, j);
	}

	public EnumSet<TickType> ticks()
	{
		return EnumSet.of(TickType.RENDER, TickType.CLIENT);
	}

	public String getLabel()
	{
		return "FlansModClient";
	}
	
	public static void addKillMessage(String[] split)
	{
		if(split.length == 4)
		{
			for(KillMessage killMessage : killMessages)
			{
				killMessage.line++;
				if(killMessage.line > 10)
					killMessage.timer = 0;
			}
			killMessages.add(new KillMessage(split));
		}
	}
	
	private static RenderItem itemRenderer = new RenderItem();
	private static List<KillMessage> killMessages = new ArrayList<KillMessage>();
	
	private static class KillMessage
	{
		public KillMessage(String[] split)
		{
			killerName = split[3];
			killedName = split[2];
			weapon = InfoType.getType(split[1]);
			line = 0;
			timer = 200;
		}
		
		public String killerName;
		public String killedName;
		public InfoType weapon;
		public int timer;
		public int line;
	}
}
