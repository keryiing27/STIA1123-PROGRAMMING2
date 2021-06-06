package Asst2;

public class Main {

	public static void main(String [] args) {
		
		AdvertiseMarketing adsM = new AdvertiseMarketing("ROMANCE WEDDING", 165823014, "2-2-25J Wisma Rampai Jln 34/26 Taman Sri Rampai 53300 Setapak Wilayah Persekutuan Kuala Lumpur", "www.romancewedding.com.my");
		System.out.println();
		
		
		WeddingPackageType gown = new WeddingPackageType();
		gown.printInfo();
		System.out.println(gown.printWeddingGown());
	
		WeddingPackageType suit = new WeddingPackageType();
		System.out.println(suit.printWeddingSuit());
	
		WeddingPackageType wedPackage = new WeddingPackageType();
		System.out.println(wedPackage.printWeddingPackage());
		System.out.println();
		
		Customer cus = new Customer();
		System.out.println();
		
		Employees e = new Employees();
		System.out.println(); 
		
		Finance f = new Finance(863.24, 9852.50, 150.20, 556.10, 432.05);
		System.out.println();
	}
}
