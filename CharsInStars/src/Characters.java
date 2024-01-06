
public class Characters {
	String charName;
	String caseName;
	Integer rows;
	Integer columns;
	String[][] patt;
	
	
	public static void print(String ch) {
		Characters chars=new Characters(ch);
		Boolean shouldPrint=true;
		switch(ch) {
		case "A": {chars.setA(); break;}
		case "B": {chars.setB(); break;}
		case "C": {chars.setC(); break;}
		case "D": {chars.setD(); break;}
		case "E": {chars.setE(); break;}
		case "F": {chars.setF(); break;}
		case "G": {chars.setG(); break;}
		case "H": {chars.setH(); break;}
		case "I": {chars.setI(); break;}
		case "J": {chars.setJ(); break;}
		default: { shouldPrint=false; System.out.println("No module defined for "+ch);}
		}
		if(shouldPrint) chars.output();
	}
	
	void output() {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(patt[i][j]==null) System.out.print(" ");
				else System.out.print(patt[i][j]);
			}
			System.out.println();
		}
	}
	
	public Characters(String theCharacter) {
		if(theCharacter.length()==1) {
			setProperties(theCharacter);
		}
	}
	
	void setProperties(String theCharacter){
		charName=theCharacter;
		switch(theCharacter) {
		case "A":{ caseName=Cons.UPPER_CASE; rows=5; columns=9; break;}
		case "B":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "C":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "D":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "E":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "F":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "G":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "H":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "I":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "J":{ caseName=Cons.UPPER_CASE; rows=5; columns=7; break;}
		case "K":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "L":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "M":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "N":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "O":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "P":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "Q":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "R":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "S":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "T":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "U":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "V":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "W":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "X":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "Y":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		case "Z":{ caseName=Cons.UPPER_CASE; rows=5; columns=5; break;}
		
		case "a":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "b":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "c":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "d":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "e":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "f":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "g":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "h":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "i":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "j":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "k":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "l":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "m":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "n":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "o":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "p":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "q":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "r":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "s":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "t":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "u":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "v":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "w":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "x":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "y":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		case "z":{ caseName=Cons.LOWER_CASE; rows=5; columns=5; break;}
		
		case "0":{ caseName=Cons.NUMBER_CASE; rows=5; columns=5; break;}
		case "1":{ caseName=Cons.NUMBER_CASE; rows=5; columns=5; break;}
		case "2":{ caseName=Cons.NUMBER_CASE; rows=5; columns=5; break;}
		case "3":{ caseName=Cons.NUMBER_CASE; rows=5; columns=5; break;}
		case "4":{ caseName=Cons.NUMBER_CASE; rows=5; columns=5; break;}
		case "5":{ caseName=Cons.NUMBER_CASE; rows=5; columns=5; break;}
		case "6":{ caseName=Cons.NUMBER_CASE; rows=5; columns=5; break;}
		case "7":{ caseName=Cons.NUMBER_CASE; rows=5; columns=5; break;}
		case "8":{ caseName=Cons.NUMBER_CASE; rows=5; columns=5; break;}
		case "9":{ caseName=Cons.NUMBER_CASE; rows=5; columns=5; break;}
		
		default: { caseName=null; rows=0; columns=0;};
		}
		
		patt=new String[rows][columns];
	}
	
	void set(Integer rowsToSet, Integer columnToSet) {
		patt[rowsToSet-1][columnToSet-1]=Cons.SYMBOL;
	}
	
	public void setA(){
		set(1, 5);
		set(2, 4); set(2, 6);
		set(3, 3); set(3, 4); set(3, 5); set(3, 6); set(3, 7);
		set(4, 2); set(4, 8);
		set(5, 1); set(5, 9);
	}
	
	public void setB(){
		set(1, 1); set(1, 2); set(1, 3); set(1, 4);
		set(2, 1); set(2, 5);
		set(3, 1); set(3, 2); set(3, 3); set(3, 4);
		set(4, 1); set(4, 5);
		set(5, 1); set(5, 2); set(5, 3); set(5, 4);
	}
	
	public void setC(){
		set(1, 1); set(1, 2); set(1, 3); set(1, 4); set(1, 5);
		set(2, 1);
		set(3, 1);
		set(4, 1);
		set(5, 1); set(5, 2); set(5, 3); set(5, 4); set(5,5);
	}
	
	public void setD(){
		set(1, 1); set(1, 2); set(1, 3); set(1, 4); 
		set(2, 1); set(2, 5);
		set(3, 1); set(3, 5);
		set(4, 1); set(4, 5);
		set(5, 1); set(5, 2); set(5, 3); set(5, 4); 
	}
	
	public void setE(){
		set(1, 1); set(1, 2); set(1, 3); set(1, 4); set(1, 5); 
		set(2, 1);
		set(3, 1); set(3, 2); set(3, 3); set(3, 4); set(3, 5);
		set(4, 1);
		set(5, 1); set(5, 2); set(5, 3); set(5,4); set(5,5); 
	}
	
	public void setF(){
		set(1, 1); set(1, 2); set(1, 3); set(1, 4); set(1, 5); 
		set(2, 1);
		set(3, 1); set(3, 2); set(3, 3);
		set(4, 1);
		set(5, 1);
	}
	
	public void setG(){
		set(1, 1); set(1, 2); set(1, 3); set(1, 4); set(1, 5); 
		set(2, 1);
		set(3, 1); set(3, 3); set(3, 4); set(3, 5);
		set(4, 1); set(4, 5);
		set(5, 1); set(5, 2); set(5, 3); set(5,4); set(5, 5); 
	}
	
	public void setH(){
		set(1, 1); set(1,5); 
		set(2, 1); set(2, 5);
		set(3, 1); set(3, 2); set(3, 3); set(3, 4); set(3, 5);
		set(4, 1); set(4, 5);
		set(5, 1); set(5,5); 
	}
	
	public void setI(){
		set(1, 1); set(1, 2); set(1, 3); set(1, 4); set(1, 5);
		set(2, 3);
		set(3, 3);
		set(4, 3);
		set(5, 1); set(5, 2); set(5, 3); set(5,4); set(5,5); 
	}
	
	public void setJ(){
		set(1, 1); set(1, 2); set(1, 3); set(1, 4); set(1, 5); set(1, 6); set(1, 7); 
		set(2, 4);
		set(3, 4);
		set(4, 1); set(4, 4);
		set(5, 2); set(5, 3);
	}
	
	
	
	
}
