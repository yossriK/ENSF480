package server.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import server.model.Datab;
public class Renter extends Person{
	
	Connection myConnection;
	
	
	
	
	public Renter(Name n, Address ad, BirthDate bd) throws SQLException {
		super(n, ad, bd);
		 myConnection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ensf480_testshcema", "yossri", "student");

		// TODO Auto-generated constructor stub
	}

	public String listAll() throws SQLException {
		Connection myconnection = null;
		System.out.println("in renter list all");
		String s="";
		
		Statement myStmt= myConnection.createStatement();
		ResultSet myRs = myStmt.executeQuery(" select * from properties");
		
		while (myRs.next()) {
			
			s += "property number: "+myRs.getInt("property number")+ ", listing price: " + myRs.getInt("list price")+", location: " + myRs.getString("location")+" \0";
			System.out.println(s);
		
		}
		
		return s;
		
	}
	
	
	public String Search(String recieved) throws SQLException {
		Statement myStmt= myConnection.createStatement();
		String sendBack="";
		String [] temp=recieved.split(","); // 1 propertytype, 2 bedrom, 3bath, 4 furnish, 5cityquad, 
		String query="SELECT * FROM properties WHERE ";
		if(temp[1]!="*") {
			query+="propertyType="+temp[1]+" AND ";
		}
		if(temp[2]!="*") {
			query+="nomBedroom="+temp[2]+" AND ";
		}
		if(temp[3]!="*") {
			query+="nomBathroom="+temp[3]+" AND ";
		}
		if(temp[4]!="*") {
			query+="furnished="+temp[4]+" AND ";
		}
		if(temp[5]!="*") {
			query+="cityQuadrent="+temp[5];
		}
		
		ResultSet myRs = myStmt.executeQuery(query);
		
		while (myRs.next()) {
			
			sendBack += "property number: "+myRs.getInt("property number")+ ", listing price: " + myRs.getInt("list price")
					+ ", cityQuadrent: " + myRs.getString("cityQuadrent")+", propertyType: " + myRs.getString("propertyType")+""
							+ ", nomBedroom: " + myRs.getString("nomBedroom")+", nomBathroom: " + myRs.getString("nomBathroom")+
							", furnished: " + myRs.getString("furnished")+" \0";
			
		
		}
		
		
		return sendBack;
	}

}
