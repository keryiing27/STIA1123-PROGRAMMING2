package Example2;

public class Animal {
	
	String dogName, eyeColor, breed;
	int dogAge;
	String bark;
	String eat;
	String catName, plays;
	int catAge, giveBirth;
	
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
	
	void printcatAge() {
		System.out.println("Cat age: " + catAge + " years old");
	}
	
	void printplays() {
		plays = "toys";
		System.out.println("It likes to play " + plays);
	}
	
	void printGiveBirth() {
		System.out.println("A cat can give birth to an average of " + giveBirth + " kittens.");
				
	}

}
