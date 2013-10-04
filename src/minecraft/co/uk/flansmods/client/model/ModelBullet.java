package co.uk.flansmods.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBullet extends ModelBase
{
	public ModelRenderer bulletModel;

	public ModelBullet()
	{
		bulletModel = new ModelRenderer(this, 0, 0);
		bulletModel.addBox(-0.5F, -1F, -0.5F, 1, 2, 1);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		bulletModel.render(f5);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}
}
