import java.util.Set;

public class StartHere {

	public static void main(String[] args) {
		Graph g=new Graph();
		g.initGraph(10, 2);
		//g.printGraph();
		
		g.connectNodes("Node1", "Node2");
		g.connectNodes("Node1", "Node3");
		//g.printGraph();
		
		Set<Node> allNeighbours=g.getAllNeighbours("Node1");
		for(Node nn: allNeighbours) {
			Cons.print(nn.id);
			Cons.print();
		}
		
	}

}
