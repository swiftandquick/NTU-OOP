package Section2Problem8;

public class Customer {

	private int id; 
	private String name; 
	private char gender; 
	
	Customer(int iId, String iName, char iGender) {
		id = iId;
		name = iName; 
		gender = iGender; 
	}
	
	public int getId() {
		return id; 
	}
	
	public String getName() {
		return name;
	}
	
	public char getGender() {
		return gender; 
	}
	
	public String toString() {
		return name + "(" + id + ", " + gender + ")";
	}
	
}
