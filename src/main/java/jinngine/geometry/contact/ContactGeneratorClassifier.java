/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.geometry.contact;

import jinngine.geometry.*;
import jinngine.geometry.contact.ContactGenerator;
import jinngine.physics.constraint.contact.ContactConstraint;

/**
 * A {@link ContactGeneratorClassifier} is used by the model to map between pairs of interfering geometries, 
 * and suited {@link ContactGenerator} instances, used by the {@link ContactConstraint}.  
 * @author mo
 *
 */
public interface ContactGeneratorClassifier {
	/**
	 * If the {@link ContactGenerator} created by this {@link ContactGeneratorClassifier} handles the 
	 * geometries given, return a new instantiation of such a {@link ContactGenerator}. If not, return null 
	 * @param a any sub-type of Geometry
	 * @param b any sub-type of Geometry
	 * @return a new {@link ContactGenerator} suited to handle given geometries
	 */
	public ContactGenerator getGenerator( Geometry a, Geometry b);
	
}
