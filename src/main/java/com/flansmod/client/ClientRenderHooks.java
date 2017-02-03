package com.flansmod.client;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderItemInFrameEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.client.event.RenderWorldEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.client.event.EntityViewRenderEvent.CameraSetup;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import org.lwjgl.util.glu.Project;

import com.flansmod.api.IControllable;
import com.flansmod.client.gui.teams.GuiTeamScores;
import com.flansmod.client.model.InstantBulletRenderer;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.model.RenderGun;
import com.flansmod.client.model.RenderGun.GunRenderType;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.Paintjob;
import com.flansmod.common.network.PacketTeamInfo;
import com.flansmod.common.network.PacketTeamInfo.PlayerScoreData;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.teams.Team;
import com.flansmod.common.types.IPaintableItem;
import com.flansmod.common.types.InfoType;

public class ClientRenderHooks 
{
	public static final ResourceLocation offHand = new ResourceLocation("flansmod","gui/offHand.png");
	public static final ResourceLocation hitMarker = new ResourceLocation("flansmod", "gui/hitMarker.png");
	private Minecraft mc;
	private float fovModifierHandPrev, fovModifierHand;
	private float equippedProgress, prevEquippedProgress;
	private ItemStack itemToRender;
	private int equippedItemSlot;
	private float partialTicks;
	
	private static RenderItem itemRenderer = Minecraft.getMinecraft().getRenderItem();
	private static List<KillMessage> killMessages = new ArrayList<KillMessage>();
	
	public ClientRenderHooks()
	{
		mc = Minecraft.getMinecraft();
	}
		
	/** Render guns in 3D in item frames */
	public void renderItemFrame(RenderItemInFrameEvent event)
	{
		if(event.item.getItem() instanceof ItemGun)
		{
			GunType type = ((ItemGun)event.item.getItem()).GetType();
			if(type.model != null)
			{
				event.setCanceled(true);
				
				int rotation = event.entityItemFrame.getRotation();
				GlStateManager.rotate(-rotation * 45F, 0F, 0F, 1F);
				RenderHelper.enableStandardItemLighting();
				GlStateManager.rotate(rotation * 45F, 0F, 0F, 1F);
				GlStateManager.pushMatrix();
				float scale = 0.75F;
				GlStateManager.scale(scale, scale, scale);
				GlStateManager.translate(0.15F, -0.15F, 0F);
				ClientProxy.gunRenderer.renderItem(GunRenderType.ENTITY, event.item);
				GlStateManager.popMatrix();
			}
		}
	}
	
	/** When Minecraft would render a 2D gun item, instead cancel it and render the gun properly. Render the offhand gun too. */
	public void renderHeldItem(RenderHandEvent event)
	{
		EntityPlayer player = mc.thePlayer;
		if(itemToRender != null && itemToRender.getItem() instanceof ItemGun && ((ItemGun)itemToRender.getItem()).GetType().model != null)
		{
			//Cancel the hand render event so that we can do our own.
			event.setCanceled(true);
		
			//Render the gun in hand
			ItemStack stack = itemToRender;
			GunType type = ((ItemGun)stack.getItem()).GetType();
			float partialTicks = event.partialTicks;
			int pass = event.renderPass;
			EntityRenderer renderer = mc.entityRenderer;
			float farPlaneDistance = mc.gameSettings.renderDistanceChunks * 16F;
			ItemRenderer itemRenderer = mc.getItemRenderer();
			
			GlStateManager.clear(256);
			GlStateManager.matrixMode(5889);
	        GlStateManager.loadIdentity();
	        
	        float f1 = 0.07F;
	        if(mc.gameSettings.anaglyph)
	            GlStateManager.translate((float)(-(pass * 2 - 1)) * f1, 0.0F, 0.0F);
	        
	        Project.gluPerspective(getFOVModifier(partialTicks), (float)mc.displayWidth / (float)mc.displayHeight, 0.05F, farPlaneDistance * 2.0F);
	        GlStateManager.matrixMode(5888);
	        GlStateManager.loadIdentity();

	        if(mc.gameSettings.anaglyph)
	            GlStateManager.translate((float)(pass * 2 - 1) * 0.1F, 0.0F, 0.0F);

	        GlStateManager.pushMatrix();
	        hurtCameraEffect(partialTicks);

	        if(mc.gameSettings.viewBobbing)
	        	setupViewBobbing(partialTicks);

	        boolean flag = mc.getRenderViewEntity() instanceof EntityLivingBase && ((EntityLivingBase)mc.getRenderViewEntity()).isPlayerSleeping();

	        if(mc.gameSettings.thirdPersonView == 0 && !flag && !mc.gameSettings.hideGUI && !mc.playerController.isSpectator())
	        {
	        	renderer.enableLightmap();
	            renderItemInFirstPerson(stack, itemRenderer, partialTicks);
	            renderer.disableLightmap();
	        }

	        GlStateManager.popMatrix();

	        if(mc.gameSettings.thirdPersonView == 0 && !flag)
	        {
	            itemRenderer.renderOverlays(partialTicks);
	            hurtCameraEffect(partialTicks);
	        }

	        if(mc.gameSettings.viewBobbing)
	        {
	            setupViewBobbing(partialTicks);
	        }
		}
	}
	
