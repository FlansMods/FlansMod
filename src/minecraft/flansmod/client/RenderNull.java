package flansmod.client;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.Render;

import org.lwjgl.opengl.GL11;

public class RenderNull extends Render
{
    public RenderNull()
    {
        shadowSize = 0.5F;
    }

    public void render(Entity entity, double d, double d1, double d2, float f, float f1)
    {
    	
    }

    public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
    {
    	
    }
	
    protected ModelBase model;
}
