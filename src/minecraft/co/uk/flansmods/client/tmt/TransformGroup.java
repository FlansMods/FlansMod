package co.uk.flansmods.client.tmt;

import net.minecraft.src.*;

public abstract class TransformGroup
{
	public abstract double getWeight();
	public abstract Vec3 doTransformation(PositionTransformVertex vertex);
}
