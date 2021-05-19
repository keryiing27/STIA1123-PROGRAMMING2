package EX4_6;

public class Kiwi extends Apple{
	
	private String vitamin;
	private int packet;
	private int amount;
	
	public Kiwi(String n, double p, int q, String v, int pac, int a, String t, String col) { //constructor with 5 args
		super(n,q,p,t,col);
		this.vitamin = v;
		this.packet = pac;
		this.amount = a;
	}
	public int amountPerPacket(int pac, int a) { // overloading with 2 parameters
		return this.packet * this.amount;
	}
	
	public String amountPerPacket() { // overloading with no parameter
		return "Total Amount of Kiwi per packet : ";
	}
	
	public String printV() { //overriding
		return this.vitamin;
	}
	
	public String toString() { // overriding
		return "=>Kiwi is high in " ;
	}
	
	public void printInfo() { //overriding
		System.out.println("Color                       : " + color());
		System.out.println("Taste                       : " + taste());
		System.out.println(amountPerPacket() + amountPerPacket(3, 5));
		System.out.println(toString() + printV());
	}
}
