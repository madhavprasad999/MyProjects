import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

public class ResponseForAWord {
	String word;
	WordDetail[] wordDetails;
	
	class Error{
		String title;
		String message;
		String resolution;
	}
	
	Error error;
	String body;
	
	ResponseForAWord(String word){
		this.word=word;
		APIHandler ap=new APIHandler();
		String response=ap.getResponse(word);
		body=response;
		processWordMeaning();
	}
	
	void processWordMeaning() {
		GsonBuilder builder=new GsonBuilder();
		Gson gsonJson=builder.create();
		try {
			wordDetails=gsonJson.fromJson(body, WordDetail[].class);
		}
		catch(JsonSyntaxException jsonException) {
			wordDetails=null;
			try {
				error=gsonJson.fromJson(body, Error.class);
			}
			catch(JsonSyntaxException jsonExceptionAgain) {
				error=new Error();
				error.title="404";
				error.message="It seems that you did not provide any word to search.";
				error.resolution="Make sure your word is not a blank word.";
			}
		}
	}
	
	void printResult(){
		if(wordDetails==null) {
			Util.print(error.message);
			Util.print("Suggested Solution: "+ error.resolution);
			return;
		}
		
		Util.print("We looked up the word: <"+word +">. ");
		if(wordDetails.length>1) {
			Util.print("We found " + wordDetails.length + " results.\n");
		}
		else {
			Util.print("We found 1 result.\n");
		}
		
		Integer counter=1;
		for(WordDetail eachDefinition: wordDetails) {
			Util.print("================\n");
			Util.print("Result number: "+ counter+++"\n");
			if(isAvaliable(eachDefinition.word)) {
				Util.print("Word: "+eachDefinition.word+"\n");
			}
			if(isAvaliable(eachDefinition.phonetic)) {
				Util.print("Phonetic: "+eachDefinition.phonetic+"\n");
			}
			if(isAvailable(eachDefinition.phonetics)) {
				Util.print("Phonetics");
				//To-Do: Complete printing stuff.
			}
		}
	}
	
	private boolean isAvailable(WordDetail.Phoenetic[] phonetics) {
		if(phonetics!=null) {
			return phonetics.length>0;
		}
		else {
			return false;
		}
	}

	Boolean isAvaliable(String str) {
		if(str!=null) {
			return str.length()>0;
		}
		else {
			return false;
		}
	}
	
	
}
