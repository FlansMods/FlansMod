/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.physics.solver.experimental;

import java.util.ArrayList;
import java.util.List;

import jinngine.math.Vector3;
import jinngine.physics.Body;
import jinngine.physics.solver.Solver;

/**
 * An experimental Newton based NCP solver, based on a so called Fischer function reformulation. This solver was developed
 * as a part of a research paper on solving multibody dynamics problems, and it is not recommended to use it. It is included 
 * in jinngine for people that are interested in the subject to experiment with it. Generally, the solver showed good performence
 * for normal force only problems, but had great difficulty handling friction dependent problems. As speculated in the mentioned
 * paper, this could be due to the high amount of over-determinacy in the way that friction constraints are formulated. 
 * @author mo
 *
 */
public class FischerNewton implements Solver {

//	@Override
//	public void setErrorTolerance(double epsilon) {
//		this.epsilon = epsilon;
//	}

	@Override
	public void setMaximumIterations(int n) {
		//this.imax = n;
	}

	
	public void setMaximumCGIterations(int n) {
		//this.cgmax = n;
	}

	
	public void setLinesearchIterations(int n) {
		//this.linemax =n;
	}

	public void setDamping(double d) {
		//this.damper =d;
	}

	public void setFrictionDamping(double d) {
		//this.frictiondamp =d;
	}

	
	private static double fisher(double a, double b) {
		return Math.sqrt(a*a+b*b)-(a+b);
	}

	private int linemax =25;
	private int imax = 25;
	private int cgmax = 25;
	private double epsilon = 1e-29;
	 double damper =0.000000;
	
	List<NCPConstraint> normals = new ArrayList<NCPConstraint>();
	
    @Override
	public double solve(List<NCPConstraint> constraints, List<Body> bodies, double epsilon) {
    	normals.clear();
    	for (NCPConstraint ci: constraints) 
    		if (ci.coupling == null)
    			normals.add(ci);
    	
   // 	linemax = 0;
    	
		solveInternal(normals, bodies);
    	
  //  	linemax = 15;
		damper = 0.000000;
		
		solveInternal(constraints, bodies);
		
		return 0;
	}
	
