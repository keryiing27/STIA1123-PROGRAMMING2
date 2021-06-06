package Asst2;

import java.util.Scanner; 
import java.text.DecimalFormat;

public class Customer extends WeddingPackageType{ //2.1 Inheritance //subclass of WeddingPackageType
	
	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");
	
	private String custName, custAdd, rentDate;
	private char gender;
	private int custPhoneNum, age, wedPackage, rentPeriod;
	private double rentPrice, totalPrice;
	
	public Customer() { // Constructor without argument 
		
		printInfo();
		System.out.println();
		super.printInfo();
		System.out.println(super.printWeddingGown());
		System.out.println(super.printWeddingSuit());
		System.out.println(super.printWeddingPackage());
		
		
		System.out.println("======== Customer Infomation Session ========");
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
		case 1 :	PaymentC p1 = new CustomerBilling(); //2.5 Interface
					System.out.println("Please Enter The Rental Period : ");
					this.rentPeriod = sc.nextInt();
					
					if(this.rentPeriod >2) { //rentPeriod over 2 days small fees charged
					this.rentPrice = p1.getPayment(wedPackage);	
					totalPrice = p1.getPayment(rentPeriod,rentPrice); 
					System.out.println("=== Customer & Billing Details ===");
					System.out.println("Name               : " + custName);
					System.out.println("Gender             : " + gender);
					System.out.println("Age                : " + age);
					System.out.println("Phone Number       : +60" + custPhoneNum);
					System.out.println("Address            : " + custAdd);
					System.out.println("Date of Rental     : " + rentDate);
					System.out.println("Rental Period      : " + this.rentPeriod + " day(s)");
					System.out.println("Package            : " + wedPackage);
					System.out.println("Total Rental Price : RM " + df.format(totalPrice)); 
					}else {
						this.rentPrice = p1.getPayment(wedPackage);
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
					
		case 2 :	PaymentC p2 = new CustomerBilling();//2.5 Interface
					this.rentPrice = p2.getPayment(wedPackage); //initialize rental price of package 2 (pre-wedding)
					double discount = p2.rateOfDiscount(wedPackage);
					totalPrice = p2.getPayment(wedPackage);
					System.out.println("=== Customer & Billing Details ===");
					System.out.println("Name               : " + custName);
					System.out.println("Gender             : " + gender);
					System.out.println("Age                : " + age);
					System.out.println("Phone Number       : +60" + custPhoneNum);
					System.out.println("Address            : " + custAdd);
					System.out.println("Date of Rental     : " + rentDate);
					System.out.println("Package            : " + wedPackage);
					System.out.printf("Total Discount     : %.0f%%%n", discount*100);
					System.out.println("Total Rental Price : RM " + df.format(totalPrice));
					break; // end case 2
					
		case 3 : 	PaymentC p3 = new CustomerBilling(); //2.5 Interface
					this.rentPrice = p3.getPayment(wedPackage); //initialize rental price of package 3 (actual wedding)
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
					
		case 4 :    PaymentC p4 = new CustomerBilling(); //2.5 Interface
					this.rentPrice = p4.getPayment(wedPackage);//initialize rental price of premium package
					double disc = p4.rateOfDiscount(wedPackage); //discount given	
					totalPrice = p4.getPayment(wedPackage);
					System.out.println("=== Customer & Billing Details ===");
					System.out.println("Name               : " + custName);
					System.out.println("Gender             : " + gender);
					System.out.println("Age                : " + age);
					System.out.println("Phone Number       : +60" + custPhoneNum);
					System.out.println("Address            : " + custAdd);
					System.out.println("Date of Rental     : " + rentDate);
					System.out.println("Package            : " + wedPackage);
					System.out.printf("Total Discount     : %.0f %%%n", disc*100);
					System.out.println("Total Rental Price : RM " + df.format(totalPrice));
					break; // end case 4
		}
		
	}
	public void printInfo() { //2.2 Polymorphism
		System.out.println("========= Customer Management =========");
	}
}
