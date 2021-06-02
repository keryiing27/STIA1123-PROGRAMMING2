package Asst1;

public class AdvertiseMarketing { // 1.3 User defined class
	
	private double discount, price;
	
	public AdvertiseMarketing() { //1.4 Constructor without argument
		
		price = 1599;
		discount = 0.2;
		
		printInfo(price,discount);
	}
	
	public void printInfo(double price, double discount) { // method with 2 arguments
		System.out.println("!! Cheapest Wedding Gown and Suit Rental Here!!");
		System.out.printf("Basic Wedding Rental Package only RM %.2f%n", price);
		System.out.printf("!! This Month Promotion !!%nGet Up To %.0f%% Discount For Offered Packages Now !%n", discount*100);
		System.out.println("* Terms and Condition Apply *");
	}
}
