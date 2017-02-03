package com.flansmod.apocalypse.client;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import com.flansmod.apocalypse.client.model.RenderFakePlayer;
import com.flansmod.apocalypse.client.model.RenderNukeDrop;
import com.flansmod.apocalypse.client.model.RenderPowerCube;
import com.flansmod.apocalypse.client.model.RenderSurvivor;
import com.flansmod.apocalypse.client.model.RenderTeleporter;
import com.flansmod.apocalypse.common.CommonProxyApocalypse;
import com.flansmod.apocalypse.common.FlansModApocalypse;
import com.flansmod.apocalypse.common.blocks.TileEntityPowerCube;
import com.flansmod.apocalypse.common.entity.EntityAIMecha;
import com.flansmod.apocalypse.common.entity.EntityFakePlayer;
import com.flansmod.apocalypse.common.entity.EntityNukeDrop;
import com.flansmod.apocalypse.common.entity.EntitySurvivor;
import com.flansmod.apocalypse.common.entity.EntityTeleporter;
import com.flansmod.apocalypse.common.network.PacketApocalypseCountdown;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.client.model.RenderItemHolder;
import com.flansmod.client.model.RenderMecha;
import com.flansmod.common.FlansMod;
import com.flansmod.common.TileEntityItemHolder;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.guns.EntityAAGun;
import com.flansmod.common.teams.ItemTeamArmour;

public class ClientProxyApocalypse extends CommonProxyApocalypse 
{
	public static int apocalypseCountdown = 0;
	
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);
		MinecraftForge.EVENT_BUS.register(new ApocalypseModelManager());
		ApocalypseModelManager.registerVariants();
	}
	
	public void init(FMLInitializationEvent event)
	{
		super.init(event);
		registerVanillaItemModel(FlansModApocalypse.sulphur, Item.getItemFromBlock(FlansModApocalypse.blockSulphur), Item.getItemFromBlock(FlansModApocalypse.blockSulphuricAcid), Item.getItemFromBlock(FlansModApocalypse.blockLabStone), Item.getItemFromBlock(FlansModApocalypse.blockPowerCube));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPowerCube.class, new RenderPowerCube());
		RenderingRegistry.registerEntityRenderingHandler(EntitySurvivor.class, new RenderSurvivor(Minecraft.getMinecraft().getRenderManager(), new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityFakePlayer.class, new RenderFakePlayer(Minecraft.getMinecraft().getRenderManager(), new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityTeleporter.class, new RenderTeleporter(Minecraft.getMinecraft().getRenderManager()));
		RenderingRegistry.registerEntityRenderingHandler(EntityAIMecha.class, new RenderMecha(Minecraft.getMinecraft().getRenderManager()));
		RenderingRegistry.registerEntityRenderingHandler(EntityNukeDrop.class, new RenderNukeDrop(Minecraft.getMinecraft().getRenderManager()));
	}
	
	private void registerVanillaItemModel(Item... items)
	{
		for(Item item : items)
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(FlansModApocalypse.MODID + ":" + item.getUnlocalizedName().split("\\.")[1], "inventory"));	
	}
	
	public void postInit(FMLPostInitializationEvent event) 
	{
		//FlansMod.getPacketHandler().registerPacket(PacketApocalypseCountdown.class);
	}
	
	public static void updateApocalypseCountdownTimer(int i)
	{
		apocalypseCountdown = i; 
	}
	
	/** Tick hook for client logic */
	@SubscribeEvent
	public void tick(TickEvent.ClientTickEvent event)
	{
		if(event.phase == TickEvent.Phase.START)
		{
			if(apocalypseCountdown > 0)
			{
				apocalypseCountdown--;
			}
		}
	}
	
	/** Tick hook for client render */
	@SubscribeEvent
	public void tick(TickEvent.RenderTickEvent event)
	{
		if(event.phase == TickEvent.Phase.START)
		{

		}
	}
	
	@SubscribeEvent
	public void eventHandler(RenderGameOverlayEvent event)
	{
		Minecraft mc = Minecraft.getMinecraft();
		//DEBUG vehicles
		if(apocalypseCountdown > 0 && FlansMod.DEBUG)
		{		
			mc.fontRendererObj.drawString("Seconds to the apocalypse: " + (apocalypseCountdown / 20), 2, 2, 0xffffff);
		}
		
		//Draw white screen if we are being nuked
		ScaledResolution scaledresolution = new ScaledResolution(FlansModClient.minecraft);
		int i = scaledresolution.getScaledWidth();
		int j = scaledresolution.getScaledHeight();
					
		Tessellator tessellator = Tessellator.getInstance();
		
		if(!event.isCancelable() && event.type == ElementType.HELMET)
		{
			boolean playerIsInExplosion = false;
			for(Object obj : mc.theWorld.loadedEntityList)
			{
				if(obj instanceof EntityNukeDrop)
				{
					EntityNukeDrop nuke = (EntityNukeDrop)obj;
					float scale = 1F - 1F / ((float)nuke.timeSinceExplosion / 5F + 1);
					scale *= 100F * scale;
					float alpha = ((float)nuke.timeSinceExplosion / (float)EntityNukeDrop.explosionLength);
					alpha = 1F - alpha * alpha;
					alpha *= 0.5F;
					//Render white screen
					if(mc.thePlayer.getDistanceSqToEntity(nuke) < scale * scale)
					{
						FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
						GL11.glEnable(3042 /* GL_BLEND */);
						GL11.glDisable(2929 /* GL_DEPTH_TEST */);
						GL11.glDisable(GL11.GL_TEXTURE_2D);
						GL11.glDepthMask(false);
						GL11.glBlendFunc(770, 771);
						GL11.glColor4f(1F, 1F, 1F, alpha);
						GL11.glDisable(3008 /* GL_ALPHA_TEST */);

						tessellator.getWorldRenderer().begin(7, DefaultVertexFormats.POSITION_TEX);
						tessellator.getWorldRenderer().pos(i / 2 - 2 * j, j, -90D).tex(0.0D, 1.0D).endVertex();
						tessellator.getWorldRenderer().pos(i / 2 + 2 * j, j, -90D).tex(1.0D, 1.0D).endVertex();
				        tessellator.getWorldRenderer().pos(i / 2 + 2 * j, 0.0D, -90D).tex(1.0D, 0.0D).endVertex();
				        tessellator.getWorldRenderer().pos(i / 2 - 2 * j, 0.0D, -90D).tex(0.0D, 0.0D).endVertex();
						tessellator.draw();
						GL11.glDepthMask(true);
						GL11.glEnable(2929 /* GL_DEPTH_TEST */);
						GL11.glEnable(3008 /* GL_ALPHA_TEST */);
						GL11.glEnable(GL11.GL_TEXTURE_2D);
						GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
					}
				}
			}
		}
	}
}
