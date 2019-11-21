package server.model;

public class Property {
	
	private String propertyType;
	private int numOfBedrooms;
	private int numOfBathrooms;
	private boolean isFurnished;
	private String cityQuad;
	
	/*
	 * property 
	 */
	Property(String pT, int nb, int nw, boolean fur, String cq){
		propertyType=pT;
		numOfBedrooms=nb;
		numOfBathrooms=nw;
		isFurnished=fur;
		cityQuad=cq;
		
	}

}
