package co.uk.flansmods.client.model;

import org.lwjgl.opengl.GL11;

import co.uk.flansmods.client.FlansModResourceHandler;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.driveables.DriveablePart;
import co.uk.flansmods.common.driveables.EntityVehicle;
import co.uk.flansmods.common.driveables.EnumDriveablePart;
import co.uk.flansmods.common.driveables.PilotGun;
import co.uk.flansmods.common.driveables.VehicleType;
import co.uk.flansmods.common.driveables.mechas.EntityMecha;
import co.uk.flansmods.common.driveables.mechas.MechaType;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;

public class RenderMecha extends Render 
{
	public RenderMecha()
	{
		shadowSize = 0.5F;
	}
	
    public void render(EntityMecha mecha, double d, double d1, double d2, float f, float f1)
    {
    	bindEntityTexture(mecha);
    	MechaType type = mecha.getMechaType();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        float dYaw = (mecha.axes.getYaw() - mecha.prevRotationYaw);
        for(; dYaw > 180F; dYaw -= 360F) {}
        for(; dYaw <= -180F; dYaw += 360F) {}
        float dPitch = (mecha.axes.getPitch() - mecha.prevRotationPitch);
        for(; dPitch > 180F; dPitch -= 360F) {}
        for(; dPitch <= -180F; dPitch += 360F) {}
        float dRoll = (mecha.axes.getRoll() - mecha.prevRotationRoll);
        for(; dRoll > 180F; dRoll -= 360F) {}
        for(; dRoll <= -180F; dRoll += 360F) {}
        GL11.glRotatef(180F - mecha.prevRotationYaw - dYaw * f1, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(mecha.prevRotationPitch + dPitch * f1, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(mecha.prevRotationRoll + dRoll * f1, 1.0F, 0.0F, 0.0F);
		GL11.glRotatef(180F, 0.0F, 1.0F, 0.0F);
        ModelMecha model = (ModelMecha)type.model;
		if(model != null)
			model.render(mecha, f1);		
		
		if(FlansMod.DEBUG)
		{
			GL11.glDisable(GL11.GL_TEXTURE_2D);
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glDisable(GL11.GL_DEPTH_TEST);
			GL11.glColor4f(1F, 0F, 0F, 0.3F);
			GL11.glScalef(1F, 1F, 1F);
			for(DriveablePart part : mecha.getDriveableData().parts.values())
			{
				if(part.box == null)
					continue;
				
				renderAABB(AxisAlignedBB.getBoundingBox((float)part.box.x / 16F, (float)part.box.y / 16F, (float)part.box.z / 16F, (float)(part.box.x + part.box.w) / 16F, (float)(part.box.y + part.box.h) / 16F, (float)(part.box.z + part.box.d) / 16F));
			}
			GL11.glColor4f(0F, 0F, 1F, 0.3F);
			for(PilotGun gun : type.guns)
			{				
				renderAABB(AxisAlignedBB.getBoundingBox((float)gun.position.x - 0.25F, (float)gun.position.y - 0.25F, (float)gun.position.z - 0.25F, (float)gun.position.x + 0.25F, (float)gun.position.y + 0.25F, (float)gun.position.z + 0.25F));
			}
			GL11.glColor4f(0F, 0F, 0F, 0.3F);	
			GL11.glEnable(GL11.GL_TEXTURE_2D);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glDisable(GL11.GL_BLEND);
			GL11.glColor4f(1F, 1F, 1F, 1F);
		}
        GL11.glPopMatrix();
        
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d, (float)d1, (float)d2);
		GL11.glRotatef(mecha.legAxes.getYaw(), 0F, 1F, 0F);
        GL11.glRotatef(mecha.prevRotationPitch + dPitch * f1, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(mecha.prevRotationRoll + dRoll * f1, 1.0F, 0.0F, 0.0F);
		if(model != null)
			model.renderLegs(0.0625F, mecha, f1);		
		GL11.glPopMatrix();
    }
	
	@Override
	public void doRender(Entity entity, double d0, double d1, double d2, float f, float f1) 
	{
		render((EntityMecha)entity, d0, d1, d2, f, f1);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return FlansModResourceHandler.getTexture(((EntityMecha)entity).getMechaType());
	}

}
