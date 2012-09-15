package co.uk.flansmods.client;

import co.uk.flansmods.common.EntityMG;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelMG extends ModelBase
{
	public ModelRenderer bipodModel[];
	public ModelRenderer gunModel[];
	public ModelRenderer ammoModel[];

	public ModelMG()
	{
	}

	public void renderBipod(float f, float f1, float f2, float f3, float f4, float f5, EntityMG mg)
	{
		for (ModelRenderer bipodPart : bipodModel)
		{
			bipodPart.render(f5);
		}
	}

	public void renderGun(float f, float f1, float f2, float f3, float f4, float f5, float f6, EntityMG mg)
	{
		for (ModelRenderer gunPart : gunModel)
		{
			gunPart.rotateAngleX = -(mg.prevRotationPitch + (mg.rotationPitch - mg.prevRotationPitch) * f6) / 180F * 3.141592653589793238462643383279502884197169399F;
			gunPart.render(f5);
		}

		if (mg.reloadTimer > 0 || mg.ammo == null)
			return;

		for (ModelRenderer ammoPart : ammoModel)
		{
			ammoPart.rotateAngleX = -(mg.prevRotationPitch + (mg.rotationPitch - mg.prevRotationPitch) * f6) / 180F * 3.141592653589793238462643383279502884197169399F;
			ammoPart.render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}
}