	private void renderItemInFirstPerson(ItemStack stack, ItemRenderer renderer, float partialTicks)
	{
		float f1 = 1.0F - (prevEquippedProgress + (equippedProgress - prevEquippedProgress) * partialTicks);
        EntityPlayerSP entityplayersp = this.mc.thePlayer;
        float f2 = entityplayersp.getSwingProgress(partialTicks);
        float f3 = entityplayersp.prevRotationPitch + (entityplayersp.rotationPitch - entityplayersp.prevRotationPitch) * partialTicks;
        float f4 = entityplayersp.prevRotationYaw + (entityplayersp.rotationYaw - entityplayersp.prevRotationYaw) * partialTicks;
        
        //Setup lighting
        GlStateManager.disableLighting();
        GlStateManager.pushMatrix();
        GlStateManager.rotate(f3, 1.0F, 0.0F, 0.0F);
        GlStateManager.rotate(f4, 0.0F, 1.0F, 0.0F);
        RenderHelper.enableStandardItemLighting();
        GlStateManager.popMatrix();
        
        //Do lighting
        int i = this.mc.theWorld.getCombinedLight(new BlockPos(entityplayersp.posX, entityplayersp.posY + (double)entityplayersp.getEyeHeight(), entityplayersp.posZ), 0);
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)(i & 65535), (float)(i >> 16));
        
        //Do hand rotations
        float f5 = entityplayersp.prevRenderArmPitch + (entityplayersp.renderArmPitch - entityplayersp.prevRenderArmPitch) * partialTicks;
        float f6 = entityplayersp.prevRenderArmYaw + (entityplayersp.renderArmYaw - entityplayersp.prevRenderArmYaw) * partialTicks;
        GlStateManager.rotate((entityplayersp.rotationPitch - f5) * 0.1F, 1.0F, 0.0F, 0.0F);
        GlStateManager.rotate((entityplayersp.rotationYaw - f6) * 0.1F, 0.0F, 1.0F, 0.0F);
        
        GlStateManager.enableRescaleNormal();
        GlStateManager.pushMatrix();

        //Do vanilla weapon swing
        float f7 = -0.4F * MathHelper.sin(MathHelper.sqrt_float(f2) * (float)Math.PI);
        float f8 = 0.2F * MathHelper.sin(MathHelper.sqrt_float(f2) * (float)Math.PI * 2.0F);
        float f9 = -0.2F * MathHelper.sin(f2 * (float)Math.PI);
        GlStateManager.translate(f7, f8, f9);
        
        GlStateManager.translate(0.56F, -0.52F, -0.71999997F);
        GlStateManager.translate(0.0F, f1 * -0.6F, 0.0F);
        GlStateManager.rotate(45.0F, 0.0F, 1.0F, 0.0F);
        float f10 = MathHelper.sin(f2 * f2 * (float)Math.PI);
        float f11 = MathHelper.sin(MathHelper.sqrt_float(f2) * (float)Math.PI);
        GlStateManager.rotate(f10 * -20.0F, 0.0F, 1.0F, 0.0F);
        GlStateManager.rotate(f11 * -20.0F, 0.0F, 0.0F, 1.0F);
        GlStateManager.rotate(f11 * -80.0F, 1.0F, 0.0F, 0.0F);
        GlStateManager.scale(0.4F, 0.4F, 0.4F);

        ClientProxy.gunRenderer.renderItem(GunRenderType.EQUIPPED_FIRST_PERSON, stack, mc.theWorld, mc.thePlayer);

        GlStateManager.popMatrix();
        GlStateManager.disableRescaleNormal();
        RenderHelper.disableStandardItemLighting();
	}

	
    private void hurtCameraEffect(float partialTicks)
    {
        if (this.mc.getRenderViewEntity() instanceof EntityLivingBase)
        {
            EntityLivingBase entitylivingbase = (EntityLivingBase)this.mc.getRenderViewEntity();
            float f1 = (float)entitylivingbase.hurtTime - partialTicks;
            float f2;

            if (entitylivingbase.getHealth() <= 0.0F)
            {
                f2 = (float)entitylivingbase.deathTime + partialTicks;
                GlStateManager.rotate(40.0F - 8000.0F / (f2 + 200.0F), 0.0F, 0.0F, 1.0F);
            }

            if (f1 < 0.0F)
            {
                return;
            }

            f1 /= (float)entitylivingbase.maxHurtTime;
            f1 = MathHelper.sin(f1 * f1 * f1 * f1 * (float)Math.PI);
            f2 = entitylivingbase.attackedAtYaw;
            GlStateManager.rotate(-f2, 0.0F, 1.0F, 0.0F);
            GlStateManager.rotate(-f1 * 14.0F, 0.0F, 0.0F, 1.0F);
            GlStateManager.rotate(f2, 0.0F, 1.0F, 0.0F);
        }
    }
    
    private void setupViewBobbing(float partialTicks)
    {
        if (this.mc.getRenderViewEntity() instanceof EntityPlayer)
        {
            EntityPlayer entityplayer = (EntityPlayer)this.mc.getRenderViewEntity();
            float f1 = entityplayer.distanceWalkedModified - entityplayer.prevDistanceWalkedModified;
            float f2 = -(entityplayer.distanceWalkedModified + f1 * partialTicks);
            float f3 = entityplayer.prevCameraYaw + (entityplayer.cameraYaw - entityplayer.prevCameraYaw) * partialTicks;
            float f4 = entityplayer.prevCameraPitch + (entityplayer.cameraPitch - entityplayer.prevCameraPitch) * partialTicks;
            GlStateManager.translate(MathHelper.sin(f2 * (float)Math.PI) * f3 * 0.5F, -Math.abs(MathHelper.cos(f2 * (float)Math.PI) * f3), 0.0F);
            GlStateManager.rotate(MathHelper.sin(f2 * (float)Math.PI) * f3 * 3.0F, 0.0F, 0.0F, 1.0F);
            GlStateManager.rotate(Math.abs(MathHelper.cos(f2 * (float)Math.PI - 0.2F) * f3) * 5.0F, 1.0F, 0.0F, 0.0F);
            GlStateManager.rotate(f4, 1.0F, 0.0F, 0.0F);
        }
    }
    
    private float getFOVModifier(float partialTicks)
    {
        Entity entity = this.mc.getRenderViewEntity();
        float f1 = 70.0F;

        if (entity instanceof EntityLivingBase && ((EntityLivingBase)entity).getHealth() <= 0.0F)
        {
            float f2 = (float)((EntityLivingBase)entity).deathTime + partialTicks;
            f1 /= (1.0F - 500.0F / (f2 + 500.0F)) * 2.0F + 1.0F;
        }

        Block block = ActiveRenderInfo.getBlockAtEntityViewpoint(this.mc.theWorld, entity, partialTicks);

        if (block.getMaterial() == Material.water)
            f1 = f1 * 60.0F / 70.0F;

        return f1;
    }
    
    public void update()
    {    	    	
		for(int i = 0; i < killMessages.size(); i++)
		{
			killMessages.get(i).timer--;
			if(killMessages.get(i).timer == 0)
			{
				killMessages.remove(i);
			}
		}

        //Update the FOV Modifier
		float fovModifier = 1.0F;
        if (mc.getRenderViewEntity() instanceof AbstractClientPlayer)
        {
            AbstractClientPlayer abstractclientplayer = (AbstractClientPlayer)this.mc.getRenderViewEntity();
            fovModifier = abstractclientplayer.getFovModifier();
        }
        //Adjust FOV modifier
        fovModifierHandPrev = fovModifierHand;
        fovModifierHand += (fovModifier - fovModifierHand) * 0.5F;
        //Limit FOV modifier to a certain range
        if (fovModifierHand > 1.5F)
            fovModifierHand = 1.5F;
        if (fovModifierHand < 0.1F)
            fovModifierHand = 0.1F;
        
        //And update the itemToRender, for item switching
        
        prevEquippedProgress = equippedProgress;
        EntityPlayerSP thePlayer = mc.thePlayer;
        if(thePlayer != null)
        {
	        ItemStack itemstack = thePlayer.inventory.getCurrentItem();
	        boolean equippedGun = false;
	
	        if(itemToRender != null && itemstack != null)
	        {
	            if (!itemToRender.getIsItemStackEqual(itemstack))
	            {
	                if (!itemToRender.getItem().shouldCauseReequipAnimation(itemToRender, itemstack, equippedItemSlot != thePlayer.inventory.currentItem))
	                {
	                    itemToRender = itemstack;
	                    equippedItemSlot = thePlayer.inventory.currentItem;
	                    return;
	                }
	                equippedGun = true;
	            }
	        }
	        else if(itemToRender == null && itemstack == null)
	        {
	        	equippedGun = false;
	        }
	        else
	        {
	        	equippedGun = true;
	        }

	        float maxChange = 0.4F;
	        float targetProgress = equippedGun ? 0.0F : 1.0F;
	        float difference = MathHelper.clamp_float(targetProgress - equippedProgress, -maxChange, maxChange);
	        equippedProgress += difference;
	
	        if(equippedProgress < 0.1F)
	        {
	            itemToRender = itemstack;
	            equippedItemSlot = thePlayer.inventory.currentItem;
	        }
	        
			//Render debug boxes for player snapshots
	        PlayerData data = PlayerHandler.getPlayerData(thePlayer);
			if(FlansMod.DEBUG && data != null)
			{
				if(data.snapshots[0] != null)
					data.snapshots[0].renderSnapshot();
			}
        }
    }
    
    public void SetPartialTick(float dT)
    {
    	partialTicks = dT;
    }
    
	public void renderThirdPersonWeapons(RenderLivingEvent.Post event)
	{
		ModelBase mainModel = event.renderer.getMainModel();
		EntityLivingBase entity = event.entity;
		
		if(entity.getEquipmentInSlot(0) != null && entity.getEquipmentInSlot(0).getItem() instanceof ItemGun && mainModel instanceof ModelBiped)
		{
			ModelBiped biped = (ModelBiped)mainModel;
			ItemStack stack = entity.getEquipmentInSlot(0);
			GunType type = ((ItemGun)stack.getItem()).GetType();
			if(type.model == null)
				return;
			ModelGun gunModel = type.model;
			
			GlStateManager.pushMatrix();
	        GlStateManager.disableCull();
	        mainModel.swingProgress = entity.getSwingProgress(partialTicks);
	        mainModel.isRiding = entity.isRiding();
	        mainModel.isChild = entity.isChild();
	
	        float f2 = this.interpolateRotation(entity.prevRenderYawOffset, entity.renderYawOffset, partialTicks);
	        float f3 = this.interpolateRotation(entity.prevRotationYawHead, entity.rotationYawHead, partialTicks);
	        float f4 = f3 - f2;
	        float f5;
	        
	        
	        if(Math.abs(entity.prevRenderYawOffset - entity.renderYawOffset) > 30F)
	        	f2 = entity.renderYawOffset;
	        if(Math.abs(entity.prevRotationYawHead - entity.rotationYawHead) > 30F)
	        	f3 = entity.rotationYawHead;
	        f4 = f3 - f2;
	        
	        //System.out.println(entity.prevRenderYawOffset + "     " + entity.renderYawOffset);
	        
	        if (entity.isRiding() && entity.ridingEntity instanceof EntityLivingBase)
	        {
	            EntityLivingBase entitylivingbase1 = (EntityLivingBase)entity.ridingEntity;
	            f2 = this.interpolateRotation(entitylivingbase1.prevRenderYawOffset, entitylivingbase1.renderYawOffset, partialTicks);
	            f4 = f3 - f2;
	            f5 = MathHelper.wrapAngleTo180_float(f4);
	
	            if (f5 < -85.0F)
	            {
	                f5 = -85.0F;
	            }
	
	            if (f5 >= 85.0F)
	            {
	                f5 = 85.0F;
	            }
	
	            f2 = f3 - f5;
	
	            if (f5 * f5 > 2500.0F)
	            {
	                f2 += f5 * 0.2F;
	            }
	        }
	
	        float f9 = entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * partialTicks;
	        if(Math.abs(entity.prevRotationPitch - entity.rotationPitch) > 5F)
	        	f9 = entity.rotationPitch;
	        GlStateManager.translate(event.x, event.y, event.z);
	        
	        f5 = entity.ticksExisted + partialTicks;
	        //this.rotateCorpse(entity, f5, f2, partialTicks);
	        GlStateManager.rotate(180.0F - f2, 0.0F, 1.0F, 0.0F);
	        GlStateManager.enableRescaleNormal();
	        GlStateManager.scale(-1.0F, -1.0F, 1.0F);
	        //this.preRenderCallback(entity, partialTicks);
	        float f6 = 0.0625F;
	        GlStateManager.translate(0.0F, -1.5078125F, 0.0F);
	        float f7 = entity.prevLimbSwingAmount + (entity.limbSwingAmount - entity.prevLimbSwingAmount) * partialTicks;
	        float f8 = entity.limbSwing - entity.limbSwingAmount * (1.0F - partialTicks);
	
	        if (entity.isChild())
	        {
	            f8 *= 3.0F;
	        }
	
	        if (f7 > 1.0F)
	        {
	            f7 = 1.0F;
	        }
	
	        GlStateManager.enableAlpha();
	        
	        //biped.isSneak = false;
	        biped.heldItemRight = 1;
	        biped.setLivingAnimations(entity, f8, f7, partialTicks);
	        biped.setRotationAngles(f8, f7, f5, f4, f9, 0.0625F, entity);

	        //Render main hand gun
	        {
		        GlStateManager.pushMatrix();

		        biped.bipedRightArm.postRender(0.0625F);
		        
		        GlStateManager.translate(-0.05F, 0.4F, 0.05F);
	
		        ClientProxy.gunRenderer.renderItem(GunRenderType.EQUIPPED, stack, mc.theWorld, entity);
		        GlStateManager.popMatrix();
	        }
	        
	        //Render off hand gun
	        if(entity instanceof EntityPlayer)
	        {
		        PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)entity, Side.CLIENT);
				ItemStack gunStack = null;
				
				//Check current stack is a one handed gun
				if(entity instanceof EntityOtherPlayerMP)
				{
					gunStack = data.offHandGunStack;
				}
				else if(entity instanceof EntityPlayerSP)
				{
					if(type.oneHanded && data.offHandGunSlot != 0)
						gunStack = ((EntityPlayer)entity).inventory.getStackInSlot(data.offHandGunSlot - 1);
				}
						
				if(gunStack != null && gunStack.getItem() instanceof ItemGun)
				{
					GunType gunType = ((ItemGun)gunStack.getItem()).GetType();
							
					//Render!
					GlStateManager.pushMatrix();			
					biped.bipedLeftArm.postRender(0.0625F);
					GlStateManager.rotate(-90F, 1F, 0F, 0F);
					GlStateManager.rotate(-90F, 0F, 1F, 0F);

					GlStateManager.translate(0.6F, 0F, -0.05F);
					ClientProxy.gunRenderer.renderOffHandGun((EntityPlayer)entity, gunStack);
					GlStateManager.popMatrix();
				}
	        }
	        
	        GlStateManager.depthMask(true);
	        GlStateManager.disableRescaleNormal();
	        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
	        GlStateManager.enableTexture2D();
	        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
	        GlStateManager.enableCull();
	        GlStateManager.popMatrix();
		}
	}
	
	private float interpolateRotation(float x, float y, float dT)
	{
		float f3;

		for(f3 = y - x; f3 < -180.0F; f3 += 360.0F) { }
		for( ; f3 >= 180.0F; f3 -= 360.0F) { }

		return x + dT * f3;
	}

	//Handle player hiding / name tag removal for teams
	public void renderPlayer(RenderPlayerEvent.Pre event)
	{
		PlayerData data = PlayerHandler.getPlayerData(event.entityPlayer, Side.CLIENT);
					
		RendererLivingEntity.NAME_TAG_RANGE = 64F;
		RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 32F;		
		if(event.entity instanceof EntityPlayer && FlansModClient.teamInfo != null && FlansModClient.teamInfo.gametype != null && !"No Gametype".equals(FlansModClient.teamInfo.gametype))
		{
			PlayerScoreData rendering = FlansModClient.teamInfo.getPlayerScoreData(event.entity.getName());
			PlayerScoreData thePlayer = FlansModClient.teamInfo.getPlayerScoreData(mc.thePlayer.getName());
			
			Team renderingTeam = rendering == null ? Team.spectators : rendering.team.team;
			Team thePlayerTeam = thePlayer == null ? Team.spectators : thePlayer.team.team;
						
			//Do custom skin overrides
			//If we have no stored skin, try to get it
			if(data.skin == null)
				data.skin = ((AbstractClientPlayer)event.entityPlayer).getLocationSkin();
			//Only once we have the stored skin may we override
			if(data.skin != null)
			{
				ResourceLocation skin = rendering == null || rendering.playerClass == null ? null : FlansModResourceHandler.getTexture(rendering.playerClass);
				//((AbstractClientPlayer)event.entityPlayer).func_152121_a(Type.SKIN, skin == null ? data.skin : skin);
			}
			
			//Spectators see all
			if(thePlayerTeam == Team.spectators)
				return;
			//Nobody sees spectators
			if(renderingTeam == Team.spectators)
			{
				event.setCanceled(true);
				return;
			}
			//If we are on the other team, don't render the name tag
			if(renderingTeam != thePlayerTeam)
			{
				RendererLivingEntity.NAME_TAG_RANGE = 0F;
				RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 0F;
				return;
			}
			//If its DM, don't render the name tag
			if(!FlansModClient.teamInfo.sortedByTeam)
			{
				RendererLivingEntity.NAME_TAG_RANGE = 0F;
				RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 0F;
			}
		}
	}
	
