/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.math;


public class InertiaMatrix extends Matrix3 {
	//Inertia matrix is a 3x3 matrix used to represent the momentum 
	//which is required to rotate a rigid body around the fixed basis axis
	//e_x, e_y, and e_z. The inertia matrix is given by
	//
	//     | Ixx Ixy Ixz |
	// I = | Iyx Iyy Iyz |
	//     | Izx Izy Izz |
	// 
	// which is symetric because I = I^T 
	
	public InertiaMatrix translate(double mass, Vector3 r) {
		InertiaMatrix I = new InertiaMatrix(); Matrix3.set(this, I);
		InertiaMatrix.translate(I,mass,r);
		return I;
	}
	
	/**
	 * Translate the inertia tensor M by the vector r. The mass of the object must be specified.
	 * @param M
	 * @param mass
	 * @param r
	 */
	public static void translate(InertiaMatrix M, double mass, Vector3 r) {
		//as described in [Erleben et. al 2001]. This is based on the parallel axis theorem, see wiki for instance
		//Ixx
		double t11 = M.a11 + mass*(r.y*r.y + r.z*r.z);
		//Iyy
		double t22 = M.a22 + mass*(r.x*r.x + r.z*r.z);
		//Izz
		double t33 = M.a33 + mass*(r.x*r.x + r.y*r.y);
		
		//Ixy
		double t12 = M.a12 - mass*(r.x*r.y);
		//Ixz
		double t13 = M.a13 - mass*(r.x*r.z);
		//Iyz
		double t23 = M.a23 - mass*(r.y*r.z);

		//set result
		M.a11 = t11; M.a12 = t12; M.a13 = t13;
		M.a21 = t12; M.a22 = t22; M.a23 = t23;
		M.a31 = t13; M.a32 = t23; M.a33 = t33;
	}
	
	public InertiaMatrix rotate(Quaternion q) {
		//functional 
		InertiaMatrix I = new InertiaMatrix(); Matrix3.set(this, I);
		return InertiaMatrix.rotate(I, q);
	}
	
	/**
	 * Rotate inertia matrix given a rotation quaternion 
	 * @param M
	 * @param q
	 * @return Rotated inertia matrix
	 */
	public static InertiaMatrix rotate(InertiaMatrix M, Quaternion q) {
		//as described in [Erleben et al. 2001]
		// I'= R I R^T
		Matrix3 R = q.toRotationMatrix3();	
		Matrix3.multiply(R, M, M);
		Matrix3.transpose(R);
		Matrix3.multiply(M, R, M);
		return M;
	}

	/**
	 * Rotate the inertia matrix given a rotation matrix
	 * @param M
	 * @param orientation
	 * @return Rotated inertia matrix
	 */
	public static InertiaMatrix rotate(InertiaMatrix M, Matrix3 R) {
		//as described in [Erleben et al. 2001]
		// I'= R I R^T
		Matrix3.multiply(R, M, M);
		Matrix3.transpose(R);
		Matrix3.multiply(M, R, M);
		return M;
	}


}