	public double solveInternal(List<NCPConstraint> constraints, List<Body> bodies) {
		int n = constraints.size();
		double error = 0;
		double besterror = Double.POSITIVE_INFINITY;
		double squarederror = 0; 
		//double epsilon = 1e-7;
		int i = 0;
		double mu = 1;
		//double damper = 0.000001;
		
		//friction velocity trucation
		double truncatevelocity = 0;
		
		
		//compute fisher
		for (NCPConstraint ci: constraints) {
			//velocity
			double w = ci.j1.dot(ci.body1.deltavelocity) + ci.j2.dot(ci.body1.deltaomega)
			+ ci.j3.dot(ci.body2.deltavelocity) + ci.j4.dot(ci.body2.deltaomega) + (ci.b) + damper*ci.lambda;

			//fisher
			if ( ci.lower == Double.NEGATIVE_INFINITY && ci.upper == Double.POSITIVE_INFINITY) {
				ci.fischer = w;
			} else if (ci.coupling == null) {
				ci.fischer =  Math.sqrt( w*w+ci.lambda*ci.lambda )-w-ci.lambda;
			} else  {
				
				//recompute friction limits
				double limit = Math.abs(ci.coupling.lambda)*mu; ci.lower = -limit; ci.upper = limit;
				if (Math.abs(w)<truncatevelocity ) {w=0;}
				
				ci.fischer =  fisher( ci.lambda-ci.lower, fisher(ci.upper-ci.lambda, -w));
			}
		
			squarederror += ci.fischer*ci.fischer;
		} error = Math.sqrt(squarederror);	
		
		
		// Newton loop
		while (true) {
			//if (i>imax/3)
			//	damper += 0.01;
			//System.out.println("error="+error);
			//termination condition
			if (error<epsilon || i>imax ) {
				System.out.println("e="+error+", i = "+i+" imax="+imax);		
				
				if (besterror < error) {
					//copy best solution to delta velocities
					for (Body b: bodies) {
						Vector3.assign(b.deltavelocity, b.auxDeltav2);
						Vector3.assign(b.deltaomega,b.auxDeltaOmega2);				
					}
					
					return besterror;
				}
				return error;
			}
			
			//tolerance for sub-system
			double tol = 0;
			if ( error < 1) tol = 0.5*error*error;
			else tol = 0.5*Math.sqrt(error);
			
			//solve sub-system
			double[] r = new double[n];
			double[] d = new double[n];
			double[] z = new double[n];
			double[] z_low = new double[n];			
			double[] dk = new double[n];
			double[] q = new double[n];
			double delta_new = 0; 
			double h = 1e-6;
			int k = 0;
			
			//r= Phi(xk), d = r
			int j = 0; for (NCPConstraint ci: constraints) {
				r[j] = ci.fischer;
				d[j] = r[j];
				j++;
			}	

			// delta_new = rTr
			for (j=0;j<n;j++)
				delta_new += r[j]*r[j];			
			double delta_old = delta_new, delta_low = Double.POSITIVE_INFINITY;

			//Conjugate Gradients
			while (true) {
				//termination
				if (delta_new<tol) { for(j=0;j<n;j++) dk[j]=z[j]; break;}
				if (delta_new<delta_low) { delta_low = delta_new; for(j=0;j<n;j++) z_low[j] = z[j]; }
				if (k > cgmax) { for(j=0;j<n;j++) dk[j] = z_low[j]; break;}
				
				//conjugate gradients (internal)
				
				// compute Phi( xk + zk*h)
				// clear velocities
				for (Body b: bodies) {
					//What?
					b.auxDeltaOmega.assignZero();
					b.auxDeltav.assignZero();
				}
				
				// compute change in velocity
				j=0; for (NCPConstraint ci: constraints) {
					double delta = d[j]*h;
					Vector3.add( ci.body1.auxDeltav,     ci.b1.multiply(delta));
					Vector3.add( ci.body1.auxDeltaOmega, ci.b2.multiply(delta));
					Vector3.add( ci.body2.auxDeltav,     ci.b3.multiply(delta));
					Vector3.add( ci.body2.auxDeltaOmega, ci.b4.multiply(delta));
					j = j+1;
				}

				//compute q = (Phi(xk+ d*h)-Phi(xk))/h
				j=0; for (NCPConstraint ci: constraints) {
					double lambda = ci.lambda + d[j]*h;

					//velocity
					double w = ci.j1.dot(ci.body1.deltavelocity.add(ci.body1.auxDeltav)) 
					+ ci.j2.dot(ci.body1.deltaomega.add(ci.body1.auxDeltaOmega))
					+ ci.j3.dot(ci.body2.deltavelocity.add(ci.body2.auxDeltav)) 
					+ ci.j4.dot(ci.body2.deltaomega.add(ci.body2.auxDeltaOmega)) 
					+ (ci.b) +damper*lambda;

					//fisher
					if (ci.lower == Double.NEGATIVE_INFINITY && ci.upper == Double.POSITIVE_INFINITY) {
						q[j] = (w-ci.fischer)/h;
					} else if (ci.coupling == null) {
						q[j] = ((Math.sqrt( w*w+lambda*lambda)-w-lambda) - ci.fischer)/h;
					} else {
						//friction damping
						//w += ci.lambda;

						//recompute friction limits *)
						double limit = Math.abs(ci.coupling.lambda)*mu;
						ci.lower = -limit; 
						ci.upper = limit;

						//if (Math.abs(w)<truncatevelocity ) {w=0;}

						q[j] =   ( fisher( lambda-ci.lower, fisher(ci.upper-lambda, -w)) - ci.fischer )/h;
					}
					j=j+1;
				} 			

				//alpha = delta_new/dTq
				double dTq = 0;
				for (j=0;j<n;j++) dTq += d[j]*q[j];
				double alpha = delta_new/dTq;
				
				//z = z + alpha d
				for (j=0;j<n;j++) z[j] -= alpha*d[j];
				
				//r = r-alpha q
				for (j=0;j<n;j++) r[j] -= alpha*q[j];
				
				delta_old = delta_new;
				//delta_new = rTr
				delta_new = 0;
				for (j=0;j<n;j++) delta_new += r[j]*r[j];

				double beta = delta_new/delta_old;
				
				//d = r + beta d
				for (j=0;j<n;j++) d[j] = r[j] + beta*d[j];
				
				k = k+1;
				
				//evaluate
//				double rsum = 0;
//				int m=0; for (ConstraintEntry ci: constraints) {
//					rsum += r[m]*ci.phixk;
//					m++;
//				}

				//System.out.println(k+" :Q="+(rsum/squarederror));
				
			} // sub-system CG iterations


			// clear velocities
			for (Body b: bodies) {
				b.auxDeltaOmega.assignZero();
				b.auxDeltav.assignZero();
			}

			//compute velocity vector for step length 1, move velocity forward
			j=0; for (NCPConstraint ci: constraints) {
				double delta = dk[j];
				ci.lambda += dk[j];
				//System.out.println(""+ dk[j]);
				Vector3.add( ci.body1.auxDeltav,     ci.b1.multiply(delta));
				Vector3.add( ci.body1.auxDeltaOmega, ci.b2.multiply(delta));
				Vector3.add( ci.body2.auxDeltav,     ci.b3.multiply(delta));
				Vector3.add( ci.body2.auxDeltaOmega, ci.b4.multiply(delta));

				Vector3.add( ci.body1.deltavelocity,      ci.b1.multiply(delta));	
				Vector3.add( ci.body1.deltaomega,  ci.b2.multiply(delta));				
				Vector3.add( ci.body2.deltavelocity,      ci.b3.multiply(delta));
				Vector3.add( ci.body2.deltaomega,  ci.b4.multiply(delta));

				j = j+1;
			}

			//linesearch
			k=0; double step = 1;
			double oldsquarederror = squarederror;
			//double olderror = error;
			while(true) {
				//compute fisher
				squarederror = 0;
				j=0; for (NCPConstraint ci: constraints) {				
					//velocity
					double w = ci.j1.dot(ci.body1.deltavelocity) + ci.j2.dot(ci.body1.deltaomega)
					+ ci.j3.dot(ci.body2.deltavelocity) + ci.j4.dot(ci.body2.deltaomega) + (ci.b)
					+ damper*ci.lambda;

					if (k>0)
						ci.lambda += -step*dk[j];
					//fisher
					if (ci.lower == Double.NEGATIVE_INFINITY && ci.upper == Double.POSITIVE_INFINITY) {
						ci.fischer = w;
					} else if (ci.coupling == null) {
						ci.fischer = Math.sqrt( w*w+ci.lambda*ci.lambda )-w-ci.lambda;
					} else {
						//friction damping
						//w += frictiondamp*ci.lambda;

						
						//compute limits
						double limit = Math.abs(ci.coupling.lambda)*mu; ci.lower = -limit; ci.upper = limit;
						if (Math.abs(w)<truncatevelocity ) {
							w=0;
						}

						
						ci.fischer =  fisher( ci.lambda-ci.lower, fisher(ci.upper-ci.lambda, -w));
					}

					squarederror += ci.fischer*ci.fischer;
					j=j+1;
				} error = Math.sqrt(squarederror);	

				
				//termination
				if (0.5*squarederror <= 0.5*oldsquarederror + step*0.01*(-oldsquarederror) ) {
					//System.out.println("k="+k);
					break;
				}
				
				if (k>=linemax) {
					break;
				}
				
				k = k+1;
				step = Math.pow(2,-k);
				for (Body b: bodies) {
					Vector3.add(b.deltavelocity, b.auxDeltav.multiply(-step));
					Vector3.add(b.deltaomega, b.auxDeltaOmega.multiply(-step));				
				}
			} // linesearch

			//System.out.println("k="+k);


			if ( error < besterror) {
				besterror = error;
				//copy the best solution
				for (Body b: bodies) {
					Vector3.assign(b.auxDeltav2, b.deltavelocity);
					Vector3.assign(b.auxDeltaOmega2, b.deltaomega);				
				}
			}


			i=i+1;
		} // Newton iterations
		
	}

	
	
//	private void computeVelocity2(List<ConstraintEntry> constraints, List<ConstraintEntry> off,  double[] lambda, double[] w, double damper) {	
//		//clear auxiliary fields
//		for (ConstraintEntry ci: constraints) {
//			ci.body1.auxDeltav.assignZero();
//			ci.body1.auxDeltaOmega.assignZero();
//			ci.body2.auxDeltav.assignZero();
//			ci.body2.auxDeltaOmega.assignZero();
//		}
//
//		// Jh M-1J^t x+ Ic x + b = 0
//		
//		//apply contributions from all constraints to bodies
//		int i = 0;
//		for (ConstraintEntry ci: constraints) {
//			Vector3.add( ci.body1.auxDeltav,     ci.b1.multiply(lambda[i] )  );
//			Vector3.add( ci.body1.auxDeltaOmega, ci.b2.multiply(lambda[i] ) );
//			Vector3.add( ci.body2.auxDeltav,     ci.b3.multiply(lambda[i] ) );
//			Vector3.add( ci.body2.auxDeltaOmega, ci.b4.multiply(lambda[i] ) );
//			i = i+1;
//		}
//
//		for (ConstraintEntry ci: off) {
//			Vector3.add( ci.body1.auxDeltav,     ci.b1.multiply(ci.lambda )  );
//			Vector3.add( ci.body1.auxDeltaOmega, ci.b2.multiply(ci.lambda ) );
//			Vector3.add( ci.body2.auxDeltav,     ci.b3.multiply(ci.lambda ) );
//			Vector3.add( ci.body2.auxDeltaOmega, ci.b4.multiply(ci.lambda ) );
//			i = i+1;
//		}
//
//		
//		i = 0;
//		for (ConstraintEntry ci: constraints) {
//			w[i] = ci.j1.dot(ci.body1.auxDeltav) + ci.j2.dot(ci.body1.auxDeltaOmega)
//			     + ci.j3.dot(ci.body2.auxDeltav) + ci.j4.dot(ci.body2.auxDeltaOmega) + (-ci.b) + damper*lambda[i];
//			i = i+1;
//		}			
//	}
	
