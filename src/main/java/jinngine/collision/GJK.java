/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */

package jinngine.collision;
import jinngine.geometry.SupportMap3;
import jinngine.math.Vector3;


/**
 * Implementation of the Gilbert-Johnsson-Keerthi algorithm, for computing the distance 
 * between convex objects and/or closest points. This implementation is based on the theory presented in [Bergen 2003]
 * @author Silcowitz
 */
public class GJK {
	//private Map<Pair<Body>,GJK3.State> cachedStates = new HashMap<Pair<Body>,GJK3.State>();

	/**
	 * A state structure for the GJK3 implementation. Used internally in the GJK3 implementation,
	 * and also used to simplify caching of GJK results.
	 * @author Silcowitz
	 */
	public final class State {
		public final Vector3 v = new Vector3(1,1,1);
		public final Vector3 w = new Vector3();
		public final Vector3 p = new Vector3();
		public final Vector3 q = new Vector3();
		public final  Vector3[][] simplices = new Vector3[4][4]; //contains 3 simplices for A-B, Sa, Sb
		public final double[] lambda = new double[] {1,0,0,0};
		public final int[] permutation = new int[] {0,1,2,3};
		public int simplexSize;	
		public int iterations = 0;
		public boolean intersection = false;
		//public boolean initialized = false;
	}

	private final State state = new State();
	
	/**
	 * Get the internal state of the GJK algorithm
	 * @return A GJK state
	 */
	public State getState() {
		return state;
	}
		
