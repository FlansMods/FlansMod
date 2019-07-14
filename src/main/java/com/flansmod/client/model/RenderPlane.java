package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.event.RenderPlayerEvent;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.client.model.animation.AnimationController;
import com.flansmod.client.model.animation.AnimationPart;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.DriveablePosition;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.ShootPoint;
import com.flansmod.common.paintjob.Paintjob;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.ItemPlane;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.Propeller;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.vector.Quaternion;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class RenderPlane extends Render implements IItemRenderer 
{	
    public RenderPlane()
    {
        shadowSize = 1.0F;
    }

    public void render(EntityPlane entityPlane, double d, double d1, double d2, float f, float f1)
    {
    	if(entityPlane.ridingEntity != null)
    	{
    		if(entityPlane.ridingEntity.getClass().toString().indexOf("mcheli.aircraft.MCH_EntitySeat") > 0)
    		{
    			return;
    		}
    	}
    	
    	bindEntityTexture(entityPlane);
    	PlaneType type = entityPlane.getPlaneType();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);      
        float dYaw = (entityPlane.axes.getYaw() - entityPlane.prevRotationYaw);
        for(; dYaw > 180F; dYaw -= 360F) {}
        for(; dYaw <= -180F; dYaw += 360F) {}
        float dPitch = (entityPlane.axes.getPitch() - entityPlane.prevRotationPitch);
        for(; dPitch > 180F; dPitch -= 360F) {}
        for(; dPitch <= -180F; dPitch += 360F) {}
        float dRoll = (entityPlane.axes.getRoll() - entityPlane.prevRotationRoll);
        for(; dRoll > 180F; dRoll -= 360F) {}
        for(; dRoll <= -180F; dRoll += 360F) {}
        GL11.glRotatef(180F - entityPlane.prevRotationYaw - dYaw * f1, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(entityPlane.prevRotationPitch + dPitch * f1, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(entityPlane.prevRotationRoll + dRoll * f1, 1.0F, 0.0F, 0.0F);

		ModelPlane model = (ModelPlane)type.model;
		if(model != null)
		{
	        GL11.glPushMatrix();
			GL11.glScalef(type.modelScale, type.modelScale, type.modelScale);
			model.render(entityPlane, f1);
			float dRotorAngle = entityPlane.rotorAngle - entityPlane.prevRotorAngle;
			float rotorAngle = entityPlane.prevRotorAngle + dRotorAngle*f1;
			//Render heli main rotors
			for(int i = 0; i < model.heliMainRotorModels.length; i++)
			{
				GL11.glPushMatrix();
				GL11.glTranslatef(model.heliMainRotorOrigins[i].x, model.heliMainRotorOrigins[i].y, model.heliMainRotorOrigins[i].z);
			    GL11.glRotatef((entityPlane.rotorAngle + f1 * entityPlane.throttle / 7F) * model.heliRotorSpeeds[i] * 1440F / 3.14159265F, 0.0F, 1.0F, 0.0F);
			    GL11.glTranslatef(-model.heliMainRotorOrigins[i].x, -model.heliMainRotorOrigins[i].y, -model.heliMainRotorOrigins[i].z);
				model.renderRotor(entityPlane, 0.0625F, i);
				GL11.glPopMatrix();
			}
			//Render heli tail rotors
			for(int i = 0; i < model.heliTailRotorModels.length; i++)
			{
				GL11.glPushMatrix();
				GL11.glTranslatef(model.heliTailRotorOrigins[i].x, model.heliTailRotorOrigins[i].y, model.heliTailRotorOrigins[i].z);
			    GL11.glRotatef((entityPlane.rotorAngle + f1 * entityPlane.throttle / 7F) * 1440F / 3.14159265F, 0.0F, 0.0F, 1.0F);
				GL11.glTranslatef(-model.heliTailRotorOrigins[i].x, -model.heliTailRotorOrigins[i].y, -model.heliTailRotorOrigins[i].z);
				model.renderTailRotor(entityPlane, 0.0625F, i);
				GL11.glPopMatrix();
			}
			
			Vector3f wingPos = getRenderPosition(entityPlane.wingPos, entityPlane.prevWingPos, f1);
			Vector3f wingRot = getRenderPosition(entityPlane.wingRot, entityPlane.prevWingRot, f1);
			if(entityPlane.initiatedAnim){
				AnimationController cont = entityPlane.anim;
				AnimationPart p = cont.getCorePart();
				renderAnimPart(p, new Vector3f(0,0,0), model, entityPlane, 0.0625F, f1);
			}
			
			//Rotate/Render left wing
			GL11.glPushMatrix();
			GL11.glTranslatef(model.leftWingAttach.x + wingPos.x/16, model.leftWingAttach.y + wingPos.y/16, -model.leftWingAttach.z + wingPos.z/16);
			GL11.glRotatef(wingRot.x, 1F, 0F, 0F);
			GL11.glRotatef(wingRot.y, 0F, 1F, 0F);
			GL11.glRotatef(wingRot.z, 0F, 0F, 1F);
			model.renderLeftWing(entityPlane, 0.0625F);
			GL11.glPopMatrix();
			
			
			//Rotate/Render right wing
			GL11.glPushMatrix();
			GL11.glTranslatef(model.rightWingAttach.x + wingPos.x/16, model.rightWingAttach.y + wingPos.y/16, -model.rightWingAttach.z + wingPos.z/16);
			GL11.glRotatef(-wingRot.x, 1F, 0F, 0F);
			GL11.glRotatef(-wingRot.y, 0F, 1F, 0F);
			GL11.glRotatef(wingRot.z, 0F, 0F, 1F);
			model.renderRightWing(entityPlane, 0.0625F);
			GL11.glPopMatrix();
			
			//Rotate/Render left wing wheel
			GL11.glPushMatrix();
			GL11.glTranslatef(model.leftWingWheelAttach.x + entityPlane.wingWheelPos.x/16, model.leftWingWheelAttach.y+ entityPlane.wingWheelPos.y/16, -model.leftWingWheelAttach.z + entityPlane.wingWheelPos.z/16);
			GL11.glRotatef(entityPlane.wingWheelRot.x, 1F, 0F, 0F);
			GL11.glRotatef(entityPlane.wingWheelRot.y, 0F, 1F, 0F);
			GL11.glRotatef(entityPlane.wingWheelRot.z, 0F, 0F, 1F);
			model.renderLeftWingWheel(entityPlane, 0.0625F);
			GL11.glPopMatrix();
			
			//Rotate/Render right wing wheel
			GL11.glPushMatrix();
			GL11.glTranslatef(model.rightWingWheelAttach.x + entityPlane.wingWheelPos.x/16, model.rightWingWheelAttach.y + entityPlane.wingWheelPos.y/16, -model.rightWingWheelAttach.z + entityPlane.wingWheelPos.z/16);
			GL11.glRotatef(-entityPlane.wingWheelRot.x, 1F, 0F, 0F);
			GL11.glRotatef(-entityPlane.wingWheelRot.y, 0F, 1F, 0F);
			GL11.glRotatef(entityPlane.wingWheelRot.z, 0F, 0F, 1F);
			model.renderRightWingWheel(entityPlane, 0.0625F);
			GL11.glPopMatrix();
			
			//Rotate/Render core wheel
			GL11.glPushMatrix();
			GL11.glTranslatef(model.bodyWheelAttach.x + entityPlane.coreWheelPos.x/16, model.bodyWheelAttach.y + entityPlane.coreWheelPos.y/16, model.bodyWheelAttach.z + entityPlane.coreWheelPos.z/16);
			GL11.glRotatef(entityPlane.coreWheelRot.x, 1F, 0F, 0F);
			GL11.glRotatef(entityPlane.coreWheelRot.y, 0F, 1F, 0F);
			GL11.glRotatef(entityPlane.coreWheelRot.z, 0F, 0F, 1F);
			model.renderCoreWheel(entityPlane, 0.0625F);
			GL11.glPopMatrix();
			
			//Rotate/Render tail wheel
			GL11.glPushMatrix();
			GL11.glTranslatef(model.tailWheelAttach.x + entityPlane.tailWheelPos.x/16, model.tailWheelAttach.y + entityPlane.tailWheelPos.y/16, model.tailWheelAttach.z + entityPlane.tailWheelPos.z/16);
			GL11.glRotatef(entityPlane.tailWheelRot.x, 1F, 0F, 0F);
			GL11.glRotatef(entityPlane.tailWheelRot.y, 0F, 1F, 0F);
			GL11.glRotatef(entityPlane.tailWheelRot.z, 0F, 0F, 1F);
			model.renderTailWheel(entityPlane, 0.0625F);
			GL11.glPopMatrix();
			
			Vector3f doorPos = getRenderPosition(entityPlane.doorPos, entityPlane.prevDoorPos, f1);
			Vector3f doorRot = getRenderPosition(entityPlane.doorRot, entityPlane.prevDoorRot, f1);

			
			//Rotate/Render door
			GL11.glPushMatrix();
			GL11.glTranslatef(model.doorAttach.x + doorPos.x/16, model.doorAttach.y + doorPos.y/16, model.doorAttach.z + doorPos.z/16);
			GL11.glRotatef(doorRot.x, 1F, 0F, 0F);
			GL11.glRotatef(doorRot.y, 0F, 1F, 0F);
			GL11.glRotatef(doorRot.z, 0F, 0F, 1F);
			model.renderDoor(entityPlane, 0.0625F);
			GL11.glPopMatrix();
			
			GL11.glPopMatrix();
		}
		
		if(FlansMod.DEBUG)
		{
			GL11.glDisable(GL11.GL_TEXTURE_2D);
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glDisable(GL11.GL_DEPTH_TEST);
			GL11.glColor4f(1F, 0F, 0F, 0.3F);
			GL11.glScalef(-1F, 1F, -1F);
			for(DriveablePart part : entityPlane.getDriveableData().parts.values())
			{
				if(part.box == null)
					continue;
				
				GL11.glColor4f(1F, entityPlane.isPartIntact(part.type) ? 1F : 0F, 0F, 0.3F);
				
				renderAABB(AxisAlignedBB.getBoundingBox(part.box.x, part.box.y, part.box.z, (part.box.x + part.box.w), (part.box.y + part.box.h), (part.box.z + part.box.d)));
			}
			GL11.glColor4f(1F, 1F, 0F, 0.3F);
			for(Propeller prop : type.propellers)
			{				
				renderAABB(AxisAlignedBB.getBoundingBox(prop.x / 16F - 0.25F, prop.y / 16F - 0.25F, prop.z / 16F - 0.25F, prop.x / 16F + 0.25F, prop.y / 16F + 0.25F, prop.z / 16F + 0.25F));
			}
			
			//Render shoot points
			GL11.glColor4f(1F, 0F, 1F, 0.3F);
			for(ShootPoint point : type.shootPointsPrimary)			
				renderAABB(AxisAlignedBB.getBoundingBox(point.rootPos.position.x - 0.25F, point.rootPos.position.y - 0.25F, point.rootPos.position.z - 0.25F, point.rootPos.position.x + 0.25F, point.rootPos.position.y + 0.25F, point.rootPos.position.z + 0.25F));
			
			GL11.glColor4f(0F, 1F, 0F, 0.3F);
			for(ShootPoint point : type.shootPointsSecondary)			
				renderAABB(AxisAlignedBB.getBoundingBox(point.rootPos.position.x - 0.25F, point.rootPos.position.y - 0.25F, point.rootPos.position.z - 0.25F, point.rootPos.position.x + 0.25F, point.rootPos.position.y + 0.25F, point.rootPos.position.z + 0.25F));
			
			//GL11.glColor4f(0F, 0F, 0F, 0.3F);	
			//if(type.bombPosition != null)
			//	renderAABB(AxisAlignedBB.getBoundingBox(type.bombPosition.x - 0.25F, type.bombPosition.y - 0.25F, type.bombPosition.z - 0.25F, type.bombPosition.x + 0.25F, type.bombPosition.y + 0.25F, type.bombPosition.z + 0.25F));
			
			GL11.glEnable(GL11.GL_TEXTURE_2D);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glDisable(GL11.GL_BLEND);
			GL11.glColor4f(1F, 1F, 1F, 1F);
		}
        GL11.glPopMatrix();
    }
    
    public Vector3f getRenderPosition(Vector3f current, Vector3f previous, float f)
    {
    	Vector3f diff = new Vector3f(current.x - previous.x, current.y - previous.y, current.z - previous.z);
    	
    	Vector3f corrected = new Vector3f(previous.x + (diff.x*f),previous.y + (diff.y*f), previous.z + (diff.z*f));
    	return corrected;
    }

    @Override
	public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
        render((EntityPlane)entity, d, d1, d2, f, f1);
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		DriveableType type = ((EntityDriveable)entity).getDriveableType();
		Paintjob paintjob = type.getPaintjob(((EntityDriveable)entity).getDriveableData().paintjobID);
		return FlansModResourceHandler.getPaintjobTexture(paintjob);
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) 
	{
		switch(type)
		{
		case EQUIPPED : case EQUIPPED_FIRST_PERSON : case ENTITY : return Minecraft.getMinecraft().gameSettings.fancyGraphics && item != null && item.getItem() instanceof ItemPlane && ((ItemPlane)item.getItem()).type.model != null;
		default : break;
		}
		return false;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) 
	{
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) 
	{
		GL11.glPushMatrix();
		if(item != null && item.getItem() instanceof ItemPlane)
		{
			PlaneType planeType = ((ItemPlane)item.getItem()).type;
			if(planeType.model != null)
			{
				float scale = 0.5F;
				switch(type)
				{
				case ENTITY:
				{
					scale = 1.5F;
					GL11.glRotatef(((EntityItem)data[1]).ticksExisted, 0F, 1F, 0F);
					break;
				}
				case EQUIPPED:
				{
					GL11.glRotatef(15F, 0F, 0F, 1F);
					GL11.glRotatef(15F, 1F, 0F, 0F);
					GL11.glRotatef(90F, 0F, 1F, 0F);
					GL11.glTranslatef(0F, 0.2F, 0.4F);
					scale = 1F;
					break;
				}
				case EQUIPPED_FIRST_PERSON:
				{
					GL11.glRotatef(25F, 0F, 0F, 1F); 
					GL11.glRotatef(-5F, 0F, 1F, 0F);
					GL11.glTranslatef(0.15F, 0.45F, -0.6F);
					GL11.glRotatef(180F, 0F, 1F, 0F);
					break;
				}
				default : break;
				}
				
				GL11.glScalef(scale / planeType.cameraDistance, scale / planeType.cameraDistance, scale / planeType.cameraDistance);
				Minecraft.getMinecraft().renderEngine.bindTexture(FlansModResourceHandler.getTexture(planeType));
				ModelDriveable model = planeType.model;
				model.render(planeType);
			}
		}
		GL11.glPopMatrix();
	}
	
	public int getPartId(int i)
	{
		/**
		int id = 0;
		if(i == 2) id = 0;
		else if(i == 1) id = 1;
		else if(i == 0) id = 2;
		else id = i;
		*/
		int id = i;
		return id;
	}
	
	public void renderAnimPart(AnimationPart p, Vector3f parent, ModelPlane mod, EntityPlane plane, float f5, float f1)
	{
		Vector3f pos = Vector3f.sub(p.position, parent, null);
		Vector3f offset = Interpolate(p.offset, p.prevOff, f1);
		Vector3f rotation = Interpolate(p.rotation, p.prevRot, f1);
		GL11.glPushMatrix();
		GL11.glTranslatef(pos.x/16F, -pos.y/16F, -pos.z/16F);
		GL11.glRotatef(rotation.x, 1, 0, 0);
		GL11.glRotatef(rotation.y, 0, 1, 0);
		GL11.glRotatef(rotation.z, 0, 0, 1);
		GL11.glTranslatef(offset.x/16F, offset.y/16F, offset.z/16F);
		int i = getPartId(p.type);
		mod.renderValk(plane, f5, i);
		if(p.hasChildren){
			for(AnimationPart p2:p.children)
			{
				renderAnimPart(p2, p.position, mod, plane, f5, f1);
			}
		}
		GL11.glPopMatrix();
		
	}
	
	public Vector3f Interpolate(Vector3f current, Vector3f prev, float f1)
	{
		Vector3f result;
		result = new Vector3f(prev.x + (current.x-prev.x)*f1,prev.y + (current.y-prev.y)*f1, prev.z + (current.z-prev.z)*f1);
		return result;
	}
	
	//Broken method to try and rotate playermodel, will fix later.
	//TODO: Make this work
	/**
    @SubscribeEvent
    public void preRenderLiving(RenderPlayerEvent.Pre event)
    {
    	if(event.entity.ridingEntity instanceof EntitySeat)
    	{
    		EntityDriveable driveable = ((EntitySeat)event.entity.ridingEntity).driveable;
    		
    		if(driveable instanceof EntityPlane)
    		{
    			EntityPlane entityPlane = ((EntityPlane)driveable);
				Quaternion quat = new Quaternion();
				quat.setFromMatrix(entityPlane.axes.getMatrix());
    			
				GL11.glPushMatrix();
				float dYaw = (entityPlane.axes.getYaw() - entityPlane.prevRotationYaw);
				for(; dYaw > 180F; dYaw -= 360F) {}
				for(; dYaw <= -180F; dYaw += 360F) {}
				float dPitch = (entityPlane.axes.getPitch() - entityPlane.prevRotationPitch);
				for(; dPitch > 180F; dPitch -= 360F) {}
				for(; dPitch <= -180F; dPitch += 360F) {}
				float dRoll = (entityPlane.axes.getRoll() - entityPlane.prevRotationRoll);
				for(; dRoll > 180F; dRoll -= 360F) {}
				for(; dRoll <= -180F; dRoll += 360F) {}
				GL11.glRotatef(180F - entityPlane.prevRotationYaw - dYaw * event.partialRenderTick, 0.0F, 1.0F, 0.0F);
				GL11.glRotatef(-entityPlane.prevRotationPitch + dPitch * event.partialRenderTick, 0.0F, 0.0F, 1.0F);
				GL11.glRotatef(entityPlane.prevRotationRoll + dRoll * event.partialRenderTick, 1.0F, 0.0F, 0.0F);
				
				//GL11.glRotatef(quat.getW(), quat.getX(), quat.getY(), quat.getZ());

    		}
    	}
    }
    
    @SubscribeEvent
    public void postRenderLiving(RenderPlayerEvent.Post event)
    {
    	if(event.entity.ridingEntity instanceof EntitySeat)
    	{
    		EntityDriveable driveable = ((EntitySeat)event.entity.ridingEntity).driveable;
    		
    		if(driveable instanceof EntityPlane)
    		{
				GL11.glPopMatrix();
    		}
    	}
    }
    */

}
