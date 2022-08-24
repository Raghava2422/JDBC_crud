package Jdbc_crud.Jdbc_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertOperation {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
	 //load driver
    Class.forName("org.postgresql.Driver");
    
    String url = "jdbc:postgresql://localhost:5432/Base1";
    String user = "postgres";
    String pass = "2422";
   
    //connection
    Connection con = DriverManager.getConnection(url,user,pass);
    
    //Query
   // String query="insert into public.bikes(names,owner) values('ns','Sai')";
   // String query = "insert into tv(t_names,t_price) values ('realme',30000)";
    String q = "delete from tv where t_no= 7 ";
    
    //String order = "select*from tv order by t_no";
    
   
    
    
    //statement
    Statement stat=con.createStatement();
    
    //execute query
    
    //int result=stat.executeUpdate(query);
  int result  = stat.executeUpdate(q);
    System.out.println("done");
    //close connection
    con.close();
  }
}
