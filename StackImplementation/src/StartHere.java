
public class StartHere {

	public static void main(String[] args) {
		push(new Node("first"));
		push(new Node("second"));
		push(new Node("third"));
		pop();
		push(new Node("fourth"));
		push(new Node("fifth"));
		pop();
		
		printStack();
	}
	
	public static void printStack() {
		Node currentNode=Cons.TOP;
		while(currentNode!=null) {
			System.out.println(currentNode.value);
			currentNode=currentNode.below;
		}
	}
	
	public static void push(Node node) {
		if(Cons.TOP.below==null) { //Empty stack
			Cons.TOP.below=node;
		}
		else {
			node.below=Cons.TOP.below;
			Cons.TOP.below=node;
		}
	}
	
	public static void pop() {
		if(Cons.TOP.below==null) { //Empty Stack
			return;
		}
		else {
			Cons.TOP.below=Cons.TOP.below.below;
		}
	}

}
