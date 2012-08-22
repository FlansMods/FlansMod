package flansmod.common;

import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

public class RotatedAxes
{
	public RotatedAxes()
	{
		//Load identity
		rotationMatrix = new Matrix4f();
	}
	
    public RotatedAxes(Matrix4f mat)
    {
		rotationMatrix = mat;
		convertMatrixToAngles();
    }
	
	public RotatedAxes(float yaw, float pitch, float roll)
	{
		setAngles(yaw, pitch, roll);
	}
	
	public void setAngles(float yaw, float pitch, float roll)
	{
		rotationYaw = yaw;
		rotationPitch = pitch;
		rotationRoll = roll;
		convertAnglesToMatrix();
	}
	
	public float getYaw()
	{
		return rotationYaw;
	}
	
	public float getPitch()
	{
		return rotationPitch;
	}
	
	public float getRoll()
	{
		return rotationRoll;
	}
	
	public Vector3f getXAxis()
	{
		return new Vector3f(rotationMatrix.m00, rotationMatrix.m10, rotationMatrix.m20);
	}
	
	public Vector3f getYAxis()
	{
		return new Vector3f(rotationMatrix.m01, rotationMatrix.m11, rotationMatrix.m21);
	}
	
	public Vector3f getZAxis()
	{
		return new Vector3f(rotationMatrix.m02, rotationMatrix.m12, rotationMatrix.m22);
	}
	
	//Rotate locally by some angle about the yaw axis
	public void rotateLocalYaw(float rotateBy)
	{
		rotationMatrix.rotate(rotateBy * 3.14159265F / 180F, new Vector3f(rotationMatrix.m01, rotationMatrix.m11, rotationMatrix.m21).normalise(null));
		convertMatrixToAngles();
	}
	
	//Rotate locally by some angle about the pitch axis
	public void rotateLocalPitch(float rotateBy)
	{
		rotationMatrix.rotate(rotateBy * 3.14159265F / 180F, new Vector3f(rotationMatrix.m00, rotationMatrix.m10, rotationMatrix.m20).normalise(null));
		convertMatrixToAngles();
	}
	
	//Rotate locally by some angle about the roll axis
	public void rotateLocalRoll(float rotateBy)
	{
		rotationMatrix.rotate(rotateBy * 3.14159265F / 180F, new Vector3f(rotationMatrix.m02, rotationMatrix.m12, rotationMatrix.m22).normalise(null));
		convertMatrixToAngles();
	}
	
	//Rotate globally by some angle about the yaw axis
	public void rotateGlobalYaw(float rotateBy)
	{
		rotationMatrix.rotate(rotateBy * 3.14159265F / 180F, new Vector3f(0F, 1F, 0F));
		convertMatrixToAngles();
	}
	
	//Rotate globally by some angle about the pitch axis
	public void rotateGlobalPitch(float rotateBy)
	{
		rotationMatrix.rotate(rotateBy * 3.14159265F / 180F, new Vector3f(1F, 0F, 0F));
		convertMatrixToAngles();
	}
	
	//Rotate globally by some angle about the roll axis
	public void rotateGlobalRoll(float rotateBy)
	{
		rotationMatrix.rotate(rotateBy * 3.14159265F / 180F, new Vector3f(0F, 0F, 1F));
		convertMatrixToAngles();
	}
	
	//Find a global vector in terms of this basis.
	public Vector3f findGlobalVectorLocally(Vector3f in)
	{
		//Create a new matrix and use the first column to store the vector we are rotating
		Matrix4f mat = new Matrix4f();
		mat.m00 = in.x;
		mat.m10 = in.y;
		mat.m20 = in.z;
		//Do the rotations used to obtain this basis in reverse
		mat.rotate(-rotationYaw * 3.14159265F / 180F, new Vector3f(0F, 1F, 0F));
		mat.rotate(-rotationPitch * 3.14159265F / 180F, new Vector3f(1F, 0F, 0F));
		mat.rotate(-rotationRoll * 3.14159265F / 180F, new Vector3f(0F, 0F, 1F));
		return new Vector3f(mat.m00, mat.m10, mat.m20);
	}
	
	//Find a local vector in terms of the global axes.
	public Vector3f findLocalVectorGlobally(Vector3f in)
	{
		//Create a new matrix and use the first column to store the vector we are rotating
		Matrix4f mat = new Matrix4f();
		mat.m00 = in.x;
		mat.m10 = in.y;
		mat.m20 = in.z;
		//Do the rotations used to obtain this basis
		mat.rotate(rotationRoll * 3.14159265F / 180F, new Vector3f(0F, 0F, 1F));
		mat.rotate(rotationPitch * 3.14159265F / 180F, new Vector3f(1F, 0F, 0F));
		mat.rotate(rotationYaw * 3.14159265F / 180F, new Vector3f(0F, 1F, 0F));
		return new Vector3f(mat.m00, mat.m10, mat.m20);
	}

	private void convertAnglesToMatrix()
	{
		//Re-load the identity
		rotationMatrix = new Matrix4f();
		rotationMatrix.rotate(rotationRoll * 3.14159265F / 180F, new Vector3f(0F, 0F, 1F));
		rotationMatrix.rotate(rotationPitch * 3.14159265F / 180F, new Vector3f(1F, 0F, 0F));
		rotationMatrix.rotate(rotationYaw * 3.14159265F / 180F, new Vector3f(0F, 1F, 0F));
	}
	
	private void convertMatrixToAngles()
	{		
		double xx = rotationMatrix.m00;
		double xy = rotationMatrix.m10;
		double xz = rotationMatrix.m20;
		double zx = rotationMatrix.m02;
		double zy = rotationMatrix.m12;
		double zz = rotationMatrix.m22;
		
		double sqrtX = Math.sqrt(xx * xx + xz * xz);
		sqrtX = (sqrtX < 1 ? sqrtX : 1);
		double sqrtZ = Math.sqrt(zx * zx + zz * zz);
		sqrtZ = (sqrtZ < 1 ? sqrtZ : 1);
		
		rotationYaw = (float)Math.atan2(zx, zz) * 180F / 3.14159265F;
		rotationPitch = -(float)Math.atan2(zy, sqrtZ) * 180F / 3.14159265F;
		
		Matrix4f rollOnlyMatrix = rotationMatrix.rotate(rotationYaw * 3.14159265F / 180F, new Vector3f(0F, 1F, 0F), null).rotate(rotationPitch * 3.14159265F / 180F, new Vector3f(1F, 0F, 0F));
		
		rotationRoll = (float)Math.atan2(rollOnlyMatrix.m10, rollOnlyMatrix.m00) * 180F / 3.14159265F;
	}
	
	private float rotationYaw;
	private float rotationPitch;
	private float rotationRoll;
	private Matrix4f rotationMatrix;
}
