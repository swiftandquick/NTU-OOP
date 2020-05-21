package Section4Problem2;

public class Staff extends Person {

	private String school; 
	private double pay;
	
	Staff(String rName, String rAddress, String rSchool, double rPay) {
		super(rName, rAddress);
		school = rSchool; 
		pay = rPay; 
	}
	
	public String getSchool() {
		return school; 
	}
	
	public void setSchool(String rSchool) {
		this.school = rSchool; 
	}
	
	public double getPay() {
		return pay; 
	}
	
	public void setPay(double rPay) {
		this.pay = rPay; 
	}
	
	public String toString() {
		return "Staff[" + super.toString() + ", school = " + school + ", pay = $" + pay + "]";
	}
	
}
