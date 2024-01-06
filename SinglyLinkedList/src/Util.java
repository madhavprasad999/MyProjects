
public class Util {
	public static void printListFromNode(Node n) {
		if(n==null) {
			System.out.println(" -> NULL.");
			return;
		}
		
		if(n.value=="") {
			System.out.print("HEAD");
		}
		else {
			System.out.print(" -> "+ n.value);
		}
		
		printListFromNode(n.nextNode);
	}
	
	public static Node findPreviousNode(Node nodeToFind) {
		Node previousNode=Cons.HEAD;
		while(previousNode.nextNode!=null) {
			if(previousNode.nextNode==nodeToFind) return previousNode;
			previousNode=previousNode.nextNode;
		}
		return null;
	}
}
