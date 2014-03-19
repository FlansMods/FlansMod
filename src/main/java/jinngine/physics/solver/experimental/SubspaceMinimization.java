/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.physics.solver.experimental;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import jinngine.physics.Body;
import jinngine.physics.solver.*;


/**
 * The PGS-Subspace Minimisation method. Method is based on using PGS to guess f
 * which variables is in the active set. Having that, it remains to solve a 
 * linear system of equations, which is done using Conjugate Gradients. 
 */
public class SubspaceMinimization implements Solver {
	//private final Solver newton = new FischerNewtonConjugateGradients();
	private final Solver cg  = new ConjugateGradients();
	private final Solver projection = new Projection();
	//private final Solver cg  = new FischerNewtonConjugateGradients();	
	private final List<NCPConstraint> inactive = new ArrayList<NCPConstraint>();
	private final List<NCPConstraint> normals = new ArrayList<NCPConstraint>();
	private final double epsilon = 1e-6;
	private  int pgsmin = 25;
	private final ProjectedGaussSeidel pgs = new ProjectedGaussSeidel();
	private double phi;
	private final boolean debug;
	private final PrintStream stream;
	
	public SubspaceMinimization(boolean debug, PrintStream stream) {
		this.debug=debug;
		this.stream = stream;
	}
	
	@Override
	public void setMaximumIterations(int n) {
		// TODO Auto-generated method stub

	}

	@Override
	public double solve(List<NCPConstraint> constraints, List<Body> bodies, double epsilon) {
		//solvePlain(constraints,bodies);
		//solveNormal(constraints,bodies);
		//solveStaggered(constraints, bodies);
		solveMLCP(constraints, bodies);
		return 0;
	}
	
	private double solveMLCP(List<NCPConstraint> constraints, List<Body> bodies) {
	   	normals.clear();
    	for (NCPConstraint ci: constraints) 
    		if (ci.coupling == null)
    			normals.add(ci);
    	
    	//debug=false;
    	//solveInternal(normals, bodies,false);
 	//pgs.solve( normals, bodies );
		
//		//compute bounds
		for (NCPConstraint ci: constraints) {
			if (ci.coupling != null) {
				//if the constraint is coupled, allow only lambda <= coupled lambda
				ci.lower = -Math.abs(ci.coupling.lambda)*ci.coupling.mu;
				ci.upper =  Math.abs(ci.coupling.lambda)*ci.coupling.mu;
			} 
		}
		
		solveInternal(constraints,bodies,true);

		return 0;
	}
	
