package Asst2;

import java.text.DecimalFormat; 

public class Finance extends Sales{ //2.1 Inheritance //subclass of Sales

	private double sales, employSalary, maintenanceFee, adsExpenses, utilityExpenses;
	
	public Finance(double s, double e, double m, double a, double u) { //Constructor with 5 arguments
		
		super(s);
		
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		this.sales = s;
		this.employSalary = e;
		this.maintenanceFee = m;
		this.adsExpenses = a;
		this.utilityExpenses = u;
		
		printInfo();
		//print out the amount that consists in finance
		System.out.printf("Total Sales                  : RM %.2f%n", super.getSales(s));
		System.out.printf("Total Employees Salary       : RM %.2f%n", employSalary);
		System.out.printf("Total Maintenance Fee        : RM %.2f%n", maintenanceFee);
		System.out.printf("Total Advertisement Expenses : RM %.2f%n", adsExpenses);
		System.out.printf("Total Utility Expenses       : RM %.2f%n", utilityExpenses);
		System.out.println("Total Expenses               : RM " + df.format(totalExpenses()));
		System.out.println("Total Net Income             : RM " + df.format(calNetIncome(s)));
		
	}
	public double totalExpenses() { // method without arguments
		return employSalary + maintenanceFee + adsExpenses + utilityExpenses;
		
	}
	
	public double calNetIncome(double s) { // method with 1 argument
		return super.getSales(s) - totalExpenses();
	}
	
	public void printInfo() {
		System.out.println("====== Monthly Financial Statement ======");
	}
	
}
