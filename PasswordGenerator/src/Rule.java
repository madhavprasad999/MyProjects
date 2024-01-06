import java.util.List;

public class Rule {
	String name;
	Integer id;
	List<Symbol> symbols;
	Boolean active;
	
	Rule(String name, Integer id, List<Symbol> symbols){
		this.name= name;
		this.id= id;
		this.symbols= symbols;
		this.active= false;
	}
	
	public String getName() {return name;}
	
	public Integer getId() { return id;}
	
	public List<Symbol> getSymbols() {return symbols;}
	
	public Boolean isActive() {return active;}
	
	public void activateRule() {active=true;}
	public void deactivateRule() {active=false;}
	
	public Symbol getRamdomSymbol() {
		Symbol randomSymbol=null;
		
		Integer sizeOfSymbols=symbols.size()-1;
		Double randomNumber=Math.random()*1000;
		Integer intValue=randomNumber.intValue();
		Integer convertingToRemainder=(intValue%sizeOfSymbols) + 1;
		
		for(Symbol symbol: symbols) {
			if(symbol.getValue()==convertingToRemainder) {
				randomSymbol = symbol;
				break;
			}
		}
		
		return randomSymbol;
	}
}