	public void run( SupportMap3 Sa, SupportMap3 Sb, Vector3 va, Vector3 vb, double envelope, double epsilon, int maxiter ) {		
		// if v has become too small, reset it TODO check this
		if (state.v.norm()<=envelope) {
			state.v.assign(1,1,1);
		}

		state.iterations = 0;
    	Vector3 v = state.v;
		Vector3 w = state.w;
		Vector3 sa = new Vector3();
		Vector3 sb = new Vector3();
    	
		sa.assign( Sa.supportPoint(state.v.multiply(-1)));
		sb.assign( Sb.supportPoint(state.v.multiply(1)));	    							
		w.assign( sa.minus(sb) );
	
		//initial separating axis test (distance is at least more than the envelope)
		if ( v.normalize().dot(w) > envelope ) {
			//return support points as approximations of closest points
			va.assign(sa);
			vb.assign(sb);
			//v.assign(sa.minus(sb));
//			w.print();
//			v.print();
//			System.out.println("GJK: early termination, vlaue "+v.normalize().dot(w));
			state.intersection = false;
			return;
		} 
		
    	//initially update the simplex (often results in a quick termination)
    	if (state.simplexSize>0)
    		updateSimplex(state, Sa, Sb);
    	
    	//main loop
		while ( true  ) {
			state.iterations++;
		
//		    System.out.println("gjk iteration" + " " + v.norm()+ "  : " + state.simplexSize);
//			v.print();
			
			//store points of convex objects a and b, and A-B (in A space)
//			sa.assign( a.toWorld(Sa.supportPoint(state.v.multiply(-1), a)));
//			sb.assign( b.toWorld(Sb.supportPoint(state.v.multiply(1), b)));	    							
//			w.assign( sa.minus(sb) );
			sa.assign( Sa.supportPoint(state.v.multiply(-1)));
			sb.assign( Sb.supportPoint(state.v.multiply(1)));	    							
			w.assign( sa.minus(sb) );

			//Termination condition
			// ||v||2 -v.w is an upper bound for ||vk-v(A-B)||2 which converges towards zero as k goes large
			if (  Math.abs(v.dot(v)-v.dot(w)) < epsilon*epsilon  || state.iterations>maxiter || state.simplexSize > 3 ) 
				break;
			
			//separating axis test (distance is at least more than the envelope)
			if ( v.normalize().dot(w) > envelope ) {
				state.intersection = false;
				break;
			} 
						
			//add w to the simplices
			Vector3[] row = state.simplices[state.permutation[state.simplexSize]];
			row[0] = w.copy();
			row[1] = sa.copy();
			row[2] = sb.copy();
			row[3] = v.copy();
			state.simplexSize++;
			
			if ( !reduceSimplex( state ) ) {
				//latest w vector was rejected, we consequently terminate (simplex cannot chance from here on)
//				System.out.println("reject");
				break;
			}
									
			//Calculate the vector v using lambda values
			v.assignZero();
			for (int i=0; i<state.simplexSize;i++) {
				Vector3.add(v, state.simplices[state.permutation[i]][0].multiply( state.lambda[state.permutation[i]]));
			}

			//Check for a penetrating state
			if ( v.cutOff(epsilon).equals(Vector3.zero) || state.simplexSize > 3 ) {
//				System.out.println("penetration");
				break;				
			}
		} //while true
		
		//Computing v, p, and q, closest points of A and B
		state.v.assignZero(); state.p.assignZero(); state.q.assignZero(); 
		for (int i=0; i<state.simplexSize;i++) {
			Vector3.add(state.v, state.simplices[state.permutation[i]][0].multiply(state.lambda[state.permutation[i]]));			
			Vector3.add(state.p, state.simplices[state.permutation[i]][1].multiply(state.lambda[state.permutation[i]]));
			Vector3.add(state.q, state.simplices[state.permutation[i]][2].multiply(state.lambda[state.permutation[i]]));				
		}

		// return closest points in return arguments
		va.assign(state.p);
		vb.assign(state.q);
		
		// check for intersection
		if ( va.minus(vb).norm() < epsilon || state.simplexSize > 3)
			state.intersection = true;
	}
	
	
	/**
	 *  updateSimplex() uses the cached information in GJK3.State to update the current simplex. More specifically,
	 *  the cached v vectors, that was previously used to obtain each simplex point, is reused to recompute all simplex points.
	 *  After this, the method reduceSimplex is invoked, such that the new updated simplex is indeed a
	 *  minimal one. The relevance in this lies in exploiting frame coherence. When GJK is run on a given configuration,
	 *  the v vectors used to obtain the current simplex will often be sufficient to obtain a new simplex, adequate 
	 *  to meet the termination condition for the next time frame. For example, this is would often be the case 
	 *  for resting contacts. Thus all subsequent GJK iterations is avoided.
	 */
	private final void updateSimplex(GJK.State state, SupportMap3 Sa, SupportMap3 Sb) {

		for (int i = 0; i<state.simplexSize; i++) {
			//add w to the simplices
			Vector3[] row = state.simplices[state.permutation[i]];

			//store points of convex objects a and b, and A-B (in A space)
			row[1] = Sa.supportPoint(state.simplices[i][3].multiply(-1));
			row[2] = Sb.supportPoint(state.simplices[i][3].multiply(1));	    							
			row[0] = row[1].minus(row[2]);
			//row[4] = v.copy(); not needed
			//state.simplexSize = ++state.permutation[4];
		}

		//recompute the simplex and lambda values
		reduceSimplex( state );
	
		//Calculate the vector v
		state.v.assign(Vector3.zero);
		for (int i=0; i<state.simplexSize;i++) 
			Vector3.add(state.v, state.simplices[state.permutation[i]][0].multiply( state.lambda[state.permutation[i]]));
	}

	/**
	 * Return a support point on the CSO of A and B, (A-B), in world space
	 * @param Sa support mapping for object A
	 * @param a body for object A
	 * @param Sb support mapping for object B
	 * @param b Body for object B
	 * @param v direction vector 
	 * @return a new support point on the configuration space obstacle of A and B
	 */
	@SuppressWarnings("unused")
	private final Vector3 support( SupportMap3 Sa, SupportMap3 Sb, Vector3 v) {
		Vector3 sva = Sa.supportPoint(v) ;
		//We need rotate the vector reverse in B space
		Vector3 svb = Sb.supportPoint(v.multiply(-1));   		
		return sva.minus(svb);
	}
	/**
	 * Auxiliary function for swapping two elements in a permutation array.
	 * 
	 * @param i 
	 * @param j
	 * @param permutation 
	 */
	private final void swap( int i, int j, int[] permutation ) {
		int temp = permutation[i];
		permutation[i] = permutation[j];
		permutation[j] = temp;
	}

