/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.geometry.util;

import java.util.Iterator;
import java.util.List;
import jinngine.math.Vector3;

/**
 * 2D convex convex intersection. Algorithm due to O'Rourke et al. 1981 "A New Linear 
 * Algorithm for Intersecting Polygons". Intersection is done in the XY plane, the Z component
 * is completely ignored. However, the returned intersection will contain the appropriate Z values
 * for each vertex of the returned polygon. 
 * @author mo 
 *
 */
public class ORourke {
	
	/**
	 * Handler for obtaining the result from a 2d intersection. Intersections will be reported in
	 * counter clock-wise order, wrt. the positive Z axis
	 */
	public interface ResultHandler {
		/**
		 * Called for each point in the intersection result. p will be the point on P and 
		 * like wise q will be the point on Q. The xy coordinates obviously be the same for 
		 * p and q, but the z-value may differ. 
		 */
		public void intersection(Vector3 p, Vector3 q);
	}
	
	private final static double epsilon = 1e-8;
	
	private enum State { 
		none,
		P,
		Q
	};
	
	
	
	public static void run( final List<Vector3> poly1, final List<Vector3> poly2, final List<Vector3> result ) {
		run( poly1, poly2, new ResultHandler() {
			public void intersection(Vector3 arg0, Vector3 arg1) {
				// here, we don't care about the z value
				if (arg1 == null)
					result.add( new Vector3( arg0.x, arg0.y,0));
				else 
					result.add( new Vector3( arg1.x, arg1.y,0));
					
			}
		});
	}
	
