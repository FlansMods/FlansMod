package com.flansmod.apocalypse.client;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import com.flansmod.apocalypse.client.model.RenderSkullDrone;
import com.flansmod.apocalypse.client.model.RenderFakePlayer;
import com.flansmod.apocalypse.client.model.RenderNukeDrop;
import com.flansmod.apocalypse.client.model.RenderPowerCube;
import com.flansmod.apocalypse.client.model.RenderSkullBoss;
import com.flansmod.apocalypse.client.model.RenderSurvivor;
import com.flansmod.apocalypse.client.model.RenderTeleporter;
import com.flansmod.apocalypse.common.CommonProxyApocalypse;
import com.flansmod.apocalypse.common.FlansModApocalypse;
import com.flansmod.apocalypse.common.blocks.BlockSulphuricAcid;
import com.flansmod.apocalypse.common.blocks.TileEntityPowerCube;
import com.flansmod.apocalypse.common.entity.EntityAIMecha;
import com.flansmod.apocalypse.common.entity.EntitySkullDrone;
import com.flansmod.apocalypse.common.entity.EntityFakePlayer;
import com.flansmod.apocalypse.common.entity.EntityNukeDrop;
import com.flansmod.apocalypse.common.entity.EntitySkullBoss;
import com.flansmod.apocalypse.common.entity.EntitySurvivor;
import com.flansmod.apocalypse.common.entity.EntityTeleporter;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.handlers.FlansModResourceHandler;
import com.flansmod.client.model.RenderMecha;
import com.flansmod.client.util.WorldRenderer;
import com.flansmod.common.FlansMod;

public class ClientProxyApocalypse extends CommonProxyApocalypse
{
	private static final String FLUID_MODEL_PATH = "flansmodapocalypse:fluid";
	
	public static int apocalypseCountdown = 0;
	
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);
		
		MinecraftForge.EVENT_BUS.register(this);
		
		((BlockSulphuricAcid)FlansModApocalypse.blockSulphuricAcid).registerRenderer();
		RenderingRegistry.registerEntityRenderingHandler(EntitySurvivor.class, new RenderSurvivor.Factory());
		RenderingRegistry.registerEntityRenderingHandler(EntityFakePlayer.class,new RenderFakePlayer.Factory());
		RenderingRegistry.registerEntityRenderingHandler(EntityTeleporter.class, new RenderTeleporter.Factory());
		RenderingRegistry.registerEntityRenderingHandler(EntityAIMecha.class, new RenderMecha.Factory());
		RenderingRegistry.registerEntityRenderingHandler(EntityNukeDrop.class, new RenderNukeDrop.Factory());
		RenderingRegistry.registerEntityRenderingHandler(EntitySkullBoss.class, new RenderSkullBoss.Factory());
		RenderingRegistry.registerEntityRenderingHandler(EntitySkullDrone.class, new RenderSkullDrone.Factory());

	}
	
	@Override
	public void init(FMLInitializationEvent event)
	{
		super.init(event);

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPowerCube.class, new RenderPowerCube());
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event)
	{
		//FlansMod.getPacketHandler().registerPacket(PacketApocalypseCountdown.class);
	}
	
	@SubscribeEvent
	public void registerSoundEvents(RegistryEvent.Register<SoundEvent> event)
	{
		event.getRegistry().register(FlansModResourceHandler.getSoundEvent("skullboss_laugh"));
		event.getRegistry().register(FlansModResourceHandler.getSoundEvent("skullboss_spawn"));
	}
	
	
	public static void updateApocalypseCountdownTimer(int i)
	{
		apocalypseCountdown = i;
	}
	
	@SubscribeEvent
	public void registerModels(ModelRegistryEvent event)
	{		
		ModelLoader.setCustomModelResourceLocation(FlansModApocalypse.sulphur, 0, 
				new ModelResourceLocation(FlansModApocalypse.MODID + ":flansulphur", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(FlansModApocalypse.itemBlockSulphur, 0, 
				new ModelResourceLocation(FlansModApocalypse.MODID + ":blocksulphur", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(FlansModApocalypse.itemBlockPowerCube, 0, 
				new ModelResourceLocation(FlansModApocalypse.MODID + ":blockpowercube", "inventory"));

		ModelLoader.setCustomModelResourceLocation(FlansModApocalypse.itemBlockLabStone, 0, 
				new ModelResourceLocation(FlansModApocalypse.MODID + ":blocklabstone", "inventory"));
	}
	
	/**
	 * Tick hook for client logic
	 */
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
	
	/**
	 * Tick hook for client render
	 */
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
			mc.fontRenderer.drawString("Seconds to the apocalypse: " + (apocalypseCountdown / 20), 2, 2, 0xffffff);
		}
		
		//Draw white screen if we are being nuked
		ScaledResolution scaledresolution = new ScaledResolution(FlansModClient.minecraft);
		int i = scaledresolution.getScaledWidth();
		int j = scaledresolution.getScaledHeight();
		
		Tessellator tessellator = Tessellator.getInstance();
		
		if(!event.isCancelable() && event.getType() == ElementType.HELMET)
		{
			boolean playerIsInExplosion = false;
			for(Object obj : mc.world.loadedEntityList)
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
					if(mc.player.getDistanceSq(nuke) < scale * scale)
					{
						FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
						GlStateManager.enableBlend();
						GlStateManager.disableDepth();
						GlStateManager.disableTexture2D();
						GlStateManager.depthMask(false);
						GlStateManager.blendFunc(770, 771);
						GlStateManager.color(1F, 1F, 1F, alpha);
						GlStateManager.disableAlpha();

						WorldRenderer worldrenderer = FlansModClient.getWorldRenderer();
						worldrenderer.startDrawingQuads();
						worldrenderer.addVertexWithUV(i / 2 - 2 * j, j, -90D, 0.0D, 1.0D);
						worldrenderer.addVertexWithUV(i / 2 + 2 * j, j, -90D, 1.0D, 1.0D);
						worldrenderer.addVertexWithUV(i / 2 + 2 * j, 0.0D, -90D, 1.0D, 0.0D);
						worldrenderer.addVertexWithUV(i / 2 - 2 * j, 0.0D, -90D, 0.0D, 0.0D);
						worldrenderer.draw();
						GlStateManager.depthMask(true);
						GlStateManager.enableDepth();
						GlStateManager.enableAlpha();
						GlStateManager.enableTexture2D();
						GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
					}
				}
			}
		}
	}
}
