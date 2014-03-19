/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.physics.constraint.contact;

import jinngine.physics.Body;
import jinngine.physics.Scene;
import jinngine.util.Pair;


public interface ContactConstraintManager {
	
	public interface Handler {
		public void contactConstraintCreated( Pair<Body> bodies, ContactConstraint contact );
		public void contactConstraintRemoved( Pair<Body> bodies, ContactConstraint constac );
	}
	
	public void setup( Scene scene );
	public void cleanup( Scene scene );

	public void addHandler( Handler handler);
	public void removeHandler( Handler handler);	
}
