
public class Edge {
	public String id;
	public Node node1;
	public Node node2;
	
	Edge(Node node1, Node node2) {
		id=IdGenerator.getId("Edge");
		this.node1=node1;
		this.node2=node2;
	}
}
