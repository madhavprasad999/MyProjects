public class StartHere {

	public static void main(String[] args) {
		Node firstElement=new Node("FirstElement");
		Node secondElement=new Node("secondElement");
		Node thirdElement=new Node("thirdElement");
		Node fourthElement=new Node("fourthElement");
		Node fifthElement=new Node("fifthElement");
		Node sixthElement=new Node("sixthElement");
		
		firstElement.insertAtBeginningOfList();
		secondElement.insertAtBeginningOfList();
		thirdElement.insertAtBeginningOfList();
		fourthElement.insertAtEndOfList();
		fifthElement.insertAfterThisNode(Cons.HEAD);
		sixthElement.insertBeforeThisNode(firstElement);
		secondElement.delete();
		
		Util.printListFromNode(Cons.HEAD);
	}
}