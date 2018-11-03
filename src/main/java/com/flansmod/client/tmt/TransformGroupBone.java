package com.flansmod.client.tmt;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

/**
 * The PositionTransformGroup class adds a class which allows for vertex transformations.
 *
 * @author GaryCXJk
 */
public class TransformGroupBone extends TransformGroup
{
	public TransformGroupBone(Bone bone, double wght)
	{
		baseVector = bone.getPosition();
		baseAngles = bone.getAbsoluteAngle();
		attachedBone = bone;
		weight = wght;
	}
	
	public Angle3D getBaseAngles()
	{
		return baseAngles.copy();
	}
	
	public Angle3D getTransformAngle()
	{
		Angle3D returnAngle = attachedBone.getAbsoluteAngle().copy();
		returnAngle.angleX -= baseAngles.angleX;
		returnAngle.angleY -= baseAngles.angleY;
		returnAngle.angleZ -= baseAngles.angleZ;
		return returnAngle;
	}
	
	public Vec3d getBaseVector()
	{
		return new Vec3d(baseVector.x, baseVector.y, baseVector.z);
	}
	
	public Vec3d getTransformVector()
	{
		return baseVector.subtract(attachedBone.getPosition());
	}
	
	public Vec3d getCurrentVector()
	{
		return attachedBone.getPosition();
	}
	
	@Override
	public double getWeight()
	{
		return weight;
	}
	
	public void attachBone(Bone bone)
	{
		baseVector = bone.getPosition();
		baseAngles = bone.getAbsoluteAngle();
		attachedBone = bone;
	}
	
	@Override
	public Vec3d doTransformation(PositionTransformVertex vertex)
	{
		Vec3d vector = new Vec3d(vertex.neutralVector.x, vertex.neutralVector.y, vertex.neutralVector.z);
		vector = getBaseVector().subtract(vector);
		Angle3D angle = getTransformAngle();
		setVectorRotations(vector, angle.angleX, angle.angleY, angle.angleZ);
		
		return vector;
	}
	
	protected void setVectorRotations(Vec3d vector, float xRot, float yRot, float zRot)
	{
		float xC = MathHelper.cos(xRot);
		float xS = MathHelper.sin(xRot);
		float yC = MathHelper.cos(yRot);
		float yS = MathHelper.sin(yRot);
		float zC = MathHelper.cos(zRot);
		float zS = MathHelper.sin(zRot);
		
		double xVec = vector.x;
		double yVec = vector.y;
		double zVec = vector.z;
		
		// rotation around x
		double xy = xC * yVec - xS * zVec;
		double xz = xC * zVec + xS * yVec;
		// rotation around y
		double yz = yC * xz - yS * xVec;
		double yx = yC * xVec + yS * xz;
		// rotation around z
		double zx = zC * yx - zS * xy;
		double zy = zC * xy + zS * yx;
		
		xVec = zx;
		yVec = zy;
		zVec = yz;
		
		vector = new Vec3d(xVec, yVec, zVec);
	}
	
	protected Angle3D baseAngles;
	protected Vec3d baseVector;
	protected Bone attachedBone;
	protected double weight;
}