	/**
	 * Method is a hard-coded method that reduces the given simplex to the smallest possible simplex,
	 * that contains the closest point to the origin. This approach is described in detail in [Bergen 2003],
	 * and can be quite cumbersome to grasp. However, it is sufficient to know that the method finds the 
	 * smallest subset of simplex points, which contains the closest point to the origin of the whole simplex.
	 * In addition, the method also computes a parametrization of the closest point, v, expressed as a convex
	 * combination of the new simplex points, given by the lambda coefficients.
	 * @param state State containing the simplex that is to be reduced
	 * @return returns false if the latest added simplex point was rejected, true otherwise. Upon return, the state
	 * class will be updated containing new simplex points, lambda values and permutation vector. 
	 */
	private final boolean reduceSimplex(State state) {
		// Matrix is a 4x3 matrix like:| y1 a1 b1 |
		// permutation is              | ...      |
		//  {size,p1,p2,p3,p4}         | y4 a4 b4 |
		//		
		final Vector3[][] matrix = state.simplices;
		final double[] lambda = state.lambda;
		final int[] perm = state.permutation;
		final double epsilon = 1e-15;
		
		//trivial case
		if (state.simplexSize == 1) {
			lambda[perm[0]]=1;
			state.simplexSize=1;
			return true;
		}

		if (state.simplexSize == 2) {
			// 1 12
			// 2
			final Vector3[] row0 = matrix[perm[0]];
			final Vector3[] row1 = matrix[perm[1]];
			final Vector3 y1 = row0[0]; 
			final Vector3 y2 = row1[0]; 

			final double d12_1 = y2.minus(y1).dot(y2); 
			final double d12_2 = y1.minus(y2).dot(y1);
			
			//y1 (no permutation needed)
			if ( d12_2 <= 0 ) {                  lambda[perm[0]] = 1;  state.simplexSize = 1; return false;}
			//y2 ( (2,1)
			if ( d12_1 <= 0 ) { swap(1,0, perm); lambda[perm[0]] = 1;  state.simplexSize = 1; return true; }

			final double d12 = d12_1 + d12_2;
			//terminate on affinely dependent points in the set (if d12 is zero, we can never use point y2)
			if ( Math.abs(d12) <= epsilon ) {
//				System.out.println("Affinely dependent set in case d12");
				state.simplexSize = 1;
				return false;
			}
			
			if ( d12_1 > 0 && d12_2 > 0 ) {	
				//y1, y2 (no permutation)			
				lambda[perm[0]] = d12_1/d12; lambda[perm[1]] = d12_2/d12;
				return true;
			} else {
//				System.out.println("Unable to determine smallest set, use y1");
				state.simplexSize = 1;
				return false;
			}
				
		} else if (state.simplexSize == 3) {
			// 1 12 123
			// 2 13
			// 3 23
			
			final Vector3[] row0 = matrix[perm[0]];
			final Vector3[] row1 = matrix[perm[1]];
			final Vector3[] row2 = matrix[perm[2]];			
			final Vector3 y1 = row0[0]; 
			final Vector3 y2 = row1[0];
			final Vector3 y3 = row2[0];
			
			//y1, (no permutation)
			final double d13_3 = y1.minus(y3).dot(y1);// d13_3 = Math.abs(d13_3)<epsilon?0:d13_3;
			final double d12_2 = y1.minus(y2).dot(y1);// d12_2 = Math.abs(d12_2)<epsilon?0:d12_2;
			if ( d12_2 <= 0 && d13_3 <=0 ) /*{Vector3.set(v,y1); return new Vector3[] {y1};}*/ 
			{                 lambda[perm[0]]=1; state.simplexSize=1; return true; }

			//y2 (2,1)
			final double d12_1 = y2.minus(y1).dot(y2); //d12_1 = Math.abs(d12_1)<epsilon?0:d12_1;
			final double d23_3 = y2.minus(y3).dot(y2); //d23_3 = Math.abs(d23_3)<epsilon?0:d23_3;
			if ( d12_1 <= 0 && d23_3 <=0 ) //{Vector3.set(v,y2); return new Vector3[] {y2}; }
			{ swap(1,0,perm); lambda[perm[0]]=1; state.simplexSize=1; return true; }
				
			//y3 (3,1)
			final double d13_1 = y3.minus(y1).dot(y3); //d13_1 = Math.abs(d13_1)<epsilon?0:d13_1;
			final double d23_2 = y3.minus(y2).dot(y3); //d23_2 = Math.abs(d23_2)<epsilon?0:d23_2;
			if ( d23_2 <= 0 && d13_1 <=0 ) //{Vector3.set(v,y3); return new Vector3[] {y3}; }
			{ swap(2,0,perm); lambda[perm[0]]=1; state.simplexSize=1; return true; }
			
			final double d23 = d23_2 + d23_3;
			final double d13 = d13_1 + d13_3;
			final double d12 = d12_1 + d12_2;

			//terminate on affinely dependent points in the set
//			if ( Math.abs(d13)<=epsilon ||
//					Math.abs(d23)<=epsilon ) {
//				
//				//System.out.println("Affinely independent set on d13 or d23 ,  d13="+d13+"  d23="+d23+"  d12="+d12);
//				state.simplexSize = 2;
//				return false;
//			}
			//TODO 2009-08-09,  I've discovered that the above is wrong. Just because d13 is zero, it does not mean that y2 and y3 cannot be 
			//used, and vice versa. The idea of the check, is to prevent GJK from performing useless iterations, using 
			//points that are affinely dependent. It now remains to fix the condition such that it works in the intended way.
			
			

			//y2,y3 (2,1) (3,2)
			final double d123_1 = d23_2 * y2.minus(y1).dot(y2) + d23_3 * y2.minus(y1).dot(y3); //d123_1 = Math.abs(d123_1)<epsilon?0:d123_1;
			if (d123_1 <= 0 && d23_2 > 0 && d23_3 > 0) //{Vector3.set(v,y2.multiply(d23_2/d23).Add(y3.multiply(d23_3/d23))); return new Vector3[] {y2,y3};}
			{ swap(1,0,perm); swap(2,1,perm); lambda[perm[0]]=d23_2/d23; lambda[perm[1]]=d23_3/d23; state.simplexSize=2; return true; }
			
			//y1,y3 (3,2)
			final double d123_2 = d13_1 * y1.minus(y2).dot(y1) + d13_3 * y1.minus(y2).dot(y3); //d123_2 = Math.abs(d123_2)<epsilon?0:d123_2;
			if (d123_2 <= 0 && d13_1 > 0 && d13_3 > 0) //{ Vector3.set(v,y1.multiply(d13_1/d13).Add(y3.multiply(d13_3/d13))); return new Vector3[] {y1,y3};}
			{                 swap(2,1,perm); lambda[perm[0]]=d13_1/d13; lambda[perm[1]]=d13_3/d13; state.simplexSize=2; return true; }

			//y1,y2 (no permutation)
			final double d123_3 = d12_1 * y1.minus(y3).dot(y1) + d12_2 * y1.minus(y3).dot(y2); //d123_3 = Math.abs(d123_3)<epsilon?0:d123_3;
			if (d123_3 <= 0 && d12_1 > 0 && d12_2 > 0) //{ /*Vector3.set(v,y1.multiply(d12_1/d12).Add(y2.multiply(d12_2/d12)));*/ return null;  /*return new Vector3[] {y1,y2};*/ }
			{                                 lambda[perm[0]]=d12_1/d12; lambda[perm[1]]=d12_2/d12; state.simplexSize=2; return false; }

			//y1, y2, y3 (no permutation)	
			final double d123 = d123_1 + d123_2 + d123_3;
			//System.out.println("d123 = "+d123);

			if ( d123_1 > 0 && d123_2 > 0 && d123_3 > 0)
			{  		
				lambda[perm[0]]=d123_1/d123; lambda[perm[1]]=d123_2/d123; lambda[perm[2]]=d123_3/d123; state.simplexSize=3; 
				return true;
			} else {
//				System.out.println("Unable to determine smallest set, use y1,y2");
				//double d123_3 = d12_1 * y1.minus(y3).dot(y1) + d12_2 * y1.minus(y3).dot(y2); d123_3 = Math.abs(d123_3)<epsilon?0:d123_3;
				lambda[perm[0]]=d12_1/d12; lambda[perm[1]]=d12_2/d12; state.simplexSize=2; return false; 
				//System.exit(-1);
			}
			
		} else if (state.simplexSize == 4) {
			// 1 12 123 1234
			// 2 13 124
			// 3 14 134
			// 4 23 234
            //	 24
			//   34
			
			final Vector3[] row0 = matrix[perm[0]];
			final Vector3[] row1 = matrix[perm[1]];
			final Vector3[] row2 = matrix[perm[2]];			
			final Vector3[] row3 = matrix[perm[3]];			
			final Vector3 y1 = row0[0]; 
			final Vector3 y2 = row1[0];
			final Vector3 y3 = row2[0];
			final Vector3 y4 = row3[0];
			
			//y1 (no permutation)
			final double d13_3 = y1.minus(y3).dot(y1); //d13_3= Math.abs(d13_3)<epsilon?0:d13_3;
			final double d12_2 = y1.minus(y2).dot(y1); //d12_2= Math.abs(d12_2)<epsilon?0:d12_2;
			final double d14_4 = y1.minus(y4).dot(y1); //d14_4= Math.abs(d14_4)<epsilon?0:d14_4;
			if ( d12_2 <= 0 && d13_3 <=0 && d14_4 <=0 ) //{Vector3.set(v, y1); return new Vector3[] {y1}; }
			{                lambda[perm[0]] = 1; state.simplexSize=1; return true; }
			
			//y2 (2,1)
			final double d12_1 = y2.minus(y1).dot(y2); //d12_1= Math.abs(d12_1)<epsilon?0:d12_1;
			final double d23_3 = y2.minus(y3).dot(y2); //d23_3= Math.abs(d23_3)<epsilon?0:d23_3;
			final double d24_4 = y2.minus(y4).dot(y2); //d24_4= Math.abs(d24_4)<epsilon?0:d24_4;
			if ( d12_1 <= 0 && d23_3 <=0 && d24_4 <= 0) //{Vector3.set(v, y2); return new Vector3[] {y2}; }
			{ swap(1,0,perm); lambda[perm[0]] = 1; state.simplexSize=1; return true; }

			//y3 (3,1)
			final double d13_1 = y3.minus(y1).dot(y3); //d13_1= Math.abs(d13_1)<epsilon?0:d13_1;
			final double d23_2 = y3.minus(y2).dot(y3); //d23_2= Math.abs(d23_2)<epsilon?0:d23_2;
			final double d34_4 = y3.minus(y4).dot(y3); //d34_4= Math.abs(d34_4)<epsilon?0:d34_4;
			if ( d23_2 <= 0 && d13_1 <=0 && d34_4 <=0 ) //{Vector3.set(v, y3); return new Vector3[] {y3}; }
			{ swap(2,0,perm); lambda[perm[0]] = 1; state.simplexSize=1; return true; }

			//y4 (4,1)
			final double d14_1 = y4.minus(y1).dot(y4); //d14_1= Math.abs(d14_1)<epsilon?0:d14_1;
			final double d24_2 = y4.minus(y2).dot(y4); //d24_2= Math.abs(d24_2)<epsilon?0:d24_2;
			final double d34_3 = y4.minus(y3).dot(y4); //d34_3= Math.abs(d34_3)<epsilon?0:d34_3;
			if ( d14_1 <= 0 && d24_2 <=0 && d34_3 <=0 ) //{Vector3.set(v, y4); return new Vector3[] {y4}; }
			{ swap(3,0,perm); lambda[perm[0]] = 1; state.simplexSize=1; return true; }

			final double d12 = d12_1 + d12_2;
			final double d13 = d13_1 + d13_3;
			final double d14 = d14_1 + d14_4;
			final double d23 = d23_2 + d23_3;
			final double d24 = d24_2 + d24_4;
			final double d34 = d34_3 + d34_4;
			
			//terminate on affinely dependent points in the set
//			if ( (d12)<=epsilon || (d13)<=epsilon || (d14)<=epsilon ||
//					(d23)<=epsilon || (d24)<=epsilon || (d34)<=epsilon ) {
//				//System.out.println("Affinely independent set");
//				state.simplexSize = 3;
//				return false;
//			}

			//y1,y2 (no permutation)
			final double d123_3 = d12_1 * y1.minus(y3).dot(y1) + d12_2 * y1.minus(y3).dot(y2); //d123_3= Math.abs(d123_3)<epsilon?0:d123_3;
			final double d124_4 = d12_1 * y1.minus(y4).dot(y1) + d12_2 * y1.minus(y4).dot(y2); //d124_4= Math.abs(d124_4)<epsilon?0:d124_4;
			//System.out.println("d123_3: " + d123_3 + " d124_4: " + d124_4);
			if( d12_1 > 0 && d12_2 > 0 && d123_3 <=0 && d124_4 <=0) {
//				Vector3.set(v, y1.multiply(d12_1/d12).Add(y2.multiply(d12_2/d12)));
//				return new Vector3[] {y1,y2};
				lambda[perm[0]] = d12_1 / d12; lambda[perm[1]] = d12_2/d12;
				state.simplexSize = 2;
				return true;				
			}

			//y1, y3 (3,2)
			final double d123_2 = d13_1 * y1.minus(y2).dot(y1) + d13_3 * y1.minus(y2).dot(y3); //d123_2= Math.abs(d123_2)<epsilon?0:d123_2;
			final double d134_4 = d13_1 * y1.minus(y4).dot(y1) + d13_3 * y1.minus(y4).dot(y3); //d134_4= Math.abs(d134_4)<epsilon?0:d134_4;
			//System.out.println("d123_2: " + d123_2 + " d134_4: " + d134_4);
			if( d13_1 > 0 && d13_3 > 0 && d123_2 <=0 && d134_4 <=0) {				
//				Vector3.set(v, y1.multiply(d13_1/d13).Add(y3.multiply(d13_3/d13)));
//				return new Vector3[] {y1,y3};				
				swap(2,1,perm);
				lambda[perm[0]] = d13_1 / d13; lambda[perm[1]] = d13_3/d13;
				state.simplexSize = 2;
				return true;

			}

			//y1, y4 (4,2)
			final double d124_2 = d14_1 * y1.minus(y2).dot(y1) + d14_4 * y1.minus(y2).dot(y4); //d124_2= Math.abs(d124_2)<epsilon?0:d124_2;
			final double d134_3 = d14_1 * y1.minus(y3).dot(y1) + d14_4 * y1.minus(y3).dot(y4); //d134_3= Math.abs(d134_3)<epsilon?0:d134_3;
			//System.out.println("d124_2: " + d124_2 + " d134_3: " + d134_3);
			if( d14_1 > 0 && d14_4 > 0 && d124_2 <=0 && d134_3 <=0) {
//				Vector3.set(v, y1.multiply(d14_1/d14).Add(y4.multiply(d14_4/d14)));
//				return new Vector3[] {y1,y4};
				swap(3,1,perm);
				lambda[perm[0]] = d14_1 / d14; lambda[perm[1]] = d14_4/d14;
				state.simplexSize = 2;
				return true;

			}

			//y2,y3 (2,1) (3,2)
			final double d123_1 = d23_2 * y2.minus(y1).dot(y2) + d23_3 * y2.minus(y1).dot(y3); //d123_1= Math.abs(d123_1)<epsilon?0:d123_1;
			final double d234_4 = d23_2 * y2.minus(y4).dot(y2) + d23_3 * y2.minus(y4).dot(y3); //d234_4= Math.abs(d234_4)<epsilon?0:d234_4;
			//System.out.println("d123_1: " + d123_1 + " d234_4: " + d234_4);
			if( d23_2 > 0 && d23_3 > 0 && d123_1 <=0 && d234_4 <=0) {
//				Vector3.set(v, y2.multiply(d23_2/d23).Add(y3.multiply(d23_3/d23)));
//				return new Vector3[] {y2,y3};
				
				swap(1,0,perm); swap(3,1,perm);
				lambda[perm[0]] = d23_2 / d23; lambda[perm[1]] = d23_3/d23;
				state.simplexSize = 2;
				return true;
			}

			//y2,y4 (2,1) (4,2)
			final double d124_1 = d24_2 * y2.minus(y1).dot(y2) + d24_4 * y2.minus(y1).dot(y4); //d124_1= Math.abs(d124_1)<epsilon?0:d124_1;
			final double d234_3 = d24_2 * y2.minus(y3).dot(y2) + d24_4 * y2.minus(y3).dot(y4); //d234_3= Math.abs(d234_3)<epsilon?0:d234_3;
			//System.out.println("d124_1: " + d124_1 + " d234_3: " + d234_3);
			if( d24_2 > 0 && d24_4 > 0 && d124_1 <=0 && d234_3 <=0) {
//				Vector3.set(v, y2.multiply(d24_2/d24).Add(y4.multiply(d24_4/d24)));
//				return new Vector3[] {y2,y4};
				swap(1,0,perm); swap(3,1,perm);
				lambda[perm[0]] = d24_2 / d24; lambda[perm[1]] = d24_4/d24;
				state.simplexSize = 2;
				return true;

			}

			//y3,y4 (3,1) (2,4)
			final double d134_1 = d34_3 * y3.minus(y1).dot(y3) + d34_4 * y3.minus(y1).dot(y4); //d134_1= Math.abs(d134_1)<epsilon?0:d134_1;
			final double d234_2 = d34_3 * y3.minus(y2).dot(y3) + d34_4 * y3.minus(y2).dot(y4); //d234_2= Math.abs(d234_2)<epsilon?0:d234_2;
			//System.out.println("d134_1: " + d134_1 + " d234_2: " + d234_2);
			if( d34_3 > 0 && d34_4 > 0 && d134_1 <=0 && d234_2 <=0) {
//				Vector3.set(v, y3.multiply(d34_3/d34).Add(y4.multiply(d34_4/d34)));
//				return new Vector3[] {y3,y4};				
				swap(2,0,perm); swap(1,3,perm);
				lambda[perm[0]] = d34_3 / d34; lambda[perm[1]] = d34_4/d34;
				state.simplexSize = 2;
				return true;

			}

			//y1,y2,y3 (no permutation)
			final double d1234_4 = d123_1 * (y1.minus(y4).dot(y1)) + d123_2 * (y1.minus(y4).dot(y2) ) + d123_3 * (y1.minus(y4).dot(y3));
			//d1234_4 = Math.abs(d1234_4)<epsilon?0:d1234_4;
			if ( d123_1 > 0 && d123_2 > 0 && d123_3 > 0 && d1234_4 <= 0) {
				final double d123 = d123_1 + d123_2 + d123_3;
				lambda[perm[0]]= d123_1/d123; lambda[perm[1]]= d123_2/d123; lambda[perm[2]] = d123_3/d123;
				state.simplexSize = 3;
				
//				Vector3.set(v, y1.multiply(lambda1).Add(y2.multiply(lambda2)).Add(y3.multiply(lambda3)));
//				return new Vector3[] {y1,y2,y3};
				
				return false;
			}

			//y1,y2,y4 (4,3)
			final double d1234_3 = d124_1 * (y1.minus(y3).dot(y1)) + d124_2 * (y1.minus(y3).dot(y2) ) + d124_4 * (y1.minus(y3).dot(y4));
			//d1234_3 = Math.abs(d1234_3)<epsilon?0:d1234_3;
			if ( d124_1 > 0 && d124_2 > 0 && d124_4 > 0 && d1234_3 <= 0) { 
				final double d124 = d124_1 + d124_2 + d124_4;
//				Vector3.set(v, y1.multiply(d124_1/d124).Add(y2.multiply(d124_2/d124)).Add(y4.multiply(d124_4/d124)));
//				return new Vector3[] {y1,y2,y4};
				swap(3,2,perm);
				lambda[perm[0]]= d124_1/d124; lambda[perm[1]]= d124_2/d124; lambda[perm[2]] = d124_4/d124;
				state.simplexSize = 3;
				return true;

			}

			//y1,y3,y4 (3,2) (4,3)
			final double d1234_2 = d134_1 * (y1.minus(y2).dot(y1)) + d134_3 * (y1.minus(y2).dot(y3) ) + d134_4 * (y1.minus(y2).dot(y4));
			//d1234_2 = Math.abs(d1234_2)<epsilon?0:d1234_2;
			if ( d134_1 > 0 && d134_3 > 0 && d134_4 > 0 && d1234_2 <= 0) { 
				final double d134 = d134_1 + d134_3 + d134_4;
//				Vector3.set(v, y1.multiply(d134_1/d134).Add(y3.multiply(d134_3/d134)).Add(y4.multiply(d134_4/d134)));
//				return new Vector3[] {y1,y3,y4};
				swap(2,1,perm); swap(3,2,perm);
				lambda[perm[0]]= d134_1/d134; lambda[perm[1]]= d134_3/d134; lambda[perm[2]] = d134_4/d134;
				state.simplexSize = 3;
				return true;

			}

			//y2,y3,y4 (2,1)(3,2)(4,3)
			final double d1234_1 = d234_2 * (y2.minus(y1).dot(y2)) + d234_3 * (y2.minus(y1).dot(y3) ) + d234_4 * (y2.minus(y1).dot(y4));
			//d1234_1 = Math.abs(d1234_1)<epsilon?0:d1234_1;
			if ( d234_2 > 0 && d234_3 > 0 && d234_4 > 0 && d1234_1 <= 0) {
				final double d234 = d234_2 + d234_3 + d234_4;
//				Vector3.set(v, y2.multiply(d234_2/d234).Add(y3.multiply(d234_3/d234)).Add(y4.multiply(d234_4/d234)));
//				return new Vector3[] {y2,y3,y4};
				swap(1,0,perm); swap(2,1,perm); swap(3,2,perm);
				lambda[perm[0]]= d234_2/d234; lambda[perm[1]]= d234_3/d234; lambda[perm[2]] = d234_4/d234;
				state.simplexSize = 3;
				return true;
			}

			//y1,y2,y3,y4 (no permute)
			final double d1234 = d1234_1 + d1234_2 + d1234_3 + d1234_4;
			//System.out.println("d1234 = "+d1234);

			//System.out.println("d1234:" + d1234 + "," + d1234_1 +","+d1234_2 + ","+d1234_3+","+d1234_4 + "sum = " + (d1234_1+d1234_2+d1234_3+d1234_4)/d1234 );
			//System.out.println("v is then");
			//v.Print();
			//System.out.println("Simplex*** d14 = " + y1.Minus(y4).Length()/y4.Length());
			//return new Vector3[] {y1,y2,y3,y4};
			if ( d1234_1 > 0 && d1234_2 > 0 && d1234_3 > 0 && d1234_4 > 0) {
				//GJK penetrating state

				//check for the accuracy, v should be the zero vector
				if(  y1.multiply(d1234_1/d1234).add(y2.multiply(d1234_2/d1234)).add(y3.multiply(d1234_3/d1234)).add(y4.multiply(d1234_4/d1234)).norm() > 1 ) {
					//System.out.println("wrong penetration");
					//result is bad, terminate with last good subset {y1,y2,y3}
					state.simplexSize = 3;
					return false;
				}
				
				lambda[perm[0]] = d1234_1/d1234; lambda[perm[1]] = d1234_2/d1234; lambda[perm[2]]=d1234_3/d1234; lambda[perm[3]] = d1234_4/d1234;
				state.simplexSize=4;
				return true;
			} else {
				//System.out.println("unable to determine smallest X");
				//The algorithm was unable to determine the subset. return the last best known subset:
				final double d123 = d123_1 + d123_2 + d123_3;
				lambda[perm[0]]= d123_1/d123; lambda[perm[1]]= d123_2/d123; lambda[perm[2]] = d123_3/d123;
				state.simplexSize = 3;				


				//try{System.in.read();}catch (Exception e) {}
				return false;
			}
		}

//		System.out.println("GJK: impossible ending!");

		//Ending up here is actually not possible :)
		return false;
	}
	
}
