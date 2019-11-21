package server.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import server.model.Datab;
public class Renter extends Person{
	
	
	
	
	
	
	public Renter(Name n, Address ad, BirthDate bd) {
		super(n, ad, bd);
		// TODO Auto-generated constructor stub
	}

	public String listAll() throws SQLException {
		Connection myconnection = null;
		System.out.println("in renter list all");
		String s="";
		try {
			 myconnection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ensf480_testshcema", "yossri", "student");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Statement myStmt= myconnection.createStatement();
		ResultSet myRs = myStmt.executeQuery(" select * from properties");
		
		while (myRs.next()) {
			
			s += "property number: "+myRs.getInt("property number")+ ", listing price: " + myRs.getInt("list price")+", location: " + myRs.getString("location")+" \0";
			System.out.println(s);
		
		}
		
		return s;
		
	}
	
	
	

}
