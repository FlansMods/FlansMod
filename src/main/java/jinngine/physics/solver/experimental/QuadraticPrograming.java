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
import jinngine.physics.Body;
import jinngine.physics.solver.*;

public class QuadraticPrograming implements Solver {

	private final List<NCPConstraint> normals = new ArrayList<NCPConstraint>();
	private final Solver cg = new ConjugateGradients();
	
	@Override
	public void setMaximumIterations(int n) {
		// TODO Auto-generated method stub

	}

	@Override
	public double solve(List<NCPConstraint> constraints, List<Body> bodies, double epsilon) {
	   	normals.clear();
    	for (NCPConstraint ci: constraints) 
    		if (ci.coupling == null) {
    			normals.add(ci);
    			ci.b = ci.b;
    		}

	
    	cg.solve(normals, bodies, 0.0);	
    	return 0;
	}
}
