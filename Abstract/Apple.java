package Abstract;

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
		}
		
		
		if (this.quantity <= 5) {
			totalPrice();
			System.out.println("**Quantity less than 5**");
			System.out.println("Total Price                 : RM "+ totalPrice());
			
			
		}
		else if((this.quantity > 5) && (this.quantity <= 100)) {
			double pr = 1.99; //price for buy more than 5 and less than or equal to 100
			totalPrice(pr);
			System.out.println("**Quantity more than 5**");
			System.out.printf("Total Price                 : RM %.2f%n", totalPrice(pr));
			
		}
			else {  
				double pr = 1.25; // price for buy more than 100
				
				if(name.equals("Apple")) { 
				Discount ad = new AppleDiscount(); // create new object for discount
				System.out.println("Total Discount:             : " + ad.percentOfDiscount());
				disc = ad.percentOfDiscount(); //now the percentage will change as percentOfDiscount() method
				}
				else if(name.equals("Fuji Apple")) {
				Discount fujiDis = new FujiDiscount(); // create new object for discount 
				System.out.println("Total Discount:             : " + fujiDis.percentOfDiscount()); //discount of fuji apple
				disc = fujiDis.percentOfDiscount(); //now the percentage will change as percentOfDiscount() method
				}
				else if (name.equals("Granny Smith")) {
					Discount gsDis = new GrannyDiscount(); // create new object for discount 
					System.out.println("Total Discount:             : " + gsDis.percentOfDiscount()); //discount of fuji apple
					disc = gsDis.percentOfDiscount(); //now the percentage will change as percentOfDiscount() method	
				}
				
				totalPrice(disc,pr);
				System.out.println("**Quantity more than 100,Special Discount Given**");
				System.out.printf("Total Price                 : RM %.2f%n", totalPrice(disc,pr)); 
			}	
		
		
	}
	public double totalPrice() {
		return this.price * this.quantity;
	}
	
	public double totalPrice(double disc, double p) {  // overloading with 2 parameters
		return this.quantity * disc * p;
	}
	public double totalPrice(double p) { // overloading with 1 parameter
		return this.quantity * p ;
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
	 System.out.println(toString() + getQuantity());
	 
	}
}


