/**
 * 
 */

/**
 * 
 */
public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String message="---.---..---......--.--.......-...-";
		Dictionary d=new Dictionary();
		System.out.println(d);
		//System.out.println(MorseTree.rootNode.getCountOfChildren());
		StringBuilder sb = new StringBuilder();
		traversePreOrder(sb, "","",MorseTree.rootNode);
		System.out.print(sb.toString());
	}
	
	
	public static void traversePreOrder(StringBuilder sb, String padding, String pointer, MorseNode node) {
		if (node != null) {
	        sb.append(padding);
	        sb.append(pointer);
	        String name="";
	        if(node==null || node.symbol==null || node.symbol.name==null) name="#";
	        else name=node.symbol.name;
	        sb.append(name);
	        sb.append("\n");

	        StringBuilder paddingBuilder = new StringBuilder(padding);
	        paddingBuilder.append("│  ");

	        String paddingForBoth = paddingBuilder.toString();
	        String pointerForRight = "└──";
	        String pointerForLeft = (node.right != null) ? "├──" : "└──";

	        traversePreOrder(sb, paddingForBoth, pointerForLeft, node.left);
	        traversePreOrder(sb, paddingForBoth, pointerForRight, node.right);
	    }
	}

}
