package Asst2;

public class WeddingPackageType { //superclass of Customer
	
	private String productName, color, size;
	
	public WeddingPackageType() { // Constructor without argument
		setSize("S, M, L, Plus Size");
		
	}
	
	public String printWeddingGown() { //method without argument
		setProductName("Wedding Gown");
		setColor("White, Blue, , Black, Ivory, Lavender, Gold, Silver, Grey");
		return "=== " + this.getProductName() +" ===\n" +
				"Color     : "+ this.getColor() + "\n" +
				"Size      : " + this.getSize() +
				"\nStyle     : Beach, Boho, Lace, Long Sleeves, Simple, Sparkly\n" +
				"Silhoutte : A-Line, Mermaid & Column, Princess\n" ;
	}
	
	public String printWeddingSuit() { //method without argument
		setProductName("Wedding Suit");
		setColor("Black, Navy Blue, Grey, Light Grey, Light Brown");
		return "=== " + this.getProductName() + " ===\n" +
			   "Color  : " + this.getColor() +
			   "\nSize   : " + this.getSize() + "\n"
			   + "Type   : Morning dress, Tailcoats, Tuxedo, Three-piece suit";
	}
	public String printWeddingPackage() { //method without argument
				//basic package without photography session 
				//small fees will be charged when rentPeriod over 2 days
		return "\n===Package 1===\n" +  
				"-2 set wedding gown \n"
				+ "-2 set wedding suit \n" +
				">>Price : RM 1599<<\n\n" + 
				
				"===Pacakge 2 (Pre-Wedding)=== \n" + 
				"-3 set wedding gown \n"
				+ "-3 set wedding suit \n" +
				"-1 premium designer jewelry set\n"
				+ "-Local indoor shooting\n"+
				"-1 wedding album and 40 edited photo(given in soft copies)\n" + 
				"-Makeup artist accompany customer to every location and 3 styles of makeup  " + 
				"\n>>Price : RM 3999<<\n\n" + 
				
				"===Pacakge 3 (Actual Wedding)===\n" +   //without photography session
				"-2 set new arrival wedding gown \n"
				+ "-1 set new arrival wedding suit \n" +
				"-1 premium designer jewelry set\n" + 
				">>Price : RM 1899<<\n\n" + 
				
				"===Premium Package=== \n" +  
				"All In One--Pre-Wedding | Actual Wedding\n\n" +
				
				"**Local Pre-Wedding Shooting Session** \n-"
				+ "Local indoor/outdoor photography\n"+ 
				"-5 set wedding gown \n"
				+ "-5 set wedding suit \n"
				+ "-1 wedding album and 50 edited photo(given in soft copies)\n" +
				"-1 premium designer jewelry set\n"
				+ "Makeup artist accompany customer to every location and 3 styles of makeup\n" 
				+ "! Transportation & Accomodation For Outstation will be Charged !\n" 
				
				+"\n**Actual Wedding**\n" +
				"-3 set new arrival wedding gown \n-3 set new arrival wedding suit \n" +
				"-1 premium designer jewelry set\n-2 makeup sessions provided\n" + 
				"\n*Actual Day Photography Session included*\n"
				+ "-1 Wedding morning ceremony\n"
				+ "-1 Wedding Dinner reception\n"
				+ "-One professional photographer\n"
				+ "-At least 810 high resolution photos\n"
				+ "-Photo editing\n"
				+ "-Same day edit video\n"
				+ "-5 hours editing time needed (To be broadcast on wedding dinner)\n"
				+ "-Photos to be delivered in 4 weeks\n"
				+ "-Photos returned are in high resolution\n"
				+ "-Free 16GB thumb drive and free postage\n" +
				">>Price : RM 9999<<" ;
		
	}
	
	public void printInfo() { //2.2 Polymorphism
		System.out.println("=== Product & Package Description ===");
	}
	
	//2.3 Encapsulation
	public void setProductName(String name) { //setter method
		this.productName = name;
	}
	
	public void setColor(String color) { //setter method
		this.color = color;
	}
	
	public void setSize(String s) { //setter method
		this.size = s;
	}
	public String getProductName() { //getter method
		return this.productName;
	}
	
	public String getColor() { //getter method
		return this.color;
	}
	
	public String getSize() { //getter method
		return this.size;
	}
}
