/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.util;

import jinngine.math.*;

public class GramSchmidt {
	/**
	 * Given the vector v, return an orthonormal basis B with its first basis vector aligned with v
	 * @param v
	 * @return
	 */
	public static Matrix3 run(Vector3 v) {
		Vector3 t1 = v.normalize();
		Vector3 t2 = new Vector3(1,0,0);
		t2.assign( t2.minus( t1.multiply(t1.dot(t2))));
	
		//if t1 and t2 is linearly dependent, chose another vector, not aligned with t2
		if (t2.norm() < 1e-10) {
			t2.assign( new Vector3(0,0,1));
			t2.assign( t2.minus( t1.multiply(t1.dot(t2))));
		}
		
		t2.assign(t2.normalize());
		
		//having two orthogonal vectors we obtain the third by crossing
		Vector3 t3 = t1.cross(t2).normalize();

		return new Matrix3(t1,t2,t3);
	}
	
	public static Matrix3 run(Vector3 v1, Vector3 v2) {
		Vector3 t1 = v1.normalize();
		Vector3 t2 = v2.copy();
		t2.assign( t2.minus( t1.multiply(t1.dot(t2))));
	
		//if t1 and t2 is linearly dependent, chose another vector, not aligned with t2
		if (t2.norm() < 1e-10) {
			t2.assign( new Vector3(0,0,1));
			t2.assign( t2.minus( t1.multiply(t1.dot(t2))));
		}
		
		t2.assign(t2.normalize());
		
		//having two orthogonal vectors we obtain the third by crossing
		Vector3 t3 = t1.cross(t2).normalize();

		return new Matrix3(t1,t2,t3);

	}
}
