import java.util.ArrayList;
import java.util.List;

public class RandomPasswordGenerator {
	public static Rule RULE_UPPER_CASE;
	public static Rule RULE_LOWER_CASE;
	public static Rule RULE_NUMBERS;
	public static Rule RULE_SPECIAL_CHARACTERS;
	List<Rule> allActiveRules;
	
	RandomPasswordGenerator(){
		allActiveRules=new ArrayList<Rule>();
		
		RULE_UPPER_CASE=new Rule("upperCase", 0, SymbolSets.generateUpperCase());
		RULE_UPPER_CASE.activateRule();
		allActiveRules.add(RULE_UPPER_CASE);
		
		RULE_LOWER_CASE=new Rule("lowerCase", 1, SymbolSets.generateLowerCase());
		RULE_LOWER_CASE.activateRule();
		allActiveRules.add(RULE_LOWER_CASE);
		
		RULE_NUMBERS=new Rule("numbers", 2, SymbolSets.generateNumbers());
		RULE_NUMBERS.activateRule();
		allActiveRules.add(RULE_NUMBERS);
		
		RULE_SPECIAL_CHARACTERS=new Rule("specialCharacters", 3, SymbolSets.generateSpecialCharacters());
		RULE_SPECIAL_CHARACTERS.activateRule();
		allActiveRules.add(RULE_SPECIAL_CHARACTERS);
	}
	
	public String getRandomPassword(Integer lengthOfPassword) {
		String thePassword="";
		String order="";
		do{
			order=getOrder(lengthOfPassword);
		}while(order.length()==0);
		
		for(String eachOrder: order.split("_")) {
			Integer idOfRule=Integer.valueOf(eachOrder);
			Rule rule=getRuleById(idOfRule);
			thePassword+=rule.getRamdomSymbol().getName();
		}
		
		
		return thePassword;
	}
	
	Rule getRuleById(Integer ruleId) {
		Rule ruleToReturn=null;
		for(Rule rule: allActiveRules) {
			if(rule.getId()==ruleId) {
				ruleToReturn=rule;
				break;
			}
		}
		return ruleToReturn;
	}
	
	String getOrder(Integer lengthOfPassword) {
		String order="";
		List<Integer> activeRuleIds=new ArrayList<Integer>();
		
		for(Rule rule: allActiveRules) {
			if(rule.isActive()) {
				activeRuleIds.add(rule.getId());
			}
		}
		
		if(activeRuleIds.size()==0) {
			return order;
		}

		do {
			Double d=Math.random() * 1000;
			Integer wholeValue=d.intValue();
			Integer randomNumberRemainder=wholeValue%(allActiveRules.size());
			if(activeRuleIds.contains(randomNumberRemainder)) {
				order+=randomNumberRemainder+"_";
			}
		}while(order.length()<lengthOfPassword);
		
		for(Integer i: activeRuleIds){
			if(!order.contains(i.toString())) {
				return "";
			}
		}
		
		return order;
	}
	
	void debug(Object o) {
		System.out.println("DEBUG| "+ o);
	}
	
	
}
