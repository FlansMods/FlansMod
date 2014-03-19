/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.physics.solver;

import java.util.List;

import jinngine.math.Vector3;
import jinngine.physics.Body;

public class NonsmoothNonlinearConjugateGradient implements Solver {
	int max = 10000;
	
	public double[] pgsiters = new double[max];
	public double[] errors = new double[max];
	
	@Override
	public void setMaximumIterations(int n) {
	//	max =n;

	}
	
	public NonsmoothNonlinearConjugateGradient(int n ) {
		this.max = n;

		pgsiters = new double[max];
		errors = new double[max];
	}

	@Override
	public double solve(List<NCPConstraint> constraints, List<Body> bodies,
			double epsilon) {
		
		double rnew = 0;
		double rold = 0;
		double beta= 0;		
		int iter = 0;
		
		
		// compute external force contribution, clear direction and residual
		for (NCPConstraint ci: constraints) {
			ci.Fext = ci.j1.dot(ci.body1.externaldeltavelocity)
			+ ci.j2.dot(ci.body1.externaldeltaomega)
			+ ci.j3.dot(ci.body2.externaldeltavelocity) 
			+ ci.j4.dot(ci.body2.externaldeltaomega); 
			
			ci.d = 0; ci.residual = 0;
			
//			if ( ci.coupling != null) {
//				ci.lower = 0;  ci.upper = 0;
//			}
		}
		
		// reset search direction
		for (Body b: bodies) {
			b.auxDeltav.assignZero();
			b.auxDeltaOmega.assignZero();
		}

		while (true) {	
		
			// copy body velocity
			for (Body bi: bodies) {
				bi.auxDeltav2.assign(bi.deltavelocity);
				bi.auxDeltaOmega2.assign(bi.deltaomega);
			}
			
			rold = rnew; rnew = 0;
			
			// use one PGS iteration to compute new residual 
			for (NCPConstraint ci: constraints) {
				// update lambda and d
				final double alpha  = beta*ci.d;
				ci.lambda += alpha;
				ci.d = alpha + ci.residual; // gradient is -r

				//calculate (Ax+b)_i 				
				final double w = ci.j1.dot(ci.body1.deltavelocity) 
				         + ci.j2.dot(ci.body1.deltaomega)
				         + ci.j3.dot(ci.body2.deltavelocity) 
				         + ci.j4.dot(ci.body2.deltaomega) 
				         + ci.lambda*ci.damper + ci.Fext;
				
			    
			    double deltaLambda = (-ci.b-w)/(ci.diagonal + ci.damper );
				final double lambda0 = ci.lambda;

				//Clamp the lambda[i] value to the constraints
				if (ci.coupling != null) {
					//if the constraint is coupled, allow only lambda <= coupled lambda
					ci.lower = -Math.abs(ci.coupling.lambda)*ci.coupling.mu;
					ci.upper =  Math.abs(ci.coupling.lambda)*ci.coupling.mu;
					
					//use growing bounds only
					//if the constraint is coupled, allow only lambda <= coupled lambda
//					 double lower = -Math.abs(ci.coupling.lambda)*ci.coupling.mu;					
//					ci.lower = lower<ci.lower?lower:ci.lower;					
//					double upper = Math.abs(ci.coupling.lambda)*ci.coupling.mu;
//					ci.upper =  upper>ci.upper?upper:ci.upper;

				} 

				// do projection
				final double newlambda =
					Math.max(ci.lower, Math.min(lambda0 + deltaLambda,ci.upper ));

				// update the V vector
				deltaLambda = (newlambda - lambda0);
				

				// apply to delta velocities
				Vector3.multiplyAndAdd( ci.b1, deltaLambda, ci.body1.deltavelocity );
				Vector3.multiplyAndAdd( ci.b2, deltaLambda, ci.body1.deltaomega );
				Vector3.multiplyAndAdd( ci.b3, deltaLambda, ci.body2.deltavelocity );
				Vector3.multiplyAndAdd( ci.b4, deltaLambda, ci.body2.deltaomega );
				ci.lambda += deltaLambda;
				
				// update residual and squared gradient
				rnew += deltaLambda*deltaLambda;
				ci.residual = deltaLambda;
			} //for constraints	

			if (Math.abs(rnew) < epsilon) {
				break;
			}	
			
			// iteration limit
			if (iter>max)
				break;

			//compute beta
			beta = rnew/rold;

			if ( beta > 1 || iter == 0)  {
				beta = 0.0;
//				System.out.println("restart");
			}
				
			for (Body bi: bodies) {
				// compute residual in body space
				Vector3.minus( bi.auxDeltav2, bi.deltavelocity);
				Vector3.minus( bi.auxDeltaOmega2, bi.deltaomega);
				Vector3.multiply( bi.auxDeltav2, -1);
				Vector3.multiply( bi.auxDeltaOmega2, -1);

				// apply to delta velocities
				Vector3.multiplyStoreAndAdd( bi.auxDeltav, beta, bi.deltavelocity );
				Vector3.multiplyStoreAndAdd( bi.auxDeltaOmega , beta, bi.deltaomega );

				// add gradient from this iteration
				Vector3.add( bi.auxDeltav, bi.auxDeltav2);
				Vector3.add( bi.auxDeltaOmega, bi.auxDeltaOmega2);
			} 

			//iteration count
			iter = iter+1;
//			System.out.println("rnew="+rnew);

		} // while true
		return 0;
	}
	

