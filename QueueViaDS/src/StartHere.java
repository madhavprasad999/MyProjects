
public class StartHere {

	public static void main(String[] args) {
		Node node1=new Node("node1");
		Node node2=new Node("node2");
		Node node3=new Node("node3");
		Node node4=new Node("node4");
		Node node5=new Node("node5");
		
		Util ut=new Util();
		ut.printQueue();
		ut.enqueue(node1);
		ut.enqueue(node2);
		ut.enqueue(node4);
		ut.enqueue(node3);
		ut.printQueue();
		
		ut.dequeue();
		ut.dequeue();
		ut.printQueue();

	}

}
