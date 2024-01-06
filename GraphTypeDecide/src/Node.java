import java.util.HashSet;
import java.util.Set;

public class Node {
	public String id;
	public Set<Edge> edges;
	
	Node(){
		id=IdGenerator.getId("Node");
		edges=new HashSet<Edge>();
	}
}
