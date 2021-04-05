package Example2;

public class Main {

	public static void main(String[] args) {
		
		Animal dog = new Animal();
		dog.dogName = "Mimi";
		dog.breed = "Poodle";
		dog.eyeColor = "brown";
		
		System.out.println("Pet dog name: " + dog.dogName);
		System.out.println("Dog breed: " + dog.breed);
		System.out.println("It has " + dog.eyeColor + " eyes" + "\n");
		
		
		Animal husky = new Animal();
		husky.dogName = "Puppy";
		husky.breed = "Husky";
		husky.dogAge = 2;
		husky.bark = "They will bark at strangers";
		husky.eat = "They like to eat meat too";
		
		husky.changeName();
		System.out.println("Dog breed: " + husky.breed);
		husky.printDogAge();
		
		System.out.println();
		
		husky.printBark();
		husky.printEat();
		
		System.out.println("--------------------------------------------");
		
		Animal cat = new Animal();
		cat.catName = "Fluffy";
		cat.breed = "Persian";
		cat.plays = "toys";		
		cat.catAge = 2;
		cat.giveBirth = 4;
		
		System.out.println("Pet cat name: " + cat.catName);
		System.out.println("Cat breed: " + cat.breed);
		cat.printcatAge();
		cat.printplays();
		
		System.out.println();

		cat.printGiveBirth();
	}

}
