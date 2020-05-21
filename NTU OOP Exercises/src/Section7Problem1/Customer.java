package Section7Problem1;

public class Customer {

	private String name; 
	private boolean member; 
	private String memberType; 
	
	Customer(String rName) {
		name = rName; 
		member = false; 
		memberType = "none"; // Empty string to prevent error.  
	}
	
	public String getName() {
		return name; 
	}
	
	public boolean isMember() {
		return member;
	}
	
	public void setMember(boolean rMember) {
		this.member = rMember; 
	}
	
	public String getMemberType() {
		return memberType; 
	}
	
	public void setMemberType(String rMemberType) {
		this.memberType = rMemberType; 
	}
	
	public String toString() {
		return "Customer[name = " + name + ", member = " + member + ", member type = " + memberType + "]";
	}
	
}
