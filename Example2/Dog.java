package Example2;

public class Dog {
	
	String dogName, eyeColor, breed;
	int dogAge;
	String bark;
	String eat;
	void changeName() {
		System.out.println("Another doggy name: " + dogName);
	}
	
	void printDogAge() {
		System.out.println("It is " + dogAge + " years old");
	}

	void printBark() { //behavior of dog 
		System.out.println(bark);
	}
	
	void printEat() {
		System.out.println(eat);
	}
}
