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
 * An undirected graph that keeps track of connected components (groups). Each time an edge is added or removed 
 * from the graph, data structures are maintained, reflecting connected components in the graph. This means, 
 * that adding edges are roughly an O(k) operation, while removing an edge could i result in a total traversal of the graph, 
 * visiting all present edges, worst case O((n-1)^2) where n is the number of nodes. Usually this will be much 
 * cheaper, given that the graph has a low density, and is fragmented into separated components. 
 *
 * @param <T> Type that stores in nodes
 * @param <U> Type that stores in edges
 */
public class HashMapComponentGraph<T,U,V> implements ComponentGraph<T,U,V> {
	
	// wrapping classes
	private final class Node {
		public Node(T element) {this.element = element;}
		public final T element;
		public int color;
		
		public final int hashCode() {
			return element.hashCode();
		}
		public final boolean equals( Object other ) {
			return element.equals(((Node)other).element);
		}
	}
	
	// component wrapper class for the type V. 
	private final class Component {
		private final V element;
		public Component(V element) {this.element = element;}
		
		public final int hashCode() {
			return element.hashCode();
		}
		public final boolean equals( Object other ) {
			return element.equals(((Component)other).element);
		}
	}
	
//	/**
//	 * Node classifier for the ContactGraph
//	 *
//	 * @param <T> Type that stores in nodes
//	 */
//	public interface NodeClassifier<T> {
//		/**
//		 * @param node Node to classify
//		 * @return true if the node is to be considered as a delimiting node, such that two
//		 * components in some graph, would not be merged if connected through such a node. Returns false otherwise.
//		 */
//		public boolean isDelimitor(final T node);
//	}
		
	
	// this would ideally be a Set, but the HashSet implementation doesn't allow one to get the
	// actual reference to a specific object in the set. This means that we can't keep our Node objects
	// unique, which we would like to do
	private final Map<Node,Node>               allnodes = new HashMap<Node,Node>();

	private final Set<Node>		               freenodes = new HashSet<Node>();//	
	private final Map<Node,Set<Node>>          edges = new HashMap<Node,Set<Node>>();
	private final Map<Node,Component>       component = new HashMap<Node,Component>();

	private final Map<Pair<T>,U>               edgeData = new HashMap<Pair<T>,U>();//

	private final Map<Component,Set<Node>>     componentNodes = new HashMap<Component,Set<Node>>();//
	private final Map<Component,Set<Pair<T>>>  componentEdges = new HashMap<Component,Set<Pair<T>>>();//

	
	private final NodeClassifier<T> nodeClassifier;

	//TODO the nodes map is not cleaned up, nodes that are removed still remains in here
	
	
	// default component creator
	private final ComponentHandler<T,V> componenthandler;
//	= new ComponentHandler<V>() {
//		public V newComponent() {
//			return null;
//		};
//	};
	
//	/**
//	 * Create a new component graph
//	 * @param nodeClassifier a classifier for the type T, used for the connected components analysis
//	 */
//	public HashMapComponentGraph( NodeClassifier<T> nodeClassifier ) {
//		this.nodeClassifier = nodeClassifier;
//	}
	
	/**
	 * Create a new component graph 
	 * @param nodeClassifier a classifier for the type T, used for the connected components analysis
	 * @param componetcreator a creator for new components that arrise inside the component graph
	 */
	public HashMapComponentGraph( NodeClassifier<T> nodeClassifier, ComponentHandler<T,V> componentcreator ) {
		this.componenthandler = componentcreator;
		this.nodeClassifier = nodeClassifier;
	}
	
