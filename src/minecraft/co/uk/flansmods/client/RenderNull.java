package co.uk.flansmods.client;

import org.lwjgl.opengl.GL11;
import net.minecraft.src.*;

public class RenderNull extends Render
{

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
    }
	
    protected ModelBase model;
}