	/**
	 * @param poly1
	 * @param poly2
	 * @param result
	 */
	public static void run( final List<Vector3> poly1, final List<Vector3> poly2, final ResultHandler result ) {
		// transform polygons into projection space, leave for now
		int iter = 0;
		int intersections = 0;
		int addedpoints = 0;
		int firstIntersectionIter = 0;
		State inside = State.none; 
		final Vector3 p = new Vector3(), pm = new Vector3(), pd = new Vector3();
		final Vector3 q = new Vector3(), qm = new Vector3(), qd = new Vector3();
		final Vector3 parameter = new Vector3();
		final Vector3 firstIntersection = new Vector3();
		final Vector3 firstAddedPoint = new Vector3();
		final Vector3 previouslyAddedPoint = new Vector3();
		final Vector3 ipp = new Vector3();
		final Vector3 ipq = new Vector3();
//		final Vector3 pnormal = new Vector3();
//		final Vector3 qnormal = new Vector3();	
		final int N = poly1.size();
		final int M = poly2.size();

		// get iterators
		Iterator<Vector3> poly1points = poly1.iterator();
		Iterator<Vector3> poly2points = poly2.iterator();
		
//		System.out.println(N+","+M);
		
		// trival cases
		// if any one polygon is empty, so is intersection
		if (N == 0 || M == 0)
			return;
		
		// point-point case
		if ( N==1 && M == 1) {
			p.assign(poly1points.next());
			q.assign(poly2points.next());
			// report intersection
			if ( p.minus(q).xynorm() < epsilon) 
				result.intersection(p, q);
			
			return;
		}

		// point-line case
		if ( N==1 && M == 2) {
			Vector3 x = poly1points.next();
			Vector3 p1 = poly2points.next();
			Vector3 p2 = poly2points.next();
			Vector3 lp = new Vector3();

			if ( pointLineIntersection(x, p1, p2, lp))
				result.intersection(x, lp);
			
			return;
		}
		// line-point case
		if ( N==2 && M == 1) {
			Vector3 x = poly2points.next();
			Vector3 p1 = poly1points.next();
			Vector3 p2 = poly1points.next();
			Vector3 lp = new Vector3();

			if ( pointLineIntersection(x, p1, p2, lp))
				result.intersection(lp, x);
			
			return;
		}
		
		// point-poly case
		if (N==1 && M > 2) {
			Vector3 x = poly1points.next();
			if (isContained(x, poly2points)) {
				// polygon normal in 3d
				Vector3 polypoint = poly2.get(0);
				final Vector3 poly2normal = new Vector3();
				polyNormal(poly2, poly2normal);

				// report
				result.intersection(x, projectToPlane(x, poly2normal, polypoint));				
			}
			
			return;
		}

		// poly-point case
		if (N>2 && M==1) {
			Vector3 x = poly2points.next();
			if (isContained(x, poly1points)) {
				// polygon normal in 3d
				Vector3 polypoint = poly1.get(0);
				final Vector3 poly1normal = new Vector3();
				polyNormal(poly1, poly1normal);
				// report
				result.intersection(projectToPlane(x, poly1normal, polypoint),x);	
			}
			return;
		}
		
		// line-line case
		if (N==2 && M==2) {
			final Vector3 p1 = poly1points.next();
			final Vector3 p2 = poly1points.next();
			final Vector3 p3 = poly2points.next();
			final Vector3 p4 = poly2points.next();
			final Vector3 par = new Vector3();
			// line line intersection has a unique intersection point
			if ( lineLineIntersection(p1, p2, p3, p4, par, epsilon) ) {
				// intersection in internal part of lines?
				if (par.x>=0 && par.x <=1 && par.y>=0 && par.y<=1) {
					// report intersection
					result.intersection(p1.add(p2.minus(p1).multiply(par.x)), p3.add(p4.minus(p3).multiply(par.y)));
					// done
					return;
				} else {
					// no intersection
					return;
				}
			} else {
				// test if lines are separated
				if (Math.abs(p2.minus(p1).cross( p4.minus(p1)).z) > epsilon ) {
					// no intersection
					return;
				} else {
					// two co-incident has an edge intersection. We look for extremal points so
					// l1(t) = l2(s) 
					// p1+(p2-p1)t = p3+(p4-p3)s
					// (p2-p1)t+(p3-p4)s = p3-p1
					// (p2-p1)t+(p2-p1)k1 s = (p2-p1)k2
					// where
					// (p2-p1)k1 = (p3-p4) =>  k1 = (p3-p4)T(p2-p1)/(p2-p1)^2
					// (p2-p1)k1 = (p3-p1) =>  k2 = (p3-p1)T(p2-p1)/(p2-p1)^2
					//
					// so 
					// t = k2-k1s
					// s = (k2-t)/k1
					//
					// our candidate points are t=0 and t=1 where 0<=s<=1, 
					// likewise s=0 and s=1, where 0<=t<=1.				
					final Vector3 p3p4 = p3.minus(p4);
					final Vector3 p2p1 = p2.minus(p1);
					final Vector3 p3p1 = p3.minus(p1);
					final double k1 = p3p4.xydot(p2p1)/p2p1.squaredNorm();
					final double k2 = p3p1.xydot(p2p1)/p2p1.squaredNorm();
					int counter = 0;
					
					// case t=0
					double s = (k2-0)/k1;
					if ( 0<=s && s<=1 ) {
						// report intersection points
						result.intersection(p1, p3.add(p4.minus(p3).multiply(s)));
						counter=counter+1;
					}
					//case t=1
					s = (k2-1)/k1;
					if ( 0<=s && s<=1 ) {
						// report intersection points
						result.intersection(p2, p3.add(p4.minus(p3).multiply(s)));
						counter=counter+1;
					}
					
					// termination
					if (counter>1)
						return;
					
					//case s=0
					double t=k2;
					if ( 0<=t && t<=1) {
						// report intersection points
						result.intersection(p2.add(p2p1.multiply(t)), p3);
						counter=counter+1;
					}

					// termination
					if (counter>1)
						return;

					
					//case s=1
					t=k2-k1;
					if ( 0<=t && t<=1) {
						// report intersection points
						result.intersection(p2.add(p2p1.multiply(t)), p4);
						counter=counter+1;
					}
				} // if co-incident intersection
			} // if non-unique intersection
			return;
		} // if line-line case

		// line-poly
		if (N==2 && M>2) {
			final Vector3 p1 = poly1points.next();
			final Vector3 p2 = poly1points.next();
			final Vector3 p3 = poly2points.next();
			final Vector3 p4 = poly2points.next();
			final Vector3 p5 = poly2points.next();
			// counter clock-wise normal
			final Vector3 poly2normal = p5.minus(p3).cross(p3.minus(p4));
			linePolyIntersection(p1, p2, poly2, poly2normal, result);
			return;
		}
		// poly-line
		if (N>2 && M==2) {
//			System.out.println("switch");
			// turn arguments around and wrap result TODO, could be more effective? 
			final Vector3 p1 = poly2points.next();
			final Vector3 p2 = poly2points.next();
			final Vector3 p3 = poly1points.next();
			final Vector3 p4 = poly1points.next();
			final Vector3 p5 = poly1points.next();
			// counter clock-wise normal
			final Vector3 poly1normal = p5.minus(p3).cross(p3.minus(p4));
			linePolyIntersection(p1, p2, poly1, poly1normal, new ResultHandler() {
				public final void intersection(Vector3 arg0, Vector3 arg1) {
					result.intersection(arg1, arg0);
				}});
			return;

		}
			
		
		
//		if (poly1.size() < 2 || poly2.size() < 2 ) {
//			throw new IllegalArgumentException("Polygons must contain at least 2 vertices, N="+N+", M="+M );
//		}
	
		// polygon normal in 3d
		final Vector3 poly1normal = new Vector3();
		polyNormal(poly1, poly1normal);
		final Vector3 poly2normal = new Vector3();
		polyNormal(poly2, poly2normal);
		
		
		// get end-vertices
		p.assign(poly1.get(poly1.size()-1));
		q.assign(poly2.get(poly2.size()-1));
		
		// first iteration
		pm.assign(p);
		qm.assign(q);

		// next vertices
		p.assign(poly1points.next());
		q.assign(poly2points.next());
		
		// deltas
		pd.assign( p.minus(pm));
		qd.assign( q.minus(qm));

		// run iterations
		while (true) {
			iter = iter+1;
			//System.out.println("iteration " + iter);

			// if intersection is in the interior of the lines
			if (lineLineIntersection(pm,p,qm,q,parameter,epsilon) ) {				
				if (parameter.x >= 0 && parameter.x <= 1 && parameter.y >= 0 && parameter.y <= 1 ) {
					ipp.assign(pm.add( pd.multiply(parameter.x)));
					ipq.assign(qm.add( qd.multiply(parameter.y)));

					intersections = intersections+1;
					//System.out.println("computed intersection="+ipp);
					// check if intersection is the same point
					// as first time an intersection was encountered. This
					// means that the algorithm should terminate
					if (intersections > 1) {
						// the firstIntersectionIter condition makes the algorithm able to handle some
						// degenerate cases, as treated in the O'Rourke paper
						if (firstIntersection.minus(ipp).xynorm() < epsilon && firstIntersectionIter!=iter-1) {
							// termination 
							//System.out.println("intersection termination");
							return;
						}
					} else {
						// track the first discovered intersection
						firstIntersection.assign(ipp);
						firstIntersectionIter = iter;
					}
					
					// add intersection point
					if (testPoint(firstAddedPoint, previouslyAddedPoint, ipp, addedpoints)) {
						//System.out.println("point added from intersection");
						result.intersection(ipp, ipq);
						addedpoints = addedpoints+1;
					}
					
					// determine inside setting
					if ( isInHalfplane( p, qm, q)) {
						inside = State.P;
					} else {
						inside = State.Q;
					}
				}
			} 
			
			// advance q or p
			if (qd.cross(pd).z >= 0) {
				if (isInHalfplane(p, qm, q)) {
					//advance q
					if (inside == State.Q)
						//intersection.add(q.copy());
						//addPoint(previouslyAddedPoint, q, result);
						if ( testPoint(firstAddedPoint, previouslyAddedPoint, q, addedpoints)) {
							result.intersection(projectToPlane(q, poly1normal, p), q);
							addedpoints = addedpoints+1;
						}
					
					qm.assign(q);

					// rewind iterator
					if (!poly2points.hasNext())
						poly2points = poly2.iterator();

					q.assign(poly2points.next());
					qd.assign( q.minus(qm));
				} else {
					//advance p
					if (inside == State.P)
						if ( testPoint(firstAddedPoint, previouslyAddedPoint, p, addedpoints)) {
							result.intersection(p, projectToPlane(p, poly2normal, q));
							addedpoints = addedpoints+1;
						}

					pm.assign(p);
					
					// rewind iterator
					if (!poly1points.hasNext())
						poly1points = poly1.iterator();

					p.assign(poly1points.next());
					pd.assign( p.minus(pm));
				}
			} else { // qd X pd < 0
				if (isInHalfplane(q, pm, p)) {
					//advance p
					if (inside == State.P)
						if ( testPoint(firstAddedPoint, previouslyAddedPoint, p, addedpoints)) {
							result.intersection(p, projectToPlane(p, poly2normal, q));
							addedpoints = addedpoints+1;
						}

					pm.assign(p);
					
					// rewind iterator
					if (!poly1points.hasNext())
						poly1points = poly1.iterator();

					p.assign(poly1points.next());
					pd.assign( p.minus(pm));
				} else {
					//advance q
					if (inside == State.Q)
						if ( testPoint(firstAddedPoint, previouslyAddedPoint, q, addedpoints)) {
							result.intersection(projectToPlane(q, poly1normal, p), q);
							addedpoints = addedpoints+1;
						}
					
					qm.assign(q);
					
					// rewind iterator
					if (!poly2points.hasNext())
						poly2points = poly2.iterator();

					q.assign(poly2points.next());
					qd.assign( q.minus(qm));
				}	
			}

			if (iter > 2*(N+M)) 
				break;
		} // while true
 		
		//System.out.println("separation or inclusion termination");
		
		// if we end up here, the polygons is either 
		// separated or contained inside each other
		if ( isContained(p, poly2.iterator()) && M > 2) {
			// add all points from P as intersection
			for (Vector3 pi: poly1) {
				result.intersection(pi, projectToPlane(pi, poly2normal, q));
			}
			return;
		} else if ( isContained(q, poly1.iterator()) && N > 2) {
			// add all points from Q as intersection
			for (Vector3 qi: poly2) {
				result.intersection(projectToPlane(qi, poly1normal, p), qi);
			}
			return;
		}
		
		// P and Q are separated
		return;
	}
	
