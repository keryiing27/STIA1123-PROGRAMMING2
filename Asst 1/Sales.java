package Asst1;

public class Sales { //1.3 user defined class
	
	private double totalSales; 
	
	public Sales(double tS) {//1.4 Constructor with 1 argument
		this.totalSales = tS; 
		
		//print out the sales report that consists average daily, weekly and monthly sales
		System.out.println("====== Sales Report ======");
		System.out.printf("Average Daily Sales  : RM %.2f%n", this.totalSales);
		System.out.printf("Weekly Sales         : RM %.2f%n", calWeeklySales());
		System.out.printf("Monthly Sales        : RM %.2f%n", calMonthlySales());
		
	}
	public double calWeeklySales() { // method without argument //calculate weekly sales
		return this.totalSales * 7 ;
	}
	
	public double calMonthlySales() { //method without argument //calculate monthly sales
		return this.totalSales * 30 ;
	}
	
}
