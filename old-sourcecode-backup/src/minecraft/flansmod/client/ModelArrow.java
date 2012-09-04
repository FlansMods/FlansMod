package flansmod.client;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;
import net.minecraft.src.Tessellator;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class ModelArrow extends ModelBase
{
    public ModelRenderer bulletModel;

    public ModelArrow()
    {
		bulletModel = new ModelRenderer(this, 0, 0);
		bulletModel.addBox(-0.5F, -1F, -0.5F, 1, 2, 1);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
	    Tessellator var10 = Tessellator.instance;
        byte var11 = 0;
        float var12 = 0.0F;
        float var13 = 0.5F;
        float var14 = (float)(0 + var11 * 10) / 32.0F;
        float var15 = (float)(5 + var11 * 10) / 32.0F;
        float var16 = 0.0F;
        float var17 = 0.15625F;
        float var18 = (float)(5 + var11 * 10) / 32.0F;
        float var19 = (float)(10 + var11 * 10) / 32.0F;
        float var20 = 0.05625F;
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);

        GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
        GL11.glScalef(var20, var20, var20);
        GL11.glTranslatef(-4.0F, 0.0F, 0.0F);
        GL11.glNormal3f(var20, 0.0F, 0.0F);
        var10.startDrawingQuads();
        var10.addVertexWithUV(-7.0D, -2.0D, -2.0D, (double)var16, (double)var18);
        var10.addVertexWithUV(-7.0D, -2.0D, 2.0D, (double)var17, (double)var18);
        var10.addVertexWithUV(-7.0D, 2.0D, 2.0D, (double)var17, (double)var19);
        var10.addVertexWithUV(-7.0D, 2.0D, -2.0D, (double)var16, (double)var19);
        var10.draw();
        GL11.glNormal3f(-var20, 0.0F, 0.0F);
        var10.startDrawingQuads();
        var10.addVertexWithUV(-7.0D, 2.0D, -2.0D, (double)var16, (double)var18);
        var10.addVertexWithUV(-7.0D, 2.0D, 2.0D, (double)var17, (double)var18);
        var10.addVertexWithUV(-7.0D, -2.0D, 2.0D, (double)var17, (double)var19);
        var10.addVertexWithUV(-7.0D, -2.0D, -2.0D, (double)var16, (double)var19);
        var10.draw();

        for (int var23 = 0; var23 < 4; ++var23)
        {
            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glNormal3f(0.0F, 0.0F, var20);
            var10.startDrawingQuads();
            var10.addVertexWithUV(-8.0D, -2.0D, 0.0D, (double)var12, (double)var14);
            var10.addVertexWithUV(8.0D, -2.0D, 0.0D, (double)var13, (double)var14);
            var10.addVertexWithUV(8.0D, 2.0D, 0.0D, (double)var13, (double)var15);
            var10.addVertexWithUV(-8.0D, 2.0D, 0.0D, (double)var12, (double)var15);
            var10.draw();
        }
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        //bulletModel.render(f5);
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }
}