	/**
	 * Private method that checks if a new point is equal to the previous point or the first point. The
	 * method also updates the first and previous point vectors. It returns true if the point can be accepted
	 * and false otherwise
	 */
	private static final boolean testPoint( Vector3 first, Vector3 prev, Vector3 point, int addedPoints ) {
		if (addedPoints < 1) {
			first.assign(point);
			prev.assign(point);
			return true;
		} else if ( addedPoints < 2 ) {
			if ( first.minus(point).xynorm()>epsilon) {
				prev.assign(point);
				return true;
			} else {
				return false;
			}
		} else {
			if ( first.minus(point).xynorm()>epsilon && prev.minus(point).xynorm()>epsilon ) {
				prev.assign(point);
				return true;
			} else {
				return false;
			}
		}
	}

	private static final boolean pointLineIntersection( Vector3 x, Vector3 p1, Vector3 p2, Vector3 intPoint) {
		// check point line-intersection
		// l(t) = p1 + (p2-p1)t
		// (l(t)-x)T(p2-p1) = 0
		// l(t)T(p2-p1) - xT(p2-p1)  = 0
		// p1T(p2-p1) + (p2-p1)T(p2-p1) t - xT(p2-p1) = 0
		//  t =  xT(p2-p1) - p1T(p2-p1) / (p2-p1)T(p2-p1)
		//  t =  (x-p1)T(p2-p1) / |(p2-p1)|^2

		final Vector3 p2p1 = p2.minus(p1);
		p2p1.z = 0; // we only work in the xy plane
		final double t = x.minus(p1).dot(p2p1) / p2p1.squaredNorm();	
		if (t>= 0 && t <= 1) {
			// closest point on line
			Vector3 lp = p1.add(p2.minus(p1).multiply(t));
			if (  lp.minus(x).xynorm() < epsilon ) {
				intPoint.assign(lp);
				return true;
			}
		}
		
		return false;
	}
	
