import java.util.ArrayList;
import java.util.List;

public class QnA {
	String id;
	String question;
	String answer;
	List<String> options;
	
	QnA(String id, String question, String answer, List<String> options){
		this.id=id;
		this.question=question;
		this.answer=answer;
		this.options=options;
	}
	
	List<String> shuffle(List<String> optionsToShuffle) {
		List<String> allOptions=optionsToShuffle;
		List<String> shuffledList=new ArrayList<String>();
		while(allOptions.size()!=0) {
			int randomCode=(int)(Math.random() * allOptions.size());
			String optionRemoved=allOptions.remove(randomCode);
			shuffledList.add(optionRemoved);
		}
		int randomPlace=(int)(Math.random() * allOptions.size());
		shuffledList.add(randomPlace, answer);
		return shuffledList;
	}
	
	
	
	
}
