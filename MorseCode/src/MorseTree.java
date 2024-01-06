
public class MorseTree {
	public static MorseNode rootNode;
	
	public void add(MorseSymbol symbolToInsert) {
		System.out.println("Starting to add for "+ symbolToInsert.name + " with code: "+symbolToInsert.code);
		if(rootNode==null) rootNode = new MorseNode(null, 0);
		else rootNode = addNode(MorseTree.rootNode, symbolToInsert, symbolToInsert.code.length());
		//System.out.println("Processing complete \n\n");
	}
	
	private MorseNode addNode(MorseNode currentNode, MorseSymbol symbolToInsert, Integer remainingLength) {
		if(remainingLength==0) {
			return new MorseNode(symbolToInsert, currentNode.level+1);
		}
		String firstSymbol=symbolToInsert.code.substring(symbolToInsert.code.length()-remainingLength, symbolToInsert.code.length()-remainingLength+1);
		System.out.println("firstSymbol: " + firstSymbol +" >> " + "remaining Length" +(remainingLength));
		
		remainingLength--;
		
		if(firstSymbol.equals(".")) {
			if(currentNode.left==null) currentNode.left=new MorseNode(null, currentNode.level+1);
			currentNode.left=addNode(currentNode.left, symbolToInsert, remainingLength);
		}
		else if(firstSymbol.equals("-")) {
			if(currentNode.right==null) currentNode.right=new MorseNode(null, currentNode.level+1);
			currentNode.right=addNode(currentNode.right, symbolToInsert, remainingLength);
		}
		
		return currentNode;
	}
	
	public MorseNode getNextNode(MorseNode currentNode, String symbol) throws Exception {
		if(symbol==null || symbol.length()!=1) return null;
		
		if(currentNode==null) currentNode=MorseTree.rootNode;
		if(currentNode.isThisLeaf()) return currentNode;
		
		if(symbol.equals(".")) return currentNode.left;
		if(symbol.equals("-")) return currentNode.right;
		
		throw new Exception("Could not find node");
	}
	
	
}