	public static final double merit(List<NCPConstraint> constraints, List<Body> bodies, boolean onlyfrictions) {
		double value = 0;
		
		//copy to auxiliary
		for ( Body bi: bodies) {
			bi.auxDeltav.assign(bi.deltavelocity);
			bi.auxDeltaOmega.assign(bi.deltaomega);
		}
		//copy lambda value
		for (NCPConstraint ci: constraints) {
			ci.s = ci.lambda;
		}
		
		//use one PGS iteration to compute new residual 
		for (NCPConstraint ci: constraints) {
			//calculate (Ax+b)_i 
			double w =  ci.j1.dot(ci.body1.auxDeltav) 
			+ ci.j2.dot(ci.body1.auxDeltaOmega)
			+ ci.j3.dot(ci.body2.auxDeltav) 
			+ ci.j4.dot(ci.body2.auxDeltaOmega) + ci.s*ci.damper;

			double deltaLambda = (-ci.b-w)/(ci.diagonal + ci.damper );
			double lambda0 = ci.s;

			//Clamp the lambda[i] value to the constraints
			if (ci.coupling != null) {
				//if the constraint is coupled, allow only lambda <= coupled lambda
				ci.l = -Math.abs(ci.coupling.s)*ci.coupling.mu;
				ci.u =  Math.abs(ci.coupling.s)*ci.coupling.mu;
			} else {
				ci.l = ci.lower;
				ci.u = ci.upper;
			}

			//do projection
			double newlambda =
				Math.max(ci.l, Math.min(lambda0 + deltaLambda,ci.u ));

			//update the V vector
			deltaLambda = newlambda - lambda0;
			
			//ci.residual = deltaLambda;
			Vector3.add( ci.body1.auxDeltav,     ci.b1.multiply(deltaLambda) );
			Vector3.add( ci.body1.auxDeltaOmega, ci.b2.multiply(deltaLambda) );
			Vector3.add( ci.body2.auxDeltav,     ci.b3.multiply(deltaLambda));
			Vector3.add( ci.body2.auxDeltaOmega, ci.b4.multiply(deltaLambda));

			ci.s += deltaLambda;
			
			//value += Math.pow(w+ci.b,2);
			
//			if (onlyfrictions) {
//				if (ci.coupling!=null) {
//					value += deltaLambda*deltaLambda;
//				}
//			} else {
//				value += deltaLambda*deltaLambda;
//			}
			
//			value += Math.pow(w+ci.b,2);
			value += deltaLambda*deltaLambda;
			
		} //for constraints	
		
		//value = FischerNewton.fischerMerit(constraints, bodies);
		
		return value;
	}
	
}
