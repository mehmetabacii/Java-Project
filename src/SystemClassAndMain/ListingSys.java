package SystemClassAndMain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import InheritanceLayerOne.Listing;
import InheritanceLayerTwo.MedicalListing;
import InheritanceLayerTwo.NormalListing;

public class ListingSys{
	
	
	private static String listingName;
	private static String listingType;
	private static int listingId;
	private static Double revenue;
	private static Double income;
	private static Double expense;
	
	private final double effectivenessConstant = 10; 
	
    private static TreeSet<Listing> sortedListingTree = new TreeSet();
	public static ArrayList<Listing> arrList=new ArrayList<>();

	
	public static boolean removeListing(int id) {
		for(int i=0;i<arrList.size();i++) {
			if(arrList.get(i).getListingId()==id) {
				arrList.remove(i);
				return true;
				}			
			}
		return false;
	}
	
	
	public static TreeSet<Listing> getListingSet() {
        return sortedListingTree;
    }
	


	
	public static boolean addListing(double income, double expenses,double revenue,String listingName,String listingType, int squareMeters) 
	{
		if(listingType.equalsIgnoreCase("Medical Listing")) {
			return sortedListingTree.add(new MedicalListing(income, expenses, revenue, listingName, listingType));
		}else
			return sortedListingTree.add(new NormalListing( income, expenses, revenue, squareMeters, listingType, listingName));
		
		/*listingType = "";
		Scanner sc = new Scanner(System.in);
		
		
		if (listingType.equalsIgnoreCase("Medical")) 
		{
            return sortedListingTree.add(new MedicalListing(listingId, income, expense, revenue, listingName, listingType));
        } 
		else if(listingType.equalsIgnoreCase("Normal"))
		{
            return sortedListingTree.add(new NormalListing(listingId, income, expense, revenue, listingId, listingName, listingType));
        }	
		else
			return false;
			
		*/	
	}
	
	public static int nbOfListing()
	{
		int arrLength = sortedListingTree.size();
		return arrLength;
	}
	
	public static Listing search(int id) {
        //With the iterator
        Iterator<Listing> i = arrList.iterator();
        while (i.hasNext()) {
            Listing g = i.next();
            if (g.getListingId() == id) {
                return g;
            }
        }

        return null;
    }
	

    public static String displayAll() {

        TreeSet<Listing> ts = new TreeSet();
        ts.addAll(arrList);
        String res = "";
        for (Listing g : ts) {
            res += g.toString() + "\n\n";
        }
        return res;
    }
    
    public static Double calcRevenue()
    {
    	for(int i = 0; i<arrList.size();)
    	{
    		double revenue = arrList.get(i).getRevenue(i);
    		revenue = arrList.get(i).getIncome()-arrList.get(i).getExpenses();
    		return revenue;
    	}
    	return 0.0;
    }
    
    public static double effectiveness() //This will be improved
    {
    	double effectivenessPoint;
    	 
    	effectivenessPoint = arrList.get(0).getIncome()/arrList.get(0).getExpenses();
    	
    	return effectivenessPoint;
    }
    
	
	
	public int idGen() {

	    int id = this.listingName.hashCode() + this.listingType.hashCode();
	    int length = String.valueOf(id).length();
	    int Max_Length = 5;
	    if(String.valueOf(id).length()>Max_Length) 
	    {
	        id = (int) (id /Math.pow(10.0,length - Max_Length ));
	    }
	    id = this.listingId;
	    
	    return listingId;
	
	}
	

}
