package InheritanceLayerOne;

import java.util.Scanner;

public abstract class Listing {

	protected int listingId;
	protected double income;
	protected double expenses;
	protected double revenue;
	protected String listingName;
	protected String listingType;
	
	
	public Listing(double income, double expenses,
	double revenue, String listingName,String listingType)
	{
		this.listingId = listingId;
		this.listingType = listingType;
		this.listingName = listingName;
		this.income = income;
		this.expenses = expenses;
		this.revenue = revenue;


	}

	
	public int getListingId() {
		return listingId;
	}


	public void setListingId(int listingId) {
		this.listingId = listingId;
	}


	public double getIncome() {
		return income;
	}


	public void setIncome(double income) {
		this.income = income;
	}


	public double getExpenses() {
		return expenses;
	}


	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}


	public String getListingName() {
		return listingName;
	}


	public void setListingName(String listingName) {
		this.listingName = listingName;
	}


	public String getListingType() {
		return listingType;
	}


	public void setListingType(String listingType) {
		this.listingType = listingType;
	}


	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	
	public double getRevenue(double revenue) {
		return revenue;
	}


	public Boolean checkId(int listingId)
	{
		return true;
	}
	


	@Override
	public String toString() {
		return "Listing [listingId=" + listingId + ", income=" + income + ", expenses=" + expenses + ", revenue="
				+ revenue + " , listingName=" + listingName + ", listingType="
				+ listingType + "]";
	}

	


}
