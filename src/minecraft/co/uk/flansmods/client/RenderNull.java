package co.uk.flansmods.client;

import co.uk.flansmods.common.EntityAAGun;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
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
    }
    
	@Override
	protected ResourceLocation func_110775_a(Entity entity) 
	{
		return texture;
	}
	
    protected ModelBase model;
}
