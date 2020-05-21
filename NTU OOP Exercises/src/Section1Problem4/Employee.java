package Section1Problem4;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private int salary; 
	
	public Employee(int retrievedId, String retrievedFirstName, String retrievedLastName, int retrievedSalary) {
		id = retrievedId;
		firstName = retrievedFirstName; 
		lastName = retrievedLastName; 
		salary = retrievedSalary; 
	}
	
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName; 
	}
	
	public int getSalary() {
		return salary; 
	}
	
	public void setSalary(int retrievedSalary) {
		this.salary = retrievedSalary; 
	}
	
	public int raiseSalary(int percent) {
		this.salary = salary * (100 + percent) / 100;
		return salary;
	}
	
	public int getAnnualSalary() {
		return salary * 12; 
	}
	
}
