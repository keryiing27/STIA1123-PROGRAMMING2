package Asst1;

public class WeddingRentalCentre { //superclass
	
	private String companyName;
	private int companyPhoneNum;
	private String companyAdd;
	private String website;
	
	public WeddingRentalCentre(String n, int p, String a, String w) { //1.4 constructor with 4 arguments
		this.companyName = n;
		this.companyPhoneNum = p;
		this.companyAdd = a;
		this.website = w;
		
		printInfo();
	}
	public void printInfo() { //method without argument //method to print details of wedding rental centre
		System.out.println("===WELCOME TO " + companyName + "===" );
		System.out.println("Contact No : +60" + companyPhoneNum);
		System.out.println("Address    : " + companyAdd);
		System.out.println("Website    : " + website);
	}

}
