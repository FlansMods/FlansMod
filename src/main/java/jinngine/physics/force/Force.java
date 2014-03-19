/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.physics.force;

/**
 * Interface for modelling an external force. External forces are not
 * controlled by the solver, but are fixed in relation to for instance 
 * contact forces
 */
public interface Force {
	public void apply(double dt);
}