	private static final void linePolyIntersection( Vector3 p1, Vector3 p2, List<Vector3> poly, Vector3 polynormal, ResultHandler result ) {
		// we maintain two candidate points
		final Vector3 out1 = new Vector3();
		final Vector3 out2 = new Vector3();	
		boolean keepp1 = true;
		boolean keepp2 = true;
		int intersections = 0;
		
		final int N = poly.size();
		int iter = 0;
		
		final Vector3 qm = new Vector3();
		final Vector3 q = new Vector3(poly.get(N-1));
		final Vector3 polypoint = new Vector3(q);
		final Vector3 param = new Vector3();

		while (iter<N) {
			qm.assign(q);
			q.assign(poly.get(iter));

			// discard end-points
			if (keepp1)
				if (!isInHalfplane(p1, qm, q)) 
					keepp1 = false;
			if (keepp2)
				if (!isInHalfplane(p2, qm, q)) 
					keepp2 = false;
			
			// intersect line with poly edge
			if (lineLineIntersection(p1, p2, qm, q, param, epsilon)) {
				// internal on lines
				if (0<=param.x && param.x<=1 && 0<=param.y && param.y<=1) {
					// calculate intersection points (including the right z-coordinate)
					final Vector3 ipp = p1.add(p2.minus(p1).multiply(param.x)); 
					final Vector3 ipq = qm.add( q.minus(qm).multiply(param.y)); 

					switch (intersections) {
					case 0:
						if (out1.minus(ipp).norm() > epsilon) {
							out1.assign(ipp);
							
							//report
							result.intersection(ipp, ipq);
							
							intersections++;
						}
						break;
					case 1: 
						if (out2.minus(ipp).norm() > epsilon) {
							out2.assign(ipp);
							
							//report
							result.intersection(ipp, ipq);

							intersections++;
						}
						break;
					}
					
					if (intersections > 1) {
						// terminate
						return;
					}
				}
			} else {
				// poly edge is parallel with line. There is a special case where the line
				// is coincident with and edge of the poly
			}
			
			
			// go forward to next edge
			iter++;
		}

		// if no intersections, check if boundary line points have survived
		if (intersections < 1) {
			if (keepp1 && keepp2) {
				// return both end-points
				result.intersection(p1, projectToPlane(p1, polynormal, polypoint));
				result.intersection(p2, projectToPlane(p2, polynormal, polypoint));
				return;
			}
			
			if (!keepp1 && !keepp2) {
				// empty intersection
				return;
			}			
			//if here, only one boundary point survived, which should not happen. 
			// We default to separation in this case
			return;
		}
		
		if (intersections < 2) {
			if (keepp1) {
				// return p1 
				result.intersection(p1, projectToPlane(p1, polynormal, polypoint));
				return;
			} else if (keepp2) {
				// report p2
				result.intersection(p2, projectToPlane(p2, polynormal, polypoint));
				return;
			} else {
				// no boundary points
				return;
			}
		}		
	}

	
	/**
	 * assign to projected the point that results from projecting point onto the plane defined by normal and ref,
	 * along the positive z axis
	 */
	private static final Vector3 projectToPlane( Vector3 point, Vector3 normal, Vector3 ref) {
		return point.add(0,0,ref.minus(point).dot(normal)/normal.z);
	}
	
