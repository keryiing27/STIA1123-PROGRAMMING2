package Asst2;

public class AdvertiseMarketing extends WeddingRentalCentre{ // 2.1 Inheritance // Subclass of WeddingRentalCentre
	
	private double discount, price;
	
	public AdvertiseMarketing(String n, int p, String a, String w) { // Constructor with 4 arguments
		super(n,p,a,w);
		
		price = 1599;
		discount = 0.2;
		printInfo(); //call method printInfo()
		adsInfo(price,discount); //call method adsInfo(double price,double discount)
	}
	
	public void printInfo() { //2.2 Polymorphism
		System.out.println("===WELCOME TO " + super.companyName + "===" );
		System.out.println("Contact No : +60" + super.companyPhoneNum);
		System.out.println("Address    : " + super.companyAdd);
		System.out.println("Website    : " + super.website);
		System.out.println();
	}
	public void adsInfo(double price, double discount) { // method with 2 arguments
		System.out.println("!! Cheapest Wedding Gown and Suit Rental Here!!");
		System.out.printf("Basic Wedding Rental Package only RM %.2f%n", price);
		System.out.printf("!! This Month Promotion !!%nGet Up To %.0f%% Discount For Offered Packages Now !%n", discount*100);
		System.out.println("* Terms and Condition Apply *");
	}
}
