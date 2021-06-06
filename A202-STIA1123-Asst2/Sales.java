package Asst2;

public abstract class Sales { //2.4 Abstraction //superclass of finance
	
	private double sales;
	
	public Sales(double s) {//Constructor with 1 argument
		
		this.sales = s;
		
		//implement payment interface using getPayment according the classes
		Payment day = new salesDaily();
		Payment week = new salesWeekly();
		
		//print out the sales report that consists average daily, weekly and monthly sales
		System.out.println("========= Sales Report =========");
		System.out.printf("Average Daily Sales  : RM %.2f%n", day.getPayment());
		System.out.printf("Weekly Sales         : RM %.2f%n", week.getPayment());
		System.out.printf("Monthly Sales        : RM %.2f%n", getSales(s));
		
	}
	public double getSales(double s){
		return s * 30;
	}
}
