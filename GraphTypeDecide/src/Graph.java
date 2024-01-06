import java.util.HashSet;
import java.util.Set;

public class Graph {
	Set<Node> nodes;
	//Set<Edge> edges;
	Node HEAD_NODE;
	
	Boolean initializationComplete = false;
	
	//constructor
	Graph(){
		nodes=new HashSet<Node>();
		//edges=new HashSet<Edge>();
	}
	
	//getters
	public Set<Node> getAllNodes(){
		return nodes;
	}
	
	public Node getNode(String nodeId) {
		for(Node n: nodes) {
			if(n.id.equalsIgnoreCase(nodeId)) return n;
		}
		return null;
	}

	//initialization method.
	public void initGraph(Integer numberOfNodesToCreate, Integer headNodeId) {
		initializationComplete=true;
		Boolean addingNodesSuccess=addNodes(numberOfNodesToCreate);
		if(!addingNodesSuccess) {
			initializationComplete=false;
			nodes=new HashSet<Node>();
			return;
		}
		Boolean settingHeadNodeSuccess=setHeadNode("Node"+headNodeId);
		if(!settingHeadNodeSuccess) {
			HEAD_NODE=null;
			initializationComplete=false;
			return;
		}
	}
	
	//setters
	public Boolean setHeadNode(String HEAD_NODE_ID) {
		if(!initializationComplete) return false;
		for(Node n: nodes) {
			if(n.id.equalsIgnoreCase(HEAD_NODE_ID)) HEAD_NODE=n;
		}
		return true;
	}
	
	//utility methods
	public Boolean addNodes(Integer numberOfNodesToAdd) {
		if(!initializationComplete) return false;
		while(numberOfNodesToAdd>0) {
			numberOfNodesToAdd--;
			Node n=new Node();
			nodes.add(n);
		}
		return true;
	}
	
	public Boolean deleteNode(String nodeId) {
		Set<Node> neighbours=getAllNeighbours(nodeId);
		for(Node n: neighbours) {
			for(Edge e: n.edges) {
				if(e.node1.id==nodeId || e.node2.id==nodeId) {
					e.node1=null;
					e.node2=null;
					e=null;
				}
			}
		}
		Node n=getNode(nodeId);
		n.edges=null;
		n=null;
		System.gc(); //This will delete all objects marked as null
		return true;
	}
	
	public Boolean deleteAllNodes() {
		HEAD_NODE=null;
		nodes=new HashSet<Node>();
		//edges=new HashSet<Edge>();
		initializationComplete=false;
		return true;
	}
	
	public Boolean connectNodes(String nodeId1, String nodeId2) {
		Node node1=getNode(nodeId1);
		Node node2=getNode(nodeId2);
		
		if(node1!=null && node2!=null && node1!=node2)
			return connectNodes(node1,node2);
		return false;
	}
	
	public Boolean connectNodes(Node node1, Node node2) {
		Edge e=new Edge(node1, node2);
		node1.edges.add(e);
		node2.edges.add(e);
		return true;
	}
	
	public Boolean disconnectNodes(String nodeId1, String nodeId2) {
		Node node1=getNode(nodeId1);
		Node node2=getNode(nodeId2);
		if(node1!=null && node2!=null && node1!=node2)
			return disconnectNodes(node1, node2);
		return false;
	}
	
	public Boolean disconnectNodes(Node node1, Node node2) {
		for(Edge e: node1.edges) {
			if(e.node1==node1 && e.node2==node2) {
				e=null;
			}
			else if(e.node1==node2 && e.node2==node1) {
				e=null;
			}
		}
		System.gc(); //This will delete all objects marked as null
		return false;
	}
	
	public Set<Node> getAllNeighbours(String nodeId){
		Node node=getNode(nodeId);
		if(node==null) return null;
		Set<Node> setOfNeighbours=new HashSet<Node>();
		for(Edge e: node.edges) {
			if(e.node1==node)
				setOfNeighbours.add(e.node2);
			else
				setOfNeighbours.add(e.node1);
		}
		return setOfNeighbours;
	}
	
	//printer
	public void printGraph() {
		if(!initializationComplete) return;
		Cons.print("Starting node is defined as: ");
		Cons.printNode(HEAD_NODE.id);
		Cons.print();
		Cons.separate();
		for(Node n: nodes) {
			Cons.printNode(n.id);
			Cons.print(" ");
			Cons.print("Edges connected to this Node: "+ n.edges.size());
			Cons.print();
			if(n.edges.size()>0) {
				Cons.print("Edges on this node:");
				Cons.print();
				for(Edge e: n.edges) {
					Cons.print("Edge ");
					Cons.printEdge(e.id);
					Cons.print(" connection: ");
					Cons.printNode(e.node1.id);
					Cons.print(" ------ ");
					Cons.printNode(e.node2.id);
					Cons.print();
				}
			}
			Cons.separate();
		}
	}
	
	
	
	
	
}
