import java.util.ArrayList;
import java.util.List;

public class NumberProcessor {
	String originalString;
	Boolean containsDecimal;
	String errorMessage;
	String sWholePart;
	String sFractionPart;
	
	List<NumberFormat> numbers;
	
	NumberProcessor(String originalString){
		if(originalString.startsWith(".")) {
			this.originalString="0"+originalString;
		}
		else if(originalString.endsWith(".")) {
			this.originalString=originalString+"0";
		}
		else {
			this.originalString=originalString;
		}
		
		errorMessage=null;
		containsDecimal=null;
		sWholePart=null;
		sFractionPart=null;
		validateNumber();
	}
	
	
	void validateNumber() {
		long numberOfDecimals = originalString.chars().filter(ch -> ch == '.').count();
		containsDecimal = numberOfDecimals==1;
		if(numberOfDecimals>1) {
			errorMessage="This is not a valid number. There are more than 1 Decimals.";
			return;
		}
		
		Boolean hasValidTokens=validateTokens();
		if(!hasValidTokens) {
			errorMessage="It seems there are some non-numeric characters.";
			return;
		}
		
		if(containsDecimal) {
			String[] splits=originalString.split("\\.");
			
			if(splits[0]!=null) {
				sWholePart=splits[0];
			}
			
			if(splits[1]!=null) {
				sFractionPart=splits[1];
			}
		}
		else {
			sWholePart=originalString;
			sFractionPart=null;
		}
		
		processNumber();
	}
	
	void processNumber() {
		numbers=new ArrayList<NumberFormat>();
		
		if(sWholePart!=null) {
			StringBuilder wholePartrAsString=new StringBuilder();
			wholePartrAsString.append(sWholePart);
			wholePartrAsString.reverse();
			for(int i=0;i<wholePartrAsString.length(); i++) {
				Tokens t = new Tokens(wholePartrAsString.charAt(i));
				NumberFormat nf=new NumberFormat(t.getValue(),i);
				numbers.add(nf);
			}
		}
		
		if(sFractionPart!=null) {
			StringBuilder fractionPartAsString=new StringBuilder();
			fractionPartAsString.append(sFractionPart);
			Integer counter=-1;
			for(int i=0;i<fractionPartAsString.length();i++) {
				Tokens t = new Tokens(fractionPartAsString.charAt(i));
				NumberFormat nf=new NumberFormat(t.getValue(),counter);
				numbers.add(nf);
				counter--;
			}
		}
		
	}
	
	Boolean validateTokens() {
		for(String eachChar: originalString.split("")) {
			Tokens t = new Tokens(eachChar);
			if(t.getValue()==null) {
				return false;
			}
		}
		return true;
	}
	
	public Boolean isValidNumber() {
		return sWholePart!=null || sFractionPart!=null;
	}
	
	public Double getValue() {
		Double result=0.0;
		for(NumberFormat nf: numbers) {
			result+= nf.faceValue*Math.pow(10, nf.position);
		}
		return result;
	}

}
