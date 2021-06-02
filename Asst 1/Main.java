package Asst1;

public class Main {

	public static void main(String [] args) {
		
		WeddingRentalCentre wrc = new WeddingRentalCentre("ROMANCE WEDDING", 165823014, "2-2-25J Wisma Rampai Jln 34/26 Taman Sri Rampai 53300 Setapak Wilayah Persekutuan Kuala Lumpur", "www.romancewedding.com.my");
		System.out.println();
		
		AdvertiseMarketing adsM = new AdvertiseMarketing();
		System.out.println();
	
		System.out.println("=== Product & Package Description ===");
		WeddingPackageType gown = new WeddingPackageType("Wedding Gown", "Blue");
		System.out.println(gown.printWeddingGown());
	
		WeddingPackageType suit = new WeddingPackageType("Wedding Suit", "Black");
		System.out.println(suit.printWeddingSuit());
	
		WeddingPackageType wedPackage = new WeddingPackageType("Wedding Suit", "Black");
		System.out.println(wedPackage.printWeddingPackage());
		
		Customer cus = new Customer();
		System.out.println();
		
		Employees e = new Employees();
		System.out.println(); 
		
		Sales s = new Sales(863.24);
		System.out.println();
		
		Finance f = new Finance(25897.2, 9852.50, 150.20, 556.10, 432.05);
		System.out.println();
	}
}
