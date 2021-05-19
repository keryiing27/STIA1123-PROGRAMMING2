package EX4_6;

public class Apple extends Fruit{
	private double price, disc;
	private int quantity;
	private String color, taste;
	
	public Apple(String name, int q, double p, String t, String c) { // constructor with 3 args
		super(name);
		this.quantity = q;
		this.price = p;
		this.color = c;
		this.taste = t;
		/*
		if(this.color == null) {  //if the value of this.color != null,the method will be called
			color();
			System.out.println("Color is not detected ------ " + color());	
		}
		else {
			color();
			System.out.println("Color                       : " + color());
		}
		
		if(this.taste == null) { //if the value of this.color != null,the method will be called
			taste();
			System.out.println("Taste is not detected-- " + taste());	
		}
		else {
			taste();
			System.out.println("Taste                       : " + taste());
		}*/
		
		//call PriceOfFruits(can understand as total price) for each fruits 
		PriceOfFruits aP = new AppleTotalPrice();
		PriceOfFruits fjP = new FujiTotalPrice();
		PriceOfFruits gSP = new GrannySmithTotalPrice();
		PriceOfFruits gP = new GrapeTotalPrice();
		PriceOfFruits kP = new KiwiTotalPrice();
		
		if (this.quantity <= 5) {
			double totalPrice = p*q;
			System.out.println("**Quantity less than 5**");
			System.out.println("Total Price                 : RM "+ totalPrice);
			
			
		}
		else if((this.quantity > 5) && (this.quantity <= 100)) {
			
			//execute according name
			//totalPrice（double q） called
			if(name.equals("Apple")) { //total price of apple
				System.out.println("**Quantity more than 5**");
			System.out.printf("Total Price                 : RM %.2f%n", aP.totalPrice(q));
			}
			else if(name.equals("Fuji")) { //total price of fuji
				System.out.println("**Quantity more than 5**");
			System.out.printf("Total Price                 : RM %.2f%n", fjP.totalPrice(q));
			}
			else if(name.equals("Granny Smith")) { //total price of granny smith
				System.out.println("**Quantity more than 5**");
			System.out.printf("Total Price                 : RM %.2f%n", gSP.totalPrice(q));
			}
			else if(name.equals("Grape")) { //total price of grape
				System.out.println("**Quantity more than 5**");
			System.out.printf("Total Price                 : RM %.2f%n", gP.totalPrice(q));
			}
			else if(name.equals("Kiwi")) { //total price of kiwi
				System.out.println("**Quantity more than 5**");
			System.out.printf("Total Price                 : RM %.2f%n", kP.totalPrice(q));
			}
			
			
		}
			else {  //totalPrice(double disc, double q) called
				
				if(name.equals("Apple")) { 
				Discount ad = new AppleDiscount(); // create new object for discount
				System.out.println("**Quantity more than 100,Special Discount Given**");
				System.out.printf("Total Price                 : RM %.2f%n", aP.totalPrice(disc,q)); 
				System.out.println("Total Discount:             : " + ad.percentOfDiscount());
				disc = ad.percentOfDiscount(); //now the percentage will change as percentOfDiscount() method
				}
				else if(name.equals("Fuji Apple")) {
				Discount fujiDis = new FujiDiscount(); // create new object for discount
				System.out.println("**Quantity more than 100,Special Discount Given**");
				System.out.printf("Total Price                 : RM %.2f%n", fjP.totalPrice(disc,q)); 
				System.out.println("Total Discount:             : " + fujiDis.percentOfDiscount()); //discount of fuji apple
				disc = fujiDis.percentOfDiscount(); //now the percentage will change as percentOfDiscount() method
				}
				else if (name.equals("Granny Smith")) {
					Discount gsDis = new GrannyDiscount(); // create new object for discount
					System.out.println("**Quantity more than 100,Special Discount Given**");
					System.out.printf("Total Price                 : RM %.2f%n", gSP.totalPrice(disc,q)); 
					System.out.println("Total Discount:             : " + gsDis.percentOfDiscount()); //discount of granny smith apple
					disc = gsDis.percentOfDiscount(); //now the percentage will change as percentOfDiscount() method	
				}
				else if (name.equals("Grape")) {
					Discount gDis = new GrapeDiscount(); // create new object for discount
					System.out.println("**Quantity more than 100,Special Discount Given**");
					System.out.printf("Total Price                 : RM %.2f%n", gP.totalPrice(disc,q)); 
					System.out.println("Total Discount:             : " + gDis.percentOfDiscount()); //discount of grape
					disc = gDis.percentOfDiscount(); //now the percentage will change as percentOfDiscount() method	
				}
				else if (name.equals("Kiwi")) {
					Discount kDis = new KiwiDiscount(); // create new object for discount
					System.out.println("**Quantity more than 100,Special Discount Given**");
					System.out.printf("Total Price                 : RM %.2f%n", kP.totalPrice(disc,q)); 
					System.out.println("Total Discount:             : " + kDis.percentOfDiscount()); //discount of kiwi
					disc = kDis.percentOfDiscount(); //now the percentage will change as percentOfDiscount() method	
				}

			}	
		
		
	}


	public String taste() { //overriding method
		return this.taste;
	}
	
	public String color() { //overriding method
		return this.color;
	}
	
	public int getQuantity(){
		return this.quantity ;
	}
	public String toString() { // overriding method
		return "Total apples sold           : ";
	}
	
	public void printInfo() { //overriding method
		System.out.println("Color                       : " + color());
		System.out.println("Taste                       : " + taste());
		System.out.println(toString() + getQuantity());
	 
	}
}


