package EX4_6;

public class GrannySmith extends Apple{
	
	private String country;
	private int calories, amount;

	public GrannySmith(String n, int q, double p, String c, int cal, int a, String t, String col) {
		// constructor with many args
		super(n,q,p,t,col);
		this.country = c;
		this.calories = cal;
		this.amount = a;
		
	}
	public String getCountry() { 
		return this.country;
	}
	
	public int calCalories(int cal, int a) { //overloading with 2 parameters
		return this.calories * this.amount;
	}
	
	public String calCalories() { //overloading with no parameter
		return "Total calories              : ";
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public void bakeApplePie() { 
		System.out.println("=>It usually used for baking Apple Pie.");
	}
	
	public String toString() {  //overriding
		return "=>Granny Smith Apple is orignated in " ;
	}
	
	public void printInfo() { //overriding
		System.out.println("Color                       : " + color());
		System.out.println("Taste                       : " + taste());
		System.out.println(calCalories() + calCalories(52, 3));
		System.out.println(toString() + getCountry());
	}
	
}
