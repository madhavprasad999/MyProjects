import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StartHere {

	public static void main(String[] args) {
		String designName="Design3";
		execute(designName, 11);
	}
	
	private static void execute(String className, Integer rows) {
		String methodName="output";
		Class<?> dynamicClass=null;
		Object dynamicObject=null;
		Method outputMethod=null;
		try {
			dynamicClass = Class.forName(className);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		try {
			outputMethod=dynamicClass.getMethod(methodName, Integer.class);
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			outputMethod.invoke(dynamicObject, rows);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
