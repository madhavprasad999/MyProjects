
public class Node {
	String value;
	Node nextNode;
	
	Node(String value){
		if(value==null) value="";
		this.value=value;
		nextNode=null;
	}
	
	public void insertAtBeginningOfList() {
		this.nextNode= Cons.HEAD.nextNode;
		Cons.HEAD.nextNode=this;
	}
	
	public void insertAtEndOfList() {
		Node lastNode=findLastElement(Cons.HEAD); //Finding last element
		lastNode.nextNode=this;
		this.nextNode=null;
	}
	
	Node findLastElement(Node thisElement){
		if(thisElement.nextNode==null) return thisElement;
		else return findLastElement(thisElement.nextNode);
	}
	
	public void insertAfterThisNode(Node theNode) {
		this.nextNode=theNode.nextNode;
		theNode.nextNode=this;
	}
	
	public void insertBeforeThisNode(Node thisElement) {
		Node previousNode = Util.findPreviousNode(thisElement);
		this.nextNode=previousNode.nextNode;
		previousNode.nextNode=this;
	}
	
	public void delete() {
		if(this==Cons.HEAD) return;
		Node previousNode = Util.findPreviousNode(this);
		previousNode.nextNode=this.nextNode;
	}
}
