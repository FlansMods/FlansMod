/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.physics.solver;
import java.util.*;
import jinngine.math.Vector3;
import jinngine.physics.Body;

/**
 * Implementation of the PGS solver. 
 */
public class ProjectedGaussSeidel implements Solver {
	private int maximumIterations = 35;
	private double deltaResidual = 0;	
		
	public ProjectedGaussSeidel() {}
	
	public ProjectedGaussSeidel(int n) {
		maximumIterations = n;
	}
	
	@Override
	public void setMaximumIterations(int n) {
		//this.maximumIterations = n;
	}

	@Override
	//solve NCP problem
	public final double solve(List<NCPConstraint> constraints, List<Body> bodies, double epsilon) {
		double iterations = 0;
		
		// compute external force contribution, clear direction and residual
		for (NCPConstraint ci: constraints) {
			ci.Fext = ci.j1.dot(ci.body1.externaldeltavelocity)
			+ ci.j2.dot(ci.body1.externaldeltaomega)
			+ ci.j3.dot(ci.body2.externaldeltavelocity) 
			+ ci.j4.dot(ci.body2.externaldeltaomega); 			
		}
		
		//perform iterations
		for (int m=0; m<maximumIterations; m++) {
			deltaResidual = 0;
			for (NCPConstraint ci: constraints) {				
				//calculate (Ax+b)_i 
				final double w =  ci.j1.dot(ci.body1.deltavelocity) 
			   	+ ci.j2.dot(ci.body1.deltaomega)
				+ ci.j3.dot(ci.body2.deltavelocity) 
				+ ci.j4.dot(ci.body2.deltaomega) + ci.lambda*ci.damper + ci.Fext;

//				final double w = 
//				  ci.j1.x*(ci.body1.deltavelocity.x+ci.body1.externaldeltavelocity.x) 
//				+ ci.j1.y*(ci.body1.deltavelocity.y+ci.body1.externaldeltavelocity.y)
//				+ ci.j1.z*(ci.body1.deltavelocity.z+ci.body1.externaldeltavelocity.z)
//				+ ci.j2.x*(ci.body1.deltaomega.x+ci.body1.externaldeltaomega.x) 
//				+ ci.j2.y*(ci.body1.deltaomega.y+ci.body1.externaldeltaomega.y)
//				+ ci.j2.z*(ci.body1.deltaomega.z+ci.body1.externaldeltaomega.z)
//				+ ci.j3.x*(ci.body2.deltavelocity.x+ci.body2.externaldeltavelocity.x) 
//				+ ci.j3.y*(ci.body2.deltavelocity.y+ci.body2.externaldeltavelocity.y)
//				+ ci.j3.z*(ci.body2.deltavelocity.z+ci.body2.externaldeltavelocity.z)
//				+ ci.j4.x*(ci.body2.deltaomega.x+ci.body2.externaldeltaomega.x) 
//				+ ci.j4.y*(ci.body2.deltaomega.y+ci.body2.externaldeltaomega.y)
//				+ ci.j4.z*(ci.body2.deltaomega.z+ci.body2.externaldeltaomega.z) + ci.lambda*ci.damper;

				double deltaLambda = (-ci.b-w)/(ci.diagonal + ci.damper );
				final double lambda0 = ci.lambda;

				//Clamp the lambda[i] value to the constraints
				if (ci.coupling != null) {
					
					//growing bounds
//					double lower = -Math.abs(ci.coupling.lambda)*ci.coupling.mu;					
//					ci.lower = lower<ci.lower?lower:ci.lower;					
//					double upper = Math.abs(ci.coupling.lambda)*ci.coupling.mu;
//					ci.upper =  upper>ci.upper?upper:ci.upper;

					//if the constraint is coupled, allow only lambda <= coupled lambda
					ci.lower = -Math.abs(ci.coupling.lambda)*ci.coupling.mu;
					ci.upper =  Math.abs(ci.coupling.lambda)*ci.coupling.mu;
										
				} 

				//do projection
				ci.lambda =
					Math.max(ci.lower, Math.min(lambda0 + deltaLambda,ci.upper ));

				// no projection
				//ci.lambda = lambda0 + deltaLambda;
							
				//update the V vector
				deltaLambda = ci.lambda - lambda0;
				
				//update residual of change
				deltaResidual += deltaLambda*deltaLambda;

				//Apply to delta velocities
				Vector3.add( ci.body1.deltavelocity,     ci.b1.multiply(deltaLambda) );
				Vector3.add( ci.body1.deltaomega, ci.b2.multiply(deltaLambda) );
				Vector3.add( ci.body2.deltavelocity,     ci.b3.multiply(deltaLambda));
				Vector3.add( ci.body2.deltaomega, ci.b4.multiply(deltaLambda));
				
			} //for constraints	
			
			if (deltaResidual < epsilon)
				break;
			
			iterations +=1;
		}
		return iterations ;
	}
}