	/**
	 * Add an edge to the graph, and implicitly add included end-nodes if not already present in the graph.
	 * This is roughly an O(k) and sometimes O(nodes) operation, depending on whether components are to be merged or not.
	 * @param pair A pair of nodes, where an edge is to be added between them.
	 * @param edgeelement An element of type U to store in the new edge
	 */
	@Override
	public final void addEdge( Pair<T> pair, U edgeelement) { 
		
		//do not act if edge is already present
		if (edgeData.containsKey(pair)) {
			// update the edge data user reference
			edgeData.put(pair,edgeelement);
			return;
		}
		
		// add the new edge data to the edge
		edgeData.put(pair,edgeelement);
		
		//get nodes from the node tables ( in this way we can keep data other than T in the Node objects)
		// if the nodes are not present, we add them to the allnodes and to freenodes
		Node a = new Node(pair.getFirst());
		if ( allnodes.containsKey(a)) {
			a = allnodes.get(a); 
		} else { 
			allnodes.put(a,a);
			freenodes.add(a);
		}
		Node b = new Node(pair.getSecond());
		if ( allnodes.containsKey(b)) { 
			b = allnodes.get(b); 
		} else { 
			allnodes.put(b,b);
			freenodes.add(b);
		}

		
		//if b is fixed, interchange a and b ( now, if b is fixed, both a and b are fixed)
		if (nodeClassifier.isDelimitor(b.element)) {
			Node t = a;
			a = b; b = t;
		}
		
		//add edge to nodes. First create hash sets, and then add the nodes to them
		if (!edges.containsKey(a)) edges.put(a, new HashSet<Node>());
		if (!edges.containsKey(b)) edges.put(b, new HashSet<Node>());
		edges.get(b).add(a);
		edges.get(a).add(b);
		
		//Cases
		//   i. Both nodes are delimiters 
		//       a) do nothing
		//  ii. One node is delimiter:
		//       a). non-delimiter is in a component
		//             do nothing
		//       b). non-delimiter is not in a component
		//             create a new component for the non-delimiter node
		// iii. No node is delimiter:
		//       a). no node is in a component
		//             create a new component for both nodes
		//       b). one node is in a component
		//             add the new node to this component
		//       c). both nodes are in a component
		//             1. the same component
		//                 do nothing
		//             2. different components
		//                 merge the one component into the other
		
		// case i a) 
		// both a and b are delimitors
		if (nodeClassifier.isDelimitor(b.element)) {
			//do nothing
		
		// ii)
		// one is delimiter
		} else if (nodeClassifier.isDelimitor(a.element)) {
			//if b is not in a group, create a new one for b
			if (!component.containsKey(b)) {
				// case ii b)
				Component g = new Component(componenthandler.newComponent());
				
				// add b to the new group
				component.put(b, g);
				componentNodes.put(g, new HashSet<Node>());
				componentNodes.get(g).add(b);
				
				// notify handler
				componenthandler.nodeAddedToComponent(g.element, b.element);

				// b is not a free node anymore
				freenodes.remove(b);

				//add to pairs
				componentEdges.put(g, new HashSet<Pair<T>>());
				componentEdges.get(g).add(pair);
				
				//return;
			} else {
				// case ii a)
				//add to pairs
				Component g = component.get(b);
				componentEdges.get(g).add(pair);
			}
		//non of the bodies are delimiters
		} else {

			//if b is in a group, interchange a and b 
			//( now, if b is in a group, both a and b are grouped)
			if (component.containsKey(b)) {
				Node t = a;
				a = b; b = t;
			}

			//both in components
			if (component.containsKey(b)) {
				//same component
				if (component.get(a) == component.get(b)) {
					//do nothing
					//add edge to this component
					componentEdges.get(component.get(a)).add(pair);
				//different components
				} else {
					// two nodes from two different components was connected.
					// we then merge the two components into one
					
					//merge groups (remove the gb group)  
					Component ga = component.get(a);
					Component gb = component.get(b);
					
					// call the user handler to say we are merging gb into ga
					componenthandler.mergeComponent(ga.element, gb.element);
					
					//update the component table, i.e. update bodies that was tied to component gb, to ga
					Iterator<Node> i = componentNodes.get(gb).iterator();
					while (i.hasNext()) {
						Node body = i.next();
						component.put(body, ga);
					}
					
					//put nodes in group b into group a
					componentNodes.get(ga).addAll(componentNodes.get(gb));
					componentEdges.get(ga).addAll(componentEdges.get(gb));
					
					//also, add the new edge (pair) 
					componentEdges.get(ga).add(pair);
					
					//remove the gb component from the component table
					componentNodes.remove(gb);
					componentEdges.remove(gb);
					


					
					//return;
				}
			//one group
			} else if (component.containsKey(a)) {
				//assign b to the group of a
				Component g = component.get(a);
				component.put(b, g);
				componentNodes.get(g).add(b);
				componentEdges.get(g).add(pair);
				
				// b is not a free node anymore
				freenodes.remove(b);
				
				// notify handler that b is added to the group of a
				componenthandler.nodeAddedToComponent(g.element, b.element);
				
				//return;
			//no groups
			} else {
				//create a new component for both bodies
				Component newGroup = new Component(componenthandler.newComponent());
				component.put(a, newGroup); 
				component.put(b, newGroup);
				componentNodes.put(newGroup, new HashSet<Node>());
				componentNodes.get(newGroup).add(a);
				componentNodes.get(newGroup).add(b);
				
				// notify handler that a and b is added to the new component 
				componenthandler.nodeAddedToComponent(newGroup.element, a.element);
				componenthandler.nodeAddedToComponent(newGroup.element, b.element);
				
				componentEdges.put(newGroup, new HashSet<Pair<T>>());
				componentEdges.get(newGroup).add(pair);
				
				//both a and b are not free now
				freenodes.remove(a);
				freenodes.remove(b);
				//return;
			}
						
		}
		
//		System.out.println("After add: " + 		groups.keySet().size() + " groups with " + group.size() + " bodies"  );
		Iterator<Component> groupiter = componentNodes.keySet().iterator();

		Set<Pair<T>> allpairs = new HashSet<Pair<T>>();
		Set<Node> allnodes = new HashSet<Node>();
		while(groupiter.hasNext()){
			Component g = groupiter.next();
			//System.out.println( "Group " + g + " : " + groupPairs.get(g).size() + " pairs " );
			
			Iterator<Pair<T>> pairiter = componentEdges.get(g).iterator(); 
			while (pairiter.hasNext()) {
				Pair<T> thispair = pairiter.next();
				//System.out.println( "    pair:"+thispair.hashCode());
				if (allpairs.contains(thispair)) {
					System.out.println("Duplicates!!!!");
					System.exit(0);
				}
				allpairs.add(thispair);	

			}

			
			Iterator<Node> nodeiter = componentNodes.get(g).iterator(); 
			while (nodeiter.hasNext()) {
				Node node = nodeiter.next();
				//System.out.println( "     Node:"+node);
				if (allnodes.contains(node)) {
					System.out.println("Duplicates!!!!");
					System.exit(0);
				}
				allnodes.add(node);	

			}

			
			
		}
	}
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
	@Override
	public final boolean removeEdge( Pair<T> pair) {
		//don't act if edge is not  present
		if (!edgeData.containsKey(pair))
			return false; 
		else 
			edgeData.remove(pair);

		
		// get the node out of the node hash map ( at this point we acually know that the nodes must
		// exist, because the edge exists 
		Node a = new Node(pair.getFirst());
		if ( allnodes.containsKey(a)) 
			a = allnodes.get(a); else allnodes.put(a,a);		
		Node b = new Node(pair.getSecond());
		if ( allnodes.containsKey(b)) 
			b = allnodes.get(b); else allnodes.put(b,b);
		

		//if b is fixed, interchange a and b ( now, if b is fixed, both a and b are fixed)
		if (nodeClassifier.isDelimitor(b.element)) {
			Node t = a;
			a = b; b = t;
		}

		//remove edge from nodes O(k)
		edges.get(a).remove(b);
		edges.get(b).remove(a);

		// if no edges left in set, remove the set
		if (edges.get(a).isEmpty())
			edges.remove(a);

		// if no edges left in set, remove it
		if (edges.get(b).isEmpty())
			edges.remove(b);


		//Cases
		//   i. Both node are delimiters 
		//        do nothing
		//  ii. One node is delimiter:
		//       a). non-delimiter is in a component
		//             do nothing (node could now be alone in its component)
		//             if node contains no other edges, delete it from its component
		//       b). non-delimiter is not in a component (not possible)
		//             do nothing/ report fatal error
		// iii. No node is delimiter:
		//       a). no node is in a component (not possible)
		//             do nothing/ error
		//       b). one node is in a component (not possible)
		//             do nothing
		//       c). both nodes are in a component
		//             1. the same component
		//                 remove edge, traverse breadth-first from each node to determine 
		//                 if component should be split. 
		//             2. different components (not possible)
		//                 do nothing/ error

		//both nodes are fixed
		if ( nodeClassifier.isDelimitor(b.element)) {
			//do nothing
			//return;
			//one is fixed
		} else if ( nodeClassifier.isDelimitor(a.element)) {
			if (component.containsKey(b)) { // only possible option 
				//System.out.println("One fixed node");
				Component g = component.get(b);

				//check for another edge on this node
				if (!edges.containsKey(b)) {
					//System.out.println("b did not have any edges");
					//remove the node from component
					component.remove(b);
					
					//notify handler
					componenthandler.nodeRemovedFromComponent(g.element, b.element);
					
					// b is now free
					freenodes.add(b);
					
					Set<Node> s = componentNodes.get(g);
					if (!s.remove(b)) {
						System.out.println("ALARM");
						System.exit(0);
					}
					//remove group if empty
					if (s.isEmpty()) {
						//System.out.println("groups entry removed");
						componentNodes.remove(g);
						//TODO notify handler
					} else {
						System.out.println("Group isn't empty, why??");
						//System.exit(0);

					}
				} else {
					//System.out.println("b has edges left, and is part of a group");

				}



				//remove edge from component (even if b was not removed from the group)
				Set<Pair<T>> sp = componentEdges.get(g);
				sp.remove(pair);
				//remove group if empty
				if (sp.isEmpty()) {
					//System.out.println("grouppair entry removed " + g );
					componentEdges.remove(g);
				}

			} else {
				System.out.println("HashMapComponentGraph.removeEdge(): A connected non-delimiter node was not in a component!");
				System.exit(0);
			}
			//return;
			//none is fixed
		} else {

			//if b has edges, interchange a and b 
			//( now, if b has edges, both a and b have edges)
			if (edges.containsKey(b)) {
				Node t = a;
				a = b; b = t;
			}

			//both are in the same group (only possible option)
			Component oldgroup = component.get(a);

			if (oldgroup != component.get(b)) {
				System.out.println("Different groups??!");
				System.exit(0);
			}
			//both have edges
			if (edges.containsKey(b)) {
				final int NONE = 0;
				final int RED  = 1;
				final int BLUE = 2;

				//clear node colors in entire group
				Iterator<Node> i = componentNodes.get(oldgroup).iterator();
				while (i.hasNext()) {
					i.next().color = NONE;
				}


				// perform breadth-first traversal, 
				// to determine if group has become disjoint
				boolean disjoint = true;
				Queue<Node> queue = new LinkedList<Node>();
				Set<Pair<T>> blueEdges = new HashSet<Pair<T>>();
				a.color = RED;
				b.color = BLUE;
				queue.add(a); queue.add(b);

				//traverse
				while (!queue.isEmpty()) {
					Node node = queue.poll();

					//add nodes neighbors to queue
					Iterator<Node> neighbors = edges.get(node).iterator();
					while (neighbors.hasNext()) { 
						Node neighbor = neighbors.next();

						//remember visited edges
						if (node.color == BLUE)
							blueEdges.add(new Pair<T>(node.element,neighbor.element));

						if (nodeClassifier.isDelimitor(neighbor.element)) {
							//ignore fixed nodes
							continue;
						} else if (neighbor.color == NONE ) {
							neighbor.color = node.color;
							queue.add(neighbor);
							continue;
						} else if (neighbor.color != node.color ) {
							//group is connected
							disjoint = false;
							break;
						} else {
							//already visited 
							continue;
						}
					} //while neighbors
				} // while queue

				//handle result of traversal
				if (disjoint) {
					//System.out.println("Splitting group");

					//new group
					Component newgroup = new Component(componenthandler.newComponent());

					Set<Node> blues = new HashSet<Node>();

					//find all blue nodes
					Iterator<Node> iter = componentNodes.get(oldgroup).iterator();
					while (iter.hasNext()) {
						Node node = iter.next();
						if (node.color == BLUE ) { 
							blues.add(node);
							component.put(node, newgroup);
						}
					} 

					// impossible
					if (blues.isEmpty()) {
						System.out.println("Why was no blue nodes found?");
						System.exit(0);
					}

					// remove bodies from old components and add the new component
					componentNodes.get(oldgroup).removeAll(blues);
					componentNodes.put(newgroup, blues);

					//remove blue edges from the red group and create a new group with pairs (ng)
					componentEdges.get(oldgroup).removeAll(blueEdges);
					componentEdges.get(oldgroup).remove(pair);  //the edge that was to be removed
					componentEdges.put(newgroup, blueEdges);
					//return;

				} else {
					//System.out.println("Group still connected");
					//we keep group as it is, but remove the pair (edge)
					Set<Pair<T>> sp = componentEdges.get(oldgroup);
					sp.remove(pair);
					
					//remove group if empty
					if (sp.isEmpty()) {
						//System.out.println("grouppair entry removed " + oldgroup );
						componentEdges.remove(oldgroup);
					}

					//return;
				}


				//a has an edge and b do not
			} else if (edges.containsKey(a)){
				//keep group as it is, but wipe out b
				component.remove(b);
				componentNodes.get(oldgroup).remove(b);

				// b is now a free node
				freenodes.add(b);
				
				// notify handler that b is removed from oldgroup
				componenthandler.nodeRemovedFromComponent(oldgroup.element, b.element);
				
				if (componentNodes.get(oldgroup).isEmpty()) { // never happens
					System.out.println("How can group be empty?");
					componentNodes.remove(oldgroup);
				}

				//remove from pairs
				//System.out.println("removing " + pair +" from group pairs " + oldgroup);
				Set<Pair<T>> sp = componentEdges.get(oldgroup);
				sp.remove(pair);
				//remove group if empty
				if (sp.isEmpty()) {
					//System.out.println("grouppair entry removed " + oldgroup );
					componentEdges.remove(oldgroup);
				}


				//non have edges
			} else {
				//clear out group entirely
				component.remove(a);
				component.remove(b);
				
				// both a and b are free nodes now
				freenodes.add(a);
				freenodes.add(b);
				
				//notify handler that a and b is removed
				componenthandler.nodeRemovedFromComponent(oldgroup.element, a.element);
				componenthandler.nodeRemovedFromComponent(oldgroup.element, b.element);

				//assume that the group is only containing a and b?
				componentNodes.get(oldgroup).remove(b);
				componentNodes.get(oldgroup).remove(a);


				if (componentNodes.get(oldgroup).isEmpty()) {
					componentNodes.remove(oldgroup);
				} else { //impossible
					System.out.println("Hmm still stuff in group but no outgoing edges?" + componentNodes.get(oldgroup) + " a and b is " +a +",    " + b);
					System.exit(0);
				}

				//remove from pairs
				Set<Pair<T>> sp = componentEdges.get(oldgroup);
				sp.remove(pair);
				//remove group if empty
				if (sp.isEmpty()) {
					//System.out.println("grouppair entry removed " + oldgroup );
					componentEdges.remove(oldgroup);
				}

			}//non have edges
		} //none is fixed


		//System.out.println("After remove: " + 		groups.keySet().size() + " groups with " + group.size() + " bodies" );
//		Iterator<Component<V>> groupiter = componentNodes.keySet().iterator();
//
//		Set<Pair<T>> allpairs = new HashSet<Pair<T>>();
//		Set<Node> allnodes = new HashSet<Node>();
//		while(groupiter.hasNext()){
//			Component<V> g = groupiter.next();
//			//System.out.println( "Group " + g + " : " + groupPairs.get(g).size() + " pairs " );
//
//			Iterator<Pair<T>> pairiter = componentEdges.get(g).iterator(); 
//			while (pairiter.hasNext()) {
//				Pair<T> thispair = pairiter.next();
//				//System.out.println( "    pair:"+thispair.hashCode());
//				if (allpairs.contains(thispair)) {
//					System.out.println("Duplicates!!!!");
//					System.exit(0);
//				}
//				allpairs.add(thispair);	
//
//			}
//
//
//			Iterator<Node> nodeiter = componentNodes.get(g).iterator(); 
//			while (nodeiter.hasNext()) {
//				Node node = nodeiter.next();
//				//System.out.println( "    Node:"+node);
//				if (allnodes.contains(node)) {
//					System.out.println("Duplicates!!!!");
//					System.exit(0);
//				}
//				allnodes.add(node);	
//
//			}
//
//		}

		return true;
	}

	
	@Override
	public final U getEdge(Pair<T> pair) {
		if( edgeData.containsKey(pair)) {
			return edgeData.get(pair);
		} else {
			return null;
		}
	}

	
	@Override
	public final Iterator<V> getComponents() {
		// wrapping iterator
		return new Iterator<V>() {
			private final Iterator<Component> iter = componentEdges.keySet().iterator();
			public boolean hasNext() {return iter.hasNext();}
			@Override
			public V next() {
				return iter.next().element;
			}
			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	
	@Override
	public final Iterator<U> getEdgesInComponent(V c) {
		//get edges from component
		final Set<Pair<T>> edges = componentEdges.get(new Component(c));
		
		//abort if the component doesn't exist
		if (edges == null)
			return null;
		
		// get the edges
		final Iterator<Pair<T>> i = edges.iterator(); 
		
		//create an iterator that wraps the process of picking out the 
		//edge data types from edgeData
		return new Iterator<U>() {
			@Override
			public boolean hasNext() {
				return i.hasNext();
			}
			@Override
			public U next() {
				if (i.hasNext()) {
					Pair<T> p = i.next();
					//return the edge data
					return edgeData.get(p);
				}
				//no element available
				return null;
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	

	@Override
	public Iterator<T> getNodesInComponent(V c1) {
		//get edges from component
		final Set<Node> nodes = componentNodes.get(new Component(c1));
		
		//abort if the component doesn't exist
		if (nodes == null)
			return null;
		
		//get the edges
		final Iterator<Node> i = nodes.iterator(); 
		
		//create an iterator iterates the nodes, but return the T element value
		return new Iterator<T>() {
			@Override
			public boolean hasNext() {
				return i.hasNext();
			}
			@Override
			public T next() {
				if (i.hasNext()) {
					Node p = i.next();
					//return the node data
					return p.element;
				}
				//no element available
				return null;
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};

	}

	
	/**
	 * Auxiliary method to print the graph
	 */
	public final void print() {
		System.out.println("Status: " + 		componentNodes.keySet().size() + " components with " + component.size() + " bodies, " + getNumberOfFreeNodes() + " free ");
		Iterator<Component> groupiter = componentNodes.keySet().iterator();

		Set<Pair<T>> allpairs = new HashSet<Pair<T>>();
		Set<Node> allnodes = new HashSet<Node>();
		while(groupiter.hasNext()){
			Component g = groupiter.next();
			System.out.println( "Group " + g.element + " : " + componentEdges.get(g).size() + " pairs, " + componentNodes.get(g).size() + " nodes "  );
			Iterator<Pair<T>> pairiter = componentEdges.get(g).iterator(); 
			while (pairiter.hasNext()) {
				Pair<T> thispair = pairiter.next();
				//System.out.println( "    pair:"+thispair.hashCode());
				if (allpairs.contains(thispair)) {
					System.out.println("Duplicates!!!!");
					System.exit(0);
				}
				allpairs.add(thispair);	

			}


			Iterator<Node> nodeiter = componentNodes.get(g).iterator(); 
			while (nodeiter.hasNext()) {
				Node node = nodeiter.next();
				//System.out.println( "    Node:"+node);
				if (allnodes.contains(node)) {
					System.out.println("Duplicates!!!!");
					System.exit(0);
				}
				allnodes.add(node);	

			}
		}	
	}

	@Override
	public int getNumberOfComponents() {
		//return the number of keys in the component-Nodes map
		return componentNodes.keySet().size();
	}
	
	@Override
	public Iterator<T> getConnectedNodes(final T node) {
		// create a wrap iterator
		return new Iterator<T>() {
			Iterator<Node> i = edges.get(new Node(node)).iterator();
			@Override
			public boolean hasNext() {
				return i.hasNext();
			}
			@Override
			public T next() {
				return i.next().element;
			}
			@Override
			public void remove() {
			}
		};
	}
	
	public void addNode(T nodeelement) {
		// check if we know about this node
		Node node = new Node(nodeelement);
		
		if (allnodes.containsKey(node) ) {
			// ignore. Maybe give warning?
			System.out.println("HashMapComponentGraph.addNode(): Node is already in graph");
		} else {
			// add to both allnodes and freenodes
			allnodes.put(node,node);
			freenodes.add(node);
		}
	}
	
	public void removeNode(T nodeelement) {
		Node node = new Node(nodeelement);
		// check if node is in freenodes. If so, we don't have to do anything but removing the node
		// from both freenodes and allnodes
		if ( freenodes.contains(node)) {
			freenodes.remove(node);
			allnodes.remove(node);
			return;
		}
		
		// we now expect node to be part of a component, but we can now simply remove all incident 
		// edges to the node. After that, the node will be placed into freenodes, and we can trivially
		// remove it
		
		// remove each incident edges. store edges in intermediate list to avoid
		// concurrent modification errors
		List<Pair<T>> edgesToRemove = new ArrayList<Pair<T>>();
		Iterator<T> neighbors = getConnectedNodes(node.element);
		while (neighbors.hasNext()) {
			Pair<T> nodepair = new Pair<T>(node.element, neighbors.next() );			
			edgesToRemove.add(nodepair);
		}
		for (Pair<T> edge: edgesToRemove ) 
			removeEdge(edge);
		
		// we can now remove the node
		if ( freenodes.contains(node)) {
			freenodes.remove(node);
			allnodes.remove(node);
			return;
		} else {
			System.out.println("HashMapComponentGraph.removeNode(): Node was not free after removing its edges");			
		}
	}
	
	@Override
	public int getNumberOfNodes() {
		return allnodes.size();
	}
	
	@Override
	public int getNumberOfFreeNodes() {
		return freenodes.size();
	}
	
	@Override
	public Iterator<T> getFreeNodes() {
		// wrapping iterator
		return new Iterator<T>() {
			Iterator<Node> i = freenodes.iterator();
			@Override
			public boolean hasNext() {
				return i.hasNext();
			}
			@Override
			public T next() {
				return i.next().element;
			}
			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	@Override
	public Iterator<U> getConnectedEdges(final T node) {		
		// create a wrap iterator
		return new Iterator<U>() {
			Iterator<Node> i = edges.get(new Node(node)).iterator();
			@Override
			public boolean hasNext() {
				return i.hasNext();
			}
			@Override
			public U next() {
				// create a edge pair from the node types, and return the edge data
				return  edgeData.get(new Pair<T>(node,i.next().element));
			}
			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};

	}
}
