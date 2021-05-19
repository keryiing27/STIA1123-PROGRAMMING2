package EX4_6;

public class Grape extends Apple{
	
	private String vitamin;
	
	public Grape(String n, double p, int q, String v, String t, String col) { // constructor with many args
		super(n,q,p,t,col);
		this.vitamin = v;

	}
	
	public String printV() { //overriding
		return vitamin;
	}
	
	public String toString() { //overriding method
		return "=>Grape is a good source of ";
	}
	
	public void printInfo() { //overriding
		System.out.println("Color                       : " + color());
		System.out.println("Taste                       : " + taste());
		System.out.println(toString() + printV());
	}
	
}
