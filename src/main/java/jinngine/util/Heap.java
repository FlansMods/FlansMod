/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.util;
import java.util.*;

/**
 * Minimum heap implementation. See [Cormen et al 1999] for formal theory. 
 * Maintains all elements in a min-heap, such that the minimum element will
 * be the top-most node in the heap at all times. Among many other uses, heaps are ideal for 
 * representing priority queues. 
 */
public class Heap<T> {
	private int size;
	final private List<Node> heap;
	final private Comparator<T> comparator;

	private class Node {
		public T element;
		public int position;
	}	  

	/**
	 * Create a new heap
	 * @param comparator A comparator that handles elements of type T
	 */
	public Heap( Comparator<T> comparator ) {
		size = 0;
		//Allocate space
		heap = new ArrayList<Node>();

		//Comparator
		this.comparator = comparator;

		//initialy clear
		//for (int i=0;i<maxSize;i++) heap[i] = null;
	}

	/**
	 * Insert element into the heap. O(lg n) where n is the number of elements/nodes in the heap  
	 * @param element new element to be inserted
	 */
	public void insert( final T element ) {
		size++;
		Node node = new Node();
		node.element = element;
		node.position = size-1;
		heap.add(node);
		decreaseKey( node );
		//return node;
	}

	public final void clear() {
		heap.clear();
		size = 0;
	}

	/**
	 * Return a reference to the top-most element on the heap. The method does not change the state
	 * of the heap in any way. O(k).
	 * @return Reference to top-most element of heap
	 */
	public final T top() {
		return heap.get(0).element;
	}

	//bound check missing

	/**
	 * Pop an element of the heap. O(lg n) where n is the number of elements in heap.
	 */
	public T pop() {
		T returnNode = top();
		exchange( 0, size-1 );
		heap.remove(size-1);
		size--;

		//if any elements left in heap, do minHeapify
		if (size>0) {
			minHeapify( heap.get(0) );
		}
		
		return returnNode;
	}

	//  private final void reinsert( final Node n ) {
	//    if ( !decreaseKey(n) ) {
	//      minHeapify(n);
	//    }
	//  }

	public final int size() {
		return size;
	}


	private final boolean decreaseKey( final Node node ) {
		int index = node.position;
		boolean modified = false;

		//    while ( index>0 &&  (heap[parent(index)]).compareTo( heap[index]) >= 0 ) {
		while ( index>0 &&  comparator.compare(heap.get(parent(index)).element, heap.get(index).element ) >= 0 ) {
			exchange( index, parent(index) );
			index = parent(index);
			modified = true;
		}

		return modified;
	}

	private final void minHeapify( final Node node ) {
		int smallest;
		int index = node.position;
		int left = left(index);
		int right = right(index);

		//  if (left<size && (heap[left]).compareTo(heap[index]) <= 0 )
		if (left<size && comparator.compare(heap.get(left).element, heap.get(index).element) <= 0 )
			smallest= left;
		else
			smallest = index;

		//    if (right<size && (heap[right]).compareTo(heap[smallest]) <=0 )
		if (right<size && comparator.compare(heap.get(right).element, heap.get(smallest).element ) <=0 )
			smallest= right;
		if (smallest!= index) {
			exchange( index, smallest );
			minHeapify( heap.get(smallest) );
		}
	}

	private final void exchange( final int index, final int index2 ) {
		Node temp = heap.get(index);
		temp.position = index2;

		Node temp2 = heap.get(index2);
		temp2.position = index;

		heap.set(index, temp2 );
		heap.set( index2, temp);


		//Update posistion in Node
		//    heap.get(index).position=index;
		//    heap.get(index2).position=index2;
	}


	private final int parent(final int i) {
		return i/2;
	}

	private final int left(final int i) {
		return 2*i;
	}

	private final int right(final int i) {
		return 2*i+1;
	}

	/**
	 * Returns an iterator that iterates over all elements of the heap, in no particular order
	 * @return
	 */
	public final Iterator<T> iterator() {
		return new Iterator<T>() {
			private Iterator<Node> iterator = heap.iterator(); 
			@Override
			public boolean hasNext() { return iterator.hasNext(); }
			@Override
			public T next() { return iterator.next().element; }
			@Override
			public void remove() { }
		};
	}

	//  public void printHeap() {
	//    int step =1;
	//    int i = 0;
	//    for (int n=0;n<size;n++) {
	//      i++;
	//      //System.out.print(""+ ((Contact)heap[n].item).relativeV + "*");
	//      if (i%step == 0 ) {
	//        step *=2; i=0;
	//        System.out.println("");
	//      }
	//    }
	//
	//    System.out.println("");
	//  }
}
