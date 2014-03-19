/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.util;

/** 
 * Small pair class, for the purpose of indexing unordered pairs in a hash table
 */
public class Pair<T>  {
  private final T o1;
  private final T o2;
  public int color;

  public Pair(T o1, T o2) {
	  this.o1 = o1;
	  this.o2 = o2;
  }
    
  //since this is an unordered pair, we use
  //the same hash code for interchanced objects
  public int hashCode() {
	  //TODO this is not all correct. Different code pairs may have same product!
    return o1.hashCode()*o2.hashCode();
  }

//  public boolean equals( Pair<T> other ) {
//	    if (this == other) return true;
//	    Pair<T> p = (Pair<T>)other;
//	    return (this.o1 == p.o1 && this.o2 == p.o2) || (this.o1 == p.o2 && this.o2 == p.o1 );
//  }
  
  public boolean equals( Object other ) {
	    if (this == other) return true;
	    if (other == null ) return false;
	    return this.hashCode() == other.hashCode();
  }
  
  public T getFirst()  { return o1;}
  public T getSecond() { return o2;}
  
  public boolean contains(T o) {
    return (o==o1||o==o2);
  }

  public int compareTo( Pair<T> other ) {
    return hashCode() < other.hashCode() ? -1:1;
  }
  
  //   public boolean equals( Pair<T> other ) {
  //     if (this == other) return true;
  //     return (this.o1 == other.o1 && this.o2 == other.o2) || (this.o1 == other.o2 && this.o2 == other.o1 );
  //   }
}
