package Section4Problem2;

public class Person {

	private String name, address; 
	
	Person(String rName, String rAddress) {
		this.name = rName; 
		this.address = rAddress; 
	}
	
	public String getName() {
		return name; 
	}
	
	public String getAddress() {
		return address; 
	}
	
	public void setAddress(String rAddress) {
		this.address = rAddress; 
	}
	
	public String toString() {
		return "Person[name = " + name + ", address = " + address + "]"; 
	}
	
}
