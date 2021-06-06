package Asst2;

interface Payment { //2.5 Interface //create interface of payment
	
	double getPayment(); // method of implementation for Payment interface
	
}

interface PaymentC{ //for customer
	
	double getPayment(int wedPackage); //method without body but with 1 parameter
	
	double getPayment(double rentPeriod, double rentPrice); //method without body but with 2 parameters
	
	double rateOfDiscount(int wedPackage); //method for discount

}
interface PaymentE{ //for employee
	
	double getPayment(char position);
	
	double getPayment(int jobType);
	
	double rateOfAllowance(char position);
	
}