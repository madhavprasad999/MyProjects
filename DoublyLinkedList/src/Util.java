
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
			if(n.prev==Cons.HEAD) {
				System.out.print(" - "+ n.value);
			}
			else {
				System.out.print(" = "+ n.value);
			}
		}
		printListFromNode(n.next);
	}
	
	public static void reverse() {
		Node temp = null;
        Node current = Cons.HEAD;
        
		while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
 
        /* Before changing head, check for the cases like
         empty list and list with only one node */
        if (temp != null) {
            Cons.HEAD = temp.prev;
            Cons.HEAD.value="";
        }
	}
	
}
