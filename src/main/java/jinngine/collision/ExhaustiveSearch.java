/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.collision;

import java.util.*;

import jinngine.geometry.BoundingBox;
import jinngine.geometry.Geometry;
import jinngine.math.Vector3;
import jinngine.util.Pair;

/**
 * A naive broad-phase collision detection algorithm. ExhaustiveSearch obviously just performs an
 * overlap test on each possible pair in the considered configuration. Despite its O(n^2) complexity, 
 * the method sometimes out-performs more advanced implementations on configurations with few objects.
 * In addition, all pairs test is often useful for test purposes.
 */
public class ExhaustiveSearch implements BroadphaseCollisionDetection {
	
	private final Set<Pair<Geometry>> existingPairs = new LinkedHashSet<Pair<Geometry>>();
	private final Set<Pair<Geometry>> leavingPairs = new LinkedHashSet<Pair<Geometry>>();
	private final List<Geometry> geometries = new ArrayList<Geometry>();
	private final List<BroadphaseCollisionDetection.Handler> handlers = new ArrayList<Handler>();

	public ExhaustiveSearch() {}
	
	public ExhaustiveSearch(BroadphaseCollisionDetection.Handler handler) {
		this.handlers.add(handler);
	}

	public void run() {
		leavingPairs.addAll(existingPairs);

//		O(N^2) broad-phase collision detection
		int size = geometries.size();
		for ( int i=0; i<size; i++) {
			Geometry c1 = geometries.get(i);
			for (int j=i+1; j<size; j++ ) {
				Geometry c2 = geometries.get(j);
				if (c1 != c2 ) {
					if ( overlap(c1,c2)  ) {
						Pair<Geometry> pair = new Pair<Geometry>(c1,c2);
						
						//if we discover a new pair, report it and add to table
						if ( !existingPairs.contains(pair)) {
							existingPairs.add( pair );
							
							//notify handlers
							for ( Handler handler: handlers)
								handler.overlap(pair);
						}
						
						//any pair we observe is not leaving
						leavingPairs.remove(pair);
					}
				}
			}
		}
		
		//handle disappearing pairs
		Iterator<Pair<Geometry>> leaving = leavingPairs.iterator();
		while (leaving.hasNext()) {
			Pair<Geometry> pair = leaving.next();
			
			for ( Handler handler: handlers)
				handler.separation(pair);

			existingPairs.remove(pair);
		}
		
		leavingPairs.clear();
	}
	
	private static final boolean overlap( BoundingBox i , BoundingBox j) {

		Vector3 bi = i.getMinBounds();
		Vector3 ei = i.getMaxBounds();
		Vector3 bj = j.getMinBounds();
		Vector3 ej = j.getMaxBounds();
		
		double bix = bi.x;
		double biy = bi.y;
		double biz = bi.z;
		double eix = ei.x;
		double eiy = ei.y;
		double eiz = ei.z;
		double bjx = bj.x;
		double bjy = bj.y;
		double bjz = bj.z;
		double ejx = ej.x;
		double ejy = ej.y;
		double ejz = ej.z;

		//TODO test this 
		if( (((bjx < bix) && (bix <= ejx)) || ((bix <= bjx) && (bjx < eix ))) &&
				(((bjy < biy) && (biy <= ejy)) || ((biy <= bjy) && (bjy < eiy ))) &&
				(((bjz < biz) && (biz <= ejz)) || ((biz <= bjz) && (bjz < eiz )))) {
			
//			if (i instanceof Sphere && j instanceof Sphere) {
//				if ( ((Sphere)i).getBody() != ((Sphere)j).getBody() )
//					System.out.println("sphere-sphere overlap");
//			}
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void add(Geometry a) {
		geometries.add(a);
	}

	@Override
	public void remove(Geometry a) {
		geometries.remove(a);
	}

	@Override
	public void addHandler(Handler h) {
		handlers.add(h);		
	}

	@Override
	public void removeHandler(Handler h) {
		handlers.remove(h);
	}

	@Override
	public Set<Pair<Geometry>> getOverlappingPairs() {
		return new LinkedHashSet<Pair<Geometry>>(existingPairs);
	}
	
	

}