	/**
	 * Return true if a is in the positive half-plane define by the two points bs->bt. 
	 * @param a
	 * @param bs
	 * @param bt
	 * @return
	 */
	public static final boolean isInHalfplane(final Vector3 a, final Vector3 bs, final Vector3 bt) {
		return (bt.minus(bs)).cross(a.minus(bs)).z >= 0;
	}
	
	/**
	 * Return the counter clock-wise normal of the given polygon
	 * @param poly
	 * @param normal
	 */
	private static final void polyNormal(List<Vector3> poly, Vector3 normal) {
		final Vector3 p3 = poly.get(0);
		final Vector3 p4 = poly.get(1);
		final Vector3 p5 = poly.get(2);
		// counter clock-wise normal
		final Vector3 poly1normal = p5.minus(p3).cross(p3.minus(p4));
		// return
		normal.assign(poly1normal.normalize());
	}
	
	/**
	 * Return true if p is contained inside poly. Poly is required to contain at least 3 affine independent points
	 * @param p
	 * @param poly
	 * @return
	 */
	public static final boolean isContained( final Vector3 p, final Iterator<Vector3> poly ) {
		Vector3 p0 = poly.next();
		Vector3 pm = p0;
		
		// test each edge
		while(poly.hasNext()) {
			Vector3 pi = poly.next();
			if (!isInHalfplane(p, pm, pi))
				return false;
			
			pm = pi;
		}
		
		// test last edge from final vertex to 
		// the first vertex, closing the polygon
		if (!isInHalfplane(p, pm, p0))
			return false;
		
		// all tests passed
		return true;
	}
	
