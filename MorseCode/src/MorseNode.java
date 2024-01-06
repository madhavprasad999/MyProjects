
public class MorseNode {
	public MorseSymbol symbol;
	public MorseNode left;
	public MorseNode right;
	Integer level;
	
	MorseNode(MorseSymbol s, Integer level){
		this.symbol = s;
		left=null;
		right=null;
		this.level=level;
	}
	
	public Boolean isThisLeaf() {
		return ((left==null) && (right==null));
	}
	
	public Integer getCountOfChildren() {
		Integer children=0;
		if(hasLeft()) children+= left.getCountOfChildren()+1;
		if(hasRight()) children+=right.getCountOfChildren()+1;
		return children;
	}
	
	public Boolean hasLeft() {
		return left==null;
	}
	
	public Boolean hasRight() {
		return right==null;
	}
}
