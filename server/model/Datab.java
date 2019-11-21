package server.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Datab {
	static Connection myconnection;
	public Datab() {
	try {
		myconnection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ensf480_testshcema", "root", "root");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
