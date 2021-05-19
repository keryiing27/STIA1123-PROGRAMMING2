package EX4_6;

public class Fuji extends Apple{
	
	private String country;
	private double weight;
	
	public Fuji(String n, int q, double p, double w, String c, String t, String col) { // constructor with  args
		super(n,q,p,t,col);
		this.weight = w;
		this.country = c;

		
	}

	public String getCountry() { //overloading with no parameter
		return this.country;
	}
	public double calAver(int q) { // overloading with 1 parameter
		return this.weight / q;
	}
	
	public String calAver() { // overloading method without parameter
		return String.format("Average Weight              : %.2f", (calAver(7)));
	}
	
	public String toString() { // overriding method
		return "=>Fuji Apple is orignated in " ;
	}
	
	public void printInfo() { //overriding
		System.out.println("Color                       : " + color());
		System.out.println("Taste                       : " + taste());
		System.out.println(calAver() + " gm");
		System.out.println(toString() + getCountry());
		
	}
	
}
