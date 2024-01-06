import java.util.List;

public class Cons {
	public static final String FILE_PATH="inventory.json";
	public static List<Inventory> allInventories;
	
	public static void debug(Object o) {
		System.out.print("DEBUG|"+System.nanoTime() + "|");
		System.out.print(Thread.currentThread().getStackTrace()[2].getLineNumber()+"|");
		System.out.println(o);
	}
	
	
}
