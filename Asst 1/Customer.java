package Asst1;

import java.util.Scanner; //1.2 predefined class
import java.text.DecimalFormat;

public class Customer { //1.3 user defined class
	
	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");
	
	private String custName, custAdd, rentDate;
	private char gender;
	private int custPhoneNum, age, wedPackage, rentPeriod;
	private double rentPrice;
	
	public Customer() { // 1.4 Constructor without argument 
		
		System.out.println("===Customer Management===");
		
		System.out.println("Please Enter Your Name : ");
		this.custName = sc.nextLine();
		
		System.out.println("Please Enter Your Gender [M = male, F = female] : ");
		this.gender = sc.next().charAt(0);
		
		System.out.println("Please Enter Your Age : ");
		this.age = sc.nextInt();
		
		System.out.println("Please Enter Your Phone Number [E.g. 0123456789] : ");
		this.custPhoneNum = sc.nextInt();
		sc.nextLine();// used to avoid error when running the coding
					  //because sc.nextInt() does not read the newline
		
		System.out.println("Please Enter Your Address : ");
		this.custAdd = sc.nextLine();
		
		System.out.println("Please Enter The Date of Rental [E.g. 1 Jan 2021] :  ");
		this.rentDate = sc.nextLine();
		
		System.out.println("Please Select The Rental Package [1 = Package 1, 2 = Package 2, 3 = Package 3, 4 = Premium Package] : ");
		this.wedPackage = sc.nextInt();
		
		switch(wedPackage) { //use switch case // different package has different price
		case 1 : 	this.rentPrice = 1599; //initialize rental price of package 1
					
					System.out.println("Please Enter The Rental Period : ");
					this.rentPeriod = sc.nextInt();
					
					if(this.rentPeriod >2) { //rentPeriod over 2 days small fees charged
					System.out.println("=== Customer & Billing Details ===");
					System.out.println("Name               : " + custName);
					System.out.println("Gender             : " + gender);
					System.out.println("Age                : " + age);
					System.out.println("Phone Number       : +60" + custPhoneNum);
					System.out.println("Address            : " + custAdd);
					System.out.println("Date of Rental     : " + rentDate);
					System.out.println("Rental Period      : " + this.rentPeriod + " day(s)");
					System.out.println("Package            : " + wedPackage);
					System.out.println("Total Rental Price : RM " + df.format(calTotalPrice())); 
					}else {
						System.out.println("=== Customer & Billing Details ===");
						System.out.println("Name               : " + custName);
						System.out.println("Gender             : " + gender);
						System.out.println("Age                : " + age);
						System.out.println("Phone Number       : +60" + custPhoneNum);
						System.out.println("Address            : " + custAdd);
						System.out.println("Date of Rental     : " + rentDate);
						System.out.println("Rental Period      : " + this.rentPeriod + " day(s)");
						System.out.println("Package            : " + wedPackage);
						System.out.printf("Total Rental Price : RM %.2f%n", this.rentPrice); }
					break; // end case 1
					
		case 2 :	this.rentPrice = 3999; //initialize rental price of package 2 (pre-wedding)
					double discount = 0.1; // discount given
					double d = discount * 100;
					System.out.println("=== Customer & Billing Details ===");
					System.out.println("Name               : " + custName);
					System.out.println("Gender             : " + gender);
					System.out.println("Age                : " + age);
					System.out.println("Phone Number       : +60" + custPhoneNum);
					System.out.println("Address            : " + custAdd);
					System.out.println("Date of Rental     : " + rentDate);
					System.out.println("Package            : " + wedPackage);
					System.out.printf("Total Discount     : %.0f%%%n", d);
					System.out.println("Total Rental Price : RM " + df.format(calTotalPrice(discount)));
					break; // end case 2
					
		case 3 : 	this.rentPrice = 1899; //initialize rental price of package 3 (actual wedding)
					System.out.println("=== Customer & Billing Details ===");
					System.out.println("Name               : " + custName);
					System.out.println("Gender             : " + gender);
					System.out.println("Age                : " + age);
					System.out.println("Phone Number       : +60" + custPhoneNum);
					System.out.println("Address            : " + custAdd);
					System.out.println("Date of Rental     : " + rentDate);
					System.out.println("Package            : " + wedPackage);
					System.out.printf("Total Rental Price : RM %.2f%n", this.rentPrice);
					break; // end case 3
					
		case 4 :    this.rentPrice = 9999;//initialize rental price of premium package
					double disc = 0.2; //discount given
					double disc1 = disc * 100;
					System.out.println("=== Customer & Billing Details ===");
					System.out.println("Name               : " + custName);
					System.out.println("Gender             : " + gender);
					System.out.println("Age                : " + age);
					System.out.println("Phone Number       : +60" + custPhoneNum);
					System.out.println("Address            : " + custAdd);
					System.out.println("Date of Rental     : " + rentDate);
					System.out.println("Package            : " + wedPackage);
					System.out.printf("Total Discount     : %.0f %%%n", disc1);
					System.out.println("Total Rental Price : RM " + df.format(calTotalPrice(disc)));
					break; // end case 4
		}
		

		
	}
	public double calTotalPrice() { //method without argument
		return this.rentPrice + (this.rentPeriod * 3.5) ;
	}
	
	public double calTotalPrice(double discount) { //method with 1 argument
		return this.rentPrice * discount; // rental price above 2k will get different discount
	}
	
}
