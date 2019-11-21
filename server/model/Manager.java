package server.model;

public class Manager extends Person {

	private Report report;
	
	public Manager(Name n, Address ad, BirthDate bd) {
		super(n, ad, bd);
		// TODO Auto-generated constructor stub
	}

	public Report generateReport() {
		
		return new Report();
		
		
	}
public void printtest() {
		
		System.out.println(" in Manager");
	}

	
}
