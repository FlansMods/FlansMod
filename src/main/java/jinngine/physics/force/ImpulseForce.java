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
 *  A force that acts only a single time on an object. After the impulse force has been applied, the 
 *  magnitude is set to zero. The magnitude can then be set again using the method setMagnitude(). For instance,
 *  this type of force can be used to produce explosion like effects.
 */
public final class ImpulseForce implements Force {

	private final Body body;
	private final Vector3 point = new Vector3();
	private final Vector3 direction = new Vector3();
	private double magnitude;
	
	public ImpulseForce( Body body, Vector3 point, Vector3 direction, double magnitude) {
		this.body = body;
		this.point.assign(point);
		this.direction.assign(direction.normalize());
		this.magnitude = magnitude;
	}
	
	public final void setDirection( Vector3 direction ) {
		this.direction.assign(direction);
	}
	
	public final void setPoint( Vector3 point) {
		this.point.assign(point);
	}
	
	public final void setMagnitude(double magnitude) {
		this.magnitude = magnitude;
	}
	
	@Override
	public final void apply(double dt) {
		body.applyForce(point, direction.multiply(magnitude/dt), dt);
		this.magnitude = 0.0;
	}

}
