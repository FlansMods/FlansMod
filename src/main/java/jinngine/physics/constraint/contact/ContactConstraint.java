/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.physics.constraint.contact;


import java.util.Iterator;

import jinngine.physics.constraint.*;
import jinngine.geometry.contact.*;

/**
 * A constraint the models contact region forces, acting between two bodies. A ContactConstraint acts 
 * like any other constraint/joint, for instance {@link BallInSocketJoint}. ContactConstraint uses one ore more
 * {@link ContactGenerator} instances to supply contact points and contact normals of the involved geometries. 
 * When two bodies are subject to a contact constraint, a ContactGenerator for each interacting geometry pair is required. 
 * Determining and instantiating these ContactGenerators should be handled by the simulator itself, however, one can create new 
 * and possibly optimised ContactGenerators for certain geometry pairs. A trivial example would be a ContactGenerator
 * for the Sphere-Sphere case, which is already implemented in Jinngine, see ({@link SphereContactGenerator}).
 */
public interface ContactConstraint extends Constraint {	

	/**
	 * Add a new ContactGenerator for generating contact points and normal vectors. This method is 
	 * usually called by {@link ContactConstraintManager} which takes care of dispatching different
	 * contact generators for different geometry interactions. The end-user should not normally be 
	 * required to call this method.
	 * @param g a new ContactGenerator
	 */
	public void addGenerator(ContactGenerator g);
	
	/**
	 * Remove a contact generator. See {@link addGenerator}.
	 * @param g Previously added contact generator to be removed from this contact constraint
	 */
	public void removeGenerator(ContactGenerator g);
	
	/**
	 * Get all contact generators in this contact constraints. This method can be used to get information
	 * about the pairs of interacting pairs of {@link Geometry} in this contact. 
	 */
	public Iterator<ContactGenerator> getGenerators();
	
	/**
	 * Return the number of contact point generators
	 */
	public double getNumberOfGenerators();	
		
}
