package com.flansmod.client.tmt;

import net.minecraft.util.Vec3d;

public abstract class TransformGroup
{
	public abstract double getWeight();
	public abstract Vec3 doTransformation(PositionTransformVertex vertex);
}
