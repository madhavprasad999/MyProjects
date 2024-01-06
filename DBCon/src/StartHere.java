import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StartHere {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/workmgmtdb";
		 String username = "root";
		 String password = "Commitment@12";

		 System.out.println("Connecting database...");
		 Connection connection=null;
		 try {
			 connection = DriverManager.getConnection(url, username, password);
		     System.out.println("Database connected!");
		     Statement stmt=connection.createStatement();
		     ResultSet rs=stmt.executeQuery("SELECT Name FROM Department");
		     while(rs.next()) {
		    	 System.out.println(rs.getString("Name"));
		     }
		     connection.close();
		     System.out.println("Database disconnected!");
		 } catch (SQLException e) {
		     throw new IllegalStateException("Cannot connect the database!", e);
		 }

	}

}
