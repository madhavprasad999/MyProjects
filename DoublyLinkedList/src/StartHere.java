
public class StartHere {

	public static void main(String[] args) {
		Node firstNode=new Node("firstNode");
		firstNode.insertAtBeginningOfList();
		
		Node secondNode=new Node("secondNode");
		secondNode.insertAtBeginningOfList();
		
		Node thirdNode=new Node("thirdNode");
		thirdNode.insertAtBeginningOfList();
		
		Node fourthNode=new Node("fourthNode");
		fourthNode.insertAtEndOfList();
		
		Util.printListFromNode(Cons.HEAD);
		Util.reverse();
		Util.printListFromNode(Cons.HEAD);
	}

}
