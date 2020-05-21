package Section2Problem1;

public class Author {

	private String name;
	private String email;
	private char gender;
	
	Author(String retrievedName, String retrievedEmail, char retrievedGender) {
		name = retrievedName; 
		email = retrievedEmail; 
		gender = retrievedGender; 
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String retrievedEmail) {
		this.email = retrievedEmail; 
	}
	
	public char getGender() {
		return gender; 
	}
	
	public String toString() {
		return "Author[name = " + name + ", E-mail:  " + email + ", gender = " + gender + "]";
	}
	
}