	public double solveInternal(List<NCPConstraint> constraints, List<Body> bodies, boolean bounds) {
		int productcount =0;
		//set damping
		for (NCPConstraint ci: constraints) {
			//System.out.println(ci.lower+"-"+ci.upper);

			if (ci.coupling != null) 
				ci.damper = 0.0;
			else
				ci.damper = 0.0;
		}
		

 
    	
    	//newton.solve(normals,bodies);

		if (debug)
    		stream.println(productcount+"  "+FischerNewton.fischerMerit(constraints, bodies));

    	
		phi = FischerNewton.fischerMerit(constraints, bodies);
		//System.out.println(""+phi);

		//set damping
		for (NCPConstraint ci: constraints) {
			//System.out.println(ci.lower+"-"+ci.upper);

			if (ci.coupling != null) 
				ci.damper = 0.0;
			else
				ci.damper = 0.0*phi;
		}
    	
    	//main iterations
		int i=-1;
		while (true) {
			i++;			
			//run PGS 
			//if (i==0) {
			//Collections.shuffle(constraints);
			pgsmin=15;
			pgs.setMaximumIterations(pgsmin);
			productcount += pgs.solve(constraints,bodies, 0.0);
			
			//find inactive set
			inactive.clear();
			for (NCPConstraint ci: constraints) {
				
				if ((ci.lower < ci.lambda && ci.lambda < ci.upper) ) { 
					inactive.add(ci);
				} 

				//update friction bounds
				if (ci.coupling != null && bounds) {
//					ci.lower = -Math.abs(ci.coupling.lambda)*ci.coupling.mu;
//					ci.upper =  Math.abs(ci.coupling.lambda)*ci.coupling.mu;

					//if the constraint is coupled, allow only lambda <= coupled lambda
					 double lower = -Math.abs(ci.coupling.lambda)*ci.coupling.mu;					
					ci.lower = lower<ci.lower?lower:ci.lower;					
					double upper = Math.abs(ci.coupling.lambda)*ci.coupling.mu;
					ci.upper =  upper>ci.upper?upper:ci.upper;
					
					//if (ci.body1.isFixed() || ci.body2.isFixed())
						//ci.damper = 0.001;

				} 
				
				
				
			}
						
			
			//for active friction constraints, send them to their limits (in the hope that they will stay active)
//			for (constraint ci: active) {
//				if (ci.coupling !=null) {
//					double w =  ci.j1.dot(ci.body1.deltaVCm) 
//					+ ci.j2.dot(ci.body1.deltaOmegaCm)
//					+  ci.j3.dot(ci.body2.deltaVCm) 
//					+ ci.j4.dot(ci.body2.deltaOmegaCm) + (-ci.b) + ci.lambda*ci.damper;
//				
//					double lambda0 = ci.lambda;
//					
//					if (w>0) ci.lambda = ci.lower;
//					if (w<0) ci.lambda = ci.upper;
//					
//					double delta = ci.lambda -lambda0;
//					
//					Vector3.add( ci.body1.deltaVCm,     ci.b1.multiply(delta) );
//					Vector3.add( ci.body1.deltaOmegaCm, ci.b2.multiply(delta) );
//					Vector3.add( ci.body2.deltaVCm,     ci.b3.multiply(delta) );
//					Vector3.add( ci.body2.deltaOmegaCm, ci.b4.multiply(delta) );
//
//				}		
//			}
			
			//Subspace minimisation
			int k= 0;
			while (true) {
				k++;
				//System.out.println("sm stage: " + inactive.size() + " constraints out of " +constraints.size() );
//				double residual = 0;
//				for (constraint ci: inactive) {
//					double w =  ci.j1.dot(ci.body1.deltaVCm) 
//					+ ci.j2.dot(ci.body1.deltaOmegaCm)
//					+  ci.j3.dot(ci.body2.deltaVCm) 
//					+ ci.j4.dot(ci.body2.deltaOmegaCm) + (-ci.b) + ci.lambda*ci.damper;
//					
//					residual +=w*w;
//				}

				
			//	System.out.println("GS residual " + residual);
				//System.out.println(""+(1.0/(i*i*i*i+1)));
				//if (phi < 1e-2) {
				//Collections.shuffle(inactive);
				double cgiter = cg.solve( inactive, bodies, 1e-15);// (phi*phi)>0.01?0.01:(phi*phi) );
				
				productcount += cgiter*((double)inactive.size()/(double)constraints.size()); //scale in PGS iterations 
				
				//use Jama to compute pseudoinverse
//				int n = inactive.size();
//				if(n>0 && true) {
//					double[][] am = new double[n][n];
//					FischerNewtonConjugateGradients.fillInA(inactive, am);
//					Matrix A = new Matrix(am);
//					SingularValueDecomposition svd = new SingularValueDecomposition(A);
//					Matrix sigma = svd.getS();
//					double[][] sigma_m =sigma.getArray();
//
//					//Reciprocal inverse
//					for (int x=0;x<n;x++)
//						if(Math.abs(sigma_m[x][x])>1e-7) 
//							sigma_m[x][x] = 1.0/sigma_m[x][x];
//						else
//							sigma_m[x][x] = 0;
//
//					
//					//compute b vector
//					List<constraint> outs = new ArrayList<constraint>();
//					outs.addAll(constraints);
//					outs.removeAll(inactive);
//					//System.out.println("outs="+outs.size());
//					
//					Matrix Afull = new Matrix(inactive.size(),outs.size());
//					FischerNewtonConjugateGradients.fillInA(inactive, outs, Afull.getArray());
//					Matrix lambdaFull = new Matrix(1,outs.size());
//					Matrix Bfull = new Matrix(1,inactive.size());
//					FischerNewtonConjugateGradients.fillInb(inactive, Bfull.getArray()[0]);
//					FischerNewtonConjugateGradients.fillInLambda(outs, lambdaFull.getArray()[0]);
//					Matrix Breduced = Afull.times(lambdaFull.transpose()).plus(Bfull.transpose().times(-1));
//
//
//					//M.print(1,1);
//
//					//get solution using pseudo inverse
//					Matrix solution = svd.getV().times(sigma).times(svd.getU().transpose().times(Breduced.times(-1)));
//
//					//solution.print(1,1);
//
//
//					int m=0;
//					for (constraint ci: inactive) {
//						double deltaLambda = solution.transpose().getArray()[0][m] - ci.lambda;
//
//						ci.lambda = solution.transpose().getArray()[0][m];
//						//reflect in delta velocities
//						Vector3.add( ci.body1.deltaVCm,     ci.b1.multiply(deltaLambda));
//						Vector3.add( ci.body1.deltaOmegaCm, ci.b2.multiply(deltaLambda));
//						Vector3.add( ci.body2.deltaVCm,     ci.b3.multiply(deltaLambda));
//						Vector3.add( ci.body2.deltaOmegaCm, ci.b4.multiply(deltaLambda));						
//						m++;
//					}
//				}
//				
//				for (constraint ci:inactive)
//					System.out.println(""+ci.lambda);
				
				if (bounds)
					for (NCPConstraint ci: inactive) {
						if (ci.coupling != null) {
							//if the constraint is coupled, allow only lambda <= coupled lambda
//							ci.lower = -Math.abs(ci.coupling.lambda)*ci.coupling.mu;
//							ci.upper =  Math.abs(ci.coupling.lambda)*ci.coupling.mu;
							 double lower = -Math.abs(ci.coupling.lambda)*ci.coupling.mu;					
								ci.lower = lower<ci.lower?lower:ci.lower;					
								double upper = Math.abs(ci.coupling.lambda)*ci.coupling.mu;
								ci.upper =  upper>ci.upper?upper:ci.upper;

						} 
					}

				double p = projection.solve(inactive,bodies, 0.0);

				if (debug)
					stream.println(productcount+"  "+FischerNewton.fischerMerit(constraints, bodies)+";");

				
				if (p == 0 ) {
					if (k==1) {
						//System.out.println("first SM iteration had no change");
						//done = true;
					}
					//System.out.println("sm stage done");
					break;
				}
				
				//remove active constraints
				ListIterator<NCPConstraint> j = inactive.listIterator();
				while(j.hasNext()) {
					NCPConstraint ci = j.next();			
					if (ci.lower < ci.lambda && ci.lambda < ci.upper) { 
						//do nothing
					} else {
						j.remove();
					}					
				}
				

				
			} //sub space

			
			phi = FischerNewton.fischerMerit(constraints, bodies);
	//		System.out.println(""+phi);

//			if ( phi/prevphi > 0.8 && phi < 1e-3) {
//				//System.out.println("stagnated");
//				break;
//			}
			
			if (phi<epsilon||i==2 || productcount>1200)
				break;
			
			//if here damp the frictions
			//set damping
			for (NCPConstraint ci: constraints) {
				//System.out.println(ci.lower+"-"+ci.upper);

				if (ci.coupling != null) 
					ci.damper += 1*Math.abs(FischerNewton.fischer(ci));
				
				else
					ci.damper = 0.0;
			}

		}
		
		//if (debug)
			System.out.println("**) pgs-sm iteration "+i+" error="+phi +" pgs equivalent " + productcount);	
    
    
    
    
    
    if (phi>0.1 && false) {
    	for (NCPConstraint ci: constraints) {
    		if (ci.coupling != null)
    			System.out.print("F:");

    		if (inactive.contains(ci))
    			System.out.print("A:");
    		System.out.print(" lambda=" +ci.lambda);
    		
    		System.out.println(" phi="+FischerNewton.fischer(ci));
    	}
    	
    	
    	System.exit(0);
    }

	  
	  
	  
		return 0;
	}
}
