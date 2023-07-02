package Comparator;

import java.io.Serializable;
import java.util.Comparator;

import InheritanceLayerOne.Listing;

public class ListingComparator implements Comparator<Listing>,Serializable {
	public int compare(Listing l1,Listing l2)
	{
		return l1.getListingName().compareTo(l2.getListingName());
	}
}
