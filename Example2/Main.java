package Example2;

public class Main {

	public static void main(String[] args) {
		
		Dog poodle = new Dog();
		poodle.dogName = "Mimi";
		poodle.breed = "Poodle";
		poodle.eyeColor = "brown";
		
		System.out.println("Pet dog name: " + poodle.dogName);
		System.out.println("Dog breed: " + poodle.breed);
		System.out.println("It has " + poodle.eyeColor + " eyes" + "\n");
		
		
		Dog husky = new Dog();
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
		
		Cat persian = new Cat();
		persian.catName = "Fluffy";
		persian.breed = "Persian";
		persian.plays = "toys";		
		persian.catAge = 2;
		persian.giveBirth = 4;
		
		System.out.println("Pet cat name: " + persian.catName);
		System.out.println("Cat breed: " + persian.breed);
		persian.printcatAge();
		persian.printplays();
		
		System.out.println();
		
		persian.printGiveBirth();
	}

}
