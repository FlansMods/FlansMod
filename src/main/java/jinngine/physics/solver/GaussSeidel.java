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

public class GaussSeidel implements Solver {
	private int maximumIterations = 25;
	
	@Override
	public void setMaximumIterations(int n) {
		this.maximumIterations = n;
	}

	@Override
	//solve linear system of equations 
	public final double solve(List<NCPConstraint> constraints, List<Body> bodies, double epsilon) {
		//perform iterations
		for (int m=0; m<maximumIterations; m++) {
			for (NCPConstraint ci: constraints) {
				//calculate (Ax+b)_i 
				double w =  ci.j1.dot(ci.body1.deltavelocity.add(ci.body1.externaldeltavelocity)) 
			   	+ ci.j2.dot(ci.body1.deltaomega.add(ci.body1.externaldeltaomega))
				+ ci.j3.dot(ci.body2.deltavelocity.add(ci.body2.externaldeltavelocity)) 
				+ ci.j4.dot(ci.body2.deltaomega.add(ci.body2.externaldeltaomega)) + ci.lambda*ci.damper;


				double deltaLambda = (-ci.b - w)/(ci.diagonal + ci.damper );
				double lambda0 = ci.lambda;
				
				//update the V vector
				deltaLambda = ci.lambda - lambda0;
				
				//Apply to delta velocities
				Vector3.add( ci.body1.deltavelocity,     ci.b1.multiply(deltaLambda) );
				Vector3.add( ci.body1.deltaomega, ci.b2.multiply(deltaLambda) );
				Vector3.add( ci.body2.deltavelocity,     ci.b3.multiply(deltaLambda) );
				Vector3.add( ci.body2.deltaomega, ci.b4.multiply(deltaLambda) );
			} //for constraints			
		}
		return 0;
	}
}
