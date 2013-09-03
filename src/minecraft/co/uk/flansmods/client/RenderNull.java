package co.uk.flansmods.client;

import org.lwjgl.opengl.GL11;

import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.driveables.DriveablePart;
import co.uk.flansmods.common.driveables.PilotGun;
import co.uk.flansmods.common.driveables.Propeller;
import co.uk.flansmods.common.guns.EntityAAGun;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;

public class RenderNull extends Render
{
	private static final ResourceLocation texture = new ResourceLocation("Flan", "null.png");

    public RenderNull()
    {
        shadowSize = 0.5F;
    }

    public void func_157_a(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
    	if(FlansMod.DEBUG)
    	{
    		GL11.glPushMatrix();
            GL11.glTranslatef((float)d, (float)d1, (float)d2);      
			GL11.glDisable(GL11.GL_TEXTURE_2D);
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glDisable(GL11.GL_DEPTH_TEST);
			GL11.glColor4f(0F, 0F, 1F, 0.3F);
			GL11.glScalef(-1F, 1F, -1F);
			renderAABB(AxisAlignedBB.getBoundingBox(-0.25F, -0.25F, -0.25F, 0.25F, 0.25F, 0.25F));
			GL11.glEnable(GL11.GL_TEXTURE_2D);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glDisable(GL11.GL_BLEND);
			GL11.glColor4f(1F, 1F, 1F, 1F);
			GL11.glPopMatrix();
    	}
    }
    
	@Override
	protected ResourceLocation func_110775_a(Entity entity) 
	{
		return texture;
	}
	
    protected ModelBase model;
}
