package co.uk.flansmods.client;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;

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
