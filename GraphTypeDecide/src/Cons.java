import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Cons {
	public static final Set<String> ALL_TYPES=new HashSet<String>(Arrays.asList("Node","Edge","Graph"));
	static final String SEPARATOR="==========";
	static final String RESET = "\u001B[0m";
	static final String BLACK = "\u001B[30m";
	static final String RED = "\u001B[31m";
	static final String GREEN = "\u001B[32m";
	static final String YELLOW = "\u001B[33m";
	static final String BLUE = "\u001B[34m";
	static final String PURPLE = "\u001B[35m";
	static final String CYAN = "\u001B[36m";
	static final String WHITE = "\u001B[37m";
	
	public static void print(String message) {
		System.out.print(message);
	}
	
	public static void print() {
		System.out.println();
	}
	
	public static void printNode(String message) {
		System.out.print(RED + message + RESET);
	}
	
	public static void printEdge(String message) {
		System.out.println(YELLOW + message + RESET);
	}
	
	public static void separate(){
		System.out.println(SEPARATOR);
	}
	
	
}
