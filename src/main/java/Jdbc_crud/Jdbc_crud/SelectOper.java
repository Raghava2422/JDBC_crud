package Jdbc_crud.Jdbc_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectOper {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
	    
	    String url = "jdbc:postgresql://localhost:5432/Base1";
	    String user = "postgres";
	    String pass = "2422";
	   
	    //connection
	    Connection con = DriverManager.getConnection(url,user,pass);
	    
	    //Query
	    String s = "select*from bikes where owner ='Nag' ";
	    // String s = "select distinct * from bikes order by sno";
	    
	    
	    
	    
	    Statement stat=con.createStatement();
	      ResultSet rs=stat.executeQuery(s);
	      rs.next();
	      String name=rs.getString("names");
	      System.out.println(name);
	      stat.close();
	}

}
