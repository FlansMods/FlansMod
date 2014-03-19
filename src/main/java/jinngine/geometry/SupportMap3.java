/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.geometry;

import java.util.List;

import jinngine.math.Vector3;

/**
 *  A support mapping for a convex object. Defined for a convex set A, as<p>
 *    
 *  S_A(v) = p, where v dot p = max { v dot x, x \in A } 
 *  
 *  In other words, the SupportMap is a function taking a vector v, and returns 
 *  the a point x on the boundary of the object, which has the greatest value v dot x. 
 *  Note that this point may not be a unique point on a given shape. The function 
 *  supportFeature gives the convex hull of all possible support points. 
 */
public interface SupportMap3  {
	/**
	 * Compute a support point of this geometry, in the given direction 
	 * @param direction
	 * @return The farthest point, in the given direction, existing on this geometry
	 */
	public Vector3 supportPoint( Vector3 direction );

	/**
	 * Return the feature that supports the direction d. This could be either a point, 
	 * line segment, or a face. In case of a face, the points must appear in counter 
	 * clock-wise order with respect to the direction of d.
	 * 
	 * @param epsilon a positive tolerance
	 * @param direction
	 * @return list of points that constitute either a point, line or a face
	 */
	public void supportFeature( Vector3 d, double epsilon, List<Vector3> face );

}