public void cameraSetup(CameraSetup event)
	{
		if(mc.thePlayer.ridingEntity instanceof IControllable)
		{
			IControllable cont = (IControllable)mc.thePlayer.ridingEntity;
			float roll = interpolateRotation(cont.getPrevPlayerRoll(), cont.getPlayerRoll(), (float)event.renderPartialTicks);
			//If we are driving a vehicle with the roll component enabled, having the camera roll with the vehicle is disorientating at best, so we disable the roll component for these vehicles
			if(((EntitySeat)mc.thePlayer.ridingEntity).driveable != null){
			EntityDriveable ent = ((EntitySeat)mc.thePlayer.ridingEntity).driveable;
			
			if(ent.getDriveableType().canRoll){
				roll = 0F;
			}
			}
			
			event.roll = roll;
		}
	}
	
	public void ModifyHUD(RenderGameOverlayEvent event)
	{
		Minecraft mc = Minecraft.getMinecraft();
		
		//Remove crosshairs if looking down the sights of a gun
		if(event.type == ElementType.CROSSHAIRS //&& mc.thePlayer.getCurrentEquippedItem() != null && mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemGun)
			 && FlansModClient.currentScope != null)
		{
			event.setCanceled(true);
			return;
		}
		
		ScaledResolution scaledresolution = new ScaledResolution(FlansModClient.minecraft);
		int i = scaledresolution.getScaledWidth();
		int j = scaledresolution.getScaledHeight();
					
		Tessellator tessellator = Tessellator.getInstance();
		
		if(!event.isCancelable() && event.type == ElementType.HELMET)
		{
			RenderScopeOverlay(tessellator, i, j);
		}
		if(event.isCancelable() && event.type == ElementType.CROSSHAIRS)
		{
			RenderHitMarker(tessellator, i, j);
		}			
		if(event.isCancelable() && event.type == ElementType.HOTBAR)
		{
			RenderOffHandHighlights(tessellator, i, j);
		}
		if(!event.isCancelable() && event.type == ElementType.HOTBAR)
		{
			RenderPlayerAmmo(i, j);
			
			RenderTeamInfo(tessellator, i, j);
			
			RenderKillMessages(i, j);
			
			RenderVehicleDebug();
		}
	}
	
	private void RenderScopeOverlay(Tessellator tessellator, int i, int j)
	{
		//Scopes and helmet overlays
		String overlayTexture = null;
		if (FlansModClient.currentScope != null && FlansModClient.currentScope.hasZoomOverlay() && FMLClientHandler.instance().getClient().currentScreen == null && FlansModClient.zoomProgress > 0.8F)
		{
			overlayTexture = FlansModClient.currentScope.getZoomOverlay();
		}
		else if(mc.thePlayer != null)
		{
			ItemStack stack = mc.thePlayer.inventory.armorInventory[3];
			if(stack != null && stack.getItem() instanceof ItemTeamArmour)
			{
				overlayTexture = ((ItemTeamArmour)stack.getItem()).type.overlay;
			}
		}
		
		if(overlayTexture != null)
		{
			FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
			GL11.glEnable(3042 /* GL_BLEND */);
			GL11.glDisable(2929 /* GL_DEPTH_TEST */);
			GL11.glDepthMask(false);
			GL11.glBlendFunc(770, 771);
			GL11.glColor4f(1F, 1F, 1F, 1.0F);
			GL11.glDisable(3008 /* GL_ALPHA_TEST */);

			mc.renderEngine.bindTexture(FlansModResourceHandler.getScope(overlayTexture));

			tessellator.getWorldRenderer().begin(7, DefaultVertexFormats.POSITION_TEX);
			tessellator.getWorldRenderer().pos(i / 2 - 2 * j, j, -90D)   .tex(0.0D, 1.0D).endVertex();
	        tessellator.getWorldRenderer().pos(i / 2 + 2 * j, j, -90D)   .tex(1.0D, 1.0D).endVertex();
	        tessellator.getWorldRenderer().pos(i / 2 + 2 * j, 0.0D, -90D).tex(1.0D, 0.0D).endVertex();
	        tessellator.getWorldRenderer().pos(i / 2 - 2 * j, 0.0D, -90D).tex(0.0D, 0.0D).endVertex();
			tessellator.draw();
			GL11.glDepthMask(true);
			GL11.glEnable(2929 /* GL_DEPTH_TEST */);
			GL11.glEnable(3008 /* GL_ALPHA_TEST */);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}
	
	private void RenderHitMarker(Tessellator tessellator, int i, int j)
	{
		if(FlansModClient.hitMarkerTime > 0)
		{
			//Off-hand weapon graphics
			mc.renderEngine.bindTexture(hitMarker);
			
			GlStateManager.enableAlpha();
			GlStateManager.enableBlend();
			GlStateManager.color(1.0f, 1.0f, 1.0f, Math.max(((float)FlansModClient.hitMarkerTime - 10.0f + partialTicks) / 10.0f, 0.0f));

			
			ItemStack currentStack = mc.thePlayer.inventory.getCurrentItem();
			PlayerData data = PlayerHandler.getPlayerData(mc.thePlayer, Side.CLIENT);
			double zLevel = 0D;
			
			tessellator.getWorldRenderer().begin(7, DefaultVertexFormats.POSITION_TEX);
			tessellator.getWorldRenderer().pos(i / 2 - 4d, j / 2 + 5d, zLevel).tex(0D / 16D, 9D / 16D).endVertex();
	        tessellator.getWorldRenderer().pos(i / 2 + 5d, j / 2 + 5d, zLevel).tex(9D / 16D, 9D / 16D).endVertex();
	        tessellator.getWorldRenderer().pos(i / 2 + 5d, j / 2 - 4d, zLevel).tex(9D / 16D, 0D / 16D).endVertex();
	        tessellator.getWorldRenderer().pos(i / 2 - 4d, j / 2 - 4d, zLevel).tex(0D / 16D, 0D / 16D).endVertex();
			tessellator.draw();
			

			GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
			GlStateManager.disableAlpha();
			GlStateManager.disableBlend();
		}
	}
	
	private void RenderOffHandHighlights(Tessellator tessellator, int i, int j)
	{
		//Off-hand weapon graphics
		mc.renderEngine.bindTexture(offHand);
		
		ItemStack currentStack = mc.thePlayer.inventory.getCurrentItem();
		PlayerData data = PlayerHandler.getPlayerData(mc.thePlayer, Side.CLIENT);
		double zLevel = 0D;
		
		if(currentStack != null && currentStack.getItem() instanceof ItemGun && ((ItemGun)currentStack.getItem()).GetType().oneHanded)
		{
			for(int n = 0; n < 9; n++)
			{
				if(data.offHandGunSlot == n + 1)
				{
					tessellator.getWorldRenderer().begin(7, DefaultVertexFormats.POSITION_TEX);
					tessellator.getWorldRenderer().pos(i / 2 - 88 + 20 * n, j - 3, zLevel).tex(16D / 64D, 16D / 32D).endVertex();
			        tessellator.getWorldRenderer().pos(i / 2 - 72 + 20 * n, j - 3, zLevel).tex(32D / 64D, 16D / 32D).endVertex();
			        tessellator.getWorldRenderer().pos(i / 2 - 72 + 20 * n, j - 19, zLevel).tex(32D / 64D, 0D / 32D).endVertex();
			        tessellator.getWorldRenderer().pos(i / 2 - 88 + 20 * n, j - 19, zLevel).tex(16D / 64D, 0D / 32D).endVertex();
					tessellator.draw();
				}
				else if(data.isValidOffHandWeapon(mc.thePlayer, n + 1))
				{					
					tessellator.getWorldRenderer().begin(7, DefaultVertexFormats.POSITION_TEX);
					tessellator.getWorldRenderer().pos(i / 2 - 88 + 20 * n, j - 3, zLevel).tex(0D / 64D, 16D / 32D).endVertex();
			        tessellator.getWorldRenderer().pos(i / 2 - 72 + 20 * n, j - 3, zLevel).tex(16D / 64D, 16D / 32D).endVertex();
			        tessellator.getWorldRenderer().pos(i / 2 - 72 + 20 * n, j - 19, zLevel).tex(16D / 64D, 0D / 32D).endVertex();
			        tessellator.getWorldRenderer().pos(i / 2 - 88 + 20 * n, j - 19, zLevel).tex(0D / 64D, 0D / 32D).endVertex();
					tessellator.draw();
				}
			}
		}
	}
	
	private void RenderPlayerAmmo(int i, int j)
	{
		//Player ammo overlay
		if(mc.thePlayer != null)
		{
			ItemStack stack = mc.thePlayer.inventory.getCurrentItem();
			if(stack != null && stack.getItem() instanceof ItemGun)
			{
				ItemGun gunItem = (ItemGun)stack.getItem();
				GunType gunType = gunItem.GetType();
				int x = 0;
				for(int n = 0; n < gunType.numAmmoItemsInGun; n++)
				{
					ItemStack bulletStack = ((ItemGun)stack.getItem()).getBulletItemStack(stack, n);
					if(bulletStack != null && bulletStack.getItem() != null && bulletStack.getItemDamage() < bulletStack.getMaxDamage())
					{
						RenderHelper.enableGUIStandardItemLighting();
						GL11.glEnable(GL12.GL_RESCALE_NORMAL);
						OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
						drawSlotInventory(mc.fontRendererObj, bulletStack, i / 2 + 16 + x, j - 65);
						GL11.glDisable(GL12.GL_RESCALE_NORMAL);
						RenderHelper.disableStandardItemLighting();
						String s = (bulletStack.getMaxDamage() - bulletStack.getItemDamage()) + "/" + bulletStack.getMaxDamage();
						if(bulletStack.getMaxDamage() == 1)
							s = "";
						mc.fontRendererObj.drawString(s, i / 2 + 32 + x, j - 59, 0x000000);
						mc.fontRendererObj.drawString(s, i / 2 + 33 + x, j - 60, 0xffffff);
						x += 16 + mc.fontRendererObj.getStringWidth(s);
					}
				}
				//Render secondary gun
				PlayerData data = PlayerHandler.getPlayerData(mc.thePlayer, Side.CLIENT);
				if(gunType.oneHanded && data.offHandGunSlot != 0)
				{
					ItemStack offHandStack = mc.thePlayer.inventory.getStackInSlot(data.offHandGunSlot - 1);
					if(offHandStack != null && offHandStack.getItem() instanceof ItemGun)
					{
						GunType offHandGunType = ((ItemGun)offHandStack.getItem()).GetType();
						x = 0;
						for(int n = 0; n < offHandGunType.numAmmoItemsInGun; n++)
						{
							ItemStack bulletStack = ((ItemGun)offHandStack.getItem()).getBulletItemStack(offHandStack, n);
							if(bulletStack != null && bulletStack.getItem() != null && bulletStack.getItemDamage() < bulletStack.getMaxDamage())
							{
								//Find the string we are displaying next to the ammo item
								String s = (bulletStack.getMaxDamage() - bulletStack.getItemDamage()) + "/" + bulletStack.getMaxDamage();
								if(bulletStack.getMaxDamage() == 1)
									s = "";
								
								//Draw the slot and then move leftwards
								RenderHelper.enableGUIStandardItemLighting();
								GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
								GL11.glEnable(GL12.GL_RESCALE_NORMAL);
								OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
								drawSlotInventory(mc.fontRendererObj, bulletStack, i / 2 - 32 - x, j - 65);	
								x += 16 + mc.fontRendererObj.getStringWidth(s);
								
								//Draw the string
								GL11.glDisable(GL12.GL_RESCALE_NORMAL);
								RenderHelper.disableStandardItemLighting();
								mc.fontRendererObj.drawString(s, i / 2 - 16 - x, j - 59, 0x000000);
								mc.fontRendererObj.drawString(s, i / 2 - 17 - x, j - 60, 0xffffff);
							}
						}
					}
				}
			}
		}
	}
	
	private void RenderTeamInfo(Tessellator tessellator, int i, int j)
	{
		PacketTeamInfo teamInfo = FlansModClient.teamInfo;
		
		if(teamInfo != null && FlansModClient.minecraft.thePlayer != null && (teamInfo.numTeams > 0 || !teamInfo.sortedByTeam) && teamInfo.getPlayerScoreData(FlansModClient.minecraft.thePlayer.getName()) != null)
		{
			GL11.glEnable(3042 /* GL_BLEND */);
			GL11.glDisable(2929 /* GL_DEPTH_TEST */);
			GL11.glDepthMask(false);
			GL11.glBlendFunc(770, 771);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			GL11.glDisable(3008 /* GL_ALPHA_TEST */);

			mc.renderEngine.bindTexture(GuiTeamScores.texture);
			
			tessellator.getWorldRenderer().begin(7, DefaultVertexFormats.POSITION_TEX);
			tessellator.getWorldRenderer().pos(i / 2 - 43, 27, -90D).tex(85D / 256D, 27D / 256D).endVertex();
	        tessellator.getWorldRenderer().pos(i / 2 + 43, 27, -90D).tex(171D / 256D, 27D / 256D).endVertex();
	        tessellator.getWorldRenderer().pos(i / 2 + 43, 0D, -90D).tex(171D / 256D, 0D / 256D).endVertex();
	        tessellator.getWorldRenderer().pos(i / 2 - 43, 0D, -90D).tex(85D / 256D, 0D / 256D).endVertex();
			tessellator.draw();
			
			//If we are in a two team gametype, draw the team scores at the top of the screen
			
			if(teamInfo.numTeams == 2 && teamInfo.sortedByTeam)
			{
				if(teamInfo.teamData == null || teamInfo.teamData[0] == null || teamInfo.teamData[0].team == null || teamInfo.teamData[1] == null || teamInfo.teamData[1].team == null)
				{
					FlansMod.Assert(false, "Failure in team data overlay");
					return;
				}
				
				//Draw team 1 colour bit
				int colour = teamInfo.teamData[0].team.teamColour;	
				GL11.glColor4f(((colour >> 16) & 0xff) / 256F, ((colour >> 8) & 0xff) / 256F, (colour & 0xff) / 256F, 1.0F);
				tessellator.getWorldRenderer().begin(7, DefaultVertexFormats.POSITION_TEX);
				tessellator.getWorldRenderer().pos(i / 2 - 43, 27, -90D).tex(0D / 256D, 125D / 256D).endVertex();
		        tessellator.getWorldRenderer().pos(i / 2 - 19, 27, -90D).tex(24D / 256D, 125D / 256D).endVertex();
		        tessellator.getWorldRenderer().pos(i / 2 - 19, 0D, -90D).tex(24D / 256D, 98D / 256D).endVertex();
		        tessellator.getWorldRenderer().pos(i / 2 - 43, 0D, -90D).tex(0D / 256D, 98D / 256D).endVertex();
				tessellator.draw();
				//Draw team 2 colour bit
				colour = teamInfo.teamData[1].team.teamColour;	
				GL11.glColor4f(((colour >> 16) & 0xff) / 256F, ((colour >> 8) & 0xff) / 256F, (colour & 0xff) / 256F, 1.0F);
				tessellator.getWorldRenderer().begin(7, DefaultVertexFormats.POSITION_TEX);
				tessellator.getWorldRenderer().pos(i / 2 + 19, 27, -90D).tex(62D / 256D, 125D / 256D).endVertex();
		        tessellator.getWorldRenderer().pos(i / 2 + 43, 27, -90D).tex(86D / 256D, 125D / 256D).endVertex();
		        tessellator.getWorldRenderer().pos(i / 2 + 43, 0D, -90D).tex(86D / 256D, 98D / 256D).endVertex();
		        tessellator.getWorldRenderer().pos(i / 2 + 19, 0D, -90D).tex(62D / 256D, 98D / 256D).endVertex(); 
				tessellator.draw();
				
				GL11.glDepthMask(true);
				GL11.glEnable(2929 /* GL_DEPTH_TEST */);
				GL11.glEnable(3008 /* GL_ALPHA_TEST */);
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				
				//Draw the team scores
				if(teamInfo.teamData[0] != null && teamInfo.teamData[1] != null)
				{
					mc.fontRendererObj.drawString(teamInfo.teamData[0].score + "", i / 2 - 35, 9, 0x000000);
					mc.fontRendererObj.drawString(teamInfo.teamData[0].score + "", i / 2 - 36, 8, 0xffffff);
					mc.fontRendererObj.drawString(teamInfo.teamData[1].score + "", i / 2 + 35 - mc.fontRendererObj.getStringWidth(teamInfo.teamData[1].score + ""), 9, 0x000000);
					mc.fontRendererObj.drawString(teamInfo.teamData[1].score + "", i / 2 + 34 - mc.fontRendererObj.getStringWidth(teamInfo.teamData[1].score + ""), 8, 0xffffff);
				}
			}
			
			
			mc.fontRendererObj.drawString(teamInfo.gametype + "", i / 2 + 48, 9, 0x000000);
			mc.fontRendererObj.drawString(teamInfo.gametype + "", i / 2 + 47, 8, 0xffffff);
			mc.fontRendererObj.drawString(teamInfo.map + "", i / 2 - 47 - mc.fontRendererObj.getStringWidth(teamInfo.map + ""), 9, 0x000000);
			mc.fontRendererObj.drawString(teamInfo.map + "", i / 2 - 48 - mc.fontRendererObj.getStringWidth(teamInfo.map + ""), 8, 0xffffff);
			
			int secondsLeft = teamInfo.timeLeft / 20;
			int minutesLeft = secondsLeft / 60;
			secondsLeft = secondsLeft % 60;
			String timeLeft = minutesLeft + ":" + (secondsLeft < 10 ? "0" + secondsLeft : secondsLeft);
			mc.fontRendererObj.drawString(timeLeft, i / 2 - mc.fontRendererObj.getStringWidth(timeLeft) / 2 - 1, 29, 0x000000);
			mc.fontRendererObj.drawString(timeLeft, i / 2 - mc.fontRendererObj.getStringWidth(timeLeft) / 2, 30, 0xffffff);

			
			GL11.glDepthMask(true);
			GL11.glEnable(2929 /* GL_DEPTH_TEST */);
			GL11.glEnable(3008 /* GL_ALPHA_TEST */);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			String playerUsername = FlansModClient.minecraft.thePlayer.getName();
			
			PlayerScoreData data = teamInfo.getPlayerScoreData(playerUsername);
			if(data != null)
			{
				mc.fontRendererObj.drawString(data.score + "", i / 2 - 7, 1, 0x000000);
				mc.fontRendererObj.drawString(data.kills + "", i / 2 - 7, 9, 0x000000);
				mc.fontRendererObj.drawString(data.deaths + "", i / 2 - 7, 17, 0x000000);
			}
		}
	}
	
	private void RenderKillMessages(int i, int j)
	{
		for(int n = 0; n < killMessages.size(); n++)
		{
			KillMessage killMessage = killMessages.get(n);
			mc.fontRendererObj.drawString("\u00a7" + killMessage.killerName + "     " + "\u00a7" + killMessage.killedName, i - mc.fontRendererObj.getStringWidth(killMessage.killerName + "     " + killMessage.killedName) - 6, j - 32 - killMessage.line * 16, 0xffffff);
		}
					
		//Draw icons indicated weapons used
		RenderHelper.enableGUIStandardItemLighting();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);

		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);	
		for(int n = 0; n < killMessages.size(); n++)
		{
			KillMessage killMessage = killMessages.get(n);
			drawSlotInventory(mc.fontRendererObj, new ItemStack(killMessage.weapon.item, 1, killMessage.paint), i - mc.fontRendererObj.getStringWidth("     " + killMessage.killedName) - 12, j - 36 - killMessage.line * 16);
		}
		GL11.glDisable(3042 /*GL_BLEND*/);
		RenderHelper.disableStandardItemLighting();
	}
	
	private void RenderVehicleDebug()
	{
		//DEBUG vehicles
		if(mc.thePlayer.ridingEntity instanceof EntitySeat)
		{
			EntityDriveable ent = ((EntitySeat)mc.thePlayer.ridingEntity).driveable;
			
			double dX = ent.posX - ent.prevPosX;
			double dY = ent.posY - ent.prevPosY;
			double dZ = ent.posZ - ent.prevPosZ;
			
			//Convert to chunks per Minecraft hour
			float speed = (float)Math.sqrt(dX * dX + dY * dY + dZ * dZ) * 1000F / 16F; 
			
			speed = (int)(speed * 10F) / 10F;
			
			mc.fontRendererObj.drawString("Speed: " + speed + " chunks per hour", 2, 2, 0xffffff);
			
			if(FlansMod.DEBUG)
			{
				mc.fontRendererObj.drawString("Throttle : " + ent.throttle, 2, 12, 0xffffff);
			}
		}
	}
	
	private void drawSlotInventory(FontRenderer fontRenderer, ItemStack itemstack, int i, int j)
	{
		if(itemstack == null || itemstack.getItem() == null)
			return;
		itemRenderer.renderItemIntoGUI(itemstack, i, j);
		itemRenderer.renderItemOverlayIntoGUI(fontRenderer, itemstack, i, j, null); //May be something other than null
	}
		
	public static void addKillMessage(boolean headshot, InfoType infoType, String killer, String killed)
	{
		for(KillMessage killMessage : killMessages)
		{
			killMessage.line++;
			if(killMessage.line > 10)
				killMessage.timer = 0;
		}
		killMessages.add(new KillMessage(headshot, infoType, killer, killed));
	}
	
	private static class KillMessage
	{
		public KillMessage(boolean head, InfoType infoType, String killer, String killed)
		{
			headshot = head;
			killerName = killer;
			killedName = killed;
			weapon = infoType;
			line = 0;
			timer = 200;
			
			// Get the player and see if they're still holding the gun they used to kill this player. From that we can work out the paintjob
			for(Object o : Minecraft.getMinecraft().theWorld.playerEntities)
			{
				if(((EntityPlayer)o).getDisplayNameString().equals(killerName))
				{
					ItemStack stack = ((EntityPlayer)o).getCurrentEquippedItem();
					if(stack != null && stack.getItem() instanceof IPaintableItem)
					{
						paint = stack.getItemDamage();
						break;
					}
				}
			}
		}
		
		public String killerName = "";
		public String killedName = "";
		public InfoType weapon = null;
		public int paint = 0;
		public int timer = 0;
		public int line = 0;
		public boolean headshot = false;
	}
}
