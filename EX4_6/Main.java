/*
****************************************
Important Points
Two or more methods can have the same name inside the same class if they accept different arguments. This feature is known as method overloading.
Method overloading is achieved by either:
--changing the number of arguments.
--or changing the data type of arguments.
It is not method overloading if we only change the return type of methods. There must be differences in the number of parameters.
*******************************************
*/
package EX4_6;

public class Main {

	
	public static void main(String[] args) {

		/*System.out.println("======ORANGE======");
		Fruit F = new Fruit("Orange");
		//System.out.println(F.totalPrice(5.5));
		System.out.println("------------------------------------------------");
		System.out.println();*/   //super class
		
		System.out.println("======APPLE======");  //new object for sub class
		Apple A = new Apple("Apple", 110, 2.59,"Sour","Red");
		A.printInfo();
		System.out.println("------------------------------------------------");
		System.out.println();
		
		System.out.println("======FUJI APPLE======"); //new object for sub class
		Fuji Fj = new Fuji("Fuji Apple", 110, 2.6, 2.8, "Japan", "Sour", null);
		Fj.printInfo();
		System.out.println("------------------------------------------------");
		System.out.println();
		
		System.out.println("======GRANNY SMITH APPLE======"); //new object for sub class
		GrannySmith Gs = new GrannySmith("Granny Smith", 112, 2.4, "Australia", 95, 2, "Sour","Green");
		Gs.bakeApplePie();
		Gs.printInfo();
		System.out.println("-------------------------------------------------");
		System.out.println();
		
		System.out.println("======GRAPE======"); //new object for sub class
		Grape G = new Grape("Grape", 13.9, 53, "Vitamin C and Vitamin K", "Sweet", "Purple");
		G.printInfo();
		System.out.println("------------------------------------------------");
		System.out.println();
		
		
		System.out.println("======KIWI======"); //new object for sub class
		Kiwi K = new Kiwi("Kiwi", 14.2, 5, "Fiber, Vitamin C & Antioxidants", 3, 5, "Sour", "Green");
		K.printInfo();
		System.out.println("------------------------------------------------");
		System.out.println(); 
	}
	
}
