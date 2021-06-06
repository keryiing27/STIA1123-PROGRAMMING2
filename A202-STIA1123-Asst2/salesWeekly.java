package Asst2;

//2.5 Interface 

// for sales
class salesWeekly implements Payment{ //Weekly Sales
	
	public double getPayment(){
		double totalSales = 863.24; // initialize the value of totalSales (get from totalSales at finance/30)
		return totalSales * 7;
	}

}

class salesDaily implements Payment{ //Average Daily Sales
	
	public double getPayment() {
		double totalSales = 25897.2; // initialize totalSales tobe divided to daily sale
		return totalSales / 30;
	}
}
//2.5 Interface //customer and employee

//for customer
class CustomerBilling implements PaymentC{ 
	
	public double getPayment(int wedPackage) { // method of implementation //calPrice according the package
		double rentPrice = 0;
		if(wedPackage == 1)
			return rentPrice = 1599;
		else if(wedPackage == 2)
			return rentPrice = 3999* (1-rateOfDiscount(wedPackage));
		else if(wedPackage == 3)
			return rentPrice = 1899;
		else if(wedPackage == 4)
			return rentPrice = 9999* (1-rateOfDiscount(wedPackage));
		
		return rentPrice;
	}
	
	public double getPayment(double rentPeriod, double rentPrice) { //calPrice according the rentPeriod //rentPeriod >2 small fees will be charged
		double smallFee = 3.5;
		
		return rentPrice+(rentPeriod * smallFee);
	}
	
	public double rateOfDiscount(int wedPackage) {  // different package have different rate of discount 
		double disc = 0;
		
		if(wedPackage == 2)
			return disc = 0.1;
		else if(wedPackage == 4)
			return disc = 0.2;
		
		return disc;
	}
	
}
//for employee
class employSalary implements PaymentE{
	
	public double getPayment(char position) { // calSalary according to the position
		double salary = 0;
		
		if(position == 'S')
			return salary = 2250 + (2250 * rateOfAllowance(position));
		else if(position == 'P')
			return salary = 1950 + (1950 * rateOfAllowance(position));
		else if(position == 'M')
			return salary = 1850 + (1850 * rateOfAllowance(position));
		else if (position == 'O')
			return salary = 1790 + (1790 * rateOfAllowance(position));
		return salary;
	}
	
	public double getPayment(int jobType) { //calSalary depends on full time/part time 
		double salary = 0;
		double epf = 0.11;
		int hour = 10;
		
		if(jobType == 1)
			return salary = 9*hour;
		else if(jobType == 2)
			return salary = 1200 - (1200 * epf);
		
		return salary;
	}
	
	public double rateOfAllowance(char position) { // different position have different rate of allowance
		double allowance = 0;
		
		if(position == 'S')
			return allowance = 0.2;
		else if(position == 'P')
			return allowance = 0.15;
		else if(position == 'M')
			return allowance = 0.11;
		else if (position == 'O')
			return allowance = 0.05;
		
		return allowance;
	}
}



