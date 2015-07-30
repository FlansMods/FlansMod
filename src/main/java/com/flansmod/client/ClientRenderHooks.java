package com.flansmod.client;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.client.event.EntityViewRenderEvent.CameraSetup;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;

import com.flansmod.api.IControllable;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.network.PacketTeamInfo.PlayerScoreData;
import com.flansmod.common.teams.Team;

public class ClientRenderHooks 
{
	private Minecraft mc;
	private float fovModifierHandPrev, fovModifierHand;
	private float equippedProgress, prevEquippedProgress;
	private ItemStack itemToRender;
	private int equippedItemSlot;
	private static float partialTicks;
	
	public ClientRenderHooks()
	{
		mc = Minecraft.getMinecraft();
	}
	
	/** When Minecraft would render a 2D gun item, instead cancel it and render the gun properly. Render the offhand gun too. */
	@SubscribeEvent
	public void renderHeldItem(RenderHandEvent event)
	{
		EntityPlayer player = mc.thePlayer;
		if(itemToRender != null && itemToRender.getItem() instanceof ItemGun && ((ItemGun)itemToRender.getItem()).type.model != null)
		{
			//Cancel the hand render event so that we can do our own.
			event.setCanceled(true);
		
			//Render the gun in hand
			ItemStack stack = itemToRender;
			GunType type = ((ItemGun)stack.getItem()).type;
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
        
        //Do player rotations
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

        ClientProxy.gunRenderer.renderItem(ItemRenderType.EQUIPPED_FIRST_PERSON, stack, mc.theWorld, mc.thePlayer);
        //this.renderItem(entityplayersp, this.itemToRender, ItemCameraTransforms.TransformType.FIRST_PERSON);

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
        float fovModifier = 1.0F;

        //Update the FOV Modifier
        if (this.mc.getRenderViewEntity() instanceof AbstractClientPlayer)
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
        EntityPlayerSP entityplayersp = mc.thePlayer;
        ItemStack itemstack = entityplayersp.inventory.getCurrentItem();
        boolean flag = false;

        if(itemToRender != null && itemstack != null)
        {
            if (!itemToRender.getIsItemStackEqual(itemstack))
            {
                if (!itemToRender.getItem().shouldCauseReequipAnimation(itemToRender, itemstack, equippedItemSlot != entityplayersp.inventory.currentItem))
                {
                    itemToRender = itemstack;
                    equippedItemSlot = entityplayersp.inventory.currentItem;
                    return;
                }
                flag = true;
            }
        }
        else if(itemToRender == null && itemstack == null)
        {
            flag = false;
        }
        else
        {
            flag = true;
        }

        float f = 0.4F;
        float f1 = flag ? 0.0F : 1.0F;
        float f2 = MathHelper.clamp_float(f1 - equippedProgress, -f, f);
        equippedProgress += f2;

        if(equippedProgress < 0.1F)
        {
            itemToRender = itemstack;
            equippedItemSlot = entityplayersp.inventory.currentItem;
        }
    }
    
    public static void updateRenderTick(float dT)
    {
    	partialTicks = dT;
    }
    
	@SubscribeEvent
	public void renderThirdPersonWeapons(RenderLivingEvent.Post event)
	{
		ModelBase mainModel = event.renderer.getMainModel();
		EntityLivingBase entity = event.entity;
		
		if(entity.getEquipmentInSlot(0) != null && entity.getEquipmentInSlot(0).getItem() instanceof ItemGun && mainModel instanceof ModelBiped)
		{
			ModelBiped biped = (ModelBiped)mainModel;
			ItemStack stack = entity.getEquipmentInSlot(0);
			GunType type = ((ItemGun)stack.getItem()).type;
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
	        mainModel.setLivingAnimations(entity, f8, f7, partialTicks);
	        mainModel.setRotationAngles(f8, f7, f5, f4, f9, 0.0625F, entity);
	
	        //Render main hand gun
	        {
		        GlStateManager.pushMatrix();
		        biped.bipedRightArm.postRender(0.0625F);
		        GlStateManager.translate(-0.05F, 0.4F, 0.05F);
		        ClientProxy.gunRenderer.renderItem(ItemRenderType.EQUIPPED, stack, mc.theWorld, mc.thePlayer);
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
					GunType gunType = ((ItemGun)gunStack.getItem()).type;
							
					//Render!
					GlStateManager.pushMatrix();			
					biped.bipedLeftArm.postRender(0.0625F);
					GlStateManager.rotate(-90F, 1F, 0F, 0F);
					GlStateManager.rotate(-90F, 0F, 1F, 0F);

					GlStateManager.translate(0.6F, -0.05F, -0.05F);
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
	/*
	private void doStuff(Event event)
	{
		RenderPlayer renderer = event.renderer;
		EntityPlayer player = event.entityPlayer;
		float dt = event.partialRenderTick;
		PlayerData data = PlayerHandler.getPlayerData(player, Side.CLIENT);
		
		ItemStack gunStack = null;
		
		//Check current stack is a one handed gun
		if(player instanceof EntityOtherPlayerMP)
		{
			gunStack = data.offHandGunStack;
		}
		else
		{
			ItemStack currentStack = player.getCurrentEquippedItem();
			if(currentStack == null || !(currentStack.getItem() instanceof ItemGun) || !((ItemGun)currentStack.getItem()).type.oneHanded || data.offHandGunSlot == 0)
				return;
			gunStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);
		}
				
		if(gunStack == null || !(gunStack.getItem() instanceof ItemGun))
			return;
		GunType gunType = ((ItemGun)gunStack.getItem()).type;
				
		//Render!
		GL11.glPushMatrix();
		
		renderer.getPlayerModel().bipedLeftArm.postRender(0.0625F);
        GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);


		float f2 = 1F;

		GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
		GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
		GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
		GL11.glScalef(-f2, -f2, f2);

		int k = gunStack.getItem().getColorFromItemStack(gunStack, 0);
		float f11 = (float)(k >> 16 & 255) / 255.0F;
		float f12 = (float)(k >> 8 & 255) / 255.0F;
		float f3 = (float)(k & 255) / 255.0F;
		GL11.glColor4f(f11, f12, f3, 1.0F);
		ClientProxy.gunRenderer.renderOffHandGun(player, gunStack);

		GL11.glPopMatrix();
		
		
		
		//Render main hand gun?
		
	}
	*/
	private float interpolateRotation(float x, float y, float dT)
	{
		float f3;

		for(f3 = y - x; f3 < -180.0F; f3 += 360.0F) { }
		for( ; f3 >= 180.0F; f3 -= 360.0F) { }

		return x + dT * f3;
	}

	//Handle player hiding / name tag removal for teams
	@SubscribeEvent
	public void renderPlayer(RenderPlayerEvent.Pre event)
	{
		PlayerData data = PlayerHandler.getPlayerData(event.entityPlayer, Side.CLIENT);
		
		//Render debug boxes for player snapshots
		if(FlansMod.DEBUG && data != null)
		{
			if(data.snapshots[0] != null)
				data.snapshots[0].renderSnapshot();
		}
					
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
	
	@SubscribeEvent
	public void cameraSetup(CameraSetup event)
	{
		if(mc.thePlayer.ridingEntity instanceof IControllable)
		{
			IControllable cont = (IControllable)mc.thePlayer.ridingEntity;
			event.roll = cont.getPrevPlayerRoll() + (cont.getPlayerRoll() - cont.getPrevPlayerRoll()) * (float)event.renderPartialTicks;
		}
	}
}
