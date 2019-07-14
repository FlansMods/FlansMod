package com.flansmod.client.model.animation;

import java.util.ArrayList;

import com.flansmod.common.RotatedAxes;
import com.flansmod.common.vector.Vector3f;

public class AnimationPart 
{
	public int type;
	public Vector3f position;
	public Vector3f offset;
	public Vector3f rotation;
	public Vector3f prevPos;
	public Vector3f prevOff;
	public Vector3f prevRot;
	public int parent = -1;
	public boolean hasChildren = false;
	public ArrayList<AnimationPart> children = new ArrayList<AnimationPart>();	
	
	public AnimationPart(int t,Vector3f pos, Vector3f off, Vector3f rot)
	{
		this.type = t;
		this.position = pos;
		this.offset = off;
		this.rotation = rot;
	}
	
	public RotatedAxes rotateToPartAxis(RotatedAxes rot)
	{
		rot.rotateLocalRoll(-rotation.x);
		rot.rotateLocalYaw(rotation.y);
		rot.rotateLocalPitch(-rotation.z);
		//rot = rotate(rotation.y, rotation.z, rotation.x, rot);
		return rot;
	}
	
	 public final RotatedAxes rotate(double heading, double attitude, double bank, RotatedAxes rot) {
			// Assuming the angles are in radians.
			double c1 = Math.cos(heading/2);
			double s1 = Math.sin(heading/2);
			double c2 = Math.cos(attitude/2);
			double s2 = Math.sin(attitude/2);
			double c3 = Math.cos(bank/2);
			double s3 = Math.sin(bank/2);
			double c1c2 = c1*c2;
			double s1s2 = s1*s2;
			double w =c1c2*c3 - s1s2*s3;
			double x =c1c2*s3 + s1s2*c3;
			double y =s1*c2*c3 + c1*s2*s3;
			double z =c1*s2*c3 - s1*c2*s3;
			double angle = 2 * Math.acos(w);
			double norm = x*x+y*y+z*z;
			if (norm < 0.001) { // when all euler angles are zero angle =0 so
				// we can set axis to anything to avoid divide by zero
				x=1;
				y=z=0;
			} else {
				norm = Math.sqrt(norm);
		    	x /= norm;
		    	y /= norm;
		    	z /= norm;
			}
			rot.rotateLocal((float)angle, new Vector3f(x,y,z));
			return rot;
		}
}
