/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.physics.force;

import jinngine.math.Vector3;
import jinngine.physics.Body;

/**
 * A gravity force is a force acting upon the centre of mass of a body, and is proportional to the total mass 
 * of the body. The force is pointing in the negative y direction, unless another direction is specified.
 */
public final class GravityForce implements Force {
	private final Body a;
	private final Vector3 d = new Vector3();

	/**
	 * Create a gravity force, accelerating the body 9.8m/s^2. The direction of the force is along the
	 * negative y-axis.
	 * @param a Body on which to act
	 */
	public GravityForce(Body a) {
		this.a = a;
		//this.factor = factor;
		this.d.assign(new Vector3(0,-1,0));
	}

	/**
	 * Create a gravity force, accelerating the body 9.8m/s^2 in the direction d
	 * @param a Body on which to act
	 * @param d Direction of gravity force.
	 */
	public GravityForce(Body a, Vector3 d)  {
		this.a = a;
		//this.factor = factor;
		this.d.assign(d);
	}

	@Override
	public final void apply(double dt) {
		a.applyForce(Vector3.zero, d.multiply(9.8*a.state.mass), dt );		
	}
}
