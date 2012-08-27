package flansmod.client;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.Render;

import org.lwjgl.opengl.GL11;

import flansmod.common.EntityBullet;

public class RenderBullet extends Render
{
    public RenderBullet()
    {
        shadowSize = 0.5F;
    }

    public void render(EntityBullet bullet, double d, double d1, double d2, float f, float f1)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
		GL11.glRotatef( f + 90F, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(bullet.prevRotationPitch + (bullet.rotationPitch - bullet.prevRotationPitch) * f1, 1.0F, 0.0F, 0.0F);
		loadTexture("/skins/" + bullet.type.texture + ".png");
		ModelBase model = (ModelBase)bullet.type.model;
		model.render(bullet, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
    }

    public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
    {
        render((EntityBullet)entity, d, d1, d2, f, f1);
    }
}
