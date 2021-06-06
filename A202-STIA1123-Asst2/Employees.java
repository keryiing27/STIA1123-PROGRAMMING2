package Asst2;

import java.util.Scanner; 
import java.text.DecimalFormat;

public class Employees{ 
	
	DecimalFormat df = new DecimalFormat("0.00");
	
	Scanner sc = new Scanner(System.in);
	
	private String employName, employAdd;
	private int employPhoneNum, age, jobType;
	private char gender, position;
	private double epf, salary;
	
	public Employees() { // Constructor without arguments
		
		
		System.out.println("=== Employees Management ===");
		System.out.println("Please Enter Your Name : ");
		this.employName = sc.nextLine();
		
		System.out.println("Please Enter Your Age : ");
		this.age = sc.nextInt();
		
		System.out.println("Please Enter Your Gender [M = male, F = female] : ");
		this.gender = sc.next().charAt(0);
		
		System.out.println("Please Enter Your Phone Number [E.g. 0123456789] : ");
		this.employPhoneNum = sc.nextInt();
		sc.nextLine();// used to avoid error when running the coding
		  			//because sc.nextInt() does not read the newline
		
		System.out.println("Please Enter Your Address : ");
		this.employAdd = sc.nextLine();
		
		System.out.println("Please Enter Your Job Type [1 = Part Time, 2 = Full Time, 3 = Full Time with higher position] : ");
		this.jobType = sc.nextInt();
					
		switch(jobType){
		case 1 : PaymentE e1 = new employSalary(); //2.5 Interface
				 this.salary = e1.getPayment(jobType); //salary for part time
				 System.out.println();
				 System.out.println("============= Employees Details =============");
				 System.out.println("Name 				      : " + employName);
				 System.out.println("Age 				      : " + age);
				 System.out.println("Gender 				      : " + gender);
				 System.out.println("Phone Number                          : +60" + employPhoneNum);
				 System.out.println("Address                               : " + employAdd);
		
				 System.out.println("Job Type                              : Part Time");
				 System.out.println("Salary per Hour                       : RM 9.00");
				 System.out.println("Total Salary per Day                  : RM " + df.format(this.salary)); 
				 break;
		case 2 : PaymentE e2 = new employSalary();//2.5 Interface
				 this.salary = e2.getPayment(jobType); //salary for full time
				 System.out.println();
				 System.out.println("============ Employees Details ============");
				 System.out.println("Name 				      : " + employName);
				 System.out.println("Age 				      : " + age);
				 System.out.println("Gender 				      : " + gender);
				 System.out.println("Phone Number                          : +60" + employPhoneNum);
				 System.out.println("Address                               : " + employAdd);

				 System.out.println("Job Type                              : Full Time");
				 System.out.println("Basic Salary per Month                : RM 1200.00");
				 System.out.println("Total Salary (after subtracting EPF)  : RM " + df.format(this.salary));
				 break;
		
		case 3 : System.out.println("Please Enter Your Position [S= Supervisor P = Photographer M = Makeup Artist O = Other administrator] : ");
				 this.position = sc.next().charAt(0);
		
				 System.out.println();
				 System.out.println("============ Employees Details ============");
				 System.out.println("Name 				      : " + employName);
				 System.out.println("Age 				      : " + age);
				 System.out.println("Gender 				      : " + gender);
				 System.out.println("Phone Number                          : +60" + employPhoneNum);
				 System.out.println("Address                               : " + employAdd);
		
		switch(position) { //use switch case //different position will have different amount of allowance
		case 'S' :	PaymentE eS = new employSalary();//2.5 Interface
					this.salary = eS.getPayment(position); //salary for Supervisor
					System.out.println("Position 			      : Supervisor");
					System.out.println("Basic Salary per Month 		      : RM 2250.00");
					System.out.println("Total Salary (after adding allowance) : RM " + df.format(this.salary));
					break;
		case 'P' : 	PaymentE eP = new employSalary();//2.5 Interface
					this.salary = eP.getPayment(position); //salary for photographer
					System.out.println("Position 			      : Photographer");
					System.out.println("Basic Salary per Month 		      : RM 1950.00");
					System.out.println("Total Salary (after adding allowance) : RM " + df.format(this.salary));
					break;
		case 'M' : 	PaymentE eM = new employSalary();//2.5 Interface
					this.salary = eM.getPayment(position); //salary for makeup artist
					System.out.println("Position 			      : Makeup Artist");
					System.out.println("Basic Salary per Month 		      : RM 1850.00");
					System.out.println("Total Salary (after adding allowance) : RM " + df.format(this.salary));
					break;
		case 'O' : 	PaymentE eO = new employSalary();//2.5 Interface
					this.salary = eO.getPayment(position); //salary for other administrator
					System.out.println("Position 			      : Other Administrator");
					System.out.println("Basic Salary per Month 		      : RM 1790.00");
					System.out.println("Total Salary (after adding allowance) : RM " + df.format(this.salary));
					break;
		}	
		}	
	}
	
	public void printInfo() {
		System.out.println("============= Employees Management =============");
	}
}
