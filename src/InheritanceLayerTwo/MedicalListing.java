package InheritanceLayerTwo;

import InheritanceLayerOne.Listing;

public class MedicalListing extends Listing{
	
	protected Boolean bookingAvailability;
	protected int numberVeterinarian;
	protected int patientCount;
	
	public MedicalListing( double income, double expenses, double revenue,
			String listingName, String listingType) {
		super( income, expenses, revenue, listingName, listingType);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "MedicalListing [bookingAvailability=" + bookingAvailability + ", numberVeterinarian="
				+ numberVeterinarian + ", patientCount=" + patientCount + "]";
	}
	
	
	
	

	
	
	


	
	

}
