
public class Tokens {
	private String tokenName;
	private Integer value;
	
	Tokens(String t){
		if(t.length()>1) tokenName=null;
		else {
			getValueOutOfChar(t.charAt(0));
		}
	}
	
	Tokens(char t){
		getValueOutOfChar(t);
	}
	
	void getValueOutOfChar(char t){
		switch(t){
		case '0': tokenName="0"; break;
		case '1': tokenName="1"; break;
		case '2': tokenName="2"; break;
		case '3': tokenName="3"; break;
		case '4': tokenName="4"; break;
		case '5': tokenName="5"; break;
		case '6': tokenName="6"; break;
		case '7': tokenName="7"; break;
		case '8': tokenName="8"; break;
		case '9': tokenName="9"; break;
		case'.': tokenName="."; break;
		default: tokenName=null;
		}
	}
	
	public Integer getValue() {
		switch(tokenName){
		case "0": value=0; break;
		case "1": value=1; break;
		case "2": value=2; break;
		case "3": value=3; break;
		case "4": value=4; break;
		case "5": value=5; break;
		case "6": value=6; break;
		case "7": value=7; break;
		case "8": value=8; break;
		case "9": value=9; break;
		case ".": value=-1; break;
		default: value=null;
		}
		return value;
	}
	
	public Boolean isDecimal() {
		return tokenName==".";
	}
	
	
	
}
