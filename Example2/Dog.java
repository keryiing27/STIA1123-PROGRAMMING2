package Example2;

public class Dog {
	
	String dogName = "Mimi", eyeColor = "brown", breed = "poodle";
	int dogAge;
	String bark = "It will bark at strangers";
	String eat = "It likes to eat meat";
	void changeName() {
		dogName = new String("puppy") ;
		System.out.println(dogName);
	}
	
	void printDogAge() {
		dogAge = 2;
		System.out.println("It is " + dogAge + " years old");
	}

	void printBark() { //behavior of dog 
		System.out.println(bark);
	}
	
	void printEat() {
		System.out.println(eat);
	}
}
