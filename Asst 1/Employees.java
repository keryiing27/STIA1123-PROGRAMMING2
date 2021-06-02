package Asst1;

import java.util.Scanner; // 1.2 predefined class
import java.text.DecimalFormat;

public class Employees { //1.3 user defined class
	
	DecimalFormat df = new DecimalFormat("0.00");
	
	Scanner sc = new Scanner(System.in);
	
	private String employName, employAdd;
	private int employPhoneNum, age, jobType, salary;
	private char gender, position;
	private double epf;
	
	public Employees() { // 1.4 constructor without arguments
		
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
		case 1 : salary = 9; // initialize the salary per hour for part time
				 int hour = 10; // declare and initialize the job hour for part time
				 System.out.println();
				 System.out.println("======= Employees Details =======");
				 System.out.println("Name 				      : " + employName);
				 System.out.println("Age 				      : " + age);
				 System.out.println("Gender 				      : " + gender);
				 System.out.println("Phone Number                          : +60" + employPhoneNum);
				 System.out.println("Address                               : " + employAdd);
		
				 System.out.println("Job Type                              : Part Time");
				 System.out.println("Salary per Hour                       : RM " + salary);
				 System.out.println("Total Salary per Day                  : RM " + df.format(calSalary(hour))); 
				 break;
		case 2 : salary = 1200; // initialize the salary for full time employees
				 System.out.println();
				 System.out.println("======= Employees Details =======");
				 System.out.println("Name 				      : " + employName);
				 System.out.println("Age 				      : " + age);
				 System.out.println("Gender 				      : " + gender);
				 System.out.println("Phone Number                          : +60" + employPhoneNum);
				 System.out.println("Address                               : " + employAdd);

				 System.out.println("Job Type                              : Full Time");
				 System.out.println("Basic Salary per Month                : RM " + salary);
				 System.out.println("Total Salary (after subtracting EPF)  : RM " + df.format(calSalary()));
				 break;
		
		case 3 : System.out.println("Please Enter Your Position [S= Supervisor P = Photographer M = Makeup Artist O = Other administrator] : ");
				 this.position = sc.next().charAt(0);
		
				 System.out.println();
				 System.out.println("======= Employees Details =======");
				 System.out.println("Name 				      : " + employName);
				 System.out.println("Age 				      : " + age);
				 System.out.println("Gender 				      : " + gender);
				 System.out.println("Phone Number                          : +60" + employPhoneNum);
				 System.out.println("Address                               : " + employAdd);
		
		switch(position) { //use switch case //different position will have different amount of allowance
		case 'S' :	salary = 2250; //initialize new value to salary for Supervisor
					System.out.println("Position 			      : Supervisor");
					System.out.println("Basic Salary per Month 		      : RM " + salary);
					System.out.println("Total Salary (after adding allowance) : RM " + df.format(calSalary(salary,0.20)));
					break;
		case 'P' : 	salary = 1950; //initialize new value to salary for Photographer
					System.out.println("Position 			      : Photographer");
					System.out.println("Basic Salary per Month 		      : RM " + salary);
					System.out.println("Total Salary (after adding allowance) : RM " + df.format(calSalary(salary,0.15)));
					break;
		case 'M' : 	salary = 1850; //initialize new value to salary for Makeup Artist
					System.out.println("Position 			      : Makeup Artist");
					System.out.println("Basic Salary per Month 		      : RM " + salary);
					System.out.println("Total Salary (after adding allowance) : RM " + df.format(calSalary(salary,0.11)));
					break;
		case 'O' : 	salary = 1790; //initialize new value to salary for Other Administrator
					System.out.println("Position 			      : Other Administrator");
					System.out.println("Basic Salary per Month 		      : RM " + salary);
					System.out.println("Total Salary (after adding allowance) : RM " + df.format(calSalary(salary,0.05)));
					break;
		}	
		}	
	}
	public double calSalary() { //method without argument
		epf = 0.11; // initialize the value of epf
		return salary - (salary * epf);
	}
	
	public double calSalary(int h) { //method with 1 argument
		return salary * h; // h = hour
	}
	
	public double calSalary(double salary, double allowance) { //method with 2 arguments
		return salary + (salary * allowance);
	}
}
