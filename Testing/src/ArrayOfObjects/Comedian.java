package ArrayOfObjects;

public class Comedian {

	private String name;
	
	Comedian() {
		name = "";
	}
	
	Comedian(String retrievedName) {
		name = retrievedName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String retrievedName) {
		this.name = retrievedName; 
	}
	
}
