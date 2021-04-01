package Example2;

public class Cat {
	String catName, breed, plays;
	int catAge, giveBirth;
	
	void printcatAge() {
		System.out.println("Cat age: " + catAge + " years old");
	}
	
	void changeName() {
		catName = new String ("Bella");
		System.out.println("My another pet cat name's: " + catName);
		
	}
	void printplays() {
		plays = "toys";
		System.out.println("It likes to play " + plays);
	}
	
	void printGiveBirth() {
		System.out.println("A cat can give birth to an average of " + giveBirth + " kittens.");
				
	}
}



