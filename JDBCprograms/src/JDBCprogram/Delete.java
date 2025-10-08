package JDBCprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) throws Exception{
		String URL = "jdbc:mysql://localhost:3306/teegala";
		String USER = "root";
		String PASSWORD = "Mysql@1234";
			
		//step-1 : load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");	
		System.out.println("The Driver is loaded successfully");
		
		//step-2 : Establising the connection
		Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
		System.out.println("Connection Established");
		
		//step-3 : statement creation
		Statement st = con.createStatement();
		
		//step-4 : execute a query
		st.executeUpdate("DELETE FROM student WHERE sname = 'seetha B'");
		System.out.println("data deleted successfully");
		
		st.close();
		con.close();

		
	}

}
