package flansmod.client;

import net.minecraft.src.Entity;
import net.minecraft.src.Render;

import org.lwjgl.opengl.GL11;

import flansmod.common.EntityAAGun;

public class RenderAAGun extends Render
{
    public RenderAAGun()
    {
        shadowSize = 0.5F;
    }

    public void render(EntityAAGun aa, double d, double d1, double d2, float f, float f1)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
		loadTexture("/skins/" + aa.type.texture + ".png");
		GL11.glScalef(1F, 1F, 1.0F);
		ModelAAGun modelAAGun = (ModelAAGun)aa.type.model;
		modelAAGun.renderBase(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, aa);
        GL11.glRotatef(180F -(float)aa.gunYaw, 0.0F, 1.0F, 0.0F);
		modelAAGun.renderGun(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, aa);
        GL11.glPopMatrix();
    }

    public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
    {
        render((EntityAAGun)entity, d, d1, d2, f, f1);
    }
}
