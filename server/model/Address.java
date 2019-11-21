package server.model;

public class Address {
	private String streetName;
	private String city; 
	private String country;
	private int stNo;
	
	
	public Address(String sname,String c,String ctry,int stno) {
		
		streetName=sname;
		city=c;
		country=ctry;
		stNo=stno;
	}
}
