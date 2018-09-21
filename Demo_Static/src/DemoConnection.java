import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
      try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//System.out.println("Driver loaded successfully");
		DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CITI", "sa","sa123" );
		
		
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
