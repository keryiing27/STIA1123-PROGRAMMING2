package Abstract;

public abstract class Fruit {
	private String name;
	//private double price;
	
	public Fruit(String name) {
		this.name = name;
		//this.price = p;
		System.out.println(name + " constructor is invoked");
	}
	
	/*public String totalPrice(double p) { //overloading with 1 parameter
		return String.format("Total Price: RM %.2f", p);		
	}*/
	
	//method without implementation --- not as interface Discount will hv float percentOfDiscount()
	// subclass will implement the method, not in superclass
	public abstract double totalPrice(); //define method as abstract 
	
}	
