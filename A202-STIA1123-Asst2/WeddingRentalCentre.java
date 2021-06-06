package Asst2;

public abstract class WeddingRentalCentre { //2.4 Abstraction //superclass
	
	public String companyName;
	public int companyPhoneNum;
	public String companyAdd;
	public String website;
	
	public WeddingRentalCentre(String n, int p, String a, String w) { //constructor with 4 arguments
		this.companyName = n;
		this.companyPhoneNum = p;
		this.companyAdd = a;
		this.website = w;
		
	}
	public abstract void printInfo(); //define method as abstract

}
