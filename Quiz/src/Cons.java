import java.util.List;

public class Cons {
	public static void debug(Object o) {
		System.out.print("DEBUG|["+Thread.currentThread().getStackTrace()[2].getLineNumber()+"]|"+System.nanoTime()+"|");
		System.out.println(o);
	}
	
	public static List<QnA> allEntries;
	public static String FILENAME="src/source.xml";
}
