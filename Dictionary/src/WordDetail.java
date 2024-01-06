
public class WordDetail {
	String word;
	String phonetic;
	Phoenetic[] phonetics;
	Meaning[] meanings;
	
	class Licence{
		String name;
		String url;
	}
	
	class Phoenetic{
		String text;
		String audio;
		String sourceUrl;
		Licence license;
	}
	
	class Definition{
		String definition;
		String[] synonyms;
		String[] antonyms;
		String example;
	}
	
	class Meaning{
		String partOfSpeech;
		Definition[] definitions;
		String[] synonyms;
		String[] antonyms;
		Licence license;
		String[] sourceUrls;
	}
	
	
	
}
