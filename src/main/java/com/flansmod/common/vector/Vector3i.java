package com.flansmod.common.vector;

import java.nio.FloatBuffer;

import net.minecraft.util.Vec3;

public class Vector3i extends Vector 
{
	private static final long serialVersionUID = 1L;

	public int x, y, z;

	public Vector3i() 
	{
		super();
	}
	
	public Vector3i(int x, int y, int z) 
	{
		set(x, y, z);
	}
	
	public Vector3i(Vec3 vec)
	{
		this((int)vec.xCoord, (int)vec.yCoord, (int)vec.zCoord);
	}
	
	public Vector3i(double x, double y, double z) 
	{
		this((int)x, (int)y, (int)z);
	}

	public Vector3i(Vector3i v) 
	{
		this(v.x, v.y, v.z);
	}

	public Vec3 toVec3()
	{
		return Vec3.createVectorHelper(x, y, z);
	}

	public void set(int x, int y, int z) 
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public float lengthSquared() 
	{
		return x * x + y * y + z * z;
	}

	public Vector3i translate(int x, int y, int z) 
	{
		this.x += x;
		this.y += y;
		this.z += z;
		return this;
	}

	public static Vector3i add(Vector3i left, Vector3i right, Vector3i dest) 
	{
		if (dest == null)
			return new Vector3i(left.x + right.x, left.y + right.y, left.z + right.z);
		else {
			dest.set(left.x + right.x, left.y + right.y, left.z + right.z);
			return dest;
		}
	}

	public static Vector3i sub(Vector3i left, Vector3i right, Vector3i dest) 
	{
		if (dest == null)
			return new Vector3i(left.x - right.x, left.y - right.y, left.z - right.z);
		else {
			dest.set(left.x - right.x, left.y - right.y, left.z - right.z);
			return dest;
		}
	}

	public static Vector3i cross(Vector3i left, Vector3i right, Vector3i dest)
	{
		if (dest == null)
			dest = new Vector3i();

		dest.set(
				left.y * right.z - left.z * right.y,
				right.x * left.z - right.z * left.x,
				left.x * right.y - left.y * right.x
				);

		return dest;
	}

	public Vector negate() 
	{
		x = -x;
		y = -y;
		z = -z;
		return this;
	}

	public Vector3i negate(Vector3i dest) 
	{
		if (dest == null)
			dest = new Vector3i();
		dest.x = -x;
		dest.y = -y;
		dest.z = -z;
		return dest;
	}

	public Vector3i normalise(Vector3i dest) 
	{
		float l = length();

		if (dest == null)
			dest = new Vector3i(x / l, y / l, z / l);
		else
			dest.set((int)(x / l), (int)(y / l), (int)(z / l));

		return dest;
	}

	public static float dot(Vector3i left, Vector3i right) 
	{
		return left.x * right.x + left.y * right.y + left.z * right.z;
	}

	public static float angle(Vector3i a, Vector3i b) 
	{
		float dls = dot(a, b) / (a.length() * b.length());
		if (dls < -1f)
			dls = -1f;
		else if (dls > 1.0f)
			dls = 1.0f;
		return (float)Math.acos(dls);
	}

	public Vector load(FloatBuffer buf) 
	{
		x = (int)buf.get();
		y = (int)buf.get();
		z = (int)buf.get();
		return this;
	}

	public Vector scale(float scale) 
	{
		x *= scale;
		y *= scale;
		z *= scale;

		return this;
	}

	public Vector store(FloatBuffer buf) 
	{
		buf.put(x);
		buf.put(y);
		buf.put(z);

		return this;
	}

	public String toString() 
	{

        return "Vector3i[" + x + ", " + y + ", " + z + ']';
	}

	public final int getX() 
	{
		return x;
	}
	
	public final int getY() 
	{
		return y;
	}
	
	public final void setX(int x) 
	{
		this.x = x;
	}

	public final void setY(int y) 
	{
		this.y = y;
	}

	public void setZ(int z) 
	{
		this.z = z;
	}

	public int getZ() 
	{
		return z;
	}
}
