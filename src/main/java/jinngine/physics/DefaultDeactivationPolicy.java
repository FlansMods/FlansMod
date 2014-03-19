/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.physics;

import jinngine.math.Vector3;

/**
 * Default implementation of a de-activation policy. The policy uses a simple threshold on the kinetic 
 * energy to reason about the activity of a body. 
 */
public class DefaultDeactivationPolicy implements DeactivationPolicy {
	@Override
	public boolean shouldBeDeactivated(Body b) {
		double accel = b.deltavelocity.add(b.externaldeltavelocity).squaredNorm();
		accel += b.deltaomega.add(b.externaldeltaomega).squaredNorm();		
//		double accel = b.deltavelocity.dot(b.deltavelocity) + b.deltaomega.dot(b.deltaomega);
		return b.totalKinetic()/b.state.mass + accel < 1e-3;
//		return false;
	}
	
	@Override
	public boolean shouldBeActivated(Body b) {
		//double accel = b.deltavelocity.dot(b.deltavelocity) + b.deltaomega.dot(b.deltaomega);
		
//		Vector3 forcedeviation = b.state.force.minus(b.deactivatedexternalforce);
//		Vector3 torquedeviation = b.state.torque.minus(b.deactivatedexternaltorque);

		double accel = b.deltavelocity.add(b.externaldeltavelocity).squaredNorm();
		accel += b.deltaomega.add(b.externaldeltaomega).squaredNorm();		

		
		return accel > 1e-1;
	} 
	
	@Override
	public void activate(Body b) {
		b.deactivated = false;
	}
	
	@Override
	public void deactivate(Body b) {
		// store information about external forces
		b.deactivated = true;
//		b.deactivatedexternalforce.assign(b.state.force);
//		b.deactivatedexternaltorque.assign(b.state.torque);
		
		// remove velocity from body
		b.state.velocity.assign(Vector3.zero);
		b.state.omega.assign(Vector3.zero);
		
	}

}
