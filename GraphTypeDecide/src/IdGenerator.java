
public class IdGenerator {
	static Integer idNumber=0;
	
	public static String getId(String typeOfId) {
		if(!Cons.ALL_TYPES.contains(typeOfId)) return "0";
		else {
			idNumber++;
			return typeOfId+idNumber;
		}
	}
}
