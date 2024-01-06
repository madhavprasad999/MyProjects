
public class Symbol {
	String type;
	String name;
	Integer value;
	
	public Symbol(String type, String name, Integer value){
		this.type=type;
		this.name=name;
		this.value=value;
	}
	
	public String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getValue() {
		return value;
	}
}