package Asst1;

import java.text.DecimalFormat; 

public class Finance { //1.3 User Define Class

	private double sales, employSalary, maintenanceFee, adsExpenses, utilityExpenses;
	
	public Finance(double s, double e, double m, double a, double u) { //1.4 constructor with 5 arguments
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		this.sales = s;
		this.employSalary = e;
		this.maintenanceFee = m;
		this.adsExpenses = a;
		this.utilityExpenses = u;

		//print out the amount that consists in finance
		System.out.println("====== Monthly Financial Statement ======");
		System.out.printf("Total Sales                  : RM %.2f%n", sales);
		System.out.printf("Total Employees Salary       : RM %.2f%n", employSalary);
		System.out.printf("Total Maintenance Fee        : RM %.2f%n", maintenanceFee);
		System.out.printf("Total Advertisement Expenses : RM %.2f%n", adsExpenses);
		System.out.printf("Total Utility Expenses       : RM %.2f%n", utilityExpenses);
		System.out.println("Total Expenses               : RM " + df.format(totalExpenses()));
		System.out.println("Total Net Income             : RM " + df.format(calNetIncome()));
		
	}
	public double totalExpenses() { // method without arguments
		return employSalary + maintenanceFee + adsExpenses + utilityExpenses;
		
	}
	
	public double calNetIncome() { // method without argument
		return sales - totalExpenses();
	}
	
}
