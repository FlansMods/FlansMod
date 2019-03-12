package com.flansmod.apocalypse.client;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
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
import com.flansmod.apocalypse.common.blocks.BlockSulphuricAcid;
import com.flansmod.apocalypse.common.blocks.TileEntityPowerCube;
import com.flansmod.apocalypse.common.entity.EntityAIMecha;
import com.flansmod.apocalypse.common.entity.EntityFakePlayer;
import com.flansmod.apocalypse.common.entity.EntityNukeDrop;
import com.flansmod.apocalypse.common.entity.EntitySurvivor;
import com.flansmod.apocalypse.common.entity.EntityTeleporter;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.model.RenderMecha;
import com.flansmod.client.util.WorldRenderer;
import com.flansmod.common.FlansMod;

public class ClientProxyApocalypse extends CommonProxyApocalypse
{
	private static final String FLUID_MODEL_PATH = "flansmodapocalypse:fluid";
	
	public static int apocalypseCountdown = 0;
	
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);
		
		MinecraftForge.EVENT_BUS.register(this);
		
		((BlockSulphuricAcid)FlansModApocalypse.blockSulphuricAcid).registerRenderer();
	}
	
	public void init(FMLInitializationEvent event)
	{
		super.init(event);
		registerVanillaItemModel(FlansModApocalypse.sulphur, Item.getItemFromBlock(FlansModApocalypse.blockSulphur), Item.getItemFromBlock(FlansModApocalypse.blockSulphuricAcid), Item.getItemFromBlock(FlansModApocalypse.blockLabStone), Item.getItemFromBlock(FlansModApocalypse.blockPowerCube));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPowerCube.class, new RenderPowerCube());
		RenderingRegistry.registerEntityRenderingHandler(EntitySurvivor.class, manager -> new RenderSurvivor(manager, new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityFakePlayer.class, manager -> new RenderFakePlayer(manager, new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityTeleporter.class, RenderTeleporter::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityAIMecha.class, RenderMecha::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityNukeDrop.class, RenderNukeDrop::new);
	}
	
	private void registerVanillaItemModel(Item... items)
	{
		for(Item item : items)
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(FlansModApocalypse.MODID + ":" + item.getTranslationKey().split("\\.")[1], "inventory"));
	}
	
	public void postInit(FMLPostInitializationEvent event)
	{
		//FlansMod.getPacketHandler().registerPacket(PacketApocalypseCountdown.class);
	}
	
	public static void updateApocalypseCountdownTimer(int i)
	{
		apocalypseCountdown = i;
	}
	
	@SubscribeEvent
	public void registerModels(ModelRegistryEvent event)
	{
		/*
		Item item = Item.getItemFromBlock(FlansModApocalypse.blockSulphuricAcid);
		ModelBakery.registerItemVariants(item);
		final ModelResourceLocation modelResourceLocation = new ModelResourceLocation(FLUID_MODEL_PATH, FlansModApocalypse.sulphuricAcid.getName());

		ModelLoader.setCustomMeshDefinition(item, new ItemMeshDefinition()
        {
            public ModelResourceLocation getModelLocation(ItemStack stack)
            {
                return modelResourceLocation;
            }
        });

		ModelLoader.setCustomStateMapper(FlansModApocalypse.blockSulphuricAcid, new StateMapperBase() {
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return modelResourceLocation;
			}
		});
		*/
		
		ModelLoader.setCustomModelResourceLocation(FlansModApocalypse.itemBlockLabStone, 0, new ModelResourceLocation("flansmodapocalypse:itemblocklabstone", "inventory"));
		ModelLoader.registerItemVariants(FlansModApocalypse.itemBlockLabStone, new ResourceLocation("flansmodapocalypse:itemblocklabstone"));
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
						GL11.glEnable(3042 /* GL_BLEND */);
						GL11.glDisable(2929 /* GL_DEPTH_TEST */);
						GL11.glDisable(GL11.GL_TEXTURE_2D);
						GL11.glDepthMask(false);
						GL11.glBlendFunc(770, 771);
						GL11.glColor4f(1F, 1F, 1F, alpha);
						GL11.glDisable(3008 /* GL_ALPHA_TEST */);
						
						WorldRenderer worldrenderer = FlansModClient.getWorldRenderer();
						worldrenderer.startDrawingQuads();
						worldrenderer.addVertexWithUV(i / 2 - 2 * j, j, -90D, 0.0D, 1.0D);
						worldrenderer.addVertexWithUV(i / 2 + 2 * j, j, -90D, 1.0D, 1.0D);
						worldrenderer.addVertexWithUV(i / 2 + 2 * j, 0.0D, -90D, 1.0D, 0.0D);
						worldrenderer.addVertexWithUV(i / 2 - 2 * j, 0.0D, -90D, 0.0D, 0.0D);
						worldrenderer.draw();
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
