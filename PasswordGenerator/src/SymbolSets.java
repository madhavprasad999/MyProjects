import java.util.ArrayList;
import java.util.List;

public class SymbolSets {
	public static List<Symbol> generateUpperCase(){
		List<Symbol> upperCase=new ArrayList<Symbol>();
		upperCase.add(new Symbol("UpperCase","A",1));
		upperCase.add(new Symbol("UpperCase","B",2));
		upperCase.add(new Symbol("UpperCase","C",3));
		upperCase.add(new Symbol("UpperCase","D",4));
		upperCase.add(new Symbol("UpperCase","E",5));
		upperCase.add(new Symbol("UpperCase","F",6));
		upperCase.add(new Symbol("UpperCase","G",7));
		upperCase.add(new Symbol("UpperCase","H",8));
		upperCase.add(new Symbol("UpperCase","I",9));
		upperCase.add(new Symbol("UpperCase","J",10));
		upperCase.add(new Symbol("UpperCase","K",11));
		upperCase.add(new Symbol("UpperCase","L",12));
		upperCase.add(new Symbol("UpperCase","M",13));
		upperCase.add(new Symbol("UpperCase","N",14));
		upperCase.add(new Symbol("UpperCase","O",15));
		upperCase.add(new Symbol("UpperCase","P",16));
		upperCase.add(new Symbol("UpperCase","Q",17));
		upperCase.add(new Symbol("UpperCase","R",18));
		upperCase.add(new Symbol("UpperCase","S",19));
		upperCase.add(new Symbol("UpperCase","T",20));
		upperCase.add(new Symbol("UpperCase","U",21));
		upperCase.add(new Symbol("UpperCase","V",22));
		upperCase.add(new Symbol("UpperCase","W",23));
		upperCase.add(new Symbol("UpperCase","X",24));
		upperCase.add(new Symbol("UpperCase","Y",25));
		upperCase.add(new Symbol("UpperCase","Z",26));
		return upperCase;
	}
	
	public static List<Symbol> generateLowerCase(){
		List<Symbol> lowerCase=new ArrayList<Symbol>();
		lowerCase.add(new Symbol("LowerCase","a",1));
		lowerCase.add(new Symbol("LowerCase","b",2));
		lowerCase.add(new Symbol("LowerCase","c",3));
		lowerCase.add(new Symbol("LowerCase","d",4));
		lowerCase.add(new Symbol("LowerCase","e",5));
		lowerCase.add(new Symbol("LowerCase","f",6));
		lowerCase.add(new Symbol("LowerCase","g",7));
		lowerCase.add(new Symbol("LowerCase","h",8));
		lowerCase.add(new Symbol("LowerCase","i",9));
		lowerCase.add(new Symbol("LowerCase","j",10));
		lowerCase.add(new Symbol("LowerCase","k",11));
		lowerCase.add(new Symbol("LowerCase","l",12));
		lowerCase.add(new Symbol("LowerCase","m",13));
		lowerCase.add(new Symbol("LowerCase","n",14));
		lowerCase.add(new Symbol("LowerCase","o",15));
		lowerCase.add(new Symbol("LowerCase","p",16));
		lowerCase.add(new Symbol("LowerCase","q",17));
		lowerCase.add(new Symbol("LowerCase","r",18));
		lowerCase.add(new Symbol("LowerCase","s",19));
		lowerCase.add(new Symbol("LowerCase","t",20));
		lowerCase.add(new Symbol("LowerCase","u",21));
		lowerCase.add(new Symbol("LowerCase","v",22));
		lowerCase.add(new Symbol("LowerCase","w",23));
		lowerCase.add(new Symbol("LowerCase","x",24));
		lowerCase.add(new Symbol("LowerCase","y",25));
		lowerCase.add(new Symbol("LowerCase","z",26));
		return lowerCase;
	}
	
	public static List<Symbol> generateNumbers(){
		List<Symbol> numbers=new ArrayList<Symbol>();
		numbers.add(new Symbol("Number","0",1));
		numbers.add(new Symbol("Number","1",2));
		numbers.add(new Symbol("Number","2",3));
		numbers.add(new Symbol("Number","3",4));
		numbers.add(new Symbol("Number","4",5));
		numbers.add(new Symbol("Number","5",6));
		numbers.add(new Symbol("Number","6",7));
		numbers.add(new Symbol("Number","7",8));
		numbers.add(new Symbol("Number","8",9));
		numbers.add(new Symbol("Number","9",10));
		return numbers;
	}
	
	public static List<Symbol> generateSpecialCharacters(){
		List<Symbol> specialCharacter=new ArrayList<Symbol>();
		specialCharacter.add(new Symbol("SpecialCharacter","!",1));
		specialCharacter.add(new Symbol("SpecialCharacter","@",2));
		specialCharacter.add(new Symbol("SpecialCharacter","#",3));
		specialCharacter.add(new Symbol("SpecialCharacter","$",4));
		specialCharacter.add(new Symbol("SpecialCharacter","%",5));
		specialCharacter.add(new Symbol("SpecialCharacter","^",6));
		specialCharacter.add(new Symbol("SpecialCharacter","*",7));
		specialCharacter.add(new Symbol("SpecialCharacter","_",8));
		specialCharacter.add(new Symbol("SpecialCharacter","-",8));
		return specialCharacter;
	}
}