	/**
	 * Evaluate the fischer funciton merit, based on a MLCP formulation having lower 
	 * and upper limit vectors. This funciton handles limits at infinty.
	 */
	public static double fischerMerit( List<NCPConstraint> constraints, List<Body> bodies) {
		double phi = 0;
		for (NCPConstraint ci: constraints) {
//			if (ci.coupling==null) //only friction
//				continue;
			//calculate (Ax+b)_i 
			double w =  ci.j1.dot(ci.body1.deltavelocity) 
			+ ci.j2.dot(ci.body1.deltaomega)
			+  ci.j3.dot(ci.body2.deltavelocity) 
			+ ci.j4.dot(ci.body2.deltaomega) + (ci.b) + ci.lambda*ci.damper;
			
			double upper = ci.upper;
			double lower = ci.lower;
			
			//use the correct friction bounds
			if (ci.coupling != null) {
				upper = Math.abs(ci.coupling.lambda)*ci.coupling.mu;
				lower = -Math.abs(ci.coupling.lambda)*ci.coupling.mu;
			}
            
			
			// (-oo,oo)
			if (lower == Double.NEGATIVE_INFINITY && upper == Double.POSITIVE_INFINITY ) {
				phi += w*w;
			// (-oo,u]
			} else if ( lower == Double.NEGATIVE_INFINITY) {
				double p = 	-fisher(upper-ci.lambda, -w);
				phi += p*p;			
			// [l,oo)
			} else if (upper == Double.POSITIVE_INFINITY) {
				double p = fisher(ci.lambda-lower, w);
				phi += p*p;
			// [l,u]
			} else {
				double p = fisher( ci.lambda-lower, 
						fisher(upper-ci.lambda, -w));
				phi += p*p;
			}
		}
		//psi = 1/2 * ||phi(x)||^2
		return phi*0.5;
	}

