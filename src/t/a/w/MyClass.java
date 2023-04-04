package t.a.w;

import java.sql.*;

public class MyClass {

	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost/emp";
	
	static final String user="root";
	static final String pass="";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection conn=null;
		Statement stmt=null;
	
		
		Class.forName(JDBC_DRIVER);
		
		System.out.println("Connecting to Database !!!!");
		
		conn=DriverManager.getConnection(DB_URL,user,pass);

	  System.out.println("Creating Database !!!");
	  
	  stmt=conn.createStatement();
	  
	  String sql="INSERT INTO EMP_TABLE "+
	              "VALUES (3,'www','XYZ',20)";
	  stmt.executeUpdate(sql);
	  
	  System.out.println("Data  has been inserted ..");

	}

}
