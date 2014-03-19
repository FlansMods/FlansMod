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

/**
 * Preconditioned Conjugate Gradients solver. Solves the given list of constraints, 
 * as if they described a plain symmetric linear system of equations, not a NCP problem. 
 * Phased in another way, CG can solve the NCP, if l=-infinity and u=infinity for all constraints.
 */
public class ConjugateGradients implements Solver {
	int maxIterations = 0;

	@Override
	public void setMaximumIterations(int n) {
		maxIterations = n;
	}

	@Override
	public double solve(List<NCPConstraint> constraints, List<Body> bodies, double epsilon) {
		maxIterations = constraints.size();
		//System.out.println("*) CG "+ n+"x" + n+" system");
		
		//Conjugate Gradients
		double delta_new=0, delta_old=0, delta_zero=0;
		double delta_low=Double.POSITIVE_INFINITY;
		double delta_best=delta_low;
		//double epsilon = 1e-6;
		double division_epsilon = 1e-12;
		int iterations=0;
		
		//reset auxiliary deltas
		for (Body b: bodies) {
			b.auxDeltav.assignZero();
			b.auxDeltaOmega.assignZero();
		}
		
		//We solve Ax+b = 0 => r = -b-Ax
		//r  = b-Ax
		//d  = M^(-1)r
		//delta_new = rTr
		for (NCPConstraint ci: constraints) {
			ci.residual = 
				-ci.b - ci.j1.dot(ci.body1.deltavelocity.add(ci.body1.externaldeltavelocity)) - ci.j2.dot(ci.body1.deltaomega.add(ci.body1.externaldeltaomega))
						- ci.j3.dot(ci.body2.deltavelocity.add(ci.body2.externaldeltavelocity)) - ci.j4.dot(ci.body2.deltaomega.add(ci.body2.externaldeltaomega))
						- ci.lambda*ci.damper;
							
			//d = M^-1 r
			ci.d = ci.residual / (ci.diagonal+ci.damper);
			
			//TODO remove
			if (Math.abs(ci.diagonal)<1e-13) {
				System.exit(0);
			}

			//reflect d in the delta velocities
			Vector3.add( ci.body1.auxDeltav,     ci.b1.multiply(ci.d));
			Vector3.add( ci.body1.auxDeltaOmega, ci.b2.multiply(ci.d));
			Vector3.add( ci.body2.auxDeltav,     ci.b3.multiply(ci.d));
			Vector3.add( ci.body2.auxDeltaOmega, ci.b4.multiply(ci.d));

			
			delta_new += ci.residual * ci.d;
			//System.out.println("initial residuals "+ci.residual + " b=" + ci.b);

		} 		
		
				
		delta_old = delta_new;
		delta_zero = delta_new;
		delta_best = delta_new;
		
		//System.out.println(""+FischerNewtonConjugateGradients.fischerMerit(errormeassure, bodies));
		
		//CG iterations
		while (iterations < maxIterations &&  delta_new>epsilon*epsilon*delta_zero && delta_new > epsilon ) {			
			//System.out.println("cg iterate");
			//q = Ad
			//alpha = delta_new/dTq
			double dTq = 0;
			for (NCPConstraint ci: constraints) {
				ci.q = ci.j1.dot(ci.body1.auxDeltav) + ci.j2.dot(ci.body1.auxDeltaOmega)
				+ ci.j3.dot(ci.body2.auxDeltav) + ci.j4.dot(ci.body2.auxDeltaOmega)
				+ ci.d * ci.damper;
				
				dTq += ci.d*ci.q;
			} 			

			if (Math.abs(dTq)<division_epsilon) {
				//System.out.println("at solution, delta_new " + delta_new );
				if (iterations==0){
					delta_best = Double.POSITIVE_INFINITY;
				}
				break;
			}
			
			double alpha = delta_new/dTq;
			delta_old = delta_new;
			delta_new = 0;

			for (NCPConstraint ci: constraints) {
				//x = x + alpha d
				ci.dlambda += alpha*ci.d;

				//r = r-alpha q
				ci.residual -= alpha*ci.q;
				
				//s = M^(-1) r
				ci.s = ci.residual / (ci.diagonal+ci.damper);
								
				//delta_new = rTs
				delta_new += ci.residual*ci.s;
			}
			
			//keep track of best solution
			boolean best_updated = false;
			if (delta_new < delta_best) {
				delta_best = delta_new;
				best_updated = true;
			}

			if (Math.abs(delta_old)<division_epsilon) {
				//System.out.println("old delta too low");
				break;
			}
			
//			if (delta_new > delta_old && iterations > 25) {
//				System.out.println("rising error");
//				break;
//			}
			
			if (delta_new > 100*delta_zero) {
				//System.out.println("error larger then start");
				break;
			}
			
			double beta = delta_new/delta_old;

			//d = s + beta d
			for (Body b: bodies) { // d = beta d
				Vector3.multiply( b.auxDeltav,     beta);
				Vector3.multiply( b.auxDeltaOmega, beta);				
			}			
			for (NCPConstraint ci: constraints) { 
				// d = d + r
				//ci.d = ci.residual + beta* ci.d;
				ci.d = ci.s + beta* ci.d;

				//reflect d in the delta velocities
				Vector3.add( ci.body1.auxDeltav,     ci.b1.multiply(ci.s));
				Vector3.add( ci.body1.auxDeltaOmega, ci.b2.multiply(ci.s));
				Vector3.add( ci.body2.auxDeltav,     ci.b3.multiply(ci.s));
				Vector3.add( ci.body2.auxDeltaOmega, ci.b4.multiply(ci.s));
				
				//if best updated, set the best vector
				if (best_updated)
					ci.bestdlambda = ci.dlambda;
			}	
			
			iterations += 1;

			//System.out.println(""+FischerNewtonConjugateGradients.fischerMerit(errormeassure, bodies));
			//System.out.println("iteration " + iterations +", delta_new=" + delta_new +", alpha=" +alpha +", beta=" + beta);

		} //CG iterations


		//if solution was accepted
		//if (delta_best < epsilon) {

			//apply the lambda values to the final velocities
			for (NCPConstraint ci: constraints) {
				ci.lambda += ci.bestdlambda;

				//reflect in delta velocities
				Vector3.add( ci.body1.deltavelocity,     ci.b1.multiply(ci.bestdlambda));
				Vector3.add( ci.body1.deltaomega, ci.b2.multiply(ci.bestdlambda));
				Vector3.add( ci.body2.deltavelocity,     ci.b3.multiply(ci.bestdlambda));
				Vector3.add( ci.body2.deltaomega, ci.b4.multiply(ci.bestdlambda));

				//reset
				ci.dlambda = 0;
				ci.bestdlambda = 0;
			}
		//}

		//if (delta_best>1 && delta_best < 100000)
			//System.out.println("iterations: " + iterations +" best is "+ delta_best);
		
		
			//System.out.println("delta_best="+delta_best+ "iterations "+iterations);
		
		return (iterations+1);
	}

}
