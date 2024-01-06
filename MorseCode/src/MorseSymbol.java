
public class MorseSymbol {
	
	public String name;
	public String code;
	public Integer position;
	
	public MorseSymbol (String name, String code, Integer position) {
		this.name=name==null? "": name.toUpperCase();
		this.code=code;
		this.position=position;
	}
}