	public static double fischer( NCPConstraint ci ) {
		double phi = 0;
			//calculate (Ax+b)_i 
			double w =  ci.j1.dot(ci.body1.deltavelocity) 
			+ ci.j2.dot(ci.body1.deltaomega)
			+  ci.j3.dot(ci.body2.deltavelocity) 
			+ ci.j4.dot(ci.body2.deltaomega) + (ci.b) + ci.lambda*ci.damper;
			
            // (-oo,oo)
			if (ci.lower == Double.NEGATIVE_INFINITY && ci.upper == Double.POSITIVE_INFINITY) {
				phi = w;
			// (-oo,u]
			} else if ( ci.lower == Double.NEGATIVE_INFINITY) {
				double p = 	-fisher(ci.upper-ci.lambda, -w);
				phi = p;			
			// [l,oo)
			} else if (ci.upper == Double.POSITIVE_INFINITY) {
				double p = fisher(ci.lambda-ci.lower, w);
				phi = p;
			// [l,u]
			} else {
				double p = fisher( ci.lambda-ci.lower, 
						fisher(ci.upper-ci.lambda, -w));
				phi = p;
			}
			
			return phi;
	}

	
	public static void printA(List<NCPConstraint> constraints) {
		System.out.println("A = [ ");

		//int i = 0; 
		int k =0;
		for (NCPConstraint ci: constraints) {
			System.out.println("");

			//v[i] = -ci.b;
			double ai[] = new double[10000];

			//velocity pass
			int j=0;
			for (NCPConstraint cj: constraints) {
				k++;
				//for each interacting constraint
				ai[j] = 0;
				if( ci.body1 == cj.body1) {
					ai[j] = ci.j1.dot(cj.b1) + ci.j2.dot(cj.b2);
				}

				if (ci.body2 == cj.body2) {
					ai[j] = ai[j] + ci.j3.dot(cj.b3) + ci.j4.dot(cj.b4);
				}

				if (ci.body1 == cj.body2) {
					ai[j] = ai[j] + ci.j1.dot(cj.b3) + ci.j2.dot(cj.b4);
				}

				if (ci.body2 == cj.body1) {
					ai[j] = ai[j] + ci.j3.dot(cj.b1) + ci.j4.dot(cj.b2);
				}

				//v[i] = v[i] + ai[j]*cj.lambda;

//				if (Math.abs(ai[j])<1e-10 ) {
//					ai[j] = 0;
//				}
				
				//System.out.printf("%F "/*"%18.8e "*/, ai[j]);
				System.out.print(ai[j] + " ");
				
				j++;
			}// for cj
			
			System.out.println("; ");
			
		}
		

		System.out.println("]\n b = [ ");
		for (NCPConstraint ci: constraints) {
			System.out.print( (-ci.b) + " ");
		}		
		System.out.println("]");
			
	}
	
