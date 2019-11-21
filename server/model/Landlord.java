package server.model;

public class Landlord  extends Person{

	
	
	public Landlord(Name n, Address ad, BirthDate bd) {
		super(n, ad, bd);
		// TODO Auto-generated constructor stub
	}

	/*
	// when opted, it creates new property, gotta have arguments
	 * this will be called from controller and populated using gui stuff	
	*/
	public Property createProperty(String pT, int nb, int nw, boolean fur, String cq) {
		Property p= new Property(pT, nb,  nw,  fur, cq);
		
		return p;
		
	}
	
	/*
	 * taking the data of property instance and add it to data base.
	 * 
	 */
	public void registerProperty(Property p) {
		
		
		
	
		
	}
	
	public void makePayment() {
		
		
		
		
	}
public void printtest() {
		
		System.out.println(" in Landlord");
	}

}
