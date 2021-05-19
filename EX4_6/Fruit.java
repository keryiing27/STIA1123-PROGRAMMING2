package EX4_6;

public abstract class Fruit {
	private String name;
	//private double price;
	
	public Fruit(String name) {
		this.name = name;
		//this.price = p;
		System.out.println(name + " constructor is invoked");
	}

}	
