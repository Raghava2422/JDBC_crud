package Jdbc_crud.Jdbc_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("org.postgresql.Driver");
		
		String url="jdbc:postgresql://localhost:5432/Base1";
		String user = "postgres";
		String pass = "2422";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement stat = con.createStatement();
		String query = "update bikes set names = 'Hero' where sno=1";
	//String query = "delete from bikes where owner = 'Sai' ";
		int res=stat.executeUpdate(query);
		System.out.println("successfully update");
		//System.out.println("Successfully delete");
		con.close();
		
		
	}

}
