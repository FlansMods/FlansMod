/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.physics.constraint;

import java.util.Iterator;
import java.util.ListIterator;
import jinngine.physics.Body;
import jinngine.physics.solver.Solver.NCPConstraint;
import jinngine.util.Pair;

public interface Constraint {
	
	/**
	 * Insert the ConstraintEntries of this Constraint into the list modelled by iterator
	 * @param iterator
	 * @param dt
	 */
	public void applyConstraints( ListIterator<NCPConstraint> iterator, double dt );

	/**
	 * Get the NCP constraints associated with this Constraint 
	 * @param constraints
	 */
	public Iterator<NCPConstraint> getNcpConstraints(); 
	
	/**
	 * Return the pair of bodies that this constraint is acting upon 
	 */
	public Pair<Body> getBodies();

}
