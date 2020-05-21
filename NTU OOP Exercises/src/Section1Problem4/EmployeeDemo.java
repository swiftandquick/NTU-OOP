package Section1Problem4;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int idInput;
		String firstNameInput;
		String lastNameInput;
		int salaryInput; 
		int increasedPercentage; 
		
		/** Create and give up values for the object.  */
		System.out.print("ID:  ");
		idInput = input.nextInt();
		System.out.print("First Name:  ");
		firstNameInput = input.next();
		System.out.print("Second Name:  ");
		lastNameInput = input.next();
		System.out.print("Salary:  ");
		salaryInput = input.nextInt(); 
		
		Employee employee = new Employee(idInput, firstNameInput, lastNameInput, salaryInput); 
		
		System.out.println("Employee Profile:  "); 
		System.out.println("ID:  " + employee.getId());
		System.out.println("First Name:  " + employee.getFirstName());
		System.out.println("Last Name:  " + employee.getLastName());
		System.out.println("Monthly Salary:  " + employee.getSalary()); 
		
		
		/** Set a new salary value.  */
		System.out.println("What is the employee's new salary?  ");
		salaryInput = input.nextInt();
		employee.setSalary(salaryInput);
		System.out.println("New Monthly Salary:  " + employee.getSalary()); 
		
		
		/** Increase current salary based on percentage.  */
		System.out.println("How much is the raise in %?  ");
		increasedPercentage = input.nextInt();
		System.out.println("Raised Monthly Salary:  " + employee.raiseSalary(increasedPercentage));
		
		
		/** Calculate the annual salary.  */
		System.out.println("Annual Salary:  " + employee.getAnnualSalary());
		
		input.close();
		
	}
	
}
