package Abstract;

public class Grape extends Fruit{
	
	private double price, weight, sgDollar;
	private String vitamin;
	
	public Grape(String n, double p, double w, String v, double sg) { // constructor with many args
		super(n);
		this.price = p;
		this.weight = w;
		this.vitamin = v;
		this.sgDollar = sg;
		
		if (this.weight <= 2.50) {
			totalPrice();
			System.out.println("**Weight less than 2.50 **");
			System.out.printf("Total Price                 : RM %.2f%n", totalPrice());
			
		}
		else if((this.weight > 2.50 ) && (this.weight <= 50.0)) {
			double pr = 12.59; //buy more than 2.50 kg get discounted price
			totalPrice(pr);
			System.out.println("**Weight more than 2.50**");
			System.out.printf("Total Price                 : RM %.2f%n", totalPrice(pr));
		}
			else {  
				double pr = 10.99; //buy more than 50 get discounted price
				double disc = 0.9;
				totalPrice(disc,pr);
				System.out.println("**Weight more than 50.0,Special Discount Given**");
				System.out.printf("Total Price                 : RM %.2f%n", totalPrice(disc,pr)); 
				} 
		
		if (this.sgDollar != 0.0) {  // if this.sgDollar != 0.0, convert RM to sgDollar, call method
			totalPrice(p,w,sg);
		}
		
		
	}
	public double totalPrice() {
		return this.price * this.weight;
	}
	
	public double totalPrice(double disc, double p) {  // overloading with 2 parameters
		return this.weight * disc * p;
	}
	public double totalPrice(double p) { // overloading with 1 parameter
		return this.weight * p ;
	}
	public void totalPrice(double p, double w, double sg) { // overloading with 2 parameters
		System.out.println(String.format("Total Price (in SG Dollar)  : $ %.2f" , (p * w * sg)));
	}
	
	public String printV() { //overriding
		return vitamin;
	}
	
	public String toString() { //overriding method
		return "=>Grape is a good source of ";
	}
	
	public void printInfo() { //overriding
		System.out.println(toString() + printV());
	}
	
}
