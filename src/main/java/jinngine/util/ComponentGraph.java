/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.util;

import java.util.Iterator;

/**
 * An undirected graph that keeps track of connected components (groups). Each time an edge is added or removed 
 * from the graph, data structures are maintained, reflecting connected components in the graph. This means, 
 * that adding edges are roughly an O(k) operation, while removing an edge could i result in a total traversal of the graph, 
 * visiting all present edges, worst case O((n-1)^2) where n is the number of nodes. Usually this will be much 
 * cheaper, given that the graph has a low density, and is fragmented into separated components. 
 *
 * @param <T> Type that stores in nodes
 * @param <U> Type that stores in edges
 * @param <V> Type that stores in components
 */
public interface ComponentGraph<T,U,V> {

	/**
	 * Interface for supplying custom component objects. Components are used to reference the 
	 * independently connected components in the graph. It is therefore useful to be able to 
	 * store user information within the component references.
	 */
	public interface ComponentHandler<T,V> {
		/**
		 * Called when a new component is created. This call MUST return a unique object of type 
		 * V, that has not been previously known to the ComponentGraph
		 * @return a new unique component of type V
		 */
		public V newComponent();
		/**
		 * Called prior to two components being merged. This gives the user a way to manipulate 
		 * data in the component type V. During this call, it is possible to access the data of 
		 * the ComponentGraph in a read-only fashion. 
		 * @param remaining The component that will be the union of both components after merge
		 * @param disappearing The component that will be removed from the graph
		 */
		public void mergeComponent( V remaining, V leaving );
		
		/**
		 * Called when a node is added to some component
		 */
		public void nodeAddedToComponent( V component, T node );
		
		/**
		 * Called when a node is removed from some component
		 */
		public void nodeRemovedFromComponent( V component, T node);
		
	}

	/**
	 * Node classifier for the ContactGraph
	 *
	 * @param <T> Type that stores in nodes
	 */
	public interface NodeClassifier<T> {
		/**
		 * @param node Node to classify
		 * @return true if the node is to be considered as a delimiting node, such that two
		 * components in some graph, would not be merged if connected through such a node. Returns false otherwise.
		 */
		public boolean isDelimitor(final T node);
	}
	
	/** 
	 * Add a node to the graph. If the node already exists in the graph, the call will have no effect. 
	 * @param node
	 */
	public void addNode( T node );
	
	/**
	 * Remove a node from the graph. All edges incident to this node will be removed as well. 
	 * @param node
	 */
	public void removeNode( T node );
	
	/**
	 * Add an edge to the graph, and implicitly add included end-nodes if not already present in the graph.
	 * This is roughly an O(k) and sometimes O(nodes) operation, depending on whether components are to be merged or not.
	 * @param pair A pair of nodes, where an edge is to be added between them.
	 * @param edgeelement An element of type U to store in the new edge
	 */
	public void addEdge( Pair<T> pair, U edgeelement);

	/**
	 * Remove an edge. If the removal results in one or more isolated nodes, these will be removed 
	 * from the graph implicitly. 
 	 * 
	 * For non-dense and relatively fragmented graphs, this operation will be cheap. Otherwise, for
	 * dense and strongly connected graphs, the operation could include a full traversal of the graph visiting all
	 * present edges, resulting in an O((n-1)^2) operation, where n is the number of nodes in the graph.
	 * @param pair edge to be removed
	 * @return true if the edge was actually removed, false if the edge did not exists before call.
	 */
	public boolean removeEdge( Pair<T> pair);
	
	/**
	 * Get the edge element of type U that is stored in the edge defined by
	 * a pair of node types T. If no such edge exist, the return value is null.
	 * @param pair A pair of T type objects defining an edge in the graph
	 * @return The U type object stored in the edge. Return value is null if no such 
	 * edge is present in the graph
	 */
	public U getEdge( Pair<T> pair);

	/**
	 * Return an iterator yielding the edges in the specified component. 
	 * @param c Component to iterate
	 * @return Iterator giving the edge elements in the component
	 */
	public Iterator<U> getEdgesInComponent(V c);

	/**
	 * Returns an iterator yielding the nodes present in the given component
	 * @param c Any component of this graph
	 * @return An iterator yielding the nodes present in the component c
	 */
	public Iterator<T> getNodesInComponent(V c);
	
	/**
	 * Return an iterator that yields the components in the graph
	 * @return 
	 */
	public Iterator<V> getComponents();
	
	/**
	 * Return the number of components in this graph
	 */
	public int getNumberOfComponents();
	
	/**
	 * Return the total number of nodes in this graph
	 */
	public int getNumberOfNodes();
	
	/**
	 * Return the number of free nodes, which are nodes that are not a part of a graph component
	 */
	public int getNumberOfFreeNodes();
	
	
	/**
	 * Get all free nodes. A free node is not in any component.
	 */
	public Iterator<T> getFreeNodes();
	
	/**
	 * Get all nodes that is connected to the given node. The constructible pairs
	 * Pair<T> can then be used to obtain the edge type U using getEdge(Pair<T>)
	 */
	public Iterator<T> getConnectedNodes(T node);
	
	/**
	 * Get all edges connected to the given node
	 * @param node
	 * @return An iterator over all edges connected to the given node
	 */
	public Iterator<U> getConnectedEdges(T node);

}
