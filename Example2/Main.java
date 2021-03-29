package Example2;

public class Main {

	public static void main(String[] args) {
		Dog a = new Dog();
		System.out.println("My pet dog name is " + a.dogName + " and it is a " + a.breed);
		System.out.println("It has " + a.eyeColor + " eyes");
		a.changeName();

		Dog b = new Dog();
		b.printDogAge();
		b.printBark();
		b.printEat();
		
		Cat c = new Cat();
		System.out.println("My pet cat name is " + c.catName);
		System.out.println("It is a " + c.breed);
		c.printcatAge();
		
		Cat d = new Cat();
		d.printplays();
		d.printGiveBirth();
	}

}
