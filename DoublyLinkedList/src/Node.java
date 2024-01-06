
public class Node {
	Node prev;
	String value;
	Node next;
	
	Node(String value){
		if(value==null) value="";
		prev=null;
		this.value=value;
		next=null;
	}
	
	public void insertAtBeginningOfList() {
		if(Cons.HEAD.next==null) { //This means the list is empty.
			Cons.HEAD.next=this;
			this.prev=null;
			this.next=null;
		}
		else {
			Node theFirstNode=Cons.HEAD.next;
			Cons.HEAD.next=this;
			this.prev=null;
			this.next=theFirstNode;
			theFirstNode.prev=this;
		}
	}
	
	public void insertAtEndOfList() {
		if(Cons.HEAD.next==null) { //This means the list is empty.
			Cons.HEAD.next=this;
			this.prev=null;
			this.next=null;
		}
		else {
			Node lastNode=findLastNode(Cons.HEAD);
			lastNode.next=this;
			this.next=null;
			this.prev=lastNode;
		}
	}
	
	Node findLastNode(Node n){
		if(n.next!=null) return findLastNode(n.next);
		else return n;
	}
	
	public void insertAfterThisNode(Node theNode) {
		if(theNode==Cons.HEAD) {
			insertAtBeginningOfList();
		}
		else {
			Node nextNode=theNode.next;
			this.prev=theNode;
			this.next=nextNode;
			nextNode.prev=this;
			theNode.next=this;
		}
	}
	
	public void insertBeforeThisNode(Node theNode) {
		if(theNode==Cons.HEAD) {
			return; //We can not insert before head.
		}
		else {
			Node previousNode=theNode.prev;
			Node nextNode=theNode.next;
			if(previousNode==null) { //theNode is the first Node.
				insertAtBeginningOfList();
			}
			else {
				if(nextNode==null) { //theNode is last Node
					insertAtEndOfList();
				}
				else {
					insertAfterThisNode(previousNode);
				}
			}
		}
	}
	
	public void delete() {
		if(Cons.HEAD.next==this) { //trying to delete first Node.
			Node nextNode=this.next;
			Cons.HEAD.next=nextNode;
			nextNode.prev=null;
		}
		else {
			if(this.next==null) { //trying to delete the last node (which has a prev value).
				Node prevNode=this.prev;
				prevNode.next=null;
			}
			else {
				Node previousNode=this.prev;
				Node nextNode=this.next;
				previousNode.next=nextNode;
				nextNode.prev=previousNode;
			}
		}
	}
	
	
}