	/**
	 * Intersect lines in 2d. Lines are given by 
	 *  p(a) = ps + (pt-ps)a
	 *  q(b) = qs + (qt-qs)b
	 *  
	 *  Returns the values of a and b at the intersection point
	 *  in the (x,y) values in given vector st. If lines p and q are 
	 *  parallel or overlapping along a line, the function returns false.
	 *  Otherwise the return value is true
	 *   
	 * @param ps Starting point for line p
	 * @param pt End-point for line p
	 * @param qs Starting point for line q
	 * @param qt End-point for line q
	 * @param st Return vector for parameter values at intersection
	 * @param epsilon Precision value. 
	 * @return True if result is well defined. False solution is non-existent or
	 * not unique
	 */
	public static final boolean lineLineIntersection( final Vector3 ps, final Vector3 pt, 
			final Vector3 qs, final Vector3 qt, 
			final Vector3 st,
			final double epsilon ) {
		// intersect edges in 2d
		//
		// p(a) = pm + a (p-pm)
		// q(b) = qm + b (q-qm)
			// we want to know a and b so p(a) = q(b)
		// rewriting
		// pm + a(p-pm) = qm + b(q-qm)
		// a(p-pm) - b(q-qm) = qm - pm
		// [ (p-pm) (qm-q) ] [a,b] = [qm-pm]
		// take inverse and obtain a and b.
		// inverse of 2d matrix is
		// [c d]^-1              [ f -d]
		// [e f]    = (cf-ed)^-1 [-e  c]
		// so
		// [a]    [ pd.x qd.x ]^-1 
		// [b] =  [ pd.y qd.y ]   (qm-pm)
		// and then
		// a = 1/(pd.x*qd.y-pd.y*qd.x)( qd.y*b.x + (-qd.x)*b.y );
		// b = 1/(pd.x*qd.y-pd.y*qd.x)( (-pd.y)*b.x + pd.x*b.y );
		
		// line deltas
		Vector3 pd = pt.minus(ps);			
		Vector3 qd = qs.minus(qt); // turned around, see derivation 
		
		// the b-side in the equation in the comments above
		Vector3 b = qs.minus(ps);
		
		// determinant calculation
		double det =  pd.x*qd.y-pd.y*qd.x;		
		
		// ill-posed problem?
		if (Math.abs(det)<epsilon)
			return false;
		 
		// calculate parametrisation values at intersection
		double alpha = (1/det)* (qd.y*b.x + (-qd.x)*b.y);
		double beta  = (1/det)* ( (-pd.y)*b.x + pd.x*b.y ); 
		
		// set return values
		st.x = alpha;
		st.y = beta;
		
		// all well
		return true;
	}

}
