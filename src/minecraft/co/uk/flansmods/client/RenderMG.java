package co.uk.flansmods.client;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import co.uk.flansmods.client.model.ModelMG;
import co.uk.flansmods.common.EntityAAGun;
import co.uk.flansmods.common.EntityMG;

public class RenderMG extends Render
{

    public RenderMG()
    {
        shadowSize = 0.5F;
    }

    public void render(EntityMG mg, double d, double d1, double d2, float f, float f1)
    {
    	func_110777_b(mg);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
		GL11.glRotatef(180F - (float)mg.direction * 90F, 0.0F, 1.0F, 0.0F);
		ModelMG model = mg.type.model;
		//GL11.glScalef(-1F, -1F, 1.0F);
		model.renderBipod(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, mg);
        GL11.glRotatef(-(float)(mg.prevRotationYaw + (mg.rotationYaw - mg.prevRotationYaw) * f1), 0.0F, 1.0F, 0.0F);
		model.renderGun(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, f1, mg);
        GL11.glPopMatrix();
    }

    public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
    {
        render((EntityMG)entity, d, d1, d2, f, f1);
    }
    
	@Override
	protected ResourceLocation func_110775_a(Entity entity) 
	{
		return FlansModResourceHandler.getTexture(((EntityMG)entity).type);
	}
}
