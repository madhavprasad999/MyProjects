
public class Util {
	public void enqueue(Node nodeToEnqueue) {
		nodeToEnqueue.nextNode=Cons.ENTRY.nextNode;
		Cons.ENTRY.nextNode=nodeToEnqueue;
	}
	
	public void dequeue() {
		if(Cons.ENTRY.nextNode==null) { //0 nodes in the queue.
			return;
		}
		Node firstNode=Cons.ENTRY.nextNode;
		if(firstNode.nextNode==null) { //1 node in the queue
			Cons.ENTRY.nextNode=null;
			return;
		}
		
		Node secondNode=firstNode.nextNode;
		
		if(secondNode.nextNode==null) { //2 nodes in the queue.
			firstNode.nextNode=null;
			return;
		}
		
		Node nodeToDequeue=getSecondLastNode(Cons.ENTRY);
		nodeToDequeue.nextNode=null;
	}
	
	public Node getSecondLastNode(Node currentNode){
		if(currentNode.nextNode.nextNode==null) return currentNode;
		else {
			currentNode=currentNode.nextNode;
			return getSecondLastNode(currentNode);
		}
	}
	
	public void printQueue() {
		Node currentNode=Cons.ENTRY;
		System.out.print("ENTRY -> ");
		while(currentNode.nextNode!=null) {
			currentNode=currentNode.nextNode;
			System.out.print(currentNode.value + " -> ");
		}
		System.out.print("EXIT\n");
	}
}