	public static void fillInA(List<NCPConstraint> constraints, double[][] A) {
		//int i = 0; 
		int k =0;
		for (NCPConstraint ci: constraints) {
			int j=0;
			for (NCPConstraint cj: constraints) {
				//for each interacting constraint
				A[k][j] = 0;
				if( ci.body1 == cj.body1) {
					A[k][j] = ci.j1.dot(cj.b1) + ci.j2.dot(cj.b2);
				}

				if (ci.body2 == cj.body2) {
					A[k][j] += ci.j3.dot(cj.b3) + ci.j4.dot(cj.b4);
				}

				if (ci.body1 == cj.body2) {
					A[k][j]+= ci.j1.dot(cj.b3) + ci.j2.dot(cj.b4);
				}

				if (ci.body2 == cj.body1) {
					A[k][j]+= ci.j3.dot(cj.b1) + ci.j4.dot(cj.b2);
				}
				j++;
			}// for cj
			k++;
		} //for ci
	}
	
	public static void fillInA(List<NCPConstraint> constraint1, List<NCPConstraint> constraint2, double[][] A) {
		//int i = 0; 
		int k =0;
		for (NCPConstraint ci: constraint1) {
			int j=0;
			for (NCPConstraint cj: constraint2) {
				//for each interacting constraint
				A[k][j] = 0;
				if( ci.body1 == cj.body1) {
					A[k][j] = ci.j1.dot(cj.b1) + ci.j2.dot(cj.b2);
				}

				if (ci.body2 == cj.body2) {
					A[k][j] += ci.j3.dot(cj.b3) + ci.j4.dot(cj.b4);
				}

				if (ci.body1 == cj.body2) {
					A[k][j]+= ci.j1.dot(cj.b3) + ci.j2.dot(cj.b4);
				}

				if (ci.body2 == cj.body1) {
					A[k][j]+= ci.j3.dot(cj.b1) + ci.j4.dot(cj.b2);
				}
				j++;
			}// for cj
			k++;
		} //for ci
	}

	
	public static void fillInb(List<NCPConstraint> constraints, double[] b) {
		int i=0;
		for (NCPConstraint ci: constraints) {
			b[i] = ci.b;
			i++;
		}		
		
	}

	public static void fillInLambda(List<NCPConstraint> constraints, double[] lambda) {
		int i=0;
		for (NCPConstraint ci: constraints) {
			lambda[i] = ci.lambda;
			i++;
		}		
		
	}

}
