package InheritanceLayerTwo;

import InheritanceLayerOne.Listing;
import java.util.Scanner;

public class NormalListing extends Listing{

	protected int numberWorker;

	
	public NormalListing(double income, 
	double expenses, double revenue, int squaremeters,String listingName, String listingType) {
		
		super( income, expenses, revenue, listingName, listingType);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "NormalListing [numberWorker=" + numberWorker + "]";
	}
	

}
